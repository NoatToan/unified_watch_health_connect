package o62;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f129747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f129748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f129749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f129750e;

    public /* synthetic */ p0(j jVar, e23.l lVar, e23.l lVar2, int i14, int i15) {
        this.f129746a = i15;
        this.f129747b = jVar;
        this.f129748c = lVar;
        this.f129749d = lVar2;
        this.f129750e = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f129746a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                q0.c(this.f129747b, this.f129748c, this.f129749d, mVar, p3.p0.t(this.f129750e | 1));
                break;
            default:
                q0.b(this.f129747b, this.f129748c, this.f129749d, mVar, p3.p0.t(this.f129750e | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
