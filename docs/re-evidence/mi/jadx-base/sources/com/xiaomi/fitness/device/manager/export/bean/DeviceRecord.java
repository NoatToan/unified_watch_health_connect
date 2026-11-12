package com.xiaomi.fitness.device.manager.export.bean;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Entity(tableName = "device_record")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/bean/DeviceRecord;", "", "<init>", "()V", "deviceRecordId", "", "getDeviceRecordId", "()I", "setDeviceRecordId", "(I)V", "deviceRecordValue", "", "getDeviceRecordValue", "()Ljava/lang/String;", "setDeviceRecordValue", "(Ljava/lang/String;)V", "did", "getDid", "setDid", "need_check", "getNeed_check", "setNeed_check", "record_time", "", "getRecord_time", "()J", "setRecord_time", "(J)V", "device-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceRecord {

    @PrimaryKey(autoGenerate = true)
    private int deviceRecordId;

    @Nullable
    private String deviceRecordValue;

    @Nullable
    private String did;
    private int need_check;
    private long record_time = System.currentTimeMillis() / ((long) 1000);

    public final int getDeviceRecordId() {
        return this.deviceRecordId;
    }

    @Nullable
    public final String getDeviceRecordValue() {
        return this.deviceRecordValue;
    }

    @Nullable
    public final String getDid() {
        return this.did;
    }

    public final int getNeed_check() {
        return this.need_check;
    }

    public final long getRecord_time() {
        return this.record_time;
    }

    public final void setDeviceRecordId(int i) {
        this.deviceRecordId = i;
    }

    public final void setDeviceRecordValue(@Nullable String str) {
        this.deviceRecordValue = str;
    }

    public final void setDid(@Nullable String str) {
        this.did = str;
    }

    public final void setNeed_check(int i) {
        this.need_check = i;
    }

    public final void setRecord_time(long j) {
        this.record_time = j;
    }
}
