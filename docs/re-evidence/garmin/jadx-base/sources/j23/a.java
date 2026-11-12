package j23;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lj23/a;", "", "", TtmlNode.START, "endInclusive", "", "step", "<init>", "(CCI)V", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a implements Iterable<Character>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f96780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f96781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f96782c;

    static {
        new C1846a(null);
    }

    public a(char c14, char c15, int i14) {
        if (i14 == 0) {
            vb.h.s("Step must be non-zero.");
            throw null;
        }
        if (i14 == Integer.MIN_VALUE) {
            vb.h.s("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.f96780a = c14;
        this.f96781b = (char) w5.r.n(c14, c15, i14);
        this.f96782c = i14;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f96780a == aVar.f96780a && this.f96781b == aVar.f96781b && this.f96782c == aVar.f96782c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f96780a * 31) + this.f96781b) * 31) + this.f96782c;
    }

    public boolean isEmpty() {
        char c14 = this.f96781b;
        int i14 = this.f96782c;
        int iH = p005kotlin.jvm.internal.s.h(this.f96780a, c14);
        if (i14 > 0) {
            return iH > 0;
        }
        return iH < 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        return new b(this.f96780a, this.f96781b, this.f96782c);
    }

    public String toString() {
        StringBuilder sb3;
        char c14 = this.f96781b;
        int i14 = this.f96782c;
        char c15 = this.f96780a;
        if (i14 > 0) {
            sb3 = new StringBuilder();
            sb3.append(c15);
            sb3.append(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
            sb3.append(c14);
            sb3.append(" step ");
            sb3.append(i14);
        } else {
            sb3 = new StringBuilder();
            sb3.append(c15);
            sb3.append(" downTo ");
            sb3.append(c14);
            sb3.append(" step ");
            sb3.append(-i14);
        }
        return sb3.toString();
    }

    /* JADX INFO: renamed from: j23.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj23/a$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1846a {
        public /* synthetic */ C1846a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1846a() {
        }
    }
}
