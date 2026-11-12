package x30;

import n23.j;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q6.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lx30/a;", "", "", "showAddToCourse", "isFirstPoint", "isPointCloseToLastCoursePoint", "Lkotlin/Function0;", "", "onAddClimbToCourse", "onAddPointToCourseClicked", "<init>", "(ZZZLe23/a;Le23/a;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f188562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f188563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f188564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e23.a<Unit> f188565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e23.a<Unit> f188566e;

    public a(boolean z14, boolean z15, boolean z16, e23.a<Unit> aVar, e23.a<Unit> aVar2) {
        aVar.getClass();
        aVar2.getClass();
        this.f188562a = z14;
        this.f188563b = z15;
        this.f188564c = z16;
        this.f188565d = aVar;
        this.f188566e = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f188562a == aVar.f188562a && this.f188563b == aVar.f188563b && this.f188564c == aVar.f188564c && this.f188565d.equals(aVar.f188565d) && this.f188566e.equals(aVar.f188566e);
    }

    public final int hashCode() {
        return this.f188566e.hashCode() + f.f(f.g(f.g(Boolean.hashCode(this.f188562a) * 31, 31, this.f188563b), 31, this.f188564c), 31, this.f188565d);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("ClimbActionsUiState(showAddToCourse=", ", isFirstPoint=", ", isPointCloseToLastCoursePoint=", this.f188562a, this.f188563b);
        sbM.append(this.f188564c);
        sbM.append(", onAddClimbToCourse=");
        sbM.append(this.f188565d);
        sbM.append(", onAddPointToCourseClicked=");
        return j.i(sbM, this.f188566e, ")");
    }
}
