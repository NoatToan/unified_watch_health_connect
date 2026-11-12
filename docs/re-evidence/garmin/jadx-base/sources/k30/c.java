package k30;

import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lk30/c;", "", "", "clickedLat", "clickedLon", "", "clickedZoomLevel", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;)V", "a", "Ljava/lang/Double;", "getClickedLat", "()Ljava/lang/Double;", "b", "getClickedLon", "c", "Ljava/lang/Integer;", "getClickedZoomLevel", "()Ljava/lang/Integer;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("clickedLat")
    private final Double clickedLat;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("clickedLon")
    private final Double clickedLon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("clickedZoomLevel")
    private final Integer clickedZoomLevel;

    public c(Double d14, Double d15, Integer num) {
        this.clickedLat = d14;
        this.clickedLon = d15;
        this.clickedZoomLevel = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.clickedLat, cVar.clickedLat) && p005kotlin.jvm.internal.s.g(this.clickedLon, cVar.clickedLon) && p005kotlin.jvm.internal.s.g(this.clickedZoomLevel, cVar.clickedZoomLevel);
    }

    public final int hashCode() {
        Double d14 = this.clickedLat;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.clickedLon;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Integer num = this.clickedZoomLevel;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        Double d14 = this.clickedLat;
        Double d15 = this.clickedLon;
        return f3.i(tn.k.i("CleanCoursePointDTO(clickedLat=", d14, d15, ", clickedLon=", ", clickedZoomLevel="), this.clickedZoomLevel, ")");
    }
}
