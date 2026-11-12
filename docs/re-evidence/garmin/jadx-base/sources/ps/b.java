package ps;

import com.google.android.gms.maps.model.LatLng;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012 \u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0006\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR4\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0006\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"Lps/b;", "", "", "activities", "", "", "", "Lcom/google/android/gms/maps/model/LatLng;", "activityPolylines", "personalRecords", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activities")
    private final String activities;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityPolylines")
    private final Map<Long, List<List<LatLng>>> activityPolylines;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("personalRecords")
    private final String personalRecords;

    /* JADX WARN: Multi-variable type inference failed */
    public b(String str, Map<Long, ? extends List<? extends List<LatLng>>> map, String str2) {
        this.activities = str;
        this.activityPolylines = map;
        this.personalRecords = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivities() {
        return this.activities;
    }

    public final Map<Long, List<List<LatLng>>> b() {
        return this.activityPolylines;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPersonalRecords() {
        return this.personalRecords;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p005kotlin.jvm.internal.s.g(this.activities, bVar.activities) && p005kotlin.jvm.internal.s.g(this.activityPolylines, bVar.activityPolylines) && p005kotlin.jvm.internal.s.g(this.personalRecords, bVar.personalRecords);
    }

    public final int hashCode() {
        String str = this.activities;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<Long, List<List<LatLng>>> map = this.activityPolylines;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.personalRecords;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.activities;
        Map<Long, List<List<LatLng>>> map = this.activityPolylines;
        String str2 = this.personalRecords;
        StringBuilder sb3 = new StringBuilder("ActivitiesDashboardData(activities=");
        sb3.append(str);
        sb3.append(", activityPolylines=");
        sb3.append(map);
        sb3.append(", personalRecords=");
        return am.j.o(str2, ")", sb3);
    }
}
