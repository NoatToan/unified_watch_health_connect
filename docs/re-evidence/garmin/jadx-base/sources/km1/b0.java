package km1;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 {
    public static final b63.u a(a0 a0Var) {
        b63.o oVarB;
        String calendarDate = a0Var.getCalendarDate();
        if (calendarDate != null) {
            try {
                oVarB = b63.o.Companion.b(b63.o.INSTANCE, calendarDate);
            } catch (Exception unused) {
                oVarB = null;
            }
        } else {
            oVarB = null;
        }
        if (oVarB == null || a0Var.getRecommendedBedtimeEndMins() == null) {
            return null;
        }
        return b63.q.b(oVarB, a0Var.getRecommendedBedtimeEndMins().intValue() / 60, a0Var.getRecommendedBedtimeEndMins().intValue() % 60);
    }

    public static final b63.u b(a0 a0Var) {
        b63.o oVarB;
        String calendarDate = a0Var.getCalendarDate();
        if (calendarDate != null) {
            try {
                oVarB = b63.o.Companion.b(b63.o.INSTANCE, calendarDate);
            } catch (Exception unused) {
                oVarB = null;
            }
        } else {
            oVarB = null;
        }
        if (oVarB == null || a0Var.getRecommendedBedtimeStartMins() == null) {
            return null;
        }
        return b63.q.b(oVarB, a0Var.getRecommendedBedtimeStartMins().intValue() / 60, a0Var.getRecommendedBedtimeStartMins().intValue() % 60);
    }
}
