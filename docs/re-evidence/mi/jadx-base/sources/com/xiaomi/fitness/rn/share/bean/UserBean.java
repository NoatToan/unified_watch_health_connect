package com.xiaomi.fitness.rn.share.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/rn/share/bean/UserBean;", "", "userId", "", "nickname", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "getNickname", "setNickname", "getIcon", "setIcon", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserBean {

    @NotNull
    private String icon;

    @NotNull
    private String nickname;

    @NotNull
    private String userId;

    public UserBean(@NotNull String userId, @NotNull String nickname, @NotNull String icon) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.userId = userId;
        this.nickname = nickname;
        this.icon = icon;
    }

    public static /* synthetic */ UserBean copy$default(UserBean userBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userBean.userId;
        }
        if ((i & 2) != 0) {
            str2 = userBean.nickname;
        }
        if ((i & 4) != 0) {
            str3 = userBean.icon;
        }
        return userBean.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final UserBean copy(@NotNull String userId, @NotNull String nickname, @NotNull String icon) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new UserBean(userId, nickname, icon);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserBean)) {
            return false;
        }
        UserBean userBean = (UserBean) other;
        return Intrinsics.areEqual(this.userId, userBean.userId) && Intrinsics.areEqual(this.nickname, userBean.nickname) && Intrinsics.areEqual(this.icon, userBean.icon);
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getNickname() {
        return this.nickname;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((this.userId.hashCode() * 31) + this.nickname.hashCode()) * 31) + this.icon.hashCode();
    }

    public final void setIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.icon = str;
    }

    public final void setNickname(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nickname = str;
    }

    public final void setUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    @NotNull
    public String toString() {
        return "UserBean(userId=" + this.userId + ", nickname=" + this.nickname + ", icon=" + this.icon + ")";
    }
}
