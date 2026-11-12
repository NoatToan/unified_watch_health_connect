package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaCodecInfo {
    public static final int MAX_SUPPORTED_INSTANCES_UNKNOWN = -1;
    public static final String TAG = "MediaCodecInfo";
    private final boolean a;
    public final boolean adaptive;

    @Nullable
    public final android.media.MediaCodecInfo.CodecCapabilities capabilities;
    public final String codecMimeType;
    public final boolean hardwareAccelerated;
    public final String mimeType;
    public final String name;
    public final boolean secure;
    public final boolean softwareOnly;
    public final boolean tunneling;
    public final boolean vendor;

    @VisibleForTesting
    public MediaCodecInfo(String name, String mimeType, String codecMimeType, @Nullable android.media.MediaCodecInfo.CodecCapabilities capabilities, boolean hardwareAccelerated, boolean softwareOnly, boolean vendor, boolean adaptive, boolean tunneling, boolean secure) {
        this.name = (String) Assertions.checkNotNull(name);
        this.mimeType = mimeType;
        this.codecMimeType = codecMimeType;
        this.capabilities = capabilities;
        this.hardwareAccelerated = hardwareAccelerated;
        this.softwareOnly = softwareOnly;
        this.vendor = vendor;
        this.adaptive = adaptive;
        this.tunneling = tunneling;
        this.secure = secure;
        this.a = MimeTypes.isVideo(mimeType);
    }

    private static int a(String name, String mimeType, int maxChannelCount) {
        int i;
        if (maxChannelCount > 1 || ((Util.SDK_INT >= 26 && maxChannelCount > 0) || MimeTypes.AUDIO_MPEG.equals(mimeType) || MimeTypes.AUDIO_AMR_NB.equals(mimeType) || MimeTypes.AUDIO_AMR_WB.equals(mimeType) || MimeTypes.AUDIO_AAC.equals(mimeType) || MimeTypes.AUDIO_VORBIS.equals(mimeType) || MimeTypes.AUDIO_OPUS.equals(mimeType) || MimeTypes.AUDIO_RAW.equals(mimeType) || MimeTypes.AUDIO_FLAC.equals(mimeType) || MimeTypes.AUDIO_ALAW.equals(mimeType) || MimeTypes.AUDIO_MLAW.equals(mimeType) || MimeTypes.AUDIO_MSGSM.equals(mimeType))) {
            return maxChannelCount;
        }
        if (MimeTypes.AUDIO_AC3.equals(mimeType)) {
            i = 6;
        } else {
            i = MimeTypes.AUDIO_E_AC3.equals(mimeType) ? 16 : 30;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 59);
        sb.append("AssumedMaxChannelAdjustment: ");
        sb.append(name);
        sb.append(", [");
        sb.append(maxChannelCount);
        sb.append(" to ");
        sb.append(i);
        sb.append("]");
        Log.w(TAG, sb.toString());
        return i;
    }

    @RequiresApi(21)
    private static Point b(android.media.MediaCodecInfo.VideoCapabilities capabilities, int width, int height) {
        int widthAlignment = capabilities.getWidthAlignment();
        int heightAlignment = capabilities.getHeightAlignment();
        return new Point(Util.ceilDivide(width, widthAlignment) * widthAlignment, Util.ceilDivide(height, heightAlignment) * heightAlignment);
    }

    @RequiresApi(21)
    private static boolean c(android.media.MediaCodecInfo.VideoCapabilities capabilities, int width, int height, double frameRate) {
        Point pointB = b(capabilities, width, height);
        int i = pointB.x;
        int i2 = pointB.y;
        return (frameRate == -1.0d || frameRate < 1.0d) ? capabilities.isSizeSupported(i, i2) : capabilities.areSizeAndRateSupported(i, i2, Math.floor(frameRate));
    }

    private static android.media.MediaCodecInfo.CodecProfileLevel[] d(@Nullable android.media.MediaCodecInfo.CodecCapabilities capabilities) {
        int i;
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (capabilities == null || (videoCapabilities = capabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        if (iIntValue >= 180000000) {
            i = 1024;
        } else if (iIntValue >= 120000000) {
            i = 512;
        } else if (iIntValue >= 60000000) {
            i = 256;
        } else if (iIntValue >= 30000000) {
            i = 128;
        } else if (iIntValue >= 18000000) {
            i = 64;
        } else if (iIntValue >= 12000000) {
            i = 32;
        } else if (iIntValue >= 7200000) {
            i = 16;
        } else if (iIntValue >= 3600000) {
            i = 8;
        } else if (iIntValue >= 1800000) {
            i = 4;
        } else {
            i = iIntValue >= 800000 ? 2 : 1;
        }
        android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = new android.media.MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i;
        return new android.media.MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    @RequiresApi(23)
    private static int e(android.media.MediaCodecInfo.CodecCapabilities capabilities) {
        return capabilities.getMaxSupportedInstances();
    }

    private static boolean f(android.media.MediaCodecInfo.CodecCapabilities capabilities) {
        return Util.SDK_INT >= 19 && g(capabilities);
    }

    @RequiresApi(19)
    private static boolean g(android.media.MediaCodecInfo.CodecCapabilities capabilities) {
        return capabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean h(android.media.MediaCodecInfo.CodecCapabilities capabilities) {
        return Util.SDK_INT >= 21 && i(capabilities);
    }

    @RequiresApi(21)
    private static boolean i(android.media.MediaCodecInfo.CodecCapabilities capabilities) {
        return capabilities.isFeatureSupported("secure-playback");
    }

    private static boolean j(android.media.MediaCodecInfo.CodecCapabilities capabilities) {
        return Util.SDK_INT >= 21 && k(capabilities);
    }

    @RequiresApi(21)
    private static boolean k(android.media.MediaCodecInfo.CodecCapabilities capabilities) {
        return capabilities.isFeatureSupported("tunneled-playback");
    }

    private void l(String message) {
        String str = this.name;
        String str2 = this.mimeType;
        String str3 = Util.DEVICE_DEBUG_INFO;
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("AssumedSupport [");
        sb.append(message);
        sb.append("] [");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append("] [");
        sb.append(str3);
        sb.append("]");
        Log.d(TAG, sb.toString());
    }

    private void m(String message) {
        String str = this.name;
        String str2 = this.mimeType;
        String str3 = Util.DEVICE_DEBUG_INFO;
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 20 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("NoSupport [");
        sb.append(message);
        sb.append("] [");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append("] [");
        sb.append(str3);
        sb.append("]");
        Log.d(TAG, sb.toString());
    }

    private static boolean n(String mimeType) {
        return MimeTypes.AUDIO_OPUS.equals(mimeType);
    }

    public static MediaCodecInfo newInstance(String name, String mimeType, String codecMimeType, @Nullable android.media.MediaCodecInfo.CodecCapabilities capabilities, boolean hardwareAccelerated, boolean softwareOnly, boolean vendor, boolean forceDisableAdaptive, boolean forceSecure) {
        return new MediaCodecInfo(name, mimeType, codecMimeType, capabilities, hardwareAccelerated, softwareOnly, vendor, (forceDisableAdaptive || capabilities == null || !f(capabilities) || p(name)) ? false : true, capabilities != null && j(capabilities), forceSecure || (capabilities != null && h(capabilities)));
    }

    private static boolean o(String name) {
        return Util.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(name);
    }

    private static boolean p(String name) {
        if (Util.SDK_INT <= 22) {
            String str = Util.MODEL;
            if (("ODROID-XU3".equals(str) || "Nexus 10".equals(str)) && ("OMX.Exynos.AVC.Decoder".equals(name) || "OMX.Exynos.AVC.Decoder.secure".equals(name))) {
                return true;
            }
        }
        return false;
    }

    private static final boolean q(String name) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(name) && "mcv5a".equals(Util.DEVICE)) ? false : true;
    }

    @Nullable
    @RequiresApi(21)
    public Point alignVideoSizeV21(int width, int height) {
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return b(videoCapabilities, width, height);
    }

    public DecoderReuseEvaluation canReuseCodec(Format oldFormat, Format newFormat) {
        int i = !Util.areEqual(oldFormat.sampleMimeType, newFormat.sampleMimeType) ? 8 : 0;
        if (this.a) {
            if (oldFormat.rotationDegrees != newFormat.rotationDegrees) {
                i |= 1024;
            }
            if (!this.adaptive && (oldFormat.width != newFormat.width || oldFormat.height != newFormat.height)) {
                i |= 512;
            }
            if (!Util.areEqual(oldFormat.colorInfo, newFormat.colorInfo)) {
                i |= 2048;
            }
            if (o(this.name) && !oldFormat.initializationDataEquals(newFormat)) {
                i |= 2;
            }
            if (i == 0) {
                return new DecoderReuseEvaluation(this.name, oldFormat, newFormat, oldFormat.initializationDataEquals(newFormat) ? 3 : 2, 0);
            }
        } else {
            if (oldFormat.channelCount != newFormat.channelCount) {
                i |= 4096;
            }
            if (oldFormat.sampleRate != newFormat.sampleRate) {
                i |= 8192;
            }
            if (oldFormat.pcmEncoding != newFormat.pcmEncoding) {
                i |= 16384;
            }
            if (i == 0 && MimeTypes.AUDIO_AAC.equals(this.mimeType)) {
                Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(oldFormat);
                Pair<Integer, Integer> codecProfileAndLevel2 = MediaCodecUtil.getCodecProfileAndLevel(newFormat);
                if (codecProfileAndLevel != null && codecProfileAndLevel2 != null) {
                    int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
                    int iIntValue2 = ((Integer) codecProfileAndLevel2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new DecoderReuseEvaluation(this.name, oldFormat, newFormat, 3, 0);
                    }
                }
            }
            if (!oldFormat.initializationDataEquals(newFormat)) {
                i |= 32;
            }
            if (n(this.mimeType)) {
                i |= 2;
            }
            if (i == 0) {
                return new DecoderReuseEvaluation(this.name, oldFormat, newFormat, 1, 0);
            }
        }
        return new DecoderReuseEvaluation(this.name, oldFormat, newFormat, 0, i);
    }

    public int getMaxSupportedInstances() {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (Util.SDK_INT < 23 || (codecCapabilities = this.capabilities) == null) {
            return -1;
        }
        return e(codecCapabilities);
    }

    public android.media.MediaCodecInfo.CodecProfileLevel[] getProfileLevels() {
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new android.media.MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    @RequiresApi(21)
    public boolean isAudioChannelCountSupportedV21(int channelCount) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            m("channelCount.caps");
            return false;
        }
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m("channelCount.aCaps");
            return false;
        }
        if (a(this.name, this.mimeType, audioCapabilities.getMaxInputChannelCount()) >= channelCount) {
            return true;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("channelCount.support, ");
        sb.append(channelCount);
        m(sb.toString());
        return false;
    }

    @RequiresApi(21)
    public boolean isAudioSampleRateSupportedV21(int sampleRate) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            m("sampleRate.caps");
            return false;
        }
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(sampleRate)) {
            return true;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("sampleRate.support, ");
        sb.append(sampleRate);
        m(sb.toString());
        return false;
    }

    public boolean isCodecSupported(Format format) {
        String mediaMimeType;
        String str = format.codecs;
        if (str == null || this.mimeType == null || (mediaMimeType = MimeTypes.getMediaMimeType(str)) == null) {
            return true;
        }
        if (!this.mimeType.equals(mediaMimeType)) {
            String str2 = format.codecs;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 13 + mediaMimeType.length());
            sb.append("codec.mime ");
            sb.append(str2);
            sb.append(", ");
            sb.append(mediaMimeType);
            m(sb.toString());
            return false;
        }
        Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format);
        if (codecProfileAndLevel == null) {
            return true;
        }
        int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
        int iIntValue2 = ((Integer) codecProfileAndLevel.second).intValue();
        if (!this.a && iIntValue != 42) {
            return true;
        }
        android.media.MediaCodecInfo.CodecProfileLevel[] profileLevels = getProfileLevels();
        if (Util.SDK_INT <= 23 && MimeTypes.VIDEO_VP9.equals(this.mimeType) && profileLevels.length == 0) {
            profileLevels = d(this.capabilities);
        }
        for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : profileLevels) {
            if (codecProfileLevel.profile == iIntValue && codecProfileLevel.level >= iIntValue2) {
                return true;
            }
        }
        String str3 = format.codecs;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 22 + mediaMimeType.length());
        sb2.append("codec.profileLevel, ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(mediaMimeType);
        m(sb2.toString());
        return false;
    }

    public boolean isFormatSupported(Format format) throws MediaCodecUtil.DecoderQueryException {
        int i;
        if (!isCodecSupported(format)) {
            return false;
        }
        if (!this.a) {
            if (Util.SDK_INT >= 21) {
                int i2 = format.sampleRate;
                if (i2 != -1 && !isAudioSampleRateSupportedV21(i2)) {
                    return false;
                }
                int i3 = format.channelCount;
                if (i3 != -1 && !isAudioChannelCountSupportedV21(i3)) {
                    return false;
                }
            }
            return true;
        }
        int i4 = format.width;
        if (i4 <= 0 || (i = format.height) <= 0) {
            return true;
        }
        if (Util.SDK_INT >= 21) {
            return isVideoSizeAndRateSupportedV21(i4, i, format.frameRate);
        }
        boolean z = i4 * i <= MediaCodecUtil.maxH264DecodableFrameSize();
        if (!z) {
            int i5 = format.width;
            int i6 = format.height;
            StringBuilder sb = new StringBuilder(40);
            sb.append("legacyFrameSize, ");
            sb.append(i5);
            sb.append("x");
            sb.append(i6);
            m(sb.toString());
        }
        return z;
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

    public boolean isSeamlessAdaptationSupported(Format format) {
        if (this.a) {
            return this.adaptive;
        }
        Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format);
        return codecProfileAndLevel != null && ((Integer) codecProfileAndLevel.first).intValue() == 42;
    }

    @RequiresApi(21)
    public boolean isVideoSizeAndRateSupportedV21(int width, int height, double frameRate) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            m("sizeAndRate.caps");
            return false;
        }
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m("sizeAndRate.vCaps");
            return false;
        }
        if (c(videoCapabilities, width, height, frameRate)) {
            return true;
        }
        if (width < height && q(this.name) && c(videoCapabilities, height, width, frameRate)) {
            StringBuilder sb = new StringBuilder(69);
            sb.append("sizeAndRate.rotated, ");
            sb.append(width);
            sb.append("x");
            sb.append(height);
            sb.append("x");
            sb.append(frameRate);
            l(sb.toString());
            return true;
        }
        StringBuilder sb2 = new StringBuilder(69);
        sb2.append("sizeAndRate.support, ");
        sb2.append(width);
        sb2.append("x");
        sb2.append(height);
        sb2.append("x");
        sb2.append(frameRate);
        m(sb2.toString());
        return false;
    }

    public String toString() {
        return this.name;
    }

    @Deprecated
    public boolean isSeamlessAdaptationSupported(Format oldFormat, Format newFormat, boolean isNewFormatComplete) {
        if (!isNewFormatComplete && oldFormat.colorInfo != null && newFormat.colorInfo == null) {
            newFormat = newFormat.buildUpon().setColorInfo(oldFormat.colorInfo).build();
        }
        int i = canReuseCodec(oldFormat, newFormat).result;
        return i == 2 || i == 3;
    }
}
