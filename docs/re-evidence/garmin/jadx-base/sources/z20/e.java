package z20;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lz20/e;", "", "", "courseId", "courseName", "Lcom/garmin/android/apps/connectmobile/courses/model/i;", "courseType", "", "distanceInMeters", "elevationGainInMeters", "", "isPublic", "isFavorite", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/courses/model/i;DDZZ)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.courses.model.i f201899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f201900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f201901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f201902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f201903g;

    public e(String str, String str2, com.garmin.android.apps.connectmobile.courses.model.i iVar, double d14, double d15, boolean z14, boolean z15) {
        str.getClass();
        iVar.getClass();
        this.f201897a = str;
        this.f201898b = str2;
        this.f201899c = iVar;
        this.f201900d = d14;
        this.f201901e = d15;
        this.f201902f = z14;
        this.f201903g = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f201897a.equals(eVar.f201897a) && p005kotlin.jvm.internal.s.g(this.f201898b, eVar.f201898b) && this.f201899c == eVar.f201899c && Double.compare(this.f201900d, eVar.f201900d) == 0 && Double.compare(this.f201901e, eVar.f201901e) == 0 && this.f201902f == eVar.f201902f && this.f201903g == eVar.f201903g;
    }

    public final int hashCode() {
        int iHashCode = this.f201897a.hashCode() * 31;
        String str = this.f201898b;
        return Boolean.hashCode(this.f201903g) + q6.f.g(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b((this.f201899c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f201900d), 31, this.f201901e), 31, this.f201902f);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("CourseItemUiState(courseId=", this.f201897a, ", courseName=", this.f201898b, ", courseType=");
        sbI.append(this.f201899c);
        sbI.append(", distanceInMeters=");
        sbI.append(this.f201900d);
        am.j.x(sbI, ", elevationGainInMeters=", this.f201901e, ", isPublic=");
        return com.airbnb.lottie.animation.keyframe.a.f(", isFavorite=", ")", sbI, this.f201902f, this.f201903g);
    }
}
