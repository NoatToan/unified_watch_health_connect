package n50;

import com.garmin.android.apps.connectmobile.courses.model.i;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ln50/b;", "", "", "courseName", "Lcom/garmin/android/apps/connectmobile/courses/model/i;", "courseType", "", "isPublic", "isCoursePrivacyEditable", "isFromTrails", "supportsTurnNotifications", "isTurnNotificationsEnabled", "isTurnNotificationsToggleOn", "supportsLapByCoursePoint", "isLapByCoursePointToggleOn", "isLapByCoursePointEnabled", "shouldShowLapCoursePointDisabledDialog", "isUsingMetricForLapByCoursePoint", "isCourseSectionEditable", "<init>", "(Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/courses/model/i;ZZZZZZZZZZZZ)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f123727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f123728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f123729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f123730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f123731f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f123732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f123733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f123734i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f123735j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f123736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f123737l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f123738m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f123739n;

    public b(String str, i iVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29) {
        iVar.getClass();
        this.f123726a = str;
        this.f123727b = iVar;
        this.f123728c = z14;
        this.f123729d = z15;
        this.f123730e = z16;
        this.f123731f = z17;
        this.f123732g = z18;
        this.f123733h = z19;
        this.f123734i = z24;
        this.f123735j = z25;
        this.f123736k = z26;
        this.f123737l = z27;
        this.f123738m = z28;
        this.f123739n = z29;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f123726a, bVar.f123726a) && this.f123727b == bVar.f123727b && this.f123728c == bVar.f123728c && this.f123729d == bVar.f123729d && this.f123730e == bVar.f123730e && this.f123731f == bVar.f123731f && this.f123732g == bVar.f123732g && this.f123733h == bVar.f123733h && this.f123734i == bVar.f123734i && this.f123735j == bVar.f123735j && this.f123736k == bVar.f123736k && this.f123737l == bVar.f123737l && this.f123738m == bVar.f123738m && this.f123739n == bVar.f123739n;
    }

    public final int hashCode() {
        String str = this.f123726a;
        return Boolean.hashCode(this.f123739n) + q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g((this.f123727b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.f123728c), 31, this.f123729d), 31, this.f123730e), 31, this.f123731f), 31, this.f123732g), 31, this.f123733h), 31, this.f123734i), 31, this.f123735j), 31, this.f123736k), 31, this.f123737l), 31, this.f123738m);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CourseSectionUIState(courseName=");
        sb3.append(this.f123726a);
        sb3.append(", courseType=");
        sb3.append(this.f123727b);
        sb3.append(", isPublic=");
        kg.f.q(", isCoursePrivacyEditable=", ", isFromTrails=", sb3, this.f123728c, this.f123729d);
        kg.f.q(", supportsTurnNotifications=", ", isTurnNotificationsEnabled=", sb3, this.f123730e, this.f123731f);
        kg.f.q(", isTurnNotificationsToggleOn=", ", supportsLapByCoursePoint=", sb3, this.f123732g, this.f123733h);
        kg.f.q(", isLapByCoursePointToggleOn=", ", isLapByCoursePointEnabled=", sb3, this.f123734i, this.f123735j);
        kg.f.q(", shouldShowLapCoursePointDisabledDialog=", ", isUsingMetricForLapByCoursePoint=", sb3, this.f123736k, this.f123737l);
        return com.airbnb.lottie.animation.keyframe.a.f(", isCourseSectionEditable=", ")", sb3, this.f123738m, this.f123739n);
    }
}
