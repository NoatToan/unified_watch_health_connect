package j23;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\tB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lj23/o;", "Lj23/m;", "Lj23/g;", "", "Lj23/r;", TtmlNode.START, "endInclusive", "<init>", "(JJ)V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends m implements g<Long>, r<Long> {
    static {
        new a(null);
        new o(1L, 0L);
    }

    public o(long j8, long j14) {
        super(j8, j14, 1L);
    }

    @Override // j23.g
    public final Comparable b() {
        return Long.valueOf(this.f96807b);
    }

    @Override // j23.r
    public final Comparable c() {
        long j8 = this.f96807b;
        if (j8 != Long.MAX_VALUE) {
            return Long.valueOf(j8 + 1);
        }
        vb.h.z("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j23.g
    public final /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return d(((Number) comparable).longValue());
    }

    public final boolean d(long j8) {
        return this.f96806a <= j8 && j8 <= this.f96807b;
    }

    @Override // j23.m
    public final boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        if (isEmpty() && ((o) obj).isEmpty()) {
            return true;
        }
        o oVar = (o) obj;
        return this.f96806a == oVar.f96806a && this.f96807b == oVar.f96807b;
    }

    @Override // j23.g, j23.r
    public final Comparable getStart() {
        return Long.valueOf(this.f96806a);
    }

    @Override // j23.m
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j8 = this.f96806a;
        long j14 = ((long) 31) * (j8 ^ (j8 >>> 32));
        long j15 = this.f96807b;
        return (int) (j14 + (j15 ^ (j15 >>> 32)));
    }

    @Override // j23.m, j23.g
    public final boolean isEmpty() {
        return this.f96806a > this.f96807b;
    }

    @Override // j23.m
    public final String toString() {
        return this.f96806a + CallerDataConverter.DEFAULT_RANGE_DELIMITER + this.f96807b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj23/o$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
