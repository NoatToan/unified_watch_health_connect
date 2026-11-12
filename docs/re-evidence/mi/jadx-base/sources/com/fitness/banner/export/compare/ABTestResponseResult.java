package com.fitness.banner.export.compare;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.entity.CardInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/fitness/banner/export/compare/ABTestResponseResult;", "", "status", "", "layerName", "", CardInfo.KEY_CARD_GROUP_ID, "", "groupType", "<init>", "(ILjava/lang/String;JI)V", "getStatus", "()I", "getLayerName", "()Ljava/lang/String;", "getGroupId", "()J", "getGroupType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ABTestResponseResult {

    @SerializedName("ab_test_group_id")
    private final long groupId;

    @SerializedName("ab_test_exp_group_type")
    private final int groupType;

    @SerializedName("ab_test_layer_name")
    @Nullable
    private final String layerName;

    @SerializedName("ab_test_status")
    private final int status;

    public ABTestResponseResult(int i, @Nullable String str, long j, int i2) {
        this.status = i;
        this.layerName = str;
        this.groupId = j;
        this.groupType = i2;
    }

    public static /* synthetic */ ABTestResponseResult copy$default(ABTestResponseResult aBTestResponseResult, int i, String str, long j, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = aBTestResponseResult.status;
        }
        if ((i3 & 2) != 0) {
            str = aBTestResponseResult.layerName;
        }
        String str2 = str;
        if ((i3 & 4) != 0) {
            j = aBTestResponseResult.groupId;
        }
        long j2 = j;
        if ((i3 & 8) != 0) {
            i2 = aBTestResponseResult.groupType;
        }
        return aBTestResponseResult.copy(i, str2, j2, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLayerName() {
        return this.layerName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getGroupType() {
        return this.groupType;
    }

    @NotNull
    public final ABTestResponseResult copy(int status, @Nullable String layerName, long groupId, int groupType) {
        return new ABTestResponseResult(status, layerName, groupId, groupType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ABTestResponseResult)) {
            return false;
        }
        ABTestResponseResult aBTestResponseResult = (ABTestResponseResult) other;
        return this.status == aBTestResponseResult.status && Intrinsics.areEqual(this.layerName, aBTestResponseResult.layerName) && this.groupId == aBTestResponseResult.groupId && this.groupType == aBTestResponseResult.groupType;
    }

    public final long getGroupId() {
        return this.groupId;
    }

    public final int getGroupType() {
        return this.groupType;
    }

    @Nullable
    public final String getLayerName() {
        return this.layerName;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.status) * 31;
        String str = this.layerName;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.groupId)) * 31) + Integer.hashCode(this.groupType);
    }

    @NotNull
    public String toString() {
        return "ABTestResponseResult(status=" + this.status + ", layerName=" + this.layerName + ", groupId=" + this.groupId + ", groupType=" + this.groupType + ")";
    }
}
