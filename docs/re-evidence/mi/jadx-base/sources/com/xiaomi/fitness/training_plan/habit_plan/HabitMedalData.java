package com.xiaomi.fitness.training_plan.habit_plan;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/training_plan/habit_plan/HabitMedalData;", "", "hasMadel", "", "isLock", "title", "", "resId", "", "<init>", "(ZZLjava/lang/String;I)V", "getHasMadel", "()Z", "getTitle", "()Ljava/lang/String;", "getResId", "()I", "setResId", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HabitMedalData {
    private final boolean hasMadel;
    private final boolean isLock;
    private int resId;

    @NotNull
    private final String title;

    public HabitMedalData(boolean z, boolean z2, @NotNull String title, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.hasMadel = z;
        this.isLock = z2;
        this.title = title;
        this.resId = i;
    }

    public static /* synthetic */ HabitMedalData copy$default(HabitMedalData habitMedalData, boolean z, boolean z2, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = habitMedalData.hasMadel;
        }
        if ((i2 & 2) != 0) {
            z2 = habitMedalData.isLock;
        }
        if ((i2 & 4) != 0) {
            str = habitMedalData.title;
        }
        if ((i2 & 8) != 0) {
            i = habitMedalData.resId;
        }
        return habitMedalData.copy(z, z2, str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHasMadel() {
        return this.hasMadel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsLock() {
        return this.isLock;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getResId() {
        return this.resId;
    }

    @NotNull
    public final HabitMedalData copy(boolean hasMadel, boolean isLock, @NotNull String title, int resId) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new HabitMedalData(hasMadel, isLock, title, resId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HabitMedalData)) {
            return false;
        }
        HabitMedalData habitMedalData = (HabitMedalData) other;
        return this.hasMadel == habitMedalData.hasMadel && this.isLock == habitMedalData.isLock && Intrinsics.areEqual(this.title, habitMedalData.title) && this.resId == habitMedalData.resId;
    }

    public final boolean getHasMadel() {
        return this.hasMadel;
    }

    public final int getResId() {
        return this.resId;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.hasMadel) * 31) + Boolean.hashCode(this.isLock)) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.resId);
    }

    public final boolean isLock() {
        return this.isLock;
    }

    public final void setResId(int i) {
        this.resId = i;
    }

    @NotNull
    public String toString() {
        return "HabitMedalData(hasMadel=" + this.hasMadel + ", isLock=" + this.isLock + ", title=" + this.title + ", resId=" + this.resId + ")";
    }
}
