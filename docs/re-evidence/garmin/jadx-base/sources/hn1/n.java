package hn1;

import e23.p;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mm1.a f84542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f84543c;

    public /* synthetic */ n(mm1.a aVar, int i14, int i15) {
        this.f84541a = i15;
        this.f84542b = aVar;
        this.f84543c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f84541a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                o.a(this.f84542b, mVar, p0.t(this.f84543c | 1));
                break;
            default:
                rn1.f.a(this.f84542b, mVar, p0.t(this.f84543c | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
