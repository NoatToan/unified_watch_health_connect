package defpackage;

import com.huawei.health.h5pro.service.H5ProCallback;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProJsCbkInvoker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class ext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f33653b;
    private H5ProCallback e;

    public ext(Method method, String str) {
        this.f33653b = method;
        this.f33652a = str;
        b();
    }

    private void b() {
        Method method = this.f33653b;
        if (method == null) {
            LogUtil.w("H5PRO_H5ProMethod", "initH5ProCallback: mMethod is null");
            return;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length == 0) {
            return;
        }
        Class<?> cls = parameterTypes[parameterTypes.length - 1];
        if (cls.isInterface()) {
            if (!cls.isAnnotationPresent(com.huawei.health.h5pro.service.anotation.H5ProCallback.class)) {
                Locale locale = Locale.ENGLISH;
                LogUtil.w("H5PRO_H5ProMethod", this.f33653b.getName() + ": If callback is required, the last parameter must be of the interface type and marked as H5ProCallback");
                return;
            }
            try {
                cls.getMethod("onSuccess", Object.class);
                try {
                    cls.getMethod("onFailure", Integer.TYPE, String.class);
                    this.e = new H5ProCallback(cls);
                } catch (NoSuchMethodException unused) {
                    Locale locale2 = Locale.ENGLISH;
                    LogUtil.e("H5PRO_H5ProMethod", this.f33653b.getName() + ": Method onFailure(int,Object) not found in " + cls.getName());
                } catch (SecurityException e) {
                    Locale locale3 = Locale.ENGLISH;
                    LogUtil.e("H5PRO_H5ProMethod", this.f33653b.getName() + ": onFailure(int,Object) SecurityException-> " + e.getMessage());
                }
            } catch (NoSuchMethodException unused2) {
                Locale locale4 = Locale.ENGLISH;
                LogUtil.e("H5PRO_H5ProMethod", this.f33653b.getName() + ": Method onSuccess(Object) not found in " + cls.getName());
            } catch (SecurityException e2) {
                Locale locale5 = Locale.ENGLISH;
                LogUtil.e("H5PRO_H5ProMethod", this.f33653b.getName() + ": onSuccess(Object) SecurityException-> " + e2.getMessage());
            }
        }
    }

    public <H5PS, P> Object a(H5PS h5ps, P... pArr) {
        return (pArr == null || pArr.length == 0) ? this.f33653b.invoke(h5ps, null) : this.f33653b.invoke(h5ps, pArr);
    }

    public boolean a() {
        return this.e != null;
    }

    public Method c() {
        return this.f33653b;
    }

    public String d() {
        return this.f33652a;
    }

    public <H5PS, P> void d(H5PS h5ps, H5ProJsCbkInvoker<Object> h5ProJsCbkInvoker, long j, P... pArr) throws IllegalAccessException, InvocationTargetException {
        H5ProCallback h5ProCallback = this.e;
        if (h5ProCallback == null) {
            LogUtil.w("H5PRO_H5ProMethod", "asyncCall: mH5ProCallback is null");
            return;
        }
        Object objCreateImpl = h5ProCallback.createImpl(h5ProJsCbkInvoker, j);
        if (pArr == null || pArr.length == 0) {
            this.f33653b.invoke(h5ps, objCreateImpl);
            return;
        }
        Object[] objArr = new Object[pArr.length + 1];
        System.arraycopy(pArr, 0, objArr, 0, pArr.length);
        objArr[pArr.length] = objCreateImpl;
        this.f33653b.invoke(h5ps, objArr);
    }
}
