package org.acra.util;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.os.DropBoxManager;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;

/* JADX INFO: loaded from: classes23.dex */
public final class SystemServices {

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    private SystemServices() {
    }

    @NonNull
    private static Object a(@NonNull Context context, @NonNull String str) throws a {
        Object systemService = context.getSystemService(str);
        if (systemService != null) {
            return systemService;
        }
        throw new a("Unable to load SystemService " + str);
    }

    @NonNull
    public static ActivityManager getActivityManager(@NonNull Context context) throws a {
        return (ActivityManager) a(context, "activity");
    }

    @NonNull
    public static DropBoxManager getDropBoxManager(@NonNull Context context) throws a {
        return (DropBoxManager) a(context, "dropbox");
    }

    @NonNull
    public static NotificationManager getNotificationManager(@NonNull Context context) throws a {
        return (NotificationManager) a(context, SleepHomeActivity.FROM_NOTIFICATION);
    }

    @NonNull
    public static TelephonyManager getTelephonyManager(@NonNull Context context) throws a {
        return (TelephonyManager) a(context, "phone");
    }
}
