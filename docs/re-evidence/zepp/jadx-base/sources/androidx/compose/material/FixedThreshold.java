package androidx.compose.material;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u000b\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u0005\u001a\u00020\u0002HÂ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\n\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J \u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u001f\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/material/FixedThreshold;", "Landroidx/compose/material/ThresholdConfig;", "Landroidx/compose/ui/unit/Dp;", "component1-D9Ej5fM", "()F", "component1", "Landroidx/compose/ui/unit/Density;", "", "fromValue", "toValue", "computeThreshold", "offset", "copy-0680j_4", "(F)Landroidx/compose/material/FixedThreshold;", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "F", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalMaterialApi
public final /* data */ class FixedThreshold implements ThresholdConfig {
    private final float offset;

    private FixedThreshold(float f) {
        this.offset = f;
    }

    public /* synthetic */ FixedThreshold(float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    private final float getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: copy-0680j_4$default, reason: not valid java name */
    public static /* synthetic */ FixedThreshold m711copy0680j_4$default(FixedThreshold fixedThreshold, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = fixedThreshold.offset;
        }
        return fixedThreshold.m712copy0680j_4(f);
    }

    @Override // androidx.compose.material.ThresholdConfig
    public float computeThreshold(@NotNull Density density, float f, float f2) {
        return f + (density.mo193toPx0680j_4(this.offset) * Math.signum(f2 - f));
    }

    @NotNull
    /* JADX INFO: renamed from: copy-0680j_4, reason: not valid java name */
    public final FixedThreshold m712copy0680j_4(float offset) {
        return new FixedThreshold(offset, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FixedThreshold) && Dp.m2970equalsimpl0(this.offset, ((FixedThreshold) other).offset);
    }

    public int hashCode() {
        return Dp.m2971hashCodeimpl(this.offset);
    }

    @NotNull
    public String toString() {
        return "FixedThreshold(offset=" + ((Object) Dp.m2976toStringimpl(this.offset)) + ')';
    }
}
