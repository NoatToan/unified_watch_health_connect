package com.ximalaya.ting.android.opensdk.player.service;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes22.dex */
public class XmPlayerException extends Exception implements Parcelable {
    public static final Parcelable.Creator<XmPlayerException> CREATOR = new Parcelable.Creator<XmPlayerException>() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerException.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public XmPlayerException createFromParcel(Parcel parcel) {
            return new XmPlayerException(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public XmPlayerException[] newArray(int i) {
            return new XmPlayerException[i];
        }
    };
    public static final int ERROR_NO_PLAY_URL = 612;
    private static final long serialVersionUID = 8102305468025663148L;
    private String mCause;
    private int mExtra;
    private int mWhat;

    public XmPlayerException() {
        this("");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return !TextUtils.isEmpty(this.mCause) ? this.mCause : super.getMessage();
    }

    public void readFromParcel(Parcel parcel) {
        this.mCause = parcel.readString();
        this.mWhat = parcel.readInt();
        this.mExtra = parcel.readInt();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "XmPlayerException{mWhat=" + this.mWhat + ", mExtra=" + this.mExtra + ", mCause='" + this.mCause + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mCause);
        parcel.writeInt(this.mWhat);
        parcel.writeInt(this.mExtra);
    }

    public XmPlayerException(Parcel parcel) {
        this(parcel.readString());
        this.mWhat = parcel.readInt();
        this.mExtra = parcel.readInt();
    }

    public XmPlayerException(int i, int i2) {
        this("Player Status Exception, what = " + i + ", extra = " + i2);
        this.mWhat = i;
        this.mExtra = i2;
    }

    public XmPlayerException(String str) {
        super(str);
        this.mCause = str;
    }
}
