package j23;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u0007\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lj23/m;", "", "", TtmlNode.START, "endInclusive", "step", "<init>", "(JJJ)V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class m implements Iterable<Long>, f23.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f96805d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f96806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f96807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f96808c;

    public m(long j8, long j14, long j15) {
        if (j15 == 0) {
            vb.h.s("Step must be non-zero.");
            throw null;
        }
        if (j15 == Long.MIN_VALUE) {
            vb.h.s("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f96806a = j8;
        this.f96807b = w5.r.o(j8, j14, j15);
        this.f96808c = j15;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        if (isEmpty() && ((m) obj).isEmpty()) {
            return true;
        }
        m mVar = (m) obj;
        return this.f96806a == mVar.f96806a && this.f96807b == mVar.f96807b && this.f96808c == mVar.f96808c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j8 = 31;
        long j14 = this.f96806a;
        long j15 = this.f96807b;
        long j16 = (((j14 ^ (j14 >>> 32)) * j8) + (j15 ^ (j15 >>> 32))) * j8;
        long j17 = this.f96808c;
        return (int) (j16 + (j17 ^ (j17 >>> 32)));
    }

    public boolean isEmpty() {
        long j8 = this.f96808c;
        long j14 = this.f96807b;
        long j15 = this.f96806a;
        if (j8 > 0) {
            return j15 > j14;
        }
        return j15 < j14;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return new n(this.f96806a, this.f96807b, this.f96808c);
    }

    public String toString() {
        StringBuilder sb3;
        long j8 = this.f96808c;
        long j14 = this.f96807b;
        long j15 = this.f96806a;
        if (j8 > 0) {
            sb3 = new StringBuilder();
            sb3.append(j15);
            sb3.append(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
            sb3.append(j14);
            sb3.append(" step ");
            sb3.append(j8);
        } else {
            sb3 = new StringBuilder();
            sb3.append(j15);
            sb3.append(" downTo ");
            sb3.append(j14);
            sb3.append(" step ");
            sb3.append(-j8);
        }
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj23/m$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
