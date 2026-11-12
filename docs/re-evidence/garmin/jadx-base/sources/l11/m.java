package l11;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ll11/m;", "", "Ll11/l;", "customMealDetails", "", "showFavorite", "showEditDeleteOptionMenu", "isMealSelectionAllowed", "Li53/c;", "Lb11/o;", "micronutrientEntries", "dailyMicroEntries", "<init>", "(Ll11/l;ZZZLi53/c;Li53/c;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f108184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f108185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f108186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f108187d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.c<b11.o> f108188e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i53.c<b11.o> f108189f;

    public /* synthetic */ m(l lVar, boolean z14, boolean z15, boolean z16, i53.c cVar, i53.c cVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(lVar, z14, z15, z16, (i14 & 16) != 0 ? null : cVar, (i14 & 32) != 0 ? null : cVar2);
    }

    public static m a(m mVar, l lVar) {
        return new m(lVar, mVar.f108185b, mVar.f108186c, mVar.f108187d, mVar.f108188e, mVar.f108189f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return p005kotlin.jvm.internal.s.g(this.f108184a, mVar.f108184a) && this.f108185b == mVar.f108185b && this.f108186c == mVar.f108186c && this.f108187d == mVar.f108187d && p005kotlin.jvm.internal.s.g(this.f108188e, mVar.f108188e) && p005kotlin.jvm.internal.s.g(this.f108189f, mVar.f108189f);
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(q6.f.g(this.f108184a.hashCode() * 31, 31, this.f108185b), 31, this.f108186c), 31, this.f108187d);
        i53.c<b11.o> cVar = this.f108188e;
        int iHashCode = (iG + (cVar == null ? 0 : cVar.hashCode())) * 31;
        i53.c<b11.o> cVar2 = this.f108189f;
        return iHashCode + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MealDetailsUIState(customMealDetails=");
        sb3.append(this.f108184a);
        sb3.append(", showFavorite=");
        sb3.append(this.f108185b);
        sb3.append(", showEditDeleteOptionMenu=");
        kg.f.q(", isMealSelectionAllowed=", ", micronutrientEntries=", sb3, this.f108186c, this.f108187d);
        sb3.append(this.f108188e);
        sb3.append(", dailyMicroEntries=");
        sb3.append(this.f108189f);
        sb3.append(")");
        return sb3.toString();
    }

    public m(l lVar, boolean z14, boolean z15, boolean z16, i53.c<b11.o> cVar, i53.c<b11.o> cVar2) {
        lVar.getClass();
        this.f108184a = lVar;
        this.f108185b = z14;
        this.f108186c = z15;
        this.f108187d = z16;
        this.f108188e = cVar;
        this.f108189f = cVar2;
    }
}
