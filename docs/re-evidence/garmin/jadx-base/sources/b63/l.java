package b63;

import ch.qos.logback.core.CoreConstants;
import java.time.DateTimeException;
import java.time.Instant;
import kotlinx.datetime.DateTimeFormatException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lb63/l;", "", "Ljava/time/Instant;", "value", "<init>", "(Ljava/time/Instant;)V", "Companion", "a", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@o13.e
@i63.h(with = h63.j.class)
public final class l implements Comparable<l> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f16201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f16202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f16203d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f16204a;

    static {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(-3217862419201L, 999999999L);
        instantOfEpochSecond.getClass();
        f16201b = new l(instantOfEpochSecond);
        Instant instantOfEpochSecond2 = Instant.ofEpochSecond(3093527980800L, 0L);
        instantOfEpochSecond2.getClass();
        new l(instantOfEpochSecond2);
        Instant instant = Instant.MIN;
        instant.getClass();
        f16202c = new l(instant);
        Instant instant2 = Instant.MAX;
        instant2.getClass();
        f16203d = new l(instant2);
    }

    public l(Instant instant) {
        instant.getClass();
        this.f16204a = instant;
    }

    @Override // java.lang.Comparable
    @o13.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(l lVar) {
        lVar.getClass();
        return this.f16204a.compareTo(lVar.f16204a);
    }

    @o13.e
    public final l b(long j8) throws Exception {
        e53.c.a aVar = e53.c.f63094b;
        try {
            Instant instantPlusNanos = this.f16204a.plusSeconds(e53.c.j(j8, e53.f.SECONDS)).plusNanos(e53.c.f(j8));
            instantPlusNanos.getClass();
            return new l(instantPlusNanos);
        } catch (Exception e4) {
            if ((e4 instanceof ArithmeticException) || (e4 instanceof DateTimeException)) {
                return j8 > 0 ? f16203d : f16202c;
            }
            throw e4;
        }
    }

    @o13.e
    public final long c() {
        Instant instant = this.f16204a;
        try {
            return instant.toEpochMilli();
        } catch (ArithmeticException unused) {
            return instant.isAfter(Instant.EPOCH) ? Long.MAX_VALUE : Long.MIN_VALUE;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f16204a.equals(((l) obj).f16204a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16204a.hashCode();
    }

    @o13.e
    public final String toString() {
        String string = this.f16204a.toString();
        string.getClass();
        return string;
    }

    /* JADX INFO: renamed from: b63.l$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb63/l$a;", "", "<init>", "()V", "Li63/c;", "Lb63/l;", "serializer", "()Li63/c;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static l a(long j8) {
            Instant instantOfEpochMilli = Instant.ofEpochMilli(j8);
            instantOfEpochMilli.getClass();
            return new l(instantOfEpochMilli);
        }

        public static l b(String str, c63.r rVar) {
            str.getClass();
            rVar.getClass();
            try {
                return n.a(c63.m.a((c63.m) rVar.a(str)));
            } catch (IllegalArgumentException e4) {
                throw new DateTimeFormatException("Failed to parse an instant from '" + ((Object) str) + CoreConstants.SINGLE_QUOTE_CHAR, e4);
            }
        }

        public final i63.c<l> serializer() {
            return h63.j.f82302a;
        }

        private Companion() {
        }
    }
}
