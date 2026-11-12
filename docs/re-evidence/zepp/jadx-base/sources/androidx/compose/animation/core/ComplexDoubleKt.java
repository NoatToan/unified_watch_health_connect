package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a,\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0000\u001a\u0015\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0080\n\u001a\u0015\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0080\n\u001a\u0015\u0010\f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0080\n¨\u0006\r"}, d2 = {"", "a", "b", "c", "Lkotlin/Pair;", "Landroidx/compose/animation/core/ComplexDouble;", "complexQuadraticFormula", "num", "complexSqrt", "other", "plus", "minus", "times", "animation-core_release"}, k = 2, mv = {1, 5, 1})
public final class ComplexDoubleKt {
    @NotNull
    public static final Pair<ComplexDouble, ComplexDouble> complexQuadraticFormula(double d, double d2, double d3) {
        double d4 = -d2;
        double d5 = (d2 * d2) - ((4.0d * d) * d3);
        ComplexDouble complexDoubleComplexSqrt = complexSqrt(d5);
        complexDoubleComplexSqrt._real += d4;
        double d6 = d * 2.0d;
        complexDoubleComplexSqrt._real /= d6;
        complexDoubleComplexSqrt._imaginary /= d6;
        ComplexDouble complexDoubleComplexSqrt2 = complexSqrt(d5);
        double d7 = -1;
        complexDoubleComplexSqrt2._real *= d7;
        complexDoubleComplexSqrt2._imaginary *= d7;
        complexDoubleComplexSqrt2._real += d4;
        complexDoubleComplexSqrt2._real /= d6;
        complexDoubleComplexSqrt2._imaginary /= d6;
        return TuplesKt.to(complexDoubleComplexSqrt, complexDoubleComplexSqrt2);
    }

    @NotNull
    public static final ComplexDouble complexSqrt(double d) {
        return d < 0.0d ? new ComplexDouble(0.0d, Math.sqrt(Math.abs(d))) : new ComplexDouble(Math.sqrt(d), 0.0d);
    }

    @NotNull
    public static final ComplexDouble minus(double d, @NotNull ComplexDouble complexDouble) {
        double d2 = -1;
        complexDouble._real *= d2;
        complexDouble._imaginary *= d2;
        complexDouble._real += d;
        return complexDouble;
    }

    @NotNull
    public static final ComplexDouble plus(double d, @NotNull ComplexDouble complexDouble) {
        complexDouble._real += d;
        return complexDouble;
    }

    @NotNull
    public static final ComplexDouble times(double d, @NotNull ComplexDouble complexDouble) {
        complexDouble._real *= d;
        complexDouble._imaginary *= d;
        return complexDouble;
    }
}
