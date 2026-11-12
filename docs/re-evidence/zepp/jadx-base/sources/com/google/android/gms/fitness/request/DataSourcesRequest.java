package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "DataSourcesRequestCreator")
@SafeParcelable.Reserved({5, 1000})
public class DataSourcesRequest extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<DataSourcesRequest> CREATOR = new zzp();

    @SafeParcelable.Field(getter = "getDataTypes", id = 1)
    private final List<DataType> a;

    @SafeParcelable.Field(getter = "getDataSourceTypes", id = 2)
    private final List<Integer> b;

    @SafeParcelable.Field(getter = "includeDbOnlySources", id = 3)
    private final boolean c;

    @Nullable
    @SafeParcelable.Field(getter = "getCallbackBinder", id = 4, type = "android.os.IBinder")
    private final com.google.android.gms.internal.fitness.zzbh d;

    public static class Builder {
        private List<DataType> a = new ArrayList();
        private List<Integer> b = Arrays.asList(0, 1);
        private boolean c = false;

        @RecentlyNonNull
        public DataSourcesRequest build() {
            Preconditions.checkState(!this.a.isEmpty(), "Must add at least one data type");
            Preconditions.checkState(!this.b.isEmpty(), "Must add at least one data source type");
            return new DataSourcesRequest(this);
        }

        @RecentlyNonNull
        public Builder setDataSourceTypes(@RecentlyNonNull int... iArr) {
            this.b = new ArrayList();
            for (int i : iArr) {
                this.b.add(Integer.valueOf(i));
            }
            return this;
        }

        @RecentlyNonNull
        public Builder setDataTypes(@RecentlyNonNull DataType... dataTypeArr) {
            this.a = Arrays.asList(dataTypeArr);
            return this;
        }
    }

    @SafeParcelable.Constructor
    public DataSourcesRequest(@SafeParcelable.Param(id = 1) List<DataType> list, @SafeParcelable.Param(id = 2) List<Integer> list2, @SafeParcelable.Param(id = 3) boolean z, @Nullable @SafeParcelable.Param(id = 4) IBinder iBinder) {
        this.a = list;
        this.b = list2;
        this.c = z;
        this.d = iBinder == null ? null : com.google.android.gms.internal.fitness.zzbg.zzd(iBinder);
    }

    @RecentlyNonNull
    public List<DataType> getDataTypes() {
        return this.a;
    }

    @RecentlyNonNull
    public String toString() {
        Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("dataTypes", this.a).add("sourceTypes", this.b);
        if (this.c) {
            toStringHelperAdd.add("includeDbOnlySources", "true");
        }
        return toStringHelperAdd.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getDataTypes(), false);
        SafeParcelWriter.writeIntegerList(parcel, 2, this.b, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.c);
        com.google.android.gms.internal.fitness.zzbh zzbhVar = this.d;
        SafeParcelWriter.writeIBinder(parcel, 4, zzbhVar == null ? null : zzbhVar.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private DataSourcesRequest(Builder builder) {
        this((List<DataType>) builder.a, (List<Integer>) builder.b, false, (com.google.android.gms.internal.fitness.zzbh) null);
    }

    public DataSourcesRequest(DataSourcesRequest dataSourcesRequest, com.google.android.gms.internal.fitness.zzbh zzbhVar) {
        this(dataSourcesRequest.a, dataSourcesRequest.b, dataSourcesRequest.c, zzbhVar);
    }

    private DataSourcesRequest(List<DataType> list, List<Integer> list2, boolean z, @Nullable com.google.android.gms.internal.fitness.zzbh zzbhVar) {
        this.a = list;
        this.b = list2;
        this.c = z;
        this.d = zzbhVar;
    }
}
