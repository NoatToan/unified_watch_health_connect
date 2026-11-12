package androidx.core.view;

import android.annotation.SuppressLint;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f6558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<s> f6559b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f6560c = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.lifecycle.b0 f6561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.lifecycle.k0 f6562b;

        public a(androidx.lifecycle.b0 b0Var, androidx.lifecycle.k0 k0Var) {
            this.f6561a = b0Var;
            this.f6562b = k0Var;
            b0Var.a(k0Var);
        }
    }

    public r(Runnable runnable) {
        this.f6558a = runnable;
    }

    public final void a(s sVar, androidx.lifecycle.n0 n0Var) {
        this.f6559b.add(sVar);
        this.f6558a.run();
        androidx.lifecycle.b0 f158016a = n0Var.getF158016a();
        HashMap map = this.f6560c;
        a aVar = (a) map.remove(sVar);
        if (aVar != null) {
            aVar.f6561a.d(aVar.f6562b);
            aVar.f6562b = null;
        }
        map.put(sVar, new a(f158016a, new q(0, this, sVar)));
    }

    @SuppressLint({"LambdaLast"})
    public final void b(s sVar, androidx.lifecycle.n0 n0Var, androidx.lifecycle.b0.b bVar) {
        androidx.lifecycle.b0 f158016a = n0Var.getF158016a();
        HashMap map = this.f6560c;
        a aVar = (a) map.remove(sVar);
        if (aVar != null) {
            aVar.f6561a.d(aVar.f6562b);
            aVar.f6562b = null;
        }
        map.put(sVar, new a(f158016a, new p(this, bVar, sVar, 0)));
    }

    public final void c(s sVar) {
        this.f6559b.remove(sVar);
        a aVar = (a) this.f6560c.remove(sVar);
        if (aVar != null) {
            aVar.f6561a.d(aVar.f6562b);
            aVar.f6562b = null;
        }
        this.f6558a.run();
    }
}
