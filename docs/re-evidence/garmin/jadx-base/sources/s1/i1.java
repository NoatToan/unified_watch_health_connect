package s1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls1/i1;", "", "", "finalPosition", "<init>", "(F)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f155597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f155598b = Math.sqrt(50.0d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f155599c = 1.0f;

    public i1(float f14) {
        this.f155597a = f14;
    }

    public final long a(float f14, float f15, long j8) {
        double dSin;
        double dCos;
        double dExp;
        double dExp2;
        float f16 = f14 - this.f155597a;
        double d14 = j8 / 1000.0d;
        float f17 = this.f155599c;
        double d15 = ((double) f17) * ((double) f17);
        double d16 = this.f155598b;
        double d17 = ((double) (-f17)) * d16;
        if (f17 <= 1.0f) {
            if (f17 == 1.0f) {
                double d18 = f16;
                double d19 = (d16 * d18) + ((double) f15);
                double d24 = (-d16) * d14;
                double d25 = (d14 * d19) + d18;
                dSin = Math.exp(d24) * d25;
                dExp = Math.exp(d24) * d25 * (-this.f155598b);
                dExp2 = Math.exp(d24) * d19;
            } else {
                double d26 = 1;
                double dSqrt = Math.sqrt(d26 - d15) * d16;
                double d27 = f16;
                double d28 = (((-d17) * d27) + ((double) f15)) * (d26 / dSqrt);
                double d29 = dSqrt * d14;
                double d34 = d14 * d17;
                dSin = ((Math.sin(d29) * d28) + (Math.cos(d29) * d27)) * Math.exp(d34);
                dCos = (((Math.cos(d29) * dSqrt * d28) + (Math.sin(d29) * (-dSqrt) * d27)) * Math.exp(d34)) + (d17 * dSin);
            }
            return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f155597a))) << 32);
        }
        double dSqrt2 = Math.sqrt(d15 - ((double) 1)) * d16;
        double d35 = d17 + dSqrt2;
        double d36 = d17 - dSqrt2;
        double d37 = f16;
        double d38 = ((d36 * d37) - ((double) f15)) / (d36 - d35);
        double d39 = d37 - d38;
        double d44 = d36 * d14;
        double d45 = d14 * d35;
        dSin = (Math.exp(d45) * d38) + (Math.exp(d44) * d39);
        dExp = Math.exp(d44) * d39 * d36;
        dExp2 = Math.exp(d45) * d38 * d35;
        dCos = dExp2 + dExp;
        return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f155597a))) << 32);
    }
}
