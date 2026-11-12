package defpackage;

import com.huawei.watchface.utils.constants.WatchFaceConstant;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/IntProgression;", "", "", "start", "endInclusive", "step", "<init>", "(III)V", "first", "getFirst", "()I", "last", "getLast", "getStep", "iterator", "Lkotlin/collections/IntIterator;", "isEmpty", "", "equals", "other", "", WatchFaceConstant.HASHCODE, "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class zdf implements Iterable<Integer>, KMappedMarker {
    public static final c e = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f53989a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f53990c;
    private final int d;

    public zdf(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f53990c = i;
        this.d = zbx.c(i, i2, i3);
        this.f53989a = i3;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF53990c() {
        return this.f53990c;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF53989a() {
        return this.f53989a;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public IntIterator iterator() {
        return new zdi(this.f53990c, this.d, this.f53989a);
    }

    public boolean isEmpty() {
        if (this.f53989a > 0) {
            return this.f53990c > this.d;
        }
        return this.f53990c < this.d;
    }

    public boolean equals(Object other) {
        if (!(other instanceof zdf)) {
            return false;
        }
        if (isEmpty() && ((zdf) other).isEmpty()) {
            return true;
        }
        zdf zdfVar = (zdf) other;
        return this.f53990c == zdfVar.f53990c && this.d == zdfVar.d && this.f53989a == zdfVar.f53989a;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f53990c * 31) + this.d) * 31) + this.f53989a;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f53989a > 0) {
            sb = new StringBuilder();
            sb.append(this.f53990c);
            sb.append("..");
            sb.append(this.d);
            sb.append(" step ");
            i = this.f53989a;
        } else {
            sb = new StringBuilder();
            sb.append(this.f53990c);
            sb.append(" downTo ");
            sb.append(this.d);
            sb.append(" step ");
            i = -this.f53989a;
        }
        sb.append(i);
        return sb.toString();
    }

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lkotlin/ranges/IntProgression$Companion;", "", "<init>", "()V", "fromClosedRange", "Lkotlin/ranges/IntProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {
        private c() {
        }

        public final zdf a(int i, int i2, int i3) {
            return new zdf(i, i2, i3);
        }

        public /* synthetic */ c(zcm zcmVar) {
            this();
        }
    }
}
