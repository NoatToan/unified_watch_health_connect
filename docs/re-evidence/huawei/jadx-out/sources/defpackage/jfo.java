package defpackage;

/* JADX INFO: loaded from: classes10.dex */
public class jfo {
    private double e = 0.0d;

    public double c(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            return this.e;
        }
        this.e = d;
        return d;
    }
}
