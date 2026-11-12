package av1;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lav1/b;", "", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "activity", "", "isCompleted", "", "groupingEnumeration", "<init>", "(Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;ZI)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityListItemDTO f13243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13245c;

    public /* synthetic */ b(ActivityListItemDTO activityListItemDTO, boolean z14, int i14, int i15, j jVar) {
        this(activityListItemDTO, (i15 & 2) != 0 ? false : z14, (i15 & 4) != 0 ? -1 : i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f13243a, bVar.f13243a) && this.f13244b == bVar.f13244b && this.f13245c == bVar.f13245c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13245c) + q6.f.g(this.f13243a.hashCode() * 31, 31, this.f13244b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FBTDashboardActivityDTO(activity=");
        sb3.append(this.f13243a);
        sb3.append(", isCompleted=");
        sb3.append(this.f13244b);
        sb3.append(", groupingEnumeration=");
        return am.j.q(sb3, this.f13245c, ")");
    }

    public b(ActivityListItemDTO activityListItemDTO, boolean z14, int i14) {
        activityListItemDTO.getClass();
        this.f13243a = activityListItemDTO;
        this.f13244b = z14;
        this.f13245c = i14;
    }
}
