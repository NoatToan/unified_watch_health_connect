package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class a {
    public static a c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, C0042a> f2580a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, Boolean> f2581b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.a$a, reason: collision with other inner class name */
    @Deprecated
    public static class C0042a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Lifecycle.Event, List<b>> f2582a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<b, Lifecycle.Event> f2583b;

        public C0042a(Map<b, Lifecycle.Event> map) {
            this.f2583b = map;
            for (Map.Entry<b, Lifecycle.Event> entry : map.entrySet()) {
                Lifecycle.Event value = entry.getValue();
                List<b> arrayList = this.f2582a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f2582a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        public static void b(List<b> list, LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(lifecycleOwner, event, obj);
                }
            }
        }

        public void a(LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            b(this.f2582a.get(event), lifecycleOwner, event, obj);
            b(this.f2582a.get(Lifecycle.Event.ON_ANY), lifecycleOwner, event, obj);
        }
    }

    @Deprecated
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f2585b;

        public b(int i, Method method) {
            this.f2584a = i;
            this.f2585b = method;
            method.setAccessible(true);
        }

        public void a(LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            try {
                int i = this.f2584a;
                if (i == 0) {
                    this.f2585b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f2585b.invoke(obj, lifecycleOwner);
                } else {
                    if (i != 2) {
                        return;
                    }
                    this.f2585b.invoke(obj, lifecycleOwner, event);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f2584a == bVar.f2584a && this.f2585b.getName().equals(bVar.f2585b.getName());
        }

        public int hashCode() {
            return (this.f2584a * 31) + this.f2585b.getName().hashCode();
        }
    }

    public final C0042a a(Class<?> cls, Method[] methodArr) {
        int i;
        C0042a c0042aC;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (c0042aC = c(superclass)) != null) {
            map.putAll(c0042aC.f2583b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, Lifecycle.Event> entry : c(cls2).f2583b.entrySet()) {
                e(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            c cVar = (c) method.getAnnotation(c.class);
            if (cVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!LifecycleOwner.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                Lifecycle.Event eventValue = cVar.value();
                if (parameterTypes.length > 1) {
                    if (!Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (eventValue != Lifecycle.Event.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new b(i, method), eventValue, cls);
                z = true;
            }
        }
        C0042a c0042a = new C0042a(map);
        this.f2580a.put(cls, c0042a);
        this.f2581b.put(cls, Boolean.valueOf(z));
        return c0042a;
    }

    public final Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    public C0042a c(Class<?> cls) {
        C0042a c0042a = this.f2580a.get(cls);
        return c0042a != null ? c0042a : a(cls, null);
    }

    public boolean d(Class<?> cls) {
        Boolean bool = this.f2581b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((c) method.getAnnotation(c.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f2581b.put(cls, Boolean.FALSE);
        return false;
    }

    public final void e(Map<b, Lifecycle.Event> map, b bVar, Lifecycle.Event event, Class<?> cls) {
        Lifecycle.Event event2 = map.get(bVar);
        if (event2 == null || event == event2) {
            if (event2 == null) {
                map.put(bVar, event);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f2585b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + event2 + ", new value " + event);
    }
}
