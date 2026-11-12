package h21;

import p005kotlin.Unit;
import p13.h0;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i21.d f81088b;

    public /* synthetic */ h(i21.d dVar, int i14) {
        this.f81087a = i14;
        this.f81088b = dVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        i21.c cVar;
        g21.t tVar;
        switch (this.f81087a) {
            case 0:
                this.f81088b.L4((g21.v) obj);
                break;
            case 1:
                this.f81088b.O4(((Integer) obj).intValue());
                break;
            case 2:
                g21.l lVar = (g21.l) obj;
                lVar.getClass();
                this.f81088b.M4(lVar);
                break;
            case 3:
                g21.r rVar = (g21.r) obj;
                rVar.getClass();
                this.f81088b.N4(rVar);
                break;
            case 4:
                g21.l lVar2 = (g21.l) obj;
                lVar2.getClass();
                this.f81088b.M4(lVar2);
                break;
            case 5:
                int iIntValue = ((Integer) obj).intValue();
                p2 p2Var = this.f81088b.f87285q;
                do {
                    value = p2Var.getValue();
                    cVar = (i21.c) value;
                    tVar = (g21.t) h0.e0(iIntValue, cVar.f87250e);
                    if (tVar == null) {
                        tVar = g21.t.MACRONUTRIENTS;
                    }
                } while (!p2Var.b(value, i21.c.a(cVar, null, null, tVar, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, 4194299)));
                break;
            case 6:
                this.f81088b.L4((g21.v) obj);
                break;
            case 7:
                this.f81088b.O4(((Integer) obj).intValue());
                break;
            case 8:
                g21.l lVar3 = (g21.l) obj;
                lVar3.getClass();
                this.f81088b.M4(lVar3);
                break;
            case 9:
                g21.r rVar2 = (g21.r) obj;
                rVar2.getClass();
                this.f81088b.N4(rVar2);
                break;
            default:
                g21.l lVar4 = (g21.l) obj;
                lVar4.getClass();
                this.f81088b.M4(lVar4);
                break;
        }
        return Unit.INSTANCE;
    }
}
