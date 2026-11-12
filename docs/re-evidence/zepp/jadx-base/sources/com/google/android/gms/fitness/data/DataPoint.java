package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.fitness.zzko;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.acra.ACRAConstants;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "DataPointCreator")
@SafeParcelable.Reserved({1000, 8})
public final class DataPoint extends AbstractSafeParcelable implements ReflectedParcelable {

    @RecentlyNonNull
    @ShowFirstParty
    public static final Parcelable.Creator<DataPoint> CREATOR = new zzg();

    @SafeParcelable.Field(getter = "getDataSource", id = 1)
    private final DataSource a;

    @SafeParcelable.Field(getter = "getTimestampNanos", id = 3)
    private long b;

    @SafeParcelable.Field(getter = "getStartTimeNanos", id = 4)
    private long c;

    @SafeParcelable.Field(getter = "getValues", id = 5)
    private final Value[] d;

    @Nullable
    @SafeParcelable.Field(getter = "getOriginalDataSourceIfSet", id = 6)
    private DataSource e;

    @SafeParcelable.Field(getter = "getRawTimestamp", id = 7)
    private final long f;

    @SafeParcelable.Constructor
    public DataPoint(@RecentlyNonNull @SafeParcelable.Param(id = 1) DataSource dataSource, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) long j2, @RecentlyNonNull @SafeParcelable.Param(id = 5) Value[] valueArr, @Nullable @SafeParcelable.Param(id = 6) DataSource dataSource2, @SafeParcelable.Param(id = 7) long j3) {
        this.a = dataSource;
        this.e = dataSource2;
        this.b = j;
        this.c = j2;
        this.d = valueArr;
        this.f = j3;
    }

    @Nullable
    private static DataSource a(List<DataSource> list, int i) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    private final void b(int i) {
        List<Field> fields = getDataType().getFields();
        int size = fields.size();
        Preconditions.checkArgument(i == size, "Attempting to insert %s values, but needed %s: %s", Integer.valueOf(i), Integer.valueOf(size), fields);
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull DataSource dataSource) {
        Preconditions.checkNotNull(dataSource, "DataSource should be specified");
        return new Builder(dataSource);
    }

    @RecentlyNonNull
    @Deprecated
    public static DataPoint create(@RecentlyNonNull DataSource dataSource) {
        return new DataPoint(dataSource);
    }

    @RecentlyNullable
    public static DataPoint extract(@RecentlyNonNull Intent intent) {
        if (intent == null) {
            return null;
        }
        return (DataPoint) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.fitness.EXTRA_DATA_POINT", CREATOR);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataPoint)) {
            return false;
        }
        DataPoint dataPoint = (DataPoint) obj;
        return Objects.equal(this.a, dataPoint.a) && this.b == dataPoint.b && this.c == dataPoint.c && Arrays.equals(this.d, dataPoint.d) && Objects.equal(getOriginalDataSource(), dataPoint.getOriginalDataSource());
    }

    @RecentlyNonNull
    public final DataSource getDataSource() {
        return this.a;
    }

    @RecentlyNonNull
    public final DataType getDataType() {
        return this.a.getDataType();
    }

    public final long getEndTime(@RecentlyNonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.b, TimeUnit.NANOSECONDS);
    }

    @RecentlyNonNull
    public final DataSource getOriginalDataSource() {
        DataSource dataSource = this.e;
        return dataSource != null ? dataSource : this.a;
    }

    public final long getStartTime(@RecentlyNonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.c, TimeUnit.NANOSECONDS);
    }

    public final long getTimestamp(@RecentlyNonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.b, TimeUnit.NANOSECONDS);
    }

    @RecentlyNonNull
    public final Value getValue(@RecentlyNonNull Field field) {
        return this.d[getDataType().indexOf(field)];
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, Long.valueOf(this.b), Long.valueOf(this.c));
    }

    @RecentlyNonNull
    @Deprecated
    public final DataPoint setFloatValues(@RecentlyNonNull float... fArr) {
        b(fArr.length);
        for (int i = 0; i < fArr.length; i++) {
            this.d[i].setFloat(fArr[i]);
        }
        return this;
    }

    @RecentlyNonNull
    @Deprecated
    public final DataPoint setIntValues(@RecentlyNonNull int... iArr) {
        b(iArr.length);
        for (int i = 0; i < iArr.length; i++) {
            this.d[i].setInt(iArr[i]);
        }
        return this;
    }

    @RecentlyNonNull
    @Deprecated
    public final DataPoint setTimeInterval(long j, long j2, @RecentlyNonNull TimeUnit timeUnit) {
        this.c = timeUnit.toNanos(j);
        this.b = timeUnit.toNanos(j2);
        return this;
    }

    @RecentlyNonNull
    @Deprecated
    public final DataPoint setTimestamp(long j, @RecentlyNonNull TimeUnit timeUnit) {
        this.b = timeUnit.toNanos(j);
        return this;
    }

    @RecentlyNonNull
    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = Arrays.toString(this.d);
        objArr[1] = Long.valueOf(this.c);
        objArr[2] = Long.valueOf(this.b);
        objArr[3] = Long.valueOf(this.f);
        objArr[4] = this.a.toDebugString();
        DataSource dataSource = this.e;
        objArr[5] = dataSource != null ? dataSource.toDebugString() : ACRAConstants.NOT_AVAILABLE;
        return String.format("DataPoint{%s@[%s, %s,raw=%s](%s %s)}", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getDataSource(), i, false);
        SafeParcelWriter.writeLong(parcel, 3, this.b);
        SafeParcelWriter.writeLong(parcel, 4, this.c);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.d, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.e, i, false);
        SafeParcelWriter.writeLong(parcel, 7, this.f);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @RecentlyNonNull
    public final Value zzb(int i) {
        DataType dataType = getDataType();
        Preconditions.checkArgument(i >= 0 && i < dataType.getFields().size(), "fieldIndex %s is out of range for %s", Integer.valueOf(i), dataType);
        return this.d[i];
    }

    @RecentlyNonNull
    @ShowFirstParty
    public final Value[] zze() {
        return this.d;
    }

    @RecentlyNullable
    @ShowFirstParty
    public final DataSource zzf() {
        return this.e;
    }

    @ShowFirstParty
    public final long zzg() {
        return this.f;
    }

    public final void zzh() {
        Preconditions.checkArgument(getDataType().getName().equals(getDataSource().getDataType().getName()), "Conflicting data types found %s vs %s", getDataType(), getDataType());
        Preconditions.checkArgument(this.b > 0, "Data point does not have the timestamp set: %s", this);
        Preconditions.checkArgument(this.c <= this.b, "Data point with start time greater than end time found: %s", this);
    }

    public static class Builder {
        private final DataPoint a;
        private boolean b;

        private Builder(DataSource dataSource) {
            this.b = false;
            this.a = DataPoint.create(dataSource);
        }

        @RecentlyNonNull
        public DataPoint build() {
            Preconditions.checkState(!this.b, "DataPoint#build should not be called multiple times.");
            this.b = true;
            return this.a;
        }

        @RecentlyNonNull
        public Builder setActivityField(@RecentlyNonNull Field field, @RecentlyNonNull String str) {
            Preconditions.checkState(!this.b, "Builder should not be mutated after calling #build.");
            this.a.getValue(field).setInt(zzko.zzo(str));
            return this;
        }

        @RecentlyNonNull
        public Builder setField(@RecentlyNonNull Field field, int i) {
            Preconditions.checkState(!this.b, "Builder should not be mutated after calling #build.");
            this.a.getValue(field).setInt(i);
            return this;
        }

        @RecentlyNonNull
        public Builder setFloatValues(@RecentlyNonNull float... fArr) {
            Preconditions.checkState(!this.b, "Builder should not be mutated after calling #build.");
            this.a.setFloatValues(fArr);
            return this;
        }

        @RecentlyNonNull
        public Builder setIntValues(@RecentlyNonNull int... iArr) {
            Preconditions.checkState(!this.b, "Builder should not be mutated after calling #build.");
            this.a.setIntValues(iArr);
            return this;
        }

        @RecentlyNonNull
        public Builder setTimeInterval(long j, long j2, @RecentlyNonNull TimeUnit timeUnit) {
            Preconditions.checkState(!this.b, "Builder should not be mutated after calling #build.");
            this.a.setTimeInterval(j, j2, timeUnit);
            return this;
        }

        @RecentlyNonNull
        public Builder setTimestamp(long j, @RecentlyNonNull TimeUnit timeUnit) {
            Preconditions.checkState(!this.b, "Builder should not be mutated after calling #build.");
            this.a.setTimestamp(j, timeUnit);
            return this;
        }

        @RecentlyNonNull
        public Builder setField(@RecentlyNonNull Field field, float f) {
            Preconditions.checkState(!this.b, "Builder should not be mutated after calling #build.");
            this.a.getValue(field).setFloat(f);
            return this;
        }

        @RecentlyNonNull
        public Builder setField(@RecentlyNonNull Field field, @RecentlyNonNull String str) {
            Preconditions.checkState(!this.b, "Builder should not be mutated after calling #build.");
            this.a.getValue(field).setString(str);
            return this;
        }

        @RecentlyNonNull
        public Builder setField(@RecentlyNonNull Field field, @RecentlyNonNull Map<String, Float> map) {
            Preconditions.checkState(!this.b, "Builder should not be mutated after calling #build.");
            this.a.getValue(field).zza(map);
            return this;
        }
    }

    public DataPoint(List<DataSource> list, RawDataPoint rawDataPoint) {
        this((DataSource) Preconditions.checkNotNull(a(list, rawDataPoint.zzp())), a(list, rawDataPoint.zzq()), rawDataPoint);
    }

    @ShowFirstParty
    private DataPoint(DataSource dataSource, @Nullable DataSource dataSource2, RawDataPoint rawDataPoint) {
        this(dataSource, rawDataPoint.zzn(), rawDataPoint.zzo(), rawDataPoint.zze(), dataSource2, rawDataPoint.zzg());
    }

    private DataPoint(DataSource dataSource) {
        this.a = (DataSource) Preconditions.checkNotNull(dataSource, "Data source cannot be null");
        List<Field> fields = dataSource.getDataType().getFields();
        this.d = new Value[fields.size()];
        Iterator<Field> it2 = fields.iterator();
        int i = 0;
        while (it2.hasNext()) {
            this.d[i] = new Value(it2.next().getFormat());
            i++;
        }
        this.f = 0L;
    }
}
