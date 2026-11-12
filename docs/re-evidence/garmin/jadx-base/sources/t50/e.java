package t50;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lt50/e;", "", "", "isLoading", "shouldHideBackButtonFromAccessibility", "Lw20/a;", "courseData", "hasCoursePointsChanges", "Ll40/d;", "courseMapOptions", "<init>", "(ZZLw20/a;ZLl40/d;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f162541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f162542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w20.a f162543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f162544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l40.d f162545e;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ e(boolean z14, boolean z15, w20.a aVar, boolean z16, l40.d dVar, int i14, j jVar) {
        z14 = (i14 & 1) != 0 ? false : z14;
        z15 = (i14 & 2) != 0 ? false : z15;
        aVar = (i14 & 4) != 0 ? null : aVar;
        z16 = (i14 & 8) != 0 ? false : z16;
        if ((i14 & 16) != 0) {
            l40.d.f109892n.getClass();
            dVar = l40.d.a.a();
        }
        this(z14, z15, aVar, z16, dVar);
    }

    public static e a(e eVar, boolean z14, boolean z15, w20.a aVar, l40.d dVar, int i14) {
        if ((i14 & 1) != 0) {
            z14 = eVar.f162541a;
        }
        boolean z16 = z14;
        if ((i14 & 2) != 0) {
            z15 = eVar.f162542b;
        }
        boolean z17 = z15;
        if ((i14 & 4) != 0) {
            aVar = eVar.f162543c;
        }
        w20.a aVar2 = aVar;
        boolean z18 = (i14 & 8) != 0 ? eVar.f162544d : true;
        if ((i14 & 16) != 0) {
            dVar = eVar.f162545e;
        }
        l40.d dVar2 = dVar;
        eVar.getClass();
        dVar2.getClass();
        return new e(z16, z17, aVar2, z18, dVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f162541a == eVar.f162541a && this.f162542b == eVar.f162542b && s.g(this.f162543c, eVar.f162543c) && this.f162544d == eVar.f162544d && s.g(this.f162545e, eVar.f162545e);
    }

    public final int hashCode() {
        int iG = f.g(Boolean.hashCode(this.f162541a) * 31, 31, this.f162542b);
        w20.a aVar = this.f162543c;
        return this.f162545e.hashCode() + f.g((iG + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f162544d);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("CoursePointListState(isLoading=", ", shouldHideBackButtonFromAccessibility=", ", courseData=", this.f162541a, this.f162542b);
        sbM.append(this.f162543c);
        sbM.append(", hasCoursePointsChanges=");
        sbM.append(this.f162544d);
        sbM.append(", courseMapOptions=");
        sbM.append(this.f162545e);
        sbM.append(")");
        return sbM.toString();
    }

    public e(boolean z14, boolean z15, w20.a aVar, boolean z16, l40.d dVar) {
        dVar.getClass();
        this.f162541a = z14;
        this.f162542b = z15;
        this.f162543c = aVar;
        this.f162544d = z16;
        this.f162545e = dVar;
    }

    public e() {
        this(false, false, null, false, null, 31, null);
    }
}
