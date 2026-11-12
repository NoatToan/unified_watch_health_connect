package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtIncompatible
public final class PairedStatsAccumulator {
    private final StatsAccumulator a = new StatsAccumulator();
    private final StatsAccumulator b = new StatsAccumulator();
    private double c = 0.0d;

    private static double a(double d) {
        if (d >= 1.0d) {
            return 1.0d;
        }
        if (d <= -1.0d) {
            return -1.0d;
        }
        return d;
    }

    private double b(double d) {
        if (d > 0.0d) {
            return d;
        }
        return Double.MIN_VALUE;
    }

    public void add(double d, double d2) {
        this.a.add(d);
        if (!Doubles.isFinite(d) || !Doubles.isFinite(d2)) {
            this.c = Double.NaN;
        } else if (this.a.count() > 1) {
            this.c += (d - this.a.mean()) * (d2 - this.b.mean());
        }
        this.b.add(d2);
    }

    public void addAll(PairedStats pairedStats) {
        if (pairedStats.count() == 0) {
            return;
        }
        this.a.addAll(pairedStats.xStats());
        if (this.b.count() == 0) {
            this.c = pairedStats.c();
        } else {
            this.c += pairedStats.c() + ((pairedStats.xStats().mean() - this.a.mean()) * (pairedStats.yStats().mean() - this.b.mean()) * pairedStats.count());
        }
        this.b.addAll(pairedStats.yStats());
    }

    public long count() {
        return this.a.count();
    }

    public final LinearTransformation leastSquaresFit() {
        Preconditions.checkState(count() > 1);
        if (Double.isNaN(this.c)) {
            return LinearTransformation.forNaN();
        }
        double dB = this.a.b();
        if (dB > 0.0d) {
            return this.b.b() > 0.0d ? LinearTransformation.mapping(this.a.mean(), this.b.mean()).withSlope(this.c / dB) : LinearTransformation.horizontal(this.b.mean());
        }
        Preconditions.checkState(this.b.b() > 0.0d);
        return LinearTransformation.vertical(this.a.mean());
    }

    public final double pearsonsCorrelationCoefficient() {
        Preconditions.checkState(count() > 1);
        if (Double.isNaN(this.c)) {
            return Double.NaN;
        }
        double dB = this.a.b();
        double dB2 = this.b.b();
        Preconditions.checkState(dB > 0.0d);
        Preconditions.checkState(dB2 > 0.0d);
        return a(this.c / Math.sqrt(b(dB * dB2)));
    }

    public double populationCovariance() {
        Preconditions.checkState(count() != 0);
        return this.c / count();
    }

    public final double sampleCovariance() {
        Preconditions.checkState(count() > 1);
        return this.c / (count() - 1);
    }

    public PairedStats snapshot() {
        return new PairedStats(this.a.snapshot(), this.b.snapshot(), this.c);
    }

    public Stats xStats() {
        return this.a.snapshot();
    }

    public Stats yStats() {
        return this.b.snapshot();
    }
}
