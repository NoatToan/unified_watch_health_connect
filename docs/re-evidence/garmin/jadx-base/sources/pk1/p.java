package pk1;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f138307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f138308c;

    public /* synthetic */ p(q qVar, int i14, int i15) {
        this.f138306a = i15;
        this.f138307b = qVar;
        this.f138308c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f138306a;
        int i15 = this.f138308c;
        q qVar = this.f138307b;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        int i16 = q.f138309f;
        switch (i14) {
            case 0:
                qVar.k(mVar, p0.t(i15 | 1));
                break;
            case 1:
                qVar.g(mVar, p0.t(i15 | 1));
                break;
            case 2:
                qVar.j(mVar, p0.t(i15 | 1));
                break;
            case 3:
                qVar.h(mVar, p0.t(i15 | 1));
                break;
            default:
                qVar.i(mVar, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
