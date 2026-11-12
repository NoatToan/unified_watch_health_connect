package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/TriggerStatResponse;", "", "data", "Lcom/xiaomi/fit/fitness/persist/server/data/StatDataModel;", "<init>", "(Lcom/xiaomi/fit/fitness/persist/server/data/StatDataModel;)V", "getData", "()Lcom/xiaomi/fit/fitness/persist/server/data/StatDataModel;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TriggerStatResponse {

    @SerializedName("data")
    @Nullable
    private final StatDataModel data;

    public TriggerStatResponse(@Nullable StatDataModel statDataModel) {
        this.data = statDataModel;
    }

    public static /* synthetic */ TriggerStatResponse copy$default(TriggerStatResponse triggerStatResponse, StatDataModel statDataModel, int i, Object obj) {
        if ((i & 1) != 0) {
            statDataModel = triggerStatResponse.data;
        }
        return triggerStatResponse.copy(statDataModel);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StatDataModel getData() {
        return this.data;
    }

    @NotNull
    public final TriggerStatResponse copy(@Nullable StatDataModel data) {
        return new TriggerStatResponse(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TriggerStatResponse) && Intrinsics.areEqual(this.data, ((TriggerStatResponse) other).data);
    }

    @Nullable
    public final StatDataModel getData() {
        return this.data;
    }

    public int hashCode() {
        StatDataModel statDataModel = this.data;
        if (statDataModel == null) {
            return 0;
        }
        return statDataModel.hashCode();
    }

    @NotNull
    public String toString() {
        return "TriggerStatResponse(data=" + this.data + ")";
    }
}
