package com.huami.watch.companion.device;

import com.google.gson.annotations.SerializedName;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes16.dex */
public class DeviceInfo implements Cloneable {
    public boolean bleAuthAppIdMiFit;
    public String bleAuthKey;

    @SerializedName("huamiModel")
    private String c;

    @SerializedName("huamiBuildNumber")
    private int d;

    @SerializedName("experienceMode")
    private boolean h;

    @SerializedName("v")
    private int m;

    @SerializedName("modelNumber")
    private String a = "";

    @SerializedName("buildNumber")
    private String b = "";

    @SerializedName("batteryLevel")
    private int e = -1;

    @SerializedName("storageAvailable")
    private long f = -1;

    @SerializedName("storageTotal")
    private long g = -1;

    @SerializedName("androidDeviceId")
    private String i = "";

    @SerializedName("localLanguage")
    private String j = "";

    @SerializedName("localRegion")
    private String k = "";

    @SerializedName("buildType")
    private String l = "";

    public int batteryLevel() {
        return this.e;
    }

    public String buildNumber() {
        return this.b;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getAndroidDId() {
        return this.i;
    }

    public String getBuildType() {
        return this.l;
    }

    public int getHuamiBuildNum() {
        return this.d;
    }

    public String getHuamiModel() {
        return this.c;
    }

    public String getLocalLanguage() {
        return this.j;
    }

    public String getLocalRegion() {
        return this.k;
    }

    public boolean isExperienceMode() {
        return this.h;
    }

    public String modelNumber() {
        return this.a;
    }

    public void setAndroidDId(String str) {
        this.i = str;
    }

    public void setBatteryLevel(int i) {
        this.e = i;
    }

    public void setBuildNumber(String str) {
        this.b = str;
    }

    public void setBuildType(String str) {
        this.l = str;
    }

    public void setExperienceMode(boolean z) {
        this.h = z;
    }

    public void setHuamiBuildNum(int i) {
        this.d = i;
    }

    public void setHuamiModel(String str) {
        this.c = str;
    }

    public void setLocalLanguage(String str) {
        this.j = str;
    }

    public void setLocalRegion(String str) {
        this.k = str;
    }

    public void setModelNumber(String str) {
        this.a = str;
    }

    public void setStorageAvailable(long j) {
        this.f = j;
    }

    public void setStorageTotal(long j) {
        this.g = j;
    }

    public void setVersion(int i) {
        this.m = i;
    }

    public long storageAvailable() {
        return this.f;
    }

    public long storageTotal() {
        return this.g;
    }

    public String toString() {
        return "<ModelNumber: '" + this.a + "', BuildNumber: '" + this.b + "', HuamiModel: '" + this.c + "', HuamiBuildNum: " + this.d + ", BatteryLevel: " + this.e + ", StorageAvailable: " + this.f + ", StorageTotal: " + this.g + ", IsExperienceMode: " + this.h + ", AndroidDId: '" + this.i + "', BleAuthKey: '" + this.bleAuthKey + "', Version: " + this.m + Typography.greater;
    }

    public int version() {
        return this.m;
    }
}
