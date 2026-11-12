package i50;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Li50/f;", "", "", "courseId", "courseName", "Lcom/garmin/android/apps/connectmobile/courses/model/i;", "courseType", "", "distanceInMeters", "elevationGainInMeters", "", "isFavorite", "isPublic", "hasPowerGuide", "Lcom/garmin/android/apps/connectmobile/courses/model/d;", "course", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/courses/model/i;DDZZZLcom/garmin/android/apps/connectmobile/courses/model/d;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.courses.model.i f91740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f91741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f91742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f91743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f91744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f91745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.courses.model.d f91746i;

    public f(String str, String str2, com.garmin.android.apps.connectmobile.courses.model.i iVar, double d14, double d15, boolean z14, boolean z15, boolean z16, com.garmin.android.apps.connectmobile.courses.model.d dVar) {
        iVar.getClass();
        dVar.getClass();
        this.f91738a = str;
        this.f91739b = str2;
        this.f91740c = iVar;
        this.f91741d = d14;
        this.f91742e = d15;
        this.f91743f = z14;
        this.f91744g = z15;
        this.f91745h = z16;
        this.f91746i = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f91738a, fVar.f91738a) && s.g(this.f91739b, fVar.f91739b) && this.f91740c == fVar.f91740c && Double.compare(this.f91741d, fVar.f91741d) == 0 && Double.compare(this.f91742e, fVar.f91742e) == 0 && this.f91743f == fVar.f91743f && this.f91744g == fVar.f91744g && this.f91745h == fVar.f91745h && this.f91746i.equals(fVar.f91746i);
    }

    public final int hashCode() {
        String str = this.f91738a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f91739b;
        return this.f91746i.hashCode() + q6.f.g(q6.f.g(q6.f.g(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b((this.f91740c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.f91741d), 31, this.f91742e), 31, this.f91743f), 31, this.f91744g), 31, this.f91745h);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("CoursesRowUiState(courseId=", this.f91738a, ", courseName=", this.f91739b, ", courseType=");
        sbI.append(this.f91740c);
        sbI.append(", distanceInMeters=");
        sbI.append(this.f91741d);
        am.j.x(sbI, ", elevationGainInMeters=", this.f91742e, ", isFavorite=");
        kg.f.q(", isPublic=", ", hasPowerGuide=", sbI, this.f91743f, this.f91744g);
        sbI.append(this.f91745h);
        sbI.append(", course=");
        sbI.append(this.f91746i);
        sbI.append(")");
        return sbI.toString();
    }
}
