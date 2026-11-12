package com.google.android.exoplayer2.drm;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public interface DrmSessionEventListener {

    public static class EventDispatcher {
        private final CopyOnWriteArrayList<a> a;

        @Nullable
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        public static final class a {
            public Handler a;
            public DrmSessionEventListener b;

            public a(Handler handler, DrmSessionEventListener listener) {
                this.a = handler;
                this.b = listener;
            }
        }

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysLoaded(this.windowIndex, this.mediaPeriodId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysRemoved(this.windowIndex, this.mediaPeriodId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmKeysRestored(this.windowIndex, this.mediaPeriodId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(DrmSessionEventListener drmSessionEventListener, int i) {
            drmSessionEventListener.onDrmSessionAcquired(this.windowIndex, this.mediaPeriodId);
            drmSessionEventListener.onDrmSessionAcquired(this.windowIndex, this.mediaPeriodId, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(DrmSessionEventListener drmSessionEventListener, Exception exc) {
            drmSessionEventListener.onDrmSessionManagerError(this.windowIndex, this.mediaPeriodId, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(DrmSessionEventListener drmSessionEventListener) {
            drmSessionEventListener.onDrmSessionReleased(this.windowIndex, this.mediaPeriodId);
        }

        public void addEventListener(Handler handler, DrmSessionEventListener eventListener) {
            Assertions.checkNotNull(handler);
            Assertions.checkNotNull(eventListener);
            this.a.add(new a(handler, eventListener));
        }

        public void drmKeysLoaded() {
            for (a aVar : this.a) {
                final DrmSessionEventListener drmSessionEventListener = aVar.b;
                Util.postOrRun(aVar.a, new Runnable() { // from class: fd1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.g(drmSessionEventListener);
                    }
                });
            }
        }

        public void drmKeysRemoved() {
            for (a aVar : this.a) {
                final DrmSessionEventListener drmSessionEventListener = aVar.b;
                Util.postOrRun(aVar.a, new Runnable() { // from class: ed1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.h(drmSessionEventListener);
                    }
                });
            }
        }

        public void drmKeysRestored() {
            for (a aVar : this.a) {
                final DrmSessionEventListener drmSessionEventListener = aVar.b;
                Util.postOrRun(aVar.a, new Runnable() { // from class: gd1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.i(drmSessionEventListener);
                    }
                });
            }
        }

        public void drmSessionAcquired(final int state) {
            for (a aVar : this.a) {
                final DrmSessionEventListener drmSessionEventListener = aVar.b;
                Util.postOrRun(aVar.a, new Runnable() { // from class: hd1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.j(drmSessionEventListener, state);
                    }
                });
            }
        }

        public void drmSessionManagerError(final Exception error) {
            for (a aVar : this.a) {
                final DrmSessionEventListener drmSessionEventListener = aVar.b;
                Util.postOrRun(aVar.a, new Runnable() { // from class: id1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.k(drmSessionEventListener, error);
                    }
                });
            }
        }

        public void drmSessionReleased() {
            for (a aVar : this.a) {
                final DrmSessionEventListener drmSessionEventListener = aVar.b;
                Util.postOrRun(aVar.a, new Runnable() { // from class: dd1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.l(drmSessionEventListener);
                    }
                });
            }
        }

        public void removeEventListener(DrmSessionEventListener eventListener) {
            for (a aVar : this.a) {
                if (aVar.b == eventListener) {
                    this.a.remove(aVar);
                }
            }
        }

        @CheckResult
        public EventDispatcher withParameters(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            return new EventDispatcher(this.a, windowIndex, mediaPeriodId);
        }

        private EventDispatcher(CopyOnWriteArrayList<a> listenerAndHandlers, int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
            this.a = listenerAndHandlers;
            this.windowIndex = windowIndex;
            this.mediaPeriodId = mediaPeriodId;
        }
    }

    void onDrmKeysLoaded(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId);

    void onDrmKeysRemoved(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId);

    void onDrmKeysRestored(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId);

    @Deprecated
    void onDrmSessionAcquired(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId);

    void onDrmSessionAcquired(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, int state);

    void onDrmSessionManagerError(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Exception error);

    void onDrmSessionReleased(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId);
}
