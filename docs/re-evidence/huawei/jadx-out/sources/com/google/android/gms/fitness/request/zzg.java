package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.fitness.data.DataType;
import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes21.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new zzh();
    private final com.google.android.gms.internal.fitness.zzbe zzgk;
    private final boolean zzgl;
    private DataType zzq;

    zzg(IBinder iBinder, DataType dataType, boolean z) {
        this.zzgk = com.google.android.gms.internal.fitness.zzbf.zzb(iBinder);
        this.zzq = dataType;
        this.zzgl = z;
    }

    public zzg(com.google.android.gms.internal.fitness.zzbe zzbeVar, DataType dataType, boolean z) {
        this.zzgk = zzbeVar;
        this.zzq = dataType;
        this.zzgl = z;
    }

    public final String toString() {
        DataType dataType = this.zzq;
        return String.format("DailyTotalRequest{%s}", dataType == null ? Constants.NULL : dataType.zzm());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIBinder(parcel, 1, this.zzgk.asBinder(), false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzq, i, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzgl);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
