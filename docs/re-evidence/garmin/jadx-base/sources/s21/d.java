package s21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ls21/d;", "", "", "mealIndex", "", "mealName", "", "isNameTranslated", "Lb63/v;", "startTime", "endTime", "<init>", "(ILjava/lang/String;ZLb63/v;Lb63/v;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f156088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f156090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b63.v f156091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b63.v f156092e;

    public d(int i14, String str, boolean z14, b63.v vVar, b63.v vVar2) {
        str.getClass();
        this.f156088a = i14;
        this.f156089b = str;
        this.f156090c = z14;
        this.f156091d = vVar;
        this.f156092e = vVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f156088a == dVar.f156088a && this.f156089b.equals(dVar.f156089b) && this.f156090c == dVar.f156090c && p005kotlin.jvm.internal.s.g(this.f156091d, dVar.f156091d) && p005kotlin.jvm.internal.s.g(this.f156092e, dVar.f156092e);
    }

    public final int hashCode() {
        int iG = q6.f.g(wr.g.j(Integer.hashCode(this.f156088a) * 31, 31, this.f156089b), 31, this.f156090c);
        b63.v vVar = this.f156091d;
        int iHashCode = (iG + (vVar == null ? 0 : vVar.f16219a.hashCode())) * 31;
        b63.v vVar2 = this.f156092e;
        return iHashCode + (vVar2 != null ? vVar2.f16219a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = wr.g.r(this.f156088a, "EditMealResult(mealIndex=", ", mealName=", this.f156089b, ", isNameTranslated=");
        sbR.append(this.f156090c);
        sbR.append(", startTime=");
        sbR.append(this.f156091d);
        sbR.append(", endTime=");
        sbR.append(this.f156092e);
        sbR.append(")");
        return sbR.toString();
    }
}
