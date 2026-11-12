package androidx.media3.transformer;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.util.Size;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DefaultEncoderFactory implements Codec.EncoderFactory {
    private static final int DEFAULT_AUDIO_BITRATE = 131072;
    private static final int DEFAULT_FRAME_RATE = 30;
    private static final int PRIORITY_BEST_EFFORT = 1;
    private final int codecPriority;
    private final Context context;
    private final boolean enableFallback;
    private final VideoEncoderSettings requestedVideoEncoderSettings;
    private final EncoderSelector videoEncoderSelector;

    interface EncoderFallbackCost {
        int getParameterSupportGap(MediaCodecInfo mediaCodecInfo);
    }

    private static int getSuggestedBitrate(int i, int i2, float f) {
        return (int) (((double) (i * i2 * f)) * 0.07d * 2.0d);
    }

    public static final class Builder {
        private final Context context;
        private EncoderSelector videoEncoderSelector = EncoderSelector.DEFAULT;
        private VideoEncoderSettings requestedVideoEncoderSettings = VideoEncoderSettings.DEFAULT;
        private boolean enableFallback = true;
        private int codecPriority = -2000;

        public Builder(Context context) {
            this.context = context.getApplicationContext();
        }

        public Builder setVideoEncoderSelector(EncoderSelector encoderSelector) {
            this.videoEncoderSelector = encoderSelector;
            return this;
        }

        public Builder setRequestedVideoEncoderSettings(VideoEncoderSettings videoEncoderSettings) {
            this.requestedVideoEncoderSettings = videoEncoderSettings;
            return this;
        }

        public Builder setEnableFallback(boolean z) {
            this.enableFallback = z;
            return this;
        }

        public Builder setCodecPriority(int i) {
            this.codecPriority = i;
            return this;
        }

        public DefaultEncoderFactory build() {
            return new DefaultEncoderFactory(this);
        }
    }

    @Deprecated
    public DefaultEncoderFactory(Context context) {
        this(new Builder(context));
    }

    @Deprecated
    public DefaultEncoderFactory(Context context, EncoderSelector encoderSelector, boolean z) {
        this(new Builder(context).setVideoEncoderSelector(encoderSelector).setEnableFallback(z));
    }

    @Deprecated
    public DefaultEncoderFactory(Context context, EncoderSelector encoderSelector, VideoEncoderSettings videoEncoderSettings, boolean z) {
        this(new Builder(context).setVideoEncoderSelector(encoderSelector).setEnableFallback(z).setRequestedVideoEncoderSettings(videoEncoderSettings));
    }

    private DefaultEncoderFactory(Builder builder) {
        this.context = builder.context;
        this.videoEncoderSelector = builder.videoEncoderSelector;
        this.requestedVideoEncoderSettings = builder.requestedVideoEncoderSettings;
        this.enableFallback = builder.enableFallback;
        this.codecPriority = builder.codecPriority;
    }

    @Override // androidx.media3.transformer.Codec.EncoderFactory
    public DefaultCodec createForAudioEncoding(Format format) throws ExportException {
        if (format.bitrate == -1) {
            format = format.buildUpon().setAverageBitrate(131072).build();
        }
        Format format2 = format;
        Assertions.checkNotNull(format2.sampleMimeType);
        MediaFormat mediaFormatCreateMediaFormatFromFormat = MediaFormatUtil.createMediaFormatFromFormat(format2);
        ImmutableList<MediaCodecInfo> supportedEncoders = EncoderUtil.getSupportedEncoders(format2.sampleMimeType);
        if (supportedEncoders.isEmpty()) {
            throw createExportException(format2, "No audio media codec found");
        }
        return new DefaultCodec(this.context, format2, mediaFormatCreateMediaFormatFromFormat, supportedEncoders.get(0).getName(), false, null);
    }

    @Override // androidx.media3.transformer.Codec.EncoderFactory
    public DefaultCodec createForVideoEncoding(Format format) throws ExportException {
        int suggestedBitrate;
        if (format.frameRate == -1.0f || deviceNeedsDefaultFrameRateWorkaround()) {
            format = format.buildUpon().setFrameRate(30.0f).build();
        }
        Assertions.checkArgument(format.width != -1);
        Assertions.checkArgument(format.height != -1);
        Assertions.checkArgument(format.height <= format.width);
        Assertions.checkArgument(format.rotationDegrees == 0);
        Assertions.checkNotNull(format.sampleMimeType);
        Assertions.checkStateNotNull(this.videoEncoderSelector);
        VideoEncoderQueryResult videoEncoderQueryResultFindEncoderWithClosestSupportedFormat = findEncoderWithClosestSupportedFormat(format, this.requestedVideoEncoderSettings, this.videoEncoderSelector, this.enableFallback);
        if (videoEncoderQueryResultFindEncoderWithClosestSupportedFormat == null) {
            throw createExportException(format, "The requested video encoding format is not supported.");
        }
        MediaCodecInfo mediaCodecInfo = videoEncoderQueryResultFindEncoderWithClosestSupportedFormat.encoder;
        Format format2 = videoEncoderQueryResultFindEncoderWithClosestSupportedFormat.supportedFormat;
        VideoEncoderSettings videoEncoderSettings = videoEncoderQueryResultFindEncoderWithClosestSupportedFormat.supportedEncoderSettings;
        String str = (String) Assertions.checkNotNull(format2.sampleMimeType);
        if (this.enableFallback || videoEncoderSettings.bitrate != -1) {
            suggestedBitrate = videoEncoderSettings.bitrate;
        } else if (videoEncoderSettings.enableHighQualityTargeting) {
            suggestedBitrate = new DeviceMappedEncoderBitrateProvider().getBitrate(mediaCodecInfo.getName(), format2.width, format2.height, format2.frameRate);
        } else if (format2.averageBitrate != -1) {
            suggestedBitrate = format2.averageBitrate;
        } else {
            suggestedBitrate = getSuggestedBitrate(format2.width, format2.height, format2.frameRate);
        }
        Format formatBuild = format2.buildUpon().setAverageBitrate(suggestedBitrate).build();
        MediaFormat mediaFormatCreateMediaFormatFromFormat = MediaFormatUtil.createMediaFormatFromFormat(formatBuild);
        mediaFormatCreateMediaFormatFromFormat.setInteger("bitrate-mode", videoEncoderSettings.bitrateMode);
        mediaFormatCreateMediaFormatFromFormat.setInteger("frame-rate", Math.round(formatBuild.frameRate));
        if (videoEncoderSettings.profile != -1 && videoEncoderSettings.level != -1 && Util.SDK_INT >= 23) {
            mediaFormatCreateMediaFormatFromFormat.setInteger("profile", videoEncoderSettings.profile);
            mediaFormatCreateMediaFormatFromFormat.setInteger("level", videoEncoderSettings.level);
        }
        if (str.equals(MimeTypes.VIDEO_H264)) {
            adjustMediaFormatForH264EncoderSettings(format.colorInfo, mediaCodecInfo, mediaFormatCreateMediaFormatFromFormat);
        }
        if (Util.SDK_INT >= 31 && ColorInfo.isTransferHdr(format.colorInfo)) {
            if (EncoderUtil.getSupportedColorFormats(mediaCodecInfo, str).contains(2130750114)) {
                mediaFormatCreateMediaFormatFromFormat.setInteger("color-format", 2130750114);
            } else {
                throw createExportException(format, "Encoding HDR is not supported on this device.");
            }
        } else {
            mediaFormatCreateMediaFormatFromFormat.setInteger("color-format", 2130708361);
        }
        if (Util.SDK_INT >= 25) {
            mediaFormatCreateMediaFormatFromFormat.setFloat("i-frame-interval", videoEncoderSettings.iFrameIntervalSeconds);
        } else {
            float f = videoEncoderSettings.iFrameIntervalSeconds;
            mediaFormatCreateMediaFormatFromFormat.setInteger("i-frame-interval", (f <= 0.0f || f > 1.0f) ? (int) Math.floor(f) : 1);
        }
        if (Util.SDK_INT >= 23) {
            if (videoEncoderSettings.operatingRate == -1 && videoEncoderSettings.priority == -1) {
                adjustMediaFormatForEncoderPerformanceSettings(mediaFormatCreateMediaFormatFromFormat);
            } else {
                if (videoEncoderSettings.operatingRate != -1) {
                    mediaFormatCreateMediaFormatFromFormat.setInteger("operating-rate", videoEncoderSettings.operatingRate);
                }
                if (videoEncoderSettings.priority != -1) {
                    mediaFormatCreateMediaFormatFromFormat.setInteger("priority", videoEncoderSettings.priority);
                }
            }
        }
        if (Util.SDK_INT >= 35) {
            mediaFormatCreateMediaFormatFromFormat.setInteger("importance", Math.max(0, -this.codecPriority));
        }
        return new DefaultCodec(this.context, formatBuild, mediaFormatCreateMediaFormatFromFormat, mediaCodecInfo.getName(), false, null);
    }

    @Override // androidx.media3.transformer.Codec.EncoderFactory
    public boolean videoNeedsEncoding() {
        return !this.requestedVideoEncoderSettings.equals(VideoEncoderSettings.DEFAULT);
    }

    @RequiresNonNull({"#1.sampleMimeType"})
    private static VideoEncoderQueryResult findEncoderWithClosestSupportedFormat(Format format, VideoEncoderSettings videoEncoderSettings, EncoderSelector encoderSelector, boolean z) {
        int bitrate;
        String str = (String) Assertions.checkNotNull(format.sampleMimeType);
        ImmutableList<MediaCodecInfo> immutableListSelectEncoderInfos = encoderSelector.selectEncoderInfos(str);
        if (immutableListSelectEncoderInfos.isEmpty()) {
            return null;
        }
        if (!z) {
            return new VideoEncoderQueryResult(immutableListSelectEncoderInfos.get(0), format, videoEncoderSettings);
        }
        ImmutableList<MediaCodecInfo> immutableListFilterEncodersByResolution = filterEncodersByResolution(immutableListSelectEncoderInfos, str, format.width, format.height);
        if (immutableListFilterEncodersByResolution.isEmpty()) {
            return null;
        }
        Size size = (Size) Assertions.checkNotNull(EncoderUtil.getSupportedResolution(immutableListFilterEncodersByResolution.get(0), str, format.width, format.height));
        if (videoEncoderSettings.enableHighQualityTargeting) {
            bitrate = -1;
        } else {
            if (videoEncoderSettings.bitrate != -1) {
                bitrate = videoEncoderSettings.bitrate;
            } else if (format.averageBitrate != -1) {
                bitrate = format.averageBitrate;
            } else {
                bitrate = getSuggestedBitrate(size.getWidth(), size.getHeight(), format.frameRate);
            }
            immutableListFilterEncodersByResolution = filterEncodersByBitrate(immutableListFilterEncodersByResolution, str, bitrate);
            if (immutableListFilterEncodersByResolution.isEmpty()) {
                return null;
            }
        }
        ImmutableList<MediaCodecInfo> immutableListFilterEncodersByBitrateMode = filterEncodersByBitrateMode(immutableListFilterEncodersByResolution, str, videoEncoderSettings.bitrateMode);
        if (immutableListFilterEncodersByBitrateMode.isEmpty()) {
            return null;
        }
        VideoEncoderSettings.Builder builderBuildUpon = videoEncoderSettings.buildUpon();
        Format.Builder height = format.buildUpon().setSampleMimeType(str).setWidth(size.getWidth()).setHeight(size.getHeight());
        MediaCodecInfo mediaCodecInfo = immutableListFilterEncodersByBitrateMode.get(0);
        if (videoEncoderSettings.enableHighQualityTargeting) {
            bitrate = new DeviceMappedEncoderBitrateProvider().getBitrate(mediaCodecInfo.getName(), size.getWidth(), size.getHeight(), format.frameRate);
            builderBuildUpon.experimentalSetEnableHighQualityTargeting(false);
        }
        int iIntValue = ((Integer) EncoderUtil.getSupportedBitrateRange(mediaCodecInfo, str).clamp(Integer.valueOf(bitrate))).intValue();
        builderBuildUpon.setBitrate(iIntValue);
        height.setAverageBitrate(iIntValue);
        if (videoEncoderSettings.profile == -1 || videoEncoderSettings.level == -1 || videoEncoderSettings.level > EncoderUtil.findHighestSupportedEncodingLevel(mediaCodecInfo, str, videoEncoderSettings.profile)) {
            builderBuildUpon.setEncodingProfileLevel(-1, -1);
        }
        return new VideoEncoderQueryResult(mediaCodecInfo, height.build(), builderBuildUpon.build());
    }

    private static ImmutableList<MediaCodecInfo> filterEncodersByResolution(List<MediaCodecInfo> list, final String str, final int i, final int i2) {
        return filterEncoders(list, new EncoderFallbackCost() { // from class: androidx.media3.transformer.DefaultEncoderFactory$$ExternalSyntheticLambda3
            @Override // androidx.media3.transformer.DefaultEncoderFactory.EncoderFallbackCost
            public final int getParameterSupportGap(MediaCodecInfo mediaCodecInfo) {
                return DefaultEncoderFactory.lambda$filterEncodersByResolution$0(str, i, i2, mediaCodecInfo);
            }
        });
    }

    static /* synthetic */ int lambda$filterEncodersByResolution$0(String str, int i, int i2, MediaCodecInfo mediaCodecInfo) {
        Size supportedResolution = EncoderUtil.getSupportedResolution(mediaCodecInfo, str, i, i2);
        if (supportedResolution == null) {
            return Integer.MAX_VALUE;
        }
        return Math.abs((i * i2) - (supportedResolution.getWidth() * supportedResolution.getHeight()));
    }

    private static ImmutableList<MediaCodecInfo> filterEncodersByBitrate(List<MediaCodecInfo> list, final String str, final int i) {
        return filterEncoders(list, new EncoderFallbackCost() { // from class: androidx.media3.transformer.DefaultEncoderFactory$$ExternalSyntheticLambda1
            @Override // androidx.media3.transformer.DefaultEncoderFactory.EncoderFallbackCost
            public final int getParameterSupportGap(MediaCodecInfo mediaCodecInfo) {
                String str2 = str;
                int i2 = i;
                return Math.abs(((Integer) EncoderUtil.getSupportedBitrateRange(mediaCodecInfo, str2).clamp(Integer.valueOf(i2))).intValue() - i2);
            }
        });
    }

    private static ImmutableList<MediaCodecInfo> filterEncodersByBitrateMode(List<MediaCodecInfo> list, final String str, final int i) {
        return filterEncoders(list, new EncoderFallbackCost() { // from class: androidx.media3.transformer.DefaultEncoderFactory$$ExternalSyntheticLambda2
            @Override // androidx.media3.transformer.DefaultEncoderFactory.EncoderFallbackCost
            public final int getParameterSupportGap(MediaCodecInfo mediaCodecInfo) {
                return DefaultEncoderFactory.lambda$filterEncodersByBitrateMode$2(str, i, mediaCodecInfo);
            }
        });
    }

    static /* synthetic */ int lambda$filterEncodersByBitrateMode$2(String str, int i, MediaCodecInfo mediaCodecInfo) {
        return EncoderUtil.isBitrateModeSupported(mediaCodecInfo, str, i) ? 0 : Integer.MAX_VALUE;
    }

    static final class VideoEncoderQueryResult {
        public final MediaCodecInfo encoder;
        public final VideoEncoderSettings supportedEncoderSettings;
        public final Format supportedFormat;

        public VideoEncoderQueryResult(MediaCodecInfo mediaCodecInfo, Format format, VideoEncoderSettings videoEncoderSettings) {
            this.encoder = mediaCodecInfo;
            this.supportedFormat = format;
            this.supportedEncoderSettings = videoEncoderSettings;
        }
    }

    private static void adjustMediaFormatForEncoderPerformanceSettings(MediaFormat mediaFormat) {
        if (Util.SDK_INT < 25) {
            return;
        }
        mediaFormat.setInteger("priority", 1);
        if (Util.SDK_INT == 26) {
            mediaFormat.setInteger("operating-rate", 30);
        } else if (deviceNeedsLowerOperatingRateAvoidingOverflowWorkaround()) {
            mediaFormat.setInteger("operating-rate", 1000);
        } else {
            mediaFormat.setInteger("operating-rate", Integer.MAX_VALUE);
        }
    }

    private static boolean deviceNeedsLowerOperatingRateAvoidingOverflowWorkaround() {
        if (Util.SDK_INT < 31 || Util.SDK_INT > 34) {
            return false;
        }
        return Build.SOC_MODEL.equals("SM8550") || Build.SOC_MODEL.equals("T612") || Build.SOC_MODEL.equals("SM7450") || Build.SOC_MODEL.equals("SM6450");
    }

    private static void adjustMediaFormatForH264EncoderSettings(ColorInfo colorInfo, MediaCodecInfo mediaCodecInfo, MediaFormat mediaFormat) {
        int iIntValue = 8;
        if (Util.SDK_INT >= 29) {
            if (colorInfo != null) {
                ImmutableList<Integer> codecProfilesForHdrFormat = EncoderUtil.getCodecProfilesForHdrFormat(MimeTypes.VIDEO_H264, colorInfo.colorTransfer);
                if (!codecProfilesForHdrFormat.isEmpty()) {
                    iIntValue = codecProfilesForHdrFormat.get(0).intValue();
                }
            }
            int iFindHighestSupportedEncodingLevel = EncoderUtil.findHighestSupportedEncodingLevel(mediaCodecInfo, MimeTypes.VIDEO_H264, iIntValue);
            if (iFindHighestSupportedEncodingLevel != -1) {
                mediaFormat.setInteger("profile", iIntValue);
                mediaFormat.setInteger("level", iFindHighestSupportedEncodingLevel);
                return;
            }
            return;
        }
        if (Util.SDK_INT >= 26 && !deviceNeedsNoH264HighProfileWorkaround()) {
            int iFindHighestSupportedEncodingLevel2 = EncoderUtil.findHighestSupportedEncodingLevel(mediaCodecInfo, MimeTypes.VIDEO_H264, 8);
            if (iFindHighestSupportedEncodingLevel2 != -1) {
                mediaFormat.setInteger("profile", 8);
                mediaFormat.setInteger("level", iFindHighestSupportedEncodingLevel2);
                mediaFormat.setInteger("latency", 1);
                return;
            }
            return;
        }
        if (Util.SDK_INT >= 24) {
            int iFindHighestSupportedEncodingLevel3 = EncoderUtil.findHighestSupportedEncodingLevel(mediaCodecInfo, MimeTypes.VIDEO_H264, 1);
            Assertions.checkState(iFindHighestSupportedEncodingLevel3 != -1);
            mediaFormat.setInteger("profile", 1);
            mediaFormat.setInteger("level", iFindHighestSupportedEncodingLevel3);
        }
    }

    private static ImmutableList<MediaCodecInfo> filterEncoders(List<MediaCodecInfo> list, EncoderFallbackCost encoderFallbackCost) {
        ArrayList arrayList = new ArrayList(list.size());
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < list.size(); i2++) {
            MediaCodecInfo mediaCodecInfo = list.get(i2);
            int parameterSupportGap = encoderFallbackCost.getParameterSupportGap(mediaCodecInfo);
            if (parameterSupportGap != Integer.MAX_VALUE) {
                if (parameterSupportGap < i) {
                    arrayList.clear();
                    arrayList.add(mediaCodecInfo);
                    i = parameterSupportGap;
                } else if (parameterSupportGap == i) {
                    arrayList.add(mediaCodecInfo);
                }
            }
        }
        return ImmutableList.copyOf((Collection) arrayList);
    }

    @RequiresNonNull({"#1.sampleMimeType"})
    private static ExportException createExportException(Format format, String str) {
        return ExportException.createForCodec(new IllegalArgumentException(str), 4003, new ExportException.CodecInfo(format.toString(), MimeTypes.isVideo(format.sampleMimeType), false, null));
    }

    private static boolean deviceNeedsDefaultFrameRateWorkaround() {
        return Util.SDK_INT < 30 && Util.DEVICE.equals("joyeuse");
    }

    private static boolean deviceNeedsNoH264HighProfileWorkaround() {
        if (Util.SDK_INT == 27) {
            return Util.DEVICE.equals("ASUS_X00T_3") || Util.DEVICE.equals("TC77");
        }
        return false;
    }
}
