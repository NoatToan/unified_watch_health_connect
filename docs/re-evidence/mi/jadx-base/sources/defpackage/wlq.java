package defpackage;

import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.a;
import com.mipay.sdk.Mipay;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes4.dex */
public final class wlq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f38110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38111b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final byte[] f;
    public static final Pattern g;
    public static final Pattern h;
    public static final Pattern i;
    public static final Pattern j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static HashMap<String, String> f38112k;
    public static final String[] l;
    public static final String[] m;
    public static final int[] n;
    public static final int[] o;

    static {
        int i2 = 30;
        String str = Build.VERSION.CODENAME;
        if ("S".equals(str)) {
            i2 = 31;
        } else if (!"R".equals(str)) {
            i2 = Build.VERSION.SDK_INT;
        }
        f38110a = i2;
        String str2 = Build.DEVICE;
        f38111b = str2;
        String str3 = Build.MANUFACTURER;
        c = str3;
        String str4 = Build.MODEL;
        d = str4;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 17 + String.valueOf(str4).length() + String.valueOf(str3).length());
        sb.append(str2);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i2);
        e = sb.toString();
        f = new byte[0];
        g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        i = Pattern.compile("%([A-Fa-f0-9]{2})");
        j = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", Language.CS, "dut", "nl", "ger", "de", "gre", Language.EL, "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", Language.RO, "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", ServerConstants.OLD_TW_COUNTRY_CODE, "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, SportReportBaseParser.ReportType.avgFreq, ErrorCode.ERROR_SP_NOTICE_NOT_READY, 238, 233, 252, VibrateModeSetViewModel.DEFAULT_BBJI, 242, 245, 216, SportReportBaseParser.ReportType.targetValueNumber, 214, 209, SportReportBaseParser.ReportType.oxygenConcentration, SportReportBaseParser.ReportType.oxygenPartialPressureThreshold, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, SportReportBaseParser.ReportType.avgDivingDepth, SportReportBaseParser.ReportType.descentCount, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, SportReportBaseParser.ReportType.entryTime, 176, 185, SportReportBaseParser.ReportType.maxWaterTemperature, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, SportReportBaseParser.ReportType.minWaterTemperature, SportReportBaseParser.ReportType.exitTime, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, SportReportBaseParser.ReportType.divingOTU, SportReportBaseParser.ReportType.algorithmDataSource, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, SportReportBaseParser.ReportType.avgDescentRate, SportReportBaseParser.ReportType.avgAscentRate, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, SportReportBaseParser.ReportType.divingCNS, SportReportBaseParser.ReportType.noFlyDuration, 204, 203, 230, SportReportBaseParser.ReportType.maxFreq, ErrorCode.ERROR_SP_NOTICE_INCOMPATIBLE, 239, 250, 253, 244, 243};
    }

    public static Handler A(Handler.Callback callback) {
        return w(P(), callback);
    }

    public static <T> T[] A0(T[] tArr, int i2) {
        rk1.a(i2 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i2);
    }

    public static HashMap<String, String> B() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> map = new HashMap<>(iSOLanguages.length + l.length);
        int i2 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = l;
            if (i2 >= strArr.length) {
                return map;
            }
            map.put(strArr[i2], strArr[i2 + 1]);
            i2 += 2;
        }
    }

    public static <T> T[] B0(T[] tArr, int i2, int i3) {
        rk1.a(i2 >= 0);
        rk1.a(i3 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i2, i3);
    }

    public static Uri C(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = j.matcher(fk1.e(path));
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    public static long C0(String str) throws ParserException {
        Matcher matcher = g.matcher(str);
        if (!matcher.matches()) {
            String strValueOf = String.valueOf(str);
            throw new ParserException(strValueOf.length() != 0 ? "Invalid date/time format: ".concat(strValueOf) : new String("Invalid date/time format: "));
        }
        int i2 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i2 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i2 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            String strValueOf2 = String.valueOf(matcher.group(8));
            gregorianCalendar.set(14, new BigDecimal(strValueOf2.length() != 0 ? "0.".concat(strValueOf2) : new String("0.")).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i2 != 0 ? timeInMillis - ((long) (i2 * 60000)) : timeInMillis;
    }

    public static String D(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static long D0(String str) {
        Matcher matcher = h.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d2 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d3 = d2 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d4 = d3 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d5 = d4 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d6 = d5 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j2 = (long) ((d6 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return zIsEmpty ? -j2 : j2;
    }

    public static String E(byte[] bArr) {
        return new String(bArr, bu3.c);
    }

    public static boolean E0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static String F(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, bu3.c);
    }

    public static boolean F0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static int G(int i2) {
        switch (i2) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i3 = f38110a;
                return (i3 < 23 && i3 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static <T> void G0(List<T> list, int i2, int i3) {
        if (i2 < 0 || i3 > list.size() || i2 > i3) {
            throw new IllegalArgumentException();
        }
        if (i2 != i3) {
            list.subList(i2, i3).clear();
        }
    }

    public static int H(ByteBuffer byteBuffer, int i2) {
        int i3 = byteBuffer.getInt(i2);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i3 : Integer.reverseBytes(i3);
    }

    public static long H0(long j2, long j3, long j4) {
        if (j4 >= j3 && j4 % j3 == 0) {
            return j2 / (j4 / j3);
        }
        if (j4 < j3 && j3 % j4 == 0) {
            return j2 * (j3 / j4);
        }
        return (long) (j2 * (j3 / j4));
    }

    public static byte[] I(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) ((Character.digit(str.charAt(i3), 16) << 4) + Character.digit(str.charAt(i3 + 1), 16));
        }
        return bArr;
    }

    public static long[] I0(List<Long> list, long j2, long j3) {
        int size = list.size();
        long[] jArr = new long[size];
        int i2 = 0;
        if (j3 >= j2 && j3 % j2 == 0) {
            long j4 = j3 / j2;
            while (i2 < size) {
                jArr[i2] = list.get(i2).longValue() / j4;
                i2++;
            }
        } else if (j3 >= j2 || j2 % j3 != 0) {
            double d2 = j2 / j3;
            while (i2 < size) {
                jArr[i2] = (long) (list.get(i2).longValue() * d2);
                i2++;
            }
        } else {
            long j5 = j2 / j3;
            while (i2 < size) {
                jArr[i2] = list.get(i2).longValue() * j5;
                i2++;
            }
        }
        return jArr;
    }

    public static int J(String str, int i2) {
        int i3 = 0;
        for (String str2 : O0(str)) {
            if (i2 == ayf.n(str2)) {
                i3++;
            }
        }
        return i3;
    }

    public static void J0(long[] jArr, long j2, long j3) {
        int i2 = 0;
        if (j3 >= j2 && j3 % j2 == 0) {
            long j4 = j3 / j2;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j4;
                i2++;
            }
            return;
        }
        if (j3 >= j2 || j2 % j3 != 0) {
            double d2 = j2 / j3;
            while (i2 < jArr.length) {
                jArr[i2] = (long) (jArr[i2] * d2);
                i2++;
            }
            return;
        }
        long j5 = j2 / j3;
        while (i2 < jArr.length) {
            jArr[i2] = jArr[i2] * j5;
            i2++;
        }
    }

    public static String K(String str, int i2) {
        String[] strArrO0 = O0(str);
        if (strArrO0.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrO0) {
            if (i2 == ayf.n(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static void K0(Throwable th) throws Throwable {
        L0(th);
    }

    public static String L(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < objArr.length; i2++) {
            sb.append(objArr[i2].getClass().getSimpleName());
            if (i2 < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static <T extends Throwable> void L0(Throwable th) throws Throwable {
        throw th;
    }

    public static String M(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return fk1.g(networkCountryIso);
            }
        }
        return fk1.g(Locale.getDefault().getCountry());
    }

    public static String[] M0(String str, String str2) {
        return str.split(str2, -1);
    }

    public static Point N(Context context) {
        return O(context, ((WindowManager) rk1.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay());
    }

    public static String[] N0(String str, String str2) {
        return str.split(str2, 2);
    }

    public static Point O(Context context, Display display) {
        int i2 = f38110a;
        if (i2 <= 29 && display.getDisplayId() == 0 && r0(context)) {
            if ("Sony".equals(c) && d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
            String strG0 = i2 < 28 ? g0("sys.display-size") : g0("vendor.display-size");
            if (!TextUtils.isEmpty(strG0)) {
                try {
                    String[] strArrM0 = M0(strG0.trim(), "x");
                    if (strArrM0.length == 2) {
                        int i3 = Integer.parseInt(strArrM0[0]);
                        int i4 = Integer.parseInt(strArrM0[1]);
                        if (i3 > 0 && i4 > 0) {
                            return new Point(i3, i4);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                String strValueOf = String.valueOf(strG0);
                toe.c("Util", strValueOf.length() != 0 ? "Invalid display size: ".concat(strValueOf) : new String("Invalid display size: "));
            }
        }
        Point point = new Point();
        int i5 = f38110a;
        if (i5 >= 23) {
            S(display, point);
        } else if (i5 >= 17) {
            R(display, point);
        } else {
            Q(display, point);
        }
        return point;
    }

    public static String[] O0(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : M0(str.trim(), "(\\s*,\\s*)");
    }

    public static Looper P() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static ComponentName P0(Context context, Intent intent) {
        return f38110a >= 26 ? context.startForegroundService(intent) : context.startService(intent);
    }

    public static void Q(Display display, Point point) {
        display.getSize(point);
    }

    public static long Q0(long j2, long j3, long j4) {
        long j5 = j2 - j3;
        return ((j2 ^ j5) & (j3 ^ j2)) < 0 ? j4 : j5;
    }

    @RequiresApi(17)
    public static void R(Display display, Point point) {
        display.getRealSize(point);
    }

    public static boolean R0(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    @RequiresApi(23)
    public static void S(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static byte[] S0(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    public static String T(Locale locale) {
        return f38110a >= 21 ? U(locale) : locale.toString();
    }

    public static long T0(int i2, int i3) {
        return U0(i3) | (U0(i2) << 32);
    }

    @RequiresApi(21)
    public static String U(Locale locale) {
        return locale.toLanguageTag();
    }

    public static long U0(int i2) {
        return ((long) i2) & 4294967295L;
    }

    public static long V(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 * ((double) f2));
    }

    public static CharSequence V0(CharSequence charSequence, int i2) {
        return charSequence.length() <= i2 ? charSequence : charSequence.subSequence(0, i2);
    }

    public static long W(long j2) {
        return j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime();
    }

    public static String W0(String str) {
        int length = str.length();
        int iEnd = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) == '%') {
                i2++;
            }
        }
        if (i2 == 0) {
            return str;
        }
        int i4 = length - (i2 * 2);
        StringBuilder sb = new StringBuilder(i4);
        Matcher matcher = i.matcher(str);
        while (i2 > 0 && matcher.find()) {
            char c2 = (char) Integer.parseInt((String) rk1.e(matcher.group(1)), 16);
            sb.append((CharSequence) str, iEnd, matcher.start());
            sb.append(c2);
            iEnd = matcher.end();
            i2--;
        }
        if (iEnd < length) {
            sb.append((CharSequence) str, iEnd, length);
        }
        if (sb.length() != i4) {
            return null;
        }
        return sb.toString();
    }

    public static int X(int i2) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 2;
        }
        if (i2 != 24) {
            return i2 != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    public static void X0(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static Format Y(int i2, int i3, int i4) {
        return new Format.b().e0("audio/raw").H(i3).f0(i4).Y(i2).E();
    }

    public static int Z(int i2, int i3) {
        if (i2 != 2) {
            if (i2 == 3) {
                return i3;
            }
            if (i2 != 4) {
                if (i2 != 268435456) {
                    if (i2 == 536870912) {
                        return i3 * 3;
                    }
                    if (i2 != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i3 * 4;
        }
        return i3 * 2;
    }

    public static long a0(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 / ((double) f2));
    }

    public static long b(long j2, long j3, long j4) {
        long j5 = j2 + j3;
        return ((j2 ^ j5) & (j3 ^ j5)) < 0 ? j4 : j5;
    }

    public static int b0(int i2) {
        if (i2 == 13) {
            return 1;
        }
        switch (i2) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static String c0(StringBuilder sb, Formatter formatter, long j2) {
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        String str = j2 < 0 ? "-" : "";
        long jAbs = (Math.abs(j2) + 500) / 1000;
        long j3 = jAbs % 60;
        long j4 = (jAbs / 60) % 60;
        long j5 = jAbs / TimeDateUtil.TIME_HOUR;
        sb.setLength(0);
        return j5 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3)).toString();
    }

    public static <T extends Comparable<? super T>> int d(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i2;
        int i3;
        int iBinarySearch = Collections.binarySearch(list, t);
        if (iBinarySearch < 0) {
            i3 = ~iBinarySearch;
        } else {
            int size = list.size();
            while (true) {
                i2 = iBinarySearch + 1;
                if (i2 >= size || list.get(i2).compareTo(t) != 0) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z ? iBinarySearch : i2;
        }
        return z2 ? Math.min(list.size() - 1, i3) : i3;
    }

    public static String[] d0() {
        String[] strArrE0 = e0();
        for (int i2 = 0; i2 < strArrE0.length; i2++) {
            strArrE0[i2] = x0(strArrE0[i2]);
        }
        return strArrE0;
    }

    public static int e(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int i3;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i3 = ~iBinarySearch;
        } else {
            while (true) {
                i2 = iBinarySearch + 1;
                if (i2 >= jArr.length || jArr[i2] != j2) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z ? iBinarySearch : i2;
        }
        return z2 ? Math.min(jArr.length - 1, i3) : i3;
    }

    public static String[] e0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return f38110a >= 24 ? f0(configuration) : new String[]{T(configuration.locale)};
    }

    public static int f(rre rreVar, long j2, boolean z, boolean z2) {
        int i2;
        int iC = rreVar.c() - 1;
        int i3 = 0;
        while (i3 <= iC) {
            int i4 = (i3 + iC) >>> 1;
            if (rreVar.b(i4) < j2) {
                i3 = i4 + 1;
            } else {
                iC = i4 - 1;
            }
        }
        if (z && (i2 = iC + 1) < rreVar.c() && rreVar.b(i2) == j2) {
            return i2;
        }
        if (z2 && iC == -1) {
            return 0;
        }
        return iC;
    }

    @RequiresApi(24)
    public static String[] f0(Configuration configuration) {
        return M0(configuration.getLocales().toLanguageTags(), ",");
    }

    public static <T extends Comparable<? super T>> int g(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i2;
        int i3;
        int iBinarySearch = Collections.binarySearch(list, t);
        if (iBinarySearch < 0) {
            i3 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i2 = iBinarySearch - 1;
                if (i2 < 0 || list.get(i2).compareTo(t) != 0) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z ? iBinarySearch : i2;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    public static String g0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            String strValueOf = String.valueOf(str);
            toe.d("Util", strValueOf.length() != 0 ? "Failed to read system property ".concat(strValueOf) : new String("Failed to read system property "), e2);
            return null;
        }
    }

    public static int h(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int iBinarySearch = Arrays.binarySearch(iArr, i2);
        if (iBinarySearch < 0) {
            i4 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i3 = iBinarySearch - 1;
                if (i3 < 0 || iArr[i3] != i2) {
                    break;
                }
                iBinarySearch = i3;
            }
            i4 = z ? iBinarySearch : i3;
        }
        return z2 ? Math.max(0, i4) : i4;
    }

    public static String h0(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        String str3 = Build.VERSION.RELEASE;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append(" (Linux;Android ");
        sb.append(str3);
        sb.append(") ");
        sb.append("ExoPlayerLib/2.14.0");
        return sb.toString();
    }

    public static int i(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int i3;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i3 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i2 = iBinarySearch - 1;
                if (i2 < 0 || jArr[i2] != j2) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z ? iBinarySearch : i2;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    public static byte[] i0(String str) {
        return str.getBytes(bu3.c);
    }

    public static <T> T j(T t) {
        return t;
    }

    public static int j0(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && fk1.a("rtsp", scheme)) {
            return 3;
        }
        String path = uri.getPath();
        if (path == null) {
            return 4;
        }
        return k0(path);
    }

    public static <T> T[] k(T[] tArr) {
        return tArr;
    }

    public static int k0(String str) {
        String strE = fk1.e(str);
        if (strE.endsWith(".mpd")) {
            return 0;
        }
        if (strE.endsWith(".m3u8")) {
            return 2;
        }
        Matcher matcher = j.matcher(strE);
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup == null) {
            return 1;
        }
        if (strGroup.contains("format=mpd-time-csf")) {
            return 0;
        }
        return strGroup.contains("format=m3u8-aapl") ? 2 : 1;
    }

    public static int l(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static int l0(Uri uri, String str) {
        if (str == null) {
            return j0(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    public static long m(long j2, long j3) {
        return ((j2 + j3) - 1) / j3;
    }

    public static boolean m0(okh okhVar, okh okhVar2, Inflater inflater) {
        if (okhVar.a() <= 0) {
            return false;
        }
        if (okhVar2.b() < okhVar.a()) {
            okhVar2.c(okhVar.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(okhVar.d(), okhVar.e(), okhVar.a());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(okhVar2.d(), iInflate, okhVar2.b() - iInflate);
                if (inflater.finished()) {
                    okhVar2.O(iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    if (iInflate == okhVar2.b()) {
                        okhVar2.c(okhVar2.b() * 2);
                    }
                }
                inflater.reset();
                return false;
            } catch (DataFormatException unused) {
                inflater.reset();
                return false;
            } catch (Throwable th) {
                inflater.reset();
                throw th;
            }
        }
    }

    public static void n(a aVar) {
        if (aVar != null) {
            try {
                aVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean n0(int i2) {
        return i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    public static void o(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean o0(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    public static int p(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public static boolean p0(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static float q(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static boolean q0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static int r(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static boolean r0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService(Mipay.KEY_UI_MODE);
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static long s(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static /* synthetic */ Thread s0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static boolean t(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (c(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int t0(int[] iArr, int i2) {
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (iArr[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    public static int u(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = n[((i4 >>> 24) ^ (bArr[i2] & 255)) & 255] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static String u0(String str) {
        int i2 = 0;
        while (true) {
            String[] strArr = m;
            if (i2 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i2])) {
                String strValueOf = String.valueOf(strArr[i2 + 1]);
                String strValueOf2 = String.valueOf(str.substring(strArr[i2].length()));
                return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
            }
            i2 += 2;
        }
    }

    public static int v(byte[] bArr, int i2, int i3, int i4) {
        while (i2 < i3) {
            i4 = o[i4 ^ (bArr[i2] & 255)];
            i2++;
        }
        return i4;
    }

    public static <T> void v0(List<T> list, int i2, int i3, int i4) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i5 = (i3 - i2) - 1; i5 >= 0; i5--) {
            arrayDeque.addFirst(list.remove(i2 + i5));
        }
        list.addAll(Math.min(i4, list.size()), arrayDeque);
    }

    public static Handler w(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static ExecutorService w0(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: rlq
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return wlq.s0(str, runnable);
            }
        });
    }

    public static Handler x() {
        return y(null);
    }

    public static String x0(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strE = fk1.e(str);
        String str2 = N0(strE, "-")[0];
        if (f38112k == null) {
            f38112k = B();
        }
        String str3 = f38112k.get(str2);
        if (str3 != null) {
            String strValueOf = String.valueOf(strE.substring(str2.length()));
            strE = strValueOf.length() != 0 ? str3.concat(strValueOf) : new String(str3);
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? u0(strE) : strE;
    }

    public static Handler y(Handler.Callback callback) {
        return w((Looper) rk1.i(Looper.myLooper()), callback);
    }

    public static <T> T[] y0(T[] tArr, T t) {
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length + 1);
        objArrCopyOf[tArr.length] = t;
        return (T[]) k(objArrCopyOf);
    }

    public static Handler z() {
        return A(null);
    }

    public static <T> T[] z0(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }
}
