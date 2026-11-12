package y22;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
public interface i {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ly22/i$a;", "Ly22/i;", "Ly22/w;", "photo", "<init>", "(Ly22/w;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w f194258a;

        public a(w wVar) {
            wVar.getClass();
            this.f194258a = wVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f194258a.equals(((a) obj).f194258a);
        }

        public final int hashCode() {
            return this.f194258a.hashCode();
        }

        public final String toString() {
            return "Failure(photo=" + this.f194258a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly22/i$b;", "Ly22/i;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f194259a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 734783452;
        }

        public final String toString() {
            return "Success";
        }
    }
}
