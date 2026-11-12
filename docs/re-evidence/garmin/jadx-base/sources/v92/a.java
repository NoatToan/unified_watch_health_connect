package v92;

import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lv92/a;", "", "<init>", "()V", "a", "f", "c", "b", "d", JWKParameterNames.RSA_EXPONENT, "Lv92/a$a;", "Lv92/a$b;", "Lv92/a$c;", "Lv92/a$d;", "Lv92/a$e;", "Lv92/a$f;", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: v92.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lv92/a$a;", "Lv92/a;", "Lv92/m;", "consentViewAction", "Ls92/g;", "consentTextDTO", "<init>", "(Lv92/m;Ls92/g;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class C3291a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f176290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s92.g f176291b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3291a(m mVar, s92.g gVar) {
            super(null);
            mVar.getClass();
            gVar.getClass();
            this.f176290a = mVar;
            this.f176291b = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3291a)) {
                return false;
            }
            C3291a c3291a = (C3291a) obj;
            return this.f176290a == c3291a.f176290a && p005kotlin.jvm.internal.s.g(this.f176291b, c3291a.f176291b);
        }

        public final int hashCode() {
            return this.f176291b.hashCode() + (this.f176290a.hashCode() * 31);
        }

        public final String toString() {
            return "ConsentActionClicked(consentViewAction=" + this.f176290a + ", consentTextDTO=" + this.f176291b + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lv92/a$b;", "Lv92/a;", "Lq92/x;", "consentTypeId", "", "isOptOut", "Lkotlin/Function1;", "", "revokeConsentConfirmation", "<init>", "(Lq92/x;ZLe23/l;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q92.x f176292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f176293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e23.l<Boolean, Unit> f176294c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(q92.x xVar, boolean z14, e23.l<? super Boolean, Unit> lVar) {
            super(null);
            xVar.getClass();
            lVar.getClass();
            this.f176292a = xVar;
            this.f176293b = z14;
            this.f176294c = lVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f176292a == bVar.f176292a && this.f176293b == bVar.f176293b && p005kotlin.jvm.internal.s.g(this.f176294c, bVar.f176294c);
        }

        public final int hashCode() {
            return this.f176294c.hashCode() + q6.f.g(this.f176292a.hashCode() * 31, 31, this.f176293b);
        }

        public final String toString() {
            return "ConsentRevokeConfirmation(consentTypeId=" + this.f176292a + ", isOptOut=" + this.f176293b + ", revokeConsentConfirmation=" + this.f176294c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv92/a$c;", "Lv92/a;", "", "enabled", "<init>", "(Z)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f176295a;

        public c(boolean z14) {
            super(null);
            this.f176295a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f176295a == ((c) obj).f176295a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f176295a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("DeviceUploadToggled(enabled=", ")", this.f176295a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lv92/a$d;", "Lv92/a;", "Lq92/x;", "consentTypeId", "Lq92/y;", "userOption", "Lv92/f0;", "deviceUploadResult", "<init>", "(Lq92/x;Lq92/y;Lv92/f0;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q92.x f176296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q92.y f176297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f0 f176298c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(q92.x xVar, q92.y yVar, f0 f0Var) {
            super(null);
            xVar.getClass();
            yVar.getClass();
            f0Var.getClass();
            this.f176296a = xVar;
            this.f176297b = yVar;
            this.f176298c = f0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f176296a == dVar.f176296a && this.f176297b == dVar.f176297b && this.f176298c == dVar.f176298c;
        }

        public final int hashCode() {
            return this.f176298c.hashCode() + ((this.f176297b.hashCode() + (this.f176296a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "FinishConsent(consentTypeId=" + this.f176296a + ", userOption=" + this.f176297b + ", deviceUploadResult=" + this.f176298c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv92/a$e;", "Lv92/a;", "<init>", "()V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class e extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f176299a = new e();

        private e() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -9527705;
        }

        public final String toString() {
            return "OpenStorageConsent";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lv92/a$f;", "Lv92/a;", "", "title", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class f extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f176300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f176301b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.f176300a = str;
            this.f176301b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return p005kotlin.jvm.internal.s.g(this.f176300a, fVar.f176300a) && p005kotlin.jvm.internal.s.g(this.f176301b, fVar.f176301b);
        }

        public final int hashCode() {
            return this.f176301b.hashCode() + (this.f176300a.hashCode() * 31);
        }

        public final String toString() {
            return v.e0.g("TermsAndPolicyClicked(title=", this.f176300a, ", url=", this.f176301b, ")");
        }
    }

    public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private a() {
    }
}
