package l11;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ll11/r;", "", "Lb11/i$b;", "loggedFood", "Li53/c;", "Lb11/s;", "units", "Lg21/h;", "nutritionSummary", "Lb11/l;", "meals", "", "isTimelineView", "", "note", "showMealSelectionError", "<init>", "(Lb11/i$b;Li53/c;Lg21/h;Li53/c;ZLjava/lang/String;Z)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b11.i.b f108230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<b11.s> f108231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g21.h f108232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<b11.l> f108233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f108234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f108235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f108236g;

    public r(b11.i.b bVar, i53.c<b11.s> cVar, g21.h hVar, i53.c<b11.l> cVar2, boolean z14, String str, boolean z15) {
        bVar.getClass();
        cVar.getClass();
        hVar.getClass();
        cVar2.getClass();
        this.f108230a = bVar;
        this.f108231b = cVar;
        this.f108232c = hVar;
        this.f108233d = cVar2;
        this.f108234e = z14;
        this.f108235f = str;
        this.f108236g = z15;
    }

    public static r a(r rVar, b11.i.b bVar, boolean z14, int i14) {
        if ((i14 & 1) != 0) {
            bVar = rVar.f108230a;
        }
        b11.i.b bVar2 = bVar;
        i53.c<b11.s> cVar = rVar.f108231b;
        g21.h hVar = rVar.f108232c;
        i53.c<b11.l> cVar2 = rVar.f108233d;
        boolean z15 = rVar.f108234e;
        String str = rVar.f108235f;
        if ((i14 & 64) != 0) {
            z14 = rVar.f108236g;
        }
        rVar.getClass();
        bVar2.getClass();
        cVar.getClass();
        hVar.getClass();
        cVar2.getClass();
        return new r(bVar2, cVar, hVar, cVar2, z15, str, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return p005kotlin.jvm.internal.s.g(this.f108230a, rVar.f108230a) && p005kotlin.jvm.internal.s.g(this.f108231b, rVar.f108231b) && p005kotlin.jvm.internal.s.g(this.f108232c, rVar.f108232c) && p005kotlin.jvm.internal.s.g(this.f108233d, rVar.f108233d) && this.f108234e == rVar.f108234e && p005kotlin.jvm.internal.s.g(this.f108235f, rVar.f108235f) && this.f108236g == rVar.f108236g;
    }

    public final int hashCode() {
        int iG = q6.f.g(l2.a(this.f108233d, (this.f108232c.hashCode() + l2.a(this.f108231b, this.f108230a.hashCode() * 31, 31)) * 31, 31), 31, this.f108234e);
        String str = this.f108235f;
        return Boolean.hashCode(this.f108236g) + ((iG + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RecipeDetailsData(loggedFood=");
        sb3.append(this.f108230a);
        sb3.append(", units=");
        sb3.append(this.f108231b);
        sb3.append(", nutritionSummary=");
        sb3.append(this.f108232c);
        sb3.append(", meals=");
        sb3.append(this.f108233d);
        sb3.append(", isTimelineView=");
        fb1.c.w(", note=", this.f108235f, ", showMealSelectionError=", sb3, this.f108234e);
        return hb.a.k(sb3, this.f108236g, ")");
    }

    public /* synthetic */ r(b11.i.b bVar, i53.c cVar, g21.h hVar, i53.c cVar2, boolean z14, String str, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, cVar, hVar, cVar2, z14, str, (i14 & 64) != 0 ? false : z15);
    }
}
