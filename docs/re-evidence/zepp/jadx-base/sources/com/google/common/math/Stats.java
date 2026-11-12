package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtIncompatible
public final class Stats implements Serializable {
    public static final int f = 40;
    private static final long serialVersionUID = 0;
    private final long a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;

    public Stats(long j, double d, double d2, double d3, double d4) {
        this.a = j;
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = d4;
    }

    public static Stats a(ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(byteBuffer);
        Preconditions.checkArgument(byteBuffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        return new Stats(byteBuffer.getLong(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble());
    }

    public static Stats fromByteArray(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        Preconditions.checkArgument(bArr.length == 40, "Expected Stats.BYTES = %s remaining , got %s", 40, bArr.length);
        return a(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
    }

    public static double meanOf(Iterable<? extends Number> iterable) {
        return meanOf(iterable.iterator());
    }

    public static Stats of(Iterable<? extends Number> iterable) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(iterable);
        return statsAccumulator.snapshot();
    }

    public double b() {
        return this.c;
    }

    public void c(ByteBuffer byteBuffer) {
        Preconditions.checkNotNull(byteBuffer);
        Preconditions.checkArgument(byteBuffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        byteBuffer.putLong(this.a).putDouble(this.b).putDouble(this.c).putDouble(this.d).putDouble(this.e);
    }

    public long count() {
        return this.a;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == null || Stats.class != obj.getClass()) {
            return false;
        }
        Stats stats = (Stats) obj;
        return this.a == stats.a && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(stats.b) && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(stats.c) && Double.doubleToLongBits(this.d) == Double.doubleToLongBits(stats.d) && Double.doubleToLongBits(this.e) == Double.doubleToLongBits(stats.e);
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.a), Double.valueOf(this.b), Double.valueOf(this.c), Double.valueOf(this.d), Double.valueOf(this.e));
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

    public double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public double populationVariance() {
        Preconditions.checkState(this.a > 0);
        if (Double.isNaN(this.c)) {
            return Double.NaN;
        }
        if (this.a == 1) {
            return 0.0d;
        }
        return a.b(this.c) / count();
    }

    public double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public double sampleVariance() {
        Preconditions.checkState(this.a > 1);
        if (Double.isNaN(this.c)) {
            return Double.NaN;
        }
        return a.b(this.c) / (this.a - 1);
    }

    public double sum() {
        return this.b * this.a;
    }

    public byte[] toByteArray() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(40).order(ByteOrder.LITTLE_ENDIAN);
        c(byteBufferOrder);
        return byteBufferOrder.array();
    }

    public String toString() {
        return count() > 0 ? MoreObjects.toStringHelper(this).add("count", this.a).add("mean", this.b).add("populationStandardDeviation", populationStandardDeviation()).add("min", this.d).add("max", this.e).toString() : MoreObjects.toStringHelper(this).add("count", this.a).toString();
    }

    public static double meanOf(Iterator<? extends Number> it2) {
        Preconditions.checkArgument(it2.hasNext());
        double dDoubleValue = it2.next().doubleValue();
        long j = 1;
        while (it2.hasNext()) {
            double dDoubleValue2 = it2.next().doubleValue();
            j++;
            dDoubleValue = (Doubles.isFinite(dDoubleValue2) && Doubles.isFinite(dDoubleValue)) ? dDoubleValue + ((dDoubleValue2 - dDoubleValue) / j) : StatsAccumulator.a(dDoubleValue, dDoubleValue2);
        }
        return dDoubleValue;
    }

    public static Stats of(Iterator<? extends Number> it2) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(it2);
        return statsAccumulator.snapshot();
    }

    public static Stats of(double... dArr) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(dArr);
        return statsAccumulator.snapshot();
    }

    public static double meanOf(double... dArr) {
        Preconditions.checkArgument(dArr.length > 0);
        double dA = dArr[0];
        for (int i = 1; i < dArr.length; i++) {
            double d = dArr[i];
            dA = (Doubles.isFinite(d) && Doubles.isFinite(dA)) ? dA + ((d - dA) / ((double) (i + 1))) : StatsAccumulator.a(dA, d);
        }
        return dA;
    }

    public static Stats of(int... iArr) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(iArr);
        return statsAccumulator.snapshot();
    }

    public static Stats of(long... jArr) {
        StatsAccumulator statsAccumulator = new StatsAccumulator();
        statsAccumulator.addAll(jArr);
        return statsAccumulator.snapshot();
    }

    public static double meanOf(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0);
        double dA = iArr[0];
        for (int i = 1; i < iArr.length; i++) {
            double d = iArr[i];
            dA = (Doubles.isFinite(d) && Doubles.isFinite(dA)) ? dA + ((d - dA) / ((double) (i + 1))) : StatsAccumulator.a(dA, d);
        }
        return dA;
    }

    public static double meanOf(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        double dA = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            double d = jArr[i];
            dA = (Doubles.isFinite(d) && Doubles.isFinite(dA)) ? dA + ((d - dA) / ((double) (i + 1))) : StatsAccumulator.a(dA, d);
        }
        return dA;
    }
}
