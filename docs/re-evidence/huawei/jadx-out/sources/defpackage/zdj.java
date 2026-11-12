package defpackage;

import com.huawei.watchface.utils.constants.WatchFaceConstant;
import kotlin.Metadata;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.OpenEndRange;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001bB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\u0013\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\f\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\n¨\u0006\u001c"}, d2 = {"Lkotlin/ranges/LongRange;", "Lkotlin/ranges/LongProgression;", "Lkotlin/ranges/ClosedRange;", "", "Lkotlin/ranges/OpenEndRange;", "start", "endInclusive", "<init>", "(JJ)V", "getStart", "()Ljava/lang/Long;", "getEndInclusive", "endExclusive", "getEndExclusive$annotations", "()V", "getEndExclusive", "contains", "", "value", "isEmpty", "equals", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zdj extends zdh implements ClosedRange<Long>, OpenEndRange<Long> {
    public static final b d = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final zdj f53995c = new zdj(1, 0);

    public zdj(long j, long j2) {
        super(j, j2, 1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedRange
    public /* synthetic */ boolean contains(Comparable comparable) {
        return c(((Number) comparable).longValue());
    }

    @Override // kotlin.ranges.ClosedRange
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Long getStart() {
        return Long.valueOf(getD());
    }

    @Override // kotlin.ranges.ClosedRange
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Long getEndInclusive() {
        return Long.valueOf(getF53992c());
    }

    @Override // kotlin.ranges.OpenEndRange
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getEndExclusive() {
        if (getF53992c() == Long.MAX_VALUE) {
            throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
        }
        return Long.valueOf(getF53992c() + 1);
    }

    public boolean c(long j) {
        return getD() <= j && j <= getF53992c();
    }

    @Override // defpackage.zdh, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return getD() > getF53992c();
    }

    @Override // defpackage.zdh
    public boolean equals(Object other) {
        if (!(other instanceof zdj)) {
            return false;
        }
        if (isEmpty() && ((zdj) other).isEmpty()) {
            return true;
        }
        zdj zdjVar = (zdj) other;
        return getD() == zdjVar.getD() && getF53992c() == zdjVar.getF53992c();
    }

    @Override // defpackage.zdh
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (getD() ^ (getD() >>> 32))) + (getF53992c() ^ (getF53992c() >>> 32)));
    }

    @Override // defpackage.zdh
    public String toString() {
        return getD() + ".." + getF53992c();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/ranges/LongRange$Companion;", "", "<init>", "()V", "EMPTY", "Lkotlin/ranges/LongRange;", "getEMPTY", "()Lkotlin/ranges/LongRange;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(zcm zcmVar) {
            this();
        }
    }
}
