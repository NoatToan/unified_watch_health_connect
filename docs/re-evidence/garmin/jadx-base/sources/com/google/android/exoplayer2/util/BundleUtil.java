package com.google.android.exoplayer2.util;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes14.dex */
public final class BundleUtil {
    private static final String TAG = "BundleUtil";
    private static Method getIBinderMethod;
    private static Method putIBinderMethod;

    private BundleUtil() {
    }

    public static IBinder getBinder(Bundle bundle, String str) {
        return Util.SDK_INT >= 18 ? bundle.getBinder(str) : getBinderByReflection(bundle, str);
    }

    private static IBinder getBinderByReflection(Bundle bundle, String str) {
        Method method = getIBinderMethod;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                getIBinderMethod = method2;
                method2.setAccessible(true);
                method = getIBinderMethod;
            } catch (NoSuchMethodException e4) {
                Log.i(TAG, "Failed to retrieve getIBinder method", e4);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e14) {
            Log.i(TAG, "Failed to invoke getIBinder via reflection", e14);
            return null;
        }
    }

    public static void putBinder(Bundle bundle, String str, IBinder iBinder) {
        if (Util.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            putBinderByReflection(bundle, str, iBinder);
        }
    }

    private static void putBinderByReflection(Bundle bundle, String str, IBinder iBinder) {
        Method method = putIBinderMethod;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                putIBinderMethod = method2;
                method2.setAccessible(true);
                method = putIBinderMethod;
            } catch (NoSuchMethodException e4) {
                Log.i(TAG, "Failed to retrieve putIBinder method", e4);
                return;
            }
        }
        try {
            method.invoke(bundle, str, iBinder);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e14) {
            Log.i(TAG, "Failed to invoke putIBinder via reflection", e14);
        }
    }
}
