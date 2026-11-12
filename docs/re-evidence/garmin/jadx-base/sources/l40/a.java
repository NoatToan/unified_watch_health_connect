package l40;

import java.util.List;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
public interface a {

    /* JADX INFO: renamed from: l40.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll40/a$a;", "Ll40/a;", "", "mapType", "<init>", "(I)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2100a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f109878a;

        public C2100a(int i14) {
            this.f109878a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2100a) && this.f109878a == ((C2100a) obj).f109878a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f109878a);
        }

        public final String toString() {
            return e0.f(this.f109878a, "ChangeMapType(mapType=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll40/a$b;", "Ll40/a;", "", "minDifficulty", "maxDifficulty", "<init>", "(II)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f109879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f109880b;

        public b(int i14, int i15) {
            this.f109879a = i14;
            this.f109880b = i15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f109879a == bVar.f109879a && this.f109880b == bVar.f109880b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f109880b) + (Integer.hashCode(this.f109879a) * 31);
        }

        public final String toString() {
            return am.j.g(this.f109879a, this.f109880b, "SetClimbsDifficultyRange(minDifficulty=", ", maxDifficulty=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll40/a$c;", "Ll40/a;", "", "isVisible", "<init>", "(Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f109881a;

        public c(boolean z14) {
            this.f109881a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f109881a == ((c) obj).f109881a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f109881a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("SetClimbsVisible(isVisible=", ")", this.f109881a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll40/a$d;", "Ll40/a;", "", "isVisible", "<init>", "(Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f109882a;

        public d(boolean z14) {
            this.f109882a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f109882a == ((d) obj).f109882a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f109882a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("SetDistanceMarkersVisible(isVisible=", ")", this.f109882a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll40/a$e;", "Ll40/a;", "", "Lfn0/c;", "types", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<fn0.c> f109883a;

        /* JADX WARN: Multi-variable type inference failed */
        public e(List<? extends fn0.c> list) {
            list.getClass();
            this.f109883a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f109883a.equals(((e) obj).f109883a);
        }

        public final int hashCode() {
            return this.f109883a.hashCode();
        }

        public final String toString() {
            return tn.k.h("SetHazardTypes(types=", ")", this.f109883a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll40/a$f;", "Ll40/a;", "", "isVisible", "<init>", "(Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f109884a;

        public f(boolean z14) {
            this.f109884a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f109884a == ((f) obj).f109884a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f109884a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("SetHazardsOnCourseVisible(isVisible=", ")", this.f109884a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll40/a$g;", "Ll40/a;", "", "isVisible", "<init>", "(Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f109885a;

        public g(boolean z14) {
            this.f109885a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f109885a == ((g) obj).f109885a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f109885a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("SetHazardsVisible(isVisible=", ")", this.f109885a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll40/a$h;", "Ll40/a;", "", "isVisible", "<init>", "(Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f109886a;

        public h(boolean z14) {
            this.f109886a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f109886a == ((h) obj).f109886a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f109886a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("SetHighTrafficRoadsVisible(isVisible=", ")", this.f109886a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll40/a$i;", "Ll40/a;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/h;", "types", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<com.garmin.android.apps.connectmobile.courses.model.h> f109887a;

        /* JADX WARN: Multi-variable type inference failed */
        public i(List<? extends com.garmin.android.apps.connectmobile.courses.model.h> list) {
            list.getClass();
            this.f109887a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f109887a.equals(((i) obj).f109887a);
        }

        public final int hashCode() {
            return this.f109887a.hashCode();
        }

        public final String toString() {
            return tn.k.h("SetPointOfInterestTypes(types=", ")", this.f109887a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll40/a$j;", "Ll40/a;", "", "isVisible", "<init>", "(Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class j implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f109888a;

        public j(boolean z14) {
            this.f109888a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f109888a == ((j) obj).f109888a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f109888a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("SetPointsOfInterestVisible(isVisible=", ")", this.f109888a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll40/a$k;", "Ll40/a;", "", "isVisible", "<init>", "(Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f109889a;

        public k(boolean z14) {
            this.f109889a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f109889a == ((k) obj).f109889a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f109889a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("SetPopularityHeatmapVisible(isVisible=", ")", this.f109889a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll40/a$l;", "Ll40/a;", "", "isVisible", "<init>", "(Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f109890a;

        public l(boolean z14) {
            this.f109890a = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.f109890a == ((l) obj).f109890a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f109890a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("SetUnpavedRoadsVisible(isVisible=", ")", this.f109890a);
        }
    }
}
