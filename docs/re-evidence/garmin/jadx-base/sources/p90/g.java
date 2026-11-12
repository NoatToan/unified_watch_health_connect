package p90;

import p005kotlin.Unit;
import p005kotlin.jvm.internal.o0;
import q53.t;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f136509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f136510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l90.b f136511d;

    public /* synthetic */ g(o0 o0Var, t tVar, l90.b bVar, int i14) {
        this.f136508a = i14;
        this.f136509b = o0Var;
        this.f136510c = tVar;
        this.f136511d = bVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f136508a) {
            case 0:
                o0 o0Var = this.f136509b;
                e.a(o0Var, this.f136510c, this.f136511d, o0Var.f105806a, false, 112);
                break;
            default:
                o0 o0Var2 = this.f136509b;
                e.a(o0Var2, this.f136510c, this.f136511d, o0Var2.f105806a, false, 112);
                break;
        }
        return Unit.INSTANCE;
    }
}
