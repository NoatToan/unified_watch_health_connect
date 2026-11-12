package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public abstract class LinearTransformation {

    public static final class LinearTransformationBuilder {

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        private final double f53588x1;

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        private final double f53589y1;

        private LinearTransformationBuilder(double d14, double d15) {
            this.f53588x1 = d14;
            this.f53589y1 = d15;
        }

        public LinearTransformation and(double d14, double d15) {
            Preconditions.checkArgument(DoubleUtils.isFinite(d14) && DoubleUtils.isFinite(d15));
            double d16 = this.f53588x1;
            double d17 = this.f53589y1;
            if (d14 != d16) {
                return withSlope((d15 - d17) / (d14 - d16));
            }
            Preconditions.checkArgument(d15 != d17);
            return new VerticalLinearTransformation(this.f53588x1);
        }

        public LinearTransformation withSlope(double d14) {
            Preconditions.checkArgument(!Double.isNaN(d14));
            return DoubleUtils.isFinite(d14) ? new RegularLinearTransformation(d14, this.f53589y1 - (this.f53588x1 * d14)) : new VerticalLinearTransformation(this.f53588x1);
        }
    }

    public static final class NaNLinearTransformation extends LinearTransformation {
        static final NaNLinearTransformation INSTANCE = new NaNLinearTransformation();

        private NaNLinearTransformation() {
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
        public double transform(double d14) {
            return Double.NaN;
        }
    }

    public static LinearTransformation forNaN() {
        return NaNLinearTransformation.INSTANCE;
    }

    public static LinearTransformation horizontal(double d14) {
        Preconditions.checkArgument(DoubleUtils.isFinite(d14));
        return new RegularLinearTransformation(0.0d, d14);
    }

    public static LinearTransformationBuilder mapping(double d14, double d15) {
        Preconditions.checkArgument(DoubleUtils.isFinite(d14) && DoubleUtils.isFinite(d15));
        return new LinearTransformationBuilder(d14, d15);
    }

    public static LinearTransformation vertical(double d14) {
        Preconditions.checkArgument(DoubleUtils.isFinite(d14));
        return new VerticalLinearTransformation(d14);
    }

    public abstract LinearTransformation inverse();

    public abstract boolean isHorizontal();

    public abstract boolean isVertical();

    public abstract double slope();

    public abstract double transform(double d14);

    public static final class VerticalLinearTransformation extends LinearTransformation {

        @LazyInit
        LinearTransformation inverse;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final double f53590x;

        public VerticalLinearTransformation(double d14) {
            this.f53590x = d14;
            this.inverse = null;
        }

        private LinearTransformation createInverse() {
            return new RegularLinearTransformation(0.0d, this.f53590x, this);
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            LinearTransformation linearTransformation = this.inverse;
            if (linearTransformation != null) {
                return linearTransformation;
            }
            LinearTransformation linearTransformationCreateInverse = createInverse();
            this.inverse = linearTransformationCreateInverse;
            return linearTransformationCreateInverse;
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
            return String.format("x = %g", Double.valueOf(this.f53590x));
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d14) {
            throw new IllegalStateException();
        }

        public VerticalLinearTransformation(double d14, LinearTransformation linearTransformation) {
            this.f53590x = d14;
            this.inverse = linearTransformation;
        }
    }

    public static final class RegularLinearTransformation extends LinearTransformation {

        @LazyInit
        LinearTransformation inverse;
        final double slope;
        final double yIntercept;

        public RegularLinearTransformation(double d14, double d15) {
            this.slope = d14;
            this.yIntercept = d15;
            this.inverse = null;
        }

        private LinearTransformation createInverse() {
            double d14 = this.slope;
            double d15 = this.yIntercept;
            return d14 != 0.0d ? new RegularLinearTransformation(1.0d / d14, (d15 * (-1.0d)) / d14, this) : new VerticalLinearTransformation(d15, this);
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            LinearTransformation linearTransformation = this.inverse;
            if (linearTransformation != null) {
                return linearTransformation;
            }
            LinearTransformation linearTransformationCreateInverse = createInverse();
            this.inverse = linearTransformationCreateInverse;
            return linearTransformationCreateInverse;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return this.slope == 0.0d;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            return this.slope;
        }

        public String toString() {
            return String.format("y = %g * x + %g", Double.valueOf(this.slope), Double.valueOf(this.yIntercept));
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d14) {
            return (d14 * this.slope) + this.yIntercept;
        }

        public RegularLinearTransformation(double d14, double d15, LinearTransformation linearTransformation) {
            this.slope = d14;
            this.yIntercept = d15;
            this.inverse = linearTransformation;
        }
    }
}
