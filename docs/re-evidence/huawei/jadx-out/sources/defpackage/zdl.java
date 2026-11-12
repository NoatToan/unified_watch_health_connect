package defpackage;

import com.huawei.watchface.utils.constants.WatchFaceConstant;
import kotlin.Metadata;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.OpenEndRange;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001aB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\u0013\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\f\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\n¨\u0006\u001b"}, d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/IntProgression;", "Lkotlin/ranges/ClosedRange;", "", "Lkotlin/ranges/OpenEndRange;", "start", "endInclusive", "<init>", "(II)V", "getStart", "()Ljava/lang/Integer;", "getEndInclusive", "endExclusive", "getEndExclusive$annotations", "()V", "getEndExclusive", "contains", "", "value", "isEmpty", "equals", "other", "", WatchFaceConstant.HASHCODE, "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zdl extends zdf implements ClosedRange<Integer>, OpenEndRange<Integer> {
    public static final e d = new e(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final zdl f53999a = new zdl(1, 0);

    public zdl(int i, int i2) {
        super(i, i2, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.ranges.ClosedRange
    public /* synthetic */ boolean contains(Comparable comparable) {
        return c(((Number) comparable).intValue());
    }

    @Override // kotlin.ranges.ClosedRange
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Integer getStart() {
        return Integer.valueOf(getF53990c());
    }

    @Override // kotlin.ranges.ClosedRange
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Integer getEndInclusive() {
        return Integer.valueOf(getD());
    }

    @Override // kotlin.ranges.OpenEndRange
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Integer getEndExclusive() {
        if (getD() == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
        }
        return Integer.valueOf(getD() + 1);
    }

    public boolean c(int i) {
        return getF53990c() <= i && i <= getD();
    }

    @Override // defpackage.zdf, kotlin.ranges.ClosedRange
    public boolean isEmpty() {
        return getF53990c() > getD();
    }

    @Override // defpackage.zdf
    public boolean equals(Object other) {
        if (!(other instanceof zdl)) {
            return false;
        }
        if (isEmpty() && ((zdl) other).isEmpty()) {
            return true;
        }
        zdl zdlVar = (zdl) other;
        return getF53990c() == zdlVar.getF53990c() && getD() == zdlVar.getD();
    }

    @Override // defpackage.zdf
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getF53990c() * 31) + getD();
    }

    @Override // defpackage.zdf
    public String toString() {
        return getF53990c() + ".." + getD();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/ranges/IntRange$Companion;", "", "<init>", "()V", "EMPTY", "Lkotlin/ranges/IntRange;", "getEMPTY", "()Lkotlin/ranges/IntRange;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e {
        private e() {
        }

        public final zdl b() {
            return zdl.f53999a;
        }

        public /* synthetic */ e(zcm zcmVar) {
            this();
        }
    }
}
