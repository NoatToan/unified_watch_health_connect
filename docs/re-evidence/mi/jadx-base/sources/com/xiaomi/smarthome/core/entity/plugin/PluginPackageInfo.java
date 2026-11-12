package com.xiaomi.smarthome.core.entity.plugin;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class PluginPackageInfo implements Parcelable {
    public static final Parcelable.Creator<PluginPackageInfo> CREATOR = new Parcelable.Creator<PluginPackageInfo>() { // from class: com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PluginPackageInfo createFromParcel(Parcel parcel) {
            return new PluginPackageInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PluginPackageInfo[] newArray(int i) {
            return new PluginPackageInfo[i];
        }
    };
    private long mDeveloperId;
    private boolean mIsSupportAppAV = true;
    private boolean mIsSupportWidget;
    private long mLastModifiedTime;
    private int mMinApiLevel;
    private List<String> mModelList;
    private long mPackageId;
    private String mPackageName;
    private String mPackagePath;
    private String mPackageType;
    private String mPlatform;
    private long mPluginId;
    private int mVersion;

    public PluginPackageInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public synchronized long getDeveloperId() {
        return this.mDeveloperId;
    }

    public synchronized boolean getIsSupportAppAV() {
        return this.mIsSupportAppAV;
    }

    public synchronized long getLastModifiedTime() {
        return this.mLastModifiedTime;
    }

    public synchronized int getMinApiLevel() {
        return this.mMinApiLevel;
    }

    public synchronized List<String> getModelList() {
        return this.mModelList;
    }

    public synchronized long getPackageId() {
        return this.mPackageId;
    }

    public synchronized String getPackageName() {
        if (TextUtils.isEmpty(this.mPackageName)) {
            return "";
        }
        return this.mPackageName;
    }

    public synchronized String getPackagePath() {
        if (TextUtils.isEmpty(this.mPackagePath)) {
            return "";
        }
        return this.mPackagePath;
    }

    public synchronized String getPackageType() {
        if (TextUtils.isEmpty(this.mPackageType)) {
            return "";
        }
        return this.mPackageType;
    }

    public synchronized String getPlatform() {
        return this.mPlatform;
    }

    public synchronized long getPluginId() {
        return this.mPluginId;
    }

    public synchronized boolean getSupportWidget() {
        return this.mIsSupportWidget;
    }

    public synchronized int getVersion() {
        return this.mVersion;
    }

    public synchronized boolean isApkPlugin() {
        return !TextUtils.isEmpty(this.mPackageType) && this.mPackageType.equalsIgnoreCase(PluginPackageConstant.PLUGIN_TYPE_APK);
    }

    public synchronized boolean isH5Plugin() {
        return !TextUtils.isEmpty(this.mPackageType) && this.mPackageType.equalsIgnoreCase(PluginPackageConstant.PLUGIN_TYPE_H5);
    }

    public synchronized boolean isMpkPlugin() {
        return !TextUtils.isEmpty(this.mPackageType) && this.mPackageType.equalsIgnoreCase(PluginPackageConstant.PLUGIN_TYPE_MPK);
    }

    public synchronized boolean isRNPlugin() {
        return !TextUtils.isEmpty(this.mPackageType) && this.mPackageType.equalsIgnoreCase("rn");
    }

    public void readFromParcel(Parcel parcel) {
        this.mPluginId = parcel.readLong();
        this.mPackageId = parcel.readLong();
        this.mPackagePath = parcel.readString();
        this.mVersion = parcel.readInt();
        this.mMinApiLevel = parcel.readInt();
        this.mDeveloperId = parcel.readLong();
        this.mPackageType = parcel.readString();
        this.mPlatform = parcel.readString();
        this.mPackageName = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.mModelList = arrayList;
        parcel.readStringList(arrayList);
        this.mIsSupportWidget = parcel.readInt() != 0;
        this.mIsSupportAppAV = parcel.readInt() != 0;
        this.mLastModifiedTime = parcel.readLong();
    }

    public synchronized void setDeveloperId(long j) {
        this.mDeveloperId = j;
    }

    public synchronized void setIsSupportAppAV(boolean z) {
        this.mIsSupportAppAV = z;
    }

    public synchronized void setIsSupportWidget(boolean z) {
        this.mIsSupportWidget = z;
    }

    public synchronized void setLastModifiedTime(long j) {
        this.mLastModifiedTime = j;
    }

    public synchronized void setMinApiLevel(int i) {
        this.mMinApiLevel = i;
    }

    public synchronized void setModelList(List<String> list) {
        this.mModelList = list;
    }

    public synchronized void setPackageId(long j) {
        this.mPackageId = j;
    }

    public synchronized void setPackageName(String str) {
        this.mPackageName = str;
    }

    public synchronized void setPackagePath(String str) {
        this.mPackagePath = str;
    }

    public synchronized void setPackageType(String str) {
        this.mPackageType = str;
    }

    public synchronized void setPlatform(String str) {
        this.mPlatform = str;
    }

    public synchronized void setPluginId(long j) {
        this.mPluginId = j;
    }

    public synchronized void setVersion(int i) {
        this.mVersion = i;
    }

    public synchronized String toLog() {
        return "PluginPackageInfo[pluginId:" + this.mPluginId + " packageId:" + this.mPackageId + " packagePath:" + this.mPackagePath + " version:" + this.mVersion + " minApiLevel:" + this.mMinApiLevel + " developerId:" + this.mDeveloperId + " packageType:" + this.mPackageType + " platform:" + this.mPlatform + " packageName:" + this.mPackageName + " modelList:" + this.mModelList + " packageLastModified" + this.mLastModifiedTime + " mIsSupportWidget" + this.mIsSupportWidget + " mIsSupportAppAV" + this.mIsSupportAppAV + " ]";
    }

    public void writeString(String str, Parcel parcel) {
        if (str == null) {
            parcel.writeString("");
        } else {
            parcel.writeString(str);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mPluginId);
        parcel.writeLong(this.mPackageId);
        parcel.writeString(this.mPackagePath);
        parcel.writeInt(this.mVersion);
        parcel.writeInt(this.mMinApiLevel);
        parcel.writeLong(this.mDeveloperId);
        writeString(this.mPackageType, parcel);
        writeString(this.mPlatform, parcel);
        writeString(this.mPackageName, parcel);
        if (this.mModelList == null) {
            this.mModelList = new ArrayList();
        }
        parcel.writeStringList(this.mModelList);
        parcel.writeInt(this.mIsSupportWidget ? 1 : 0);
        parcel.writeInt(this.mIsSupportAppAV ? 1 : 0);
        parcel.writeLong(this.mLastModifiedTime);
    }

    public PluginPackageInfo(Parcel parcel) {
        readFromParcel(parcel);
    }
}
