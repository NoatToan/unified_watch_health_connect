package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
final class b implements Parcelable.Creator<Tile> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Tile createFromParcel(Parcel parcel) {
        return new Tile(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createByteArray());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Tile[] newArray(int i) {
        return new Tile[i];
    }
}
