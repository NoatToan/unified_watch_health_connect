package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/UploadFitnessDataParam;", "", "phoneId", "", "dataList", "", "Lcom/xiaomi/fit/fitness/persist/server/data/FitnessDataModel;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getPhoneId", "()Ljava/lang/String;", "getDataList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UploadFitnessDataParam {

    @SerializedName("data_list")
    @NotNull
    private final List<FitnessDataModel> dataList;

    @SerializedName("phone_id")
    @NotNull
    private final String phoneId;

    public UploadFitnessDataParam(@NotNull String phoneId, @NotNull List<FitnessDataModel> dataList) {
        Intrinsics.checkNotNullParameter(phoneId, "phoneId");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.phoneId = phoneId;
        this.dataList = dataList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UploadFitnessDataParam copy$default(UploadFitnessDataParam uploadFitnessDataParam, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadFitnessDataParam.phoneId;
        }
        if ((i & 2) != 0) {
            list = uploadFitnessDataParam.dataList;
        }
        return uploadFitnessDataParam.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhoneId() {
        return this.phoneId;
    }

    @NotNull
    public final List<FitnessDataModel> component2() {
        return this.dataList;
    }

    @NotNull
    public final UploadFitnessDataParam copy(@NotNull String phoneId, @NotNull List<FitnessDataModel> dataList) {
        Intrinsics.checkNotNullParameter(phoneId, "phoneId");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        return new UploadFitnessDataParam(phoneId, dataList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadFitnessDataParam)) {
            return false;
        }
        UploadFitnessDataParam uploadFitnessDataParam = (UploadFitnessDataParam) other;
        return Intrinsics.areEqual(this.phoneId, uploadFitnessDataParam.phoneId) && Intrinsics.areEqual(this.dataList, uploadFitnessDataParam.dataList);
    }

    @NotNull
    public final List<FitnessDataModel> getDataList() {
        return this.dataList;
    }

    @NotNull
    public final String getPhoneId() {
        return this.phoneId;
    }

    public int hashCode() {
        return (this.phoneId.hashCode() * 31) + this.dataList.hashCode();
    }

    @NotNull
    public String toString() {
        return "UploadFitnessDataParam(phoneId=" + this.phoneId + ", dataList=" + this.dataList + ")";
    }
}
