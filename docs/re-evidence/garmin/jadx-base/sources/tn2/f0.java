package tn2;

import java.util.Calendar;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;
import org.joda.time.ReadablePartial;
import org.joda.time.format.DateTimeFormat;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ltn2/f0;", "", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltn2/f0$a;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        PROVISION,
        TOPUP,
        REFUND,
        GET_USAGE_HISTORY,
        UPDATE_USER_INFO
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f165558a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.PROVISION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.TOPUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.REFUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.GET_USAGE_HISTORY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.UPDATE_USER_INFO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f165558a = iArr;
        }
    }

    public static LocalTime a(pn2.s sVar) {
        LocalTime localTime = LocalTime.parse(sVar.getStartTime(), DateTimeFormat.forPattern("HH:mm:ss"));
        localTime.getClass();
        return localTime;
    }

    public static boolean b(DateTime dateTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(dateTime.getYear(), dateTime.getMonthOfYear(), dateTime.getDayOfMonth());
        calendar.setMinimalDaysInFirstWeek(1);
        return calendar.get(4) == 4 && dateTime.getDayOfWeek() == 3;
    }

    public static boolean c(LocalTime localTime, LocalTime localTime2, LocalTime localTime3) {
        if (localTime3.compareTo((ReadablePartial) localTime2) > 0) {
            return localTime.compareTo(localTime2) >= 0 && localTime.compareTo(localTime3) <= 0;
        }
        return localTime.compareTo((ReadablePartial) localTime3) < 0 || localTime2.compareTo((ReadablePartial) localTime) < 0;
    }
}
