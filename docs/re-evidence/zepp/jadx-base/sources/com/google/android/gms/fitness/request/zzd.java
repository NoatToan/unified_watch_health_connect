package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.internal.fitness.zzcm;
import com.google.android.gms.internal.fitness.zzcn;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "ClaimBleDeviceRequestCreator")
@SafeParcelable.Reserved({4, 1000})
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new zzg();

    @SafeParcelable.Field(getter = "getDeviceAddress", id = 1)
    private final String a;

    @Nullable
    @SafeParcelable.Field(getter = "getBleDevice", id = 2)
    private final BleDevice b;

    @SafeParcelable.Field(getter = "getCallbackBinder", id = 3, type = "android.os.IBinder")
    private final zzcn c;

    @SafeParcelable.Constructor
    public zzd(@SafeParcelable.Param(id = 1) String str, @Nullable @SafeParcelable.Param(id = 2) BleDevice bleDevice, @SafeParcelable.Param(id = 3) IBinder iBinder) {
        this.a = str;
        this.b = bleDevice;
        this.c = zzcm.zzj(iBinder);
    }

    public final String toString() {
        return String.format("ClaimBleDeviceRequest{%s %s}", this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        zzcn zzcnVar = this.c;
        SafeParcelWriter.writeIBinder(parcel, 3, zzcnVar == null ? null : zzcnVar.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzd(String str, @Nullable BleDevice bleDevice, zzcn zzcnVar) {
        this.a = str;
        this.b = bleDevice;
        this.c = zzcnVar;
    }
}
