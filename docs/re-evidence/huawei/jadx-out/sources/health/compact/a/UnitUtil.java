package health.compact.a;

import android.content.Context;
import android.icu.text.MeasureFormat;
import android.icu.text.PluralRules;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.text.style.TextAppearanceSpan;
import androidx.core.util.Supplier;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.UnitUtil;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.FilenameUtils;

/* JADX INFO: loaded from: classes.dex */
public class UnitUtil {
    private static String j;
    public static final long d = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f36670c = "show_imperial_unit_key";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f36668a = "show_weight_unit_key";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ReentrantReadWriteLock f36669b = new ReentrantReadWriteLock();
    private static String e = "";
    private static int h = -1;

    public static double a(double d2) {
        return d2 * 0.036d;
    }

    public static double b(double d2) {
        return d2 / 2.0d;
    }

    public static double c(double d2, int i) {
        double d3;
        if (i == 0) {
            d3 = 2.54d;
        } else if (i == 1) {
            d3 = 0.3048d;
        } else if (i == 2) {
            d3 = 0.9144d;
        } else {
            if (i != 3) {
                return 0.0d;
            }
            d3 = 1.609344d;
        }
        return d2 * d3;
    }

    public static double c(long j2) {
        return j2 / 60000.0d;
    }

    public static double e(double d2, int i) {
        double d3;
        if (i == 0) {
            d3 = 0.3937d;
        } else if (i == 1) {
            d3 = 3.2808d;
        } else if (i == 2) {
            d3 = 1.0936132d;
        } else {
            if (i != 3) {
                return 0.0d;
            }
            d3 = 0.6213712d;
        }
        return d2 * d3;
    }

    public static double h(double d2) {
        return d2 * 2.2046d;
    }

    public static double i(double d2) {
        return d2 * 0.4536d;
    }

    public static double j(double d2) {
        return d2 * 2.0d;
    }

    private UnitUtil() {
    }

    public static int[] g(double d2) {
        int[] iArr = {0, 0};
        double d3 = d2 * 3.2808d;
        int i = (int) d3;
        iArr[0] = i;
        int iRound = (int) Math.round((d3 - ((double) i)) * 12.0d);
        iArr[1] = iRound;
        if (iRound == 12) {
            iArr[0] = iArr[0] + 1;
            iArr[1] = 0;
        }
        return iArr;
    }

    public static void a(String str) {
        if (str != null) {
            com.huawei.hwlogsmodel.LogUtil.d("UnitUtil", "setCloudVersion cloudVersion = ", str);
            j = str;
        }
    }

    public static boolean b() {
        return j();
    }

    public static boolean f() {
        if (!TextUtils.isEmpty(e)) {
            return Boolean.valueOf(e).booleanValue();
        }
        return i();
    }

    public static boolean i() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), f36670c);
        e = strE;
        if (health.compact.a.utils.StringUtils.g(strE)) {
            e = b(f36670c);
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), f36670c, e, null);
        }
        if ("true".equals(e)) {
            return true;
        }
        if ("".equals(e) && j()) {
            b(f36670c, "true");
            e = "true";
            return true;
        }
        b(f36670c, "false");
        e = "false";
        return false;
    }

    public static int e() {
        if (h == -1) {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), f36668a);
            if (health.compact.a.utils.StringUtils.g(strE)) {
                strE = b(f36668a);
                SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), f36668a, String.valueOf(strE), null);
            }
            h = CommonUtil.e(strE, 0);
        }
        int i = h;
        if (i == 0 || (i == 1 && !LanguageUtil.f(BaseApplication.getContext()))) {
            h = f() ? 3 : 2;
        }
        return h;
    }

    public static int c() {
        if (h == -1) {
            final AtomicReference atomicReference = new AtomicReference(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), f36668a));
            if (health.compact.a.utils.StringUtils.g((String) atomicReference.get())) {
                com.huawei.hwlogsmodel.LogUtil.a("UnitUtil", "unitvalue is empty");
                ThreadPoolManager.c().execute(new Runnable() { // from class: lly
                    @Override // java.lang.Runnable
                    public final void run() {
                        UnitUtil.c(atomicReference);
                    }
                });
            }
            h = CommonUtil.e((String) atomicReference.get(), 0);
        }
        int i = h;
        if (i == 0 || (i == 1 && !LanguageUtil.f(BaseApplication.getContext()))) {
            h = f() ? 3 : 2;
        }
        return h;
    }

    public static /* synthetic */ void c(AtomicReference atomicReference) {
        atomicReference.set(b(f36668a));
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), f36668a, String.valueOf(atomicReference), null);
    }

    public static double d(double d2) {
        int iE = e();
        if (iE == 1) {
            return b(d2);
        }
        return iE == 3 ? i(d2) : d2;
    }

    public static double c(double d2) {
        return b(d2, 2);
    }

    public static double a(float f) {
        return b(d(f), 2);
    }

    public static double a(double d2, int i) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            return a(0.0d, i);
        }
        int iC = c();
        if (iC == 1) {
            return d(j(d2), i);
        }
        if (iC == 3) {
            return d(h(d2), i);
        }
        return d(d2, i);
    }

    public static double b(double d2, int i) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            return b(0.0d, i);
        }
        int iE = e();
        if (iE == 1) {
            return d(j(d2), i);
        }
        if (iE == 3) {
            return d(h(d2), i);
        }
        return d(d2, i);
    }

    private static void b(String str, String str2) {
        ReentrantReadWriteLock.WriteLock writeLock = f36669b.writeLock();
        writeLock.lock();
        try {
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), str, str2, null);
            KeyValDbManager.d(BaseApplication.getContext()).b(str, str2);
        } finally {
            writeLock.unlock();
        }
    }

    private static String b(String str) {
        ReentrantReadWriteLock.ReadLock lock = f36669b.readLock();
        lock.lock();
        try {
            String strC = KeyValDbManager.d(BaseApplication.getContext()).c(str);
            if (TextUtils.isEmpty(strC)) {
                strC = DbManager.c(str);
                KeyValDbManager.d(BaseApplication.getContext()).b(str, strC);
            }
            return strC;
        } finally {
            lock.unlock();
        }
    }

    public static boolean d() {
        String strB = b(f36670c);
        if ("true".equals(strB)) {
            return true;
        }
        if ("".equals(strB) && j()) {
            b(f36670c, "true");
            return true;
        }
        b(f36670c, "false");
        return false;
    }

    private static boolean j() {
        if (BaseApplication.getContext() == null) {
            return false;
        }
        return "US".equalsIgnoreCase(BaseApplication.getContext().getResources().getConfiguration().locale.getCountry());
    }

    public static void b(String str, final boolean z) {
        com.huawei.hwlogsmodel.LogUtil.a("UnitUtil", "setIsShowImperialUnit is form ", str, " isImperial ", Boolean.valueOf(z));
        e = "";
        h = -1;
        b(f36670c, String.valueOf(z));
        if (Objects.equals(str, "UnitSettingActivity")) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: lma
                @Override // java.lang.Runnable
                public final void run() {
                    UnitUtil.a(z);
                }
            });
        }
    }

    public static /* synthetic */ void a(boolean z) {
        int iE = e();
        com.huawei.hwlogsmodel.LogUtil.a("UnitUtil", "setIsShowImperialUnit showWeightUnit ", Integer.valueOf(iE), " isImperial ", Boolean.valueOf(z));
        if (!z) {
            if (iE == 3) {
                i(2);
            }
        } else if (iE == 1 || iE == 2) {
            i(3);
        }
    }

    public static void a(int i) {
        ReentrantReadWriteLock.WriteLock writeLock = f36669b.writeLock();
        writeLock.lock();
        try {
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), f36668a, String.valueOf(i), null);
            KeyValDbManager.d(BaseApplication.getContext()).b(f36668a, String.valueOf(i));
            h = i;
        } finally {
            writeLock.unlock();
        }
    }

    public static void i(final int i) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: llz
            @Override // java.lang.Runnable
            public final void run() {
                UnitUtil.d(i);
            }
        });
        a(i);
    }

    public static /* synthetic */ void d(int i) {
        HiUserPreference hiUserPreference = new HiUserPreference("custom.weight_unit", String.valueOf(i));
        Context contextB = com.huawei.haf.application.BaseApplication.b();
        HiHealthManager.d(contextB).setUserPreference(hiUserPreference);
        HiHealthNativeApi.a(contextB).synCloud(HiSyncOption.getAutoSyncOption(10026), null);
    }

    public static boolean a() {
        boolean zEquals;
        if (ProcessUtil.b()) {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "temperature_unit");
            com.huawei.hwlogsmodel.LogUtil.a("UnitUtil", "isShowCelsiusUnit unitValue:", strE);
            if (!health.compact.a.utils.StringUtils.g(strE)) {
                return "true".equals(strE) || "".equals(strE);
            }
            String strB = b("show_temperature_unit_key");
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "temperature_unit", String.valueOf(strB), null);
            zEquals = "false".equals(strB);
        } else {
            String strB2 = b("show_temperature_unit_key");
            com.huawei.hwlogsmodel.LogUtil.a("UnitUtil", "isShowCelsiusUnit getUnitValue:", strB2);
            zEquals = "false".equals(strB2);
        }
        return !zEquals;
    }

    public static void d(boolean z) {
        com.huawei.hwlogsmodel.LogUtil.a("UnitUtil", "setShowCelsiusUnit isCelsius:", Boolean.valueOf(z));
        ReentrantReadWriteLock.WriteLock writeLock = f36669b.writeLock();
        writeLock.lock();
        try {
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "temperature_unit", String.valueOf(z), null);
            b("show_temperature_unit_key", String.valueOf(z));
        } finally {
            writeLock.unlock();
        }
    }

    public static String e(Calendar calendar, int i) {
        String dateTime;
        if (calendar == null) {
            com.huawei.hwlogsmodel.LogUtil.j("UnitUtil", "formatDateAndTime error, calendar is null");
            dateTime = "";
        } else {
            dateTime = DateUtils.formatDateTime(BaseApplication.getContext(), calendar.getTimeInMillis(), i);
        }
        com.huawei.hwlogsmodel.LogUtil.d("UnitUtil", "formatDateAndTime myDateStr = ", dateTime);
        return dateTime;
    }

    public static String a(Date date, int i) {
        String dateTime;
        if (date == null) {
            com.huawei.hwlogsmodel.LogUtil.j("UnitUtil", "formatDateAndTime error, date is null");
            dateTime = "";
        } else {
            dateTime = DateUtils.formatDateTime(BaseApplication.getContext(), date.getTime(), i);
        }
        com.huawei.hwlogsmodel.LogUtil.d("UnitUtil", "formatDateAndTime myDateStr = ", dateTime);
        return dateTime;
    }

    public static String d(String str, long j2) {
        if (str != null) {
            return new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), str)).format(Long.valueOf(j2));
        }
        return "";
    }

    public static String b(int i) {
        String elapsedTime;
        StringBuilder sb = new StringBuilder(10);
        Formatter formatter = new Formatter(new StringBuilder(10), Locale.getDefault());
        long j2 = i;
        long j3 = d;
        if (j2 < j3 || j2 >= TimeUnit.HOURS.toSeconds(10L) || DateUtils.formatElapsedTime(j3).length() == DateUtils.formatElapsedTime(TimeUnit.HOURS.toSeconds(10L)).length()) {
            elapsedTime = DateUtils.formatElapsedTime(sb, j2);
        } else {
            elapsedTime = formatter.format("%d%s", 0, DateUtils.formatElapsedTime(sb, j2)).toString();
        }
        if (elapsedTime != null) {
            return LanguageUtil.r(BaseApplication.getContext()) ? elapsedTime.replace(FilenameUtils.EXTENSION_SEPARATOR, ':') : elapsedTime;
        }
        return "";
    }

    public static String e(int i) {
        String elapsedTime;
        StringBuilder sb = new StringBuilder(10);
        Formatter formatter = new Formatter(new StringBuilder(10), Locale.getDefault());
        if (i < 3600) {
            elapsedTime = formatter.format("%02d:%s", 0, DateUtils.formatElapsedTime(sb, i)).toString();
        } else {
            elapsedTime = (i >= 36000 || DateUtils.formatElapsedTime(3600L).length() == DateUtils.formatElapsedTime(36000L).length()) ? DateUtils.formatElapsedTime(sb, i) : formatter.format("%d%s", 0, DateUtils.formatElapsedTime(sb, i)).toString();
        }
        if (elapsedTime != null) {
            return LanguageUtil.r(BaseApplication.getContext()) ? elapsedTime.replace(FilenameUtils.EXTENSION_SEPARATOR, ':') : elapsedTime;
        }
        return "";
    }

    public static String c(int i) {
        String elapsedTime;
        StringBuilder sb = new StringBuilder(10);
        Formatter formatter = new Formatter(new StringBuilder(10), Locale.getDefault());
        if (i < 3600) {
            elapsedTime = formatter.format("%02d:%s", 0, DateUtils.formatElapsedTime(sb, i)).toString();
            if (elapsedTime.contains(":")) {
                elapsedTime = elapsedTime.split(":")[0] + ":" + elapsedTime.split(":")[1];
            }
        } else if (i < 36000) {
            if (DateUtils.formatElapsedTime(3600L).length() != DateUtils.formatElapsedTime(36000L).length()) {
                elapsedTime = formatter.format("%d%s", 0, DateUtils.formatElapsedTime(sb, i)).toString();
                if (elapsedTime.contains(":")) {
                    elapsedTime = elapsedTime.split(":")[0] + ":" + elapsedTime.split(":")[1];
                }
            } else {
                elapsedTime = DateUtils.formatElapsedTime(sb, i);
                if (elapsedTime.contains(":")) {
                    elapsedTime = elapsedTime.split(":")[0] + ":" + elapsedTime.split(":")[1];
                }
            }
        } else {
            elapsedTime = DateUtils.formatElapsedTime(sb, i);
            if (elapsedTime.contains(":")) {
                elapsedTime = elapsedTime.split(":")[0] + ":" + elapsedTime.split(":")[1];
            }
        }
        return LanguageUtil.r(BaseApplication.getContext()) ? elapsedTime.replace(FilenameUtils.EXTENSION_SEPARATOR, ':') : elapsedTime;
    }

    public static double d(double d2, int i) {
        if (i < 0 || i > 2) {
            ReleaseLogUtil.d("R_UnitUtil", "getNumberRoundHalfUp fractionDigit ", Integer.valueOf(i));
            return d2;
        }
        try {
            return new BigDecimal(Double.toString(d2)).setScale(i, RoundingMode.HALF_UP).doubleValue();
        } catch (Exception e2) {
            ReleaseLogUtil.b("R_UnitUtil", "getNumberRoundHalfUp exception ", ExceptionUtils.c(e2));
            return d2;
        }
    }

    public static double d(float f) {
        return new BigDecimal(String.valueOf(f)).doubleValue();
    }

    private static int f(double d2) {
        if (Math.abs(d2 - Math.floor(d2)) >= 1.0E-6d) {
            return 100;
        }
        return (int) d2;
    }

    @Deprecated
    public static int e(double d2) {
        return f(d2);
    }

    public static int b(double d2, Locale locale) {
        PluralRules pluralRulesForLocale = PluralRules.forLocale(locale);
        if (pluralRulesForLocale == null) {
            ReleaseLogUtil.d("UnitUtil", "getQuantity pluralRules is null");
            return -1;
        }
        String strSelect = pluralRulesForLocale.select(d2);
        if (TextUtils.isEmpty(strSelect)) {
            ReleaseLogUtil.d("UnitUtil", "getQuantity type ", strSelect);
            return -1;
        }
        Collection<Double> samples = pluralRulesForLocale.getSamples(strSelect);
        if (CollectionUtils.a(samples)) {
            ReleaseLogUtil.d("UnitUtil", "getQuantity sampleList ", samples);
            return -1;
        }
        Double next = samples.iterator().next();
        if (next == null) {
            ReleaseLogUtil.d("UnitUtil", "getQuantity doubleValue is null");
            return -1;
        }
        return next.intValue();
    }

    public static String b(double d2, int i, int i2, Supplier<Boolean> supplier) {
        return c(d2, i, i2, i2, supplier);
    }

    public static String c(double d2, int i, int i2, int i3, Supplier<Boolean> supplier) {
        if (i == 1) {
            NumberFormat numberFormat = NumberFormat.getInstance();
            try {
                numberFormat.setRoundingMode(RoundingMode.HALF_UP);
            } catch (Exception unused) {
                com.huawei.hwlogsmodel.LogUtil.e("UnitUtil", "getNumberFormat Exception");
            }
            if (i2 >= 0 && i3 >= 0) {
                numberFormat.setMaximumFractionDigits(i3);
                numberFormat.setMinimumFractionDigits(i2);
            }
            if (LanguageUtil.c(BaseApplication.getContext()) || (supplier != null && supplier.get().booleanValue())) {
                numberFormat.setMinimumFractionDigits(0);
            }
            return numberFormat.format(d2);
        }
        if (i == 2) {
            NumberFormat percentInstance = NumberFormat.getPercentInstance();
            try {
                percentInstance.setRoundingMode(RoundingMode.HALF_UP);
            } catch (Exception e2) {
                com.huawei.hwlogsmodel.LogUtil.e("UnitUtil", "getNumberFormat ", ExceptionUtils.c(e2));
            }
            if (i2 >= 0 && i3 >= 0) {
                percentInstance.setMaximumFractionDigits(i3);
                percentInstance.setMinimumFractionDigits(i2);
            }
            if (LanguageUtil.c(BaseApplication.getContext()) || (supplier != null && supplier.get().booleanValue())) {
                percentInstance.setMinimumFractionDigits(0);
            }
            return percentInstance.format(d2 / 100.0d);
        }
        return "";
    }

    public static String c(double d2, int i, int i2, boolean z) {
        if (i != 1) {
            if (i == 2) {
                return e(d2, i, i2);
            }
            return "";
        }
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        numberFormat.setGroupingUsed(z);
        numberFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (i2 >= 0) {
            numberFormat.setMaximumFractionDigits(i2);
            numberFormat.setMinimumFractionDigits(i2);
        }
        if (LanguageUtil.c(BaseApplication.getContext())) {
            numberFormat.setMinimumFractionDigits(0);
        }
        return numberFormat.format(d2);
    }

    public static String e(double d2, int i, int i2) {
        return b(d2, i, i2, null);
    }

    public static String a(Locale locale, MeasureFormat.FormatWidth formatWidth, Number number, MeasureUnit measureUnit) {
        return MeasureFormat.getInstance(locale, formatWidth).format(new Measure(number, measureUnit));
    }

    public static String e(MeasureFormat.FormatWidth formatWidth, Number number, MeasureUnit measureUnit) {
        return a(Locale.getDefault(), formatWidth, number, measureUnit);
    }

    public static String a(Number number, MeasureUnit measureUnit) {
        return e(MeasureFormat.FormatWidth.WIDE, number, measureUnit);
    }

    public static SpannableString b(Context context, String str, String str2, int i, int i2) {
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new TextAppearanceSpan(context, i2), 0, spannableString.toString().length(), 33);
        Matcher matcher = Pattern.compile(str, 2).matcher(spannableString);
        while (matcher.find()) {
            spannableString.setSpan(new TextAppearanceSpan(context, i), matcher.start(), matcher.end(), 33);
        }
        return spannableString;
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            com.huawei.hwlogsmodel.LogUtil.j("UnitUtil", "toWideChar input is null");
            return "";
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c2 = charArray[i];
            if (c2 == 12288) {
                charArray[i] = ' ';
            } else if (c2 > 65280 && c2 < 65375) {
                charArray[i] = (char) (c2 - 65248);
            }
        }
        return new String(charArray);
    }
}
