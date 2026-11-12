package et1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zc.d f65845b;

    public /* synthetic */ s0(zc.d dVar, int i14) {
        this.f65844a = i14;
        this.f65845b = dVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f65844a;
        zc.d dVar = this.f65845b;
        switch (i14) {
            case 0:
                return Integer.valueOf(dVar.b());
            case 1:
                dVar.e();
                return Unit.INSTANCE;
            case 2:
                return dVar.d().f196385a;
            case 3:
                return dVar.d().f196385a;
            case 4:
                dVar.f();
                return Unit.INSTANCE;
            case 5:
                dVar.f();
                return Unit.INSTANCE;
            case 6:
                dVar.e();
                return Unit.INSTANCE;
            case 7:
                dVar.e();
                return Unit.INSTANCE;
            case 8:
                dVar.f();
                return Unit.INSTANCE;
            case 9:
                dVar.f();
                return Unit.INSTANCE;
            case 10:
                int i15 = tn.u.f165495e;
                dVar.e();
                return Unit.INSTANCE;
            default:
                dVar.e();
                return Unit.INSTANCE;
        }
    }
}
