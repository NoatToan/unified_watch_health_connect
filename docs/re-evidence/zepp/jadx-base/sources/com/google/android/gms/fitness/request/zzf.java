package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "DailyTotalRequestCreator")
@SafeParcelable.Reserved({3, 1000})
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zzh();

    @SafeParcelable.Field(getter = "getCallbackBinder", id = 1, type = "android.os.IBinder")
    private final com.google.android.gms.internal.fitness.zzbb a;

    @Nullable
    @SafeParcelable.Field(getter = "getDataType", id = 2)
    private final DataType b;

    @SafeParcelable.Field(getter = "getLocalDataOnly", id = 4)
    private final boolean c;

    @SafeParcelable.Constructor
    public zzf(@SafeParcelable.Param(id = 1) IBinder iBinder, @Nullable @SafeParcelable.Param(id = 2) DataType dataType, @SafeParcelable.Param(id = 4) boolean z) {
        this.a = com.google.android.gms.internal.fitness.zzba.zzb(iBinder);
        this.b = dataType;
        this.c = z;
    }

    public final String toString() {
        Object[] objArr = new Object[1];
        DataType dataType = this.b;
        objArr[0] = dataType == null ? "null" : dataType.zzm();
        return String.format("DailyTotalRequest{%s}", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, this.a.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.c);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzf(com.google.android.gms.internal.fitness.zzbb zzbbVar, @Nullable DataType dataType, boolean z) {
        this.a = zzbbVar;
        this.b = dataType;
        this.c = z;
    }
}
