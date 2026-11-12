package pq1;

import b63.o;
import e23.l;
import g22.k;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yq1.e f139580b;

    public /* synthetic */ g(yq1.e eVar, int i14) {
        this.f139579a = i14;
        this.f139580b = eVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        switch (this.f139579a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                yq1.e eVar = this.f139580b;
                p2 p2Var = eVar.f198806g;
                boolean z14 = ((yq1.d) p2Var.getValue()).f198795e;
                sq1.b bVar = eVar.f198803d;
                if (z14) {
                    bVar.e();
                } else {
                    bVar.d();
                }
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, yq1.d.a((yq1.d) value, null, null, null, false, false, zBooleanValue, false, false, 479)));
                break;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                p2 p2Var2 = this.f139580b.f198806g;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, yq1.d.a((yq1.d) value2, null, null, null, zBooleanValue2, false, false, false, false, 503)));
                break;
            case 2:
                DateTime dateTime = (DateTime) obj;
                dateTime.getClass();
                o oVarB = k.z(dateTime).b();
                yq1.e eVar2 = this.f139580b;
                eVar2.getClass();
                eVar2.f198807h.i(new o82.a(oVarB, null, 2, null), true);
                break;
            case 3:
                yd1.b bVar2 = (yd1.b) obj;
                bVar2.getClass();
                this.f139580b.A4(bVar2);
                break;
            default:
                yd1.b bVar3 = (yd1.b) obj;
                bVar3.getClass();
                this.f139580b.A4(bVar3);
                break;
        }
        return Unit.INSTANCE;
    }
}
