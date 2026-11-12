package vw1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import g22.k;
import i3.e5;
import j23.i;
import j23.l;
import java.util.List;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Weeks;
import p005kotlin.jvm.internal.s;
import p13.x;
import tw1.m;
import tw1.r;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static final int a(m mVar) {
        mVar.getClass();
        List<r> listU = mVar.u();
        int i14 = 0;
        if (listU != null) {
            if (listU.isEmpty()) {
                return 0;
            }
            for (r rVar : listU) {
                l lVar = new l(1, mVar.getBaseWeeks());
                Integer weekId = rVar.getWeekId();
                if (weekId != null && lVar.d(weekId.intValue()) && (i14 = i14 + 1) < 0) {
                    x.p();
                    throw null;
                }
            }
        }
        return i14;
    }

    public static final int b(m mVar) {
        mVar.getClass();
        List<r> listU = mVar.u();
        int i14 = 0;
        if (listU != null) {
            if (listU.isEmpty()) {
                return 0;
            }
            for (r rVar : listU) {
                l lVar = new l(mVar.getBaseWeeks() + 1, mVar.getBuildWeeks() + mVar.getBaseWeeks());
                Integer weekId = rVar.getWeekId();
                if (weekId != null && lVar.d(weekId.intValue()) && (i14 = i14 + 1) < 0) {
                    x.p();
                    throw null;
                }
            }
        }
        return i14;
    }

    public static final DateTime c() {
        DateTime dateTimeWithTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
        dateTimeWithTimeAtStartOfDay.getClass();
        return dateTimeWithTimeAtStartOfDay;
    }

    public static final String d(Context context) {
        String str;
        String str2;
        context.getClass();
        String language = Locale.getDefault().getLanguage();
        String string = context.getString(R.string.locale_pattern, language, Locale.getDefault().getCountry());
        string.getClass();
        String[] stringArray = context.getResources().getStringArray(R.array.itp_languages);
        stringArray.getClass();
        int length = stringArray.length;
        int i14 = 0;
        while (true) {
            str = null;
            if (i14 >= length) {
                str2 = null;
                break;
            }
            str2 = stringArray[i14];
            if (s.g(str2, string)) {
                break;
            }
            i14++;
        }
        if (str2 != null) {
            return str2;
        }
        for (String str3 : stringArray) {
            if (s.g(Locale.forLanguageTag(str3).getLanguage(), language)) {
                str = str3;
                break;
            }
        }
        return str == null ? "en-US" : str;
    }

    public static final int e(m mVar) {
        mVar.getClass();
        List<r> listU = mVar.u();
        int i14 = 0;
        if (listU != null) {
            if (listU.isEmpty()) {
                return 0;
            }
            for (r rVar : listU) {
                l lVar = new l(mVar.getBuildWeeks() + mVar.getBaseWeeks() + 1, mVar.getDurationInWeeks());
                Integer weekId = rVar.getWeekId();
                if (weekId != null && lVar.d(weekId.intValue()) && (i14 = i14 + 1) < 0) {
                    x.p();
                    throw null;
                }
            }
        }
        return i14;
    }

    public static final d f(m mVar) {
        i iVarA;
        i iVarA2;
        LocalDate localDatePlusDays;
        LocalDate localDatePlusDays2;
        mVar.getClass();
        DateTime startDate = mVar.getStartDate();
        d dVar = null;
        i iVarA3 = null;
        dVar = null;
        LocalDate localDate = startDate != null ? startDate.toLocalDate() : null;
        DateTime dateTimeO = mVar.o();
        LocalDate localDate2 = dateTimeO != null ? dateTimeO.toLocalDate() : null;
        if (localDate != null && localDate2 != null) {
            int iA = a(mVar);
            int iB = b(mVar);
            int iE = e(mVar);
            if (iA > 0) {
                LocalDate localDatePlusDays3 = (iB == 0 && iE == 0) ? localDate2 : localDate.plusDays(iA - 1);
                localDatePlusDays3.getClass();
                iVarA = j23.s.a(localDate, localDatePlusDays3);
            } else {
                iVarA = null;
            }
            if (iB > 0) {
                if (iVarA == null || (localDatePlusDays2 = ((LocalDate) iVarA.f96794b).plusDays(1)) == null) {
                    localDatePlusDays2 = localDate;
                }
                LocalDate localDatePlusDays4 = iE == 0 ? localDate2 : localDatePlusDays2.plusDays(iB - 1);
                localDatePlusDays4.getClass();
                iVarA2 = j23.s.a(localDatePlusDays2, localDatePlusDays4);
            } else {
                iVarA2 = null;
            }
            if (iE > 0) {
                if (iVarA2 != null && (localDatePlusDays = ((LocalDate) iVarA2.f96794b).plusDays(1)) != null) {
                    localDate = localDatePlusDays;
                }
                iVarA3 = j23.s.a(localDate, localDate2);
            }
            dVar = new d(iVarA, iVarA2, iVarA3);
        }
        return dVar == null ? new d(null, null, null, 7, null) : dVar;
    }

    public static final String g(int i14, Context context) {
        int i15 = i14 / 7;
        int i16 = i14 % 7;
        if (i15 > 0 && i16 > 0) {
            return e5.g(context.getResources().getQuantityString(R.plurals.lbl_duration_week, i15, Integer.valueOf(i15)), " & ", context.getResources().getQuantityString(R.plurals.lbl_duration_day, i16, Integer.valueOf(i16)));
        }
        if (i15 <= 0 || i16 != 0) {
            String quantityString = context.getResources().getQuantityString(R.plurals.lbl_duration_day, i16, Integer.valueOf(i16));
            quantityString.getClass();
            return quantityString;
        }
        String quantityString2 = context.getResources().getQuantityString(R.plurals.lbl_duration_week, i15, Integer.valueOf(i15));
        quantityString2.getClass();
        return quantityString2;
    }

    public static final int h(int i14, DateTime dateTime, DateTime dateTime2) {
        return Weeks.weeksBetween(dateTime != null ? k.o(i14, dateTime) : null, dateTime2 != null ? k.b(i14, dateTime2) : null).getWeeks() + 1;
    }
}
