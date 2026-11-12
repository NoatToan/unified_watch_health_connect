package com.xiaomi.fitness.settingitem.db.entity;

import androidx.room.Entity;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Entity(primaryKeys = {"did", RnReportConst.ApiReport.PARAM_MODULE}, tableName = "settingdevice")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/settingitem/db/entity/SettingDeviceEntity;", "", RnReportConst.ApiReport.PARAM_MODULE, "", "did", "updateTime", "", "lastId", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;JI)V", "getModule", "()Ljava/lang/String;", "getDid", "getUpdateTime", "()J", "setUpdateTime", "(J)V", "getLastId", "()I", "setLastId", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "settingitem_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SettingDeviceEntity {

    @NotNull
    private final String did;
    private int lastId;

    @NotNull
    private final String module;
    private long updateTime;

    public SettingDeviceEntity(@NotNull String module, @NotNull String did, long j, int i) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(did, "did");
        this.module = module;
        this.did = did;
        this.updateTime = j;
        this.lastId = i;
    }

    public static /* synthetic */ SettingDeviceEntity copy$default(SettingDeviceEntity settingDeviceEntity, String str, String str2, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = settingDeviceEntity.module;
        }
        if ((i2 & 2) != 0) {
            str2 = settingDeviceEntity.did;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            j = settingDeviceEntity.updateTime;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            i = settingDeviceEntity.lastId;
        }
        return settingDeviceEntity.copy(str, str3, j2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModule() {
        return this.module;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDid() {
        return this.did;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLastId() {
        return this.lastId;
    }

    @NotNull
    public final SettingDeviceEntity copy(@NotNull String module, @NotNull String did, long updateTime, int lastId) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(did, "did");
        return new SettingDeviceEntity(module, did, updateTime, lastId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingDeviceEntity)) {
            return false;
        }
        SettingDeviceEntity settingDeviceEntity = (SettingDeviceEntity) other;
        return Intrinsics.areEqual(this.module, settingDeviceEntity.module) && Intrinsics.areEqual(this.did, settingDeviceEntity.did) && this.updateTime == settingDeviceEntity.updateTime && this.lastId == settingDeviceEntity.lastId;
    }

    @NotNull
    public final String getDid() {
        return this.did;
    }

    public final int getLastId() {
        return this.lastId;
    }

    @NotNull
    public final String getModule() {
        return this.module;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        return (((((this.module.hashCode() * 31) + this.did.hashCode()) * 31) + Long.hashCode(this.updateTime)) * 31) + Integer.hashCode(this.lastId);
    }

    public final void setLastId(int i) {
        this.lastId = i;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    @NotNull
    public String toString() {
        return "SettingDeviceEntity(module=" + this.module + ", did=" + this.did + ", updateTime=" + this.updateTime + ", lastId=" + this.lastId + ")";
    }
}
