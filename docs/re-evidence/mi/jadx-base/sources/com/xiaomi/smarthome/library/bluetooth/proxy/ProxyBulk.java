package com.xiaomi.smarthome.library.bluetooth.proxy;

import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class ProxyBulk {
    public Object[] args;
    public Method method;
    public Object object;

    public ProxyBulk(Object obj, Method method, Object[] objArr) {
        this.object = obj;
        this.method = method;
        this.args = objArr;
    }

    public Object safeInvoke() {
        try {
            return this.method.invoke(this.object, this.args);
        } catch (Throwable th) {
            BluetoothLog.e(th);
            return null;
        }
    }

    public static Object safeInvoke(Object obj) {
        return ((ProxyBulk) obj).safeInvoke();
    }
}
