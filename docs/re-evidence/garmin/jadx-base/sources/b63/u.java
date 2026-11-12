package b63;

import c63.i0;
import c63.j0;
import com.roomorama.caldroid.CaldroidFragment;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002\u001b\u001cB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006BE\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u000fBE\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0010\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0005\u0010\u0016BE\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u0019¨\u0006\u001d"}, d2 = {"Lb63/u;", "", "Ljava/io/Serializable;", "Ljava/time/LocalDateTime;", "value", "<init>", "(Ljava/time/LocalDateTime;)V", "", CaldroidFragment.YEAR, CaldroidFragment.MONTH, "day", "hour", "minute", "second", "nanosecond", "(IIIIIII)V", "Lb63/w;", "(ILb63/w;IIIII)V", "Lb63/o;", "date", "Lb63/v;", "time", "(Lb63/o;Lb63/v;)V", "Ljava/time/Month;", "dayOfMonth", "(ILjava/time/Month;IIIII)V", "Companion", "a", "b", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h(with = h63.l.class)
public final class u implements Comparable<u>, Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f16216a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb63/u$b;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f16217a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i0 f16218b = (i0) j0.f24993a.getValue();

        private b() {
        }
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        localDateTime.getClass();
        new u(localDateTime);
        LocalDateTime localDateTime2 = LocalDateTime.MAX;
        localDateTime2.getClass();
        new u(localDateTime2);
    }

    public /* synthetic */ u(int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15, i16, i17, i18, (i25 & 32) != 0 ? 0 : i19, (i25 & 64) != 0 ? 0 : i24);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(u uVar) {
        uVar.getClass();
        return this.f16216a.compareTo((ChronoLocalDateTime<?>) uVar.f16216a);
    }

    public final o b() {
        LocalDate localDate = this.f16216a.toLocalDate();
        localDate.getClass();
        return new o(localDate);
    }

    public final v c() {
        LocalTime localTime = this.f16216a.toLocalTime();
        localTime.getClass();
        return new v(localTime);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return p005kotlin.jvm.internal.s.g(this.f16216a, ((u) obj).f16216a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16216a.hashCode();
    }

    public final String toString() {
        String string = this.f16216a.toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: b63.u$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lb63/u$a;", "", "<init>", "()V", "Li63/c;", "Lb63/u;", "serializer", "()Li63/c;", "", "serialVersionUID", "J", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static u a(Companion companion, CharSequence charSequence) {
            b bVar = b.f16217a;
            bVar.getClass();
            i0 i0Var = b.f16218b;
            companion.getClass();
            charSequence.getClass();
            i0Var.getClass();
            bVar.getClass();
            try {
                String string = charSequence.toString();
                string.getClass();
                return new u(LocalDateTime.parse(dh.b.N(12, string.toString())));
            } catch (DateTimeParseException e4) {
                throw new DateTimeFormatException(e4);
            }
        }

        public final i63.c<u> serializer() {
            return h63.l.f82306a;
        }

        private Companion() {
        }
    }

    public u(LocalDateTime localDateTime) {
        localDateTime.getClass();
        this.f16216a = localDateTime;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public u(o oVar, v vVar) {
        oVar.getClass();
        vVar.getClass();
        LocalDateTime localDateTimeOf = LocalDateTime.of(oVar.f16206a, vVar.f16219a);
        localDateTimeOf.getClass();
        this(localDateTimeOf);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public u(int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
        try {
            LocalDateTime localDateTimeOf = LocalDateTime.of(i14, i15, i16, i17, i18, i19, i24);
            localDateTimeOf.getClass();
            this(localDateTimeOf);
        } catch (DateTimeException e4) {
            l2.t(e4);
            throw null;
        }
    }

    public /* synthetic */ u(int i14, w wVar, int i15, int i16, int i17, int i18, int i19, int i24, p005kotlin.jvm.internal.j jVar) {
        this(i14, wVar, i15, i16, i17, (i24 & 32) != 0 ? 0 : i18, (i24 & 64) != 0 ? 0 : i19);
    }

    public /* synthetic */ u(int i14, Month month, int i15, int i16, int i17, int i18, int i19, int i24, p005kotlin.jvm.internal.j jVar) {
        this(i14, month, i15, i16, i17, (i24 & 32) != 0 ? 0 : i18, (i24 & 64) != 0 ? 0 : i19);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o13.e
    public u(int i14, Month month, int i15, int i16, int i17, int i18, int i19) {
        this(i14, c.a(month), i15, i16, i17, i18, i19);
        month.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(int i14, w wVar, int i15, int i16, int i17, int i18, int i19) {
        this(i14, wVar.ordinal() + 1, i15, i16, i17, i18, i19);
        wVar.getClass();
    }
}
