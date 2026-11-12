package com.huawei.watchface.mvp.model.datatype;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes20.dex */
public class WatchFacePhotoInfo {
    public static final int BACKGROUND_TYPE_BIN = 2;
    public static final int BACKGROUND_TYPE_PNG = 1;
    public static final int LIST_MAX_LENGTH = 20;
    private int mBackgroundType;
    private int mDataIndex;
    private boolean mIsSupportIntellectColor;
    private int mMaxBackgroundImage;
    private int mPortPositionIndex;
    private int mPortraitMode;
    private int mPositionIndex;
    private int mStyleIndex;
    private ArrayList<String> mBackgroundList = new ArrayList<>(20);
    private ArrayList<Integer> mPortPositionIndexList = new ArrayList<>(20);
    private ArrayList<Integer> mPortraitModeList = new ArrayList<>(20);
    private int mBgImageOption = 0;

    public ArrayList<String> getBackgroundList() {
        return this.mBackgroundList;
    }

    public int getBackgroundType() {
        return this.mBackgroundType;
    }

    public int getBgImageOption() {
        return this.mBgImageOption;
    }

    public int getDataIndex() {
        return this.mDataIndex;
    }

    public int getMaxBackgroundImage() {
        return this.mMaxBackgroundImage;
    }

    public int getMaxBackgroundImages() {
        return this.mMaxBackgroundImage;
    }

    public int getPortPositionIndex() {
        return this.mPortPositionIndex;
    }

    public ArrayList<Integer> getPortPositionIndexList() {
        return this.mPortPositionIndexList;
    }

    public int getPortraitMode() {
        return this.mPortraitMode;
    }

    public ArrayList<Integer> getPortraitModeList() {
        return this.mPortraitModeList;
    }

    public int getPositionIndex() {
        return this.mPositionIndex;
    }

    public int getStyleIndex() {
        return this.mStyleIndex;
    }

    public boolean isSupportIntellectColor() {
        return this.mIsSupportIntellectColor;
    }

    public void setBackgroundList(ArrayList<String> arrayList) {
        this.mBackgroundList = arrayList;
    }

    public void setBackgroundType(int i) {
        this.mBackgroundType = i;
    }

    public void setBgImageOption(int i) {
        this.mBgImageOption = i;
    }

    public void setDataIndex(int i) {
        this.mDataIndex = i;
    }

    public void setMaxBackgroundImage(int i) {
        this.mMaxBackgroundImage = i;
    }

    public void setMaxBackgroundImages(int i) {
        this.mMaxBackgroundImage = i;
    }

    public void setPortPositionIndex(int i) {
        this.mPortPositionIndex = i;
    }

    public void setPortPositionIndexList(ArrayList<Integer> arrayList) {
        this.mPortPositionIndexList = arrayList;
    }

    public void setPortraitMode(int i) {
        this.mPortraitMode = i;
    }

    public void setPortraitModeList(ArrayList<Integer> arrayList) {
        this.mPortraitModeList = arrayList;
    }

    public void setPositionIndex(int i) {
        this.mPositionIndex = i;
    }

    public void setStyleIndex(int i) {
        this.mStyleIndex = i;
    }

    public void setSupportIntellectColor(boolean z) {
        this.mIsSupportIntellectColor = z;
    }
}
