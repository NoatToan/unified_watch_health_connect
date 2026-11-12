package nr;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnr/h;", "", "", "activityId", "Lam/x0;", "activityType", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "activityListItemDTO", "", "allowActivityTypeNavigation", "allowPersonalRecordBanner", "canRedirectToDiveApp", "<init>", "(JLam/x0;Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;ZZZ)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f127182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final am.x0 f127183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActivityListItemDTO f127184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f127185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f127186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f127187f;

    public /* synthetic */ h(long j8, am.x0 x0Var, ActivityListItemDTO activityListItemDTO, boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, x0Var, (i14 & 4) != 0 ? null : activityListItemDTO, (i14 & 8) != 0 ? false : z14, (i14 & 16) != 0 ? true : z15, (i14 & 32) != 0 ? false : z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f127182a == hVar.f127182a && this.f127183b == hVar.f127183b && p005kotlin.jvm.internal.s.g(this.f127184c, hVar.f127184c) && this.f127185d == hVar.f127185d && this.f127186e == hVar.f127186e && this.f127187f == hVar.f127187f;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f127182a) * 31;
        am.x0 x0Var = this.f127183b;
        int iHashCode2 = (iHashCode + (x0Var == null ? 0 : x0Var.hashCode())) * 31;
        ActivityListItemDTO activityListItemDTO = this.f127184c;
        return Boolean.hashCode(this.f127187f) + q6.f.g(q6.f.g((iHashCode2 + (activityListItemDTO != null ? activityListItemDTO.hashCode() : 0)) * 31, 31, this.f127185d), 31, this.f127186e);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivityDetailsStartInfo(activityId=");
        sb3.append(this.f127182a);
        sb3.append(", activityType=");
        sb3.append(this.f127183b);
        sb3.append(", activityListItemDTO=");
        sb3.append(this.f127184c);
        sb3.append(", allowActivityTypeNavigation=");
        sb3.append(this.f127185d);
        com.airbnb.lottie.animation.keyframe.a.v(", allowPersonalRecordBanner=", ", canRedirectToDiveApp=", sb3, this.f127186e, this.f127187f);
        sb3.append(")");
        return sb3.toString();
    }

    public h(long j8, am.x0 x0Var, ActivityListItemDTO activityListItemDTO, boolean z14, boolean z15, boolean z16) {
        this.f127182a = j8;
        this.f127183b = x0Var;
        this.f127184c = activityListItemDTO;
        this.f127185d = z14;
        this.f127186e = z15;
        this.f127187f = z16;
    }
}
