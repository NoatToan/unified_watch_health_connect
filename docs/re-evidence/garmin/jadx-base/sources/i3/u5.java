package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u5 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89877a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f89878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f89879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f89880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f89881e;

    public /* synthetic */ u5(h4.r rVar, float f14, long j8, int i14, int i15) {
        this.f89878b = rVar;
        this.f89880d = f14;
        this.f89879c = j8;
        this.f89881e = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f89877a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(1);
                v5.b(this.f89880d, iT, this.f89881e, this.f89879c, this.f89878b, (p3.m) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                l72.i0.b(this.f89878b, this.f89879c, this.f89880d, (p3.m) obj, p3.p0.t(this.f89881e | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ u5(h4.r rVar, long j8, float f14, int i14) {
        this.f89878b = rVar;
        this.f89879c = j8;
        this.f89880d = f14;
        this.f89881e = i14;
    }
}
