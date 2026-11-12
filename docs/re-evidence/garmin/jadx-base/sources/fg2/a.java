package fg2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
public interface a {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfg2/a$b;", "Lfg2/a;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f71400a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1562763481;
        }

        public final String toString() {
            return "Calibration";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfg2/a$c;", "Lfg2/a;", "", "distanceMeters", "<init>", "(I)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f71401a;

        public c(int i14) {
            this.f71401a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f71401a == ((c) obj).f71401a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f71401a);
        }

        public final String toString() {
            return v.e0.f(this.f71401a, "ManualEntry(distanceMeters=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfg2/a$d;", "Lfg2/a;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f71402a = new d();

        private d() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -539749337;
        }

        public final String toString() {
            return "NotAvailable";
        }
    }

    /* JADX INFO: renamed from: fg2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfg2/a$a;", "Lfg2/a;", "", "distanceMeters", "", "isCalibration", "<init>", "(IZ)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C1456a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f71398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f71399b;

        public /* synthetic */ C1456a(int i14, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
            this(i14, (i15 & 2) != 0 ? false : z14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1456a)) {
                return false;
            }
            C1456a c1456a = (C1456a) obj;
            return this.f71398a == c1456a.f71398a && this.f71399b == c1456a.f71399b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f71399b) + (Integer.hashCode(this.f71398a) * 31);
        }

        public final String toString() {
            return "Active(distanceMeters=" + this.f71398a + ", isCalibration=" + this.f71399b + ")";
        }

        public C1456a(int i14, boolean z14) {
            this.f71398a = i14;
            this.f71399b = z14;
        }
    }
}
