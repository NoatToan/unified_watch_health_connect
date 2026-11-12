package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "BleDevicesResultCreator")
@SafeParcelable.Reserved({1000})
@Deprecated
public class BleDevicesResult extends AbstractSafeParcelable implements Result {

    @RecentlyNonNull
    public static final Parcelable.Creator<BleDevicesResult> CREATOR = new zza();

    @SafeParcelable.Field(getter = "getClaimedBleDevices", id = 1)
    private final List<BleDevice> a;

    @SafeParcelable.Field(getter = "getStatus", id = 2)
    private final Status b;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public BleDevicesResult(@RecentlyNonNull @SafeParcelable.Param(id = 1) List<BleDevice> list, @RecentlyNonNull @SafeParcelable.Param(id = 2) Status status) {
        this.a = Collections.unmodifiableList(list);
        this.b = status;
    }

    @RecentlyNonNull
    @ShowFirstParty
    public static BleDevicesResult zzb(@RecentlyNonNull Status status) {
        return new BleDevicesResult(Collections.emptyList(), status);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleDevicesResult)) {
            return false;
        }
        BleDevicesResult bleDevicesResult = (BleDevicesResult) obj;
        return this.b.equals(bleDevicesResult.b) && Objects.equal(this.a, bleDevicesResult.a);
    }

    @RecentlyNonNull
    public List<BleDevice> getClaimedBleDevices() {
        return this.a;
    }

    @Override // com.google.android.gms.common.api.Result
    @RecentlyNonNull
    public Status getStatus() {
        return this.b;
    }

    public int hashCode() {
        return Objects.hashCode(this.b, this.a);
    }

    @RecentlyNonNull
    public String toString() {
        return Objects.toStringHelper(this).add("status", this.b).add("bleDevices", this.a).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getClaimedBleDevices(), false);
        SafeParcelWriter.writeParcelable(parcel, 2, getStatus(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @RecentlyNonNull
    public List<BleDevice> getClaimedBleDevices(@RecentlyNonNull DataType dataType) {
        ArrayList arrayList = new ArrayList();
        for (BleDevice bleDevice : this.a) {
            if (bleDevice.getDataTypes().contains(dataType)) {
                arrayList.add(bleDevice);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
