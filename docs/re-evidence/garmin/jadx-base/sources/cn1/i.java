package cn1;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f28016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qm1.k f28017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28018d;

    public /* synthetic */ i(h4.r rVar, qm1.k kVar, int i14, int i15) {
        this.f28015a = i15;
        this.f28016b = rVar;
        this.f28017c = kVar;
        this.f28018d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f28015a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                k.b(this.f28016b, this.f28017c, mVar, p0.t(this.f28018d | 1));
                break;
            default:
                v.a(this.f28016b, this.f28017c, mVar, p0.t(this.f28018d | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
