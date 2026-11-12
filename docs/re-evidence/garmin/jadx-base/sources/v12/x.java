package v12;

import am.x0;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.google.firebase.messaging.Constants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lv12/x;", "", "<init>", "()V", "d", JWKParameterNames.RSA_EXPONENT, "c", "b", "a", "Lv12/x$a;", "Lv12/x$b;", "Lv12/x$c;", "Lv12/x$d;", "Lv12/x$e;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class x {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv12/x$a;", "Lv12/x;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f174824a = new a();

        private a() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv12/x$b;", "Lv12/x;", "Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;", "privacyOption", "<init>", "(Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrivacyType f174825a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(PrivacyType privacyType) {
            super(null);
            privacyType.getClass();
            this.f174825a = privacyType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f174825a == ((b) obj).f174825a;
        }

        public final int hashCode() {
            return this.f174825a.hashCode();
        }

        public final String toString() {
            return "NavigateToEditProfile(privacyOption=" + this.f174825a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv12/x$c;", "Lv12/x;", "Lfw/c;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Lfw/c;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fw.c f174826a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(fw.c cVar) {
            super(null);
            cVar.getClass();
            this.f174826a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p005kotlin.jvm.internal.s.g(this.f174826a, ((c) obj).f174826a);
        }

        public final int hashCode() {
            return this.f174826a.hashCode();
        }

        public final String toString() {
            return "RequestFailed(error=" + this.f174826a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lv12/x$d;", "Lv12/x;", "Lam/x0;", "activityType", "Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;", "privacyOption", "<init>", "(Lam/x0;Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x0 f174827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PrivacyType f174828b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(x0 x0Var, PrivacyType privacyType) {
            super(null);
            x0Var.getClass();
            this.f174827a = x0Var;
            this.f174828b = privacyType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f174827a == dVar.f174827a && this.f174828b == dVar.f174828b;
        }

        public final int hashCode() {
            int iHashCode = this.f174827a.hashCode() * 31;
            PrivacyType privacyType = this.f174828b;
            return iHashCode + (privacyType == null ? 0 : privacyType.hashCode());
        }

        public final String toString() {
            return "ReturnResult(activityType=" + this.f174827a + ", privacyOption=" + this.f174828b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv12/x$e;", "Lv12/x;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f174829a = new e();

        private e() {
            super(null);
        }
    }

    public /* synthetic */ x(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private x() {
    }
}
