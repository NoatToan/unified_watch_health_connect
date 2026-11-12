package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import java.util.Iterator;
import o2.c;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class StatsAccumulator {
    private long count = 0;
    private double mean = 0.0d;
    private double sumOfSquaresOfDeltas = 0.0d;
    private double min = Double.NaN;
    private double max = Double.NaN;

    public static double calculateNewMeanNonFinite(double d14, double d15) {
        if (Doubles.isFinite(d14)) {
            return d15;
        }
        if (Doubles.isFinite(d15) || d14 == d15) {
            return d14;
        }
        return Double.NaN;
    }

    private void merge(long j8, double d14, double d15, double d16, double d17) {
        long j14 = this.count;
        if (j14 == 0) {
            this.count = j8;
            this.mean = d14;
            this.sumOfSquaresOfDeltas = d15;
            this.min = d16;
            this.max = d17;
            return;
        }
        this.count = j14 + j8;
        if (Doubles.isFinite(this.mean) && Doubles.isFinite(d14)) {
            double d18 = this.mean;
            double d19 = d14 - d18;
            double d24 = j8;
            double d25 = ((d19 * d24) / this.count) + d18;
            this.mean = d25;
            this.sumOfSquaresOfDeltas = ((d14 - d25) * d19 * d24) + d15 + this.sumOfSquaresOfDeltas;
        } else {
            this.mean = calculateNewMeanNonFinite(this.mean, d14);
            this.sumOfSquaresOfDeltas = Double.NaN;
        }
        this.min = Math.min(this.min, d16);
        this.max = Math.max(this.max, d17);
    }

    public void add(double d14) {
        double d15;
        long j8 = this.count;
        if (j8 == 0) {
            this.count = 1L;
            this.mean = d14;
            this.min = d14;
            this.max = d14;
            if (Doubles.isFinite(d14)) {
                return;
            }
            this.sumOfSquaresOfDeltas = Double.NaN;
            return;
        }
        this.count = j8 + 1;
        if (Doubles.isFinite(d14) && Doubles.isFinite(this.mean)) {
            double d16 = this.mean;
            double d17 = d14 - d16;
            double d18 = (d17 / this.count) + d16;
            this.mean = d18;
            d15 = d14;
            this.sumOfSquaresOfDeltas = c.b(d14, d18, d17, this.sumOfSquaresOfDeltas);
        } else {
            d15 = d14;
            this.mean = calculateNewMeanNonFinite(this.mean, d15);
            this.sumOfSquaresOfDeltas = Double.NaN;
        }
        this.min = Math.min(this.min, d15);
        this.max = Math.max(this.max, d15);
    }

    public void addAll(Stats stats) {
        if (stats.count() == 0) {
            return;
        }
        merge(stats.count(), stats.mean(), stats.sumOfSquaresOfDeltas(), stats.min(), stats.max());
    }

    public long count() {
        return this.count;
    }

    public double max() {
        Preconditions.checkState(this.count != 0);
        return this.max;
    }

    public double mean() {
        Preconditions.checkState(this.count != 0);
        return this.mean;
    }

    public double min() {
        Preconditions.checkState(this.count != 0);
        return this.min;
    }

    public final double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public final double populationVariance() {
        Preconditions.checkState(this.count != 0);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        if (this.count == 1) {
            return 0.0d;
        }
        return DoubleUtils.ensureNonNegative(this.sumOfSquaresOfDeltas) / this.count;
    }

    public final double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public final double sampleVariance() {
        Preconditions.checkState(this.count > 1);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        return DoubleUtils.ensureNonNegative(this.sumOfSquaresOfDeltas) / (this.count - 1);
    }

    public Stats snapshot() {
        return new Stats(this.count, this.mean, this.sumOfSquaresOfDeltas, this.min, this.max);
    }

    public final double sum() {
        return this.mean * this.count;
    }

    public double sumOfSquaresOfDeltas() {
        return this.sumOfSquaresOfDeltas;
    }

    public void addAll(Iterator<? extends Number> it) {
        while (it.hasNext()) {
            add(it.next().doubleValue());
        }
    }

    public void addAll(double... dArr) {
        for (double d14 : dArr) {
            add(d14);
        }
    }

    public void addAll(int... iArr) {
        for (int i14 : iArr) {
            add(i14);
        }
    }

    public void addAll(long... jArr) {
        for (long j8 : jArr) {
            add(j8);
        }
    }

    public void addAll(Iterable<? extends Number> iterable) {
        Iterator<? extends Number> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next().doubleValue());
        }
    }

    public void addAll(StatsAccumulator statsAccumulator) {
        if (statsAccumulator.count() == 0) {
            return;
        }
        merge(statsAccumulator.count(), statsAccumulator.mean(), statsAccumulator.sumOfSquaresOfDeltas(), statsAccumulator.min(), statsAccumulator.max());
    }
}
