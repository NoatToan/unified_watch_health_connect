package s1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ls1/j0;", "Ls1/g0;", "", "dampingRatio", "stiffness", "visibilityThreshold", "<init>", "(FFF)V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f155612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f155613b;

    public j0(float f14, float f15, float f16) {
        this.f155612a = f16;
        i1 i1Var = new i1(1.0f);
        if (f14 < 0.0f) {
            x0.a("Damping ratio must be non-negative");
        }
        i1Var.f155599c = f14;
        double d14 = i1Var.f155598b;
        if (((float) (d14 * d14)) <= 0.0f) {
            x0.a("Spring stiffness constant must be positive.");
        }
        i1Var.f155598b = Math.sqrt(f15);
        this.f155613b = i1Var;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0100  */
    @Override // s1.g0
    public final long b(float f14, float f15, float f16) {
        double dLog;
        long j8;
        i1 i1Var = this.f155613b;
        double d14 = i1Var.f155598b;
        float f17 = (float) (d14 * d14);
        float f18 = i1Var.f155599c;
        float f19 = this.f155612a;
        float f22 = (f14 - f15) / f19;
        float f24 = f16 / f19;
        if (f18 == 0.0f) {
            j8 = 9223372036854L;
        } else {
            double d15 = f17;
            double d16 = f18;
            double d17 = f24;
            double d18 = f22;
            double d19 = 1.0f;
            double dSqrt = d16 * 2.0d * Math.sqrt(d15);
            double d24 = (dSqrt * dSqrt) - (d15 * 4.0d);
            double dSqrt2 = d24 < 0.0d ? 0.0d : Math.sqrt(d24);
            double d25 = -dSqrt;
            double d26 = (d25 + dSqrt2) * 0.5d;
            double dSqrt3 = (d24 < 0.0d ? Math.sqrt(Math.abs(d24)) : 0.0d) * 0.5d;
            double d27 = (d25 - dSqrt2) * 0.5d;
            if (d18 == 0.0d && d17 == 0.0d) {
                j8 = 0;
            } else {
                if (d18 < 0.0d) {
                    d17 = -d17;
                }
                double dAbs = Math.abs(d18);
                double dAbs2 = Double.MAX_VALUE;
                if (d16 > 1.0d) {
                    double d28 = (d26 * dAbs) - d17;
                    double d29 = d26 - d27;
                    double d34 = d28 / d29;
                    double d35 = dAbs - d34;
                    dLog = Math.log(Math.abs(d19 / d35)) / d26;
                    double dLog2 = Math.log(Math.abs(d19 / d34)) / d27;
                    if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog = dLog2;
                    } else if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog = Math.max(dLog, dLog2);
                    }
                    double d36 = d35 * d26;
                    double dLog3 = Math.log(d36 / ((-d34) * d27)) / (d27 - d26);
                    if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
                        d19 = -d19;
                    } else if (dLog3 <= 0.0d) {
                        dLog = Math.log((-((d34 * d27) * d27)) / (d36 * d26)) / d29;
                    } else if ((-((Math.exp(dLog3 * d27) * d34) + (Math.exp(d26 * dLog3) * d35))) < d19) {
                        d19 = -d19;
                        dLog = (d34 <= 0.0d || d35 >= 0.0d) ? dLog : 0.0d;
                    } else {
                        dLog = Math.log((-((d34 * d27) * d27)) / (d36 * d26)) / d29;
                    }
                    double d37 = d34 * d27;
                    if (Math.abs((Math.exp(d27 * dLog) * d37) + (Math.exp(d26 * dLog) * d36)) >= 1.0E-4d) {
                        int i14 = 0;
                        while (dAbs2 > 0.001d && i14 < 100) {
                            i14++;
                            double d38 = d26 * dLog;
                            double d39 = d27 * dLog;
                            double dExp = dLog - ((((Math.exp(d39) * d34) + (Math.exp(d38) * d35)) + d19) / ((Math.exp(d39) * d37) + (Math.exp(d38) * d36)));
                            dAbs2 = Math.abs(dLog - dExp);
                            dLog = dExp;
                        }
                    }
                } else if (d16 < 1.0d) {
                    double d44 = (d17 - (d26 * dAbs)) / dSqrt3;
                    dLog = Math.log(d19 / Math.sqrt((d44 * d44) + (dAbs * dAbs))) / d26;
                } else {
                    double d45 = d26 * dAbs;
                    double d46 = d17 - d45;
                    double dLog4 = Math.log(Math.abs(d19 / dAbs)) / d26;
                    double dLog5 = Math.log(Math.abs(d19 / d46));
                    double dLog6 = dLog5;
                    for (int i15 = 0; i15 < 6; i15++) {
                        dLog6 = dLog5 - Math.log(Math.abs(dLog6 / d26));
                    }
                    double d47 = dLog6 / d26;
                    if ((Double.doubleToRawLongBits(dLog4) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog4 = d47;
                    } else if ((Double.doubleToRawLongBits(d47) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog4 = Math.max(dLog4, d47);
                    }
                    double d48 = (-(d45 + d46)) / (d26 * d46);
                    double d49 = d26 * d48;
                    double dExp2 = (Math.exp(d49) * d46 * d48) + (Math.exp(d49) * dAbs);
                    if (Double.isNaN(d48) || d48 <= 0.0d) {
                        d19 = -d19;
                    } else if (d48 <= 0.0d || (-dExp2) >= d19) {
                        dLog4 = (-(2.0d / d26)) - (dAbs / d46);
                    } else {
                        if (d46 < 0.0d && dAbs > 0.0d) {
                            dLog4 = 0.0d;
                        }
                        d19 = -d19;
                    }
                    dLog = dLog4;
                    int i16 = 0;
                    while (dAbs2 > 0.001d && i16 < 100) {
                        i16++;
                        double d54 = d26 * dLog;
                        double dExp3 = dLog - (((Math.exp(d54) * ((d46 * dLog) + dAbs)) + d19) / (Math.exp(d54) * (((((double) 1) + d54) * d46) + d45)));
                        dAbs2 = Math.abs(dLog - dExp3);
                        dLog = dExp3;
                    }
                }
                j8 = (long) (dLog * 1000.0d);
            }
        }
        return j8 * 1000000;
    }

    @Override // s1.g0
    public final float c(float f14, float f15, float f16, long j8) {
        i1 i1Var = this.f155613b;
        i1Var.f155597a = f15;
        return Float.intBitsToFloat((int) (i1Var.a(f14, f16, j8 / 1000000) & 4294967295L));
    }

    @Override // s1.g0
    public final float d(float f14, float f15, float f16, long j8) {
        i1 i1Var = this.f155613b;
        i1Var.f155597a = f15;
        return Float.intBitsToFloat((int) (i1Var.a(f14, f16, j8 / 1000000) >> 32));
    }

    @Override // s1.g0
    public final float e(float f14, float f15, float f16) {
        return 0.0f;
    }

    public j0() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public /* synthetic */ j0(float f14, float f15, float f16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 1.0f : f14, (i14 & 2) != 0 ? 1500.0f : f15, (i14 & 4) != 0 ? 0.01f : f16);
    }
}
