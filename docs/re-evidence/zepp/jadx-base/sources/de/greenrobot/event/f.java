package de.greenrobot.event;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes22.dex */
final class f {
    public final Method a;
    public final ThreadMode b;
    public final Class<?> c;
    public String d;

    public f(Method method, ThreadMode threadMode, Class<?> cls) {
        this.a = method;
        this.b = threadMode;
        this.c = cls;
    }

    private synchronized void a() {
        if (this.d == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.a.getName());
            sb.append('(');
            sb.append(this.c.getName());
            this.d = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        a();
        f fVar = (f) obj;
        fVar.a();
        return this.d.equals(fVar.d);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
