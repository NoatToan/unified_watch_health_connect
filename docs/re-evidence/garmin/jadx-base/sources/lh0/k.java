package lh0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f112418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z3.e f112419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f112420d;

    public /* synthetic */ k(h4.r rVar, z3.e eVar, int i14, int i15) {
        this.f112417a = i15;
        this.f112418b = rVar;
        this.f112419c = eVar;
        this.f112420d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f112417a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                n.f(this.f112418b, this.f112419c, mVar, p0.t(this.f112420d | 1));
                break;
            case 1:
                q2.g.a(this.f112418b, this.f112419c, mVar, p0.t(this.f112420d | 1));
                break;
            case 2:
                q2.g.b(this.f112418b, this.f112419c, mVar, p0.t(this.f112420d | 1));
                break;
            case 3:
                q2.j.d(this.f112418b, this.f112419c, mVar, p0.t(this.f112420d | 1));
                break;
            case 4:
                q2.m.b(this.f112418b, this.f112419c, mVar, p0.t(this.f112420d | 1));
                break;
            default:
                q2.m.a(this.f112418b, this.f112419c, mVar, p0.t(this.f112420d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
