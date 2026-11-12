package t31;

import c22.j0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.IllegalInstantException;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static final DateTime a(String str) {
        DateTimeZone dateTimeZone = DateTimeZone.UTC;
        DateTimeZone dateTimeZone2 = DateTimeZone.getDefault();
        j0 j0Var = j0.f23099a;
        if (dateTimeZone == null) {
            return null;
        }
        try {
            return DateTime.parse(str, DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").withZone(dateTimeZone)).withZone(dateTimeZone2);
        } catch (IllegalInstantException e4) {
            e4.getLocalizedMessage();
            return null;
        } catch (IllegalArgumentException e14) {
            e14.getLocalizedMessage();
            return null;
        }
    }

    public static final String b(DateTime dateTime) {
        j0.f23099a.getClass();
        if (j0.D()) {
            String string = dateTime.toString("HH:mm");
            string.getClass();
            return string;
        }
        String string2 = dateTime.toString("h:mm a");
        string2.getClass();
        return string2;
    }

    public static final boolean c(i41.a aVar, String str) {
        aVar.getClass();
        Integer balancedLow = aVar.getBalancedLow();
        Integer balancedUpper = aVar.getBalancedUpper();
        return (s.g(str, x31.b.NONE.toString()) || balancedLow == null || balancedLow.intValue() <= 0 || balancedUpper == null || balancedUpper.intValue() <= 0) ? false : true;
    }
}
