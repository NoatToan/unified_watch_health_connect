package k11;

import androidx.lifecycle.v1;
import l72.i3;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l11.a f102196b;

    public /* synthetic */ g(l11.a aVar, int i14) {
        this.f102195a = i14;
        this.f102196b = aVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f102195a) {
            case 0:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var.f111063a, "ADD_FOOD")) {
                    l11.a aVar = this.f102196b;
                    aVar.getClass();
                    ge1.b.T(v1.a(aVar), null, null, new l11.e(aVar, null), 3);
                }
                break;
            case 1:
                b11.l lVar = (b11.l) obj;
                lVar.getClass();
                l11.a aVar2 = this.f102196b;
                aVar2.getClass();
                p2 p2Var = aVar2.f108064m;
                l11.a.b bVar = (l11.a.b) p2Var.getValue();
                if (bVar != null) {
                    aVar2.f108066o.k(null, lVar);
                    p2Var.k(null, l11.a.b.a(bVar, null, null, false, 31));
                }
                break;
            case 2:
                b63.v vVar = (b63.v) obj;
                vVar.getClass();
                l11.a aVar3 = this.f102196b;
                aVar3.getClass();
                p2 p2Var2 = aVar3.f108064m;
                l11.a.b bVar2 = (l11.a.b) p2Var2.getValue();
                if (bVar2 != null) {
                    b11.i.a aVarI = b11.i.a.i(bVar2.f108075a, vVar, 0.0d, false, 0L, null, null, null, 1019);
                    if (aVar3.f108053b.f14338a) {
                        p2Var2.k(null, l11.a.b.a(bVar2, aVarI, null, false, 62));
                        aVar3.f108066o.setValue(zf.b.L(bVar2.f108078d, true, vVar, null, aVar3.f108062k.a()));
                    } else {
                        p2Var2.k(null, l11.a.b.a(bVar2, aVarI, null, false, 62));
                    }
                }
                break;
            case 3:
                this.f102196b.x4(((Boolean) obj).booleanValue());
                break;
            case 4:
                this.f102196b.x4(((Boolean) obj).booleanValue());
                break;
            default:
                this.f102196b.x4(((Boolean) obj).booleanValue());
                break;
        }
        return Unit.INSTANCE;
    }
}
