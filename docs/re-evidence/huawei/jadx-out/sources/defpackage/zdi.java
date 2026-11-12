package defpackage;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\fH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlin/ranges/IntProgressionIterator;", "Lkotlin/collections/IntIterator;", "first", "", "last", "step", "<init>", "(III)V", "getStep", "()I", "finalElement", "hasNext", "", "next", "nextInt", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zdi extends IntIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53993a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f53994c;
    private final int d;
    private final int e;

    public zdi(int i, int i2, int i3) {
        this.e = i3;
        this.d = i2;
        boolean z = i3 <= 0 ? i >= i2 : i <= i2;
        this.f53994c = z;
        this.f53993a = z ? i : i2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f53994c;
    }

    @Override // kotlin.collections.IntIterator
    public int nextInt() {
        int i = this.f53993a;
        if (i == this.d) {
            if (!this.f53994c) {
                throw new NoSuchElementException();
            }
            this.f53994c = false;
            return i;
        }
        this.f53993a = this.e + i;
        return i;
    }
}
