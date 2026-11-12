package com.xiaomi.fitness.electronic.scale.export.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\nHÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\rHÆ\u0003J\t\u0010<\u001a\u00020\rHÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\rHÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010\u0017R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0015\"\u0004\b/\u0010\u0017R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0015\"\u0004\b1\u0010\u0017R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0015\"\u0004\b3\u0010\u0017¨\u0006F"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/bean/RespDeviceInfo;", "", "identifier", "", "createTime", "", "name", "model", "updateTime", "detail", "Lcom/xiaomi/fitness/electronic/scale/export/bean/Detail;", "sid", "status", "", "type", "userId", "shareUserId", "shareId", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JLcom/xiaomi/fitness/electronic/scale/export/bean/Detail;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "setIdentifier", "(Ljava/lang/String;)V", "getCreateTime", "()J", "setCreateTime", "(J)V", "getName", "setName", "getModel", "setModel", "getUpdateTime", "setUpdateTime", "getDetail", "()Lcom/xiaomi/fitness/electronic/scale/export/bean/Detail;", "setDetail", "(Lcom/xiaomi/fitness/electronic/scale/export/bean/Detail;)V", "getSid", "setSid", "getStatus", "()I", "setStatus", "(I)V", "getType", "setType", "getUserId", "setUserId", "getShareUserId", "setShareUserId", "getShareId", "setShareId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RespDeviceInfo {
    private long createTime;

    @NotNull
    private Detail detail;

    @NotNull
    private String identifier;

    @NotNull
    private String model;

    @NotNull
    private String name;

    @NotNull
    private String shareId;

    @NotNull
    private String shareUserId;

    @NotNull
    private String sid;
    private int status;
    private int type;
    private long updateTime;

    @NotNull
    private String userId;

    public RespDeviceInfo() {
        this(null, 0L, null, null, 0L, null, null, 0, 0, null, null, null, 4095, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getShareUserId() {
        return this.shareUserId;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getShareId() {
        return this.shareId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Detail getDetail() {
        return this.detail;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final RespDeviceInfo copy(@NotNull String identifier, long createTime, @NotNull String name, @NotNull String model, long updateTime, @NotNull Detail detail, @NotNull String sid, int status, int type, @NotNull String userId, @NotNull String shareUserId, @NotNull String shareId) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(shareUserId, "shareUserId");
        Intrinsics.checkNotNullParameter(shareId, "shareId");
        return new RespDeviceInfo(identifier, createTime, name, model, updateTime, detail, sid, status, type, userId, shareUserId, shareId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RespDeviceInfo)) {
            return false;
        }
        RespDeviceInfo respDeviceInfo = (RespDeviceInfo) other;
        return Intrinsics.areEqual(this.identifier, respDeviceInfo.identifier) && this.createTime == respDeviceInfo.createTime && Intrinsics.areEqual(this.name, respDeviceInfo.name) && Intrinsics.areEqual(this.model, respDeviceInfo.model) && this.updateTime == respDeviceInfo.updateTime && Intrinsics.areEqual(this.detail, respDeviceInfo.detail) && Intrinsics.areEqual(this.sid, respDeviceInfo.sid) && this.status == respDeviceInfo.status && this.type == respDeviceInfo.type && Intrinsics.areEqual(this.userId, respDeviceInfo.userId) && Intrinsics.areEqual(this.shareUserId, respDeviceInfo.shareUserId) && Intrinsics.areEqual(this.shareId, respDeviceInfo.shareId);
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final Detail getDetail() {
        return this.detail;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
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
    public final String getShareId() {
        return this.shareId;
    }

    @NotNull
    public final String getShareUserId() {
        return this.shareUserId;
    }

    @NotNull
    public final String getSid() {
        return this.sid;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.identifier.hashCode() * 31) + Long.hashCode(this.createTime)) * 31) + this.name.hashCode()) * 31) + this.model.hashCode()) * 31) + Long.hashCode(this.updateTime)) * 31) + this.detail.hashCode()) * 31) + this.sid.hashCode()) * 31) + Integer.hashCode(this.status)) * 31) + Integer.hashCode(this.type)) * 31) + this.userId.hashCode()) * 31) + this.shareUserId.hashCode()) * 31) + this.shareId.hashCode();
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setDetail(@NotNull Detail detail) {
        Intrinsics.checkNotNullParameter(detail, "<set-?>");
        this.detail = detail;
    }

    public final void setIdentifier(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.identifier = str;
    }

    public final void setModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.model = str;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setShareId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.shareId = str;
    }

    public final void setShareUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.shareUserId = str;
    }

    public final void setSid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sid = str;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public final void setUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userId = str;
    }

    @NotNull
    public String toString() {
        return "RespDeviceInfo(identifier=" + this.identifier + ", createTime=" + this.createTime + ", name=" + this.name + ", model=" + this.model + ", updateTime=" + this.updateTime + ", detail=" + this.detail + ", sid=" + this.sid + ", status=" + this.status + ", type=" + this.type + ", userId=" + this.userId + ", shareUserId=" + this.shareUserId + ", shareId=" + this.shareId + ")";
    }

    public RespDeviceInfo(@NotNull String identifier, long j, @NotNull String name, @NotNull String model, long j2, @NotNull Detail detail, @NotNull String sid, int i, int i2, @NotNull String userId, @NotNull String shareUserId, @NotNull String shareId) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(shareUserId, "shareUserId");
        Intrinsics.checkNotNullParameter(shareId, "shareId");
        this.identifier = identifier;
        this.createTime = j;
        this.name = name;
        this.model = model;
        this.updateTime = j2;
        this.detail = detail;
        this.sid = sid;
        this.status = i;
        this.type = i2;
        this.userId = userId;
        this.shareUserId = shareUserId;
        this.shareId = shareId;
    }

    public /* synthetic */ RespDeviceInfo(String str, long j, String str2, String str3, long j2, Detail detail, String str4, int i, int i2, String str5, String str6, String str7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) == 0 ? j2 : 0L, (i3 & 32) != 0 ? new Detail(null, null, null, null, null, null, 63, null) : detail, (i3 & 64) != 0 ? "" : str4, (i3 & 128) != 0 ? 0 : i, (i3 & 256) == 0 ? i2 : 0, (i3 & 512) != 0 ? "" : str5, (i3 & 1024) != 0 ? "" : str6, (i3 & 2048) == 0 ? str7 : "");
    }
}
