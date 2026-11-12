package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rb implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f89520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f89521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z3.e f89522d;

    public /* synthetic */ rb(h4.r rVar, float f14, z3.e eVar, int i14, int i15) {
        this.f89519a = i15;
        this.f89520b = rVar;
        this.f89521c = f14;
        this.f89522d = eVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f89519a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                vb.c(this.f89520b, this.f89521c, this.f89522d, mVar, p3.p0.t(385));
                break;
            case 1:
                bi.a(this.f89520b, this.f89521c, this.f89522d, mVar, p3.p0.t(433));
                break;
            default:
                r21.f.a(this.f89520b, this.f89521c, this.f89522d, mVar, p3.p0.t(385));
                break;
        }
        return Unit.INSTANCE;
    }
}
