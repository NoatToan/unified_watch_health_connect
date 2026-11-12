package h82;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f82484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f82485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f82486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f82487e;

    public /* synthetic */ o(r rVar, int i14, e23.a aVar, int i15, int i16) {
        this.f82483a = i16;
        this.f82484b = rVar;
        this.f82485c = i14;
        this.f82486d = aVar;
        this.f82487e = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f82483a;
        int i15 = this.f82487e;
        e23.a aVar = this.f82486d;
        int i16 = this.f82485c;
        r rVar = this.f82484b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        r rVar2 = r.f82497a;
        switch (i14) {
            case 0:
                rVar.v(aVar, i16, mVar, p0.t(i15 | 1));
                break;
            default:
                rVar.i(aVar, i16, mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
