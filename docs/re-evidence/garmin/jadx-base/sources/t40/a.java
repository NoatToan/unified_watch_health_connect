package t40;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import q6.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lt40/a;", "", "", "isAutomaticDrawingMode", "isCourseEditMode", "Lkotlin/Function0;", "", "onExitCourseCreator", "onAddPointToCourse", "isFirstPoint", "<init>", "(ZZLe23/a;Le23/a;Z)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f162262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f162263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Unit> f162264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.a<Unit> f162265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f162266e;

    public a(boolean z14, boolean z15, e23.a<Unit> aVar, e23.a<Unit> aVar2, boolean z16) {
        aVar.getClass();
        aVar2.getClass();
        this.f162262a = z14;
        this.f162263b = z15;
        this.f162264c = aVar;
        this.f162265d = aVar2;
        this.f162266e = z16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f162262a == aVar.f162262a && this.f162263b == aVar.f162263b && this.f162264c.equals(aVar.f162264c) && this.f162265d.equals(aVar.f162265d) && this.f162266e == aVar.f162266e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f162266e) + f.f(f.f(f.g(Boolean.hashCode(this.f162262a) * 31, 31, this.f162263b), 31, this.f162264c), 31, this.f162265d);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("PointOfInterestDetailsUiState(isAutomaticDrawingMode=", ", isCourseEditMode=", ", onExitCourseCreator=", this.f162262a, this.f162263b);
        sbM.append(this.f162264c);
        sbM.append(", onAddPointToCourse=");
        sbM.append(this.f162265d);
        sbM.append(", isFirstPoint=");
        return hb.a.k(sbM, this.f162266e, ")");
    }
}
