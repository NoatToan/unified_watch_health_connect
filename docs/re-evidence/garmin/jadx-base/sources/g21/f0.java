package g21;

import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lg21/f0;", "", "", "calories", "", "carbs", "fat", "protein", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f75417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f75418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f75419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f75420d;

    public /* synthetic */ f0(Integer num, Double d14, Double d15, Double d16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15, (i14 & 8) != 0 ? null : d16);
    }

    public final f0 a() {
        Integer num = this.f75417a;
        Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 0);
        Double d14 = this.f75418b;
        Double dValueOf = Double.valueOf(d14 != null ? d14.doubleValue() : 0.0d);
        Double d15 = this.f75419c;
        Double dValueOf2 = Double.valueOf(d15 != null ? d15.doubleValue() : 0.0d);
        Double d16 = this.f75420d;
        return new f0(numValueOf, dValueOf, dValueOf2, Double.valueOf(d16 != null ? d16.doubleValue() : 0.0d));
    }

    public final f0 b(f0 f0Var) {
        f0Var.getClass();
        return new f0(dh.b.K(this.f75417a, f0Var.f75417a), zf.b.F(this.f75418b, f0Var.f75418b), zf.b.F(this.f75419c, f0Var.f75419c), zf.b.F(this.f75420d, f0Var.f75420d));
    }

    public final f0 c(double d14) {
        Integer num = this.f75417a;
        Integer numValueOf = num != null ? Integer.valueOf(MathKt.b(((double) num.intValue()) * d14)) : null;
        Double d15 = this.f75418b;
        Double dC = d15 != null ? p6.b.c(d14, d15) : null;
        Double d16 = this.f75419c;
        Double dC2 = d16 != null ? p6.b.c(d14, d16) : null;
        Double d17 = this.f75420d;
        return new f0(numValueOf, dC, dC2, d17 != null ? p6.b.c(d14, d17) : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return p005kotlin.jvm.internal.s.g(this.f75417a, f0Var.f75417a) && p005kotlin.jvm.internal.s.g(this.f75418b, f0Var.f75418b) && p005kotlin.jvm.internal.s.g(this.f75419c, f0Var.f75419c) && p005kotlin.jvm.internal.s.g(this.f75420d, f0Var.f75420d);
    }

    public final int hashCode() {
        Integer num = this.f75417a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d14 = this.f75418b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f75419c;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f75420d;
        return iHashCode3 + (d16 != null ? d16.hashCode() : 0);
    }

    public final String toString() {
        return sn.a.f(this.f75419c, this.f75420d, ", protein=", ")", u0.m("ThinNutritionUIModel(calories=", this.f75417a, ", carbs=", this.f75418b, ", fat="));
    }

    public f0(Integer num, Double d14, Double d15, Double d16) {
        this.f75417a = num;
        this.f75418b = d14;
        this.f75419c = d15;
        this.f75420d = d16;
    }

    public f0() {
        this(null, null, null, null, 15, null);
    }
}
