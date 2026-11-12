package com.xiaomi.smarthome.library.bluetooth.proxy;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class ProxyInvocationHandler implements InvocationHandler, ProxyInterceptor, Handler.Callback {
    private Handler handler;
    private ProxyInterceptor interceptor;
    private boolean postUI;
    private Object subject;
    private boolean weakRef;

    public ProxyInvocationHandler(Object obj) {
        this(obj, null);
    }

    private Object getObject(Object obj) {
        return this.weakRef ? new WeakReference(obj) : obj;
    }

    private Object postSafeInvoke(ProxyBulk proxyBulk) {
        this.handler.obtainMessage(0, proxyBulk).sendToTarget();
        return null;
    }

    private Object safeInvoke(ProxyBulk proxyBulk) {
        try {
            return proxyBulk.safeInvoke();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        ProxyBulk.safeInvoke(message.obj);
        return true;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object object = getObject();
        if (onIntercept(object, method, objArr)) {
            return null;
        }
        ProxyBulk proxyBulk = new ProxyBulk(object, method, objArr);
        return this.postUI ? postSafeInvoke(proxyBulk) : safeInvoke(proxyBulk);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.proxy.ProxyInterceptor
    public boolean onIntercept(Object obj, Method method, Object[] objArr) {
        ProxyInterceptor proxyInterceptor = this.interceptor;
        if (proxyInterceptor == null) {
            return false;
        }
        try {
            return proxyInterceptor.onIntercept(obj, method, objArr);
        } catch (Exception e) {
            BluetoothLog.e(e);
            return false;
        }
    }

    public ProxyInvocationHandler(Object obj, ProxyInterceptor proxyInterceptor) {
        this(obj, proxyInterceptor, false);
    }

    private Object getObject() {
        return this.weakRef ? ((WeakReference) this.subject).get() : this.subject;
    }

    public ProxyInvocationHandler(Object obj, ProxyInterceptor proxyInterceptor, boolean z) {
        this(obj, proxyInterceptor, z, false);
    }

    public ProxyInvocationHandler(Object obj, ProxyInterceptor proxyInterceptor, boolean z, boolean z2) {
        this.weakRef = z;
        this.interceptor = proxyInterceptor;
        this.postUI = z2;
        this.subject = getObject(obj);
        this.handler = new Handler(Looper.getMainLooper(), this);
    }
}
