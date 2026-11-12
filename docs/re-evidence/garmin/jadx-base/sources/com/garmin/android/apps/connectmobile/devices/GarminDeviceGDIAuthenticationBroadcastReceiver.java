package com.garmin.android.apps.connectmobile.devices;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.devices.setup.GDIAuthPairingAndroidNotificationPressedActivity;
import com.garmin.android.apps.connectmobile.i2;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public class GarminDeviceGDIAuthenticationBroadcastReceiver extends BroadcastReceiver {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33824a;

        static {
            int[] iArr = new int[GDIAuthPairingAndroidNotificationPressedActivity.b.values().length];
            f33824a = iArr;
            try {
                iArr[GDIAuthPairingAndroidNotificationPressedActivity.b.ENTER_PASSKEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33824a[GDIAuthPairingAndroidNotificationPressedActivity.b.INIT_AUTH_DEVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (((l80.a) KoinJavaComponent.get(l80.a.class)).l()) {
            i2.n("GarminDeviceGDIAuthenticationBroadcastReceiver", "User is in pairing flow... ignoring action [" + action + "].");
            return;
        }
        i2.d("GarminDeviceGDIAuthenticationBroadcastReceiver", "Received broadcast [" + action + "].");
        if ("com.garmin.android.gdi.ACTION_PAIRING_PASSKEY_REQUIRED".equalsIgnoreCase(action)) {
            new b(this, intent, context, GDIAuthPairingAndroidNotificationPressedActivity.b.ENTER_PASSKEY).c(new Void[0]);
            return;
        }
        if (!"com.garmin.android.gdi.ACTION_DEVICE_DISCONNECTED".equalsIgnoreCase(action)) {
            i2.i("GarminDeviceGDIAuthenticationBroadcastReceiver", "Developer! You need to register " + action + " in this broadcast receiver.");
            return;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(4);
            i2.d("GarminDeviceGDIAuthenticationBroadcastReceiver", "Called notification manager to remove any GDI Auth Android notifications.");
        }
    }
}
