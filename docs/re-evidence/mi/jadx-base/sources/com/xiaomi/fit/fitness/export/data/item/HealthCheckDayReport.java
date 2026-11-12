package com.xiaomi.fit.fitness.export.data.item;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.export.data.item.HealthCheckDayReport;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Parcelize
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003B1\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\t\u0010\u001e\u001a\u00020\u0005HÂ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0015J8\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010#J\u0006\u0010$\u001a\u00020\bJ\u0013\u0010%\u001a\u00020&2\b\u0010\u001a\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\bHÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0016\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006/"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/HealthCheckDayReport;", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "Landroid/os/Parcelable;", "time", "", "protoTime", "tzIn15Min", "", "version", "<init>", "(JJILjava/lang/Integer;)V", "getProtoTime", "()J", "setProtoTime", "(J)V", "getTzIn15Min", "()I", "setTzIn15Min", "(I)V", "getVersion", "()Ljava/lang/Integer;", "setVersion", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "compareTo", "other", "getTimestamp", "setTimestamp", "", "component1", "component2", "component3", "component4", "copy", "(JJILjava/lang/Integer;)Lcom/xiaomi/fit/fitness/export/data/item/HealthCheckDayReport;", "describeContents", "equals", "", "", "hashCode", "toString", "", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HealthCheckDayReport extends DailyRecordItem implements Comparable<HealthCheckDayReport>, Parcelable {

    @NotNull
    public static final Parcelable.Creator<HealthCheckDayReport> CREATOR = new Creator();
    private long protoTime;
    private transient long time;

    @SerializedName("timezone")
    private int tzIn15Min;

    @SerializedName("version")
    @Nullable
    private Integer version;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HealthCheckDayReport> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HealthCheckDayReport createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HealthCheckDayReport(parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HealthCheckDayReport[] newArray(int i) {
            return new HealthCheckDayReport[i];
        }
    }

    public HealthCheckDayReport() {
        this(0L, 0L, 0, null, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable compareTo$lambda$0(HealthCheckDayReport it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Long.valueOf(it.time);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final long getTime() {
        return this.time;
    }

    public static /* synthetic */ HealthCheckDayReport copy$default(HealthCheckDayReport healthCheckDayReport, long j, long j2, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = healthCheckDayReport.time;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = healthCheckDayReport.protoTime;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = healthCheckDayReport.tzIn15Min;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            num = healthCheckDayReport.version;
        }
        return healthCheckDayReport.copy(j3, j4, i3, num);
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getProtoTime() {
        return this.protoTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTzIn15Min() {
        return this.tzIn15Min;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    @NotNull
    public final HealthCheckDayReport copy(long time, long protoTime, int tzIn15Min, @Nullable Integer version) {
        return new HealthCheckDayReport(time, protoTime, tzIn15Min, version);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthCheckDayReport)) {
            return false;
        }
        HealthCheckDayReport healthCheckDayReport = (HealthCheckDayReport) other;
        return this.time == healthCheckDayReport.time && this.protoTime == healthCheckDayReport.protoTime && this.tzIn15Min == healthCheckDayReport.tzIn15Min && Intrinsics.areEqual(this.version, healthCheckDayReport.version);
    }

    public final long getProtoTime() {
        return this.protoTime;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public final int getTzIn15Min() {
        return this.tzIn15Min;
    }

    @Nullable
    public final Integer getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.time) * 31) + Long.hashCode(this.protoTime)) * 31) + Integer.hashCode(this.tzIn15Min)) * 31;
        Integer num = this.version;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final void setProtoTime(long j) {
        this.protoTime = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        this.time = time;
    }

    public final void setTzIn15Min(int i) {
        this.tzIn15Min = i;
    }

    public final void setVersion(@Nullable Integer num) {
        this.version = num;
    }

    @NotNull
    public String toString() {
        return "HealthCheckDayReport(time=" + this.time + ", protoTime=" + this.protoTime + ", tzIn15Min=" + this.tzIn15Min + ", version=" + this.version + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.time);
        dest.writeLong(this.protoTime);
        dest.writeInt(this.tzIn15Min);
        Integer num = this.version;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
    }

    public /* synthetic */ HealthCheckDayReport(long j, long j2, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) == 0 ? j2 : 0L, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? 0 : num);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull HealthCheckDayReport other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return ComparisonsKt__ComparisonsKt.compareValuesBy(this, other, (Function1<? super HealthCheckDayReport, ? extends Comparable<?>>[]) ((Function1<? super Object, ? extends Comparable<?>>[]) new Function1[]{new Function1() { // from class: mob
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HealthCheckDayReport.compareTo$lambda$0((HealthCheckDayReport) obj);
            }
        }, new MutablePropertyReference1Impl() { // from class: com.xiaomi.fit.fitness.export.data.item.HealthCheckDayReport.compareTo.2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return Long.valueOf(((HealthCheckDayReport) obj).getProtoTime());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(Object obj, Object obj2) {
                ((HealthCheckDayReport) obj).setProtoTime(((Number) obj2).longValue());
            }
        }}));
    }

    public HealthCheckDayReport(long j, long j2, int i, @Nullable Integer num) {
        super(null);
        this.time = j;
        this.protoTime = j2;
        this.tzIn15Min = i;
        this.version = num;
    }
}
