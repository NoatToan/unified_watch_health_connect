package com.xiaomi.fitness.device.manager.export.bean;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.utils.MD5Util;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/bean/UserInfoData;", "", "userId", "", "userIdType", "", "<init>", "(Ljava/lang/String;I)V", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "getUserIdType", "()I", "setUserIdType", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserInfoData {

    @SerializedName("user_id")
    @NotNull
    private String userId;

    @SerializedName("user_id_type")
    private int userIdType;

    /* JADX WARN: Multi-variable type inference failed */
    public UserInfoData() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UserInfoData copy$default(UserInfoData userInfoData, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = userInfoData.userId;
        }
        if ((i2 & 2) != 0) {
            i = userInfoData.userIdType;
        }
        return userInfoData.copy(str, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUserIdType() {
        return this.userIdType;
    }

    @NotNull
    public final UserInfoData copy(@NotNull String userId, int userIdType) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new UserInfoData(userId, userIdType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfoData)) {
            return false;
        }
        UserInfoData userInfoData = (UserInfoData) other;
        return Intrinsics.areEqual(this.userId, userInfoData.userId) && this.userIdType == userInfoData.userIdType;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final int getUserIdType() {
        return this.userIdType;
    }

    public int hashCode() {
        return (this.userId.hashCode() * 31) + Integer.hashCode(this.userIdType);
    }

    public final void setUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    public final void setUserIdType(int i) {
        this.userIdType = i;
    }

    @NotNull
    public String toString() {
        return "UserInfoData(userId=" + this.userId + ", userIdType=" + this.userIdType + ")";
    }

    public UserInfoData(@NotNull String userId, int i) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.userId = userId;
        this.userIdType = i;
    }

    public /* synthetic */ UserInfoData(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? MD5Util.MD5(AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId()) : str, (i2 & 2) != 0 ? 1 : i);
    }
}
