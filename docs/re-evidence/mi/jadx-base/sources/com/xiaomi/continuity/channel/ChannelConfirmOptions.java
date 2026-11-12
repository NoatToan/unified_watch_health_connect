package com.xiaomi.continuity.channel;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.h64;
import defpackage.j3s;
import defpackage.mkh;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class ChannelConfirmOptions implements Parcelable {
    public static final Parcelable.Creator<ChannelConfirmOptions> CREATOR = new a();
    private static final int localVer = 0;
    private byte[] mSystemData;
    private String mUserData;

    public class a implements Parcelable.Creator<ChannelConfirmOptions> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ChannelConfirmOptions createFromParcel(Parcel parcel) {
            int i = parcel.readInt();
            int iDataPosition = parcel.dataPosition();
            ChannelConfirmOptions channelConfirmOptions = new ChannelConfirmOptions(parcel, (a) null);
            parcel.setDataPosition(iDataPosition + i);
            return channelConfirmOptions;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ChannelConfirmOptions[] newArray(int i) {
            return new ChannelConfirmOptions[i];
        }
    }

    public ChannelConfirmOptions() {
    }

    private ChannelConfirmOptions(Parcel parcel) {
        parcel.readInt();
        this.mUserData = parcel.readString();
        this.mSystemData = parcel.createByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$writeToParcel$0(Parcel parcel, Parcel parcel2, int i) {
        parcel.writeInt(0);
        parcel.writeString(this.mUserData);
        parcel.writeByteArray(this.mSystemData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getSystemData() {
        return this.mSystemData;
    }

    public String getUserData() {
        return this.mUserData;
    }

    public String toString() {
        StringBuilder sbA = j3s.a("ChannelConfirmOptions{mUserData=");
        sbA.append(this.mUserData);
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(final Parcel parcel, int i) {
        mkh.a(parcel, i, new h64() { // from class: jt3
            @Override // defpackage.h64
            public final void a(Parcel parcel2, int i2) {
                this.f23106a.lambda$writeToParcel$0(parcel, parcel2, i2);
            }
        });
    }

    public /* synthetic */ ChannelConfirmOptions(Parcel parcel, a aVar) {
        this(parcel);
    }

    public ChannelConfirmOptions(String str, byte[] bArr) {
        this.mUserData = str;
        this.mSystemData = bArr;
    }
}
