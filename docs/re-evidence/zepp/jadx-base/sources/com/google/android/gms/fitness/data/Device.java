package com.google.android.gms.fitness.data;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "DeviceCreator")
@SafeParcelable.Reserved({3, 1000})
public final class Device extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<Device> CREATOR = new zzo();
    public static final int TYPE_CHEST_STRAP = 4;
    public static final int TYPE_HEAD_MOUNTED = 6;
    public static final int TYPE_PHONE = 1;
    public static final int TYPE_SCALE = 5;
    public static final int TYPE_TABLET = 2;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_WATCH = 3;

    @SafeParcelable.Field(getter = "getManufacturer", id = 1)
    private final String a;

    @SafeParcelable.Field(getter = "getModel", id = 2)
    private final String b;

    @SafeParcelable.Field(getter = "getUid", id = 4)
    private final String c;

    @SafeParcelable.Field(getter = "getType", id = 5)
    private final int d;

    @SafeParcelable.Field(getter = "getPlatformType", id = 6)
    private final int e;

    public Device(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull String str3, int i) {
        this(str, str2, str3, i, 0);
    }

    @RecentlyNonNull
    public static Device getLocalDevice(@RecentlyNonNull Context context) {
        int iZzb = zzq.zzb(context);
        return new Device(Build.MANUFACTURER, Build.MODEL, zzq.zza(context), iZzb, 2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Device)) {
            return false;
        }
        Device device = (Device) obj;
        return Objects.equal(this.a, device.a) && Objects.equal(this.b, device.b) && Objects.equal(this.c, device.c) && this.d == device.d && this.e == device.e;
    }

    @RecentlyNonNull
    public final String getManufacturer() {
        return this.a;
    }

    @RecentlyNonNull
    public final String getModel() {
        return this.b;
    }

    public final String getStreamIdentifier() {
        return String.format("%s:%s:%s", this.a, this.b, this.c);
    }

    public final int getType() {
        return this.d;
    }

    @RecentlyNonNull
    public final String getUid() {
        return this.c;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c, Integer.valueOf(this.d));
    }

    @RecentlyNonNull
    public final String toString() {
        return String.format("Device{%s:%s:%s}", getStreamIdentifier(), Integer.valueOf(this.d), Integer.valueOf(this.e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getManufacturer(), false);
        SafeParcelWriter.writeString(parcel, 2, getModel(), false);
        SafeParcelWriter.writeString(parcel, 4, getUid(), false);
        SafeParcelWriter.writeInt(parcel, 5, getType());
        SafeParcelWriter.writeInt(parcel, 6, this.e);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @ShowFirstParty
    @SafeParcelable.Constructor
    public Device(@RecentlyNonNull @SafeParcelable.Param(id = 1) String str, @RecentlyNonNull @SafeParcelable.Param(id = 2) String str2, @RecentlyNonNull @SafeParcelable.Param(id = 4) String str3, @SafeParcelable.Param(id = 5) int i, @SafeParcelable.Param(id = 6) int i2) {
        this.a = (String) Preconditions.checkNotNull(str);
        this.b = (String) Preconditions.checkNotNull(str2);
        if (str3 == null) {
            throw new IllegalStateException("Device UID is null.");
        }
        this.c = str3;
        this.d = i;
        this.e = i2;
    }
}
