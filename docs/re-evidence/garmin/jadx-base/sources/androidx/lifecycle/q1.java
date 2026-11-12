package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<Class<?>> f7997a = p13.x.k(Application.class, j1.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<Class<?>> f7998b = p13.w.c(j1.class);

    public static final Constructor a(List list, Class cls) {
        cls.getClass();
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listI0 = p13.u.i0(parameterTypes);
            if (list.equals(listI0)) {
                return constructor;
            }
            if (list.size() == listI0.size() && listI0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final <T extends u1> T b(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        cls.getClass();
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e4) {
            q2.v(androidx.core.view.j.h(cls, "Failed to access "), e4);
            return null;
        } catch (InstantiationException e14) {
            q2.v(androidx.core.view.j.i(cls, "A ", " cannot be instantiated."), e14);
            return null;
        } catch (InvocationTargetException e15) {
            q2.v(androidx.core.view.j.h(cls, "An exception happened in constructor of "), e15.getCause());
            return null;
        }
    }
}
