package com.huawei.hwcloudjs.core;

import com.huawei.hwcloudjs.support.enables.INoProguard;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes10.dex */
public abstract class JSRequest implements INoProguard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f17045a = "JSRequest";

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public final void execute(Method method, Object obj, JsCallback jsCallback) {
        Object[] objArr;
        boolean z;
        com.huawei.hwcloudjs.f.d.c(f17045a, "execute begin", true);
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length;
        try {
            if (length > 0) {
                objArr = new Object[length];
                objArr[0] = obj;
                int i = length - 1;
                if (parameterTypes[i] == JsCallback.class) {
                    objArr[i] = jsCallback;
                    z = true;
                }
                method.invoke(this, objArr);
                if (z) {
                    return;
                }
                jsCallback.success();
                return;
            }
            objArr = null;
            method.invoke(this, objArr);
            if (z) {
                jsCallback.success();
                return;
            }
            return;
        } catch (IllegalAccessException unused) {
            com.huawei.hwcloudjs.f.d.b(f17045a, "IllegalAccessException", true);
            jsCallback.failure();
            return;
        } catch (InvocationTargetException e) {
            com.huawei.hwcloudjs.f.d.b(f17045a, "InvocationTargetException", true);
            com.huawei.hwcloudjs.f.d.b(f17045a, "InvocationTargetException:" + e.getTargetException(), false);
            jsCallback.failure();
            return;
        }
        z = false;
    }
}
