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
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.RawBucket;
import com.google.android.gms.fitness.data.RawDataSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "DataReadResultCreator")
@SafeParcelable.Reserved({7, 1000})
public class DataReadResult extends AbstractSafeParcelable implements Result {

    @RecentlyNonNull
    public static final Parcelable.Creator<DataReadResult> CREATOR = new zzc();

    @SafeParcelable.Field(getter = "getRawDataSets", id = 1, type = "java.util.List")
    private final List<DataSet> a;

    @SafeParcelable.Field(getter = "getStatus", id = 2)
    private final Status b;

    @SafeParcelable.Field(getter = "getRawBuckets", id = 3, type = "java.util.List")
    private final List<Bucket> c;

    @SafeParcelable.Field(getter = "getBatchCount", id = 5)
    private int d;

    @SafeParcelable.Field(getter = "getUniqueDataSources", id = 6)
    private final List<DataSource> e;

    @SafeParcelable.Constructor
    public DataReadResult(@SafeParcelable.Param(id = 1) List<RawDataSet> list, @SafeParcelable.Param(id = 2) Status status, @SafeParcelable.Param(id = 3) List<RawBucket> list2, @SafeParcelable.Param(id = 5) int i, @SafeParcelable.Param(id = 6) List<DataSource> list3) {
        this.b = status;
        this.d = i;
        this.e = list3;
        this.a = new ArrayList(list.size());
        Iterator<RawDataSet> it2 = list.iterator();
        while (it2.hasNext()) {
            this.a.add(new DataSet(it2.next(), list3));
        }
        this.c = new ArrayList(list2.size());
        Iterator<RawBucket> it3 = list2.iterator();
        while (it3.hasNext()) {
            this.c.add(new Bucket(it3.next(), list3));
        }
    }

    private static void a(DataSet dataSet, List<DataSet> list) {
        for (DataSet dataSet2 : list) {
            if (dataSet2.getDataSource().equals(dataSet.getDataSource())) {
                dataSet2.zza(dataSet.getDataPoints());
                return;
            }
        }
        list.add(dataSet);
    }

    @RecentlyNonNull
    @ShowFirstParty
    public static DataReadResult zza(@RecentlyNonNull Status status, @RecentlyNonNull List<DataType> list, @RecentlyNonNull List<DataSource> list2) {
        ArrayList arrayList = new ArrayList();
        Iterator<DataSource> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(DataSet.builder(it2.next()).build());
        }
        Iterator<DataType> it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList.add(DataSet.builder(new DataSource.Builder().setType(1).setDataType(it3.next()).setStreamName("Default").build()).build());
        }
        return new DataReadResult(arrayList, Collections.emptyList(), status);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataReadResult)) {
            return false;
        }
        DataReadResult dataReadResult = (DataReadResult) obj;
        return this.b.equals(dataReadResult.b) && Objects.equal(this.a, dataReadResult.a) && Objects.equal(this.c, dataReadResult.c);
    }

    @RecentlyNonNull
    public List<Bucket> getBuckets() {
        return this.c;
    }

    @RecentlyNonNull
    public DataSet getDataSet(@RecentlyNonNull DataType dataType) {
        for (DataSet dataSet : this.a) {
            if (dataType.equals(dataSet.getDataType())) {
                return dataSet;
            }
        }
        return DataSet.builder(new DataSource.Builder().setType(1).setDataType(dataType).build()).build();
    }

    @RecentlyNonNull
    public List<DataSet> getDataSets() {
        return this.a;
    }

    @Override // com.google.android.gms.common.api.Result
    @RecentlyNonNull
    public Status getStatus() {
        return this.b;
    }

    public int hashCode() {
        return Objects.hashCode(this.b, this.a, this.c);
    }

    @RecentlyNonNull
    public String toString() {
        Object string;
        Object string2;
        Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("status", this.b);
        if (this.a.size() > 5) {
            int size = this.a.size();
            StringBuilder sb = new StringBuilder(21);
            sb.append(size);
            sb.append(" data sets");
            string = sb.toString();
        } else {
            string = this.a;
        }
        Objects.ToStringHelper toStringHelperAdd2 = toStringHelperAdd.add("dataSets", string);
        if (this.c.size() > 5) {
            int size2 = this.c.size();
            StringBuilder sb2 = new StringBuilder(19);
            sb2.append(size2);
            sb2.append(" buckets");
            string2 = sb2.toString();
        } else {
            string2 = this.c;
        }
        return toStringHelperAdd2.add("buckets", string2).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        ArrayList arrayList = new ArrayList(this.a.size());
        Iterator<DataSet> it2 = this.a.iterator();
        while (it2.hasNext()) {
            arrayList.add(new RawDataSet(it2.next(), this.e));
        }
        SafeParcelWriter.writeList(parcel, 1, arrayList, false);
        SafeParcelWriter.writeParcelable(parcel, 2, getStatus(), i, false);
        ArrayList arrayList2 = new ArrayList(this.c.size());
        Iterator<Bucket> it3 = this.c.iterator();
        while (it3.hasNext()) {
            arrayList2.add(new RawBucket(it3.next(), this.e));
        }
        SafeParcelWriter.writeList(parcel, 3, arrayList2, false);
        SafeParcelWriter.writeInt(parcel, 5, this.d);
        SafeParcelWriter.writeTypedList(parcel, 6, this.e, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zzab() {
        return this.d;
    }

    public final void zzb(@RecentlyNonNull DataReadResult dataReadResult) {
        Iterator<DataSet> it2 = dataReadResult.getDataSets().iterator();
        while (it2.hasNext()) {
            a(it2.next(), this.a);
        }
        for (Bucket bucket : dataReadResult.getBuckets()) {
            Iterator<Bucket> it3 = this.c.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    this.c.add(bucket);
                    break;
                }
                Bucket next = it3.next();
                if (next.zza(bucket)) {
                    Iterator<DataSet> it4 = bucket.getDataSets().iterator();
                    while (it4.hasNext()) {
                        a(it4.next(), next.getDataSets());
                    }
                    break;
                }
            }
        }
    }

    @RecentlyNonNull
    public DataSet getDataSet(@RecentlyNonNull DataSource dataSource) {
        for (DataSet dataSet : this.a) {
            if (dataSource.equals(dataSet.getDataSource())) {
                return dataSet;
            }
        }
        return DataSet.builder(dataSource).build();
    }

    @ShowFirstParty
    private DataReadResult(List<DataSet> list, List<Bucket> list2, Status status) {
        this.a = list;
        this.b = status;
        this.c = list2;
        this.d = 1;
        this.e = new ArrayList();
    }
}
