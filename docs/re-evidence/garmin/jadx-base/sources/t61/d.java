package t61;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f162739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f162740c;

    public /* synthetic */ d(e eVar, int i14, int i15) {
        this.f162738a = i15;
        this.f162739b = eVar;
        this.f162740c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f162738a;
        int i15 = this.f162740c;
        e eVar = this.f162739b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i16 = e.f162741f;
        switch (i14) {
            case 0:
                eVar.g(mVar, p0.t(i15 | 1));
                break;
            case 1:
                eVar.j(mVar, p0.t(i15 | 1));
                break;
            case 2:
                eVar.h(mVar, p0.t(i15 | 1));
                break;
            default:
                eVar.i(mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
