package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g7 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f88194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f88195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h4.r f88196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f88197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j7 f88198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o4.r1 f88199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z3.e f88200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88201i;

    public /* synthetic */ g7(boolean z14, e23.l lVar, h4.r rVar, boolean z15, j7 j7Var, o4.r1 r1Var, z3.e eVar, int i14, int i15) {
        this.f88193a = i15;
        this.f88194b = z14;
        this.f88195c = lVar;
        this.f88196d = rVar;
        this.f88197e = z15;
        this.f88198f = j7Var;
        this.f88199g = r1Var;
        this.f88200h = eVar;
        this.f88201i = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f88193a) {
            case 0:
                ((Integer) obj2).getClass();
                h7.c(this.f88194b, this.f88195c, this.f88196d, this.f88197e, this.f88198f, this.f88199g, this.f88200h, (p3.m) obj, p3.p0.t(this.f88201i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                h7.d(this.f88194b, this.f88195c, this.f88196d, this.f88197e, this.f88198f, this.f88199g, this.f88200h, (p3.m) obj, p3.p0.t(this.f88201i | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
