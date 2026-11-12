package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "", "<init>", "()V", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r0 f8000a = new r0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f8001b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f8002c = new HashMap();

    private r0() {
    }

    public static x a(Constructor constructor, m0 m0Var) {
        try {
            Object objNewInstance = constructor.newInstance(m0Var);
            objNewInstance.getClass();
            return (x) objNewInstance;
        } catch (IllegalAccessException e4) {
            o2.c.p(e4);
            return null;
        } catch (InstantiationException e14) {
            o2.c.p(e14);
            return null;
        } catch (InvocationTargetException e15) {
            o2.c.p(e15);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0106  */
    /* JADX WARN: Code duplicated, block: B:66:0x0112  */
    /* JADX WARN: Code duplicated, block: B:69:0x0116  */
    /* JADX WARN: Code duplicated, block: B:72:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0122  */
    /* JADX WARN: Code duplicated, block: B:77:0x0138  */
    /* JADX WARN: Code duplicated, block: B:86:0x013d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0133 A[SYNTHETIC] */
    public static int b(Class cls) {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        Class<?>[] interfaces;
        int i14;
        boolean z14;
        HashMap map = f8001b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i15 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r14 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r14 != null ? r14.getName() : "";
                name.getClass();
                if (name.length() != 0) {
                    canonicalName.getClass();
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                canonicalName.getClass();
                String strConcat = d53.u.v(canonicalName, ".", "_", false).concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e4) {
                o2.c.p(e4);
                return 0;
            }
            HashMap map2 = f8002c;
            if (declaredConstructor != null) {
                map2.put(cls, p13.w.c(declaredConstructor));
            } else {
                f fVar = f.f7885c;
                HashMap map3 = fVar.f7887b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i16 = 0;
                        while (true) {
                            if (i16 >= length) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((a1) declaredMethods[i16].getAnnotation(a1.class)) != null) {
                                fVar.a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i16++;
                        }
                    } catch (NoClassDefFoundError e14) {
                        n23.j.w("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e14);
                        return 0;
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && m0.class.isAssignableFrom(superclass)) {
                        superclass.getClass();
                        if (b(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            obj.getClass();
                            arrayList = new ArrayList((Collection) obj);
                            interfaces = cls.getInterfaces();
                            interfaces.getClass();
                            for (Class<?> cls2 : interfaces) {
                                if (cls2 == null && m0.class.isAssignableFrom(cls2)) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (!z14) {
                                    cls2.getClass();
                                    if (b(cls2) == 1) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(cls2);
                                        obj2.getClass();
                                        arrayList.addAll((Collection) obj2);
                                    }
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        }
                    } else {
                        interfaces = cls.getInterfaces();
                        interfaces.getClass();
                        while (i14 < r8) {
                            if (cls2 == null) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            if (!z14) {
                                cls2.getClass();
                                if (b(cls2) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj3 = map2.get(cls2);
                                    obj3.getClass();
                                    arrayList.addAll((Collection) obj3);
                                }
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                }
            }
            i15 = 2;
        }
        map.put(cls, Integer.valueOf(i15));
        return i15;
    }
}
