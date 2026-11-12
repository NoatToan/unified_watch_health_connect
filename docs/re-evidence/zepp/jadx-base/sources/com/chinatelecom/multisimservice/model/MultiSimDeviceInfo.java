package com.chinatelecom.multisimservice.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class MultiSimDeviceInfo implements Parcelable {
    public static final Parcelable.Creator<MultiSimDeviceInfo> CREATOR = new a();
    public static final int DEVICE_TYPE_ESIM = 2;
    public static final int DEVICE_TYPE_INVALID = 0;
    public static final int DEVICE_TYPE_NO_MODEM = 3;
    public static final int DEVICE_TYPE_SIM = 1;
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
        this.g = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SimInfo getActiveSimProfileInfo() {
        List<SimInfo> list = this.g;
        if (list != null) {
            for (SimInfo simInfo : list) {
                if (simInfo.isActive()) {
                    try {
                        return simInfo.m3298clone();
                    } catch (CloneNotSupportedException unused) {
                        return new SimInfo(simInfo.getIMSI(), simInfo.getICCID(), simInfo.isActive());
                    }
                }
            }
        }
        return null;
    }

    public String getDeviceID() {
        int i = this.b;
        if (i == 2 || i == 1) {
            return this.c;
        }
        if (i == 3) {
            return this.d;
        }
        return null;
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
        return new ArrayList(this.g);
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

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<SimInfo> list = this.g;
        if (list != null && !list.isEmpty()) {
            Iterator<SimInfo> it2 = this.g.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next().toString());
            }
        }
        return "MultiSimDeviceInfo [mDeviceType=" + this.b + ", mDeviceIdentifierm=" + this.c + ", mDeviceSerialNumber=" + this.d + ", mProductName=" + this.e + ", mEID=" + this.f + ", mProfileInfoList=[" + sb.toString() + "] ]";
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
        this.g = null;
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        if (this.g == null) {
            this.g = new ArrayList();
        }
        parcel.readTypedList(this.g, SimInfo.CREATOR);
    }
}
