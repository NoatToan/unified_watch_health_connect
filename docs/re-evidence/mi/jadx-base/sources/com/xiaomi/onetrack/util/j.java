package com.xiaomi.onetrack.util;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.UserManager;
import android.os.storage.StorageManager;
import android.preference.PreferenceManager;
import com.xiaomi.fitness.motion.recognition.schedule.SceneRecogBroadcastReceiver;

/* JADX INFO: loaded from: classes11.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13932a = "FbeUtil";

    private j() {
    }

    public static Context a(Context context) {
        if (e(context)) {
            p.a(f13932a, "getSafeContext return origin ctx");
            return context;
        }
        p.a(f13932a, "getSafeContext , create the safe ctx");
        return context.createDeviceProtectedStorageContext();
    }

    public static boolean b(Context context) {
        try {
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            return a() && keyguardManager != null && keyguardManager.isKeyguardSecure();
        } catch (Exception e) {
            p.a(f13932a, "FBEDeviceAndSetedUpScreenLock Exception: " + e.getMessage());
            return false;
        }
    }

    public static boolean c(Context context) {
        return b(context) && !e(context);
    }

    public static boolean d(Context context) {
        return !e(context);
    }

    private static boolean e(Context context) {
        try {
            UserManager userManager = (UserManager) context.getSystemService(SceneRecogBroadcastReceiver.FROM_USER);
            return userManager != null && userManager.isUserUnlocked();
        } catch (Exception e) {
            p.a(f13932a, "isUserUnlocked Exception: " + e.getMessage());
            return false;
        }
    }

    private static boolean f(Context context) {
        return false;
    }

    public static boolean a() {
        try {
            return ((Boolean) StorageManager.class.getDeclaredMethod("isFileEncryptedNativeOrEmulated", new Class[0]).invoke(null, new Object[0]).getClass().getDeclaredMethod("isFileEncryptedNativeOrEmulated", Boolean.TYPE).invoke(null, new Object[0])).booleanValue();
        } catch (Exception e) {
            p.b(f13932a, "*** " + e);
            return false;
        }
    }

    public static void a(PreferenceManager preferenceManager) {
        preferenceManager.setStorageDeviceProtected();
    }
}
