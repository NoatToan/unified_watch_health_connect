package a60;

import am.j;
import k30.k;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
public interface a {

    /* JADX INFO: renamed from: a60.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La60/a$a;", "La60/a;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0016a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0016a f1527a = new C0016a();

        private C0016a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0016a);
        }

        public final int hashCode() {
            return -855226631;
        }

        public final String toString() {
            return "SaveCourseParameters";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La60/a$b;", "La60/a;", "", "value", "<init>", "(Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f1528a;

        public b(boolean z14) {
            this.f1528a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f1528a == ((b) obj).f1528a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f1528a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("UpdateAvoidClosedRoadsValue(value=", ")", this.f1528a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La60/a$c;", "La60/a;", "", "value", "<init>", "(Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f1529a;

        public c(boolean z14) {
            this.f1529a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f1529a == ((c) obj).f1529a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f1529a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("UpdateAvoidHighTrafficValue(value=", ")", this.f1529a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La60/a$d;", "La60/a;", "", "value", "<init>", "(Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f1530a;

        public d(boolean z14) {
            this.f1530a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f1530a == ((d) obj).f1530a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f1530a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("UpdateAvoidUnpavedRoadsValue(value=", ")", this.f1530a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La60/a$e;", "La60/a;", "Lw20/b;", "direction", "<init>", "(Lw20/b;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w20.b f1531a;

        public e(w20.b bVar) {
            bVar.getClass();
            this.f1531a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f1531a == ((e) obj).f1531a;
        }

        public final int hashCode() {
            return this.f1531a.hashCode();
        }

        public final String toString() {
            return "UpdateCourseDirection(direction=" + this.f1531a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La60/a$f;", "La60/a;", "", "distance", "<init>", "(Ljava/lang/Double;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Double f1532a;

        public f(Double d14) {
            this.f1532a = d14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && s.g(this.f1532a, ((f) obj).f1532a);
        }

        public final int hashCode() {
            Double d14 = this.f1532a;
            if (d14 == null) {
                return 0;
            }
            return d14.hashCode();
        }

        public final String toString() {
            return "UpdateCourseDistance(distance=" + this.f1532a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La60/a$g;", "La60/a;", "", "name", "<init>", "(Ljava/lang/String;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f1533a;

        public g(String str) {
            this.f1533a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && s.g(this.f1533a, ((g) obj).f1533a);
        }

        public final int hashCode() {
            String str = this.f1533a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return j.m("UpdateCourseName(name=", this.f1533a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La60/a$h;", "La60/a;", "Lk30/k;", "routingType", "<init>", "(Lk30/k;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f1534a;

        public h(k kVar) {
            kVar.getClass();
            this.f1534a = kVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f1534a == ((h) obj).f1534a;
        }

        public final int hashCode() {
            return this.f1534a.hashCode();
        }

        public final String toString() {
            return "UpdateCourseRoutingType(routingType=" + this.f1534a + ")";
        }
    }
}
