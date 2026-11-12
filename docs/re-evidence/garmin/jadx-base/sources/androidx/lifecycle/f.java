package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r1.q2;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f7885c = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f7886a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f7887b = new HashMap();

    @Deprecated
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f7888a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<b, b0.a> f7889b;

        public a(Map<b, b0.a> map) {
            this.f7889b = map;
            for (Map.Entry<b, b0.a> entry : map.entrySet()) {
                b0.a value = entry.getValue();
                List arrayList = (List) this.f7888a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f7888a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        public static void a(List<b> list, n0 n0Var, b0.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar = list.get(size);
                    Method method = bVar.f7891b;
                    try {
                        int i14 = bVar.f7890a;
                        if (i14 == 0) {
                            method.invoke(obj, null);
                        } else if (i14 == 1) {
                            method.invoke(obj, n0Var);
                        } else if (i14 == 2) {
                            method.invoke(obj, n0Var, aVar);
                        }
                    } catch (IllegalAccessException e4) {
                        o2.c.p(e4);
                        return;
                    } catch (InvocationTargetException e14) {
                        q2.v("Failed to call observer method", e14.getCause());
                        return;
                    }
                }
            }
        }
    }

    @Deprecated
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f7891b;

        public b(int i14, Method method) {
            this.f7890a = i14;
            this.f7891b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f7890a == bVar.f7890a && this.f7891b.getName().equals(bVar.f7891b.getName());
        }

        public final int hashCode() {
            return this.f7891b.getName().hashCode() + (this.f7890a * 31);
        }
    }

    public static void b(HashMap map, b bVar, b0.a aVar, Class cls) {
        b0.a aVar2 = (b0.a) map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f7891b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i14;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f7886a;
        if (superclass != null) {
            a aVarA = (a) map2.get(superclass);
            if (aVarA == null) {
                aVarA = a(superclass, null);
            }
            map.putAll(aVarA.f7889b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            a aVarA2 = (a) map2.get(cls2);
            if (aVarA2 == null) {
                aVarA2 = a(cls2, null);
            }
            for (Map.Entry<b, b0.a> entry : aVarA2.f7889b.entrySet()) {
                b(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e4) {
                n23.j.w("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
                return null;
            }
        }
        boolean z14 = false;
        for (Method method : methodArr) {
            a1 a1Var = (a1) method.getAnnotation(a1.class);
            if (a1Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i14 = 0;
                } else {
                    if (!n0.class.isAssignableFrom(parameterTypes[0])) {
                        vb.h.s("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i14 = 1;
                }
                b0.a aVarValue = a1Var.value();
                if (parameterTypes.length > 1) {
                    if (!b0.a.class.isAssignableFrom(parameterTypes[1])) {
                        vb.h.s("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (aVarValue != b0.a.ON_ANY) {
                        vb.h.s("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i14 = 2;
                }
                if (parameterTypes.length > 2) {
                    vb.h.s("cannot have more than 2 params");
                    return null;
                }
                b(map, new b(i14, method), aVarValue, cls);
                z14 = true;
            }
        }
        a aVar = new a(map);
        map2.put(cls, aVar);
        this.f7887b.put(cls, Boolean.valueOf(z14));
        return aVar;
    }
}
