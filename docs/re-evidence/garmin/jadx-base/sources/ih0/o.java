package ih0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
public interface o {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lih0/o$a;", "Lih0/o;", "Ldh0/g;", "metricType", "<init>", "(Ldh0/g;)V", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dh0.g f93470a;

        public a(dh0.g gVar) {
            gVar.getClass();
            this.f93470a = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f93470a == ((a) obj).f93470a;
        }

        public final int hashCode() {
            return this.f93470a.hashCode();
        }

        public final String toString() {
            return "Metric(metricType=" + this.f93470a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lih0/o$b;", "Lih0/o;", "<init>", "()V", "gcm-fitness-age_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f93471a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 30837231;
        }

        public final String toString() {
            return "UserSettings";
        }
    }
}
