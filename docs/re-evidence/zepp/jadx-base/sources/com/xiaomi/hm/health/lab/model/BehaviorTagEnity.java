package com.xiaomi.hm.health.lab.model;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class BehaviorTagEnity implements Serializable {
    private static final long serialVersionUID = 7526471155622776147L;
    private long a;
    private String b;
    private String c;
    private int d;
    private HMDeviceType e;
    private HMDeviceSource f;
    private String g;
    private byte[] h = null;
    private int i;
    private long j;
    private long k;
    private long l;
    private int m;
    private int n;
    private String o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private List<SensorRecordsEnity> u;

    public static class TAG_DATA_UPLOAD_STATUS implements Serializable {
        public static final int TAGGING_TOO_SHORT = -2;
        public static final int UN_START = 0;
        public static final int UN_ZIP = -1;
        public static final int UPLOADING = 1;
        public static final int UPLOAD_CANCLE = 5;
        public static final int UPLOAD_DATA_MISSED = 21;
        public static final int UPLOAD_FAIL = 2;
        public static final int UPLOAD_SUCCESS = 3;
    }

    public BehaviorTagEnity(int i, int i2, int i3, String str, boolean z, boolean z2) {
        this.d = i;
        this.m = i2;
        this.n = i3;
        this.b = str;
        this.p = z;
        this.q = z2;
    }

    public void addSensorData(SensorRecordsEnity sensorRecordsEnity) {
        if (this.u == null) {
            this.u = new ArrayList();
        }
        this.u.add(sensorRecordsEnity);
    }

    public void clearSensorData() {
        List<SensorRecordsEnity> list = this.u;
        if (list != null) {
            list.clear();
        }
    }

    public int getBehaviorBigImgResId() {
        return this.n;
    }

    public int getBehaviorImgResId() {
        return this.m;
    }

    public String getBehaviorKey() {
        return this.b;
    }

    public int getBehaviorNameStrId() {
        return this.d;
    }

    public byte[] getBytesOfDeviceID() {
        return this.h;
    }

    public String getCustomizeBehaviorName() {
        return this.o;
    }

    public String getDeviceId() {
        return this.g;
    }

    public HMDeviceType getDeviceType() {
        return this.e;
    }

    public long getEndClickTime() {
        return this.k;
    }

    public HMDeviceSource getHmDeviceSource() {
        return this.f;
    }

    public long getLabActionId() {
        return this.a;
    }

    public int getProductVersion() {
        return this.t;
    }

    public int getProtocolVersion() {
        return this.s;
    }

    public SensorRecordsEnity getSensorData(String str, long j) {
        List<SensorRecordsEnity> list = this.u;
        if (list == null || list.size() <= 0) {
            return null;
        }
        for (SensorRecordsEnity sensorRecordsEnity : this.u) {
            if (sensorRecordsEnity.getSensorType().equals(str) && j == sensorRecordsEnity.getStartTaggingTime()) {
                return sensorRecordsEnity;
            }
        }
        return null;
    }

    public List<SensorRecordsEnity> getSensorRecordsEnityList() {
        return this.u;
    }

    public long getStartClickTime() {
        return this.j;
    }

    public long getTimeCount() {
        return this.l;
    }

    public int getTimeZone() {
        return this.i;
    }

    public String getUserId() {
        return this.c;
    }

    public int getVersionCode() {
        return this.r;
    }

    public boolean isSupportShoes() {
        return this.p;
    }

    public boolean isUseDominantHand() {
        return this.q;
    }

    public void setBehaviorBigImgResId(int i) {
        this.n = i;
    }

    public void setBehaviorImgResId(int i) {
        this.m = i;
    }

    public void setBehaviorKey(String str) {
        this.b = str;
    }

    public void setBehaviorNameStrId(int i) {
        this.d = i;
    }

    public void setBytesOfDeviceID(byte[] bArr) {
        this.h = bArr;
    }

    public void setCustomizeBehaviorName(String str) {
        this.o = str;
    }

    public void setDeviceId(String str) {
        this.g = str;
    }

    public void setDeviceType(HMDeviceType hMDeviceType) {
        this.e = hMDeviceType;
    }

    public void setEndClickTime(long j) {
        this.k = j;
    }

    public void setHmDeviceSource(HMDeviceSource hMDeviceSource) {
        this.f = hMDeviceSource;
    }

    public void setLabActionId(long j) {
        this.a = j;
    }

    public void setProductVersion(int i) {
        this.t = i;
    }

    public void setProtocolVersion(int i) {
        this.s = i;
    }

    public void setSensorRecordsEnityList(List<SensorRecordsEnity> list) {
        this.u = list;
    }

    public void setStartClickTime(long j) {
        this.j = j;
    }

    public void setSupportShoes(boolean z) {
        this.p = z;
    }

    public void setTimeCount(long j) {
        this.l = j;
    }

    public void setTimeZone(int i) {
        this.i = i;
    }

    public void setUseDominantHand(boolean z) {
        this.q = z;
    }

    public void setUserId(String str) {
        this.c = str;
    }

    public void setVersionCode(int i) {
        this.r = i;
    }

    public String toString() {
        return "BehaviorTagEnity{labActionId=" + this.a + ", behaviorKey='" + this.b + "', userId=" + this.c + ", behaviorNameStrId=" + this.d + ", deviceType=" + this.e + ", hmDeviceSource=" + this.f + ", deviceId='" + this.g + "', bytesOfDeviceID=" + Arrays.toString(this.h) + ", startClickTime=" + this.j + ", endClickTime=" + this.k + ", timeCount=" + this.l + ", behaviorImgResId=" + this.m + ", behaviorBigImgResId=" + this.n + ", customizeBehaviorName='" + this.o + "', isSupportShoes=" + this.p + ", isUseDominantHand=" + this.q + ", versionCode=" + this.r + ", sensorRecordsEnityList=" + this.u + '}';
    }
}
