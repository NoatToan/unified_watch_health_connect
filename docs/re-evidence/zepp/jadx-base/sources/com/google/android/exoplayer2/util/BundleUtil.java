package com.google.android.exoplayer2.util;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class BundleUtil {
    private static final String a = "BundleUtil";

    @Nullable
    private static Method b;

    @Nullable
    private static Method c;

    private BundleUtil() {
    }

    @Nullable
    private static IBinder a(Bundle bundle, @Nullable String key) {
        Method method = b;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                b = method2;
                method2.setAccessible(true);
                method = b;
            } catch (NoSuchMethodException e) {
                Log.i(a, "Failed to retrieve getIBinder method", e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, key);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            Log.i(a, "Failed to invoke getIBinder via reflection", e2);
            return null;
        }
    }

    private static void b(Bundle bundle, @Nullable String key, @Nullable IBinder binder) {
        Method method = c;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                c = method2;
                method2.setAccessible(true);
                method = c;
            } catch (NoSuchMethodException e) {
                Log.i(a, "Failed to retrieve putIBinder method", e);
                return;
            }
        }
        try {
            method.invoke(bundle, key, binder);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            Log.i(a, "Failed to invoke putIBinder via reflection", e2);
        }
    }

    @Nullable
    public static IBinder getBinder(Bundle bundle, @Nullable String key) {
        return Util.SDK_INT >= 18 ? bundle.getBinder(key) : a(bundle, key);
    }

    public static void putBinder(Bundle bundle, @Nullable String key, @Nullable IBinder binder) {
        if (Util.SDK_INT >= 18) {
            bundle.putBinder(key, binder);
        } else {
            b(bundle, key, binder);
        }
    }
}
