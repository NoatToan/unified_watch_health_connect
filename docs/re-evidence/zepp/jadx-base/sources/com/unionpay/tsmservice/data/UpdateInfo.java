package com.unionpay.tsmservice.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class UpdateInfo implements Parcelable {
    public static final Parcelable.Creator<UpdateInfo> CREATOR = new a();
    public static final String TYPE_MUST = "02";
    public static final String TYPE_NONE = "00";
    public static final String TYPE_OPTION = "01";
    private String a;
    private String b;
    private String c;
    private String[] d;

    public static class a implements Parcelable.Creator<UpdateInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UpdateInfo createFromParcel(Parcel parcel) {
            return new UpdateInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UpdateInfo[] newArray(int i) {
            return new UpdateInfo[i];
        }
    }

    public UpdateInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getClientDigest() {
        return this.c;
    }

    public String[] getDesc() {
        return this.d;
    }

    public String getDownloadUrl() {
        return this.b;
    }

    public String getType() {
        return this.a;
    }

    public void setClientDigest(String str) {
        this.c = str;
    }

    public void setDesc(String[] strArr) {
        this.d = strArr;
    }

    public void setDownloadUrl(String str) {
        this.b = str;
    }

    public void setType(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeStringArray(this.d);
    }

    public UpdateInfo(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.createStringArray();
    }
}
