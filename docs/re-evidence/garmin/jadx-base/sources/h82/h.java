package h82;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f82454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s5.c f82455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f82456d;

    public /* synthetic */ h(r rVar, s5.c cVar, int i14, int i15) {
        this.f82453a = i15;
        this.f82454b = rVar;
        this.f82455c = cVar;
        this.f82456d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f82453a;
        int i15 = this.f82456d;
        s5.c cVar = this.f82455c;
        r rVar = this.f82454b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        r rVar2 = r.f82497a;
        switch (i14) {
            case 0:
                rVar.F(cVar, mVar, p0.t(i15 | 1));
                break;
            default:
                rVar.r(cVar, mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
