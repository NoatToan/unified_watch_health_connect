package com.google.android.exoplayer2.util;

import android.app.Activity;
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
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseLongArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import com.baseflow.permissionhandler.m;
import com.facebook.internal.ServerProtocol;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import com.huami.account.ui.areas.SelectAreaActivity;
import com.huami.applet.AppletConfig;
import com.huami.ecg.core.model.constant.EcgConst;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.sleepassistant.lib.utils.TimeUtils;
import com.unionpay.tsmservice.data.Constant;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.profile.base.Mtu;
import com.xiaomi.hm.health.bt.profile.page.PageType;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
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
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Inflater;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.cybergarage.upnp.Argument;

/* JADX INFO: loaded from: classes3.dex */
public final class Util {
    public static final String DEVICE;
    public static final String DEVICE_DEBUG_INFO;
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final String MANUFACTURER;
    public static final String MODEL;
    public static final int SDK_INT;
    private static final String a = "Util";
    private static final Pattern b;
    private static final Pattern c;
    private static final Pattern d;
    private static final Pattern e;
    private static final String f = "format=m3u8-aapl";
    private static final String g = "format=mpd-time-csf";

    @Nullable
    private static HashMap<String, String> h;
    private static final String[] i;
    private static final String[] j;
    private static final int[] k;
    private static final int[] l;

    static {
        int i2;
        String str = Build.VERSION.CODENAME;
        if (ExifInterface.LATITUDE_SOUTH.equals(str)) {
            i2 = 31;
        } else {
            i2 = "R".equals(str) ? 30 : Build.VERSION.SDK_INT;
        }
        SDK_INT = i2;
        String str2 = Build.DEVICE;
        DEVICE = str2;
        String str3 = Build.MANUFACTURER;
        MANUFACTURER = str3;
        String str4 = Build.MODEL;
        MODEL = str4;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 17 + String.valueOf(str4).length() + String.valueOf(str3).length());
        sb.append(str2);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i2);
        DEVICE_DEBUG_INFO = sb.toString();
        EMPTY_BYTE_ARRAY = new byte[0];
        b = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        c = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        d = Pattern.compile("%([A-Fa-f0-9]{2})");
        e = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        i = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", Language.CS, "dut", "nl", "ger", "de", "gre", Language.EL, "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", Language.RO, "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", Argument.IN, "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", Constants.DATA_KEY_HR, "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        j = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        k = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, Constant.PLAIN_TEXT_MAX_LENGTH, 216, SelectAreaActivity.REQUEST_SELECT_AREA_ONLY, FTPCodes.HELP_MESSAGE, m.c, 196, com.huami.widget.wheelview.Constant.WEIGHT_DEFAULT_IMPERIAL, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, DataTypeSource.SPORT_TYPE_SHOOT, DataTypeSource.SPORT_TYPE_DISCO, 189, 199, 192, 201, 206, 219, 220, 213, m.d, 255, 248, 241, 246, FTPCodes.ENTER_PASSIVE_MODE, 228, 237, EcgConst.ECG_FULL_MEASURE_SECOND_TIME, 183, DataTypeSource.SPORT_TYPE_BRIDGE, DataTypeSource.SPORT_TYPE_MODERN_DANCE, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, DataTypeSource.SPORT_TYPE_BUNGEE_JUMPING, DataTypeSource.SPORT_TYPE_NO_GPS_SOCCER, DataTypeSource.SPORT_TYPE_BOULDERING, DataTypeSource.SPORT_TYPE_CHESS, 170, 163, 164, 249, 254, Mtu.ATT_MTU_MAX, 240, AppletConfig.DEFAULT_DEVICE_SOURCE, FTPCodes.DATA_CONNECTION_CLOSING, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, DataTypeSource.SPORT_TYPE_CHECKERS, 169, 160, 167, DataTypeSource.SPORT_TYPE_SNOWSHOE_HIKING, DataTypeSource.SPORT_TYPE_DOWNHILL, 188, DataTypeSource.SPORT_TYPE_TAP_DANCE, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, FTPCodes.NAME_SYSTEM_TIME, 194, 197, 204, 203, FTPCodes.USER_LOGGED_IN, 225, 232, 239, 250, PageType.PAGE_SHORTCUT, 244, com.huami.widget.wheelview.Constant.HEIGHT_MAX};
    }

    private Util() {
    }

    public static long addWithOverflowDefault(long x, long y, long overflowResult) {
        long j2 = x + y;
        return ((x ^ j2) & (y ^ j2)) < 0 ? overflowResult : j2;
    }

    public static boolean areEqual(@Nullable Object o1, @Nullable Object o2) {
        if (o1 == null) {
            return o2 == null;
        }
        return o1.equals(o2);
    }

    private static HashMap<String, String> b() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> map = new HashMap<>(iSOLanguages.length + i.length);
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
            String[] strArr = i;
            if (i2 >= strArr.length) {
                return map;
            }
            map.put(strArr[i2], strArr[i2 + 1]);
            i2 += 2;
        }
    }

    public static int binarySearchCeil(int[] array, int value, boolean inclusive, boolean stayInBounds) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(array, value);
        if (iBinarySearch < 0) {
            i2 = ~iBinarySearch;
        } else {
            do {
                iBinarySearch++;
                if (iBinarySearch >= array.length) {
                    break;
                }
            } while (array[iBinarySearch] == value);
            i2 = inclusive ? iBinarySearch - 1 : iBinarySearch;
        }
        return stayInBounds ? Math.min(array.length - 1, i2) : i2;
    }

    public static int binarySearchFloor(int[] array, int value, boolean inclusive, boolean stayInBounds) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(array, value);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (array[iBinarySearch] == value);
            i2 = inclusive ? iBinarySearch + 1 : iBinarySearch;
        }
        return stayInBounds ? Math.max(0, i2) : i2;
    }

    private static void c(Display display, Point outSize) {
        display.getSize(outSize);
    }

    @EnsuresNonNull({"#1"})
    public static <T> T castNonNull(@Nullable T value) {
        return value;
    }

    @EnsuresNonNull({"#1"})
    public static <T> T[] castNonNullTypeArray(T[] value) {
        return value;
    }

    public static int ceilDivide(int numerator, int denominator) {
        return ((numerator + denominator) - 1) / denominator;
    }

    public static boolean checkCleartextTrafficPermitted(MediaItem... mediaItems) {
        if (SDK_INT < 24) {
            return true;
        }
        for (MediaItem mediaItem : mediaItems) {
            MediaItem.PlaybackProperties playbackProperties = mediaItem.playbackProperties;
            if (playbackProperties != null) {
                if (j(playbackProperties.uri)) {
                    return false;
                }
                for (int i2 = 0; i2 < mediaItem.playbackProperties.subtitles.size(); i2++) {
                    if (j(mediaItem.playbackProperties.subtitles.get(i2).uri)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void closeQuietly(@Nullable DataSource dataSource) {
        if (dataSource != null) {
            try {
                dataSource.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int compareLong(long left, long right) {
        if (left < right) {
            return -1;
        }
        return left == right ? 0 : 1;
    }

    public static int constrainValue(int value, int min, int max) {
        return Math.max(min, Math.min(value, max));
    }

    public static boolean contains(Object[] items, @Nullable Object item) {
        for (Object obj : items) {
            if (areEqual(obj, item)) {
                return true;
            }
        }
        return false;
    }

    public static int crc32(byte[] bytes, int start, int end, int initialValue) {
        while (start < end) {
            initialValue = k[((initialValue >>> 24) ^ (bytes[start] & 255)) & 255] ^ (initialValue << 8);
            start++;
        }
        return initialValue;
    }

    public static int crc8(byte[] bytes, int start, int end, int initialValue) {
        while (start < end) {
            initialValue = l[initialValue ^ (bytes[start] & 255)];
            start++;
        }
        return initialValue;
    }

    public static Handler createHandler(Looper looper, @Nullable Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static Handler createHandlerForCurrentLooper() {
        return createHandlerForCurrentLooper(null);
    }

    public static Handler createHandlerForCurrentOrMainLooper() {
        return createHandlerForCurrentOrMainLooper(null);
    }

    public static File createTempDirectory(Context context, String prefix) throws IOException {
        File fileCreateTempFile = createTempFile(context, prefix);
        fileCreateTempFile.delete();
        fileCreateTempFile.mkdir();
        return fileCreateTempFile;
    }

    public static File createTempFile(Context context, String prefix) throws IOException {
        return File.createTempFile(prefix, null, (File) Assertions.checkNotNull(context.getCacheDir()));
    }

    @RequiresApi(17)
    private static void d(Display display, Point outSize) {
        display.getRealSize(outSize);
    }

    @RequiresApi(23)
    private static void e(Display display, Point outSize) {
        Display.Mode mode = display.getMode();
        outSize.x = mode.getPhysicalWidth();
        outSize.y = mode.getPhysicalHeight();
    }

    public static String escapeFileName(String fileName) {
        int length = fileName.length();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (n(fileName.charAt(i4))) {
                i3++;
            }
        }
        if (i3 == 0) {
            return fileName;
        }
        StringBuilder sb = new StringBuilder((i3 * 2) + length);
        while (i3 > 0) {
            int i5 = i2 + 1;
            char cCharAt = fileName.charAt(i2);
            if (n(cCharAt)) {
                sb.append('%');
                sb.append(Integer.toHexString(cCharAt));
                i3--;
            } else {
                sb.append(cCharAt);
            }
            i2 = i5;
        }
        if (i2 < length) {
            sb.append((CharSequence) fileName, i2, length);
        }
        return sb.toString();
    }

    @RequiresApi(21)
    private static String f(Locale locale) {
        return locale.toLanguageTag();
    }

    public static Uri fixSmoothStreamingIsmManifestUri(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = e.matcher(Ascii.toLowerCase(path));
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    public static String formatInvariant(String format, Object... args) {
        return String.format(Locale.US, format, args);
    }

    public static String fromUtf8Bytes(byte[] bytes) {
        return new String(bytes, Charsets.UTF_8);
    }

    private static String[] g() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return SDK_INT >= 24 ? h(configuration) : new String[]{getLocaleLanguageTag(configuration.locale)};
    }

    @Nullable
    public static String getAdaptiveMimeTypeForContentType(int contentType) {
        if (contentType == 0) {
            return MimeTypes.APPLICATION_MPD;
        }
        if (contentType == 1) {
            return MimeTypes.APPLICATION_SS;
        }
        if (contentType != 2) {
            return null;
        }
        return MimeTypes.APPLICATION_M3U8;
    }

    public static int getAudioContentTypeForStreamType(int streamType) {
        if (streamType != 0) {
            return (streamType == 1 || streamType == 2 || streamType == 4 || streamType == 5 || streamType == 8) ? 4 : 2;
        }
        return 1;
    }

    public static int getAudioTrackChannelConfig(int channelCount) {
        switch (channelCount) {
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
                int i2 = SDK_INT;
                return (i2 < 23 && i2 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static int getAudioUsageForStreamType(int streamType) {
        if (streamType == 0) {
            return 2;
        }
        if (streamType == 1) {
            return 13;
        }
        if (streamType == 2) {
            return 6;
        }
        int i2 = 4;
        if (streamType != 4) {
            i2 = 5;
            if (streamType != 5) {
                return streamType != 8 ? 1 : 3;
            }
        }
        return i2;
    }

    public static int getBigEndianInt(ByteBuffer buffer, int index) {
        int i2 = buffer.getInt(index);
        return buffer.order() == ByteOrder.BIG_ENDIAN ? i2 : Integer.reverseBytes(i2);
    }

    public static byte[] getBytesFromHexString(String hexString) {
        int length = hexString.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) ((Character.digit(hexString.charAt(i3), 16) << 4) + Character.digit(hexString.charAt(i3 + 1), 16));
        }
        return bArr;
    }

    public static int getCodecCountOfType(@Nullable String codecs, int trackType) {
        int i2 = 0;
        for (String str : splitCodecs(codecs)) {
            if (trackType == MimeTypes.getTrackTypeOfCodec(str)) {
                i2++;
            }
        }
        return i2;
    }

    @Nullable
    public static String getCodecsOfType(@Nullable String codecs, int trackType) {
        String[] strArrSplitCodecs = splitCodecs(codecs);
        if (strArrSplitCodecs.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArrSplitCodecs) {
            if (trackType == MimeTypes.getTrackTypeOfCodec(str)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static String getCommaDelimitedSimpleClassNames(Object[] objects) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < objects.length; i2++) {
            sb.append(objects[i2].getClass().getSimpleName());
            if (i2 < objects.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static String getCountryCode(@Nullable Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return Ascii.toUpperCase(networkCountryIso);
            }
        }
        return Ascii.toUpperCase(Locale.getDefault().getCountry());
    }

    public static Point getCurrentDisplayModeSize(Context context) {
        DisplayManager displayManager;
        Display display = (SDK_INT < 17 || (displayManager = (DisplayManager) context.getSystemService(ServerProtocol.DIALOG_PARAM_DISPLAY)) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((WindowManager) Assertions.checkNotNull((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return getCurrentDisplayModeSize(context, display);
    }

    public static Looper getCurrentOrMainLooper() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static Uri getDataUriForString(String mimeType, String data) {
        String strEncodeToString = Base64.encodeToString(data.getBytes(), 2);
        StringBuilder sb = new StringBuilder(String.valueOf(mimeType).length() + 13 + String.valueOf(strEncodeToString).length());
        sb.append("data:");
        sb.append(mimeType);
        sb.append(";base64,");
        sb.append(strEncodeToString);
        return Uri.parse(sb.toString());
    }

    @Nullable
    public static UUID getDrmUuid(String drmScheme) {
        String lowerCase = Ascii.toLowerCase(drmScheme);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "playready":
                return C.PLAYREADY_UUID;
            case "widevine":
                return C.WIDEVINE_UUID;
            case "clearkey":
                return C.CLEARKEY_UUID;
            default:
                try {
                    return UUID.fromString(drmScheme);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    public static int getErrorCodeFromPlatformDiagnosticsInfo(@Nullable String diagnosticsInfo) {
        String[] strArrSplit;
        int length;
        if (diagnosticsInfo == null || (length = (strArrSplit = split(diagnosticsInfo, "_")).length) < 2) {
            return 0;
        }
        String str = strArrSplit[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            int i2 = Integer.parseInt((String) Assertions.checkNotNull(str));
            return z ? -i2 : i2;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static int getIntegerCodeForString(String string) {
        int length = string.length();
        Assertions.checkArgument(length <= 4);
        int iCharAt = 0;
        for (int i2 = 0; i2 < length; i2++) {
            iCharAt = (iCharAt << 8) | string.charAt(i2);
        }
        return iCharAt;
    }

    public static String getLocaleLanguageTag(Locale locale) {
        return SDK_INT >= 21 ? f(locale) : locale.toString();
    }

    public static long getMediaDurationForPlayoutDuration(long playoutDuration, float speed) {
        return speed == 1.0f ? playoutDuration : Math.round(playoutDuration * ((double) speed));
    }

    public static long getNowUnixTimeMs(long elapsedRealtimeEpochOffsetMs) {
        return elapsedRealtimeEpochOffsetMs == C.TIME_UNSET ? System.currentTimeMillis() : elapsedRealtimeEpochOffsetMs + android.os.SystemClock.elapsedRealtime();
    }

    public static int getPcmEncoding(int bitDepth) {
        if (bitDepth == 8) {
            return 3;
        }
        if (bitDepth == 16) {
            return 2;
        }
        if (bitDepth == 24) {
            return 536870912;
        }
        if (bitDepth != 32) {
            return 0;
        }
        return C.ENCODING_PCM_32BIT;
    }

    public static Format getPcmFormat(int pcmEncoding, int channels, int sampleRate) {
        return new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_RAW).setChannelCount(channels).setSampleRate(sampleRate).setPcmEncoding(pcmEncoding).build();
    }

    public static int getPcmFrameSize(int pcmEncoding, int channelCount) {
        if (pcmEncoding != 2) {
            if (pcmEncoding == 3) {
                return channelCount;
            }
            if (pcmEncoding != 4) {
                if (pcmEncoding != 268435456) {
                    if (pcmEncoding == 536870912) {
                        return channelCount * 3;
                    }
                    if (pcmEncoding != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return channelCount * 4;
        }
        return channelCount * 2;
    }

    public static long getPlayoutDurationForMediaDuration(long mediaDuration, float speed) {
        return speed == 1.0f ? mediaDuration : Math.round(mediaDuration / ((double) speed));
    }

    public static int getStreamTypeForAudioUsage(int usage) {
        if (usage == 13) {
            return 1;
        }
        switch (usage) {
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

    public static String getStringForTime(StringBuilder builder, Formatter formatter, long timeMs) {
        if (timeMs == C.TIME_UNSET) {
            timeMs = 0;
        }
        String str = timeMs < 0 ? com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER : "";
        long jAbs = (Math.abs(timeMs) + 500) / 1000;
        long j2 = jAbs % 60;
        long j3 = (jAbs / 60) % 60;
        long j4 = jAbs / TimeUtils.TIME_1_HOURS;
        builder.setLength(0);
        return j4 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j3), Long.valueOf(j2)).toString();
    }

    public static String[] getSystemLanguageCodes() {
        String[] strArrG = g();
        for (int i2 = 0; i2 < strArrG.length; i2++) {
            strArrG[i2] = normalizeLanguageCode(strArrG[i2]);
        }
        return strArrG;
    }

    public static String getTrackTypeString(int trackType) {
        if (trackType == 0) {
            return "default";
        }
        if (trackType == 1) {
            return "audio";
        }
        if (trackType == 2) {
            return "video";
        }
        if (trackType == 3) {
            return "text";
        }
        if (trackType == 5) {
            return "metadata";
        }
        if (trackType == 6) {
            return "camera motion";
        }
        if (trackType == 7) {
            return "none";
        }
        if (trackType < 10000) {
            return "?";
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("custom (");
        sb.append(trackType);
        sb.append(")");
        return sb.toString();
    }

    public static String getUserAgent(Context context, String applicationName) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "?";
        }
        String str2 = Build.VERSION.RELEASE;
        StringBuilder sb = new StringBuilder(String.valueOf(applicationName).length() + 38 + String.valueOf(str).length() + String.valueOf(str2).length());
        sb.append(applicationName);
        sb.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        sb.append(str);
        sb.append(" (Linux;Android ");
        sb.append(str2);
        sb.append(") ");
        sb.append(ExoPlayerLibraryInfo.VERSION_SLASHY);
        return sb.toString();
    }

    public static byte[] getUtf8Bytes(String value) {
        return value.getBytes(Charsets.UTF_8);
    }

    public static byte[] gzip(byte[] input) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(input);
                gZIPOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @RequiresApi(24)
    private static String[] h(Configuration config) {
        return split(config.getLocales().toLanguageTags(), ",");
    }

    @Nullable
    private static String i(String name) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, name);
        } catch (Exception e2) {
            String strValueOf = String.valueOf(name);
            Log.e(a, strValueOf.length() != 0 ? "Failed to read system property ".concat(strValueOf) : new String("Failed to read system property "), e2);
            return null;
        }
    }

    public static int inferContentType(Uri uri, @Nullable String overrideExtension) {
        if (TextUtils.isEmpty(overrideExtension)) {
            return inferContentType(uri);
        }
        String strValueOf = String.valueOf(overrideExtension);
        return inferContentType(strValueOf.length() != 0 ? ".".concat(strValueOf) : new String("."));
    }

    public static int inferContentTypeForUriAndMimeType(Uri uri, @Nullable String mimeType) {
        if (mimeType == null) {
            return inferContentType(uri);
        }
        switch (mimeType) {
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

    public static boolean inflate(ParsableByteArray input, ParsableByteArray output, @Nullable Inflater inflater) {
        if (input.bytesLeft() <= 0) {
            return false;
        }
        if (output.capacity() < input.bytesLeft()) {
            output.ensureCapacity(input.bytesLeft() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(input.getData(), input.getPosition(), input.bytesLeft());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(output.getData(), iInflate, output.capacity() - iInflate);
                if (inflater.finished()) {
                    output.setLimit(iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    if (iInflate == output.capacity()) {
                        output.ensureCapacity(output.capacity() * 2);
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

    public static boolean isEncodingHighResolutionPcm(int encoding) {
        return encoding == 536870912 || encoding == 805306368 || encoding == 4;
    }

    public static boolean isEncodingLinearPcm(int encoding) {
        return encoding == 3 || encoding == 2 || encoding == 268435456 || encoding == 536870912 || encoding == 805306368 || encoding == 4;
    }

    public static boolean isLinebreak(int c2) {
        return c2 == 10 || c2 == 13;
    }

    public static boolean isLocalFileUri(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static boolean isTv(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    @RequiresApi(api = 24)
    private static boolean j(Uri uri) {
        return "http".equals(uri.getScheme()) && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted((String) Assertions.checkNotNull(uri.getHost()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread k(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    private static String l(String languageTag) {
        int i2 = 0;
        while (true) {
            String[] strArr = j;
            if (i2 >= strArr.length) {
                return languageTag;
            }
            if (languageTag.startsWith(strArr[i2])) {
                String strValueOf = String.valueOf(strArr[i2 + 1]);
                String strValueOf2 = String.valueOf(languageTag.substring(strArr[i2].length()));
                return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
            }
            i2 += 2;
        }
    }

    public static int linearSearch(int[] array, int value) {
        for (int i2 = 0; i2 < array.length; i2++) {
            if (array[i2] == value) {
                return i2;
            }
        }
        return -1;
    }

    @RequiresApi(api = 23)
    private static boolean m(Activity activity) {
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return false;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
        return true;
    }

    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, Uri... uris) {
        if (SDK_INT < 23) {
            return false;
        }
        for (Uri uri : uris) {
            if (isLocalFileUri(uri)) {
                return m(activity);
            }
        }
        return false;
    }

    @RequiresApi(18)
    public static long minValue(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            throw new NoSuchElementException();
        }
        long jMin = Long.MAX_VALUE;
        for (int i2 = 0; i2 < sparseLongArray.size(); i2++) {
            jMin = Math.min(jMin, sparseLongArray.valueAt(i2));
        }
        return jMin;
    }

    public static <T> void moveItems(List<T> items, int fromIndex, int toIndex, int newFromIndex) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i2 = (toIndex - fromIndex) - 1; i2 >= 0; i2--) {
            arrayDeque.addFirst(items.remove(fromIndex + i2));
        }
        items.addAll(Math.min(newFromIndex, items.size()), arrayDeque);
    }

    private static boolean n(char c2) {
        return c2 == '\"' || c2 == '%' || c2 == '*' || c2 == '/' || c2 == ':' || c2 == '<' || c2 == '\\' || c2 == '|' || c2 == '>' || c2 == '?';
    }

    public static ExecutorService newSingleThreadExecutor(final String threadName) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: t78
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return Util.k(threadName, runnable);
            }
        });
    }

    public static String normalizeLanguageCode(String language) {
        if (language == null) {
            return null;
        }
        String strReplace = language.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals(C.LANGUAGE_UNDETERMINED)) {
            language = strReplace;
        }
        String lowerCase = Ascii.toLowerCase(language);
        String str = splitAtFirst(lowerCase, com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER)[0];
        if (h == null) {
            h = b();
        }
        String str2 = h.get(str);
        if (str2 != null) {
            String strValueOf = String.valueOf(lowerCase.substring(str.length()));
            lowerCase = strValueOf.length() != 0 ? str2.concat(strValueOf) : new String(str2);
            str = str2;
        }
        return ("no".equals(str) || "i".equals(str) || "zh".equals(str)) ? l(lowerCase) : lowerCase;
    }

    public static <T> T[] nullSafeArrayAppend(T[] tArr, T t) {
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length + 1);
        objArrCopyOf[tArr.length] = t;
        return (T[]) castNonNullTypeArray(objArrCopyOf);
    }

    public static <T> T[] nullSafeArrayConcatenation(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static <T> T[] nullSafeArrayCopy(T[] tArr, int i2) {
        Assertions.checkArgument(i2 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i2);
    }

    public static <T> T[] nullSafeArrayCopyOfRange(T[] tArr, int i2, int i3) {
        Assertions.checkArgument(i2 >= 0);
        Assertions.checkArgument(i3 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i2, i3);
    }

    public static <T> void nullSafeListToArray(List<T> list, T[] array) {
        Assertions.checkState(list.size() == array.length);
        list.toArray(array);
    }

    private static <T extends Throwable> void o(Throwable t) throws Throwable {
        throw t;
    }

    public static long parseXsDateTime(String value) throws ParserException {
        Matcher matcher = b.matcher(value);
        if (!matcher.matches()) {
            String strValueOf = String.valueOf(value);
            throw ParserException.createForMalformedContainer(strValueOf.length() != 0 ? "Invalid date/time format: ".concat(strValueOf) : new String("Invalid date/time format: "), null);
        }
        int i2 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i2 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if (com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SERVER.equals(matcher.group(11))) {
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

    public static long parseXsDuration(String value) {
        Matcher matcher = c.matcher(value);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(value) * 3600.0d * 1000.0d);
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

    public static boolean postOrRun(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static boolean readBoolean(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static byte[] readExactly(DataSource dataSource, int length) throws IOException {
        byte[] bArr = new byte[length];
        int i2 = 0;
        while (i2 < length) {
            int i3 = dataSource.read(bArr, i2, length - i2);
            if (i3 == -1) {
                StringBuilder sb = new StringBuilder(56);
                sb.append("Not enough data could be read: ");
                sb.append(i2);
                sb.append(" < ");
                sb.append(length);
                throw new IllegalStateException(sb.toString());
            }
            i2 += i3;
        }
        return bArr;
    }

    public static byte[] readToEnd(DataSource dataSource) throws IOException {
        byte[] bArrCopyOf = new byte[1024];
        int i2 = 0;
        int i3 = 0;
        while (i2 != -1) {
            if (i3 == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            i2 = dataSource.read(bArrCopyOf, i3, bArrCopyOf.length - i3);
            if (i2 != -1) {
                i3 += i2;
            }
        }
        return Arrays.copyOf(bArrCopyOf, i3);
    }

    public static void recursiveDelete(File fileOrDirectory) {
        File[] fileArrListFiles = fileOrDirectory.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                recursiveDelete(file);
            }
        }
        fileOrDirectory.delete();
    }

    public static <T> void removeRange(List<T> list, int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > list.size() || fromIndex > toIndex) {
            throw new IllegalArgumentException();
        }
        if (fromIndex != toIndex) {
            list.subList(fromIndex, toIndex).clear();
        }
    }

    public static long scaleLargeTimestamp(long timestamp, long multiplier, long divisor) {
        if (divisor >= multiplier && divisor % multiplier == 0) {
            return timestamp / (divisor / multiplier);
        }
        if (divisor < multiplier && multiplier % divisor == 0) {
            return timestamp * (multiplier / divisor);
        }
        return (long) (timestamp * (multiplier / divisor));
    }

    public static long[] scaleLargeTimestamps(List<Long> timestamps, long multiplier, long divisor) {
        int size = timestamps.size();
        long[] jArr = new long[size];
        int i2 = 0;
        if (divisor >= multiplier && divisor % multiplier == 0) {
            long j2 = divisor / multiplier;
            while (i2 < size) {
                jArr[i2] = timestamps.get(i2).longValue() / j2;
                i2++;
            }
        } else if (divisor >= multiplier || multiplier % divisor != 0) {
            double d2 = multiplier / divisor;
            while (i2 < size) {
                jArr[i2] = (long) (timestamps.get(i2).longValue() * d2);
                i2++;
            }
        } else {
            long j3 = multiplier / divisor;
            while (i2 < size) {
                jArr[i2] = timestamps.get(i2).longValue() * j3;
                i2++;
            }
        }
        return jArr;
    }

    public static void scaleLargeTimestampsInPlace(long[] timestamps, long multiplier, long divisor) {
        int i2 = 0;
        if (divisor >= multiplier && divisor % multiplier == 0) {
            long j2 = divisor / multiplier;
            while (i2 < timestamps.length) {
                timestamps[i2] = timestamps[i2] / j2;
                i2++;
            }
            return;
        }
        if (divisor >= multiplier || multiplier % divisor != 0) {
            double d2 = multiplier / divisor;
            while (i2 < timestamps.length) {
                timestamps[i2] = (long) (timestamps[i2] * d2);
                i2++;
            }
            return;
        }
        long j3 = multiplier / divisor;
        while (i2 < timestamps.length) {
            timestamps[i2] = timestamps[i2] * j3;
            i2++;
        }
    }

    public static void sneakyThrow(Throwable t) throws Throwable {
        o(t);
    }

    public static String[] split(String value, String regex) {
        return value.split(regex, -1);
    }

    public static String[] splitAtFirst(String value, String regex) {
        return value.split(regex, 2);
    }

    public static String[] splitCodecs(@Nullable String codecs) {
        return TextUtils.isEmpty(codecs) ? new String[0] : split(codecs.trim(), "(\\s*,\\s*)");
    }

    @Nullable
    public static ComponentName startForegroundService(Context context, Intent intent) {
        return SDK_INT >= 26 ? context.startForegroundService(intent) : context.startService(intent);
    }

    public static long subtractWithOverflowDefault(long x, long y, long overflowResult) {
        long j2 = x - y;
        return ((x ^ j2) & (y ^ x)) < 0 ? overflowResult : j2;
    }

    public static boolean tableExists(SQLiteDatabase database, String tableName) {
        return DatabaseUtils.queryNumEntries(database, "sqlite_master", "tbl_name = ?", new String[]{tableName}) > 0;
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
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

    public static String toHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (int i2 = 0; i2 < bytes.length; i2++) {
            sb.append(Character.forDigit((bytes[i2] >> 4) & 15, 16));
            sb.append(Character.forDigit(bytes[i2] & 15, 16));
        }
        return sb.toString();
    }

    public static long toLong(int mostSignificantBits, int leastSignificantBits) {
        return toUnsignedLong(leastSignificantBits) | (toUnsignedLong(mostSignificantBits) << 32);
    }

    public static long toUnsignedLong(int x) {
        return ((long) x) & 4294967295L;
    }

    public static CharSequence truncateAscii(CharSequence sequence, int maxLength) {
        return sequence.length() <= maxLength ? sequence : sequence.subSequence(0, maxLength);
    }

    @Nullable
    public static String unescapeFileName(String fileName) {
        int length = fileName.length();
        int iEnd = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (fileName.charAt(i3) == '%') {
                i2++;
            }
        }
        if (i2 == 0) {
            return fileName;
        }
        int i4 = length - (i2 * 2);
        StringBuilder sb = new StringBuilder(i4);
        Matcher matcher = d.matcher(fileName);
        while (i2 > 0 && matcher.find()) {
            char c2 = (char) Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)), 16);
            sb.append((CharSequence) fileName, iEnd, matcher.start());
            sb.append(c2);
            iEnd = matcher.end();
            i2--;
        }
        if (iEnd < length) {
            sb.append((CharSequence) fileName, iEnd, length);
        }
        if (sb.length() != i4) {
            return null;
        }
        return sb.toString();
    }

    public static void writeBoolean(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static long ceilDivide(long numerator, long denominator) {
        return ((numerator + denominator) - 1) / denominator;
    }

    public static void closeQuietly(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long constrainValue(long value, long min, long max) {
        return Math.max(min, Math.min(value, max));
    }

    public static Handler createHandlerForCurrentLooper(@Nullable Handler.Callback callback) {
        return createHandler((Looper) Assertions.checkStateNotNull(Looper.myLooper()), callback);
    }

    public static Handler createHandlerForCurrentOrMainLooper(@Nullable Handler.Callback callback) {
        return createHandler(getCurrentOrMainLooper(), callback);
    }

    public static String fromUtf8Bytes(byte[] bytes, int offset, int length) {
        return new String(bytes, offset, length, Charsets.UTF_8);
    }

    public static float constrainValue(float value, float min, float max) {
        return Math.max(min, Math.min(value, max));
    }

    public static int linearSearch(long[] array, long value) {
        for (int i2 = 0; i2 < array.length; i2++) {
            if (array[i2] == value) {
                return i2;
            }
        }
        return -1;
    }

    public static int binarySearchCeil(long[] array, long value, boolean inclusive, boolean stayInBounds) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(array, value);
        if (iBinarySearch < 0) {
            i2 = ~iBinarySearch;
        } else {
            do {
                iBinarySearch++;
                if (iBinarySearch >= array.length) {
                    break;
                }
            } while (array[iBinarySearch] == value);
            i2 = inclusive ? iBinarySearch - 1 : iBinarySearch;
        }
        return stayInBounds ? Math.min(array.length - 1, i2) : i2;
    }

    public static int binarySearchFloor(long[] array, long value, boolean inclusive, boolean stayInBounds) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(array, value);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (array[iBinarySearch] == value);
            i2 = inclusive ? iBinarySearch + 1 : iBinarySearch;
        }
        return stayInBounds ? Math.max(0, i2) : i2;
    }

    public static int inferContentType(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && Ascii.equalsIgnoreCase("rtsp", scheme)) {
            return 3;
        }
        String path = uri.getPath();
        if (path == null) {
            return 4;
        }
        return inferContentType(path);
    }

    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, MediaItem... mediaItems) {
        if (SDK_INT < 23) {
            return false;
        }
        for (MediaItem mediaItem : mediaItems) {
            MediaItem.PlaybackProperties playbackProperties = mediaItem.playbackProperties;
            if (playbackProperties != null) {
                if (isLocalFileUri(playbackProperties.uri)) {
                    return m(activity);
                }
                for (int i2 = 0; i2 < mediaItem.playbackProperties.subtitles.size(); i2++) {
                    if (isLocalFileUri(mediaItem.playbackProperties.subtitles.get(i2).uri)) {
                        return m(activity);
                    }
                }
            }
        }
        return false;
    }

    public static <T extends Comparable<? super T>> int binarySearchCeil(List<? extends Comparable<? super T>> list, T value, boolean inclusive, boolean stayInBounds) {
        int i2;
        int iBinarySearch = Collections.binarySearch(list, value);
        if (iBinarySearch < 0) {
            i2 = ~iBinarySearch;
        } else {
            int size = list.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (list.get(iBinarySearch).compareTo(value) == 0);
            i2 = inclusive ? iBinarySearch - 1 : iBinarySearch;
        }
        return stayInBounds ? Math.min(list.size() - 1, i2) : i2;
    }

    public static <T extends Comparable<? super T>> int binarySearchFloor(List<? extends Comparable<? super T>> list, T value, boolean inclusive, boolean stayInBounds) {
        int i2;
        int iBinarySearch = Collections.binarySearch(list, value);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (list.get(iBinarySearch).compareTo(value) == 0);
            i2 = inclusive ? iBinarySearch + 1 : iBinarySearch;
        }
        return stayInBounds ? Math.max(0, i2) : i2;
    }

    public static Point getCurrentDisplayModeSize(Context context, Display display) {
        String strI;
        int i2 = SDK_INT;
        if (i2 <= 29 && display.getDisplayId() == 0 && isTv(context)) {
            if ("Sony".equals(MANUFACTURER) && MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
            if (i2 < 28) {
                strI = i("sys.display-size");
            } else {
                strI = i("vendor.display-size");
            }
            if (!TextUtils.isEmpty(strI)) {
                try {
                    String[] strArrSplit = split(strI.trim(), "x");
                    if (strArrSplit.length == 2) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        if (i3 > 0 && i4 > 0) {
                            return new Point(i3, i4);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                String strValueOf = String.valueOf(strI);
                Log.e(a, strValueOf.length() != 0 ? "Invalid display size: ".concat(strValueOf) : new String("Invalid display size: "));
            }
        }
        Point point = new Point();
        int i5 = SDK_INT;
        if (i5 >= 23) {
            e(display, point);
        } else if (i5 >= 17) {
            d(display, point);
        } else {
            c(display, point);
        }
        return point;
    }

    public static int inferContentType(String fileName) {
        String lowerCase = Ascii.toLowerCase(fileName);
        if (lowerCase.endsWith(".mpd")) {
            return 0;
        }
        if (lowerCase.endsWith(".m3u8")) {
            return 2;
        }
        Matcher matcher = e.matcher(lowerCase);
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup == null) {
            return 1;
        }
        if (strGroup.contains(g)) {
            return 0;
        }
        return strGroup.contains(f) ? 2 : 1;
    }

    public static int binarySearchFloor(LongArray longArray, long value, boolean inclusive, boolean stayInBounds) {
        int i2;
        int size = longArray.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            if (longArray.get(i4) < value) {
                i3 = i4 + 1;
            } else {
                size = i4 - 1;
            }
        }
        if (inclusive && (i2 = size + 1) < longArray.size() && longArray.get(i2) == value) {
            return i2;
        }
        if (stayInBounds && size == -1) {
            return 0;
        }
        return size;
    }
}
