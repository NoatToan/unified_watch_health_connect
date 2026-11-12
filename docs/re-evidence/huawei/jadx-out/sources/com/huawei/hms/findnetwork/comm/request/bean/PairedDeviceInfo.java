package com.huawei.hms.findnetwork.comm.request.bean;

import com.huawei.hms.findnetwork.comm.util.MaskUtil;

/* JADX INFO: loaded from: classes33.dex */
public class PairedDeviceInfo {
    private String accessoryCapabilities;
    private int componentType;
    private String deviceName;
    private String deviceSn;
    private String deviceType;
    private String extendData;
    private String goodsType;
    private String productId;
    private int sequence;
    private String sn;
    private String subProductId;
    private int syncResult;

    public PairedDeviceInfo(String str, String str2, int i, int i2) {
        this.sn = str;
        this.productId = str2;
        this.componentType = i;
        this.syncResult = i2;
    }

    public PairedDeviceInfo(String str, String str2, String str3, String str4) {
        this.sn = str;
        this.deviceType = str2;
        this.deviceName = str3;
        this.goodsType = str4;
    }

    public String toString() {
        return "PairedDeviceInfo{fid='" + MaskUtil.maskSn(this.sn) + "', productId='" + this.productId + "', componentType=" + this.componentType + ", sequence=" + this.sequence + ", accessoryCapabilities='" + this.accessoryCapabilities + "'}";
    }

    public void setSyncResult(int i) {
        this.syncResult = i;
    }

    public void setSubProductId(String str) {
        this.subProductId = str;
    }

    public void setSn(String str) {
        this.sn = str;
    }

    public void setSequence(int i) {
        this.sequence = i;
    }

    public void setProductId(String str) {
        this.productId = str;
    }

    public void setGoodsType(String str) {
        this.goodsType = str;
    }

    public void setExtendData(String str) {
        this.extendData = str;
    }

    public void setDeviceType(String str) {
        this.deviceType = str;
    }

    public void setDeviceSn(String str) {
        this.deviceSn = str;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setComponentType(int i) {
        this.componentType = i;
    }

    public void setAccessoryCapabilities(String str) {
        this.accessoryCapabilities = str;
    }

    public int getSyncResult() {
        return this.syncResult;
    }

    public String getSubProductId() {
        return this.subProductId;
    }

    public String getSn() {
        return this.sn;
    }

    public int getSequence() {
        return this.sequence;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getGoodsType() {
        return this.goodsType;
    }

    public String getExtendData() {
        return this.extendData;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public String getDeviceSn() {
        return this.deviceSn;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public int getComponentType() {
        return this.componentType;
    }

    public String getAccessoryCapabilities() {
        return this.accessoryCapabilities;
    }
}
