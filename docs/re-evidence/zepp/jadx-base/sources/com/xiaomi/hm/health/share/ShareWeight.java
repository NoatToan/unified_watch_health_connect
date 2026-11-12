package com.xiaomi.hm.health.share;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes21.dex */
public class ShareWeight implements Parcelable {
    public static final Parcelable.Creator<ShareWeight> CREATOR = new a();
    public String a;
    public String b;
    public String bmi;
    public String bodyFat;
    public String c;
    public String d;
    public String e;
    private int f;
    public int g;
    public long userid;
    public String weightValue;

    public class a implements Parcelable.Creator<ShareWeight> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareWeight createFromParcel(Parcel source) {
            return new ShareWeight(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareWeight[] newArray(int size) {
            return new ShareWeight[size];
        }
    }

    public ShareWeight() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.userid);
        dest.writeString(this.a);
        dest.writeString(this.b);
        dest.writeString(this.c);
        dest.writeString(this.weightValue);
        dest.writeString(this.d);
        dest.writeString(this.bmi);
        dest.writeString(this.bodyFat);
        dest.writeString(this.e);
        dest.writeInt(this.f);
        dest.writeInt(this.g);
    }

    private ShareWeight(Parcel in) {
        this.userid = in.readLong();
        this.a = in.readString();
        this.b = in.readString();
        this.c = in.readString();
        this.weightValue = in.readString();
        this.d = in.readString();
        this.bmi = in.readString();
        this.bodyFat = in.readString();
        this.e = in.readString();
        this.f = in.readInt();
        this.g = in.readInt();
    }
}
