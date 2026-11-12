package lo;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f113925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f113926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f113927d;

    public /* synthetic */ o(boolean z14, boolean z15, p3.l1 l1Var) {
        this.f113924a = 1;
        this.f113925b = z14;
        this.f113926c = z15;
        this.f113927d = l1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f113924a) {
            case 0:
                t tVar = (t) this.f113927d;
                f0 f0Var = tVar.f113949a;
                double dDoubleValue = ((Double) obj).doubleValue();
                c22.l3.f23124b.getClass();
                boolean z14 = this.f113925b;
                f0Var.h1(c22.l3.a.R1(dDoubleValue, z14), z14, this.f113926c);
                tVar.w6();
                break;
            case 1:
                ((p3.l1) this.f113927d).u(t21.j1.c(true, this.f113925b, this.f113926c, ((Double) obj).doubleValue()));
                break;
            default:
                p5.k0 k0Var = (p5.k0) obj;
                long jA = ((z2.p) this.f113927d).a();
                k0Var.a(z2.x0.f201843c, new z2.w0(this.f113925b ? p006l2.l1.SelectionStart : p006l2.l1.SelectionEnd, jA, this.f113926c ? z2.v0.Left : z2.v0.Right, (9223372034707292159L & jA) != 9205357640488583168L, null));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ o(Object obj, boolean z14, boolean z15, int i14) {
        this.f113924a = i14;
        this.f113927d = obj;
        this.f113925b = z14;
        this.f113926c = z15;
    }
}
