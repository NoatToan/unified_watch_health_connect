package ly0;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lly0/a;", "", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "activityListItemDTO", "Lps/m;", "polylineDMO", "Lcy0/c;", "activityResources", "<init>", "(Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;Lps/m;Lcy0/c;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityListItemDTO f115281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ps.m f115282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cy0.c f115283c;

    public a(ActivityListItemDTO activityListItemDTO, ps.m mVar, cy0.c cVar) {
        activityListItemDTO.getClass();
        this.f115281a = activityListItemDTO;
        this.f115282b = mVar;
        this.f115283c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f115281a.equals(aVar.f115281a) && p005kotlin.jvm.internal.s.g(this.f115282b, aVar.f115282b) && p005kotlin.jvm.internal.s.g(this.f115283c, aVar.f115283c);
    }

    public final int hashCode() {
        int iHashCode = this.f115281a.hashCode() * 31;
        ps.m mVar = this.f115282b;
        int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        cy0.c cVar = this.f115283c;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "ActivityItemData(activityListItemDTO=" + this.f115281a + ", polylineDMO=" + this.f115282b + ", activityResources=" + this.f115283c + ")";
    }
}
