package defpackage;

import cn.hutool.core.bean.BeanException;
import cn.hutool.core.util.ModifierUtil;
import java.beans.Transient;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public class fdi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f17679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Method f17680b;
    public Method c;

    public fdi(Field field, Method method, Method method2) {
        this.f17679a = field;
        this.f17680b = i04.w(method);
        this.c = i04.w(method2);
    }

    public final Class<?> a(Method method, Method method2) {
        Class<?> clsK = method != null ? i5q.k(method) : null;
        return (clsK != null || method2 == null) ? clsK : i5q.f(method2);
    }

    public final Type b(Method method, Method method2) {
        Type typeL = method != null ? i5q.l(method) : null;
        return (typeL != null || method2 == null) ? typeL : i5q.i(method2, 0);
    }

    public Field c() {
        return this.f17679a;
    }

    public Class<?> d() {
        Field field = this.f17679a;
        return field != null ? i5q.d(field) : a(this.f17680b, this.c);
    }

    public String e() {
        return bbk.f(this.f17679a);
    }

    public Type f() {
        Field field = this.f17679a;
        return field != null ? i5q.m(field) : b(this.f17680b, this.c);
    }

    public Method g() {
        return this.f17680b;
    }

    public Method h() {
        return this.c;
    }

    public Object i(Object obj) {
        Method method = this.f17680b;
        if (method != null) {
            return bbk.q(obj, method, new Object[0]);
        }
        if (ModifierUtil.c(this.f17679a)) {
            return bbk.h(obj, this.f17679a);
        }
        return null;
    }

    public Object j(Object obj, Type type, boolean z) {
        Object objI;
        Object objF;
        try {
            objI = i(obj);
        } catch (Exception e) {
            if (!z) {
                throw new BeanException(e, "Get value of [{}] error!", e());
            }
            objI = null;
        }
        return (objI == null || type == null || (objF = yj4.f(type, objI, null, z)) == null) ? objI : objF;
    }

    public final boolean k() {
        return id1.b(this.f17679a, hdi.class) || id1.b(this.f17680b, hdi.class);
    }

    public final boolean l() {
        return id1.b(this.f17679a, hdi.class) || id1.b(this.c, hdi.class);
    }

    public boolean m(boolean z) {
        if (this.f17680b == null && !ModifierUtil.c(this.f17679a)) {
            return false;
        }
        if (z && n()) {
            return false;
        }
        return !k();
    }

    public final boolean n() {
        Method method;
        Field field = this.f17679a;
        ModifierUtil.ModifierType modifierType = ModifierUtil.ModifierType.TRANSIENT;
        boolean zA = ModifierUtil.a(field, modifierType);
        if (zA || (method = this.f17680b) == null) {
            return zA;
        }
        boolean zB = ModifierUtil.b(method, modifierType);
        return !zB ? id1.b(this.f17680b, Transient.class) : zB;
    }

    public final boolean o() {
        Method method;
        Field field = this.f17679a;
        ModifierUtil.ModifierType modifierType = ModifierUtil.ModifierType.TRANSIENT;
        boolean zA = ModifierUtil.a(field, modifierType);
        if (zA || (method = this.c) == null) {
            return zA;
        }
        boolean zB = ModifierUtil.b(method, modifierType);
        return !zB ? id1.b(this.c, Transient.class) : zB;
    }

    public boolean p(boolean z) {
        if (this.c == null && !ModifierUtil.c(this.f17679a)) {
            return false;
        }
        if (z && o()) {
            return false;
        }
        return !l();
    }

    public fdi q(Object obj, Object obj2) {
        Method method = this.c;
        if (method != null) {
            bbk.q(obj, method, obj2);
        } else if (ModifierUtil.c(this.f17679a)) {
            bbk.x(obj, this.f17679a, obj2);
        }
        return this;
    }

    public fdi r(Object obj, Object obj2, boolean z, boolean z2) throws Exception {
        if (z && obj2 == null) {
            return this;
        }
        if (obj2 != null) {
            Class<?> clsD = d();
            if (!clsD.isInstance(obj2)) {
                obj2 = yj4.f(clsD, obj2, null, z2);
            }
        }
        if (obj2 != null || !z) {
            try {
                q(obj, obj2);
            } catch (Exception e) {
                if (!z2) {
                    throw new BeanException(e, "Set value of [{}] error!", e());
                }
            }
        }
        return this;
    }
}
