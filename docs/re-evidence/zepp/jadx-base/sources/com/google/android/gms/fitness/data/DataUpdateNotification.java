package com.google.android.gms.fitness.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "DataUpdateNotificationCreator")
@SafeParcelable.Reserved({1000})
public class DataUpdateNotification extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final String ACTION = "com.google.android.gms.fitness.DATA_UPDATE_NOTIFICATION";

    @RecentlyNonNull
    public static final Parcelable.Creator<DataUpdateNotification> CREATOR = new zzn();

    @RecentlyNonNull
    public static final String EXTRA_DATA_UPDATE_NOTIFICATION = "vnd.google.fitness.data_udpate_notification";
    public static final int OPERATION_DELETE = 2;
    public static final int OPERATION_INSERT = 1;
    public static final int OPERATION_UPDATE = 3;

    @SafeParcelable.Field(getter = "getUpdateStartTimeNanos", id = 1)
    private final long a;

    @SafeParcelable.Field(getter = "getUpdateEndTimeNanos", id = 2)
    private final long b;

    @SafeParcelable.Field(getter = "getOperationType", id = 3)
    private final int c;

    @SafeParcelable.Field(getter = "getDataSource", id = 4)
    private final DataSource d;

    @SafeParcelable.Field(getter = "getDataType", id = 5)
    private final DataType e;

    @SafeParcelable.Constructor
    public DataUpdateNotification(@SafeParcelable.Param(id = 1) long j, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) int i, @RecentlyNonNull @SafeParcelable.Param(id = 4) DataSource dataSource, @RecentlyNonNull @SafeParcelable.Param(id = 5) DataType dataType) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = dataSource;
        this.e = dataType;
    }

    @RecentlyNullable
    public static DataUpdateNotification getDataUpdateNotification(@RecentlyNonNull Intent intent) {
        return (DataUpdateNotification) SafeParcelableSerializer.deserializeFromIntentExtra(intent, EXTRA_DATA_UPDATE_NOTIFICATION, CREATOR);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DataUpdateNotification)) {
            return false;
        }
        DataUpdateNotification dataUpdateNotification = (DataUpdateNotification) obj;
        return this.a == dataUpdateNotification.a && this.b == dataUpdateNotification.b && this.c == dataUpdateNotification.c && Objects.equal(this.d, dataUpdateNotification.d) && Objects.equal(this.e, dataUpdateNotification.e);
    }

    @RecentlyNonNull
    public DataSource getDataSource() {
        return this.d;
    }

    @RecentlyNonNull
    public DataType getDataType() {
        return this.e;
    }

    public int getOperationType() {
        return this.c;
    }

    public long getUpdateEndTime(@RecentlyNonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.b, TimeUnit.NANOSECONDS);
    }

    public long getUpdateStartTime(@RecentlyNonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.a, TimeUnit.NANOSECONDS);
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e);
    }

    @RecentlyNonNull
    public String toString() {
        return Objects.toStringHelper(this).add("updateStartTimeNanos", Long.valueOf(this.a)).add("updateEndTimeNanos", Long.valueOf(this.b)).add("operationType", Integer.valueOf(this.c)).add(ParamKey.dataSource, this.d).add("dataType", this.e).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.a);
        SafeParcelWriter.writeLong(parcel, 2, this.b);
        SafeParcelWriter.writeInt(parcel, 3, getOperationType());
        SafeParcelWriter.writeParcelable(parcel, 4, getDataSource(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, getDataType(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
