package or1;

import c22.j0;
import i53.f;
import java.util.Map;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import p005kotlin.Metadata;
import p13.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lor1/c;", "", "<init>", "()V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {
    public static f a(Map map, DateTime dateTime, int i14, int i15) {
        int minutes;
        map.getClass();
        Integer[] numArr = new Integer[i14];
        if (dateTime == null) {
            return i53.a.j(u.i0(numArr));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Double d14 = (Double) entry.getValue();
            DateTime dateTimeN = j0.N(str, true);
            if (dateTimeN != null && (minutes = Minutes.minutesBetween(dateTime, dateTimeN).getMinutes() / i15) >= 0 && minutes < i14) {
                numArr[minutes] = d14 != null ? Integer.valueOf((int) d14.doubleValue()) : null;
            }
        }
        return i53.a.j(u.i0(numArr));
    }
}
