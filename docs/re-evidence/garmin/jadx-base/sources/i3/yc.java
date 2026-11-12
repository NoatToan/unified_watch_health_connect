package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yc implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f90444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f90445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f90446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f90447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f90448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f90449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f90450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f90451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e23.p f90452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e23.q f90453j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f90454k;

    public /* synthetic */ yc(float f14, Object obj, long j8, long j14, long j15, long j16, float f15, float f16, e23.p pVar, e23.q qVar, int i14) {
        this.f90444a = i14;
        this.f90445b = f14;
        this.f90454k = obj;
        this.f90446c = j8;
        this.f90447d = j14;
        this.f90448e = j15;
        this.f90449f = j16;
        this.f90450g = f15;
        this.f90451h = f16;
        this.f90452i = pVar;
        this.f90453j = qVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        float fS0;
        int i14 = this.f90444a;
        Object obj2 = this.f90454k;
        float f14 = this.f90445b;
        switch (i14) {
            case 0:
                cb cbVar = (cb) obj2;
                q4.f fVar = (q4.f) obj;
                dd ddVar = dd.f87874a;
                g6.f.f75994b.getClass();
                float fIntBitsToFloat = g6.f.c(f14, g6.f.f75996d) ? Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) / 2 : fVar.s0(f14);
                dd ddVar2 = dd.f87874a;
                float[] fArr = cbVar.f87746g;
                float fB = cbVar.b();
                float fA = cbVar.a();
                float fD1 = fVar.d1(cbVar.f87747h.getFloatValue());
                float fD2 = fVar.d1(cbVar.f87748i.getFloatValue());
                float fD3 = fVar.d1(cbVar.f87749j.getFloatValue());
                float fD4 = fVar.d1(cbVar.f87750k.getFloatValue());
                float fD5 = fVar.d1(fIntBitsToFloat);
                p008y1.b2 b2Var = p008y1.b2.Horizontal;
                ddVar2.getClass();
                dd.i(fVar, fArr, fB, fA, this.f90446c, this.f90447d, this.f90448e, this.f90449f, fD1, fD2, fD3, fD4, this.f90450g, this.f90451h, fD5, this.f90452i, this.f90453j, true, b2Var);
                break;
            default:
                ud udVar = (ud) obj2;
                q4.f fVar2 = (q4.f) obj;
                dd ddVar3 = dd.f87874a;
                g6.f.f75994b.getClass();
                if (g6.f.c(f14, g6.f.f75996d)) {
                    fS0 = (udVar.f89922m == p008y1.b2.Vertical ? Float.intBitsToFloat((int) (fVar2.b() >> 32)) : Float.intBitsToFloat((int) (fVar2.b() & 4294967295L))) / 2;
                } else {
                    fS0 = fVar2.s0(f14);
                }
                dd ddVar4 = dd.f87874a;
                float[] fArr2 = udVar.f89916g;
                float fC = udVar.c();
                float fC1 = fVar2.c1(0);
                float fC2 = fVar2.c1(0);
                float fC3 = fVar2.c1(udVar.f89920k.getIntValue());
                float fC4 = fVar2.c1(udVar.f89921l.getIntValue());
                float fD6 = fVar2.d1(fS0);
                p008y1.b2 b2Var2 = udVar.f89922m;
                ddVar4.getClass();
                dd.i(fVar2, fArr2, 0.0f, fC, this.f90446c, this.f90447d, this.f90448e, this.f90449f, fC1, fC2, fC3, fC4, this.f90450g, this.f90451h, fD6, this.f90452i, this.f90453j, false, b2Var2);
                break;
        }
        return Unit.INSTANCE;
    }
}
