package com.xiaomi.fitness.sport_eco.view.environmental.view;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ2\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/environmental/view/EcoProgressModel;", "", "percent", "", "forwardColor", "", "backwardColor", "<init>", "(Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getPercent", "()Ljava/lang/Float;", "setPercent", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getForwardColor", "()Ljava/lang/Integer;", "setForwardColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getBackwardColor", "setBackwardColor", "component1", "component2", "component3", "copy", "(Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/xiaomi/fitness/sport_eco/view/environmental/view/EcoProgressModel;", "equals", "", "other", "hashCode", "toString", "", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EcoProgressModel {

    @Nullable
    private Integer backwardColor;

    @Nullable
    private Integer forwardColor;

    @Nullable
    private Float percent;

    public EcoProgressModel() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ EcoProgressModel copy$default(EcoProgressModel ecoProgressModel, Float f, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = ecoProgressModel.percent;
        }
        if ((i & 2) != 0) {
            num = ecoProgressModel.forwardColor;
        }
        if ((i & 4) != 0) {
            num2 = ecoProgressModel.backwardColor;
        }
        return ecoProgressModel.copy(f, num, num2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float getPercent() {
        return this.percent;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getForwardColor() {
        return this.forwardColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getBackwardColor() {
        return this.backwardColor;
    }

    @NotNull
    public final EcoProgressModel copy(@Nullable Float percent, @Nullable Integer forwardColor, @Nullable Integer backwardColor) {
        return new EcoProgressModel(percent, forwardColor, backwardColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcoProgressModel)) {
            return false;
        }
        EcoProgressModel ecoProgressModel = (EcoProgressModel) other;
        return Intrinsics.areEqual((Object) this.percent, (Object) ecoProgressModel.percent) && Intrinsics.areEqual(this.forwardColor, ecoProgressModel.forwardColor) && Intrinsics.areEqual(this.backwardColor, ecoProgressModel.backwardColor);
    }

    @Nullable
    public final Integer getBackwardColor() {
        return this.backwardColor;
    }

    @Nullable
    public final Integer getForwardColor() {
        return this.forwardColor;
    }

    @Nullable
    public final Float getPercent() {
        return this.percent;
    }

    public int hashCode() {
        Float f = this.percent;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Integer num = this.forwardColor;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.backwardColor;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setBackwardColor(@Nullable Integer num) {
        this.backwardColor = num;
    }

    public final void setForwardColor(@Nullable Integer num) {
        this.forwardColor = num;
    }

    public final void setPercent(@Nullable Float f) {
        this.percent = f;
    }

    @NotNull
    public String toString() {
        return "EcoProgressModel(percent=" + this.percent + ", forwardColor=" + this.forwardColor + ", backwardColor=" + this.backwardColor + ")";
    }

    public EcoProgressModel(@Nullable Float f, @Nullable Integer num, @Nullable Integer num2) {
        this.percent = f;
        this.forwardColor = num;
        this.backwardColor = num2;
    }

    public /* synthetic */ EcoProgressModel(Float f, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}
