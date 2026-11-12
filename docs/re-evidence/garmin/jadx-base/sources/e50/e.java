package e50;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Le50/e;", "", "Le50/i;", "courseStatsData", "Le50/f;", "courseElevationData", "<init>", "(Le50/i;Le50/f;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f63001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f63002b;

    public e(i iVar, f fVar) {
        iVar.getClass();
        fVar.getClass();
        this.f63001a = iVar;
        this.f63002b = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f63001a.equals(eVar.f63001a) && this.f63002b.equals(eVar.f63002b);
    }

    public final int hashCode() {
        return this.f63002b.hashCode() + (this.f63001a.hashCode() * 31);
    }

    public final String toString() {
        return "CourseDetailsUIState(courseStatsData=" + this.f63001a + ", courseElevationData=" + this.f63002b + ")";
    }
}
