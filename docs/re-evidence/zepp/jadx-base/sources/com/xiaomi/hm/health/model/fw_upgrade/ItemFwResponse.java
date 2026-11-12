package com.xiaomi.hm.health.model.fw_upgrade;

import com.alipay.sdk.m.u.i;

/* JADX INFO: loaded from: classes21.dex */
public class ItemFwResponse {
    private String app_version;
    private String change_log;
    private int device_type;
    private String downLoadSdcardUrl;
    private fileInfo fileInfo;
    private String file_url;
    private String firmware_version;
    private int firmware_version_code;
    private String hr_version;
    private int hr_version_code;
    private boolean isNotVaild;
    private String md5_content;
    private String productVersion;
    private singleFileInfo singleFileInfo;
    private int source;
    private String upgrade_type;

    public static class additionalInfo {
        public file firmware;
        public file font;
        public file gps;
        public file resource;
    }

    public static class file {
        public String fileUrl;
        public String md5;
        public String name;
        public String size;
        public int upgrade;
        public String version;
    }

    public static class fileInfo {
        public additionalInfo additionalInfo;
        public String firmwareType;
    }

    public static class singleFileInfo {
        public String firmwareType;
        public int upgrade;
    }

    public String getApp_version() {
        return this.app_version;
    }

    public String getChange_log() {
        return this.change_log;
    }

    public int getDevice_type() {
        return this.device_type;
    }

    public String getDownLoadSdcardUrl() {
        return this.downLoadSdcardUrl;
    }

    public fileInfo getFileInfo() {
        return this.fileInfo;
    }

    public String getFile_url() {
        return this.file_url;
    }

    public String getFirmware_version() {
        return this.firmware_version;
    }

    public int getFirmware_version_code() {
        return this.firmware_version_code;
    }

    public String getHr_version() {
        return this.hr_version;
    }

    public int getHr_version_code() {
        return this.hr_version_code;
    }

    public String getMd5_content() {
        return this.md5_content;
    }

    public String getProductVersion() {
        return this.productVersion;
    }

    public singleFileInfo getSingleFileInfo() {
        return this.singleFileInfo;
    }

    public int getSource() {
        return this.source;
    }

    public String getUpgrade_type() {
        return this.upgrade_type;
    }

    public boolean isNotVaild() {
        return this.isNotVaild;
    }

    public void setApp_version(String str) {
        this.app_version = str;
    }

    public void setChange_log(String str) {
        this.change_log = str;
    }

    public void setDevice_type(int i) {
        this.device_type = i;
    }

    public void setDownLoadSdcardUrl(String str) {
        this.downLoadSdcardUrl = str;
    }

    public void setFileInfo(fileInfo fileinfo) {
        this.fileInfo = fileinfo;
    }

    public void setFile_url(String str) {
        this.file_url = str;
    }

    public void setFirmware_version(String str) {
        this.firmware_version = str;
    }

    public void setFirmware_version_code(int i) {
        this.firmware_version_code = i;
    }

    public void setHr_version(String str) {
        this.hr_version = str;
    }

    public void setHr_version_code(int i) {
        this.hr_version_code = i;
    }

    public void setMd5_content(String str) {
        this.md5_content = str;
    }

    public void setNotVaild(boolean z) {
        this.isNotVaild = z;
    }

    public void setProductVersion(String str) {
        this.productVersion = str;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setUpgrade_type(String str) {
        this.upgrade_type = str;
    }

    public String toString() {
        return "ItemFwResponse { app_version = " + this.app_version + ", file_url = " + this.file_url + ", firmware_version = " + this.firmware_version + ", hr_version = " + this.hr_version + ", md5_content = " + this.md5_content + ", productVersion = " + this.productVersion + ", device_type = " + this.device_type + ", change_log = " + this.change_log + ", source = " + this.source + ", isNotVaild = " + this.isNotVaild + ", firmware_version_code = " + this.firmware_version_code + ", hr_version_code = " + this.hr_version_code + i.d;
    }
}
