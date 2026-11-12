package com.xiaomi.fit.fitness.export.data.item;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/HMDataParams;", "", "data", "Lcom/xiaomi/fit/fitness/export/data/item/SyncHMDataModel;", "<init>", "(Lcom/xiaomi/fit/fitness/export/data/item/SyncHMDataModel;)V", "getData", "()Lcom/xiaomi/fit/fitness/export/data/item/SyncHMDataModel;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HMDataParams {

    @NotNull
    private final SyncHMDataModel data;

    public HMDataParams(@NotNull SyncHMDataModel data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public static /* synthetic */ HMDataParams copy$default(HMDataParams hMDataParams, SyncHMDataModel syncHMDataModel, int i, Object obj) {
        if ((i & 1) != 0) {
            syncHMDataModel = hMDataParams.data;
        }
        return hMDataParams.copy(syncHMDataModel);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SyncHMDataModel getData() {
        return this.data;
    }

    @NotNull
    public final HMDataParams copy(@NotNull SyncHMDataModel data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new HMDataParams(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HMDataParams) && Intrinsics.areEqual(this.data, ((HMDataParams) other).data);
    }

    @NotNull
    public final SyncHMDataModel getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "HMDataParams(data=" + this.data + ")";
    }
}
