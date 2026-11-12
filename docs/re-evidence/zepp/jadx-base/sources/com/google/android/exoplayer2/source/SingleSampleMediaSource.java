package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleSampleMediaSource extends BaseMediaSource {
    private final DataSpec g;
    private final DataSource.Factory h;
    private final Format i;
    private final long j;
    private final LoadErrorHandlingPolicy k;
    private final boolean l;
    private final Timeline m;
    private final MediaItem n;

    @Nullable
    private TransferListener o;

    public static final class Factory {
        private final DataSource.Factory a;
        private LoadErrorHandlingPolicy b = new DefaultLoadErrorHandlingPolicy();
        private boolean c = true;

        @Nullable
        private Object d;

        @Nullable
        private String e;

        public Factory(DataSource.Factory dataSourceFactory) {
            this.a = (DataSource.Factory) Assertions.checkNotNull(dataSourceFactory);
        }

        public SingleSampleMediaSource createMediaSource(MediaItem.Subtitle subtitle, long durationUs) {
            return new SingleSampleMediaSource(this.e, subtitle, this.a, durationUs, this.b, this.c, this.d);
        }

        public Factory setLoadErrorHandlingPolicy(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            if (loadErrorHandlingPolicy == null) {
                loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            }
            this.b = loadErrorHandlingPolicy;
            return this;
        }

        public Factory setTag(@Nullable Object tag) {
            this.d = tag;
            return this;
        }

        public Factory setTrackId(@Nullable String trackId) {
            this.e = trackId;
            return this;
        }

        public Factory setTreatLoadErrorsAsEndOfStream(boolean treatLoadErrorsAsEndOfStream) {
            this.c = treatLoadErrorsAsEndOfStream;
            return this;
        }

        @Deprecated
        public SingleSampleMediaSource createMediaSource(Uri uri, Format format, long durationUs) {
            String str = format.id;
            if (str == null) {
                str = this.e;
            }
            return new SingleSampleMediaSource(str, new MediaItem.Subtitle(uri, (String) Assertions.checkNotNull(format.sampleMimeType), format.language, format.selectionFlags), this.a, durationUs, this.b, this.c, this.d);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
        return new k(this.g, this.h, this.o, this.i, this.j, this.k, createEventDispatcher(id), this.l);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.n;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener mediaTransferListener) {
        this.o = mediaTransferListener;
        refreshSourceInfo(this.m);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((k) mediaPeriod).e();
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
    }

    private SingleSampleMediaSource(@Nullable String trackId, MediaItem.Subtitle subtitle, DataSource.Factory dataSourceFactory, long durationUs, LoadErrorHandlingPolicy loadErrorHandlingPolicy, boolean treatLoadErrorsAsEndOfStream, @Nullable Object tag) {
        this.h = dataSourceFactory;
        this.j = durationUs;
        this.k = loadErrorHandlingPolicy;
        this.l = treatLoadErrorsAsEndOfStream;
        MediaItem mediaItemBuild = new MediaItem.Builder().setUri(Uri.EMPTY).setMediaId(subtitle.uri.toString()).setSubtitles(Collections.singletonList(subtitle)).setTag(tag).build();
        this.n = mediaItemBuild;
        this.i = new Format.Builder().setId(trackId).setSampleMimeType(subtitle.mimeType).setLanguage(subtitle.language).setSelectionFlags(subtitle.selectionFlags).setRoleFlags(subtitle.roleFlags).setLabel(subtitle.label).build();
        this.g = new DataSpec.Builder().setUri(subtitle.uri).setFlags(1).build();
        this.m = new SinglePeriodTimeline(durationUs, true, false, false, (Object) null, mediaItemBuild);
    }
}
