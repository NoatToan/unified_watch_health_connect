package com.huami.bluetooth.profile.channel.module.sleep;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u0000 >2\u00020\u0001:\u0001?Bc\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b<\u0010=J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u0080\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u001f\u001a\u00020\u0002HÖ\u0001J\t\u0010 \u001a\u00020\u0004HÖ\u0001J\u0013\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010(\u001a\u0004\b1\u0010*R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010(\u001a\u0004\b2\u0010*R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010(\u001a\u0004\b3\u0010*R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u00104\u001a\u0004\b5\u0010\u000eR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u00104\u001a\u0004\b6\u0010\u000eR\u001f\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u001c\u00107\u001a\u0004\b8\u00109R\u0014\u0010;\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u0010*¨\u0006@"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sleep/SleepData;", "Ljava/io/Serializable;", "", "component1", "", "component2", "Ljava/util/TimeZone;", "component3", "Lcom/huami/bluetooth/profile/channel/module/sleep/DataFlag;", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/Integer;", "component9", "", "Lcom/huami/bluetooth/profile/channel/module/sleep/SleepStage;", "component10", DialWidgetType.DATE, "updateTimestamp", "timeZone", "dataFlag", StatConstants.PARAM_START, BroadcastsKt.SILENT_PUSHING_STOP, "sleepDuration", "sleepScore", "restingHr", "stages", "copy", "(Ljava/lang/String;ILjava/util/TimeZone;Lcom/huami/bluetooth/profile/channel/module/sleep/DataFlag;IIILjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/huami/bluetooth/profile/channel/module/sleep/SleepData;", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getDate", "()Ljava/lang/String;", "I", "getUpdateTimestamp", "()I", "Ljava/util/TimeZone;", "getTimeZone", "()Ljava/util/TimeZone;", "Lcom/huami/bluetooth/profile/channel/module/sleep/DataFlag;", "getDataFlag", "()Lcom/huami/bluetooth/profile/channel/module/sleep/DataFlag;", "getStart", "getStop", "getSleepDuration", "Ljava/lang/Integer;", "getSleepScore", "getRestingHr", "Ljava/util/List;", "getStages", "()Ljava/util/List;", "getTimestamp$bluetooth_release", "timestamp", "<init>", "(Ljava/lang/String;ILjava/util/TimeZone;Lcom/huami/bluetooth/profile/channel/module/sleep/DataFlag;IIILjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class SleepData implements Serializable {

    @NotNull
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    private static final long serialVersionUID = 1;

    @NotNull
    private final DataFlag dataFlag;

    @NotNull
    private final String date;

    @Nullable
    private final Integer restingHr;
    private final int sleepDuration;

    @Nullable
    private final Integer sleepScore;

    @Nullable
    private final List<SleepStage> stages;
    private final int start;
    private final int stop;

    @NotNull
    private final TimeZone timeZone;
    private final int updateTimestamp;

    public SleepData(@NotNull String date, int i, @NotNull TimeZone timeZone, @NotNull DataFlag dataFlag, int i2, int i3, int i4, @Nullable Integer num, @Nullable Integer num2, @Nullable List<SleepStage> list) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        Intrinsics.checkNotNullParameter(dataFlag, "dataFlag");
        this.date = date;
        this.updateTimestamp = i;
        this.timeZone = timeZone;
        this.dataFlag = dataFlag;
        this.start = i2;
        this.stop = i3;
        this.sleepDuration = i4;
        this.sleepScore = num;
        this.restingHr = num2;
        this.stages = list;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @Nullable
    public final List<SleepStage> component10() {
        return this.stages;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TimeZone getTimeZone() {
        return this.timeZone;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DataFlag getDataFlag() {
        return this.dataFlag;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getStop() {
        return this.stop;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getSleepDuration() {
        return this.sleepDuration;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getSleepScore() {
        return this.sleepScore;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getRestingHr() {
        return this.restingHr;
    }

    @NotNull
    public final SleepData copy(@NotNull String date, int updateTimestamp, @NotNull TimeZone timeZone, @NotNull DataFlag dataFlag, int start, int stop, int sleepDuration, @Nullable Integer sleepScore, @Nullable Integer restingHr, @Nullable List<SleepStage> stages) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        Intrinsics.checkNotNullParameter(dataFlag, "dataFlag");
        return new SleepData(date, updateTimestamp, timeZone, dataFlag, start, stop, sleepDuration, sleepScore, restingHr, stages);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepData)) {
            return false;
        }
        SleepData sleepData = (SleepData) other;
        return Intrinsics.areEqual(this.date, sleepData.date) && this.updateTimestamp == sleepData.updateTimestamp && Intrinsics.areEqual(this.timeZone, sleepData.timeZone) && Intrinsics.areEqual(this.dataFlag, sleepData.dataFlag) && this.start == sleepData.start && this.stop == sleepData.stop && this.sleepDuration == sleepData.sleepDuration && Intrinsics.areEqual(this.sleepScore, sleepData.sleepScore) && Intrinsics.areEqual(this.restingHr, sleepData.restingHr) && Intrinsics.areEqual(this.stages, sleepData.stages);
    }

    @NotNull
    public final DataFlag getDataFlag() {
        return this.dataFlag;
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @Nullable
    public final Integer getRestingHr() {
        return this.restingHr;
    }

    public final int getSleepDuration() {
        return this.sleepDuration;
    }

    @Nullable
    public final Integer getSleepScore() {
        return this.sleepScore;
    }

    @Nullable
    public final List<SleepStage> getStages() {
        return this.stages;
    }

    public final int getStart() {
        return this.start;
    }

    public final int getStop() {
        return this.stop;
    }

    @NotNull
    public final TimeZone getTimeZone() {
        return this.timeZone;
    }

    public final int getTimestamp$bluetooth_release() throws ParseException {
        Calendar calendar = Calendar.getInstance(this.timeZone);
        Date date = new SimpleDateFormat("yyyy-MM-dd", Locale.US).parse(this.date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(date.getTime());
        calendar.set(calendar2.get(1), calendar2.get(2), calendar2.get(5), 0, 0, 0);
        calendar.set(14, 0);
        return (int) (calendar.getTimeInMillis() / ((long) 1000));
    }

    public final int getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.date.hashCode() * 31) + Integer.hashCode(this.updateTimestamp)) * 31) + this.timeZone.hashCode()) * 31) + this.dataFlag.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.stop)) * 31) + Integer.hashCode(this.sleepDuration)) * 31;
        Integer num = this.sleepScore;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.restingHr;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<SleepStage> list = this.stages;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SleepData(date=" + this.date + ", updateTimestamp=" + this.updateTimestamp + ", timeZone=" + this.timeZone + ", dataFlag=" + this.dataFlag + ", start=" + this.start + ", stop=" + this.stop + ", sleepDuration=" + this.sleepDuration + ", sleepScore=" + this.sleepScore + ", restingHr=" + this.restingHr + ", stages=" + this.stages + ')';
    }
}
