package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "BleDeviceCreator")
@SafeParcelable.Reserved({1000})
@Deprecated
public class BleDevice extends AbstractSafeParcelable implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<BleDevice> CREATOR = new zzd();

    @SafeParcelable.Field(getter = "getAddress", id = 1)
    private final String a;

    @SafeParcelable.Field(getter = "getName", id = 2)
    private final String b;

    @SafeParcelable.Field(getter = "getSupportedProfiles", id = 3)
    private final List<String> c;

    @SafeParcelable.Field(getter = "getDataTypes", id = 4)
    private final List<DataType> d;

    @SafeParcelable.Constructor
    public BleDevice(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) List<String> list, @SafeParcelable.Param(id = 4) List<DataType> list2) {
        this.a = str;
        this.b = str2;
        this.c = Collections.unmodifiableList(list);
        this.d = Collections.unmodifiableList(list2);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BleDevice)) {
            return false;
        }
        BleDevice bleDevice = (BleDevice) obj;
        return this.b.equals(bleDevice.b) && this.a.equals(bleDevice.a) && new HashSet(this.c).equals(new HashSet(bleDevice.c)) && new HashSet(this.d).equals(new HashSet(bleDevice.d));
    }

    @RecentlyNonNull
    public String getAddress() {
        return this.a;
    }

    @RecentlyNonNull
    public List<DataType> getDataTypes() {
        return this.d;
    }

    @RecentlyNonNull
    public String getName() {
        return this.b;
    }

    @RecentlyNonNull
    public List<String> getSupportedProfiles() {
        return this.c;
    }

    public int hashCode() {
        return Objects.hashCode(this.b, this.a, this.c, this.d);
    }

    @RecentlyNonNull
    public String toString() {
        return Objects.toStringHelper(this).add("name", this.b).add(IntegrityManager.INTEGRITY_TYPE_ADDRESS, this.a).add("dataTypes", this.d).add("supportedProfiles", this.c).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getAddress(), false);
        SafeParcelWriter.writeString(parcel, 2, getName(), false);
        SafeParcelWriter.writeStringList(parcel, 3, getSupportedProfiles(), false);
        SafeParcelWriter.writeTypedList(parcel, 4, getDataTypes(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
