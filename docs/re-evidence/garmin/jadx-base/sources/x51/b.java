package x51;

import b63.o;
import b63.u;
import b63.v;
import g22.k;
import g22.l;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static final float a(u uVar, u uVar2, o oVar) {
        Float fC = (uVar == null || uVar2 == null || uVar.compareTo(uVar2) <= 0) ? c(uVar2, oVar) : c(uVar, oVar);
        return fC != null ? fC.floatValue() : l.b(new u(l.d(o.INSTANCE), new v(23, 59, 0, 0, 8, null)));
    }

    public static final float b(u uVar, u uVar2, o oVar) {
        Float fC = (uVar == null || uVar2 == null || uVar.compareTo(uVar2) >= 0) ? c(uVar2, oVar) : c(uVar, oVar);
        return fC != null ? fC.floatValue() : l.b(new u(l.d(o.INSTANCE), new v(0, 0, 0, 0, 8, null)));
    }

    public static final Float c(u uVar, o oVar) {
        DateTime dateTime;
        DateTime dateTimeB = (uVar == null || (dateTime = l.i(uVar).toDateTime()) == null) ? null : k.B(dateTime);
        if (dateTimeB == null) {
            return null;
        }
        float minuteOfDay = dateTimeB.getMinuteOfDay();
        return (oVar == null || uVar.b().compareTo(oVar) <= 0) ? Float.valueOf(minuteOfDay) : Float.valueOf(minuteOfDay + DateTimeConstants.MINUTES_PER_DAY);
    }
}
