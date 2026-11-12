package com.huami.wallet.datasource.cloud;

import androidx.annotation.NonNull;
import com.huami.nfc.base.PayResponse;
import com.huami.tools.log.HMLog;
import com.huami.wallet.lib.util.ErrorCode;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;

/* JADX INFO: loaded from: classes13.dex */
class n<T> implements InvocationHandler {
    private final String a;
    private final T b;
    private final a c;

    public n(String str, @NonNull T t, @NonNull a aVar) {
        this.a = str;
        this.b = t;
        this.c = aVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String strD = l.d(method, objArr);
        HMLog.d(this.a, strD + "invoked", new Object[0]);
        if (!this.c.getAsBoolean()) {
            HMLog.i(this.a, strD + "() 未执行，因为网络未连接", new Object[0]);
            if (method.getReturnType().isAssignableFrom(PayResponse.class)) {
                return new PayResponse(ErrorCode.NETWORK_ERROR, "网络未连接", null);
            }
            throw new j("网络未连接");
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                Object objInvoke = method.invoke(this.b, objArr);
                HMLog.i(Const.Tag.BENCHAMRK, strD + "耗时 " + l.c(System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
                return objInvoke;
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
            HMLog.i(Const.Tag.BENCHAMRK, strD + "耗时 " + l.c(System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
            throw th;
        }
    }
}
