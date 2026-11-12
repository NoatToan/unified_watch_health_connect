package a50;

import com.garmin.android.apps.connectmobile.courses.model.CourseSegmentDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.f3;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"La50/a;", "", "", "Lcom/garmin/android/library/mapsdkadapter/f;", "courseWaypoints", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "courseRoute", "Lcom/garmin/android/apps/connectmobile/courses/model/CourseSegmentDTO;", "courseSegments", "", "currentRouteOption", "Lcom/garmin/android/apps/connectmobile/courses/model/g;", "coursePoints", "", "isLapCoursePointToggleOn", "", "middlePointZoomLevel", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;JLjava/util/List;ZLjava/lang/Integer;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<com.garmin.android.library.mapsdkadapter.f> f1240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<List<GeoPointDTO>> f1241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<CourseSegmentDTO> f1242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<com.garmin.android.apps.connectmobile.courses.model.g> f1244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f1246g;

    /* JADX WARN: Multi-variable type inference failed */
    public a(List<com.garmin.android.library.mapsdkadapter.f> list, List<? extends List<GeoPointDTO>> list2, List<CourseSegmentDTO> list3, long j8, List<com.garmin.android.apps.connectmobile.courses.model.g> list4, boolean z14, Integer num) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f1240a = list;
        this.f1241b = list2;
        this.f1242c = list3;
        this.f1243d = j8;
        this.f1244e = list4;
        this.f1245f = z14;
        this.f1246g = num;
    }

    public static a a(a aVar, ArrayList arrayList, List list, boolean z14, int i14) {
        List<com.garmin.android.library.mapsdkadapter.f> list2 = aVar.f1240a;
        List<List<GeoPointDTO>> list3 = arrayList;
        if ((i14 & 2) != 0) {
            list3 = aVar.f1241b;
        }
        List<List<GeoPointDTO>> list4 = list3;
        List<CourseSegmentDTO> list5 = aVar.f1242c;
        long j8 = aVar.f1243d;
        if ((i14 & 16) != 0) {
            list = aVar.f1244e;
        }
        List list6 = list;
        if ((i14 & 32) != 0) {
            z14 = aVar.f1245f;
        }
        return new a(list2, list4, list5, j8, list6, z14, (i14 & 64) != 0 ? aVar.f1246g : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1240a.equals(aVar.f1240a) && this.f1241b.equals(aVar.f1241b) && this.f1242c.equals(aVar.f1242c) && this.f1243d == aVar.f1243d && s.g(this.f1244e, aVar.f1244e) && this.f1245f == aVar.f1245f && s.g(this.f1246g, aVar.f1246g);
    }

    public final int hashCode() {
        int iE = q6.f.e(u0.b(u0.b(this.f1240a.hashCode() * 31, 31, this.f1241b), 31, this.f1242c), 31, this.f1243d);
        List<com.garmin.android.apps.connectmobile.courses.model.g> list = this.f1244e;
        int iG = q6.f.g((iE + (list == null ? 0 : list.hashCode())) * 31, 31, this.f1245f);
        Integer num = this.f1246g;
        return iG + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = f3.k("CourseRouteState(courseWaypoints=", ", courseRoute=", ", courseSegments=", this.f1240a, this.f1241b);
        sbK.append(this.f1242c);
        sbK.append(", currentRouteOption=");
        sbK.append(this.f1243d);
        sbK.append(", coursePoints=");
        sbK.append(this.f1244e);
        sbK.append(", isLapCoursePointToggleOn=");
        sbK.append(this.f1245f);
        sbK.append(", middlePointZoomLevel=");
        sbK.append(this.f1246g);
        sbK.append(")");
        return sbK.toString();
    }
}
