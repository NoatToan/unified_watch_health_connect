package l73;

import j20.x;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.EventBusException;

/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f111461d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a[] f111462e = new a[4];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<n73.b> f111463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f111464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f111465c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f111466a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap f111467b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HashMap f111468c = new HashMap();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final StringBuilder f111469d = new StringBuilder(128);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Class<?> f111470e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f111471f;

        public final boolean a(Class cls, Method method) {
            StringBuilder sb3 = this.f111469d;
            sb3.setLength(0);
            sb3.append(method.getName());
            sb3.append('>');
            sb3.append(cls.getName());
            String string = sb3.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            HashMap map = this.f111468c;
            Class cls2 = (Class) map.put(string, declaringClass);
            if (cls2 == null || cls2.isAssignableFrom(declaringClass)) {
                return true;
            }
            map.put(string, cls2);
            return false;
        }

        public final void b() {
            if (this.f111471f) {
                this.f111470e = null;
                return;
            }
            Class<? super Object> superclass = this.f111470e.getSuperclass();
            this.f111470e = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.") || name.startsWith("androidx.")) {
                this.f111470e = null;
            }
        }
    }

    public n(List<n73.b> list, boolean z14, boolean z15) {
        this.f111463a = list;
        this.f111464b = z14;
        this.f111465c = z15;
    }

    public static ArrayList b(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f111466a);
        aVar.f111466a.clear();
        aVar.f111467b.clear();
        aVar.f111468c.clear();
        aVar.f111469d.setLength(0);
        aVar.f111470e = null;
        aVar.f111471f = false;
        synchronized (f111462e) {
            for (int i14 = 0; i14 < 4; i14++) {
                try {
                    a[] aVarArr = f111462e;
                    if (aVarArr[i14] == null) {
                        aVarArr[i14] = aVar;
                        break;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return arrayList;
    }

    public static a c() {
        synchronized (f111462e) {
            for (int i14 = 0; i14 < 4; i14++) {
                try {
                    a[] aVarArr = f111462e;
                    a aVar = aVarArr[i14];
                    if (aVar != null) {
                        aVarArr[i14] = null;
                        return aVar;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return new a();
        }
    }

    public final void a(a aVar) {
        Method[] methods;
        boolean zA;
        try {
            try {
                methods = aVar.f111470e.getDeclaredMethods();
            } catch (LinkageError e4) {
                String strConcat = "Could not inspect methods of ".concat(aVar.f111470e.getName());
                throw new EventBusException(this.f111465c ? strConcat.concat(". Please consider using EventBus annotation processor to avoid reflection.") : strConcat.concat(". Please make this class visible to EventBus annotation processor to avoid reflection."), e4);
            }
        } catch (Throwable unused) {
            methods = aVar.f111470e.getMethods();
            aVar.f111471f = true;
        }
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            int i14 = modifiers & 1;
            boolean z14 = this.f111464b;
            if (i14 != 0 && (modifiers & 5192) == 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    k kVar = (k) method.getAnnotation(k.class);
                    if (kVar == null) {
                        continue;
                    } else {
                        Class<?> cls = parameterTypes[0];
                        HashMap map = aVar.f111467b;
                        Object objPut = map.put(cls, method);
                        if (objPut == null) {
                            zA = true;
                        } else {
                            if (objPut instanceof Method) {
                                if (!aVar.a(cls, (Method) objPut)) {
                                    x.h();
                                    return;
                                }
                                map.put(cls, aVar);
                            }
                            zA = aVar.a(cls, method);
                        }
                        if (zA) {
                            aVar.f111466a.add(new m(method, cls, kVar.threadMode(), kVar.priority(), kVar.sticky()));
                        }
                    }
                } else if (z14 && method.isAnnotationPresent(k.class)) {
                    StringBuilder sbL = hb.a.l("@Subscribe method ", method.getDeclaringClass().getName() + "." + method.getName(), "must have exactly 1 parameter but has ");
                    sbL.append(parameterTypes.length);
                    throw new EventBusException(sbL.toString());
                }
            } else if (z14 && method.isAnnotationPresent(k.class)) {
                throw new EventBusException((method.getDeclaringClass().getName() + "." + method.getName()).concat(" is a illegal @Subscribe method: must be public, non-static, and non-abstract"));
            }
        }
    }
}
