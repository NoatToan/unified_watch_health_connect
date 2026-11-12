package defpackage;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes3.dex */
public class doo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f15747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadMode f15748b;
    public final Class<?> c;
    public final int d;
    public final boolean e;
    public String f;

    public doo(Method method, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.f15747a = method;
        this.f15748b = threadMode;
        this.c = cls;
        this.d = i;
        this.e = z;
    }

    public final synchronized void a() {
        if (this.f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f15747a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f15747a.getName());
            sb.append('(');
            sb.append(this.c.getName());
            this.f = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof doo)) {
            return false;
        }
        a();
        doo dooVar = (doo) obj;
        dooVar.a();
        return this.f.equals(dooVar.f);
    }

    public int hashCode() {
        return this.f15747a.hashCode();
    }
}
