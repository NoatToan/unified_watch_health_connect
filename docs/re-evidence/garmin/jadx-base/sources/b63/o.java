package b63;

import c63.h0;
import com.roomorama.caldroid.CaldroidFragment;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002\u0012\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u000bB!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\rB!\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u0010¨\u0006\u0014"}, d2 = {"Lb63/o;", "", "Ljava/io/Serializable;", "Ljava/time/LocalDate;", "value", "<init>", "(Ljava/time/LocalDate;)V", "", CaldroidFragment.YEAR, CaldroidFragment.MONTH, "day", "(III)V", "Lb63/w;", "(ILb63/w;I)V", "Ljava/time/Month;", "dayOfMonth", "(ILjava/time/Month;I)V", "Companion", "a", "b", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h(with = h63.k.class)
public final class o implements Comparable<o>, Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f16205b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f16206a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb63/o$b;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f16207a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c63.r<o> f16208b = (c63.r) h0.f24981b.getValue();

        private b() {
        }
    }

    static {
        LocalDate localDate = LocalDate.MIN;
        localDate.getClass();
        new o(localDate);
        LocalDate localDate2 = LocalDate.MAX;
        localDate2.getClass();
        f16205b = new o(localDate2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(int i14, int i15, int i16) {
        try {
            LocalDate localDateOf = LocalDate.of(i14, i15, i16);
            localDateOf.getClass();
            this(localDateOf);
        } catch (DateTimeException e4) {
            l2.t(e4);
            throw null;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(o oVar) {
        oVar.getClass();
        return this.f16206a.compareTo((ChronoLocalDate) oVar.f16206a);
    }

    public final j b() {
        DayOfWeek dayOfWeek = this.f16206a.getDayOfWeek();
        dayOfWeek.getClass();
        return (j) j.f16200b.get(dayOfWeek.getValue() - 1);
    }

    public final w c() {
        Month month = this.f16206a.getMonth();
        month.getClass();
        return c.a(month);
    }

    public final t d(o oVar) {
        oVar.getClass();
        t.f16215d.getClass();
        return new t(this, oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return p005kotlin.jvm.internal.s.g(this.f16206a, ((o) obj).f16206a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16206a.hashCode();
    }

    public final String toString() {
        String string = this.f16206a.toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: b63.o$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lb63/o$a;", "", "<init>", "()V", "Li63/c;", "Lb63/o;", "serializer", "()Li63/c;", "", "serialVersionUID", "J", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static o a(long j8) {
            try {
                LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(j8);
                localDateOfEpochDay.getClass();
                return new o(localDateOfEpochDay);
            } catch (DateTimeException e4) {
                l2.t(e4);
                return null;
            }
        }

        public static o b(Companion companion, CharSequence charSequence) {
            b bVar = b.f16207a;
            bVar.getClass();
            c63.r<o> rVarA = h0.a();
            companion.getClass();
            charSequence.getClass();
            rVarA.getClass();
            bVar.getClass();
            if (rVarA != h0.a()) {
                return rVarA.a(charSequence);
            }
            try {
                String string = charSequence.toString();
                string.getClass();
                return new o(LocalDate.parse(dh.b.N(6, string.toString())));
            } catch (DateTimeParseException e4) {
                throw new DateTimeFormatException(e4);
            }
        }

        public final i63.c<o> serializer() {
            return h63.k.f82304a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(int i14, w wVar, int i15) {
        this(i14, wVar.ordinal() + 1, i15);
        wVar.getClass();
    }

    public o(LocalDate localDate) {
        localDate.getClass();
        this.f16206a = localDate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o13.e
    public o(int i14, Month month, int i15) {
        this(i14, c.a(month), i15);
        month.getClass();
    }
}
