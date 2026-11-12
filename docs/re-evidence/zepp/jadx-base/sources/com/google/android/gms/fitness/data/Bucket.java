package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fitness.zzko;
import com.huami.watch.dataflow.model.sport.bean.SportDetail;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "BucketCreator")
@SafeParcelable.Reserved({7, 1000})
public class Bucket extends AbstractSafeParcelable implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<Bucket> CREATOR = new zze();
    public static final int TYPE_ACTIVITY_SEGMENT = 4;
    public static final int TYPE_ACTIVITY_TYPE = 3;
    public static final int TYPE_SESSION = 2;
    public static final int TYPE_TIME = 1;

    @SafeParcelable.Field(getter = "getStartTimeMillis", id = 1)
    private final long a;

    @SafeParcelable.Field(getter = "getEndTimeMillis", id = 2)
    private final long b;

    @Nullable
    @SafeParcelable.Field(getter = "getSession", id = 3)
    private final Session c;

    @SafeParcelable.Field(getter = "getActivityType", id = 4)
    private final int d;

    @SafeParcelable.Field(getter = "getDataSets", id = 5)
    private final List<DataSet> e;

    @SafeParcelable.Field(getter = "getBucketType", id = 6)
    private final int f;

    @SafeParcelable.Constructor
    public Bucket(@SafeParcelable.Param(id = 1) long j, @SafeParcelable.Param(id = 2) long j2, @Nullable @SafeParcelable.Param(id = 3) Session session, @SafeParcelable.Param(id = 4) int i, @SafeParcelable.Param(id = 5) List<DataSet> list, @SafeParcelable.Param(id = 6) int i2) {
        this.a = j;
        this.b = j2;
        this.c = session;
        this.d = i;
        this.e = list;
        this.f = i2;
    }

    @RecentlyNonNull
    @ShowFirstParty
    public static String zza(int i) {
        if (i == 0) {
            return "none";
        }
        if (i == 1) {
            return "time";
        }
        if (i == 2) {
            return com.google.firebase.crashlytics.internal.settings.b.c;
        }
        if (i == 3) {
            return "type";
        }
        if (i != 4) {
            return i != 5 ? "bug" : "intervals";
        }
        return SportDetail.COLUMN_SEGMENT;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Bucket)) {
            return false;
        }
        Bucket bucket = (Bucket) obj;
        return this.a == bucket.a && this.b == bucket.b && this.d == bucket.d && Objects.equal(this.e, bucket.e) && this.f == bucket.f;
    }

    @RecentlyNonNull
    public String getActivity() {
        return zzko.getName(this.d);
    }

    public int getBucketType() {
        return this.f;
    }

    @RecentlyNullable
    public DataSet getDataSet(@RecentlyNonNull DataType dataType) {
        for (DataSet dataSet : this.e) {
            if (dataSet.getDataType().equals(dataType)) {
                return dataSet;
            }
        }
        return null;
    }

    @RecentlyNonNull
    public List<DataSet> getDataSets() {
        return this.e;
    }

    public long getEndTime(@RecentlyNonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.b, TimeUnit.MILLISECONDS);
    }

    @RecentlyNullable
    public Session getSession() {
        return this.c;
    }

    public long getStartTime(@RecentlyNonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.a, TimeUnit.MILLISECONDS);
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.d), Integer.valueOf(this.f));
    }

    @RecentlyNonNull
    public String toString() {
        return Objects.toStringHelper(this).add("startTime", Long.valueOf(this.a)).add("endTime", Long.valueOf(this.b)).add("activity", Integer.valueOf(this.d)).add("dataSets", this.e).add("bucketType", zza(this.f)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.a);
        SafeParcelWriter.writeLong(parcel, 2, this.b);
        SafeParcelWriter.writeParcelable(parcel, 3, getSession(), i, false);
        SafeParcelWriter.writeInt(parcel, 4, this.d);
        SafeParcelWriter.writeTypedList(parcel, 5, getDataSets(), false);
        SafeParcelWriter.writeInt(parcel, 6, getBucketType());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zza(@RecentlyNonNull Bucket bucket) {
        return this.a == bucket.a && this.b == bucket.b && this.d == bucket.d && this.f == bucket.f;
    }

    @ShowFirstParty
    public final int zzd() {
        return this.d;
    }

    public Bucket(@RecentlyNonNull RawBucket rawBucket, @RecentlyNonNull List<DataSource> list) {
        long j = rawBucket.zzkr;
        long j2 = rawBucket.zzks;
        Session session = rawBucket.zzky;
        int i = rawBucket.zzny;
        List<RawDataSet> list2 = rawBucket.zzlh;
        ArrayList arrayList = new ArrayList(list2.size());
        Iterator<RawDataSet> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(new DataSet(it2.next(), list));
        }
        this(j, j2, session, i, arrayList, rawBucket.zzli);
    }
}
