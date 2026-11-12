package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.collections.ULongIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
@SinceKotlin(version = "1.3")
final class g extends ULongIterator {
    private final long a;
    private boolean b;
    private final long c;
    private long d;

    private g(long j, long j2, long j3) {
        this.a = j2;
        boolean z = true;
        int iUlongCompare = UnsignedKt.ulongCompare(j, j2);
        if (j3 <= 0 ? iUlongCompare < 0 : iUlongCompare > 0) {
            z = false;
        }
        this.b = z;
        this.c = ULong.m3905constructorimpl(j3);
        this.d = this.b ? j : j2;
    }

    public /* synthetic */ g(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b;
    }

    @Override // kotlin.collections.ULongIterator
    /* JADX INFO: renamed from: nextULong-s-VKNKU */
    public long mo3928nextULongsVKNKU() {
        long j = this.d;
        if (j != this.a) {
            this.d = ULong.m3905constructorimpl(this.c + j);
        } else {
            if (!this.b) {
                throw new NoSuchElementException();
            }
            this.b = false;
        }
        return j;
    }
}
