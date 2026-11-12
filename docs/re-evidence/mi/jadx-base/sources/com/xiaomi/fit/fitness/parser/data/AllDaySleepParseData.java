package com.xiaomi.fit.fitness.parser.data;

import com.xiaomi.fit.data.common.data.daily.SleepAssistItemInfo;
import com.xiaomi.fit.fitness.parser.schema.DailyReportKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010C\u001a\u00020DH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR\u001e\u0010 \u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR\u001e\u0010#\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u000eR\u001e\u0010&\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010\u000eR\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\u001c\u00102\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R\u001a\u00105\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010:\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001c\u0010@\u001a\u0004\u0018\u00010;X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?¨\u0006E"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/data/AllDaySleepParseData;", "", "<init>", "()V", "isSleepFinish", "", "()Z", "setSleepFinish", "(Z)V", "deviceBedTime", "", "getDeviceBedTime", "()Ljava/lang/Long;", "setDeviceBedTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "deviceWakeupTime", "getDeviceWakeupTime", "setDeviceWakeupTime", DailyReportKey.sleepQuality, "", "getSleepQuality", "()Ljava/lang/Integer;", "setSleepQuality", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", DailyReportKey.sleepEfficiency, "getSleepEfficiency", "setSleepEfficiency", "entrySleepDuration", "getEntrySleepDuration", "setEntrySleepDuration", "linBedDuration", "getLinBedDuration", "setLinBedDuration", DailyReportKey.goBedTime, "getGoBedTime", "setGoBedTime", "leaveBedTime", "getLeaveBedTime", "setLeaveBedTime", "hrInfo", "Lcom/xiaomi/fit/data/common/data/daily/SleepAssistItemInfo;", "getHrInfo", "()Lcom/xiaomi/fit/data/common/data/daily/SleepAssistItemInfo;", "setHrInfo", "(Lcom/xiaomi/fit/data/common/data/daily/SleepAssistItemInfo;)V", "spo2Info", "getSpo2Info", "setSpo2Info", "snoreDecibelInfo", "getSnoreDecibelInfo", "setSnoreDecibelInfo", "sleepSrcDataLen", "getSleepSrcDataLen", "()I", "setSleepSrcDataLen", "(I)V", "assistInfoBytes", "", "getAssistInfoBytes", "()[B", "setAssistInfoBytes", "([B)V", "sleepSrcBytes", "getSleepSrcBytes", "setSleepSrcBytes", "toString", "", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AllDaySleepParseData {

    @Nullable
    private byte[] assistInfoBytes;

    @Nullable
    private Long deviceBedTime;

    @Nullable
    private Long deviceWakeupTime;

    @Nullable
    private Long entrySleepDuration;

    @Nullable
    private Long goBedTime;

    @Nullable
    private SleepAssistItemInfo hrInfo;
    private boolean isSleepFinish = true;

    @Nullable
    private Long leaveBedTime;

    @Nullable
    private Long linBedDuration;

    @Nullable
    private Integer sleepEfficiency;

    @Nullable
    private Integer sleepQuality;

    @Nullable
    private byte[] sleepSrcBytes;
    private int sleepSrcDataLen;

    @Nullable
    private SleepAssistItemInfo snoreDecibelInfo;

    @Nullable
    private SleepAssistItemInfo spo2Info;

    @Nullable
    public final byte[] getAssistInfoBytes() {
        return this.assistInfoBytes;
    }

    @Nullable
    public final Long getDeviceBedTime() {
        return this.deviceBedTime;
    }

    @Nullable
    public final Long getDeviceWakeupTime() {
        return this.deviceWakeupTime;
    }

    @Nullable
    public final Long getEntrySleepDuration() {
        return this.entrySleepDuration;
    }

    @Nullable
    public final Long getGoBedTime() {
        return this.goBedTime;
    }

    @Nullable
    public final SleepAssistItemInfo getHrInfo() {
        return this.hrInfo;
    }

    @Nullable
    public final Long getLeaveBedTime() {
        return this.leaveBedTime;
    }

    @Nullable
    public final Long getLinBedDuration() {
        return this.linBedDuration;
    }

    @Nullable
    public final Integer getSleepEfficiency() {
        return this.sleepEfficiency;
    }

    @Nullable
    public final Integer getSleepQuality() {
        return this.sleepQuality;
    }

    @Nullable
    public final byte[] getSleepSrcBytes() {
        return this.sleepSrcBytes;
    }

    public final int getSleepSrcDataLen() {
        return this.sleepSrcDataLen;
    }

    @Nullable
    public final SleepAssistItemInfo getSnoreDecibelInfo() {
        return this.snoreDecibelInfo;
    }

    @Nullable
    public final SleepAssistItemInfo getSpo2Info() {
        return this.spo2Info;
    }

    /* JADX INFO: renamed from: isSleepFinish, reason: from getter */
    public final boolean getIsSleepFinish() {
        return this.isSleepFinish;
    }

    public final void setAssistInfoBytes(@Nullable byte[] bArr) {
        this.assistInfoBytes = bArr;
    }

    public final void setDeviceBedTime(@Nullable Long l) {
        this.deviceBedTime = l;
    }

    public final void setDeviceWakeupTime(@Nullable Long l) {
        this.deviceWakeupTime = l;
    }

    public final void setEntrySleepDuration(@Nullable Long l) {
        this.entrySleepDuration = l;
    }

    public final void setGoBedTime(@Nullable Long l) {
        this.goBedTime = l;
    }

    public final void setHrInfo(@Nullable SleepAssistItemInfo sleepAssistItemInfo) {
        this.hrInfo = sleepAssistItemInfo;
    }

    public final void setLeaveBedTime(@Nullable Long l) {
        this.leaveBedTime = l;
    }

    public final void setLinBedDuration(@Nullable Long l) {
        this.linBedDuration = l;
    }

    public final void setSleepEfficiency(@Nullable Integer num) {
        this.sleepEfficiency = num;
    }

    public final void setSleepFinish(boolean z) {
        this.isSleepFinish = z;
    }

    public final void setSleepQuality(@Nullable Integer num) {
        this.sleepQuality = num;
    }

    public final void setSleepSrcBytes(@Nullable byte[] bArr) {
        this.sleepSrcBytes = bArr;
    }

    public final void setSleepSrcDataLen(int i) {
        this.sleepSrcDataLen = i;
    }

    public final void setSnoreDecibelInfo(@Nullable SleepAssistItemInfo sleepAssistItemInfo) {
        this.snoreDecibelInfo = sleepAssistItemInfo;
    }

    public final void setSpo2Info(@Nullable SleepAssistItemInfo sleepAssistItemInfo) {
        this.spo2Info = sleepAssistItemInfo;
    }

    @NotNull
    public String toString() {
        return "isSleepFinish =" + this.isSleepFinish + ", deviceBedTime = " + this.deviceBedTime + ", deviceWakeupTime = " + this.deviceWakeupTime + ", sleepQuality = " + this.sleepQuality + ",sleepSrcDataLen = " + this.sleepSrcDataLen + " ";
    }
}
