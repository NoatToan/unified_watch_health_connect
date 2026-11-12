package com.huawei.hms.findnetwork.comm.request.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes10.dex */
public class FindNetworkStatusResult implements Parcelable {
    public static final Parcelable.Creator<FindNetworkStatusResult> CREATOR = new a();
    private String hmsVersion;

    @SerializedName("isKeyringSupport")
    private boolean mIsKeyringSupport;

    @SerializedName("supportCrossDevices")
    private boolean mIsSupportCrossDevices;

    @SerializedName("switchEnabled")
    private boolean mIsSwitchEnabled;
    private int respCode;
    private String version;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FindNetworkStatusResult createFromParcel(Parcel parcel) {
            return new FindNetworkStatusResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FindNetworkStatusResult[] newArray(int i) {
            return new FindNetworkStatusResult[i];
        }
    }

    public FindNetworkStatusResult(int i) {
        this.respCode = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public FindNetworkStatusResult(int i, String str, String str2, boolean z) {
        this.respCode = i;
        this.version = str;
        this.hmsVersion = str2;
        this.mIsSwitchEnabled = z;
    }

    public FindNetworkStatusResult(Parcel parcel) {
        this.respCode = parcel.readInt();
        this.version = parcel.readString();
        this.hmsVersion = parcel.readString();
        this.mIsSwitchEnabled = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.respCode);
        parcel.writeString(this.version);
        parcel.writeString(this.hmsVersion);
        parcel.writeByte(this.mIsSwitchEnabled ? (byte) 1 : (byte) 0);
    }

    public void setSupportCrossDevices(boolean z) {
        this.mIsSupportCrossDevices = z;
    }

    public void setKeyringSupport(boolean z) {
        this.mIsKeyringSupport = z;
    }

    public void setHmsVersion(String str) {
        this.hmsVersion = str;
    }

    public boolean isSwitchEnabled() {
        return this.mIsSwitchEnabled;
    }

    public boolean isSupportCrossDevices() {
        return this.mIsSupportCrossDevices;
    }

    public boolean isKeyringSupport() {
        return this.mIsKeyringSupport;
    }

    public String getVersion() {
        return this.version;
    }

    public int getRespCode() {
        return this.respCode;
    }

    public String getHmsVersion() {
        return this.hmsVersion;
    }
}
