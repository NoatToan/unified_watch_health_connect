package kotlin.ranges;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin(version = "1.3")
final class ULongProgressionIterator implements Iterator<ULong>, KMappedMarker {
    private final long finalElement;
    private boolean hasNext;
    private long next;
    private final long step;

    public /* synthetic */ ULongProgressionIterator(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ ULong next() {
        return ULong.m1054boximpl(m2134nextsVKNKU());
    }

    /* JADX INFO: renamed from: next-s-VKNKU, reason: not valid java name */
    public long m2134nextsVKNKU() {
        long j = this.next;
        if (j != this.finalElement) {
            this.next = ULong.m1060constructorimpl(this.step + j);
        } else {
            if (!this.hasNext) {
                throw new NoSuchElementException();
            }
            this.hasNext = false;
        }
        return j;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private ULongProgressionIterator(long j, long j2, long j3) {
        this.finalElement = j2;
        boolean z = true;
        if (j3 <= 0 ? Long.compareUnsigned(j, j2) < 0 : Long.compareUnsigned(j, j2) > 0) {
            z = false;
        }
        this.hasNext = z;
        this.step = ULong.m1060constructorimpl(j3);
        this.next = this.hasNext ? j : j2;
    }
}
