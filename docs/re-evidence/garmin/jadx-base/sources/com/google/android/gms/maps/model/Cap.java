package com.google.android.gms.maps.model;

import am.j;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes14.dex */
@SafeParcelable.Class(creator = "CapCreator")
@SafeParcelable.Reserved({1})
public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Cap> CREATOR = new zzb();
    private static final String zza = "Cap";

    @SafeParcelable.Field(getter = "getType", id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getWrappedBitmapDescriptorImplBinder", id = 3, type = "android.os.IBinder")
    private final BitmapDescriptor zzc;

    @SafeParcelable.Field(getter = "getBitmapRefWidth", id = 4)
    private final Float zzd;

    private Cap(int i14, BitmapDescriptor bitmapDescriptor, Float f14) {
        boolean z14 = true;
        boolean z15 = f14 != null && f14.floatValue() > 0.0f;
        if (i14 == 3) {
            z14 = bitmapDescriptor != null && z15;
            i14 = 3;
        }
        Preconditions.checkArgument(z14, "Invalid Cap: type=" + i14 + " bitmapDescriptor=" + bitmapDescriptor + " bitmapRefWidth=" + f14);
        this.zzb = i14;
        this.zzc = bitmapDescriptor;
        this.zzd = f14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.zzb == cap.zzb && Objects.equal(this.zzc, cap.zzc) && Objects.equal(this.zzd, cap.zzd);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public String toString() {
        return j.q(new StringBuilder("[Cap: type="), this.zzb, "]");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        int i15 = this.zzb;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i15);
        BitmapDescriptor bitmapDescriptor = this.zzc;
        SafeParcelWriter.writeIBinder(parcel, 3, bitmapDescriptor == null ? null : bitmapDescriptor.zza().asBinder(), false);
        SafeParcelWriter.writeFloatObject(parcel, 4, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final Cap zza() {
        int i14 = this.zzb;
        if (i14 == 0) {
            return new ButtCap();
        }
        if (i14 == 1) {
            return new SquareCap();
        }
        if (i14 == 2) {
            return new RoundCap();
        }
        if (i14 != 3) {
            return this;
        }
        BitmapDescriptor bitmapDescriptor = this.zzc;
        Preconditions.checkState(bitmapDescriptor != null, "bitmapDescriptor must not be null");
        Float f14 = this.zzd;
        Preconditions.checkState(f14 != null, "bitmapRefWidth must not be null");
        return new CustomCap(bitmapDescriptor, f14.floatValue());
    }

    @SafeParcelable.Constructor
    public Cap(@SafeParcelable.Param(id = 2) int i14, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) Float f14) {
        this(i14, iBinder == null ? null : new BitmapDescriptor(IObjectWrapper.Stub.asInterface(iBinder)), f14);
    }

    public Cap(int i14) {
        this(i14, (BitmapDescriptor) null, (Float) null);
    }

    public Cap(BitmapDescriptor bitmapDescriptor, float f14) {
        this(3, bitmapDescriptor, Float.valueOf(f14));
    }
}
