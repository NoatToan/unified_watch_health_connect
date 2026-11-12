package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice;

import defpackage.qqt;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class StickerEventDTO {
    private List<FileInfo> fileInfo;
    private Integer request;
    private Integer result;

    public List<FileInfo> getFileInfo() {
        return this.fileInfo;
    }

    public void setFileInfo(List<FileInfo> list) {
        this.fileInfo = list;
    }

    public Integer getResult() {
        return this.result;
    }

    public void setResult(Integer num) {
        this.result = num;
    }

    public Integer getRequest() {
        return this.request;
    }

    public void setRequest(Integer num) {
        this.request = num;
    }

    public static String dumps(StickerEventDTO stickerEventDTO) {
        return qqt.b(stickerEventDTO);
    }

    public static StickerEventDTO loads(String str) {
        return (StickerEventDTO) qqt.e(str, StickerEventDTO.class);
    }

    /* JADX INFO: loaded from: classes38.dex */
    public static class FileInfo {
        private String fileName;
        private int fileType;

        public int getFileType() {
            return this.fileType;
        }

        public void setFileType(int i) {
            this.fileType = i;
        }

        public String getFileName() {
            return this.fileName;
        }

        public void setFileName(String str) {
            this.fileName = str;
        }
    }
}
