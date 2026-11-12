package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.common.base.Ascii;
import com.huami.mifit.sportlib.common.DataTypeSource;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class MimeTypes {
    public static final String APPLICATION_AIT = "application/vnd.dvb.ait";
    public static final String APPLICATION_CAMERA_MOTION = "application/x-camera-motion";
    public static final String APPLICATION_CEA608 = "application/cea-608";
    public static final String APPLICATION_CEA708 = "application/cea-708";
    public static final String APPLICATION_DVBSUBS = "application/dvbsubs";
    public static final String APPLICATION_EMSG = "application/x-emsg";
    public static final String APPLICATION_EXIF = "application/x-exif";
    public static final String APPLICATION_ICY = "application/x-icy";
    public static final String APPLICATION_ID3 = "application/id3";
    public static final String APPLICATION_M3U8 = "application/x-mpegURL";
    public static final String APPLICATION_MATROSKA = "application/x-matroska";
    public static final String APPLICATION_MP4 = "application/mp4";
    public static final String APPLICATION_MP4CEA608 = "application/x-mp4-cea-608";
    public static final String APPLICATION_MP4VTT = "application/x-mp4-vtt";
    public static final String APPLICATION_MPD = "application/dash+xml";
    public static final String APPLICATION_PGS = "application/pgs";
    public static final String APPLICATION_RAWCC = "application/x-rawcc";
    public static final String APPLICATION_RTSP = "application/x-rtsp";
    public static final String APPLICATION_SCTE35 = "application/x-scte35";
    public static final String APPLICATION_SS = "application/vnd.ms-sstr+xml";
    public static final String APPLICATION_SUBRIP = "application/x-subrip";
    public static final String APPLICATION_TTML = "application/ttml+xml";
    public static final String APPLICATION_TX3G = "application/x-quicktime-tx3g";
    public static final String APPLICATION_VOBSUB = "application/vobsub";
    public static final String APPLICATION_WEBM = "application/webm";
    public static final String AUDIO_AAC = "audio/mp4a-latm";
    public static final String AUDIO_AC3 = "audio/ac3";
    public static final String AUDIO_AC4 = "audio/ac4";
    public static final String AUDIO_ALAC = "audio/alac";
    public static final String AUDIO_ALAW = "audio/g711-alaw";
    public static final String AUDIO_AMR = "audio/amr";
    public static final String AUDIO_AMR_NB = "audio/3gpp";
    public static final String AUDIO_AMR_WB = "audio/amr-wb";
    public static final String AUDIO_DTS = "audio/vnd.dts";
    public static final String AUDIO_DTS_EXPRESS = "audio/vnd.dts.hd;profile=lbr";
    public static final String AUDIO_DTS_HD = "audio/vnd.dts.hd";
    public static final String AUDIO_DTS_UHD = "audio/vnd.dts.uhd";
    public static final String AUDIO_E_AC3 = "audio/eac3";
    public static final String AUDIO_E_AC3_JOC = "audio/eac3-joc";
    public static final String AUDIO_FLAC = "audio/flac";
    public static final String AUDIO_MATROSKA = "audio/x-matroska";
    public static final String AUDIO_MLAW = "audio/g711-mlaw";
    public static final String AUDIO_MP4 = "audio/mp4";
    public static final String AUDIO_MPEG = "audio/mpeg";
    public static final String AUDIO_MPEGH_MHA1 = "audio/mha1";
    public static final String AUDIO_MPEGH_MHM1 = "audio/mhm1";
    public static final String AUDIO_MPEG_L1 = "audio/mpeg-L1";
    public static final String AUDIO_MPEG_L2 = "audio/mpeg-L2";
    public static final String AUDIO_MSGSM = "audio/gsm";
    public static final String AUDIO_OGG = "audio/ogg";
    public static final String AUDIO_OPUS = "audio/opus";
    public static final String AUDIO_RAW = "audio/raw";
    public static final String AUDIO_TRUEHD = "audio/true-hd";
    public static final String AUDIO_UNKNOWN = "audio/x-unknown";
    public static final String AUDIO_VORBIS = "audio/vorbis";
    public static final String AUDIO_WAV = "audio/wav";
    public static final String AUDIO_WEBM = "audio/webm";
    public static final String BASE_TYPE_APPLICATION = "application";
    public static final String BASE_TYPE_AUDIO = "audio";
    public static final String BASE_TYPE_IMAGE = "image";
    public static final String BASE_TYPE_TEXT = "text";
    public static final String BASE_TYPE_VIDEO = "video";
    public static final String IMAGE_JPEG = "image/jpeg";
    public static final String TEXT_SSA = "text/x-ssa";
    public static final String TEXT_VTT = "text/vtt";
    public static final String VIDEO_AV1 = "video/av01";
    public static final String VIDEO_DIVX = "video/divx";
    public static final String VIDEO_DOLBY_VISION = "video/dolby-vision";
    public static final String VIDEO_FLV = "video/x-flv";
    public static final String VIDEO_H263 = "video/3gpp";
    public static final String VIDEO_H264 = "video/avc";
    public static final String VIDEO_H265 = "video/hevc";
    public static final String VIDEO_MATROSKA = "video/x-matroska";
    public static final String VIDEO_MP2T = "video/mp2t";
    public static final String VIDEO_MP4 = "video/mp4";
    public static final String VIDEO_MP4V = "video/mp4v-es";
    public static final String VIDEO_MPEG = "video/mpeg";
    public static final String VIDEO_MPEG2 = "video/mpeg2";
    public static final String VIDEO_OGG = "video/ogg";
    public static final String VIDEO_PS = "video/mp2p";
    public static final String VIDEO_UNKNOWN = "video/x-unknown";
    public static final String VIDEO_VC1 = "video/wvc1";
    public static final String VIDEO_VP8 = "video/x-vnd.on2.vp8";
    public static final String VIDEO_VP9 = "video/x-vnd.on2.vp9";
    public static final String VIDEO_WEBM = "video/webm";
    private static final ArrayList<a> a = new ArrayList<>();
    private static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static final class a {
        public final String a;
        public final String b;
        public final int c;

        public a(String mimeType, String codecPrefix, int trackType) {
            this.a = mimeType;
            this.b = codecPrefix;
            this.c = trackType;
        }
    }

    @VisibleForTesting
    public static final class b {
        public final int a;
        public final int b;

        public b(int objectTypeIndication, int audioObjectTypeIndication) {
            this.a = objectTypeIndication;
            this.b = audioObjectTypeIndication;
        }
    }

    private MimeTypes() {
    }

    @Nullable
    private static String a(String codec) {
        int size = a.size();
        for (int i = 0; i < size; i++) {
            a aVar = a.get(i);
            if (codec.startsWith(aVar.b)) {
                return aVar.a;
            }
        }
        return null;
    }

    public static boolean allSamplesAreSyncSamples(@Nullable String mimeType, @Nullable String codec) {
        b bVarB;
        int encodingForAudioObjectType;
        if (mimeType == null) {
            return false;
        }
        switch (mimeType) {
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
                return (codec == null || (bVarB = b(codec)) == null || (encodingForAudioObjectType = AacUtil.getEncodingForAudioObjectType(bVarB.b)) == 0 || encodingForAudioObjectType == 16) ? false : true;
            default:
                return false;
        }
    }

    @Nullable
    @VisibleForTesting
    public static b b(String codec) {
        Matcher matcher = b.matcher(codec);
        if (!matcher.matches()) {
            return null;
        }
        String str = (String) Assertions.checkNotNull(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new b(Integer.parseInt(str, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Nullable
    private static String c(@Nullable String mimeType) {
        int iIndexOf;
        if (mimeType == null || (iIndexOf = mimeType.indexOf(47)) == -1) {
            return null;
        }
        return mimeType.substring(0, iIndexOf);
    }

    public static boolean containsCodecsCorrespondingToMimeType(@Nullable String codecs, String mimeType) {
        return getCodecsCorrespondingToMimeType(codecs, mimeType) != null;
    }

    private static int d(String mimeType) {
        int size = a.size();
        for (int i = 0; i < size; i++) {
            a aVar = a.get(i);
            if (mimeType.equals(aVar.a)) {
                return aVar.c;
            }
        }
        return -1;
    }

    @Nullable
    public static String getAudioMediaMimeType(@Nullable String codecs) {
        if (codecs == null) {
            return null;
        }
        for (String str : Util.splitCodecs(codecs)) {
            String mediaMimeType = getMediaMimeType(str);
            if (mediaMimeType != null && isAudio(mediaMimeType)) {
                return mediaMimeType;
            }
        }
        return null;
    }

    @Nullable
    public static String getCodecsCorrespondingToMimeType(@Nullable String codecs, @Nullable String mimeType) {
        if (codecs == null || mimeType == null) {
            return null;
        }
        String[] strArrSplitCodecs = Util.splitCodecs(codecs);
        StringBuilder sb = new StringBuilder();
        for (String str : strArrSplitCodecs) {
            if (mimeType.equals(getMediaMimeType(str))) {
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

    public static int getEncoding(String mimeType, @Nullable String codec) {
        b bVarB;
        mimeType.hashCode();
        switch (mimeType) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (codec == null || (bVarB = b(codec)) == null) {
                    return 0;
                }
                return AacUtil.getEncodingForAudioObjectType(bVarB.b);
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

    @Nullable
    public static String getMediaMimeType(@Nullable String codec) {
        b bVarB;
        String mimeTypeFromMp4ObjectType = null;
        if (codec == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(codec.trim());
        if (lowerCase.startsWith("avc1") || lowerCase.startsWith("avc3")) {
            return VIDEO_H264;
        }
        if (lowerCase.startsWith("hev1") || lowerCase.startsWith("hvc1")) {
            return VIDEO_H265;
        }
        if (lowerCase.startsWith("dvav") || lowerCase.startsWith("dva1") || lowerCase.startsWith("dvhe") || lowerCase.startsWith("dvh1")) {
            return VIDEO_DOLBY_VISION;
        }
        if (lowerCase.startsWith("av01")) {
            return VIDEO_AV1;
        }
        if (lowerCase.startsWith("vp9") || lowerCase.startsWith("vp09")) {
            return VIDEO_VP9;
        }
        if (lowerCase.startsWith("vp8") || lowerCase.startsWith("vp08")) {
            return VIDEO_VP8;
        }
        if (lowerCase.startsWith("mp4a")) {
            if (lowerCase.startsWith("mp4a.") && (bVarB = b(lowerCase)) != null) {
                mimeTypeFromMp4ObjectType = getMimeTypeFromMp4ObjectType(bVarB.a);
            }
            return mimeTypeFromMp4ObjectType == null ? AUDIO_AAC : mimeTypeFromMp4ObjectType;
        }
        if (lowerCase.startsWith("mha1")) {
            return AUDIO_MPEGH_MHA1;
        }
        if (lowerCase.startsWith("mhm1")) {
            return AUDIO_MPEGH_MHM1;
        }
        if (lowerCase.startsWith("ac-3") || lowerCase.startsWith("dac3")) {
            return AUDIO_AC3;
        }
        if (lowerCase.startsWith("ec-3") || lowerCase.startsWith("dec3")) {
            return AUDIO_E_AC3;
        }
        if (lowerCase.startsWith(Ac3Util.E_AC3_JOC_CODEC_STRING)) {
            return AUDIO_E_AC3_JOC;
        }
        if (lowerCase.startsWith("ac-4") || lowerCase.startsWith("dac4")) {
            return AUDIO_AC4;
        }
        if (lowerCase.startsWith("dtsc")) {
            return AUDIO_DTS;
        }
        if (lowerCase.startsWith("dtse")) {
            return AUDIO_DTS_EXPRESS;
        }
        if (lowerCase.startsWith("dtsh") || lowerCase.startsWith("dtsl")) {
            return AUDIO_DTS_HD;
        }
        if (lowerCase.startsWith("dtsx")) {
            return AUDIO_DTS_UHD;
        }
        if (lowerCase.startsWith("opus")) {
            return AUDIO_OPUS;
        }
        if (lowerCase.startsWith("vorbis")) {
            return AUDIO_VORBIS;
        }
        if (lowerCase.startsWith("flac")) {
            return AUDIO_FLAC;
        }
        if (lowerCase.startsWith("stpp")) {
            return APPLICATION_TTML;
        }
        if (lowerCase.startsWith("wvtt")) {
            return TEXT_VTT;
        }
        if (lowerCase.contains("cea708")) {
            return APPLICATION_CEA708;
        }
        return (lowerCase.contains("eia608") || lowerCase.contains("cea608")) ? APPLICATION_CEA608 : a(lowerCase);
    }

    @Nullable
    public static String getMimeTypeFromMp4ObjectType(int objectType) {
        if (objectType == 32) {
            return VIDEO_MP4V;
        }
        if (objectType == 33) {
            return VIDEO_H264;
        }
        if (objectType == 35) {
            return VIDEO_H265;
        }
        if (objectType == 64) {
            return AUDIO_AAC;
        }
        if (objectType == 163) {
            return VIDEO_VC1;
        }
        if (objectType == 177) {
            return VIDEO_VP9;
        }
        if (objectType == 165) {
            return AUDIO_AC3;
        }
        if (objectType == 166) {
            return AUDIO_E_AC3;
        }
        switch (objectType) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return VIDEO_MPEG2;
            case 102:
            case 103:
            case 104:
                return AUDIO_AAC;
            case 105:
            case 107:
                return AUDIO_MPEG;
            case 106:
                return VIDEO_MPEG;
            default:
                switch (objectType) {
                    case 169:
                    case 172:
                        return AUDIO_DTS;
                    case 170:
                    case 171:
                        return AUDIO_DTS_HD;
                    case DataTypeSource.SPORT_TYPE_CHESS /* 173 */:
                        return AUDIO_OPUS;
                    case DataTypeSource.SPORT_TYPE_CHECKERS /* 174 */:
                        return AUDIO_AC4;
                    default:
                        return null;
                }
        }
    }

    @Nullable
    public static String getTextMediaMimeType(@Nullable String codecs) {
        if (codecs == null) {
            return null;
        }
        for (String str : Util.splitCodecs(codecs)) {
            String mediaMimeType = getMediaMimeType(str);
            if (mediaMimeType != null && isText(mediaMimeType)) {
                return mediaMimeType;
            }
        }
        return null;
    }

    public static int getTrackType(@Nullable String mimeType) {
        if (TextUtils.isEmpty(mimeType)) {
            return -1;
        }
        if (isAudio(mimeType)) {
            return 1;
        }
        if (isVideo(mimeType)) {
            return 2;
        }
        if (isText(mimeType)) {
            return 3;
        }
        if (APPLICATION_ID3.equals(mimeType) || APPLICATION_EMSG.equals(mimeType) || APPLICATION_SCTE35.equals(mimeType)) {
            return 5;
        }
        if (APPLICATION_CAMERA_MOTION.equals(mimeType)) {
            return 6;
        }
        return d(mimeType);
    }

    public static int getTrackTypeOfCodec(String codec) {
        return getTrackType(getMediaMimeType(codec));
    }

    @Nullable
    public static String getVideoMediaMimeType(@Nullable String codecs) {
        if (codecs == null) {
            return null;
        }
        for (String str : Util.splitCodecs(codecs)) {
            String mediaMimeType = getMediaMimeType(str);
            if (mediaMimeType != null && isVideo(mediaMimeType)) {
                return mediaMimeType;
            }
        }
        return null;
    }

    public static boolean isAudio(@Nullable String mimeType) {
        return "audio".equals(c(mimeType));
    }

    public static boolean isMatroska(@Nullable String mimeType) {
        if (mimeType == null) {
            return false;
        }
        return mimeType.startsWith(VIDEO_WEBM) || mimeType.startsWith(AUDIO_WEBM) || mimeType.startsWith(APPLICATION_WEBM) || mimeType.startsWith(VIDEO_MATROSKA) || mimeType.startsWith(AUDIO_MATROSKA) || mimeType.startsWith(APPLICATION_MATROSKA);
    }

    public static boolean isText(@Nullable String mimeType) {
        return "text".equals(c(mimeType)) || APPLICATION_CEA608.equals(mimeType) || APPLICATION_CEA708.equals(mimeType) || APPLICATION_MP4CEA608.equals(mimeType) || APPLICATION_SUBRIP.equals(mimeType) || APPLICATION_TTML.equals(mimeType) || APPLICATION_TX3G.equals(mimeType) || APPLICATION_MP4VTT.equals(mimeType) || APPLICATION_RAWCC.equals(mimeType) || APPLICATION_VOBSUB.equals(mimeType) || APPLICATION_PGS.equals(mimeType) || APPLICATION_DVBSUBS.equals(mimeType);
    }

    public static boolean isVideo(@Nullable String mimeType) {
        return "video".equals(c(mimeType));
    }

    public static String normalizeMimeType(String mimeType) {
        mimeType.hashCode();
        switch (mimeType) {
            case "audio/x-flac":
                return AUDIO_FLAC;
            case "audio/x-wav":
                return AUDIO_WAV;
            case "audio/mp3":
                return AUDIO_MPEG;
            default:
                return mimeType;
        }
    }

    public static void registerCustomMimeType(String mimeType, String codecPrefix, int trackType) {
        a aVar = new a(mimeType, codecPrefix, trackType);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            ArrayList<a> arrayList = a;
            if (mimeType.equals(arrayList.get(i).a)) {
                arrayList.remove(i);
                break;
            }
        }
        a.add(aVar);
    }
}
