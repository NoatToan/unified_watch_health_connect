package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes14.dex */
public final class ContrastCurve {
    private final double high;
    private final double low;
    private final double medium;
    private final double normal;

    public ContrastCurve(double d14, double d15, double d16, double d17) {
        this.low = d14;
        this.normal = d15;
        this.medium = d16;
        this.high = d17;
    }

    public double getContrast(double d14) {
        if (d14 <= -1.0d) {
            return this.low;
        }
        if (d14 < 0.0d) {
            return MathUtils.lerp(this.low, this.normal, (d14 - (-1.0d)) / 1.0d);
        }
        if (d14 < 0.5d) {
            return MathUtils.lerp(this.normal, this.medium, (d14 - 0.0d) / 0.5d);
        }
        return d14 < 1.0d ? MathUtils.lerp(this.medium, this.high, (d14 - 0.5d) / 0.5d) : this.high;
    }
}
