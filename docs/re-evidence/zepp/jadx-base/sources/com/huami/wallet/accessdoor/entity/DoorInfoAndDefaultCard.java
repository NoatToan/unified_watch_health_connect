package com.huami.wallet.accessdoor.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.huami.nfc.door.DoorCardInfo;

/* JADX INFO: loaded from: classes4.dex */
public class DoorInfoAndDefaultCard implements Parcelable {
    public static final Parcelable.Creator<DoorInfoAndDefaultCard> CREATOR = new a();
    private DoorCardInfo a;
    private boolean b;

    public class a implements Parcelable.Creator<DoorInfoAndDefaultCard> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DoorInfoAndDefaultCard createFromParcel(Parcel parcel) {
            return new DoorInfoAndDefaultCard(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DoorInfoAndDefaultCard[] newArray(int i) {
            return new DoorInfoAndDefaultCard[i];
        }
    }

    public DoorInfoAndDefaultCard(DoorCardInfo doorCardInfo, boolean z) {
        this.a = doorCardInfo;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DoorCardInfo getDoorCardInfo() {
        return this.a;
    }

    public boolean getIdDefaultCard() {
        return this.b;
    }

    public void setDoorCardInfo(DoorCardInfo doorCardInfo) {
        this.a = doorCardInfo;
    }

    public void setIdDefaultCard(boolean z) {
        this.b = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
    }

    private DoorInfoAndDefaultCard(Parcel parcel) {
        this.a = (DoorCardInfo) parcel.readParcelable(DoorCardInfo.class.getClassLoader());
        this.b = parcel.readByte() != 0;
    }
}
