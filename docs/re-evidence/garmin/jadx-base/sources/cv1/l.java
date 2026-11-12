package cv1;

import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f55901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f55902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z3.e f55903d;

    public /* synthetic */ l(r rVar, String str, z3.e eVar, int i14, int i15) {
        this.f55900a = i15;
        this.f55901b = rVar;
        this.f55902c = str;
        this.f55903d = eVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f55900a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                m.b(this.f55901b, this.f55902c, this.f55903d, mVar, p0.t(385));
                break;
            default:
                m.a(this.f55901b, this.f55902c, this.f55903d, mVar, p0.t(385));
                break;
        }
        return Unit.INSTANCE;
    }
}
