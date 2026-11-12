package v92;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lv92/d0;", "", "<init>", "()V", JWKParameterNames.OCT_KEY_VALUE, JWKParameterNames.RSA_EXPONENT, "h", "g", "d", "b", IntegerTokenConverter.CONVERTER_KEY, "j", "c", "m", "a", "l", "f", "Lv92/d0$a;", "Lv92/d0$b;", "Lv92/d0$c;", "Lv92/d0$d;", "Lv92/d0$e;", "Lv92/d0$f;", "Lv92/d0$g;", "Lv92/d0$h;", "Lv92/d0$i;", "Lv92/d0$j;", "Lv92/d0$k;", "Lv92/d0$l;", "Lv92/d0$m;", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class d0 {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lv92/d0$b;", "Lv92/d0;", "Lq92/x;", "consentTypeId", "Lq92/y;", "userOption", "Lv92/f0;", "deviceUploadResult", "<init>", "(Lq92/x;Lq92/y;Lv92/f0;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class b extends d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q92.x f176338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q92.y f176339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f0 f176340c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q92.x xVar, q92.y yVar, f0 f0Var) {
            super(null);
            xVar.getClass();
            yVar.getClass();
            f0Var.getClass();
            this.f176338a = xVar;
            this.f176339b = yVar;
            this.f176340c = f0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f176338a == bVar.f176338a && this.f176339b == bVar.f176339b && this.f176340c == bVar.f176340c;
        }

        public final int hashCode() {
            return this.f176340c.hashCode() + ((this.f176339b.hashCode() + (this.f176338a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "ConsentUpdateSuccess(consentTypeId=" + this.f176338a + ", userOption=" + this.f176339b + ", deviceUploadResult=" + this.f176340c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv92/d0$c;", "Lv92/d0;", "", "deviceUploadEnabled", "<init>", "(Z)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class c extends d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f176341a;

        public c(boolean z14) {
            super(null);
            this.f176341a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f176341a == ((c) obj).f176341a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f176341a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("DeviceUploadConsentUpdateSuccess(deviceUploadEnabled=", ")", this.f176341a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv92/d0$d;", "Lv92/d0;", "", "token", "<init>", "(Ljava/lang/String;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class d extends d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f176342a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(null);
            str.getClass();
            this.f176342a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p005kotlin.jvm.internal.s.g(this.f176342a, ((d) obj).f176342a);
        }

        public final int hashCode() {
            return this.f176342a.hashCode();
        }

        public final String toString() {
            return am.j.m("PasswordConfirmationSuccess(token=", this.f176342a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lv92/d0$e;", "Lv92/d0;", "", "showRequireConsent", "Ls92/g;", "consentTextDTO", "<init>", "(ZLs92/g;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class e extends d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f176343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s92.g f176344b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z14, s92.g gVar) {
            super(null);
            gVar.getClass();
            this.f176343a = z14;
            this.f176344b = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f176343a == eVar.f176343a && p005kotlin.jvm.internal.s.g(this.f176344b, eVar.f176344b);
        }

        public final int hashCode() {
            return this.f176344b.hashCode() + (Boolean.hashCode(this.f176343a) * 31);
        }

        public final String toString() {
            return "ShowConsent(showRequireConsent=" + this.f176343a + ", consentTextDTO=" + this.f176344b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv92/d0$f;", "Lv92/d0;", "<init>", "()V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class f extends d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f176345a = new f();

        private f() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -282171162;
        }

        public final String toString() {
            return "ShowConsentUpdateDataStorageRequired";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lv92/d0$g;", "Lv92/d0;", "Ls92/g;", "confirmDeleteDataTextDTO", "consentOptOutTextDTO", "", "userEmailAddress", "<init>", "(Ls92/g;Ls92/g;Ljava/lang/String;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class g extends d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s92.g f176346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s92.g f176347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f176348c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(s92.g gVar, s92.g gVar2, String str) {
            super(null);
            gVar.getClass();
            gVar2.getClass();
            str.getClass();
            this.f176346a = gVar;
            this.f176347b = gVar2;
            this.f176348c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return p005kotlin.jvm.internal.s.g(this.f176346a, gVar.f176346a) && p005kotlin.jvm.internal.s.g(this.f176347b, gVar.f176347b) && p005kotlin.jvm.internal.s.g(this.f176348c, gVar.f176348c);
        }

        public final int hashCode() {
            return this.f176348c.hashCode() + ((this.f176347b.hashCode() + (this.f176346a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ShowDeleteDataConfirmation(confirmDeleteDataTextDTO=");
            sb3.append(this.f176346a);
            sb3.append(", consentOptOutTextDTO=");
            sb3.append(this.f176347b);
            sb3.append(", userEmailAddress=");
            return am.j.o(this.f176348c, ")", sb3);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv92/d0$h;", "Lv92/d0;", "Ls92/g;", "consentTextDTO", "<init>", "(Ls92/g;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class h extends d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s92.g f176349a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(s92.g gVar) {
            super(null);
            gVar.getClass();
            this.f176349a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && p005kotlin.jvm.internal.s.g(this.f176349a, ((h) obj).f176349a);
        }

        public final int hashCode() {
            return this.f176349a.hashCode();
        }

        public final String toString() {
            return "ShowDeleteNotConfirmed(consentTextDTO=" + this.f176349a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv92/d0$i;", "Lv92/d0;", "", "deviceUploadEnabled", "<init>", "(Z)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class i extends d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f176350a;

        public i(boolean z14) {
            super(null);
            this.f176350a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f176350a == ((i) obj).f176350a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f176350a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("ShowDeviceUploadConsent(deviceUploadEnabled=", ")", this.f176350a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv92/d0$j;", "Lv92/d0;", "<init>", "()V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class j extends d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f176351a = new j();

        private j() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -236418976;
        }

        public final String toString() {
            return "ShowDeviceUploadDataStorageRequired";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv92/d0$k;", "Lv92/d0;", "<init>", "()V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class k extends d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f176352a = new k();

        private k() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1225192989;
        }

        public final String toString() {
            return "ShowLoading";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv92/d0$l;", "Lv92/d0;", "<init>", "()V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class l extends d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f176353a = new l();

        private l() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 897376997;
        }

        public final String toString() {
            return "ShowManagerConsentRequired";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv92/d0$m;", "Lv92/d0;", "<init>", "()V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class m extends d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f176354a = new m();

        private m() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 1986189516;
        }

        public final String toString() {
            return "WrongPassword";
        }
    }

    public /* synthetic */ d0(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private d0() {
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lv92/d0$a;", "Lv92/d0;", "Lv92/e;", "consentErrorType", "Lkotlin/Function0;", "", "retry", "<init>", "(Lv92/e;Le23/a;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class a extends d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v92.e f176336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e23.a<Unit> f176337b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v92.e eVar, e23.a<Unit> aVar) {
            super(null);
            eVar.getClass();
            this.f176336a = eVar;
            this.f176337b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f176336a, aVar.f176336a) && p005kotlin.jvm.internal.s.g(this.f176337b, aVar.f176337b);
        }

        public final int hashCode() {
            int iHashCode = this.f176336a.hashCode() * 31;
            e23.a<Unit> aVar = this.f176337b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public final String toString() {
            return "ConsentError(consentErrorType=" + this.f176336a + ", retry=" + this.f176337b + ")";
        }

        public /* synthetic */ a(v92.e eVar, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(eVar, (i14 & 2) != 0 ? null : aVar);
        }
    }
}
