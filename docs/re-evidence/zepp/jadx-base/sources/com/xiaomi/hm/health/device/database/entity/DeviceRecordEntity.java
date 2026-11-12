package com.xiaomi.hm.health.device.database.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Entity(tableName = "DeviceRecord")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003JE\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u000b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000e\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010\u001a¨\u0006+"}, d2 = {"Lcom/xiaomi/hm/health/device/database/entity/DeviceRecordEntity;", "", "", "component1", "component2", "", "component3", "", "component4", "component5", "component6", "id", "recordTime", "duration", "localPath", "serverPath", "fileSize", "copy", "toString", "hashCode", "other", "", "equals", "a", "J", "getId", "()J", "b", "getRecordTime", "c", LogUtil.I, "getDuration", "()I", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getLocalPath", "()Ljava/lang/String;", "e", "getServerPath", "f", "getFileSize", "<init>", "(JJILjava/lang/String;Ljava/lang/String;J)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DeviceRecordEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long recordTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int duration;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String localPath;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String serverPath;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final long fileSize;

    public DeviceRecordEntity(long j, long j2, int i, @NotNull String str, @NotNull String str2, long j3) {
        this.id = j;
        this.recordTime = j2;
        this.duration = i;
        this.localPath = str;
        this.serverPath = str2;
        this.fileSize = j3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getRecordTime() {
        return this.recordTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLocalPath() {
        return this.localPath;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getServerPath() {
        return this.serverPath;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getFileSize() {
        return this.fileSize;
    }

    @NotNull
    public final DeviceRecordEntity copy(long id, long recordTime, int duration, @NotNull String localPath, @NotNull String serverPath, long fileSize) {
        return new DeviceRecordEntity(id, recordTime, duration, localPath, serverPath, fileSize);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceRecordEntity)) {
            return false;
        }
        DeviceRecordEntity deviceRecordEntity = (DeviceRecordEntity) other;
        return this.id == deviceRecordEntity.id && this.recordTime == deviceRecordEntity.recordTime && this.duration == deviceRecordEntity.duration && Intrinsics.areEqual(this.localPath, deviceRecordEntity.localPath) && Intrinsics.areEqual(this.serverPath, deviceRecordEntity.serverPath) && this.fileSize == deviceRecordEntity.fileSize;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getLocalPath() {
        return this.localPath;
    }

    public final long getRecordTime() {
        return this.recordTime;
    }

    @NotNull
    public final String getServerPath() {
        return this.serverPath;
    }

    public int hashCode() {
        return (((((((((b.a(this.id) * 31) + b.a(this.recordTime)) * 31) + this.duration) * 31) + this.localPath.hashCode()) * 31) + this.serverPath.hashCode()) * 31) + b.a(this.fileSize);
    }

    @NotNull
    public String toString() {
        return "DeviceRecordEntity(id=" + this.id + ", recordTime=" + this.recordTime + ", duration=" + this.duration + ", localPath=" + this.localPath + ", serverPath=" + this.serverPath + ", fileSize=" + this.fileSize + ")";
    }
}
