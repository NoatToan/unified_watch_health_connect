package com.unionpay.blepayservice;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class Channel implements Parcelable {
    public static final Parcelable.Creator<Channel> CREATOR = new a();
    private int a;
    private String b;
    private IBLETransCMDService c;

    public class a implements Parcelable.Creator<Channel> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Channel createFromParcel(Parcel parcel) {
            return new Channel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Channel[] newArray(int i) {
            return new Channel[i];
        }
    }

    public Channel(int i, String str, IBLETransCMDService iBLETransCMDService) {
        this.a = i;
        this.b = str;
        this.c = iBLETransCMDService;
    }

    public void close() {
        try {
            if (this.c.isClosed()) {
                return;
            }
            this.c.close();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getChannelID() {
        return this.a;
    }

    public String getResp() {
        return this.b;
    }

    public void setChannelID(int i) {
        this.a = i;
    }

    public void setResp(String str) {
        this.b = str;
    }

    public byte[] transmit(byte[] bArr) {
        try {
            IBLETransCMDService iBLETransCMDService = this.c;
            if (iBLETransCMDService == null || iBLETransCMDService.isClosed()) {
                return null;
            }
            return this.c.transmit(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        try {
            parcel.writeStrongInterface(this.c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Channel(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = IBLETransCMDService.Stub.asInterface(parcel.readStrongBinder());
    }
}
