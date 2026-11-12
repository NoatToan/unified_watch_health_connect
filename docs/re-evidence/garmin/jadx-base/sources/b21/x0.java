package b21;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class x0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc.v f15373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lc.m0 f15374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z3.e f15375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15376e;

    public /* synthetic */ x0(lc.v vVar, lc.m0 m0Var, z3.e eVar, int i14, int i15) {
        this.f15372a = i15;
        this.f15373b = vVar;
        this.f15374c = m0Var;
        this.f15375d = eVar;
        this.f15376e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f15372a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                d1.a(this.f15373b, this.f15374c, this.f15375d, mVar, p3.p0.t(this.f15376e | 1));
                break;
            case 1:
                e5.a(this.f15373b, this.f15374c, this.f15375d, mVar, p3.p0.t(this.f15376e | 1));
                break;
            default:
                q8.a(this.f15373b, this.f15374c, this.f15375d, mVar, p3.p0.t(this.f15376e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
