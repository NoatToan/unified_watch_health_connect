package ki1;

import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
public interface a {

    /* JADX INFO: renamed from: ki1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lki1/a$a;", "Lki1/a;", "Lfi1/b;", FirebaseAnalytics.Param.LOCATION, "<init>", "(Lfi1/b;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2008a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fi1.b f104817a;

        public C2008a(fi1.b bVar) {
            bVar.getClass();
            this.f104817a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2008a) && this.f104817a.equals(((C2008a) obj).f104817a);
        }

        public final int hashCode() {
            return this.f104817a.hashCode();
        }

        public final String toString() {
            return "Available(location=" + this.f104817a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lki1/a$b;", "Lki1/a;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f104818a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 749407245;
        }

        public final String toString() {
            return "Device";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lki1/a$c;", "Lki1/a;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f104819a = new c();

        private c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -2077122897;
        }

        public final String toString() {
            return "None";
        }
    }
}
