package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtIncompatible
public final class PairedStats implements Serializable {
    private static final int d = 88;
    private static final long serialVersionUID = 0;
    private final Stats a;
    private final Stats b;
    private final double c;

    public PairedStats(Stats stats, Stats stats2, double d2) {
        this.a = stats;
        this.b = stats2;
        this.c = d2;
    }

    private static double a(double d2) {
        if (d2 >= 1.0d) {
            return 1.0d;
        }
        if (d2 <= -1.0d) {
            return -1.0d;
        }
        return d2;
    }

    private static double b(double d2) {
        if (d2 > 0.0d) {
            return d2;
        }
        return Double.MIN_VALUE;
    }

    public static PairedStats fromByteArray(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkArgument(bArr.length == 88, "Expected PairedStats.BYTES = %s, got %s", 88, bArr.length);
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        return new PairedStats(Stats.a(byteBufferOrder), Stats.a(byteBufferOrder), byteBufferOrder.getDouble());
    }

    public double c() {
        return this.c;
    }

    public long count() {
        return this.a.count();
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == null || PairedStats.class != obj.getClass()) {
            return false;
        }
        PairedStats pairedStats = (PairedStats) obj;
        return this.a.equals(pairedStats.a) && this.b.equals(pairedStats.b) && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(pairedStats.c);
    }

    public int hashCode() {
        return Objects.hashCode(this.a, this.b, Double.valueOf(this.c));
    }

    public LinearTransformation leastSquaresFit() {
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

    public double pearsonsCorrelationCoefficient() {
        Preconditions.checkState(count() > 1);
        if (Double.isNaN(this.c)) {
            return Double.NaN;
        }
        double dB = xStats().b();
        double dB2 = yStats().b();
        Preconditions.checkState(dB > 0.0d);
        Preconditions.checkState(dB2 > 0.0d);
        return a(this.c / Math.sqrt(b(dB * dB2)));
    }

    public double populationCovariance() {
        Preconditions.checkState(count() != 0);
        return this.c / count();
    }

    public double sampleCovariance() {
        Preconditions.checkState(count() > 1);
        return this.c / (count() - 1);
    }

    public byte[] toByteArray() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(88).order(ByteOrder.LITTLE_ENDIAN);
        this.a.c(byteBufferOrder);
        this.b.c(byteBufferOrder);
        byteBufferOrder.putDouble(this.c);
        return byteBufferOrder.array();
    }

    public String toString() {
        return count() > 0 ? MoreObjects.toStringHelper(this).add("xStats", this.a).add("yStats", this.b).add("populationCovariance", populationCovariance()).toString() : MoreObjects.toStringHelper(this).add("xStats", this.a).add("yStats", this.b).toString();
    }

    public Stats xStats() {
        return this.a;
    }

    public Stats yStats() {
        return this.b;
    }
}
