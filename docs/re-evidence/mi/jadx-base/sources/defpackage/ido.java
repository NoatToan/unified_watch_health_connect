package defpackage;

import com.google.common.math.Stats;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class ido {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f21034a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f21035b = 0.0d;
    public double c = 0.0d;
    public double d = Double.NaN;
    public double e = Double.NaN;

    public static double g(double d, double d2) {
        if (z27.f(d)) {
            return d2;
        }
        if (z27.f(d2) || d == d2) {
            return d;
        }
        return Double.NaN;
    }

    public void a(double d) {
        long j = this.f21034a;
        if (j == 0) {
            this.f21034a = 1L;
            this.f21035b = d;
            this.d = d;
            this.e = d;
            if (z27.f(d)) {
                return;
            }
            this.c = Double.NaN;
            return;
        }
        this.f21034a = j + 1;
        if (z27.f(d) && z27.f(this.f21035b)) {
            double d2 = this.f21035b;
            double d3 = d - d2;
            double d4 = d2 + (d3 / this.f21034a);
            this.f21035b = d4;
            this.c += d3 * (d - d4);
        } else {
            this.f21035b = g(this.f21035b, d);
            this.c = Double.NaN;
        }
        this.d = Math.min(this.d, d);
        this.e = Math.max(this.e, d);
    }

    public void b(Iterable<? extends Number> iterable) {
        Iterator<? extends Number> it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next().doubleValue());
        }
    }

    public void c(Iterator<? extends Number> it) {
        while (it.hasNext()) {
            a(it.next().doubleValue());
        }
    }

    public void d(double... dArr) {
        for (double d : dArr) {
            a(d);
        }
    }

    public void e(int... iArr) {
        for (int i : iArr) {
            a(i);
        }
    }

    public void f(long... jArr) {
        for (long j : jArr) {
            a(j);
        }
    }

    public Stats h() {
        return new Stats(this.f21034a, this.f21035b, this.c, this.d, this.e);
    }
}
