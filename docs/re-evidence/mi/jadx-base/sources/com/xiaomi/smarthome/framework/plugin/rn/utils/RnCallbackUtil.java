package com.xiaomi.smarthome.framework.plugin.rn.utils;

import com.facebook.react.bridge.Callback;

/* JADX INFO: loaded from: classes2.dex */
public class RnCallbackUtil {
    public static void invoke(Callback callback, Object... objArr) {
        if (callback != null) {
            callback.invoke(objArr);
        }
    }

    public static <T> void onResult(com.xiaomi.smarthome.framework.proxy.common.Callback<T> callback, boolean z, T t) {
        if (callback != null) {
            callback.onResult(z, t);
        }
    }
}
