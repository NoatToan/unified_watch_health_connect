package z23;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import t23.l1;
import t23.m1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 extends x implements o33.c, o33.p, o33.n {
    public abstract Member H();

    /* JADX WARN: Code duplicated, block: B:45:0x00e6  */
    public final ArrayList I(Type[] typeArr, Annotation[][] annotationArr, boolean z14) throws IllegalAccessException, InvocationTargetException {
        Method method;
        ArrayList arrayList;
        String str;
        boolean z15;
        c.a aVar;
        ArrayList arrayList2 = new ArrayList(typeArr.length);
        c cVar = c.f202031a;
        Member memberH = H();
        cVar.getClass();
        memberH.getClass();
        c.a aVar2 = c.f202032b;
        if (aVar2 == null) {
            synchronized (cVar) {
                aVar2 = c.f202032b;
                if (aVar2 == null) {
                    Class<?> cls = memberH.getClass();
                    try {
                        aVar = new c.a(cls.getMethod("getParameters", null), f.d(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
                    } catch (NoSuchMethodException unused) {
                        aVar = new c.a(null, null);
                    }
                    c.f202032b = aVar;
                    aVar2 = aVar;
                }
            }
        }
        Method method2 = aVar2.f202033a;
        if (method2 == null || (method = aVar2.f202034b) == null) {
            arrayList = null;
        } else {
            Object objInvoke = method2.invoke(memberH, null);
            objInvoke.getClass();
            Object[] objArr = (Object[]) objInvoke;
            arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                Object objInvoke2 = method.invoke(obj, null);
                objInvoke2.getClass();
                arrayList.add((String) objInvoke2);
            }
        }
        int size = arrayList != null ? arrayList.size() - typeArr.length : 0;
        int length = typeArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            g0.a aVar3 = g0.f202047a;
            Type type = typeArr[i14];
            aVar3.getClass();
            g0 g0VarA = g0.a.a(type);
            if (arrayList != null) {
                str = (String) p13.h0.e0(i14 + size, arrayList);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i14 + '+' + size + " (name=" + getName() + " type=" + g0VarA + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            if (z14) {
                z15 = true;
                if (i14 != typeArr.length - 1) {
                    z15 = false;
                }
            } else {
                z15 = false;
            }
            arrayList2.add(new i0(g0VarA, annotationArr[i14], str, z15));
        }
        return arrayList2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b0) && p005kotlin.jvm.internal.s.g(H(), ((b0) obj).H());
    }

    @Override // o33.c
    public final Collection getAnnotations() {
        Member memberH = H();
        memberH.getClass();
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberH).getDeclaredAnnotations();
        return declaredAnnotations != null ? w5.r.i(declaredAnnotations) : p13.j0.f134944a;
    }

    @Override // o33.q
    public final x33.f getName() {
        String name = H().getName();
        return name != null ? x33.f.e(name) : x33.h.f188610b;
    }

    @Override // o33.p
    public final m1 getVisibility() {
        int modifiers = H().getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return l1.h.f162038c;
        }
        if (Modifier.isPrivate(modifiers)) {
            return l1.e.f162035c;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? x23.c.f188543c : x23.b.f188542c;
        }
        return x23.a.f188541c;
    }

    public final int hashCode() {
        return H().hashCode();
    }

    @Override // o33.p
    public final boolean isAbstract() {
        return Modifier.isAbstract(H().getModifiers());
    }

    @Override // o33.p
    public final boolean isFinal() {
        return Modifier.isFinal(H().getModifiers());
    }

    @Override // o33.p
    public final boolean isStatic() {
        return Modifier.isStatic(H().getModifiers());
    }

    public final String toString() {
        return getClass().getName() + ": " + H();
    }

    @Override // o33.n
    public final t w() {
        Class<?> declaringClass = H().getDeclaringClass();
        declaringClass.getClass();
        return new t(declaringClass);
    }

    @Override // o33.c
    public final o33.a z(x33.c cVar) {
        cVar.getClass();
        Member memberH = H();
        memberH.getClass();
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberH).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return w5.r.g(declaredAnnotations, cVar);
        }
        return null;
    }
}
