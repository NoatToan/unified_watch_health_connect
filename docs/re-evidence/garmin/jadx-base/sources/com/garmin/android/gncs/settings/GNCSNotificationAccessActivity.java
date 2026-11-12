package com.garmin.android.gncs.settings;

import android.app.Activity;
import android.app.NotificationManager;
import android.companion.CompanionDeviceManager;
import android.content.ComponentName;
import android.os.Build;
import android.os.Bundle;
import com.garmin.android.gncs.GNCSListenerService;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/gncs/settings/GNCSNotificationAccessActivity;", "Landroid/app/Activity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GNCSNotificationAccessActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        CompanionDeviceManager companionDeviceManager;
        super.onCreate(savedInstanceState);
        try {
            ComponentName componentName = new ComponentName(getApplicationContext().getPackageName(), GNCSListenerService.class.getName());
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 33) {
                Object systemService = getApplicationContext().getSystemService("companiondevice");
                CompanionDeviceManager companionDeviceManager2 = systemService instanceof CompanionDeviceManager ? (CompanionDeviceManager) systemService : null;
                if (companionDeviceManager2 != null) {
                    List myAssociations = companionDeviceManager2.getMyAssociations();
                    myAssociations.getClass();
                    if ((!myAssociations.isEmpty() ? companionDeviceManager2 : null) != null) {
                        Object systemService2 = getApplicationContext().getSystemService("notification");
                        NotificationManager notificationManager = systemService2 instanceof NotificationManager ? (NotificationManager) systemService2 : null;
                        if (notificationManager != null && !notificationManager.isNotificationListenerAccessGranted(componentName)) {
                            companionDeviceManager2.requestNotificationAccess(componentName);
                        }
                    }
                }
            } else if (i14 < 33 && (companionDeviceManager = (CompanionDeviceManager) getApplicationContext().getSystemService(CompanionDeviceManager.class)) != null) {
                List<String> associations = companionDeviceManager.getAssociations();
                associations.getClass();
                if ((associations.isEmpty() ? null : companionDeviceManager) != null && !companionDeviceManager.hasNotificationAccess(componentName)) {
                    companionDeviceManager.requestNotificationAccess(componentName);
                }
            }
        } catch (Throwable th3) {
            ih2.b.c("GNCSNotificationAccessActivity.onCreate", th3);
        }
        finish();
    }
}
