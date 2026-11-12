package c22;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Iterator;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\nB!\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lc22/h0;", "", "Lorg/joda/time/LocalDate;", "Lj23/g;", TtmlNode.START, "endInclusive", "", "stepDays", "<init>", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;I)V", "a", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h0 implements Iterable<LocalDate>, j23.g<LocalDate>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f23061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f23062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23063c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc22/h0$a;", "", "Lorg/joda/time/LocalDate;", "startDate", "endDateInclusive", "", "stepDays", "<init>", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;I)V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Iterator<LocalDate>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f23064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f23065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LocalDate f23066c;

        public a(LocalDate localDate, LocalDate localDate2, int i14) {
            localDate.getClass();
            localDate2.getClass();
            this.f23064a = localDate2;
            this.f23065b = i14;
            this.f23066c = localDate;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f23066c.compareTo((ReadablePartial) this.f23064a) <= 0;
        }

        @Override // java.util.Iterator
        public final LocalDate next() {
            LocalDate localDate = this.f23066c;
            LocalDate localDatePlusDays = localDate.plusDays(this.f23065b);
            localDatePlusDays.getClass();
            this.f23066c = localDatePlusDays;
            return localDate;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h0(LocalDate localDate, LocalDate localDate2, int i14) {
        localDate.getClass();
        localDate2.getClass();
        this.f23061a = localDate;
        this.f23062b = localDate2;
        this.f23063c = i14;
    }

    @Override // j23.g
    public final Comparable b() {
        return this.f23062b;
    }

    public final int c() {
        return lc.u0.e(this.f23061a, this.f23062b, 1);
    }

    @Override // j23.g
    public final /* bridge */ boolean contains(Comparable comparable) {
        return j23.g.a.a(this, (LocalDate) comparable);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            if (p005kotlin.jvm.internal.s.g(this.f23061a, h0Var.f23061a) && p005kotlin.jvm.internal.s.g(this.f23062b, h0Var.f23062b) && this.f23063c == h0Var.f23063c) {
                return true;
            }
        }
        return false;
    }

    @Override // j23.g, j23.r
    public final Comparable getStart() {
        return this.f23061a;
    }

    public final int hashCode() {
        return ((this.f23062b.hashCode() + (this.f23061a.hashCode() * 31)) * 31) + this.f23063c;
    }

    @Override // j23.g
    public final /* bridge */ boolean isEmpty() {
        return j23.g.a.b(this);
    }

    @Override // java.lang.Iterable
    public final Iterator<LocalDate> iterator() {
        return new a(this.f23061a, this.f23062b, this.f23063c);
    }

    public /* synthetic */ h0(LocalDate localDate, LocalDate localDate2, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(localDate, localDate2, (i15 & 4) != 0 ? 1 : i14);
    }
}
