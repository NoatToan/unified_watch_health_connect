package com.alipay.android.phone.mrpc.core;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.ResetCookie;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<Object> f1974a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<Map<String, Object>> f1975b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte f1976c = 0;
    private AtomicInteger d = new AtomicInteger();
    private y e;

    private void a(Object obj, Class<?> cls, Method method, Object[] objArr, Annotation[] annotationArr) {
    }

    private void a(Object obj, byte[] bArr, Class<?> cls, Method method, Object[] objArr, Annotation[] annotationArr) {
    }

    public Object a(Object obj, Class<?> cls, Method method, Object[] objArr) {
        byte[] bArr;
        if (ac.a()) {
            throw new IllegalThreadStateException("can't in main thread call rpc .");
        }
        OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
        boolean z = method.getAnnotation(ResetCookie.class) != null;
        Type genericReturnType = method.getGenericReturnType();
        Annotation[] annotations = method.getAnnotations();
        ThreadLocal<Object> threadLocal = f1974a;
        byte[] bArrA = null;
        threadLocal.set(null);
        f1975b.set(null);
        if (operationType == null) {
            throw new IllegalStateException("OperationType must be set.");
        }
        String strValue = operationType.value();
        int iIncrementAndGet = this.d.incrementAndGet();
        a(obj, cls, method, objArr, annotations);
        try {
            if (this.f1976c == 0) {
                bArrA = a(method, objArr, strValue, iIncrementAndGet, z);
                Object objA = a(genericReturnType, bArrA).a();
                if (genericReturnType != Void.TYPE) {
                    threadLocal.set(objA);
                }
            }
            bArr = bArrA;
        } catch (RpcException e) {
            e.setOperationType(strValue);
            bArr = bArrA;
            a(obj, bArr, cls, method, objArr, annotations, e);
        }
        a(obj, bArr, cls, method, objArr, annotations);
        return f1974a.get();
    }

    public w a(Method method, int i, String str, byte[] bArr, boolean z) {
        return new j(this.e.a(), method, i, str, bArr, z);
    }

    public com.alipay.android.phone.mrpc.core.a.f a(int i, String str, Object[] objArr) {
        return new com.alipay.android.phone.mrpc.core.a.e(i, str, objArr);
    }

    public com.alipay.android.phone.mrpc.core.a.c a(Type type, byte[] bArr) {
        return new com.alipay.android.phone.mrpc.core.a.d(type, bArr);
    }

    private byte[] a(Method method, Object[] objArr, String str, int i, boolean z) {
        com.alipay.android.phone.mrpc.core.a.f fVarA = a(i, str, objArr);
        ThreadLocal<Map<String, Object>> threadLocal = f1975b;
        if (threadLocal.get() != null) {
            fVarA.a(threadLocal.get());
        }
        byte[] bArr = (byte[]) a(method, i, str, fVarA.a(), z).a();
        threadLocal.set(null);
        return bArr;
    }

    private void a(Object obj, byte[] bArr, Class<?> cls, Method method, Object[] objArr, Annotation[] annotationArr, RpcException rpcException) {
        throw rpcException;
    }

    public aa(y yVar) {
        this.e = yVar;
    }
}
