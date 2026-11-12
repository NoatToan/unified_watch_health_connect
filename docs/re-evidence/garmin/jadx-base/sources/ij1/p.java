package ij1;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f93888b;

    public /* synthetic */ p(r rVar, int i14, int i15) {
        this.f93887a = i15;
        this.f93888b = rVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f93887a;
        r rVar = this.f93888b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i15 = r.f93892k;
        switch (i14) {
            case 0:
                rVar.g(mVar, p0.t(1));
                break;
            default:
                rVar.h(mVar, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }
}
