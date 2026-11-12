package sy0;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsy0/q;", "", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "activityItemDTO", "", "isEpicActivity", "<init>", "(Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;Z)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityListItemDTO f161276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f161277b;

    public q(ActivityListItemDTO activityListItemDTO, boolean z14) {
        activityListItemDTO.getClass();
        this.f161276a = activityListItemDTO;
        this.f161277b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f161276a.equals(qVar.f161276a) && this.f161277b == qVar.f161277b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161277b) + (this.f161276a.hashCode() * 31);
    }

    public final String toString() {
        return "TimelineEpicEditItemActivity(activityItemDTO=" + this.f161276a + ", isEpicActivity=" + this.f161277b + ")";
    }
}
