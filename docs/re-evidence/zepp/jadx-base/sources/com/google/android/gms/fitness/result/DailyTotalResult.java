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
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "DailyTotalResultCreator")
@SafeParcelable.Reserved({1000})
public class DailyTotalResult extends AbstractSafeParcelable implements Result {

    @RecentlyNonNull
    public static final Parcelable.Creator<DailyTotalResult> CREATOR = new zzb();

    @SafeParcelable.Field(getter = "getStatus", id = 1)
    private final Status a;

    @Nullable
    @SafeParcelable.Field(getter = "getTotal", id = 2)
    private final DataSet b;

    @SafeParcelable.Constructor
    public DailyTotalResult(@RecentlyNonNull @SafeParcelable.Param(id = 1) Status status, @Nullable @SafeParcelable.Param(id = 2) DataSet dataSet) {
        this.a = status;
        this.b = dataSet;
    }

    @RecentlyNonNull
    @ShowFirstParty
    public static DailyTotalResult zza(@RecentlyNonNull Status status, @RecentlyNonNull DataType dataType) {
        return new DailyTotalResult(status, DataSet.builder(new DataSource.Builder().setType(1).setDataType(dataType).build()).build());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyTotalResult)) {
            return false;
        }
        DailyTotalResult dailyTotalResult = (DailyTotalResult) obj;
        return this.a.equals(dailyTotalResult.a) && Objects.equal(this.b, dailyTotalResult.b);
    }

    @Override // com.google.android.gms.common.api.Result
    @RecentlyNonNull
    public Status getStatus() {
        return this.a;
    }

    @RecentlyNullable
    public DataSet getTotal() {
        return this.b;
    }

    public int hashCode() {
        return Objects.hashCode(this.a, this.b);
    }

    @RecentlyNonNull
    public String toString() {
        return Objects.toStringHelper(this).add("status", this.a).add("dataPoint", this.b).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getStatus(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, getTotal(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
