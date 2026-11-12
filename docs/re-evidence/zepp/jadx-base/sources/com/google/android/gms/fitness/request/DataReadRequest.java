package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.fitness.zzbf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "DataReadRequestCreator")
@SafeParcelable.Reserved({11, 15, 16, 17, 1000})
public class DataReadRequest extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<DataReadRequest> CREATOR = new zzn();
    public static final int NO_LIMIT = 0;

    @SafeParcelable.Field(getter = "getDataTypes", id = 1)
    private final List<DataType> a;

    @SafeParcelable.Field(getter = "getDataSources", id = 2)
    private final List<DataSource> b;

    @SafeParcelable.Field(getter = "getStartTimeMillis", id = 3)
    private final long c;

    @SafeParcelable.Field(getter = "getEndTimeMillis", id = 4)
    private final long d;

    @SafeParcelable.Field(getter = "getAggregatedDataTypes", id = 5)
    private final List<DataType> e;

    @SafeParcelable.Field(getter = "getAggregatedDataSources", id = 6)
    private final List<DataSource> f;

    @SafeParcelable.Field(getter = "getBucketType", id = 7)
    private final int g;

    @SafeParcelable.Field(getter = "getBucketDurationMillis", id = 8)
    private final long h;

    @SafeParcelable.Field(getter = "getActivityDataSource", id = 9)
    private final DataSource i;

    @SafeParcelable.Field(getter = "getLimit", id = 10)
    private final int j;

    @SafeParcelable.Field(getter = "flushBufferBeforeRead", id = 12)
    private final boolean k;

    @SafeParcelable.Field(getter = "areServerQueriesEnabled", id = 13)
    private final boolean l;

    @Nullable
    @SafeParcelable.Field(getter = "getCallbackBinder", id = 14, type = "android.os.IBinder")
    private final com.google.android.gms.internal.fitness.zzbc m;

    @SafeParcelable.Field(getter = "getIntervalStartTimesNanos", id = 18)
    private final List<Long> n;

    @SafeParcelable.Field(getter = "getIntervalEndTimesNanos", id = 19)
    private final List<Long> o;

    @SafeParcelable.Constructor
    public DataReadRequest(@SafeParcelable.Param(id = 1) List<DataType> list, @SafeParcelable.Param(id = 2) List<DataSource> list2, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) long j2, @SafeParcelable.Param(id = 5) List<DataType> list3, @SafeParcelable.Param(id = 6) List<DataSource> list4, @SafeParcelable.Param(id = 7) int i, @SafeParcelable.Param(id = 8) long j3, @SafeParcelable.Param(id = 9) DataSource dataSource, @SafeParcelable.Param(id = 10) int i2, @SafeParcelable.Param(id = 12) boolean z, @SafeParcelable.Param(id = 13) boolean z2, @Nullable @SafeParcelable.Param(id = 14) IBinder iBinder, @SafeParcelable.Param(id = 18) List<Long> list5, @SafeParcelable.Param(id = 19) List<Long> list6) {
        this.a = list;
        this.b = list2;
        this.c = j;
        this.d = j2;
        this.e = list3;
        this.f = list4;
        this.g = i;
        this.h = j3;
        this.i = dataSource;
        this.j = i2;
        this.k = z;
        this.l = z2;
        this.m = iBinder == null ? null : zzbf.zzc(iBinder);
        List<Long> listEmptyList = list5 == null ? Collections.emptyList() : list5;
        this.n = listEmptyList;
        List<Long> listEmptyList2 = list6 == null ? Collections.emptyList() : list6;
        this.o = listEmptyList2;
        Preconditions.checkArgument(listEmptyList.size() == listEmptyList2.size(), "Unequal number of interval start and end times.");
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof DataReadRequest) {
                DataReadRequest dataReadRequest = (DataReadRequest) obj;
                if (this.a.equals(dataReadRequest.a) && this.b.equals(dataReadRequest.b) && this.c == dataReadRequest.c && this.d == dataReadRequest.d && this.g == dataReadRequest.g && this.f.equals(dataReadRequest.f) && this.e.equals(dataReadRequest.e) && Objects.equal(this.i, dataReadRequest.i) && this.h == dataReadRequest.h && this.l == dataReadRequest.l && this.j == dataReadRequest.j && this.k == dataReadRequest.k && Objects.equal(this.m, dataReadRequest.m)) {
                }
            }
            return false;
        }
        return true;
    }

    @RecentlyNullable
    public DataSource getActivityDataSource() {
        return this.i;
    }

    @RecentlyNonNull
    public List<DataSource> getAggregatedDataSources() {
        return this.f;
    }

    @RecentlyNonNull
    public List<DataType> getAggregatedDataTypes() {
        return this.e;
    }

    public long getBucketDuration(@RecentlyNonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.h, TimeUnit.MILLISECONDS);
    }

    public int getBucketType() {
        return this.g;
    }

    @RecentlyNonNull
    public List<DataSource> getDataSources() {
        return this.b;
    }

    @RecentlyNonNull
    public List<DataType> getDataTypes() {
        return this.a;
    }

    public long getEndTime(@RecentlyNonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.d, TimeUnit.MILLISECONDS);
    }

    public int getLimit() {
        return this.j;
    }

    public long getStartTime(@RecentlyNonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.c, TimeUnit.MILLISECONDS);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.g), Long.valueOf(this.c), Long.valueOf(this.d));
    }

    @RecentlyNonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataReadRequest{");
        if (!this.a.isEmpty()) {
            Iterator<DataType> it2 = this.a.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next().zzm());
                sb.append(" ");
            }
        }
        if (!this.b.isEmpty()) {
            Iterator<DataSource> it3 = this.b.iterator();
            while (it3.hasNext()) {
                sb.append(it3.next().toDebugString());
                sb.append(" ");
            }
        }
        if (this.g != 0) {
            sb.append("bucket by ");
            sb.append(Bucket.zza(this.g));
            if (this.h > 0) {
                sb.append(" >");
                sb.append(this.h);
                sb.append("ms");
            }
            sb.append(": ");
        }
        if (!this.e.isEmpty()) {
            Iterator<DataType> it4 = this.e.iterator();
            while (it4.hasNext()) {
                sb.append(it4.next().zzm());
                sb.append(" ");
            }
        }
        if (!this.f.isEmpty()) {
            Iterator<DataSource> it5 = this.f.iterator();
            while (it5.hasNext()) {
                sb.append(it5.next().toDebugString());
                sb.append(" ");
            }
        }
        sb.append(String.format(Locale.US, "(%tF %tT - %tF %tT)", Long.valueOf(this.c), Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.d)));
        if (this.i != null) {
            sb.append("activities: ");
            sb.append(this.i.toDebugString());
        }
        if (this.l) {
            sb.append(" +server");
        }
        sb.append(com.alipay.sdk.m.u.i.d);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getDataTypes(), false);
        SafeParcelWriter.writeTypedList(parcel, 2, getDataSources(), false);
        SafeParcelWriter.writeLong(parcel, 3, this.c);
        SafeParcelWriter.writeLong(parcel, 4, this.d);
        SafeParcelWriter.writeTypedList(parcel, 5, getAggregatedDataTypes(), false);
        SafeParcelWriter.writeTypedList(parcel, 6, getAggregatedDataSources(), false);
        SafeParcelWriter.writeInt(parcel, 7, getBucketType());
        SafeParcelWriter.writeLong(parcel, 8, this.h);
        SafeParcelWriter.writeParcelable(parcel, 9, getActivityDataSource(), i, false);
        SafeParcelWriter.writeInt(parcel, 10, getLimit());
        SafeParcelWriter.writeBoolean(parcel, 12, this.k);
        SafeParcelWriter.writeBoolean(parcel, 13, this.l);
        com.google.android.gms.internal.fitness.zzbc zzbcVar = this.m;
        SafeParcelWriter.writeIBinder(parcel, 14, zzbcVar == null ? null : zzbcVar.asBinder(), false);
        SafeParcelWriter.writeLongList(parcel, 18, this.n, false);
        SafeParcelWriter.writeLongList(parcel, 19, this.o, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public static class Builder {
        private DataSource e;
        private long f;
        private long g;
        private final List<DataType> a = new ArrayList();
        private final List<DataSource> b = new ArrayList();
        private final List<DataType> c = new ArrayList();
        private final List<DataSource> d = new ArrayList();
        private final List<Long> h = new ArrayList();
        private final List<Long> i = new ArrayList();
        private int j = 0;
        private long k = 0;
        private int l = 0;
        private boolean m = false;
        private boolean n = false;

        @RecentlyNonNull
        @Deprecated
        public Builder aggregate(@RecentlyNonNull DataSource dataSource, @RecentlyNonNull DataType dataType) {
            Preconditions.checkNotNull(dataSource, "Attempting to add a null data source");
            Preconditions.checkState(!this.b.contains(dataSource), "Cannot add the same data source for aggregated and detailed");
            DataType dataType2 = dataSource.getDataType();
            DataType aggregateType = dataType2.getAggregateType();
            if (aggregateType != null) {
                Preconditions.checkArgument(aggregateType.equals(dataType), "Invalid output aggregate data type specified: %s -> %s", dataType2, dataType);
                if (!this.d.contains(dataSource)) {
                    this.d.add(dataSource);
                }
                return this;
            }
            String strValueOf = String.valueOf(dataType2);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 55);
            sb.append("Unsupported input data type specified for aggregation: ");
            sb.append(strValueOf);
            throw new IllegalArgumentException(sb.toString());
        }

        @RecentlyNonNull
        public Builder bucketByActivitySegment(int i, @RecentlyNonNull TimeUnit timeUnit) {
            int i2 = this.j;
            Preconditions.checkArgument(i2 == 0, "Bucketing strategy already set to %s", Integer.valueOf(i2));
            Preconditions.checkArgument(i > 0, "Must specify a valid minimum duration for an activity segment: %d", Integer.valueOf(i));
            this.j = 4;
            this.k = timeUnit.toMillis(i);
            return this;
        }

        @RecentlyNonNull
        public Builder bucketByActivityType(int i, @RecentlyNonNull TimeUnit timeUnit) {
            int i2 = this.j;
            Preconditions.checkArgument(i2 == 0, "Bucketing strategy already set to %s", Integer.valueOf(i2));
            Preconditions.checkArgument(i > 0, "Must specify a valid minimum duration for an activity segment: %d", Integer.valueOf(i));
            this.j = 3;
            this.k = timeUnit.toMillis(i);
            return this;
        }

        @RecentlyNonNull
        public Builder bucketBySession(int i, @RecentlyNonNull TimeUnit timeUnit) {
            int i2 = this.j;
            Preconditions.checkArgument(i2 == 0, "Bucketing strategy already set to %s", Integer.valueOf(i2));
            Preconditions.checkArgument(i > 0, "Must specify a valid minimum duration for a session: %d", Integer.valueOf(i));
            this.j = 2;
            this.k = timeUnit.toMillis(i);
            return this;
        }

        @RecentlyNonNull
        public Builder bucketByTime(int i, @RecentlyNonNull TimeUnit timeUnit) {
            int i2 = this.j;
            Preconditions.checkArgument(i2 == 0, "Bucketing strategy already set to %s", Integer.valueOf(i2));
            Preconditions.checkArgument(i > 0, "Must specify a valid minimum duration: %d", Integer.valueOf(i));
            this.j = 1;
            this.k = timeUnit.toMillis(i);
            return this;
        }

        @RecentlyNonNull
        public DataReadRequest build() {
            Preconditions.checkState((this.b.isEmpty() && this.a.isEmpty() && this.d.isEmpty() && this.c.isEmpty()) ? false : true, "Must add at least one data source (aggregated or detailed)");
            if (this.j != 5) {
                long j = this.f;
                Preconditions.checkState(j > 0, "Invalid start time: %s", Long.valueOf(j));
                long j2 = this.g;
                Preconditions.checkState(j2 > 0 && j2 > this.f, "Invalid end time: %s", Long.valueOf(j2));
            }
            boolean z = this.d.isEmpty() && this.c.isEmpty();
            if (this.j == 0) {
                Preconditions.checkState(z, "Must specify a valid bucketing strategy while requesting aggregation");
            }
            if (!z) {
                Preconditions.checkState(this.j != 0, "Must specify a valid bucketing strategy while requesting aggregation");
            }
            return new DataReadRequest(this);
        }

        @RecentlyNonNull
        public Builder enableServerQueries() {
            this.n = true;
            return this;
        }

        @RecentlyNonNull
        public Builder read(@RecentlyNonNull DataSource dataSource) {
            Preconditions.checkNotNull(dataSource, "Attempting to add a null data source");
            Preconditions.checkArgument(!this.d.contains(dataSource), "Cannot add the same data source as aggregated and detailed");
            if (!this.b.contains(dataSource)) {
                this.b.add(dataSource);
            }
            return this;
        }

        @RecentlyNonNull
        public Builder setLimit(int i) {
            Preconditions.checkArgument(i > 0, "Invalid limit %d is specified", Integer.valueOf(i));
            this.l = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setTimeRange(long j, long j2, @RecentlyNonNull TimeUnit timeUnit) {
            this.f = timeUnit.toMillis(j);
            this.g = timeUnit.toMillis(j2);
            return this;
        }

        @RecentlyNonNull
        public Builder read(@RecentlyNonNull DataType dataType) {
            Preconditions.checkNotNull(dataType, "Attempting to use a null data type");
            Preconditions.checkState(!this.c.contains(dataType), "Cannot add the same data type as aggregated and detailed");
            if (!this.a.contains(dataType)) {
                this.a.add(dataType);
            }
            return this;
        }

        @RecentlyNonNull
        public Builder bucketByActivitySegment(int i, @RecentlyNonNull TimeUnit timeUnit, @RecentlyNonNull DataSource dataSource) {
            int i2 = this.j;
            Preconditions.checkArgument(i2 == 0, "Bucketing strategy already set to %s", Integer.valueOf(i2));
            Preconditions.checkArgument(i > 0, "Must specify a valid minimum duration for an activity segment: %d", Integer.valueOf(i));
            Preconditions.checkArgument(dataSource != null, "Invalid activity data source specified");
            Preconditions.checkArgument(dataSource.getDataType().equals(DataType.TYPE_ACTIVITY_SEGMENT), "Invalid activity data source specified: %s", dataSource);
            this.e = dataSource;
            this.j = 4;
            this.k = timeUnit.toMillis(i);
            return this;
        }

        @RecentlyNonNull
        public Builder bucketByActivityType(int i, @RecentlyNonNull TimeUnit timeUnit, @RecentlyNonNull DataSource dataSource) {
            int i2 = this.j;
            Preconditions.checkArgument(i2 == 0, "Bucketing strategy already set to %s", Integer.valueOf(i2));
            Preconditions.checkArgument(i > 0, "Must specify a valid minimum duration for an activity segment: %d", Integer.valueOf(i));
            Preconditions.checkArgument(dataSource != null, "Invalid activity data source specified");
            Preconditions.checkArgument(dataSource.getDataType().equals(DataType.TYPE_ACTIVITY_SEGMENT), "Invalid activity data source specified: %s", dataSource);
            this.e = dataSource;
            this.j = 3;
            this.k = timeUnit.toMillis(i);
            return this;
        }

        @RecentlyNonNull
        public Builder aggregate(@RecentlyNonNull DataSource dataSource) {
            Preconditions.checkNotNull(dataSource, "Attempting to add a null data source");
            Preconditions.checkState(!this.b.contains(dataSource), "Cannot add the same data source for aggregated and detailed");
            DataType dataType = dataSource.getDataType();
            Preconditions.checkArgument(dataType.getAggregateType() != null, "Unsupported input data type specified for aggregation: %s", dataType);
            if (!this.d.contains(dataSource)) {
                this.d.add(dataSource);
            }
            return this;
        }

        @RecentlyNonNull
        @Deprecated
        public Builder aggregate(@RecentlyNonNull DataType dataType, @RecentlyNonNull DataType dataType2) {
            Preconditions.checkNotNull(dataType, "Attempting to use a null data type");
            Preconditions.checkState(!this.a.contains(dataType), "Cannot add the same data type as aggregated and detailed");
            DataType aggregateType = dataType.getAggregateType();
            if (aggregateType != null) {
                Preconditions.checkArgument(aggregateType.equals(dataType2), "Invalid output aggregate data type specified: %s -> %s", dataType, dataType2);
                if (!this.c.contains(dataType)) {
                    this.c.add(dataType);
                }
                return this;
            }
            String strValueOf = String.valueOf(dataType);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 55);
            sb.append("Unsupported input data type specified for aggregation: ");
            sb.append(strValueOf);
            throw new IllegalArgumentException(sb.toString());
        }

        @RecentlyNonNull
        public Builder aggregate(@RecentlyNonNull DataType dataType) {
            Preconditions.checkNotNull(dataType, "Attempting to use a null data type");
            Preconditions.checkState(!this.a.contains(dataType), "Cannot add the same data type as aggregated and detailed");
            Preconditions.checkArgument(dataType.getAggregateType() != null, "Unsupported input data type specified for aggregation: %s", dataType);
            if (!this.c.contains(dataType)) {
                this.c.add(dataType);
            }
            return this;
        }
    }

    private DataReadRequest(Builder builder) {
        this((List<DataType>) builder.a, (List<DataSource>) builder.b, builder.f, builder.g, (List<DataType>) builder.c, (List<DataSource>) builder.d, builder.j, builder.k, builder.e, builder.l, false, builder.n, (com.google.android.gms.internal.fitness.zzbc) null, (List<Long>) builder.h, (List<Long>) builder.i);
    }

    public DataReadRequest(DataReadRequest dataReadRequest, com.google.android.gms.internal.fitness.zzbc zzbcVar) {
        this(dataReadRequest.a, dataReadRequest.b, dataReadRequest.c, dataReadRequest.d, dataReadRequest.e, dataReadRequest.f, dataReadRequest.g, dataReadRequest.h, dataReadRequest.i, dataReadRequest.j, dataReadRequest.k, dataReadRequest.l, zzbcVar, dataReadRequest.n, dataReadRequest.o);
    }

    private DataReadRequest(List<DataType> list, List<DataSource> list2, long j, long j2, List<DataType> list3, List<DataSource> list4, int i, long j3, DataSource dataSource, int i2, boolean z, boolean z2, @Nullable com.google.android.gms.internal.fitness.zzbc zzbcVar, List<Long> list5, List<Long> list6) {
        this(list, list2, j, j2, list3, list4, i, j3, dataSource, i2, z, z2, zzbcVar == null ? null : zzbcVar.asBinder(), list5, list6);
    }
}
