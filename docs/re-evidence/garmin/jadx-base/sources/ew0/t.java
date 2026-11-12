package ew0;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class t implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f66278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f66279c;

    public /* synthetic */ t(i53.c cVar, int i14, int i15) {
        this.f66277a = i15;
        this.f66278b = cVar;
        this.f66279c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f66277a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                c0.e(this.f66278b, mVar, p0.t(this.f66279c | 1));
                break;
            default:
                sn0.e.a(this.f66278b, mVar, p0.t(this.f66279c | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
