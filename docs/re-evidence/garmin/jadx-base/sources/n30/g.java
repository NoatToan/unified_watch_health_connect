package n30;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.f3;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ln30/g;", "", "", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "courseRoutePoints", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePoints", "", "isLapCoursePointToggleOn", "Ln30/e;", "courseParameters", "<init>", "(Ljava/util/List;Ljava/util/List;ZLn30/e;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<GeoPointDTO> f123466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.courses.model.g> f123467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f123468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f123469d;

    public /* synthetic */ g(List list, List list2, boolean z14, e eVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, (i14 & 2) != 0 ? null : list2, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? null : eVar);
    }

    public static g a(g gVar, List list, boolean z14, e eVar, int i14) {
        List<GeoPointDTO> list2 = gVar.f123466a;
        if ((i14 & 2) != 0) {
            list = gVar.f123467b;
        }
        if ((i14 & 4) != 0) {
            z14 = gVar.f123468c;
        }
        if ((i14 & 8) != 0) {
            eVar = gVar.f123469d;
        }
        list2.getClass();
        return new g(list2, list, z14, eVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f123466a, gVar.f123466a) && s.g(this.f123467b, gVar.f123467b) && this.f123468c == gVar.f123468c && s.g(this.f123469d, gVar.f123469d);
    }

    public final int hashCode() {
        int iHashCode = this.f123466a.hashCode() * 31;
        List<com.garmin.android.apps.connectmobile.courses.model.g> list = this.f123467b;
        int iG = q6.f.g((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.f123468c);
        e eVar = this.f123469d;
        return iG + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = f3.k("CourseRouteStackEntry(courseRoutePoints=", ", coursePoints=", ", isLapCoursePointToggleOn=", this.f123466a, this.f123467b);
        sbK.append(this.f123468c);
        sbK.append(", courseParameters=");
        sbK.append(this.f123469d);
        sbK.append(")");
        return sbK.toString();
    }

    public g(List<GeoPointDTO> list, List<com.garmin.android.apps.connectmobile.courses.model.g> list2, boolean z14, e eVar) {
        list.getClass();
        this.f123466a = list;
        this.f123467b = list2;
        this.f123468c = z14;
        this.f123469d = eVar;
    }
}
