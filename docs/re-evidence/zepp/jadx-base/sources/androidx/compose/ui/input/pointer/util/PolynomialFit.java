package androidx.compose.ui.input.pointer.util;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0003HÆ\u0003J#\u0010\b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/input/pointer/util/PolynomialFit;", "", "", "", "component1", "component2", "coefficients", "confidence", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/util/List;", "getCoefficients", "()Ljava/util/List;", "F", "getConfidence", "()F", "<init>", "(Ljava/util/List;F)V", "ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PolynomialFit {

    @NotNull
    private final List<Float> coefficients;
    private final float confidence;

    public PolynomialFit(@NotNull List<Float> list, float f) {
        this.coefficients = list;
        this.confidence = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PolynomialFit copy$default(PolynomialFit polynomialFit, List list, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            list = polynomialFit.coefficients;
        }
        if ((i & 2) != 0) {
            f = polynomialFit.confidence;
        }
        return polynomialFit.copy(list, f);
    }

    @NotNull
    public final List<Float> component1() {
        return this.coefficients;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getConfidence() {
        return this.confidence;
    }

    @NotNull
    public final PolynomialFit copy(@NotNull List<Float> coefficients, float confidence) {
        return new PolynomialFit(coefficients, confidence);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PolynomialFit)) {
            return false;
        }
        PolynomialFit polynomialFit = (PolynomialFit) other;
        return Intrinsics.areEqual(this.coefficients, polynomialFit.coefficients) && Intrinsics.areEqual((Object) Float.valueOf(this.confidence), (Object) Float.valueOf(polynomialFit.confidence));
    }

    @NotNull
    public final List<Float> getCoefficients() {
        return this.coefficients;
    }

    public final float getConfidence() {
        return this.confidence;
    }

    public int hashCode() {
        return (this.coefficients.hashCode() * 31) + Float.floatToIntBits(this.confidence);
    }

    @NotNull
    public String toString() {
        return "PolynomialFit(coefficients=" + this.coefficients + ", confidence=" + this.confidence + ')';
    }
}
