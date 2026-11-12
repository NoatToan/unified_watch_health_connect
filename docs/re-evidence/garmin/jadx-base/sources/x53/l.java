package x53;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004R\u000b\u0010\u0007\u001a\u00020\u00018\u0002X\u0082\u0004R\u000b\u0010\b\u001a\u00020\u00018\u0002X\u0082\u0004R\u000b\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¨\u0006\n"}, d2 = {"Lx53/l;", "", "<init>", "()V", "Lh53/b;", "Lx53/h;", "lastScheduledTask", "producerIndex", "consumerIndex", "blockingTasksInBuffer", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f189167b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f189168c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f189169d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f189170e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray<h> f189171a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final h a(h hVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f189168c;
        if (atomicIntegerFieldUpdater.get(this) - f189169d.get(this) == 127) {
            return hVar;
        }
        if (hVar.f189158b) {
            f189170e.incrementAndGet(this);
        }
        int i14 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray<h> atomicReferenceArray = this.f189171a;
            if (atomicReferenceArray.get(i14) == null) {
                atomicReferenceArray.lazySet(i14, hVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final h b() {
        h andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f189169d;
            int i14 = atomicIntegerFieldUpdater.get(this);
            if (i14 - f189168c.get(this) == 0) {
                return null;
            }
            int i15 = i14 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i14, i14 + 1) && (andSet = this.f189171a.getAndSet(i15, null)) != null) {
                if (andSet.f189158b) {
                    f189170e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final h c(int i14, boolean z14) {
        int i15 = i14 & 127;
        AtomicReferenceArray<h> atomicReferenceArray = this.f189171a;
        h hVar = atomicReferenceArray.get(i15);
        if (hVar != null && hVar.f189158b == z14) {
            while (!atomicReferenceArray.compareAndSet(i15, hVar, null)) {
                if (atomicReferenceArray.get(i15) != hVar) {
                }
            }
            if (z14) {
                f189170e.decrementAndGet(this);
            }
            return hVar;
        }
        return null;
    }
}
