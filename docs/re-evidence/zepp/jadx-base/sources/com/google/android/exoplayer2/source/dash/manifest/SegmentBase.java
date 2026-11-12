package com.google.android.exoplayer2.source.dash.manifest;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Util;
import com.google.common.math.BigIntegerMath;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SegmentBase {

    @Nullable
    public final RangedUri a;
    public final long b;
    public final long c;

    public static abstract class MultiSegmentBase extends SegmentBase {
        public final long d;
        public final long e;

        @Nullable
        public final List<SegmentTimelineElement> f;
        private final long g;
        private final long h;

        @VisibleForTesting
        public final long i;

        public MultiSegmentBase(@Nullable RangedUri initialization, long timescale, long presentationTimeOffset, long startNumber, long duration, @Nullable List<SegmentTimelineElement> segmentTimeline, long availabilityTimeOffsetUs, long timeShiftBufferDepthUs, long periodStartUnixTimeUs) {
            super(initialization, timescale, presentationTimeOffset);
            this.d = startNumber;
            this.e = duration;
            this.f = segmentTimeline;
            this.i = availabilityTimeOffsetUs;
            this.g = timeShiftBufferDepthUs;
            this.h = periodStartUnixTimeUs;
        }

        public long getAvailableSegmentCount(long periodDurationUs, long nowUnixTimeUs) {
            long segmentCount = getSegmentCount(periodDurationUs);
            return segmentCount != -1 ? segmentCount : (int) (getSegmentNum((nowUnixTimeUs - this.h) + this.i, periodDurationUs) - getFirstAvailableSegmentNum(periodDurationUs, nowUnixTimeUs));
        }

        public long getFirstAvailableSegmentNum(long periodDurationUs, long nowUnixTimeUs) {
            if (getSegmentCount(periodDurationUs) == -1) {
                long j = this.g;
                if (j != C.TIME_UNSET) {
                    return Math.max(getFirstSegmentNum(), getSegmentNum((nowUnixTimeUs - this.h) - j, periodDurationUs));
                }
            }
            return getFirstSegmentNum();
        }

        public long getFirstSegmentNum() {
            return this.d;
        }

        public long getNextSegmentAvailableTimeUs(long periodDurationUs, long nowUnixTimeUs) {
            if (this.f != null) {
                return C.TIME_UNSET;
            }
            long firstAvailableSegmentNum = getFirstAvailableSegmentNum(periodDurationUs, nowUnixTimeUs) + getAvailableSegmentCount(periodDurationUs, nowUnixTimeUs);
            return (getSegmentTimeUs(firstAvailableSegmentNum) + getSegmentDurationUs(firstAvailableSegmentNum, periodDurationUs)) - this.i;
        }

        public abstract long getSegmentCount(long periodDurationUs);

        public final long getSegmentDurationUs(long sequenceNumber, long periodDurationUs) {
            List<SegmentTimelineElement> list = this.f;
            if (list != null) {
                return (list.get((int) (sequenceNumber - this.d)).b * 1000000) / this.b;
            }
            long segmentCount = getSegmentCount(periodDurationUs);
            return (segmentCount == -1 || sequenceNumber != (getFirstSegmentNum() + segmentCount) - 1) ? (this.e * 1000000) / this.b : periodDurationUs - getSegmentTimeUs(sequenceNumber);
        }

        public long getSegmentNum(long timeUs, long periodDurationUs) {
            long firstSegmentNum = getFirstSegmentNum();
            long segmentCount = getSegmentCount(periodDurationUs);
            if (segmentCount == 0) {
                return firstSegmentNum;
            }
            if (this.f == null) {
                long j = this.d + (timeUs / ((this.e * 1000000) / this.b));
                if (j < firstSegmentNum) {
                    return firstSegmentNum;
                }
                return segmentCount == -1 ? j : Math.min(j, (firstSegmentNum + segmentCount) - 1);
            }
            long j2 = (segmentCount + firstSegmentNum) - 1;
            long j3 = firstSegmentNum;
            while (j3 <= j2) {
                long j4 = ((j2 - j3) / 2) + j3;
                long segmentTimeUs = getSegmentTimeUs(j4);
                if (segmentTimeUs < timeUs) {
                    j3 = j4 + 1;
                } else {
                    if (segmentTimeUs <= timeUs) {
                        return j4;
                    }
                    j2 = j4 - 1;
                }
            }
            return j3 == firstSegmentNum ? j3 : j2;
        }

        public final long getSegmentTimeUs(long sequenceNumber) {
            List<SegmentTimelineElement> list = this.f;
            return Util.scaleLargeTimestamp(list != null ? list.get((int) (sequenceNumber - this.d)).a - this.c : (sequenceNumber - this.d) * this.e, 1000000L, this.b);
        }

        public abstract RangedUri getSegmentUrl(Representation representation, long index);

        public boolean isExplicit() {
            return this.f != null;
        }
    }

    public static final class SegmentList extends MultiSegmentBase {

        @Nullable
        public final List<RangedUri> j;

        public SegmentList(RangedUri initialization, long timescale, long presentationTimeOffset, long startNumber, long duration, @Nullable List<SegmentTimelineElement> segmentTimeline, long availabilityTimeOffsetUs, @Nullable List<RangedUri> mediaSegments, long timeShiftBufferDepthUs, long periodStartUnixTimeUs) {
            super(initialization, timescale, presentationTimeOffset, startNumber, duration, segmentTimeline, availabilityTimeOffsetUs, timeShiftBufferDepthUs, periodStartUnixTimeUs);
            this.j = mediaSegments;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public long getSegmentCount(long periodDurationUs) {
            return this.j.size();
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public RangedUri getSegmentUrl(Representation representation, long sequenceNumber) {
            return this.j.get((int) (sequenceNumber - this.d));
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public boolean isExplicit() {
            return true;
        }
    }

    public static final class SegmentTemplate extends MultiSegmentBase {

        @Nullable
        public final UrlTemplate j;

        @Nullable
        public final UrlTemplate k;
        public final long l;

        public SegmentTemplate(RangedUri initialization, long timescale, long presentationTimeOffset, long startNumber, long endNumber, long duration, @Nullable List<SegmentTimelineElement> segmentTimeline, long availabilityTimeOffsetUs, @Nullable UrlTemplate initializationTemplate, @Nullable UrlTemplate mediaTemplate, long timeShiftBufferDepthUs, long periodStartUnixTimeUs) {
            super(initialization, timescale, presentationTimeOffset, startNumber, duration, segmentTimeline, availabilityTimeOffsetUs, timeShiftBufferDepthUs, periodStartUnixTimeUs);
            this.j = initializationTemplate;
            this.k = mediaTemplate;
            this.l = endNumber;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase
        @Nullable
        public RangedUri getInitialization(Representation representation) {
            UrlTemplate urlTemplate = this.j;
            if (urlTemplate == null) {
                return super.getInitialization(representation);
            }
            Format format = representation.format;
            return new RangedUri(urlTemplate.buildUri(format.id, 0L, format.bitrate, 0L), 0L, -1L);
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public long getSegmentCount(long periodDurationUs) {
            List<SegmentTimelineElement> list = this.f;
            if (list != null) {
                return list.size();
            }
            long j = this.l;
            if (j != -1) {
                return (j - this.d) + 1;
            }
            if (periodDurationUs != C.TIME_UNSET) {
                return BigIntegerMath.divide(BigInteger.valueOf(periodDurationUs).multiply(BigInteger.valueOf(this.b)), BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.SegmentBase.MultiSegmentBase
        public RangedUri getSegmentUrl(Representation representation, long sequenceNumber) {
            List<SegmentTimelineElement> list = this.f;
            long j = list != null ? list.get((int) (sequenceNumber - this.d)).a : (sequenceNumber - this.d) * this.e;
            UrlTemplate urlTemplate = this.k;
            Format format = representation.format;
            return new RangedUri(urlTemplate.buildUri(format.id, sequenceNumber, format.bitrate, j), 0L, -1L);
        }
    }

    public static final class SegmentTimelineElement {
        public final long a;
        public final long b;

        public SegmentTimelineElement(long startTime, long duration) {
            this.a = startTime;
            this.b = duration;
        }

        public boolean equals(@Nullable Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || SegmentTimelineElement.class != o.getClass()) {
                return false;
            }
            SegmentTimelineElement segmentTimelineElement = (SegmentTimelineElement) o;
            return this.a == segmentTimelineElement.a && this.b == segmentTimelineElement.b;
        }

        public int hashCode() {
            return (((int) this.a) * 31) + ((int) this.b);
        }
    }

    public SegmentBase(@Nullable RangedUri initialization, long timescale, long presentationTimeOffset) {
        this.a = initialization;
        this.b = timescale;
        this.c = presentationTimeOffset;
    }

    @Nullable
    public RangedUri getInitialization(Representation representation) {
        return this.a;
    }

    public long getPresentationTimeOffsetUs() {
        return Util.scaleLargeTimestamp(this.c, 1000000L, this.b);
    }

    public static class SingleSegmentBase extends SegmentBase {
        public final long d;
        public final long e;

        public SingleSegmentBase(@Nullable RangedUri initialization, long timescale, long presentationTimeOffset, long indexStart, long indexLength) {
            super(initialization, timescale, presentationTimeOffset);
            this.d = indexStart;
            this.e = indexLength;
        }

        @Nullable
        public RangedUri getIndex() {
            long j = this.e;
            if (j <= 0) {
                return null;
            }
            return new RangedUri(null, this.d, j);
        }

        public SingleSegmentBase() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
