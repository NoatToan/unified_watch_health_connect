package p4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f135595b;

    public /* synthetic */ n(q qVar, int i14) {
        this.f135594a = i14;
        this.f135595b = qVar;
    }

    @Override // p4.i
    public final double a(double d14) {
        switch (this.f135594a) {
            case 0:
                q qVar = this.f135595b;
                return j23.t.c(qVar.f135609k.a(d14), qVar.f135603e, qVar.f135604f);
            default:
                q qVar2 = this.f135595b;
                return qVar2.f135612n.a(j23.t.c(d14, qVar2.f135603e, qVar2.f135604f));
        }
    }
}
