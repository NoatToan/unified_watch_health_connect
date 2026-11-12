package b63;

import c63.k0;
import c63.l0;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import kotlinx.datetime.DateTimeFormatException;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002\u000e\u000fB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B-\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\f¨\u0006\u0010"}, d2 = {"Lb63/v;", "", "Ljava/io/Serializable;", "Ljava/time/LocalTime;", "value", "<init>", "(Ljava/time/LocalTime;)V", "", "hour", "minute", "second", "nanosecond", "(IIII)V", "Companion", "a", "b", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h(with = h63.m.class)
public final class v implements Comparable<v>, Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalTime f16219a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb63/v$b;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f16220a = new b();

        private b() {
        }
    }

    static {
        LocalTime localTime = LocalTime.MIN;
        localTime.getClass();
        new v(localTime);
        LocalTime localTime2 = LocalTime.MAX;
        localTime2.getClass();
        new v(localTime2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public v(int i14, int i15, int i16, int i17) {
        try {
            LocalTime localTimeOf = LocalTime.of(i14, i15, i16, i17);
            localTimeOf.getClass();
            this(localTimeOf);
        } catch (DateTimeException e4) {
            l2.t(e4);
            throw null;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(v vVar) {
        vVar.getClass();
        return this.f16219a.compareTo(vVar.f16219a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return p005kotlin.jvm.internal.s.g(this.f16219a, ((v) obj).f16219a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16219a.hashCode();
    }

    public final String toString() {
        String string = this.f16219a.toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: b63.v$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lb63/v$a;", "", "<init>", "()V", "Li63/c;", "Lb63/v;", "serializer", "()Li63/c;", "", "serialVersionUID", "J", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static v a(int i14) {
            try {
                return new v(LocalTime.ofSecondOfDay(i14));
            } catch (DateTimeException e4) {
                l2.t(e4);
                return null;
            }
        }

        public static v b(CharSequence charSequence, k0 k0Var) {
            charSequence.getClass();
            k0Var.getClass();
            b.f16220a.getClass();
            if (k0Var != l0.a()) {
                return k0Var.a(charSequence);
            }
            try {
                return new v(LocalTime.parse(charSequence));
            } catch (DateTimeParseException e4) {
                throw new DateTimeFormatException(e4);
            }
        }

        public static v c(Companion companion, CharSequence charSequence) {
            b.f16220a.getClass();
            k0 k0VarA = l0.a();
            companion.getClass();
            return b(charSequence, k0VarA);
        }

        public final i63.c<v> serializer() {
            return h63.m.f82308a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ v(int i14, int i15, int i16, int i17, int i18, p005kotlin.jvm.internal.j jVar) {
        this(i14, i15, (i18 & 4) != 0 ? 0 : i16, (i18 & 8) != 0 ? 0 : i17);
    }

    public v(LocalTime localTime) {
        localTime.getClass();
        this.f16219a = localTime;
    }
}
