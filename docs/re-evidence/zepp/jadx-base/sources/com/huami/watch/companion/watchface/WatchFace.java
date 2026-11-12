package com.huami.watch.companion.watchface;

import androidx.compose.material.TextFieldImplKt;
import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.amazon.identity.auth.device.datastore.DatabaseHelper;
import com.xiaomi.hm.health.device.event.StatEvent;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
@Table(name = "WatchFaces")
public class WatchFace extends Model {

    @Column(name = StatEvent.WF_WATCHFACETYPE)
    public int WatchFaceType;

    @Column(name = "DeviceId")
    public String deviceId;

    @Column(name = "DownloadTime")
    public long downloadTime;

    @Column(name = "HasSlpt")
    public boolean hasSlpt;

    @Column(name = TextFieldImplKt.LabelId)
    public String label;

    @Column(name = DatabaseHelper.appInfo_PackageName)
    public String packageName;

    @Column(name = "PreviewThumb")
    public byte[] previewThumb;

    @Column(name = "ServiceName")
    public String serviceName;

    public WatchFace() {
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public long getDownloadTime() {
        return this.downloadTime;
    }

    public int getWatchFaceType() {
        return this.WatchFaceType;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setDownloadTime(long j) {
        this.downloadTime = j;
    }

    public void setWatchFaceType(int i) {
        this.WatchFaceType = i;
    }

    @Override // com.activeandroid.Model
    public String toString() {
        return super.toString() + " : <PackageName : " + this.packageName + ", ServiceName : " + this.serviceName + ", Label : " + this.label + ", HasSlpt : " + this.hasSlpt + ", DeviceId : " + this.deviceId + ", PreviewThumb : " + this.previewThumb + ",WatchFaceType ：" + this.WatchFaceType + ",downloadTime ：" + this.downloadTime + SearchCriteria.GT;
    }

    public WatchFace(String str, String str2, String str3) {
        this.packageName = str;
        this.serviceName = str2;
        this.label = str3;
    }

    public WatchFace(String str, String str2, String str3, byte[] bArr) {
        this(str, str2, str3, bArr, 0L);
    }

    public WatchFace(String str, String str2, String str3, byte[] bArr, long j) {
        this.packageName = str;
        this.serviceName = str2;
        this.label = str3;
        this.previewThumb = bArr;
        this.downloadTime = j;
    }

    public WatchFace(String str, String str2, String str3, byte[] bArr, boolean z) {
        this(str, str2, str3, bArr, z, 0L);
    }

    public WatchFace(String str, String str2, String str3, byte[] bArr, boolean z, long j) {
        this.packageName = str;
        this.serviceName = str2;
        this.label = str3;
        this.previewThumb = bArr;
        this.hasSlpt = z;
        this.downloadTime = j;
    }
}
