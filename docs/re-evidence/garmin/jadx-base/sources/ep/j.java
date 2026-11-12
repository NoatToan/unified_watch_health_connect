package ep;

import c22.j0;
import java.util.ArrayList;
import m92.h0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Unit;
import p13.y;
import r53.p2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f64827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f64828b;

    public /* synthetic */ j(o oVar, int i14) {
        this.f64827a = i14;
        this.f64828b = oVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        n nVar;
        e eVar;
        i53.c cVarE;
        ArrayList arrayList;
        Object value2;
        Object value3;
        switch (this.f64827a) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.f64828b.y4(c.ALL);
                break;
            case 1:
                ((Boolean) obj).booleanValue();
                this.f64828b.y4(c.LAST_4_WEEKS);
                break;
            case 2:
                ((Boolean) obj).booleanValue();
                this.f64828b.y4(c.LAST_3_MONTHS);
                break;
            case 3:
                ((Boolean) obj).booleanValue();
                this.f64828b.y4(c.LAST_12_MONTHS);
                break;
            case 4:
                ((Boolean) obj).booleanValue();
                this.f64828b.y4(c.CUSTOM);
                break;
            case 5:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                p2 p2Var = this.f64828b.f64850i;
                if (zBooleanValue != ((n) p2Var.getValue()).f64839b && ((n) p2Var.getValue()).f64838a > 0.0d) {
                    do {
                        value = p2Var.getValue();
                        nVar = (n) value;
                        double d14 = zBooleanValue ? 1.0d / nVar.f64838a : nVar.f64838a;
                        e eVar2 = nVar.f64841d;
                        eVar = nVar.f64841d;
                        i53.c<h0.e.a> cVar = eVar2.f64812a;
                        ArrayList arrayList2 = new ArrayList(y.r(cVar, 10));
                        for (h0.e.a aVar : cVar) {
                            arrayList2.add(h0.e.a.a(aVar, 0.0f, (float) (((double) aVar.f117347b) * d14), 1));
                        }
                        cVarE = i53.a.e(arrayList2);
                        i53.c<b> cVar2 = eVar.f64813b;
                        arrayList = new ArrayList(y.r(cVar2, 10));
                        for (b bVar : cVar2) {
                            h0.e.a aVar2 = bVar.f64801a;
                            arrayList.add(new b(h0.e.a.a(aVar2, 0.0f, (float) (((double) aVar2.f117347b) * d14), 1), bVar.f64802b, bVar.f64803c, bVar.f64804d, bVar.f64805e));
                        }
                    } while (!p2Var.b(value, n.a(nVar, zBooleanValue, null, e.a(eVar, cVarE, i53.a.e(arrayList), 12), 5)));
                }
                break;
            case 6:
                long jLongValue = ((Long) obj).longValue();
                o oVar = this.f64828b;
                oVar.getClass();
                String strB = j0.b(new DateTime(jLongValue), "MMM d, yyyy", DateTimeZone.getDefault());
                if (strB == null) {
                    strB = "";
                }
                p2 p2Var2 = oVar.f64844c;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, strB));
                oVar.f64843b.h(strB);
                break;
            default:
                long jLongValue2 = ((Long) obj).longValue();
                o oVar2 = this.f64828b;
                oVar2.getClass();
                String strB2 = j0.b(new DateTime(jLongValue2), "MMM d, yyyy", DateTimeZone.getDefault());
                if (strB2 == null) {
                    strB2 = "";
                }
                p2 p2Var3 = oVar2.f64846e;
                do {
                    value3 = p2Var3.getValue();
                } while (!p2Var3.b(value3, strB2));
                oVar2.f64843b.j(strB2);
                break;
        }
        return Unit.INSTANCE;
    }
}
