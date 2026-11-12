package w9;

import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lw9/f;", "", "Landroidx/lifecycle/y1;", "store", "Landroidx/lifecycle/x1$c;", "factory", "Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultExtras", "<init>", "(Landroidx/lifecycle/y1;Landroidx/lifecycle/x1$c;Landroidx/lifecycle/viewmodel/CreationExtras;)V", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1 f183572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1.c f183573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreationExtras f183574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f183575d;

    public f(y1 y1Var, x1.c cVar, CreationExtras creationExtras) {
        y1Var.getClass();
        cVar.getClass();
        creationExtras.getClass();
        this.f183572a = y1Var;
        this.f183573b = cVar;
        this.f183574c = creationExtras;
        this.f183575d = new d();
    }

    public final u1 a(String str, k23.d dVar) {
        u1 u1Var;
        u1 u1VarCreate;
        dVar.getClass();
        synchronized (this.f183575d) {
            try {
                u1Var = (u1) this.f183572a.f8080a.get(str);
                if (dVar.q(u1Var)) {
                    Object obj = this.f183573b;
                    if (obj instanceof x1.e) {
                        u1Var.getClass();
                        ((x1.e) obj).a(u1Var);
                    }
                    u1Var.getClass();
                } else {
                    androidx.lifecycle.viewmodel.a aVar = new androidx.lifecycle.viewmodel.a(this.f183574c);
                    aVar.b(x1.f8071c, str);
                    x1.c cVar = this.f183573b;
                    try {
                        try {
                            u1VarCreate = cVar.create((k23.d<u1>) dVar, aVar);
                        } catch (AbstractMethodError unused) {
                            u1VarCreate = cVar.create(dh.b.u(dVar));
                        }
                    } catch (AbstractMethodError unused2) {
                        u1VarCreate = cVar.create((Class<u1>) dh.b.u(dVar), aVar);
                    }
                    u1Var = u1VarCreate;
                    y1 y1Var = this.f183572a;
                    u1Var.getClass();
                    u1 u1Var2 = (u1) y1Var.f8080a.put(str, u1Var);
                    if (u1Var2 != null) {
                        u1Var2.clear$lifecycle_viewmodel();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return u1Var;
    }
}
