package com.xiaomi.fitness.common.concurrent;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011J%\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016¢\u0006\u0002\u0010\u0016J\r\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J\u001d\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0004H\u0016J\u0015\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\fJ\u0016\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\fJ\u0018\u0010\u001e\u001a\u00020\u00042\u000e\u0010\u001f\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000 H\u0016J \u0010\u001e\u001a\u00020\u00042\u000e\u0010\u001f\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000 2\u0006\u0010!\u001a\u00020\u0004H\u0016J\r\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0018J\r\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J\u000f\u0010\"\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u0018J\b\u0010#\u001a\u00020\nH\u0016J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0096\u0002J\u0016\u0010&\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016J\u0016\u0010)\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016J\u0016\u0010*\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016J\u0016\u0010+\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016J\b\u0010,\u001a\u00020\u0010H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/common/concurrent/StackBlockingQueue;", "T", "Ljava/util/concurrent/BlockingQueue;", "capacity", "", "<init>", "(I)V", "mBlockingQueue", "Ljava/util/concurrent/LinkedBlockingDeque;", "add", "", "element", "(Ljava/lang/Object;)Z", "offer", DeviceTagInterface.CUSTOM_TAG_TYPE, LifecycleConstantKt.ACTION_PUT, "", "(Ljava/lang/Object;)V", "timeout", "", "unit", "Ljava/util/concurrent/TimeUnit;", "(Ljava/lang/Object;JLjava/util/concurrent/TimeUnit;)Z", "take", "()Ljava/lang/Object;", "poll", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "remainingCapacity", "remove", "contains", "drainTo", PluginDeviceInfo.FICONON, "", "maxElements", "peek", "isEmpty", "iterator", "", "containsAll", "elements", "", "addAll", "removeAll", "retainAll", CervicalMucusRecord.Appearance.CLEAR, MediaStoreUtil.MediaInfo.SIZE, "getSize", "()I", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StackBlockingQueue<T> implements BlockingQueue<T> {

    @NotNull
    private final LinkedBlockingDeque<T> mBlockingQueue;

    public StackBlockingQueue() {
        this(0, 1, null);
    }

    @Override // java.util.concurrent.BlockingQueue, java.util.Queue, java.util.Collection
    public boolean add(T element) {
        this.mBlockingQueue.addFirst(element);
        return true;
    }

    @Override // java.util.Collection
    public boolean addAll(@NotNull Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements == this) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Iterator<? extends T> it = elements.iterator();
        boolean z = false;
        while (it.hasNext()) {
            this.mBlockingQueue.addFirst(it.next());
            z = true;
        }
        return z;
    }

    @Override // java.util.Collection
    public void clear() {
        this.mBlockingQueue.clear();
    }

    @Override // java.util.concurrent.BlockingQueue, java.util.Collection
    public boolean contains(Object element) {
        return this.mBlockingQueue.contains(element);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.mBlockingQueue.containsAll(elements);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(@NotNull Collection<? super T> c) {
        Intrinsics.checkNotNullParameter(c, "c");
        return this.mBlockingQueue.drainTo(c);
    }

    @Override // java.util.Queue
    public T element() {
        return this.mBlockingQueue.element();
    }

    public int getSize() {
        return this.mBlockingQueue.size();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.mBlockingQueue.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        Iterator<T> it = this.mBlockingQueue.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        return it;
    }

    @Override // java.util.concurrent.BlockingQueue, java.util.Queue
    public boolean offer(T t) {
        return this.mBlockingQueue.offerFirst(t);
    }

    @Override // java.util.Queue
    @Nullable
    public T peek() {
        return this.mBlockingQueue.peekFirst();
    }

    @Override // java.util.concurrent.BlockingQueue
    public T poll(long timeout, @NotNull TimeUnit unit) throws InterruptedException {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.mBlockingQueue.pollLast(timeout, unit);
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(T t) throws InterruptedException {
        this.mBlockingQueue.putFirst(t);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return this.mBlockingQueue.remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingQueue, java.util.Collection
    public boolean remove(Object element) {
        return this.mBlockingQueue.remove(element);
    }

    @Override // java.util.Collection
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.mBlockingQueue.removeAll(elements);
    }

    @Override // java.util.Collection
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.mBlockingQueue.retainAll(elements);
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.concurrent.BlockingQueue
    public T take() throws InterruptedException {
        return this.mBlockingQueue.takeFirst();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public StackBlockingQueue(int i) {
        this.mBlockingQueue = new LinkedBlockingDeque<>(i);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(@NotNull Collection<? super T> c, int maxElements) {
        Intrinsics.checkNotNullParameter(c, "c");
        return this.mBlockingQueue.drainTo(c, maxElements);
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(T t, long timeout, @NotNull TimeUnit unit) throws InterruptedException {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.mBlockingQueue.offerFirst(t, timeout, unit);
    }

    @Override // java.util.Queue
    @Nullable
    public T poll() {
        return this.mBlockingQueue.pollLast();
    }

    @Override // java.util.Queue
    public T remove() {
        return this.mBlockingQueue.removeFirst();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }

    public /* synthetic */ StackBlockingQueue(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Integer.MAX_VALUE : i);
    }
}
