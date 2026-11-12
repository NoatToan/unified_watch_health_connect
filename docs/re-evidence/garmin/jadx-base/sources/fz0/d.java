package fz0;

import b63.o;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static final c a(o oVar) {
        oVar.getClass();
        return new c(null, oVar, 1, null);
    }

    @o13.e
    public static final c b(DateTime dateTime) {
        dateTime.getClass();
        return new c(dateTime, null, 2, null);
    }

    public static final c c(LocalDate localDate) {
        localDate.getClass();
        return new c(localDate.toDateTimeAtStartOfDay(), null, 2, null);
    }

    public static final e d(DateTime dateTime) {
        dateTime.getClass();
        return new e(dateTime);
    }
}
