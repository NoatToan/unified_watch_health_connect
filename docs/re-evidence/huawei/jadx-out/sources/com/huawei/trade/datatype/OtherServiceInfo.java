package com.huawei.trade.datatype;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes15.dex */
public class OtherServiceInfo implements Parcelable {
    public static final Parcelable.Creator<OtherServiceInfo> CREATOR = new Parcelable.Creator<OtherServiceInfo>() { // from class: com.huawei.trade.datatype.OtherServiceInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OtherServiceInfo createFromParcel(Parcel parcel) {
            return new OtherServiceInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OtherServiceInfo[] newArray(int i) {
            return new OtherServiceInfo[i];
        }
    };
    private int linkType;
    private String linkValue;
    private String serviceCardUrl;
    private String serviceDescription;
    private String serviceName;
    private String serviceSubTitle;
    private int serviceType;
    private String themeProductCode;
    private int weight;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected OtherServiceInfo(Parcel parcel) {
        this.serviceName = parcel.readString();
        this.serviceType = parcel.readInt();
        this.serviceSubTitle = parcel.readString();
        this.serviceDescription = parcel.readString();
        this.serviceCardUrl = parcel.readString();
        this.linkType = parcel.readInt();
        this.linkValue = parcel.readString();
        this.themeProductCode = parcel.readString();
        this.weight = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.serviceName);
        parcel.writeInt(this.serviceType);
        parcel.writeString(this.serviceSubTitle);
        parcel.writeString(this.serviceDescription);
        parcel.writeString(this.serviceCardUrl);
        parcel.writeInt(this.linkType);
        parcel.writeString(this.linkValue);
        parcel.writeString(this.themeProductCode);
        parcel.writeInt(this.weight);
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public void setServiceName(String str) {
        this.serviceName = str;
    }

    public String getServiceSubTitle() {
        return this.serviceSubTitle;
    }

    public void setServiceSubTitle(String str) {
        this.serviceSubTitle = str;
    }

    public String getServiceDescription() {
        return this.serviceDescription;
    }

    public void setServiceDescription(String str) {
        this.serviceDescription = str;
    }

    public String getServiceCardUrl() {
        return this.serviceCardUrl;
    }

    public void setServiceCardUrl(String str) {
        this.serviceCardUrl = str;
    }

    public int getLinkType() {
        return this.linkType;
    }

    public void setLinkType(int i) {
        this.linkType = i;
    }

    public String getLinkValue() {
        return this.linkValue;
    }

    public void setLinkValue(String str) {
        this.linkValue = str;
    }

    public String getThemeProductCode() {
        return this.themeProductCode;
    }

    public void setThemeProductCode(String str) {
        this.themeProductCode = str;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int i) {
        this.weight = i;
    }

    public int getServiceType() {
        return this.serviceType;
    }

    public void setServiceType(int i) {
        this.serviceType = i;
    }
}
