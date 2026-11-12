package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin(version = "1.3")
final class UIntProgressionIterator implements Iterator<UInt>, KMappedMarker {
    private final int finalElement;
    private boolean hasNext;
    private int next;
    private final int step;

    public /* synthetic */ UIntProgressionIterator(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ UInt next() {
        return UInt.m975boximpl(m2125nextpVg5ArA());
    }

    /* JADX INFO: renamed from: next-pVg5ArA, reason: not valid java name */
    public int m2125nextpVg5ArA() {
        int i = this.next;
        if (i != this.finalElement) {
            this.next = UInt.m981constructorimpl(this.step + i);
        } else {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private UIntProgressionIterator(int i, int i2, int i3) {
        this.finalElement = i2;
        boolean z = true;
        int iCompareUnsigned = Integer.compareUnsigned(i, i2);
        if (i3 <= 0 ? iCompareUnsigned < 0 : iCompareUnsigned > 0) {
            z = false;
        }
        this.hasNext = z;
        this.step = UInt.m981constructorimpl(i3);
        this.next = this.hasNext ? i : i2;
    }
}
