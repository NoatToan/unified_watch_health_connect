package com.huami.watch.companion.device;

import androidx.annotation.NonNull;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.gson.annotations.SerializedName;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class Device implements Cloneable {
    private static final String m = "Device";

    @SerializedName(IntegrityManager.INTEGRITY_TYPE_ADDRESS)
    private String a;

    @SerializedName("cpuId")
    private String b;

    @SerializedName("bindTimestamp")
    private long e;

    @SerializedName("lastBindingPlatform")
    private String h;

    @SerializedName("isOverseaEdition")
    private boolean j;

    @SerializedName("CPLC")
    private String k;

    @SerializedName("mcuMode")
    private boolean l;

    @SerializedName("SN")
    private String f = "";

    @SerializedName("bindingState")
    private int g = 0;

    @SerializedName("isBound")
    private boolean i = true;

    @SerializedName("state")
    private DeviceState c = new DeviceState();

    @SerializedName("info")
    private DeviceInfo d = new DeviceInfo();

    public Device(@NonNull String str, long j) {
        this.a = str;
        this.e = j;
    }

    public String address() {
        return this.a;
    }

    public String addressShort() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        sb.append(str.substring(str.length() - 5, this.a.length() - 3));
        String str2 = this.a;
        sb.append(str2.substring(str2.length() - 2));
        return sb.toString();
    }

    public long bindTimestamp() {
        return this.e;
    }

    public int getBindingState() {
        return this.g;
    }

    public String getCplc() {
        return this.k;
    }

    public String getCpuId() {
        return this.b;
    }

    public String getLastBindingPlatform() {
        return this.h;
    }

    public String getSN() {
        return this.f;
    }

    public DeviceInfo info() {
        return this.d;
    }

    public boolean isActive() {
        return this.c.isActive();
    }

    public boolean isBound() {
        return this.i;
    }

    public boolean isConnected() {
        return this.c.isConnected();
    }

    public boolean isMcuMode() {
        return this.l;
    }

    public boolean isNeedSyncToCloud() {
        return !this.c.isSyncedToCloud();
    }

    public boolean isOverseaEdition() {
        return this.j;
    }

    public boolean isSyncedToCloud() {
        return this.c.isSyncedToCloud();
    }

    public void setActive(boolean z) {
        this.c.setActive(z);
    }

    public void setBindingState(int i) {
        this.g = i;
    }

    public void setBound(boolean z) {
        this.i = z;
    }

    public void setConnected(boolean z) {
        this.c.setConnected(z);
    }

    public void setCplc(String str) {
        this.k = str;
    }

    public void setCpuId(String str) {
        this.b = str;
    }

    public void setLastBindingPlatform(String str) {
        this.h = str;
    }

    public void setMcuMode(boolean z) {
        this.l = z;
    }

    public void setOverseaEdition(boolean z) {
        this.j = z;
    }

    public void setSN(String str) {
        this.f = str;
    }

    public void setSyncedToCloud(boolean z) {
        this.c.setSyncedToCloud(z);
    }

    public String toString() {
        return "\n<" + this.a + ", " + this.b + ", State Active : " + this.c.isActive() + SearchCriteria.GT;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Device m3413clone() throws CloneNotSupportedException {
        Device device = (Device) super.clone();
        device.d = (DeviceInfo) this.d.clone();
        device.c = (DeviceState) this.c.clone();
        return device;
    }
}
