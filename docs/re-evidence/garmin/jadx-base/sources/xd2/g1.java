package xd2;

import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lxd2/g1;", "T", "", "<init>", "()V", "b", "a", "Lxd2/g1$a;", "Lxd2/g1$b;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class g1<T> {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lxd2/g1$b;", "T", "Lxd2/g1;", "data", "<init>", "(Ljava/lang/Object;)V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b<T> extends g1<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f190167a;

        public b(T t7) {
            super(null);
            this.f190167a = t7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f190167a, ((b) obj).f190167a);
        }

        public final int hashCode() {
            T t7 = this.f190167a;
            if (t7 == null) {
                return 0;
            }
            return t7.hashCode();
        }

        public final String toString() {
            return org.apache.commons.lang3.e.f("Success(data=", ")", this.f190167a);
        }
    }

    public /* synthetic */ g1(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lxd2/g1$a;", "Lxd2/g1;", "", "<init>", "()V", JWKParameterNames.RSA_EXPONENT, "c", "d", "b", "f", "a", "Lxd2/g1$a$b;", "Lxd2/g1$a$c;", "Lxd2/g1$a$d;", "Lxd2/g1$a$e;", "Lxd2/g1$a$f;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class a extends g1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3545a f190161a = new C3545a(null);

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxd2/g1$a$b;", "Lxd2/g1$a;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f190162b = new b();

            private b() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -926148761;
            }

            public final String toString() {
                return "Maintenance";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxd2/g1$a$c;", "Lxd2/g1$a;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f190163b = new c();

            private c() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1639855208;
            }

            public final String toString() {
                return "NoLiveTrackConsent";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxd2/g1$a$d;", "Lxd2/g1$a;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class d extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f190164b = new d();

            private d() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 223359039;
            }

            public final String toString() {
                return "NoNetworkConnection";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxd2/g1$a$e;", "Lxd2/g1$a;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class e extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f190165b = new e();

            private e() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 738141339;
            }

            public final String toString() {
                return "NotFound";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxd2/g1$a$f;", "Lxd2/g1$a;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class f extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final f f190166b = new f();

            private f() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -1003873634;
            }

            public final String toString() {
                return "Unknown";
            }
        }

        private a() {
            super(null);
        }

        /* JADX INFO: renamed from: xd2.g1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lxd2/g1$a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ERROR_NAME_LIVE_TRACK_CONSENT", "ERROR_NAME_MAINTENANCE", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C3545a {
            public /* synthetic */ C3545a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private C3545a() {
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    private g1() {
    }
}
