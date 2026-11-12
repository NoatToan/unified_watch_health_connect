package ht1;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85581a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f85582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f85583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f85584d;

    public /* synthetic */ s(int i14, e23.l lVar, h4.r rVar) {
        this.f85582b = rVar;
        this.f85583c = lVar;
        this.f85584d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (this.f85581a) {
            case 0:
                num.getClass();
                w.h(this.f85584d, p0.t(1), this.f85583c, this.f85582b, mVar);
                break;
            default:
                num.intValue();
                u1.n.b(this.f85582b, this.f85583c, mVar, p0.t(this.f85584d | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ s(h4.r rVar, int i14, e23.l lVar, int i15) {
        this.f85582b = rVar;
        this.f85584d = i14;
        this.f85583c = lVar;
    }
}
