package n30;

import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.PointOfInterestDTO;
import com.mapbox.maps.interactions.standard.generated.StandardPoi;
import java.util.List;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
public interface j {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/j$a;", "Ln30/j;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f123496a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -104753009;
        }

        public final String toString() {
            return "CenterMapToCurrentLocation";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/j$b;", "Ln30/j;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f123497a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1621209039;
        }

        public final String toString() {
            return "CollapseRouteOptionsBottomSheet";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/j$c;", "Ln30/j;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f123498a = new c();

        private c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -917414335;
        }

        public final String toString() {
            return "HideMapSettingsHint";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/j$d;", "Ln30/j;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f123499a = new d();

        private d() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1826990822;
        }

        public final String toString() {
            return "HideRouteOptionsBottomSheet";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/j$e;", "Ln30/j;", "", "climbIndex", "<init>", "(I)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class e implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f123500a;

        public e(int i14) {
            this.f123500a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f123500a == ((e) obj).f123500a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f123500a);
        }

        public final String toString() {
            return e0.f(this.f123500a, "HighlightClimbOnCourse(climbIndex=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/j$f;", "Ln30/j;", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "climbDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class f implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClimbDTO f123501a;

        static {
            Parcelable.Creator<ClimbDTO> creator = ClimbDTO.CREATOR;
        }

        public f(ClimbDTO climbDTO) {
            climbDTO.getClass();
            this.f123501a = climbDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f123501a.equals(((f) obj).f123501a);
        }

        public final int hashCode() {
            return this.f123501a.hashCode();
        }

        public final String toString() {
            return "HighlightClimbOnSystem(climbDTO=" + this.f123501a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln30/j$g;", "Ln30/j;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "climbs", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class g implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<ClimbDTO> f123502a;

        public g(List<ClimbDTO> list) {
            list.getClass();
            this.f123502a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f123502a.equals(((g) obj).f123502a);
        }

        public final int hashCode() {
            return this.f123502a.hashCode();
        }

        public final String toString() {
            return tn.k.h("HighlightClimbSystem(climbs=", ")", this.f123502a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/j$h;", "Ln30/j;", "Lfn0/a;", "hazard", "<init>", "(Lfn0/a;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class h implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fn0.a f123503a;

        static {
            Parcelable.Creator<fn0.a> creator = fn0.a.CREATOR;
        }

        public h(fn0.a aVar) {
            aVar.getClass();
            this.f123503a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f123503a.equals(((h) obj).f123503a);
        }

        public final int hashCode() {
            return this.f123503a.hashCode();
        }

        public final String toString() {
            return "HighlightHazard(hazard=" + this.f123503a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/j$i;", "Ln30/j;", "Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;", StandardPoi.FEATURESET_ID, "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class i implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PointOfInterestDTO f123504a;

        static {
            Parcelable.Creator<PointOfInterestDTO> creator = PointOfInterestDTO.CREATOR;
        }

        public i(PointOfInterestDTO pointOfInterestDTO) {
            pointOfInterestDTO.getClass();
            this.f123504a = pointOfInterestDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f123504a.equals(((i) obj).f123504a);
        }

        public final int hashCode() {
            return this.f123504a.hashCode();
        }

        public final String toString() {
            return "HighlightPointOfInterest(poi=" + this.f123504a + ")";
        }
    }

    /* JADX INFO: renamed from: n30.j$j, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/j$j;", "Ln30/j;", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "climbDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2317j implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClimbDTO f123505a;

        static {
            Parcelable.Creator<ClimbDTO> creator = ClimbDTO.CREATOR;
        }

        public C2317j(ClimbDTO climbDTO) {
            climbDTO.getClass();
            this.f123505a = climbDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2317j) && this.f123505a.equals(((C2317j) obj).f123505a);
        }

        public final int hashCode() {
            return this.f123505a.hashCode();
        }

        public final String toString() {
            return "HighlightPrimaryClimb(climbDTO=" + this.f123505a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/j$k;", "Ln30/j;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class k implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f123506a = new k();

        private k() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -728683034;
        }

        public final String toString() {
            return "NavigateToCreateCourse";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/j$l;", "Ln30/j;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class l implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f123507a = new l();

        private l() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 981075981;
        }

        public final String toString() {
            return "RemoveClimbsFromMap";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/j$m;", "Ln30/j;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class m implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f123508a = new m();

        private m() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 257922823;
        }

        public final String toString() {
            return "RemovePointsOfInterestFromMap";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/j$n;", "Ln30/j;", "", "climbIndex", "<init>", "(I)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class n implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f123509a;

        public n(int i14) {
            this.f123509a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f123509a == ((n) obj).f123509a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f123509a);
        }

        public final String toString() {
            return e0.f(this.f123509a, "RevertHighlightOnClimbOnCourse(climbIndex=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/j$o;", "Ln30/j;", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "climbDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class o implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClimbDTO f123510a;

        static {
            Parcelable.Creator<ClimbDTO> creator = ClimbDTO.CREATOR;
        }

        public o(ClimbDTO climbDTO) {
            climbDTO.getClass();
            this.f123510a = climbDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f123510a.equals(((o) obj).f123510a);
        }

        public final int hashCode() {
            return this.f123510a.hashCode();
        }

        public final String toString() {
            return "RevertHighlightOnClimbOnSystem(climbDTO=" + this.f123510a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln30/j$p;", "Ln30/j;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "climbs", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class p implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<ClimbDTO> f123511a;

        public p(List<ClimbDTO> list) {
            list.getClass();
            this.f123511a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f123511a.equals(((p) obj).f123511a);
        }

        public final int hashCode() {
            return this.f123511a.hashCode();
        }

        public final String toString() {
            return tn.k.h("RevertHighlightOnClimbSystem(climbs=", ")", this.f123511a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/j$q;", "Ln30/j;", "Lfn0/a;", "hazard", "<init>", "(Lfn0/a;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class q implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fn0.a f123512a;

        static {
            Parcelable.Creator<fn0.a> creator = fn0.a.CREATOR;
        }

        public q(fn0.a aVar) {
            aVar.getClass();
            this.f123512a = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.f123512a.equals(((q) obj).f123512a);
        }

        public final int hashCode() {
            return this.f123512a.hashCode();
        }

        public final String toString() {
            return "RevertHighlightOnHazard(hazard=" + this.f123512a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/j$r;", "Ln30/j;", "Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;", StandardPoi.FEATURESET_ID, "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class r implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PointOfInterestDTO f123513a;

        static {
            Parcelable.Creator<PointOfInterestDTO> creator = PointOfInterestDTO.CREATOR;
        }

        public r(PointOfInterestDTO pointOfInterestDTO) {
            pointOfInterestDTO.getClass();
            this.f123513a = pointOfInterestDTO;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f123513a.equals(((r) obj).f123513a);
        }

        public final int hashCode() {
            return this.f123513a.hashCode();
        }

        public final String toString() {
            return "RevertHighlightOnPointOfInterest(poi=" + this.f123513a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/j$s;", "Ln30/j;", "", "climbId", "<init>", "(Ljava/lang/Long;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class s implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f123514a;

        public s(Long l14) {
            this.f123514a = l14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && p005kotlin.jvm.internal.s.g(this.f123514a, ((s) obj).f123514a);
        }

        public final int hashCode() {
            Long l14 = this.f123514a;
            if (l14 == null) {
                return 0;
            }
            return l14.hashCode();
        }

        public final String toString() {
            return "RevertHighlightOnPrimaryClimb(climbId=" + this.f123514a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln30/j$t;", "Ln30/j;", "", "padding", "<init>", "(I)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class t implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f123515a;

        public t(int i14) {
            this.f123515a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.f123515a == ((t) obj).f123515a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f123515a);
        }

        public final String toString() {
            return e0.f(this.f123515a, "SetCustomMapPadding(padding=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln30/j$u;", "Ln30/j;", "", "Lk30/g;", "climbs", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class u implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<k30.g> f123516a;

        public u(List<k30.g> list) {
            list.getClass();
            this.f123516a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && this.f123516a.equals(((u) obj).f123516a);
        }

        public final int hashCode() {
            return this.f123516a.hashCode();
        }

        public final String toString() {
            return tn.k.h("ShowClimbsOnMap(climbs=", ")", this.f123516a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln30/j$v;", "Ln30/j;", "", "Lfn0/e;", "hazards", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class v implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<fn0.e> f123517a;

        public v(List<fn0.e> list) {
            list.getClass();
            this.f123517a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && this.f123517a.equals(((v) obj).f123517a);
        }

        public final int hashCode() {
            return this.f123517a.hashCode();
        }

        public final String toString() {
            return tn.k.h("ShowHazardsOnMap(hazards=", ")", this.f123517a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/j$w;", "Ln30/j;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class w implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final w f123518a = new w();

        private w() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof w);
        }

        public final int hashCode() {
            return 782226214;
        }

        public final String toString() {
            return "ShowMapSettingsHint";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln30/j$x;", "Ln30/j;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/PointOfInterestDTO;", "pointsOfInterest", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class x implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<PointOfInterestDTO> f123519a;

        public x(List<PointOfInterestDTO> list) {
            list.getClass();
            this.f123519a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && this.f123519a.equals(((x) obj).f123519a);
        }

        public final int hashCode() {
            return this.f123519a.hashCode();
        }

        public final String toString() {
            return tn.k.h("ShowPointsOfInterestOnMap(pointsOfInterest=", ")", this.f123519a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln30/j$y;", "Ln30/j;", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class y implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final y f123520a = new y();

        private y() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof y);
        }

        public final int hashCode() {
            return 1175317122;
        }

        public final String toString() {
            return "ShowRoutingError";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln30/j$z;", "Ln30/j;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "climbs", "<init>", "(Ljava/util/List;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class z implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<ClimbDTO> f123521a;

        public z(List<ClimbDTO> list) {
            this.f123521a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && p005kotlin.jvm.internal.s.g(this.f123521a, ((z) obj).f123521a);
        }

        public final int hashCode() {
            List<ClimbDTO> list = this.f123521a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return tn.k.h("ShowSecondaryClimbs(climbs=", ")", this.f123521a);
        }
    }
}
