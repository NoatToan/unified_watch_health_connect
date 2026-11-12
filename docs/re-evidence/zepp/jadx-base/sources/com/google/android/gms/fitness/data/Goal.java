package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fitness.zzko;
import com.huami.moving.webapi.SportWebParams;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "GoalCreator")
@SafeParcelable.Reserved({1000})
public class Goal extends AbstractSafeParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<Goal> CREATOR = new zzt();
    public static final int OBJECTIVE_TYPE_DURATION = 2;
    public static final int OBJECTIVE_TYPE_FREQUENCY = 3;
    public static final int OBJECTIVE_TYPE_METRIC = 1;

    @SafeParcelable.Field(getter = "getCreateTimeNanos", id = 1)
    private final long a;

    @SafeParcelable.Field(getter = "getExpireTimeNanos", id = 2)
    private final long b;

    @SafeParcelable.Field(getter = "getActivities", id = 3, type = "java.util.List")
    private final List<Integer> c;

    @SafeParcelable.Field(getter = "getRecurrence", id = 4)
    private final Recurrence d;

    @SafeParcelable.Field(getter = "getObjectiveType", id = 5)
    private final int e;

    @SafeParcelable.Field(getter = "getMetricObjectiveWithOutChecking", id = 6)
    private final MetricObjective f;

    @SafeParcelable.Field(getter = "getDurationObjectiveWithOutChecking", id = 7)
    private final DurationObjective g;

    @SafeParcelable.Field(getter = "getFrequencyObjectiveWithOutChecking", id = 8)
    private final FrequencyObjective h;

    @SafeParcelable.Class(creator = "FrequencyObjectiveCreator")
    @SafeParcelable.Reserved({1000})
    public static class FrequencyObjective extends AbstractSafeParcelable {

        @RecentlyNonNull
        public static final Parcelable.Creator<FrequencyObjective> CREATOR = new zzs();

        @SafeParcelable.Field(getter = "getFrequency", id = 1)
        private final int a;

        @SafeParcelable.Constructor
        public FrequencyObjective(@SafeParcelable.Param(id = 1) int i) {
            this.a = i;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof FrequencyObjective) && this.a == ((FrequencyObjective) obj).a;
        }

        public int getFrequency() {
            return this.a;
        }

        public int hashCode() {
            return this.a;
        }

        @RecentlyNonNull
        public String toString() {
            return Objects.toStringHelper(this).add("frequency", Integer.valueOf(this.a)).toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, getFrequency());
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    public static class MismatchedGoalException extends IllegalStateException {
        public MismatchedGoalException(@RecentlyNonNull String str) {
            super(str);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ObjectiveType {
    }

    @SafeParcelable.Class(creator = "RecurrenceCreator")
    @SafeParcelable.Reserved({1000})
    public static class Recurrence extends AbstractSafeParcelable {

        @RecentlyNonNull
        public static final Parcelable.Creator<Recurrence> CREATOR = new zzac();
        public static final int UNIT_DAY = 1;
        public static final int UNIT_MONTH = 3;
        public static final int UNIT_WEEK = 2;

        @SafeParcelable.Field(getter = "getCount", id = 1)
        private final int a;

        @SafeParcelable.Field(getter = "getUnit", id = 2)
        private final int b;

        @Retention(RetentionPolicy.SOURCE)
        public @interface RecurrenceUnit {
        }

        @SafeParcelable.Constructor
        public Recurrence(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2) {
            this.a = i;
            Preconditions.checkState(i2 > 0 && i2 <= 3);
            this.b = i2;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Recurrence)) {
                return false;
            }
            Recurrence recurrence = (Recurrence) obj;
            return this.a == recurrence.a && this.b == recurrence.b;
        }

        public int getCount() {
            return this.a;
        }

        public int getUnit() {
            return this.b;
        }

        public int hashCode() {
            return this.b;
        }

        @RecentlyNonNull
        public String toString() {
            String str;
            Objects.ToStringHelper toStringHelperAdd = Objects.toStringHelper(this).add("count", Integer.valueOf(this.a));
            int i = this.b;
            if (i == 1) {
                str = "day";
            } else if (i == 2) {
                str = "week";
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException("invalid unit value");
                }
                str = "month";
            }
            return toStringHelperAdd.add("unit", str).toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, getCount());
            SafeParcelWriter.writeInt(parcel, 2, getUnit());
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }
    }

    @SafeParcelable.Constructor
    public Goal(@SafeParcelable.Param(id = 1) long j, @SafeParcelable.Param(id = 2) long j2, @SafeParcelable.Param(id = 3) List<Integer> list, @SafeParcelable.Param(id = 4) Recurrence recurrence, @SafeParcelable.Param(id = 5) int i, @SafeParcelable.Param(id = 6) MetricObjective metricObjective, @SafeParcelable.Param(id = 7) DurationObjective durationObjective, @SafeParcelable.Param(id = 8) FrequencyObjective frequencyObjective) {
        this.a = j;
        this.b = j2;
        this.c = list;
        this.d = recurrence;
        this.e = i;
        this.f = metricObjective;
        this.g = durationObjective;
        this.h = frequencyObjective;
    }

    private static String a(int i) {
        if (i == 0) {
            return "unknown";
        }
        if (i == 1) {
            return SportWebParams.PARAMA_METRIC;
        }
        if (i == 2) {
            return "duration";
        }
        if (i == 3) {
            return "frequency";
        }
        throw new IllegalArgumentException("invalid objective type value");
    }

    private final void b(int i) {
        if (i != this.e) {
            throw new MismatchedGoalException(String.format("%s goal does not have %s objective", a(this.e), a(i)));
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Goal)) {
            return false;
        }
        Goal goal = (Goal) obj;
        return this.a == goal.a && this.b == goal.b && Objects.equal(this.c, goal.c) && Objects.equal(this.d, goal.d) && this.e == goal.e && Objects.equal(this.f, goal.f) && Objects.equal(this.g, goal.g) && Objects.equal(this.h, goal.h);
    }

    @RecentlyNullable
    public String getActivityName() {
        if (this.c.isEmpty() || this.c.size() > 1) {
            return null;
        }
        return zzko.getName(this.c.get(0).intValue());
    }

    public long getCreateTime(@RecentlyNonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.a, TimeUnit.NANOSECONDS);
    }

    @RecentlyNonNull
    public DurationObjective getDurationObjective() {
        b(2);
        return this.g;
    }

    public long getEndTime(@RecentlyNonNull Calendar calendar, @RecentlyNonNull TimeUnit timeUnit) {
        if (this.d == null) {
            return timeUnit.convert(this.b, TimeUnit.NANOSECONDS);
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(calendar.getTime());
        int i = this.d.b;
        if (i == 1) {
            calendar2.add(5, 1);
            calendar2.set(11, 0);
            return timeUnit.convert(calendar2.getTimeInMillis(), TimeUnit.MILLISECONDS);
        }
        if (i == 2) {
            calendar2.add(4, 1);
            calendar2.set(7, 2);
            calendar2.set(11, 0);
            return timeUnit.convert(calendar2.getTimeInMillis(), TimeUnit.MILLISECONDS);
        }
        if (i == 3) {
            calendar2.add(2, 1);
            calendar2.set(5, 1);
            calendar2.set(11, 0);
            return timeUnit.convert(calendar2.getTimeInMillis(), TimeUnit.MILLISECONDS);
        }
        int i2 = this.d.b;
        StringBuilder sb = new StringBuilder(24);
        sb.append("Invalid unit ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    @RecentlyNonNull
    public FrequencyObjective getFrequencyObjective() {
        b(3);
        return this.h;
    }

    @RecentlyNonNull
    public MetricObjective getMetricObjective() {
        b(1);
        return this.f;
    }

    public int getObjectiveType() {
        return this.e;
    }

    @RecentlyNullable
    public Recurrence getRecurrence() {
        return this.d;
    }

    public long getStartTime(@RecentlyNonNull Calendar calendar, @RecentlyNonNull TimeUnit timeUnit) {
        if (this.d == null) {
            return timeUnit.convert(this.a, TimeUnit.NANOSECONDS);
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(calendar.getTime());
        int i = this.d.b;
        if (i == 1) {
            calendar2.set(11, 0);
            return timeUnit.convert(calendar2.getTimeInMillis(), TimeUnit.MILLISECONDS);
        }
        if (i == 2) {
            calendar2.set(7, 2);
            calendar2.set(11, 0);
            return timeUnit.convert(calendar2.getTimeInMillis(), TimeUnit.MILLISECONDS);
        }
        if (i == 3) {
            calendar2.set(5, 1);
            calendar2.set(11, 0);
            return timeUnit.convert(calendar2.getTimeInMillis(), TimeUnit.MILLISECONDS);
        }
        int i2 = this.d.b;
        StringBuilder sb = new StringBuilder(24);
        sb.append("Invalid unit ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public int hashCode() {
        return this.e;
    }

    @RecentlyNonNull
    public String toString() {
        return Objects.toStringHelper(this).add("activity", getActivityName()).add("recurrence", this.d).add("metricObjective", this.f).add("durationObjective", this.g).add("frequencyObjective", this.h).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, this.a);
        SafeParcelWriter.writeLong(parcel, 2, this.b);
        SafeParcelWriter.writeList(parcel, 3, this.c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, getRecurrence(), i, false);
        SafeParcelWriter.writeInt(parcel, 5, getObjectiveType());
        SafeParcelWriter.writeParcelable(parcel, 6, this.f, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.g, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.h, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Class(creator = "DurationObjectiveCreator")
    @SafeParcelable.Reserved({1000})
    public static class DurationObjective extends AbstractSafeParcelable {

        @RecentlyNonNull
        public static final Parcelable.Creator<DurationObjective> CREATOR = new zzp();

        @SafeParcelable.Field(getter = "getDuration", id = 1)
        private final long a;

        @SafeParcelable.Constructor
        public DurationObjective(@SafeParcelable.Param(id = 1) long j) {
            this.a = j;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof DurationObjective) && this.a == ((DurationObjective) obj).a;
        }

        public long getDuration(@RecentlyNonNull TimeUnit timeUnit) {
            return timeUnit.convert(this.a, TimeUnit.NANOSECONDS);
        }

        public int hashCode() {
            return (int) this.a;
        }

        @RecentlyNonNull
        public String toString() {
            return Objects.toStringHelper(this).add("duration", Long.valueOf(this.a)).toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeLong(parcel, 1, this.a);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }

        public DurationObjective(long j, @RecentlyNonNull TimeUnit timeUnit) {
            this(timeUnit.toNanos(j));
        }
    }

    @SafeParcelable.Class(creator = "MetricObjectiveCreator")
    @SafeParcelable.Reserved({1000})
    public static class MetricObjective extends AbstractSafeParcelable {

        @RecentlyNonNull
        public static final Parcelable.Creator<MetricObjective> CREATOR = new zzx();

        @SafeParcelable.Field(getter = "getDataTypeName", id = 1)
        private final String a;

        @SafeParcelable.Field(getter = "getValue", id = 2)
        private final double b;

        @SafeParcelable.Field(getter = "getInitialValue", id = 3)
        private final double c;

        @ShowFirstParty
        @SafeParcelable.Constructor
        public MetricObjective(@RecentlyNonNull @SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) double d, @SafeParcelable.Param(id = 3) double d2) {
            this.a = str;
            this.b = d;
            this.c = d2;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MetricObjective)) {
                return false;
            }
            MetricObjective metricObjective = (MetricObjective) obj;
            return Objects.equal(this.a, metricObjective.a) && this.b == metricObjective.b && this.c == metricObjective.c;
        }

        @RecentlyNonNull
        public String getDataTypeName() {
            return this.a;
        }

        public double getValue() {
            return this.b;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @RecentlyNonNull
        public String toString() {
            return Objects.toStringHelper(this).add("dataTypeName", this.a).add("value", Double.valueOf(this.b)).add("initialValue", Double.valueOf(this.c)).toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
            int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeString(parcel, 1, getDataTypeName(), false);
            SafeParcelWriter.writeDouble(parcel, 2, getValue());
            SafeParcelWriter.writeDouble(parcel, 3, this.c);
            SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
        }

        public MetricObjective(@RecentlyNonNull String str, double d) {
            this(str, d, 0.0d);
        }
    }
}
