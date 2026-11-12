package b11;

import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lb11/l;", "", "", "mealId", "", "mealName", "", "isTranslated", "Lb63/v;", "startTime", "endTime", "Lg21/u;", "goals", "", "displayOrder", "<init>", "(JLjava/lang/String;ZLb63/v;Lb63/v;Lg21/u;I)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b63.v f14334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b63.v f14335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g21.u f14336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14337g;

    public l(long j8, String str, boolean z14, b63.v vVar, b63.v vVar2, g21.u uVar, int i14) {
        str.getClass();
        this.f14331a = j8;
        this.f14332b = str;
        this.f14333c = z14;
        this.f14334d = vVar;
        this.f14335e = vVar2;
        this.f14336f = uVar;
        this.f14337g = i14;
    }

    public final String a(l22.a aVar) {
        c.f14245d.getClass();
        return c.a.b(this.f14332b, aVar, this.f14333c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f14331a == lVar.f14331a && this.f14332b.equals(lVar.f14332b) && this.f14333c == lVar.f14333c && p005kotlin.jvm.internal.s.g(this.f14334d, lVar.f14334d) && p005kotlin.jvm.internal.s.g(this.f14335e, lVar.f14335e) && p005kotlin.jvm.internal.s.g(this.f14336f, lVar.f14336f) && this.f14337g == lVar.f14337g;
    }

    public final int hashCode() {
        int iG = q6.f.g(wr.g.j(Long.hashCode(this.f14331a) * 31, 31, this.f14332b), 31, this.f14333c);
        b63.v vVar = this.f14334d;
        int iHashCode = (iG + (vVar == null ? 0 : vVar.f16219a.hashCode())) * 31;
        b63.v vVar2 = this.f14335e;
        int iHashCode2 = (iHashCode + (vVar2 == null ? 0 : vVar2.f16219a.hashCode())) * 31;
        g21.u uVar = this.f14336f;
        return Integer.hashCode(this.f14337g) + ((iHashCode2 + (uVar != null ? uVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f14331a, "MealUIModel(mealId=", ", mealName=", this.f14332b);
        sbK.append(", isTranslated=");
        sbK.append(this.f14333c);
        sbK.append(", startTime=");
        sbK.append(this.f14334d);
        sbK.append(", endTime=");
        sbK.append(this.f14335e);
        sbK.append(", goals=");
        sbK.append(this.f14336f);
        return u0.k(sbK, ", displayOrder=", this.f14337g, ")");
    }
}
