package c11;

import b71.i;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lc11/a;", "", "", "saturatedFat", "transFat", "polyunsaturatedFat", "monounsaturatedFat", "cholesterol", "fiber", "sugar", "addedSugars", "sodium", "vitaminA", "vitaminC", "vitaminD", "calcium", "iron", "potassium", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f22494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f22495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f22496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f22497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f22498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f22499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f22500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f22501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Double f22502i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Double f22503j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Double f22504k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Double f22505l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Double f22506m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Double f22507n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Double f22508o;

    public /* synthetic */ a(Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, Double d35, Double d36, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : d15, (i14 & 4) != 0 ? null : d16, (i14 & 8) != 0 ? null : d17, (i14 & 16) != 0 ? null : d18, (i14 & 32) != 0 ? null : d19, (i14 & 64) != 0 ? null : d24, (i14 & 128) != 0 ? null : d25, (i14 & 256) != 0 ? null : d26, (i14 & 512) != 0 ? null : d27, (i14 & 1024) != 0 ? null : d28, (i14 & 2048) != 0 ? null : d29, (i14 & 4096) != 0 ? null : d34, (i14 & 8192) != 0 ? null : d35, (i14 & 16384) != 0 ? null : d36);
    }

    public static a a(a aVar, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, Double d35, Double d36, int i14) {
        Double d37 = (i14 & 1) != 0 ? aVar.f22494a : d14;
        Double d38 = (i14 & 2) != 0 ? aVar.f22495b : d15;
        Double d39 = (i14 & 4) != 0 ? aVar.f22496c : d16;
        Double d44 = (i14 & 8) != 0 ? aVar.f22497d : d17;
        Double d45 = (i14 & 16) != 0 ? aVar.f22498e : d18;
        Double d46 = (i14 & 32) != 0 ? aVar.f22499f : d19;
        Double d47 = (i14 & 64) != 0 ? aVar.f22500g : d24;
        Double d48 = (i14 & 128) != 0 ? aVar.f22501h : d25;
        Double d49 = (i14 & 256) != 0 ? aVar.f22502i : d26;
        Double d54 = (i14 & 512) != 0 ? aVar.f22503j : d27;
        Double d55 = (i14 & 1024) != 0 ? aVar.f22504k : d28;
        Double d56 = (i14 & 2048) != 0 ? aVar.f22505l : d29;
        Double d57 = (i14 & 4096) != 0 ? aVar.f22506m : d34;
        Double d58 = (i14 & 8192) != 0 ? aVar.f22507n : d35;
        Double d59 = (i14 & 16384) != 0 ? aVar.f22508o : d36;
        aVar.getClass();
        return new a(d37, d38, d39, d44, d45, d46, d47, d48, d49, d54, d55, d56, d57, d58, d59);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f22494a, aVar.f22494a) && s.g(this.f22495b, aVar.f22495b) && s.g(this.f22496c, aVar.f22496c) && s.g(this.f22497d, aVar.f22497d) && s.g(this.f22498e, aVar.f22498e) && s.g(this.f22499f, aVar.f22499f) && s.g(this.f22500g, aVar.f22500g) && s.g(this.f22501h, aVar.f22501h) && s.g(this.f22502i, aVar.f22502i) && s.g(this.f22503j, aVar.f22503j) && s.g(this.f22504k, aVar.f22504k) && s.g(this.f22505l, aVar.f22505l) && s.g(this.f22506m, aVar.f22506m) && s.g(this.f22507n, aVar.f22507n) && s.g(this.f22508o, aVar.f22508o);
    }

    public final int hashCode() {
        Double d14 = this.f22494a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.f22495b;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f22496c;
        int iHashCode3 = (iHashCode2 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f22497d;
        int iHashCode4 = (iHashCode3 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.f22498e;
        int iHashCode5 = (iHashCode4 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.f22499f;
        int iHashCode6 = (iHashCode5 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.f22500g;
        int iHashCode7 = (iHashCode6 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.f22501h;
        int iHashCode8 = (iHashCode7 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Double d26 = this.f22502i;
        int iHashCode9 = (iHashCode8 + (d26 == null ? 0 : d26.hashCode())) * 31;
        Double d27 = this.f22503j;
        int iHashCode10 = (iHashCode9 + (d27 == null ? 0 : d27.hashCode())) * 31;
        Double d28 = this.f22504k;
        int iHashCode11 = (iHashCode10 + (d28 == null ? 0 : d28.hashCode())) * 31;
        Double d29 = this.f22505l;
        int iHashCode12 = (iHashCode11 + (d29 == null ? 0 : d29.hashCode())) * 31;
        Double d34 = this.f22506m;
        int iHashCode13 = (iHashCode12 + (d34 == null ? 0 : d34.hashCode())) * 31;
        Double d35 = this.f22507n;
        int iHashCode14 = (iHashCode13 + (d35 == null ? 0 : d35.hashCode())) * 31;
        Double d36 = this.f22508o;
        return iHashCode14 + (d36 != null ? d36.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = k.i("MicronutrientContent(saturatedFat=", this.f22494a, this.f22495b, ", transFat=", ", polyunsaturatedFat=");
        i.p(this.f22496c, this.f22497d, ", monounsaturatedFat=", ", cholesterol=", sbI);
        i.p(this.f22498e, this.f22499f, ", fiber=", ", sugar=", sbI);
        i.p(this.f22500g, this.f22501h, ", addedSugars=", ", sodium=", sbI);
        i.p(this.f22502i, this.f22503j, ", vitaminA=", ", vitaminC=", sbI);
        i.p(this.f22504k, this.f22505l, ", vitaminD=", ", calcium=", sbI);
        i.p(this.f22506m, this.f22507n, ", iron=", ", potassium=", sbI);
        return i.g(sbI, this.f22508o, ")");
    }

    public a(Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Double d34, Double d35, Double d36) {
        this.f22494a = d14;
        this.f22495b = d15;
        this.f22496c = d16;
        this.f22497d = d17;
        this.f22498e = d18;
        this.f22499f = d19;
        this.f22500g = d24;
        this.f22501h = d25;
        this.f22502i = d26;
        this.f22503j = d27;
        this.f22504k = d28;
        this.f22505l = d29;
        this.f22506m = d34;
        this.f22507n = d35;
        this.f22508o = d36;
    }

    public a() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }
}
