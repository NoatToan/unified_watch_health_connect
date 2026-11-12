package com.xiaomi.fitness.electronic.scale.export.bean;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b6\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010-\u001a\u00020\u0005J\u0006\u0010.\u001a\u00020\u0005J\u0006\u0010/\u001a\u00020\u0005J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\u0007HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003Jw\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007HÆ\u0001J\u0013\u0010<\u001a\u00020\u00052\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020\u0003HÖ\u0001J\t\u0010@\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015R\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001c¨\u0006A"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/bean/ShareAccount;", "Ljava/io/Serializable;", "icon", "", "isDel", "", "nickName", "", "userId", "shareUserId", "shareId", "status", "mac", "did", "model", "name", "<init>", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()I", "setIcon", "(I)V", "()Z", "setDel", "(Z)V", "getNickName", "()Ljava/lang/String;", "setNickName", "(Ljava/lang/String;)V", "getUserId", "setUserId", "getShareUserId", "setShareUserId", "getShareId", "setShareId", "getStatus", "setStatus", "getMac", "setMac", "getDid", "setDid", "getModel", "setModel", "getName", "setName", "isBondBoolean", "isAccepted", "showShareDialog", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "", "hashCode", "toString", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ShareAccount implements Serializable {

    @NotNull
    private String did;
    private int icon;
    private boolean isDel;

    @NotNull
    private String mac;

    @NotNull
    private String model;

    @NotNull
    private String name;

    @NotNull
    private String nickName;

    @NotNull
    private String shareId;

    @NotNull
    private String shareUserId;
    private int status;

    @NotNull
    private String userId;

    public ShareAccount(int i, boolean z, @NotNull String nickName, @NotNull String userId, @NotNull String shareUserId, @NotNull String shareId, int i2, @NotNull String mac, @NotNull String did, @NotNull String model, @NotNull String name) {
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(shareUserId, "shareUserId");
        Intrinsics.checkNotNullParameter(shareId, "shareId");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(name, "name");
        this.icon = i;
        this.isDel = z;
        this.nickName = nickName;
        this.userId = userId;
        this.shareUserId = shareUserId;
        this.shareId = shareId;
        this.status = i2;
        this.mac = mac;
        this.did = did;
        this.model = model;
        this.name = name;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsDel() {
        return this.isDel;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getShareUserId() {
        return this.shareUserId;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getShareId() {
        return this.shareId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    @NotNull
    public final ShareAccount copy(int icon, boolean isDel, @NotNull String nickName, @NotNull String userId, @NotNull String shareUserId, @NotNull String shareId, int status, @NotNull String mac, @NotNull String did, @NotNull String model, @NotNull String name) {
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(shareUserId, "shareUserId");
        Intrinsics.checkNotNullParameter(shareId, "shareId");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(name, "name");
        return new ShareAccount(icon, isDel, nickName, userId, shareUserId, shareId, status, mac, did, model, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareAccount)) {
            return false;
        }
        ShareAccount shareAccount = (ShareAccount) other;
        return this.icon == shareAccount.icon && this.isDel == shareAccount.isDel && Intrinsics.areEqual(this.nickName, shareAccount.nickName) && Intrinsics.areEqual(this.userId, shareAccount.userId) && Intrinsics.areEqual(this.shareUserId, shareAccount.shareUserId) && Intrinsics.areEqual(this.shareId, shareAccount.shareId) && this.status == shareAccount.status && Intrinsics.areEqual(this.mac, shareAccount.mac) && Intrinsics.areEqual(this.did, shareAccount.did) && Intrinsics.areEqual(this.model, shareAccount.model) && Intrinsics.areEqual(this.name, shareAccount.name);
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    public final int getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getMac() {
        return this.mac;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    @NotNull
    public final String getShareId() {
        return this.shareId;
    }

    @NotNull
    public final String getShareUserId() {
        return this.shareUserId;
    }

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.icon) * 31) + Boolean.hashCode(this.isDel)) * 31) + this.nickName.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.shareUserId.hashCode()) * 31) + this.shareId.hashCode()) * 31) + Integer.hashCode(this.status)) * 31) + this.mac.hashCode()) * 31) + this.did.hashCode()) * 31) + this.model.hashCode()) * 31) + this.name.hashCode();
    }

    public final boolean isAccepted() {
        int i = this.status;
        return i == 2 || i == 3;
    }

    public final boolean isBondBoolean() {
        return this.status == 3;
    }

    public final boolean isDel() {
        return this.isDel;
    }

    public final void setDel(boolean z) {
        this.isDel = z;
    }

    public final void setDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.did = str;
    }

    public final void setIcon(int i) {
        this.icon = i;
    }

    public final void setMac(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mac = str;
    }

    public final void setModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setNickName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nickName = str;
    }

    public final void setShareId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.shareId = str;
    }

    public final void setShareUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.shareUserId = str;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    public final boolean showShareDialog() {
        int i = this.status;
        return i == 0 || i == 1;
    }

    @NotNull
    public String toString() {
        return "ShareAccount(icon=" + this.icon + ", isDel=" + this.isDel + ", nickName=" + this.nickName + ", userId=" + this.userId + ", shareUserId=" + this.shareUserId + ", shareId=" + this.shareId + ", status=" + this.status + ", mac=" + this.mac + ", did=" + this.did + ", model=" + this.model + ", name=" + this.name + ")";
    }

    public /* synthetic */ ShareAccount(int i, boolean z, String str, String str2, String str3, String str4, int i2, String str5, String str6, String str7, String str8, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, (i3 & 4) != 0 ? "" : str, str2, str3, (i3 & 32) != 0 ? "" : str4, i2, str5, str6, str7, str8);
    }
}
