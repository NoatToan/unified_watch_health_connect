package pi0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import g22.k;
import java.util.Locale;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpi0/e;", "Lpi0/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "formatter_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends pi0.a {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f137845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f137846b;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.DATE_SHORT_MONTH_FOR_PAST_YEAR_SHOW_TODAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.DATE_FULL_MONTH_NO_PAST_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f137845a = iArr;
            int[] iArr2 = new int[f.values().length];
            try {
                iArr2[f.SHORT_MONTH_NO_WEEKDAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[f.MONTH_NO_WEEKDAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[f.SHORT_NON_OVERLAPPING_MONTH_NO_WEEKDAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[f.SHORT_MONTH_NO_DAY_NO_WEEKDAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f137846b = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        context.getClass();
    }

    public final String j(DateTime dateTime, d dVar) {
        dVar.getClass();
        int i14 = a.f137845a[dVar.ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                return a(dateTime, qi0.a.RELATIVE_YEAR_MONTH_NO_DAY);
            }
            u0.r();
            return null;
        }
        DateTime dateTimeNow = DateTime.now();
        if (!dateTime.toLocalDate().isEqual(dateTimeNow.toLocalDate())) {
            return a(dateTime, dateTime.getYear() == dateTimeNow.getYear() ? qi0.a.RELATIVE_YEAR_MONTH_DAY_WEEKDAY : qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY_WEEKDAY);
        }
        String string = this.f137833a.getString(R.string.mct_lbl_today);
        string.getClass();
        return string;
    }

    public final String k(LocalDate localDate, d dVar) {
        dVar.getClass();
        DateTime dateTimeAtStartOfDay = localDate.toDateTimeAtStartOfDay();
        dateTimeAtStartOfDay.getClass();
        return j(dateTimeAtStartOfDay, dVar);
    }

    public final String l(DateTime dateTime, DateTime dateTime2, f fVar) {
        dateTime.getClass();
        dateTime2.getClass();
        fVar.getClass();
        String country = Locale.getDefault().getCountry();
        if (s.g(country, "TH") && k.j(dateTime, dateTime2) && k.j(dateTime, new DateTime()) && dateTime.getMonthOfYear() == dateTime2.getMonthOfYear()) {
            return dateTime.getDayOfMonth() + "-" + dateTime2.getDayOfMonth() + StringUtils.SPACE + dateTime.monthOfYear().getAsText();
        }
        int i14 = a.f137846b[fVar.ordinal()];
        if (i14 == 1) {
            boolean zContains = x.k("CN", "TW", "JP", "KR", "TH", "MY", "VN").contains(country);
            boolean z14 = k.j(dateTime, dateTime2) && dateTime.getMonthOfYear() == dateTime2.getMonthOfYear();
            if (zContains || !z14) {
                return g(dateTime, dateTime2, qi0.c.OVERLAPPING_RELATIVE_YEAR_OVERLAPPING_ABBREV_MONTH_DAY);
            }
            return new d53.k("\\s–\\s").f(g(dateTime, dateTime2, qi0.c.OVERLAPPING_RELATIVE_YEAR_OVERLAPPING_ABBREV_MONTH_DAY), "–");
        }
        if (i14 == 2) {
            return g(dateTime, dateTime2, qi0.c.OVERLAPPING_RELATIVE_YEAR_OVERLAPPING_MONTH_DAY);
        }
        if (i14 == 3) {
            return g(dateTime, dateTime2, (dateTime.getYear() == dateTime2.getYear() && dateTime.getMonthOfYear() == dateTime2.getMonthOfYear()) ? qi0.c.OVERLAPPING_RELATIVE_YEAR_OVERLAPPING_MONTH_DAY : qi0.c.OVERLAPPING_RELATIVE_YEAR_OVERLAPPING_ABBREV_MONTH_DAY);
        }
        if (i14 == 4) {
            return g(dateTime, dateTime2, qi0.c.OVERLAPPING_RELATIVE_YEAR_OVERLAPPING_ABBREV_MONTH_NO_DAY);
        }
        u0.r();
        return null;
    }

    public final String m(LocalDate localDate, LocalDate localDate2, f fVar) {
        localDate.getClass();
        localDate2.getClass();
        fVar.getClass();
        DateTime dateTimeAtStartOfDay = localDate.toDateTimeAtStartOfDay();
        dateTimeAtStartOfDay.getClass();
        DateTime dateTimeAtStartOfDay2 = localDate2.toDateTimeAtStartOfDay();
        dateTimeAtStartOfDay2.getClass();
        return l(dateTimeAtStartOfDay, dateTimeAtStartOfDay2, fVar);
    }
}
