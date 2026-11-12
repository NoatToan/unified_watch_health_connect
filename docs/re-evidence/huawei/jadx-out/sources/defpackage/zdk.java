package defpackage;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.LongIterator;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\fH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlin/ranges/LongProgressionIterator;", "Lkotlin/collections/LongIterator;", "first", "", "last", "step", "<init>", "(JJJ)V", "getStep", "()J", "finalElement", "hasNext", "", "next", "nextLong", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zdk extends LongIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f53996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f53997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f53998c;
    private long e;

    public zdk(long j, long j2, long j3) {
        this.f53996a = j3;
        this.f53998c = j2;
        boolean z = j3 <= 0 ? j >= j2 : j <= j2;
        this.f53997b = z;
        this.e = z ? j : j2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f53997b;
    }

    @Override // kotlin.collections.LongIterator
    public long nextLong() {
        long j = this.e;
        if (j == this.f53998c) {
            if (!this.f53997b) {
                throw new NoSuchElementException();
            }
            this.f53997b = false;
            return j;
        }
        this.e = this.f53996a + j;
        return j;
    }
}
