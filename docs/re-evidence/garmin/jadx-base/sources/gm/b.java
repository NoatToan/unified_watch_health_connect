package gm;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.Hours;
import org.joda.time.Minutes;
import org.joda.time.ReadableInstant;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f77986a;

        static {
            int[] iArr = new int[m3.values().length];
            f77986a = iArr;
            try {
                iArr[m3.KILOMETER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77986a[m3.METER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77986a[m3.MILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f77986a[m3.FOOT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f77986a[m3.YARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f77986a[m3.NAUTICAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private b() {
    }

    public static String a(Context context, String str) {
        if (str == null) {
            return context.getString(R.string.no_value_card);
        }
        DateTime dateTimeNow = DateTime.now();
        ReadableInstant readableInstant = DateTime.parse(str);
        DateTime dateTime = new DateTime(readableInstant.getMillis() + ((long) readableInstant.getZone().getOffset(readableInstant)));
        Hours hoursHoursBetween = Hours.hoursBetween(dateTime, dateTimeNow);
        if (hoursHoursBetween.getHours() >= 1) {
            return hoursHoursBetween.getHours() == 1 ? context.getString(R.string.social_elapsed_time_hours_singular) : context.getString(R.string.social_elapsed_time_hours_abr, Integer.valueOf(hoursHoursBetween.getHours()));
        }
        int minutes = Minutes.minutesBetween(dateTime, dateTimeNow).getMinutes();
        return minutes < 2 ? context.getString(R.string.social_elapsed_time_just_now) : context.getString(R.string.social_elapsed_time_minutes_abr, Integer.valueOf(minutes));
    }

    public static String b(Context context, double d14) {
        if (Double.isNaN(d14) || d14 <= 0.0d) {
            return context.getString(R.string.no_value_card);
        }
        if (d14 < 3600.0d) {
            double dRound = Math.round(d14);
            l3.f23124b.getClass();
            return l3.a.s1(dRound, "%d:%02d");
        }
        long jRound = Math.round(d14);
        l3.f23124b.getClass();
        return l3.a.e1(jRound);
    }

    public static SpannableStringBuilder c(Context context, int i14, int i15, String str) {
        int iIndexOf;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.toUpperCase(Locale.getDefault()));
        int length = spannableStringBuilder.length();
        String string = context.getString(R.string.no_value_card);
        if (str.startsWith(string)) {
            iIndexOf = string.length();
        } else if (str.contains(": ")) {
            length = str.indexOf(": ") + 2;
            iIndexOf = 0;
        } else {
            iIndexOf = str.indexOf(32);
        }
        if (iIndexOf != -1) {
            spannableStringBuilder.setSpan(new TextAppearanceSpan(context, i14), iIndexOf, length, 18);
        }
        if (i15 > 0) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(a7.b.getColor(context, i15)), iIndexOf, spannableStringBuilder.length(), 18);
        }
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder d(Context context, String str, String str2) {
        return c(context, R.style.GCMCardSecondaryValueCaption, R.color.gcm_text_secondary, context.getString(R.string.string_space_string_pattern, str, str2));
    }
}
