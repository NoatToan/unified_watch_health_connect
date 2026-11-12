package ly0;

import androidx.lifecycle.v1;
import f5.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;
import p13.y;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f115289b;

    public /* synthetic */ d(o oVar, int i14) {
        this.f115288a = i14;
        this.f115289b = oVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object value;
        switch (this.f115288a) {
            case 0:
                com.garmin.android.library.mapsdkadapter.i.d dVar = (com.garmin.android.library.mapsdkadapter.i.d) obj;
                dVar.getClass();
                this.f115289b.A4(dVar, false);
                break;
            case 1:
                this.f115289b.z4(((Boolean) obj).booleanValue());
                break;
            case 2:
                c0 c0Var = (c0) obj;
                c0Var.getClass();
                float fA = (int) (c0Var.a() & 4294967295L);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                int i14 = (int) (fA - (j92.b.f97900c.f97912d * 2));
                o oVar = this.f115289b;
                qe2.h hVar = oVar.Y;
                if (hVar != null) {
                    hVar.setPadding(0, 0, 0, i14);
                }
                List<com.garmin.android.library.mapsdkadapter.q> list = oVar.f115351k0;
                ArrayList arrayList = new ArrayList(y.r(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.garmin.android.library.mapsdkadapter.q) it.next()).f50328a.f93153a);
                }
                com.garmin.android.library.mapsdkadapter.e eVarX4 = o.x4(y.s(arrayList));
                qe2.h hVar2 = oVar.Y;
                if (hVar2 != null) {
                    hVar2.j(eVarX4, 0.0f, 36, (10 & 8) != 0 ? -1 : 0);
                }
                break;
            case 3:
                long jLongValue = ((Long) obj).longValue();
                o oVar2 = this.f115289b;
                oVar2.getClass();
                ge1.b.T(v1.a(oVar2), null, null, new j(oVar2, jLongValue, null), 3);
                break;
            default:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                o oVar3 = this.f115289b;
                oVar3.f115347h.e(iIntValue);
                qe2.h hVar3 = oVar3.Y;
                if (hVar3 != null) {
                    hVar3.setMapType(iIntValue);
                }
                p2 p2Var = oVar3.f115350k;
                do {
                    value = p2Var.getValue();
                    ((Number) value).intValue();
                } while (!p2Var.b(value, num));
                break;
        }
        return Unit.INSTANCE;
    }
}
