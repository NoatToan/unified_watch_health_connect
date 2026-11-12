package com.xiaomi.hm.health.share;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes21.dex */
public class ShareContinue implements Parcelable {
    public static final Parcelable.Creator<ShareContinue> CREATOR = new a();
    public int a;
    public String b;
    public String c;
    public boolean d;
    public int days;
    public String text;
    public String title;

    public class a implements Parcelable.Creator<ShareContinue> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ShareContinue createFromParcel(Parcel source) {
            return new ShareContinue(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ShareContinue[] newArray(int size) {
            return new ShareContinue[size];
        }
    }

    public ShareContinue() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.days);
        parcel.writeInt(this.a);
        parcel.writeString(this.title);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.text);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
    }

    private ShareContinue(Parcel in) {
        this.days = in.readInt();
        this.a = in.readInt();
        this.title = in.readString();
        this.b = in.readString();
        this.c = in.readString();
        this.text = in.readString();
        this.d = in.readByte() != 0;
    }
}
