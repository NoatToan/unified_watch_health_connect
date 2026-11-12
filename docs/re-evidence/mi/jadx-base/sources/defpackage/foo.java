package defpackage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Typography;
import org.greenrobot.eventbus.EventBusException;

/* JADX INFO: loaded from: classes3.dex */
public class foo {
    public static final Map<Class<?>, List<doo>> d = new ConcurrentHashMap();
    public static final a[] e = new a[4];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<coo> f18016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18017b;
    public final boolean c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<doo> f18018a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<Class, Object> f18019b = new HashMap();
        public final Map<String, Class> c = new HashMap();
        public final StringBuilder d = new StringBuilder(128);
        public Class<?> e;
        public Class<?> f;
        public boolean g;

        public boolean a(Method method, Class<?> cls) {
            Object objPut = this.f18019b.put(cls, method);
            if (objPut == null) {
                return true;
            }
            if (objPut instanceof Method) {
                if (!b((Method) objPut, cls)) {
                    throw new IllegalStateException();
                }
                this.f18019b.put(cls, this);
            }
            return b(method, cls);
        }

        public final boolean b(Method method, Class<?> cls) {
            this.d.setLength(0);
            this.d.append(method.getName());
            StringBuilder sb = this.d;
            sb.append(Typography.greater);
            sb.append(cls.getName());
            String string = this.d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class clsPut = this.c.put(string, declaringClass);
            if (clsPut == null || clsPut.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.c.put(string, clsPut);
            return false;
        }

        public void c(Class<?> cls) {
            this.f = cls;
            this.e = cls;
            this.g = false;
        }

        public void d() {
            if (this.g) {
                this.f = null;
                return;
            }
            Class<? super Object> superclass = this.f.getSuperclass();
            this.f = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                this.f = null;
            }
        }

        public void e() {
            this.f18018a.clear();
            this.f18019b.clear();
            this.c.clear();
            this.d.setLength(0);
            this.e = null;
            this.f = null;
            this.g = false;
        }
    }

    public foo(List<coo> list, boolean z, boolean z2) {
        this.f18016a = list;
        this.f18017b = z;
        this.c = z2;
    }

    public List<doo> a(Class<?> cls) {
        Map<Class<?>, List<doo>> map = d;
        List<doo> list = map.get(cls);
        if (list != null) {
            return list;
        }
        List<doo> listC = this.c ? c(cls) : b(cls);
        if (!listC.isEmpty()) {
            map.put(cls, listC);
            return listC;
        }
        throw new EventBusException("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }

    public final List<doo> b(Class<?> cls) {
        a aVarG = g();
        aVarG.c(cls);
        while (aVarG.f != null) {
            f(aVarG);
            d(aVarG);
            aVarG.d();
        }
        return e(aVarG);
    }

    public final List<doo> c(Class<?> cls) {
        a aVarG = g();
        aVarG.c(cls);
        while (aVarG.f != null) {
            d(aVarG);
            aVarG.d();
        }
        return e(aVarG);
    }

    public final void d(a aVar) {
        Method[] methods;
        try {
            methods = aVar.f.getDeclaredMethods();
        } catch (Throwable unused) {
            methods = aVar.f.getMethods();
            aVar.g = true;
        }
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    uno unoVar = (uno) method.getAnnotation(uno.class);
                    if (unoVar != null) {
                        Class<?> cls = parameterTypes[0];
                        if (aVar.a(method, cls)) {
                            aVar.f18018a.add(new doo(method, cls, unoVar.threadMode(), unoVar.priority(), unoVar.sticky()));
                        }
                    }
                } else if (this.f18017b && method.isAnnotationPresent(uno.class)) {
                    throw new EventBusException("@Subscribe method " + (method.getDeclaringClass().getName() + "." + method.getName()) + "must have exactly 1 parameter but has " + parameterTypes.length);
                }
            } else if (this.f18017b && method.isAnnotationPresent(uno.class)) {
                throw new EventBusException((method.getDeclaringClass().getName() + "." + method.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
            }
        }
    }

    public final List<doo> e(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f18018a);
        aVar.e();
        synchronized (e) {
            for (int i = 0; i < 4; i++) {
                try {
                    a[] aVarArr = e;
                    if (aVarArr[i] == null) {
                        aVarArr[i] = aVar;
                        break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return arrayList;
    }

    public final boo f(a aVar) {
        aVar.getClass();
        List<coo> list = this.f18016a;
        if (list == null) {
            return null;
        }
        Iterator<coo> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(aVar.f);
        }
        return null;
    }

    public final a g() {
        synchronized (e) {
            for (int i = 0; i < 4; i++) {
                try {
                    a[] aVarArr = e;
                    a aVar = aVarArr[i];
                    if (aVar != null) {
                        aVarArr[i] = null;
                        return aVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return new a();
        }
    }
}
