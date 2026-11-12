package com.euicc.server.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class EUICCDeviceInfo implements Parcelable {
    public static final Parcelable.Creator<EUICCDeviceInfo> CREATOR = new a();
    public static final int DEVICE_TYPE_ESIM = 2;
    public static final int DEVICE_TYPE_INVALID = 0;
    public static final int DEVICE_TYPE_NO_MODEM = 3;
    public static final int DEVICE_TYPE_SIM = 1;
    public static final int RESULT_CODE_NOT_CONNECT = -2;
    public static final int RESULT_CODE_NOT_SUPPORT = -3;
    public static final int RESULT_CODE_SUCCESS = 1;
    public static final int RESULT_CODE_UNKNOW = 0;
    public static final int RESULT_CODE_USER_REJECT = -1;
    private int a;
    private int b;
    private String c;
    private String d;
    private String e;
    private String f;
    private List<EUICCInfo> g;

    public class a implements Parcelable.Creator<EUICCDeviceInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EUICCDeviceInfo createFromParcel(Parcel parcel) {
            return new EUICCDeviceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EUICCDeviceInfo[] newArray(int i) {
            return new EUICCDeviceInfo[i];
        }
    }

    public EUICCDeviceInfo() {
        this.g = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public EUICCInfo getActiveSimProfileInfo() {
        List<EUICCInfo> list = this.g;
        if (list != null) {
            for (EUICCInfo eUICCInfo : list) {
                if (eUICCInfo.isActive()) {
                    try {
                        return eUICCInfo.m3299clone();
                    } catch (CloneNotSupportedException unused) {
                        return new EUICCInfo(eUICCInfo.getIMSI(), eUICCInfo.getICCID(), eUICCInfo.isActive());
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

    public List<EUICCInfo> getSimInfoList() {
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

    public void setSimInfoList(List<EUICCInfo> list) {
        this.g = list;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<EUICCInfo> list = this.g;
        if (list != null && !list.isEmpty()) {
            Iterator<EUICCInfo> it2 = this.g.iterator();
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

    public EUICCDeviceInfo(Parcel parcel) {
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
        parcel.readTypedList(this.g, EUICCInfo.CREATOR);
    }
}
