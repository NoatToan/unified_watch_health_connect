package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtIncompatible
public abstract class LinearTransformation {

    public static final class LinearTransformationBuilder {
        private final double a;
        private final double b;

        public LinearTransformation and(double d, double d2) {
            Preconditions.checkArgument(com.google.common.math.a.d(d) && com.google.common.math.a.d(d2));
            double d3 = this.a;
            if (d != d3) {
                return withSlope((d2 - this.b) / (d - d3));
            }
            Preconditions.checkArgument(d2 != this.b);
            return new d(this.a);
        }

        public LinearTransformation withSlope(double d) {
            Preconditions.checkArgument(!Double.isNaN(d));
            return com.google.common.math.a.d(d) ? new c(d, this.b - (this.a * d)) : new d(this.a);
        }

        private LinearTransformationBuilder(double d, double d2) {
            this.a = d;
            this.b = d2;
        }
    }

    public static final class b extends LinearTransformation {
        public static final b a = new b();

        private b() {
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            return this;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            return Double.NaN;
        }

        public String toString() {
            return "NaN";
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d) {
            return Double.NaN;
        }
    }

    public static LinearTransformation forNaN() {
        return b.a;
    }

    public static LinearTransformation horizontal(double d2) {
        Preconditions.checkArgument(com.google.common.math.a.d(d2));
        return new c(0.0d, d2);
    }

    public static LinearTransformationBuilder mapping(double d2, double d3) {
        Preconditions.checkArgument(com.google.common.math.a.d(d2) && com.google.common.math.a.d(d3));
        return new LinearTransformationBuilder(d2, d3);
    }

    public static LinearTransformation vertical(double d2) {
        Preconditions.checkArgument(com.google.common.math.a.d(d2));
        return new d(d2);
    }

    public abstract LinearTransformation inverse();

    public abstract boolean isHorizontal();

    public abstract boolean isVertical();

    public abstract double slope();

    public abstract double transform(double d2);

    public static final class d extends LinearTransformation {
        public final double a;

        @LazyInit
        public LinearTransformation b;

        public d(double d) {
            this.a = d;
            this.b = null;
        }

        private LinearTransformation a() {
            return new c(0.0d, this.a, this);
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            LinearTransformation linearTransformation = this.b;
            if (linearTransformation != null) {
                return linearTransformation;
            }
            LinearTransformation linearTransformationA = a();
            this.b = linearTransformationA;
            return linearTransformationA;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return true;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            throw new IllegalStateException();
        }

        public String toString() {
            return String.format("x = %g", Double.valueOf(this.a));
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d) {
            throw new IllegalStateException();
        }

        public d(double d, LinearTransformation linearTransformation) {
            this.a = d;
            this.b = linearTransformation;
        }
    }

    public static final class c extends LinearTransformation {
        public final double a;
        public final double b;

        @LazyInit
        public LinearTransformation c;

        public c(double d, double d2) {
            this.a = d;
            this.b = d2;
            this.c = null;
        }

        private LinearTransformation a() {
            double d = this.a;
            return d != 0.0d ? new c(1.0d / d, (this.b * (-1.0d)) / d, this) : new d(this.b, this);
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            LinearTransformation linearTransformation = this.c;
            if (linearTransformation != null) {
                return linearTransformation;
            }
            LinearTransformation linearTransformationA = a();
            this.c = linearTransformationA;
            return linearTransformationA;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return this.a == 0.0d;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            return this.a;
        }

        public String toString() {
            return String.format("y = %g * x + %g", Double.valueOf(this.a), Double.valueOf(this.b));
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d) {
            return (d * this.a) + this.b;
        }

        public c(double d, double d2, LinearTransformation linearTransformation) {
            this.a = d;
            this.b = d2;
            this.c = linearTransformation;
        }
    }
}
