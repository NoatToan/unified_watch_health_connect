package l4;

import o4.q0;
import p005kotlin.Metadata;
import p1.b1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll4/t;", "Lo4/q0;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p1.q0<r4.c> f109870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q0 f109871b;

    @Override // o4.q0
    public final r4.c a() {
        q0 q0Var = this.f109871b;
        if (q0Var == null) {
            e5.a.b("GraphicsContext not provided");
        }
        r4.c cVarA = q0Var.a();
        p1.q0<r4.c> q0Var2 = this.f109870a;
        if (q0Var2 != null) {
            q0Var2.g(cVarA);
            return cVarA;
        }
        Object[] objArr = b1.f134677a;
        p1.q0<r4.c> q0Var3 = new p1.q0<>(1);
        q0Var3.g(cVarA);
        this.f109870a = q0Var3;
        return cVarA;
    }

    @Override // o4.q0
    public final void b(r4.c cVar) {
        q0 q0Var = this.f109871b;
        if (q0Var != null) {
            q0Var.b(cVar);
        }
    }

    public final void c() {
        p1.q0<r4.c> q0Var = this.f109870a;
        if (q0Var != null) {
            Object[] objArr = q0Var.f134667a;
            int i14 = q0Var.f134668b;
            for (int i15 = 0; i15 < i14; i15++) {
                b((r4.c) objArr[i15]);
            }
            q0Var.j();
        }
    }
}
