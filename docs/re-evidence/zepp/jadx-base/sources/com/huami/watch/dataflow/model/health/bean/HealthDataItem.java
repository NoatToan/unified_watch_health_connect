package com.huami.watch.dataflow.model.health.bean;

import androidx.annotation.NonNull;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.huami.watch.dataflow.model.DataItem;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
@Table(name = "health_data_did")
public class HealthDataItem extends DataItem {

    @Column(name = "data")
    private byte[] data;

    @Column(indexGroups = {"date"}, name = "did", onUniqueConflicts = {Column.ConflictAction.ABORT}, uniqueGroups = {"group"})
    private String deviceId;
    private int deviceSource;

    @Column(name = DataItem.COLUMN_HEART_RATE_DATA)
    private byte[] heartRateData;

    @Column(name = "timezone")
    private String timezone;

    public HealthDataItem() {
    }

    public String getDID() {
        return this.deviceId;
    }

    public byte[] getData() {
        return this.data;
    }

    public int getDeviceSource() {
        return this.deviceSource;
    }

    public byte[] getHeartRateData() {
        return this.heartRateData;
    }

    public void setDID(String str) {
        this.deviceId = str;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setDeviceSource(int i) {
        this.deviceSource = i;
    }

    public void setHeartRateData(byte[] bArr) {
        this.heartRateData = bArr;
    }

    @Override // com.activeandroid.Model
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n<Date : ");
        sb.append(this.date);
        sb.append(", DID : ");
        sb.append(this.deviceId);
        sb.append(", DeviceSource : ");
        sb.append(this.deviceSource);
        sb.append(", Summary Raw : ");
        sb.append(this.summary);
        sb.append(", Data : ");
        byte[] bArr = this.data;
        sb.append(bArr != null ? String.valueOf(bArr.length) : "null");
        sb.append(", HearRateData : ");
        byte[] bArr2 = this.heartRateData;
        sb.append(bArr2 != null ? String.valueOf(bArr2.length) : "null");
        sb.append(SearchCriteria.GT);
        return sb.toString();
    }

    public HealthDataItem(@NonNull String str) {
        this.date = str;
    }
}
