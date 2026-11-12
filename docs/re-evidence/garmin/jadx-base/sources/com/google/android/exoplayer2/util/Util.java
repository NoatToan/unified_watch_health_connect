package com.google.android.exoplayer2.util;

import am.j;
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
import android.media.AudioManager;
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
import c22.t;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.v;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import com.google.firebase.messaging.Constants;
import com.google.mlkit.common.MlKitException;
import j20.x;
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
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.GZIPOutputStream;
import java.util.zip.Inflater;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.time.TimeZones;
import org.joda.time.DateTimeConstants;
import vb.h;
import yc.l2;

/* JADX INFO: loaded from: classes14.dex */
public final class Util {
    private static final int[] CRC32_BYTES_MSBF;
    private static final int[] CRC8_BYTES_MSBF;
    public static final String DEVICE;
    public static final String DEVICE_DEBUG_INFO;
    public static final byte[] EMPTY_BYTE_ARRAY;
    private static final Pattern ESCAPED_CHARACTER_PATTERN;
    private static final String ISM_DASH_FORMAT_EXTENSION = "format=mpd-time-csf";
    private static final String ISM_HLS_FORMAT_EXTENSION = "format=m3u8-aapl";
    private static final Pattern ISM_URL_PATTERN;
    public static final String MANUFACTURER;
    public static final String MODEL;
    public static final int SDK_INT;
    private static final String TAG = "Util";
    private static final Pattern XS_DATE_TIME_PATTERN;
    private static final Pattern XS_DURATION_PATTERN;
    private static final String[] additionalIsoLanguageReplacements;
    private static final String[] isoLegacyTagReplacements;
    private static HashMap<String, String> languageTagReplacementMap;

    static {
        int i14 = Build.VERSION.SDK_INT;
        SDK_INT = i14;
        String str = Build.DEVICE;
        DEVICE = str;
        String str2 = Build.MANUFACTURER;
        MANUFACTURER = str2;
        String str3 = Build.MODEL;
        MODEL = str3;
        StringBuilder sbD = v.d(v.a(v.a(v.a(17, str), str3), str2), str, ", ", str3, ", ");
        sbD.append(str2);
        sbD.append(", ");
        sbD.append(i14);
        DEVICE_DEBUG_INFO = sbD.toString();
        EMPTY_BYTE_ARRAY = new byte[0];
        XS_DATE_TIME_PATTERN = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        XS_DURATION_PATTERN = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        ESCAPED_CHARACTER_PATTERN = Pattern.compile("%([A-Fa-f0-9]{2})");
        ISM_URL_PATTERN = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        additionalIsoLanguageReplacements = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", TtmlNode.ATTR_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        isoLegacyTagReplacements = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        CRC32_BYTES_MSBF = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        CRC8_BYTES_MSBF = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, SyslogConstants.LOG_LOCAL2, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, PsExtractor.PRIVATE_STREAM_1, 199, 192, 201, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, SyslogConstants.LOG_LOCAL6, 185, 190, 171, TsExtractor.TS_STREAM_TYPE_AC4, 165, 162, 143, SyslogConstants.LOG_LOCAL1, 129, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, TsExtractor.TS_STREAM_TYPE_E_AC3, 128, 149, 146, ModuleDescriptor.MODULE_VERSION, 156, 177, 182, 191, SyslogConstants.LOG_LOCAL7, 173, 170, 163, 164, 249, 254, 247, PsExtractor.VIDEO_STREAM_MASK, 229, 226, 235, 236, 193, 198, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, SyslogConstants.LOG_LOCAL4, 167, 178, 181, TsExtractor.TS_PACKET_SIZE, 187, 150, 145, SyslogConstants.LOG_LOCAL3, 159, TsExtractor.TS_STREAM_TYPE_DTS, 141, 132, 131, 222, 217, 208, 215, 194, 197, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    private Util() {
    }

    public static long addWithOverflowDefault(long j8, long j14, long j15) {
        long j16 = j8 + j14;
        return ((j8 ^ j16) & (j14 ^ j16)) < 0 ? j15 : j16;
    }

    public static boolean areEqual(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static <T extends Comparable<? super T>> int binarySearchCeil(List<? extends Comparable<? super T>> list, T t7, boolean z14, boolean z15) {
        int i14;
        int i15;
        int iBinarySearch = Collections.binarySearch(list, t7);
        if (iBinarySearch < 0) {
            i15 = ~iBinarySearch;
        } else {
            int size = list.size();
            while (true) {
                i14 = iBinarySearch + 1;
                if (i14 >= size || list.get(i14).compareTo(t7) != 0) {
                    break;
                }
                iBinarySearch = i14;
            }
            i15 = z14 ? iBinarySearch : i14;
        }
        return z15 ? Math.min(list.size() - 1, i15) : i15;
    }

    public static int binarySearchFloor(LongArray longArray, long j8, boolean z14, boolean z15) {
        int i14;
        int size = longArray.size() - 1;
        int i15 = 0;
        while (i15 <= size) {
            int i16 = (i15 + size) >>> 1;
            if (longArray.get(i16) < j8) {
                i15 = i16 + 1;
            } else {
                size = i16 - 1;
            }
        }
        if (z14 && (i14 = size + 1) < longArray.size() && longArray.get(i14) == j8) {
            return i14;
        }
        if (z15 && size == -1) {
            return 0;
        }
        return size;
    }

    public static <T> T castNonNull(T t7) {
        return t7;
    }

    public static <T> T[] castNonNullTypeArray(T[] tArr) {
        return tArr;
    }

    public static long ceilDivide(long j8, long j14) {
        return ((j8 + j14) - 1) / j14;
    }

    public static boolean checkCleartextTrafficPermitted(MediaItem... mediaItemArr) {
        if (SDK_INT < 24) {
            return true;
        }
        for (MediaItem mediaItem : mediaItemArr) {
            MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                if (isTrafficRestricted(localConfiguration.uri)) {
                    return false;
                }
                for (int i14 = 0; i14 < mediaItem.localConfiguration.subtitleConfigurations.size(); i14++) {
                    if (isTrafficRestricted(mediaItem.localConfiguration.subtitleConfigurations.get(i14).uri)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int compareLong(long j8, long j14) {
        if (j8 < j14) {
            return -1;
        }
        return j8 == j14 ? 0 : 1;
    }

    public static int constrainValue(int i14, int i15, int i16) {
        return Math.max(i15, Math.min(i14, i16));
    }

    public static boolean contains(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (areEqual(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int crc32(byte[] bArr, int i14, int i15, int i16) {
        while (i14 < i15) {
            i16 = CRC32_BYTES_MSBF[((i16 >>> 24) ^ (bArr[i14] & 255)) & 255] ^ (i16 << 8);
            i14++;
        }
        return i16;
    }

    public static int crc8(byte[] bArr, int i14, int i15, int i16) {
        while (i14 < i15) {
            i16 = CRC8_BYTES_MSBF[i16 ^ (bArr[i14] & 255)];
            i14++;
        }
        return i16;
    }

    public static Handler createHandler(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static Handler createHandlerForCurrentLooper(Handler.Callback callback) {
        return createHandler((Looper) Assertions.checkStateNotNull(Looper.myLooper()), callback);
    }

    public static Handler createHandlerForCurrentOrMainLooper(Handler.Callback callback) {
        return createHandler(getCurrentOrMainLooper(), callback);
    }

    private static HashMap<String, String> createIsoLanguageReplacementMap() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> map = new HashMap<>(iSOLanguages.length + additionalIsoLanguageReplacements.length);
        int i14 = 0;
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
            String[] strArr = additionalIsoLanguageReplacements;
            if (i14 >= strArr.length) {
                return map;
            }
            map.put(strArr[i14], strArr[i14 + 1]);
            i14 += 2;
        }
    }

    public static File createTempDirectory(Context context, String str) {
        File fileCreateTempFile = createTempFile(context, str);
        fileCreateTempFile.delete();
        fileCreateTempFile.mkdir();
        return fileCreateTempFile;
    }

    public static File createTempFile(Context context, String str) {
        return File.createTempFile(str, null, (File) Assertions.checkNotNull(context.getCacheDir()));
    }

    public static String escapeFileName(String str) {
        int length = str.length();
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            if (shouldEscapeCharacter(str.charAt(i16))) {
                i15++;
            }
        }
        if (i15 == 0) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder((i15 * 2) + length);
        while (i15 > 0) {
            int i17 = i14 + 1;
            char cCharAt = str.charAt(i14);
            if (shouldEscapeCharacter(cCharAt)) {
                sb3.append(CoreConstants.PERCENT_CHAR);
                sb3.append(Integer.toHexString(cCharAt));
                i15--;
            } else {
                sb3.append(cCharAt);
            }
            i14 = i17;
        }
        if (i14 < length) {
            sb3.append((CharSequence) str, i14, length);
        }
        return sb3.toString();
    }

    public static Uri fixSmoothStreamingIsmManifestUri(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = ISM_URL_PATTERN.matcher(Ascii.toLowerCase(path));
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    public static String formatInvariant(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String fromUtf8Bytes(byte[] bArr) {
        return new String(bArr, Charsets.UTF_8);
    }

    public static int generateAudioSessionIdV21(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static String getAdaptiveMimeTypeForContentType(int i14) {
        if (i14 == 0) {
            return MimeTypes.APPLICATION_MPD;
        }
        if (i14 == 1) {
            return MimeTypes.APPLICATION_SS;
        }
        if (i14 != 2) {
            return null;
        }
        return MimeTypes.APPLICATION_M3U8;
    }

    public static int getAudioContentTypeForStreamType(int i14) {
        if (i14 != 0) {
            return (i14 == 1 || i14 == 2 || i14 == 4 || i14 == 5 || i14 == 8) ? 4 : 2;
        }
        return 1;
    }

    public static int getAudioTrackChannelConfig(int i14) {
        switch (i14) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return MlKitException.CODE_SCANNER_TASK_IN_PROGRESS;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i15 = SDK_INT;
                return (i15 < 23 && i15 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static int getAudioUsageForStreamType(int i14) {
        if (i14 == 0) {
            return 2;
        }
        if (i14 == 1) {
            return 13;
        }
        if (i14 == 2) {
            return 6;
        }
        int i15 = 4;
        if (i14 != 4) {
            i15 = 5;
            if (i14 != 5) {
                return i14 != 8 ? 1 : 3;
            }
        }
        return i15;
    }

    public static Player.Commands getAvailableCommands(Player player, Player.Commands commands) {
        boolean zIsPlayingAd = player.isPlayingAd();
        boolean zIsCurrentMediaItemSeekable = player.isCurrentMediaItemSeekable();
        boolean zHasPreviousMediaItem = player.hasPreviousMediaItem();
        boolean zHasNextMediaItem = player.hasNextMediaItem();
        boolean zIsCurrentMediaItemLive = player.isCurrentMediaItemLive();
        boolean zIsCurrentMediaItemDynamic = player.isCurrentMediaItemDynamic();
        boolean zIsEmpty = player.getCurrentTimeline().isEmpty();
        boolean z14 = false;
        Player.Commands.Builder builderAddIf = new Player.Commands.Builder().addAll(commands).addIf(4, !zIsPlayingAd).addIf(5, zIsCurrentMediaItemSeekable && !zIsPlayingAd).addIf(6, zHasPreviousMediaItem && !zIsPlayingAd).addIf(7, !zIsEmpty && (zHasPreviousMediaItem || !zIsCurrentMediaItemLive || zIsCurrentMediaItemSeekable) && !zIsPlayingAd).addIf(8, zHasNextMediaItem && !zIsPlayingAd).addIf(9, !zIsEmpty && (zHasNextMediaItem || (zIsCurrentMediaItemLive && zIsCurrentMediaItemDynamic)) && !zIsPlayingAd).addIf(10, !zIsPlayingAd).addIf(11, zIsCurrentMediaItemSeekable && !zIsPlayingAd);
        if (zIsCurrentMediaItemSeekable && !zIsPlayingAd) {
            z14 = true;
        }
        return builderAddIf.addIf(12, z14).build();
    }

    public static int getBigEndianInt(ByteBuffer byteBuffer, int i14) {
        int i15 = byteBuffer.getInt(i14);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i15 : Integer.reverseBytes(i15);
    }

    public static byte[] getBytesFromHexString(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = i14 * 2;
            bArr[i14] = (byte) (Character.digit(str.charAt(i15 + 1), 16) + (Character.digit(str.charAt(i15), 16) << 4));
        }
        return bArr;
    }

    public static int getCodecCountOfType(String str, int i14) {
        int i15 = 0;
        for (String str2 : splitCodecs(str)) {
            if (i14 == MimeTypes.getTrackTypeOfCodec(str2)) {
                i15++;
            }
        }
        return i15;
    }

    public static String getCodecsOfType(String str, int i14) {
        String[] strArrSplitCodecs = splitCodecs(str);
        if (strArrSplitCodecs.length == 0) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        for (String str2 : strArrSplitCodecs) {
            if (i14 == MimeTypes.getTrackTypeOfCodec(str2)) {
                if (sb3.length() > 0) {
                    sb3.append(",");
                }
                sb3.append(str2);
            }
        }
        if (sb3.length() > 0) {
            return sb3.toString();
        }
        return null;
    }

    public static String getCommaDelimitedSimpleClassNames(Object[] objArr) {
        StringBuilder sb3 = new StringBuilder();
        for (int i14 = 0; i14 < objArr.length; i14++) {
            sb3.append(objArr[i14].getClass().getSimpleName());
            if (i14 < objArr.length - 1) {
                sb3.append(", ");
            }
        }
        return sb3.toString();
    }

    public static String getCountryCode(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return Ascii.toUpperCase(networkCountryIso);
            }
        }
        return Ascii.toUpperCase(Locale.getDefault().getCountry());
    }

    public static Point getCurrentDisplayModeSize(Context context, Display display) {
        if (display.getDisplayId() == 0 && isTv(context)) {
            String systemProperty = SDK_INT < 28 ? getSystemProperty("sys.display-size") : getSystemProperty("vendor.display-size");
            if (!TextUtils.isEmpty(systemProperty)) {
                try {
                    String[] strArrSplit = split(systemProperty.trim(), "x");
                    if (strArrSplit.length == 2) {
                        int i14 = Integer.parseInt(strArrSplit[0]);
                        int i15 = Integer.parseInt(strArrSplit[1]);
                        if (i14 > 0 && i15 > 0) {
                            return new Point(i14, i15);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                String strValueOf = String.valueOf(systemProperty);
                Log.e(TAG, strValueOf.length() != 0 ? "Invalid display size: ".concat(strValueOf) : new String("Invalid display size: "));
            }
            if ("Sony".equals(MANUFACTURER) && MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i16 = SDK_INT;
        if (i16 >= 23) {
            getDisplaySizeV23(display, point);
        } else if (i16 >= 17) {
            getDisplaySizeV17(display, point);
        } else {
            getDisplaySizeV16(display, point);
        }
        return point;
    }

    public static Looper getCurrentOrMainLooper() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static Uri getDataUriForString(String str, String str2) {
        String strEncodeToString = Base64.encodeToString(str2.getBytes(), 2);
        StringBuilder sb3 = new StringBuilder(v.a(v.a(13, str), strEncodeToString));
        sb3.append("data:");
        sb3.append(str);
        sb3.append(";base64,");
        sb3.append(strEncodeToString);
        return Uri.parse(sb3.toString());
    }

    public static Locale getDefaultDisplayLocale() {
        return SDK_INT >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
    }

    private static void getDisplaySizeV16(Display display, Point point) {
        display.getSize(point);
    }

    private static void getDisplaySizeV17(Display display, Point point) {
        display.getRealSize(point);
    }

    private static void getDisplaySizeV23(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static UUID getDrmUuid(String str) {
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.getClass();
        switch (lowerCase) {
            case "playready":
                return C.PLAYREADY_UUID;
            case "widevine":
                return C.WIDEVINE_UUID;
            case "clearkey":
                return C.CLEARKEY_UUID;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    public static int getErrorCodeForMediaDrmErrorCode(int i14) {
        if (i14 == 2 || i14 == 4) {
            return 6005;
        }
        if (i14 == 10) {
            return 6004;
        }
        if (i14 == 7) {
            return 6005;
        }
        if (i14 == 8) {
            return 6003;
        }
        switch (i14) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i14) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int getErrorCodeFromPlatformDiagnosticsInfo(String str) {
        String[] strArrSplit;
        int length;
        int i14 = 0;
        if (str == null || (length = (strArrSplit = split(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z14 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            i14 = Integer.parseInt((String) Assertions.checkNotNull(str2));
            if (z14) {
                return -i14;
            }
        } catch (NumberFormatException unused) {
        }
        return i14;
    }

    public static String getFormatSupportString(int i14) {
        if (i14 == 0) {
            return "NO";
        }
        if (i14 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i14 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i14 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i14 == 4) {
            return "YES";
        }
        x.h();
        return null;
    }

    public static int getIntegerCodeForString(String str) {
        int length = str.length();
        Assertions.checkArgument(length <= 4);
        int iCharAt = 0;
        for (int i14 = 0; i14 < length; i14++) {
            iCharAt = (iCharAt << 8) | str.charAt(i14);
        }
        return iCharAt;
    }

    public static String getLocaleLanguageTag(Locale locale) {
        return SDK_INT >= 21 ? getLocaleLanguageTagV21(locale) : locale.toString();
    }

    private static String getLocaleLanguageTagV21(Locale locale) {
        return locale.toLanguageTag();
    }

    public static long getMediaDurationForPlayoutDuration(long j8, float f14) {
        return f14 == 1.0f ? j8 : Math.round(j8 * ((double) f14));
    }

    public static long getNowUnixTimeMs(long j8) {
        return j8 == C.TIME_UNSET ? System.currentTimeMillis() : android.os.SystemClock.elapsedRealtime() + j8;
    }

    public static int getPcmEncoding(int i14) {
        if (i14 == 8) {
            return 3;
        }
        if (i14 == 16) {
            return 2;
        }
        if (i14 == 24) {
            return 536870912;
        }
        if (i14 != 32) {
            return 0;
        }
        return C.ENCODING_PCM_32BIT;
    }

    public static Format getPcmFormat(int i14, int i15, int i16) {
        return new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_RAW).setChannelCount(i15).setSampleRate(i16).setPcmEncoding(i14).build();
    }

    public static int getPcmFrameSize(int i14, int i15) {
        if (i14 != 2) {
            if (i14 == 3) {
                return i15;
            }
            if (i14 != 4) {
                if (i14 != 268435456) {
                    if (i14 == 536870912) {
                        return i15 * 3;
                    }
                    if (i14 != 805306368) {
                        h.w();
                        return 0;
                    }
                }
            }
            return i15 * 4;
        }
        return i15 * 2;
    }

    public static long getPlayoutDurationForMediaDuration(long j8, float f14) {
        return f14 == 1.0f ? j8 : Math.round(j8 / ((double) f14));
    }

    public static int getStreamTypeForAudioUsage(int i14) {
        if (i14 == 13) {
            return 1;
        }
        switch (i14) {
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

    public static String getStringForTime(StringBuilder sb3, Formatter formatter, long j8) {
        if (j8 == C.TIME_UNSET) {
            j8 = 0;
        }
        String str = j8 < 0 ? "-" : "";
        long jAbs = (Math.abs(j8) + 500) / 1000;
        long j14 = jAbs % 60;
        long j15 = (jAbs / 60) % 60;
        long j16 = jAbs / 3600;
        sb3.setLength(0);
        return j16 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j16), Long.valueOf(j15), Long.valueOf(j14)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j15), Long.valueOf(j14)).toString();
    }

    public static String[] getSystemLanguageCodes() {
        String[] systemLocales = getSystemLocales();
        for (int i14 = 0; i14 < systemLocales.length; i14++) {
            systemLocales[i14] = normalizeLanguageCode(systemLocales[i14]);
        }
        return systemLocales;
    }

    private static String[] getSystemLocales() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return SDK_INT >= 24 ? getSystemLocalesV24(configuration) : new String[]{getLocaleLanguageTag(configuration.locale)};
    }

    private static String[] getSystemLocalesV24(Configuration configuration) {
        return split(configuration.getLocales().toLanguageTags(), ",");
    }

    private static String getSystemProperty(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e4) {
            String strValueOf = String.valueOf(str);
            Log.e(TAG, strValueOf.length() != 0 ? "Failed to read system property ".concat(strValueOf) : new String("Failed to read system property "), e4);
            return null;
        }
    }

    public static String getTrackTypeString(int i14) {
        switch (i14) {
            case -2:
                return "none";
            case -1:
                return PrivacyUpdateRequestError.UNKNOWN;
            case 0:
                return "default";
            case 1:
                return MimeTypes.BASE_TYPE_AUDIO;
            case 2:
                return MimeTypes.BASE_TYPE_VIDEO;
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return TtmlNode.TAG_METADATA;
            case 6:
                return "camera motion";
            default:
                if (i14 < 10000) {
                    return CallerData.NA;
                }
                StringBuilder sb3 = new StringBuilder(20);
                sb3.append("custom (");
                sb3.append(i14);
                sb3.append(")");
                return sb3.toString();
        }
    }

    public static String getUserAgent(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = CallerData.NA;
        }
        String str3 = Build.VERSION.RELEASE;
        return j.o(str3, ") ExoPlayerLib/2.17.1", v.d(v.a(v.a(v.a(38, str), str2), str3), str, "/", str2, " (Linux;Android "));
    }

    public static byte[] getUtf8Bytes(String str) {
        return str.getBytes(Charsets.UTF_8);
    }

    public static byte[] gzip(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th3) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e4) {
            l2.p(e4);
            return null;
        }
    }

    public static int inferContentType(String str) {
        String lowerCase = Ascii.toLowerCase(str);
        if (lowerCase.endsWith(".mpd")) {
            return 0;
        }
        if (lowerCase.endsWith(".m3u8")) {
            return 2;
        }
        Matcher matcher = ISM_URL_PATTERN.matcher(lowerCase);
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup == null) {
            return 1;
        }
        if (strGroup.contains(ISM_DASH_FORMAT_EXTENSION)) {
            return 0;
        }
        return strGroup.contains(ISM_HLS_FORMAT_EXTENSION) ? 2 : 1;
    }

    public static int inferContentTypeForUriAndMimeType(Uri uri, String str) {
        if (str == null) {
            return inferContentType(uri);
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

    public static boolean inflate(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, Inflater inflater) {
        if (parsableByteArray.bytesLeft() <= 0) {
            return false;
        }
        if (parsableByteArray2.capacity() < parsableByteArray.bytesLeft()) {
            parsableByteArray2.ensureCapacity(parsableByteArray.bytesLeft() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(parsableByteArray.getData(), parsableByteArray.getPosition(), parsableByteArray.bytesLeft());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(parsableByteArray2.getData(), iInflate, parsableByteArray2.capacity() - iInflate);
                if (inflater.finished()) {
                    parsableByteArray2.setLimit(iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    if (iInflate == parsableByteArray2.capacity()) {
                        parsableByteArray2.ensureCapacity(parsableByteArray2.capacity() * 2);
                    }
                }
                inflater.reset();
                return false;
            } catch (DataFormatException unused) {
                inflater.reset();
                return false;
            } catch (Throwable th3) {
                inflater.reset();
                throw th3;
            }
        }
    }

    public static boolean isAutomotive(Context context) {
        return SDK_INT >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static boolean isEncodingHighResolutionPcm(int i14) {
        return i14 == 536870912 || i14 == 805306368 || i14 == 4;
    }

    public static boolean isEncodingLinearPcm(int i14) {
        return i14 == 3 || i14 == 2 || i14 == 268435456 || i14 == 536870912 || i14 == 805306368 || i14 == 4;
    }

    public static boolean isLinebreak(int i14) {
        return i14 == 10 || i14 == 13;
    }

    public static boolean isLocalFileUri(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    private static boolean isTrafficRestricted(Uri uri) {
        return "http".equals(uri.getScheme()) && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted((String) Assertions.checkNotNull(uri.getHost()));
    }

    public static boolean isTv(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$newSingleThreadExecutor$0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static int linearSearch(long[] jArr, long j8) {
        for (int i14 = 0; i14 < jArr.length; i14++) {
            if (jArr[i14] == j8) {
                return i14;
            }
        }
        return -1;
    }

    private static String maybeReplaceLegacyLanguageTags(String str) {
        int i14 = 0;
        while (true) {
            String[] strArr = isoLegacyTagReplacements;
            if (i14 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i14])) {
                String strValueOf = String.valueOf(strArr[i14 + 1]);
                String strSubstring = str.substring(strArr[i14].length());
                return strSubstring.length() != 0 ? strValueOf.concat(strSubstring) : new String(strValueOf);
            }
            i14 += 2;
        }
    }

    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, MediaItem... mediaItemArr) {
        if (SDK_INT < 23) {
            return false;
        }
        for (MediaItem mediaItem : mediaItemArr) {
            MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                if (isLocalFileUri(localConfiguration.uri)) {
                    return requestExternalStoragePermission(activity);
                }
                for (int i14 = 0; i14 < mediaItem.localConfiguration.subtitleConfigurations.size(); i14++) {
                    if (isLocalFileUri(mediaItem.localConfiguration.subtitleConfigurations.get(i14).uri)) {
                        return requestExternalStoragePermission(activity);
                    }
                }
            }
        }
        return false;
    }

    public static long minValue(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            t.g();
            return 0L;
        }
        long jMin = Long.MAX_VALUE;
        for (int i14 = 0; i14 < sparseLongArray.size(); i14++) {
            jMin = Math.min(jMin, sparseLongArray.valueAt(i14));
        }
        return jMin;
    }

    public static <T> void moveItems(List<T> list, int i14, int i15, int i16) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i17 = (i15 - i14) - 1; i17 >= 0; i17--) {
            arrayDeque.addFirst(list.remove(i14 + i17));
        }
        list.addAll(Math.min(i16, list.size()), arrayDeque);
    }

    public static long msToUs(long j8) {
        return (j8 == C.TIME_UNSET || j8 == Long.MIN_VALUE) ? j8 : j8 * 1000;
    }

    public static ExecutorService newSingleThreadExecutor(String str) {
        return Executors.newSingleThreadExecutor(new a8.a(str, 1));
    }

    public static String normalizeLanguageCode(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals(C.LANGUAGE_UNDETERMINED)) {
            str = strReplace;
        }
        String lowerCase = Ascii.toLowerCase(str);
        String str2 = splitAtFirst(lowerCase, "-")[0];
        if (languageTagReplacementMap == null) {
            languageTagReplacementMap = createIsoLanguageReplacementMap();
        }
        String str3 = languageTagReplacementMap.get(str2);
        if (str3 != null) {
            String strSubstring = lowerCase.substring(str2.length());
            lowerCase = strSubstring.length() != 0 ? str3.concat(strSubstring) : new String(str3);
            str2 = str3;
        }
        return (BooleanUtils.NO.equals(str2) || IntegerTokenConverter.CONVERTER_KEY.equals(str2) || "zh".equals(str2)) ? maybeReplaceLegacyLanguageTags(lowerCase) : lowerCase;
    }

    public static <T> T[] nullSafeArrayAppend(T[] tArr, T t7) {
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length + 1);
        objArrCopyOf[tArr.length] = t7;
        return (T[]) castNonNullTypeArray(objArrCopyOf);
    }

    public static <T> T[] nullSafeArrayConcatenation(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static <T> T[] nullSafeArrayCopy(T[] tArr, int i14) {
        Assertions.checkArgument(i14 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i14);
    }

    public static <T> T[] nullSafeArrayCopyOfRange(T[] tArr, int i14, int i15) {
        Assertions.checkArgument(i14 >= 0);
        Assertions.checkArgument(i15 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i14, i15);
    }

    public static <T> void nullSafeListToArray(List<T> list, T[] tArr) {
        Assertions.checkState(list.size() == tArr.length);
        list.toArray(tArr);
    }

    public static long parseXsDateTime(String str) throws ParserException {
        Matcher matcher = XS_DATE_TIME_PATTERN.matcher(str);
        if (!matcher.matches()) {
            String strValueOf = String.valueOf(str);
            throw ParserException.createForMalformedContainer(strValueOf.length() != 0 ? "Invalid date/time format: ".concat(strValueOf) : new String("Invalid date/time format: "), null);
        }
        int i14 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i14 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
            if ("-".equals(matcher.group(11))) {
                i14 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone(TimeZones.GMT_ID));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            String strValueOf2 = String.valueOf(matcher.group(8));
            gregorianCalendar.set(14, new BigDecimal(strValueOf2.length() != 0 ? "0.".concat(strValueOf2) : new String("0.")).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i14 != 0 ? timeInMillis - ((long) (i14 * DateTimeConstants.MILLIS_PER_MINUTE)) : timeInMillis;
    }

    public static long parseXsDuration(String str) {
        Matcher matcher = XS_DURATION_PATTERN.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d14 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d15 = d14 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d16 = d15 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d17 = d16 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d18 = d17 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j8 = (long) ((d18 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j8 : j8;
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

    public static void recursiveDelete(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                recursiveDelete(file2);
            }
        }
        file.delete();
    }

    public static <T> void removeRange(List<T> list, int i14, int i15) {
        if (i14 < 0 || i15 > list.size() || i14 > i15) {
            h.w();
        } else if (i14 != i15) {
            list.subList(i14, i15).clear();
        }
    }

    private static boolean requestExternalStoragePermission(Activity activity) {
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return false;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
        return true;
    }

    public static long scaleLargeTimestamp(long j8, long j14, long j15) {
        if (j15 >= j14 && j15 % j14 == 0) {
            return j8 / (j15 / j14);
        }
        if (j15 < j14 && j14 % j15 == 0) {
            return (j14 / j15) * j8;
        }
        return (long) (j8 * (j14 / j15));
    }

    public static long[] scaleLargeTimestamps(List<Long> list, long j8, long j14) {
        int size = list.size();
        long[] jArr = new long[size];
        int i14 = 0;
        if (j14 >= j8 && j14 % j8 == 0) {
            long j15 = j14 / j8;
            while (i14 < size) {
                jArr[i14] = list.get(i14).longValue() / j15;
                i14++;
            }
        } else if (j14 >= j8 || j8 % j14 != 0) {
            double d14 = j8 / j14;
            while (i14 < size) {
                jArr[i14] = (long) (list.get(i14).longValue() * d14);
                i14++;
            }
        } else {
            long j16 = j8 / j14;
            while (i14 < size) {
                jArr[i14] = list.get(i14).longValue() * j16;
                i14++;
            }
        }
        return jArr;
    }

    public static void scaleLargeTimestampsInPlace(long[] jArr, long j8, long j14) {
        int i14 = 0;
        if (j14 >= j8 && j14 % j8 == 0) {
            long j15 = j14 / j8;
            while (i14 < jArr.length) {
                jArr[i14] = jArr[i14] / j15;
                i14++;
            }
            return;
        }
        if (j14 >= j8 || j8 % j14 != 0) {
            double d14 = j8 / j14;
            while (i14 < jArr.length) {
                jArr[i14] = (long) (jArr[i14] * d14);
                i14++;
            }
            return;
        }
        long j16 = j8 / j14;
        while (i14 < jArr.length) {
            jArr[i14] = jArr[i14] * j16;
            i14++;
        }
    }

    public static long secToUs(double d14) {
        return BigDecimal.valueOf(d14).multiply(BigDecimal.valueOf(1000000L)).longValue();
    }

    private static boolean shouldEscapeCharacter(char c14) {
        return c14 == '\"' || c14 == '%' || c14 == '*' || c14 == '/' || c14 == ':' || c14 == '<' || c14 == '\\' || c14 == '|' || c14 == '>' || c14 == '?';
    }

    public static void sneakyThrow(Throwable th3) throws Throwable {
        sneakyThrowInternal(th3);
    }

    private static <T extends Throwable> void sneakyThrowInternal(Throwable th3) throws Throwable {
        throw th3;
    }

    public static String[] split(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] splitAtFirst(String str, String str2) {
        return str.split(str2, 2);
    }

    public static String[] splitCodecs(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : split(str.trim(), "(\\s*,\\s*)");
    }

    public static ComponentName startForegroundService(Context context, Intent intent) {
        return SDK_INT >= 26 ? context.startForegroundService(intent) : context.startService(intent);
    }

    public static long subtractWithOverflowDefault(long j8, long j14, long j15) {
        long j16 = j8 - j14;
        return ((j8 ^ j16) & (j14 ^ j8)) < 0 ? j15 : j16;
    }

    public static long sum(long... jArr) {
        long j8 = 0;
        for (long j14 : jArr) {
            j8 += j14;
        }
        return j8;
    }

    public static boolean tableExists(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i14 = inputStream.read(bArr);
            if (i14 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i14);
        }
    }

    public static String toHexString(byte[] bArr) {
        StringBuilder sb3 = new StringBuilder(bArr.length * 2);
        for (int i14 = 0; i14 < bArr.length; i14++) {
            sb3.append(Character.forDigit((bArr[i14] >> 4) & 15, 16));
            sb3.append(Character.forDigit(bArr[i14] & Ascii.SI, 16));
        }
        return sb3.toString();
    }

    public static long toLong(int i14, int i15) {
        return toUnsignedLong(i15) | (toUnsignedLong(i14) << 32);
    }

    public static long toUnsignedLong(int i14) {
        return ((long) i14) & 4294967295L;
    }

    public static CharSequence truncateAscii(CharSequence charSequence, int i14) {
        return charSequence.length() <= i14 ? charSequence : charSequence.subSequence(0, i14);
    }

    public static String unescapeFileName(String str) {
        int length = str.length();
        int iEnd = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            if (str.charAt(i15) == '%') {
                i14++;
            }
        }
        if (i14 == 0) {
            return str;
        }
        int i16 = length - (i14 * 2);
        StringBuilder sb3 = new StringBuilder(i16);
        Matcher matcher = ESCAPED_CHARACTER_PATTERN.matcher(str);
        while (i14 > 0 && matcher.find()) {
            char c14 = (char) Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)), 16);
            sb3.append((CharSequence) str, iEnd, matcher.start());
            sb3.append(c14);
            iEnd = matcher.end();
            i14--;
        }
        if (iEnd < length) {
            sb3.append((CharSequence) str, iEnd, length);
        }
        if (sb3.length() != i16) {
            return null;
        }
        return sb3.toString();
    }

    public static long usToMs(long j8) {
        return (j8 == C.TIME_UNSET || j8 == Long.MIN_VALUE) ? j8 : j8 / 1000;
    }

    public static void writeBoolean(Parcel parcel, boolean z14) {
        parcel.writeInt(z14 ? 1 : 0);
    }

    public static int ceilDivide(int i14, int i15) {
        return ((i14 + i15) - 1) / i15;
    }

    public static String fromUtf8Bytes(byte[] bArr, int i14, int i15) {
        return new String(bArr, i14, i15, Charsets.UTF_8);
    }

    public static long constrainValue(long j8, long j14, long j15) {
        return Math.max(j14, Math.min(j8, j15));
    }

    public static Handler createHandlerForCurrentOrMainLooper() {
        return createHandlerForCurrentOrMainLooper(null);
    }

    public static float constrainValue(float f14, float f15, float f16) {
        return Math.max(f15, Math.min(f14, f16));
    }

    public static Handler createHandlerForCurrentLooper() {
        return createHandlerForCurrentLooper(null);
    }

    public static int linearSearch(int[] iArr, int i14) {
        for (int i15 = 0; i15 < iArr.length; i15++) {
            if (iArr[i15] == i14) {
                return i15;
            }
        }
        return -1;
    }

    public static int binarySearchCeil(long[] jArr, long j8, boolean z14, boolean z15) {
        int i14;
        int i15;
        int iBinarySearch = Arrays.binarySearch(jArr, j8);
        if (iBinarySearch < 0) {
            i15 = ~iBinarySearch;
        } else {
            while (true) {
                i14 = iBinarySearch + 1;
                if (i14 >= jArr.length || jArr[i14] != j8) {
                    break;
                }
                iBinarySearch = i14;
            }
            i15 = z14 ? iBinarySearch : i14;
        }
        return z15 ? Math.min(jArr.length - 1, i15) : i15;
    }

    public static int binarySearchCeil(int[] iArr, int i14, boolean z14, boolean z15) {
        int i15;
        int i16;
        int iBinarySearch = Arrays.binarySearch(iArr, i14);
        if (iBinarySearch < 0) {
            i16 = ~iBinarySearch;
        } else {
            while (true) {
                i15 = iBinarySearch + 1;
                if (i15 >= iArr.length || iArr[i15] != i14) {
                    break;
                }
                iBinarySearch = i15;
            }
            i16 = z14 ? iBinarySearch : i15;
        }
        return z15 ? Math.min(iArr.length - 1, i16) : i16;
    }

    public static int binarySearchFloor(long[] jArr, long j8, boolean z14, boolean z15) {
        int i14;
        int i15;
        int iBinarySearch = Arrays.binarySearch(jArr, j8);
        if (iBinarySearch < 0) {
            i15 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i14 = iBinarySearch - 1;
                if (i14 < 0 || jArr[i14] != j8) {
                    break;
                }
                iBinarySearch = i14;
            }
            i15 = z14 ? iBinarySearch : i14;
        }
        return z15 ? Math.max(0, i15) : i15;
    }

    public static <T extends Comparable<? super T>> int binarySearchFloor(List<? extends Comparable<? super T>> list, T t7, boolean z14, boolean z15) {
        int i14;
        int i15;
        int iBinarySearch = Collections.binarySearch(list, t7);
        if (iBinarySearch < 0) {
            i15 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i14 = iBinarySearch - 1;
                if (i14 < 0 || list.get(i14).compareTo(t7) != 0) {
                    break;
                }
                iBinarySearch = i14;
            }
            i15 = z14 ? iBinarySearch : i14;
        }
        return z15 ? Math.max(0, i15) : i15;
    }

    public static int binarySearchFloor(int[] iArr, int i14, boolean z14, boolean z15) {
        int i15;
        int i16;
        int iBinarySearch = Arrays.binarySearch(iArr, i14);
        if (iBinarySearch < 0) {
            i16 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i15 = iBinarySearch - 1;
                if (i15 < 0 || iArr[i15] != i14) {
                    break;
                }
                iBinarySearch = i15;
            }
            i16 = z14 ? iBinarySearch : i15;
        }
        return z15 ? Math.max(0, i16) : i16;
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

    public static int inferContentType(Uri uri, String str) {
        if (TextUtils.isEmpty(str)) {
            return inferContentType(uri);
        }
        String strValueOf = String.valueOf(str);
        return inferContentType(strValueOf.length() != 0 ? ".".concat(strValueOf) : new String("."));
    }

    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, Uri... uriArr) {
        if (SDK_INT < 23) {
            return false;
        }
        for (Uri uri : uriArr) {
            if (isLocalFileUri(uri)) {
                return requestExternalStoragePermission(activity);
            }
        }
        return false;
    }

    public static Point getCurrentDisplayModeSize(Context context) {
        DisplayManager displayManager;
        Display display = (SDK_INT < 17 || (displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION)) == null) ? null : displayManager.getDisplay(0);
        if (display == null) {
            display = ((WindowManager) Assertions.checkNotNull((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return getCurrentDisplayModeSize(context, display);
    }
}
