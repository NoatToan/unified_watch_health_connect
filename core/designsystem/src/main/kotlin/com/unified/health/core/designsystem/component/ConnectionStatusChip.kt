package com.unified.health.core.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.unified.health.core.model.ConnectionState

fun ConnectionState.label(): String = when (this) {
    ConnectionState.Connected -> "Connected"
    ConnectionState.Connecting -> "Connecting…"
    ConnectionState.Authenticating -> "Authenticating…"
    ConnectionState.Disconnected -> "Disconnected"
    is ConnectionState.Error -> "Connection error"
}

/** Status is conveyed by text + color dot (never color alone) for accessibility. */
@Composable
fun ConnectionStatusChip(
    state: ConnectionState,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
) {
    val dot: Color = when (state) {
        ConnectionState.Connected -> Color(0xFF2E7D32)
        ConnectionState.Connecting, ConnectionState.Authenticating -> Color(0xFFF9A825)
        ConnectionState.Disconnected -> MaterialTheme.colorScheme.outline
        is ConnectionState.Error -> MaterialTheme.colorScheme.error
    }
    AssistChip(
        onClick = onClick,
        label = { Text(state.label()) },
        leadingIcon = {
            Box(Modifier.size(AssistChipDefaults.IconSize / 2).background(dot, CircleShape))
        },
        // D-1169: AssistChip draws a border by default (AssistChipDefaults.assistChipBorder()) —
        // dropped so the chip reads as a plain tonal pill, which looks cleaner floating directly
        // over the device image (D-1162).
        border = null,
        modifier = modifier,
    )
}

@Composable
fun SectionHeader(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        style = MaterialTheme.typography.titleMedium,
        color = MaterialTheme.colorScheme.onSurface,
        modifier = modifier,
    )
}

