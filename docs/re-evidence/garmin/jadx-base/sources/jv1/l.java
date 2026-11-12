package jv1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljv1/l;", "", "Li53/c;", "Lz20/e;", "courses", "selCourse", "<init>", "(Li53/c;Lz20/e;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<z20.e> f101073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z20.e f101074b;

    public l(i53.c<z20.e> cVar, z20.e eVar) {
        cVar.getClass();
        this.f101073a = cVar;
        this.f101074b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f101073a.equals(lVar.f101073a) && p005kotlin.jvm.internal.s.g(this.f101074b, lVar.f101074b);
    }

    public final int hashCode() {
        int iHashCode = this.f101073a.hashCode() * 31;
        z20.e eVar = this.f101074b;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "FBTCourseSelectionUIModel(courses=" + this.f101073a + ", selCourse=" + this.f101074b + ")";
    }
}
