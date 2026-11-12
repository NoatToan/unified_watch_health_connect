package com.xiaomi.continuity.messagecenter;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.uoe;

/* JADX INFO: loaded from: classes7.dex */
public class MessageData implements Parcelable {
    public static final Parcelable.Creator<MessageData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f11183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f11184b;

    public class a implements Parcelable.Creator<MessageData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MessageData createFromParcel(Parcel parcel) {
            return new MessageData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MessageData[] newArray(int i) {
            return new MessageData[i];
        }
    }

    public MessageData() {
    }

    public MessageData(Parcel parcel) {
        a(parcel);
    }

    public void a(Parcel parcel) {
        int i = parcel.readInt();
        if (i <= 0 || i >= 1048576) {
            uoe.h("message-center-MessageData", "baseLength less than 0 or greater than or equal 1MByte");
            this.f11183a = new byte[0];
        } else {
            this.f11183a = new byte[i];
        }
        parcel.readByteArray(this.f11183a);
        int i2 = parcel.readInt();
        if (i2 <= 0 || i2 >= 1048576) {
            uoe.h("message-center-MessageData", "extendLength less than 0 or greater than or equal 1MByte");
            this.f11184b = new byte[0];
        } else {
            this.f11184b = new byte[i2];
        }
        parcel.readByteArray(this.f11184b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.f11183a;
        if (bArr == null || bArr.length >= 1048576) {
            uoe.h("message-center-MessageData", "baseData is null or greater than or equal 1MByte");
            this.f11183a = new byte[0];
        }
        parcel.writeInt(this.f11183a.length);
        parcel.writeByteArray(this.f11183a);
        byte[] bArr2 = this.f11184b;
        if (bArr2 == null || bArr2.length >= 1048576) {
            uoe.h("message-center-MessageData", "extendData is null or greater than or equal 1MByte");
            this.f11184b = new byte[0];
        }
        parcel.writeInt(this.f11184b.length);
        parcel.writeByteArray(this.f11184b);
    }
}
