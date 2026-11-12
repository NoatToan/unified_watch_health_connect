package u21;

import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lu21/l0;", "", "", "dailyCalories", "", "proteinGrams", "proteinPercentage", "fatGrams", "fatPercentage", "carbsGrams", "carbsPercentage", "<init>", "(IDIDIDI)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f168028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f168029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f168030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f168031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f168032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f168033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f168034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f168035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f168036i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f168037j;

    public /* synthetic */ l0(int i14, double d14, int i15, double d15, int i16, double d16, int i17, int i18, p005kotlin.jvm.internal.j jVar) {
        this((i18 & 1) != 0 ? 0 : i14, (i18 & 2) != 0 ? 0.0d : d14, (i18 & 4) != 0 ? 30 : i15, (i18 & 8) != 0 ? 0.0d : d15, (i18 & 16) != 0 ? 30 : i16, (i18 & 32) != 0 ? 0.0d : d16, (i18 & 64) != 0 ? 40 : i17);
    }

    public static l0 a(l0 l0Var, double d14, int i14, double d15, int i15, double d16, int i16, int i17) {
        double d17 = d14;
        int i18 = l0Var.f168028a;
        if ((i17 & 2) != 0) {
            d17 = l0Var.f168029b;
        }
        if ((i17 & 4) != 0) {
            i14 = l0Var.f168030c;
        }
        if ((i17 & 8) != 0) {
            d15 = l0Var.f168031d;
        }
        if ((i17 & 16) != 0) {
            i15 = l0Var.f168032e;
        }
        if ((i17 & 32) != 0) {
            d16 = l0Var.f168033f;
        }
        if ((i17 & 64) != 0) {
            i16 = l0Var.f168034g;
        }
        double d18 = d16;
        double d19 = d15;
        return new l0(i18, d17, i14, d19, i15, d18, i16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f168028a == l0Var.f168028a && Double.compare(this.f168029b, l0Var.f168029b) == 0 && this.f168030c == l0Var.f168030c && Double.compare(this.f168031d, l0Var.f168031d) == 0 && this.f168032e == l0Var.f168032e && Double.compare(this.f168033f, l0Var.f168033f) == 0 && this.f168034g == l0Var.f168034g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f168034g) + org.apache.commons.lang3.e.b(q2.d(this.f168032e, org.apache.commons.lang3.e.b(q2.d(this.f168030c, org.apache.commons.lang3.e.b(Integer.hashCode(this.f168028a) * 31, 31, this.f168029b), 31), 31, this.f168031d), 31), 31, this.f168033f);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NutritionSetupMacroGoalsUiModel(dailyCalories=");
        sb3.append(this.f168028a);
        sb3.append(", proteinGrams=");
        sb3.append(this.f168029b);
        sb3.append(", proteinPercentage=");
        sb3.append(this.f168030c);
        sb3.append(", fatGrams=");
        sb3.append(this.f168031d);
        sb3.append(", fatPercentage=");
        sb3.append(this.f168032e);
        am.j.x(sb3, ", carbsGrams=", this.f168033f, ", carbsPercentage=");
        return am.j.q(sb3, this.f168034g, ")");
    }

    public l0(int i14, double d14, int i15, double d15, int i16, double d16, int i17) {
        this.f168028a = i14;
        this.f168029b = d14;
        this.f168030c = i15;
        this.f168031d = d15;
        this.f168032e = i16;
        this.f168033f = d16;
        this.f168034g = i17;
        int i18 = i15 + i16 + i17;
        this.f168035h = i18;
        this.f168036i = d14 + d15 + d16;
        this.f168037j = i18 == 100;
    }

    public l0() {
        this(0, 0.0d, 0, 0.0d, 0, 0.0d, 0, 127, null);
    }
}
