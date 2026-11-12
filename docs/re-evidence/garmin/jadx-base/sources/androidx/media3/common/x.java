package androidx.media3.common;

import android.text.TextUtils;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList<a> f8576a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f8577b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f8578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f8579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8580c;

        public a(String str, String str2, int i14) {
            this.f8578a = str;
            this.f8579b = str2;
            this.f8580c = i14;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8582b;

        public b(int i14, int i15) {
            this.f8581a = i14;
            this.f8582b = i15;
        }

        public final int a() {
            int i14 = this.f8582b;
            if (i14 == 2) {
                return 10;
            }
            if (i14 == 5) {
                return 11;
            }
            if (i14 == 29) {
                return 12;
            }
            if (i14 == 42) {
                return 16;
            }
            if (i14 != 22) {
                return i14 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    private x() {
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : fa.z.X(str)) {
            String strD = d(str2);
            if (strD != null && j(strD)) {
                return strD;
            }
        }
        return null;
    }

    public static String b(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrX = fa.z.X(str);
            StringBuilder sb3 = new StringBuilder();
            for (String str3 : strArrX) {
                if (str2.equals(d(str3))) {
                    if (sb3.length() > 0) {
                        sb3.append(",");
                    }
                    sb3.append(str3);
                }
            }
            if (sb3.length() > 0) {
                return sb3.toString();
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int c(String str, String str2) {
        b bVarF;
        str.getClass();
        byte b14 = -1;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    b14 = 0;
                }
                break;
            case -1365340241:
                if (str.equals(MimeTypes.AUDIO_DTS_EXPRESS)) {
                    b14 = 1;
                }
                break;
            case -1095064472:
                if (str.equals(MimeTypes.AUDIO_DTS)) {
                    b14 = 2;
                }
                break;
            case -53558318:
                if (str.equals(MimeTypes.AUDIO_AAC)) {
                    b14 = 3;
                }
                break;
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                    b14 = 4;
                }
                break;
            case 187078297:
                if (str.equals(MimeTypes.AUDIO_AC4)) {
                    b14 = 5;
                }
                break;
            case 550520934:
                if (str.equals(MimeTypes.AUDIO_DTS_X)) {
                    b14 = 6;
                }
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                    b14 = 7;
                }
                break;
            case 1504831518:
                if (str.equals(MimeTypes.AUDIO_MPEG)) {
                    b14 = 8;
                }
                break;
            case 1504891608:
                if (str.equals(MimeTypes.AUDIO_OPUS)) {
                    b14 = 9;
                }
                break;
            case 1505942594:
                if (str.equals(MimeTypes.AUDIO_DTS_HD)) {
                    b14 = 10;
                }
                break;
            case 1556697186:
                if (str.equals(MimeTypes.AUDIO_TRUEHD)) {
                    b14 = Ascii.VT;
                }
                break;
        }
        switch (b14) {
            case 0:
                return 18;
            case 1:
                return 8;
            case 2:
                return 7;
            case 3:
                if (str2 == null || (bVarF = f(str2)) == null) {
                    return 0;
                }
                return bVarF.a();
            case 4:
                return 5;
            case 5:
                return 17;
            case 6:
                return 30;
            case 7:
                return 6;
            case 8:
                return 9;
            case 9:
                return 20;
            case 10:
                return 8;
            case 11:
                return 14;
            default:
                return 0;
        }
    }

    public static String d(String str) {
        b bVarF;
        String strE = null;
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.startsWith("avc1") || lowerCase.startsWith("avc3")) {
            return MimeTypes.VIDEO_H264;
        }
        if (lowerCase.startsWith("hev1") || lowerCase.startsWith("hvc1")) {
            return MimeTypes.VIDEO_H265;
        }
        if (lowerCase.startsWith("dvav") || lowerCase.startsWith("dva1") || lowerCase.startsWith("dvhe") || lowerCase.startsWith("dvh1")) {
            return MimeTypes.VIDEO_DOLBY_VISION;
        }
        if (lowerCase.startsWith("av01")) {
            return MimeTypes.VIDEO_AV1;
        }
        if (lowerCase.startsWith("vp9") || lowerCase.startsWith("vp09")) {
            return MimeTypes.VIDEO_VP9;
        }
        if (lowerCase.startsWith("vp8") || lowerCase.startsWith("vp08")) {
            return MimeTypes.VIDEO_VP8;
        }
        if (lowerCase.startsWith("mp4a")) {
            if (lowerCase.startsWith("mp4a.") && (bVarF = f(lowerCase)) != null) {
                strE = e(bVarF.f8581a);
            }
            return strE == null ? MimeTypes.AUDIO_AAC : strE;
        }
        if (lowerCase.startsWith("mha1")) {
            return MimeTypes.AUDIO_MPEGH_MHA1;
        }
        if (lowerCase.startsWith("mhm1")) {
            return MimeTypes.AUDIO_MPEGH_MHM1;
        }
        if (lowerCase.startsWith("ac-3") || lowerCase.startsWith("dac3")) {
            return MimeTypes.AUDIO_AC3;
        }
        if (lowerCase.startsWith("ec-3") || lowerCase.startsWith("dec3")) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if (lowerCase.startsWith(MimeTypes.CODEC_E_AC3_JOC)) {
            return MimeTypes.AUDIO_E_AC3_JOC;
        }
        if (lowerCase.startsWith("ac-4") || lowerCase.startsWith("dac4")) {
            return MimeTypes.AUDIO_AC4;
        }
        if (lowerCase.startsWith("dtsc")) {
            return MimeTypes.AUDIO_DTS;
        }
        if (lowerCase.startsWith("dtse")) {
            return MimeTypes.AUDIO_DTS_EXPRESS;
        }
        if (lowerCase.startsWith("dtsh") || lowerCase.startsWith("dtsl")) {
            return MimeTypes.AUDIO_DTS_HD;
        }
        if (lowerCase.startsWith("dtsx")) {
            return MimeTypes.AUDIO_DTS_X;
        }
        if (lowerCase.startsWith("opus")) {
            return MimeTypes.AUDIO_OPUS;
        }
        if (lowerCase.startsWith("vorbis")) {
            return MimeTypes.AUDIO_VORBIS;
        }
        if (lowerCase.startsWith("flac")) {
            return MimeTypes.AUDIO_FLAC;
        }
        if (lowerCase.startsWith("stpp")) {
            return MimeTypes.APPLICATION_TTML;
        }
        if (lowerCase.startsWith("wvtt")) {
            return MimeTypes.TEXT_VTT;
        }
        if (lowerCase.contains("cea708")) {
            return MimeTypes.APPLICATION_CEA708;
        }
        if (lowerCase.contains("eia608") || lowerCase.contains("cea608")) {
            return MimeTypes.APPLICATION_CEA608;
        }
        ArrayList<a> arrayList = f8576a;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            a aVar = arrayList.get(i14);
            if (lowerCase.startsWith(aVar.f8579b)) {
                return aVar.f8578a;
            }
        }
        return null;
    }

    public static String e(int i14) {
        if (i14 == 32) {
            return MimeTypes.VIDEO_MP4V;
        }
        if (i14 == 33) {
            return MimeTypes.VIDEO_H264;
        }
        if (i14 == 35) {
            return MimeTypes.VIDEO_H265;
        }
        if (i14 == 64) {
            return MimeTypes.AUDIO_AAC;
        }
        if (i14 == 163) {
            return MimeTypes.VIDEO_VC1;
        }
        if (i14 == 177) {
            return MimeTypes.VIDEO_VP9;
        }
        if (i14 == 221) {
            return MimeTypes.AUDIO_VORBIS;
        }
        if (i14 == 165) {
            return MimeTypes.AUDIO_AC3;
        }
        if (i14 == 166) {
            return MimeTypes.AUDIO_E_AC3;
        }
        switch (i14) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return MimeTypes.VIDEO_MPEG2;
            case 102:
            case 103:
            case 104:
                return MimeTypes.AUDIO_AAC;
            case 105:
            case 107:
                return MimeTypes.AUDIO_MPEG;
            case 106:
                return MimeTypes.VIDEO_MPEG;
            case 108:
                return MimeTypes.IMAGE_JPEG;
            default:
                switch (i14) {
                    case 169:
                    case TsExtractor.TS_STREAM_TYPE_AC4 /* 172 */:
                        return MimeTypes.AUDIO_DTS;
                    case 170:
                    case 171:
                        return MimeTypes.AUDIO_DTS_HD;
                    case 173:
                        return MimeTypes.AUDIO_OPUS;
                    case 174:
                        return MimeTypes.AUDIO_AC4;
                    default:
                        return null;
                }
        }
    }

    public static b f(String str) {
        Matcher matcher = f8577b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new b(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String g(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (j(str)) {
            return 1;
        }
        if (m(str)) {
            return 2;
        }
        if (l(str)) {
            return 3;
        }
        if (k(str)) {
            return 4;
        }
        if (MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || MimeTypes.APPLICATION_ICY.equals(str) || MimeTypes.APPLICATION_AIT.equals(str)) {
            return 5;
        }
        if (MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
            return 6;
        }
        ArrayList<a> arrayList = f8576a;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            a aVar = arrayList.get(i14);
            if (str.equals(aVar.f8578a)) {
                return aVar.f8580c;
            }
        }
        return -1;
    }

    public static String i(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : fa.z.X(str)) {
            String strD = d(str2);
            if (strD != null && m(strD)) {
                return strD;
            }
        }
        return null;
    }

    public static boolean j(String str) {
        return MimeTypes.BASE_TYPE_AUDIO.equals(g(str));
    }

    public static boolean k(String str) {
        return "image".equals(g(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean l(String str) {
        return "text".equals(g(str)) || "application/x-media3-cues".equals(str) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_RAWCC.equals(str) || MimeTypes.APPLICATION_VOBSUB.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str);
    }

    public static boolean m(String str) {
        return MimeTypes.BASE_TYPE_VIDEO.equals(g(str));
    }

    public static String n(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.getClass();
        switch (lowerCase) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return MimeTypes.AUDIO_FLAC;
            case "application/x-mpegurl":
                return MimeTypes.APPLICATION_M3U8;
            case "audio/x-wav":
                return MimeTypes.AUDIO_WAV;
            case "audio/mpeg-l1":
                return MimeTypes.AUDIO_MPEG_L1;
            case "audio/mpeg-l2":
                return MimeTypes.AUDIO_MPEG_L2;
            case "audio/mp3":
                return MimeTypes.AUDIO_MPEG;
            default:
                return lowerCase;
        }
    }
}
