package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.v;

/* JADX INFO: loaded from: classes13.dex */
public final class MediaCodecInfo {
    public static final int MAX_SUPPORTED_INSTANCES_UNKNOWN = -1;
    public static final String TAG = "MediaCodecInfo";
    public final boolean adaptive;
    public final android.media.MediaCodecInfo.CodecCapabilities capabilities;
    public final String codecMimeType;
    public final boolean hardwareAccelerated;
    private final boolean isVideo;
    public final String mimeType;
    public final String name;
    public final boolean secure;
    public final boolean softwareOnly;
    public final boolean tunneling;
    public final boolean vendor;

    public MediaCodecInfo(String str, String str2, String str3, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.name = (String) Assertions.checkNotNull(str);
        this.mimeType = str2;
        this.codecMimeType = str3;
        this.capabilities = codecCapabilities;
        this.hardwareAccelerated = z14;
        this.softwareOnly = z15;
        this.vendor = z16;
        this.adaptive = z17;
        this.tunneling = z18;
        this.secure = z19;
        this.isVideo = MimeTypes.isVideo(str2);
    }

    private static int adjustMaxInputChannelCount(String str, String str2, int i14) {
        int i15;
        if (i14 > 1 || ((Util.SDK_INT >= 26 && i14 > 0) || MimeTypes.AUDIO_MPEG.equals(str2) || MimeTypes.AUDIO_AMR_NB.equals(str2) || MimeTypes.AUDIO_AMR_WB.equals(str2) || MimeTypes.AUDIO_AAC.equals(str2) || MimeTypes.AUDIO_VORBIS.equals(str2) || MimeTypes.AUDIO_OPUS.equals(str2) || MimeTypes.AUDIO_RAW.equals(str2) || MimeTypes.AUDIO_FLAC.equals(str2) || MimeTypes.AUDIO_ALAW.equals(str2) || MimeTypes.AUDIO_MLAW.equals(str2) || MimeTypes.AUDIO_MSGSM.equals(str2))) {
            return i14;
        }
        if (MimeTypes.AUDIO_AC3.equals(str2)) {
            i15 = 6;
        } else {
            i15 = MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
        }
        StringBuilder sb3 = new StringBuilder(v.a(59, str));
        sb3.append("AssumedMaxChannelAdjustment: ");
        sb3.append(str);
        sb3.append(", [");
        sb3.append(i14);
        sb3.append(" to ");
        sb3.append(i15);
        sb3.append("]");
        Log.w(TAG, sb3.toString());
        return i15;
    }

    private static Point alignVideoSizeV21(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i14, int i15) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(Util.ceilDivide(i14, widthAlignment) * widthAlignment, Util.ceilDivide(i15, heightAlignment) * heightAlignment);
    }

    private static boolean areSizeAndRateSupportedV21(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i14, int i15, double d14) {
        Point pointAlignVideoSizeV21 = alignVideoSizeV21(videoCapabilities, i14, i15);
        int i16 = pointAlignVideoSizeV21.x;
        int i17 = pointAlignVideoSizeV21.y;
        return (d14 == -1.0d || d14 < 1.0d) ? videoCapabilities.isSizeSupported(i16, i17) : videoCapabilities.areSizeAndRateSupported(i16, i17, Math.floor(d14));
    }

    private static android.media.MediaCodecInfo.CodecProfileLevel[] estimateLegacyVp9ProfileLevels(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int i14;
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        if (iIntValue >= 180000000) {
            i14 = 1024;
        } else if (iIntValue >= 120000000) {
            i14 = 512;
        } else if (iIntValue >= 60000000) {
            i14 = 256;
        } else if (iIntValue >= 30000000) {
            i14 = 128;
        } else if (iIntValue >= 18000000) {
            i14 = 64;
        } else if (iIntValue >= 12000000) {
            i14 = 32;
        } else if (iIntValue >= 7200000) {
            i14 = 16;
        } else if (iIntValue >= 3600000) {
            i14 = 8;
        } else if (iIntValue >= 1800000) {
            i14 = 4;
        } else {
            i14 = iIntValue >= 800000 ? 2 : 1;
        }
        android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = new android.media.MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i14;
        return new android.media.MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    private static int getMaxSupportedInstancesV23(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.getMaxSupportedInstances();
    }

    private static boolean isAdaptive(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Util.SDK_INT >= 19 && isAdaptiveV19(codecCapabilities);
    }

    private static boolean isAdaptiveV19(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean isCodecProfileAndLevelSupported(Format format) {
        Pair<Integer, Integer> codecProfileAndLevel;
        if (format.codecs == null || (codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format)) == null) {
            return true;
        }
        int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
        int iIntValue2 = ((Integer) codecProfileAndLevel.second).intValue();
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType)) {
            if (!MimeTypes.VIDEO_H264.equals(this.mimeType)) {
                iIntValue = MimeTypes.VIDEO_H265.equals(this.mimeType) ? 2 : 8;
            }
            iIntValue2 = 0;
        }
        if (!this.isVideo && iIntValue != 42) {
            return true;
        }
        android.media.MediaCodecInfo.CodecProfileLevel[] profileLevels = getProfileLevels();
        if (Util.SDK_INT <= 23 && MimeTypes.VIDEO_VP9.equals(this.mimeType) && profileLevels.length == 0) {
            profileLevels = estimateLegacyVp9ProfileLevels(this.capabilities);
        }
        for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : profileLevels) {
            if (codecProfileLevel.profile == iIntValue && codecProfileLevel.level >= iIntValue2) {
                return true;
            }
        }
        String str = format.codecs;
        String str2 = this.codecMimeType;
        StringBuilder sb3 = new StringBuilder(v.a(v.a(22, str), str2));
        sb3.append("codec.profileLevel, ");
        sb3.append(str);
        sb3.append(", ");
        sb3.append(str2);
        logNoSupport(sb3.toString());
        return false;
    }

    private boolean isSampleMimeTypeSupported(Format format) {
        return this.mimeType.equals(format.sampleMimeType) || this.mimeType.equals(MediaCodecUtil.getAlternativeCodecMimeType(format));
    }

    private static boolean isSecure(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Util.SDK_INT >= 21 && isSecureV21(codecCapabilities);
    }

    private static boolean isSecureV21(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean isTunneling(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Util.SDK_INT >= 21 && isTunnelingV21(codecCapabilities);
    }

    private static boolean isTunnelingV21(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void logAssumedSupport(String str) {
        String str2 = this.name;
        String str3 = this.mimeType;
        String str4 = Util.DEVICE_DEBUG_INFO;
        StringBuilder sbD = v.d(v.a(v.a(v.a(v.a(25, str), str2), str3), str4), "AssumedSupport [", str, "] [", str2);
        sn.a.t(sbD, ", ", str3, "] [", str4);
        sbD.append("]");
        Log.d(TAG, sbD.toString());
    }

    private void logNoSupport(String str) {
        String str2 = this.name;
        String str3 = this.mimeType;
        String str4 = Util.DEVICE_DEBUG_INFO;
        StringBuilder sbD = v.d(v.a(v.a(v.a(v.a(20, str), str2), str3), str4), "NoSupport [", str, "] [", str2);
        sn.a.t(sbD, ", ", str3, "] [", str4);
        sbD.append("]");
        Log.d(TAG, sbD.toString());
    }

    private static boolean needsAdaptationFlushWorkaround(String str) {
        return MimeTypes.AUDIO_OPUS.equals(str);
    }

    private static boolean needsAdaptationReconfigureWorkaround(String str) {
        return Util.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean needsDisableAdaptationWorkaround(String str) {
        if (Util.SDK_INT > 22) {
            return false;
        }
        String str2 = Util.MODEL;
        if ("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) {
            return "OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str);
        }
        return false;
    }

    private static final boolean needsRotatedVerticalResolutionWorkaround(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(Util.DEVICE)) ? false : true;
    }

    public static MediaCodecInfo newInstance(String str, String str2, String str3, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        return new MediaCodecInfo(str, str2, str3, codecCapabilities, z14, z15, z16, (z17 || codecCapabilities == null || !isAdaptive(codecCapabilities) || needsDisableAdaptationWorkaround(str)) ? false : true, codecCapabilities != null && isTunneling(codecCapabilities), z18 || (codecCapabilities != null && isSecure(codecCapabilities)));
    }

    public DecoderReuseEvaluation canReuseCodec(Format format, Format format2) {
        Format format3;
        Format format4;
        int i14 = !Util.areEqual(format.sampleMimeType, format2.sampleMimeType) ? 8 : 0;
        if (this.isVideo) {
            if (format.rotationDegrees != format2.rotationDegrees) {
                i14 |= 1024;
            }
            if (!this.adaptive && (format.width != format2.width || format.height != format2.height)) {
                i14 |= 512;
            }
            if (!Util.areEqual(format.colorInfo, format2.colorInfo)) {
                i14 |= 2048;
            }
            if (needsAdaptationReconfigureWorkaround(this.name) && !format.initializationDataEquals(format2)) {
                i14 |= 2;
            }
            if (i14 == 0) {
                return new DecoderReuseEvaluation(this.name, format, format2, format.initializationDataEquals(format2) ? 3 : 2, 0);
            }
            format3 = format;
            format4 = format2;
        } else {
            format3 = format;
            format4 = format2;
            if (format3.channelCount != format4.channelCount) {
                i14 |= 4096;
            }
            if (format3.sampleRate != format4.sampleRate) {
                i14 |= 8192;
            }
            if (format3.pcmEncoding != format4.pcmEncoding) {
                i14 |= 16384;
            }
            if (i14 == 0 && MimeTypes.AUDIO_AAC.equals(this.mimeType)) {
                Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format3);
                Pair<Integer, Integer> codecProfileAndLevel2 = MediaCodecUtil.getCodecProfileAndLevel(format4);
                if (codecProfileAndLevel != null && codecProfileAndLevel2 != null) {
                    int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
                    int iIntValue2 = ((Integer) codecProfileAndLevel2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new DecoderReuseEvaluation(this.name, format3, format4, 3, 0);
                    }
                }
            }
            if (!format3.initializationDataEquals(format4)) {
                i14 |= 32;
            }
            if (needsAdaptationFlushWorkaround(this.mimeType)) {
                i14 |= 2;
            }
            if (i14 == 0) {
                return new DecoderReuseEvaluation(this.name, format3, format4, 1, 0);
            }
        }
        return new DecoderReuseEvaluation(this.name, format3, format4, 0, i14);
    }

    public int getMaxSupportedInstances() {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (Util.SDK_INT < 23 || (codecCapabilities = this.capabilities) == null) {
            return -1;
        }
        return getMaxSupportedInstancesV23(codecCapabilities);
    }

    public android.media.MediaCodecInfo.CodecProfileLevel[] getProfileLevels() {
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new android.media.MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean isAudioChannelCountSupportedV21(int i14) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("channelCount.caps");
            return false;
        }
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("channelCount.aCaps");
            return false;
        }
        if (adjustMaxInputChannelCount(this.name, this.mimeType, audioCapabilities.getMaxInputChannelCount()) >= i14) {
            return true;
        }
        logNoSupport(v.b(33, i14, "channelCount.support, "));
        return false;
    }

    public boolean isAudioSampleRateSupportedV21(int i14) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sampleRate.caps");
            return false;
        }
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i14)) {
            return true;
        }
        logNoSupport(v.b(31, i14, "sampleRate.support, "));
        return false;
    }

    public boolean isFormatSupported(Format format) {
        int i14;
        int i15;
        int i16;
        if (!isSampleMimeTypeSupported(format) || !isCodecProfileAndLevelSupported(format)) {
            return false;
        }
        if (!this.isVideo) {
            return Util.SDK_INT < 21 || (((i14 = format.sampleRate) == -1 || isAudioSampleRateSupportedV21(i14)) && ((i15 = format.channelCount) == -1 || isAudioChannelCountSupportedV21(i15)));
        }
        int i17 = format.width;
        if (i17 <= 0 || (i16 = format.height) <= 0) {
            return true;
        }
        if (Util.SDK_INT >= 21) {
            return isVideoSizeAndRateSupportedV21(i17, i16, format.frameRate);
        }
        boolean z14 = i17 * i16 <= MediaCodecUtil.maxH264DecodableFrameSize();
        if (!z14) {
            int i18 = format.width;
            int i19 = format.height;
            StringBuilder sb3 = new StringBuilder(40);
            sb3.append("legacyFrameSize, ");
            sb3.append(i18);
            sb3.append("x");
            sb3.append(i19);
            logNoSupport(sb3.toString());
        }
        return z14;
    }

    public boolean isHdr10PlusOutOfBandMetadataSupported() {
        if (Util.SDK_INT >= 29 && MimeTypes.VIDEO_VP9.equals(this.mimeType)) {
            for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : getProfileLevels()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    @Deprecated
    public boolean isSeamlessAdaptationSupported(Format format, Format format2, boolean z14) {
        if (!z14 && format.colorInfo != null && format2.colorInfo == null) {
            format2 = format2.buildUpon().setColorInfo(format.colorInfo).build();
        }
        int i14 = canReuseCodec(format, format2).result;
        return i14 == 2 || i14 == 3;
    }

    public boolean isVideoSizeAndRateSupportedV21(int i14, int i15, double d14) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sizeAndRate.caps");
            return false;
        }
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            logNoSupport("sizeAndRate.vCaps");
            return false;
        }
        if (areSizeAndRateSupportedV21(videoCapabilities, i14, i15, d14)) {
            return true;
        }
        if (i14 < i15 && needsRotatedVerticalResolutionWorkaround(this.name) && areSizeAndRateSupportedV21(videoCapabilities, i15, i14, d14)) {
            StringBuilder sb3 = new StringBuilder(69);
            sb3.append("sizeAndRate.rotated, ");
            sb3.append(i14);
            sb3.append("x");
            sb3.append(i15);
            sb3.append("x");
            sb3.append(d14);
            logAssumedSupport(sb3.toString());
            return true;
        }
        StringBuilder sb4 = new StringBuilder(69);
        sb4.append("sizeAndRate.support, ");
        sb4.append(i14);
        sb4.append("x");
        sb4.append(i15);
        sb4.append("x");
        sb4.append(d14);
        logNoSupport(sb4.toString());
        return false;
    }

    public String toString() {
        return this.name;
    }

    public Point alignVideoSizeV21(int i14, int i15) {
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return alignVideoSizeV21(videoCapabilities, i14, i15);
    }

    public boolean isSeamlessAdaptationSupported(Format format) {
        if (this.isVideo) {
            return this.adaptive;
        }
        Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format);
        return codecProfileAndLevel != null && ((Integer) codecProfileAndLevel.first).intValue() == 42;
    }
}
