package cv0;

import e23.l;
import p005kotlin.Unit;
import p3.p1;
import pv0.s;
import x5.l0;
import z80.k;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f55836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f55837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f55838d;

    public /* synthetic */ a(e23.a aVar, l lVar, p1 p1Var) {
        this.f55835a = 4;
        this.f55837c = aVar;
        this.f55836b = lVar;
        this.f55838d = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f55835a;
        p1 p1Var = this.f55838d;
        e23.a aVar = this.f55837c;
        l lVar = this.f55836b;
        switch (i14) {
            case 0:
                lVar.invoke((ge2.b) p1Var.getF182175a());
                aVar.invoke();
                break;
            case 1:
                lVar.invoke((ge2.b) p1Var.getF182175a());
                aVar.invoke();
                break;
            case 2:
                k kVar = (k) p1Var.getF182175a();
                if (kVar != null) {
                    lVar.invoke(kVar);
                    Unit unit = Unit.INSTANCE;
                    aVar.invoke();
                }
                break;
            case 3:
                s sVar = (s) p1Var.getF182175a();
                if (sVar != null) {
                    lVar.invoke(sVar);
                }
                p1Var.setValue(null);
                aVar.invoke();
                break;
            case 4:
                aVar.invoke();
                Unit unit2 = Unit.INSTANCE;
                lVar.invoke((String) p1Var.getF182175a());
                break;
            case 5:
                Long l14 = (Long) p1Var.getF182175a();
                if (l14 != null) {
                    lVar.invoke(Long.valueOf(l14.longValue()));
                }
                aVar.invoke();
                break;
            case 6:
                dy1.d dVar = (dy1.d) p1Var.getF182175a();
                if (dVar != null) {
                    lVar.invoke(dVar);
                }
                aVar.invoke();
                break;
            default:
                lVar.invoke(((l0) p1Var.getF182175a()).f188878a.f157138b);
                aVar.invoke();
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(e23.a aVar, p1 p1Var, l lVar, int i14) {
        this.f55835a = i14;
        this.f55837c = aVar;
        this.f55838d = p1Var;
        this.f55836b = lVar;
    }

    public /* synthetic */ a(l lVar, e23.a aVar, p1 p1Var, int i14) {
        this.f55835a = i14;
        this.f55836b = lVar;
        this.f55837c = aVar;
        this.f55838d = p1Var;
    }

    public /* synthetic */ a(p1 p1Var, e23.a aVar, l lVar) {
        this.f55835a = 6;
        this.f55838d = p1Var;
        this.f55837c = aVar;
        this.f55836b = lVar;
    }

    public /* synthetic */ a(p1 p1Var, l lVar, e23.a aVar) {
        this.f55835a = 2;
        this.f55838d = p1Var;
        this.f55836b = lVar;
        this.f55837c = aVar;
    }
}
