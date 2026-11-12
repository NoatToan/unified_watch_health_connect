package com.huawei.hms.findnetwork.util;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes33.dex */
public class ApplicationContext {
    private static final String TAG = "ApplicationContext";
    private static WeakReference<Context> sHmsContextWeakRef;
    private static WeakReference<Context> sKitContextWeakRef;

    private static void setKitContext(Context context) {
        sKitContextWeakRef = new WeakReference<>(context);
        HmsFindSDKLog.d(TAG, "set kit context success.");
    }

    private static void setHmsContext(Context context) {
        sHmsContextWeakRef = new WeakReference<>(context);
        HmsFindSDKLog.d(TAG, "set hms context success.");
    }

    public static void init(Context context, Context context2) {
        setKitContext(context);
        setHmsContext(context2);
    }

    public static Context getHmsContext() {
        WeakReference<Context> weakReference = sHmsContextWeakRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static Context getContext() {
        WeakReference<Context> weakReference = sKitContextWeakRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
