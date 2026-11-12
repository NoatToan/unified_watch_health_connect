package s21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ls21/w;", "", "", "gender", "Lb63/o;", "birthdate", "", "heightInCm", "", "isUsingMetric", "<init>", "(Ljava/lang/String;Lb63/o;Ljava/lang/Float;Ljava/lang/Boolean;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b63.o f156189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f156190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f156191d;

    public /* synthetic */ w(String str, b63.o oVar, Float f14, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : oVar, (i14 & 4) != 0 ? null : f14, (i14 & 8) != 0 ? null : bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return p005kotlin.jvm.internal.s.g(this.f156188a, wVar.f156188a) && p005kotlin.jvm.internal.s.g(this.f156189b, wVar.f156189b) && p005kotlin.jvm.internal.s.g(this.f156190c, wVar.f156190c) && p005kotlin.jvm.internal.s.g(this.f156191d, wVar.f156191d);
    }

    public final int hashCode() {
        String str = this.f156188a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        b63.o oVar = this.f156189b;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.f16206a.hashCode())) * 31;
        Float f14 = this.f156190c;
        int iHashCode3 = (iHashCode2 + (f14 == null ? 0 : f14.hashCode())) * 31;
        Boolean bool = this.f156191d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "NutritionSetupPersonalDetailsUIModel(gender=" + this.f156188a + ", birthdate=" + this.f156189b + ", heightInCm=" + this.f156190c + ", isUsingMetric=" + this.f156191d + ")";
    }

    public w(String str, b63.o oVar, Float f14, Boolean bool) {
        this.f156188a = str;
        this.f156189b = oVar;
        this.f156190c = f14;
        this.f156191d = bool;
    }

    public w() {
        this(null, null, null, null, 15, null);
    }
}
