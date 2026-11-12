package x50;

import gg1.o0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lx50/e;", "", "Li53/c;", "Lx50/a;", "courses", "Lx50/d;", "placeholder", "", "showTrailsPromotion", "isMetric", "Lgg1/o0;", "measurementSystem", "<init>", "(Li53/c;Lx50/d;ZZLgg1/o0;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<a> f189001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f189002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f189003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f189004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0 f189005e;

    public e(i53.c<a> cVar, d dVar, boolean z14, boolean z15, o0 o0Var) {
        cVar.getClass();
        o0Var.getClass();
        this.f189001a = cVar;
        this.f189002b = dVar;
        this.f189003c = z14;
        this.f189004d = z15;
        this.f189005e = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f189001a.equals(eVar.f189001a) && this.f189002b == eVar.f189002b && this.f189003c == eVar.f189003c && this.f189004d == eVar.f189004d && this.f189005e == eVar.f189005e;
    }

    public final int hashCode() {
        int iHashCode = this.f189001a.hashCode() * 31;
        d dVar = this.f189002b;
        return this.f189005e.hashCode() + q6.f.g(q6.f.g((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f189003c), 31, this.f189004d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CourseSearchListUIState(courses=");
        sb3.append(this.f189001a);
        sb3.append(", placeholder=");
        sb3.append(this.f189002b);
        sb3.append(", showTrailsPromotion=");
        kg.f.q(", isMetric=", ", measurementSystem=", sb3, this.f189003c, this.f189004d);
        sb3.append(this.f189005e);
        sb3.append(")");
        return sb3.toString();
    }
}
