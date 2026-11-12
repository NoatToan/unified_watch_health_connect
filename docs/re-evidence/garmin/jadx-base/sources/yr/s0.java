package yr;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xg0.a f198899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wg0.a f198900c;

    public /* synthetic */ s0(wg0.a aVar, xg0.a aVar2) {
        this.f198898a = 2;
        this.f198900c = aVar;
        this.f198899b = aVar2;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f198898a) {
            case 0:
                this.f198899b.J0(this.f198900c);
                break;
            case 1:
                this.f198899b.Y1(this.f198900c);
                break;
            case 2:
                wg0.a aVar = this.f198900c;
                wg0.a aVarD = wg0.a.d(aVar);
                wg0.m mVar = aVarD.f185060t;
                String strF = aVar.f();
                if (mVar != null) {
                    mVar.d();
                }
                xg0.a aVar2 = this.f198899b;
                if (strF == null || mVar == null || !mVar.f185113f) {
                    aVar2.G1(aVarD);
                } else {
                    aVar2.r1(aVarD, strF);
                }
                break;
            default:
                this.f198899b.p2(this.f198900c);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ s0(xg0.a aVar, wg0.a aVar2, int i14) {
        this.f198898a = i14;
        this.f198899b = aVar;
        this.f198900c = aVar2;
    }
}
