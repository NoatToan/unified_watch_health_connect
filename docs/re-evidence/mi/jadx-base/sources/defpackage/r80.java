package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes6.dex */
public class r80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Field f32303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Method f32304b;
    public Method c;
    public int d;
    public Class<?> e;
    public Type f;
    public String g;

    public r80(Class<?> cls, Field field, cl9 cl9Var) {
        this.g = field.getName();
        int modifiers = field.getModifiers();
        if ((modifiers & 136) > 0) {
            return;
        }
        if ((modifiers & 1) > 0) {
            this.f32303a = field;
        }
        try {
            this.f32304b = cls.getDeclaredMethod(sb.e(field.getName()), field.getType());
        } catch (Exception unused) {
        }
        boolean zEquals = field.getType().equals(Boolean.TYPE);
        try {
            this.c = cls.getDeclaredMethod(zEquals ? sb.d(field.getName()) : sb.c(field.getName()), new Class[0]);
        } catch (Exception unused2) {
        }
        if (this.c == null && zEquals) {
            try {
                this.c = cls.getDeclaredMethod(sb.c(field.getName()), new Class[0]);
            } catch (Exception unused3) {
            }
        }
        if (this.f32303a == null && this.c == null && this.f32304b == null) {
            return;
        }
        Method method = this.c;
        if (method != null && !cl9Var.a(field, method)) {
            this.c = null;
        }
        Method method2 = this.f32304b;
        if (method2 != null && !cl9Var.a(field, method2)) {
            this.f32304b = null;
        }
        if (this.c == null && this.f32304b == null && this.f32303a == null) {
            return;
        }
        this.e = field.getType();
        this.f = field.getGenericType();
    }

    public int a() {
        return this.d;
    }

    public String b() {
        return this.g;
    }

    public Class<?> c() {
        return this.e;
    }

    public boolean d() {
        return this.e.isEnum();
    }

    public boolean e() {
        return this.f32304b == null && this.c == null;
    }

    public boolean f() {
        return (this.f32303a == null && this.c == null) ? false : true;
    }

    public boolean g() {
        return (this.f32303a == null && this.c == null && this.f32304b == null) ? false : true;
    }

    public boolean h() {
        return (this.f32303a == null && this.c == null) ? false : true;
    }
}
