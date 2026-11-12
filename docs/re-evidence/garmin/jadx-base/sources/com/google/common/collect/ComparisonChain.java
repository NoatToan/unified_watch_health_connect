package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ComparisonChain {
    private static final ComparisonChain ACTIVE = new ComparisonChain() { // from class: com.google.common.collect.ComparisonChain.1
        public ComparisonChain classify(int i14) {
            if (i14 < 0) {
                return ComparisonChain.LESS;
            }
            return i14 > 0 ? ComparisonChain.GREATER : ComparisonChain.ACTIVE;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(Comparable<?> comparable, Comparable<?> comparable2) {
            return classify(comparable.compareTo(comparable2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareFalseFirst(boolean z14, boolean z15) {
            return classify(Boolean.compare(z14, z15));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareTrueFirst(boolean z14, boolean z15) {
            return classify(Boolean.compare(z15, z14));
        }

        @Override // com.google.common.collect.ComparisonChain
        public int result() {
            return 0;
        }

        @Override // com.google.common.collect.ComparisonChain
        public <T> ComparisonChain compare(@ParametricNullness T t7, @ParametricNullness T t14, Comparator<T> comparator) {
            return classify(comparator.compare(t7, t14));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(int i14, int i15) {
            return classify(Integer.compare(i14, i15));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(long j8, long j14) {
            return classify(Long.compare(j8, j14));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(float f14, float f15) {
            return classify(Float.compare(f14, f15));
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(double d14, double d15) {
            return classify(Double.compare(d14, d15));
        }
    };
    private static final ComparisonChain LESS = new InactiveComparisonChain(-1);
    private static final ComparisonChain GREATER = new InactiveComparisonChain(1);

    public static final class InactiveComparisonChain extends ComparisonChain {
        final int result;

        public InactiveComparisonChain(int i14) {
            super();
            this.result = i14;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(double d14, double d15) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(float f14, float f15) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareFalseFirst(boolean z14, boolean z15) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compareTrueFirst(boolean z14, boolean z15) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public int result() {
            return this.result;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(int i14, int i15) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(long j8, long j14) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public ComparisonChain compare(Comparable<?> comparable, Comparable<?> comparable2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public <T> ComparisonChain compare(@ParametricNullness T t7, @ParametricNullness T t14, Comparator<T> comparator) {
            return this;
        }
    }

    public static ComparisonChain start() {
        return ACTIVE;
    }

    public abstract ComparisonChain compare(double d14, double d15);

    public abstract ComparisonChain compare(float f14, float f15);

    public abstract ComparisonChain compare(int i14, int i15);

    public abstract ComparisonChain compare(long j8, long j14);

    @Deprecated
    public final ComparisonChain compare(Boolean bool, Boolean bool2) {
        return compareFalseFirst(bool.booleanValue(), bool2.booleanValue());
    }

    public abstract ComparisonChain compare(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract <T> ComparisonChain compare(@ParametricNullness T t7, @ParametricNullness T t14, Comparator<T> comparator);

    public abstract ComparisonChain compareFalseFirst(boolean z14, boolean z15);

    public abstract ComparisonChain compareTrueFirst(boolean z14, boolean z15);

    public abstract int result();

    private ComparisonChain() {
    }
}
