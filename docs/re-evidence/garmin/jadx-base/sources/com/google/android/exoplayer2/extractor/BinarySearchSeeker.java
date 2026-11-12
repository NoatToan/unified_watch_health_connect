package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BinarySearchSeeker {
    private static final long MAX_SKIP_BYTES = 262144;
    private final int minimumSearchRange;
    protected final BinarySearchSeekMap seekMap;
    protected SeekOperationParams seekOperationParams;
    protected final TimestampSeeker timestampSeeker;

    public static class BinarySearchSeekMap implements SeekMap {
        private final long approxBytesPerFrame;
        private final long ceilingBytePosition;
        private final long ceilingTimePosition;
        private final long durationUs;
        private final long floorBytePosition;
        private final long floorTimePosition;
        private final SeekTimestampConverter seekTimestampConverter;

        public BinarySearchSeekMap(SeekTimestampConverter seekTimestampConverter, long j8, long j14, long j15, long j16, long j17, long j18) {
            this.seekTimestampConverter = seekTimestampConverter;
            this.durationUs = j8;
            this.floorTimePosition = j14;
            this.ceilingTimePosition = j15;
            this.floorBytePosition = j16;
            this.ceilingBytePosition = j17;
            this.approxBytesPerFrame = j18;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j8) {
            return new SeekMap.SeekPoints(new SeekPoint(j8, SeekOperationParams.calculateNextSearchBytePosition(this.seekTimestampConverter.timeUsToTargetTime(j8), this.floorTimePosition, this.ceilingTimePosition, this.floorBytePosition, this.ceilingBytePosition, this.approxBytesPerFrame)));
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }

        public long timeUsToTargetTime(long j8) {
            return this.seekTimestampConverter.timeUsToTargetTime(j8);
        }
    }

    public static final class DefaultSeekTimestampConverter implements SeekTimestampConverter {
        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter
        public long timeUsToTargetTime(long j8) {
            return j8;
        }
    }

    public static class SeekOperationParams {
        private final long approxBytesPerFrame;
        private long ceilingBytePosition;
        private long ceilingTimePosition;
        private long floorBytePosition;
        private long floorTimePosition;
        private long nextSearchBytePosition;
        private final long seekTimeUs;
        private final long targetTimePosition;

        public SeekOperationParams(long j8, long j14, long j15, long j16, long j17, long j18, long j19) {
            this.seekTimeUs = j8;
            this.targetTimePosition = j14;
            this.floorTimePosition = j15;
            this.ceilingTimePosition = j16;
            this.floorBytePosition = j17;
            this.ceilingBytePosition = j18;
            this.approxBytesPerFrame = j19;
            this.nextSearchBytePosition = calculateNextSearchBytePosition(j14, j15, j16, j17, j18, j19);
        }

        public static long calculateNextSearchBytePosition(long j8, long j14, long j15, long j16, long j17, long j18) {
            if (j16 + 1 >= j17 || j14 + 1 >= j15) {
                return j16;
            }
            long j19 = (long) ((j8 - j14) * ((j17 - j16) / (j15 - j14)));
            return Util.constrainValue(((j19 + j16) - j18) - (j19 / 20), j16, j17 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getCeilingBytePosition() {
            return this.ceilingBytePosition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getFloorBytePosition() {
            return this.floorBytePosition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getNextSearchBytePosition() {
            return this.nextSearchBytePosition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getSeekTimeUs() {
            return this.seekTimeUs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getTargetTimePosition() {
            return this.targetTimePosition;
        }

        private void updateNextSearchBytePosition() {
            this.nextSearchBytePosition = calculateNextSearchBytePosition(this.targetTimePosition, this.floorTimePosition, this.ceilingTimePosition, this.floorBytePosition, this.ceilingBytePosition, this.approxBytesPerFrame);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateSeekCeiling(long j8, long j14) {
            this.ceilingTimePosition = j8;
            this.ceilingBytePosition = j14;
            updateNextSearchBytePosition();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateSeekFloor(long j8, long j14) {
            this.floorTimePosition = j8;
            this.floorBytePosition = j14;
            updateNextSearchBytePosition();
        }
    }

    public interface SeekTimestampConverter {
        long timeUsToTargetTime(long j8);
    }

    public static final class TimestampSearchResult {
        public static final TimestampSearchResult NO_TIMESTAMP_IN_RANGE_RESULT = new TimestampSearchResult(-3, C.TIME_UNSET, -1);
        public static final int TYPE_NO_TIMESTAMP = -3;
        public static final int TYPE_POSITION_OVERESTIMATED = -1;
        public static final int TYPE_POSITION_UNDERESTIMATED = -2;
        public static final int TYPE_TARGET_TIMESTAMP_FOUND = 0;
        private final long bytePositionToUpdate;
        private final long timestampToUpdate;
        private final int type;

        private TimestampSearchResult(int i14, long j8, long j14) {
            this.type = i14;
            this.timestampToUpdate = j8;
            this.bytePositionToUpdate = j14;
        }

        public static TimestampSearchResult overestimatedResult(long j8, long j14) {
            return new TimestampSearchResult(-1, j8, j14);
        }

        public static TimestampSearchResult targetFoundResult(long j8) {
            return new TimestampSearchResult(0, C.TIME_UNSET, j8);
        }

        public static TimestampSearchResult underestimatedResult(long j8, long j14) {
            return new TimestampSearchResult(-2, j8, j14);
        }
    }

    public interface TimestampSeeker {
        default void onSeekFinished() {
        }

        TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j8);
    }

    public BinarySearchSeeker(SeekTimestampConverter seekTimestampConverter, TimestampSeeker timestampSeeker, long j8, long j14, long j15, long j16, long j17, long j18, int i14) {
        this.timestampSeeker = timestampSeeker;
        this.minimumSearchRange = i14;
        this.seekMap = new BinarySearchSeekMap(seekTimestampConverter, j8, j14, j15, j16, j17, j18);
    }

    public SeekOperationParams createSeekParamsForTargetTimeUs(long j8) {
        return new SeekOperationParams(j8, this.seekMap.timeUsToTargetTime(j8), this.seekMap.floorTimePosition, this.seekMap.ceilingTimePosition, this.seekMap.floorBytePosition, this.seekMap.ceilingBytePosition, this.seekMap.approxBytesPerFrame);
    }

    public final SeekMap getSeekMap() {
        return this.seekMap;
    }

    public int handlePendingSeek(ExtractorInput extractorInput, PositionHolder positionHolder) {
        while (true) {
            SeekOperationParams seekOperationParams = (SeekOperationParams) Assertions.checkStateNotNull(this.seekOperationParams);
            long floorBytePosition = seekOperationParams.getFloorBytePosition();
            long ceilingBytePosition = seekOperationParams.getCeilingBytePosition();
            long nextSearchBytePosition = seekOperationParams.getNextSearchBytePosition();
            if (ceilingBytePosition - floorBytePosition <= this.minimumSearchRange) {
                markSeekOperationFinished(false, floorBytePosition);
                return seekToPosition(extractorInput, floorBytePosition, positionHolder);
            }
            if (!skipInputUntilPosition(extractorInput, nextSearchBytePosition)) {
                return seekToPosition(extractorInput, nextSearchBytePosition, positionHolder);
            }
            extractorInput.resetPeekPosition();
            TimestampSearchResult timestampSearchResultSearchForTimestamp = this.timestampSeeker.searchForTimestamp(extractorInput, seekOperationParams.getTargetTimePosition());
            int i14 = timestampSearchResultSearchForTimestamp.type;
            if (i14 == -3) {
                markSeekOperationFinished(false, nextSearchBytePosition);
                return seekToPosition(extractorInput, nextSearchBytePosition, positionHolder);
            }
            if (i14 == -2) {
                seekOperationParams.updateSeekFloor(timestampSearchResultSearchForTimestamp.timestampToUpdate, timestampSearchResultSearchForTimestamp.bytePositionToUpdate);
            } else {
                if (i14 != -1) {
                    if (i14 != 0) {
                        h.z("Invalid case");
                        return 0;
                    }
                    skipInputUntilPosition(extractorInput, timestampSearchResultSearchForTimestamp.bytePositionToUpdate);
                    markSeekOperationFinished(true, timestampSearchResultSearchForTimestamp.bytePositionToUpdate);
                    return seekToPosition(extractorInput, timestampSearchResultSearchForTimestamp.bytePositionToUpdate, positionHolder);
                }
                seekOperationParams.updateSeekCeiling(timestampSearchResultSearchForTimestamp.timestampToUpdate, timestampSearchResultSearchForTimestamp.bytePositionToUpdate);
            }
        }
    }

    public final boolean isSeeking() {
        return this.seekOperationParams != null;
    }

    public final void markSeekOperationFinished(boolean z14, long j8) {
        this.seekOperationParams = null;
        this.timestampSeeker.onSeekFinished();
        onSeekOperationFinished(z14, j8);
    }

    public void onSeekOperationFinished(boolean z14, long j8) {
    }

    public final int seekToPosition(ExtractorInput extractorInput, long j8, PositionHolder positionHolder) {
        if (j8 == extractorInput.getPosition()) {
            return 0;
        }
        positionHolder.position = j8;
        return 1;
    }

    public final void setSeekTargetUs(long j8) {
        SeekOperationParams seekOperationParams = this.seekOperationParams;
        if (seekOperationParams == null || seekOperationParams.getSeekTimeUs() != j8) {
            this.seekOperationParams = createSeekParamsForTargetTimeUs(j8);
        }
    }

    public final boolean skipInputUntilPosition(ExtractorInput extractorInput, long j8) {
        long position = j8 - extractorInput.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        extractorInput.skipFully((int) position);
        return true;
    }
}
