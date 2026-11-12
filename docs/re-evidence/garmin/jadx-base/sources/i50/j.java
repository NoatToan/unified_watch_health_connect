package i50;

import gg1.o0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Li50/j;", "", "Li53/c;", "Li50/f;", "courses", "Li50/d;", "emptyState", "", "footerText", "", "isMetric", "Lgg1/o0;", "measurementSystem", "<init>", "(Li53/c;Li50/d;Ljava/lang/String;ZLgg1/o0;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<f> f91779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f91780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f91782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0 f91783e;

    public j(i53.c<f> cVar, d dVar, String str, boolean z14, o0 o0Var) {
        cVar.getClass();
        o0Var.getClass();
        this.f91779a = cVar;
        this.f91780b = dVar;
        this.f91781c = str;
        this.f91782d = z14;
        this.f91783e = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f91779a.equals(jVar.f91779a) && s.g(this.f91780b, jVar.f91780b) && s.g(this.f91781c, jVar.f91781c) && this.f91782d == jVar.f91782d && this.f91783e == jVar.f91783e;
    }

    public final int hashCode() {
        int iHashCode = this.f91779a.hashCode() * 31;
        d dVar = this.f91780b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f91781c;
        return this.f91783e.hashCode() + q6.f.g((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f91782d);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CoursesTabUiState(courses=");
        sb3.append(this.f91779a);
        sb3.append(", emptyState=");
        sb3.append(this.f91780b);
        sb3.append(", footerText=");
        v.h.C(this.f91781c, ", isMetric=", ", measurementSystem=", sb3, this.f91782d);
        sb3.append(this.f91783e);
        sb3.append(")");
        return sb3.toString();
    }
}
