package com.xiaomi.fitness.electronic.scale.export.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\rHÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003Jc\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\rHÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u000e\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/bean/DeviceInfo;", "", "identifier", "", "createTime", "", "name", "model", "updateTime", "detail", "Lcom/xiaomi/fitness/electronic/scale/export/bean/Detail;", "sid", "status", "", "type", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JLcom/xiaomi/fitness/electronic/scale/export/bean/Detail;Ljava/lang/String;II)V", "getIdentifier", "()Ljava/lang/String;", "setIdentifier", "(Ljava/lang/String;)V", "getCreateTime", "()J", "setCreateTime", "(J)V", "getName", "setName", "getModel", "setModel", "getUpdateTime", "setUpdateTime", "getDetail", "()Lcom/xiaomi/fitness/electronic/scale/export/bean/Detail;", "setDetail", "(Lcom/xiaomi/fitness/electronic/scale/export/bean/Detail;)V", "getSid", "setSid", "getStatus", "()I", "setStatus", "(I)V", "getType", "setType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeviceInfo {
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
    private String sid;
    private int status;
    private int type;
    private long updateTime;

    public DeviceInfo() {
        this(null, 0L, null, null, 0L, null, null, 0, 0, 511, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
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
    public final DeviceInfo copy(@NotNull String identifier, long createTime, @NotNull String name, @NotNull String model, long updateTime, @NotNull Detail detail, @NotNull String sid, int status, int type) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(sid, "sid");
        return new DeviceInfo(identifier, createTime, name, model, updateTime, detail, sid, status, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) other;
        return Intrinsics.areEqual(this.identifier, deviceInfo.identifier) && this.createTime == deviceInfo.createTime && Intrinsics.areEqual(this.name, deviceInfo.name) && Intrinsics.areEqual(this.model, deviceInfo.model) && this.updateTime == deviceInfo.updateTime && Intrinsics.areEqual(this.detail, deviceInfo.detail) && Intrinsics.areEqual(this.sid, deviceInfo.sid) && this.status == deviceInfo.status && this.type == deviceInfo.type;
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

    public int hashCode() {
        return (((((((((((((((this.identifier.hashCode() * 31) + Long.hashCode(this.createTime)) * 31) + this.name.hashCode()) * 31) + this.model.hashCode()) * 31) + Long.hashCode(this.updateTime)) * 31) + this.detail.hashCode()) * 31) + this.sid.hashCode()) * 31) + Integer.hashCode(this.status)) * 31) + Integer.hashCode(this.type);
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

    @NotNull
    public String toString() {
        return "DeviceInfo(identifier=" + this.identifier + ", createTime=" + this.createTime + ", name=" + this.name + ", model=" + this.model + ", updateTime=" + this.updateTime + ", detail=" + this.detail + ", sid=" + this.sid + ", status=" + this.status + ", type=" + this.type + ")";
    }

    public DeviceInfo(@NotNull String identifier, long j, @NotNull String name, @NotNull String model, long j2, @NotNull Detail detail, @NotNull String sid, int i, int i2) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(detail, "detail");
        Intrinsics.checkNotNullParameter(sid, "sid");
        this.identifier = identifier;
        this.createTime = j;
        this.name = name;
        this.model = model;
        this.updateTime = j2;
        this.detail = detail;
        this.sid = sid;
        this.status = i;
        this.type = i2;
    }

    public /* synthetic */ DeviceInfo(String str, long j, String str2, String str3, long j2, Detail detail, String str4, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) == 0 ? j2 : 0L, (i3 & 32) != 0 ? new Detail(null, null, null, null, null, null, 63, null) : detail, (i3 & 64) == 0 ? str4 : "", (i3 & 128) != 0 ? 0 : i, (i3 & 256) == 0 ? i2 : 0);
    }
}
