package com.huawei.watchface.mvp.model.datatype;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.watchface.utils.CommonUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class WatchFaceSupportInfo implements Parcelable {
    public static final Parcelable.Creator<WatchFaceSupportInfo> CREATOR = new Parcelable.Creator<WatchFaceSupportInfo>() { // from class: com.huawei.watchface.mvp.model.datatype.WatchFaceSupportInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WatchFaceSupportInfo createFromParcel(Parcel parcel) {
            return new WatchFaceSupportInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WatchFaceSupportInfo[] newArray(int i) {
            return new WatchFaceSupportInfo[i];
        }
    };
    private static final int LIST_DEFAULT_LENGTH = 20;
    public static final int WATCH_FACE_INFO_TYPE_HWT = 1;
    private boolean isSupportNewAlbum;
    private boolean isSupportOneTouchAbility;
    private boolean isSupportSync;
    private int mCommonErrorCode;
    private List<ScreenInfo> mCompatibleList;
    private WatchResourcesInfo mCurrentInfo;
    private boolean mIsSupportSort;
    private int mIsWearSupport;
    private List<WatchResourcesInfo> mNoPresetList;
    private String mOtherWatchFaceVersion;
    private int mPortraitFieldMode;
    private int mPowerLevel;
    private List<WatchResourcesInfo> mPresetList;
    private List<ScreenInfo> mPurchasedList;
    private int mSetTimeIndividually;
    private int mSupportCapability;
    private String mWatchFaceMaxVersion;
    private int mWatchHeight;
    private String mWatchScreen;
    private List<Integer> mWatchSupportFileType;
    private int mWatchWidth;
    private int mWatchfaceMode;

    public WatchFaceSupportInfo() {
        this.mPresetList = new ArrayList(20);
        this.mNoPresetList = new ArrayList(20);
        this.mCurrentInfo = new WatchResourcesInfo();
        this.mCompatibleList = new ArrayList(20);
        this.mPurchasedList = new ArrayList(20);
        this.mWatchfaceMode = -1;
        this.isSupportNewAlbum = false;
    }

    public static WatchFaceSupportInfo createInstance() {
        WatchFaceSupportInfo watchFaceSupportInfo = new WatchFaceSupportInfo();
        watchFaceSupportInfo.setWatchFaceHeight(466);
        watchFaceSupportInfo.setWatchFaceWidth(466);
        watchFaceSupportInfo.setWatchFaceSort(false);
        watchFaceSupportInfo.setWatchFaceMaxVersion("1.1");
        watchFaceSupportInfo.setOtherWatchFaceVersion("1.1");
        return watchFaceSupportInfo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCommonErrorCode() {
        return this.mCommonErrorCode;
    }

    public List<ScreenInfo> getCompatibleList() {
        return this.mCompatibleList;
    }

    public WatchResourcesInfo getCurrentInfo() {
        return this.mCurrentInfo;
    }

    public int getIsWearSupport() {
        return this.mIsWearSupport;
    }

    public List<WatchResourcesInfo> getNoPresetList() {
        return this.mNoPresetList;
    }

    public String getOtherWatchFaceVersion() {
        return this.mOtherWatchFaceVersion;
    }

    public int getPortraitFieldMode() {
        return this.mPortraitFieldMode;
    }

    public int getPowerLevel() {
        return this.mPowerLevel;
    }

    public List<WatchResourcesInfo> getPresetList() {
        return this.mPresetList;
    }

    public List<ScreenInfo> getPurchasedList() {
        return this.mPurchasedList;
    }

    public int getSetTimeIndividually() {
        return this.mSetTimeIndividually;
    }

    public int getSupportCapability() {
        return this.mSupportCapability;
    }

    public int getWatchFaceHeight() {
        return this.mWatchHeight;
    }

    public String getWatchFaceMaxVersion() {
        return this.mWatchFaceMaxVersion;
    }

    public String getWatchFaceScreen() {
        return String.valueOf(this.mWatchHeight) + "*" + String.valueOf(this.mWatchWidth);
    }

    public List<Integer> getWatchFaceSupportFileType() {
        return this.mWatchSupportFileType;
    }

    public int getWatchFaceWidth() {
        return this.mWatchWidth;
    }

    public int getWatchfaceMode() {
        return this.mWatchfaceMode;
    }

    public boolean isIsSupportSync() {
        return this.isSupportSync;
    }

    public boolean isSupportNewAlbum() {
        return this.isSupportNewAlbum;
    }

    public boolean isSupportOneTouchAbility() {
        return this.isSupportOneTouchAbility;
    }

    public boolean isWatchFaceSort() {
        return this.mIsSupportSort;
    }

    public void setCommonErrorCode(int i) {
        this.mCommonErrorCode = i;
    }

    public void setCompatibleList(List<ScreenInfo> list) {
        this.mCompatibleList = list;
    }

    public void setCurrentInfo(WatchResourcesInfo watchResourcesInfo) {
        this.mCurrentInfo = watchResourcesInfo;
    }

    public void setIsSupportSync(boolean z) {
        this.isSupportSync = z;
    }

    public void setIsWearSupport(int i) {
        this.mIsWearSupport = i;
    }

    public void setNoPresetList(List<WatchResourcesInfo> list) {
        this.mNoPresetList = list;
    }

    public void setOtherWatchFaceVersion(String str) {
        this.mOtherWatchFaceVersion = str;
    }

    public void setPortraitFieldMode(int i) {
        this.mPortraitFieldMode = i;
    }

    public void setPowerLevel(int i) {
        this.mPowerLevel = i;
    }

    public void setPresetList(List<WatchResourcesInfo> list) {
        this.mPresetList = list;
    }

    public void setPurchasedList(List<ScreenInfo> list) {
        this.mPurchasedList = list;
    }

    public void setSetTimeIndividually(int i) {
        this.mSetTimeIndividually = i;
    }

    public void setSupportCapability(int i) {
        this.mSupportCapability = i;
    }

    public void setSupportNewAlbum(boolean z) {
        this.isSupportNewAlbum = z;
    }

    public void setSupportOneTouchAbility(boolean z) {
        this.isSupportOneTouchAbility = z;
    }

    public void setWatchFaceHeight(int i) {
        this.mWatchHeight = i;
    }

    public void setWatchFaceMaxVersion(String str) {
        this.mWatchFaceMaxVersion = str;
    }

    public void setWatchFaceScreen(String str) {
        this.mWatchScreen = str;
    }

    public void setWatchFaceSort(boolean z) {
        this.mIsSupportSort = z;
    }

    public void setWatchFaceSupportFileType(List<Integer> list) {
        this.mWatchSupportFileType = list;
    }

    public void setWatchFaceWidth(int i) {
        this.mWatchWidth = i;
    }

    public void setWatchfaceMode(int i) {
        this.mWatchfaceMode = i;
    }

    public String toString() {
        return "WatchFaceInfo{WatchFace_MaxVersion=" + this.mWatchFaceMaxVersion + ", WatchFace_Width=" + this.mWatchWidth + ", WatchFace_Height=" + this.mWatchHeight + ", WatchFace_Screen=" + this.mWatchScreen + ", WatchFace_Sort=" + this.mIsSupportSort + ", WatchFace_SupportFileType=" + this.mWatchSupportFileType + ", watchFace_OtherWatchFace_Version=" + this.mOtherWatchFaceVersion + ", mPresetList=" + this.mPresetList.size() + ", mNoPresetList=" + this.mNoPresetList.size() + ", mCurrentInfo=" + this.mCurrentInfo.toString() + ", mCompatibleList=" + this.mCompatibleList.size() + ", mPurchasedList=" + this.mPurchasedList.size() + ", mSupportCapability=" + this.mSupportCapability + ", mPowerLevel=" + this.mPowerLevel + ", mPortraitFieldMode=" + this.mPortraitFieldMode + ", mSetTimeIndividually=" + this.mSetTimeIndividually + ", mIsWearSupport=" + this.mIsSupportSort + ", mCommonErrorCode=" + this.mCommonErrorCode + ", isSupportSync=" + this.isSupportSync + ", isSupportNewAlbum=" + this.isSupportNewAlbum + ", isSupportOneTouchAbility=" + this.isSupportOneTouchAbility + ", mWatchfaceMode=" + this.mWatchfaceMode + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mWatchFaceMaxVersion);
        parcel.writeInt(this.mWatchWidth);
        parcel.writeInt(this.mWatchHeight);
        parcel.writeByte(this.mIsSupportSort ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mOtherWatchFaceVersion);
        parcel.writeList(this.mWatchSupportFileType);
        CommonUtils.a(parcel, this.mPresetList);
        CommonUtils.a(parcel, this.mNoPresetList);
        parcel.writeParcelable(this.mCurrentInfo, i);
        CommonUtils.a(parcel, this.mCompatibleList);
        CommonUtils.a(parcel, this.mPurchasedList);
        parcel.writeInt(this.mSupportCapability);
        parcel.writeInt(this.mPowerLevel);
        parcel.writeInt(this.mIsWearSupport);
        parcel.writeInt(this.mPortraitFieldMode);
        parcel.writeInt(this.mSetTimeIndividually);
        parcel.writeInt(this.mCommonErrorCode);
        parcel.writeByte(this.isSupportSync ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSupportOneTouchAbility ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.mWatchfaceMode);
    }

    public boolean isPortraitModeSupported() {
        return CommonUtils.s() && this.mPortraitFieldMode == 1;
    }

    public WatchFaceSupportInfo(Parcel parcel) {
        this.mPresetList = new ArrayList(20);
        this.mNoPresetList = new ArrayList(20);
        this.mCurrentInfo = new WatchResourcesInfo();
        this.mCompatibleList = new ArrayList(20);
        this.mPurchasedList = new ArrayList(20);
        this.mWatchfaceMode = -1;
        this.isSupportNewAlbum = false;
        this.mWatchFaceMaxVersion = parcel.readString();
        this.mWatchWidth = parcel.readInt();
        this.mWatchHeight = parcel.readInt();
        this.mIsSupportSort = parcel.readByte() != 0;
        this.mOtherWatchFaceVersion = parcel.readString();
        ArrayList arrayList = new ArrayList(20);
        this.mWatchSupportFileType = arrayList;
        parcel.readList(arrayList, Integer.class.getClassLoader());
        Parcelable.Creator<WatchResourcesInfo> creator = WatchResourcesInfo.CREATOR;
        this.mPresetList = CommonUtils.a(creator, parcel);
        this.mNoPresetList = CommonUtils.a(creator, parcel);
        this.mCurrentInfo = (WatchResourcesInfo) parcel.readParcelable(ContentValues.class.getClassLoader());
        Parcelable.Creator<ScreenInfo> creator2 = ScreenInfo.CREATOR;
        this.mCompatibleList = CommonUtils.a(creator2, parcel);
        this.mPurchasedList = CommonUtils.a(creator2, parcel);
        this.mSupportCapability = parcel.readInt();
        this.mPowerLevel = parcel.readInt();
        this.mIsWearSupport = parcel.readInt();
        this.mPortraitFieldMode = parcel.readInt();
        this.mSetTimeIndividually = parcel.readInt();
        this.mCommonErrorCode = parcel.readInt();
        this.isSupportSync = parcel.readByte() != 0;
        this.isSupportOneTouchAbility = parcel.readByte() != 0;
        this.mWatchfaceMode = parcel.readInt();
    }
}
