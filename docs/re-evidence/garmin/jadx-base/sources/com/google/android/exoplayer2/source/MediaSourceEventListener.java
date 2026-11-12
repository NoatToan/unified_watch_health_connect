package com.google.android.exoplayer2.source;

import android.os.Handler;
import androidx.media3.exoplayer.n0;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes14.dex */
public interface MediaSourceEventListener {
    default void onDownstreamFormatChanged(int i14, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }

    default void onLoadCanceled(int i14, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onLoadCompleted(int i14, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onLoadError(int i14, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z14) {
    }

    default void onLoadStarted(int i14, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onUpstreamDiscarded(int i14, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }

    public static class EventDispatcher {
        private final CopyOnWriteArrayList<ListenerAndHandler> listenerAndHandlers;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        private final long mediaTimeOffsetMs;
        public final int windowIndex;

        public static final class ListenerAndHandler {
            public Handler handler;
            public MediaSourceEventListener listener;

            public ListenerAndHandler(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
                this.handler = handler;
                this.listener = mediaSourceEventListener;
            }
        }

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        private long adjustMediaTime(long j8) {
            long jUsToMs = Util.usToMs(j8);
            return jUsToMs == C.TIME_UNSET ? C.TIME_UNSET : this.mediaTimeOffsetMs + jUsToMs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$downstreamFormatChanged$5(MediaSourceEventListener mediaSourceEventListener, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onDownstreamFormatChanged(this.windowIndex, this.mediaPeriodId, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadCanceled$2(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onLoadCanceled(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadCompleted$1(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onLoadCompleted(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadError$3(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z14) {
            mediaSourceEventListener.onLoadError(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData, iOException, z14);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadStarted$0(MediaSourceEventListener mediaSourceEventListener, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onLoadStarted(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$upstreamDiscarded$4(MediaSourceEventListener mediaSourceEventListener, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            mediaSourceEventListener.onUpstreamDiscarded(this.windowIndex, mediaPeriodId, mediaLoadData);
        }

        public void addEventListener(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
            Assertions.checkNotNull(handler);
            Assertions.checkNotNull(mediaSourceEventListener);
            this.listenerAndHandlers.add(new ListenerAndHandler(handler, mediaSourceEventListener));
        }

        public void downstreamFormatChanged(MediaLoadData mediaLoadData) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                Util.postOrRun(listenerAndHandler.handler, new a8.d(this, 19, listenerAndHandler.listener, mediaLoadData));
            }
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                Util.postOrRun(listenerAndHandler.handler, new g(this, listenerAndHandler.listener, loadEventInfo, mediaLoadData, 1));
            }
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                Util.postOrRun(listenerAndHandler.handler, new g(this, listenerAndHandler.listener, loadEventInfo, mediaLoadData, 0));
            }
        }

        public void loadError(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z14) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                Util.postOrRun(listenerAndHandler.handler, new n0(this, listenerAndHandler.listener, loadEventInfo, mediaLoadData, iOException, z14, 1));
            }
        }

        public void loadStarted(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                Util.postOrRun(listenerAndHandler.handler, new g(this, listenerAndHandler.listener, loadEventInfo, mediaLoadData, 2));
            }
        }

        public void removeEventListener(MediaSourceEventListener mediaSourceEventListener) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                if (listenerAndHandler.listener == mediaSourceEventListener) {
                    this.listenerAndHandlers.remove(listenerAndHandler);
                }
            }
        }

        public void upstreamDiscarded(MediaLoadData mediaLoadData) {
            MediaSource.MediaPeriodId mediaPeriodId = (MediaSource.MediaPeriodId) Assertions.checkNotNull(this.mediaPeriodId);
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                Util.postOrRun(listenerAndHandler.handler, new at0.c(this, listenerAndHandler.listener, mediaPeriodId, mediaLoadData, 3));
            }
        }

        public EventDispatcher withParameters(int i14, MediaSource.MediaPeriodId mediaPeriodId, long j8) {
            return new EventDispatcher(this.listenerAndHandlers, i14, mediaPeriodId, j8);
        }

        private EventDispatcher(CopyOnWriteArrayList<ListenerAndHandler> copyOnWriteArrayList, int i14, MediaSource.MediaPeriodId mediaPeriodId, long j8) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i14;
            this.mediaPeriodId = mediaPeriodId;
            this.mediaTimeOffsetMs = j8;
        }

        public void downstreamFormatChanged(int i14, Format format, int i15, Object obj, long j8) {
            downstreamFormatChanged(new MediaLoadData(1, i14, format, i15, obj, adjustMediaTime(j8), C.TIME_UNSET));
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, int i14, int i15, Format format, int i16, Object obj, long j8, long j14) {
            loadCanceled(loadEventInfo, new MediaLoadData(i14, i15, format, i16, obj, adjustMediaTime(j8), adjustMediaTime(j14)));
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, int i14, int i15, Format format, int i16, Object obj, long j8, long j14) {
            loadCompleted(loadEventInfo, new MediaLoadData(i14, i15, format, i16, obj, adjustMediaTime(j8), adjustMediaTime(j14)));
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int i14, int i15, Format format, int i16, Object obj, long j8, long j14) {
            loadStarted(loadEventInfo, new MediaLoadData(i14, i15, format, i16, obj, adjustMediaTime(j8), adjustMediaTime(j14)));
        }

        public void loadError(LoadEventInfo loadEventInfo, int i14, int i15, Format format, int i16, Object obj, long j8, long j14, IOException iOException, boolean z14) {
            loadError(loadEventInfo, new MediaLoadData(i14, i15, format, i16, obj, adjustMediaTime(j8), adjustMediaTime(j14)), iOException, z14);
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, int i14) {
            loadCanceled(loadEventInfo, i14, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, int i14) {
            loadCompleted(loadEventInfo, i14, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int i14) {
            loadStarted(loadEventInfo, i14, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }

        public void loadError(LoadEventInfo loadEventInfo, int i14, IOException iOException, boolean z14) {
            loadError(loadEventInfo, i14, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, iOException, z14);
        }

        public void upstreamDiscarded(int i14, long j8, long j14) {
            upstreamDiscarded(new MediaLoadData(1, i14, null, 3, null, adjustMediaTime(j8), adjustMediaTime(j14)));
        }
    }
}
