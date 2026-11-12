package com.alipay.android.phone.mrpc.core;

import android.os.Looper;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.ResetCookie;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<Object> f5766a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<Map<String, Object>> f5767b = new ThreadLocal<>();
    private byte c = 0;
    private AtomicInteger d = new AtomicInteger();
    private x e;

    public z(x xVar) {
        this.e = xVar;
    }

    public final Object a(Method method, Object[] objArr) {
        if (Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalThreadStateException("can't in main thread call rpc .");
        }
        OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
        boolean z = method.getAnnotation(ResetCookie.class) != null;
        Type genericReturnType = method.getGenericReturnType();
        method.getAnnotations();
        ThreadLocal<Object> threadLocal = f5766a;
        threadLocal.set(null);
        ThreadLocal<Map<String, Object>> threadLocal2 = f5767b;
        threadLocal2.set(null);
        if (operationType == null) {
            throw new IllegalStateException("OperationType must be set.");
        }
        String strValue = operationType.value();
        int iIncrementAndGet = this.d.incrementAndGet();
        try {
            if (this.c == 0) {
                com.alipay.android.phone.mrpc.core.a.e eVar = new com.alipay.android.phone.mrpc.core.a.e(iIncrementAndGet, strValue, objArr);
                if (threadLocal2.get() != null) {
                    eVar.a(threadLocal2.get());
                }
                byte[] bArr = (byte[]) new j(this.e.a(), method, iIncrementAndGet, strValue, eVar.a(), z).a();
                threadLocal2.set(null);
                Object objA = new com.alipay.android.phone.mrpc.core.a.d(genericReturnType, bArr).a();
                if (genericReturnType != Void.TYPE) {
                    threadLocal.set(objA);
                }
            }
            return threadLocal.get();
        } catch (RpcException e) {
            e.setOperationType(strValue);
            throw e;
        }
    }
}
