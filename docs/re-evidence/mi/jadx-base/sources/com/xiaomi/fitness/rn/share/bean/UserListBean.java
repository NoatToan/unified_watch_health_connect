package com.xiaomi.fitness.rn.share.bean;

import com.xiaomi.account.openauth.AuthorizeActivityBase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J;\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\tHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/rn/share/bean/UserListBean;", "", AuthorizeActivityBase.KEY_USERID, "", "icon", "nickname", "sharetime", "", "status", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V", "getUserid", "()Ljava/lang/String;", "setUserid", "(Ljava/lang/String;)V", "getIcon", "setIcon", "getNickname", "setNickname", "getSharetime", "()J", "setSharetime", "(J)V", "getStatus", "()I", "setStatus", "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserListBean {

    @NotNull
    private String icon;

    @NotNull
    private String nickname;
    private long sharetime;
    private int status;

    @NotNull
    private String userid;

    public UserListBean(@NotNull String userid, @NotNull String icon, @NotNull String nickname, long j, int i) {
        Intrinsics.checkNotNullParameter(userid, "userid");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        this.userid = userid;
        this.icon = icon;
        this.nickname = nickname;
        this.sharetime = j;
        this.status = i;
    }

    public static /* synthetic */ UserListBean copy$default(UserListBean userListBean, String str, String str2, String str3, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = userListBean.userid;
        }
        if ((i2 & 2) != 0) {
            str2 = userListBean.icon;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = userListBean.nickname;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            j = userListBean.sharetime;
        }
        long j2 = j;
        if ((i2 & 16) != 0) {
            i = userListBean.status;
        }
        return userListBean.copy(str, str4, str5, j2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserid() {
        return this.userid;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getSharetime() {
        return this.sharetime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final UserListBean copy(@NotNull String userid, @NotNull String icon, @NotNull String nickname, long sharetime, int status) {
        Intrinsics.checkNotNullParameter(userid, "userid");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        return new UserListBean(userid, icon, nickname, sharetime, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserListBean)) {
            return false;
        }
        UserListBean userListBean = (UserListBean) other;
        return Intrinsics.areEqual(this.userid, userListBean.userid) && Intrinsics.areEqual(this.icon, userListBean.icon) && Intrinsics.areEqual(this.nickname, userListBean.nickname) && this.sharetime == userListBean.sharetime && this.status == userListBean.status;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getNickname() {
        return this.nickname;
    }

    public final long getSharetime() {
        return this.sharetime;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final String getUserid() {
        return this.userid;
    }

    public int hashCode() {
        return (((((((this.userid.hashCode() * 31) + this.icon.hashCode()) * 31) + this.nickname.hashCode()) * 31) + Long.hashCode(this.sharetime)) * 31) + Integer.hashCode(this.status);
    }

    public final void setIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.icon = str;
    }

    public final void setNickname(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nickname = str;
    }

    public final void setSharetime(long j) {
        this.sharetime = j;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setUserid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userid = str;
    }

    @NotNull
    public String toString() {
        return "UserListBean(userid=" + this.userid + ", icon=" + this.icon + ", nickname=" + this.nickname + ", sharetime=" + this.sharetime + ", status=" + this.status + ")";
    }
}
