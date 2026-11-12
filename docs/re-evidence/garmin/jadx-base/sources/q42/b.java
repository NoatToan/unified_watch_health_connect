package q42;

import androidx.lifecycle.v1;
import l72.i3;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f142600b;

    public /* synthetic */ b(i iVar, int i14) {
        this.f142599a = i14;
        this.f142600b = iVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        double d14;
        zk0.e eVar;
        int i14 = this.f142599a;
        i iVar = this.f142600b;
        switch (i14) {
            case 0:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                if (p005kotlin.jvm.internal.s.g(i3Var.f111063a, "MENU_ITEM_SAVE_ID")) {
                    int i15 = i.f142646f;
                    String string = new fz0.c(null, g22.l.d(b63.o.INSTANCE), 1, null).toString();
                    iVar.getClass();
                    ge1.b.T(v1.a(iVar), null, null, new l(iVar, string, null), 3);
                }
                break;
            default:
                double dDoubleValue = ((Double) obj).doubleValue() * ((double) 1000);
                p2 p2Var = iVar.f142650d;
                while (true) {
                    Object value = p2Var.getValue();
                    zk0.e eVar2 = (zk0.e) value;
                    if (eVar2 != null) {
                        eVar = zk0.e.b(eVar2, dDoubleValue);
                        d14 = dDoubleValue;
                    } else {
                        d14 = dDoubleValue;
                        eVar = new zk0.e(0L, 0L, null, null, null, null, null, d14, null, null, 0L, null, 3967, null);
                    }
                    if (!p2Var.b(value, eVar)) {
                        dDoubleValue = d14;
                    }
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
