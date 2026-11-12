package f13;

import j20.x;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import x03.g;

/* JADX INFO: loaded from: classes3.dex */
public final class a<E> extends AtomicReferenceArray<E> implements g<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Integer f68126f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f68128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f68129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f68130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f68131e;

    public a(int i14) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i14 - 1)));
        this.f68127a = length() - 1;
        this.f68128b = new AtomicLong();
        this.f68130d = new AtomicLong();
        this.f68131e = Math.min(i14 / 4, f68126f.intValue());
    }

    @Override // x03.h
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // x03.h
    public final boolean isEmpty() {
        return this.f68128b.get() == this.f68130d.get();
    }

    @Override // x03.h
    public final boolean offer(E e4) {
        if (e4 == null) {
            x.l("Null is not a valid element");
            return false;
        }
        AtomicLong atomicLong = this.f68128b;
        long j8 = atomicLong.get();
        int i14 = this.f68127a;
        int i15 = ((int) j8) & i14;
        if (j8 >= this.f68129c) {
            long j14 = ((long) this.f68131e) + j8;
            if (get(i14 & ((int) j14)) == null) {
                this.f68129c = j14;
            } else if (get(i15) != null) {
                return false;
            }
        }
        lazySet(i15, e4);
        atomicLong.lazySet(j8 + 1);
        return true;
    }

    @Override // x03.h
    public final E poll() {
        AtomicLong atomicLong = this.f68130d;
        long j8 = atomicLong.get();
        int i14 = ((int) j8) & this.f68127a;
        E e4 = get(i14);
        if (e4 == null) {
            return null;
        }
        atomicLong.lazySet(j8 + 1);
        lazySet(i14, null);
        return e4;
    }
}
