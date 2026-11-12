package o6;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f129460b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f129461c = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f129462a = "identity";

    public static c c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new a(str);
        }
        if (str.startsWith("spline")) {
            return new m(str);
        }
        if (str.startsWith("Schlick")) {
            return new j(str);
        }
        switch (str) {
            case "accelerate":
                return new a("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new a("cubic(0.0, 0.0, 0.2, 0.95)");
            case "anticipate":
                return new a("cubic(0.36, 0, 0.66, -0.56)");
            case "linear":
                return new a("cubic(1, 1, 0, 0)");
            case "overshoot":
                return new a("cubic(0.34, 1.56, 0.64, 1)");
            case "standard":
                return new a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f129461c));
                return f129460b;
        }
    }

    public double a(double d14) {
        return d14;
    }

    public double b(double d14) {
        return 1.0d;
    }

    public final String toString() {
        return this.f129462a;
    }

    public static class a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final double f129463d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final double f129464e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final double f129465f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final double f129466g;

        public a(String str) {
            this.f129462a = str;
            int iIndexOf = str.indexOf(40);
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            this.f129463d = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
            int i14 = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(44, i14);
            this.f129464e = Double.parseDouble(str.substring(i14, iIndexOf3).trim());
            int i15 = iIndexOf3 + 1;
            int iIndexOf4 = str.indexOf(44, i15);
            this.f129465f = Double.parseDouble(str.substring(i15, iIndexOf4).trim());
            int i16 = iIndexOf4 + 1;
            this.f129466g = Double.parseDouble(str.substring(i16, str.indexOf(41, i16)).trim());
        }

        @Override // o6.c
        public final double a(double d14) {
            if (d14 <= 0.0d) {
                return 0.0d;
            }
            if (d14 >= 1.0d) {
                return 1.0d;
            }
            double d15 = 0.5d;
            double d16 = 0.5d;
            while (d15 > 0.01d) {
                d15 *= 0.5d;
                d16 = d(d16) < d14 ? d16 + d15 : d16 - d15;
            }
            double d17 = d16 - d15;
            double d18 = d(d17);
            double d19 = d16 + d15;
            double d24 = d(d19);
            double dE = e(d17);
            return (((d14 - d18) * (e(d19) - dE)) / (d24 - d18)) + dE;
        }

        @Override // o6.c
        public final double b(double d14) {
            double d15 = 0.5d;
            double d16 = 0.5d;
            while (d15 > 1.0E-4d) {
                d15 *= 0.5d;
                d16 = d(d16) < d14 ? d16 + d15 : d16 - d15;
            }
            double d17 = d16 - d15;
            double d18 = d16 + d15;
            return (e(d18) - e(d17)) / (d(d18) - d(d17));
        }

        public final double d(double d14) {
            double d15 = 1.0d - d14;
            double d16 = 3.0d * d15;
            double d17 = d15 * d16 * d14;
            double d18 = d16 * d14 * d14;
            return (this.f129465f * d18) + (this.f129463d * d17) + (d14 * d14 * d14);
        }

        public final double e(double d14) {
            double d15 = 1.0d - d14;
            double d16 = 3.0d * d15;
            double d17 = d15 * d16 * d14;
            double d18 = d16 * d14 * d14;
            return (this.f129466g * d18) + (this.f129464e * d17) + (d14 * d14 * d14);
        }

        public a(double d14, double d15, double d16, double d17) {
            this.f129463d = d14;
            this.f129464e = d15;
            this.f129465f = d16;
            this.f129466g = d17;
        }
    }
}
