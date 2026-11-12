package com.chinatelecom.multisimservice.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class MultiSimDeviceInfo implements Parcelable {
    public static final Parcelable.Creator<MultiSimDeviceInfo> CREATOR = new a();
    public static final int DEVICE_TYPE_ESIM = 2;
    public static final int DEVICE_TYPE_INVALID = 0;
    public static final int DEVICE_TYPE_NO_MODEM = 3;
    public static final int DEVICE_TYPE_SIM = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7011b;
    public String c;
    public String d;
    public String e;
    public String f;
    public List<SimInfo> g;

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

    public void a(String str) {
        this.c = str;
    }

    public void c(String str) {
        this.d = str;
    }

    public void d(int i) {
        this.f7011b = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(String str) {
        this.f = str;
    }

    public void f(String str) {
        this.e = str;
    }

    public void g(int i) {
        this.f7010a = i;
    }

    public void h(List<SimInfo> list) {
        this.g = list;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        List<SimInfo> list = this.g;
        if (list != null && !list.isEmpty()) {
            Iterator<SimInfo> it = this.g.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next().toString());
            }
        }
        return "MultiSimDeviceInfo [mDeviceType=" + this.f7011b + ", mDeviceIdentifierm=" + this.c + ", mDeviceSerialNumber=" + this.d + ", mProductName=" + this.e + ", mEID=" + this.f + ", mProfileInfoList=[" + stringBuffer.toString() + "] ]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7010a);
        parcel.writeInt(this.f7011b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeTypedList(this.g);
    }

    public MultiSimDeviceInfo(Parcel parcel) {
        this.g = null;
        this.f7010a = parcel.readInt();
        this.f7011b = parcel.readInt();
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
