package com.huawei.watchface.videoedit.param;

/* JADX INFO: loaded from: classes20.dex */
public class ThumbnailViewConfig {
    private int duration;
    private String filePath = "";
    private String fileUri;
    private int height;
    private int width;

    public int getDuration() {
        return this.duration;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public String getFileUri() {
        return this.fileUri;
    }

    public int getVideoHeight() {
        return this.height;
    }

    public int getVideoWidth() {
        return this.width;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setFilePath(String str) {
        this.filePath = str;
    }

    public void setFileUri(String str) {
        this.fileUri = str;
    }

    public void setVideoHeight(int i) {
        this.height = i;
    }

    public void setVideoWidth(int i) {
        this.width = i;
    }
}
