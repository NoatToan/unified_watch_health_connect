package com.google.accompanist.insets;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.xiaomi.market.sdk.Constants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Stable
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b(\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b=\u0010>J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\tR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R+\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR+\u0010#\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR+\u0010'\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR+\u0010+\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR4\u00100\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00048F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0012\n\u0004\b,\u0010\u001a\u001a\u0004\b-\u0010\t\"\u0004\b.\u0010/R4\u00104\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00048F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0012\n\u0004\b1\u0010\u001a\u001a\u0004\b2\u0010\t\"\u0004\b3\u0010/R4\u00108\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00048F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0012\n\u0004\b5\u0010\u001a\u001a\u0004\b6\u0010\t\"\u0004\b7\u0010/R4\u0010<\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00048F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0012\n\u0004\b9\u0010\u001a\u001a\u0004\b:\u0010\t\"\u0004\b;\u0010/\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006?"}, d2 = {"Lcom/google/accompanist/insets/InsetsPaddingValues;", "Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Dp;", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateLeftPadding", "calculateTopPadding-D9Ej5fM", "()F", "calculateTopPadding", "calculateRightPadding-u2uoSUM", "calculateRightPadding", "calculateBottomPadding-D9Ej5fM", "calculateBottomPadding", "Lcom/google/accompanist/insets/Insets;", "a", "Lcom/google/accompanist/insets/Insets;", "insets", "Landroidx/compose/ui/unit/Density;", "b", "Landroidx/compose/ui/unit/Density;", Constants.JSON_DENSITY, "", "<set-?>", "c", "Landroidx/compose/runtime/MutableState;", "getApplyStart", "()Z", "setApplyStart", "(Z)V", "applyStart", GoogleApiAvailabilityLight.a, "getApplyTop", "setApplyTop", "applyTop", "e", "getApplyEnd", "setApplyEnd", "applyEnd", "f", "getApplyBottom", "setApplyBottom", "applyBottom", "g", "getAdditionalStart-D9Ej5fM", "setAdditionalStart-0680j_4", "(F)V", "additionalStart", "h", "getAdditionalTop-D9Ej5fM", "setAdditionalTop-0680j_4", "additionalTop", "i", "getAdditionalEnd-D9Ej5fM", "setAdditionalEnd-0680j_4", "additionalEnd", z.j, "getAdditionalBottom-D9Ej5fM", "setAdditionalBottom-0680j_4", "additionalBottom", "<init>", "(Lcom/google/accompanist/insets/Insets;Landroidx/compose/ui/unit/Density;)V", "insets_release"}, k = 1, mv = {1, 5, 1})
public final class InsetsPaddingValues implements PaddingValues {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Insets insets;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Density density;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableState applyStart;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableState applyTop;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableState applyEnd;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableState applyBottom;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableState additionalStart;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableState additionalTop;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableState additionalEnd;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final MutableState additionalBottom;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public InsetsPaddingValues(@NotNull Insets insets, @NotNull Density density) {
        this.insets = insets;
        this.density = density;
        Boolean bool = Boolean.FALSE;
        this.applyStart = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.applyTop = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.applyEnd = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.applyBottom = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        float f = 0;
        this.additionalStart = SnapshotStateKt.mutableStateOf$default(Dp.m2963boximpl(Dp.m2965constructorimpl(f)), null, 2, null);
        this.additionalTop = SnapshotStateKt.mutableStateOf$default(Dp.m2963boximpl(Dp.m2965constructorimpl(f)), null, 2, null);
        this.additionalEnd = SnapshotStateKt.mutableStateOf$default(Dp.m2963boximpl(Dp.m2965constructorimpl(f)), null, 2, null);
        this.additionalBottom = SnapshotStateKt.mutableStateOf$default(Dp.m2963boximpl(Dp.m2965constructorimpl(f)), null, 2, null);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM */
    public float getBottom() {
        return Dp.m2965constructorimpl(m3300getAdditionalBottomD9Ej5fM() + (getApplyBottom() ? this.density.mo191toDpu2uoSUM(this.insets.getBottom()) : Dp.m2965constructorimpl(0)));
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM */
    public float mo291calculateLeftPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i == 1) {
            return Dp.m2965constructorimpl(m3302getAdditionalStartD9Ej5fM() + (getApplyStart() ? this.density.mo191toDpu2uoSUM(this.insets.getLeft()) : Dp.m2965constructorimpl(0)));
        }
        if (i == 2) {
            return Dp.m2965constructorimpl(m3301getAdditionalEndD9Ej5fM() + (getApplyEnd() ? this.density.mo191toDpu2uoSUM(this.insets.getLeft()) : Dp.m2965constructorimpl(0)));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM */
    public float mo292calculateRightPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection) {
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i == 1) {
            return Dp.m2965constructorimpl(m3301getAdditionalEndD9Ej5fM() + (getApplyEnd() ? this.density.mo191toDpu2uoSUM(this.insets.getRight()) : Dp.m2965constructorimpl(0)));
        }
        if (i == 2) {
            return Dp.m2965constructorimpl(m3302getAdditionalStartD9Ej5fM() + (getApplyStart() ? this.density.mo191toDpu2uoSUM(this.insets.getRight()) : Dp.m2965constructorimpl(0)));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM */
    public float getTop() {
        return Dp.m2965constructorimpl(m3303getAdditionalTopD9Ej5fM() + (getApplyTop() ? this.density.mo191toDpu2uoSUM(this.insets.getTop()) : Dp.m2965constructorimpl(0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getAdditionalBottom-D9Ej5fM, reason: not valid java name */
    public final float m3300getAdditionalBottomD9Ej5fM() {
        return ((Dp) this.additionalBottom.getValue()).m2979unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getAdditionalEnd-D9Ej5fM, reason: not valid java name */
    public final float m3301getAdditionalEndD9Ej5fM() {
        return ((Dp) this.additionalEnd.getValue()).m2979unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getAdditionalStart-D9Ej5fM, reason: not valid java name */
    public final float m3302getAdditionalStartD9Ej5fM() {
        return ((Dp) this.additionalStart.getValue()).m2979unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getAdditionalTop-D9Ej5fM, reason: not valid java name */
    public final float m3303getAdditionalTopD9Ej5fM() {
        return ((Dp) this.additionalTop.getValue()).m2979unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getApplyBottom() {
        return ((Boolean) this.applyBottom.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getApplyEnd() {
        return ((Boolean) this.applyEnd.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getApplyStart() {
        return ((Boolean) this.applyStart.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getApplyTop() {
        return ((Boolean) this.applyTop.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: setAdditionalBottom-0680j_4, reason: not valid java name */
    public final void m3304setAdditionalBottom0680j_4(float f) {
        this.additionalBottom.setValue(Dp.m2963boximpl(f));
    }

    /* JADX INFO: renamed from: setAdditionalEnd-0680j_4, reason: not valid java name */
    public final void m3305setAdditionalEnd0680j_4(float f) {
        this.additionalEnd.setValue(Dp.m2963boximpl(f));
    }

    /* JADX INFO: renamed from: setAdditionalStart-0680j_4, reason: not valid java name */
    public final void m3306setAdditionalStart0680j_4(float f) {
        this.additionalStart.setValue(Dp.m2963boximpl(f));
    }

    /* JADX INFO: renamed from: setAdditionalTop-0680j_4, reason: not valid java name */
    public final void m3307setAdditionalTop0680j_4(float f) {
        this.additionalTop.setValue(Dp.m2963boximpl(f));
    }

    public final void setApplyBottom(boolean z) {
        this.applyBottom.setValue(Boolean.valueOf(z));
    }

    public final void setApplyEnd(boolean z) {
        this.applyEnd.setValue(Boolean.valueOf(z));
    }

    public final void setApplyStart(boolean z) {
        this.applyStart.setValue(Boolean.valueOf(z));
    }

    public final void setApplyTop(boolean z) {
        this.applyTop.setValue(Boolean.valueOf(z));
    }
}
