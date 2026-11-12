package j23;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lj23/j;", "", "", TtmlNode.START, "endInclusive", "step", "<init>", "(III)V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class j implements Iterable<Integer>, f23.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f96795d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f96796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f96797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f96798c;

    public j(int i14, int i15, int i16) {
        if (i16 == 0) {
            vb.h.s("Step must be non-zero.");
            throw null;
        }
        if (i16 == Integer.MIN_VALUE) {
            vb.h.s("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f96796a = i14;
        this.f96797b = w5.r.n(i14, i15, i16);
        this.f96798c = i16;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (isEmpty() && ((j) obj).isEmpty()) {
            return true;
        }
        j jVar = (j) obj;
        return this.f96796a == jVar.f96796a && this.f96797b == jVar.f96797b && this.f96798c == jVar.f96798c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f96796a * 31) + this.f96797b) * 31) + this.f96798c;
    }

    public boolean isEmpty() {
        int i14 = this.f96797b;
        int i15 = this.f96798c;
        int i16 = this.f96796a;
        if (i15 > 0) {
            return i16 > i14;
        }
        return i16 < i14;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new k(this.f96796a, this.f96797b, this.f96798c);
    }

    public String toString() {
        StringBuilder sb3;
        int i14 = this.f96797b;
        int i15 = this.f96798c;
        int i16 = this.f96796a;
        if (i15 > 0) {
            sb3 = new StringBuilder();
            sb3.append(i16);
            sb3.append(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
            sb3.append(i14);
            sb3.append(" step ");
            sb3.append(i15);
        } else {
            sb3 = new StringBuilder();
            sb3.append(i16);
            sb3.append(" downTo ");
            sb3.append(i14);
            sb3.append(" step ");
            sb3.append(-i15);
        }
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj23/j$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
