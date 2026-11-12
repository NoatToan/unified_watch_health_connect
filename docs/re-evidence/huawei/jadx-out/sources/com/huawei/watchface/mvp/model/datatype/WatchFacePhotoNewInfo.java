package com.huawei.watchface.mvp.model.datatype;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes20.dex */
public class WatchFacePhotoNewInfo {
    public static final int LIST_MAX_LENGTH = 20;
    private int backgroundImageOption;
    private int backgroundImageType;
    public int canIntellectColor;
    private int maxBackgroundImages;
    private int positionIndex;
    private int styleIndex;
    private int valueTypeIndex;
    private ArrayList<BackgroundBean> backgroundList = new ArrayList<>(20);
    private ArrayList<String> dataList = new ArrayList<>(20);

    public class BackgroundBean {
        private int backgroundIndex;
        private String backgroundName;
        private String backgroundPath;
        private int portraitMode;

        public BackgroundBean(WatchFacePhotoNewInfo watchFacePhotoNewInfo) {
        }

        public int getBackgroundIndex() {
            return this.backgroundIndex;
        }

        public String getBackgroundName() {
            return this.backgroundName;
        }

        public String getBackgroundPath() {
            return this.backgroundPath;
        }

        public int getPortraitMode() {
            return this.portraitMode;
        }

        public void setBackgroundIndex(int i) {
            this.backgroundIndex = i;
        }

        public void setBackgroundName(String str) {
            this.backgroundName = str;
        }

        public void setBackgroundPath(String str) {
            this.backgroundPath = str;
        }

        public void setPortraitMode(int i) {
            this.portraitMode = i;
        }
    }

    public int getBackgroundImageOption() {
        return this.backgroundImageOption;
    }

    public int getBackgroundImageType() {
        return this.backgroundImageType;
    }

    public ArrayList<BackgroundBean> getBackgroundList() {
        return this.backgroundList;
    }

    public int getCanIntellectColor() {
        return this.canIntellectColor;
    }

    public ArrayList<String> getDataList() {
        return this.dataList;
    }

    public int getMaxBackgroundImages() {
        return this.maxBackgroundImages;
    }

    public int getPositionIndex() {
        return this.positionIndex;
    }

    public int getStyleIndex() {
        return this.styleIndex;
    }

    public int getValueTypeIndex() {
        return this.valueTypeIndex;
    }

    public void setBackgroundImageOption(int i) {
        this.backgroundImageOption = i;
    }

    public void setBackgroundImageType(int i) {
        this.backgroundImageType = i;
    }

    public void setBackgroundList(ArrayList<BackgroundBean> arrayList) {
        this.backgroundList = arrayList;
    }

    public void setCanIntellectColor(int i) {
        this.canIntellectColor = i;
    }

    public void setDataList(ArrayList<String> arrayList) {
        this.dataList = arrayList;
    }

    public void setMaxBackgroundImages(int i) {
        this.maxBackgroundImages = i;
    }

    public void setPositionIndex(int i) {
        this.positionIndex = i;
    }

    public void setStyleIndex(int i) {
        this.styleIndex = i;
    }

    public void setValueTypeIndex(int i) {
        this.valueTypeIndex = i;
    }
}
