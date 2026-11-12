package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "DataTypeResultCreator")
@SafeParcelable.Reserved({1000})
@Deprecated
public class DataTypeResult extends AbstractSafeParcelable implements Result {

    @RecentlyNonNull
    public static final Parcelable.Creator<DataTypeResult> CREATOR = new zze();

    @SafeParcelable.Field(getter = "getStatus", id = 1)
    private final Status a;

    @Nullable
    @SafeParcelable.Field(getter = "getDataType", id = 3)
    private final DataType b;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public DataTypeResult(@RecentlyNonNull @SafeParcelable.Param(id = 1) Status status, @Nullable @SafeParcelable.Param(id = 3) DataType dataType) {
        this.a = status;
        this.b = dataType;
    }

    @RecentlyNonNull
    @ShowFirstParty
    public static DataTypeResult zzc(@RecentlyNonNull Status status) {
        return new DataTypeResult(status, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataTypeResult)) {
            return false;
        }
        DataTypeResult dataTypeResult = (DataTypeResult) obj;
        return this.a.equals(dataTypeResult.a) && Objects.equal(this.b, dataTypeResult.b);
    }

    @RecentlyNullable
    public DataType getDataType() {
        return this.b;
    }

    @Override // com.google.android.gms.common.api.Result
    @RecentlyNonNull
    public Status getStatus() {
        return this.a;
    }

    public int hashCode() {
        return Objects.hashCode(this.a, this.b);
    }

    @RecentlyNonNull
    public String toString() {
        return Objects.toStringHelper(this).add("status", this.a).add("dataType", this.b).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getStatus(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, getDataType(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
