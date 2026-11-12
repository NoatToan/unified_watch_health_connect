package androidx.compose.animation.core;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import defpackage.dz;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÂ\u0003J\u0011\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\u0086\nJ\u0011\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0086\nJ\u0011\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\u0086\nJ\u0011\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0086\nJ\u0011\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\u0086\nJ\u0011\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000H\u0086\nJ\t\u0010\t\u001a\u00020\u0000H\u0086\nJ\u0011\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\u0086\nJ\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0013\u0010\u0017\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0019\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/core/ComplexDouble;", "", "", "component1", "component2", "other", "plus", "minus", "times", "unaryMinus", b.q, "_real", "_imaginary", "copy", "", "toString", "", "hashCode", "", "equals", LogUtil.D, "getReal", "()D", "real", "getImaginary", "imaginary", "<init>", "(DD)V", "animation-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ComplexDouble {
    private double _imaginary;
    private double _real;

    public ComplexDouble(double d, double d2) {
        this._real = d;
        this._imaginary = d2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final double get_real() {
        return this._real;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final double get_imaginary() {
        return this._imaginary;
    }

    public static /* synthetic */ ComplexDouble copy$default(ComplexDouble complexDouble, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = complexDouble._real;
        }
        if ((i & 2) != 0) {
            d2 = complexDouble._imaginary;
        }
        return complexDouble.copy(d, d2);
    }

    @NotNull
    public final ComplexDouble copy(double _real, double _imaginary) {
        return new ComplexDouble(_real, _imaginary);
    }

    @NotNull
    public final ComplexDouble div(double other) {
        this._real /= other;
        this._imaginary /= other;
        return this;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComplexDouble)) {
            return false;
        }
        ComplexDouble complexDouble = (ComplexDouble) other;
        return Intrinsics.areEqual((Object) Double.valueOf(this._real), (Object) Double.valueOf(complexDouble._real)) && Intrinsics.areEqual((Object) Double.valueOf(this._imaginary), (Object) Double.valueOf(complexDouble._imaginary));
    }

    public final double getImaginary() {
        return this._imaginary;
    }

    public final double getReal() {
        return this._real;
    }

    public int hashCode() {
        return (dz.a(this._real) * 31) + dz.a(this._imaginary);
    }

    @NotNull
    public final ComplexDouble minus(double other) {
        this._real += -other;
        return this;
    }

    @NotNull
    public final ComplexDouble plus(double other) {
        this._real += other;
        return this;
    }

    @NotNull
    public final ComplexDouble times(double other) {
        this._real *= other;
        this._imaginary *= other;
        return this;
    }

    @NotNull
    public String toString() {
        return "ComplexDouble(_real=" + this._real + ", _imaginary=" + this._imaginary + ')';
    }

    @NotNull
    public final ComplexDouble unaryMinus() {
        double d = -1;
        this._real *= d;
        this._imaginary *= d;
        return this;
    }

    @NotNull
    public final ComplexDouble minus(@NotNull ComplexDouble other) {
        double d = -1;
        other._real *= d;
        other._imaginary *= d;
        this._real += other.getReal();
        this._imaginary += other.getImaginary();
        return this;
    }

    @NotNull
    public final ComplexDouble plus(@NotNull ComplexDouble other) {
        this._real += other.getReal();
        this._imaginary += other.getImaginary();
        return this;
    }

    @NotNull
    public final ComplexDouble times(@NotNull ComplexDouble other) {
        this._real = (getReal() * other.getReal()) - (getImaginary() * other.getImaginary());
        this._imaginary = (getReal() * other.getImaginary()) + (other.getReal() * getImaginary());
        return this;
    }
}
