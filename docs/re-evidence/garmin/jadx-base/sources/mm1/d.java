package mm1;

import g22.k;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    public static final LocalDate a(c cVar) {
        cVar.getClass();
        String calendarDate = cVar.getCalendarDate();
        if (calendarDate != null) {
            return k.w(calendarDate, "yyyy-MM-dd");
        }
        return null;
    }
}
