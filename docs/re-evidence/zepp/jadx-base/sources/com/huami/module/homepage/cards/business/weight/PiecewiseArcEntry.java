package com.huami.module.homepage.cards.business.weight;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b)\u0010*J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J=\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/huami/module/homepage/cards/business/weight/PiecewiseArcEntry;", "", "", "component1", "component2", "", "component3", "Lkotlin/Pair;", "", "component4", "maxValue", "value", "showIndicator", StepsInfo.KEY_STAGE, "copy", "", "toString", "hashCode", "other", "equals", "a", "F", "getMaxValue", "()F", "setMaxValue", "(F)V", "b", "getValue", "setValue", "c", "Z", "getShowIndicator", "()Z", "setShowIndicator", "(Z)V", GoogleApiAvailabilityLight.a, "Lkotlin/Pair;", "getStage", "()Lkotlin/Pair;", "setStage", "(Lkotlin/Pair;)V", "<init>", "(FFZLkotlin/Pair;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PiecewiseArcEntry {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private float maxValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private float value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private boolean showIndicator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private Pair<Integer, Integer> stage;

    public PiecewiseArcEntry() {
        this(0.0f, 0.0f, false, null, 15, null);
    }

    public PiecewiseArcEntry(float f, float f2, boolean z, @NotNull Pair<Integer, Integer> pair) {
        this.maxValue = f;
        this.value = f2;
        this.showIndicator = z;
        this.stage = pair;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PiecewiseArcEntry copy$default(PiecewiseArcEntry piecewiseArcEntry, float f, float f2, boolean z, Pair pair, int i, Object obj) {
        if ((i & 1) != 0) {
            f = piecewiseArcEntry.maxValue;
        }
        if ((i & 2) != 0) {
            f2 = piecewiseArcEntry.value;
        }
        if ((i & 4) != 0) {
            z = piecewiseArcEntry.showIndicator;
        }
        if ((i & 8) != 0) {
            pair = piecewiseArcEntry.stage;
        }
        return piecewiseArcEntry.copy(f, f2, z, pair);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowIndicator() {
        return this.showIndicator;
    }

    @NotNull
    public final Pair<Integer, Integer> component4() {
        return this.stage;
    }

    @NotNull
    public final PiecewiseArcEntry copy(float maxValue, float value, boolean showIndicator, @NotNull Pair<Integer, Integer> stage) {
        return new PiecewiseArcEntry(maxValue, value, showIndicator, stage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PiecewiseArcEntry)) {
            return false;
        }
        PiecewiseArcEntry piecewiseArcEntry = (PiecewiseArcEntry) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.maxValue), (Object) Float.valueOf(piecewiseArcEntry.maxValue)) && Intrinsics.areEqual((Object) Float.valueOf(this.value), (Object) Float.valueOf(piecewiseArcEntry.value)) && this.showIndicator == piecewiseArcEntry.showIndicator && Intrinsics.areEqual(this.stage, piecewiseArcEntry.stage);
    }

    public final float getMaxValue() {
        return this.maxValue;
    }

    public final boolean getShowIndicator() {
        return this.showIndicator;
    }

    @NotNull
    public final Pair<Integer, Integer> getStage() {
        return this.stage;
    }

    public final float getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iFloatToIntBits = ((Float.floatToIntBits(this.maxValue) * 31) + Float.floatToIntBits(this.value)) * 31;
        boolean z = this.showIndicator;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iFloatToIntBits + r1) * 31) + this.stage.hashCode();
    }

    public final void setMaxValue(float f) {
        this.maxValue = f;
    }

    public final void setShowIndicator(boolean z) {
        this.showIndicator = z;
    }

    public final void setStage(@NotNull Pair<Integer, Integer> pair) {
        this.stage = pair;
    }

    public final void setValue(float f) {
        this.value = f;
    }

    @NotNull
    public String toString() {
        return "PiecewiseArcEntry(maxValue=" + this.maxValue + ", value=" + this.value + ", showIndicator=" + this.showIndicator + ", stage=" + this.stage + ")";
    }

    public /* synthetic */ PiecewiseArcEntry(float f, float f2, boolean z, Pair pair, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 8.0f : f, (i & 2) != 0 ? 1.0f : f2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? TuplesKt.to(4, 1) : pair);
    }
}
