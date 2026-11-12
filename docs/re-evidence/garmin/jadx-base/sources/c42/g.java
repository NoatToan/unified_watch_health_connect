package c42;

import android.content.Intent;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c.q f24394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f24395c;

    public /* synthetic */ g(c.q qVar, p1 p1Var, int i14) {
        this.f24393a = i14;
        this.f24394b = qVar;
        this.f24395c = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        String str;
        int i14 = this.f24393a;
        p1 p1Var = this.f24395c;
        c.q qVar = this.f24394b;
        switch (i14) {
            case 0:
                p1Var.setValue(Boolean.FALSE);
                qVar.a(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), null);
                break;
            case 1:
                p1Var.setValue(Boolean.FALSE);
                qVar.a(j22.a.f96717f.f96735b, null);
                break;
            case 2:
                p1Var.setValue(Boolean.FALSE);
                qVar.a("android.permission.ACCESS_FINE_LOCATION", null);
                break;
            case 3:
                p1Var.setValue(Boolean.FALSE);
                qVar.a("android.permission.ACCESS_FINE_LOCATION", null);
                break;
            case 4:
                ot1.u uVar = ot1.u.f133824a;
                pt1.p pVar = ((pt1.o) p1Var.getF182175a()).f140912j;
                if (pVar != null) {
                    qVar.a(pVar, null);
                }
                break;
            case 5:
                ot1.u uVar2 = ot1.u.f133824a;
                pt1.p pVar2 = ((pt1.o) p1Var.getF182175a()).f140912j;
                if (pVar2 != null && (str = pVar2.f140950v) != null) {
                    qVar.a(str, null);
                }
                break;
            case 6:
                p1Var.setValue(Boolean.FALSE);
                qVar.a("android.permission.WRITE_EXTERNAL_STORAGE", null);
                break;
            default:
                s70.s.d("showBluetoothPermissionDeniedDialog: positive button clicked");
                p1Var.setValue(Boolean.FALSE);
                j22.b bVar = j22.b.f96736a;
                j22.g gVar = j22.g.f96759d;
                bVar.getClass();
                j22.b.v(qVar, gVar);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(p1 p1Var, c.q qVar, int i14) {
        this.f24393a = i14;
        this.f24395c = p1Var;
        this.f24394b = qVar;
    }
}
