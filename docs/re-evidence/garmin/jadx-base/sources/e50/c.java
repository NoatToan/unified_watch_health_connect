package e50;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Le50/c;", "", "", "courseName", "Lcom/garmin/android/apps/connectmobile/courses/model/i;", "courseType", "", "isCoursePublic", "isCourseRepositionable", "isCourseEditable", "isCourseDeletable", "isCourseShareable", "isCourseFavorite", "showCourseActions", "showCollapsedHeader", "<init>", "(Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/courses/model/i;ZZZZZZZZ)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.courses.model.i f62980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f62981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f62982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f62983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f62984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f62985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f62986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f62987i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f62988j;

    public c(String str, com.garmin.android.apps.connectmobile.courses.model.i iVar, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, boolean z25) {
        str.getClass();
        iVar.getClass();
        this.f62979a = str;
        this.f62980b = iVar;
        this.f62981c = z14;
        this.f62982d = z15;
        this.f62983e = z16;
        this.f62984f = z17;
        this.f62985g = z18;
        this.f62986h = z19;
        this.f62987i = z24;
        this.f62988j = z25;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f62979a.equals(cVar.f62979a) && this.f62980b == cVar.f62980b && this.f62981c == cVar.f62981c && this.f62982d == cVar.f62982d && this.f62983e == cVar.f62983e && this.f62984f == cVar.f62984f && this.f62985g == cVar.f62985g && this.f62986h == cVar.f62986h && this.f62987i == cVar.f62987i && this.f62988j == cVar.f62988j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f62988j) + q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g(q6.f.g((this.f62980b.hashCode() + (this.f62979a.hashCode() * 31)) * 31, 31, this.f62981c), 31, this.f62982d), 31, this.f62983e), 31, this.f62984f), 31, this.f62985g), 31, this.f62986h), 31, this.f62987i);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CourseDetailsHeaderUIState(courseName=");
        sb3.append(this.f62979a);
        sb3.append(", courseType=");
        sb3.append(this.f62980b);
        sb3.append(", isCoursePublic=");
        kg.f.q(", isCourseRepositionable=", ", isCourseEditable=", sb3, this.f62981c, this.f62982d);
        kg.f.q(", isCourseDeletable=", ", isCourseShareable=", sb3, this.f62983e, this.f62984f);
        kg.f.q(", isCourseFavorite=", ", showCourseActions=", sb3, this.f62985g, this.f62986h);
        return com.airbnb.lottie.animation.keyframe.a.f(", showCollapsedHeader=", ")", sb3, this.f62987i, this.f62988j);
    }
}
