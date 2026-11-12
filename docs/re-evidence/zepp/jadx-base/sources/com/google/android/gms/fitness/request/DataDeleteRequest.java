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
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.fitness.zzcm;
import com.google.android.gms.internal.fitness.zzcn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "DataDeleteRequestCreator")
@SafeParcelable.Reserved({9, 1000})
public class DataDeleteRequest extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<DataDeleteRequest> CREATOR = new zzk();

    @SafeParcelable.Field(getter = "getStartTimeMillis", id = 1)
    private final long a;

    @SafeParcelable.Field(getter = "getEndTimeMillis", id = 2)
    private final long b;

    @SafeParcelable.Field(getter = "getDataSources", id = 3)
    private final List<DataSource> c;

    @SafeParcelable.Field(getter = "getDataTypes", id = 4)
    private final List<DataType> d;

    @SafeParcelable.Field(getter = "getSessions", id = 5)
    private final List<Session> e;

    @SafeParcelable.Field(getter = "deleteAllData", id = 6)
    private final boolean f;

    @SafeParcelable.Field(getter = "deleteAllSessions", id = 7)
    private final boolean g;

    @Nullable
    @SafeParcelable.Field(getter = "getCallbackBinder", id = 8, type = "android.os.IBinder")
    private final zzcn h;

    @SafeParcelable.Field(getter = "deleteByTimeRange", id = 10)
    private final boolean i;

    @SafeParcelable.Field(getter = "enableLocationCleanup", id = 11)
    private final boolean j;

    public static class Builder {
        private long a;
        private long b;
        private final List<DataSource> c = new ArrayList();
        private final List<DataType> d = new ArrayList();
        private final List<Session> e = new ArrayList();
        private boolean f = false;
        private boolean g = false;
        private boolean h = false;
        private boolean i = false;

        @RecentlyNonNull
        public Builder addDataSource(@RecentlyNonNull DataSource dataSource) {
            Preconditions.checkArgument(!this.f, "All data is already marked for deletion.  addDataSource() cannot be combined with deleteAllData()");
            Preconditions.checkArgument(dataSource != null, "Must specify a valid data source");
            if (!this.c.contains(dataSource)) {
                this.c.add(dataSource);
            }
            return this;
        }

        @RecentlyNonNull
        public Builder addDataType(@RecentlyNonNull DataType dataType) {
            Preconditions.checkArgument(!this.f, "All data is already marked for deletion.  addDataType() cannot be combined with deleteAllData()");
            Preconditions.checkArgument(dataType != null, "Must specify a valid data type");
            if (!this.d.contains(dataType)) {
                this.d.add(dataType);
            }
            return this;
        }

        @RecentlyNonNull
        public Builder addSession(@RecentlyNonNull Session session) {
            Preconditions.checkArgument(!this.g, "All sessions already marked for deletion.  addSession() cannot be combined with deleteAllSessions()");
            Preconditions.checkArgument(session != null, "Must specify a valid session");
            Preconditions.checkArgument(session.getEndTime(TimeUnit.MILLISECONDS) > 0, "Cannot delete an ongoing session. Please stop the session prior to deleting it");
            this.e.add(session);
            return this;
        }

        @RecentlyNonNull
        public DataDeleteRequest build() {
            long j = this.a;
            Preconditions.checkState(j > 0 && this.b > j, "Must specify a valid time interval");
            Preconditions.checkState((this.f || !this.c.isEmpty() || !this.d.isEmpty()) || (this.g || !this.e.isEmpty()), "No data or session marked for deletion");
            if (!this.e.isEmpty()) {
                for (Session session : this.e) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    Preconditions.checkState(session.getStartTime(timeUnit) >= this.a && session.getEndTime(timeUnit) <= this.b, "Session %s is outside the time interval [%d, %d]", session, Long.valueOf(this.a), Long.valueOf(this.b));
                }
            }
            return new DataDeleteRequest(this);
        }

        @RecentlyNonNull
        public Builder deleteAllData() {
            Preconditions.checkArgument(this.d.isEmpty(), "Specific data type already added for deletion. deleteAllData() will delete all data types and cannot be combined with addDataType()");
            Preconditions.checkArgument(this.c.isEmpty(), "Specific data source already added for deletion. deleteAllData() will delete all data sources and cannot be combined with addDataSource()");
            this.f = true;
            return this;
        }

        @RecentlyNonNull
        public Builder deleteAllSessions() {
            Preconditions.checkArgument(this.e.isEmpty(), "Specific session already added for deletion. deleteAllData() will delete all sessions and cannot be combined with addSession()");
            this.g = true;
            return this;
        }

        @RecentlyNonNull
        public Builder setTimeInterval(long j, long j2, @RecentlyNonNull TimeUnit timeUnit) {
            Preconditions.checkArgument(j > 0, "Invalid start time: %d", Long.valueOf(j));
            Preconditions.checkArgument(j2 > j, "Invalid end time: %d", Long.valueOf(j2));
            this.a = timeUnit.toMillis(j);
            this.b = timeUnit.toMillis(j2);
            return this;
        }
    }

    @SafeParcelable.Constructor
    public DataDeleteRequest(@SafeParcelable.Param(id = 1) long j, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) List<DataSource> list, @SafeParcelable.Param(id = 4) List<DataType> list2, @SafeParcelable.Param(id = 5) List<Session> list3, @SafeParcelable.Param(id = 6) boolean z, @SafeParcelable.Param(id = 7) boolean z2, @SafeParcelable.Param(id = 10) boolean z3, @SafeParcelable.Param(id = 11) boolean z4, @Nullable @SafeParcelable.Param(id = 8) IBinder iBinder) {
        this.a = j;
        this.b = j2;
        this.c = Collections.unmodifiableList(list);
        this.d = Collections.unmodifiableList(list2);
        this.e = list3;
        this.f = z;
        this.g = z2;
        this.i = z3;
        this.j = z4;
        this.h = iBinder == null ? null : zzcm.zzj(iBinder);
    }

    public boolean deleteAllData() {
        return this.f;
    }

    public boolean deleteAllSessions() {
        return this.g;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DataDeleteRequest)) {
            return false;
        }
        DataDeleteRequest dataDeleteRequest = (DataDeleteRequest) obj;
        return this.a == dataDeleteRequest.a && this.b == dataDeleteRequest.b && Objects.equal(this.c, dataDeleteRequest.c) && Objects.equal(this.d, dataDeleteRequest.d) && Objects.equal(this.e, dataDeleteRequest.e) && this.f == dataDeleteRequest.f && this.g == dataDeleteRequest.g && this.i == dataDeleteRequest.i && this.j == dataDeleteRequest.j;
    }

    @RecentlyNonNull
    public List<DataSource> getDataSources() {
        return this.c;
    }

    @RecentlyNonNull
    public List<DataType> getDataTypes() {
        return this.d;
    }

    public long getEndTime(@RecentlyNonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.b, TimeUnit.MILLISECONDS);
    }

    @RecentlyNonNull
    public List<Session> getSessions() {
        return this.e;
    }

    public long getStartTime(@RecentlyNonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.a, TimeUnit.MILLISECONDS);
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.a), Long.valueOf(this.b));
    }

    @RecentlyNonNull
    public String toString() {
        Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("startTimeMillis", Long.valueOf(this.a)).add("endTimeMillis", Long.valueOf(this.b)).add("dataSources", this.c).add("dateTypes", this.d).add("sessions", this.e).add("deleteAllData", Boolean.valueOf(this.f)).add("deleteAllSessions", Boolean.valueOf(this.g));
        boolean z = this.i;
        if (z) {
            toStringHelperAdd.add("deleteByTimeRange", Boolean.valueOf(z));
        }
        return toStringHelperAdd.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.a);
        SafeParcelWriter.writeLong(parcel, 2, this.b);
        SafeParcelWriter.writeTypedList(parcel, 3, getDataSources(), false);
        SafeParcelWriter.writeTypedList(parcel, 4, getDataTypes(), false);
        SafeParcelWriter.writeTypedList(parcel, 5, getSessions(), false);
        SafeParcelWriter.writeBoolean(parcel, 6, deleteAllData());
        SafeParcelWriter.writeBoolean(parcel, 7, deleteAllSessions());
        zzcn zzcnVar = this.h;
        SafeParcelWriter.writeIBinder(parcel, 8, zzcnVar == null ? null : zzcnVar.asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 10, this.i);
        SafeParcelWriter.writeBoolean(parcel, 11, this.j);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private DataDeleteRequest(Builder builder) {
        this(builder.a, builder.b, (List<DataSource>) builder.c, (List<DataType>) builder.d, (List<Session>) builder.e, builder.f, builder.g, false, false, (zzcn) null);
    }

    public DataDeleteRequest(DataDeleteRequest dataDeleteRequest, zzcn zzcnVar) {
        this(dataDeleteRequest.a, dataDeleteRequest.b, dataDeleteRequest.c, dataDeleteRequest.d, dataDeleteRequest.e, dataDeleteRequest.f, dataDeleteRequest.g, dataDeleteRequest.i, dataDeleteRequest.j, zzcnVar);
    }

    private DataDeleteRequest(long j, long j2, List<DataSource> list, List<DataType> list2, List<Session> list3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable zzcn zzcnVar) {
        this.a = j;
        this.b = j2;
        this.c = Collections.unmodifiableList(list);
        this.d = Collections.unmodifiableList(list2);
        this.e = list3;
        this.f = z;
        this.g = z2;
        this.i = z3;
        this.j = z4;
        this.h = zzcnVar;
    }
}
