package com.huawei.health.h5pro.service;

import com.huawei.health.h5pro.vengine.H5ProJsCbkInvoker;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes7.dex */
public class H5ProCallback {
    private Class<?> d;

    public H5ProCallback(Class<?> cls) {
        this.d = cls;
    }

    public Object createImpl(final H5ProJsCbkInvoker<Object> h5ProJsCbkInvoker, final long j) {
        return Proxy.newProxyInstance(this.d.getClassLoader(), new Class[]{this.d}, new InvocationHandler() { // from class: com.huawei.health.h5pro.service.H5ProCallback.3
            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) {
                String name = method.getName();
                if (name.equals("onSuccess")) {
                    h5ProJsCbkInvoker.onSuccess(objArr[0], j);
                    return null;
                }
                if (name.equals("onFailure")) {
                    h5ProJsCbkInvoker.onFailure(((Integer) objArr[0]).intValue(), (String) objArr[1], j);
                    return null;
                }
                if (!"onComplete".equals(name)) {
                    throw new RuntimeException("invalid method: ".concat(name));
                }
                h5ProJsCbkInvoker.onComplete(((Integer) objArr[0]).intValue(), (String) objArr[1], j);
                return null;
            }
        });
    }
}
