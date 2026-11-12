package androidx.media3.transformer;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.Iterator;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes21.dex */
final class SefSlowMotionFlattener {
    static final int INPUT_FRAME_RATE = 30;
    private static final int NAL_START_CODE_LENGTH = NalUnitUtil.NAL_START_CODE.length;
    private static final int TARGET_OUTPUT_FRAME_RATE = 30;
    private final float captureFrameRate;
    private SegmentInfo currentSegmentInfo;
    private long frameTimeDeltaUs;
    private final int inputMaxLayer;
    private final String mimeType;
    private SegmentInfo nextSegmentInfo;
    private final int normalSpeedMaxLayer;
    private final Iterator<SlowMotionData.Segment> segmentIterator;
    private final SlowMotionData slowMotionData;
    private final byte[] scratch = new byte[NAL_START_CODE_LENGTH];
    private long lastSamplePresentationTimeUs = C.TIME_UNSET;

    static final class MetadataInfo {
        public float captureFrameRate = -3.4028235E38f;
        public int inputMaxLayer = -1;
        public int normalSpeedMaxLayer = -1;
        public SlowMotionData slowMotionData;
    }

    public SefSlowMotionFlattener(Format format) {
        MetadataInfo metadataInfo = getMetadataInfo(format.metadata);
        SlowMotionData slowMotionData = metadataInfo.slowMotionData;
        this.slowMotionData = slowMotionData;
        String str = (String) Assertions.checkNotNull(format.sampleMimeType);
        this.mimeType = str;
        if (slowMotionData != null) {
            Assertions.checkArgument(str.equals(MimeTypes.VIDEO_H264) || str.equals(MimeTypes.VIDEO_H265), "Unsupported MIME type for SEF slow motion video track: " + str);
        }
        Iterator<SlowMotionData.Segment> it = (slowMotionData != null ? slowMotionData.segments : ImmutableList.of()).iterator();
        this.segmentIterator = it;
        this.captureFrameRate = metadataInfo.captureFrameRate;
        int i = metadataInfo.inputMaxLayer;
        this.inputMaxLayer = i;
        int i2 = metadataInfo.normalSpeedMaxLayer;
        this.normalSpeedMaxLayer = i2;
        this.nextSegmentInfo = it.hasNext() ? new SegmentInfo(it.next(), i, i2) : null;
    }

    public boolean dropOrTransformSample(ByteBuffer byteBuffer, long j) {
        int i;
        if (this.slowMotionData == null) {
            this.lastSamplePresentationTimeUs = j;
            return false;
        }
        int iPosition = byteBuffer.position();
        byteBuffer.position(NAL_START_CODE_LENGTH + iPosition);
        byteBuffer.get(this.scratch, 0, 4);
        if (this.mimeType.equals(MimeTypes.VIDEO_H264)) {
            byte[] bArr = this.scratch;
            Assertions.checkState((bArr[0] & Ascii.US) == 14 && (((bArr[1] & 255) >> 7) == 1), "Missing SVC extension prefix NAL unit.");
            i = (this.scratch[3] & 255) >> 5;
        } else if (this.mimeType.equals(MimeTypes.VIDEO_H265)) {
            i = (this.scratch[1] & 7) - 1;
        } else {
            throw new IllegalStateException();
        }
        boolean zProcessCurrentFrame = processCurrentFrame(i, j);
        this.lastSamplePresentationTimeUs = getCurrentFrameOutputTimeUs(j);
        if (!zProcessCurrentFrame) {
            return true;
        }
        byteBuffer.position(iPosition);
        return false;
    }

    public long getSamplePresentationTimeUs() {
        Assertions.checkState(this.lastSamplePresentationTimeUs != C.TIME_UNSET);
        return this.lastSamplePresentationTimeUs;
    }

    boolean processCurrentFrame(int i, long j) {
        while (true) {
            SegmentInfo segmentInfo = this.nextSegmentInfo;
            if (segmentInfo == null || j < segmentInfo.endTimeUs) {
                break;
            }
            enterNextSegment();
        }
        SegmentInfo segmentInfo2 = this.nextSegmentInfo;
        if (segmentInfo2 != null && j >= segmentInfo2.startTimeUs) {
            enterNextSegment();
        } else {
            SegmentInfo segmentInfo3 = this.currentSegmentInfo;
            if (segmentInfo3 != null && j >= segmentInfo3.endTimeUs) {
                leaveCurrentSegment();
            }
        }
        SegmentInfo segmentInfo4 = this.currentSegmentInfo;
        return i <= (segmentInfo4 != null ? segmentInfo4.maxLayer : this.normalSpeedMaxLayer) || shouldKeepFrameForOutputValidity(i, j);
    }

    private void enterNextSegment() {
        if (this.currentSegmentInfo != null) {
            leaveCurrentSegment();
        }
        this.currentSegmentInfo = this.nextSegmentInfo;
        this.nextSegmentInfo = this.segmentIterator.hasNext() ? new SegmentInfo(this.segmentIterator.next(), this.inputMaxLayer, this.normalSpeedMaxLayer) : null;
    }

    @RequiresNonNull({"currentSegmentInfo"})
    private void leaveCurrentSegment() {
        this.frameTimeDeltaUs += (this.currentSegmentInfo.endTimeUs - this.currentSegmentInfo.startTimeUs) * ((long) (this.currentSegmentInfo.speedDivisor - 1));
        this.currentSegmentInfo = null;
    }

    private boolean shouldKeepFrameForOutputValidity(int i, long j) {
        SegmentInfo segmentInfo = this.nextSegmentInfo;
        if (segmentInfo == null || i >= segmentInfo.maxLayer) {
            return false;
        }
        long j2 = ((this.nextSegmentInfo.startTimeUs - j) * 30) / 1000000;
        float f = -(1 << (this.inputMaxLayer - this.nextSegmentInfo.maxLayer));
        for (int i2 = 1; i2 < this.nextSegmentInfo.maxLayer && j2 < (1 << (this.inputMaxLayer - i2)) + 0.45f + f; i2++) {
            if (i <= i2) {
                return true;
            }
        }
        return false;
    }

    long getCurrentFrameOutputTimeUs(long j) {
        long j2 = this.frameTimeDeltaUs + j;
        SegmentInfo segmentInfo = this.currentSegmentInfo;
        if (segmentInfo != null) {
            j2 += (j - segmentInfo.startTimeUs) * ((long) (this.currentSegmentInfo.speedDivisor - 1));
        }
        return Math.round((j2 * 30) / this.captureFrameRate);
    }

    private static MetadataInfo getMetadataInfo(Metadata metadata) {
        MetadataInfo metadataInfo = new MetadataInfo();
        if (metadata != null) {
            for (int i = 0; i < metadata.length(); i++) {
                Metadata.Entry entry = metadata.get(i);
                if (entry instanceof SmtaMetadataEntry) {
                    SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) entry;
                    metadataInfo.captureFrameRate = smtaMetadataEntry.captureFrameRate;
                    metadataInfo.inputMaxLayer = smtaMetadataEntry.svcTemporalLayerCount - 1;
                } else if (entry instanceof SlowMotionData) {
                    metadataInfo.slowMotionData = (SlowMotionData) entry;
                }
            }
            if (metadataInfo.slowMotionData != null) {
                Assertions.checkState(metadataInfo.inputMaxLayer != -1, "SVC temporal layer count not found.");
                Assertions.checkState(metadataInfo.captureFrameRate != -3.4028235E38f, "Capture frame rate not found.");
                Assertions.checkState(metadataInfo.captureFrameRate % 1.0f == 0.0f && metadataInfo.captureFrameRate % 30.0f == 0.0f, "Invalid capture frame rate: " + metadataInfo.captureFrameRate);
                int i2 = ((int) metadataInfo.captureFrameRate) / 30;
                for (int i3 = metadataInfo.inputMaxLayer; i3 >= 0; i3--) {
                    if ((i2 & 1) == 1) {
                        Assertions.checkState((i2 >> 1) == 0, "Could not compute normal speed max SVC layer for capture frame rate  " + metadataInfo.captureFrameRate);
                        metadataInfo.normalSpeedMaxLayer = i3;
                        return metadataInfo;
                    }
                    i2 >>= 1;
                }
            }
        }
        return metadataInfo;
    }

    static final class SegmentInfo {
        public final long endTimeUs;
        public final int maxLayer;
        public final int speedDivisor;
        public final long startTimeUs;

        public SegmentInfo(SlowMotionData.Segment segment, int i, int i2) {
            this.startTimeUs = Util.msToUs(segment.startTimeMs);
            this.endTimeUs = Util.msToUs(segment.endTimeMs);
            int i3 = segment.speedDivisor;
            this.speedDivisor = i3;
            this.maxLayer = getSlowMotionMaxLayer(i3, i, i2);
        }

        private static int getSlowMotionMaxLayer(int i, int i2, int i3) {
            for (int i4 = i; i4 > 0; i4 >>= 1) {
                if ((i4 & 1) == 1) {
                    Assertions.checkState((i4 >> 1) == 0, "Invalid speed divisor: " + i);
                    break;
                }
                i3++;
            }
            return Math.min(i3, i2);
        }
    }
}
