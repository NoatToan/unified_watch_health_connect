package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.AbstractConcatenatedTimeline;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import j20.x;
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

/* JADX INFO: loaded from: classes14.dex */
public final class ConcatenatingMediaSource extends CompositeMediaSource<MediaSourceHolder> {
    private static final MediaItem EMPTY_MEDIA_ITEM = new MediaItem.Builder().setUri(Uri.EMPTY).build();
    private static final int MSG_ADD = 0;
    private static final int MSG_MOVE = 2;
    private static final int MSG_ON_COMPLETION = 5;
    private static final int MSG_REMOVE = 1;
    private static final int MSG_SET_SHUFFLE_ORDER = 3;
    private static final int MSG_UPDATE_TIMELINE = 4;
    private final Set<MediaSourceHolder> enabledMediaSourceHolders;
    private final boolean isAtomic;
    private final IdentityHashMap<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod;
    private final Map<Object, MediaSourceHolder> mediaSourceByUid;
    private final List<MediaSourceHolder> mediaSourceHolders;
    private final List<MediaSourceHolder> mediaSourcesPublic;
    private Set<HandlerAndRunnable> nextTimelineUpdateOnCompletionActions;
    private final Set<HandlerAndRunnable> pendingOnCompletionActions;
    private Handler playbackThreadHandler;
    private ShuffleOrder shuffleOrder;
    private boolean timelineUpdateScheduled;
    private final boolean useLazyPreparation;

    public static final class ConcatenatedTimeline extends AbstractConcatenatedTimeline {
        private final HashMap<Object, Integer> childIndexByUid;
        private final int[] firstPeriodInChildIndices;
        private final int[] firstWindowInChildIndices;
        private final int periodCount;
        private final Timeline[] timelines;
        private final Object[] uids;
        private final int windowCount;

        public ConcatenatedTimeline(Collection<MediaSourceHolder> collection, ShuffleOrder shuffleOrder, boolean z14) {
            super(z14, shuffleOrder);
            int size = collection.size();
            this.firstPeriodInChildIndices = new int[size];
            this.firstWindowInChildIndices = new int[size];
            this.timelines = new Timeline[size];
            this.uids = new Object[size];
            this.childIndexByUid = new HashMap<>();
            int windowCount = 0;
            int periodCount = 0;
            int i14 = 0;
            for (MediaSourceHolder mediaSourceHolder : collection) {
                this.timelines[i14] = mediaSourceHolder.mediaSource.getTimeline();
                this.firstWindowInChildIndices[i14] = windowCount;
                this.firstPeriodInChildIndices[i14] = periodCount;
                windowCount += this.timelines[i14].getWindowCount();
                periodCount += this.timelines[i14].getPeriodCount();
                Object[] objArr = this.uids;
                Object obj = mediaSourceHolder.uid;
                objArr[i14] = obj;
                this.childIndexByUid.put(obj, Integer.valueOf(i14));
                i14++;
            }
            this.windowCount = windowCount;
            this.periodCount = periodCount;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getChildIndexByChildUid(Object obj) {
            Integer num = this.childIndexByUid.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getChildIndexByPeriodIndex(int i14) {
            return Util.binarySearchFloor(this.firstPeriodInChildIndices, i14 + 1, false, false);
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getChildIndexByWindowIndex(int i14) {
            return Util.binarySearchFloor(this.firstWindowInChildIndices, i14 + 1, false, false);
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public Object getChildUidByChildIndex(int i14) {
            return this.uids[i14];
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getFirstPeriodIndexByChildIndex(int i14) {
            return this.firstPeriodInChildIndices[i14];
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public int getFirstWindowIndexByChildIndex(int i14) {
            return this.firstWindowInChildIndices[i14];
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return this.periodCount;
        }

        @Override // com.google.android.exoplayer2.AbstractConcatenatedTimeline
        public Timeline getTimelineByChildIndex(int i14) {
            return this.timelines[i14];
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return this.windowCount;
        }
    }

    public static final class FakeMediaSource extends BaseMediaSource {
        private FakeMediaSource() {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j8) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public MediaItem getMediaItem() {
            return ConcatenatingMediaSource.EMPTY_MEDIA_ITEM;
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public void maybeThrowSourceInfoRefreshError() {
        }

        @Override // com.google.android.exoplayer2.source.BaseMediaSource
        public void prepareSourceInternal(TransferListener transferListener) {
        }

        @Override // com.google.android.exoplayer2.source.MediaSource
        public void releasePeriod(MediaPeriod mediaPeriod) {
        }

        @Override // com.google.android.exoplayer2.source.BaseMediaSource
        public void releaseSourceInternal() {
        }
    }

    public static final class HandlerAndRunnable {
        private final Handler handler;
        private final Runnable runnable;

        public HandlerAndRunnable(Handler handler, Runnable runnable) {
            this.handler = handler;
            this.runnable = runnable;
        }

        public void dispatch() {
            this.handler.post(this.runnable);
        }
    }

    public static final class MediaSourceHolder {
        public int childIndex;
        public int firstWindowIndexInChild;
        public boolean isRemoved;
        public final MaskingMediaSource mediaSource;
        public final List<MediaSource.MediaPeriodId> activeMediaPeriodIds = new ArrayList();
        public final Object uid = new Object();

        public MediaSourceHolder(MediaSource mediaSource, boolean z14) {
            this.mediaSource = new MaskingMediaSource(mediaSource, z14);
        }

        public void reset(int i14, int i15) {
            this.childIndex = i14;
            this.firstWindowIndexInChild = i15;
            this.isRemoved = false;
            this.activeMediaPeriodIds.clear();
        }
    }

    public static final class MessageData<T> {
        public final T customData;
        public final int index;
        public final HandlerAndRunnable onCompletionAction;

        public MessageData(int i14, T t7, HandlerAndRunnable handlerAndRunnable) {
            this.index = i14;
            this.customData = t7;
            this.onCompletionAction = handlerAndRunnable;
        }
    }

    public ConcatenatingMediaSource(boolean z14, boolean z15, ShuffleOrder shuffleOrder, MediaSource... mediaSourceArr) {
        for (MediaSource mediaSource : mediaSourceArr) {
            Assertions.checkNotNull(mediaSource);
        }
        this.shuffleOrder = shuffleOrder.getLength() > 0 ? shuffleOrder.cloneAndClear() : shuffleOrder;
        this.mediaSourceByMediaPeriod = new IdentityHashMap<>();
        this.mediaSourceByUid = new HashMap();
        this.mediaSourcesPublic = new ArrayList();
        this.mediaSourceHolders = new ArrayList();
        this.nextTimelineUpdateOnCompletionActions = new HashSet();
        this.pendingOnCompletionActions = new HashSet();
        this.enabledMediaSourceHolders = new HashSet();
        this.isAtomic = z14;
        this.useLazyPreparation = z15;
        addMediaSources(Arrays.asList(mediaSourceArr));
    }

    private void addMediaSourceInternal(int i14, MediaSourceHolder mediaSourceHolder) {
        if (i14 > 0) {
            MediaSourceHolder mediaSourceHolder2 = this.mediaSourceHolders.get(i14 - 1);
            mediaSourceHolder.reset(i14, mediaSourceHolder2.mediaSource.getTimeline().getWindowCount() + mediaSourceHolder2.firstWindowIndexInChild);
        } else {
            mediaSourceHolder.reset(i14, 0);
        }
        correctOffsets(i14, 1, mediaSourceHolder.mediaSource.getTimeline().getWindowCount());
        this.mediaSourceHolders.add(i14, mediaSourceHolder);
        this.mediaSourceByUid.put(mediaSourceHolder.uid, mediaSourceHolder);
        prepareChildSource(mediaSourceHolder, mediaSourceHolder.mediaSource);
        if (isEnabled() && this.mediaSourceByMediaPeriod.isEmpty()) {
            this.enabledMediaSourceHolders.add(mediaSourceHolder);
        } else {
            disableChildSource(mediaSourceHolder);
        }
    }

    private void addMediaSourcesInternal(int i14, Collection<MediaSourceHolder> collection) {
        Iterator<MediaSourceHolder> it = collection.iterator();
        while (it.hasNext()) {
            addMediaSourceInternal(i14, it.next());
            i14++;
        }
    }

    private void addPublicMediaSources(int i14, Collection<MediaSource> collection, Handler handler, Runnable runnable) {
        Assertions.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        Iterator<MediaSource> it = collection.iterator();
        while (it.hasNext()) {
            Assertions.checkNotNull(it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<MediaSource> it3 = collection.iterator();
        while (it3.hasNext()) {
            arrayList.add(new MediaSourceHolder(it3.next(), this.useLazyPreparation));
        }
        this.mediaSourcesPublic.addAll(i14, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(0, new MessageData(i14, arrayList, createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void correctOffsets(int i14, int i15, int i16) {
        while (i14 < this.mediaSourceHolders.size()) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(i14);
            mediaSourceHolder.childIndex += i15;
            mediaSourceHolder.firstWindowIndexInChild += i16;
            i14++;
        }
    }

    private HandlerAndRunnable createOnCompletionAction(Handler handler, Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        HandlerAndRunnable handlerAndRunnable = new HandlerAndRunnable(handler, runnable);
        this.pendingOnCompletionActions.add(handlerAndRunnable);
        return handlerAndRunnable;
    }

    private void disableUnusedMediaSources() {
        Iterator<MediaSourceHolder> it = this.enabledMediaSourceHolders.iterator();
        while (it.hasNext()) {
            MediaSourceHolder next = it.next();
            if (next.activeMediaPeriodIds.isEmpty()) {
                disableChildSource(next);
                it.remove();
            }
        }
    }

    private synchronized void dispatchOnCompletionActions(Set<HandlerAndRunnable> set) {
        try {
            Iterator<HandlerAndRunnable> it = set.iterator();
            while (it.hasNext()) {
                it.next().dispatch();
            }
            this.pendingOnCompletionActions.removeAll(set);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private void enableMediaSource(MediaSourceHolder mediaSourceHolder) {
        this.enabledMediaSourceHolders.add(mediaSourceHolder);
        enableChildSource(mediaSourceHolder);
    }

    private static Object getChildPeriodUid(Object obj) {
        return AbstractConcatenatedTimeline.getChildPeriodUidFromConcatenatedUid(obj);
    }

    private static Object getMediaSourceHolderUid(Object obj) {
        return AbstractConcatenatedTimeline.getChildTimelineUidFromConcatenatedUid(obj);
    }

    private static Object getPeriodUid(MediaSourceHolder mediaSourceHolder, Object obj) {
        return AbstractConcatenatedTimeline.getConcatenatedUid(mediaSourceHolder.uid, obj);
    }

    private Handler getPlaybackThreadHandlerOnPlaybackThread() {
        return (Handler) Assertions.checkNotNull(this.playbackThreadHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean handleMessage(Message message) {
        int i14 = message.what;
        if (i14 == 0) {
            MessageData messageData = (MessageData) Util.castNonNull(message.obj);
            this.shuffleOrder = this.shuffleOrder.cloneAndInsert(messageData.index, ((Collection) messageData.customData).size());
            addMediaSourcesInternal(messageData.index, (Collection) messageData.customData);
            scheduleTimelineUpdate(messageData.onCompletionAction);
        } else if (i14 == 1) {
            MessageData messageData2 = (MessageData) Util.castNonNull(message.obj);
            int i15 = messageData2.index;
            int iIntValue = ((Integer) messageData2.customData).intValue();
            if (i15 == 0 && iIntValue == this.shuffleOrder.getLength()) {
                this.shuffleOrder = this.shuffleOrder.cloneAndClear();
            } else {
                this.shuffleOrder = this.shuffleOrder.cloneAndRemove(i15, iIntValue);
            }
            for (int i16 = iIntValue - 1; i16 >= i15; i16--) {
                removeMediaSourceInternal(i16);
            }
            scheduleTimelineUpdate(messageData2.onCompletionAction);
        } else if (i14 == 2) {
            MessageData messageData3 = (MessageData) Util.castNonNull(message.obj);
            ShuffleOrder shuffleOrder = this.shuffleOrder;
            int i17 = messageData3.index;
            ShuffleOrder shuffleOrderCloneAndRemove = shuffleOrder.cloneAndRemove(i17, i17 + 1);
            this.shuffleOrder = shuffleOrderCloneAndRemove;
            this.shuffleOrder = shuffleOrderCloneAndRemove.cloneAndInsert(((Integer) messageData3.customData).intValue(), 1);
            moveMediaSourceInternal(messageData3.index, ((Integer) messageData3.customData).intValue());
            scheduleTimelineUpdate(messageData3.onCompletionAction);
        } else if (i14 == 3) {
            MessageData messageData4 = (MessageData) Util.castNonNull(message.obj);
            this.shuffleOrder = (ShuffleOrder) messageData4.customData;
            scheduleTimelineUpdate(messageData4.onCompletionAction);
        } else if (i14 == 4) {
            updateTimelineAndScheduleOnCompletionActions();
        } else {
            if (i14 != 5) {
                x.h();
                return false;
            }
            dispatchOnCompletionActions((Set) Util.castNonNull(message.obj));
        }
        return true;
    }

    private void maybeReleaseChildSource(MediaSourceHolder mediaSourceHolder) {
        if (mediaSourceHolder.isRemoved && mediaSourceHolder.activeMediaPeriodIds.isEmpty()) {
            this.enabledMediaSourceHolders.remove(mediaSourceHolder);
            releaseChildSource(mediaSourceHolder);
        }
    }

    private void moveMediaSourceInternal(int i14, int i15) {
        int iMin = Math.min(i14, i15);
        int iMax = Math.max(i14, i15);
        int windowCount = this.mediaSourceHolders.get(iMin).firstWindowIndexInChild;
        List<MediaSourceHolder> list = this.mediaSourceHolders;
        list.add(i15, list.remove(i14));
        while (iMin <= iMax) {
            MediaSourceHolder mediaSourceHolder = this.mediaSourceHolders.get(iMin);
            mediaSourceHolder.childIndex = iMin;
            mediaSourceHolder.firstWindowIndexInChild = windowCount;
            windowCount += mediaSourceHolder.mediaSource.getTimeline().getWindowCount();
            iMin++;
        }
    }

    private void movePublicMediaSource(int i14, int i15, Handler handler, Runnable runnable) {
        Assertions.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        List<MediaSourceHolder> list = this.mediaSourcesPublic;
        list.add(i15, list.remove(i14));
        if (handler2 != null) {
            handler2.obtainMessage(2, new MessageData(i14, Integer.valueOf(i15), createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void removeMediaSourceInternal(int i14) {
        MediaSourceHolder mediaSourceHolderRemove = this.mediaSourceHolders.remove(i14);
        this.mediaSourceByUid.remove(mediaSourceHolderRemove.uid);
        correctOffsets(i14, -1, -mediaSourceHolderRemove.mediaSource.getTimeline().getWindowCount());
        mediaSourceHolderRemove.isRemoved = true;
        maybeReleaseChildSource(mediaSourceHolderRemove);
    }

    private void removePublicMediaSources(int i14, int i15, Handler handler, Runnable runnable) {
        Assertions.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        Util.removeRange(this.mediaSourcesPublic, i14, i15);
        if (handler2 != null) {
            handler2.obtainMessage(1, new MessageData(i14, Integer.valueOf(i15), createOnCompletionAction(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    private void scheduleTimelineUpdate(HandlerAndRunnable handlerAndRunnable) {
        if (!this.timelineUpdateScheduled) {
            getPlaybackThreadHandlerOnPlaybackThread().obtainMessage(4).sendToTarget();
            this.timelineUpdateScheduled = true;
        }
        if (handlerAndRunnable != null) {
            this.nextTimelineUpdateOnCompletionActions.add(handlerAndRunnable);
        }
    }

    private void setPublicShuffleOrder(ShuffleOrder shuffleOrder, Handler handler, Runnable runnable) {
        Assertions.checkArgument((handler == null) == (runnable == null));
        Handler handler2 = this.playbackThreadHandler;
        if (handler2 != null) {
            int size = getSize();
            if (shuffleOrder.getLength() != size) {
                shuffleOrder = shuffleOrder.cloneAndClear().cloneAndInsert(0, size);
            }
            handler2.obtainMessage(3, new MessageData(0, shuffleOrder, createOnCompletionAction(handler, runnable))).sendToTarget();
            return;
        }
        if (shuffleOrder.getLength() > 0) {
            shuffleOrder = shuffleOrder.cloneAndClear();
        }
        this.shuffleOrder = shuffleOrder;
        if (runnable == null || handler == null) {
            return;
        }
        handler.post(runnable);
    }

    private void updateMediaSourceInternal(MediaSourceHolder mediaSourceHolder, Timeline timeline) {
        if (mediaSourceHolder.childIndex + 1 < this.mediaSourceHolders.size()) {
            int windowCount = timeline.getWindowCount() - (this.mediaSourceHolders.get(mediaSourceHolder.childIndex + 1).firstWindowIndexInChild - mediaSourceHolder.firstWindowIndexInChild);
            if (windowCount != 0) {
                correctOffsets(mediaSourceHolder.childIndex + 1, 0, windowCount);
            }
        }
        scheduleTimelineUpdate();
    }

    private void updateTimelineAndScheduleOnCompletionActions() {
        this.timelineUpdateScheduled = false;
        Set<HandlerAndRunnable> set = this.nextTimelineUpdateOnCompletionActions;
        this.nextTimelineUpdateOnCompletionActions = new HashSet();
        refreshSourceInfo(new ConcatenatedTimeline(this.mediaSourceHolders, this.shuffleOrder, this.isAtomic));
        getPlaybackThreadHandlerOnPlaybackThread().obtainMessage(5, set).sendToTarget();
    }

    public synchronized void addMediaSource(MediaSource mediaSource) {
        addMediaSource(this.mediaSourcesPublic.size(), mediaSource);
    }

    public synchronized void addMediaSources(Collection<MediaSource> collection) {
        addPublicMediaSources(this.mediaSourcesPublic.size(), collection, null, null);
    }

    public synchronized void clear() {
        removeMediaSourceRange(0, getSize());
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j8) {
        Object mediaSourceHolderUid = getMediaSourceHolderUid(mediaPeriodId.periodUid);
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithPeriodUid = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid));
        MediaSourceHolder mediaSourceHolder = this.mediaSourceByUid.get(mediaSourceHolderUid);
        if (mediaSourceHolder == null) {
            mediaSourceHolder = new MediaSourceHolder(new FakeMediaSource(), this.useLazyPreparation);
            mediaSourceHolder.isRemoved = true;
            prepareChildSource(mediaSourceHolder, mediaSourceHolder.mediaSource);
        }
        enableMediaSource(mediaSourceHolder);
        mediaSourceHolder.activeMediaPeriodIds.add(mediaPeriodIdCopyWithPeriodUid);
        MaskingMediaPeriod maskingMediaPeriodCreatePeriod = mediaSourceHolder.mediaSource.createPeriod(mediaPeriodIdCopyWithPeriodUid, allocator, j8);
        this.mediaSourceByMediaPeriod.put(maskingMediaPeriodCreatePeriod, mediaSourceHolder);
        disableUnusedMediaSources();
        return maskingMediaPeriodCreatePeriod;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void disableInternal() {
        super.disableInternal();
        this.enabledMediaSourceHolders.clear();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void enableInternal() {
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public synchronized Timeline getInitialTimeline() {
        ShuffleOrder shuffleOrderCloneAndInsert;
        try {
            int length = this.shuffleOrder.getLength();
            int size = this.mediaSourcesPublic.size();
            shuffleOrderCloneAndInsert = this.shuffleOrder;
            if (length != size) {
                shuffleOrderCloneAndInsert = shuffleOrderCloneAndInsert.cloneAndClear().cloneAndInsert(0, this.mediaSourcesPublic.size());
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return new ConcatenatedTimeline(this.mediaSourcesPublic, shuffleOrderCloneAndInsert, this.isAtomic);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return EMPTY_MEDIA_ITEM;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(MediaSourceHolder mediaSourceHolder, MediaSource.MediaPeriodId mediaPeriodId) {
        for (int i14 = 0; i14 < mediaSourceHolder.activeMediaPeriodIds.size(); i14++) {
            if (mediaSourceHolder.activeMediaPeriodIds.get(i14).windowSequenceNumber == mediaPeriodId.windowSequenceNumber) {
                return mediaPeriodId.copyWithPeriodUid(getPeriodUid(mediaSourceHolder, mediaPeriodId.periodUid));
            }
        }
        return null;
    }

    public synchronized MediaSource getMediaSource(int i14) {
        return this.mediaSourcesPublic.get(i14).mediaSource;
    }

    public synchronized int getSize() {
        return this.mediaSourcesPublic.size();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public boolean isSingleWindow() {
        return false;
    }

    public synchronized void moveMediaSource(int i14, int i15) {
        movePublicMediaSource(i14, i15, null, null);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public synchronized void prepareSourceInternal(TransferListener transferListener) {
        try {
            super.prepareSourceInternal(transferListener);
            this.playbackThreadHandler = new Handler(new Handler.Callback() { // from class: com.google.android.exoplayer2.source.b
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return this.f53068a.handleMessage(message);
                }
            });
            if (this.mediaSourcesPublic.isEmpty()) {
                updateTimelineAndScheduleOnCompletionActions();
            } else {
                this.shuffleOrder = this.shuffleOrder.cloneAndInsert(0, this.mediaSourcesPublic.size());
                addMediaSourcesInternal(0, this.mediaSourcesPublic);
                scheduleTimelineUpdate();
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) Assertions.checkNotNull(this.mediaSourceByMediaPeriod.remove(mediaPeriod));
        mediaSourceHolder.mediaSource.releasePeriod(mediaPeriod);
        mediaSourceHolder.activeMediaPeriodIds.remove(((MaskingMediaPeriod) mediaPeriod).f53053id);
        if (!this.mediaSourceByMediaPeriod.isEmpty()) {
            disableUnusedMediaSources();
        }
        maybeReleaseChildSource(mediaSourceHolder);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public synchronized void releaseSourceInternal() {
        try {
            super.releaseSourceInternal();
            this.mediaSourceHolders.clear();
            this.enabledMediaSourceHolders.clear();
            this.mediaSourceByUid.clear();
            this.shuffleOrder = this.shuffleOrder.cloneAndClear();
            Handler handler = this.playbackThreadHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.playbackThreadHandler = null;
            }
            this.timelineUpdateScheduled = false;
            this.nextTimelineUpdateOnCompletionActions.clear();
            dispatchOnCompletionActions(this.pendingOnCompletionActions);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized MediaSource removeMediaSource(int i14) {
        MediaSource mediaSource;
        mediaSource = getMediaSource(i14);
        removePublicMediaSources(i14, i14 + 1, null, null);
        return mediaSource;
    }

    public synchronized void removeMediaSourceRange(int i14, int i15) {
        removePublicMediaSources(i14, i15, null, null);
    }

    public synchronized void setShuffleOrder(ShuffleOrder shuffleOrder) {
        setPublicShuffleOrder(shuffleOrder, null, null);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void lambda$prepareChildSource$0(MediaSourceHolder mediaSourceHolder, MediaSource mediaSource, Timeline timeline) {
        updateMediaSourceInternal(mediaSourceHolder, timeline);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public int getWindowIndexForChildWindowIndex(MediaSourceHolder mediaSourceHolder, int i14) {
        return i14 + mediaSourceHolder.firstWindowIndexInChild;
    }

    public synchronized void moveMediaSource(int i14, int i15, Handler handler, Runnable runnable) {
        movePublicMediaSource(i14, i15, handler, runnable);
    }

    public synchronized void removeMediaSourceRange(int i14, int i15, Handler handler, Runnable runnable) {
        removePublicMediaSources(i14, i15, handler, runnable);
    }

    public synchronized void setShuffleOrder(ShuffleOrder shuffleOrder, Handler handler, Runnable runnable) {
        setPublicShuffleOrder(shuffleOrder, handler, runnable);
    }

    public synchronized void clear(Handler handler, Runnable runnable) {
        removeMediaSourceRange(0, getSize(), handler, runnable);
    }

    public synchronized void addMediaSource(MediaSource mediaSource, Handler handler, Runnable runnable) {
        addMediaSource(this.mediaSourcesPublic.size(), mediaSource, handler, runnable);
    }

    public synchronized void addMediaSources(Collection<MediaSource> collection, Handler handler, Runnable runnable) {
        addPublicMediaSources(this.mediaSourcesPublic.size(), collection, handler, runnable);
    }

    public synchronized MediaSource removeMediaSource(int i14, Handler handler, Runnable runnable) {
        MediaSource mediaSource;
        mediaSource = getMediaSource(i14);
        removePublicMediaSources(i14, i14 + 1, handler, runnable);
        return mediaSource;
    }

    public synchronized void addMediaSource(int i14, MediaSource mediaSource) {
        addPublicMediaSources(i14, Collections.singletonList(mediaSource), null, null);
    }

    public synchronized void addMediaSources(int i14, Collection<MediaSource> collection) {
        addPublicMediaSources(i14, collection, null, null);
    }

    public synchronized void addMediaSource(int i14, MediaSource mediaSource, Handler handler, Runnable runnable) {
        addPublicMediaSources(i14, Collections.singletonList(mediaSource), handler, runnable);
    }

    public synchronized void addMediaSources(int i14, Collection<MediaSource> collection, Handler handler, Runnable runnable) {
        addPublicMediaSources(i14, collection, handler, runnable);
    }

    private void scheduleTimelineUpdate() {
        scheduleTimelineUpdate(null);
    }

    public ConcatenatingMediaSource(boolean z14, MediaSource... mediaSourceArr) {
        this(z14, new ShuffleOrder.DefaultShuffleOrder(0), mediaSourceArr);
    }

    public ConcatenatingMediaSource(boolean z14, ShuffleOrder shuffleOrder, MediaSource... mediaSourceArr) {
        this(z14, false, shuffleOrder, mediaSourceArr);
    }

    public ConcatenatingMediaSource(MediaSource... mediaSourceArr) {
        this(false, mediaSourceArr);
    }
}
