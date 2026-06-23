package com.raza.phonepeclone

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Help
import androidx.compose.material.icons.filled.AccountBalance
import androidx.compose.material.icons.filled.AccountBalanceWallet
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PhoneAndroid
import androidx.compose.material.icons.filled.QrCodeScanner
import androidx.compose.material.icons.filled.SyncAlt
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PhonePeTopBar() {
    TopAppBar(
        title = {
            Column {
                Text(
                    text = "Add Address",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 9.dp)
                )
                Text(
                    text = "Mohammed Raza",
                    color = Color.White.copy(alpha = 0.8f),
                    fontSize = 16.sp
                )
            }
        },
        navigationIcon = {
            IconButton(onClick = {}) {
                Box(
                    modifier = Modifier
                        .size(42.dp)
                        .background(Color.White, CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Profile",
                        tint = Color.Gray,
                        modifier = Modifier.size(28.dp)
                    )
                }
            }
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.QrCodeScanner,
                    contentDescription = "Scan QR",
                    tint = Color.White
                )
            }
            IconButton(onClick = {}) {
                BadgedBox(
                    badge = {
                        Badge {
                            Text("3")
                        }
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notifications",
                        tint = Color.White
                    )
                }
            }
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.Help,
                    contentDescription = "Help",
                    tint = Color.White
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(0xFF5F259F)
        )
    )
}

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = { PhonePeTopBar() },
        modifier = modifier.fillMaxSize(),
        containerColor = Color(0xFFF5F5F5)
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
        ) {
            MoneyTransfersSection()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PhonePeTopBarPreview() {
    PhonePeTopBar()
}

@Composable
fun MoneyTransfersSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Transfer Money",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                TransferOption(Icons.Default.PhoneAndroid, "To Mobile\nNumber")
                TransferOption(Icons.Default.AccountBalance, "To Bank/\nUPI ID")
                TransferOption(Icons.Default.SyncAlt, "To Self\nAccount")
                TransferOption(Icons.Default.AccountBalanceWallet, "Check\nBalance")
            }
        }
    }
}

@Composable
fun TransferOption(icon: ImageVector, label: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.size(width = 80.dp, height = 90.dp)
    ) {
        Box(
            modifier = Modifier
                .size(48.dp)
                .background(Color(0xFF5F259F), RoundedCornerShape(12.dp)),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = label,
                tint = Color.White,
                modifier = Modifier.size(28.dp)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = label,
            fontSize = 12.sp,
            textAlign = TextAlign.Center,
            lineHeight = 14.sp,
            color = Color.DarkGray
        )
    }
}



