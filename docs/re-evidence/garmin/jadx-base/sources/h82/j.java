package h82;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f82464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f82465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f82466d;

    public /* synthetic */ j(r rVar, int i14, int i15, int i16) {
        this.f82463a = i16;
        this.f82464b = rVar;
        this.f82465c = i14;
        this.f82466d = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f82463a;
        int i15 = this.f82466d;
        int i16 = this.f82465c;
        r rVar = this.f82464b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        r rVar2 = r.f82497a;
        switch (i14) {
            case 0:
                rVar.A(i16, mVar, p0.t(i15 | 1));
                break;
            case 1:
                rVar.t(i16, mVar, p0.t(i15 | 1));
                break;
            default:
                rVar.D(i16, mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
