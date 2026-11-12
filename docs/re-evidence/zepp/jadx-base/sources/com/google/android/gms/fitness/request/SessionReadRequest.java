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
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.fitness.zzcg;
import com.google.android.gms.internal.fitness.zzch;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "SessionReadRequestCreator")
@SafeParcelable.Reserved({11, 1000})
public class SessionReadRequest extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<SessionReadRequest> CREATOR = new zzax();

    @SafeParcelable.Field(getter = "getSessionName", id = 1)
    private final String a;

    @SafeParcelable.Field(getter = "getSessionId", id = 2)
    private final String b;

    @SafeParcelable.Field(getter = "getStartTimeMillis", id = 3)
    private final long c;

    @SafeParcelable.Field(getter = "getEndTimeMillis", id = 4)
    private final long d;

    @SafeParcelable.Field(getter = "getDataTypes", id = 5)
    private final List<DataType> e;

    @SafeParcelable.Field(getter = "getDataSources", id = 6)
    private final List<DataSource> f;

    @SafeParcelable.Field(getter = "includeSessionsFromAllApps", id = 7)
    private final boolean g;

    @SafeParcelable.Field(getter = "areServerQueriesEnabled", id = 8)
    private final boolean h;

    @SafeParcelable.Field(getter = "getExcludedPackages", id = 9)
    private final List<String> i;

    @Nullable
    @SafeParcelable.Field(getter = "getCallbackBinder", id = 10, type = "android.os.IBinder")
    private final zzch j;

    @SafeParcelable.Field(defaultValue = "true", getter = "areActivitySessionsIncluded", id = 12)
    private final boolean k;

    @SafeParcelable.Field(defaultValue = "false", getter = "areSleepSessionsIncluded", id = 13)
    private final boolean l;

    @SafeParcelable.Constructor
    public SessionReadRequest(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) long j, @SafeParcelable.Param(id = 4) long j2, @SafeParcelable.Param(id = 5) List<DataType> list, @SafeParcelable.Param(id = 6) List<DataSource> list2, @SafeParcelable.Param(id = 7) boolean z, @SafeParcelable.Param(id = 8) boolean z2, @SafeParcelable.Param(id = 9) List<String> list3, @Nullable @SafeParcelable.Param(id = 10) IBinder iBinder, @SafeParcelable.Param(id = 12) boolean z3, @SafeParcelable.Param(id = 13) boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = list;
        this.f = list2;
        this.g = z;
        this.h = z2;
        this.i = list3;
        this.j = iBinder == null ? null : zzcg.zzh(iBinder);
        this.k = z3;
        this.l = z4;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionReadRequest)) {
            return false;
        }
        SessionReadRequest sessionReadRequest = (SessionReadRequest) obj;
        return Objects.equal(this.a, sessionReadRequest.a) && this.b.equals(sessionReadRequest.b) && this.c == sessionReadRequest.c && this.d == sessionReadRequest.d && Objects.equal(this.e, sessionReadRequest.e) && Objects.equal(this.f, sessionReadRequest.f) && this.g == sessionReadRequest.g && this.i.equals(sessionReadRequest.i) && this.h == sessionReadRequest.h && this.k == sessionReadRequest.k && this.l == sessionReadRequest.l;
    }

    @RecentlyNonNull
    public List<DataSource> getDataSources() {
        return this.f;
    }

    @RecentlyNonNull
    public List<DataType> getDataTypes() {
        return this.e;
    }

    public long getEndTime(@RecentlyNonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.d, TimeUnit.MILLISECONDS);
    }

    @RecentlyNonNull
    public List<String> getExcludedPackages() {
        return this.i;
    }

    @RecentlyNullable
    public String getSessionId() {
        return this.b;
    }

    @RecentlyNullable
    public String getSessionName() {
        return this.a;
    }

    public long getStartTime(@RecentlyNonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.c, TimeUnit.MILLISECONDS);
    }

    public int hashCode() {
        return Objects.hashCode(this.a, this.b, Long.valueOf(this.c), Long.valueOf(this.d));
    }

    public boolean includeSessionsFromAllApps() {
        return this.g;
    }

    @RecentlyNonNull
    public String toString() {
        return Objects.toStringHelper(this).add("sessionName", this.a).add("sessionId", this.b).add("startTimeMillis", Long.valueOf(this.c)).add("endTimeMillis", Long.valueOf(this.d)).add("dataTypes", this.e).add("dataSources", this.f).add("sessionsFromAllApps", Boolean.valueOf(this.g)).add("excludedPackages", this.i).add("useServer", Boolean.valueOf(this.h)).add("activitySessionsIncluded", Boolean.valueOf(this.k)).add("sleepSessionsIncluded", Boolean.valueOf(this.l)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getSessionName(), false);
        SafeParcelWriter.writeString(parcel, 2, getSessionId(), false);
        SafeParcelWriter.writeLong(parcel, 3, this.c);
        SafeParcelWriter.writeLong(parcel, 4, this.d);
        SafeParcelWriter.writeTypedList(parcel, 5, getDataTypes(), false);
        SafeParcelWriter.writeTypedList(parcel, 6, getDataSources(), false);
        SafeParcelWriter.writeBoolean(parcel, 7, includeSessionsFromAllApps());
        SafeParcelWriter.writeBoolean(parcel, 8, this.h);
        SafeParcelWriter.writeStringList(parcel, 9, getExcludedPackages(), false);
        zzch zzchVar = this.j;
        SafeParcelWriter.writeIBinder(parcel, 10, zzchVar == null ? null : zzchVar.asBinder(), false);
        SafeParcelWriter.writeBoolean(parcel, 12, this.k);
        SafeParcelWriter.writeBoolean(parcel, 13, this.l);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public static class Builder {
        private String a;
        private String b;
        private long c = 0;
        private long d = 0;
        private final List<DataType> e = new ArrayList();
        private final List<DataSource> f = new ArrayList();
        private boolean g = false;
        private boolean h = false;
        private final List<String> i = new ArrayList();
        private boolean j = false;
        private boolean k = false;
        private boolean l = false;

        @RecentlyNonNull
        public SessionReadRequest build() {
            long j = this.c;
            Preconditions.checkArgument(j > 0, "Invalid start time: %s", Long.valueOf(j));
            long j2 = this.d;
            Preconditions.checkArgument(j2 > 0 && j2 > this.c, "Invalid end time: %s", Long.valueOf(j2));
            if (!this.l) {
                this.j = true;
            }
            return new SessionReadRequest(this);
        }

        @RecentlyNonNull
        public Builder enableServerQueries() {
            this.h = true;
            return this;
        }

        @RecentlyNonNull
        public Builder excludePackage(@RecentlyNonNull String str) {
            Preconditions.checkNotNull(str, "Attempting to use a null package name");
            if (!this.i.contains(str)) {
                this.i.add(str);
            }
            return this;
        }

        @RecentlyNonNull
        public Builder includeActivitySessions() {
            this.j = true;
            this.l = true;
            return this;
        }

        @RecentlyNonNull
        public Builder includeSleepSessions() {
            this.k = true;
            this.l = true;
            return this;
        }

        @RecentlyNonNull
        public Builder read(@RecentlyNonNull DataSource dataSource) {
            Preconditions.checkNotNull(dataSource, "Attempting to add a null data source");
            if (!this.f.contains(dataSource)) {
                this.f.add(dataSource);
            }
            return this;
        }

        @RecentlyNonNull
        public Builder readSessionsFromAllApps() {
            this.g = true;
            return this;
        }

        @RecentlyNonNull
        public Builder setSessionId(@RecentlyNonNull String str) {
            this.b = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setSessionName(@RecentlyNonNull String str) {
            this.a = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setTimeInterval(long j, long j2, @RecentlyNonNull TimeUnit timeUnit) {
            this.c = timeUnit.toMillis(j);
            this.d = timeUnit.toMillis(j2);
            return this;
        }

        @RecentlyNonNull
        public Builder read(@RecentlyNonNull DataType dataType) {
            Preconditions.checkNotNull(dataType, "Attempting to use a null data type");
            if (!this.e.contains(dataType)) {
                this.e.add(dataType);
            }
            return this;
        }
    }

    private SessionReadRequest(Builder builder) {
        this(builder.a, builder.b, builder.c, builder.d, builder.e, builder.f, builder.g, builder.h, builder.i, null, builder.j, builder.k);
    }

    public SessionReadRequest(SessionReadRequest sessionReadRequest, zzch zzchVar) {
        this(sessionReadRequest.a, sessionReadRequest.b, sessionReadRequest.c, sessionReadRequest.d, sessionReadRequest.e, sessionReadRequest.f, sessionReadRequest.g, sessionReadRequest.h, sessionReadRequest.i, zzchVar.asBinder(), sessionReadRequest.k, sessionReadRequest.l);
    }
}
