package x30;

import n23.j;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q6.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lx30/c;", "", "", "isAutomaticDrawingMode", "isCourseEditMode", "Lkotlin/Function0;", "", "onExitCourseCreator", "<init>", "(ZZLe23/a;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f188570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f188571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Unit> f188572c;

    public c(boolean z14, boolean z15, e23.a<Unit> aVar) {
        aVar.getClass();
        this.f188570a = z14;
        this.f188571b = z15;
        this.f188572c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f188570a == cVar.f188570a && this.f188571b == cVar.f188571b && this.f188572c.equals(cVar.f188572c);
    }

    public final int hashCode() {
        return this.f188572c.hashCode() + f.g(Boolean.hashCode(this.f188570a) * 31, 31, this.f188571b);
    }

    public final String toString() {
        return j.i(com.airbnb.lottie.animation.keyframe.a.m("CourseDrawingMethodUiState(isAutomaticDrawingMode=", ", isCourseEditMode=", ", onExitCourseCreator=", this.f188570a, this.f188571b), this.f188572c, ")");
    }
}
