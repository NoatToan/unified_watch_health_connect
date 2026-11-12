package df0;

import gs1.d;
import gs1.t;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public static final boolean a(t tVar) {
        d allDayHeartRateDTO;
        d.c payload;
        boolean z14;
        if (tVar != null && (allDayHeartRateDTO = tVar.getAllDayHeartRateDTO()) != null && (payload = allDayHeartRateDTO.getPayload()) != null) {
            Integer maxHeartRate = payload.getMaxHeartRate();
            if ((maxHeartRate != null ? maxHeartRate.intValue() : 0) > 0) {
                z14 = true;
            } else {
                Integer restingHeartRate = payload.getRestingHeartRate();
                if ((restingHeartRate != null ? restingHeartRate.intValue() : 0) > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            List<d.b> listF = payload.f();
            Object obj = null;
            if (listF != null) {
                for (Object obj2 : listF) {
                    Integer num = ((d.b) obj2).f78714b;
                    if ((num != null ? num.intValue() : 0) > 0) {
                        obj = obj2;
                        break;
                    }
                }
                obj = (d.b) obj;
            }
            boolean z15 = obj == null;
            if (z14 && z15) {
                return true;
            }
        }
        return false;
    }
}
