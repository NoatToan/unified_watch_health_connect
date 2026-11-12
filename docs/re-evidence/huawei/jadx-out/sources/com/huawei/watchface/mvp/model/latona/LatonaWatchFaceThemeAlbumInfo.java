package com.huawei.watchface.mvp.model.latona;

import com.huawei.watchface.mvp.model.datatype.VideoStruct;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class LatonaWatchFaceThemeAlbumInfo {
    private static final int LIST_MAX_LENGTH = 20;
    private static final String TAG = "LatonaWatchFaceThemeAlbumInfo";
    private String mBackgroundIndex;
    private int mBackgroundType;
    private long mClockTypeCapability;
    private long mCurStyleIndex;
    private String mDataIndex;
    private String mDefaultBackground;
    private String mDefaultBackgroundPath;
    private String mHandStyleIndex;
    private boolean mIsClickBackToSave;
    private boolean mIsSupportBackgroundOption;
    private boolean mIsSupportDataOption;
    private boolean mIsSupportHandStyleOption;
    private boolean mIsSupportIntellectColor;
    private boolean mIsSupportPositionOption;
    private boolean mIsSupportStyleOption;
    private int mMaxStyleNum;
    private String mPortPositionIndex;
    private String mPortraitMode;
    private String mPositionIndex;
    private int mStyleCount;
    private String mStyleIndex;
    private int mWearStyleType;
    private long mWearTypeCapability;
    private String mSupportMaxBgAmount = "5";
    private String mMaxCountLocalString = "5";
    private ArrayList<String> mBackgroundList = new ArrayList<>(20);
    private ArrayList<String> mPortraitModeList = new ArrayList<>(20);
    private List<String> mWatchFaceBgPathList = new ArrayList(20);
    private ArrayList<String> mPortPositionIndexList = new ArrayList<>(20);
    private List<PositionOptionalConfig> mLatonaPositionList = new ArrayList(20);
    private List<StyleOptionalConfig> mStyleResPathList = new ArrayList(20);
    private List<DataOptionalConfig> mDataResPathList = new ArrayList(20);
    private List<BackgroundOptionalConfig> mDefaultBackgroundOptionalConfigList = new ArrayList(20);
    private List<BackgroundOptionalConfig> mBackgroundOptionalConfigList = new ArrayList(20);
    private List<HandStyleOptionalConfig> mHandStyleResPathList = new ArrayList(20);
    private ArrayList<VideoStruct> mVideoStructList = new ArrayList<>(20);
    private ArrayList<VideoStruct> mDefaultVideoStructList = new ArrayList<>(20);

    public String getBackgroundIndex() {
        return this.mBackgroundIndex;
    }

    public ArrayList<String> getBackgroundList() {
        return this.mBackgroundList;
    }

    public List<BackgroundOptionalConfig> getBackgroundOptionalConfigList() {
        return this.mBackgroundOptionalConfigList;
    }

    public int getBackgroundType() {
        return this.mBackgroundType;
    }

    public long getClockTypeCapability() {
        return this.mClockTypeCapability;
    }

    public long getCurStyleIndex() {
        return this.mCurStyleIndex;
    }

    public String getDataIndex() {
        return this.mDataIndex;
    }

    public List<DataOptionalConfig> getDataResPathList() {
        return this.mDataResPathList;
    }

    public String getDefaultBackground() {
        return this.mDefaultBackground;
    }

    public List<BackgroundOptionalConfig> getDefaultBackgroundOptionalConfigList() {
        return this.mDefaultBackgroundOptionalConfigList;
    }

    public String getDefaultBackgroundPath() {
        return this.mDefaultBackgroundPath;
    }

    public ArrayList<VideoStruct> getDefaultVideoStructList() {
        return this.mDefaultVideoStructList;
    }

    public String getHandStyleIndex() {
        return this.mHandStyleIndex;
    }

    public List<HandStyleOptionalConfig> getHandStyleResPathList() {
        return this.mHandStyleResPathList;
    }

    public List<PositionOptionalConfig> getLatonaPositionList() {
        return this.mLatonaPositionList;
    }

    public int getMaxStyleNum() {
        return this.mMaxStyleNum;
    }

    public String getPortPositionIndex() {
        return this.mPortPositionIndex;
    }

    public String getPortraitMode() {
        return this.mPortraitMode;
    }

    public String getPositionIndex() {
        return this.mPositionIndex;
    }

    public int getStyleCount() {
        return this.mStyleCount;
    }

    public String getStyleIndex() {
        return this.mStyleIndex;
    }

    public List<StyleOptionalConfig> getStyleResPathList() {
        return this.mStyleResPathList;
    }

    public String getSupportMaxBgAmount() {
        return this.mSupportMaxBgAmount;
    }

    public ArrayList<VideoStruct> getVideoStructList() {
        return this.mVideoStructList;
    }

    public List<String> getWatchFaceBgPathList() {
        return this.mWatchFaceBgPathList;
    }

    public int getWearStyleType() {
        return this.mWearStyleType;
    }

    public long getWearTypeCapability() {
        return this.mWearTypeCapability;
    }

    public ArrayList<String> getmPortPositionIndexList() {
        return this.mPortPositionIndexList;
    }

    public ArrayList<String> getmPortraitModeList() {
        return this.mPortraitModeList;
    }

    public boolean isClickBackToSave() {
        return this.mIsClickBackToSave;
    }

    public boolean isIsSupportIntellectColor() {
        return this.mIsSupportIntellectColor;
    }

    public boolean isSupportBackgroundOption() {
        return this.mIsSupportBackgroundOption;
    }

    public boolean isSupportDataOption() {
        return this.mIsSupportDataOption;
    }

    public boolean isSupportHandStyleOption() {
        return this.mIsSupportHandStyleOption;
    }

    public boolean isSupportPositionOption() {
        return this.mIsSupportPositionOption;
    }

    public boolean isSupportStyleOption() {
        return this.mIsSupportStyleOption;
    }

    public void setBackgroundIndex(String str) {
        this.mBackgroundIndex = str;
    }

    public void setBackgroundList(ArrayList<String> arrayList) {
        this.mBackgroundList = arrayList;
    }

    public void setBackgroundOptionalConfigList(List<BackgroundOptionalConfig> list) {
        this.mBackgroundOptionalConfigList = list;
    }

    public void setBackgroundType(int i) {
        this.mBackgroundType = i;
    }

    public void setClickBackToSave(boolean z) {
        this.mIsClickBackToSave = z;
    }

    public void setClockTypeCapability(long j) {
        this.mClockTypeCapability = j;
    }

    public void setCurStyleIndex(long j) {
        this.mCurStyleIndex = j;
    }

    public void setDataIndex(String str) {
        this.mDataIndex = str;
    }

    public void setDataResPathList(List<DataOptionalConfig> list) {
        this.mDataResPathList = list;
    }

    public void setDefaultBackground(String str) {
        this.mDefaultBackground = str;
    }

    public void setDefaultBackgroundOptionalConfigList(List<BackgroundOptionalConfig> list) {
        this.mDefaultBackgroundOptionalConfigList = list;
    }

    public void setDefaultBackgroundPath(String str) {
        this.mDefaultBackgroundPath = str;
    }

    public void setDefaultVideoStructList(ArrayList<VideoStruct> arrayList) {
        this.mDefaultVideoStructList = arrayList;
    }

    public void setHandStyleIndex(String str) {
        this.mHandStyleIndex = str;
    }

    public void setHandStyleResPathList(List<HandStyleOptionalConfig> list) {
        this.mHandStyleResPathList = list;
    }

    public void setIsSupportDataOption(boolean z) {
        this.mIsSupportDataOption = z;
    }

    public void setIsSupportIntellectColor(boolean z) {
        this.mIsSupportIntellectColor = z;
    }

    public void setLatonaPositionList(List<PositionOptionalConfig> list) {
        this.mLatonaPositionList = list;
    }

    public void setMaxStyleNum(int i) {
        this.mMaxStyleNum = i;
    }

    public void setPortPositionIndex(String str) {
        this.mPortPositionIndex = str;
    }

    public void setPortraitMode(String str) {
        this.mPortraitMode = str;
    }

    public void setPositionIndex(String str) {
        this.mPositionIndex = str;
    }

    public void setStyleCount(int i) {
        this.mStyleCount = i;
    }

    public void setStyleIndex(String str) {
        this.mStyleIndex = str;
    }

    public void setStyleResPathList(List<StyleOptionalConfig> list) {
        this.mStyleResPathList = list;
    }

    public void setSupportBackgroundOption(boolean z) {
        this.mIsSupportBackgroundOption = z;
    }

    public void setSupportHandStyleOption(boolean z) {
        this.mIsSupportHandStyleOption = z;
    }

    public void setSupportMaxBgAmount(String str) {
        this.mSupportMaxBgAmount = str;
        try {
            this.mMaxCountLocalString = CommonUtils.a(Double.parseDouble(str), 1, 0);
        } catch (NumberFormatException unused) {
            HwLog.e(TAG, "setSupportMaxBgAmount NumberFormatException");
        }
    }

    public void setSupportPositionOption(boolean z) {
        this.mIsSupportPositionOption = z;
    }

    public void setSupportStyleOption(boolean z) {
        this.mIsSupportStyleOption = z;
    }

    public void setVideoStructList(ArrayList<VideoStruct> arrayList) {
        this.mVideoStructList = arrayList;
    }

    public void setWatchFaceBgPathList(List<String> list) {
        this.mWatchFaceBgPathList = list;
    }

    public void setWearStyleType(int i) {
        this.mWearStyleType = i;
    }

    public void setWearTypeCapability(long j) {
        this.mWearTypeCapability = j;
    }

    public void setmPortPositionIndexList(ArrayList<String> arrayList) {
        this.mPortPositionIndexList = arrayList;
    }

    public void setmPortraitModeList(ArrayList<String> arrayList) {
        this.mPortraitModeList = arrayList;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(32);
        stringBuffer.append("LatonaWatchFaceThemeAlbumInfo: mSupportMaxBgAmount='").append(this.mSupportMaxBgAmount);
        stringBuffer.append(", mBackgroundType=").append(this.mBackgroundType);
        stringBuffer.append(", mBackgroundList=").append(this.mBackgroundList);
        stringBuffer.append(", mWatchFaceBgPathList=").append(this.mWatchFaceBgPathList);
        stringBuffer.append(", mLatonaPositionList=").append(this.mLatonaPositionList);
        stringBuffer.append(", mStyleResPathList=").append(this.mStyleResPathList);
        stringBuffer.append(", mDataResPathList=").append(this.mDataResPathList);
        stringBuffer.append(", mPositionIndex=").append(this.mPositionIndex);
        stringBuffer.append(", mStyleIndex=").append(this.mStyleIndex);
        stringBuffer.append(", mDataIndex=").append(this.mDataIndex);
        stringBuffer.append(", mIsSupportStyleOption=").append(this.mIsSupportStyleOption);
        stringBuffer.append(", mIsSupportPositionOption=").append(this.mIsSupportPositionOption);
        stringBuffer.append(", mIsSupportDataOption=").append(this.mIsSupportDataOption);
        stringBuffer.append(", mDefaultBackground=").append(this.mDefaultBackground);
        stringBuffer.append(", mDefaultBackgroundPath=").append(this.mDefaultBackgroundPath);
        stringBuffer.append(", mIsClickBackToSave=").append(this.mIsClickBackToSave);
        stringBuffer.append(", mMaxCountLocalString=").append(this.mMaxCountLocalString);
        stringBuffer.append(", mVideoStructList=").append(this.mVideoStructList);
        stringBuffer.append(", mDefaultVideoStructList=").append(this.mDefaultVideoStructList);
        stringBuffer.append(", mClockTypeCapability=").append(this.mClockTypeCapability);
        stringBuffer.append(", mCurStyleIndex=").append(this.mCurStyleIndex);
        stringBuffer.append(", mWearTypeCapability=").append(this.mWearTypeCapability);
        stringBuffer.append(", mWearStyleType=").append(this.mWearStyleType);
        stringBuffer.append(", mMaxStyleNum=").append(this.mMaxStyleNum);
        stringBuffer.append(", mStyleCount=").append(this.mStyleCount);
        return stringBuffer.toString();
    }
}
