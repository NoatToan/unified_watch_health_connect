package com.huami.assistant.ui.v2.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.ui.v2.db.converter.ScheduleConverters;
import com.loc.z;
import com.xiaomi.hm.health.device.settings.todo.datasource.impl.RemoteDataSourceImpl;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@TypeConverters({ScheduleConverters.class})
@Entity(tableName = "schedule_event_model")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0003¢\u0006\u0004\b>\u0010?J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\t\u0010\n\u001a\u00020\u0007HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\u0007HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003Jw\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u0003HÆ\u0001J\t\u0010 \u001a\u00020\u001fHÖ\u0001J\u0013\u0010\"\u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0013\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0014\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u0015\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\u001c\u0010\u0016\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R\u001c\u0010\u0017\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010*R\u001c\u0010\u0018\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b2\u0010&R\u001c\u0010\u0019\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b4\u0010&R\u001c\u0010\u001a\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010$\u001a\u0004\b6\u0010&R\u001c\u0010\u001b\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010$\u001a\u0004\b8\u0010&R\u001c\u0010\u001c\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010$\u001a\u0004\b:\u0010&R\u001c\u0010\u001d\u001a\u00020\u00038\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b\u001d\u0010=¨\u0006@"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleEventModel;", "", "model", "", "systemEquals", "", "toString", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "id", "eventSyncId", "scheduleId", "title", "summary", "startTime", "stopTime", RemoteDataSourceImpl.EVENT_DATA_KEY_REPEAT_MODE, "repeatStopTime", "alertTime", "isAllDayEvent", "copy", "", "hashCode", "other", "equals", "a", "J", "getId", "()J", "b", "Ljava/lang/String;", "getEventSyncId", "()Ljava/lang/String;", "c", "getScheduleId", GoogleApiAvailabilityLight.a, "getTitle", "e", "getSummary", "f", "getStartTime", "g", "getStopTime", "h", "getRepeatMode", "i", "getRepeatStopTime", z.j, "getAlertTime", hl.k, "Z", "()Z", "<init>", "(JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;JJJJJZ)V", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ScheduleEventModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @ColumnInfo(name = "event_sync_id")
    @NotNull
    private final String eventSyncId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @ColumnInfo(name = "schedule_id")
    private final long scheduleId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @ColumnInfo(name = "title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @ColumnInfo(name = "summary")
    @NotNull
    private final String summary;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @ColumnInfo(name = "start_time")
    private final long startTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @ColumnInfo(name = "stop_time")
    private final long stopTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @ColumnInfo(name = "repeat_mode")
    private final long repeatMode;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @ColumnInfo(name = "repeat_stop_time")
    private final long repeatStopTime;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @ColumnInfo(name = "alert_time")
    private final long alertTime;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @ColumnInfo(name = "is_all_day_event")
    private final boolean isAllDayEvent;

    public ScheduleEventModel(long j, @NotNull String str, long j2, @NotNull String str2, @NotNull String str3, long j3, long j4, long j5, long j6, long j7, boolean z) {
        this.id = j;
        this.eventSyncId = str;
        this.scheduleId = j2;
        this.title = str2;
        this.summary = str3;
        this.startTime = j3;
        this.stopTime = j4;
        this.repeatMode = j5;
        this.repeatStopTime = j6;
        this.alertTime = j7;
        this.isAllDayEvent = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getAlertTime() {
        return this.alertTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsAllDayEvent() {
        return this.isAllDayEvent;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEventSyncId() {
        return this.eventSyncId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getScheduleId() {
        return this.scheduleId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getStopTime() {
        return this.stopTime;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getRepeatMode() {
        return this.repeatMode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getRepeatStopTime() {
        return this.repeatStopTime;
    }

    @NotNull
    public final ScheduleEventModel copy(long id, @NotNull String eventSyncId, long scheduleId, @NotNull String title, @NotNull String summary, long startTime, long stopTime, long repeatMode, long repeatStopTime, long alertTime, boolean isAllDayEvent) {
        return new ScheduleEventModel(id, eventSyncId, scheduleId, title, summary, startTime, stopTime, repeatMode, repeatStopTime, alertTime, isAllDayEvent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleEventModel)) {
            return false;
        }
        ScheduleEventModel scheduleEventModel = (ScheduleEventModel) other;
        return this.id == scheduleEventModel.id && Intrinsics.areEqual(this.eventSyncId, scheduleEventModel.eventSyncId) && this.scheduleId == scheduleEventModel.scheduleId && Intrinsics.areEqual(this.title, scheduleEventModel.title) && Intrinsics.areEqual(this.summary, scheduleEventModel.summary) && this.startTime == scheduleEventModel.startTime && this.stopTime == scheduleEventModel.stopTime && this.repeatMode == scheduleEventModel.repeatMode && this.repeatStopTime == scheduleEventModel.repeatStopTime && this.alertTime == scheduleEventModel.alertTime && this.isAllDayEvent == scheduleEventModel.isAllDayEvent;
    }

    public final long getAlertTime() {
        return this.alertTime;
    }

    @NotNull
    public final String getEventSyncId() {
        return this.eventSyncId;
    }

    public final long getId() {
        return this.id;
    }

    public final long getRepeatMode() {
        return this.repeatMode;
    }

    public final long getRepeatStopTime() {
        return this.repeatStopTime;
    }

    public final long getScheduleId() {
        return this.scheduleId;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final long getStopTime() {
        return this.stopTime;
    }

    @NotNull
    public final String getSummary() {
        return this.summary;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    public int hashCode() {
        int iA = ((((((((((((((((((b.a(this.id) * 31) + this.eventSyncId.hashCode()) * 31) + b.a(this.scheduleId)) * 31) + this.title.hashCode()) * 31) + this.summary.hashCode()) * 31) + b.a(this.startTime)) * 31) + b.a(this.stopTime)) * 31) + b.a(this.repeatMode)) * 31) + b.a(this.repeatStopTime)) * 31) + b.a(this.alertTime)) * 31;
        boolean z = this.isAllDayEvent;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iA + r1;
    }

    public final boolean isAllDayEvent() {
        return this.isAllDayEvent;
    }

    public final boolean systemEquals(@NotNull ScheduleEventModel model) {
        return Intrinsics.areEqual(this.eventSyncId, model.eventSyncId) && this.startTime == model.startTime && this.stopTime == model.stopTime && this.repeatStopTime == model.repeatStopTime && this.alertTime == model.alertTime && this.isAllDayEvent == model.isAllDayEvent && Intrinsics.areEqual(this.title, model.title) && Intrinsics.areEqual(this.summary, model.summary);
    }

    @NotNull
    public String toString() {
        return "ScheduleEventModel<id:" + this.id + ", eventSyncId:" + this.eventSyncId + ", scheduleId:" + this.scheduleId + ", startTime:" + this.startTime + ", stopTime:" + this.stopTime + ", repeatStopTime:" + this.repeatStopTime + ", alertTime:" + this.alertTime + ", isAllDayEvent:" + this.isAllDayEvent + ", title:" + this.title + ", summary:" + this.summary + SearchCriteria.GT;
    }

    public /* synthetic */ ScheduleEventModel(long j, String str, long j2, String str2, String str3, long j3, long j4, long j5, long j6, long j7, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, j2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, j3, j4, j5, j6, j7, z);
    }
}
