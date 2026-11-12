package com.unified.health.notifications

import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import com.unified.health.MainActivity
import com.unified.health.R
import dagger.hilt.android.qualifiers.ApplicationContext
import java.text.NumberFormat
import javax.inject.Inject
import javax.inject.Singleton

/** Posts the local health alerts on their own channel; silently skips when Android blocks notifications. */
@Singleton
class HealthAlertNotifier @Inject constructor(@ApplicationContext private val context: Context) {

    fun goalAchieved(steps: Int, goal: Int) {
        val format = NumberFormat.getIntegerInstance()
        post(
            GOAL_NOTIFICATION_ID,
            title = context.getString(R.string.notification_goal_reached_title),
            text = context.getString(R.string.notification_goal_reached_text, format.format(steps), format.format(goal)),
        )
    }

    fun lowBattery(deviceId: String, deviceName: String, percent: Int) {
        post(
            LOW_BATTERY_ID_BASE + (deviceId.hashCode() and 0xFFFF),
            title = context.getString(R.string.notification_low_battery_title, deviceName),
            text = context.getString(R.string.notification_low_battery_text, percent),
        )
    }

    private fun post(id: Int, title: String, text: String) {
        if (!canPost()) return
        createChannel()
        val open = PendingIntent.getActivity(
            context,
            0,
            Intent(context, MainActivity::class.java).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP),
            PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT,
        )
        val notification = NotificationCompat.Builder(context, CHANNEL_ID)
            .setSmallIcon(android.R.drawable.stat_notify_more)
            .setContentTitle(title)
            .setContentText(text)
            .setStyle(NotificationCompat.BigTextStyle().bigText(text))
            .setContentIntent(open)
            .setAutoCancel(true)
            .setCategory(NotificationCompat.CATEGORY_STATUS)
            .build()
        try {
            NotificationManagerCompat.from(context).notify(id, notification)
        } catch (_: SecurityException) {
            // Permission revoked between the check and the post: nothing to show.
        }
    }

    private fun canPost(): Boolean {
        val permitted = Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU ||
            ContextCompat.checkSelfPermission(context, Manifest.permission.POST_NOTIFICATIONS) == PackageManager.PERMISSION_GRANTED
        return permitted && NotificationManagerCompat.from(context).areNotificationsEnabled()
    }

    private fun createChannel() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return
        val channel = NotificationChannel(CHANNEL_ID, context.getString(R.string.notification_channel_health_alerts), NotificationManager.IMPORTANCE_DEFAULT).apply {
            description = context.getString(R.string.notification_channel_health_alerts_description)
        }
        context.getSystemService(NotificationManager::class.java).createNotificationChannel(channel)
    }

    private companion object {
        const val CHANNEL_ID = "health_alerts"
        const val GOAL_NOTIFICATION_ID = 2001
        const val LOW_BATTERY_ID_BASE = 3000
    }
}
