package com.xiaomi.hm.health.bt.profile.menstruation;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.Serializable;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationRecord;", "Ljava/io/Serializable;", "", "toString", "Ljava/util/Calendar;", "component1", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationState;", "component2", "", "component3", "calendar", "menstruationState", "modifyTimeStamp", "copy", "", "hashCode", "", "other", "", "equals", "Ljava/util/Calendar;", "getCalendar", "()Ljava/util/Calendar;", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationState;", "getMenstruationState", "()Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationState;", "J", "getModifyTimeStamp", "()J", "<init>", "(Ljava/util/Calendar;Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationState;J)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class MenstruationRecord implements Serializable {
    private static final long serialVersionUID = 1;

    @NotNull
    private final Calendar calendar;

    @NotNull
    private final MenstruationState menstruationState;
    private final long modifyTimeStamp;

    public MenstruationRecord(@NotNull Calendar calendar, @NotNull MenstruationState menstruationState, long j) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        Intrinsics.checkNotNullParameter(menstruationState, "menstruationState");
        this.calendar = calendar;
        this.menstruationState = menstruationState;
        this.modifyTimeStamp = j;
    }

    public static /* synthetic */ MenstruationRecord copy$default(MenstruationRecord menstruationRecord, Calendar calendar, MenstruationState menstruationState, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            calendar = menstruationRecord.calendar;
        }
        if ((i & 2) != 0) {
            menstruationState = menstruationRecord.menstruationState;
        }
        if ((i & 4) != 0) {
            j = menstruationRecord.modifyTimeStamp;
        }
        return menstruationRecord.copy(calendar, menstruationState, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Calendar getCalendar() {
        return this.calendar;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MenstruationState getMenstruationState() {
        return this.menstruationState;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getModifyTimeStamp() {
        return this.modifyTimeStamp;
    }

    @NotNull
    public final MenstruationRecord copy(@NotNull Calendar calendar, @NotNull MenstruationState menstruationState, long modifyTimeStamp) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        Intrinsics.checkNotNullParameter(menstruationState, "menstruationState");
        return new MenstruationRecord(calendar, menstruationState, modifyTimeStamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstruationRecord)) {
            return false;
        }
        MenstruationRecord menstruationRecord = (MenstruationRecord) other;
        return Intrinsics.areEqual(this.calendar, menstruationRecord.calendar) && this.menstruationState == menstruationRecord.menstruationState && this.modifyTimeStamp == menstruationRecord.modifyTimeStamp;
    }

    @NotNull
    public final Calendar getCalendar() {
        return this.calendar;
    }

    @NotNull
    public final MenstruationState getMenstruationState() {
        return this.menstruationState;
    }

    public final long getModifyTimeStamp() {
        return this.modifyTimeStamp;
    }

    public int hashCode() {
        return (((this.calendar.hashCode() * 31) + this.menstruationState.hashCode()) * 31) + Long.hashCode(this.modifyTimeStamp);
    }

    @NotNull
    public String toString() {
        return "[calendar: " + this.calendar.getTime() + ", menstruationState: " + this.menstruationState + ", modifyTimeStamp: " + this.modifyTimeStamp + "]\n";
    }
}
