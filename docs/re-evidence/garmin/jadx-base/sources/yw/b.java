package yw;

import android.content.Context;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import i3.e5;
import java.text.DecimalFormat;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import pi0.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lyw/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.a f199875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pi0.e f199876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f199877c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f199878a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.NO_SPACES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f199878a = iArr;
        }
    }

    public b(Context context) {
        context.getClass();
        l22.a aVar = new l22.a(context);
        this.f199875a = aVar;
        this.f199876b = new pi0.e(context);
        this.f199877c = aVar.getString(R.string.no_value);
    }

    public static String d(Double d14) {
        l3.f23124b.getClass();
        DecimalFormat decimalFormat = l3.f23131i;
        if (d14 == null) {
            return "";
        }
        String str = decimalFormat.format(d14.doubleValue());
        str.getClass();
        return str;
    }

    public static String e(Double d14) {
        if (d14 == null) {
            return null;
        }
        l3.f23124b.getClass();
        return l3.f23131i.format(d14.doubleValue());
    }

    public final String a(Double d14, Double d15, c cVar) {
        int i14;
        cVar.getClass();
        l22.a aVar = this.f199875a;
        if (d14 == null || d15 == null) {
            return aVar.getString(R.string.no_value);
        }
        int i15 = a.f199878a[cVar.ordinal()];
        if (i15 == 1) {
            i14 = R.string.string_slash_string_pattern;
        } else {
            if (i15 != 2) {
                u0.r();
                return null;
            }
            i14 = R.string.string_slash_string_no_space_pattern;
        }
        return aVar.a(i14, d(d14), d(d15));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String b(String str) {
        l22.a aVar = this.f199875a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1986416409:
                    if (str.equals("NORMAL")) {
                        return aVar.getString(R.string.lbl_normal);
                    }
                    break;
                case -1934042132:
                    if (str.equals("HYPERTENSIVE_CRISIS")) {
                        return aVar.getString(R.string.lbl_blood_pressure_category_hypertensive);
                    }
                    break;
                case 178036260:
                    if (str.equals("HIGH_NORMAL")) {
                        return aVar.getString(R.string.lbl_blood_pressure_category_high_normal);
                    }
                    break;
                case 782485418:
                    if (str.equals("ELEVATED")) {
                        return aVar.getString(R.string.lbl_blood_pressure_category_elevated);
                    }
                    break;
                case 997966249:
                    if (str.equals("GRADE_1")) {
                        return aVar.getString(R.string.lbl_blood_pressure_category_grade_one);
                    }
                    break;
                case 997966250:
                    if (str.equals("GRADE_2")) {
                        return aVar.getString(R.string.lbl_blood_pressure_category_grade_two);
                    }
                    break;
                case 2036261233:
                    if (str.equals("STAGE_1_HIGH")) {
                        return aVar.a(R.string.lbl_blood_pressure_stage, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    }
                    break;
                case 2064890384:
                    if (str.equals("STAGE_2_HIGH")) {
                        return aVar.a(R.string.lbl_blood_pressure_stage, "2");
                    }
                    break;
            }
        }
        return aVar.getString(R.string.no_value);
    }

    public final String c(int i14, DateTime dateTime, DateTime dateTime2) {
        String str = this.f199877c;
        if (dateTime == null || dateTime2 == null) {
            return str;
        }
        pi0.e eVar = this.f199876b;
        if (i14 != 0) {
            return i14 != 5 ? str : eVar.l(dateTime, dateTime2, f.SHORT_MONTH_NO_WEEKDAY);
        }
        return eVar.a(dateTime, qi0.a.RELATIVE_YEAR_MONTH_DAY);
    }

    public final String f(Double d14) {
        l22.a aVar = this.f199875a;
        String string = aVar.getString(R.string.lbl_blood_pressure_diastolic);
        l3.f23124b.getClass();
        String strA = aVar.a(R.string.lbl_range_limits, l3.a.B(30.0d), l3.a.B(200.0d));
        if (d14 == null) {
            StringBuilder sbL = e5.l(string, ". ", aVar.getString(R.string.common_no_data), StringUtils.SPACE, strA);
            sbL.append(".");
            return sbL.toString();
        }
        return string + ". " + d14 + ". " + strA + ".";
    }

    public final String g(Double d14, Double d15, String str, int i14, c cVar, yw.a aVar) {
        cVar.getClass();
        aVar.getClass();
        l22.a aVar2 = this.f199875a;
        if (i14 > 1) {
            return aVar2.a(R.string.lbl_named_readings, String.valueOf(i14));
        }
        return aVar2.a(aVar.f199874a, a(d14, d15, cVar), b(str));
    }

    public final String h() {
        l22.a aVar = this.f199875a;
        String string = aVar.getString(R.string.msg_heart_rate_optional);
        l3.f23124b.getClass();
        return aVar.a(R.string.string_space_string_pattern, string, aVar.a(R.string.lbl_range_limits, l3.a.B(1.0d), l3.a.B(300.0d)));
    }

    public final String i(Double d14) {
        l22.a aVar = this.f199875a;
        String string = aVar.getString(R.string.activity_details_heart_rate);
        String strH = h();
        if (d14 == null) {
            StringBuilder sbL = e5.l(string, ". ", aVar.getString(R.string.common_no_data), StringUtils.SPACE, strH);
            sbL.append(".");
            return sbL.toString();
        }
        return string + ". " + d14 + ". " + strH + ".";
    }

    public final String j(Double d14) {
        l22.a aVar = this.f199875a;
        String string = aVar.getString(R.string.lbl_blood_pressure_systolic);
        l3.f23124b.getClass();
        String strA = aVar.a(R.string.lbl_range_limits, l3.a.B(40.0d), l3.a.B(300.0d));
        if (d14 == null) {
            StringBuilder sbL = e5.l(string, ". ", aVar.getString(R.string.common_no_data), StringUtils.SPACE, strA);
            sbL.append(".");
            return sbL.toString();
        }
        return string + ". " + d14 + ". " + strA + ".";
    }
}
