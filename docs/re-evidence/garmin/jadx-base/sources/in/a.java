package in;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lin/a;", "", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "activity", "", "Lcom/google/android/gms/maps/model/LatLng;", "polyline", "", "hasPersonalRecordCandidates", "<init>", "(Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;Ljava/util/List;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityListItemDTO f94388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<List<LatLng>> f94389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f94390c;

    /* JADX WARN: Multi-variable type inference failed */
    public a(ActivityListItemDTO activityListItemDTO, List<? extends List<LatLng>> list, boolean z14) {
        activityListItemDTO.getClass();
        this.f94388a = activityListItemDTO;
        this.f94389b = list;
        this.f94390c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f94388a.equals(aVar.f94388a) && s.g(this.f94389b, aVar.f94389b) && this.f94390c == aVar.f94390c;
    }

    public final int hashCode() {
        int iHashCode = this.f94388a.hashCode() * 31;
        List<List<LatLng>> list = this.f94389b;
        return Boolean.hashCode(this.f94390c) + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivityDataItem(activity=");
        sb3.append(this.f94388a);
        sb3.append(", polyline=");
        sb3.append(this.f94389b);
        sb3.append(", hasPersonalRecordCandidates=");
        return hb.a.k(sb3, this.f94390c, ")");
    }
}
