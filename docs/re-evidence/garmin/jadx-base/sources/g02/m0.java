package g02;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74484a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f74485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f74486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f74487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f74488e;

    public /* synthetic */ m0(long j8, String str, float f14, String str2, int i14) {
        this.f74486c = j8;
        this.f74487d = str;
        this.f74485b = f14;
        this.f74488e = str2;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f74484a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(1);
                n0.a(this.f74486c, (String) this.f74487d, this.f74485b, (String) this.f74488e, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p3.p0.t(57);
                me1.i.c((a10.a) this.f74487d, this.f74485b, (s5.x0) this.f74488e, this.f74486c, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ m0(a10.a aVar, float f14, s5.x0 x0Var, long j8, int i14) {
        this.f74487d = aVar;
        this.f74485b = f14;
        this.f74488e = x0Var;
        this.f74486c = j8;
    }
}
