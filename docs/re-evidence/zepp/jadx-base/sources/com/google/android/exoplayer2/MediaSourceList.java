package com.google.android.exoplayer2;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MaskingMediaPeriod;
import com.google.android.exoplayer2.source.MaskingMediaSource;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class MediaSourceList {
    private static final String l = "MediaSourceList";
    private final MediaSourceListInfoRefreshListener d;
    private final MediaSourceEventListener.EventDispatcher e;
    private final DrmSessionEventListener.EventDispatcher f;
    private final HashMap<c, b> g;
    private final Set<c> h;
    private boolean j;

    @Nullable
    private TransferListener k;
    private ShuffleOrder i = new ShuffleOrder.DefaultShuffleOrder(0);
    private final IdentityHashMap<MediaPeriod, c> b = new IdentityHashMap<>();
    private final Map<Object, c> c = new HashMap();
    private final List<c> a = new ArrayList();

    public interface MediaSourceListInfoRefreshListener {
        void onPlaylistUpdateRequested();
    }

    public final class a implements MediaSourceEventListener, DrmSessionEventListener {
        private final c a;
        private MediaSourceEventListener.EventDispatcher b;
        private DrmSessionEventListener.EventDispatcher c;

        public a(c id) {
            this.b = MediaSourceList.this.e;
            this.c = MediaSourceList.this.f;
            this.a = id;
        }

        private boolean a(int childWindowIndex, @Nullable MediaSource.MediaPeriodId childMediaPeriodId) {
            MediaSource.MediaPeriodId mediaPeriodIdO;
            if (childMediaPeriodId != null) {
                mediaPeriodIdO = MediaSourceList.o(this.a, childMediaPeriodId);
                if (mediaPeriodIdO == null) {
                    return false;
                }
            } else {
                mediaPeriodIdO = null;
            }
            int iS = MediaSourceList.s(this.a, childWindowIndex);
            MediaSourceEventListener.EventDispatcher eventDispatcher = this.b;
            if (eventDispatcher.windowIndex != iS || !Util.areEqual(eventDispatcher.mediaPeriodId, mediaPeriodIdO)) {
                this.b = MediaSourceList.this.e.withParameters(iS, mediaPeriodIdO, 0L);
            }
            DrmSessionEventListener.EventDispatcher eventDispatcher2 = this.c;
            if (eventDispatcher2.windowIndex == iS && Util.areEqual(eventDispatcher2.mediaPeriodId, mediaPeriodIdO)) {
                return true;
            }
            this.c = MediaSourceList.this.f.withParameters(iS, mediaPeriodIdO);
            return true;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onDownstreamFormatChanged(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            if (a(windowIndex, mediaPeriodId)) {
                this.b.downstreamFormatChanged(mediaLoadData);
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
                this.b.loadCanceled(loadEventData, mediaLoadData);
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadCompleted(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventData, MediaLoadData mediaLoadData) {
            if (a(windowIndex, mediaPeriodId)) {
                this.b.loadCompleted(loadEventData, mediaLoadData);
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadError(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventData, MediaLoadData mediaLoadData, IOException error, boolean wasCanceled) {
            if (a(windowIndex, mediaPeriodId)) {
                this.b.loadError(loadEventData, mediaLoadData, error, wasCanceled);
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onLoadStarted(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventData, MediaLoadData mediaLoadData) {
            if (a(windowIndex, mediaPeriodId)) {
                this.b.loadStarted(loadEventData, mediaLoadData);
            }
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
        public void onUpstreamDiscarded(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
            if (a(windowIndex, mediaPeriodId)) {
                this.b.upstreamDiscarded(mediaLoadData);
            }
        }
    }

    public static final class b {
        public final MediaSource a;
        public final MediaSource.MediaSourceCaller b;
        public final a c;

        public b(MediaSource mediaSource, MediaSource.MediaSourceCaller caller, a eventListener) {
            this.a = mediaSource;
            this.b = caller;
            this.c = eventListener;
        }
    }

    public static final class c implements j0 {
        public final MaskingMediaSource a;
        public int d;
        public boolean e;
        public final List<MediaSource.MediaPeriodId> c = new ArrayList();
        public final Object b = new Object();

        public c(MediaSource mediaSource, boolean useLazyPreparation) {
            this.a = new MaskingMediaSource(mediaSource, useLazyPreparation);
        }

        @Override // com.google.android.exoplayer2.j0
        public Timeline a() {
            return this.a.getTimeline();
        }

        public void b(int firstWindowIndexInChild) {
            this.d = firstWindowIndexInChild;
            this.e = false;
            this.c.clear();
        }

        @Override // com.google.android.exoplayer2.j0
        public Object getUid() {
            return this.b;
        }
    }

    public MediaSourceList(MediaSourceListInfoRefreshListener listener, @Nullable AnalyticsCollector analyticsCollector, Handler analyticsCollectorHandler) {
        this.d = listener;
        MediaSourceEventListener.EventDispatcher eventDispatcher = new MediaSourceEventListener.EventDispatcher();
        this.e = eventDispatcher;
        DrmSessionEventListener.EventDispatcher eventDispatcher2 = new DrmSessionEventListener.EventDispatcher();
        this.f = eventDispatcher2;
        this.g = new HashMap<>();
        this.h = new HashSet();
        if (analyticsCollector != null) {
            eventDispatcher.addEventListener(analyticsCollectorHandler, analyticsCollector);
            eventDispatcher2.addEventListener(analyticsCollectorHandler, analyticsCollector);
        }
    }

    private void D(int fromIndex, int toIndex) {
        for (int i = toIndex - 1; i >= fromIndex; i--) {
            c cVarRemove = this.a.remove(i);
            this.c.remove(cVarRemove.b);
            h(i, -cVarRemove.a.getTimeline().getWindowCount());
            cVarRemove.e = true;
            if (this.j) {
                v(cVarRemove);
            }
        }
    }

    private void h(int startIndex, int windowOffsetUpdate) {
        while (startIndex < this.a.size()) {
            this.a.get(startIndex).d += windowOffsetUpdate;
            startIndex++;
        }
    }

    private void k(c holder) {
        b bVar = this.g.get(holder);
        if (bVar != null) {
            bVar.a.disable(bVar.b);
        }
    }

    private void l() {
        Iterator<c> it2 = this.h.iterator();
        while (it2.hasNext()) {
            c next = it2.next();
            if (next.c.isEmpty()) {
                k(next);
                it2.remove();
            }
        }
    }

    private void m(c mediaSourceHolder) {
        this.h.add(mediaSourceHolder);
        b bVar = this.g.get(mediaSourceHolder);
        if (bVar != null) {
            bVar.a.enable(bVar.b);
        }
    }

    private static Object n(Object periodUid) {
        return AbstractConcatenatedTimeline.getChildPeriodUidFromConcatenatedUid(periodUid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static MediaSource.MediaPeriodId o(c mediaSourceHolder, MediaSource.MediaPeriodId mediaPeriodId) {
        for (int i = 0; i < mediaSourceHolder.c.size(); i++) {
            if (mediaSourceHolder.c.get(i).windowSequenceNumber == mediaPeriodId.windowSequenceNumber) {
                return mediaPeriodId.copyWithPeriodUid(q(mediaSourceHolder, mediaPeriodId.periodUid));
            }
        }
        return null;
    }

    private static Object p(Object periodUid) {
        return AbstractConcatenatedTimeline.getChildTimelineUidFromConcatenatedUid(periodUid);
    }

    private static Object q(c holder, Object childPeriodUid) {
        return AbstractConcatenatedTimeline.getConcatenatedUid(holder.b, childPeriodUid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s(c mediaSourceHolder, int windowIndex) {
        return windowIndex + mediaSourceHolder.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(MediaSource mediaSource, Timeline timeline) {
        this.d.onPlaylistUpdateRequested();
    }

    private void v(c mediaSourceHolder) {
        if (mediaSourceHolder.e && mediaSourceHolder.c.isEmpty()) {
            b bVar = (b) Assertions.checkNotNull(this.g.remove(mediaSourceHolder));
            bVar.a.releaseSource(bVar.b);
            bVar.a.removeEventListener(bVar.c);
            bVar.a.removeDrmEventListener(bVar.c);
            this.h.remove(mediaSourceHolder);
        }
    }

    private void z(c holder) {
        MaskingMediaSource maskingMediaSource = holder.a;
        MediaSource.MediaSourceCaller mediaSourceCaller = new MediaSource.MediaSourceCaller() { // from class: com.google.android.exoplayer2.k0
            @Override // com.google.android.exoplayer2.source.MediaSource.MediaSourceCaller
            public final void onSourceInfoRefreshed(MediaSource mediaSource, Timeline timeline) {
                this.a.u(mediaSource, timeline);
            }
        };
        a aVar = new a(holder);
        this.g.put(holder, new b(maskingMediaSource, mediaSourceCaller, aVar));
        maskingMediaSource.addEventListener(Util.createHandlerForCurrentOrMainLooper(), aVar);
        maskingMediaSource.addDrmEventListener(Util.createHandlerForCurrentOrMainLooper(), aVar);
        maskingMediaSource.prepareSource(mediaSourceCaller, this.k);
    }

    public void A() {
        for (b bVar : this.g.values()) {
            try {
                bVar.a.releaseSource(bVar.b);
            } catch (RuntimeException e) {
                Log.e(l, "Failed to release child source.", e);
            }
            bVar.a.removeEventListener(bVar.c);
            bVar.a.removeDrmEventListener(bVar.c);
        }
        this.g.clear();
        this.h.clear();
        this.j = false;
    }

    public void B(MediaPeriod mediaPeriod) {
        c cVar = (c) Assertions.checkNotNull(this.b.remove(mediaPeriod));
        cVar.a.releasePeriod(mediaPeriod);
        cVar.c.remove(((MaskingMediaPeriod) mediaPeriod).id);
        if (!this.b.isEmpty()) {
            l();
        }
        v(cVar);
    }

    public Timeline C(int fromIndex, int toIndex, ShuffleOrder shuffleOrder) {
        Assertions.checkArgument(fromIndex >= 0 && fromIndex <= toIndex && toIndex <= r());
        this.i = shuffleOrder;
        D(fromIndex, toIndex);
        return j();
    }

    public Timeline E(List<c> holders, ShuffleOrder shuffleOrder) {
        D(0, this.a.size());
        return f(this.a.size(), holders, shuffleOrder);
    }

    public Timeline F(ShuffleOrder shuffleOrder) {
        int iR = r();
        if (shuffleOrder.getLength() != iR) {
            shuffleOrder = shuffleOrder.cloneAndClear().cloneAndInsert(0, iR);
        }
        this.i = shuffleOrder;
        return j();
    }

    public Timeline f(int index, List<c> holders, ShuffleOrder shuffleOrder) {
        if (!holders.isEmpty()) {
            this.i = shuffleOrder;
            for (int i = index; i < holders.size() + index; i++) {
                c cVar = holders.get(i - index);
                if (i > 0) {
                    c cVar2 = this.a.get(i - 1);
                    cVar.b(cVar2.d + cVar2.a.getTimeline().getWindowCount());
                } else {
                    cVar.b(0);
                }
                h(i, cVar.a.getTimeline().getWindowCount());
                this.a.add(i, cVar);
                this.c.put(cVar.b, cVar);
                if (this.j) {
                    z(cVar);
                    if (this.b.isEmpty()) {
                        this.h.add(cVar);
                    } else {
                        k(cVar);
                    }
                }
            }
        }
        return j();
    }

    public Timeline g(@Nullable ShuffleOrder shuffleOrder) {
        if (shuffleOrder == null) {
            shuffleOrder = this.i.cloneAndClear();
        }
        this.i = shuffleOrder;
        D(0, r());
        return j();
    }

    public MediaPeriod i(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
        Object objP = p(id.periodUid);
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid = id.copyWithPeriodUid(n(id.periodUid));
        c cVar = (c) Assertions.checkNotNull(this.c.get(objP));
        m(cVar);
        cVar.c.add(mediaPeriodIdCopyWithPeriodUid);
        MaskingMediaPeriod maskingMediaPeriodCreatePeriod = cVar.a.createPeriod(mediaPeriodIdCopyWithPeriodUid, allocator, startPositionUs);
        this.b.put(maskingMediaPeriodCreatePeriod, cVar);
        l();
        return maskingMediaPeriodCreatePeriod;
    }

    public Timeline j() {
        if (this.a.isEmpty()) {
            return Timeline.EMPTY;
        }
        int windowCount = 0;
        for (int i = 0; i < this.a.size(); i++) {
            c cVar = this.a.get(i);
            cVar.d = windowCount;
            windowCount += cVar.a.getTimeline().getWindowCount();
        }
        return new o0(this.a, this.i);
    }

    public int r() {
        return this.a.size();
    }

    public boolean t() {
        return this.j;
    }

    public Timeline w(int currentIndex, int newIndex, ShuffleOrder shuffleOrder) {
        return x(currentIndex, currentIndex + 1, newIndex, shuffleOrder);
    }

    public Timeline x(int fromIndex, int toIndex, int newFromIndex, ShuffleOrder shuffleOrder) {
        Assertions.checkArgument(fromIndex >= 0 && fromIndex <= toIndex && toIndex <= r() && newFromIndex >= 0);
        this.i = shuffleOrder;
        if (fromIndex == toIndex || fromIndex == newFromIndex) {
            return j();
        }
        int iMin = Math.min(fromIndex, newFromIndex);
        int iMax = Math.max(((toIndex - fromIndex) + newFromIndex) - 1, toIndex - 1);
        int windowCount = this.a.get(iMin).d;
        Util.moveItems(this.a, fromIndex, toIndex, newFromIndex);
        while (iMin <= iMax) {
            c cVar = this.a.get(iMin);
            cVar.d = windowCount;
            windowCount += cVar.a.getTimeline().getWindowCount();
            iMin++;
        }
        return j();
    }

    public void y(@Nullable TransferListener mediaTransferListener) {
        Assertions.checkState(!this.j);
        this.k = mediaTransferListener;
        for (int i = 0; i < this.a.size(); i++) {
            c cVar = this.a.get(i);
            z(cVar);
            this.h.add(cVar);
        }
        this.j = true;
    }
}
