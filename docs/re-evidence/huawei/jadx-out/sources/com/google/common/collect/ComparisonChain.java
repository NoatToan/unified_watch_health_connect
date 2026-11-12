package com.google.common.collect;

import com.google.common.primitives.Booleans;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ComparisonChain {
    private static final ComparisonChain ACTIVE = new ComparisonChain() { // from class: com.google.common.collect.ComparisonChain.4
        @Override // com.google.common.collect.ComparisonChain
        public int result() {
            return 0;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(Comparable<?> comparable, Comparable<?> comparable2) {
            return e(comparable.compareTo(comparable2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public <T> ComparisonChain compare(@ParametricNullness T t, @ParametricNullness T t2, Comparator<T> comparator) {
            return e(comparator.compare(t, t2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(int i, int i2) {
            return e(Ints.d(i, i2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(long j, long j2) {
            return e(Longs.e(j, j2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(float f, float f2) {
            return e(Float.compare(f, f2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(double d, double d2) {
            return e(Double.compare(d, d2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareTrueFirst(boolean z, boolean z2) {
            return e(Booleans.a(z2, z));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareFalseFirst(boolean z, boolean z2) {
            return e(Booleans.a(z, z2));
        }

        ComparisonChain e(int i) {
            if (i < 0) {
                return ComparisonChain.LESS;
            }
            return i > 0 ? ComparisonChain.GREATER : ComparisonChain.ACTIVE;
        }
    };
    private static final ComparisonChain LESS = new c(-1);
    private static final ComparisonChain GREATER = new c(1);

    public abstract ComparisonChain compare(double d, double d2);

    public abstract ComparisonChain compare(float f, float f2);

    public abstract ComparisonChain compare(int i, int i2);

    public abstract ComparisonChain compare(long j, long j2);

    public abstract ComparisonChain compare(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract <T> ComparisonChain compare(@ParametricNullness T t, @ParametricNullness T t2, Comparator<T> comparator);

    public abstract ComparisonChain compareFalseFirst(boolean z, boolean z2);

    public abstract ComparisonChain compareTrueFirst(boolean z, boolean z2);

    public abstract int result();

    private ComparisonChain() {
    }

    public static ComparisonChain start() {
        return ACTIVE;
    }

    static final class c extends ComparisonChain {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f4314b;

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(double d, double d2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(float f, float f2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(int i, int i2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(long j, long j2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(Comparable<?> comparable, Comparable<?> comparable2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public <T> ComparisonChain compare(@ParametricNullness T t, @ParametricNullness T t2, Comparator<T> comparator) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareFalseFirst(boolean z, boolean z2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareTrueFirst(boolean z, boolean z2) {
            return this;
        }

        c(int i) {
            super();
            this.f4314b = i;
        }

        @Override // com.google.common.collect.ComparisonChain
        public int result() {
            return this.f4314b;
        }
    }

    @Deprecated
    public final ComparisonChain compare(Boolean bool, Boolean bool2) {
        return compareFalseFirst(bool.booleanValue(), bool2.booleanValue());
    }
}
