package rr0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f154228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ir0.e f154229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f154230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f154231d;

    public /* synthetic */ n(ir0.e eVar, e23.l lVar, int i14, int i15) {
        this.f154228a = i15;
        this.f154229b = eVar;
        this.f154230c = lVar;
        this.f154231d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (this.f154228a) {
            case 0:
                num.getClass();
                q.d(this.f154229b, this.f154230c, mVar, p0.t(this.f154231d | 1));
                break;
            case 1:
                num.intValue();
                y.e(this.f154229b, this.f154230c, mVar, p0.t(this.f154231d | 1));
                break;
            default:
                num.intValue();
                y.a(this.f154229b, this.f154230c, mVar, p0.t(this.f154231d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
