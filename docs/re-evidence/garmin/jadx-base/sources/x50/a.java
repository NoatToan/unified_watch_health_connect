package x50;

import am.j;
import com.garmin.android.apps.connectmobile.courses.model.i;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lx50/a;", "", "", "courseId", "courseName", "Lcom/garmin/android/apps/connectmobile/courses/model/i;", "courseType", "", "distanceInMeters", "elevationGainInMeters", "", "isFavorite", "hasPowerGuide", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/courses/model/i;DDZZ)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f188970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f188971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f188972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f188973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f188974g;

    public a(String str, String str2, i iVar, double d14, double d15, boolean z14, boolean z15) {
        iVar.getClass();
        this.f188968a = str;
        this.f188969b = str2;
        this.f188970c = iVar;
        this.f188971d = d14;
        this.f188972e = d15;
        this.f188973f = z14;
        this.f188974g = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f188968a, aVar.f188968a) && s.g(this.f188969b, aVar.f188969b) && this.f188970c == aVar.f188970c && Double.compare(this.f188971d, aVar.f188971d) == 0 && Double.compare(this.f188972e, aVar.f188972e) == 0 && this.f188973f == aVar.f188973f && this.f188974g == aVar.f188974g;
    }

    public final int hashCode() {
        String str = this.f188968a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f188969b;
        return Boolean.hashCode(this.f188974g) + q6.f.g(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b((this.f188970c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.f188971d), 31, this.f188972e), 31, this.f188973f);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("CourseRowUIState(courseId=", this.f188968a, ", courseName=", this.f188969b, ", courseType=");
        sbI.append(this.f188970c);
        sbI.append(", distanceInMeters=");
        sbI.append(this.f188971d);
        j.x(sbI, ", elevationGainInMeters=", this.f188972e, ", isFavorite=");
        return com.airbnb.lottie.animation.keyframe.a.f(", hasPowerGuide=", ")", sbI, this.f188973f, this.f188974g);
    }
}
