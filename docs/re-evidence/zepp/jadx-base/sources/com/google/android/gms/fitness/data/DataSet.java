package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fitness.zzkn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "DataSetCreator")
@SafeParcelable.Reserved({2, 5})
public final class DataSet extends AbstractSafeParcelable implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<DataSet> CREATOR = new zzi();

    @SafeParcelable.VersionField(getter = "getVersionCode", id = 1000)
    private final int a;

    @SafeParcelable.Field(getter = "getDataSource", id = 1)
    private final DataSource b;

    @SafeParcelable.Field(getter = "getRawDataPoints", id = 3, type = "java.util.List")
    private final List<DataPoint> c;

    @SafeParcelable.Field(getter = "getUniqueDataSources", id = 4)
    private final List<DataSource> d;

    public static class Builder {
        private final DataSet a;
        private boolean b;

        private Builder(DataSource dataSource) {
            this.b = false;
            this.a = DataSet.create(dataSource);
        }

        @RecentlyNonNull
        public Builder add(@RecentlyNonNull DataPoint dataPoint) {
            Preconditions.checkState(!this.b, "Builder should not be mutated after calling #build.");
            this.a.add(dataPoint);
            return this;
        }

        @RecentlyNonNull
        public Builder addAll(@RecentlyNonNull Iterable<DataPoint> iterable) {
            Preconditions.checkState(!this.b, "Builder should not be mutated after calling #build.");
            this.a.addAll(iterable);
            return this;
        }

        @RecentlyNonNull
        public DataSet build() {
            Preconditions.checkState(!this.b, "DataSet#build() should only be called once.");
            this.b = true;
            return this.a;
        }
    }

    @SafeParcelable.Constructor
    public DataSet(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) DataSource dataSource, @SafeParcelable.Param(id = 3) List<RawDataPoint> list, @SafeParcelable.Param(id = 4) List<DataSource> list2) {
        this.a = i;
        this.b = dataSource;
        this.c = new ArrayList(list.size());
        this.d = i < 2 ? Collections.singletonList(dataSource) : list2;
        Iterator<RawDataPoint> it2 = list.iterator();
        while (it2.hasNext()) {
            this.c.add(new DataPoint(this.d, it2.next()));
        }
    }

    @ShowFirstParty
    @Deprecated
    private final void b(DataPoint dataPoint) {
        this.c.add(dataPoint);
        DataSource originalDataSource = dataPoint.getOriginalDataSource();
        if (originalDataSource == null || this.d.contains(originalDataSource)) {
            return;
        }
        this.d.add(originalDataSource);
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull DataSource dataSource) {
        Preconditions.checkNotNull(dataSource, "DataSource should be specified");
        return new Builder(dataSource);
    }

    private final List<RawDataPoint> c() {
        return a(this.d);
    }

    @RecentlyNonNull
    public static DataSet create(@RecentlyNonNull DataSource dataSource) {
        Preconditions.checkNotNull(dataSource, "DataSource should be specified");
        return new DataSet(dataSource);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0107 A[EDGE_INSN: B:44:0x0107->B:45:0x0108 BREAK  A[LOOP:0: B:5:0x0015->B:35:0x00d1]] */
    public static void zzb(@RecentlyNonNull DataPoint dataPoint) {
        double dAsFloat;
        String strConcat = "DataPoint out of range";
        if (zzl.zzb(dataPoint.getDataType().getName()) == null) {
            strConcat = null;
            break;
        }
        DataType dataType = dataPoint.getDataType();
        int i = 0;
        while (true) {
            if (i >= dataType.getFields().size()) {
                if (!"com.google.activity.segment".equals(dataPoint.getDataSource().getDataType().getName())) {
                    strConcat = null;
                    break;
                }
                Value value = dataPoint.getValue(Field.FIELD_ACTIVITY);
                if (value != null) {
                    if (!zzkn.zza(value.asInt(), zzkn.UNKNOWN).zzdz()) {
                        strConcat = null;
                        break;
                    } else {
                        strConcat = "Sleep types are not a valid activity for com.google.activity.segment";
                        break;
                    }
                }
                strConcat = "activity is not set";
                break;
            }
            String name = dataType.getFields().get(i).getName();
            if (!dataPoint.zzb(i).isSet()) {
                if (!Boolean.TRUE.equals(dataType.getFields().get(i).isOptional()) && !zzah.zzom.contains(name)) {
                    strConcat = String.valueOf(name).concat(" not set");
                    break;
                }
                i++;
            } else {
                double format = dataType.getFields().get(i).getFormat();
                if (format == 1.0d) {
                    dAsFloat = dataPoint.zzb(i).asInt();
                } else {
                    if (format == 2.0d) {
                        dAsFloat = dataPoint.zzb(i).asFloat();
                    } else {
                        continue;
                    }
                    i++;
                }
                zzaj zzajVarZzi = zzah.zzt().zzi(name);
                if (zzajVarZzi != null && !zzajVarZzi.zza(dAsFloat)) {
                    strConcat = "Field out of range";
                    break;
                }
                zzaj zzajVarZza = zzah.zzt().zza(dataType.getName(), name);
                if (zzajVarZza != null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long endTime = dataPoint.getEndTime(timeUnit) - dataPoint.getStartTime(timeUnit);
                    if (endTime == 0) {
                        if (dAsFloat != 0.0d) {
                            break;
                        }
                        strConcat = null;
                        break;
                    } else if (!zzajVarZza.zza(dAsFloat / endTime)) {
                        break;
                    }
                } else {
                    continue;
                }
                i++;
            }
        }
        if (strConcat == null) {
            return;
        }
        String strValueOf = String.valueOf(dataPoint);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
        sb.append("Invalid data point: ");
        sb.append(strValueOf);
        Log.w("Fitness", sb.toString());
        throw new IllegalArgumentException(strConcat);
    }

    public final List<RawDataPoint> a(List<DataSource> list) {
        ArrayList arrayList = new ArrayList(this.c.size());
        Iterator<DataPoint> it2 = this.c.iterator();
        while (it2.hasNext()) {
            arrayList.add(new RawDataPoint(it2.next(), list));
        }
        return arrayList;
    }

    @Deprecated
    public final void add(@RecentlyNonNull DataPoint dataPoint) {
        DataSource dataSource = dataPoint.getDataSource();
        Preconditions.checkArgument(dataSource.getStreamIdentifier().equals(this.b.getStreamIdentifier()), "Conflicting data sources found %s vs %s", dataSource, this.b);
        dataPoint.zzh();
        zzb(dataPoint);
        b(dataPoint);
    }

    @Deprecated
    public final void addAll(@RecentlyNonNull Iterable<DataPoint> iterable) {
        Iterator<DataPoint> it2 = iterable.iterator();
        while (it2.hasNext()) {
            add(it2.next());
        }
    }

    @RecentlyNonNull
    public final DataPoint createDataPoint() {
        return DataPoint.create(this.b);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DataSet)) {
            return false;
        }
        DataSet dataSet = (DataSet) obj;
        return Objects.equal(this.b, dataSet.b) && Objects.equal(this.c, dataSet.c);
    }

    @RecentlyNonNull
    public final List<DataPoint> getDataPoints() {
        return Collections.unmodifiableList(this.c);
    }

    @RecentlyNonNull
    public final DataSource getDataSource() {
        return this.b;
    }

    @RecentlyNonNull
    public final DataType getDataType() {
        return this.b.getDataType();
    }

    public final int hashCode() {
        return Objects.hashCode(this.b);
    }

    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @RecentlyNonNull
    public final String toString() {
        List<RawDataPoint> listC = c();
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        objArr[0] = this.b.toDebugString();
        Object obj = listC;
        if (this.c.size() >= 10) {
            obj = String.format(locale, "%d data points, first 5: %s", Integer.valueOf(this.c.size()), listC.subList(0, 5));
        }
        objArr[1] = obj;
        return String.format(locale, "DataSet{%s %s}", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getDataSource(), i, false);
        SafeParcelWriter.writeList(parcel, 3, c(), false);
        SafeParcelWriter.writeTypedList(parcel, 4, this.d, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.a);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @ShowFirstParty
    @Deprecated
    public final void zza(@RecentlyNonNull Iterable<DataPoint> iterable) {
        Iterator<DataPoint> it2 = iterable.iterator();
        while (it2.hasNext()) {
            b(it2.next());
        }
    }

    @ShowFirstParty
    private DataSet(DataSource dataSource) {
        this.a = 3;
        DataSource dataSource2 = (DataSource) Preconditions.checkNotNull(dataSource);
        this.b = dataSource2;
        this.c = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        arrayList.add(dataSource2);
    }

    public DataSet(@RecentlyNonNull RawDataSet rawDataSet, @RecentlyNonNull List<DataSource> list) {
        this.a = 3;
        this.b = list.get(rawDataSet.zzoa);
        this.d = list;
        List<RawDataPoint> list2 = rawDataSet.zzoc;
        this.c = new ArrayList(list2.size());
        Iterator<RawDataPoint> it2 = list2.iterator();
        while (it2.hasNext()) {
            this.c.add(new DataPoint(this.d, it2.next()));
        }
    }
}
