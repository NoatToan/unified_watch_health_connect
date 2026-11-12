package com.xiaomi.android.ble.callback.profile;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.android.ble.response.ReadResponse;
import defpackage.bn5;

/* JADX INFO: loaded from: classes7.dex */
public class ProfileReadResponse extends ReadResponse implements bn5, Parcelable {
    public static final Parcelable.Creator<ProfileReadResponse> CREATOR = new a();
    public boolean c;

    public class a implements Parcelable.Creator<ProfileReadResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ProfileReadResponse createFromParcel(Parcel parcel) {
            return new ProfileReadResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ProfileReadResponse[] newArray(int i) {
            return new ProfileReadResponse[i];
        }
    }

    public ProfileReadResponse() {
        this.c = true;
    }

    @Override // com.xiaomi.android.ble.response.ReadResponse, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
    }

    public ProfileReadResponse(Parcel parcel) {
        super(parcel);
        this.c = true;
        this.c = parcel.readByte() != 0;
    }
}
