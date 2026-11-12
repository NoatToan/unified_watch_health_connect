package io;

import android.content.Context;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import d53.s;
import eo.e;
import j23.t;
import java.util.Locale;
import lc.u0;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94582a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.MINIMUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.MAXIMUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f94582a = iArr;
        }
    }

    public static final String a(Context context, String str, double d14, e eVar) {
        context.getClass();
        str.getClass();
        eVar.getClass();
        Double dF = s.f(str);
        Integer numValueOf = dF != null ? Integer.valueOf((int) dF.doubleValue()) : null;
        int i14 = (int) d14;
        String strValueOf = String.valueOf(numValueOf);
        if (numValueOf == null) {
            return "";
        }
        int i15 = a.f94582a[eVar.ordinal()];
        if (i15 == 1) {
            return strValueOf;
        }
        if (i15 != 2) {
            u0.r();
            return null;
        }
        if (numValueOf.intValue() > d14) {
            strValueOf = context.getString(R.string.lbl_string_with_positive_sign_end, String.valueOf(i14));
        }
        strValueOf.getClass();
        return strValueOf;
    }

    public static final String b(Context context, Integer num, e eVar) {
        context.getClass();
        eVar.getClass();
        if (num == null) {
            return "";
        }
        String string = context.getString(R.string.sleep_my_day_minute_unit);
        string.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String lowerCase = string.toLowerCase(locale);
        lowerCase.getClass();
        String strConcat = "0".concat(lowerCase);
        int iE = t.e(num.intValue(), 0, DateTimeConstants.MINUTES_PER_DAY);
        l3.f23124b.getClass();
        String strU1 = l3.a.u1(context, iE * 60, strConcat);
        if (num.intValue() < 1440) {
            return strU1;
        }
        String string2 = context.getString(R.string.lbl_string_with_positive_sign_end, strU1);
        string2.getClass();
        return string2;
    }
}
