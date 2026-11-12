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
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "DataSourcesResultCreator")
@SafeParcelable.Reserved({1000})
public class DataSourcesResult extends AbstractSafeParcelable implements Result {

    @RecentlyNonNull
    public static final Parcelable.Creator<DataSourcesResult> CREATOR = new zzd();

    @SafeParcelable.Field(getter = "getDataSources", id = 1)
    private final List<DataSource> a;

    @SafeParcelable.Field(getter = "getStatus", id = 2)
    private final Status b;

    @ShowFirstParty
    @SafeParcelable.Constructor
    public DataSourcesResult(@RecentlyNonNull @SafeParcelable.Param(id = 1) List<DataSource> list, @RecentlyNonNull @SafeParcelable.Param(id = 2) Status status) {
        this.a = Collections.unmodifiableList(list);
        this.b = status;
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof DataSourcesResult) {
                DataSourcesResult dataSourcesResult = (DataSourcesResult) obj;
                if (this.b.equals(dataSourcesResult.b) && Objects.equal(this.a, dataSourcesResult.a)) {
                }
            }
            return false;
        }
        return true;
    }

    @RecentlyNonNull
    public List<DataSource> getDataSources() {
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
        return Objects.toStringHelper(this).add("status", this.b).add("dataSources", this.a).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getDataSources(), false);
        SafeParcelWriter.writeParcelable(parcel, 2, getStatus(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @RecentlyNonNull
    public List<DataSource> getDataSources(@RecentlyNonNull DataType dataType) {
        ArrayList arrayList = new ArrayList();
        for (DataSource dataSource : this.a) {
            if (dataSource.getDataType().equals(dataType)) {
                arrayList.add(dataSource);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
