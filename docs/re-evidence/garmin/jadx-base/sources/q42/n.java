package q42;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f142664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f142665c;

    public /* synthetic */ n(p pVar, int i14, int i15) {
        this.f142663a = i15;
        this.f142664b = pVar;
        this.f142665c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f142663a;
        int i15 = this.f142665c;
        p pVar = this.f142664b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i16 = p.f142668f;
        switch (i14) {
            case 0:
                pVar.h(mVar, p0.t(i15 | 1));
                break;
            case 1:
                pVar.i(mVar, p0.t(i15 | 1));
                break;
            case 2:
                pVar.j(mVar, p0.t(i15 | 1));
                break;
            case 3:
                pVar.l(mVar, p0.t(i15 | 1));
                break;
            default:
                pVar.g(mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
