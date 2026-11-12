package fo;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f72273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h4.r f72274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f72275d;

    public /* synthetic */ b0(i53.c cVar, h4.r rVar, e23.l lVar, int i14) {
        this.f72272a = 1;
        this.f72273b = cVar;
        this.f72274c = rVar;
        this.f72275d = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f72272a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                c0.a(p0.t(385), this.f72275d, this.f72274c, this.f72273b, mVar);
                break;
            case 1:
                ys1.e.a(p0.t(1), this.f72275d, this.f72274c, this.f72273b, mVar);
                break;
            default:
                z41.r.a(p0.t(1), this.f72275d, this.f72274c, this.f72273b, mVar);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ b0(i53.c cVar, e23.l lVar, h4.r rVar, int i14, int i15) {
        this.f72272a = i15;
        this.f72273b = cVar;
        this.f72275d = lVar;
        this.f72274c = rVar;
    }
}
