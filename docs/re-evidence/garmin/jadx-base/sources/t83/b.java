package t83;

import j20.x;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes11.dex */
public final class b<E> extends a<E> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Integer f163174g = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f163175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f163176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicLong f163177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f163178f;

    public b(int i14) {
        super(i14);
        this.f163175c = new AtomicLong();
        this.f163177e = new AtomicLong();
        this.f163178f = Math.min(i14 / 4, f163174g.intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f163175c.get() == this.f163177e.get();
    }

    @Override // java.util.Queue
    public final boolean offer(E e4) {
        if (e4 == null) {
            x.l("Null is not a valid element");
            return false;
        }
        AtomicLong atomicLong = this.f163175c;
        long j8 = atomicLong.get();
        int i14 = this.f163173b;
        int i15 = ((int) j8) & i14;
        long j14 = this.f163176d;
        AtomicReferenceArray<E> atomicReferenceArray = this.f163172a;
        if (j8 >= j14) {
            long j15 = ((long) this.f163178f) + j8;
            if (atomicReferenceArray.get(i14 & ((int) j15)) == null) {
                this.f163176d = j15;
            } else if (atomicReferenceArray.get(i15) != null) {
                return false;
            }
        }
        atomicReferenceArray.lazySet(i15, e4);
        atomicLong.lazySet(j8 + 1);
        return true;
    }

    @Override // java.util.Queue
    public final E peek() {
        return this.f163172a.get(((int) this.f163177e.get()) & this.f163173b);
    }

    @Override // java.util.Queue
    public final E poll() {
        AtomicLong atomicLong = this.f163177e;
        long j8 = atomicLong.get();
        int i14 = ((int) j8) & this.f163173b;
        AtomicReferenceArray<E> atomicReferenceArray = this.f163172a;
        E e4 = atomicReferenceArray.get(i14);
        if (e4 == null) {
            return null;
        }
        atomicReferenceArray.lazySet(i14, null);
        atomicLong.lazySet(j8 + 1);
        return e4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        AtomicLong atomicLong = this.f163177e;
        long j8 = atomicLong.get();
        while (true) {
            long j14 = this.f163175c.get();
            long j15 = atomicLong.get();
            if (j8 == j15) {
                return (int) (j14 - j15);
            }
            j8 = j15;
        }
    }
}
