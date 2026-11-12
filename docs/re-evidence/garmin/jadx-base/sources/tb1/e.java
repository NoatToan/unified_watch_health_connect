package tb1;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import db1.m;
import f12.l;
import gg1.h0;
import o13.p;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Marker;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r22.x1;
import ww0.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ltb1/e;", "", "<init>", "()V", "a", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f163745a = new a(null);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0006¨\u0006$"}, d2 = {"Ltb1/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "TOTAL_DAYS_IN_FIRST_TRIMESTER", "F", "TOTAL_DAYS_IN_SECOND_TRIMESTER", "MAX_OF_TOTAL_DAYS_IN_PREGNANCY", "SECOND_TRIMESTER_WEEKS", "GC_SHORT_DATE_TIME_PREGNANCY_PATTERN", "EXTRA_PREGNANCY_SNAPSHOT_DTO", "", "DUE_DATE_TO_START_DATE", "I", "TODAY_DATE_TO_MAX_DELIVERY_OR_LOSS_DATE", "MAX_ALLOWED_PREGNANCY_WEEKS", "TOTAL_NUMBER_OF_DAYS_IN_WEEK", "", "MMOL_TO_MGDL", "D", "MGDL_TO_MMOL", "MAX_MMOL", "USER_MENSTRUAL_CYCLE_SETTINGS", "CYCLE_TYPE", "PREGNANCY_SETUP", "PHYSICAL_SYMPTOMS_TRACKING", "MOOD_TRACKING", "DISCHARGE_TRACKING", "SEXUAL_ACTIVITY_TRACKING", "SEX_DRIVE_TRACKING", "OVULATION_DATE_TRACKING", "CDC_PREGNANCY_WEIGHT_URL", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static String a(Context context, Double d14) {
            if (d14 == null) {
                return "";
            }
            if (i52.a.i() != h0.MILLI_GRAMS_PER_DECILITER) {
                return i(d14.doubleValue()) + StringUtils.SPACE + context.getString(R.string.lbl_mmol_l_long);
            }
            l3.a aVar = l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            return ((long) l3.a.T1(dDoubleValue, 0)) + StringUtils.SPACE + context.getString(R.string.lbl_mgdl_long);
        }

        public static String b(Context context, Double d14) {
            if (d14 == null) {
                return "";
            }
            if (i52.a.i() != h0.MILLI_GRAMS_PER_DECILITER) {
                return i(d14.doubleValue()) + StringUtils.SPACE + context.getString(R.string.pregnancy_mmol);
            }
            l3.a aVar = l3.f23124b;
            double dDoubleValue = d14.doubleValue();
            aVar.getClass();
            return ((long) l3.a.T1(dDoubleValue, 0)) + StringUtils.SPACE + context.getString(R.string.pregnancy_mgdl);
        }

        public static DateTime c() {
            DateTime dateTimeNow = DateTime.now();
            dateTimeNow.getClass();
            return dateTimeNow;
        }

        public static String d(float f14, Context context) {
            String strN0 = l3.a.n0(l3.f23124b, context, f14, ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y());
            if (!TextUtils.isEmpty(strN0)) {
                return strN0;
            }
            String string = context.getString(R.string.no_value);
            string.getClass();
            return string;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static SpannableStringBuilder e(Context context, int i14, int i15, boolean z14, Integer num) {
            String string;
            context.getClass();
            x1 x1Var = new x1(context);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int iIntValue = R.style.PieChartCenterPrimaryValueText;
            if (i14 < 1 || i15 < q.FIRST.f187646a) {
                string = context.getString(R.string.no_value);
                string.getClass();
            } else {
                if (i14 >= 295.0f) {
                    SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append((CharSequence) x1.b(x1Var, "42", R.style.PieChartCenterPrimaryValueText)).append((CharSequence) x1.b(x1Var, Marker.ANY_NON_NULL_MARKER, R.style.PieChartCenterPrimaryValueUom)).append((CharSequence) "\n");
                    String string2 = context.getString(R.string.pregnancy_weeks);
                    string2.getClass();
                    SpannableStringBuilder spannableStringBuilderAppend2 = spannableStringBuilderAppend.append((CharSequence) x1.b(x1Var, string2, R.style.CardPieChartCenterSecondaryValueSubText));
                    spannableStringBuilderAppend2.getClass();
                    return spannableStringBuilderAppend2;
                }
                int i16 = i14 - 1;
                p pVar = new p(Integer.valueOf(i16 / 7), Integer.valueOf((i16 % 7) + 1));
                int iIntValue2 = ((Number) pVar.f128594a).intValue();
                int iIntValue3 = ((Number) pVar.f128595b).intValue();
                int i17 = i15 - 4;
                if (iIntValue2 == 0) {
                    if (z14) {
                        string = context.getString(R.string.pregnancy_trimester) + StringUtils.SPACE + i17 + " • " + context.getString(R.string.pregnancy_day_short, String.valueOf(iIntValue3));
                    } else {
                        string = context.getString(R.string.mct_num_days_label, String.valueOf(iIntValue3));
                        string.getClass();
                    }
                } else if (z14) {
                    string = context.getString(R.string.pregnancy_trimester) + StringUtils.SPACE + i17 + " • " + context.getString(R.string.pregnancy_week_day_short, String.valueOf(iIntValue2), String.valueOf(iIntValue3));
                } else {
                    string = context.getString(R.string.pregnancy_week_day_short, String.valueOf(iIntValue2), String.valueOf(iIntValue3));
                    string.getClass();
                }
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (num != null) {
                iIntValue = num.intValue();
            }
            spannableStringBuilder2.append((CharSequence) x1.b(x1Var, string, iIntValue));
            return spannableStringBuilder2;
        }

        public static String f(Context context, double d14) {
            String strC1 = l3.a.C1(l3.f23124b, context, d14, ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y(), false, null, 56);
            if (!TextUtils.isEmpty(strC1)) {
                return strC1;
            }
            String string = context.getString(R.string.no_value);
            string.getClass();
            return string;
        }

        public static boolean g(m mVar) {
            if (mVar != null) {
                return (mVar.getDeliveryDate() == null && mVar.getEndDate() == null) ? false : true;
            }
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0023 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:12:0x0025 A[RETURN] */
        public static boolean h() {
            l.f68084a.getClass();
            for (String str : l.a.a().t1()) {
                if ("PREGNANCY".equals(str)) {
                    if (str != null) {
                        return true;
                    }
                    return false;
                }
            }
            str = null;
            if (str != null) {
                return true;
            }
            return false;
        }

        public static double i(double d14) {
            l3.f23124b.getClass();
            return Math.min(27.7d, l3.a.T1(d14 * 0.0555d, 1));
        }

        private a() {
        }
    }
}
