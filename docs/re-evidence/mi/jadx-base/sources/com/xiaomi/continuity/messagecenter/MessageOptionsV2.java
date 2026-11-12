package com.xiaomi.continuity.messagecenter;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.h64;
import defpackage.mkh;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class MessageOptionsV2 implements Parcelable {
    public static final Parcelable.Creator<MessageOptionsV2> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11190b;
    public List<String> c;
    public int d;

    public class a implements Parcelable.Creator<MessageOptionsV2> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MessageOptionsV2 createFromParcel(Parcel parcel) {
            parcel.readInt();
            parcel.dataPosition();
            return new MessageOptionsV2(parcel, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MessageOptionsV2[] newArray(int i) {
            return new MessageOptionsV2[i];
        }
    }

    public MessageOptionsV2() {
        this.d = 0;
    }

    public final /* synthetic */ void c(Parcel parcel, Parcel parcel2, int i) {
        parcel.writeInt(0);
        parcel.writeInt(this.f11189a);
        parcel.writeInt(this.f11190b);
        parcel.writeSerializable((Serializable) this.c);
        parcel.writeInt(this.d);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(final Parcel parcel, int i) {
        mkh.a(parcel, i, new h64() { // from class: fsf
            @Override // defpackage.h64
            public final void a(Parcel parcel2, int i2) {
                this.f18158a.c(parcel, parcel2, i2);
            }
        });
    }

    public MessageOptionsV2(Parcel parcel, int i) {
        this.d = 0;
        this.f11189a = parcel.readInt();
        this.f11190b = parcel.readInt();
        this.c = (List) parcel.readSerializable();
        this.d = parcel.readInt();
    }
}
