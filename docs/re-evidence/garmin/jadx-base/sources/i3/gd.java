package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gd implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88232a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f88233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f88234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h4.r f88235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f88236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j23.f f88237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f88238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ uc f88239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.a f88240i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f88241j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f88242k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f88243l;

    public /* synthetic */ gd(float f14, e23.l lVar, h4.r rVar, boolean z14, j23.f fVar, int i14, e23.a aVar, uc ucVar, a2.j jVar, int i15, int i16) {
        this.f88233b = f14;
        this.f88234c = lVar;
        this.f88235d = rVar;
        this.f88236e = z14;
        this.f88237f = fVar;
        this.f88238g = i14;
        this.f88240i = aVar;
        this.f88239h = ucVar;
        this.f88243l = jVar;
        this.f88241j = i15;
        this.f88242k = i16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f88232a;
        int i15 = this.f88241j;
        Object obj3 = this.f88243l;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(i15 | 1);
                kd.e(this.f88233b, this.f88234c, this.f88235d, this.f88236e, this.f88237f, this.f88238g, this.f88240i, this.f88239h, (a2.j) obj3, (p3.m) obj, iT, this.f88242k);
                break;
            default:
                ((Integer) obj2).getClass();
                l72.c3 c3Var = l72.c3.f110949a;
                int iT2 = p3.p0.t(i15 | 1);
                ((l72.c3) obj3).a(this.f88233b, this.f88234c, this.f88235d, this.f88236e, this.f88237f, this.f88238g, this.f88239h, this.f88240i, (p3.m) obj, iT2, this.f88242k);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ gd(l72.c3 c3Var, float f14, e23.l lVar, h4.r rVar, boolean z14, j23.f fVar, int i14, uc ucVar, e23.a aVar, int i15, int i16) {
        this.f88243l = c3Var;
        this.f88233b = f14;
        this.f88234c = lVar;
        this.f88235d = rVar;
        this.f88236e = z14;
        this.f88237f = fVar;
        this.f88238g = i14;
        this.f88239h = ucVar;
        this.f88240i = aVar;
        this.f88241j = i15;
        this.f88242k = i16;
    }
}
