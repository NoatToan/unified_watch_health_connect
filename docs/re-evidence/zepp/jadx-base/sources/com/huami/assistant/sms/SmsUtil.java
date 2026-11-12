package com.huami.assistant.sms;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import com.huami.device.feature.notification.statistics.NotificationEvent;
import com.huami.watch.util.DeviceCompatibility;

/* JADX INFO: loaded from: classes5.dex */
public final class SmsUtil {
    @TargetApi(19)
    public static void checkDefaultSmsApp(Context context) {
        if (isDefaultSmsApp(context)) {
            return;
        }
        String packageName = context.getPackageName();
        Intent intent = new Intent("android.provider.Telephony.ACTION_CHANGE_DEFAULT");
        intent.putExtra(NotificationEvent.KEY_PACKAGE, packageName);
        context.startActivity(intent);
    }

    @TargetApi(19)
    public static boolean isDefaultSmsApp(Context context) {
        if (!DeviceCompatibility.isKitkat()) {
            return true;
        }
        String packageName = context.getPackageName();
        String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
        return defaultSmsPackage != null && defaultSmsPackage.equals(packageName);
    }
}
