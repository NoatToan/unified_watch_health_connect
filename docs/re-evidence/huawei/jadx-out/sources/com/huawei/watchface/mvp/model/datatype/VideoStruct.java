package com.huawei.watchface.mvp.model.datatype;

/* JADX INFO: loaded from: classes20.dex */
public class VideoStruct {
    private int videoAttribute;
    private String videoName;
    private String videoPreviewName;
    private int videoStatus;

    public VideoStruct() {
    }

    public int getVideoAttribute() {
        return this.videoAttribute;
    }

    public String getVideoName() {
        return this.videoName;
    }

    public String getVideoPreviewName() {
        return this.videoPreviewName;
    }

    public int getVideoStatus() {
        return this.videoStatus;
    }

    public void setVideoAttribute(int i) {
        this.videoAttribute = i;
    }

    public void setVideoName(String str) {
        this.videoName = str;
    }

    public void setVideoPreviewName(String str) {
        this.videoPreviewName = str;
    }

    public void setVideoStatus(int i) {
        this.videoStatus = i;
    }

    public String toString() {
        return "VideoStruct{videoName='" + this.videoName + "', videoPreviewName='" + this.videoPreviewName + "', videoAttribute=" + this.videoAttribute + ", videoStatus=" + this.videoStatus + '}';
    }

    public VideoStruct(String str, String str2, int i, int i2) {
        this.videoName = str;
        this.videoPreviewName = str2;
        this.videoAttribute = i;
        this.videoStatus = i2;
    }
}
