package aq;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i2 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12005a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f12007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f12008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12009e;

    public /* synthetic */ i2(double d14, boolean z14, e23.l lVar, e23.a aVar, int i14) {
        this.f12008d = d14;
        this.f12006b = z14;
        this.f12007c = lVar;
        this.f12009e = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12005a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(1);
                k2.a(this.f12008d, this.f12006b, this.f12007c, (e23.a) this.f12009e, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p3.p0.t(1);
                ep.k.b((h4.r) this.f12009e, this.f12006b, this.f12007c, this.f12008d, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ i2(h4.r rVar, boolean z14, e23.l lVar, double d14, int i14) {
        this.f12009e = rVar;
        this.f12006b = z14;
        this.f12007c = lVar;
        this.f12008d = d14;
    }
}
