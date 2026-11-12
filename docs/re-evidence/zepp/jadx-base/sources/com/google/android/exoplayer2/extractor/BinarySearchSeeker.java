package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BinarySearchSeeker {
    private static final long b = 262144;
    private final int a;
    public final BinarySearchSeekMap seekMap;

    @Nullable
    public SeekOperationParams seekOperationParams;
    public final TimestampSeeker timestampSeeker;

    public static class BinarySearchSeekMap implements SeekMap {
        private final SeekTimestampConverter a;
        private final long b;
        private final long c;
        private final long d;
        private final long e;
        private final long f;
        private final long g;

        public BinarySearchSeekMap(SeekTimestampConverter seekTimestampConverter, long durationUs, long floorTimePosition, long ceilingTimePosition, long floorBytePosition, long ceilingBytePosition, long approxBytesPerFrame) {
            this.a = seekTimestampConverter;
            this.b = durationUs;
            this.c = floorTimePosition;
            this.d = ceilingTimePosition;
            this.e = floorBytePosition;
            this.f = ceilingBytePosition;
            this.g = approxBytesPerFrame;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            return this.b;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long timeUs) {
            return new SeekMap.SeekPoints(new SeekPoint(timeUs, SeekOperationParams.calculateNextSearchBytePosition(this.a.timeUsToTargetTime(timeUs), this.c, this.d, this.e, this.f, this.g)));
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }

        public long timeUsToTargetTime(long timeUs) {
            return this.a.timeUsToTargetTime(timeUs);
        }
    }

    public static final class DefaultSeekTimestampConverter implements SeekTimestampConverter {
        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter
        public long timeUsToTargetTime(long timeUs) {
            return timeUs;
        }
    }

    public static class SeekOperationParams {
        private final long a;
        private final long b;
        private final long c;
        private long d;
        private long e;
        private long f;
        private long g;
        private long h;

        public SeekOperationParams(long seekTimeUs, long targetTimePosition, long floorTimePosition, long ceilingTimePosition, long floorBytePosition, long ceilingBytePosition, long approxBytesPerFrame) {
            this.a = seekTimeUs;
            this.b = targetTimePosition;
            this.d = floorTimePosition;
            this.e = ceilingTimePosition;
            this.f = floorBytePosition;
            this.g = ceilingBytePosition;
            this.c = approxBytesPerFrame;
            this.h = calculateNextSearchBytePosition(targetTimePosition, floorTimePosition, ceilingTimePosition, floorBytePosition, ceilingBytePosition, approxBytesPerFrame);
        }

        public static long calculateNextSearchBytePosition(long targetTimePosition, long floorTimePosition, long ceilingTimePosition, long floorBytePosition, long ceilingBytePosition, long approxBytesPerFrame) {
            if (floorBytePosition + 1 >= ceilingBytePosition || floorTimePosition + 1 >= ceilingTimePosition) {
                return floorBytePosition;
            }
            long j = (long) ((targetTimePosition - floorTimePosition) * ((ceilingBytePosition - floorBytePosition) / (ceilingTimePosition - floorTimePosition)));
            return Util.constrainValue(((j + floorBytePosition) - approxBytesPerFrame) - (j / 20), floorBytePosition, ceilingBytePosition - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long h() {
            return this.g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.b;
        }

        private void m() {
            this.h = calculateNextSearchBytePosition(this.b, this.d, this.e, this.f, this.g, this.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(long ceilingTimePosition, long ceilingBytePosition) {
            this.e = ceilingTimePosition;
            this.g = ceilingBytePosition;
            m();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long floorTimePosition, long floorBytePosition) {
            this.d = floorTimePosition;
            this.f = floorBytePosition;
            m();
        }
    }

    public interface SeekTimestampConverter {
        long timeUsToTargetTime(long timeUs);
    }

    public static final class TimestampSearchResult {
        public static final TimestampSearchResult NO_TIMESTAMP_IN_RANGE_RESULT = new TimestampSearchResult(-3, C.TIME_UNSET, -1);
        public static final int TYPE_NO_TIMESTAMP = -3;
        public static final int TYPE_POSITION_OVERESTIMATED = -1;
        public static final int TYPE_POSITION_UNDERESTIMATED = -2;
        public static final int TYPE_TARGET_TIMESTAMP_FOUND = 0;
        private final int a;
        private final long b;
        private final long c;

        private TimestampSearchResult(int type, long timestampToUpdate, long bytePositionToUpdate) {
            this.a = type;
            this.b = timestampToUpdate;
            this.c = bytePositionToUpdate;
        }

        public static TimestampSearchResult overestimatedResult(long newCeilingTimestamp, long newCeilingBytePosition) {
            return new TimestampSearchResult(-1, newCeilingTimestamp, newCeilingBytePosition);
        }

        public static TimestampSearchResult targetFoundResult(long resultBytePosition) {
            return new TimestampSearchResult(0, C.TIME_UNSET, resultBytePosition);
        }

        public static TimestampSearchResult underestimatedResult(long newFloorTimestamp, long newCeilingBytePosition) {
            return new TimestampSearchResult(-2, newFloorTimestamp, newCeilingBytePosition);
        }
    }

    public interface TimestampSeeker {
        void onSeekFinished();

        TimestampSearchResult searchForTimestamp(ExtractorInput input, long targetTimestamp) throws IOException;
    }

    public BinarySearchSeeker(SeekTimestampConverter seekTimestampConverter, TimestampSeeker timestampSeeker, long durationUs, long floorTimePosition, long ceilingTimePosition, long floorBytePosition, long ceilingBytePosition, long approxBytesPerFrame, int minimumSearchRange) {
        this.timestampSeeker = timestampSeeker;
        this.a = minimumSearchRange;
        this.seekMap = new BinarySearchSeekMap(seekTimestampConverter, durationUs, floorTimePosition, ceilingTimePosition, floorBytePosition, ceilingBytePosition, approxBytesPerFrame);
    }

    public SeekOperationParams createSeekParamsForTargetTimeUs(long timeUs) {
        return new SeekOperationParams(timeUs, this.seekMap.timeUsToTargetTime(timeUs), this.seekMap.c, this.seekMap.d, this.seekMap.e, this.seekMap.f, this.seekMap.g);
    }

    public final SeekMap getSeekMap() {
        return this.seekMap;
    }

    public int handlePendingSeek(ExtractorInput input, PositionHolder seekPositionHolder) throws IOException {
        while (true) {
            SeekOperationParams seekOperationParams = (SeekOperationParams) Assertions.checkStateNotNull(this.seekOperationParams);
            long jI = seekOperationParams.i();
            long jH = seekOperationParams.h();
            long j = seekOperationParams.j();
            if (jH - jI <= this.a) {
                markSeekOperationFinished(false, jI);
                return seekToPosition(input, jI, seekPositionHolder);
            }
            if (!skipInputUntilPosition(input, j)) {
                return seekToPosition(input, j, seekPositionHolder);
            }
            input.resetPeekPosition();
            TimestampSearchResult timestampSearchResultSearchForTimestamp = this.timestampSeeker.searchForTimestamp(input, seekOperationParams.l());
            int i = timestampSearchResultSearchForTimestamp.a;
            if (i == -3) {
                markSeekOperationFinished(false, j);
                return seekToPosition(input, j, seekPositionHolder);
            }
            if (i == -2) {
                seekOperationParams.o(timestampSearchResultSearchForTimestamp.b, timestampSearchResultSearchForTimestamp.c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    skipInputUntilPosition(input, timestampSearchResultSearchForTimestamp.c);
                    markSeekOperationFinished(true, timestampSearchResultSearchForTimestamp.c);
                    return seekToPosition(input, timestampSearchResultSearchForTimestamp.c, seekPositionHolder);
                }
                seekOperationParams.n(timestampSearchResultSearchForTimestamp.b, timestampSearchResultSearchForTimestamp.c);
            }
        }
    }

    public final boolean isSeeking() {
        return this.seekOperationParams != null;
    }

    public final void markSeekOperationFinished(boolean foundTargetFrame, long resultPosition) {
        this.seekOperationParams = null;
        this.timestampSeeker.onSeekFinished();
        onSeekOperationFinished(foundTargetFrame, resultPosition);
    }

    public void onSeekOperationFinished(boolean foundTargetFrame, long resultPosition) {
    }

    public final int seekToPosition(ExtractorInput input, long position, PositionHolder seekPositionHolder) {
        if (position == input.getPosition()) {
            return 0;
        }
        seekPositionHolder.position = position;
        return 1;
    }

    public final void setSeekTargetUs(long timeUs) {
        SeekOperationParams seekOperationParams = this.seekOperationParams;
        if (seekOperationParams == null || seekOperationParams.k() != timeUs) {
            this.seekOperationParams = createSeekParamsForTargetTimeUs(timeUs);
        }
    }

    public final boolean skipInputUntilPosition(ExtractorInput input, long position) throws IOException {
        long position2 = position - input.getPosition();
        if (position2 < 0 || position2 > 262144) {
            return false;
        }
        input.skipFully((int) position2);
        return true;
    }
}
