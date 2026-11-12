package com.unionpay.tsmservice.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes18.dex */
public class AppUniteApplyRecord implements Parcelable {
    public static final Parcelable.Creator<AppUniteApplyRecord> CREATOR = new a();
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private IDVMethod[] g;

    public static class a implements Parcelable.Creator<AppUniteApplyRecord> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppUniteApplyRecord createFromParcel(Parcel parcel) {
            return new AppUniteApplyRecord(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppUniteApplyRecord[] newArray(int i) {
            return new AppUniteApplyRecord[i];
        }
    }

    public AppUniteApplyRecord() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppIcon() {
        return this.c;
    }

    public String getAppId() {
        return this.b;
    }

    public IDVMethod[] getIDVMethod() {
        return this.g;
    }

    public String getMPan() {
        return this.d;
    }

    public String getMPanId() {
        return this.a;
    }

    public String getResult() {
        return this.f;
    }

    public String getSPan() {
        return this.e;
    }

    public void setAppIcon(String str) {
        this.c = str;
    }

    public void setAppId(String str) {
        this.b = str;
    }

    public void setIDVMethod(IDVMethod[] iDVMethodArr) {
        this.g = iDVMethodArr;
    }

    public void setMPan(String str) {
        this.d = str;
    }

    public void setMPanId(String str) {
        this.a = str;
    }

    public void setResult(String str) {
        this.f = str;
    }

    public void setSPan(String str) {
        this.e = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeParcelableArray(this.g, i);
    }

    public AppUniteApplyRecord(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        Parcelable[] parcelableArray = parcel.readParcelableArray(IDVMethod.class.getClassLoader());
        if (parcelableArray != null) {
            this.g = (IDVMethod[]) Arrays.copyOf(parcelableArray, parcelableArray.length, IDVMethod[].class);
        }
    }
}
