package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
@SafeParcelable.Class(creator = "MapValueCreator")
@SafeParcelable.Reserved({1000})
public class MapValue extends AbstractSafeParcelable implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<MapValue> CREATOR = new zzy();

    @SafeParcelable.Field(getter = "getFormat", id = 1)
    private final int a;

    @SafeParcelable.Field(getter = "getValue", id = 2)
    private final float b;

    @SafeParcelable.Constructor
    public MapValue(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) float f) {
        this.a = i;
        this.b = f;
    }

    @RecentlyNonNull
    public static MapValue zza(float f) {
        return new MapValue(2, f);
    }

    public final float asFloat() {
        Preconditions.checkState(this.a == 2, "Value is not in float format");
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MapValue)) {
            return false;
        }
        MapValue mapValue = (MapValue) obj;
        int i = this.a;
        if (i == mapValue.a) {
            if (i != 2) {
                return this.b == mapValue.b;
            }
            if (asFloat() == mapValue.asFloat()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (int) this.b;
    }

    @RecentlyNonNull
    public String toString() {
        return this.a != 2 ? "unknown" : Float.toString(asFloat());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeFloat(parcel, 2, this.b);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
