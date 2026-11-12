package com.huawei.watchface.mvp.model.datatype;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes20.dex */
public class WatchFaceVideoInfo {
    public static final int LIST_MAX_LENGTH = 20;
    public static final int VIDEO_TYPE_H264_H265 = 1;
    private int dataIndex;
    private int maxVideoNum;
    private int positionIndex;
    private int styleIndex;
    private int videoType = 1;
    private ArrayList<VideoStruct> videoList = new ArrayList<>(20);

    public int getDataIndex() {
        return this.dataIndex;
    }

    public int getMaxVideoNum() {
        return this.maxVideoNum;
    }

    public int getPositionIndex() {
        return this.positionIndex;
    }

    public int getStyleIndex() {
        return this.styleIndex;
    }

    public ArrayList<VideoStruct> getVideoList() {
        return this.videoList;
    }

    public int getVideoType() {
        return this.videoType;
    }

    public void setDataIndex(int i) {
        this.dataIndex = i;
    }

    public void setMaxVideoNum(int i) {
        this.maxVideoNum = i;
    }

    public void setPositionIndex(int i) {
        this.positionIndex = i;
    }

    public void setStyleIndex(int i) {
        this.styleIndex = i;
    }

    public void setVideoList(ArrayList<VideoStruct> arrayList) {
        this.videoList = arrayList;
    }

    public void setVideoType(int i) {
        this.videoType = i;
    }
}
