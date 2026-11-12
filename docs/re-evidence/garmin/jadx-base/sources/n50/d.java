package n50;

import e50.i;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln50/d;", "", "Le50/i;", "courseStatsData", "Le50/f;", "courseElevationData", "<init>", "(Le50/i;Le50/f;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f123742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e50.f f123743b;

    public d(i iVar, e50.f fVar) {
        iVar.getClass();
        fVar.getClass();
        this.f123742a = iVar;
        this.f123743b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f123742a.equals(dVar.f123742a) && this.f123743b.equals(dVar.f123743b);
    }

    public final int hashCode() {
        return this.f123743b.hashCode() + (this.f123742a.hashCode() * 31);
    }

    public final String toString() {
        return "CreateCourseDetailsUIState(courseStatsData=" + this.f123742a + ", courseElevationData=" + this.f123743b + ")";
    }
}
