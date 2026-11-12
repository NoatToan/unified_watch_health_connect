package com.ximalaya.ting.android.opensdk.model.xdcs;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes22.dex */
public class CdnConfigModel implements Parcelable {
    public static final Parcelable.Creator<CdnConfigModel> CREATOR = new Parcelable.Creator<CdnConfigModel>() { // from class: com.ximalaya.ting.android.opensdk.model.xdcs.CdnConfigModel.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CdnConfigModel createFromParcel(Parcel parcel) {
            return new CdnConfigModel(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CdnConfigModel[] newArray(int i) {
            return new CdnConfigModel[i];
        }
    };
    public int cdnNotWifiAlertRate;
    public int cdnNotWifiConnectTimeout;
    public String cdnUrl;
    public int cdnWifiAlertRate;
    public int cdnWifiConnectTimeout;
    public String doMain;
    public HashMap<String, String> map;
    public int netType;
    public String path;
    public String userAgent;

    public CdnConfigModel() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCdnNotWifiAlertRate() {
        return this.cdnNotWifiAlertRate;
    }

    public int getCdnNotWifiConnectTimeout() {
        return this.cdnNotWifiConnectTimeout;
    }

    public String getCdnUrl() {
        return this.cdnUrl;
    }

    public int getCdnWifiAlertRate() {
        return this.cdnWifiAlertRate;
    }

    public int getCdnWifiConnectTimeout() {
        return this.cdnWifiConnectTimeout;
    }

    public String getDoMain() {
        return this.doMain;
    }

    public HashMap<String, String> getMap() {
        return this.map;
    }

    public int getNetType() {
        return this.netType;
    }

    public String getPath() {
        return this.path;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public void setCdnNotWifiAlertRate(int i) {
        this.cdnNotWifiAlertRate = i;
    }

    public void setCdnNotWifiConnectTimeout(int i) {
        this.cdnNotWifiConnectTimeout = i;
    }

    public void setCdnUrl(String str) {
        this.cdnUrl = str;
    }

    public void setCdnWifiAlertRate(int i) {
        this.cdnWifiAlertRate = i;
    }

    public void setCdnWifiConnectTimeout(int i) {
        this.cdnWifiConnectTimeout = i;
    }

    public void setDoMain(String str) {
        this.doMain = str;
    }

    public void setMap(HashMap<String, String> map) {
        this.map = map;
    }

    public void setNetType(int i) {
        this.netType = i;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setUserAgent(String str) {
        this.userAgent = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.cdnWifiConnectTimeout);
        parcel.writeInt(this.cdnNotWifiConnectTimeout);
        parcel.writeInt(this.cdnWifiAlertRate);
        parcel.writeInt(this.cdnNotWifiAlertRate);
        parcel.writeInt(this.netType);
        parcel.writeString(this.cdnUrl);
        parcel.writeString(this.userAgent);
        parcel.writeString(this.doMain);
        parcel.writeString(this.path);
        parcel.writeMap(this.map);
    }

    public CdnConfigModel(Parcel parcel) {
        this.cdnWifiConnectTimeout = parcel.readInt();
        this.cdnNotWifiConnectTimeout = parcel.readInt();
        this.cdnWifiAlertRate = parcel.readInt();
        this.cdnNotWifiConnectTimeout = parcel.readInt();
        this.netType = parcel.readInt();
        this.cdnUrl = parcel.readString();
        this.userAgent = parcel.readString();
        this.doMain = parcel.readString();
        this.path = parcel.readString();
        this.map = parcel.readHashMap(HashMap.class.getClassLoader());
    }
}
