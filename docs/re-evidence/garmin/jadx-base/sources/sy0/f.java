package sy0;

import am.x0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lsy0/f;", "", "", "courseId", "", "isFavorite", "courseName", "", "distanceInMeters", "elevationGainInMeters", "isPublic", "Lam/x0;", "activityType", "", "createdDate", "<init>", "(Ljava/lang/String;ZLjava/lang/String;DDZLam/x0;J)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f161212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f161213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f161214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f161215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f161216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x0 f161217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f161218h;

    public /* synthetic */ f(String str, boolean z14, String str2, double d14, double d15, boolean z15, x0 x0Var, long j8, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, z14, str2, (i14 & 8) != 0 ? 0.0d : d14, (i14 & 16) != 0 ? 0.0d : d15, z15, x0Var, (i14 & 128) != 0 ? 0L : j8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p005kotlin.jvm.internal.s.g(this.f161211a, fVar.f161211a) && this.f161212b == fVar.f161212b && p005kotlin.jvm.internal.s.g(this.f161213c, fVar.f161213c) && Double.compare(this.f161214d, fVar.f161214d) == 0 && Double.compare(this.f161215e, fVar.f161215e) == 0 && this.f161216f == fVar.f161216f && this.f161217g == fVar.f161217g && this.f161218h == fVar.f161218h;
    }

    public final int hashCode() {
        String str = this.f161211a;
        int iG = q6.f.g((str == null ? 0 : str.hashCode()) * 31, 31, this.f161212b);
        String str2 = this.f161213c;
        return Long.hashCode(this.f161218h) + ((this.f161217g.hashCode() + q6.f.g(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b((iG + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f161214d), 31, this.f161215e), 31, this.f161216f)) * 31);
    }

    public final String toString() {
        StringBuilder sbD = zl.a.d("CourseUiState(courseId=", this.f161211a, ", isFavorite=", this.f161212b, ", courseName=");
        sbD.append(this.f161213c);
        sbD.append(", distanceInMeters=");
        sbD.append(this.f161214d);
        am.j.x(sbD, ", elevationGainInMeters=", this.f161215e, ", isPublic=");
        sbD.append(this.f161216f);
        sbD.append(", activityType=");
        sbD.append(this.f161217g);
        sbD.append(", createdDate=");
        return am.j.i(this.f161218h, ")", sbD);
    }

    public f(String str, boolean z14, String str2, double d14, double d15, boolean z15, x0 x0Var, long j8) {
        x0Var.getClass();
        this.f161211a = str;
        this.f161212b = z14;
        this.f161213c = str2;
        this.f161214d = d14;
        this.f161215e = d15;
        this.f161216f = z15;
        this.f161217g = x0Var;
        this.f161218h = j8;
    }
}
