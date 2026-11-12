package i;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static r f86659d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f86660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f86661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f86662c;

    public final void a(double d14, double d15, long j8) {
        float f14 = (j8 - 946728000000L) / 8.64E7f;
        float f15 = (0.01720197f * f14) + 6.24006f;
        double d16 = f15;
        double dSin = (Math.sin(f15 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f15) * 3.4906598739326E-4d) + (Math.sin(d16) * 0.03341960161924362d) + d16 + 1.796593063d + 3.141592653589793d;
        double d17 = (-d15) / 360.0d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d16) * 0.0053d) + ((double) (Math.round(((double) (f14 - 9.0E-4f)) - d17) + 9.0E-4f)) + d17;
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d18 = 0.01745329238474369d * d14;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d18))) / (Math.cos(dAsin) * Math.cos(d18));
        if (dSin3 >= 1.0d) {
            this.f86662c = 1;
            this.f86660a = -1L;
            this.f86661b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f86662c = 0;
                this.f86660a = -1L;
                this.f86661b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f86660a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f86661b = jRound;
            if (jRound >= j8 || this.f86660a <= j8) {
                this.f86662c = 1;
            } else {
                this.f86662c = 0;
            }
        }
    }
}
