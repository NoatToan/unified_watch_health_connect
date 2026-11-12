package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.collections.CharIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class CharProgressionIterator extends CharIterator {
    private final int a;
    private final int b;
    private boolean c;
    private int d;

    public CharProgressionIterator(char c, char c2, int i) {
        this.a = i;
        this.b = c2;
        boolean z = true;
        if (i <= 0 ? Intrinsics.compare((int) c, (int) c2) < 0 : Intrinsics.compare((int) c, (int) c2) > 0) {
            z = false;
        }
        this.c = z;
        this.d = z ? c : c2;
    }

    public final int getStep() {
        return this.a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c;
    }

    @Override // kotlin.collections.CharIterator
    public char nextChar() {
        int i = this.d;
        if (i != this.b) {
            this.d = this.a + i;
        } else {
            if (!this.c) {
                throw new NoSuchElementException();
            }
            this.c = false;
        }
        return (char) i;
    }
}
