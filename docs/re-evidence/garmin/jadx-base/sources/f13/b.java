package f13;

import j20.x;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import x03.g;

/* JADX INFO: loaded from: classes3.dex */
public final class b<T> implements g<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f68132i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f68133j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f68134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f68136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f68137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AtomicReferenceArray<Object> f68138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f68139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AtomicReferenceArray<Object> f68140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicLong f68141h;

    public b(int i14) {
        AtomicLong atomicLong = new AtomicLong();
        this.f68134a = atomicLong;
        this.f68141h = new AtomicLong();
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i14) - 1));
        int i15 = iNumberOfLeadingZeros - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iNumberOfLeadingZeros + 1);
        this.f68138e = atomicReferenceArray;
        this.f68137d = i15;
        this.f68135b = Math.min(iNumberOfLeadingZeros / 4, f68132i);
        this.f68140g = atomicReferenceArray;
        this.f68139f = i15;
        this.f68136c = iNumberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
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
        return this.f68134a.get() == this.f68141h.get();
    }

    @Override // x03.h
    public final boolean offer(T t7) {
        if (t7 == null) {
            x.l("Null is not a valid element");
            return false;
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.f68138e;
        AtomicLong atomicLong = this.f68134a;
        long j8 = atomicLong.get();
        int i14 = this.f68137d;
        int i15 = ((int) j8) & i14;
        if (j8 < this.f68136c) {
            atomicReferenceArray.lazySet(i15, t7);
            atomicLong.lazySet(j8 + 1);
            return true;
        }
        long j14 = ((long) this.f68135b) + j8;
        if (atomicReferenceArray.get(((int) j14) & i14) == null) {
            this.f68136c = j14 - 1;
            atomicReferenceArray.lazySet(i15, t7);
            atomicLong.lazySet(j8 + 1);
            return true;
        }
        long j15 = j8 + 1;
        if (atomicReferenceArray.get(((int) j15) & i14) == null) {
            atomicReferenceArray.lazySet(i15, t7);
            atomicLong.lazySet(j15);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f68138e = atomicReferenceArray2;
        this.f68136c = (j8 + ((long) i14)) - 1;
        atomicReferenceArray2.lazySet(i15, t7);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i15, f68133j);
        atomicLong.lazySet(j15);
        return true;
    }

    @Override // x03.h
    public final T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f68140g;
        AtomicLong atomicLong = this.f68141h;
        long j8 = atomicLong.get();
        int i14 = this.f68139f;
        int i15 = ((int) j8) & i14;
        T t7 = (T) atomicReferenceArray.get(i15);
        boolean z14 = t7 == f68133j;
        if (t7 != null && !z14) {
            atomicReferenceArray.lazySet(i15, null);
            atomicLong.lazySet(j8 + 1);
            return t7;
        }
        if (!z14) {
            return null;
        }
        int i16 = i14 + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i16);
        atomicReferenceArray.lazySet(i16, null);
        this.f68140g = atomicReferenceArray2;
        T t14 = (T) atomicReferenceArray2.get(i15);
        if (t14 != null) {
            atomicReferenceArray2.lazySet(i15, null);
            atomicLong.lazySet(j8 + 1);
        }
        return t14;
    }
}
