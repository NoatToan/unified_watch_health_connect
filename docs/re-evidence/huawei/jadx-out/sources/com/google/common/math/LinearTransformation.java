package com.google.common.math;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.LazyInit;
import defpackage.app;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public abstract class LinearTransformation {
    public abstract LinearTransformation inverse();

    public abstract boolean isHorizontal();

    public abstract boolean isVertical();

    public abstract double slope();

    public abstract double transform(double d2);

    public static a mapping(double d2, double d3) {
        Preconditions.checkArgument(app.e(d2) && app.e(d3));
        return new a(d2, d3);
    }

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double f4616b;
        private final double e;

        private a(double d, double d2) {
            this.f4616b = d;
            this.e = d2;
        }
    }

    public static LinearTransformation vertical(double d2) {
        Preconditions.checkArgument(app.e(d2));
        return new b(d2);
    }

    public static LinearTransformation horizontal(double d2) {
        Preconditions.checkArgument(app.e(d2));
        return new c(0.0d, d2);
    }

    public static LinearTransformation forNaN() {
        return d.d;
    }

    static final class c extends LinearTransformation {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final double f4619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final double f4620c;

        @CheckForNull
        @LazyInit
        LinearTransformation e;

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return false;
        }

        c(double d, double d2) {
            this.f4619b = d;
            this.f4620c = d2;
            this.e = null;
        }

        c(double d, double d2, LinearTransformation linearTransformation) {
            this.f4619b = d;
            this.f4620c = d2;
            this.e = linearTransformation;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return this.f4619b == 0.0d;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            return this.f4619b;
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d) {
            return (d * this.f4619b) + this.f4620c;
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            LinearTransformation linearTransformation = this.e;
            if (linearTransformation != null) {
                return linearTransformation;
            }
            LinearTransformation linearTransformationC = c();
            this.e = linearTransformationC;
            return linearTransformationC;
        }

        public String toString() {
            return String.format("y = %g * x + %g", Double.valueOf(this.f4619b), Double.valueOf(this.f4620c));
        }

        private LinearTransformation c() {
            double d = this.f4619b;
            if (d != 0.0d) {
                return new c(1.0d / d, (this.f4620c * (-1.0d)) / d, this);
            }
            return new b(this.f4620c, this);
        }
    }

    static final class b extends LinearTransformation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final double f4617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        @LazyInit
        LinearTransformation f4618b;

        @Override // com.google.common.math.LinearTransformation
        public boolean isHorizontal() {
            return false;
        }

        @Override // com.google.common.math.LinearTransformation
        public boolean isVertical() {
            return true;
        }

        b(double d) {
            this.f4617a = d;
            this.f4618b = null;
        }

        b(double d, LinearTransformation linearTransformation) {
            this.f4617a = d;
            this.f4618b = linearTransformation;
        }

        @Override // com.google.common.math.LinearTransformation
        public double slope() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d) {
            throw new IllegalStateException();
        }

        @Override // com.google.common.math.LinearTransformation
        public LinearTransformation inverse() {
            LinearTransformation linearTransformation = this.f4618b;
            if (linearTransformation != null) {
                return linearTransformation;
            }
            LinearTransformation linearTransformationE = e();
            this.f4618b = linearTransformationE;
            return linearTransformationE;
        }

        public String toString() {
            return String.format("x = %g", Double.valueOf(this.f4617a));
        }

        private LinearTransformation e() {
            return new c(0.0d, this.f4617a, this);
        }
    }

    static final class d extends LinearTransformation {
        static final d d = new d();

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

        @Override // com.google.common.math.LinearTransformation
        public double transform(double d2) {
            return Double.NaN;
        }

        private d() {
        }

        public String toString() {
            return "NaN";
        }
    }
}
