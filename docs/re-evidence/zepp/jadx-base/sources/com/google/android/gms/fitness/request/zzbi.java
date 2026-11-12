package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.internal.fitness.zzcm;
import com.google.android.gms.internal.fitness.zzcn;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "SubscribeRequestCreator")
@SafeParcelable.Reserved({4, 1000})
public final class zzbi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbi> CREATOR = new zzbl();

    @Nullable
    @SafeParcelable.Field(getter = "getSubscription", id = 1)
    private Subscription a;

    @SafeParcelable.Field(getter = "isServerOnly", id = 2)
    private final boolean b;

    @Nullable
    @SafeParcelable.Field(getter = "getCallbackBinder", id = 3, type = "android.os.IBinder")
    private final zzcn c;

    @SafeParcelable.Constructor
    public zzbi(@Nullable @SafeParcelable.Param(id = 1) Subscription subscription, @SafeParcelable.Param(id = 2) boolean z, @Nullable @SafeParcelable.Param(id = 3) IBinder iBinder) {
        this.a = subscription;
        this.b = z;
        this.c = iBinder == null ? null : zzcm.zzj(iBinder);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("subscription", this.a).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.a, i, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.b);
        zzcn zzcnVar = this.c;
        SafeParcelWriter.writeIBinder(parcel, 3, zzcnVar == null ? null : zzcnVar.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzbi(@Nullable Subscription subscription, boolean z, @Nullable zzcn zzcnVar) {
        this.a = subscription;
        this.b = false;
        this.c = zzcnVar;
    }
}
