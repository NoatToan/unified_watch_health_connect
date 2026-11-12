package hn;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import jr.q;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import yz1.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhn/a;", "", "Lyz1/d;", "status", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "activity", "Ljr/q;", "sectionConfig", "<init>", "(Lyz1/d;Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;Ljr/q;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f84503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityListItemDTO f84504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f84505c;

    public /* synthetic */ a(d dVar, ActivityListItemDTO activityListItemDTO, q qVar, int i14, j jVar) {
        this(dVar, (i14 & 2) != 0 ? null : activityListItemDTO, (i14 & 4) != 0 ? null : qVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f84503a, aVar.f84503a) && s.g(this.f84504b, aVar.f84504b) && s.g(this.f84505c, aVar.f84505c);
    }

    public final int hashCode() {
        int iHashCode = this.f84503a.hashCode() * 31;
        ActivityListItemDTO activityListItemDTO = this.f84504b;
        int iHashCode2 = (iHashCode + (activityListItemDTO == null ? 0 : activityListItemDTO.hashCode())) * 31;
        q qVar = this.f84505c;
        return iHashCode2 + (qVar != null ? qVar.hashCode() : 0);
    }

    public final String toString() {
        return "LastActivityCardData(status=" + this.f84503a + ", activity=" + this.f84504b + ", sectionConfig=" + this.f84505c + ")";
    }

    public a(d dVar, ActivityListItemDTO activityListItemDTO, q qVar) {
        dVar.getClass();
        this.f84503a = dVar;
        this.f84504b = activityListItemDTO;
        this.f84505c = qVar;
    }
}
