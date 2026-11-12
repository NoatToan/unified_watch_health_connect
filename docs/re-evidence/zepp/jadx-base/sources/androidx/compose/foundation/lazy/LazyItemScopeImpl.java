package androidx.compose.foundation.lazy;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.xiaomi.market.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u001a\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0014\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0014\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u0019\u0010\r\u001a\u00020\nHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\nHÆ\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u000f\u001a\u00020\n8\u0006@\u0006ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001f\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b!\u0010\"R\u001f\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b#\u0010\"\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Landroidx/compose/ui/Modifier;", "", "fraction", "fillParentMaxSize", "fillParentMaxWidth", "fillParentMaxHeight", "Landroidx/compose/ui/unit/Density;", "component1", "Landroidx/compose/ui/unit/Constraints;", "component2-msEJaDk", "()J", "component2", Constants.JSON_DENSITY, "constraints", "copy-0kLqBqw", "(Landroidx/compose/ui/unit/Density;J)Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "J", "getConstraints-msEJaDk", "Landroidx/compose/ui/unit/Dp;", "maxWidth", "F", "maxHeight", "<init>", "(Landroidx/compose/ui/unit/Density;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, k = 1, mv = {1, 5, 1})
final /* data */ class LazyItemScopeImpl implements LazyItemScope {
    private final long constraints;

    @NotNull
    private final Density density;
    private final float maxHeight;
    private final float maxWidth;

    private LazyItemScopeImpl(Density density, long j) {
        this.density = density;
        this.constraints = j;
        this.maxWidth = density.mo191toDpu2uoSUM(Constraints.m2935getMaxWidthimpl(m352getConstraintsmsEJaDk()));
        this.maxHeight = density.mo191toDpu2uoSUM(Constraints.m2934getMaxHeightimpl(m352getConstraintsmsEJaDk()));
    }

    public /* synthetic */ LazyItemScopeImpl(Density density, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(density, j);
    }

    /* JADX INFO: renamed from: copy-0kLqBqw$default, reason: not valid java name */
    public static /* synthetic */ LazyItemScopeImpl m349copy0kLqBqw$default(LazyItemScopeImpl lazyItemScopeImpl, Density density, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            density = lazyItemScopeImpl.density;
        }
        if ((i & 2) != 0) {
            j = lazyItemScopeImpl.constraints;
        }
        return lazyItemScopeImpl.m351copy0kLqBqw(density, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: component2-msEJaDk, reason: not valid java name and from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-0kLqBqw, reason: not valid java name */
    public final LazyItemScopeImpl m351copy0kLqBqw(@NotNull Density density, long constraints) {
        return new LazyItemScopeImpl(density, constraints, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LazyItemScopeImpl)) {
            return false;
        }
        LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) other;
        return Intrinsics.areEqual(this.density, lazyItemScopeImpl.density) && Constraints.m2928equalsimpl0(this.constraints, lazyItemScopeImpl.constraints);
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    @NotNull
    public Modifier fillParentMaxHeight(@NotNull Modifier modifier, float f) {
        return SizeKt.m309height3ABfNKs(modifier, Dp.m2965constructorimpl(this.maxHeight * f));
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    @NotNull
    public Modifier fillParentMaxSize(@NotNull Modifier modifier, float f) {
        return SizeKt.m323sizeVpY3zN4(modifier, Dp.m2965constructorimpl(this.maxWidth * f), Dp.m2965constructorimpl(this.maxHeight * f));
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    @NotNull
    public Modifier fillParentMaxWidth(@NotNull Modifier modifier, float f) {
        return SizeKt.m326width3ABfNKs(modifier, Dp.m2965constructorimpl(this.maxWidth * f));
    }

    /* JADX INFO: renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m352getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @NotNull
    public final Density getDensity() {
        return this.density;
    }

    public int hashCode() {
        return (this.density.hashCode() * 31) + Constraints.m2938hashCodeimpl(this.constraints);
    }

    @NotNull
    public String toString() {
        return "LazyItemScopeImpl(density=" + this.density + ", constraints=" + ((Object) Constraints.m2940toStringimpl(this.constraints)) + ')';
    }
}
