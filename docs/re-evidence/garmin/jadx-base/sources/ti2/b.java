package ti2;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lti2/b;", "", "<init>", "()V", "a", "d", IntegerTokenConverter.CONVERTER_KEY, "j", "b", "g", "f", "h", JWKParameterNames.RSA_EXPONENT, "c", "Lti2/b$a;", "Lti2/b$b;", "Lti2/b$c;", "Lti2/b$d;", "Lti2/b$e;", "Lti2/b$f;", "Lti2/b$g;", "Lti2/b$h;", "Lti2/b$i;", "Lti2/b$j;", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lti2/b$a;", "Lti2/b;", "Lti2/a;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "message", "button", "<init>", "(Lti2/a;Ljava/lang/String;Ljava/lang/String;)V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ti2.a f164591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f164592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f164593c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ti2.a aVar, String str, String str2) {
            super(null);
            aVar.getClass();
            str.getClass();
            this.f164591a = aVar;
            this.f164592b = str;
            this.f164593c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f164591a == aVar.f164591a && s.g(this.f164592b, aVar.f164592b) && s.g(this.f164593c, aVar.f164593c);
        }

        public final int hashCode() {
            int iJ = wr.g.j(this.f164591a.hashCode() * 31, 31, this.f164592b);
            String str = this.f164593c;
            return iJ + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Alert(type=");
            sb3.append(this.f164591a);
            sb3.append(", message=");
            sb3.append(this.f164592b);
            sb3.append(", button=");
            return am.j.o(this.f164593c, ")", sb3);
        }
    }

    /* JADX INFO: renamed from: ti2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lti2/b$b;", "Lti2/b;", "", "guid", "", "userId", "fullName", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class C3087b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f164594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f164595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f164596c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f164597d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3087b(String str, long j8, String str2, String str3) {
            super(null);
            str.getClass();
            this.f164594a = str;
            this.f164595b = j8;
            this.f164596c = str2;
            this.f164597d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3087b)) {
                return false;
            }
            C3087b c3087b = (C3087b) obj;
            return s.g(this.f164594a, c3087b.f164594a) && this.f164595b == c3087b.f164595b && s.g(this.f164596c, c3087b.f164596c) && s.g(this.f164597d, c3087b.f164597d);
        }

        public final int hashCode() {
            int iE = q6.f.e(this.f164594a.hashCode() * 31, 31, this.f164595b);
            String str = this.f164596c;
            int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f164597d;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(this.f164595b, "ChildAccountCreated(guid=", this.f164594a, ", userId=");
            sn.a.t(sbJ, ", fullName=", this.f164596c, ", countryCode=", this.f164597d);
            sbJ.append(")");
            return sbJ.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lti2/b$c;", "Lti2/b;", "", "urlStr", "<init>", "(Ljava/lang/String;)V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f164598a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            str.getClass();
            this.f164598a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && s.g(this.f164598a, ((c) obj).f164598a);
        }

        public final int hashCode() {
            return this.f164598a.hashCode();
        }

        public final String toString() {
            return am.j.m("ExternalLink(urlStr=", this.f164598a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lti2/b$d;", "Lti2/b;", "Lti2/i;", "reason", "<init>", "(Lti2/i;)V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class d extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ti2.i f164599a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ti2.i iVar) {
            super(null);
            iVar.getClass();
            this.f164599a = iVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f164599a == ((d) obj).f164599a;
        }

        public final int hashCode() {
            return this.f164599a.hashCode();
        }

        public final String toString() {
            return "GlobalSignOut(reason=" + this.f164599a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lti2/b$e;", "Lti2/b;", "<init>", "()V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class e extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f164600a = new e();

        private e() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1461562708;
        }

        public final String toString() {
            return "OnPageLoad";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lti2/b$f;", "Lti2/b;", "", "guid", "<init>", "(Ljava/lang/String;)V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f164601a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(null);
            str.getClass();
            this.f164601a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && s.g(this.f164601a, ((f) obj).f164601a);
        }

        public final int hashCode() {
            return this.f164601a.hashCode();
        }

        public final String toString() {
            return am.j.m("RegisterChildAccount(guid=", this.f164601a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lti2/b$g;", "Lti2/b;", "<init>", "()V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class g extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f164602a = new g();

        private g() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1205453400;
        }

        public final String toString() {
            return "ReloadWebView";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lti2/b$h;", "Lti2/b;", "", "message", "<init>", "(Ljava/lang/String;)V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class h extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f164603a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(null);
            str.getClass();
            this.f164603a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && s.g(this.f164603a, ((h) obj).f164603a);
        }

        public final int hashCode() {
            return this.f164603a.hashCode();
        }

        public final String toString() {
            return am.j.m("Unknown(message=", this.f164603a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lti2/b$i;", "Lti2/b;", "<init>", "()V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class i extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f164604a = new i();

        private i() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -585059039;
        }

        public final String toString() {
            return "UserExit";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lti2/b$j;", "Lti2/b;", "<init>", "()V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class j extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f164605a = new j();

        private j() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -442493943;
        }

        public final String toString() {
            return "ValidBirthDate";
        }
    }

    public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private b() {
    }
}
