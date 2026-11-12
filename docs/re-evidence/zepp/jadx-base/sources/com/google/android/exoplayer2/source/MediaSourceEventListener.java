package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public interface MediaSourceEventListener {

    public static class EventDispatcher {
        private final CopyOnWriteArrayList<a> a;
        private final long b;

        @Nullable
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        public static final class a {
            public Handler a;
            public MediaSourceEventListener b;

            public a(Handler handler, MediaSourceEventListener listener) {
                this.a = handler;
                this.b = listener;
            }
        }

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        private long g(long mediaTimeUs) {
            long jUsToMs = C.usToMs(mediaTimeUs);
            return jUsToMs == C.TIME_UNSET ? C.TIME_UNSET : this.b + jUsToMs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(MediaSourceEventListener mediaSourceEventListener, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onDownstreamFormatChanged(this.windowIndex, this.mediaPeriodId, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onLoadCanceled(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onLoadCompleted(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            mediaSourceEventListener.onLoadError(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData, iOException, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onLoadStarted(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(MediaSourceEventListener mediaSourceEventListener, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onUpstreamDiscarded(this.windowIndex, mediaPeriodId, mediaLoadData);
        }

        public void addEventListener(Handler handler, MediaSourceEventListener eventListener) {
            Assertions.checkNotNull(handler);
            Assertions.checkNotNull(eventListener);
            this.a.add(new a(handler, eventListener));
        }

        public void downstreamFormatChanged(int trackType, @Nullable Format trackFormat, int trackSelectionReason, @Nullable Object trackSelectionData, long mediaTimeUs) {
            downstreamFormatChanged(new MediaLoadData(1, trackType, trackFormat, trackSelectionReason, trackSelectionData, g(mediaTimeUs), C.TIME_UNSET));
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, int dataType) {
            loadCanceled(loadEventInfo, dataType, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, int dataType) {
            loadCompleted(loadEventInfo, dataType, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }

        public void loadError(LoadEventInfo loadEventInfo, int dataType, IOException error, boolean wasCanceled) {
            loadError(loadEventInfo, dataType, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, error, wasCanceled);
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int dataType) {
            loadStarted(loadEventInfo, dataType, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }

        public void removeEventListener(MediaSourceEventListener eventListener) {
            for (a aVar : this.a) {
                if (aVar.b == eventListener) {
                    this.a.remove(aVar);
                }
            }
        }

        public void upstreamDiscarded(int trackType, long mediaStartTimeUs, long mediaEndTimeUs) {
            upstreamDiscarded(new MediaLoadData(1, trackType, null, 3, null, g(mediaStartTimeUs), g(mediaEndTimeUs)));
        }

        @CheckResult
        public EventDispatcher withParameters(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long mediaTimeOffsetMs) {
            return new EventDispatcher(this.a, windowIndex, mediaPeriodId, mediaTimeOffsetMs);
        }

        private EventDispatcher(CopyOnWriteArrayList<a> listenerAndHandlers, int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long mediaTimeOffsetMs) {
            this.a = listenerAndHandlers;
            this.windowIndex = windowIndex;
            this.mediaPeriodId = mediaPeriodId;
            this.b = mediaTimeOffsetMs;
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, int dataType, int trackType, @Nullable Format trackFormat, int trackSelectionReason, @Nullable Object trackSelectionData, long mediaStartTimeUs, long mediaEndTimeUs) {
            loadCanceled(loadEventInfo, new MediaLoadData(dataType, trackType, trackFormat, trackSelectionReason, trackSelectionData, g(mediaStartTimeUs), g(mediaEndTimeUs)));
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, int dataType, int trackType, @Nullable Format trackFormat, int trackSelectionReason, @Nullable Object trackSelectionData, long mediaStartTimeUs, long mediaEndTimeUs) {
            loadCompleted(loadEventInfo, new MediaLoadData(dataType, trackType, trackFormat, trackSelectionReason, trackSelectionData, g(mediaStartTimeUs), g(mediaEndTimeUs)));
        }

        public void loadError(LoadEventInfo loadEventInfo, int dataType, int trackType, @Nullable Format trackFormat, int trackSelectionReason, @Nullable Object trackSelectionData, long mediaStartTimeUs, long mediaEndTimeUs, IOException error, boolean wasCanceled) {
            loadError(loadEventInfo, new MediaLoadData(dataType, trackType, trackFormat, trackSelectionReason, trackSelectionData, g(mediaStartTimeUs), g(mediaEndTimeUs)), error, wasCanceled);
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int dataType, int trackType, @Nullable Format trackFormat, int trackSelectionReason, @Nullable Object trackSelectionData, long mediaStartTimeUs, long mediaEndTimeUs) {
            loadStarted(loadEventInfo, new MediaLoadData(dataType, trackType, trackFormat, trackSelectionReason, trackSelectionData, g(mediaStartTimeUs), g(mediaEndTimeUs)));
        }

        public void downstreamFormatChanged(final MediaLoadData mediaLoadData) {
            for (a aVar : this.a) {
                final MediaSourceEventListener mediaSourceEventListener = aVar.b;
                Util.postOrRun(aVar.a, new Runnable() { // from class: fy4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.h(mediaSourceEventListener, mediaLoadData);
                    }
                });
            }
        }

        public void upstreamDiscarded(final MediaLoadData mediaLoadData) {
            final MediaSource.MediaPeriodId mediaPeriodId = (MediaSource.MediaPeriodId) Assertions.checkNotNull(this.mediaPeriodId);
            for (a aVar : this.a) {
                final MediaSourceEventListener mediaSourceEventListener = aVar.b;
                Util.postOrRun(aVar.a, new Runnable() { // from class: gy4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.m(mediaSourceEventListener, mediaPeriodId, mediaLoadData);
                    }
                });
            }
        }

        public void loadCanceled(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            for (a aVar : this.a) {
                final MediaSourceEventListener mediaSourceEventListener = aVar.b;
                Util.postOrRun(aVar.a, new Runnable() { // from class: dy4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.i(mediaSourceEventListener, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        public void loadCompleted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            for (a aVar : this.a) {
                final MediaSourceEventListener mediaSourceEventListener = aVar.b;
                Util.postOrRun(aVar.a, new Runnable() { // from class: by4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.j(mediaSourceEventListener, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }

        public void loadError(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException error, final boolean wasCanceled) {
            for (a aVar : this.a) {
                final MediaSourceEventListener mediaSourceEventListener = aVar.b;
                Util.postOrRun(aVar.a, new Runnable() { // from class: ey4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.k(mediaSourceEventListener, loadEventInfo, mediaLoadData, error, wasCanceled);
                    }
                });
            }
        }

        public void loadStarted(final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
            for (a aVar : this.a) {
                final MediaSourceEventListener mediaSourceEventListener = aVar.b;
                Util.postOrRun(aVar.a, new Runnable() { // from class: cy4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.l(mediaSourceEventListener, loadEventInfo, mediaLoadData);
                    }
                });
            }
        }
    }

    void onDownstreamFormatChanged(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData);

    void onLoadCanceled(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onLoadCompleted(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onLoadError(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException error, boolean wasCanceled);

    void onLoadStarted(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData);

    void onUpstreamDiscarded(int windowIndex, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData);
}
