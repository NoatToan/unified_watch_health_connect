package com.huami.third.alipay;

import com.google.gson.annotations.SerializedName;
import com.huami.network.hmnetwork.webapi.HMWebParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/third/alipay/UserInfo;", "", "", "component1", "component2", "thirdUserId", "nickName", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getThirdUserId", "()Ljava/lang/String;", "b", "getNickName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "alipay_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class UserInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName(HMWebParameter.PARAM_PARTNER_THIRD_APP_UID_QQ)
    @NotNull
    private final String thirdUserId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("nick_name")
    @NotNull
    private final String nickName;

    public UserInfo(@NotNull String str, @NotNull String str2) {
        this.thirdUserId = str;
        this.nickName = str2;
    }

    public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userInfo.thirdUserId;
        }
        if ((i & 2) != 0) {
            str2 = userInfo.nickName;
        }
        return userInfo.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getThirdUserId() {
        return this.thirdUserId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @NotNull
    public final UserInfo copy(@NotNull String thirdUserId, @NotNull String nickName) {
        return new UserInfo(thirdUserId, nickName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) other;
        return Intrinsics.areEqual(this.thirdUserId, userInfo.thirdUserId) && Intrinsics.areEqual(this.nickName, userInfo.nickName);
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    @NotNull
    public final String getThirdUserId() {
        return this.thirdUserId;
    }

    public int hashCode() {
        String str = this.thirdUserId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.nickName;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UserInfo(thirdUserId=" + this.thirdUserId + ", nickName=" + this.nickName + ")";
    }
}
