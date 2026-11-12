package com.xiaomi.yrn.env.entity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.fitness.yrn_config.YRNConstants;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class YRNBundleInfo implements Parcelable, Serializable, Comparable<YRNBundleInfo>, Cloneable {
    public static final Parcelable.Creator<YRNBundleInfo> CREATOR = new a();
    private String appName;
    private String branch;
    private String bundlePath;
    private String bundlePathFileName;
    private String description;
    private String maketime;
    private int maxCommonJSApiLevel;
    private int maxNativeApiLevel;
    private String md5;
    private String module;
    private String moduleIdMapVersion;
    private boolean needUpdate;
    private boolean residentMemory;
    private int updateStrategy;
    private String url;
    private String version;

    public static class a implements Parcelable.Creator<YRNBundleInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public YRNBundleInfo createFromParcel(Parcel parcel) {
            return new YRNBundleInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public YRNBundleInfo[] newArray(int i) {
            return new YRNBundleInfo[i];
        }
    }

    public YRNBundleInfo() {
        this.needUpdate = true;
    }

    public static Bundle toBundle(YRNBundleInfo yRNBundleInfo) {
        Bundle bundle = new Bundle();
        bundle.putString("appName", yRNBundleInfo.getAppName());
        bundle.putString("bundlePath", yRNBundleInfo.getBundlePath());
        bundle.putString("bundlePathFileName", yRNBundleInfo.getBundlePathFileName());
        bundle.putString("md5", yRNBundleInfo.getMd5());
        bundle.putString("moduleIdMapVersion", yRNBundleInfo.getModuleIdMapVersion());
        bundle.putString("platform", YRNConstants.PLATFORM);
        bundle.putInt("maxNativeApiLevel", yRNBundleInfo.getMaxNativeApiLevel());
        bundle.putInt("maxCommonJSApiLevel", yRNBundleInfo.getMaxCommonJSApiLevel());
        bundle.putString(RnReportConst.ApiReport.PARAM_MODULE, yRNBundleInfo.getModule());
        bundle.putString("maketime", yRNBundleInfo.getMaketime());
        bundle.putString("version", yRNBundleInfo.getVersion());
        bundle.putString("branch", yRNBundleInfo.getBranch());
        bundle.putInt("updateStrategy", yRNBundleInfo.getUpdateStrategy());
        bundle.putInt("residentMemory", yRNBundleInfo.isResidentMemory() ? 1 : 0);
        bundle.putInt("needUpdate", yRNBundleInfo.isNeedUpdate() ? 1 : 0);
        bundle.putString("description", yRNBundleInfo.getDescription());
        return bundle;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getBranch() {
        return this.branch;
    }

    public String getBundlePath() {
        return this.bundlePath;
    }

    public String getBundlePathFileName() {
        return this.bundlePathFileName;
    }

    public String getDescription() {
        return this.description;
    }

    public String getMaketime() {
        return this.maketime;
    }

    public int getMaxCommonJSApiLevel() {
        return this.maxCommonJSApiLevel;
    }

    public int getMaxNativeApiLevel() {
        return this.maxNativeApiLevel;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getModule() {
        return this.module;
    }

    public String getModuleIdMapVersion() {
        return this.moduleIdMapVersion;
    }

    public int getUpdateStrategy() {
        return this.updateStrategy;
    }

    public String getUrl() {
        return this.url;
    }

    public String getVersion() {
        return this.version;
    }

    public boolean isNeedUpdate() {
        return this.needUpdate;
    }

    public boolean isResidentMemory() {
        return this.residentMemory;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setBranch(String str) {
        this.branch = str;
    }

    public void setBundlePath(String str) {
        this.bundlePath = str;
    }

    public void setBundlePathFileName(String str) {
        this.bundlePathFileName = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setMaketime(String str) {
        this.maketime = str;
    }

    public void setMaxCommonJSApiLevel(int i) {
        this.maxCommonJSApiLevel = i;
    }

    public void setMaxNativeApiLevel(int i) {
        this.maxNativeApiLevel = i;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public void setModuleIdMapVersion(String str) {
        this.moduleIdMapVersion = str;
    }

    public void setNeedUpdate(boolean z) {
        this.needUpdate = z;
    }

    public void setResidentMemory(boolean z) {
        this.residentMemory = z;
    }

    public void setUpdateStrategy(int i) {
        this.updateStrategy = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        return "{appName='" + this.appName + "', bundlePath='" + this.bundlePath + "', bundlePathFileName='" + this.bundlePathFileName + "', needUpdate=" + this.needUpdate + ", module='" + this.module + "', description='" + this.description + "', version='" + this.version + "', md5='" + this.md5 + "', maxNativeApiLevel=" + this.maxNativeApiLevel + ", maxCommonJSApiLevel=" + this.maxCommonJSApiLevel + ", url='" + this.url + "', maketime='" + this.maketime + "', moduleIdMapVersion='" + this.moduleIdMapVersion + "', branch='" + this.branch + "', updateStrategy=" + this.updateStrategy + ", residentMemory=" + this.residentMemory + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.appName);
        parcel.writeString(this.bundlePath);
        parcel.writeString(this.bundlePathFileName);
        parcel.writeByte(this.needUpdate ? (byte) 1 : (byte) 0);
        parcel.writeString(this.module);
        parcel.writeString(this.description);
        parcel.writeString(this.version);
        parcel.writeString(this.md5);
        parcel.writeInt(this.maxNativeApiLevel);
        parcel.writeInt(this.maxCommonJSApiLevel);
        parcel.writeString(this.url);
        parcel.writeString(this.maketime);
        parcel.writeString(this.moduleIdMapVersion);
        parcel.writeString(this.branch);
        parcel.writeInt(this.residentMemory ? 1 : 0);
        parcel.writeInt(this.updateStrategy);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public YRNBundleInfo m873clone() {
        YRNBundleInfo yRNBundleInfo = new YRNBundleInfo();
        yRNBundleInfo.setAppName(this.appName);
        yRNBundleInfo.setModule(this.module);
        yRNBundleInfo.setMd5(this.md5);
        yRNBundleInfo.setUrl(this.url);
        yRNBundleInfo.setMaxNativeApiLevel(this.maxNativeApiLevel);
        yRNBundleInfo.setMaxCommonJSApiLevel(this.maxCommonJSApiLevel);
        yRNBundleInfo.setBranch(this.branch);
        yRNBundleInfo.setDescription(this.description);
        yRNBundleInfo.setBundlePath(this.bundlePath);
        yRNBundleInfo.setBundlePathFileName(this.bundlePathFileName);
        yRNBundleInfo.setMaketime(this.maketime);
        yRNBundleInfo.setVersion(this.version);
        yRNBundleInfo.setModuleIdMapVersion(this.moduleIdMapVersion);
        yRNBundleInfo.setUpdateStrategy(this.updateStrategy);
        yRNBundleInfo.setResidentMemory(this.residentMemory);
        return yRNBundleInfo;
    }

    @Override // java.lang.Comparable
    public int compareTo(YRNBundleInfo yRNBundleInfo) {
        if (yRNBundleInfo == null) {
            return 1;
        }
        int iCompare = Integer.compare(this.maxNativeApiLevel, yRNBundleInfo.maxNativeApiLevel);
        return iCompare == 0 ? Integer.compare(this.maxCommonJSApiLevel, yRNBundleInfo.maxCommonJSApiLevel) : iCompare;
    }

    public YRNBundleInfo(Parcel parcel) {
        this.needUpdate = true;
        this.appName = parcel.readString();
        this.bundlePath = parcel.readString();
        this.bundlePathFileName = parcel.readString();
        this.needUpdate = parcel.readByte() != 0;
        this.module = parcel.readString();
        this.description = parcel.readString();
        this.version = parcel.readString();
        this.md5 = parcel.readString();
        this.maxNativeApiLevel = parcel.readInt();
        this.maxCommonJSApiLevel = parcel.readInt();
        this.url = parcel.readString();
        this.maketime = parcel.readString();
        this.moduleIdMapVersion = parcel.readString();
        this.branch = parcel.readString();
        this.residentMemory = parcel.readByte() != 0;
        this.updateStrategy = parcel.readInt();
    }
}
