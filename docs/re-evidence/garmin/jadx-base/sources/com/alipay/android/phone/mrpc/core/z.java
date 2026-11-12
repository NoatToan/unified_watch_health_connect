package com.alipay.android.phone.mrpc.core;

import android.os.Looper;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.ResetCookie;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<Object> f28349a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<Map<String, Object>> f28350b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f28351c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AtomicInteger f28352d = new AtomicInteger();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f28353e;

    public z(x xVar) {
        this.f28353e = xVar;
    }

    public final Object a(Method method, Object[] objArr) {
        if (Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalThreadStateException("can't in main thread call rpc .");
        }
        OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
        boolean z14 = method.getAnnotation(ResetCookie.class) != null;
        Type genericReturnType = method.getGenericReturnType();
        method.getAnnotations();
        ThreadLocal<Object> threadLocal = f28349a;
        threadLocal.set(null);
        ThreadLocal<Map<String, Object>> threadLocal2 = f28350b;
        threadLocal2.set(null);
        if (operationType == null) {
            vb.h.z("OperationType must be set.");
            return null;
        }
        String strValue = operationType.value();
        int iIncrementAndGet = this.f28352d.incrementAndGet();
        try {
            if (this.f28351c == 0) {
                com.alipay.android.phone.mrpc.core.a.e eVar = new com.alipay.android.phone.mrpc.core.a.e(iIncrementAndGet, strValue, objArr);
                if (threadLocal2.get() != null) {
                    eVar.a(threadLocal2.get());
                }
                byte[] bArr = (byte[]) new j(this.f28353e.a(), method, iIncrementAndGet, strValue, eVar.a(), z14).a();
                threadLocal2.set(null);
                Object objA = new com.alipay.android.phone.mrpc.core.a.d(genericReturnType, bArr).a();
                if (genericReturnType != Void.TYPE) {
                    threadLocal.set(objA);
                }
            }
            return threadLocal.get();
        } catch (RpcException e4) {
            e4.setOperationType(strValue);
            throw e4;
        }
    }
}
