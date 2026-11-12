package com.huami.third.wechat;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\n\u0010\u0015R\u001c\u0010\u000b\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/huami/third/wechat/UserResult;", "", "", "component1", "", "component2", "component3", "component4", "bind", "headImgUrl", "isBind", "nickname", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getBind", "()I", "b", "Ljava/lang/String;", "getHeadImgUrl", "()Ljava/lang/String;", "c", GoogleApiAvailabilityLight.a, "getNickname", "<init>", "(ILjava/lang/String;ILjava/lang/String;)V", "wechat_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class UserResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("bind")
    private final int bind;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("headimgurl")
    @NotNull
    private final String headImgUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("isbind")
    private final int isBind;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("nickname")
    @NotNull
    private final String nickname;

    public UserResult(int i, @NotNull String str, int i2, @NotNull String str2) {
        this.bind = i;
        this.headImgUrl = str;
        this.isBind = i2;
        this.nickname = str2;
    }

    public static /* synthetic */ UserResult copy$default(UserResult userResult, int i, String str, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = userResult.bind;
        }
        if ((i3 & 2) != 0) {
            str = userResult.headImgUrl;
        }
        if ((i3 & 4) != 0) {
            i2 = userResult.isBind;
        }
        if ((i3 & 8) != 0) {
            str2 = userResult.nickname;
        }
        return userResult.copy(i, str, i2, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBind() {
        return this.bind;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeadImgUrl() {
        return this.headImgUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIsBind() {
        return this.isBind;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    @NotNull
    public final UserResult copy(int bind, @NotNull String headImgUrl, int isBind, @NotNull String nickname) {
        return new UserResult(bind, headImgUrl, isBind, nickname);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserResult)) {
            return false;
        }
        UserResult userResult = (UserResult) other;
        return this.bind == userResult.bind && Intrinsics.areEqual(this.headImgUrl, userResult.headImgUrl) && this.isBind == userResult.isBind && Intrinsics.areEqual(this.nickname, userResult.nickname);
    }

    public final int getBind() {
        return this.bind;
    }

    @NotNull
    public final String getHeadImgUrl() {
        return this.headImgUrl;
    }

    @NotNull
    public final String getNickname() {
        return this.nickname;
    }

    public int hashCode() {
        return (((((this.bind * 31) + this.headImgUrl.hashCode()) * 31) + this.isBind) * 31) + this.nickname.hashCode();
    }

    public final int isBind() {
        return this.isBind;
    }

    @NotNull
    public String toString() {
        return "UserResult(bind=" + this.bind + ", headImgUrl=" + this.headImgUrl + ", isBind=" + this.isBind + ", nickname=" + this.nickname + ")";
    }
}
