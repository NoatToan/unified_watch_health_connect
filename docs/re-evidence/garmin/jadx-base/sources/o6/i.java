package o6;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f129496a = new float[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f129497b = new double[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double[] f129498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f129499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f129500e;

    public final void a(double d14, float f14) {
        int length = this.f129496a.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f129497b, d14);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f129497b = Arrays.copyOf(this.f129497b, length);
        this.f129496a = Arrays.copyOf(this.f129496a, length);
        this.f129498c = new double[length];
        double[] dArr = this.f129497b;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f129497b[iBinarySearch] = d14;
        this.f129496a[iBinarySearch] = f14;
    }

    public final String toString() {
        return "pos =" + Arrays.toString(this.f129497b) + " period=" + Arrays.toString(this.f129496a);
    }
}
