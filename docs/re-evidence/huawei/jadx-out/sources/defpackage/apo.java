package defpackage;

import com.google.common.math.ElementTypesAreNonnullByDefault;
import com.google.common.math.Stats;
import com.google.common.primitives.Doubles;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class apo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f661a = 0;
    private double e = 0.0d;
    private double d = 0.0d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f662b = Double.NaN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f663c = Double.NaN;

    public void b(double d) {
        long j = this.f661a;
        if (j == 0) {
            this.f661a = 1L;
            this.e = d;
            this.f662b = d;
            this.f663c = d;
            if (Doubles.a(d)) {
                return;
            }
            this.d = Double.NaN;
            return;
        }
        this.f661a = j + 1;
        if (Doubles.a(d) && Doubles.a(this.e)) {
            double d2 = this.e;
            double d3 = d - d2;
            double d4 = d2 + (d3 / this.f661a);
            this.e = d4;
            this.d += d3 * (d - d4);
        } else {
            this.e = e(this.e, d);
            this.d = Double.NaN;
        }
        this.f662b = Math.min(this.f662b, d);
        this.f663c = Math.max(this.f663c, d);
    }

    public void d(Iterable<? extends Number> iterable) {
        Iterator<? extends Number> it = iterable.iterator();
        while (it.hasNext()) {
            b(it.next().doubleValue());
        }
    }

    public void d(Iterator<? extends Number> it) {
        while (it.hasNext()) {
            b(it.next().doubleValue());
        }
    }

    public void e(double... dArr) {
        for (double d : dArr) {
            b(d);
        }
    }

    public void d(int... iArr) {
        for (int i : iArr) {
            b(i);
        }
    }

    public void a(long... jArr) {
        for (long j : jArr) {
            b(j);
        }
    }

    public Stats c() {
        return new Stats(this.f661a, this.e, this.d, this.f662b, this.f663c);
    }

    public static double e(double d, double d2) {
        if (Doubles.a(d)) {
            return d2;
        }
        if (Doubles.a(d2) || d == d2) {
            return d;
        }
        return Double.NaN;
    }
}
