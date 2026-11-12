package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.ForwardingTimeline;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.SinglePeriodTimeline;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class RtspMediaSource extends BaseMediaSource {
    public static final long DEFAULT_TIMEOUT_MS = 8000;
    private final MediaItem g;
    private final RtpDataChannel.Factory h;
    private final String i;
    private final Uri j;
    private boolean l;
    private boolean m;
    private long k = C.TIME_UNSET;
    private boolean n = true;

    public static final class Factory implements MediaSourceFactory {
        private long a = 8000;
        private String b = ExoPlayerLibraryInfo.VERSION_SLASHY;
        private boolean c;

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public /* synthetic */ MediaSource createMediaSource(Uri uri) {
            return com.google.android.exoplayer2.source.c.a(this, uri);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public int[] getSupportedTypes() {
            return new int[]{3};
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        public Factory setDrmHttpDataSourceFactory(@Nullable HttpDataSource.Factory drmHttpDataSourceFactory) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        public Factory setDrmSessionManager(@Nullable DrmSessionManager drmSessionManager) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setDrmSessionManagerProvider(@Nullable DrmSessionManagerProvider drmSessionManager) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        public Factory setDrmUserAgent(@Nullable String userAgent) {
            return this;
        }

        public Factory setForceUseRtpTcp(boolean forceUseRtpTcp) {
            this.c = forceUseRtpTcp;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setLoadErrorHandlingPolicy(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public /* synthetic */ MediaSourceFactory setStreamKeys(List list) {
            return com.google.android.exoplayer2.source.c.b(this, list);
        }

        public Factory setTimeoutMs(@IntRange(from = 1) long timeoutMs) {
            Assertions.checkArgument(timeoutMs > 0);
            this.a = timeoutMs;
            return this;
        }

        public Factory setUserAgent(String userAgent) {
            this.b = userAgent;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public RtspMediaSource createMediaSource(MediaItem mediaItem) {
            Assertions.checkNotNull(mediaItem.playbackProperties);
            return new RtspMediaSource(mediaItem, this.c ? new y(this.a) : new a0(this.a), this.b);
        }
    }

    public static final class RtspPlaybackException extends IOException {
        public RtspPlaybackException(String message) {
            super(message);
        }

        public RtspPlaybackException(Throwable e) {
            super(e);
        }

        public RtspPlaybackException(String message, Throwable e) {
            super(message, e);
        }
    }

    public class a extends ForwardingTimeline {
        public a(final RtspMediaSource this$0, Timeline timeline) {
            super(timeline);
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int periodIndex, Timeline.Period period, boolean setIds) {
            super.getPeriod(periodIndex, period, setIds);
            period.isPlaceholder = true;
            return period;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int windowIndex, Timeline.Window window, long defaultPositionProjectionUs) {
            super.getWindow(windowIndex, window, defaultPositionProjectionUs);
            window.isPlaceholder = true;
            return window;
        }
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.rtsp");
    }

    @VisibleForTesting
    public RtspMediaSource(MediaItem mediaItem, RtpDataChannel.Factory rtpDataChannelFactory, String userAgent) {
        this.g = mediaItem;
        this.h = rtpDataChannelFactory;
        this.i = userAgent;
        this.j = ((MediaItem.PlaybackProperties) Assertions.checkNotNull(mediaItem.playbackProperties)).uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(t tVar) {
        this.k = C.msToUs(tVar.a());
        this.l = !tVar.c();
        this.m = tVar.c();
        this.n = false;
        c();
    }

    private void c() {
        Timeline singlePeriodTimeline = new SinglePeriodTimeline(this.k, this.l, false, this.m, (Object) null, this.g);
        if (this.n) {
            singlePeriodTimeline = new a(this, singlePeriodTimeline);
        }
        refreshSourceInfo(singlePeriodTimeline);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
        return new h(allocator, this.h, this.j, new h.c() { // from class: com.google.android.exoplayer2.source.rtsp.l
            @Override // com.google.android.exoplayer2.source.rtsp.h.c
            public final void a(t tVar) {
                this.a.b(tVar);
            }
        }, this.i);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.g;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener mediaTransferListener) {
        c();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((h) mediaPeriod).E();
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
    }
}
