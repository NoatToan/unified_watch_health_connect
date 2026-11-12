package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Representation {
    public static final long REVISION_ID_DEFAULT = -1;
    private final RangedUri a;
    public final ImmutableList<BaseUrl> baseUrls;
    public final Format format;
    public final List<Descriptor> inbandEventStreams;
    public final long presentationTimeOffsetUs;
    public final long revisionId;

    public static class MultiSegmentRepresentation extends Representation implements DashSegmentIndex {

        @VisibleForTesting
        public final SegmentBase.MultiSegmentBase b;

        public MultiSegmentRepresentation(long revisionId, Format format, List<BaseUrl> baseUrls, SegmentBase.MultiSegmentBase segmentBase, @Nullable List<Descriptor> inbandEventStreams) {
            super(revisionId, format, baseUrls, segmentBase, inbandEventStreams);
            this.b = segmentBase;
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getAvailableSegmentCount(long periodDurationUs, long nowUnixTimeUs) {
            return this.b.getAvailableSegmentCount(periodDurationUs, nowUnixTimeUs);
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        @Nullable
        public String getCacheKey() {
            return null;
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getDurationUs(long segmentNum, long periodDurationUs) {
            return this.b.getSegmentDurationUs(segmentNum, periodDurationUs);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getFirstAvailableSegmentNum(long periodDurationUs, long nowUnixTimeUs) {
            return this.b.getFirstAvailableSegmentNum(periodDurationUs, nowUnixTimeUs);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getFirstSegmentNum() {
            return this.b.getFirstSegmentNum();
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        public DashSegmentIndex getIndex() {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        @Nullable
        public RangedUri getIndexUri() {
            return null;
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getNextSegmentAvailableTimeUs(long periodDurationUs, long nowUnixTimeUs) {
            return this.b.getNextSegmentAvailableTimeUs(periodDurationUs, nowUnixTimeUs);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getSegmentCount(long periodDurationUs) {
            return this.b.getSegmentCount(periodDurationUs);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getSegmentNum(long timeUs, long periodDurationUs) {
            return this.b.getSegmentNum(timeUs, periodDurationUs);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public RangedUri getSegmentUrl(long segmentNum) {
            return this.b.getSegmentUrl(this, segmentNum);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getTimeUs(long segmentNum) {
            return this.b.getSegmentTimeUs(segmentNum);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public boolean isExplicit() {
            return this.b.isExplicit();
        }
    }

    public static class SingleSegmentRepresentation extends Representation {

        @Nullable
        private final String b;

        @Nullable
        private final RangedUri c;
        public final long contentLength;

        @Nullable
        private final com.google.android.exoplayer2.source.dash.manifest.a d;
        public final Uri uri;

        public SingleSegmentRepresentation(long revisionId, Format format, List<BaseUrl> baseUrls, SegmentBase.SingleSegmentBase segmentBase, @Nullable List<Descriptor> inbandEventStreams, @Nullable String cacheKey, long contentLength) {
            super(revisionId, format, baseUrls, segmentBase, inbandEventStreams);
            this.uri = Uri.parse(baseUrls.get(0).url);
            RangedUri index = segmentBase.getIndex();
            this.c = index;
            this.b = cacheKey;
            this.contentLength = contentLength;
            this.d = index != null ? null : new com.google.android.exoplayer2.source.dash.manifest.a(new RangedUri(null, 0L, contentLength));
        }

        public static SingleSegmentRepresentation newInstance(long revisionId, Format format, String uri, long initializationStart, long initializationEnd, long indexStart, long indexEnd, List<Descriptor> inbandEventStreams, @Nullable String cacheKey, long contentLength) {
            return new SingleSegmentRepresentation(revisionId, format, ImmutableList.of(new BaseUrl(uri)), new SegmentBase.SingleSegmentBase(new RangedUri(null, initializationStart, (initializationEnd - initializationStart) + 1), 1L, 0L, indexStart, (indexEnd - indexStart) + 1), inbandEventStreams, cacheKey, contentLength);
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        @Nullable
        public String getCacheKey() {
            return this.b;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        @Nullable
        public DashSegmentIndex getIndex() {
            return this.d;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        @Nullable
        public RangedUri getIndexUri() {
            return this.c;
        }
    }

    public static Representation newInstance(long revisionId, Format format, List<BaseUrl> baseUrls, SegmentBase segmentBase) {
        return newInstance(revisionId, format, baseUrls, segmentBase, null);
    }

    @Nullable
    public abstract String getCacheKey();

    @Nullable
    public abstract DashSegmentIndex getIndex();

    @Nullable
    public abstract RangedUri getIndexUri();

    @Nullable
    public RangedUri getInitializationUri() {
        return this.a;
    }

    private Representation(long revisionId, Format format, List<BaseUrl> baseUrls, SegmentBase segmentBase, @Nullable List<Descriptor> inbandEventStreams) {
        Assertions.checkArgument(!baseUrls.isEmpty());
        this.revisionId = revisionId;
        this.format = format;
        this.baseUrls = ImmutableList.copyOf((Collection) baseUrls);
        this.inbandEventStreams = inbandEventStreams == null ? Collections.emptyList() : Collections.unmodifiableList(inbandEventStreams);
        this.a = segmentBase.getInitialization(this);
        this.presentationTimeOffsetUs = segmentBase.getPresentationTimeOffsetUs();
    }

    public static Representation newInstance(long revisionId, Format format, List<BaseUrl> baseUrls, SegmentBase segmentBase, @Nullable List<Descriptor> inbandEventStreams) {
        return newInstance(revisionId, format, baseUrls, segmentBase, inbandEventStreams, null);
    }

    public static Representation newInstance(long revisionId, Format format, List<BaseUrl> baseUrls, SegmentBase segmentBase, @Nullable List<Descriptor> inbandEventStreams, @Nullable String cacheKey) {
        if (segmentBase instanceof SegmentBase.SingleSegmentBase) {
            return new SingleSegmentRepresentation(revisionId, format, baseUrls, (SegmentBase.SingleSegmentBase) segmentBase, inbandEventStreams, cacheKey, -1L);
        }
        if (segmentBase instanceof SegmentBase.MultiSegmentBase) {
            return new MultiSegmentRepresentation(revisionId, format, baseUrls, (SegmentBase.MultiSegmentBase) segmentBase, inbandEventStreams);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }
}
