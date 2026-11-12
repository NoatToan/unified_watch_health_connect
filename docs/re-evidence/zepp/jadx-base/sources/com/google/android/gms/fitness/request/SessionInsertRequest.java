package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.fitness.zzcm;
import com.google.android.gms.internal.fitness.zzcn;
import com.google.android.gms.internal.fitness.zzi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "SessionInsertRequestCreator")
@SafeParcelable.Reserved({5, 1000})
public class SessionInsertRequest extends AbstractSafeParcelable {

    @SafeParcelable.Field(getter = "getSession", id = 1)
    private final Session a;

    @SafeParcelable.Field(getter = "getDataSets", id = 2)
    private final List<DataSet> b;

    @SafeParcelable.Field(getter = "getAggregateDataPoints", id = 3)
    private final List<DataPoint> c;

    @Nullable
    @SafeParcelable.Field(getter = "getCallbackBinder", id = 4, type = "android.os.IBinder")
    private final zzcn d;
    private static final TimeUnit e = TimeUnit.MILLISECONDS;

    @RecentlyNonNull
    public static final Parcelable.Creator<SessionInsertRequest> CREATOR = new zzau();

    public static class Builder {
        private Session a;
        private final List<DataSet> b = new ArrayList();
        private final List<DataPoint> c = new ArrayList();
        private final List<DataSource> d = new ArrayList();

        private final void d(DataPoint dataPoint) {
            Session session = this.a;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long startTime = session.getStartTime(timeUnit);
            long endTime = this.a.getEndTime(timeUnit);
            long timestamp = dataPoint.getTimestamp(timeUnit);
            if (timestamp != 0) {
                if (timestamp < startTime || timestamp > endTime) {
                    timestamp = zzi.zza(timestamp, timeUnit, SessionInsertRequest.e);
                }
                Preconditions.checkState(timestamp >= startTime && timestamp <= endTime, "Data point %s has time stamp outside session interval [%d, %d]", dataPoint, Long.valueOf(startTime), Long.valueOf(endTime));
                if (dataPoint.getTimestamp(timeUnit) != timestamp) {
                    Log.w("Fitness", String.format("Data point timestamp [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", Long.valueOf(dataPoint.getTimestamp(timeUnit)), Long.valueOf(timestamp), SessionInsertRequest.e));
                    dataPoint.setTimestamp(timestamp, timeUnit);
                }
            }
            long startTime2 = this.a.getStartTime(timeUnit);
            long endTime2 = this.a.getEndTime(timeUnit);
            long startTime3 = dataPoint.getStartTime(timeUnit);
            long endTime3 = dataPoint.getEndTime(timeUnit);
            if (startTime3 == 0 || endTime3 == 0) {
                return;
            }
            if (endTime3 > endTime2) {
                endTime3 = zzi.zza(endTime3, timeUnit, SessionInsertRequest.e);
            }
            Preconditions.checkState(startTime3 >= startTime2 && endTime3 <= endTime2, "Data point %s has start and end times outside session interval [%d, %d]", dataPoint, Long.valueOf(startTime2), Long.valueOf(endTime2));
            if (endTime3 != dataPoint.getEndTime(timeUnit)) {
                Log.w("Fitness", String.format("Data point end time [%d] is truncated to [%d] to match the precision [%s] of the session start and end time", Long.valueOf(dataPoint.getEndTime(timeUnit)), Long.valueOf(endTime3), SessionInsertRequest.e));
                dataPoint.setTimeInterval(startTime3, endTime3, timeUnit);
            }
        }

        @RecentlyNonNull
        public Builder addAggregateDataPoint(@RecentlyNonNull DataPoint dataPoint) {
            Preconditions.checkArgument(dataPoint != null, "Must specify a valid aggregate data point.");
            DataSource dataSource = dataPoint.getDataSource();
            Preconditions.checkState(!this.d.contains(dataSource), "Data set/Aggregate data point for this data source %s is already added.", dataSource);
            DataSet.zzb(dataPoint);
            this.d.add(dataSource);
            this.c.add(dataPoint);
            return this;
        }

        @RecentlyNonNull
        public Builder addDataSet(@RecentlyNonNull DataSet dataSet) {
            Preconditions.checkArgument(dataSet != null, "Must specify a valid data set.");
            DataSource dataSource = dataSet.getDataSource();
            Preconditions.checkState(!this.d.contains(dataSource), "Data set for this data source %s is already added.", dataSource);
            Preconditions.checkArgument(!dataSet.getDataPoints().isEmpty(), "No data points specified in the input data set.");
            this.d.add(dataSource);
            this.b.add(dataSet);
            return this;
        }

        @RecentlyNonNull
        public SessionInsertRequest build() {
            Preconditions.checkState(this.a != null, "Must specify a valid session.");
            Preconditions.checkState(this.a.getEndTime(TimeUnit.MILLISECONDS) != 0, "Must specify a valid end time, cannot insert a continuing session.");
            Iterator<DataSet> it2 = this.b.iterator();
            while (it2.hasNext()) {
                Iterator<DataPoint> it3 = it2.next().getDataPoints().iterator();
                while (it3.hasNext()) {
                    d(it3.next());
                }
            }
            Iterator<DataPoint> it4 = this.c.iterator();
            while (it4.hasNext()) {
                d(it4.next());
            }
            return new SessionInsertRequest(this);
        }

        @RecentlyNonNull
        public Builder setSession(@RecentlyNonNull Session session) {
            this.a = session;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public SessionInsertRequest(@SafeParcelable.Param(id = 1) Session session, @SafeParcelable.Param(id = 2) List<DataSet> list, @SafeParcelable.Param(id = 3) List<DataPoint> list2, @Nullable @SafeParcelable.Param(id = 4) IBinder iBinder) {
        this.a = session;
        this.b = Collections.unmodifiableList(list);
        this.c = Collections.unmodifiableList(list2);
        this.d = iBinder == null ? null : zzcm.zzj(iBinder);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj != this) {
            if (obj instanceof SessionInsertRequest) {
                SessionInsertRequest sessionInsertRequest = (SessionInsertRequest) obj;
                if (Objects.equal(this.a, sessionInsertRequest.a) && Objects.equal(this.b, sessionInsertRequest.b) && Objects.equal(this.c, sessionInsertRequest.c)) {
                }
            }
            return false;
        }
        return true;
    }

    @RecentlyNonNull
    public List<DataPoint> getAggregateDataPoints() {
        return this.c;
    }

    @RecentlyNonNull
    public List<DataSet> getDataSets() {
        return this.b;
    }

    @RecentlyNonNull
    public Session getSession() {
        return this.a;
    }

    public int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c);
    }

    @RecentlyNonNull
    public String toString() {
        return Objects.toStringHelper(this).add(com.google.firebase.crashlytics.internal.settings.b.c, this.a).add("dataSets", this.b).add("aggregateDataPoints", this.c).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getSession(), i, false);
        SafeParcelWriter.writeTypedList(parcel, 2, getDataSets(), false);
        SafeParcelWriter.writeTypedList(parcel, 3, getAggregateDataPoints(), false);
        zzcn zzcnVar = this.d;
        SafeParcelWriter.writeIBinder(parcel, 4, zzcnVar == null ? null : zzcnVar.asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private SessionInsertRequest(Builder builder) {
        this(builder.a, (List<DataSet>) builder.b, (List<DataPoint>) builder.c, (zzcn) null);
    }

    public SessionInsertRequest(SessionInsertRequest sessionInsertRequest, zzcn zzcnVar) {
        this(sessionInsertRequest.a, sessionInsertRequest.b, sessionInsertRequest.c, zzcnVar);
    }

    private SessionInsertRequest(Session session, List<DataSet> list, List<DataPoint> list2, @Nullable zzcn zzcnVar) {
        this.a = session;
        this.b = Collections.unmodifiableList(list);
        this.c = Collections.unmodifiableList(list2);
        this.d = zzcnVar;
    }
}
