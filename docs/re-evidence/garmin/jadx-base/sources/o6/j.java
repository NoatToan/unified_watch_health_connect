package o6;

/* JADX INFO: loaded from: classes.dex */
public class j extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f129501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f129502e;

    public j(String str) {
        this.f129462a = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f129501d = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i14 = iIndexOf2 + 1;
        this.f129502e = Double.parseDouble(str.substring(i14, str.indexOf(44, i14)).trim());
    }

    @Override // o6.c
    public final double a(double d14) {
        double d15 = this.f129502e;
        double d16 = this.f129501d;
        if (d14 < d15) {
            return (d15 * d14) / (((d15 - d14) * d16) + d14);
        }
        return ((d14 - 1.0d) * (1.0d - d15)) / ((1.0d - d14) - ((d15 - d14) * d16));
    }

    @Override // o6.c
    public final double b(double d14) {
        double d15 = this.f129502e;
        double d16 = this.f129501d;
        if (d14 < d15) {
            double d17 = d16 * d15 * d15;
            double d18 = ((d15 - d14) * d16) + d14;
            return d17 / (d18 * d18);
        }
        double d19 = d15 - 1.0d;
        double d24 = (((d15 - d14) * (-d16)) - d14) + 1.0d;
        return ((d19 * d16) * d19) / (d24 * d24);
    }
}
