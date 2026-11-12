package u53;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lu53/s;", "T", "", "", "initialLength", "<init>", "(I)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "array", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s<T> {
    private volatile AtomicReferenceArray<T> array;

    public s(int i14) {
        this.array = new AtomicReferenceArray<>(i14);
    }

    public final int a() {
        return this.array.length();
    }

    public final T b(int i14) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i14 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i14);
        }
        return null;
    }

    public final void c(int i14, x53.a.c cVar) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i14 < length) {
            atomicReferenceArray.set(i14, cVar);
            return;
        }
        int i15 = i14 + 1;
        int i16 = length * 2;
        if (i15 < i16) {
            i15 = i16;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(i15);
        for (int i17 = 0; i17 < length; i17++) {
            atomicReferenceArray2.set(i17, atomicReferenceArray.get(i17));
        }
        atomicReferenceArray2.set(i14, cVar);
        this.array = atomicReferenceArray2;
    }
}
