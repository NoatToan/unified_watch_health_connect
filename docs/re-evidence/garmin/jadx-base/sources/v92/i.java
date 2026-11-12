package v92;

import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lv92/i;", "", "<init>", "()V", "a", "c", JWKParameterNames.RSA_EXPONENT, "b", "d", "Lv92/i$a;", "Lv92/i$b;", "Lv92/i$c;", "Lv92/i$d;", "Lv92/i$e;", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv92/i$a;", "Lv92/i;", "<init>", "()V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f176394a = new a();

        private a() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1603122836;
        }

        public final String toString() {
            return "CancelConsent";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lv92/i$b;", "Lv92/i;", "Lq92/x;", "consentTypeId", "", "isOptOut", "Lkotlin/Function1;", "", "revokeConsentConfirmation", "<init>", "(Lq92/x;ZLe23/l;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class b extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q92.x f176395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f176396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e23.l<Boolean, Unit> f176397c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(q92.x xVar, boolean z14, e23.l<? super Boolean, Unit> lVar) {
            super(null);
            xVar.getClass();
            lVar.getClass();
            this.f176395a = xVar;
            this.f176396b = z14;
            this.f176397c = lVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f176395a == bVar.f176395a && this.f176396b == bVar.f176396b && p005kotlin.jvm.internal.s.g(this.f176397c, bVar.f176397c);
        }

        public final int hashCode() {
            return this.f176397c.hashCode() + q6.f.g(this.f176395a.hashCode() * 31, 31, this.f176396b);
        }

        public final String toString() {
            return "ConsentRevokeConfirmation(consentTypeId=" + this.f176395a + ", isOptOut=" + this.f176396b + ", revokeConsentConfirmation=" + this.f176397c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lv92/i$c;", "Lv92/i;", "Lq92/x;", "consentTypeId", "Lq92/y;", "userOption", "Lv92/f0;", "deviceUploadResult", "<init>", "(Lq92/x;Lq92/y;Lv92/f0;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class c extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q92.x f176398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q92.y f176399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f0 f176400c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q92.x xVar, q92.y yVar, f0 f0Var) {
            super(null);
            xVar.getClass();
            yVar.getClass();
            f0Var.getClass();
            this.f176398a = xVar;
            this.f176399b = yVar;
            this.f176400c = f0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f176398a == cVar.f176398a && this.f176399b == cVar.f176399b && this.f176400c == cVar.f176400c;
        }

        public final int hashCode() {
            return this.f176400c.hashCode() + ((this.f176399b.hashCode() + (this.f176398a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "FinishConsent(consentTypeId=" + this.f176398a + ", userOption=" + this.f176399b + ", deviceUploadResult=" + this.f176400c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv92/i$d;", "Lv92/i;", "<init>", "()V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class d extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f176401a = new d();

        private d() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1674341469;
        }

        public final String toString() {
            return "OpenStorageConsent";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lv92/i$e;", "Lv92/i;", "", "title", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class e extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f176402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f176403b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.f176402a = str;
            this.f176403b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return p005kotlin.jvm.internal.s.g(this.f176402a, eVar.f176402a) && p005kotlin.jvm.internal.s.g(this.f176403b, eVar.f176403b);
        }

        public final int hashCode() {
            return this.f176403b.hashCode() + (this.f176402a.hashCode() * 31);
        }

        public final String toString() {
            return v.e0.g("OpenTermsAndPolicy(title=", this.f176402a, ", url=", this.f176403b, ")");
        }
    }

    public /* synthetic */ i(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private i() {
    }
}
