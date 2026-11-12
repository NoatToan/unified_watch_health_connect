package com.xiaomi.smarthome.library.bluetooth;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public class BluetoothContextManager {
    public static boolean IS_RELEASE_BUILD_TYPE;
    private static Context mContext;
    private static Handler mHandler;

    public static Context getContext() {
        return mContext;
    }

    public static String getCurrentMethodName() {
        return Thread.currentThread().getStackTrace()[4].getMethodName();
    }

    public static boolean isReleaseBuild() {
        return IS_RELEASE_BUILD_TYPE;
    }

    public static void post(Runnable runnable) {
        postDelayed(runnable, 0L);
    }

    public static void postDelayed(Runnable runnable, long j) {
        if (mHandler == null) {
            mHandler = new Handler(Looper.getMainLooper());
        }
        mHandler.postDelayed(runnable, j);
    }

    public static void setContext(Context context, boolean z) {
        mContext = context.getApplicationContext();
        IS_RELEASE_BUILD_TYPE = z;
    }

    public String getName() {
        return getClass().getSimpleName();
    }
}
