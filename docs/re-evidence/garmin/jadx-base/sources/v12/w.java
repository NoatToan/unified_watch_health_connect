package v12;

import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lv12/w;", "", "<init>", "()V", "d", JWKParameterNames.RSA_EXPONENT, "c", "b", "a", "Lv12/w$a;", "Lv12/w$b;", "Lv12/w$c;", "Lv12/w$d;", "Lv12/w$e;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class w {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv12/w$a;", "Lv12/w;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f174819a = new a();

        private a() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv12/w$b;", "Lv12/w;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f174820a = new b();

        private b() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv12/w$c;", "Lv12/w;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f174821a = new c();

        private c() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lv12/w$d;", "Lv12/w;", "Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;", "option", "<init>", "(Lcom/garmin/android/apps/connectmobile/activities/PrivacyType;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrivacyType f174822a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(PrivacyType privacyType) {
            super(null);
            privacyType.getClass();
            this.f174822a = privacyType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f174822a == ((d) obj).f174822a;
        }

        public final int hashCode() {
            return this.f174822a.hashCode();
        }

        public final String toString() {
            return "OptionSelected(option=" + this.f174822a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv12/w$e;", "Lv12/w;", "<init>", "()V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f174823a = new e();

        private e() {
            super(null);
        }
    }

    public /* synthetic */ w(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private w() {
    }
}
