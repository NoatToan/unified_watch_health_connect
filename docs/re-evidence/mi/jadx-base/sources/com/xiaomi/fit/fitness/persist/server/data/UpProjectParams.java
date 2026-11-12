package com.xiaomi.fit.fitness.persist.server.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/UpProjectParams;", "", "phoneId", "", "dataList", "", "Lcom/xiaomi/fit/fitness/persist/server/data/ProjectDataModel;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getPhoneId", "()Ljava/lang/String;", "getDataList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UpProjectParams {

    @SerializedName("data_list")
    @Nullable
    private final List<ProjectDataModel> dataList;

    @SerializedName("phone_id")
    @NotNull
    private final String phoneId;

    public UpProjectParams(@NotNull String phoneId, @Nullable List<ProjectDataModel> list) {
        Intrinsics.checkNotNullParameter(phoneId, "phoneId");
        this.phoneId = phoneId;
        this.dataList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpProjectParams copy$default(UpProjectParams upProjectParams, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = upProjectParams.phoneId;
        }
        if ((i & 2) != 0) {
            list = upProjectParams.dataList;
        }
        return upProjectParams.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhoneId() {
        return this.phoneId;
    }

    @Nullable
    public final List<ProjectDataModel> component2() {
        return this.dataList;
    }

    @NotNull
    public final UpProjectParams copy(@NotNull String phoneId, @Nullable List<ProjectDataModel> dataList) {
        Intrinsics.checkNotNullParameter(phoneId, "phoneId");
        return new UpProjectParams(phoneId, dataList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpProjectParams)) {
            return false;
        }
        UpProjectParams upProjectParams = (UpProjectParams) other;
        return Intrinsics.areEqual(this.phoneId, upProjectParams.phoneId) && Intrinsics.areEqual(this.dataList, upProjectParams.dataList);
    }

    @Nullable
    public final List<ProjectDataModel> getDataList() {
        return this.dataList;
    }

    @NotNull
    public final String getPhoneId() {
        return this.phoneId;
    }

    public int hashCode() {
        int iHashCode = this.phoneId.hashCode() * 31;
        List<ProjectDataModel> list = this.dataList;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "UpProjectParams(phoneId=" + this.phoneId + ", dataList=" + this.dataList + ")";
    }
}
