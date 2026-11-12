package com.huawei.maps.offlinedata.handler.dto;

/* JADX INFO: loaded from: classes40.dex */
public class DecompressParams {
    private boolean isDeleteOld;
    private boolean isDeleteZip;
    private String targetPath;
    private String zipFile;

    public String getTargetPath() {
        return this.targetPath;
    }

    public String getZipFile() {
        return this.zipFile;
    }

    public boolean isDeleteOld() {
        return this.isDeleteOld;
    }

    public boolean isDeleteZip() {
        return this.isDeleteZip;
    }

    public void setDeleteOld(boolean z) {
        this.isDeleteOld = z;
    }

    public void setDeleteZip(boolean z) {
        this.isDeleteZip = z;
    }

    public void setTargetPath(String str) {
        this.targetPath = str;
    }

    public void setZipFile(String str) {
        this.zipFile = str;
    }
}
