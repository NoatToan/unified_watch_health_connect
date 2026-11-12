package defpackage;

import com.facebook.common.memory.PooledByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class s8o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f33411b = s8o.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<c93, o98> f33412a = new HashMap();

    public static s8o d() {
        return new s8o();
    }

    public void a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f33412a.values());
            this.f33412a.clear();
        }
        for (int i = 0; i < arrayList.size(); i++) {
            o98 o98Var = (o98) arrayList.get(i);
            if (o98Var != null) {
                o98Var.close();
            }
        }
    }

    public synchronized boolean b(c93 c93Var) {
        b6i.g(c93Var);
        if (!this.f33412a.containsKey(c93Var)) {
            return false;
        }
        o98 o98Var = this.f33412a.get(c93Var);
        synchronized (o98Var) {
            if (o98.O(o98Var)) {
                return true;
            }
            this.f33412a.remove(c93Var);
            cm8.A(f33411b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(o98Var)), c93Var.a(), Integer.valueOf(System.identityHashCode(c93Var)));
            return false;
        }
    }

    public synchronized o98 c(c93 c93Var) {
        b6i.g(c93Var);
        o98 o98VarB = this.f33412a.get(c93Var);
        if (o98VarB != null) {
            synchronized (o98VarB) {
                if (!o98.O(o98VarB)) {
                    this.f33412a.remove(c93Var);
                    cm8.A(f33411b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(o98VarB)), c93Var.a(), Integer.valueOf(System.identityHashCode(c93Var)));
                    return null;
                }
                o98VarB = o98.b(o98VarB);
            }
        }
        return o98VarB;
    }

    public final synchronized void e() {
        cm8.r(f33411b, "Count = %d", Integer.valueOf(this.f33412a.size()));
    }

    public synchronized void f(c93 c93Var, o98 o98Var) {
        b6i.g(c93Var);
        b6i.b(o98.O(o98Var));
        o98.c(this.f33412a.put(c93Var, o98.b(o98Var)));
        e();
    }

    public boolean g(c93 c93Var) {
        o98 o98VarRemove;
        b6i.g(c93Var);
        synchronized (this) {
            o98VarRemove = this.f33412a.remove(c93Var);
        }
        if (o98VarRemove == null) {
            return false;
        }
        try {
            return o98VarRemove.N();
        } finally {
            o98VarRemove.close();
        }
    }

    public synchronized boolean h(c93 c93Var, o98 o98Var) {
        b6i.g(c93Var);
        b6i.g(o98Var);
        b6i.b(o98.O(o98Var));
        o98 o98Var2 = this.f33412a.get(c93Var);
        if (o98Var2 == null) {
            return false;
        }
        w14<PooledByteBuffer> w14VarL = o98Var2.l();
        w14<PooledByteBuffer> w14VarL2 = o98Var.l();
        if (w14VarL != null && w14VarL2 != null) {
            try {
                if (w14VarL.n() == w14VarL2.n()) {
                    this.f33412a.remove(c93Var);
                    w14.l(w14VarL2);
                    w14.l(w14VarL);
                    o98.c(o98Var2);
                    e();
                    return true;
                }
            } catch (Throwable th) {
                w14.l(w14VarL2);
                w14.l(w14VarL);
                o98.c(o98Var2);
                throw th;
            }
        }
        w14.l(w14VarL2);
        w14.l(w14VarL);
        o98.c(o98Var2);
        return false;
    }
}
