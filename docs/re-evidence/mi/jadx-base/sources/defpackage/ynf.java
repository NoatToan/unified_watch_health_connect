package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class ynf {
    public static final Class<?>[] c = new Class[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<?>[] f40345b;

    public ynf(Method method) {
        this(method.getName(), method.getParameterTypes());
    }

    public int a() {
        return this.f40345b.length;
    }

    public String b() {
        return this.f40344a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != ynf.class) {
            return false;
        }
        ynf ynfVar = (ynf) obj;
        if (!this.f40344a.equals(ynfVar.f40344a)) {
            return false;
        }
        Class<?>[] clsArr = ynfVar.f40345b;
        int length = this.f40345b.length;
        if (clsArr.length != length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (clsArr[i] != this.f40345b[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f40344a.hashCode() + this.f40345b.length;
    }

    public String toString() {
        return this.f40344a + "(" + this.f40345b.length + "-args)";
    }

    public ynf(Constructor<?> constructor) {
        this("", constructor.getParameterTypes());
    }

    public ynf(String str, Class<?>[] clsArr) {
        this.f40344a = str;
        this.f40345b = clsArr == null ? c : clsArr;
    }
}
