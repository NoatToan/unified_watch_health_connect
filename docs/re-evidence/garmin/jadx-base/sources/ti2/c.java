package ti2;

import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lti2/c;", "", "<init>", "()V", "c", JWKParameterNames.RSA_EXPONENT, "h", "f", "g", "b", "a", "d", "Lti2/c$a;", "Lti2/c$b;", "Lti2/c$c;", "Lti2/c$d;", "Lti2/c$e;", "Lti2/c$f;", "Lti2/c$g;", "Lti2/c$h;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lti2/c$a;", "Lti2/c;", "", "guid", "<init>", "(Ljava/lang/String;)V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f164606a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            str.getClass();
            this.f164606a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f164606a, ((a) obj).f164606a);
        }

        public final int hashCode() {
            return this.f164606a.hashCode();
        }

        public final String toString() {
            return am.j.m("ChildRegistration(guid=", this.f164606a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lti2/c$b;", "Lti2/c;", "", "message", "<init>", "(Ljava/lang/String;)V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f164607a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            str.getClass();
            this.f164607a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f164607a, ((b) obj).f164607a);
        }

        public final int hashCode() {
            return this.f164607a.hashCode();
        }

        public final String toString() {
            return am.j.m("Error(message=", this.f164607a, ")");
        }
    }

    /* JADX INFO: renamed from: ti2.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lti2/c$c;", "Lti2/c;", "<init>", "()V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class C3088c extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3088c f164608a = new C3088c();

        private C3088c() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C3088c);
        }

        public final int hashCode() {
            return 1152869509;
        }

        public final String toString() {
            return "FailedToLoadCMC";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lti2/c$d;", "Lti2/c;", "<init>", "()V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class d extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f164609a = new d();

        private d() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -820159125;
        }

        public final String toString() {
            return "InoperableWebViewApp";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lti2/c$e;", "Lti2/c;", "<init>", "()V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class e extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f164610a = new e();

        private e() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 975754520;
        }

        public final String toString() {
            return "NoInternet";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lti2/c$f;", "Lti2/c;", "<init>", "()V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class f extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f164611a = new f();

        private f() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1035740872;
        }

        public final String toString() {
            return "NoMFAToken";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lti2/c$g;", "Lti2/c;", "", "message", "<init>", "(Ljava/lang/String;)V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class g extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f164612a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(null);
            str.getClass();
            this.f164612a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && s.g(this.f164612a, ((g) obj).f164612a);
        }

        public final int hashCode() {
            return this.f164612a.hashCode();
        }

        public final String toString() {
            return am.j.m("Serialization(message=", this.f164612a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lti2/c$h;", "Lti2/c;", "<init>", "()V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class h extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f164613a = new h();

        private h() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -2100371350;
        }

        public final String toString() {
            return "Unauthorized";
        }
    }

    public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private c() {
    }
}
