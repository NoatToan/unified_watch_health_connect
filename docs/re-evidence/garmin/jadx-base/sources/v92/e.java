package v92;

import com.garmin.android.apps.connectmobile.f3;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lv92/e;", "", "<init>", "()V", "a", "b", JWKParameterNames.RSA_EXPONENT, "c", "d", "Lv92/e$a;", "Lv92/e$b;", "Lv92/e$c;", "Lv92/e$d;", "Lv92/e$e;", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class e {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lv92/e$a;", "Lv92/e;", "Lq92/x;", "consentTypeId", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Lq92/x;Ljava/lang/Exception;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q92.x f176355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Exception f176356b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q92.x xVar, Exception exc) {
            super(null);
            exc.getClass();
            this.f176355a = xVar;
            this.f176356b = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f176355a == aVar.f176355a && p005kotlin.jvm.internal.s.g(this.f176356b, aVar.f176356b);
        }

        public final int hashCode() {
            q92.x xVar = this.f176355a;
            return this.f176356b.hashCode() + ((xVar == null ? 0 : xVar.hashCode()) * 31);
        }

        public final String toString() {
            return "ConsentFetchError(consentTypeId=" + this.f176355a + ", exception=" + this.f176356b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lv92/e$b;", "Lv92/e;", "Lq92/x;", "consentTypeId", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Lq92/x;Ljava/lang/Exception;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q92.x f176357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Exception f176358b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q92.x xVar, Exception exc) {
            super(null);
            xVar.getClass();
            exc.getClass();
            this.f176357a = xVar;
            this.f176358b = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f176357a == bVar.f176357a && p005kotlin.jvm.internal.s.g(this.f176358b, bVar.f176358b);
        }

        public final int hashCode() {
            return this.f176358b.hashCode() + (this.f176357a.hashCode() * 31);
        }

        public final String toString() {
            return "ConsentUpdateError(consentTypeId=" + this.f176357a + ", exception=" + this.f176358b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lv92/e$c;", "Lv92/e;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class c extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f176359a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(null);
            exc.getClass();
            this.f176359a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p005kotlin.jvm.internal.s.g(this.f176359a, ((c) obj).f176359a);
        }

        public final int hashCode() {
            return this.f176359a.hashCode();
        }

        public final String toString() {
            return f3.h(this.f176359a, "DeviceUploadConsentFetchError(exception=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lv92/e$d;", "Lv92/e;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f176360a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Exception exc) {
            super(null);
            exc.getClass();
            this.f176360a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p005kotlin.jvm.internal.s.g(this.f176360a, ((d) obj).f176360a);
        }

        public final int hashCode() {
            return this.f176360a.hashCode();
        }

        public final String toString() {
            return f3.h(this.f176360a, "DeviceUploadConsentUpdateError(exception=", ")");
        }
    }

    /* JADX INFO: renamed from: v92.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lv92/e$e;", "Lv92/e;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class C3293e extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f176361a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3293e(Exception exc) {
            super(null);
            exc.getClass();
            this.f176361a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3293e) && p005kotlin.jvm.internal.s.g(this.f176361a, ((C3293e) obj).f176361a);
        }

        public final int hashCode() {
            return this.f176361a.hashCode();
        }

        public final String toString() {
            return f3.h(this.f176361a, "PasswordConfirmationError(exception=", ")");
        }
    }

    public /* synthetic */ e(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private e() {
    }
}
