package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.AbstractConcatenatedTimeline;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ConcatenatingMediaSource extends CompositeMediaSource<e> {
    private static final int A = 5;
    private static final MediaItem B = new MediaItem.Builder().setUri(Uri.EMPTY).build();
    private static final int v = 0;
    private static final int w = 1;
    private static final int x = 2;
    private static final int y = 3;
    private static final int z = 4;

    @GuardedBy("this")
    private final List<e> j;

    @GuardedBy("this")
    private final Set<d> k;

    @Nullable
    @GuardedBy("this")
    private Handler l;
    private final List<e> m;
    private final IdentityHashMap<MediaPeriod, e> n;
    private final Map<Object, e> o;
    private final Set<e> p;
    private final boolean q;
    private final boolean r;
    private boolean s;
    private Set<d> t;
    private ShuffleOrder u;

    public static final class b extends AbstractConcatenatedTimeline {
        private final int g;
        private final int h;
        private final int[] i;
        private final int[] j;
        private final Timeline[] k;
        private final Object[] l;
        private final HashMap<Object, Integer> m;

        public b(Collection<e> mediaSourceHolders, ShuffleOrder shuffleOrder, boolean isAtomic) {
            super(isAtomic, shuffleOrder);
            int size = mediaSourceHolders.size();
            this.i = new int[size];
            this.j = new int[size];
            this.k = new Timeline[size];
            this.l = new Object[size];
            this.m = new HashMap<>();
            int windowCount = 0;
            int periodCount = 0;
            int i = 0;
            for (e eVar : mediaSourceHolders) {
                this.k[i] = eVar.a.getTimeline();
                this.j[i] = windowCount;
                this.i[i] = periodCount;
                windowCount += this.k[i].getWindowCount();
                periodCount += this.k[i].getPeriodCount();
                Object[] objArr = this.l;
                objArr[i] = eVar.b;
                this.m.put(objArr[i], Integer.valueOf(i));
                i++;
            }
            this.g = windowCount;
            this.h = periodCount;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getChildIndexByChildUid(Object childUid) {
            Integer num = this.m.get(childUid);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getChildIndexByPeriodIndex(int periodIndex) {
            return Util.binarySearchFloor(this.i, periodIndex + 1, false, false);
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getChildIndexByWindowIndex(int windowIndex) {
            return Util.binarySearchFloor(this.j, windowIndex + 1, false, false);
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public Object getChildUidByChildIndex(int childIndex) {
            return this.l[childIndex];
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getFirstPeriodIndexByChildIndex(int childIndex) {
            return this.i[childIndex];
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getFirstWindowIndexByChildIndex(int childIndex) {
            return this.j[childIndex];
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return this.h;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public Timeline getTimelineByChildIndex(int childIndex) {
            return this.k[childIndex];
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return this.g;
        }
    }

    public static final class c extends BaseMediaSource {
        private c() {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public MediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public MediaItem getMediaItem() {
            return ConcatenatingMediaSource.B;
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public void maybeThrowSourceInfoRefreshError() {
        }

        @Override // com.google.android.exoplayer2.source.BaseMediaSource
        public void prepareSourceInternal(@Nullable TransferListener mediaTransferListener) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public void releasePeriod(MediaPeriod mediaPeriod) {
        }

        @Override // com.google.android.exoplayer2.source.BaseMediaSource
        public void releaseSourceInternal() {
        }
    }

    public static final class d {
        private final Handler a;
        private final Runnable b;

        public d(Handler handler, Runnable runnable) {
            this.a = handler;
            this.b = runnable;
        }

        public void a() {
            this.a.post(this.b);
        }
    }

    public static final class e {
        public final MaskingMediaSource a;
        public int d;
        public int e;
        public boolean f;
        public final List<MediaSource.MediaPeriodId> c = new ArrayList();
        public final Object b = new Object();

        public e(MediaSource mediaSource, boolean useLazyPreparation) {
            this.a = new MaskingMediaSource(mediaSource, useLazyPreparation);
        }

        public void a(int childIndex, int firstWindowIndexInChild) {
            this.d = childIndex;
            this.e = firstWindowIndexInChild;
            this.f = false;
            this.c.clear();
        }
    }

    public static final class f<T> {
        public final int a;
        public final T b;

        @Nullable
        public final d c;

        public f(int index, T customData, @Nullable d onCompletionAction) {
            this.a = index;
            this.b = customData;
            this.c = onCompletionAction;
        }
    }

    public ConcatenatingMediaSource(MediaSource... mediaSources) {
        this(false, mediaSources);
    }

    private void A() {
        this.s = false;
        Set<d> set = this.t;
        this.t = new HashSet();
        refreshSourceInfo(new b(this.m, this.u, this.q));
        p().obtainMessage(5, set).sendToTarget();
    }

    private void e(int newIndex, e newMediaSourceHolder) {
        if (newIndex > 0) {
            e eVar = this.m.get(newIndex - 1);
            newMediaSourceHolder.a(newIndex, eVar.e + eVar.a.getTimeline().getWindowCount());
        } else {
            newMediaSourceHolder.a(newIndex, 0);
        }
        h(newIndex, 1, newMediaSourceHolder.a.getTimeline().getWindowCount());
        this.m.add(newIndex, newMediaSourceHolder);
        this.o.put(newMediaSourceHolder.b, newMediaSourceHolder);
        prepareChildSource(newMediaSourceHolder, newMediaSourceHolder.a);
        if (isEnabled() && this.n.isEmpty()) {
            this.p.add(newMediaSourceHolder);
        } else {
            disableChildSource(newMediaSourceHolder);
        }
    }

    private void f(int index, Collection<e> mediaSourceHolders) {
        Iterator<e> it2 = mediaSourceHolders.iterator();
        while (it2.hasNext()) {
            e(index, it2.next());
            index++;
        }
    }

    @GuardedBy("this")
    private void g(int index, Collection<MediaSource> mediaSources, @Nullable Handler handler, @Nullable Runnable onCompletionAction) {
        Assertions.checkArgument((handler == null) == (onCompletionAction == null));
        Handler handler2 = this.l;
        Iterator<MediaSource> it2 = mediaSources.iterator();
        while (it2.hasNext()) {
            Assertions.checkNotNull(it2.next());
        }
        ArrayList arrayList = new ArrayList(mediaSources.size());
        Iterator<MediaSource> it3 = mediaSources.iterator();
        while (it3.hasNext()) {
            arrayList.add(new e(it3.next(), this.r));
        }
        this.j.addAll(index, arrayList);
        if (handler2 != null && !mediaSources.isEmpty()) {
            handler2.obtainMessage(0, new f(index, arrayList, i(handler, onCompletionAction))).sendToTarget();
        } else {
            if (onCompletionAction == null || handler == null) {
                return;
            }
            handler.post(onCompletionAction);
        }
    }

    private void h(int startIndex, int childIndexUpdate, int windowOffsetUpdate) {
        while (startIndex < this.m.size()) {
            e eVar = this.m.get(startIndex);
            eVar.d += childIndexUpdate;
            eVar.e += windowOffsetUpdate;
            startIndex++;
        }
    }

    @Nullable
    @GuardedBy("this")
    private d i(@Nullable Handler handler, @Nullable Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        d dVar = new d(handler, runnable);
        this.k.add(dVar);
        return dVar;
    }

    private void j() {
        Iterator<e> it2 = this.p.iterator();
        while (it2.hasNext()) {
            e next = it2.next();
            if (next.c.isEmpty()) {
                disableChildSource(next);
                it2.remove();
            }
        }
    }

    private synchronized void k(Set<d> onCompletionActions) {
        Iterator<d> it2 = onCompletionActions.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
        this.k.removeAll(onCompletionActions);
    }

    private void l(e mediaSourceHolder) {
        this.p.add(mediaSourceHolder);
        enableChildSource(mediaSourceHolder);
    }

    private static Object m(Object periodUid) {
        return AbstractConcatenatedTimeline.getChildPeriodUidFromConcatenatedUid(periodUid);
    }

    private static Object n(Object periodUid) {
        return AbstractConcatenatedTimeline.getChildTimelineUidFromConcatenatedUid(periodUid);
    }

    private static Object o(e holder, Object childPeriodUid) {
        return AbstractConcatenatedTimeline.getConcatenatedUid(holder.b, childPeriodUid);
    }

    private Handler p() {
        return (Handler) Assertions.checkNotNull(this.l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean q(Message msg) {
        int i = msg.what;
        if (i == 0) {
            f fVar = (f) Util.castNonNull(msg.obj);
            this.u = this.u.cloneAndInsert(fVar.a, ((Collection) fVar.b).size());
            f(fVar.a, (Collection) fVar.b);
            x(fVar.c);
        } else if (i == 1) {
            f fVar2 = (f) Util.castNonNull(msg.obj);
            int i2 = fVar2.a;
            int iIntValue = ((Integer) fVar2.b).intValue();
            if (i2 == 0 && iIntValue == this.u.getLength()) {
                this.u = this.u.cloneAndClear();
            } else {
                this.u = this.u.cloneAndRemove(i2, iIntValue);
            }
            for (int i3 = iIntValue - 1; i3 >= i2; i3--) {
                u(i3);
            }
            x(fVar2.c);
        } else if (i == 2) {
            f fVar3 = (f) Util.castNonNull(msg.obj);
            ShuffleOrder shuffleOrder = this.u;
            int i4 = fVar3.a;
            ShuffleOrder shuffleOrderCloneAndRemove = shuffleOrder.cloneAndRemove(i4, i4 + 1);
            this.u = shuffleOrderCloneAndRemove;
            this.u = shuffleOrderCloneAndRemove.cloneAndInsert(((Integer) fVar3.b).intValue(), 1);
            s(fVar3.a, ((Integer) fVar3.b).intValue());
            x(fVar3.c);
        } else if (i == 3) {
            f fVar4 = (f) Util.castNonNull(msg.obj);
            this.u = (ShuffleOrder) fVar4.b;
            x(fVar4.c);
        } else if (i == 4) {
            A();
        } else {
            if (i != 5) {
                throw new IllegalStateException();
            }
            k((Set) Util.castNonNull(msg.obj));
        }
        return true;
    }

    private void r(e mediaSourceHolder) {
        if (mediaSourceHolder.f && mediaSourceHolder.c.isEmpty()) {
            this.p.remove(mediaSourceHolder);
            releaseChildSource(mediaSourceHolder);
        }
    }

    private void s(int currentIndex, int newIndex) {
        int iMin = Math.min(currentIndex, newIndex);
        int iMax = Math.max(currentIndex, newIndex);
        int windowCount = this.m.get(iMin).e;
        List<e> list = this.m;
        list.add(newIndex, list.remove(currentIndex));
        while (iMin <= iMax) {
            e eVar = this.m.get(iMin);
            eVar.d = iMin;
            eVar.e = windowCount;
            windowCount += eVar.a.getTimeline().getWindowCount();
            iMin++;
        }
    }

    @GuardedBy("this")
    private void t(int currentIndex, int newIndex, @Nullable Handler handler, @Nullable Runnable onCompletionAction) {
        Assertions.checkArgument((handler == null) == (onCompletionAction == null));
        Handler handler2 = this.l;
        List<e> list = this.j;
        list.add(newIndex, list.remove(currentIndex));
        if (handler2 != null) {
            handler2.obtainMessage(2, new f(currentIndex, Integer.valueOf(newIndex), i(handler, onCompletionAction))).sendToTarget();
        } else {
            if (onCompletionAction == null || handler == null) {
                return;
            }
            handler.post(onCompletionAction);
        }
    }

    private void u(int index) {
        e eVarRemove = this.m.remove(index);
        this.o.remove(eVarRemove.b);
        h(index, -1, -eVarRemove.a.getTimeline().getWindowCount());
        eVarRemove.f = true;
        r(eVarRemove);
    }

    @GuardedBy("this")
    private void v(int fromIndex, int toIndex, @Nullable Handler handler, @Nullable Runnable onCompletionAction) {
        Assertions.checkArgument((handler == null) == (onCompletionAction == null));
        Handler handler2 = this.l;
        Util.removeRange(this.j, fromIndex, toIndex);
        if (handler2 != null) {
            handler2.obtainMessage(1, new f(fromIndex, Integer.valueOf(toIndex), i(handler, onCompletionAction))).sendToTarget();
        } else {
            if (onCompletionAction == null || handler == null) {
                return;
            }
            handler.post(onCompletionAction);
        }
    }

    private void w() {
        x(null);
    }

    private void x(@Nullable d onCompletionAction) {
        if (!this.s) {
            p().obtainMessage(4).sendToTarget();
            this.s = true;
        }
        if (onCompletionAction != null) {
            this.t.add(onCompletionAction);
        }
    }

    @GuardedBy("this")
    private void y(ShuffleOrder shuffleOrder, @Nullable Handler handler, @Nullable Runnable onCompletionAction) {
        Assertions.checkArgument((handler == null) == (onCompletionAction == null));
        Handler handler2 = this.l;
        if (handler2 != null) {
            int size = getSize();
            if (shuffleOrder.getLength() != size) {
                shuffleOrder = shuffleOrder.cloneAndClear().cloneAndInsert(0, size);
            }
            handler2.obtainMessage(3, new f(0, shuffleOrder, i(handler, onCompletionAction))).sendToTarget();
            return;
        }
        if (shuffleOrder.getLength() > 0) {
            shuffleOrder = shuffleOrder.cloneAndClear();
        }
        this.u = shuffleOrder;
        if (onCompletionAction == null || handler == null) {
            return;
        }
        handler.post(onCompletionAction);
    }

    private void z(e mediaSourceHolder, Timeline timeline) {
        if (mediaSourceHolder.d + 1 < this.m.size()) {
            int windowCount = timeline.getWindowCount() - (this.m.get(mediaSourceHolder.d + 1).e - mediaSourceHolder.e);
            if (windowCount != 0) {
                h(mediaSourceHolder.d + 1, 0, windowCount);
            }
        }
        w();
    }

    public synchronized void addMediaSource(MediaSource mediaSource) {
        addMediaSource(this.j.size(), mediaSource);
    }

    public synchronized void addMediaSources(Collection<MediaSource> mediaSources) {
        g(this.j.size(), mediaSources, null, null);
    }

    public synchronized void clear() {
        removeMediaSourceRange(0, getSize());
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId id, Allocator allocator, long startPositionUs) {
        Object objN = n(id.periodUid);
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid = id.copyWithPeriodUid(m(id.periodUid));
        e eVar = this.o.get(objN);
        if (eVar == null) {
            eVar = new e(new c(), this.r);
            eVar.f = true;
            prepareChildSource(eVar, eVar.a);
        }
        l(eVar);
        eVar.c.add(mediaPeriodIdCopyWithPeriodUid);
        MaskingMediaPeriod maskingMediaPeriodCreatePeriod = eVar.a.createPeriod(mediaPeriodIdCopyWithPeriodUid, allocator, startPositionUs);
        this.n.put(maskingMediaPeriodCreatePeriod, eVar);
        j();
        return maskingMediaPeriodCreatePeriod;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void disableInternal() {
        super.disableInternal();
        this.p.clear();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void enableInternal() {
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    public synchronized Timeline getInitialTimeline() {
        return new b(this.j, this.u.getLength() != this.j.size() ? this.u.cloneAndClear().cloneAndInsert(0, this.j.size()) : this.u, this.q);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return B;
    }

    public synchronized MediaSource getMediaSource(int index) {
        return this.j.get(index).a;
    }

    public synchronized int getSize() {
        return this.j.size();
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    public boolean isSingleWindow() {
        return false;
    }

    public synchronized void moveMediaSource(int currentIndex, int newIndex) {
        t(currentIndex, newIndex, null, null);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public synchronized void prepareSourceInternal(@Nullable TransferListener mediaTransferListener) {
        super.prepareSourceInternal(mediaTransferListener);
        this.l = new Handler(new Handler.Callback() { // from class: ey0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.a.q(message);
            }
        });
        if (this.j.isEmpty()) {
            A();
        } else {
            this.u = this.u.cloneAndInsert(0, this.j.size());
            f(0, this.j);
            w();
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        e eVar = (e) Assertions.checkNotNull(this.n.remove(mediaPeriod));
        eVar.a.releasePeriod(mediaPeriod);
        eVar.c.remove(((MaskingMediaPeriod) mediaPeriod).id);
        if (!this.n.isEmpty()) {
            j();
        }
        r(eVar);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public synchronized void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.m.clear();
        this.p.clear();
        this.o.clear();
        this.u = this.u.cloneAndClear();
        Handler handler = this.l;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.l = null;
        }
        this.s = false;
        this.t.clear();
        k(this.k);
    }

    public synchronized MediaSource removeMediaSource(int index) {
        MediaSource mediaSource;
        mediaSource = getMediaSource(index);
        v(index, index + 1, null, null);
        return mediaSource;
    }

    public synchronized void removeMediaSourceRange(int fromIndex, int toIndex) {
        v(fromIndex, toIndex, null, null);
    }

    public synchronized void setShuffleOrder(ShuffleOrder shuffleOrder) {
        y(shuffleOrder, null, null);
    }

    public ConcatenatingMediaSource(boolean isAtomic, MediaSource... mediaSources) {
        this(isAtomic, new ShuffleOrder.DefaultShuffleOrder(0), mediaSources);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(e mediaSourceHolder, MediaSource.MediaPeriodId mediaPeriodId) {
        for (int i = 0; i < mediaSourceHolder.c.size(); i++) {
            if (mediaSourceHolder.c.get(i).windowSequenceNumber == mediaPeriodId.windowSequenceNumber) {
                return mediaPeriodId.copyWithPeriodUid(o(mediaSourceHolder, mediaPeriodId.periodUid));
            }
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public int getWindowIndexForChildWindowIndex(e mediaSourceHolder, int windowIndex) {
        return windowIndex + mediaSourceHolder.e;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void b(e mediaSourceHolder, MediaSource mediaSource, Timeline timeline) {
        z(mediaSourceHolder, timeline);
    }

    public ConcatenatingMediaSource(boolean isAtomic, ShuffleOrder shuffleOrder, MediaSource... mediaSources) {
        this(isAtomic, false, shuffleOrder, mediaSources);
    }

    public synchronized void addMediaSource(MediaSource mediaSource, Handler handler, Runnable onCompletionAction) {
        addMediaSource(this.j.size(), mediaSource, handler, onCompletionAction);
    }

    public synchronized void clear(Handler handler, Runnable onCompletionAction) {
        removeMediaSourceRange(0, getSize(), handler, onCompletionAction);
    }

    public synchronized void moveMediaSource(int currentIndex, int newIndex, Handler handler, Runnable onCompletionAction) {
        t(currentIndex, newIndex, handler, onCompletionAction);
    }

    public synchronized void removeMediaSourceRange(int fromIndex, int toIndex, Handler handler, Runnable onCompletionAction) {
        v(fromIndex, toIndex, handler, onCompletionAction);
    }

    public synchronized void setShuffleOrder(ShuffleOrder shuffleOrder, Handler handler, Runnable onCompletionAction) {
        y(shuffleOrder, handler, onCompletionAction);
    }

    public ConcatenatingMediaSource(boolean isAtomic, boolean useLazyPreparation, ShuffleOrder shuffleOrder, MediaSource... mediaSources) {
        for (MediaSource mediaSource : mediaSources) {
            Assertions.checkNotNull(mediaSource);
        }
        this.u = shuffleOrder.getLength() > 0 ? shuffleOrder.cloneAndClear() : shuffleOrder;
        this.n = new IdentityHashMap<>();
        this.o = new HashMap();
        this.j = new ArrayList();
        this.m = new ArrayList();
        this.t = new HashSet();
        this.k = new HashSet();
        this.p = new HashSet();
        this.q = isAtomic;
        this.r = useLazyPreparation;
        addMediaSources(Arrays.asList(mediaSources));
    }

    public synchronized MediaSource removeMediaSource(int index, Handler handler, Runnable onCompletionAction) {
        MediaSource mediaSource;
        mediaSource = getMediaSource(index);
        v(index, index + 1, handler, onCompletionAction);
        return mediaSource;
    }

    public synchronized void addMediaSource(int index, MediaSource mediaSource) {
        g(index, Collections.singletonList(mediaSource), null, null);
    }

    public synchronized void addMediaSources(Collection<MediaSource> mediaSources, Handler handler, Runnable onCompletionAction) {
        g(this.j.size(), mediaSources, handler, onCompletionAction);
    }

    public synchronized void addMediaSources(int index, Collection<MediaSource> mediaSources) {
        g(index, mediaSources, null, null);
    }

    public synchronized void addMediaSource(int index, MediaSource mediaSource, Handler handler, Runnable onCompletionAction) {
        g(index, Collections.singletonList(mediaSource), handler, onCompletionAction);
    }

    public synchronized void addMediaSources(int index, Collection<MediaSource> mediaSources, Handler handler, Runnable onCompletionAction) {
        g(index, mediaSources, handler, onCompletionAction);
    }
}
