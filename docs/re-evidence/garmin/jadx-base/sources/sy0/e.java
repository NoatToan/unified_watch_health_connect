package sy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsy0/e;", "", "", "courseName", "Li53/f;", "Lsy0/f;", "processedCoursesList", "<init>", "(Ljava/lang/String;Li53/f;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.f<f> f161210b;

    public /* synthetic */ e(String str, i53.f fVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.f161209a, eVar.f161209a) && p005kotlin.jvm.internal.s.g(this.f161210b, eVar.f161210b);
    }

    public final int hashCode() {
        String str = this.f161209a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        i53.f<f> fVar = this.f161210b;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        return "CourseDetailsUiState(courseName=" + this.f161209a + ", processedCoursesList=" + this.f161210b + ")";
    }

    public e(String str, i53.f<f> fVar) {
        this.f161209a = str;
        this.f161210b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
