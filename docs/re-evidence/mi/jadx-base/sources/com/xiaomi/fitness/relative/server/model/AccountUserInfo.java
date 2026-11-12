package com.xiaomi.fitness.relative.server.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/relative/server/model/AccountUserInfo;", "", "uid", "", "icon", "", "nickName", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "getUid", "()J", "getIcon", "()Ljava/lang/String;", "getNickName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AccountUserInfo {

    @SerializedName("icon")
    @NotNull
    private final String icon;

    @SerializedName("nickname")
    @NotNull
    private final String nickName;

    @SerializedName("userId")
    private final long uid;

    public AccountUserInfo(long j, @NotNull String icon, @NotNull String nickName) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        this.uid = j;
        this.icon = icon;
        this.nickName = nickName;
    }

    public static /* synthetic */ AccountUserInfo copy$default(AccountUserInfo accountUserInfo, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = accountUserInfo.uid;
        }
        if ((i & 2) != 0) {
            str = accountUserInfo.icon;
        }
        if ((i & 4) != 0) {
            str2 = accountUserInfo.nickName;
        }
        return accountUserInfo.copy(j, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUid() {
        return this.uid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @NotNull
    public final AccountUserInfo copy(long uid, @NotNull String icon, @NotNull String nickName) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        return new AccountUserInfo(uid, icon, nickName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountUserInfo)) {
            return false;
        }
        AccountUserInfo accountUserInfo = (AccountUserInfo) other;
        return this.uid == accountUserInfo.uid && Intrinsics.areEqual(this.icon, accountUserInfo.icon) && Intrinsics.areEqual(this.nickName, accountUserInfo.nickName);
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    public final long getUid() {
        return this.uid;
    }

    public int hashCode() {
        return (((Long.hashCode(this.uid) * 31) + this.icon.hashCode()) * 31) + this.nickName.hashCode();
    }

    @NotNull
    public String toString() {
        return "AccountUserInfo(uid=" + this.uid + ", icon=" + this.icon + ", nickName=" + this.nickName + ")";
    }
}
