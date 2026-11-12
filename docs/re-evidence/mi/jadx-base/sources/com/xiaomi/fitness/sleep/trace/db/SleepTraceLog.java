package com.xiaomi.fitness.sleep.trace.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Entity(tableName = "sleep_trace_log")
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\b\b\u0007\u0018\u0000 92\u00020\u0001:\u00019B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000bJ\b\u00108\u001a\u00020\u001aH\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001e\u0010\u0014\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u0014\u0010!\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0013\u0010#\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010'\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010*\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0013\u0010.\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u00101\u001a\u0004\u0018\u0001028F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0016\u00105\u001a\u0004\u0018\u00010\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/db/SleepTraceLog;", "", "version", "", "category", "event", "value", "timestamp", "", "<init>", "(IIILjava/lang/Object;J)V", "()V", "getVersion", "()I", "setVersion", "(I)V", "getCategory", "setCategory", "getEvent", "setEvent", "id", "getId", "()J", "setId", "(J)V", "descString", "", "getDescString", "()Ljava/lang/String;", "setDescString", "(Ljava/lang/String;)V", "getTimestamp", "setTimestamp", "mDecimalDesc", "Ljava/math/BigDecimal;", "descBoolean", "", "getDescBoolean", "()Ljava/lang/Boolean;", "descInteger", "getDescInteger", "()Ljava/lang/Integer;", "descFloat", "", "getDescFloat", "()Ljava/lang/Float;", "descLong", "getDescLong", "()Ljava/lang/Long;", "descDouble", "", "getDescDouble", "()Ljava/lang/Double;", "decimalDesc", "getDecimalDesc", "()Ljava/math/BigDecimal;", "toString", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepTraceLog {
    public static final int CATEGORY_ACTIVITY = 2;
    public static final int CATEGORY_DEFAULT = 0;
    public static final int CATEGORY_USAGE = 1;
    public static final int EVENT_ON_BED = 2;
    public static final int EVENT_SLEEPING = 3;
    public static final int EVENT_V2_INTERACTIVE = 2;
    public static final int EVENT_V2_LIGHT = 3;
    public static final int EVENT_V2_MOTION = 1;
    public static final int EVENT_WAKEUP = 1;
    public static final int VERSION_V1 = 0;
    public static final int VERSION_V2 = 1;

    @ColumnInfo(name = "category")
    private int category;

    @ColumnInfo(name = "desc")
    @Nullable
    private String descString;

    @ColumnInfo(name = "event")
    private int event;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private long id;

    @Nullable
    private BigDecimal mDecimalDesc;

    @ColumnInfo(index = true, name = "timestamp")
    private long timestamp;

    @ColumnInfo(name = "version")
    private int version;

    public SleepTraceLog(int i, int i2, int i3, @Nullable Object obj, long j) {
        this.version = i;
        this.category = i2;
        this.event = i3;
        this.descString = String.valueOf(obj);
        this.timestamp = j;
    }

    private final BigDecimal getDecimalDesc() {
        try {
            BigDecimal bigDecimal = new BigDecimal(this.descString);
            this.mDecimalDesc = bigDecimal;
            return bigDecimal;
        } catch (Exception unused) {
            return null;
        }
    }

    public final int getCategory() {
        return this.category;
    }

    @Nullable
    public final Boolean getDescBoolean() {
        String str = this.descString;
        if (str == null) {
            return null;
        }
        if (StringsKt__StringsJVMKt.equals("true", str, true)) {
            return Boolean.TRUE;
        }
        if (StringsKt__StringsJVMKt.equals("false", this.descString, true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    @Nullable
    public final Double getDescDouble() {
        if (getDecimalDesc() == null) {
            return null;
        }
        BigDecimal bigDecimal = this.mDecimalDesc;
        Intrinsics.checkNotNull(bigDecimal);
        return Double.valueOf(bigDecimal.doubleValue());
    }

    @Nullable
    public final Float getDescFloat() {
        if (getDecimalDesc() == null) {
            return null;
        }
        BigDecimal bigDecimal = this.mDecimalDesc;
        Intrinsics.checkNotNull(bigDecimal);
        return Float.valueOf(bigDecimal.floatValue());
    }

    @Nullable
    public final Integer getDescInteger() {
        if (getDecimalDesc() == null) {
            return null;
        }
        BigDecimal bigDecimal = this.mDecimalDesc;
        Intrinsics.checkNotNull(bigDecimal);
        return Integer.valueOf(bigDecimal.intValue());
    }

    @Nullable
    public final Long getDescLong() {
        if (getDecimalDesc() == null) {
            return null;
        }
        BigDecimal bigDecimal = this.mDecimalDesc;
        Intrinsics.checkNotNull(bigDecimal);
        return Long.valueOf(bigDecimal.longValue());
    }

    @Nullable
    public final String getDescString() {
        return this.descString;
    }

    public final int getEvent() {
        return this.event;
    }

    public final long getId() {
        return this.id;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setCategory(int i) {
        this.category = i;
    }

    public final void setDescString(@Nullable String str) {
        this.descString = str;
    }

    public final void setEvent(int i) {
        this.event = i;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    @NotNull
    public String toString() {
        return "SleepTraceLog(version=" + this.version + ", category=" + this.category + ", event=" + this.event + ", id=" + this.id + ", descString=" + this.descString + ", timestamp=" + this.timestamp + ", mDecimalDesc=" + this.mDecimalDesc + ")";
    }

    public SleepTraceLog() {
        this(0, 0, 0, null, 0L);
    }
}
