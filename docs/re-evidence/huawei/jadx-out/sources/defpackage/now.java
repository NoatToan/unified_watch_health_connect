package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public class now {
    private static void c(Class cls, Class[] clsArr, Object[] objArr) throws Exception {
        if (cls == null) {
            throw new ClassNotFoundException("class is null in staticFun");
        }
        if (clsArr == null) {
            if (objArr != null) {
                throw new ClassNotFoundException("paramsType is null, but params is not null");
            }
        } else {
            if (objArr == null) {
                throw new ClassNotFoundException("paramsType or params should be same");
            }
            if (clsArr.length == objArr.length) {
                return;
            }
            throw new ClassNotFoundException("paramsType len:" + clsArr.length + " should equal params.len:" + objArr.length);
        }
    }

    private static Object c(Class cls, String str, Class[] clsArr, Object[] objArr) throws Exception {
        c(cls, clsArr, objArr);
        try {
            try {
                return cls.getMethod(str, clsArr).invoke(null, objArr);
            } catch (IllegalAccessException e) {
                nox.e("HwInvoke", "IllegalAccessException" + e.getClass().getSimpleName(), true);
                return null;
            } catch (IllegalArgumentException e2) {
                nox.e("HwInvoke", "IllegalArgumentException" + e2.getClass().getSimpleName(), true);
                return null;
            } catch (InvocationTargetException e3) {
                nox.e("HwInvoke", "InvocationTargetException" + e3.getClass().getSimpleName(), true);
                return null;
            }
        } catch (NoSuchMethodException e4) {
            nox.e("HwInvoke", "NoSuchMethodException" + e4.getClass().getSimpleName(), true);
        } catch (Exception e5) {
            nox.e("HwInvoke", "Exception" + e5.getClass().getSimpleName(), true);
        }
    }

    public static Object c(String str, String str2, Class[] clsArr, Object[] objArr) {
        try {
            return c(Class.forName(str), str2, clsArr, objArr);
        } catch (ClassNotFoundException e) {
            nox.e("HwInvoke", "ClassNotFoundException" + e.getClass().getSimpleName(), true);
            return null;
        } catch (Exception e2) {
            nox.e("HwInvoke", "Exception" + e2.getClass().getSimpleName(), true);
            return null;
        } catch (Throwable th) {
            nox.e("HwInvoke", "Throwable" + th.getClass().getSimpleName(), true);
            return null;
        }
    }
}
