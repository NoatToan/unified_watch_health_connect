package com.huawei.haf.common.dfx.memory;

import com.huawei.haf.common.dfx.DfxUtils;
import health.compact.a.DfxMonitorCenter;
import health.compact.a.LogUtil;
import health.compact.a.ReflectionUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes2.dex */
final class CloseGuardMonitor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static CloseLeakDetector f5880b;

    private CloseGuardMonitor() {
    }

    static void e() {
        if (f5880b != null) {
            return;
        }
        try {
            Class<?> clsD = d();
            a(clsD, true);
            f5880b = a(clsD, (Object) null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            LogUtil.b("HAF_CloseGuard", "install monitor CloseGuard fail, ex=", LogUtil.c(e));
        }
    }

    static void c() {
        CloseLeakDetector closeLeakDetector = f5880b;
        if (closeLeakDetector == null) {
            return;
        }
        f5880b = null;
        try {
            a(d(), closeLeakDetector.f5882a);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            LogUtil.b("HAF_CloseGuard", "uninstall monitor CloseGuard fail, ex=", LogUtil.c(e));
        }
    }

    private static Class<?> d() throws ClassNotFoundException {
        return ReflectionUtils.e("dalvik.system.CloseGuard");
    }

    private static void a(Class<?> cls, boolean z) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ReflectionUtils.e(cls, "setEnabled", (Class<?>[]) new Class[]{Boolean.TYPE}).invoke(null, Boolean.valueOf(z));
    }

    private static CloseLeakDetector a(Class<?> cls, Object obj) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Class<?> clsE = ReflectionUtils.e("dalvik.system.CloseGuard$Reporter");
        Method methodE = ReflectionUtils.e(cls, "setReporter", (Class<?>[]) new Class[]{clsE});
        if (obj == null) {
            CloseLeakDetector closeLeakDetector = new CloseLeakDetector(ReflectionUtils.e(cls, "getReporter"));
            methodE.invoke(null, Proxy.newProxyInstance(clsE.getClassLoader(), new Class[]{clsE}, closeLeakDetector));
            return closeLeakDetector;
        }
        methodE.invoke(null, obj);
        return null;
    }

    static class CloseLeakDetector implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f5882a;

        CloseLeakDetector(Object obj) {
            this.f5882a = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (objArr != null && objArr.length > 1 && "report".equals(method.getName()) && (objArr[1] instanceof Throwable)) {
                DfxMonitorCenter.c(new CloseGuardLeakRunnable(String.valueOf(objArr[0]), (Throwable) objArr[1]));
            }
            return method.invoke(this.f5882a, objArr);
        }
    }

    static class CloseGuardLeakRunnable implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f5881c;
        private final Throwable e;

        CloseGuardLeakRunnable(String str, Throwable th) {
            this.f5881c = str;
            this.e = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            MemoryMonitor.c("CloseGuard", this.f5881c, DfxUtils.d(Thread.currentThread(), this.e), System.currentTimeMillis());
        }
    }
}
