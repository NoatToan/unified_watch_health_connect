package com.huawei.health.h5pro.vengine;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class H5ProAppInfo implements Parcelable {
    public static final Parcelable.Creator<H5ProAppInfo> CREATOR = new Parcelable.Creator<H5ProAppInfo>() { // from class: com.huawei.health.h5pro.vengine.H5ProAppInfo.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public H5ProAppInfo createFromParcel(Parcel parcel) {
            H5ProAppInfo h5ProAppInfo = new H5ProAppInfo();
            h5ProAppInfo.appName = parcel.readString();
            h5ProAppInfo.appId = parcel.readString();
            h5ProAppInfo.pkgName = parcel.readString();
            h5ProAppInfo.certPrint = parcel.readString();
            h5ProAppInfo.baseUrl = parcel.readString();
            h5ProAppInfo.h5ProAppType = (H5ProAppType) parcel.readParcelable(H5ProAppType.class.getClassLoader());
            h5ProAppInfo.version = parcel.readString();
            return h5ProAppInfo;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public H5ProAppInfo[] newArray(int i) {
            return new H5ProAppInfo[i];
        }
    };
    private String appId;
    private String appName;
    private String baseUrl;
    private String certPrint;
    private H5ProAppType h5ProAppType = H5ProAppType.H5_MINI_PROGRAM;
    private String pkgName;
    private String version;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getCertPrint() {
        return this.certPrint;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public H5ProAppType getH5ProAppType() {
        return this.h5ProAppType;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setCertPrint(String str) {
        this.certPrint = str;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }

    public void setBaseUrl(String str) {
        this.baseUrl = str;
    }

    public void setH5ProAppType(H5ProAppType h5ProAppType) {
        this.h5ProAppType = h5ProAppType;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.appName);
        parcel.writeString(this.appId);
        parcel.writeString(this.pkgName);
        parcel.writeString(this.certPrint);
        parcel.writeString(this.baseUrl);
        parcel.writeParcelable(this.h5ProAppType, i);
        parcel.writeString(this.version);
    }

    public String toString() {
        return "H5ProAppInfo{appId='" + this.appId + "', certPrint='" + this.certPrint + "', appName='" + this.appName + "', pkgName='" + this.pkgName + "', baseUrl='" + this.baseUrl + "', h5ProAppType=" + this.h5ProAppType + '}';
    }

    /* JADX INFO: loaded from: classes7.dex */
    public enum H5ProAppType implements Parcelable {
        H5_MINI_PROGRAM,
        H5_LIGHT_APP;

        public static final Parcelable.Creator<H5ProAppType> CREATOR = new Parcelable.Creator<H5ProAppType>() { // from class: com.huawei.health.h5pro.vengine.H5ProAppInfo.H5ProAppType.4
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public H5ProAppType createFromParcel(Parcel parcel) {
                return H5ProAppType.values()[parcel.readInt()];
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public H5ProAppType[] newArray(int i) {
                return new H5ProAppType[i];
            }
        };

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }
}
