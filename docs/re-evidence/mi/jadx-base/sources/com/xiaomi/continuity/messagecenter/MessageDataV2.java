package com.xiaomi.continuity.messagecenter;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.h64;
import defpackage.mkh;
import defpackage.uoe;

/* JADX INFO: loaded from: classes7.dex */
public class MessageDataV2 implements Parcelable {
    public static final Parcelable.Creator<MessageDataV2> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f11185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f11186b;
    public int c;

    public class a implements Parcelable.Creator<MessageDataV2> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MessageDataV2 createFromParcel(Parcel parcel) {
            parcel.readInt();
            parcel.dataPosition();
            return new MessageDataV2(parcel, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MessageDataV2[] newArray(int i) {
            return new MessageDataV2[i];
        }
    }

    public MessageDataV2() {
    }

    public MessageDataV2(Parcel parcel, int i) {
        d(parcel, i);
    }

    public final /* synthetic */ void c(Parcel parcel, Parcel parcel2, int i) {
        parcel2.writeInt(0);
        byte[] bArr = this.f11185a;
        if (bArr == null || bArr.length >= 1048576) {
            uoe.h("message-center-MessageData", "baseData is null or greater than or equal 1MByte");
            this.f11185a = new byte[0];
        }
        parcel.writeInt(this.f11185a.length);
        parcel.writeByteArray(this.f11185a);
        byte[] bArr2 = this.f11186b;
        if (bArr2 == null || bArr2.length >= 1048576) {
            uoe.h("message-center-MessageData", "extendData is null or greater than or equal 1MByte");
            this.f11186b = new byte[0];
        }
        parcel.writeInt(this.f11186b.length);
        parcel.writeByteArray(this.f11186b);
        parcel.writeInt(this.c);
    }

    public void d(Parcel parcel, int i) {
        int i2 = parcel.readInt();
        if (i2 <= 0 || i2 >= 1048576) {
            uoe.h("message-center-MessageData", "baseLength less than 0 or greater than or equal 1MByte");
            this.f11185a = new byte[0];
        } else {
            this.f11185a = new byte[i2];
        }
        parcel.readByteArray(this.f11185a);
        int i3 = parcel.readInt();
        if (i3 <= 0 || i3 >= 1048576) {
            uoe.h("message-center-MessageData", "extendLength less than 0 or greater than or equal 1MByte");
            this.f11186b = new byte[0];
        } else {
            this.f11186b = new byte[i3];
        }
        parcel.readByteArray(this.f11186b);
        this.c = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(final Parcel parcel, int i) {
        mkh.a(parcel, i, new h64() { // from class: lrf
            @Override // defpackage.h64
            public final void a(Parcel parcel2, int i2) {
                this.f25374a.c(parcel, parcel2, i2);
            }
        });
    }
}
