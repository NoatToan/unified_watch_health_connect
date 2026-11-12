package w63;

import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw63/d0;", "", "<init>", "()V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f183343a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f183344b = 65536;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f183345c = new c0(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f183346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReference<c0>[] f183347e;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f183346d = iHighestOneBit;
        AtomicReference<c0>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i14 = 0; i14 < iHighestOneBit; i14++) {
            atomicReferenceArr[i14] = new AtomicReference<>();
        }
        f183347e = atomicReferenceArr;
    }

    private d0() {
    }

    public static final void a(c0 c0Var) {
        c0Var.getClass();
        if (c0Var.f183341f != null || c0Var.f183342g != null) {
            vb.h.s("Failed requirement.");
            return;
        }
        if (c0Var.f183339d) {
            return;
        }
        f183343a.getClass();
        AtomicReference<c0> atomicReference = f183347e[(int) (Thread.currentThread().getId() & (((long) f183346d) - 1))];
        c0 c0Var2 = f183345c;
        c0 andSet = atomicReference.getAndSet(c0Var2);
        if (andSet == c0Var2) {
            return;
        }
        int i14 = andSet != null ? andSet.f183338c : 0;
        if (i14 >= f183344b) {
            atomicReference.set(andSet);
            return;
        }
        c0Var.f183341f = andSet;
        c0Var.f183337b = 0;
        c0Var.f183338c = i14 + 8192;
        atomicReference.set(c0Var);
    }

    public static final c0 b() {
        f183343a.getClass();
        AtomicReference<c0> atomicReference = f183347e[(int) (Thread.currentThread().getId() & (((long) f183346d) - 1))];
        c0 c0Var = f183345c;
        c0 andSet = atomicReference.getAndSet(c0Var);
        if (andSet == c0Var) {
            return new c0();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new c0();
        }
        atomicReference.set(andSet.f183341f);
        andSet.f183341f = null;
        andSet.f183338c = 0;
        return andSet;
    }
}
