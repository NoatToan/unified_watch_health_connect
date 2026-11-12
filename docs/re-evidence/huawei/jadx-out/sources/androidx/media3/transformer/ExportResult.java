package androidx.media3.transformer;

import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public final class ExportResult {
    public static final int CONVERSION_PROCESS_NA = 0;
    public static final int CONVERSION_PROCESS_TRANSCODED = 1;
    public static final int CONVERSION_PROCESS_TRANSMUXED = 2;
    public static final int CONVERSION_PROCESS_TRANSMUXED_AND_TRANSCODED = 3;
    public static final int OPTIMIZATION_ABANDONED_KEYFRAME_PLACEMENT_OPTIMAL_FOR_TRIM = 2;
    public static final int OPTIMIZATION_ABANDONED_OTHER = 4;
    public static final int OPTIMIZATION_ABANDONED_TRIM_AND_TRANSCODING_TRANSFORMATION_REQUESTED = 3;
    public static final int OPTIMIZATION_FAILED_EXTRACTION_FAILED = 5;
    public static final int OPTIMIZATION_FAILED_FORMAT_MISMATCH = 6;
    public static final int OPTIMIZATION_NONE = 0;
    public static final int OPTIMIZATION_SUCCEEDED = 1;
    public final int audioConversionProcess;
    public final String audioEncoderName;
    public final String audioMimeType;
    public final int averageAudioBitrate;
    public final int averageVideoBitrate;
    public final int channelCount;
    public final ColorInfo colorInfo;
    public final long durationMs;
    public final ExportException exportException;
    public final long fileSizeBytes;
    public final int height;
    public final int optimizationResult;
    final ImmutableList<ProcessedInput> processedInputs;
    public final int sampleRate;
    public final int videoConversionProcess;
    public final String videoEncoderName;
    public final int videoFrameCount;
    public final String videoMimeType;
    public final int width;

    public static final class Builder {
        private String audioEncoderName;
        private String audioMimeType;
        private int averageAudioBitrate;
        private int averageVideoBitrate;
        private int channelCount;
        private ColorInfo colorInfo;
        private long durationMs;
        private ExportException exportException;
        private long fileSizeBytes;
        private int height;
        private int optimizationResult;
        private ImmutableList.c<ProcessedInput> processedInputsBuilder;
        private int sampleRate;
        private String videoEncoderName;
        private int videoFrameCount;
        private String videoMimeType;
        private int width;

        public Builder() {
            reset();
        }

        public Builder addProcessedInputs(List<ProcessedInput> list) {
            this.processedInputsBuilder.addAll(list);
            return this;
        }

        public Builder setDurationMs(long j) {
            Assertions.checkArgument(j >= 0 || j == C.TIME_UNSET);
            this.durationMs = j;
            return this;
        }

        public Builder setFileSizeBytes(long j) {
            Assertions.checkArgument(j > 0 || j == -1, "Invalid file size = " + j);
            this.fileSizeBytes = j;
            return this;
        }

        public Builder setAverageAudioBitrate(int i) {
            Assertions.checkArgument(i > 0 || i == -2147483647);
            this.averageAudioBitrate = i;
            return this;
        }

        public Builder setChannelCount(int i) {
            Assertions.checkArgument(i > 0 || i == -1);
            this.channelCount = i;
            return this;
        }

        public Builder setSampleRate(int i) {
            Assertions.checkArgument(i > 0 || i == -2147483647);
            this.sampleRate = i;
            return this;
        }

        public Builder setAudioEncoderName(String str) {
            this.audioEncoderName = str;
            return this;
        }

        public Builder setAudioMimeType(String str) {
            this.audioMimeType = str;
            return this;
        }

        public Builder setAverageVideoBitrate(int i) {
            Assertions.checkArgument(i > 0 || i == -2147483647);
            this.averageVideoBitrate = i;
            return this;
        }

        public Builder setColorInfo(ColorInfo colorInfo) {
            this.colorInfo = colorInfo;
            return this;
        }

        public Builder setHeight(int i) {
            Assertions.checkArgument(i > 0 || i == -1);
            this.height = i;
            return this;
        }

        public Builder setWidth(int i) {
            Assertions.checkArgument(i > 0 || i == -1);
            this.width = i;
            return this;
        }

        public Builder setVideoFrameCount(int i) {
            Assertions.checkArgument(i >= 0);
            this.videoFrameCount = i;
            return this;
        }

        public Builder setVideoEncoderName(String str) {
            this.videoEncoderName = str;
            return this;
        }

        public Builder setVideoMimeType(String str) {
            this.videoMimeType = str;
            return this;
        }

        public Builder setOptimizationResult(int i) {
            this.optimizationResult = i;
            return this;
        }

        public Builder setExportException(ExportException exportException) {
            this.exportException = exportException;
            return this;
        }

        public ExportResult build() {
            return new ExportResult(this.processedInputsBuilder.build(), this.durationMs, this.fileSizeBytes, this.averageAudioBitrate, this.channelCount, this.sampleRate, this.audioEncoderName, this.audioMimeType, this.averageVideoBitrate, this.colorInfo, this.height, this.width, this.videoFrameCount, this.videoEncoderName, this.videoMimeType, this.optimizationResult, this.exportException);
        }

        public void reset() {
            this.processedInputsBuilder = new ImmutableList.c<>();
            this.durationMs = C.TIME_UNSET;
            this.fileSizeBytes = -1L;
            this.averageAudioBitrate = C.RATE_UNSET_INT;
            this.channelCount = -1;
            this.sampleRate = C.RATE_UNSET_INT;
            this.audioEncoderName = null;
            this.averageVideoBitrate = C.RATE_UNSET_INT;
            this.colorInfo = null;
            this.height = -1;
            this.width = -1;
            this.videoFrameCount = 0;
            this.videoEncoderName = null;
            this.optimizationResult = 0;
            this.exportException = null;
        }
    }

    public static final class ProcessedInput {
        public final String audioDecoderName;
        public final MediaItem mediaItem;
        public final String videoDecoderName;

        public ProcessedInput(MediaItem mediaItem, String str, String str2) {
            this.mediaItem = mediaItem;
            this.audioDecoderName = str;
            this.videoDecoderName = str2;
        }
    }

    private ExportResult(ImmutableList<ProcessedInput> immutableList, long j, long j2, int i, int i2, int i3, String str, String str2, int i4, ColorInfo colorInfo, int i5, int i6, int i7, String str3, String str4, int i8, ExportException exportException) {
        this.processedInputs = immutableList;
        this.durationMs = j;
        this.fileSizeBytes = j2;
        this.averageAudioBitrate = i;
        this.channelCount = i2;
        this.sampleRate = i3;
        this.audioEncoderName = str;
        this.audioMimeType = str2;
        this.averageVideoBitrate = i4;
        this.colorInfo = colorInfo;
        this.height = i5;
        this.width = i6;
        this.videoFrameCount = i7;
        this.videoEncoderName = str3;
        this.videoMimeType = str4;
        this.optimizationResult = i8;
        this.exportException = exportException;
        this.audioConversionProcess = getConversionProcess(str2, i8, immutableList, 1);
        this.videoConversionProcess = getConversionProcess(str4, i8, immutableList, 2);
    }

    public Builder buildUpon() {
        return new Builder().addProcessedInputs(this.processedInputs).setDurationMs(this.durationMs).setFileSizeBytes(this.fileSizeBytes).setAverageAudioBitrate(this.averageAudioBitrate).setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setAudioEncoderName(this.audioEncoderName).setAudioMimeType(this.audioMimeType).setAverageVideoBitrate(this.averageVideoBitrate).setColorInfo(this.colorInfo).setHeight(this.height).setWidth(this.width).setVideoFrameCount(this.videoFrameCount).setVideoEncoderName(this.videoEncoderName).setVideoMimeType(this.videoMimeType).setOptimizationResult(this.optimizationResult).setExportException(this.exportException);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExportResult)) {
            return false;
        }
        ExportResult exportResult = (ExportResult) obj;
        return Objects.equals(this.processedInputs, exportResult.processedInputs) && this.durationMs == exportResult.durationMs && this.fileSizeBytes == exportResult.fileSizeBytes && this.averageAudioBitrate == exportResult.averageAudioBitrate && this.channelCount == exportResult.channelCount && this.sampleRate == exportResult.sampleRate && Objects.equals(this.audioEncoderName, exportResult.audioEncoderName) && Objects.equals(this.audioMimeType, exportResult.audioMimeType) && this.averageVideoBitrate == exportResult.averageVideoBitrate && Objects.equals(this.colorInfo, exportResult.colorInfo) && this.height == exportResult.height && this.width == exportResult.width && this.videoFrameCount == exportResult.videoFrameCount && Objects.equals(this.videoEncoderName, exportResult.videoEncoderName) && Objects.equals(this.videoMimeType, exportResult.videoMimeType) && this.optimizationResult == exportResult.optimizationResult && Objects.equals(this.exportException, exportResult.exportException);
    }

    public int hashCode() {
        int iHashCode = Objects.hashCode(this.processedInputs);
        int i = (int) this.durationMs;
        int i2 = (int) this.fileSizeBytes;
        int i3 = this.averageAudioBitrate;
        int i4 = this.channelCount;
        int i5 = this.sampleRate;
        int iHashCode2 = Objects.hashCode(this.audioEncoderName);
        int iHashCode3 = Objects.hashCode(this.audioMimeType);
        int i6 = this.averageVideoBitrate;
        int iHashCode4 = Objects.hashCode(this.colorInfo);
        int i7 = this.height;
        int i8 = this.width;
        int i9 = this.videoFrameCount;
        int iHashCode5 = Objects.hashCode(this.videoEncoderName);
        return (((((((((((((((((((((((((((((((iHashCode * 31) + i) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i6) * 31) + iHashCode4) * 31) + i7) * 31) + i8) * 31) + i9) * 31) + iHashCode5) * 31) + Objects.hashCode(this.videoMimeType)) * 31) + this.optimizationResult) * 31) + Objects.hashCode(this.exportException);
    }

    private static int getConversionProcess(String str, int i, List<ProcessedInput> list, int i2) {
        String str2;
        int i3 = 0;
        if (str == null) {
            return 0;
        }
        if (i == 1) {
            return i2 == 1 ? 2 : 3;
        }
        for (ProcessedInput processedInput : list) {
            if (i2 == 1) {
                str2 = processedInput.audioDecoderName;
            } else {
                str2 = processedInput.videoDecoderName;
            }
            if (str2 == null) {
                if (i3 == 1) {
                    return 3;
                }
                i3 = 2;
            } else {
                if (i3 == 2) {
                    return 3;
                }
                i3 = 1;
            }
        }
        return i3;
    }
}
