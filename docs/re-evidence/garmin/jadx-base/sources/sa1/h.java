package sa1;

import android.content.Context;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTimeConstants;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    public static final String a(Context context, j23.f<Float> fVar) {
        context.getClass();
        fVar.getClass();
        float fFloatValue = fVar.getStart().floatValue();
        float f14 = DateTimeConstants.SECONDS_PER_HOUR;
        long j8 = (long) (fFloatValue * f14);
        long jFloatValue = (long) (fVar.b().floatValue() * f14);
        if (j8 < 60 && jFloatValue < 60) {
            return "";
        }
        l3.f23124b.getClass();
        int i14 = ((int) j8) / DateTimeConstants.SECONDS_PER_HOUR;
        int i15 = ((int) jFloatValue) / DateTimeConstants.SECONDS_PER_HOUR;
        if (i14 < 1 && i15 <= 1) {
            String string = context.getString(R.string.lbl_less_than_one_hour);
            string.getClass();
            return string;
        }
        if (jFloatValue < 5400) {
            String string2 = context.getString(R.string.lbl_about_one_hour);
            string2.getClass();
            return string2;
        }
        int iL1 = l3.a.L1(j8);
        int iL2 = l3.a.L1(jFloatValue);
        if (i14 == i15) {
            return c(i14, iL1, context);
        }
        if (iL1 >= 1 || iL2 >= 1) {
            String string3 = context.getString(R.string.string_line_string_pattern_no_space, c(i14, iL1, context), c(i15, iL2, context));
            string3.getClass();
            return string3;
        }
        String string4 = context.getString(R.string.power_guide_hours_interval, String.valueOf(i14), String.valueOf(i15));
        string4.getClass();
        return string4;
    }

    public static final String b(Context context, j23.e eVar) {
        context.getClass();
        float fFloatValue = Float.valueOf(eVar.f96789a).floatValue();
        float f14 = DateTimeConstants.SECONDS_PER_HOUR;
        long j8 = (long) (fFloatValue * f14);
        long jFloatValue = (long) (Float.valueOf(eVar.f96790b).floatValue() * f14);
        if (j8 < 60 && jFloatValue < 60) {
            return "";
        }
        l3.f23124b.getClass();
        int i14 = (int) j8;
        int i15 = i14 / DateTimeConstants.SECONDS_PER_HOUR;
        int i16 = (int) jFloatValue;
        int i17 = i16 / DateTimeConstants.SECONDS_PER_HOUR;
        if (i15 < 1 && i17 <= 1) {
            String string = context.getString(R.string.lbl_less_than_one_hour);
            string.getClass();
            return string;
        }
        if (jFloatValue < 5400) {
            String string2 = context.getString(R.string.lbl_about_one_hour);
            string2.getClass();
            return string2;
        }
        int iL1 = l3.a.L1(j8);
        int iL2 = l3.a.L1(jFloatValue);
        if (i15 == i17) {
            return new oi0.h(context).c(i14, false);
        }
        if (iL1 < 1 && iL2 < 1) {
            return e5.g(context.getString(R.string.lbl_value1_to_value2, Integer.valueOf(i15), Integer.valueOf(i17)), StringUtils.SPACE, context.getString(R.string.lbl_time_unit_hours));
        }
        oi0.h hVar = new oi0.h(context);
        String string3 = context.getString(R.string.lbl_value1_to_value2, hVar.c(i14, false), hVar.c(i16, false));
        string3.getClass();
        return string3;
    }

    public static final String c(int i14, int i15, Context context) {
        if (i14 > 0 && i15 > 0) {
            String string = context.getString(R.string.power_guide_time_format_short, String.valueOf(i14), String.valueOf(i15));
            string.getClass();
            return string;
        }
        if (i14 > 0) {
            String string2 = context.getString(R.string.common_hour_small_abbreviation, Integer.valueOf(i14));
            string2.getClass();
            return string2;
        }
        String string3 = context.getString(R.string.common_minute_small_abbreviation, Integer.valueOf(i15));
        string3.getClass();
        return string3;
    }

    public static final String d(Context context) {
        context.getClass();
        boolean zY = ((bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null)).y();
        String string = context.getString(zY ? R.string.common_lbl_kilometers : R.string.common_lbl_miles);
        string.getClass();
        String string2 = context.getString(R.string.power_guide_limits_msg, String.valueOf(zY ? 15 : 10), String.valueOf(zY ? 400 : 250), string);
        string2.getClass();
        return string2;
    }

    public static final boolean e(double d14) {
        return d14 < 15000.0d || d14 > 402500.0d;
    }

    public static final ArrayList f(Context context, List list) {
        context.getClass();
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ab1.g gVar = (ab1.g) it.next();
            Float f14 = gVar.f2579l;
            float fFloatValue = f14 != null ? f14.floatValue() : 0.0f;
            Float f15 = gVar.f2580m;
            j23.e eVar = new j23.e(fFloatValue, f15 != null ? f15.floatValue() : 0.0f);
            String string = context.getString(R.string.power_guide_estimated_time_lbl, b(context, eVar));
            string.getClass();
            Long l14 = gVar.f2568a;
            long jLongValue = l14 != null ? l14.longValue() : 0L;
            Long l15 = gVar.f2570c;
            long jLongValue2 = l15 != null ? l15.longValue() : 0L;
            String str = gVar.f2569b;
            if (str == null) {
                str = "";
            }
            arrayList.add(new bb1.g(jLongValue, jLongValue2, str, a(context, eVar), string));
        }
        return arrayList;
    }
}
