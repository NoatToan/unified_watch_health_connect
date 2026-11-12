package com.xiaomi.fit.fitness.parser.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/data/DivingOutInPosition;", "", "divingIn", "Lcom/xiaomi/fit/fitness/parser/data/DivingPosition;", "divingOut", "<init>", "(Lcom/xiaomi/fit/fitness/parser/data/DivingPosition;Lcom/xiaomi/fit/fitness/parser/data/DivingPosition;)V", "getDivingIn", "()Lcom/xiaomi/fit/fitness/parser/data/DivingPosition;", "setDivingIn", "(Lcom/xiaomi/fit/fitness/parser/data/DivingPosition;)V", "getDivingOut", "setDivingOut", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DivingOutInPosition {

    @SerializedName("in")
    @NotNull
    private DivingPosition divingIn;

    @SerializedName("out")
    @NotNull
    private DivingPosition divingOut;

    public DivingOutInPosition(@NotNull DivingPosition divingIn, @NotNull DivingPosition divingOut) {
        Intrinsics.checkNotNullParameter(divingIn, "divingIn");
        Intrinsics.checkNotNullParameter(divingOut, "divingOut");
        this.divingIn = divingIn;
        this.divingOut = divingOut;
    }

    public static /* synthetic */ DivingOutInPosition copy$default(DivingOutInPosition divingOutInPosition, DivingPosition divingPosition, DivingPosition divingPosition2, int i, Object obj) {
        if ((i & 1) != 0) {
            divingPosition = divingOutInPosition.divingIn;
        }
        if ((i & 2) != 0) {
            divingPosition2 = divingOutInPosition.divingOut;
        }
        return divingOutInPosition.copy(divingPosition, divingPosition2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DivingPosition getDivingIn() {
        return this.divingIn;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DivingPosition getDivingOut() {
        return this.divingOut;
    }

    @NotNull
    public final DivingOutInPosition copy(@NotNull DivingPosition divingIn, @NotNull DivingPosition divingOut) {
        Intrinsics.checkNotNullParameter(divingIn, "divingIn");
        Intrinsics.checkNotNullParameter(divingOut, "divingOut");
        return new DivingOutInPosition(divingIn, divingOut);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DivingOutInPosition)) {
            return false;
        }
        DivingOutInPosition divingOutInPosition = (DivingOutInPosition) other;
        return Intrinsics.areEqual(this.divingIn, divingOutInPosition.divingIn) && Intrinsics.areEqual(this.divingOut, divingOutInPosition.divingOut);
    }

    @NotNull
    public final DivingPosition getDivingIn() {
        return this.divingIn;
    }

    @NotNull
    public final DivingPosition getDivingOut() {
        return this.divingOut;
    }

    public int hashCode() {
        return (this.divingIn.hashCode() * 31) + this.divingOut.hashCode();
    }

    public final void setDivingIn(@NotNull DivingPosition divingPosition) {
        Intrinsics.checkNotNullParameter(divingPosition, "<set-?>");
        this.divingIn = divingPosition;
    }

    public final void setDivingOut(@NotNull DivingPosition divingPosition) {
        Intrinsics.checkNotNullParameter(divingPosition, "<set-?>");
        this.divingOut = divingPosition;
    }

    @NotNull
    public String toString() {
        return "DivingOutInPosition(divingIn=" + this.divingIn + ", divingOut=" + this.divingOut + ")";
    }
}
