package ep;

import java.util.ArrayList;
import java.util.List;
import m92.h0;
import p13.j0;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static final List<h0.e.a> a(ps.o oVar) {
        if (oVar == null) {
            return j0.f134944a;
        }
        List listK = x.k(oVar.getMaxAvgPower1(), oVar.getMaxAvgPower2(), oVar.getMaxAvgPower5(), oVar.getMaxAvgPower10(), oVar.getMaxAvgPower20(), oVar.getMaxAvgPower30(), oVar.getMaxAvgPower60(), oVar.getMaxAvgPower120(), oVar.getMaxAvgPower300(), oVar.getMaxAvgPower600(), oVar.getMaxAvgPower1200(), oVar.getMaxAvgPower1800(), oVar.getMaxAvgPower3600(), oVar.getMaxAvgPower7200(), oVar.getMaxAvgPower18000());
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        for (Object obj : listK) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                x.q();
                throw null;
            }
            Double d14 = (Double) obj;
            h0.e.a aVar = d14 != null ? new h0.e.a(i14, (float) d14.doubleValue()) : null;
            if (aVar != null) {
                arrayList.add(aVar);
            }
            i14 = i15;
        }
        return arrayList;
    }
}
