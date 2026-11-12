package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.access.util.ThirdPartAccessConstants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R,\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/ThirdPartyDataParam;", "", "token", "", "thirdPartyName", "dataList", "", "Lcom/xiaomi/fit/fitness/export/data/item/ThirdPartyDataModel;", "extra", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "getToken", "()Ljava/lang/String;", "getThirdPartyName", "getDataList", "()Ljava/util/List;", "getExtra", "()Ljava/util/Map;", "setExtra", "(Ljava/util/Map;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ThirdPartyDataParam {

    @SerializedName("datalist")
    @NotNull
    private final List<ThirdPartyDataModel> dataList;

    @SerializedName("extra")
    @Nullable
    private Map<String, String> extra;

    @SerializedName(ThirdPartAccessConstants.PARAM_THIRD_PARTY)
    @NotNull
    private final String thirdPartyName;

    @SerializedName("token")
    @NotNull
    private final String token;

    public ThirdPartyDataParam(@NotNull String token, @NotNull String thirdPartyName, @NotNull List<ThirdPartyDataModel> dataList, @Nullable Map<String, String> map) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(thirdPartyName, "thirdPartyName");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.token = token;
        this.thirdPartyName = thirdPartyName;
        this.dataList = dataList;
        this.extra = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThirdPartyDataParam copy$default(ThirdPartyDataParam thirdPartyDataParam, String str, String str2, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = thirdPartyDataParam.token;
        }
        if ((i & 2) != 0) {
            str2 = thirdPartyDataParam.thirdPartyName;
        }
        if ((i & 4) != 0) {
            list = thirdPartyDataParam.dataList;
        }
        if ((i & 8) != 0) {
            map = thirdPartyDataParam.extra;
        }
        return thirdPartyDataParam.copy(str, str2, list, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getThirdPartyName() {
        return this.thirdPartyName;
    }

    @NotNull
    public final List<ThirdPartyDataModel> component3() {
        return this.dataList;
    }

    @Nullable
    public final Map<String, String> component4() {
        return this.extra;
    }

    @NotNull
    public final ThirdPartyDataParam copy(@NotNull String token, @NotNull String thirdPartyName, @NotNull List<ThirdPartyDataModel> dataList, @Nullable Map<String, String> extra) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(thirdPartyName, "thirdPartyName");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        return new ThirdPartyDataParam(token, thirdPartyName, dataList, extra);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThirdPartyDataParam)) {
            return false;
        }
        ThirdPartyDataParam thirdPartyDataParam = (ThirdPartyDataParam) other;
        return Intrinsics.areEqual(this.token, thirdPartyDataParam.token) && Intrinsics.areEqual(this.thirdPartyName, thirdPartyDataParam.thirdPartyName) && Intrinsics.areEqual(this.dataList, thirdPartyDataParam.dataList) && Intrinsics.areEqual(this.extra, thirdPartyDataParam.extra);
    }

    @NotNull
    public final List<ThirdPartyDataModel> getDataList() {
        return this.dataList;
    }

    @Nullable
    public final Map<String, String> getExtra() {
        return this.extra;
    }

    @NotNull
    public final String getThirdPartyName() {
        return this.thirdPartyName;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int iHashCode = ((((this.token.hashCode() * 31) + this.thirdPartyName.hashCode()) * 31) + this.dataList.hashCode()) * 31;
        Map<String, String> map = this.extra;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final void setExtra(@Nullable Map<String, String> map) {
        this.extra = map;
    }

    @NotNull
    public String toString() {
        return "ThirdPartyDataParam(token=" + this.token + ", thirdPartyName=" + this.thirdPartyName + ", dataList=" + this.dataList + ", extra=" + this.extra + ")";
    }

    public /* synthetic */ ThirdPartyDataParam(String str, String str2, List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i & 8) != 0 ? null : map);
    }
}
