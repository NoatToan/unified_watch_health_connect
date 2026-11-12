package s21;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ls21/b0;", "", "", "weightInKg", "weightGoalInKg", "weightPickerTargetValueInKg", "weightGoalPickerTargetValueInKg", "maxMetricWeight", "maxStatuteWeight", "maxStoneWeight", "minMetricWeight", "minStatuteWeight", "minStoneWeight", "", "showWeightGoal", "showUnrealisticGoalWarning", "navigateToNextScreen", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;DDDDDDDDZZZ)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f156066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f156067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f156068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f156069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f156070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f156071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f156072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f156073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f156074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final double f156075j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f156076k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f156077l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f156078m;

    public /* synthetic */ b0(Double d14, Double d15, double d16, double d17, double d18, double d19, double d24, double d25, double d26, double d27, boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : d15, d16, d17, (i14 & 16) != 0 ? 453.5d : d18, (i14 & 32) != 0 ? 999.9d : d19, (i14 & 64) != 0 ? 71.0d : d24, (i14 & 128) != 0 ? 1.0d : d25, (i14 & 256) != 0 ? 2.0d : d26, (i14 & 512) != 0 ? 0.14d : d27, (i14 & 1024) != 0 ? true : z14, (i14 & 2048) != 0 ? false : z15, (i14 & 4096) != 0 ? false : z16);
    }

    public static b0 a(b0 b0Var, Double d14, Double d15, double d16, double d17, double d18, double d19, double d24, double d25, double d26, double d27, boolean z14, boolean z15, int i14) {
        Double d28 = (i14 & 1) != 0 ? b0Var.f156066a : d14;
        Double d29 = (i14 & 2) != 0 ? b0Var.f156067b : d15;
        double d34 = (i14 & 4) != 0 ? b0Var.f156068c : d16;
        double d35 = (i14 & 8) != 0 ? b0Var.f156069d : d17;
        double d36 = (i14 & 16) != 0 ? b0Var.f156070e : d18;
        double d37 = (i14 & 32) != 0 ? b0Var.f156071f : d19;
        double d38 = (i14 & 64) != 0 ? b0Var.f156072g : d24;
        double d39 = (i14 & 128) != 0 ? b0Var.f156073h : d25;
        Double d44 = d28;
        Double d45 = d29;
        double d46 = (i14 & 256) != 0 ? b0Var.f156074i : d26;
        if ((i14 & 512) != 0) {
            d27 = b0Var.f156075j;
        }
        boolean z16 = b0Var.f156076k;
        boolean z17 = (i14 & 2048) != 0 ? b0Var.f156077l : z14;
        boolean z18 = (i14 & 4096) != 0 ? b0Var.f156078m : z15;
        b0Var.getClass();
        return new b0(d44, d45, d34, d35, d36, d37, d38, d39, d46, d27, z16, z17, z18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return p005kotlin.jvm.internal.s.g(this.f156066a, b0Var.f156066a) && p005kotlin.jvm.internal.s.g(this.f156067b, b0Var.f156067b) && Double.compare(this.f156068c, b0Var.f156068c) == 0 && Double.compare(this.f156069d, b0Var.f156069d) == 0 && Double.compare(this.f156070e, b0Var.f156070e) == 0 && Double.compare(this.f156071f, b0Var.f156071f) == 0 && Double.compare(this.f156072g, b0Var.f156072g) == 0 && Double.compare(this.f156073h, b0Var.f156073h) == 0 && Double.compare(this.f156074i, b0Var.f156074i) == 0 && Double.compare(this.f156075j, b0Var.f156075j) == 0 && this.f156076k == b0Var.f156076k && this.f156077l == b0Var.f156077l && this.f156078m == b0Var.f156078m;
    }

    public final int hashCode() {
        Double d14 = this.f156066a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.f156067b;
        return Boolean.hashCode(this.f156078m) + q6.f.g(q6.f.g(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b((iHashCode + (d15 != null ? d15.hashCode() : 0)) * 31, 31, this.f156068c), 31, this.f156069d), 31, this.f156070e), 31, this.f156071f), 31, this.f156072g), 31, this.f156073h), 31, this.f156074i), 31, this.f156075j), 31, this.f156076k), 31, this.f156077l);
    }

    public final String toString() {
        StringBuilder sbI = tn.k.i("NutritionSetupWeightUiModel(weightInKg=", this.f156066a, this.f156067b, ", weightGoalInKg=", ", weightPickerTargetValueInKg=");
        sbI.append(this.f156068c);
        am.j.x(sbI, ", weightGoalPickerTargetValueInKg=", this.f156069d, ", maxMetricWeight=");
        sbI.append(this.f156070e);
        am.j.x(sbI, ", maxStatuteWeight=", this.f156071f, ", maxStoneWeight=");
        sbI.append(this.f156072g);
        am.j.x(sbI, ", minMetricWeight=", this.f156073h, ", minStatuteWeight=");
        sbI.append(this.f156074i);
        am.j.x(sbI, ", minStoneWeight=", this.f156075j, ", showWeightGoal=");
        kg.f.q(", showUnrealisticGoalWarning=", ", navigateToNextScreen=", sbI, this.f156076k, this.f156077l);
        return hb.a.k(sbI, this.f156078m, ")");
    }

    public b0(Double d14, Double d15, double d16, double d17, double d18, double d19, double d24, double d25, double d26, double d27, boolean z14, boolean z15, boolean z16) {
        this.f156066a = d14;
        this.f156067b = d15;
        this.f156068c = d16;
        this.f156069d = d17;
        this.f156070e = d18;
        this.f156071f = d19;
        this.f156072g = d24;
        this.f156073h = d25;
        this.f156074i = d26;
        this.f156075j = d27;
        this.f156076k = z14;
        this.f156077l = z15;
        this.f156078m = z16;
    }
}
