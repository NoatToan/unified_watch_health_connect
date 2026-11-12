package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.LongIterator;

/* JADX INFO: loaded from: classes23.dex */
public final class LongProgressionIterator extends LongIterator {
    private final long a;
    private final long b;
    private boolean c;
    private long d;

    public LongProgressionIterator(long j, long j2, long j3) {
        this.a = j3;
        this.b = j2;
        boolean z = true;
        if (j3 <= 0 ? j < j2 : j > j2) {
            z = false;
        }
        this.c = z;
        this.d = z ? j : j2;
    }

    public final long getStep() {
        return this.a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c;
    }

    @Override // kotlin.collections.LongIterator
    public long nextLong() {
        long j = this.d;
        if (j != this.b) {
            this.d = this.a + j;
        } else {
            if (!this.c) {
                throw new NoSuchElementException();
            }
            this.c = false;
        }
        return j;
    }
}
