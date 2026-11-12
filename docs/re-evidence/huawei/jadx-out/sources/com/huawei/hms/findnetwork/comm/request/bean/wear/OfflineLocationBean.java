package com.huawei.hms.findnetwork.comm.request.bean.wear;

import com.huawei.hms.findnetwork.comm.request.result.StandbyDeviceResult;
import com.huawei.hms.findnetwork.comm.util.CollectionUtil;
import com.huawei.hms.findnetwork.comm.util.JsonUtils;
import com.huawei.hms.findnetwork.comm.util.MaskUtil;
import com.huawei.hms.findnetwork.comm.util.VerifyUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class OfflineLocationBean {
    public static final int CLOUD_DISCONNECT_LOCATION = 3;
    public static final int LOCAL_DISCONNECT_LOCATION = 4;
    public static final int LOCAL_USER_QUERY_LOCATION = 5;
    public static final int NULL_LOCATION = 0;
    public static final int OFFLINE_LOCATION = 1;
    public static final int STANDBY_LOCATION = 6;
    public static final int USER_QUERY_LOCATION = 2;
    private String aaid;
    private float accuracy;
    private String batteryDescription;
    private int batteryLevel;
    private String buildingId;
    private long disconnectTime;
    private String fid;
    private int floor;
    private int floorAcc;
    private String floorInfo;
    private long foundTime;
    private int indoor;
    private double latitude;
    private double longitude;
    private int mCloudLocationType;
    private String mStandbyDevice;
    private String publicKeyHash;
    private long queryTime;
    private int status;
    private int totalCount;

    public OfflineLocationBean() {
        this.floor = -100;
        this.buildingId = "";
        this.floorInfo = "";
        this.indoor = 0;
        this.floorAcc = 0;
        this.mCloudLocationType = 0;
    }

    public OfflineLocationBean(String str, double d, double d2, int i, String str2, float f, long j, int i2, int i3, String str3, int i4, int i5) {
        this.fid = str;
        this.longitude = d;
        this.latitude = d2;
        this.floor = i;
        this.buildingId = str2;
        this.accuracy = f;
        this.foundTime = j;
        this.status = i2;
        this.mCloudLocationType = i3;
        this.floorInfo = str3;
        this.indoor = i4;
        this.floorAcc = i5;
    }

    public String toString() {
        return "OfflineLocationBean{fid='" + MaskUtil.maskSn(this.fid) + "', accuracy=" + this.accuracy + ", hasFloor= " + VerifyUtil.verifyFloor(this.floor) + ", indoor=" + this.indoor + ", foundTime=" + this.foundTime + ", status=" + this.status + ", queryTime=" + this.queryTime + ", disconnectTime=" + this.disconnectTime + ", mCloudLocationType=" + this.mCloudLocationType + ", batteryLevel=" + this.batteryLevel + ", batteryDescription='" + this.batteryDescription + ", aaid='" + MaskUtil.maskCommon(this.aaid) + "', standbyDevice=" + getMaskedStandbyDevice() + '}';
    }

    public void setTotalCount(int i) {
        this.totalCount = i;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStandbyDevice(String str) {
        this.mStandbyDevice = str;
    }

    public void setQueryTime(long j) {
        this.queryTime = j;
    }

    public void setPublicKeyHash(String str) {
        this.publicKeyHash = str;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public void setIndoor(int i) {
        this.indoor = i;
    }

    public void setFoundTime(long j) {
        this.foundTime = j;
    }

    public void setFloorInfo(String str) {
        this.floorInfo = str;
    }

    public void setFloorAcc(int i) {
        this.floorAcc = i;
    }

    public void setFloor(int i) {
        this.floor = i;
    }

    public void setFid(String str) {
        this.fid = str;
    }

    public void setDisconnectTime(long j) {
        this.disconnectTime = j;
    }

    public void setCloudLocationType(int i) {
        this.mCloudLocationType = i;
    }

    public void setBuildingId(String str) {
        this.buildingId = str;
    }

    public void setBatteryLevel(int i) {
        this.batteryLevel = i;
    }

    public void setBatteryDescription(String str) {
        this.batteryDescription = str;
    }

    public void setAccuracy(float f) {
        this.accuracy = f;
    }

    public void setAaid(String str) {
        this.aaid = str;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public int getStatus() {
        return this.status;
    }

    public String getStandbyDevice() {
        return this.mStandbyDevice;
    }

    public long getQueryTime() {
        return this.queryTime;
    }

    public String getPublicKeyHash() {
        return this.publicKeyHash;
    }

    public String getMaskedStandbyDevice() {
        ArrayList arrayList = new ArrayList();
        List<StandbyDeviceResult> objectList = JsonUtils.getObjectList(this.mStandbyDevice, StandbyDeviceResult.class);
        if (CollectionUtil.isEmpty(objectList)) {
            return JsonUtils.object2Json(arrayList);
        }
        for (StandbyDeviceResult standbyDeviceResult : objectList) {
            arrayList.add("sequence=" + standbyDeviceResult.getSequence() + ", fid=" + MaskUtil.maskSn(standbyDeviceResult.getFid()) + ", status=" + standbyDeviceResult.getStatus());
        }
        return JsonUtils.object2Json(arrayList);
    }

    public double getLongitude() {
        return this.longitude;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public int getIndoor() {
        return this.indoor;
    }

    public long getFoundTime() {
        return this.foundTime;
    }

    public String getFloorInfo() {
        return this.floorInfo;
    }

    public int getFloorAcc() {
        return this.floorAcc;
    }

    public int getFloor() {
        return this.floor;
    }

    public String getFid() {
        return this.fid;
    }

    public long getDisconnectTime() {
        return this.disconnectTime;
    }

    public int getCloudLocationType() {
        return this.mCloudLocationType;
    }

    public String getBuildingId() {
        return this.buildingId;
    }

    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    public String getBatteryDescription() {
        return this.batteryDescription;
    }

    public float getAccuracy() {
        return this.accuracy;
    }

    public String getAaid() {
        return this.aaid;
    }
}
