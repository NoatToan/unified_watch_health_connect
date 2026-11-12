package y23;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p13.u;
import q33.x;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f194345a = new c();

    private c() {
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, o13.l] */
    public static d43.f a(Class cls) {
        int i14 = 0;
        while (cls.isArray()) {
            i14++;
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (!cls.isPrimitive()) {
            x33.b bVarA = z23.f.a(cls);
            s23.c cVar = s23.c.f156232a;
            x33.c cVarA = bVarA.a();
            cVar.getClass();
            cVarA.getClass();
            x33.b bVar = s23.c.f156240i.get(cVarA.f188596a);
            if (bVar != null) {
                bVarA = bVar;
            }
            return new d43.f(bVarA, i14);
        }
        if (cls.equals(Void.TYPE)) {
            x33.b.a aVar = x33.b.f188590d;
            x33.c cVarI = kotlin.reflect.jvm.internal.impl.builtins.f.a.f105875e.i();
            aVar.getClass();
            return new d43.f(x33.b.a.b(cVarI), i14);
        }
        q23.h hVarD = g43.d.b(cls.getName()).d();
        hVarD.getClass();
        if (i14 > 0) {
            x33.b.a aVar2 = x33.b.f188590d;
            x33.c cVar2 = (x33.c) hVarD.f142335d.getValue();
            aVar2.getClass();
            return new d43.f(x33.b.a.b(cVar2), i14 - 1);
        }
        x33.b.a aVar3 = x33.b.f188590d;
        x33.c cVar3 = (x33.c) hVarD.f142334c.getValue();
        aVar3.getClass();
        return new d43.f(x33.b.a.b(cVar3), i14);
    }

    public static void b(Class cls, x.c cVar) throws InvocationTargetException {
        cls.getClass();
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        declaredAnnotations.getClass();
        for (Annotation annotation : declaredAnnotations) {
            annotation.getClass();
            c(cVar, annotation);
        }
        cVar.a();
    }

    public static void c(x.c cVar, Annotation annotation) throws InvocationTargetException {
        Class clsU = dh.b.u(dh.b.s(annotation));
        x.a aVarB = cVar.b(z23.f.a(clsU), new b(annotation));
        if (aVarB != null) {
            f194345a.getClass();
            d(aVarB, annotation, clsU);
        }
    }

    public static void d(x.a aVar, Annotation annotation, Class cls) throws InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                objInvoke.getClass();
                x33.f fVarE = x33.f.e(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    aVar.e(fVarE, a((Class) objInvoke));
                } else if (g.f194352a.contains(enclosingClass)) {
                    aVar.c(fVarE, objInvoke);
                } else {
                    List<k23.d<? extends Object>> list = z23.f.f202041a;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        enclosingClass.getClass();
                        aVar.d(fVarE, z23.f.a(enclosingClass), x33.f.e(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        interfaces.getClass();
                        Class cls2 = (Class) u.V(interfaces);
                        cls2.getClass();
                        x.a aVarF = aVar.f(z23.f.a(cls2), fVarE);
                        if (aVarF != null) {
                            d(aVarF, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        x.b bVarB = aVar.b(fVarE);
                        if (bVarB != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                x33.b bVarA = z23.f.a(componentType);
                                for (Object obj : (Object[]) objInvoke) {
                                    obj.getClass();
                                    bVarB.b(bVarA, x33.f.e(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) objInvoke) {
                                    obj2.getClass();
                                    bVarB.e(a((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) objInvoke) {
                                    x.a aVarD = bVarB.d(z23.f.a(componentType));
                                    if (aVarD != null) {
                                        obj3.getClass();
                                        d(aVarD, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) objInvoke) {
                                    bVarB.c(obj4);
                                }
                            }
                            bVarB.a();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }
}
