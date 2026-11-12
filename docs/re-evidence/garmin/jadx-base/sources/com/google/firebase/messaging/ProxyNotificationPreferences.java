package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: loaded from: classes2.dex */
final class ProxyNotificationPreferences {
    private static final String FCM_PREFERENCES = "com.google.firebase.messaging";

    private ProxyNotificationPreferences() {
    }

    private static SharedPreferences getPreference(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static boolean isProxyNotificationInitialized(Context context) {
        return getPreference(context).getBoolean("proxy_notification_initialized", false);
    }

    public static boolean isProxyNotificationRetentionSet(SharedPreferences sharedPreferences, boolean z14) {
        return sharedPreferences.contains("proxy_retention") && sharedPreferences.getBoolean("proxy_retention", false) == z14;
    }

    public static void setProxyNotificationsInitialized(Context context, boolean z14) {
        SharedPreferences.Editor editorEdit = getPreference(context).edit();
        editorEdit.putBoolean("proxy_notification_initialized", z14);
        editorEdit.apply();
    }

    public static void setProxyRetention(final Context context, GmsRpc gmsRpc, final boolean z14) {
        if (PlatformVersion.isAtLeastQ() && !isProxyNotificationRetentionSet(getPreference(context), z14)) {
            gmsRpc.setRetainProxiedNotifications(z14).addOnSuccessListener(new bv2.g(1), new OnSuccessListener() { // from class: com.google.firebase.messaging.n
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    ProxyNotificationPreferences.setProxyRetentionPreferences(context, z14);
                }
            });
        }
    }

    public static void setProxyRetentionPreferences(Context context, boolean z14) {
        SharedPreferences.Editor editorEdit = getPreference(context).edit();
        editorEdit.putBoolean("proxy_retention", z14);
        editorEdit.apply();
    }
}
