package com.cmcc.server.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MultiSimDeviceInfo implements Parcelable {
    public static final Parcelable.Creator<MultiSimDeviceInfo> CREATOR = new a();
    private int a;
    private int b;
    private String c;
    private String d;
    private String e;
    private String f;
    private List<SimInfo> g;

    public class a implements Parcelable.Creator<MultiSimDeviceInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MultiSimDeviceInfo createFromParcel(Parcel parcel) {
            return new MultiSimDeviceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MultiSimDeviceInfo[] newArray(int i) {
            return new MultiSimDeviceInfo[i];
        }
    }

    public MultiSimDeviceInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDeviceIMEI() {
        return this.c;
    }

    public String getDeviceSerialNumber() {
        return this.d;
    }

    public int getDeviceType() {
        return this.b;
    }

    public String getEID() {
        return this.f;
    }

    public String getProductName() {
        return this.e;
    }

    public int getResultCode() {
        return this.a;
    }

    public List<SimInfo> getSimInfoList() {
        return this.g;
    }

    public void setDeviceIMEI(String str) {
        this.c = str;
    }

    public void setDeviceSerialNumber(String str) {
        this.d = str;
    }

    public void setDeviceType(int i) {
        this.b = i;
    }

    public void setEID(String str) {
        this.f = str;
    }

    public void setProductName(String str) {
        this.e = str;
    }

    public void setResultCode(int i) {
        this.a = i;
    }

    public void setSimInfoList(List<SimInfo> list) {
        this.g = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeTypedList(this.g);
    }

    public MultiSimDeviceInfo(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.createTypedArrayList(SimInfo.CREATOR);
    }
}
