package h82;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f82450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p f82451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f82452d;

    public /* synthetic */ g(r rVar, e23.p pVar, int i14, int i15) {
        this.f82449a = i15;
        this.f82450b = rVar;
        this.f82451c = pVar;
        this.f82452d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f82449a;
        int i15 = this.f82452d;
        e23.p<? super p3.m, ? super Integer, Unit> pVar = this.f82451c;
        r rVar = this.f82450b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        r rVar2 = r.f82497a;
        switch (i14) {
            case 0:
                rVar.g(pVar, mVar, p0.t(i15 | 1));
                break;
            case 1:
                rVar.j(pVar, mVar, p0.t(i15 | 1));
                break;
            default:
                rVar.k(pVar, mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
