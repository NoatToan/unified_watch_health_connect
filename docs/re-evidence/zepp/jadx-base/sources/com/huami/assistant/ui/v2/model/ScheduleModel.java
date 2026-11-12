package com.huami.assistant.ui.v2.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;
import com.alipay.sdk.m.x.d;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.assistant.ui.v2.db.converter.ScheduleConverters;
import com.huami.assistant.ui.v2.util.ScheduleIdUtil;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.loc.z;
import com.xiaomi.hm.health.device.settings.todo.datasource.impl.RemoteDataSourceImpl;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@TypeConverters({ScheduleConverters.class})
@Entity(tableName = "schedule_model")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b:\b\u0087\b\u0018\u0000 b2\u00020\u0001:\u0001bB\u0083\u0001\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u000b\u0012\u0006\u0010\u001f\u001a\u00020\u000b\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\b\b\u0002\u0010!\u001a\u00020\u0012\u0012\b\b\u0002\u0010\"\u001a\u00020\u000b\u0012\b\b\u0002\u0010#\u001a\u00020\u0004\u0012\b\b\u0002\u0010$\u001a\u00020\u0007\u0012\b\b\u0002\u0010%\u001a\u00020\u0017\u0012\b\b\u0002\u0010&\u001a\u00020\u000b\u0012\b\b\u0002\u0010'\u001a\u00020\u0007¢\u0006\u0004\b`\u0010aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\t\u0010\r\u001a\u00020\u0007HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\t\u0010\u0014\u001a\u00020\u000bHÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0017HÆ\u0003J\t\u0010\u0019\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u008b\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u000b2\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020\u00172\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u0007HÆ\u0001J\t\u0010*\u001a\u00020)HÖ\u0001R\"\u0010\u001b\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\u001c\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010\u001d\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\"\u0010\u001e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010,\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R\"\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010,\u001a\u0004\b>\u0010.\"\u0004\b?\u00100R\"\u0010 \u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010,\u001a\u0004\bA\u0010.\"\u0004\bB\u00100R\"\u0010!\u001a\u00020\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010\"\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010,\u001a\u0004\bJ\u0010.\"\u0004\bK\u00100R\"\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\b#\u0010N\"\u0004\bO\u0010PR\"\u0010$\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u00102\u001a\u0004\bR\u00104\"\u0004\bS\u00106R\"\u0010%\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010&\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bZ\u0010,\u001a\u0004\b[\u0010.\"\u0004\b\\\u00100R\"\u0010'\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b]\u00102\u001a\u0004\b^\u00104\"\u0004\b_\u00106¨\u0006c"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleModel;", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "toWatchSchedule", "", "createNewId", "copyNew", "", "toString", "other", "equals", "", "component1", "component2", "component3", "component4", "component5", "component6", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "component7", "component8", "component9", "component10", "Lcom/huami/assistant/ui/v2/model/ScheduleSource;", "component11", "component12", "component13", "id", "title", "desc", "startTime", "stopTime", "alertTime", RemoteDataSourceImpl.EVENT_DATA_KEY_REPEAT_MODE, "repeatStopTime", "isAllDayEvent", "imageUrl", "source", "updateVersion", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "copy", "", "hashCode", "a", "J", "getId", "()J", WebConst.QueryParam.SET_ID, "(J)V", "b", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", d.o, "(Ljava/lang/String;)V", "c", "getDesc", "setDesc", GoogleApiAvailabilityLight.a, "getStartTime", "setStartTime", "e", "getStopTime", "setStopTime", "f", "getAlertTime", "setAlertTime", "g", "Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "getRepeatMode", "()Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;", "setRepeatMode", "(Lcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;)V", "h", "getRepeatStopTime", "setRepeatStopTime", "i", "Z", "()Z", "setAllDayEvent", "(Z)V", z.j, "getImageUrl", "setImageUrl", hl.k, "Lcom/huami/assistant/ui/v2/model/ScheduleSource;", "getSource", "()Lcom/huami/assistant/ui/v2/model/ScheduleSource;", "setSource", "(Lcom/huami/assistant/ui/v2/model/ScheduleSource;)V", "l", "getUpdateVersion", "setUpdateVersion", "m", "getAddress", "setAddress", "<init>", "(JLjava/lang/String;Ljava/lang/String;JJJLcom/huami/assistant/ui/v2/model/ScheduleRepeatMode;JZLjava/lang/String;Lcom/huami/assistant/ui/v2/model/ScheduleSource;JLjava/lang/String;)V", "Companion", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ScheduleModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final long NEVER_REPEAT_STOP_TIME = 4294967295L;
    private static final int n = 60;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    private long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "title")
    @NotNull
    private String title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "desc")
    @NotNull
    private String description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "startTime")
    private long startTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "stopTime")
    private long stopTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "alertTime")
    private long alertTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = RemoteDataSourceImpl.EVENT_DATA_KEY_REPEAT_MODE)
    @NotNull
    private ScheduleRepeatMode repeatMode;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "repeatStopTime")
    private long repeatStopTime;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "isAllDayEvent")
    private boolean isAllDay;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "imageUrl")
    @NotNull
    private String imageUrl;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "source")
    @NotNull
    private ScheduleSource source;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "updateVersion")
    private long updateVersion;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = IntegrityManager.INTEGRITY_TYPE_ADDRESS)
    @NotNull
    private String address;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/huami/assistant/ui/v2/model/ScheduleModel$Companion;", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "watchSchedule", "Lcom/huami/assistant/ui/v2/model/ScheduleModel;", "fromWatchSchedule", "", "MINUTE_SECONDS", LogUtil.I, "", "NEVER_REPEAT_STOP_TIME", "J", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ScheduleModel fromWatchSchedule(@NotNull com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel watchSchedule) {
            return new ScheduleModel(watchSchedule.getId(), watchSchedule.getTitle(), watchSchedule.getDescription(), watchSchedule.getStartTime(), watchSchedule.getStopTime(), watchSchedule.getAlertTime() == 4294967295L ? -1L : watchSchedule.getAlertTime() / ((long) 60), new ScheduleRepeatMode(watchSchedule.getRepeatMode()), watchSchedule.getRepeatStopTime(), watchSchedule.isAllDay(), watchSchedule.getImageUrl(), ScheduleSource.INSTANCE.fromSource(watchSchedule.getSource()), watchSchedule.getUpdateVersion(), watchSchedule.getAddress());
        }
    }

    public ScheduleModel(long j, @NotNull String str, @NotNull String str2, long j2, long j3, long j4, @NotNull ScheduleRepeatMode scheduleRepeatMode, long j5, boolean z, @NotNull String str3, @NotNull ScheduleSource scheduleSource, long j6, @NotNull String str4) {
        this.id = j;
        this.title = str;
        this.description = str2;
        this.startTime = j2;
        this.stopTime = j3;
        this.alertTime = j4;
        this.repeatMode = scheduleRepeatMode;
        this.repeatStopTime = j5;
        this.isAllDay = z;
        this.imageUrl = str3;
        this.source = scheduleSource;
        this.updateVersion = j6;
        this.address = str4;
    }

    public static /* synthetic */ ScheduleModel copyNew$default(ScheduleModel scheduleModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return scheduleModel.copyNew(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final ScheduleSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getUpdateVersion() {
        return this.updateVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getStopTime() {
        return this.stopTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getAlertTime() {
        return this.alertTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ScheduleRepeatMode getRepeatMode() {
        return this.repeatMode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getRepeatStopTime() {
        return this.repeatStopTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsAllDay() {
        return this.isAllDay;
    }

    @NotNull
    public final ScheduleModel copy(long id, @NotNull String title, @NotNull String desc, long startTime, long stopTime, long alertTime, @NotNull ScheduleRepeatMode repeatMode, long repeatStopTime, boolean isAllDayEvent, @NotNull String imageUrl, @NotNull ScheduleSource source, long updateVersion, @NotNull String address) {
        return new ScheduleModel(id, title, desc, startTime, stopTime, alertTime, repeatMode, repeatStopTime, isAllDayEvent, imageUrl, source, updateVersion, address);
    }

    @NotNull
    public final ScheduleModel copyNew(boolean createNewId) {
        return new ScheduleModel(createNewId ? ScheduleIdUtil.INSTANCE.generateId() : this.id, this.title, this.description, this.startTime, this.stopTime, this.alertTime, this.repeatMode, this.repeatStopTime, this.isAllDay, this.imageUrl, this.source, this.updateVersion, this.address);
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof ScheduleModel) {
            ScheduleModel scheduleModel = (ScheduleModel) other;
            if (scheduleModel.id == this.id && Intrinsics.areEqual(scheduleModel.title, this.title) && Intrinsics.areEqual(scheduleModel.description, this.description) && scheduleModel.startTime == this.startTime && scheduleModel.stopTime == this.stopTime && scheduleModel.alertTime == this.alertTime && scheduleModel.repeatMode.getMode() == this.repeatMode.getMode() && scheduleModel.repeatStopTime == this.repeatStopTime && scheduleModel.isAllDay == this.isAllDay && Intrinsics.areEqual(scheduleModel.imageUrl, this.imageUrl) && scheduleModel.source.getSource() == this.source.getSource() && Intrinsics.areEqual(scheduleModel.address, this.address)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String getAddress() {
        return this.address;
    }

    public final long getAlertTime() {
        return this.alertTime;
    }

    @NotNull
    public final String getDesc() {
        return this.description;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final ScheduleRepeatMode getRepeatMode() {
        return this.repeatMode;
    }

    public final long getRepeatStopTime() {
        return this.repeatStopTime;
    }

    @NotNull
    public final ScheduleSource getSource() {
        return this.source;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final long getStopTime() {
        return this.stopTime;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final long getUpdateVersion() {
        return this.updateVersion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    public int hashCode() {
        int iA = ((((((((((((((b.a(this.id) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + b.a(this.startTime)) * 31) + b.a(this.stopTime)) * 31) + b.a(this.alertTime)) * 31) + this.repeatMode.hashCode()) * 31) + b.a(this.repeatStopTime)) * 31;
        boolean z = this.isAllDay;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((iA + r1) * 31) + this.imageUrl.hashCode()) * 31) + this.source.hashCode()) * 31) + b.a(this.updateVersion)) * 31) + this.address.hashCode();
    }

    public final boolean isAllDayEvent() {
        return this.isAllDay;
    }

    public final void setAddress(@NotNull String str) {
        this.address = str;
    }

    public final void setAlertTime(long j) {
        this.alertTime = j;
    }

    public final void setAllDayEvent(boolean z) {
        this.isAllDay = z;
    }

    public final void setDesc(@NotNull String str) {
        this.description = str;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setImageUrl(@NotNull String str) {
        this.imageUrl = str;
    }

    public final void setRepeatMode(@NotNull ScheduleRepeatMode scheduleRepeatMode) {
        this.repeatMode = scheduleRepeatMode;
    }

    public final void setRepeatStopTime(long j) {
        this.repeatStopTime = j;
    }

    public final void setSource(@NotNull ScheduleSource scheduleSource) {
        this.source = scheduleSource;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setStopTime(long j) {
        this.stopTime = j;
    }

    public final void setTitle(@NotNull String str) {
        this.title = str;
    }

    public final void setUpdateVersion(long j) {
        this.updateVersion = j;
    }

    @NotNull
    public String toString() {
        return "ScheduleModel(id=" + this.id + ", title='" + this.title + "', description='" + this.description + "', startTime=" + this.startTime + ", stopTime=" + this.stopTime + ", alertTime=" + this.alertTime + ", repeatMode=" + this.repeatMode + ", repeatStopTime=" + this.repeatStopTime + "isAllDay=" + this.isAllDay + ", imageUrl='" + this.imageUrl + "', source=" + this.source + ", updateVersion=" + this.updateVersion + ", address=" + this.address + ")";
    }

    @NotNull
    public final com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel toWatchSchedule() {
        long j = this.alertTime;
        return new com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel(this.id, this.title, this.description, this.startTime, this.stopTime, j == -1 ? 4294967295L : j * ((long) 60), (this.repeatMode.getMode() != ScheduleRepeatMode.WorkDay.INSTANCE.getMode() || ScheduleRepeatMode.INSTANCE.isSupportWorkDay()) ? this.repeatMode.getMode() : ScheduleRepeatMode.Monday.INSTANCE.getMode() | ScheduleRepeatMode.Tuesday.INSTANCE.getMode() | ScheduleRepeatMode.Wednesday.INSTANCE.getMode() | ScheduleRepeatMode.Thursday.INSTANCE.getMode() | ScheduleRepeatMode.Friday.INSTANCE.getMode(), this.repeatStopTime, this.isAllDay, this.imageUrl, this.source.getSource(), this.updateVersion, this.address);
    }

    public /* synthetic */ ScheduleModel(long j, String str, String str2, long j2, long j3, long j4, ScheduleRepeatMode scheduleRepeatMode, long j5, boolean z, String str3, ScheduleSource scheduleSource, long j6, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, j2, j3, (i & 32) != 0 ? 0L : j4, (i & 64) != 0 ? ScheduleRepeatMode.Once.INSTANCE : scheduleRepeatMode, (i & 128) != 0 ? 4294967295L : j5, (i & 256) != 0 ? false : z, (i & 512) != 0 ? "" : str3, (i & 1024) != 0 ? ScheduleSource.ANDROID_ZEPP.INSTANCE : scheduleSource, (i & 2048) != 0 ? System.currentTimeMillis() / ((long) 1000) : j6, (i & 4096) != 0 ? "" : str4);
    }
}
