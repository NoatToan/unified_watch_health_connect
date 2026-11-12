package io.netty.util;

import io.netty.util.concurrent.FastThreadLocal;
import io.netty.util.internal.MathUtil;
import io.netty.util.internal.ObjectPool;
import io.netty.util.internal.SystemPropertyUtil;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes22.dex */
public abstract class Recycler<T> {
    private static final int DEFAULT_INITIAL_MAX_CAPACITY_PER_THREAD = 4096;
    private static final int DEFAULT_MAX_CAPACITY_PER_THREAD;
    private static final int DELAYED_QUEUE_RATIO;
    private static final FastThreadLocal<Map<Stack<?>, WeakOrderQueue>> DELAYED_RECYCLED;
    private static final AtomicInteger ID_GENERATOR;
    private static final int INITIAL_CAPACITY;
    private static final int LINK_CAPACITY;
    private static final int MAX_DELAYED_QUEUES_PER_THREAD;
    private static final int MAX_SHARED_CAPACITY_FACTOR;
    private static final Handle NOOP_HANDLE;
    private static final int OWN_THREAD_ID;
    private static final int RATIO;
    private static final InternalLogger logger;
    private final int delayedQueueInterval;
    private final int interval;
    private final int maxCapacityPerThread;
    private final int maxDelayedQueuesPerThread;
    private final int maxSharedCapacityFactor;
    private final FastThreadLocal<Stack<T>> threadLocal;

    public static final class DefaultHandle<T> implements Handle<T> {
        private static final AtomicIntegerFieldUpdater<DefaultHandle<?>> LAST_RECYCLED_ID_UPDATER = AtomicIntegerFieldUpdater.newUpdater(DefaultHandle.class, "lastRecycledId");
        public boolean hasBeenRecycled;
        public volatile int lastRecycledId;
        public int recycleId;
        public Stack<?> stack;
        public Object value;

        public DefaultHandle(Stack<?> stack) {
            this.stack = stack;
        }

        public boolean compareAndSetLastRecycledId(int i, int i2) {
            return LAST_RECYCLED_ID_UPDATER.weakCompareAndSet(this, i, i2);
        }

        @Override // io.netty.util.internal.ObjectPool.Handle
        public void recycle(Object obj) {
            if (obj != this.value) {
                throw new IllegalArgumentException("object does not belong to handle");
            }
            Stack<?> stack = this.stack;
            if (this.lastRecycledId != this.recycleId || stack == null) {
                throw new IllegalStateException("recycled already");
            }
            stack.push(this);
        }
    }

    public interface Handle<T> extends ObjectPool.Handle<T> {
    }

    public static final class Stack<T> {
        public final AtomicInteger availableSharedCapacity;
        private WeakOrderQueue cursor;
        private final int delayedQueueInterval;
        public DefaultHandle<?>[] elements;
        private int handleRecycleCount;
        private volatile WeakOrderQueue head;
        private final int interval;
        private final int maxCapacity;
        private final int maxDelayedQueues;
        public final Recycler<T> parent;
        private WeakOrderQueue prev;
        public int size;
        public final WeakReference<Thread> threadRef;

        public Stack(Recycler<T> recycler, Thread thread, int i, int i2, int i3, int i4, int i5) {
            this.parent = recycler;
            this.threadRef = new WeakReference<>(thread);
            this.maxCapacity = i;
            this.availableSharedCapacity = new AtomicInteger(Math.max(i / i2, Recycler.LINK_CAPACITY));
            this.elements = new DefaultHandle[Math.min(Recycler.INITIAL_CAPACITY, i)];
            this.interval = i3;
            this.delayedQueueInterval = i5;
            this.handleRecycleCount = i3;
            this.maxDelayedQueues = i4;
        }

        private WeakOrderQueue newWeakOrderQueue(Thread thread) {
            return WeakOrderQueue.newQueue(this, thread);
        }

        private void pushLater(DefaultHandle<?> defaultHandle, Thread thread) {
            if (this.maxDelayedQueues == 0) {
                return;
            }
            Map map = (Map) Recycler.DELAYED_RECYCLED.get();
            WeakOrderQueue weakOrderQueueNewWeakOrderQueue = (WeakOrderQueue) map.get(this);
            if (weakOrderQueueNewWeakOrderQueue == null) {
                if (map.size() >= this.maxDelayedQueues) {
                    map.put(this, WeakOrderQueue.DUMMY);
                    return;
                }
                weakOrderQueueNewWeakOrderQueue = newWeakOrderQueue(thread);
                if (weakOrderQueueNewWeakOrderQueue == null) {
                    return;
                } else {
                    map.put(this, weakOrderQueueNewWeakOrderQueue);
                }
            } else if (weakOrderQueueNewWeakOrderQueue == WeakOrderQueue.DUMMY) {
                return;
            }
            weakOrderQueueNewWeakOrderQueue.add(defaultHandle);
        }

        private void pushNow(DefaultHandle<?> defaultHandle) {
            if (defaultHandle.recycleId != 0 || !defaultHandle.compareAndSetLastRecycledId(0, Recycler.OWN_THREAD_ID)) {
                throw new IllegalStateException("recycled already");
            }
            defaultHandle.recycleId = Recycler.OWN_THREAD_ID;
            int i = this.size;
            if (i >= this.maxCapacity || dropHandle(defaultHandle)) {
                return;
            }
            DefaultHandle<?>[] defaultHandleArr = this.elements;
            if (i == defaultHandleArr.length) {
                this.elements = (DefaultHandle[]) Arrays.copyOf(defaultHandleArr, Math.min(i << 1, this.maxCapacity));
            }
            this.elements[i] = defaultHandle;
            this.size = i + 1;
        }

        private boolean scavenge() {
            if (scavengeSome()) {
                return true;
            }
            this.prev = null;
            this.cursor = this.head;
            return false;
        }

        private boolean scavengeSome() {
            WeakOrderQueue weakOrderQueue;
            boolean z;
            WeakOrderQueue weakOrderQueue2 = this.cursor;
            boolean z2 = false;
            if (weakOrderQueue2 == null) {
                WeakOrderQueue weakOrderQueue3 = this.head;
                if (weakOrderQueue3 == null) {
                    return false;
                }
                weakOrderQueue = null;
                weakOrderQueue2 = weakOrderQueue3;
            } else {
                weakOrderQueue = this.prev;
            }
            while (true) {
                z = true;
                if (weakOrderQueue2.transfer(this)) {
                    break;
                }
                WeakOrderQueue next = weakOrderQueue2.getNext();
                if (weakOrderQueue2.get() == null) {
                    if (weakOrderQueue2.hasFinalData()) {
                        while (weakOrderQueue2.transfer(this)) {
                            z2 = true;
                        }
                    }
                    if (weakOrderQueue != null) {
                        weakOrderQueue2.reclaimAllSpaceAndUnlink();
                        weakOrderQueue.setNext(next);
                    }
                } else {
                    weakOrderQueue = weakOrderQueue2;
                }
                if (next == null || z2) {
                    z = z2;
                    weakOrderQueue2 = next;
                    break;
                }
                weakOrderQueue2 = next;
            }
            this.prev = weakOrderQueue;
            this.cursor = weakOrderQueue2;
            return z;
        }

        public boolean dropHandle(DefaultHandle<?> defaultHandle) {
            if (!defaultHandle.hasBeenRecycled) {
                int i = this.handleRecycleCount;
                if (i < this.interval) {
                    this.handleRecycleCount = i + 1;
                    return true;
                }
                this.handleRecycleCount = 0;
                defaultHandle.hasBeenRecycled = true;
            }
            return false;
        }

        public int increaseCapacity(int i) {
            int length = this.elements.length;
            int i2 = this.maxCapacity;
            do {
                length <<= 1;
                if (length >= i) {
                    break;
                }
            } while (length < i2);
            int iMin = Math.min(length, i2);
            DefaultHandle<?>[] defaultHandleArr = this.elements;
            if (iMin != defaultHandleArr.length) {
                this.elements = (DefaultHandle[]) Arrays.copyOf(defaultHandleArr, iMin);
            }
            return iMin;
        }

        public DefaultHandle<T> newHandle() {
            return new DefaultHandle<>(this);
        }

        public DefaultHandle<T> pop() {
            int i = this.size;
            if (i == 0 && (!scavenge() || (i = this.size) <= 0)) {
                return null;
            }
            int i2 = i - 1;
            Object[] objArr = this.elements;
            DefaultHandle<T> defaultHandle = (DefaultHandle<T>) objArr[i2];
            objArr[i2] = null;
            this.size = i2;
            if (defaultHandle.lastRecycledId != defaultHandle.recycleId) {
                throw new IllegalStateException("recycled multiple times");
            }
            defaultHandle.recycleId = 0;
            defaultHandle.lastRecycledId = 0;
            return defaultHandle;
        }

        public void push(DefaultHandle<?> defaultHandle) {
            Thread threadCurrentThread = Thread.currentThread();
            if (this.threadRef.get() == threadCurrentThread) {
                pushNow(defaultHandle);
            } else {
                pushLater(defaultHandle, threadCurrentThread);
            }
        }

        public synchronized void setHead(WeakOrderQueue weakOrderQueue) {
            weakOrderQueue.setNext(this.head);
            this.head = weakOrderQueue;
        }
    }

    static {
        InternalLogger internalLoggerFactory = InternalLoggerFactory.getInstance((Class<?>) Recycler.class);
        logger = internalLoggerFactory;
        NOOP_HANDLE = new Handle() { // from class: io.netty.util.Recycler.1
            @Override // io.netty.util.internal.ObjectPool.Handle
            public void recycle(Object obj) {
            }
        };
        AtomicInteger atomicInteger = new AtomicInteger(Integer.MIN_VALUE);
        ID_GENERATOR = atomicInteger;
        OWN_THREAD_ID = atomicInteger.getAndIncrement();
        int i = SystemPropertyUtil.getInt("io.netty.recycler.maxCapacityPerThread", SystemPropertyUtil.getInt("io.netty.recycler.maxCapacity", 4096));
        int i2 = i >= 0 ? i : 4096;
        DEFAULT_MAX_CAPACITY_PER_THREAD = i2;
        int iMax = Math.max(2, SystemPropertyUtil.getInt("io.netty.recycler.maxSharedCapacityFactor", 2));
        MAX_SHARED_CAPACITY_FACTOR = iMax;
        MAX_DELAYED_QUEUES_PER_THREAD = Math.max(0, SystemPropertyUtil.getInt("io.netty.recycler.maxDelayedQueuesPerThread", NettyRuntime.availableProcessors() * 2));
        int iSafeFindNextPositivePowerOfTwo = MathUtil.safeFindNextPositivePowerOfTwo(Math.max(SystemPropertyUtil.getInt("io.netty.recycler.linkCapacity", 16), 16));
        LINK_CAPACITY = iSafeFindNextPositivePowerOfTwo;
        int iMax2 = Math.max(0, SystemPropertyUtil.getInt("io.netty.recycler.ratio", 8));
        RATIO = iMax2;
        int iMax3 = Math.max(0, SystemPropertyUtil.getInt("io.netty.recycler.delayedQueue.ratio", iMax2));
        DELAYED_QUEUE_RATIO = iMax3;
        INITIAL_CAPACITY = Math.min(i2, 256);
        if (internalLoggerFactory.isDebugEnabled()) {
            if (i2 == 0) {
                internalLoggerFactory.debug("-Dio.netty.recycler.maxCapacityPerThread: disabled");
                internalLoggerFactory.debug("-Dio.netty.recycler.maxSharedCapacityFactor: disabled");
                internalLoggerFactory.debug("-Dio.netty.recycler.linkCapacity: disabled");
                internalLoggerFactory.debug("-Dio.netty.recycler.ratio: disabled");
                internalLoggerFactory.debug("-Dio.netty.recycler.delayedQueue.ratio: disabled");
            } else {
                internalLoggerFactory.debug("-Dio.netty.recycler.maxCapacityPerThread: {}", Integer.valueOf(i2));
                internalLoggerFactory.debug("-Dio.netty.recycler.maxSharedCapacityFactor: {}", Integer.valueOf(iMax));
                internalLoggerFactory.debug("-Dio.netty.recycler.linkCapacity: {}", Integer.valueOf(iSafeFindNextPositivePowerOfTwo));
                internalLoggerFactory.debug("-Dio.netty.recycler.ratio: {}", Integer.valueOf(iMax2));
                internalLoggerFactory.debug("-Dio.netty.recycler.delayedQueue.ratio: {}", Integer.valueOf(iMax3));
            }
        }
        DELAYED_RECYCLED = new FastThreadLocal<Map<Stack<?>, WeakOrderQueue>>() { // from class: io.netty.util.Recycler.3
            @Override // io.netty.util.concurrent.FastThreadLocal
            public Map<Stack<?>, WeakOrderQueue> initialValue() {
                return new WeakHashMap();
            }
        };
    }

    public Recycler() {
        this(DEFAULT_MAX_CAPACITY_PER_THREAD);
    }

    public final T get() {
        if (this.maxCapacityPerThread == 0) {
            return newObject(NOOP_HANDLE);
        }
        Stack<T> stack = this.threadLocal.get();
        DefaultHandle<T> defaultHandlePop = stack.pop();
        if (defaultHandlePop == null) {
            defaultHandlePop = stack.newHandle();
            defaultHandlePop.value = newObject(defaultHandlePop);
        }
        return (T) defaultHandlePop.value;
    }

    public abstract T newObject(Handle<T> handle);

    @Deprecated
    public final boolean recycle(T t, Handle<T> handle) {
        if (handle == NOOP_HANDLE) {
            return false;
        }
        DefaultHandle defaultHandle = (DefaultHandle) handle;
        if (defaultHandle.stack.parent != this) {
            return false;
        }
        defaultHandle.recycle(t);
        return true;
    }

    public final int threadLocalCapacity() {
        return this.threadLocal.get().elements.length;
    }

    public final int threadLocalSize() {
        return this.threadLocal.get().size;
    }

    public Recycler(int i) {
        this(i, MAX_SHARED_CAPACITY_FACTOR);
    }

    public Recycler(int i, int i2) {
        this(i, i2, RATIO, MAX_DELAYED_QUEUES_PER_THREAD);
    }

    public static final class WeakOrderQueue extends WeakReference<Thread> {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public static final WeakOrderQueue DUMMY = new WeakOrderQueue();
        private int handleRecycleCount;
        private final Head head;
        private final int id;
        private final int interval;
        private WeakOrderQueue next;
        private Link tail;

        public static final class Head {
            private final AtomicInteger availableSharedCapacity;
            public Link link;

            public Head(AtomicInteger atomicInteger) {
                this.availableSharedCapacity = atomicInteger;
            }

            private void reclaimSpace(int i) {
                this.availableSharedCapacity.addAndGet(i);
            }

            public static boolean reserveSpaceForLink(AtomicInteger atomicInteger) {
                int i;
                do {
                    i = atomicInteger.get();
                    if (i < Recycler.LINK_CAPACITY) {
                        return false;
                    }
                } while (!atomicInteger.compareAndSet(i, i - Recycler.LINK_CAPACITY));
                return true;
            }

            public Link newLink() {
                if (reserveSpaceForLink(this.availableSharedCapacity)) {
                    return new Link();
                }
                return null;
            }

            public void reclaimAllSpaceAndUnlink() {
                Link link = this.link;
                this.link = null;
                int i = 0;
                while (link != null) {
                    i += Recycler.LINK_CAPACITY;
                    Link link2 = link.next;
                    link.next = null;
                    link = link2;
                }
                if (i > 0) {
                    reclaimSpace(i);
                }
            }

            public void relink(Link link) {
                reclaimSpace(Recycler.LINK_CAPACITY);
                this.link = link;
            }
        }

        public static final class Link extends AtomicInteger {
            public final DefaultHandle<?>[] elements = new DefaultHandle[Recycler.LINK_CAPACITY];
            public Link next;
            public int readIndex;
        }

        private WeakOrderQueue() {
            super(null);
            this.id = Recycler.ID_GENERATOR.getAndIncrement();
            this.head = new Head(null);
            this.interval = 0;
        }

        public static WeakOrderQueue newQueue(Stack<?> stack, Thread thread) {
            if (!Head.reserveSpaceForLink(stack.availableSharedCapacity)) {
                return null;
            }
            WeakOrderQueue weakOrderQueue = new WeakOrderQueue(stack, thread);
            stack.setHead(weakOrderQueue);
            return weakOrderQueue;
        }

        public void add(DefaultHandle<?> defaultHandle) {
            if (defaultHandle.compareAndSetLastRecycledId(0, this.id)) {
                if (!defaultHandle.hasBeenRecycled) {
                    int i = this.handleRecycleCount;
                    if (i < this.interval) {
                        this.handleRecycleCount = i + 1;
                        return;
                    }
                    this.handleRecycleCount = 0;
                }
                Link link = this.tail;
                int i2 = link.get();
                if (i2 == Recycler.LINK_CAPACITY) {
                    Link linkNewLink = this.head.newLink();
                    if (linkNewLink == null) {
                        return;
                    }
                    link.next = linkNewLink;
                    this.tail = linkNewLink;
                    i2 = linkNewLink.get();
                    link = linkNewLink;
                }
                link.elements[i2] = defaultHandle;
                defaultHandle.stack = null;
                link.lazySet(i2 + 1);
            }
        }

        public WeakOrderQueue getNext() {
            return this.next;
        }

        public boolean hasFinalData() {
            Link link = this.tail;
            return link.readIndex != link.get();
        }

        public void reclaimAllSpaceAndUnlink() {
            this.head.reclaimAllSpaceAndUnlink();
            this.next = null;
        }

        public void setNext(WeakOrderQueue weakOrderQueue) {
            this.next = weakOrderQueue;
        }

        public boolean transfer(Stack<?> stack) {
            Link link;
            Link link2 = this.head.link;
            if (link2 == null) {
                return false;
            }
            if (link2.readIndex == Recycler.LINK_CAPACITY) {
                link2 = link2.next;
                if (link2 == null) {
                    return false;
                }
                this.head.relink(link2);
            }
            int i = link2.readIndex;
            int iMin = link2.get();
            int i2 = iMin - i;
            if (i2 == 0) {
                return false;
            }
            int i3 = stack.size;
            int i4 = i2 + i3;
            if (i4 > stack.elements.length) {
                iMin = Math.min((stack.increaseCapacity(i4) + i) - i3, iMin);
            }
            if (i == iMin) {
                return false;
            }
            DefaultHandle<?>[] defaultHandleArr = link2.elements;
            DefaultHandle<?>[] defaultHandleArr2 = stack.elements;
            while (i < iMin) {
                DefaultHandle<?> defaultHandle = defaultHandleArr[i];
                int i5 = defaultHandle.recycleId;
                if (i5 == 0) {
                    defaultHandle.recycleId = defaultHandle.lastRecycledId;
                } else if (i5 != defaultHandle.lastRecycledId) {
                    throw new IllegalStateException("recycled already");
                }
                defaultHandleArr[i] = null;
                if (!stack.dropHandle(defaultHandle)) {
                    defaultHandle.stack = stack;
                    defaultHandleArr2[i3] = defaultHandle;
                    i3++;
                }
                i++;
            }
            if (iMin == Recycler.LINK_CAPACITY && (link = link2.next) != null) {
                this.head.relink(link);
            }
            link2.readIndex = iMin;
            if (stack.size == i3) {
                return false;
            }
            stack.size = i3;
            return true;
        }

        private WeakOrderQueue(Stack<?> stack, Thread thread) {
            super(thread);
            this.id = Recycler.ID_GENERATOR.getAndIncrement();
            this.tail = new Link();
            Head head = new Head(stack.availableSharedCapacity);
            this.head = head;
            head.link = this.tail;
            int i = ((Stack) stack).delayedQueueInterval;
            this.interval = i;
            this.handleRecycleCount = i;
        }
    }

    public Recycler(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, DELAYED_QUEUE_RATIO);
    }

    public Recycler(int i, int i2, int i3, int i4, int i5) {
        this.threadLocal = new FastThreadLocal<Stack<T>>() { // from class: io.netty.util.Recycler.2
            @Override // io.netty.util.concurrent.FastThreadLocal
            public Stack<T> initialValue() {
                return new Stack<>(Recycler.this, Thread.currentThread(), Recycler.this.maxCapacityPerThread, Recycler.this.maxSharedCapacityFactor, Recycler.this.interval, Recycler.this.maxDelayedQueuesPerThread, Recycler.this.delayedQueueInterval);
            }

            @Override // io.netty.util.concurrent.FastThreadLocal
            public void onRemoval(Stack<T> stack) {
                if (stack.threadRef.get() == Thread.currentThread() && Recycler.DELAYED_RECYCLED.isSet()) {
                    ((Map) Recycler.DELAYED_RECYCLED.get()).remove(stack);
                }
            }
        };
        this.interval = Math.max(0, i3);
        this.delayedQueueInterval = Math.max(0, i5);
        if (i <= 0) {
            this.maxCapacityPerThread = 0;
            this.maxSharedCapacityFactor = 1;
            this.maxDelayedQueuesPerThread = 0;
        } else {
            this.maxCapacityPerThread = i;
            this.maxSharedCapacityFactor = Math.max(1, i2);
            this.maxDelayedQueuesPerThread = Math.max(0, i4);
        }
    }
}
