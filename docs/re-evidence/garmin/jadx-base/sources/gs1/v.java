package gs1;

import am.x0;
import com.garmin.android.gncs.NotificationConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lgs1/v;", "", "Lgs1/v$a;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "startTimeMinutesOfDay", "endTimeMinutesOfDay", "durationMinutes", "<init>", "(Lgs1/v$a;ILjava/lang/Integer;I)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f78883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f78885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f78886d;

    public v(a aVar, int i14, Integer num, int i15) {
        aVar.getClass();
        this.f78883a = aVar;
        this.f78884b = i14;
        this.f78885c = num;
        this.f78886d = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return p005kotlin.jvm.internal.s.g(this.f78883a, vVar.f78883a) && this.f78884b == vVar.f78884b && p005kotlin.jvm.internal.s.g(this.f78885c, vVar.f78885c) && this.f78886d == vVar.f78886d;
    }

    public final int hashCode() {
        int iD = q2.d(this.f78884b, this.f78883a.hashCode() * 31, 31);
        Integer num = this.f78885c;
        return Integer.hashCode(this.f78886d) + ((iD + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "TimelineEntry(type=" + this.f78883a + ", startTimeMinutesOfDay=" + this.f78884b + ", endTimeMinutesOfDay=" + this.f78885c + ", durationMinutes=" + this.f78886d + ")";
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0005\u0006\u0007\b\t\nB\u0015\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0006\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lgs1/v$a;", "", "data", "<init>", "(Ljava/lang/Object;)V", "a", "c", "f", "b", "d", JWKParameterNames.RSA_EXPONENT, "Lgs1/v$a$a;", "Lgs1/v$a$b;", "Lgs1/v$a$c;", "Lgs1/v$a$d;", "Lgs1/v$a$e;", "Lgs1/v$a$f;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f78887a;

        /* JADX INFO: renamed from: gs1.v$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgs1/v$a$a;", "Lgs1/v$a;", "Lam/x0;", "data", "<init>", "(Lam/x0;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1589a extends a {
            public C1589a(x0 x0Var) {
                super(x0Var, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs1/v$a$b;", "Lgs1/v$a;", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends a {
            /* JADX WARN: Illegal instructions before constructor call */
            public b() {
                p005kotlin.jvm.internal.j jVar = null;
                super(jVar, 1, jVar);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgs1/v$a$c;", "Lgs1/v$a;", "Lam/x0;", "data", "<init>", "(Lam/x0;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends a {
            public c(x0 x0Var) {
                super(x0Var, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs1/v$a$d;", "Lgs1/v$a;", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class d extends a {
            /* JADX WARN: Illegal instructions before constructor call */
            public d() {
                p005kotlin.jvm.internal.j jVar = null;
                super(jVar, 1, jVar);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs1/v$a$f;", "Lgs1/v$a;", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class f extends a {
            /* JADX WARN: Illegal instructions before constructor call */
            public f() {
                p005kotlin.jvm.internal.j jVar = null;
                super(jVar, 1, jVar);
            }
        }

        public /* synthetic */ a(Object obj, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? null : obj, null);
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lgs1/v$a$e;", "Lgs1/v$a;", "<init>", "()V", "d", "a", "c", "b", "Lgs1/v$a$e$a;", "Lgs1/v$a$e$b;", "Lgs1/v$a$e$c;", "Lgs1/v$a$e$d;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class e extends a {

            /* JADX INFO: renamed from: gs1.v$a$e$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs1/v$a$e$a;", "Lgs1/v$a$e;", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class C1590a extends e {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final C1590a f78888b = new C1590a();

                private C1590a() {
                    super(null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs1/v$a$e$b;", "Lgs1/v$a$e;", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class b extends e {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final b f78889b = new b();

                private b() {
                    super(null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs1/v$a$e$c;", "Lgs1/v$a$e;", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class c extends e {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final c f78890b = new c();

                private c() {
                    super(null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgs1/v$a$e$d;", "Lgs1/v$a$e;", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class d extends e {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final d f78891b = new d();

                private d() {
                    super(null);
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            private e() {
                p005kotlin.jvm.internal.j jVar = null;
                super(jVar, 1, jVar);
            }

            public /* synthetic */ e(p005kotlin.jvm.internal.j jVar) {
                this();
            }
        }

        private a(Object obj) {
            this.f78887a = obj;
        }

        public /* synthetic */ a(Object obj, p005kotlin.jvm.internal.j jVar) {
            this(obj);
        }
    }

    public /* synthetic */ v(a aVar, int i14, Integer num, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this(aVar, i14, (i16 & 4) != 0 ? null : num, (i16 & 8) != 0 ? 0 : i15);
    }
}
