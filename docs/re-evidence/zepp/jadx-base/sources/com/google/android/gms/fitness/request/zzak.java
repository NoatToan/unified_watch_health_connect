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
import com.google.android.gms.internal.fitness.zzcc;
import com.google.android.gms.internal.fitness.zzcf;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "ListSubscriptionsRequestCreator")
@SafeParcelable.Reserved({3, 1000})
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new zzaj();

    @Nullable
    @SafeParcelable.Field(getter = "getDataType", id = 1)
    private final DataType a;

    @Nullable
    @SafeParcelable.Field(getter = "getCallbackBinder", id = 2, type = "android.os.IBinder")
    private final zzcc b;

    @SafeParcelable.Constructor
    public zzak(@Nullable @SafeParcelable.Param(id = 1) DataType dataType, @Nullable @SafeParcelable.Param(id = 2) IBinder iBinder) {
        this.a = dataType;
        this.b = iBinder == null ? null : zzcf.zzg(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.a, i, false);
        zzcc zzccVar = this.b;
        SafeParcelWriter.writeIBinder(parcel, 2, zzccVar == null ? null : zzccVar.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzak(@Nullable DataType dataType, zzcc zzccVar) {
        this.a = dataType;
        this.b = zzccVar;
    }
}
