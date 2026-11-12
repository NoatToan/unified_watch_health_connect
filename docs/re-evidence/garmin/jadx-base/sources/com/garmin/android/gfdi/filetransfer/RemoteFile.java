package com.garmin.android.gfdi.filetransfer;

import android.os.Parcel;
import android.os.Parcelable;
import dz2.c;
import java.util.Locale;
import vb.h;
import wr.g;

/* JADX INFO: loaded from: classes8.dex */
public final class RemoteFile implements Parcelable {
    public static final Parcelable.Creator<RemoteFile> CREATOR = new Parcelable.Creator<RemoteFile>() { // from class: com.garmin.android.gfdi.filetransfer.RemoteFile.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemoteFile createFromParcel(Parcel parcel) {
            return new RemoteFile(parcel, 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RemoteFile[] newArray(int i14) {
            return new RemoteFile[i14];
        }
    };
    private final byte mDataType;
    private final byte[] mIdentifier;
    private final int mIndex;
    private final long mSize;
    private final String mXmlDataType;

    private RemoteFile(Parcel parcel) {
        this.mDataType = parcel.readByte();
        byte[] bArr = new byte[3];
        this.mIdentifier = bArr;
        parcel.readByteArray(bArr);
        this.mIndex = parcel.readInt();
        this.mSize = parcel.readLong();
        this.mXmlDataType = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte getDataType() {
        return this.mDataType;
    }

    public byte[] getIdentifier() {
        return this.mIdentifier;
    }

    public int getIndex() {
        return this.mIndex;
    }

    public long getSize() {
        return this.mSize;
    }

    public byte getSubType() {
        return this.mIdentifier[0];
    }

    public String getXmlDataType() {
        return this.mXmlDataType;
    }

    public String toString() {
        Locale locale = Locale.US;
        byte b14 = this.mDataType;
        String strA = c.a(this.mIdentifier);
        int i14 = this.mIndex;
        StringBuilder sbR = g.r(b14, "dataType: ", ", identifier: ", strA, ", index: ");
        sbR.append(i14);
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        parcel.writeByte(this.mDataType);
        parcel.writeByteArray(this.mIdentifier);
        parcel.writeInt(this.mIndex);
        parcel.writeLong(this.mSize);
        parcel.writeString(this.mXmlDataType);
    }

    public RemoteFile(byte b14, byte[] bArr, int i14, long j8, String str) {
        if (bArr != null && bArr.length == 3) {
            this.mDataType = b14;
            this.mIdentifier = bArr;
            this.mIndex = i14;
            this.mSize = j8;
            this.mXmlDataType = str;
            return;
        }
        h.s("identifier is invalid");
        throw null;
    }

    public /* synthetic */ RemoteFile(Parcel parcel, int i14) {
        this(parcel);
    }
}
