package z23;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p005kotlin.jvm.internal.w0;
import t23.l1;
import t23.m1;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends x implements o33.c, o33.p, o33.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f202070a;

    public t(Class<?> cls) {
        cls.getClass();
        this.f202070a = cls;
    }

    @Override // o33.f
    public final boolean A() {
        return this.f202070a.isEnum();
    }

    @Override // o33.f
    public final boolean B() throws IllegalAccessException, InvocationTargetException {
        b.f202025a.getClass();
        Boolean boolB = b.b(this.f202070a);
        if (boolB != null) {
            return boolB.booleanValue();
        }
        return false;
    }

    @Override // o33.f
    public final List E() {
        Field[] declaredFields = this.f202070a.getDeclaredFields();
        declaredFields.getClass();
        return c53.c0.s(c53.c0.o(c53.c0.i(p13.u.v(declaredFields), q.f202067a), r.f202068a));
    }

    @Override // o33.f
    public final Collection<o33.i> b() {
        Class<?> cls = this.f202070a;
        if (p005kotlin.jvm.internal.s.g(cls, Object.class)) {
            return p13.j0.f134944a;
        }
        w0 w0Var = new w0(2);
        Type genericSuperclass = cls.getGenericSuperclass();
        w0Var.a(genericSuperclass != null ? genericSuperclass : Object.class);
        w0Var.b(cls.getGenericInterfaces());
        ArrayList<Object> arrayList = w0Var.f105816a;
        List listK = p13.x.k(arrayList.toArray(new Type[arrayList.size()]));
        ArrayList arrayList2 = new ArrayList(p13.y.r(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList2.add(new v((Type) it.next()));
        }
        return arrayList2;
    }

    @Override // o33.f
    public final x33.c c() {
        return f.a(this.f202070a).a();
    }

    @Override // o33.f
    public final List e() {
        Method[] declaredMethods = this.f202070a.getDeclaredMethods();
        declaredMethods.getClass();
        return c53.c0.s(c53.c0.o(c53.c0.h(p13.u.v(declaredMethods), new n(this)), s.f202069a));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return p005kotlin.jvm.internal.s.g(this.f202070a, ((t) obj).f202070a);
        }
        return false;
    }

    @Override // o33.c
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class<?> cls = this.f202070a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? p13.j0.f134944a : w5.r.i(declaredAnnotations);
    }

    @Override // o33.q
    public final x33.f getName() {
        Class<?> cls = this.f202070a;
        return cls.isAnonymousClass() ? x33.f.e(d53.w.e0(cls.getName(), ".")) : x33.f.e(cls.getSimpleName());
    }

    @Override // o33.v
    public final ArrayList getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.f202070a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new h0(typeVariable));
        }
        return arrayList;
    }

    @Override // o33.p
    public final m1 getVisibility() {
        int modifiers = this.f202070a.getModifiers();
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
        return this.f202070a.hashCode();
    }

    @Override // o33.p
    public final boolean isAbstract() {
        return Modifier.isAbstract(this.f202070a.getModifiers());
    }

    @Override // o33.p
    public final boolean isFinal() {
        return Modifier.isFinal(this.f202070a.getModifiers());
    }

    @Override // o33.p
    public final boolean isStatic() {
        return Modifier.isStatic(this.f202070a.getModifiers());
    }

    @Override // o33.f
    public final t k() {
        Class<?> declaringClass = this.f202070a.getDeclaringClass();
        if (declaringClass != null) {
            return new t(declaringClass);
        }
        return null;
    }

    @Override // o33.f
    public final List m() {
        Class<?>[] declaredClasses = this.f202070a.getDeclaredClasses();
        declaredClasses.getClass();
        return c53.c0.s(c53.c0.p(c53.c0.i(p13.u.v(declaredClasses), l.f202062a), m.f202063a));
    }

    @Override // o33.f
    public final boolean n() {
        return this.f202070a.isInterface();
    }

    @Override // o33.f
    public final List p() {
        Constructor<?>[] declaredConstructors = this.f202070a.getDeclaredConstructors();
        declaredConstructors.getClass();
        return c53.c0.s(c53.c0.o(c53.c0.i(p13.u.v(declaredConstructors), o.f202065a), p.f202066a));
    }

    @Override // o33.f
    public final boolean q() {
        return this.f202070a.isAnnotation();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        androidx.core.view.j.o(t.class, sb3, ": ");
        sb3.append(this.f202070a);
        return sb3.toString();
    }

    @Override // o33.f
    public final ArrayList v() {
        b.f202025a.getClass();
        Class<?> cls = this.f202070a;
        cls.getClass();
        Method method = b.a().f202030d;
        Object[] objArr = method != null ? (Object[]) method.invoke(cls, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new f0(obj));
        }
        return arrayList;
    }

    @Override // o33.f
    public final boolean x() throws IllegalAccessException, InvocationTargetException {
        b.f202025a.getClass();
        Class<?> cls = this.f202070a;
        cls.getClass();
        Method method = b.a().f202029c;
        Boolean bool = null;
        if (method != null) {
            Object objInvoke = method.invoke(cls, null);
            objInvoke.getClass();
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // o33.c
    public final o33.a z(x33.c cVar) {
        Annotation[] declaredAnnotations;
        cVar.getClass();
        Class<?> cls = this.f202070a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return w5.r.g(declaredAnnotations, cVar);
    }
}
