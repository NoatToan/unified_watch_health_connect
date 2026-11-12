package com.xiaomi.fitness.rn.share.bean;

import com.xiaomi.account.openauth.AuthorizeActivityBase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003JE\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/rn/share/bean/DeviceListUserBean;", "", AuthorizeActivityBase.KEY_USERID, "", "icon", "nickname", "sharetime", "", "status", "mtime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getUserid", "()Ljava/lang/String;", "setUserid", "(Ljava/lang/String;)V", "getIcon", "setIcon", "getNickname", "setNickname", "getSharetime", "()J", "setSharetime", "(J)V", "getStatus", "setStatus", "getMtime", "setMtime", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceListUserBean {

    @NotNull
    private String icon;

    @NotNull
    private String mtime;

    @NotNull
    private String nickname;
    private long sharetime;

    @NotNull
    private String status;

    @NotNull
    private String userid;

    public DeviceListUserBean(@NotNull String userid, @NotNull String icon, @NotNull String nickname, long j, @NotNull String status, @NotNull String mtime) {
        Intrinsics.checkNotNullParameter(userid, "userid");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(mtime, "mtime");
        this.userid = userid;
        this.icon = icon;
        this.nickname = nickname;
        this.sharetime = j;
        this.status = status;
        this.mtime = mtime;
    }

    public static /* synthetic */ DeviceListUserBean copy$default(DeviceListUserBean deviceListUserBean, String str, String str2, String str3, long j, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceListUserBean.userid;
        }
        if ((i & 2) != 0) {
            str2 = deviceListUserBean.icon;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = deviceListUserBean.nickname;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            j = deviceListUserBean.sharetime;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            str4 = deviceListUserBean.status;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = deviceListUserBean.mtime;
        }
        return deviceListUserBean.copy(str, str6, str7, j2, str8, str5);
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

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMtime() {
        return this.mtime;
    }

    @NotNull
    public final DeviceListUserBean copy(@NotNull String userid, @NotNull String icon, @NotNull String nickname, long sharetime, @NotNull String status, @NotNull String mtime) {
        Intrinsics.checkNotNullParameter(userid, "userid");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(mtime, "mtime");
        return new DeviceListUserBean(userid, icon, nickname, sharetime, status, mtime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceListUserBean)) {
            return false;
        }
        DeviceListUserBean deviceListUserBean = (DeviceListUserBean) other;
        return Intrinsics.areEqual(this.userid, deviceListUserBean.userid) && Intrinsics.areEqual(this.icon, deviceListUserBean.icon) && Intrinsics.areEqual(this.nickname, deviceListUserBean.nickname) && this.sharetime == deviceListUserBean.sharetime && Intrinsics.areEqual(this.status, deviceListUserBean.status) && Intrinsics.areEqual(this.mtime, deviceListUserBean.mtime);
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getMtime() {
        return this.mtime;
    }

    @NotNull
    public final String getNickname() {
        return this.nickname;
    }

    public final long getSharetime() {
        return this.sharetime;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getUserid() {
        return this.userid;
    }

    public int hashCode() {
        return (((((((((this.userid.hashCode() * 31) + this.icon.hashCode()) * 31) + this.nickname.hashCode()) * 31) + Long.hashCode(this.sharetime)) * 31) + this.status.hashCode()) * 31) + this.mtime.hashCode();
    }

    public final void setIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.icon = str;
    }

    public final void setMtime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mtime = str;
    }

    public final void setNickname(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nickname = str;
    }

    public final void setSharetime(long j) {
        this.sharetime = j;
    }

    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.status = str;
    }

    public final void setUserid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userid = str;
    }

    @NotNull
    public String toString() {
        return "DeviceListUserBean(userid=" + this.userid + ", icon=" + this.icon + ", nickname=" + this.nickname + ", sharetime=" + this.sharetime + ", status=" + this.status + ", mtime=" + this.mtime + ")";
    }
}
