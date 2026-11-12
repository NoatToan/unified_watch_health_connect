package in1;

import java.util.List;
import km1.u;
import km1.v;
import o72.t;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static final boolean a(km1.c cVar) {
        v vVarJ;
        return (cVar == null || (vVarJ = cVar.getDailySleep()) == null || !vVarJ.getDeviceRemCapable()) ? false : true;
    }

    public static final boolean b(km1.c cVar) {
        return (cVar != null ? cVar.n0() : 0) > 0;
    }

    public static final boolean c(v vVar) {
        if (vVar.getSleepFromDevice()) {
            return false;
        }
        Long lF = vVar.getAutoSleepStartTimestampGMT();
        long jLongValue = lF != null ? lF.longValue() : 0L;
        Long lD = vVar.getAutoSleepEndTimestampGMT();
        long jLongValue2 = lD != null ? lD.longValue() : 0L;
        if (vVar.getSleepWindowConfirmedType() == null) {
            return false;
        }
        if (p005kotlin.jvm.internal.s.g(vVar.getSleepWindowConfirmedType(), u.OFF_WRIST.f105587a) && vVar.getSleepWindowConfirmed()) {
            return true;
        }
        return p005kotlin.jvm.internal.s.g(vVar.getSleepWindowConfirmedType(), u.MANUALLY_CONFIRMED.f105587a) && jLongValue <= 0 && jLongValue2 <= 0;
    }

    public static final boolean d(km1.c cVar) {
        if (cVar == null) {
            return false;
        }
        List<km1.s> listA = cVar.A();
        if (listA != null && !listA.isEmpty()) {
            return false;
        }
        tm1.b bVarN = t.N(cVar);
        return (bVarN.f165444e > 0 || bVarN.f165443d > 0) && !bVarN.f165445f;
    }
}
