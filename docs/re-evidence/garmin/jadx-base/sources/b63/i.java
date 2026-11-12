package b63;

import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lb63/i;", "", "<init>", "()V", "Companion", JWKParameterNames.RSA_EXPONENT, "b", "c", "d", "a", "Lb63/i$b;", "Lb63/i$e;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h(with = h63.f.class)
public abstract class i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f16187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f16188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f16189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f16190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f16191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f16192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f16193g;

    static {
        e eVarB = new e(1L).b(1000).b(1000).b(1000);
        f16187a = eVarB;
        e eVarB2 = eVarB.b(60);
        f16188b = eVarB2;
        f16189c = eVarB2.b(60);
        c cVar = new c(1);
        f16190d = cVar;
        f16191e = new c(Math.multiplyExact(cVar.f16194h, 7));
        d dVar = new d(1);
        f16192f = dVar;
        int i14 = dVar.f16195h;
        new d(Math.multiplyExact(i14, 3));
        d dVar2 = new d(Math.multiplyExact(i14, 12));
        f16193g = dVar2;
        new d(Math.multiplyExact(dVar2.f16195h, 100));
    }

    public /* synthetic */ i(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public static String a(int i14, String str) {
        if (i14 == 1) {
            return str;
        }
        return i14 + '-' + str;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b7\u0018\u0000 \f2\u00020\u0001:\u0001\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003Z\u001a\b\u0007\u0010\b\"\u00020\u00042\u00020\u0004B\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007Z\u001a\b\u0007\u0010\u000b\"\u00020\t2\u00020\tB\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0082\u0001\u0002\u0004\t¨\u0006\u000e"}, d2 = {"Lb63/i$b;", "Lb63/i;", "<init>", "()V", "Lb63/i$c;", "Lo13/e;", "message", "Use DateTimeUnit.DayBased", "DayBased", "Lb63/i$d;", "Use DateTimeUnit.MonthBased", "MonthBased", "Companion", "a", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @i63.h(with = h63.a.class)
    public static abstract class b extends i {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        private b() {
            super(null);
        }

        /* JADX INFO: renamed from: b63.i$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb63/i$b$a;", "", "<init>", "()V", "Li63/c;", "Lb63/i$b;", "serializer", "()Li63/c;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final i63.c<b> serializer() {
                return h63.a.f82282a;
            }

            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lb63/i$c;", "Lb63/i$b;", "", "days", "<init>", "(I)V", "Companion", "a", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @i63.h(with = h63.g.class)
    public static final class c extends b {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f16194h;

        public c(int i14) {
            super(null);
            this.f16194h = i14;
            if (i14 > 0) {
                return;
            }
            vb.h.x(v.e0.f(i14, "Unit duration must be positive, but was ", " days."));
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f16194h == ((c) obj).f16194h;
            }
            return false;
        }

        public final int hashCode() {
            return this.f16194h ^ 65536;
        }

        public final String toString() {
            int i14 = this.f16194h;
            return i14 % 7 == 0 ? i.a(i14 / 7, "WEEK") : i.a(i14, "DAY");
        }

        /* JADX INFO: renamed from: b63.i$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb63/i$c$a;", "", "<init>", "()V", "Li63/c;", "Lb63/i$c;", "serializer", "()Li63/c;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final i63.c<c> serializer() {
                return h63.g.f82296a;
            }

            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lb63/i$d;", "Lb63/i$b;", "", "months", "<init>", "(I)V", "Companion", "a", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @i63.h(with = h63.n.class)
    public static final class d extends b {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f16195h;

        public d(int i14) {
            super(null);
            this.f16195h = i14;
            if (i14 > 0) {
                return;
            }
            vb.h.x(v.e0.f(i14, "Unit duration must be positive, but was ", " months."));
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                return this.f16195h == ((d) obj).f16195h;
            }
            return false;
        }

        public final int hashCode() {
            return this.f16195h ^ 131072;
        }

        public final String toString() {
            int i14 = this.f16195h;
            if (i14 % 1200 == 0) {
                return i.a(i14 / 1200, "CENTURY");
            }
            if (i14 % 12 == 0) {
                return i.a(i14 / 12, "YEAR");
            }
            return i14 % 3 == 0 ? i.a(i14 / 3, "QUARTER") : i.a(i14, "MONTH");
        }

        /* JADX INFO: renamed from: b63.i$d$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb63/i$d$a;", "", "<init>", "()V", "Li63/c;", "Lb63/i$d;", "serializer", "()Li63/c;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final i63.c<d> serializer() {
                return h63.n.f82310a;
            }

            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lb63/i$e;", "Lb63/i;", "", "nanoseconds", "<init>", "(J)V", "Companion", "a", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @i63.h(with = h63.o.class)
    public static final class e extends i {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f16196h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f16197i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f16198j;

        public e(long j8) {
            super(null);
            this.f16196h = j8;
            if (j8 <= 0) {
                vb.h.x(androidx.room.a0.f(j8, "Unit duration must be positive, but was ", " ns."));
                throw null;
            }
            if (j8 % 3600000000000L == 0) {
                this.f16197i = "HOUR";
                this.f16198j = j8 / 3600000000000L;
                return;
            }
            if (j8 % 60000000000L == 0) {
                this.f16197i = "MINUTE";
                this.f16198j = j8 / 60000000000L;
                return;
            }
            long j14 = 1000000000;
            if (j8 % j14 == 0) {
                this.f16197i = "SECOND";
                this.f16198j = j8 / j14;
                return;
            }
            long j15 = 1000000;
            if (j8 % j15 == 0) {
                this.f16197i = "MILLISECOND";
                this.f16198j = j8 / j15;
                return;
            }
            long j16 = 1000;
            if (j8 % j16 == 0) {
                this.f16197i = "MICROSECOND";
                this.f16198j = j8 / j16;
            } else {
                this.f16197i = "NANOSECOND";
                this.f16198j = j8;
            }
        }

        public final e b(int i14) {
            return new e(Math.multiplyExact(this.f16196h, i14));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                return this.f16196h == ((e) obj).f16196h;
            }
            return false;
        }

        public final int hashCode() {
            long j8 = this.f16196h;
            return ((int) (j8 >> 32)) ^ ((int) j8);
        }

        public final String toString() {
            String str = this.f16197i;
            str.getClass();
            long j8 = this.f16198j;
            if (j8 == 1) {
                return str;
            }
            return j8 + '-' + str;
        }

        /* JADX INFO: renamed from: b63.i$e$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb63/i$e$a;", "", "<init>", "()V", "Li63/c;", "Lb63/i$e;", "serializer", "()Li63/c;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final i63.c<e> serializer() {
                return h63.o.f82312a;
            }

            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }
        }
    }

    /* JADX INFO: renamed from: b63.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb63/i$a;", "", "<init>", "()V", "Li63/c;", "Lb63/i;", "serializer", "()Li63/c;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<i> serializer() {
            return h63.f.f82294a;
        }

        private Companion() {
        }
    }

    private i() {
    }
}
