package jl1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
public interface c {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljl1/c$a;", "Ljl1/c;", "Lxs/h;", "failure", "<init>", "(Lxs/h;)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xs.h f99474a;

        public a(xs.h hVar) {
            hVar.getClass();
            this.f99474a = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f99474a == ((a) obj).f99474a;
        }

        public final int hashCode() {
            return this.f99474a.hashCode();
        }

        public final String toString() {
            return "FavoriteActivitiesSaveError(failure=" + this.f99474a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljl1/c$b;", "Ljl1/c;", "<init>", "()V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f99475a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1372239127;
        }

        public final String toString() {
            return "GenericError";
        }
    }

    /* JADX INFO: renamed from: jl1.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljl1/c$c;", "Ljl1/c;", "<init>", "()V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C1911c implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1911c f99476a = new C1911c();

        private C1911c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1911c);
        }

        public final int hashCode() {
            return 1078432890;
        }

        public final String toString() {
            return "Idle";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljl1/c$d;", "Ljl1/c;", "<init>", "()V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f99477a = new d();

        private d() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 2002379165;
        }

        public final String toString() {
            return "Success";
        }
    }
}
