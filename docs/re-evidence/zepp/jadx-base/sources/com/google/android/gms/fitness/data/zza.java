package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "ApplicationCreator")
@SafeParcelable.Reserved({2, 3, 1000})
public final class zza extends AbstractSafeParcelable {

    @SafeParcelable.Field(getter = "getPackageName", id = 1)
    private final String a;
    public static final zza zzlb = new zza("com.google.android.gms");
    public static final Parcelable.Creator<zza> CREATOR = new zzc();

    @SafeParcelable.Constructor
    public zza(@SafeParcelable.Param(id = 1) String str) {
        this.a = (String) Preconditions.checkNotNull(str);
    }

    public static zza zza(String str) {
        return "com.google.android.gms".equals(str) ? zzlb : new zza(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zza) {
            return this.a.equals(((zza) obj).a);
        }
        return false;
    }

    public final String getPackageName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.format("Application{%s}", this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
