package n50;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ln50/g;", "", "", "courseId", "Ln50/b;", "courseSectionUIState", "", "speedInMeterPerSecond", "elapsedSeconds", "", "noOfClimbs", "", "isThirdParty", "thirdPartyImageUrl", "<init>", "(Ljava/lang/String;Ln50/b;DLjava/lang/Double;IZLjava/lang/String;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f123757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f123758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f123759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f123760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f123761f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f123762g;

    public g(String str, b bVar, double d14, Double d15, int i14, boolean z14, String str2) {
        bVar.getClass();
        this.f123756a = str;
        this.f123757b = bVar;
        this.f123758c = d14;
        this.f123759d = d15;
        this.f123760e = i14;
        this.f123761f = z14;
        this.f123762g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f123756a, gVar.f123756a) && this.f123757b.equals(gVar.f123757b) && Double.compare(this.f123758c, gVar.f123758c) == 0 && s.g(this.f123759d, gVar.f123759d) && this.f123760e == gVar.f123760e && this.f123761f == gVar.f123761f && s.g(this.f123762g, gVar.f123762g);
    }

    public final int hashCode() {
        String str = this.f123756a;
        int iB = org.apache.commons.lang3.e.b((this.f123757b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.f123758c);
        Double d14 = this.f123759d;
        int iG = q6.f.g(q2.d(this.f123760e, (iB + (d14 == null ? 0 : d14.hashCode())) * 31, 31), 31, this.f123761f);
        String str2 = this.f123762g;
        return iG + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CreateCourseOverviewUIState(courseId=");
        sb3.append(this.f123756a);
        sb3.append(", courseSectionUIState=");
        sb3.append(this.f123757b);
        sb3.append(", speedInMeterPerSecond=");
        sb3.append(this.f123758c);
        sb3.append(", elapsedSeconds=");
        sb3.append(this.f123759d);
        sb3.append(", noOfClimbs=");
        sb3.append(this.f123760e);
        sb3.append(", isThirdParty=");
        sb3.append(this.f123761f);
        return e0.h(sb3, ", thirdPartyImageUrl=", this.f123762g, ")");
    }
}
