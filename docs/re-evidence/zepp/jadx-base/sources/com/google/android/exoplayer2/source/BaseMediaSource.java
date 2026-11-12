package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import defpackage.ay4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseMediaSource implements MediaSource {
    private final ArrayList<MediaSource.MediaSourceCaller> a = new ArrayList<>(1);
    private final HashSet<MediaSource.MediaSourceCaller> b = new HashSet<>(1);
    private final MediaSourceEventListener.EventDispatcher c = new MediaSourceEventListener.EventDispatcher();
    private final DrmSessionEventListener.EventDispatcher d = new DrmSessionEventListener.EventDispatcher();

    @Nullable
    private Looper e;

    @Nullable
    private Timeline f;

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void addDrmEventListener(Handler handler, DrmSessionEventListener eventListener) {
        Assertions.checkNotNull(handler);
        Assertions.checkNotNull(eventListener);
        this.d.addEventListener(handler, eventListener);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void addEventListener(Handler handler, MediaSourceEventListener eventListener) {
        Assertions.checkNotNull(handler);
        Assertions.checkNotNull(eventListener);
        this.c.addEventListener(handler, eventListener);
    }

    public final DrmSessionEventListener.EventDispatcher createDrmEventDispatcher(@Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        return this.d.withParameters(0, mediaPeriodId);
    }

    public final MediaSourceEventListener.EventDispatcher createEventDispatcher(@Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        return this.c.withParameters(0, mediaPeriodId, 0L);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void disable(MediaSource.MediaSourceCaller caller) {
        boolean z = !this.b.isEmpty();
        this.b.remove(caller);
        if (z && this.b.isEmpty()) {
            disableInternal();
        }
    }

    public void disableInternal() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void enable(MediaSource.MediaSourceCaller caller) {
        Assertions.checkNotNull(this.e);
        boolean zIsEmpty = this.b.isEmpty();
        this.b.add(caller);
        if (zIsEmpty) {
            enableInternal();
        }
    }

    public void enableInternal() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public /* synthetic */ Timeline getInitialTimeline() {
        return ay4.a(this);
    }

    public final boolean isEnabled() {
        return !this.b.isEmpty();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public /* synthetic */ boolean isSingleWindow() {
        return ay4.b(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void prepareSource(MediaSource.MediaSourceCaller caller, @Nullable TransferListener mediaTransferListener) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        Assertions.checkArgument(looper == null || looper == looperMyLooper);
        Timeline timeline = this.f;
        this.a.add(caller);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(caller);
            prepareSourceInternal(mediaTransferListener);
        } else if (timeline != null) {
            enable(caller);
            caller.onSourceInfoRefreshed(this, timeline);
        }
    }

    public abstract void prepareSourceInternal(@Nullable TransferListener mediaTransferListener);

    public final void refreshSourceInfo(Timeline timeline) {
        this.f = timeline;
        Iterator<MediaSource.MediaSourceCaller> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().onSourceInfoRefreshed(this, timeline);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void releaseSource(MediaSource.MediaSourceCaller caller) {
        this.a.remove(caller);
        if (!this.a.isEmpty()) {
            disable(caller);
            return;
        }
        this.e = null;
        this.f = null;
        this.b.clear();
        releaseSourceInternal();
    }

    public abstract void releaseSourceInternal();

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void removeDrmEventListener(DrmSessionEventListener eventListener) {
        this.d.removeEventListener(eventListener);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public final void removeEventListener(MediaSourceEventListener eventListener) {
        this.c.removeEventListener(eventListener);
    }

    public final DrmSessionEventListener.EventDispatcher createDrmEventDispatcher(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        return this.d.withParameters(windowIndex, mediaPeriodId);
    }

    public final MediaSourceEventListener.EventDispatcher createEventDispatcher(MediaSource.MediaPeriodId mediaPeriodId, long mediaTimeOffsetMs) {
        Assertions.checkNotNull(mediaPeriodId);
        return this.c.withParameters(0, mediaPeriodId, mediaTimeOffsetMs);
    }

    public final MediaSourceEventListener.EventDispatcher createEventDispatcher(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, long mediaTimeOffsetMs) {
        return this.c.withParameters(windowIndex, mediaPeriodId, mediaTimeOffsetMs);
    }
}
