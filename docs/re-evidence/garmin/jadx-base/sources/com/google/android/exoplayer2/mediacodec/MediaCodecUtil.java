package com.google.android.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes13.dex */
@SuppressLint({"InlinedApi"})
public final class MediaCodecUtil {
    private static final String CODEC_ID_AV01 = "av01";
    private static final String CODEC_ID_AVC1 = "avc1";
    private static final String CODEC_ID_AVC2 = "avc2";
    private static final String CODEC_ID_HEV1 = "hev1";
    private static final String CODEC_ID_HVC1 = "hvc1";
    private static final String CODEC_ID_MP4A = "mp4a";
    private static final String CODEC_ID_VP09 = "vp09";
    private static final String TAG = "MediaCodecUtil";
    private static final Pattern PROFILE_PATTERN = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<CodecKey, List<MediaCodecInfo>> decoderInfosCache = new HashMap<>();
    private static int maxH264DecodableFrameSize = -1;

    public static final class CodecKey {
        public final String mimeType;
        public final boolean secure;
        public final boolean tunneling;

        public CodecKey(String str, boolean z14, boolean z15) {
            this.mimeType = str;
            this.secure = z14;
            this.tunneling = z15;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == CodecKey.class) {
                CodecKey codecKey = (CodecKey) obj;
                if (TextUtils.equals(this.mimeType, codecKey.mimeType) && this.secure == codecKey.secure && this.tunneling == codecKey.tunneling) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((wr.g.j(31, 31, this.mimeType) + (this.secure ? 1231 : 1237)) * 31) + (this.tunneling ? 1231 : 1237);
        }
    }

    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th3) {
            super("Failed to query underlying media codecs", th3);
        }
    }

    public interface MediaCodecListCompat {
        int getCodecCount();

        android.media.MediaCodecInfo getCodecInfoAt(int i14);

        boolean isFeatureRequired(String str, String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean isFeatureSupported(String str, String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean secureDecodersExplicit();
    }

    public static final class MediaCodecListCompatV16 implements MediaCodecListCompat {
        private MediaCodecListCompatV16() {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public int getCodecCount() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public android.media.MediaCodecInfo getCodecInfoAt(int i14) {
            return MediaCodecList.getCodecInfoAt(i14);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureRequired(String str, String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureSupported(String str, String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && MimeTypes.VIDEO_H264.equals(str2);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean secureDecodersExplicit() {
            return false;
        }
    }

    public static final class MediaCodecListCompatV21 implements MediaCodecListCompat {
        private final int codecKind;
        private android.media.MediaCodecInfo[] mediaCodecInfos;

        public MediaCodecListCompatV21(boolean z14, boolean z15) {
            this.codecKind = (z14 || z15) ? 1 : 0;
        }

        private void ensureMediaCodecInfosInitialized() {
            if (this.mediaCodecInfos == null) {
                this.mediaCodecInfos = new MediaCodecList(this.codecKind).getCodecInfos();
            }
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public int getCodecCount() {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public android.media.MediaCodecInfo getCodecInfoAt(int i14) {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos[i14];
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureRequired(String str, String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isFeatureSupported(String str, String str2, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean secureDecodersExplicit() {
            return true;
        }
    }

    public interface ScoreProvider<T> {
        int getScore(T t7);
    }

    private MediaCodecUtil() {
    }

    private static void applyWorkarounds(String str, List<MediaCodecInfo> list) {
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            if (Util.SDK_INT < 26 && Util.DEVICE.equals("R9") && list.size() == 1 && list.get(0).name.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(MediaCodecInfo.newInstance("OMX.google.raw.decoder", MimeTypes.AUDIO_RAW, MimeTypes.AUDIO_RAW, null, false, true, false, false, false));
            }
            final int i14 = 0;
            sortByScore(list, new ScoreProvider() { // from class: com.google.android.exoplayer2.mediacodec.f
                @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider
                public final int getScore(Object obj) {
                    MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
                    switch (i14) {
                        case 0:
                            return MediaCodecUtil.lambda$applyWorkarounds$1(mediaCodecInfo);
                        default:
                            return MediaCodecUtil.lambda$applyWorkarounds$2(mediaCodecInfo);
                    }
                }
            });
        }
        int i15 = Util.SDK_INT;
        if (i15 < 21 && list.size() > 1) {
            String str2 = list.get(0).name;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                final int i16 = 1;
                sortByScore(list, new ScoreProvider() { // from class: com.google.android.exoplayer2.mediacodec.f
                    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider
                    public final int getScore(Object obj) {
                        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
                        switch (i16) {
                            case 0:
                                return MediaCodecUtil.lambda$applyWorkarounds$1(mediaCodecInfo);
                            default:
                                return MediaCodecUtil.lambda$applyWorkarounds$2(mediaCodecInfo);
                        }
                    }
                });
            }
        }
        if (i15 >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).name)) {
            return;
        }
        list.add(list.remove(0));
    }

    private static int av1LevelNumberToConst(int i14) {
        switch (i14) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
            case 19:
                return 524288;
            case 20:
                return ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int avcLevelNumberToConst(int i14) {
        switch (i14) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i14) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i14) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i14) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i14) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int avcLevelToMaxFrameSize(int i14) {
        if (i14 == 1 || i14 == 2) {
            return 25344;
        }
        switch (i14) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case PLAN_CHANGE_VALUE:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    private static int avcProfileNumberToConst(int i14) {
        if (i14 == 66) {
            return 1;
        }
        if (i14 == 77) {
            return 2;
        }
        if (i14 == 88) {
            return 4;
        }
        if (i14 == 100) {
            return 8;
        }
        if (i14 == 110) {
            return 16;
        }
        if (i14 != 122) {
            return i14 != 244 ? -1 : 64;
        }
        return 32;
    }

    public static synchronized void clearDecoderInfoCache() {
        decoderInfosCache.clear();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static Integer dolbyVisionStringToLevel(String str) {
        if (str == null) {
            return null;
        }
        byte b14 = -1;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    b14 = 0;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    b14 = 1;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    b14 = 2;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    b14 = 3;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    b14 = 4;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    b14 = 5;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    b14 = 6;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    b14 = 7;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    b14 = 8;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    b14 = 9;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    b14 = 10;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    b14 = Ascii.VT;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    b14 = Ascii.FF;
                }
                break;
        }
        switch (b14) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            default:
                return null;
        }
    }

    private static Integer dolbyVisionStringToProfile(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "00":
                return 1;
            case "01":
                return 2;
            case "02":
                return 4;
            case "03":
                return 8;
            case "04":
                return 16;
            case "05":
                return 32;
            case "06":
                return 64;
            case "07":
                return 128;
            case "08":
                return 256;
            case "09":
                return 512;
            default:
                return null;
        }
    }

    private static Pair<Integer, Integer> getAacCodecProfileAndLevel(String str, String[] strArr) {
        int iMp4aAudioObjectTypeToProfile;
        if (strArr.length != 3) {
            String strValueOf = String.valueOf(str);
            Log.w(TAG, strValueOf.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(strValueOf) : new String("Ignoring malformed MP4A codec string: "));
            return null;
        }
        try {
            if (MimeTypes.AUDIO_AAC.equals(MimeTypes.getMimeTypeFromMp4ObjectType(Integer.parseInt(strArr[1], 16))) && (iMp4aAudioObjectTypeToProfile = mp4aAudioObjectTypeToProfile(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iMp4aAudioObjectTypeToProfile), 0);
            }
        } catch (NumberFormatException unused) {
            String strValueOf2 = String.valueOf(str);
            Log.w(TAG, strValueOf2.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(strValueOf2) : new String("Ignoring malformed MP4A codec string: "));
        }
        return null;
    }

    public static String getAlternativeCodecMimeType(Format format) {
        Pair<Integer, Integer> codecProfileAndLevel;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(format.sampleMimeType)) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if (!MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType) || (codecProfileAndLevel = getCodecProfileAndLevel(format)) == null) {
            return null;
        }
        int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return MimeTypes.VIDEO_H265;
        }
        if (iIntValue == 512) {
            return MimeTypes.VIDEO_H264;
        }
        return null;
    }

    private static Pair<Integer, Integer> getAv1ProfileAndLevel(String str, String[] strArr, ColorInfo colorInfo) {
        int i14;
        if (strArr.length < 4) {
            String strValueOf = String.valueOf(str);
            Log.w(TAG, strValueOf.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(strValueOf) : new String("Ignoring malformed AV1 codec string: "));
            return null;
        }
        int i15 = 1;
        try {
            int i16 = Integer.parseInt(strArr[1]);
            int i17 = Integer.parseInt(strArr[2].substring(0, 2));
            int i18 = Integer.parseInt(strArr[3]);
            if (i16 != 0) {
                v.e(32, i16, "Unknown AV1 profile: ", TAG);
                return null;
            }
            if (i18 != 8 && i18 != 10) {
                v.e(34, i18, "Unknown AV1 bit depth: ", TAG);
                return null;
            }
            if (i18 != 8) {
                i15 = (colorInfo == null || !(colorInfo.hdrStaticInfo != null || (i14 = colorInfo.colorTransfer) == 7 || i14 == 6)) ? 2 : 4096;
            }
            int iAv1LevelNumberToConst = av1LevelNumberToConst(i17);
            if (iAv1LevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(i15), Integer.valueOf(iAv1LevelNumberToConst));
            }
            v.e(30, i17, "Unknown AV1 level: ", TAG);
            return null;
        } catch (NumberFormatException unused) {
            String strValueOf2 = String.valueOf(str);
            Log.w(TAG, strValueOf2.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(strValueOf2) : new String("Ignoring malformed AV1 codec string: "));
            return null;
        }
    }

    private static Pair<Integer, Integer> getAvcProfileAndLevel(String str, String[] strArr) {
        int i14;
        int i15;
        if (strArr.length < 2) {
            String strValueOf = String.valueOf(str);
            Log.w(TAG, strValueOf.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i15 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i14 = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    String strValueOf2 = String.valueOf(str);
                    Log.w(TAG, strValueOf2.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf2) : new String("Ignoring malformed AVC codec string: "));
                    return null;
                }
                int i16 = Integer.parseInt(strArr[1]);
                i14 = Integer.parseInt(strArr[2]);
                i15 = i16;
            }
            int iAvcProfileNumberToConst = avcProfileNumberToConst(i15);
            if (iAvcProfileNumberToConst == -1) {
                v.e(32, i15, "Unknown AVC profile: ", TAG);
                return null;
            }
            int iAvcLevelNumberToConst = avcLevelNumberToConst(i14);
            if (iAvcLevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(iAvcProfileNumberToConst), Integer.valueOf(iAvcLevelNumberToConst));
            }
            v.e(30, i14, "Unknown AVC level: ", TAG);
            return null;
        } catch (NumberFormatException unused) {
            String strValueOf3 = String.valueOf(str);
            Log.w(TAG, strValueOf3.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf3) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
    }

    private static String getCodecMimeType(android.media.MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals(MimeTypes.VIDEO_DOLBY_VISION)) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals(MimeTypes.AUDIO_ALAC) && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals(MimeTypes.AUDIO_FLAC) && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        return null;
    }

    public static Pair<Integer, Integer> getCodecProfileAndLevel(Format format) {
        String str = format.codecs;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType)) {
            return getDolbyVisionProfileAndLevel(format.codecs, strArrSplit);
        }
        byte b14 = 0;
        String str2 = strArrSplit[0];
        str2.getClass();
        switch (str2.hashCode()) {
            case 3004662:
                if (!str2.equals(CODEC_ID_AV01)) {
                    b14 = -1;
                }
                break;
            case 3006243:
                b14 = !str2.equals(CODEC_ID_AVC1) ? (byte) -1 : (byte) 1;
                break;
            case 3006244:
                b14 = !str2.equals(CODEC_ID_AVC2) ? (byte) -1 : (byte) 2;
                break;
            case 3199032:
                b14 = !str2.equals(CODEC_ID_HEV1) ? (byte) -1 : (byte) 3;
                break;
            case 3214780:
                b14 = !str2.equals(CODEC_ID_HVC1) ? (byte) -1 : (byte) 4;
                break;
            case 3356560:
                b14 = !str2.equals(CODEC_ID_MP4A) ? (byte) -1 : (byte) 5;
                break;
            case 3624515:
                b14 = !str2.equals(CODEC_ID_VP09) ? (byte) -1 : (byte) 6;
                break;
            default:
                b14 = -1;
                break;
        }
        switch (b14) {
            case 0:
                return getAv1ProfileAndLevel(format.codecs, strArrSplit, format.colorInfo);
            case 1:
            case 2:
                return getAvcProfileAndLevel(format.codecs, strArrSplit);
            case 3:
            case 4:
                return getHevcProfileAndLevel(format.codecs, strArrSplit);
            case 5:
                return getAacCodecProfileAndLevel(format.codecs, strArrSplit);
            case 6:
                return getVp9ProfileAndLevel(format.codecs, strArrSplit);
            default:
                return null;
        }
    }

    public static MediaCodecInfo getDecoderInfo(String str, boolean z14, boolean z15) {
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(str, z14, z15);
        if (decoderInfos.isEmpty()) {
            return null;
        }
        return decoderInfos.get(0);
    }

    public static synchronized List<MediaCodecInfo> getDecoderInfos(String str, boolean z14, boolean z15) {
        try {
            CodecKey codecKey = new CodecKey(str, z14, z15);
            HashMap<CodecKey, List<MediaCodecInfo>> map = decoderInfosCache;
            List<MediaCodecInfo> list = map.get(codecKey);
            if (list != null) {
                return list;
            }
            int i14 = Util.SDK_INT;
            ArrayList<MediaCodecInfo> decoderInfosInternal = getDecoderInfosInternal(codecKey, i14 >= 21 ? new MediaCodecListCompatV21(z14, z15) : new MediaCodecListCompatV16());
            if (z14 && decoderInfosInternal.isEmpty() && 21 <= i14 && i14 <= 23) {
                decoderInfosInternal = getDecoderInfosInternal(codecKey, new MediaCodecListCompatV16());
                if (!decoderInfosInternal.isEmpty()) {
                    String str2 = decoderInfosInternal.get(0).name;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb3.append("MediaCodecList API didn't list secure decoder for: ");
                    sb3.append(str);
                    sb3.append(". Assuming: ");
                    sb3.append(str2);
                    Log.w(TAG, sb3.toString());
                }
            }
            applyWorkarounds(str, decoderInfosInternal);
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) decoderInfosInternal);
            map.put(codecKey, immutableListCopyOf);
            return immutableListCopyOf;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x008b A[PHI: r16
      0x008b: PHI (r16v9 boolean) = (r16v5 boolean), (r16v11 boolean) binds: [B:41:0x009c, B:33:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f9 A[Catch: Exception -> 0x015e, TRY_ENTER, TryCatch #2 {Exception -> 0x015e, blocks: (B:3:0x0008, B:5:0x001b, B:68:0x0124, B:8:0x002b, B:11:0x0036, B:62:0x00f1, B:65:0x00f9, B:67:0x00ff, B:69:0x012a, B:70:0x015c), top: B:79:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x012a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    private static ArrayList<MediaCodecInfo> getDecoderInfosInternal(CodecKey codecKey, MediaCodecListCompat mediaCodecListCompat) throws DecoderQueryException {
        int i14;
        boolean z14;
        boolean z15;
        try {
            ArrayList<MediaCodecInfo> arrayList = new ArrayList<>();
            String str = codecKey.mimeType;
            int codecCount = mediaCodecListCompat.getCodecCount();
            boolean zSecureDecodersExplicit = mediaCodecListCompat.secureDecodersExplicit();
            int i15 = 0;
            while (i15 < codecCount) {
                android.media.MediaCodecInfo codecInfoAt = mediaCodecListCompat.getCodecInfoAt(i15);
                if (isAlias(codecInfoAt)) {
                    z14 = zSecureDecodersExplicit;
                    i14 = i15;
                } else {
                    String name = codecInfoAt.getName();
                    if (isCodecUsableDecoder(codecInfoAt, name, zSecureDecodersExplicit, str)) {
                        int i16 = i15;
                        String codecMimeType = getCodecMimeType(codecInfoAt, name, str);
                        if (codecMimeType == null) {
                            z14 = zSecureDecodersExplicit;
                            i14 = i16;
                        } else {
                            boolean z16 = zSecureDecodersExplicit;
                            try {
                                android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(codecMimeType);
                                boolean zIsFeatureSupported = mediaCodecListCompat.isFeatureSupported("tunneled-playback", codecMimeType, capabilitiesForType);
                                boolean zIsFeatureRequired = mediaCodecListCompat.isFeatureRequired("tunneled-playback", codecMimeType, capabilitiesForType);
                                boolean z17 = codecKey.tunneling;
                                if ((z17 || !zIsFeatureRequired) && (!z17 || zIsFeatureSupported)) {
                                    boolean zIsFeatureSupported2 = mediaCodecListCompat.isFeatureSupported("secure-playback", codecMimeType, capabilitiesForType);
                                    boolean zIsFeatureRequired2 = mediaCodecListCompat.isFeatureRequired("secure-playback", codecMimeType, capabilitiesForType);
                                    boolean z18 = codecKey.secure;
                                    if ((z18 || !zIsFeatureRequired2) && (!z18 || zIsFeatureSupported2)) {
                                        try {
                                            boolean zIsHardwareAccelerated = isHardwareAccelerated(codecInfoAt, str);
                                            try {
                                                boolean zIsSoftwareOnly = isSoftwareOnly(codecInfoAt, str);
                                                boolean zIsVendor = isVendor(codecInfoAt);
                                                if (z16) {
                                                    z15 = zIsVendor;
                                                    if (codecKey.secure == zIsFeatureSupported2) {
                                                        z14 = z16;
                                                        boolean z19 = z15;
                                                        i14 = i16;
                                                        try {
                                                            arrayList.add(MediaCodecInfo.newInstance(name, str, codecMimeType, capabilitiesForType, zIsHardwareAccelerated, zIsSoftwareOnly, z19, false, false));
                                                        } catch (Exception e4) {
                                                            e = e4;
                                                            if (Util.SDK_INT <= 23) {
                                                            }
                                                            StringBuilder sb3 = new StringBuilder(String.valueOf(r6).length() + 25 + codecMimeType.length());
                                                            sb3.append("Failed to query codec ");
                                                            sb3.append(r6);
                                                            sb3.append(" (");
                                                            sb3.append(codecMimeType);
                                                            sb3.append(")");
                                                            Log.e(TAG, sb3.toString());
                                                            throw e;
                                                        }
                                                    }
                                                } else {
                                                    z15 = zIsVendor;
                                                }
                                                if (!z16) {
                                                    try {
                                                        if (!codecKey.secure) {
                                                            z14 = z16;
                                                            boolean z110 = z15;
                                                            i14 = i16;
                                                            arrayList.add(MediaCodecInfo.newInstance(name, str, codecMimeType, capabilitiesForType, zIsHardwareAccelerated, zIsSoftwareOnly, z110, false, false));
                                                        }
                                                    } catch (Exception e14) {
                                                        e = e14;
                                                        i14 = i16;
                                                        z14 = z16;
                                                        if (Util.SDK_INT <= 23) {
                                                        }
                                                        StringBuilder sb4 = new StringBuilder(String.valueOf(r6).length() + 25 + codecMimeType.length());
                                                        sb4.append("Failed to query codec ");
                                                        sb4.append(r6);
                                                        sb4.append(" (");
                                                        sb4.append(codecMimeType);
                                                        sb4.append(")");
                                                        Log.e(TAG, sb4.toString());
                                                        throw e;
                                                    }
                                                }
                                                z14 = z16;
                                                boolean z24 = z15;
                                                i14 = i16;
                                                if (!z14 && zIsFeatureSupported2) {
                                                    try {
                                                        arrayList.add(MediaCodecInfo.newInstance(String.valueOf(name).concat(".secure"), str, codecMimeType, capabilitiesForType, zIsHardwareAccelerated, zIsSoftwareOnly, z24, false, true));
                                                        break;
                                                    } catch (Exception e15) {
                                                        e = e15;
                                                        if (Util.SDK_INT <= 23 || arrayList.isEmpty()) {
                                                            StringBuilder sb5 = new StringBuilder(String.valueOf(r6).length() + 25 + codecMimeType.length());
                                                            sb5.append("Failed to query codec ");
                                                            sb5.append(r6);
                                                            sb5.append(" (");
                                                            sb5.append(codecMimeType);
                                                            sb5.append(")");
                                                            Log.e(TAG, sb5.toString());
                                                            throw e;
                                                        }
                                                        StringBuilder sb6 = new StringBuilder(String.valueOf(r6).length() + 46);
                                                        sb6.append("Skipping codec ");
                                                        sb6.append(name);
                                                        sb6.append(" (failed to query capabilities)");
                                                        Log.e(TAG, sb6.toString());
                                                        i15 = i14 + 1;
                                                        zSecureDecodersExplicit = z14;
                                                    }
                                                }
                                            } catch (Exception e16) {
                                                e = e16;
                                                i14 = i16;
                                                z14 = z16;
                                            }
                                        } catch (Exception e17) {
                                            e = e17;
                                            z14 = z16;
                                            i14 = i16;
                                        }
                                    } else {
                                        i14 = i16;
                                        z14 = z16;
                                    }
                                } else {
                                    i14 = i16;
                                    z14 = z16;
                                }
                            } catch (Exception e18) {
                                e = e18;
                                i14 = i16;
                                z14 = z16;
                            }
                        }
                    } else {
                        z14 = zSecureDecodersExplicit;
                        i14 = i15;
                    }
                }
                i15 = i14 + 1;
                zSecureDecodersExplicit = z14;
            }
            return arrayList;
        } catch (Exception e19) {
            throw new DecoderQueryException(e19);
        }
    }

    public static List<MediaCodecInfo> getDecoderInfosSortedByFormatSupport(List<MediaCodecInfo> list, final Format format) {
        ArrayList arrayList = new ArrayList(list);
        sortByScore(arrayList, new ScoreProvider() { // from class: com.google.android.exoplayer2.mediacodec.g
            @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider
            public final int getScore(Object obj) {
                return MediaCodecUtil.lambda$getDecoderInfosSortedByFormatSupport$0(format, (MediaCodecInfo) obj);
            }
        });
        return arrayList;
    }

    public static MediaCodecInfo getDecryptOnlyDecoderInfo() {
        return getDecoderInfo(MimeTypes.AUDIO_RAW, false, false);
    }

    private static Pair<Integer, Integer> getDolbyVisionProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            String strValueOf = String.valueOf(str);
            Log.w(TAG, strValueOf.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(strValueOf) : new String("Ignoring malformed Dolby Vision codec string: "));
            return null;
        }
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            String strValueOf2 = String.valueOf(str);
            Log.w(TAG, strValueOf2.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(strValueOf2) : new String("Ignoring malformed Dolby Vision codec string: "));
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numDolbyVisionStringToProfile = dolbyVisionStringToProfile(strGroup);
        if (numDolbyVisionStringToProfile == null) {
            String strValueOf3 = String.valueOf(strGroup);
            Log.w(TAG, strValueOf3.length() != 0 ? "Unknown Dolby Vision profile string: ".concat(strValueOf3) : new String("Unknown Dolby Vision profile string: "));
            return null;
        }
        String str2 = strArr[2];
        Integer numDolbyVisionStringToLevel = dolbyVisionStringToLevel(str2);
        if (numDolbyVisionStringToLevel != null) {
            return new Pair<>(numDolbyVisionStringToProfile, numDolbyVisionStringToLevel);
        }
        String strValueOf4 = String.valueOf(str2);
        Log.w(TAG, strValueOf4.length() != 0 ? "Unknown Dolby Vision level string: ".concat(strValueOf4) : new String("Unknown Dolby Vision level string: "));
        return null;
    }

    private static Pair<Integer, Integer> getHevcProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 4) {
            String strValueOf = String.valueOf(str);
            Log.w(TAG, strValueOf.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(strValueOf) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        int i14 = 1;
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            String strValueOf2 = String.valueOf(str);
            Log.w(TAG, strValueOf2.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(strValueOf2) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        String strGroup = matcher.group(1);
        if (!IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(strGroup)) {
            if (!"2".equals(strGroup)) {
                String strValueOf3 = String.valueOf(strGroup);
                Log.w(TAG, strValueOf3.length() != 0 ? "Unknown HEVC profile string: ".concat(strValueOf3) : new String("Unknown HEVC profile string: "));
                return null;
            }
            i14 = 2;
        }
        String str2 = strArr[3];
        Integer numHevcCodecStringToProfileLevel = hevcCodecStringToProfileLevel(str2);
        if (numHevcCodecStringToProfileLevel != null) {
            return new Pair<>(Integer.valueOf(i14), numHevcCodecStringToProfileLevel);
        }
        String strValueOf4 = String.valueOf(str2);
        Log.w(TAG, strValueOf4.length() != 0 ? "Unknown HEVC level string: ".concat(strValueOf4) : new String("Unknown HEVC level string: "));
        return null;
    }

    private static Pair<Integer, Integer> getVp9ProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            String strValueOf = String.valueOf(str);
            Log.w(TAG, strValueOf.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(strValueOf) : new String("Ignoring malformed VP9 codec string: "));
            return null;
        }
        try {
            int i14 = Integer.parseInt(strArr[1]);
            int i15 = Integer.parseInt(strArr[2]);
            int iVp9ProfileNumberToConst = vp9ProfileNumberToConst(i14);
            if (iVp9ProfileNumberToConst == -1) {
                v.e(32, i14, "Unknown VP9 profile: ", TAG);
                return null;
            }
            int iVp9LevelNumberToConst = vp9LevelNumberToConst(i15);
            if (iVp9LevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(iVp9ProfileNumberToConst), Integer.valueOf(iVp9LevelNumberToConst));
            }
            v.e(30, i15, "Unknown VP9 level: ", TAG);
            return null;
        } catch (NumberFormatException unused) {
            String strValueOf2 = String.valueOf(str);
            Log.w(TAG, strValueOf2.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(strValueOf2) : new String("Ignoring malformed VP9 codec string: "));
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static Integer hevcCodecStringToProfileLevel(String str) {
        if (str == null) {
            return null;
        }
        byte b14 = -1;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    b14 = 0;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    b14 = 1;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    b14 = 2;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    b14 = 3;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    b14 = 4;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    b14 = 5;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    b14 = 6;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    b14 = 7;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    b14 = 8;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    b14 = 9;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    b14 = 10;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    b14 = Ascii.VT;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    b14 = Ascii.FF;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    b14 = Ascii.CR;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    b14 = Ascii.SO;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    b14 = Ascii.SI;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    b14 = 16;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    b14 = 17;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    b14 = Ascii.DC2;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    b14 = 19;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    b14 = Ascii.DC4;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    b14 = Ascii.NAK;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    b14 = Ascii.SYN;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    b14 = Ascii.ETB;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    b14 = Ascii.CAN;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    b14 = Ascii.EM;
                }
                break;
        }
        switch (b14) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 32;
            case 3:
                return 128;
            case 4:
                return 512;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case 8:
                return 64;
            case 9:
                return 256;
            case 10:
                return 2048;
            case 11:
                return 8192;
            case 12:
                return 32768;
            case 13:
                return 131072;
            case 14:
                return 524288;
            case 15:
                return 2097152;
            case 16:
                return 8388608;
            case 17:
                return 33554432;
            case 18:
                return 1024;
            case 19:
                return 4096;
            case 20:
                return 16384;
            case 21:
                return 65536;
            case 22:
                return Integer.valueOf(GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
            case 23:
                return Integer.valueOf(ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
            case 24:
                return 4194304;
            case 25:
                return Integer.valueOf(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            default:
                return null;
        }
    }

    private static boolean isAlias(android.media.MediaCodecInfo mediaCodecInfo) {
        return Util.SDK_INT >= 29 && isAliasV29(mediaCodecInfo);
    }

    private static boolean isAliasV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean isCodecUsableDecoder(android.media.MediaCodecInfo mediaCodecInfo, String str, boolean z14, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z14 && str.endsWith(".secure"))) {
            return false;
        }
        int i14 = Util.SDK_INT;
        if (i14 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i14 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = Util.DEVICE;
            if ("a70".equals(str3) || ("Xiaomi".equals(Util.MANUFACTURER) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i14 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = Util.DEVICE;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i14 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = Util.DEVICE;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i14 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Util.MANUFACTURER))) {
            String str6 = Util.DEVICE;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i14 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(Util.MANUFACTURER)) {
            String str7 = Util.DEVICE;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i14 <= 19 && Util.DEVICE.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i14 <= 23 && MimeTypes.AUDIO_E_AC3_JOC.equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static boolean isHardwareAccelerated(android.media.MediaCodecInfo mediaCodecInfo, String str) {
        return Util.SDK_INT >= 29 ? isHardwareAcceleratedV29(mediaCodecInfo) : !isSoftwareOnly(mediaCodecInfo, str);
    }

    private static boolean isHardwareAcceleratedV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean isSoftwareOnly(android.media.MediaCodecInfo mediaCodecInfo, String str) {
        if (Util.SDK_INT >= 29) {
            return isSoftwareOnlyV29(mediaCodecInfo);
        }
        if (MimeTypes.isAudio(str)) {
            return true;
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || (lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || !(lowerCase.startsWith("omx.") || lowerCase.startsWith("c2."));
    }

    private static boolean isSoftwareOnlyV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean isVendor(android.media.MediaCodecInfo mediaCodecInfo) {
        if (Util.SDK_INT >= 29) {
            return isVendorV29(mediaCodecInfo);
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        return (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) ? false : true;
    }

    private static boolean isVendorV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$applyWorkarounds$1(MediaCodecInfo mediaCodecInfo) {
        String str = mediaCodecInfo.name;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Util.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$applyWorkarounds$2(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.name.startsWith("OMX.google") ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getDecoderInfosSortedByFormatSupport$0(Format format, MediaCodecInfo mediaCodecInfo) {
        try {
            return mediaCodecInfo.isFormatSupported(format) ? 1 : 0;
        } catch (DecoderQueryException unused) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortByScore$3(ScoreProvider scoreProvider, Object obj, Object obj2) {
        return scoreProvider.getScore(obj2) - scoreProvider.getScore(obj);
    }

    public static int maxH264DecodableFrameSize() {
        if (maxH264DecodableFrameSize == -1) {
            int iMax = 0;
            MediaCodecInfo decoderInfo = getDecoderInfo(MimeTypes.VIDEO_H264, false, false);
            if (decoderInfo != null) {
                android.media.MediaCodecInfo.CodecProfileLevel[] profileLevels = decoderInfo.getProfileLevels();
                int length = profileLevels.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(avcLevelToMaxFrameSize(profileLevels[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, Util.SDK_INT >= 21 ? 345600 : 172800);
            }
            maxH264DecodableFrameSize = iMax;
        }
        return maxH264DecodableFrameSize;
    }

    private static int mp4aAudioObjectTypeToProfile(int i14) {
        int i15 = 17;
        if (i14 != 17) {
            i15 = 20;
            if (i14 != 20) {
                i15 = 23;
                if (i14 != 23) {
                    i15 = 29;
                    if (i14 != 29) {
                        i15 = 39;
                        if (i14 != 39) {
                            i15 = 42;
                            if (i14 != 42) {
                                switch (i14) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i15;
    }

    private static <T> void sortByScore(List<T> list, final ScoreProvider<T> scoreProvider) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.exoplayer2.mediacodec.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MediaCodecUtil.lambda$sortByScore$3(scoreProvider, obj, obj2);
            }
        });
    }

    private static int vp9LevelNumberToConst(int i14) {
        if (i14 == 10) {
            return 1;
        }
        if (i14 == 11) {
            return 2;
        }
        if (i14 == 20) {
            return 4;
        }
        if (i14 == 21) {
            return 8;
        }
        if (i14 == 30) {
            return 16;
        }
        if (i14 == 31) {
            return 32;
        }
        if (i14 == 40) {
            return 64;
        }
        if (i14 == 41) {
            return 128;
        }
        if (i14 == 50) {
            return 256;
        }
        if (i14 == 51) {
            return 512;
        }
        switch (i14) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int vp9ProfileNumberToConst(int i14) {
        if (i14 == 0) {
            return 1;
        }
        if (i14 == 1) {
            return 2;
        }
        if (i14 != 2) {
            return i14 != 3 ? -1 : 8;
        }
        return 4;
    }

    public static void warmDecoderInfoCache(String str, boolean z14, boolean z15) {
        try {
            getDecoderInfos(str, z14, z15);
        } catch (DecoderQueryException e4) {
            Log.e(TAG, "Codec warming failed", e4);
        }
    }
}
