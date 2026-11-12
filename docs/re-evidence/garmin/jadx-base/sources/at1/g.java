package at1;

import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12774a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f12775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f12776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f12777d;

    public /* synthetic */ g(e23.l lVar, long j8, p1 p1Var) {
        this.f12775b = lVar;
        this.f12776c = j8;
        this.f12777d = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f12774a) {
            case 0:
                this.f12777d.setValue(Boolean.FALSE);
                this.f12775b.invoke(Long.valueOf(this.f12776c));
                break;
            default:
                this.f12777d.setValue(null);
                this.f12775b.invoke(Long.valueOf(this.f12776c));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(p1 p1Var, e23.l lVar, long j8) {
        this.f12777d = p1Var;
        this.f12775b = lVar;
        this.f12776c = j8;
    }
}
