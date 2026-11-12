package wt1;

import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.Days;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public final class r {
    public static final String a() {
        if (((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f()) {
            return fb1.c.n("http://", (((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).D() ? zi2.b.GARMIN_ATP_GATEWAY : zi2.b.GARMIN_ATP_GATEWAY_TEST).f204887b);
        }
        return fb1.c.n("http://", (((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).D() ? zi2.b.GARMIN_ATP_GATEWAY : zi2.b.GARMIN_ATP_GATEWAY_TEST).f204886a);
    }

    public static final String b(long j8, l22.b bVar) {
        String strD;
        String str = "";
        if (j8 == 3600) {
            strD = "60 ".concat(bVar.getString(R.string.common_min_abbreviated_without_period));
        } else {
            l3.f23124b.getClass();
            int i14 = ((int) j8) / DateTimeConstants.SECONDS_PER_HOUR;
            String strD2 = i14 > 0 ? org.apache.commons.lang3.e.d(i14, StringUtils.SPACE, bVar.getString(R.string.lbl_hour)) : "";
            int iL1 = l3.a.L1(j8);
            strD = iL1 > 0 ? org.apache.commons.lang3.e.d(iL1, StringUtils.SPACE, bVar.getString(R.string.common_min_abbreviated_without_period)) : "";
            str = strD2;
        }
        return w.i0(str + StringUtils.SPACE + strD).toString();
    }

    public static final String c(l22.b bVar, pi0.e eVar, DateTime dateTime) {
        DateTime dateTime2 = new DateTime();
        if (g22.k.f(dateTime2, dateTime)) {
            return bVar.getString(R.string.challenge_leaderboard_header_today_label);
        }
        if (g22.k.d(dateTime2, dateTime)) {
            return bVar.getString(R.string.common_tomorrow);
        }
        if (g22.k.f(dateTime2.minusDays(1), dateTime)) {
            return bVar.getString(R.string.social_elapsed_time_yesterday);
        }
        if (Math.abs(Days.daysBetween(dateTime2, dateTime).getDays()) >= 7) {
            return eVar.a(dateTime, qi0.a.RELATIVE_YEAR_MONTH_DAY);
        }
        String string = dateTime.toString("EEEE");
        string.getClass();
        return string;
    }
}
