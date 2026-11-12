package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.UnknownNull;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CompositeMediaSource<T> extends BaseMediaSource {
    private final HashMap<T, b<T>> g = new HashMap<>();

    @Nullable
    private Handler h;

    @Nullable
    private TransferListener i;

    public final class a implements MediaSourceEventListener, DrmSessionEventListener {

        @UnknownNull
        private final T a;
        private MediaSourceEventListener.EventDispatcher b;
        private DrmSessionEventListener.EventDispatcher c;

        public a(T id) {
            this.b = CompositeMediaSource.this.createEventDispatcher(null);
            this.c = CompositeMediaSource.this.createDrmEventDispatcher(null);
            this.a = id;
        }

        private boolean a(int childWindowIndex, @Nullable MediaSource.MediaPeriodId childMediaPeriodId) {
            MediaSource.MediaPeriodId mediaPeriodIdForChildMediaPeriodId;
            if (childMediaPeriodId != null) {
                mediaPeriodIdForChildMediaPeriodId = CompositeMediaSource.this.getMediaPeriodIdForChildMediaPeriodId(this.a, childMediaPeriodId);
                if (mediaPeriodIdForChildMediaPeriodId == null) {
                    return false;
                }
            } else {
                mediaPeriodIdForChildMediaPeriodId = null;
            }
            int windowIndexForChildWindowIndex = CompositeMediaSource.this.getWindowIndexForChildWindowIndex(this.a, childWindowIndex);
            MediaSourceEventListener.EventDispatcher eventDispatcher = this.b;
            if (eventDispatcher.windowIndex != windowIndexForChildWindowIndex || !Util.areEqual(eventDispatcher.mediaPeriodId, mediaPeriodIdForChildMediaPeriodId)) {
                this.b = CompositeMediaSource.this.createEventDispatcher(windowIndexForChildWindowIndex, mediaPeriodIdForChildMediaPeriodId, 0L);
            }
            DrmSessionEventListener.EventDispatcher eventDispatcher2 = this.c;
            if (eventDispatcher2.windowIndex == windowIndexForChildWindowIndex && Util.areEqual(eventDispatcher2.mediaPeriodId, mediaPeriodIdForChildMediaPeriodId)) {
                return true;
            }
            this.c = CompositeMediaSource.this.createDrmEventDispatcher(windowIndexForChildWindowIndex, mediaPeriodIdForChildMediaPeriodId);
            return true;
        }

        private MediaLoadData b(MediaLoadData mediaLoadData) {
            long mediaTimeForChildMediaTime = CompositeMediaSource.this.getMediaTimeForChildMediaTime(this.a, mediaLoadData.mediaStartTimeMs);
            long mediaTimeForChildMediaTime2 = CompositeMediaSource.this.getMediaTimeForChildMediaTime(this.a, mediaLoadData.mediaEndTimeMs);
            return (mediaTimeForChildMediaTime == mediaLoadData.mediaStartTimeMs && mediaTimeForChildMediaTime2 == mediaLoadData.mediaEndTimeMs) ? mediaLoadData : new MediaLoadData(mediaLoadData.dataType, mediaLoadData.trackType, mediaLoadData.trackFormat, mediaLoadData.trackSelectionReason, mediaLoadData.trackSelectionData, mediaTimeForChildMediaTime, mediaTimeForChildMediaTime2);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onDownstreamFormatChanged(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            if (a(windowIndex, mediaPeriodId)) {
                this.b.downstreamFormatChanged(b(mediaLoadData));
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysLoaded(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            if (a(windowIndex, mediaPeriodId)) {
                this.c.drmKeysLoaded();
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysRemoved(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            if (a(windowIndex, mediaPeriodId)) {
                this.c.drmKeysRemoved();
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmKeysRestored(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            if (a(windowIndex, mediaPeriodId)) {
                this.c.drmKeysRestored();
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public /* synthetic */ void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId) {
            com.google.android.exoplayer2.drm.h.d(this, i, mediaPeriodId);
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionAcquired(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, int state) {
            if (a(windowIndex, mediaPeriodId)) {
                this.c.drmSessionAcquired(state);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionManagerError(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception error) {
            if (a(windowIndex, mediaPeriodId)) {
                this.c.drmSessionManagerError(error);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
        public void onDrmSessionReleased(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            if (a(windowIndex, mediaPeriodId)) {
                this.c.drmSessionReleased();
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadCanceled(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventData, MediaLoadData mediaLoadData) {
            if (a(windowIndex, mediaPeriodId)) {
                this.b.loadCanceled(loadEventData, b(mediaLoadData));
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadCompleted(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventData, MediaLoadData mediaLoadData) {
            if (a(windowIndex, mediaPeriodId)) {
                this.b.loadCompleted(loadEventData, b(mediaLoadData));
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadError(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventData, MediaLoadData mediaLoadData, IOException error, boolean wasCanceled) {
            if (a(windowIndex, mediaPeriodId)) {
                this.b.loadError(loadEventData, b(mediaLoadData), error, wasCanceled);
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadStarted(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventData, MediaLoadData mediaLoadData) {
            if (a(windowIndex, mediaPeriodId)) {
                this.b.loadStarted(loadEventData, b(mediaLoadData));
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onUpstreamDiscarded(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            if (a(windowIndex, mediaPeriodId)) {
                this.b.upstreamDiscarded(b(mediaLoadData));
            }
        }
    }

    public static final class b<T> {
        public final MediaSource a;
        public final MediaSource.MediaSourceCaller b;
        public final CompositeMediaSource<T>.a c;

        public b(MediaSource mediaSource, MediaSource.MediaSourceCaller caller, CompositeMediaSource<T>.a eventListener) {
            this.a = mediaSource;
            this.b = caller;
            this.c = eventListener;
        }
    }

    public final void disableChildSource(@UnknownNull T id) {
        b bVar = (b) Assertions.checkNotNull(this.g.get(id));
        bVar.a.disable(bVar.b);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    public void disableInternal() {
        for (b<T> bVar : this.g.values()) {
            bVar.a.disable(bVar.b);
        }
    }

    public final void enableChildSource(@UnknownNull T id) {
        b bVar = (b) Assertions.checkNotNull(this.g.get(id));
        bVar.a.enable(bVar.b);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    public void enableInternal() {
        for (b<T> bVar : this.g.values()) {
            bVar.a.enable(bVar.b);
        }
    }

    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(@UnknownNull T id, MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId;
    }

    public long getMediaTimeForChildMediaTime(@UnknownNull T id, long mediaTimeMs) {
        return mediaTimeMs;
    }

    public int getWindowIndexForChildWindowIndex(@UnknownNull T id, int windowIndex) {
        return windowIndex;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    @CallSuper
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        Iterator<b<T>> it2 = this.g.values().iterator();
        while (it2.hasNext()) {
            it2.next().a.maybeThrowSourceInfoRefreshError();
        }
    }

    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: merged with bridge method [inline-methods] */
    public abstract void b(@UnknownNull T id, MediaSource mediaSource, Timeline timeline);

    public final void prepareChildSource(@UnknownNull final T id, MediaSource mediaSource) {
        Assertions.checkArgument(!this.g.containsKey(id));
        MediaSource.MediaSourceCaller mediaSourceCaller = new MediaSource.MediaSourceCaller() { // from class: dy0
            @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
            public final void onSourceInfoRefreshed(MediaSource mediaSource2, Timeline timeline) {
                this.a.b(id, mediaSource2, timeline);
            }
        };
        a aVar = new a(id);
        this.g.put(id, new b<>(mediaSource, mediaSourceCaller, aVar));
        mediaSource.addEventListener((Handler) Assertions.checkNotNull(this.h), aVar);
        mediaSource.addDrmEventListener((Handler) Assertions.checkNotNull(this.h), aVar);
        mediaSource.prepareSource(mediaSourceCaller, this.i);
        if (isEnabled()) {
            return;
        }
        mediaSource.disable(mediaSourceCaller);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    public void prepareSourceInternal(@Nullable TransferListener mediaTransferListener) {
        this.i = mediaTransferListener;
        this.h = Util.createHandlerForCurrentLooper();
    }

    public final void releaseChildSource(@UnknownNull T id) {
        b bVar = (b) Assertions.checkNotNull(this.g.remove(id));
        bVar.a.releaseSource(bVar.b);
        bVar.a.removeEventListener(bVar.c);
        bVar.a.removeDrmEventListener(bVar.c);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    @CallSuper
    public void releaseSourceInternal() {
        for (b<T> bVar : this.g.values()) {
            bVar.a.releaseSource(bVar.b);
            bVar.a.removeEventListener(bVar.c);
            bVar.a.removeDrmEventListener(bVar.c);
        }
        this.g.clear();
    }
}
