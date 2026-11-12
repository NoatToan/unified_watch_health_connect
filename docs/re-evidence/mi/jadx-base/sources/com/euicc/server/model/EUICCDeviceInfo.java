package com.euicc.server.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
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

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7072b;
    public String c;
    public String d;
    public String e;
    public String f;
    public List<EUICCInfo> g;
    public String h;
    public String i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f7073k;
    public long l;

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

    public String a() {
        return this.c;
    }

    public String c() {
        return this.d;
    }

    public int d() {
        return this.f7072b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f;
    }

    public String f() {
        return this.e;
    }

    public int g() {
        return this.f7071a;
    }

    public List<EUICCInfo> h() {
        return new ArrayList(this.g);
    }

    public void i(String str) {
        this.c = str;
    }

    public void j(String str) {
        this.d = str;
    }

    public void k(int i) {
        this.f7072b = i;
    }

    public void l(String str) {
        this.f = str;
    }

    public void m(String str) {
        this.e = str;
    }

    public void o(int i) {
        this.f7071a = i;
    }

    public void q(List<EUICCInfo> list) {
        this.g = list;
    }

    public void r(long j) {
        this.l = j;
    }

    public void t(String str) {
        this.i = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        List<EUICCInfo> list = this.g;
        if (list != null && !list.isEmpty()) {
            Iterator<EUICCInfo> it = this.g.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next().toString());
            }
        }
        return "MultiSimDeviceInfo [mDeviceType=" + this.f7072b + ", mDeviceIdentifierm=" + this.c + ", mDeviceSerialNumber=" + this.d + ", mProductName=" + this.e + ", mEID=" + this.f + ", mProfileInfoList=[" + stringBuffer.toString() + "] ]";
    }

    public void u(String str) {
        this.j = str;
    }

    public void v(String str) {
        this.f7073k = str;
    }

    public void w(String str) {
        this.h = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7071a);
        parcel.writeInt(this.f7072b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.f7073k);
        parcel.writeLong(this.l);
        parcel.writeTypedList(this.g);
    }

    public EUICCDeviceInfo(Parcel parcel) {
        this.g = null;
        this.f7071a = parcel.readInt();
        this.f7072b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.f7073k = parcel.readString();
        this.l = parcel.readLong();
        if (this.g == null) {
            this.g = new ArrayList();
        }
        parcel.readTypedList(this.g, EUICCInfo.CREATOR);
    }
}
