package h82;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f82472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f82473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f82474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f82475e;

    public /* synthetic */ l(r rVar, String str, e23.a aVar, int i14, int i15) {
        this.f82471a = i15;
        this.f82472b = rVar;
        this.f82473c = str;
        this.f82474d = aVar;
        this.f82475e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f82471a;
        int i15 = this.f82475e;
        e23.a aVar = this.f82474d;
        String str = this.f82473c;
        r rVar = this.f82472b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        r rVar2 = r.f82497a;
        switch (i14) {
            case 0:
                rVar.h(p0.t(i15 | 1), aVar, str, mVar);
                break;
            default:
                rVar.u(p0.t(i15 | 1), aVar, str, mVar);
                break;
        }
        return Unit.INSTANCE;
    }
}
