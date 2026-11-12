package ew1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66636a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f66637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f66638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f66639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f66640e;

    public /* synthetic */ o1(q1 q1Var, boolean z14, int i14, int i15, int i16) {
        this.f66640e = q1Var;
        this.f66637b = z14;
        this.f66638c = i14;
        this.f66639d = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f66636a;
        int i15 = this.f66639d;
        boolean z14 = this.f66637b;
        int i16 = this.f66638c;
        Object obj3 = this.f66640e;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                q1.a aVar = q1.f66677f;
                int iT = p3.p0.t(1);
                ((q1) obj3).A6(this.f66637b, this.f66638c, this.f66639d, (p3.m) obj, iT);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ic1.i.a aVar2 = ic1.i.f92620g;
                ((ic1.i) obj3).g(p3.p0.t(i16 | 1), i15, (p3.m) obj, z14);
                break;
            default:
                ((Integer) obj2).getClass();
                t21.m0.b((h4.r) obj3, i16, z14, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ o1(h4.r rVar, int i14, boolean z14, int i15) {
        this.f66640e = rVar;
        this.f66638c = i14;
        this.f66637b = z14;
        this.f66639d = i15;
    }

    public /* synthetic */ o1(ic1.i iVar, boolean z14, int i14, int i15) {
        this.f66640e = iVar;
        this.f66637b = z14;
        this.f66638c = i14;
        this.f66639d = i15;
    }
}
