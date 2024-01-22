package com.example.oamk_mobilenative_assignment3_oliver_kern

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.oamk_mobilenative_assignment3_oliver_kern.ui.theme.Oamk_mobileNative_assignment3_oliver_kernTheme
import com.example.oamk_mobilenative_assignment3_oliver_kern.ui.theme.Purple
import com.example.oamk_mobilenative_assignment3_oliver_kern.ui.theme.White

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Oamk_mobileNative_assignment3_oliver_kernTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Login()
                }
            }
        }
    }
}

@Composable
fun Login() {
    var usernameInput: String by remember {
        mutableStateOf("")
    }
    var passwordInput: String by remember {
        mutableStateOf("")
    }

    Column{
        Text(
            text = stringResource(R.string.login),
            fontSize = 24.sp,
            color = Purple,
            textAlign = TextAlign.Left,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, bottom = 16.dp, start = 16.dp)
        )
        OutlinedTextField(
            value = usernameInput,
            onValueChange = { usernameInput = it },
            label = { Text(stringResource(R.string.username)) },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Email Icon"
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp, end = 8.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Purple,
                focusedLabelColor = Purple,
                cursorColor = Purple
            ),
        )
        OutlinedTextField(
            value = passwordInput,
            onValueChange = { passwordInput = it },
            label = { Text(stringResource(R.string.password)) },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation(),
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "Lock Icon"
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp, end = 8.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Purple,
                focusedLabelColor = Purple,
                cursorColor = Purple
            ),
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 8.dp, end = 8.dp, top = 8.dp)
                .height(36.dp),
            shape = AbsoluteRoundedCornerShape(3.dp),
            colors = ButtonDefaults.buttonColors(
                Purple
            )
        ) {
            Text(
                text = stringResource(R.string.submit),
                fontSize = 16.sp,
                color = White,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 1.dp, bottom = 1.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Oamk_mobileNative_assignment3_oliver_kernTheme {
        Login()
    }
}