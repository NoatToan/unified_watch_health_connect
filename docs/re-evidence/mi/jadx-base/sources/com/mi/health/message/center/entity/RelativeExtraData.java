package com.mi.health.message.center.entity;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.active.pk.PkConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JZ\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\bHÖ\u0001J\t\u0010)\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lcom/mi/health/message/center/entity/RelativeExtraData;", "Lcom/mi/health/message/center/entity/ExtraData;", PkConstants.PARAM_INVITE_ID, "", "authDataList", "", "", "authRange", "", "nickName", "icon", "abnormalData", "Lcom/mi/health/message/center/entity/AbnormalData;", "<init>", "(Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/mi/health/message/center/entity/AbnormalData;)V", "getInviteId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAuthDataList", "()Ljava/util/List;", "getAuthRange", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNickName", "()Ljava/lang/String;", "getIcon", "getAbnormalData", "()Lcom/mi/health/message/center/entity/AbnormalData;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Long;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/mi/health/message/center/entity/AbnormalData;)Lcom/mi/health/message/center/entity/RelativeExtraData;", "equals", "", "other", "", "hashCode", "toString", "message-center_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RelativeExtraData extends ExtraData {

    @SerializedName("abnormal_data")
    @NotNull
    private final AbnormalData abnormalData;

    @SerializedName("auth_data")
    @Nullable
    private final List<String> authDataList;

    @SerializedName("auth_time_range")
    @Nullable
    private final Integer authRange;

    @SerializedName("icon")
    @Nullable
    private final String icon;

    @SerializedName("invite_id")
    @Nullable
    private final Long inviteId;

    @SerializedName("nick_name")
    @Nullable
    private final String nickName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelativeExtraData(@Nullable Long l, @Nullable List<String> list, @Nullable Integer num, @Nullable String str, @Nullable String str2, @NotNull AbnormalData abnormalData) {
        super(null);
        Intrinsics.checkNotNullParameter(abnormalData, "abnormalData");
        this.inviteId = l;
        this.authDataList = list;
        this.authRange = num;
        this.nickName = str;
        this.icon = str2;
        this.abnormalData = abnormalData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RelativeExtraData copy$default(RelativeExtraData relativeExtraData, Long l, List list, Integer num, String str, String str2, AbnormalData abnormalData, int i, Object obj) {
        if ((i & 1) != 0) {
            l = relativeExtraData.inviteId;
        }
        if ((i & 2) != 0) {
            list = relativeExtraData.authDataList;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            num = relativeExtraData.authRange;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str = relativeExtraData.nickName;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = relativeExtraData.icon;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            abnormalData = relativeExtraData.abnormalData;
        }
        return relativeExtraData.copy(l, list2, num2, str3, str4, abnormalData);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getInviteId() {
        return this.inviteId;
    }

    @Nullable
    public final List<String> component2() {
        return this.authDataList;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getAuthRange() {
        return this.authRange;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AbnormalData getAbnormalData() {
        return this.abnormalData;
    }

    @NotNull
    public final RelativeExtraData copy(@Nullable Long inviteId, @Nullable List<String> authDataList, @Nullable Integer authRange, @Nullable String nickName, @Nullable String icon, @NotNull AbnormalData abnormalData) {
        Intrinsics.checkNotNullParameter(abnormalData, "abnormalData");
        return new RelativeExtraData(inviteId, authDataList, authRange, nickName, icon, abnormalData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RelativeExtraData)) {
            return false;
        }
        RelativeExtraData relativeExtraData = (RelativeExtraData) other;
        return Intrinsics.areEqual(this.inviteId, relativeExtraData.inviteId) && Intrinsics.areEqual(this.authDataList, relativeExtraData.authDataList) && Intrinsics.areEqual(this.authRange, relativeExtraData.authRange) && Intrinsics.areEqual(this.nickName, relativeExtraData.nickName) && Intrinsics.areEqual(this.icon, relativeExtraData.icon) && Intrinsics.areEqual(this.abnormalData, relativeExtraData.abnormalData);
    }

    @NotNull
    public final AbnormalData getAbnormalData() {
        return this.abnormalData;
    }

    @Nullable
    public final List<String> getAuthDataList() {
        return this.authDataList;
    }

    @Nullable
    public final Integer getAuthRange() {
        return this.authRange;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final Long getInviteId() {
        return this.inviteId;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    public int hashCode() {
        Long l = this.inviteId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        List<String> list = this.authDataList;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.authRange;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.nickName;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        return ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.abnormalData.hashCode();
    }

    @NotNull
    public String toString() {
        return "RelativeExtraData(inviteId=" + this.inviteId + ", authDataList=" + this.authDataList + ", authRange=" + this.authRange + ", nickName=" + this.nickName + ", icon=" + this.icon + ", abnormalData=" + this.abnormalData + ")";
    }
}
