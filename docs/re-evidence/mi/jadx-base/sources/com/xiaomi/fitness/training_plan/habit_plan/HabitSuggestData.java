package com.xiaomi.fitness.training_plan.habit_plan;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/training_plan/habit_plan/HabitSuggestData;", "", "suggestTitle", "", "suggestDesc", "suggestValue", "suggestUnit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSuggestTitle", "()Ljava/lang/String;", "getSuggestDesc", "getSuggestValue", "getSuggestUnit", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HabitSuggestData {

    @NotNull
    private final String suggestDesc;

    @NotNull
    private final String suggestTitle;

    @NotNull
    private final String suggestUnit;

    @NotNull
    private final String suggestValue;

    public HabitSuggestData(@NotNull String suggestTitle, @NotNull String suggestDesc, @NotNull String suggestValue, @NotNull String suggestUnit) {
        Intrinsics.checkNotNullParameter(suggestTitle, "suggestTitle");
        Intrinsics.checkNotNullParameter(suggestDesc, "suggestDesc");
        Intrinsics.checkNotNullParameter(suggestValue, "suggestValue");
        Intrinsics.checkNotNullParameter(suggestUnit, "suggestUnit");
        this.suggestTitle = suggestTitle;
        this.suggestDesc = suggestDesc;
        this.suggestValue = suggestValue;
        this.suggestUnit = suggestUnit;
    }

    public static /* synthetic */ HabitSuggestData copy$default(HabitSuggestData habitSuggestData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = habitSuggestData.suggestTitle;
        }
        if ((i & 2) != 0) {
            str2 = habitSuggestData.suggestDesc;
        }
        if ((i & 4) != 0) {
            str3 = habitSuggestData.suggestValue;
        }
        if ((i & 8) != 0) {
            str4 = habitSuggestData.suggestUnit;
        }
        return habitSuggestData.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSuggestTitle() {
        return this.suggestTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSuggestDesc() {
        return this.suggestDesc;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSuggestValue() {
        return this.suggestValue;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSuggestUnit() {
        return this.suggestUnit;
    }

    @NotNull
    public final HabitSuggestData copy(@NotNull String suggestTitle, @NotNull String suggestDesc, @NotNull String suggestValue, @NotNull String suggestUnit) {
        Intrinsics.checkNotNullParameter(suggestTitle, "suggestTitle");
        Intrinsics.checkNotNullParameter(suggestDesc, "suggestDesc");
        Intrinsics.checkNotNullParameter(suggestValue, "suggestValue");
        Intrinsics.checkNotNullParameter(suggestUnit, "suggestUnit");
        return new HabitSuggestData(suggestTitle, suggestDesc, suggestValue, suggestUnit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HabitSuggestData)) {
            return false;
        }
        HabitSuggestData habitSuggestData = (HabitSuggestData) other;
        return Intrinsics.areEqual(this.suggestTitle, habitSuggestData.suggestTitle) && Intrinsics.areEqual(this.suggestDesc, habitSuggestData.suggestDesc) && Intrinsics.areEqual(this.suggestValue, habitSuggestData.suggestValue) && Intrinsics.areEqual(this.suggestUnit, habitSuggestData.suggestUnit);
    }

    @NotNull
    public final String getSuggestDesc() {
        return this.suggestDesc;
    }

    @NotNull
    public final String getSuggestTitle() {
        return this.suggestTitle;
    }

    @NotNull
    public final String getSuggestUnit() {
        return this.suggestUnit;
    }

    @NotNull
    public final String getSuggestValue() {
        return this.suggestValue;
    }

    public int hashCode() {
        return (((((this.suggestTitle.hashCode() * 31) + this.suggestDesc.hashCode()) * 31) + this.suggestValue.hashCode()) * 31) + this.suggestUnit.hashCode();
    }

    @NotNull
    public String toString() {
        return "HabitSuggestData(suggestTitle=" + this.suggestTitle + ", suggestDesc=" + this.suggestDesc + ", suggestValue=" + this.suggestValue + ", suggestUnit=" + this.suggestUnit + ")";
    }
}
