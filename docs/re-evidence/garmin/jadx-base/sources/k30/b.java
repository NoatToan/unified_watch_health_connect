package k30;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0011"}, d2 = {"Lk30/b;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "viaPoint", "projection", "", "distance", "<init>", "(Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;Ljava/lang/Double;)V", "a", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "getViaPoint", "()Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "b", "c", "Ljava/lang/Double;", "()Ljava/lang/Double;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("viaPoint")
    private final GeoPointDTO viaPoint;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("projection")
    private final GeoPointDTO projection;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distance")
    private final Double distance;

    public b(GeoPointDTO geoPointDTO, GeoPointDTO geoPointDTO2, Double d14) {
        this.viaPoint = geoPointDTO;
        this.projection = geoPointDTO2;
        this.distance = d14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final GeoPointDTO getProjection() {
        return this.projection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p005kotlin.jvm.internal.s.g(this.viaPoint, bVar.viaPoint) && p005kotlin.jvm.internal.s.g(this.projection, bVar.projection) && p005kotlin.jvm.internal.s.g(this.distance, bVar.distance);
    }

    public final int hashCode() {
        GeoPointDTO geoPointDTO = this.viaPoint;
        int iHashCode = (geoPointDTO == null ? 0 : geoPointDTO.hashCode()) * 31;
        GeoPointDTO geoPointDTO2 = this.projection;
        int iHashCode2 = (iHashCode + (geoPointDTO2 == null ? 0 : geoPointDTO2.hashCode())) * 31;
        Double d14 = this.distance;
        return iHashCode2 + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        GeoPointDTO geoPointDTO = this.viaPoint;
        GeoPointDTO geoPointDTO2 = this.projection;
        Double d14 = this.distance;
        StringBuilder sb3 = new StringBuilder("CleanCourseClosestPointDTO(viaPoint=");
        sb3.append(geoPointDTO);
        sb3.append(", projection=");
        sb3.append(geoPointDTO2);
        sb3.append(", distance=");
        return b71.i.g(sb3, d14, ")");
    }
}
