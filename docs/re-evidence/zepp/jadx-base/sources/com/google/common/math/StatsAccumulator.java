package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtIncompatible
public final class StatsAccumulator {
    private long a = 0;
    private double b = 0.0d;
    private double c = 0.0d;
    private double d = Double.NaN;
    private double e = Double.NaN;

    public static double a(double d, double d2) {
        if (Doubles.isFinite(d)) {
            return d2;
        }
        if (Doubles.isFinite(d2) || d == d2) {
            return d;
        }
        return Double.NaN;
    }

    public void add(double d) {
        long j = this.a;
        if (j == 0) {
            this.a = 1L;
            this.b = d;
            this.d = d;
            this.e = d;
            if (Doubles.isFinite(d)) {
                return;
            }
            this.c = Double.NaN;
            return;
        }
        this.a = j + 1;
        if (Doubles.isFinite(d) && Doubles.isFinite(this.b)) {
            double d2 = this.b;
            double d3 = d - d2;
            double d4 = d2 + (d3 / this.a);
            this.b = d4;
            this.c += d3 * (d - d4);
        } else {
            this.b = a(this.b, d);
            this.c = Double.NaN;
        }
        this.d = Math.min(this.d, d);
        this.e = Math.max(this.e, d);
    }

    public void addAll(Iterable<? extends Number> iterable) {
        Iterator<? extends Number> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next().doubleValue());
        }
    }

    public double b() {
        return this.c;
    }

    public long count() {
        return this.a;
    }

    public double max() {
        Preconditions.checkState(this.a != 0);
        return this.e;
    }

    public double mean() {
        Preconditions.checkState(this.a != 0);
        return this.b;
    }

    public double min() {
        Preconditions.checkState(this.a != 0);
        return this.d;
    }

    public final double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public final double populationVariance() {
        Preconditions.checkState(this.a != 0);
        if (Double.isNaN(this.c)) {
            return Double.NaN;
        }
        if (this.a == 1) {
            return 0.0d;
        }
        return a.b(this.c) / this.a;
    }

    public final double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public final double sampleVariance() {
        Preconditions.checkState(this.a > 1);
        if (Double.isNaN(this.c)) {
            return Double.NaN;
        }
        return a.b(this.c) / (this.a - 1);
    }

    public Stats snapshot() {
        return new Stats(this.a, this.b, this.c, this.d, this.e);
    }

    public final double sum() {
        return this.b * this.a;
    }

    public void addAll(Iterator<? extends Number> it2) {
        while (it2.hasNext()) {
            add(it2.next().doubleValue());
        }
    }

    public void addAll(double... dArr) {
        for (double d : dArr) {
            add(d);
        }
    }

    public void addAll(int... iArr) {
        for (int i : iArr) {
            add(i);
        }
    }

    public void addAll(long... jArr) {
        for (long j : jArr) {
            add(j);
        }
    }

    public void addAll(Stats stats) {
        if (stats.count() == 0) {
            return;
        }
        long j = this.a;
        if (j == 0) {
            this.a = stats.count();
            this.b = stats.mean();
            this.c = stats.b();
            this.d = stats.min();
            this.e = stats.max();
            return;
        }
        this.a = j + stats.count();
        if (Doubles.isFinite(this.b) && Doubles.isFinite(stats.mean())) {
            double dMean = stats.mean();
            double d = this.b;
            double d2 = dMean - d;
            this.b = d + ((stats.count() * d2) / this.a);
            this.c += stats.b() + (d2 * (stats.mean() - this.b) * stats.count());
        } else {
            this.b = a(this.b, stats.mean());
            this.c = Double.NaN;
        }
        this.d = Math.min(this.d, stats.min());
        this.e = Math.max(this.e, stats.max());
    }
}
