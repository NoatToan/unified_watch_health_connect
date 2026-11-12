package com.xiaomi.fitness.training_plan_export.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/model/AbilityMedalInfo;", "Ljava/io/Serializable;", "medalId", "", "<init>", "(J)V", "getMedalId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AbilityMedalInfo implements Serializable {

    @SerializedName("medal_id")
    private final long medalId;

    public AbilityMedalInfo(long j) {
        this.medalId = j;
    }

    public static /* synthetic */ AbilityMedalInfo copy$default(AbilityMedalInfo abilityMedalInfo, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = abilityMedalInfo.medalId;
        }
        return abilityMedalInfo.copy(j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMedalId() {
        return this.medalId;
    }

    @NotNull
    public final AbilityMedalInfo copy(long medalId) {
        return new AbilityMedalInfo(medalId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AbilityMedalInfo) && this.medalId == ((AbilityMedalInfo) other).medalId;
    }

    public final long getMedalId() {
        return this.medalId;
    }

    public int hashCode() {
        return Long.hashCode(this.medalId);
    }

    @NotNull
    public String toString() {
        return "AbilityMedalInfo(medalId=" + this.medalId + ")";
    }
}
