package z41;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o51.f f202341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f202342c;

    public /* synthetic */ e(o51.f fVar, e23.l lVar, int i14, int i15) {
        this.f202340a = i15;
        this.f202341b = fVar;
        this.f202342c = lVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f202340a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                f.a(this.f202341b, this.f202342c, mVar, p0.t(1));
                break;
            case 1:
                g.a(this.f202341b, this.f202342c, mVar, p0.t(1));
                break;
            default:
                l.a(this.f202341b, this.f202342c, mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
