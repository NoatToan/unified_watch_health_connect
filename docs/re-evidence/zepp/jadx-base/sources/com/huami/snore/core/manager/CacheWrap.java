package com.huami.snore.core.manager;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.huami.message.utils.MessageRecorderEventHelper;
import com.liulishuo.engzo.lingorecorder.utils.WrapBuffer;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b#\u0010$J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\b\u001a\u00020\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bHÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000e\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/huami/snore/core/manager/CacheWrap;", "", "data", "", "size", "", MessageRecorderEventHelper.OtherPagerHelper.FROM_PUSH, "poll", "clear", "component1", "component2", "Ljava/util/concurrent/LinkedBlockingQueue;", "component3", "total", SDKConstants.PARAM_CONTEXT_MAX_SIZE, "queue", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getTotal", "()I", "setTotal", "(I)V", "b", "getMaxSize", "c", "Ljava/util/concurrent/LinkedBlockingQueue;", "getQueue", "()Ljava/util/concurrent/LinkedBlockingQueue;", "<init>", "(IILjava/util/concurrent/LinkedBlockingQueue;)V", "snore_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class CacheWrap {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private int total;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int maxSize;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final LinkedBlockingQueue<Object> queue;

    public CacheWrap(int i, int i2, @NotNull LinkedBlockingQueue<Object> linkedBlockingQueue) {
        this.total = i;
        this.maxSize = i2;
        this.queue = linkedBlockingQueue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CacheWrap copy$default(CacheWrap cacheWrap, int i, int i2, LinkedBlockingQueue linkedBlockingQueue, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = cacheWrap.total;
        }
        if ((i3 & 2) != 0) {
            i2 = cacheWrap.maxSize;
        }
        if ((i3 & 4) != 0) {
            linkedBlockingQueue = cacheWrap.queue;
        }
        return cacheWrap.copy(i, i2, linkedBlockingQueue);
    }

    public final void clear() {
        this.total = 0;
        LinkedBlockingQueue<Object> linkedBlockingQueue = this.queue;
        if (linkedBlockingQueue == null) {
            return;
        }
        linkedBlockingQueue.clear();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxSize() {
        return this.maxSize;
    }

    @NotNull
    public final LinkedBlockingQueue<Object> component3() {
        return this.queue;
    }

    @NotNull
    public final CacheWrap copy(int total, int maxSize, @NotNull LinkedBlockingQueue<Object> queue) {
        return new CacheWrap(total, maxSize, queue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CacheWrap)) {
            return false;
        }
        CacheWrap cacheWrap = (CacheWrap) other;
        return this.total == cacheWrap.total && this.maxSize == cacheWrap.maxSize && Intrinsics.areEqual(this.queue, cacheWrap.queue);
    }

    public final int getMaxSize() {
        return this.maxSize;
    }

    @NotNull
    public final LinkedBlockingQueue<Object> getQueue() {
        return this.queue;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (((this.total * 31) + this.maxSize) * 31) + this.queue.hashCode();
    }

    @Nullable
    public final Object poll() {
        Object objPoll = this.queue.poll();
        if (objPoll == null) {
            return null;
        }
        if (!(objPoll instanceof WrapBuffer)) {
            return objPoll;
        }
        setTotal(getTotal() - ((WrapBuffer) objPoll).getSize());
        return objPoll;
    }

    public final void push(@NotNull Object data, int size) throws InterruptedException {
        int length;
        if (this.total + size > this.maxSize) {
            Object obj = null;
            do {
                Object objPoll = this.queue.poll();
                if (objPoll == null) {
                    objPoll = null;
                } else {
                    obj = objPoll;
                }
                if (objPoll == null || !(obj instanceof WrapBuffer)) {
                    break;
                }
                length = this.total - ((WrapBuffer) obj).getBytes().length;
                this.total = length;
            } while (length + size > this.maxSize);
        }
        this.total += size;
        this.queue.put(data);
    }

    public final void setTotal(int i) {
        this.total = i;
    }

    @NotNull
    public String toString() {
        return "CacheWrap(total=" + this.total + ", maxSize=" + this.maxSize + ", queue=" + this.queue + ")";
    }

    public /* synthetic */ CacheWrap(int i, int i2, LinkedBlockingQueue linkedBlockingQueue, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, i2, linkedBlockingQueue);
    }
}
