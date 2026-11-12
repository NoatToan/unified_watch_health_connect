package fa;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.garmin.android.apps.connectmobile.training.atp.create.video.PlayerActivity;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.common.base.Ascii;
import com.google.common.io.ByteStreams;
import com.google.common.math.DoubleMath;
import com.google.common.math.LongMath;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.mlkit.common.MlKitException;
import i3.e5;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.apache.commons.lang3.BooleanUtils;
import v.e0;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f70071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f70072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f70073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f70074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f70075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f70076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long[] f70077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f70078h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f70079i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static HashMap<String, String> f70080j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String[] f70081k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String[] f70082l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f70083m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f70084n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f70085o;

    static {
        int i14 = Build.VERSION.SDK_INT;
        f70071a = i14;
        String str = Build.DEVICE;
        f70072b = str;
        String str2 = Build.MANUFACTURER;
        f70073c = str2;
        String str3 = Build.MODEL;
        f70074d = str3;
        f70075e = j20.x.e(e5.l(str, ", ", str3, ", ", str2), i14, ", ");
        f70076f = new byte[0];
        f70077g = new long[0];
        f70078h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        f70079i = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f70081k = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", TtmlNode.ATTR_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f70082l = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f70083m = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f70084n = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f70085o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR, SyslogConstants.LOG_LOCAL2, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, PsExtractor.PRIVATE_STREAM_1, 199, 192, 201, MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, SyslogConstants.LOG_LOCAL6, 185, 190, 171, TsExtractor.TS_STREAM_TYPE_AC4, 165, 162, 143, SyslogConstants.LOG_LOCAL1, 129, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, TsExtractor.TS_STREAM_TYPE_E_AC3, 128, 149, 146, ModuleDescriptor.MODULE_VERSION, 156, 177, 182, 191, SyslogConstants.LOG_LOCAL7, 173, 170, 163, 164, 249, 254, 247, PsExtractor.VIDEO_STREAM_MASK, 229, 226, 235, 236, 193, 198, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, SyslogConstants.LOG_LOCAL4, 167, 178, 181, TsExtractor.TS_PACKET_SIZE, 187, 150, 145, SyslogConstants.LOG_LOCAL3, 159, TsExtractor.TS_STREAM_TYPE_DTS, 141, 132, 131, 222, 217, 208, 215, 194, 197, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    private z() {
    }

    public static String A(StringBuilder sb3, Formatter formatter, long j8) {
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

    public static String B(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e4) {
            k.d("Failed to read system property ".concat(str), e4);
            return null;
        }
    }

    public static String C(int i14) {
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
                return i14 >= 10000 ? e0.f(i14, "custom (", ")") : CallerData.NA;
        }
    }

    public static String D(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = CallerData.NA;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("/");
        sb3.append(str2);
        sb3.append(" (Linux;Android ");
        return am.j.o(Build.VERSION.RELEASE, ") AndroidXMedia3/1.5.1", sb3);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:20:0x002e A[RETURN] */
    public static boolean E(androidx.media3.common.z zVar) {
        boolean z14 = false;
        if (zVar == null) {
            return false;
        }
        int playbackState = zVar.getPlaybackState();
        if (playbackState != 1 || !zVar.isCommandAvailable(2)) {
            if (playbackState == 4 && zVar.isCommandAvailable(4)) {
                zVar.seekToDefaultPosition();
            }
            if (zVar.isCommandAvailable(1)) {
                return z14;
            }
            zVar.play();
            return true;
        }
        zVar.prepare();
        z14 = true;
        if (zVar.isCommandAvailable(1)) {
            return z14;
        }
        zVar.play();
        return true;
    }

    public static int F(Uri uri, String str) {
        int i14;
        if (str != null) {
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
        String scheme = uri.getScheme();
        if (scheme != null && Ascii.equalsIgnoreCase("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            int iLastIndexOf = lastPathSegment.lastIndexOf(46);
            if (iLastIndexOf >= 0) {
                String lowerCase = Ascii.toLowerCase(lastPathSegment.substring(iLastIndexOf + 1));
                lowerCase.getClass();
                switch (lowerCase.hashCode()) {
                    case 104579:
                        if (lowerCase.equals("ism")) {
                        }
                        break;
                    case 108321:
                        if (lowerCase.equals("mpd")) {
                        }
                        break;
                    case 3242057:
                        if (lowerCase.equals("isml")) {
                        }
                        break;
                    case 3299913:
                        if (lowerCase.equals("m3u8")) {
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    */
                /*
                    Method dump skipped, instruction units count: 280
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fa.z.F(android.net.Uri, java.lang.String):int");
            }

            public static boolean G(r rVar, r rVar2, Inflater inflater) {
                if (rVar.a() <= 0) {
                    return false;
                }
                if (rVar2.f70054a.length < rVar.a()) {
                    rVar2.b(rVar.a() * 2);
                }
                if (inflater == null) {
                    inflater = new Inflater();
                }
                inflater.setInput(rVar.f70054a, rVar.f70055b, rVar.a());
                int iInflate = 0;
                while (true) {
                    try {
                        byte[] bArr = rVar2.f70054a;
                        iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                        if (inflater.finished()) {
                            rVar2.F(iInflate);
                            inflater.reset();
                            return true;
                        }
                        if (!inflater.needsDictionary() && !inflater.needsInput()) {
                            byte[] bArr2 = rVar2.f70054a;
                            if (iInflate == bArr2.length) {
                                rVar2.b(bArr2.length * 2);
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

            public static void H(int i14) {
                Integer.toString(i14, 36);
            }

            public static boolean I(int i14) {
                return i14 == 3 || i14 == 2 || i14 == 268435456 || i14 == 21 || i14 == 1342177280 || i14 == 22 || i14 == 1610612736 || i14 == 4;
            }

            public static boolean J(Context context) {
                int i14 = f70071a;
                if (i14 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
                    return true;
                }
                String str = f70074d;
                if (i14 == 30 && (Ascii.equalsIgnoreCase(str, "moto g(20)") || Ascii.equalsIgnoreCase(str, "rmx3231"))) {
                    return true;
                }
                return i14 == 34 && Ascii.equalsIgnoreCase(str, "sm-x200");
            }

            public static boolean K(int i14) {
                return i14 == 10 || i14 == 13;
            }

            public static boolean L(Context context) {
                UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
                return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
            }

            public static String M(Context context, String str) {
                InputStream inputStreamOpen = null;
                try {
                    inputStreamOpen = context.getAssets().open(str);
                    return n(ByteStreams.toByteArray(inputStreamOpen));
                } finally {
                    g(inputStreamOpen);
                }
            }

            /* JADX WARN: Code duplicated, block: B:25:0x0060  */
            /* JADX WARN: Code duplicated, block: B:4:0x0008  */
            public static boolean N(PlayerActivity playerActivity, Uri uri) {
                boolean z14;
                boolean z15;
                int i14 = f70071a;
                if (i14 < 23) {
                    z15 = false;
                } else {
                    String scheme = uri.getScheme();
                    if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
                        try {
                            String path = uri.getPath();
                            if (path == null) {
                                z14 = false;
                            } else {
                                String canonicalPath = new File(path).getCanonicalPath();
                                String canonicalPath2 = playerActivity.getFilesDir().getCanonicalPath();
                                String canonicalPath3 = null;
                                File externalFilesDir = playerActivity.getExternalFilesDir(null);
                                if (externalFilesDir != null) {
                                    canonicalPath3 = externalFilesDir.getCanonicalPath();
                                }
                                if (canonicalPath.startsWith(canonicalPath2) || (canonicalPath3 != null && canonicalPath.startsWith(canonicalPath3))) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                            }
                        } catch (IOException unused) {
                        }
                        z15 = !z14;
                    } else if (FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
                        List<String> pathSegments = uri.getPathSegments();
                        if (pathSegments.isEmpty()) {
                            z15 = false;
                        } else {
                            String str = pathSegments.get(0);
                            if ("external".equals(str) || "external_primary".equals(str)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                        }
                    } else {
                        z15 = false;
                    }
                }
                if (!z15) {
                    return false;
                }
                if (i14 < 33) {
                    if (playerActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                        return false;
                    }
                    playerActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
                    return true;
                }
                if (playerActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0 && playerActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && playerActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0) {
                    return false;
                }
                playerActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 0);
                return true;
            }

            public static long O(long j8) {
                return (j8 == C.TIME_UNSET || j8 == Long.MIN_VALUE) ? j8 : j8 * 1000;
            }

            public static String P(String str) {
                if (str == null) {
                    return null;
                }
                String strReplace = str.replace('_', '-');
                if (!strReplace.isEmpty() && !strReplace.equals(C.LANGUAGE_UNDETERMINED)) {
                    str = strReplace;
                }
                String lowerCase = Ascii.toLowerCase(str);
                int i14 = 0;
                String str2 = lowerCase.split("-", 2)[0];
                if (f70080j == null) {
                    String[] iSOLanguages = Locale.getISOLanguages();
                    int length = iSOLanguages.length;
                    String[] strArr = f70081k;
                    HashMap<String, String> map = new HashMap<>(length + strArr.length);
                    for (String str3 : iSOLanguages) {
                        try {
                            String iSO3Language = new Locale(str3).getISO3Language();
                            if (!TextUtils.isEmpty(iSO3Language)) {
                                map.put(iSO3Language, str3);
                            }
                        } catch (MissingResourceException unused) {
                        }
                    }
                    for (int i15 = 0; i15 < strArr.length; i15 += 2) {
                        map.put(strArr[i15], strArr[i15 + 1]);
                    }
                    f70080j = map;
                }
                String str4 = f70080j.get(str2);
                if (str4 != null) {
                    lowerCase = str4.concat(lowerCase.substring(str2.length()));
                    str2 = str4;
                }
                if (!BooleanUtils.NO.equals(str2) && !IntegerTokenConverter.CONVERTER_KEY.equals(str2) && !"zh".equals(str2)) {
                    return lowerCase;
                }
                while (true) {
                    String[] strArr2 = f70082l;
                    if (i14 >= strArr2.length) {
                        return lowerCase;
                    }
                    if (lowerCase.startsWith(strArr2[i14])) {
                        return strArr2[i14 + 1] + lowerCase.substring(strArr2[i14].length());
                    }
                    i14 += 2;
                }
            }

            public static <T> T[] Q(T[] tArr, int i14) {
                a.a(i14 <= tArr.length);
                return (T[]) Arrays.copyOf(tArr, i14);
            }

            public static void R(Handler handler, Runnable runnable) {
                if (handler.getLooper().getThread().isAlive()) {
                    if (handler.getLooper() == Looper.myLooper()) {
                        runnable.run();
                    } else {
                        handler.post(runnable);
                    }
                }
            }

            public static long S(int i14, long j8) {
                return U(j8, 1000000L, i14, RoundingMode.DOWN);
            }

            public static void T(long[] jArr, long j8) {
                long j14;
                RoundingMode roundingMode = RoundingMode.DOWN;
                int i14 = 0;
                if (j8 >= 1000000 && j8 % 1000000 == 0) {
                    long jDivide = LongMath.divide(j8, 1000000L, RoundingMode.UNNECESSARY);
                    while (i14 < jArr.length) {
                        jArr[i14] = LongMath.divide(jArr[i14], jDivide, roundingMode);
                        i14++;
                    }
                    return;
                }
                if (j8 < 1000000 && 1000000 % j8 == 0) {
                    long jDivide2 = LongMath.divide(1000000L, j8, RoundingMode.UNNECESSARY);
                    while (i14 < jArr.length) {
                        jArr[i14] = LongMath.saturatedMultiply(jArr[i14], jDivide2);
                        i14++;
                    }
                    return;
                }
                int i15 = 0;
                while (i15 < jArr.length) {
                    long j15 = jArr[i15];
                    if (j15 != 0) {
                        if (j8 >= j15 && j8 % j15 == 0) {
                            jArr[i15] = LongMath.divide(1000000L, LongMath.divide(j8, j15, RoundingMode.UNNECESSARY), roundingMode);
                        } else if (j8 >= j15 || j15 % j8 != 0) {
                            j14 = j8;
                            jArr[i15] = V(j15, 1000000L, j14, roundingMode);
                        } else {
                            jArr[i15] = LongMath.saturatedMultiply(1000000L, LongMath.divide(j15, j8, RoundingMode.UNNECESSARY));
                        }
                        j14 = j8;
                    } else {
                        j14 = j8;
                    }
                    i15++;
                    j8 = j14;
                }
            }

            public static long U(long j8, long j14, long j15, RoundingMode roundingMode) {
                if (j8 == 0 || j14 == 0) {
                    return 0L;
                }
                if (j15 >= j14 && j15 % j14 == 0) {
                    return LongMath.divide(j8, LongMath.divide(j15, j14, RoundingMode.UNNECESSARY), roundingMode);
                }
                if (j15 < j14 && j14 % j15 == 0) {
                    return LongMath.saturatedMultiply(j8, LongMath.divide(j14, j15, RoundingMode.UNNECESSARY));
                }
                if (j15 < j8 || j15 % j8 != 0) {
                    return (j15 >= j8 || j8 % j15 != 0) ? V(j8, j14, j15, roundingMode) : LongMath.saturatedMultiply(j14, LongMath.divide(j8, j15, RoundingMode.UNNECESSARY));
                }
                return LongMath.divide(j14, LongMath.divide(j15, j8, RoundingMode.UNNECESSARY), roundingMode);
            }

            public static long V(long j8, long j14, long j15, RoundingMode roundingMode) {
                long jSaturatedMultiply = LongMath.saturatedMultiply(j8, j14);
                if (jSaturatedMultiply != Long.MAX_VALUE && jSaturatedMultiply != Long.MIN_VALUE) {
                    return LongMath.divide(jSaturatedMultiply, j15, roundingMode);
                }
                long jGcd = LongMath.gcd(Math.abs(j14), Math.abs(j15));
                RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
                long jDivide = LongMath.divide(j14, jGcd, roundingMode2);
                long jDivide2 = LongMath.divide(j15, jGcd, roundingMode2);
                long jGcd2 = LongMath.gcd(Math.abs(j8), Math.abs(jDivide2));
                long jDivide3 = LongMath.divide(j8, jGcd2, roundingMode2);
                long jDivide4 = LongMath.divide(jDivide2, jGcd2, roundingMode2);
                long jSaturatedMultiply2 = LongMath.saturatedMultiply(jDivide3, jDivide);
                if (jSaturatedMultiply2 != Long.MAX_VALUE && jSaturatedMultiply2 != Long.MIN_VALUE) {
                    return LongMath.divide(jSaturatedMultiply2, jDivide4, roundingMode);
                }
                double d14 = jDivide3 * (jDivide / jDivide4);
                if (d14 > 9.223372036854776E18d) {
                    return Long.MAX_VALUE;
                }
                if (d14 < -9.223372036854776E18d) {
                    return Long.MIN_VALUE;
                }
                return DoubleMath.roundToLong(d14, roundingMode);
            }

            public static boolean W(androidx.media3.common.z zVar, boolean z14) {
                return zVar == null || !zVar.getPlayWhenReady() || zVar.getPlaybackState() == 1 || zVar.getPlaybackState() == 4 || (z14 && zVar.getPlaybackSuppressionReason() != 0);
            }

            public static String[] X(String str) {
                return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
            }

            public static long Y(long j8) {
                return (j8 == C.TIME_UNSET || j8 == Long.MIN_VALUE) ? j8 : j8 / 1000;
            }

            public static int a(long[] jArr, long j8, boolean z14) {
                int i14;
                int iBinarySearch = Arrays.binarySearch(jArr, j8);
                if (iBinarySearch < 0) {
                    return ~iBinarySearch;
                }
                while (true) {
                    i14 = iBinarySearch + 1;
                    if (i14 >= jArr.length || jArr[i14] != j8) {
                        break;
                    }
                    iBinarySearch = i14;
                }
                return z14 ? iBinarySearch : i14;
            }

            public static int b(l lVar, long j8) {
                int i14 = lVar.f70034a - 1;
                int i15 = 0;
                while (i15 <= i14) {
                    int i16 = (i15 + i14) >>> 1;
                    if (lVar.c(i16) < j8) {
                        i15 = i16 + 1;
                    } else {
                        i14 = i16 - 1;
                    }
                }
                int i17 = i14 + 1;
                if (i17 < lVar.f70034a && lVar.c(i17) == j8) {
                    return i17;
                }
                if (i14 == -1) {
                    return 0;
                }
                return i14;
            }

            public static int c(List list, Long l14, boolean z14) {
                int i14;
                int iBinarySearch = Collections.binarySearch(list, l14);
                if (iBinarySearch < 0) {
                    i14 = -(iBinarySearch + 2);
                } else {
                    while (true) {
                        int i15 = iBinarySearch - 1;
                        if (i15 < 0 || ((Comparable) list.get(i15)).compareTo(l14) != 0) {
                            break;
                        }
                        iBinarySearch = i15;
                    }
                    i14 = iBinarySearch;
                }
                return z14 ? Math.max(0, i14) : i14;
            }

            public static int d(int[] iArr, int i14, boolean z14, boolean z15) {
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

            public static int e(long[] jArr, long j8, boolean z14) {
                int i14;
                int iBinarySearch = Arrays.binarySearch(jArr, j8);
                if (iBinarySearch < 0) {
                    i14 = -(iBinarySearch + 2);
                } else {
                    while (true) {
                        int i15 = iBinarySearch - 1;
                        if (i15 < 0 || jArr[i15] != j8) {
                            break;
                        }
                        iBinarySearch = i15;
                    }
                    i14 = iBinarySearch;
                }
                return z14 ? Math.max(0, i14) : i14;
            }

            public static int f(int i14, int i15) {
                return ((i14 + i15) - 1) / i15;
            }

            public static void g(Closeable closeable) {
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (IOException unused) {
                    }
                }
            }

            public static float h(float f14, float f15, float f16) {
                return Math.max(f15, Math.min(f14, f16));
            }

            public static int i(int i14, int i15, int i16) {
                return Math.max(i15, Math.min(i14, i16));
            }

            public static long j(long j8, long j14, long j15) {
                return Math.max(j14, Math.min(j8, j15));
            }

            public static boolean k(Object[] objArr, Object obj) {
                for (Object obj2 : objArr) {
                    if (Objects.equals(obj2, obj)) {
                        return true;
                    }
                }
                return false;
            }

            public static int l(byte[] bArr, int i14, int i15, int i16) {
                while (i14 < i15) {
                    i16 = f70083m[((i16 >>> 24) ^ (bArr[i14] & 255)) & 255] ^ (i16 << 8);
                    i14++;
                }
                return i16;
            }

            public static Handler m(androidx.media3.exoplayer.video.b.e eVar) {
                Looper looperMyLooper = Looper.myLooper();
                a.f(looperMyLooper);
                return new Handler(looperMyLooper, eVar);
            }

            public static String n(byte[] bArr) {
                return new String(bArr, StandardCharsets.UTF_8);
            }

            public static int o(int i14) {
                if (i14 == 20) {
                    return 30;
                }
                if (i14 == 22) {
                    return 31;
                }
                if (i14 == 30) {
                    return 34;
                }
                switch (i14) {
                    case 2:
                    case 3:
                        return 3;
                    case 4:
                    case 5:
                    case 6:
                        return 21;
                    case 7:
                    case 8:
                        return 23;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        return 28;
                    default:
                        switch (i14) {
                            case 14:
                                return 25;
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                                return 28;
                            default:
                                return Integer.MAX_VALUE;
                        }
                }
            }

            public static AudioFormat p(int i14, int i15, int i16) {
                return new AudioFormat.Builder().setSampleRate(i14).setChannelMask(i15).setEncoding(i16).build();
            }

            @SuppressLint({"InlinedApi"})
            public static int q(int i14) {
                int i15 = f70071a;
                if (i14 == 10) {
                    return i15 >= 32 ? 737532 : 6396;
                }
                if (i14 == 12) {
                    return 743676;
                }
                if (i14 == 24) {
                    return i15 >= 32 ? 67108860 : 0;
                }
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
                        return 6396;
                    default:
                        return 0;
                }
            }

            public static int r(String str, int i14) {
                int i15 = 0;
                for (String str2 : X(str)) {
                    if (i14 == androidx.media3.common.x.h(androidx.media3.common.x.d(str2))) {
                        i15++;
                    }
                }
                return i15;
            }

            public static String s(String str, int i14) {
                String[] strArrX = X(str);
                if (strArrX.length == 0) {
                    return null;
                }
                StringBuilder sb3 = new StringBuilder();
                for (String str2 : strArrX) {
                    if (i14 == androidx.media3.common.x.h(androidx.media3.common.x.d(str2))) {
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

            public static int t(int i14) {
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

            public static int u(String str) {
                String[] strArrSplit;
                int length;
                int i14 = 0;
                if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
                    return 0;
                }
                String str2 = strArrSplit[length - 1];
                boolean z14 = length >= 3 && "neg".equals(strArrSplit[length - 2]);
                try {
                    str2.getClass();
                    i14 = Integer.parseInt(str2);
                    if (z14) {
                        return -i14;
                    }
                } catch (NumberFormatException unused) {
                }
                return i14;
            }

            public static String v(int i14) {
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
                j20.x.h();
                return null;
            }

            public static long w(long j8, float f14) {
                return f14 == 1.0f ? j8 : Math.round(j8 * ((double) f14));
            }

            public static int x(int i14) {
                if (i14 == 8) {
                    return 3;
                }
                if (i14 == 16) {
                    return 2;
                }
                if (i14 != 24) {
                    return i14 != 32 ? 0 : 22;
                }
                return 21;
            }

            /* JADX WARN: Code duplicated, block: B:21:0x0023  */
            /* JADX WARN: Code duplicated, block: B:22:0x0025  */
            public static int y(int i14, int i15) {
                int i16 = 2;
                if (i14 != 2) {
                    if (i14 == 3) {
                        i16 = 1;
                    } else if (i14 == 4) {
                        i16 = 4;
                    } else if (i14 == 21) {
                        i16 = 3;
                    } else if (i14 == 22) {
                        i16 = 4;
                    } else if (i14 != 268435456) {
                        if (i14 != 1342177280) {
                            if (i14 != 1610612736) {
                                vb.h.w();
                                return 0;
                            }
                            i16 = 4;
                        } else {
                            i16 = 3;
                        }
                    }
                }
                return i16 * i15;
            }

            public static long z(long j8, float f14) {
                return f14 == 1.0f ? j8 : Math.round(j8 / ((double) f14));
            }
        }
