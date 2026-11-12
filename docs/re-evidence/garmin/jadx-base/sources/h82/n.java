package h82;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f82480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f82481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f82482d;

    public /* synthetic */ n(r rVar, String str, int i14, int i15) {
        this.f82479a = i15;
        this.f82480b = rVar;
        this.f82481c = str;
        this.f82482d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f82479a;
        int i15 = this.f82482d;
        String str = this.f82481c;
        r rVar = this.f82480b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        r rVar2 = r.f82497a;
        switch (i14) {
            case 0:
                rVar.q(str, mVar, p0.t(i15 | 1));
                break;
            default:
                rVar.E(str, mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
