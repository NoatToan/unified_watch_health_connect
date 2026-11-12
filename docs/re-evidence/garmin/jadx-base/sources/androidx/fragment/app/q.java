package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;
import p1.k1;

/* JADX INFO: loaded from: classes.dex */
public class q {
    private static final k1<ClassLoader, k1<String, Class<?>>> sClassCacheMap = new k1<>();

    public static boolean isFragmentClass(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(loadClass(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static Class<?> loadClass(ClassLoader classLoader, String str) throws ClassNotFoundException {
        k1<ClassLoader, k1<String, Class<?>>> k1Var = sClassCacheMap;
        k1<String, Class<?>> k1Var2 = k1Var.get(classLoader);
        if (k1Var2 == null) {
            k1Var2 = new k1<>();
            k1Var.put(classLoader, k1Var2);
        }
        Class<?> cls = k1Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        k1Var2.put(str, cls2);
        return cls2;
    }

    public static Class<? extends Fragment> loadFragmentClass(ClassLoader classLoader, String str) {
        try {
            return loadClass(classLoader, str);
        } catch (ClassCastException e4) {
            throw new Fragment.InstantiationException(am.j.m("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e4);
        } catch (ClassNotFoundException e14) {
            throw new Fragment.InstantiationException(am.j.m("Unable to instantiate fragment ", str, ": make sure class name exists"), e14);
        }
    }

    public Fragment instantiate(ClassLoader classLoader, String str) {
        try {
            return loadFragmentClass(classLoader, str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e4) {
            throw new Fragment.InstantiationException(am.j.m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (InstantiationException e14) {
            throw new Fragment.InstantiationException(am.j.m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e14);
        } catch (NoSuchMethodException e15) {
            throw new Fragment.InstantiationException(am.j.m("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e15);
        } catch (InvocationTargetException e16) {
            throw new Fragment.InstantiationException(am.j.m("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e16);
        }
    }
}
