package com.huawei.watchface.mvp.model.datatype;

import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class WatchFaceThemeAlbumInfo {
    private List<String> mBgPathList;
    private String mDefaultTimePosLabel;
    private String mDefaultTimeTextFont;
    private String mDpi;
    private String mSupportMaxBgAmount = "5";
    private List<String> mSvgPathList;
    private String mTextAmbientColor;
    private List<TimePositionRect> mTimePositionList;

    public List<String> getBgPathList() {
        return this.mBgPathList;
    }

    public String getDefaultTimePosLabel() {
        return this.mDefaultTimePosLabel;
    }

    public String getDefaultTimeTextFont() {
        return this.mDefaultTimeTextFont;
    }

    public String getDpi() {
        return this.mDpi;
    }

    public String getSupportMaxBgAmount() {
        return this.mSupportMaxBgAmount;
    }

    public List<String> getSvgPathList() {
        return this.mSvgPathList;
    }

    public String getTextAmbientColor() {
        return this.mTextAmbientColor;
    }

    public List<TimePositionRect> getTimePositionList() {
        return this.mTimePositionList;
    }

    public void setBgPathList(List<String> list) {
        this.mBgPathList = list;
    }

    public void setDefaultTimePosLabel(String str) {
        this.mDefaultTimePosLabel = str;
    }

    public void setDefaultTimeTextFont(String str) {
        this.mDefaultTimeTextFont = str;
    }

    public void setDpi(String str) {
        this.mDpi = str;
    }

    public void setSupportMaxBgAmount(String str) {
        this.mSupportMaxBgAmount = str;
    }

    public void setSvgPathList(List<String> list) {
        this.mSvgPathList = list;
    }

    public void setTextAmbientColor(String str) {
        this.mTextAmbientColor = str;
    }

    public void setTimePositionList(List<TimePositionRect> list) {
        this.mTimePositionList = list;
    }

    public String toString() {
        return "WatchFaceThemeAlbumInfo{mDpi='" + this.mDpi + "', mTimePositionList=" + this.mTimePositionList + ", mDefaultTimePosLabel='" + this.mDefaultTimePosLabel + "', mTextAmbientColor='" + this.mTextAmbientColor + "', mDefaultTimeTextFont='" + this.mDefaultTimeTextFont + "', mSupportMaxBgAmount='" + this.mSupportMaxBgAmount + "', mSvgPathList=" + this.mSvgPathList + ", mBgPathList=" + this.mBgPathList + '}';
    }
}
