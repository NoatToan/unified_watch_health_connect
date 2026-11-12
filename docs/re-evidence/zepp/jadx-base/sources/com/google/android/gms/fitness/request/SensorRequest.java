package com.google.android.gms.fitness.request;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class SensorRequest {
    public static final int ACCURACY_MODE_DEFAULT = 2;
    public static final int ACCURACY_MODE_HIGH = 3;
    public static final int ACCURACY_MODE_LOW = 1;

    @Nullable
    private final DataSource a;

    @Nullable
    private final DataType b;
    private final long c;
    private final long d;
    private final long e;
    private final int f;
    private final long g;

    public static class Builder {
        private DataSource a;
        private DataType b;
        private long c = -1;
        private long d = 0;
        private long e = 0;
        private boolean f = false;
        private int g = 2;
        private long h = Long.MAX_VALUE;

        @RecentlyNonNull
        public SensorRequest build() {
            DataSource dataSource;
            Preconditions.checkState((this.a == null && this.b == null) ? false : true, "Must call setDataSource() or setDataType()");
            DataType dataType = this.b;
            Preconditions.checkState(dataType == null || (dataSource = this.a) == null || dataType.equals(dataSource.getDataType()), "Specified data type is incompatible with specified data source");
            return new SensorRequest(this);
        }

        @RecentlyNonNull
        public Builder setAccuracyMode(int i) {
            if (i != 1 && i != 3) {
                i = 2;
            }
            this.g = i;
            return this;
        }

        @RecentlyNonNull
        public Builder setDataSource(@RecentlyNonNull DataSource dataSource) {
            this.a = dataSource;
            return this;
        }

        @RecentlyNonNull
        public Builder setDataType(@RecentlyNonNull DataType dataType) {
            this.b = dataType;
            return this;
        }

        @RecentlyNonNull
        public Builder setFastestRate(int i, @RecentlyNonNull TimeUnit timeUnit) {
            Preconditions.checkArgument(i >= 0, "Cannot use a negative interval");
            this.f = true;
            this.d = timeUnit.toMicros(i);
            return this;
        }

        @RecentlyNonNull
        public Builder setMaxDeliveryLatency(int i, @RecentlyNonNull TimeUnit timeUnit) {
            Preconditions.checkArgument(i >= 0, "Cannot use a negative delivery interval");
            this.e = timeUnit.toMicros(i);
            return this;
        }

        @RecentlyNonNull
        public Builder setSamplingRate(long j, @RecentlyNonNull TimeUnit timeUnit) {
            Preconditions.checkArgument(j >= 0, "Cannot use a negative sampling interval");
            long micros = timeUnit.toMicros(j);
            this.c = micros;
            if (!this.f) {
                this.d = micros / 2;
            }
            return this;
        }

        @RecentlyNonNull
        public Builder setTimeout(long j, @RecentlyNonNull TimeUnit timeUnit) {
            Preconditions.checkArgument(j > 0, "Invalid time out value specified: %d", Long.valueOf(j));
            Preconditions.checkArgument(timeUnit != null, "Invalid time unit specified");
            this.h = timeUnit.toMicros(j);
            return this;
        }
    }

    private SensorRequest(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.g;
        this.g = builder.h;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SensorRequest)) {
            return false;
        }
        SensorRequest sensorRequest = (SensorRequest) obj;
        return Objects.equal(this.a, sensorRequest.a) && Objects.equal(this.b, sensorRequest.b) && this.c == sensorRequest.c && this.d == sensorRequest.d && this.e == sensorRequest.e && this.f == sensorRequest.f && this.g == sensorRequest.g;
    }

    public int getAccuracyMode() {
        return this.f;
    }

    @RecentlyNullable
    public DataSource getDataSource() {
        return this.a;
    }

    @RecentlyNullable
    public DataType getDataType() {
        return this.b;
    }

    public long getFastestRate(@RecentlyNonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.d, TimeUnit.MICROSECONDS);
    }

    public long getMaxDeliveryLatency(@RecentlyNonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.e, TimeUnit.MICROSECONDS);
    }

    public long getSamplingRate(@RecentlyNonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.c, TimeUnit.MICROSECONDS);
    }

    public int hashCode() {
        return Objects.hashCode(this.a, this.b, Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.g));
    }

    @RecentlyNonNull
    public String toString() {
        return Objects.toStringHelper(this).add(ParamKey.dataSource, this.a).add("dataType", this.b).add("samplingRateMicros", Long.valueOf(this.c)).add("deliveryLatencyMicros", Long.valueOf(this.e)).add("timeOutMicros", Long.valueOf(this.g)).toString();
    }

    public final long zzy() {
        return this.g;
    }
}
