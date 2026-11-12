package gw0;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f79740b;

    public /* synthetic */ p(u uVar, int i14) {
        this.f79739a = i14;
        this.f79740b = uVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f79739a) {
            case 0:
                pv0.r rVar = (pv0.r) obj;
                rVar.getClass();
                this.f79740b.D4(rVar);
                break;
            case 1:
                b63.o oVar = (b63.o) obj;
                oVar.getClass();
                this.f79740b.C4(oVar);
                break;
            case 2:
                b63.o oVar2 = (b63.o) obj;
                oVar2.getClass();
                this.f79740b.C4(oVar2);
                break;
            default:
                pv0.r rVar2 = (pv0.r) obj;
                rVar2.getClass();
                this.f79740b.D4(rVar2);
                break;
        }
        return Unit.INSTANCE;
    }
}
