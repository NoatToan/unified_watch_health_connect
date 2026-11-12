package com.huami.wallet.datasource.cloud;

import androidx.annotation.NonNull;
import com.huami.nfc.applet.api.SeAppletApi;
import com.huami.tools.log.HMLog;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;

/* JADX INFO: loaded from: classes13.dex */
class k implements InvocationHandler {
    private static final String c = "Wallet-SerialAppletApiInvocationHandler";
    private final Object a;
    private final SeAppletApi b;

    public k(@NonNull SeAppletApi seAppletApi, @NonNull Object obj) {
        this.b = seAppletApi;
        this.a = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object objInvoke;
        String strD = l.d(method, objArr);
        HMLog.d(c, strD + "invoked, hashCode:" + hashCode(), new Object[0]);
        synchronized (this.a) {
            HMLog.d(c, strD + "enter synchronized block, holdsLock:" + Thread.holdsLock(this.a) + ", hashCode:" + hashCode(), new Object[0]);
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                try {
                    objInvoke = method.invoke(this.b, objArr);
                    HMLog.i(Const.Tag.BENCHAMRK, strD + "耗时 " + l.c(System.currentTimeMillis() - jCurrentTimeMillis) + ", hashCode:" + hashCode(), new Object[0]);
                } catch (Exception e) {
                    Throwable cause = e;
                    do {
                        if (!(cause instanceof UndeclaredThrowableException) && !(cause instanceof InvocationTargetException)) {
                            break;
                        }
                        cause = cause.getCause();
                    } while (cause != null);
                    if (cause != null) {
                        throw cause;
                    }
                    throw e;
                }
            } catch (Throwable th) {
                HMLog.i(Const.Tag.BENCHAMRK, strD + "耗时 " + l.c(System.currentTimeMillis() - jCurrentTimeMillis) + ", hashCode:" + hashCode(), new Object[0]);
                throw th;
            }
        }
        return objInvoke;
    }
}
