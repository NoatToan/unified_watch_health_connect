package defpackage;

import com.huawei.watchface.utils.constants.WatchFaceConstant;
import kotlin.Metadata;
import kotlin.collections.LongIterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes46.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lkotlin/ranges/LongProgression;", "", "", "start", "endInclusive", "step", "<init>", "(JJJ)V", "first", "getFirst", "()J", "last", "getLast", "getStep", "iterator", "Lkotlin/collections/LongIterator;", "isEmpty", "", "equals", "other", "", WatchFaceConstant.HASHCODE, "", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class zdh implements Iterable<Long>, KMappedMarker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f53991b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f53992c;
    private final long d;
    private final long e;

    public zdh(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.d = j;
        this.f53992c = zbx.a(j, j2, j3);
        this.e = j3;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getF53992c() {
        return this.f53992c;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public LongIterator iterator() {
        return new zdk(this.d, this.f53992c, this.e);
    }

    public boolean isEmpty() {
        long j = this.e;
        long j2 = this.d;
        long j3 = this.f53992c;
        if (j > 0) {
            return j2 > j3;
        }
        return j2 < j3;
    }

    public boolean equals(Object other) {
        if (!(other instanceof zdh)) {
            return false;
        }
        if (isEmpty() && ((zdh) other).isEmpty()) {
            return true;
        }
        zdh zdhVar = (zdh) other;
        return this.d == zdhVar.d && this.f53992c == zdhVar.f53992c && this.e == zdhVar.e;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = 31;
        long j2 = this.d;
        long j3 = this.f53992c;
        long j4 = this.e;
        return (int) ((j * (((j2 ^ (j2 >>> 32)) * j) + (j3 ^ (j3 >>> 32)))) + ((j4 >>> 32) ^ j4));
    }

    public String toString() {
        StringBuilder sb;
        long j;
        if (this.e > 0) {
            sb = new StringBuilder();
            sb.append(this.d);
            sb.append("..");
            sb.append(this.f53992c);
            sb.append(" step ");
            j = this.e;
        } else {
            sb = new StringBuilder();
            sb.append(this.d);
            sb.append(" downTo ");
            sb.append(this.f53992c);
            sb.append(" step ");
            j = -this.e;
        }
        sb.append(j);
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lkotlin/ranges/LongProgression$Companion;", "", "<init>", "()V", "fromClosedRange", "Lkotlin/ranges/LongProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(zcm zcmVar) {
            this();
        }
    }
}
