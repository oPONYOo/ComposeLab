package com.example.composelab.animation

import androidx.compose.animation.Crossfade
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CrossfadeAnimationDemo() {
    var isFirstScreen by remember { mutableStateOf(true) }
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Switch(
            checked = isFirstScreen,
            onCheckedChange = {
                isFirstScreen = !isFirstScreen
            },
            modifier = Modifier.padding(top = 16.dp, bottom = 16.dp)
        )
        Crossfade(
            targetState = isFirstScreen,
            animationSpec = spring(stiffness = Spring.StiffnessMedium)
            // AnimationSpec: 애니메이션 사양을 정의하기 위한 기본 인터페이스
            // 애니메이션을 수행할 데이터 타입과 애니메이션 환결설정 저장
        ) { it ->
            if (it) {
                Screen(
                    text = "W",
                    backgroundColor = Color.Gray
                )
            } else {
                Screen(text = "I", backgroundColor = Color.LightGray)
            }
        }
    }
}

@Composable
fun Screen(text: String, backgroundColor: Color) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = text)
    }
}