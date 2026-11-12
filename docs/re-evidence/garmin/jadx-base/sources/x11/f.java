package x11;

import b63.v;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lx11/f;", "", "Lb63/v;", "mealTime", "Lb11/l;", "currentMealWindow", "", "meals", "Li53/c;", "Lb11/v;", "foodItems", "", "isLoading", "Lv11/a;", "navigateToFindFoodWithConfirmationResult", "showError", "isTimelineView", "<init>", "(Lb63/v;Lb11/l;Ljava/util/List;Li53/c;ZLv11/a;ZLjava/lang/Boolean;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f188405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b11.l f188406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<b11.l> f188407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<b11.v> f188408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f188409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v11.a f188410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f188411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f188412h;

    public f(v vVar, b11.l lVar, List list, i53.c cVar, boolean z14, v11.a aVar, boolean z15, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
        this(vVar, (i14 & 2) != 0 ? null : lVar, (i14 & 4) != 0 ? j0.f134944a : list, cVar, (i14 & 16) != 0 ? false : z14, (i14 & 32) != 0 ? null : aVar, (i14 & 64) != 0 ? false : z15, (i14 & 128) != 0 ? null : bool);
    }

    public static f a(f fVar, v vVar, b11.l lVar, List list, boolean z14, v11.a aVar, boolean z15, int i14) {
        if ((i14 & 1) != 0) {
            vVar = fVar.f188405a;
        }
        v vVar2 = vVar;
        if ((i14 & 2) != 0) {
            lVar = fVar.f188406b;
        }
        b11.l lVar2 = lVar;
        if ((i14 & 4) != 0) {
            list = fVar.f188407c;
        }
        List list2 = list;
        i53.c<b11.v> cVar = fVar.f188408d;
        if ((i14 & 16) != 0) {
            z14 = fVar.f188409e;
        }
        boolean z16 = z14;
        if ((i14 & 32) != 0) {
            aVar = fVar.f188410f;
        }
        v11.a aVar2 = aVar;
        boolean z17 = (i14 & 64) != 0 ? fVar.f188411g : z15;
        Boolean bool = fVar.f188412h;
        fVar.getClass();
        vVar2.getClass();
        list2.getClass();
        cVar.getClass();
        return new f(vVar2, lVar2, list2, cVar, z16, aVar2, z17, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f188405a, fVar.f188405a) && s.g(this.f188406b, fVar.f188406b) && s.g(this.f188407c, fVar.f188407c) && s.g(this.f188408d, fVar.f188408d) && this.f188409e == fVar.f188409e && s.g(this.f188410f, fVar.f188410f) && this.f188411g == fVar.f188411g && s.g(this.f188412h, fVar.f188412h);
    }

    public final int hashCode() {
        int iHashCode = this.f188405a.f16219a.hashCode() * 31;
        b11.l lVar = this.f188406b;
        int iG = q6.f.g(l2.a(this.f188408d, u0.b((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.f188407c), 31), 31, this.f188409e);
        v11.a aVar = this.f188410f;
        int iG2 = q6.f.g((iG + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f188411g);
        Boolean bool = this.f188412h;
        return iG2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "ImageRecognitionConfirmationUiState(mealTime=" + this.f188405a + ", currentMealWindow=" + this.f188406b + ", meals=" + this.f188407c + ", foodItems=" + this.f188408d + ", isLoading=" + this.f188409e + ", navigateToFindFoodWithConfirmationResult=" + this.f188410f + ", showError=" + this.f188411g + ", isTimelineView=" + this.f188412h + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(v vVar, b11.l lVar, List<b11.l> list, i53.c<? extends b11.v> cVar, boolean z14, v11.a aVar, boolean z15, Boolean bool) {
        vVar.getClass();
        list.getClass();
        cVar.getClass();
        this.f188405a = vVar;
        this.f188406b = lVar;
        this.f188407c = list;
        this.f188408d = cVar;
        this.f188409e = z14;
        this.f188410f = aVar;
        this.f188411g = z15;
        this.f188412h = bool;
    }
}
