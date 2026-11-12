package yo;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lyo/d;", "", "Lyo/a0;", "reconstruct", "", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/y;", "metricDescriptors", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/b;", "metrics", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/w;", "polyline", "<init>", "(Lyo/a0;Ljava/util/List;Ljava/util/List;Lcom/garmin/android/apps/connectmobile/activities/newmodel/w;)V", "a", "Lyo/a0;", "d", "()Lyo/a0;", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/w;", "()Lcom/garmin/android/apps/connectmobile/activities/newmodel/w;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityReconstructDTO")
    private final a0 reconstruct;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metricDescriptors")
    private final List<com.garmin.android.apps.connectmobile.activities.newmodel.y> metricDescriptors;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityDetailMetrics")
    private final List<com.garmin.android.apps.connectmobile.activities.newmodel.b> metrics;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("geoPolylineDTO")
    private final com.garmin.android.apps.connectmobile.activities.newmodel.w polyline;

    /* JADX WARN: Multi-variable type inference failed */
    public d(a0 a0Var, List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.y> list, List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.b> list2, com.garmin.android.apps.connectmobile.activities.newmodel.w wVar) {
        a0Var.getClass();
        this.reconstruct = a0Var;
        this.metricDescriptors = list;
        this.metrics = list2;
        this.polyline = wVar;
    }

    public final List<com.garmin.android.apps.connectmobile.activities.newmodel.y> a() {
        return this.metricDescriptors;
    }

    public final List<com.garmin.android.apps.connectmobile.activities.newmodel.b> b() {
        return this.metrics;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final com.garmin.android.apps.connectmobile.activities.newmodel.w getPolyline() {
        return this.polyline;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a0 getReconstruct() {
        return this.reconstruct;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p005kotlin.jvm.internal.s.g(this.reconstruct, dVar.reconstruct) && p005kotlin.jvm.internal.s.g(this.metricDescriptors, dVar.metricDescriptors) && p005kotlin.jvm.internal.s.g(this.metrics, dVar.metrics) && p005kotlin.jvm.internal.s.g(this.polyline, dVar.polyline);
    }

    public final int hashCode() {
        int iHashCode = this.reconstruct.hashCode() * 31;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.y> list = this.metricDescriptors;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.b> list2 = this.metrics;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.activities.newmodel.w wVar = this.polyline;
        return iHashCode3 + (wVar != null ? wVar.hashCode() : 0);
    }

    public final String toString() {
        return "MultisportActivityReconstructDTO(reconstruct=" + this.reconstruct + ", metricDescriptors=" + this.metricDescriptors + ", metrics=" + this.metrics + ", polyline=" + this.polyline + ")";
    }
}
