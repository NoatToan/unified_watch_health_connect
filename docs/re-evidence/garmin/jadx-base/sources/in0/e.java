package in0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
public interface e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lin0/e$a;", "Lin0/e;", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f94433a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -950715162;
        }

        public final String toString() {
            return "AllMetricsInRange";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lin0/e$b;", "Lin0/e;", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f94434a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 29956602;
        }

        public final String toString() {
            return "Calibration";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lin0/e$c;", "Lin0/e;", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f94435a = new c();

        private c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -320145906;
        }

        public final String toString() {
            return "NoDataAvailable";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lin0/e$d;", "Lin0/e;", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f94436a = new d();

        private d() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1865477249;
        }

        public final String toString() {
            return "NotCapableDevice";
        }
    }

    /* JADX INFO: renamed from: in0.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lin0/e$e;", "Lin0/e;", "", "outlierMetricsCount", "", "allMetricsSupported", "<init>", "(IZ)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C1801e implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f94437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f94438b;

        public C1801e(int i14, boolean z14) {
            this.f94437a = i14;
            this.f94438b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1801e)) {
                return false;
            }
            C1801e c1801e = (C1801e) obj;
            return this.f94437a == c1801e.f94437a && this.f94438b == c1801e.f94438b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f94438b) + (Integer.hashCode(this.f94437a) * 31);
        }

        public final String toString() {
            return "OutlierMetrics(outlierMetricsCount=" + this.f94437a + ", allMetricsSupported=" + this.f94438b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lin0/e$f;", "Lin0/e;", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f94439a = new f();

        private f() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1704982870;
        }

        public final String toString() {
            return "WristHrTurnedOff";
        }
    }
}
