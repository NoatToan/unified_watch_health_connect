package defpackage;

import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class ayf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList<a> f3574a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f3575b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f3577b;
        public final int c;
    }

    @VisibleForTesting
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f3579b;

        public b(int i, int i2) {
            this.f3578a = i;
            this.f3579b = i2;
        }
    }

    public static boolean a(String str, String str2) {
        b bVarI;
        int iD;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (bVarI = i(str2)) == null || (iD = C3515if.d(bVarI.f3579b)) == 0 || iD == 16) ? false : true;
            default:
                return false;
        }
    }

    public static boolean b(String str, String str2) {
        return d(str, str2) != null;
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : wlq.O0(str)) {
            String strG = g(str2);
            if (strG != null && p(strG)) {
                return strG;
            }
        }
        return null;
    }

    public static String d(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] strArrO0 = wlq.O0(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : strArrO0) {
            if (str2.equals(g(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static String e(String str) {
        int size = f3574a.size();
        for (int i = 0; i < size; i++) {
            a aVar = f3574a.get(i);
            if (str.startsWith(aVar.f3577b)) {
                return aVar.f3576a;
            }
        }
        return null;
    }

    public static int f(String str, String str2) {
        b bVarI;
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (bVarI = i(str2)) == null) {
                    return 0;
                }
                return C3515if.d(bVarI.f3579b);
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String g(String str) {
        b bVarI;
        String strH = null;
        if (str == null) {
            return null;
        }
        String strE = fk1.e(str.trim());
        if (strE.startsWith("avc1") || strE.startsWith("avc3")) {
            return "video/avc";
        }
        if (strE.startsWith("hev1") || strE.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strE.startsWith("dvav") || strE.startsWith("dva1") || strE.startsWith("dvhe") || strE.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strE.startsWith("av01")) {
            return "video/av01";
        }
        if (strE.startsWith("vp9") || strE.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strE.startsWith("vp8") || strE.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strE.startsWith("mp4a")) {
            if (strE.startsWith("mp4a.") && (bVarI = i(strE)) != null) {
                strH = h(bVarI.f3578a);
            }
            return strH == null ? MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE : strH;
        }
        if (strE.startsWith("ac-3") || strE.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strE.startsWith("ec-3") || strE.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strE.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strE.startsWith("ac-4") || strE.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strE.startsWith("dtsc") || strE.startsWith("dtse")) {
            return "audio/vnd.dts";
        }
        if (strE.startsWith("dtsh") || strE.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strE.startsWith("opus")) {
            return "audio/opus";
        }
        if (strE.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strE.startsWith("flac")) {
            return "audio/flac";
        }
        if (strE.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (strE.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strE.contains("cea708")) {
            return "application/cea-708";
        }
        return (strE.contains("eia608") || strE.contains("cea608")) ? "application/cea-608" : e(strE);
    }

    public static String h(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE;
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE;
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    @VisibleForTesting
    public static b i(String str) {
        Matcher matcher = f3575b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) rk1.e(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new b(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : wlq.O0(str)) {
            String strG = g(str2);
            if (strG != null && r(strG)) {
                return strG;
            }
        }
        return null;
    }

    public static String k(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int l(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (p(str)) {
            return 1;
        }
        if (s(str)) {
            return 2;
        }
        if (r(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return m(str);
    }

    public static int m(String str) {
        int size = f3574a.size();
        for (int i = 0; i < size; i++) {
            a aVar = f3574a.get(i);
            if (str.equals(aVar.f3576a)) {
                return aVar.c;
            }
        }
        return -1;
    }

    public static int n(String str) {
        return l(g(str));
    }

    public static String o(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : wlq.O0(str)) {
            String strG = g(str2);
            if (strG != null && s(strG)) {
                return strG;
            }
        }
        return null;
    }

    public static boolean p(String str) {
        return "audio".equals(k(str));
    }

    public static boolean q(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska");
    }

    public static boolean r(String str) {
        return "text".equals(k(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean s(String str) {
        return "video".equals(k(str));
    }

    public static String t(String str) {
        str.hashCode();
        switch (str) {
            case "audio/x-flac":
                return "audio/flac";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return str;
        }
    }
}
