package ki1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
public interface u {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lki1/u$a;", "Lki1/u;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f104907a;

        public a(Throwable th3) {
            th3.getClass();
            this.f104907a = th3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f104907a.equals(((a) obj).f104907a);
        }

        public final int hashCode() {
            return this.f104907a.hashCode();
        }

        public final String toString() {
            return "Error(throwable=" + this.f104907a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lki1/u$b;", "Lki1/u;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f104908a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1366566900;
        }

        public final String toString() {
            return "Loading";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lki1/u$c;", "Lki1/u;", "<init>", "()V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f104909a = new c();

        private c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 724580051;
        }

        public final String toString() {
            return "Success";
        }
    }
}
