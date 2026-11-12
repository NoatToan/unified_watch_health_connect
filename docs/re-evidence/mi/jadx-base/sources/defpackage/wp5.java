package defpackage;

import cn.hutool.core.date.format.FastDateFormat;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.miui.tsmclient.util.StringUtils;
import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class wp5 {
    public static final FastDateFormat D;
    public static final FastDateFormat E;
    public static final FastDateFormat F;
    public static final FastDateFormat G;
    public static final FastDateFormat H;
    public static final FastDateFormat I;
    public static final FastDateFormat J;
    public static final FastDateFormat K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f38202a = Pattern.compile("\\d{4}-\\d{1,2}-\\d{1,2}(\\s\\d{1,2}:\\d{1,2}(:\\d{1,2})?)?(.\\d{1,3})?");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FastDateFormat f38203b = FastDateFormat.getInstance("yyyy-MM");
    public static final DateTimeFormatter c = a("yyyy-MM");
    public static final FastDateFormat d = FastDateFormat.getInstance("yyyyMM");
    public static final DateTimeFormatter e = a("yyyyMM");
    public static final FastDateFormat f = FastDateFormat.getInstance("yyyy-MM-dd");
    public static final DateTimeFormatter g = a("yyyy-MM-dd");
    public static final FastDateFormat h = FastDateFormat.getInstance(StringUtils.EXPECT_TIME_FORMAT);
    public static final DateTimeFormatter i = a(StringUtils.EXPECT_TIME_FORMAT);
    public static final FastDateFormat j = FastDateFormat.getInstance("yyyy-MM-dd HH:mm");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final DateTimeFormatter f38204k = a("yyyy-MM-dd HH:mm");
    public static final FastDateFormat l = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
    public static final DateTimeFormatter m = a("yyyy-MM-dd HH:mm:ss");
    public static final FastDateFormat n = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.SSS");
    public static final DateTimeFormatter o = a("yyyy-MM-dd HH:mm:ss.SSS");
    public static final FastDateFormat p = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss,SSS");
    public static final DateTimeFormatter q = a("yyyy-MM-dd HH:mm:ss,SSS");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final FastDateFormat f38205r = FastDateFormat.getInstance("yyyy年MM月dd日");
    public static final DateTimeFormatter s = a("yyyy-MM-dd HH:mm:ss,SSS");
    public static final FastDateFormat t = FastDateFormat.getInstance("yyyy年MM月dd日HH时mm分ss秒");
    public static final DateTimeFormatter u = a("yyyy年MM月dd日HH时mm分ss秒");
    public static final FastDateFormat v = FastDateFormat.getInstance("yyyyMMdd");
    public static final DateTimeFormatter w = a("yyyyMMdd");
    public static final FastDateFormat x = FastDateFormat.getInstance(StringUtils.SOURCE_TIME_FORMAT);
    public static final DateTimeFormatter y = a(StringUtils.SOURCE_TIME_FORMAT);
    public static final FastDateFormat z = FastDateFormat.getInstance("yyyyMMddHHmmss");
    public static final DateTimeFormatter A = a("yyyyMMddHHmmss");
    public static final FastDateFormat B = FastDateFormat.getInstance("yyyyMMddHHmmssSSS");
    public static final DateTimeFormatter C = a("yyyyMMddHHmmssSSS");

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Locale locale = Locale.US;
        D = FastDateFormat.getInstance("EEE, dd MMM yyyy HH:mm:ss z", timeZone, locale);
        E = FastDateFormat.getInstance("EEE MMM dd HH:mm:ss zzz yyyy", locale);
        F = FastDateFormat.getInstance(ParserHelper.DATA_FORMAT4, TimeZone.getTimeZone("UTC"));
        G = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ss.SSS", TimeZone.getTimeZone("UTC"));
        H = FastDateFormat.getInstance(ParserHelper.DATA_FORMAT3, TimeZone.getTimeZone("UTC"));
        I = FastDateFormat.getInstance("yyyy-MM-dd'T'HH:mm:ssZ", TimeZone.getTimeZone("UTC"));
        J = FastDateFormat.getInstance(ParserHelper.DATA_FORMAT, TimeZone.getTimeZone("UTC"));
        K = FastDateFormat.getInstance(StdDateFormat.DATE_FORMAT_STR_ISO8601, TimeZone.getTimeZone("UTC"));
    }

    public static DateTimeFormatter a(String str) {
        return DateTimeFormatter.ofPattern(str, Locale.getDefault()).withZone(ZoneId.systemDefault());
    }
}
