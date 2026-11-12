package com.huawei.watchface.mvp.model.datatype;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes20.dex */
public class WatchFaceInfo {
    private String description;
    private String digest;

    @SerializedName("dirName")
    private String directoryName;
    private String fileName;
    private int fileSize;
    private String fileType;
    private String form;
    private int installationType;
    private String modifyDate;
    private String permissions;
    private String prompt;
    private String version;
    private String watchFaceName;
    private String watchFaceUuid;

    public void configDescription(String str) {
        this.description = str;
    }

    public void configDigest(String str) {
        this.digest = str;
    }

    public void configDirectoryName(String str) {
        this.directoryName = str;
    }

    public void configFileName(String str) {
        this.fileName = str;
    }

    public void configFileSize(int i) {
        this.fileSize = i;
    }

    public void configFileType(String str) {
        this.fileType = str;
    }

    public void configForm(String str) {
        this.form = str;
    }

    public void configModifyDate(String str) {
        this.modifyDate = str;
    }

    public void configPermissions(String str) {
        this.permissions = str;
    }

    public void configPrompt(String str) {
        this.prompt = str;
    }

    public void configVersion(String str) {
        this.version = str;
    }

    public void configWatchFaceName(String str) {
        this.watchFaceName = str;
    }

    public void configWatchFaceUuid(String str) {
        this.watchFaceUuid = str;
    }

    public String fetchDescription() {
        return this.description;
    }

    public String fetchDigest() {
        return this.digest;
    }

    public String fetchDirectoryName() {
        return this.directoryName;
    }

    public String fetchFileName() {
        return this.fileName;
    }

    public int fetchFileSize() {
        return this.fileSize;
    }

    public String fetchFileType() {
        return this.fileType;
    }

    public String fetchForm() {
        return this.form;
    }

    public String fetchModifyDate() {
        return this.modifyDate;
    }

    public String fetchPermissions() {
        return this.permissions;
    }

    public String fetchPrompt() {
        return this.prompt;
    }

    public String fetchVersion() {
        return this.version;
    }

    public String fetchWatchFaceName() {
        return this.watchFaceName;
    }

    public String fetchWatchFaceUuid() {
        return this.watchFaceUuid;
    }

    public int getInstallationType() {
        return this.installationType;
    }

    public void setInstallationType(int i) {
        this.installationType = i;
    }
}
