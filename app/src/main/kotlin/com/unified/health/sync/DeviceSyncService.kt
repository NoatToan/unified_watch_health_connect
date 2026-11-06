package com.unified.health.sync

import android.Manifest
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.content.pm.ServiceInfo
import android.os.Build
import android.os.IBinder
import androidx.core.app.NotificationCompat
import androidx.core.app.ServiceCompat
import androidx.core.content.ContextCompat
import com.unified.health.core.domain.repository.DeviceLinkKeeper
import com.unified.health.core.domain.repository.WearableDeviceRepository
import com.unified.health.core.model.ConnectionState
import com.unified.health.notifications.HealthAlertsMonitor
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Foreground service (type `connectedDevice`) that keeps the watch link alive while the user has a
 * paired device. It only hosts [DeviceLinkKeeper], which reacts to connection events instead of
 * polling, so it adds no wake-ups of its own. Not sticky: opening the app starts it again.
 */
@AndroidEntryPoint
class DeviceSyncService : Service() {

    @Inject lateinit var keeper: DeviceLinkKeeper
    @Inject lateinit var repository: WearableDeviceRepository
    @Inject lateinit var alerts: HealthAlertsMonitor

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Main.immediate)
    private var watching: Job? = null

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        createChannel()
        ServiceCompat.startForeground(
            this,
            NOTIFICATION_ID,
            notification("Connecting to your watch…"),
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) ServiceInfo.FOREGROUND_SERVICE_TYPE_CONNECTED_DEVICE else 0,
        )
        keeper.start()
        if (watching?.isActive != true) {
            watching = scope.launch {
                launch { alerts.run() }
                launch {
                    combine(repository.pairedDevices, repository.connectionState) { devices, state ->
                        val name = devices.firstOrNull()?.name ?: "watch"
                        when (state) {
                            ConnectionState.Connected -> "Connected to $name"
                            ConnectionState.Connecting, ConnectionState.Authenticating -> "Connecting to $name…"
                            is ConnectionState.Error -> "Reconnecting to $name…"
                            ConnectionState.Disconnected -> "Disconnected"
                        }
                    }.distinctUntilChanged().collect { text ->
                        getSystemService(NotificationManager::class.java).notify(NOTIFICATION_ID, notification(text))
                    }
                }
                keeper.active.first { !it }
                stopSelf()
                cancel() // also stops the alert monitor
            }
        }
        return START_NOT_STICKY
    }

    override fun onDestroy() {
        scope.cancel()
        super.onDestroy()
    }

    private fun createChannel() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return
        val channel = NotificationChannel(CHANNEL_ID, "Watch connection", NotificationManager.IMPORTANCE_LOW)
        getSystemService(NotificationManager::class.java).createNotificationChannel(channel)
    }

    private fun notification(text: String): Notification =
        NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(android.R.drawable.stat_sys_data_bluetooth)
            .setContentTitle("Unified Health")
            .setContentText(text)
            .setOngoing(true)
            .setOnlyAlertOnce(true)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .setCategory(NotificationCompat.CATEGORY_SERVICE)
            .build()

    companion object {
        private const val CHANNEL_ID = "device_link"
        private const val NOTIFICATION_ID = 1001

        /** Call only while the app is visible. Skips silently without the Bluetooth permission. */
        fun start(context: Context) {
            val permitted = Build.VERSION.SDK_INT < Build.VERSION_CODES.S ||
                ContextCompat.checkSelfPermission(context, Manifest.permission.BLUETOOTH_CONNECT) == PackageManager.PERMISSION_GRANTED
            if (permitted) ContextCompat.startForegroundService(context, Intent(context, DeviceSyncService::class.java))
        }
    }
}
