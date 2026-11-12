package com.google.common.math;

import defpackage.c6i;
import defpackage.d8g;
import defpackage.j4h;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public final class PairedStats implements Serializable {
    private static final int BYTES = 88;
    private static final long serialVersionUID = 0;
    private final double sumOfProductsOfDeltas;
    private final Stats xStats;
    private final Stats yStats;

    public PairedStats(Stats stats, Stats stats2, double d) {
        this.xStats = stats;
        this.yStats = stats2;
        this.sumOfProductsOfDeltas = d;
    }

    private static double ensureInUnitRange(double d) {
        if (d >= 1.0d) {
            return 1.0d;
        }
        if (d <= -1.0d) {
            return -1.0d;
        }
        return d;
    }

    private static double ensurePositive(double d) {
        if (d > 0.0d) {
            return d;
        }
        return Double.MIN_VALUE;
    }

    public static PairedStats fromByteArray(byte[] bArr) {
        c6i.o(bArr);
        c6i.g(bArr.length == 88, "Expected PairedStats.BYTES = %s, got %s", 88, bArr.length);
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        return new PairedStats(Stats.readFrom(byteBufferOrder), Stats.readFrom(byteBufferOrder), byteBufferOrder.getDouble());
    }

    public long count() {
        return this.xStats.count();
    }

    public boolean equals(Object obj) {
        if (obj == null || PairedStats.class != obj.getClass()) {
            return false;
        }
        PairedStats pairedStats = (PairedStats) obj;
        return this.xStats.equals(pairedStats.xStats) && this.yStats.equals(pairedStats.yStats) && Double.doubleToLongBits(this.sumOfProductsOfDeltas) == Double.doubleToLongBits(pairedStats.sumOfProductsOfDeltas);
    }

    public int hashCode() {
        return j4h.b(this.xStats, this.yStats, Double.valueOf(this.sumOfProductsOfDeltas));
    }

    public a leastSquaresFit() {
        c6i.t(count() > 1);
        if (Double.isNaN(this.sumOfProductsOfDeltas)) {
            return a.a();
        }
        double dSumOfSquaresOfDeltas = this.xStats.sumOfSquaresOfDeltas();
        if (dSumOfSquaresOfDeltas > 0.0d) {
            return this.yStats.sumOfSquaresOfDeltas() > 0.0d ? a.c(this.xStats.mean(), this.yStats.mean()).a(this.sumOfProductsOfDeltas / dSumOfSquaresOfDeltas) : a.b(this.yStats.mean());
        }
        c6i.t(this.yStats.sumOfSquaresOfDeltas() > 0.0d);
        return a.d(this.xStats.mean());
    }

    public double pearsonsCorrelationCoefficient() {
        c6i.t(count() > 1);
        if (Double.isNaN(this.sumOfProductsOfDeltas)) {
            return Double.NaN;
        }
        double dSumOfSquaresOfDeltas = xStats().sumOfSquaresOfDeltas();
        double dSumOfSquaresOfDeltas2 = yStats().sumOfSquaresOfDeltas();
        c6i.t(dSumOfSquaresOfDeltas > 0.0d);
        c6i.t(dSumOfSquaresOfDeltas2 > 0.0d);
        return ensureInUnitRange(this.sumOfProductsOfDeltas / Math.sqrt(ensurePositive(dSumOfSquaresOfDeltas * dSumOfSquaresOfDeltas2)));
    }

    public double populationCovariance() {
        c6i.t(count() != 0);
        return this.sumOfProductsOfDeltas / count();
    }

    public double sampleCovariance() {
        c6i.t(count() > 1);
        return this.sumOfProductsOfDeltas / (count() - 1);
    }

    public double sumOfProductsOfDeltas() {
        return this.sumOfProductsOfDeltas;
    }

    public byte[] toByteArray() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(88).order(ByteOrder.LITTLE_ENDIAN);
        this.xStats.writeTo(byteBufferOrder);
        this.yStats.writeTo(byteBufferOrder);
        byteBufferOrder.putDouble(this.sumOfProductsOfDeltas);
        return byteBufferOrder.array();
    }

    public String toString() {
        return count() > 0 ? d8g.b(this).d("xStats", this.xStats).d("yStats", this.yStats).a("populationCovariance", populationCovariance()).toString() : d8g.b(this).d("xStats", this.xStats).d("yStats", this.yStats).toString();
    }

    public Stats xStats() {
        return this.xStats;
    }

    public Stats yStats() {
        return this.yStats;
    }
}
