package com.xiaomi.hm.health.dataprocess;

import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J\t\u0010E\u001a\u00020\u0007HÆ\u0003J\t\u0010F\u001a\u00020\u0007HÆ\u0003J1\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020\u0007HÖ\u0001J\t\u0010L\u001a\u00020MHÖ\u0001R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u000fR\u001c\u0010!\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\r\"\u0004\b#\u0010\u000fR\u001c\u0010$\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\r\"\u0004\b&\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0015\"\u0004\b(\u0010\u0017R\u001a\u0010)\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0015\"\u0004\b+\u0010\u0017R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0013\u00102\u001a\u0004\u0018\u000103¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u00108\u001a\u000209¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0015\"\u0004\b>\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0015\"\u0004\bB\u0010\u0017¨\u0006N"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/ProcessData;", "", "sportDay", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "userInfo", "Lcom/xiaomi/hm/health/dataprocess/UserInfo;", "processType", "", "wholeTimeSleepDetection", "(Lcom/xiaomi/hm/health/dataprocess/SportDay;Lcom/xiaomi/hm/health/dataprocess/UserInfo;II)V", "curData", "", "getCurData", "()[B", "setCurData", "([B)V", "curHrData", "getCurHrData", "setCurHrData", "daySleepDetectionStatus", "getDaySleepDetectionStatus", "()I", "setDaySleepDetectionStatus", "(I)V", "modifySleepData", "Lcom/xiaomi/hm/health/dataprocess/ModifySleepData;", "getModifySleepData", "()Lcom/xiaomi/hm/health/dataprocess/ModifySleepData;", "setModifySleepData", "(Lcom/xiaomi/hm/health/dataprocess/ModifySleepData;)V", "nextData", "getNextData", "setNextData", "preData", "getPreData", "setPreData", "preHrData", "getPreHrData", "setPreHrData", "getProcessType", "setProcessType", "rawOffset", "getRawOffset", "setRawOffset", "sleepFluctuationData", "Lcom/xiaomi/hm/health/dataprocess/SleepFluctuationData;", "getSleepFluctuationData", "()Lcom/xiaomi/hm/health/dataprocess/SleepFluctuationData;", "setSleepFluctuationData", "(Lcom/xiaomi/hm/health/dataprocess/SleepFluctuationData;)V", "sleepInfo", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "getSleepInfo", "()Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "getSportDay", "()Lcom/xiaomi/hm/health/dataprocess/SportDay;", "stepInfo", "Lcom/xiaomi/hm/health/dataprocess/StepsInfo;", "getStepInfo", "()Lcom/xiaomi/hm/health/dataprocess/StepsInfo;", "stepInterval", "getStepInterval", "setStepInterval", "getUserInfo", "()Lcom/xiaomi/hm/health/dataprocess/UserInfo;", "getWholeTimeSleepDetection", "setWholeTimeSleepDetection", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "dataprocess_release"}, k = 1, mv = {1, 1, 13})
public final /* data */ class ProcessData {

    @Nullable
    private byte[] curData;

    @Nullable
    private byte[] curHrData;
    private int daySleepDetectionStatus;

    @Nullable
    private ModifySleepData modifySleepData;

    @Nullable
    private byte[] nextData;

    @Nullable
    private byte[] preData;

    @Nullable
    private byte[] preHrData;
    private int processType;
    private int rawOffset;

    @Nullable
    private SleepFluctuationData sleepFluctuationData;

    @Nullable
    private final SleepInfo sleepInfo;

    @NotNull
    private final SportDay sportDay;

    @NotNull
    private final StepsInfo stepInfo;
    private int stepInterval;

    @NotNull
    private final UserInfo userInfo;
    private int wholeTimeSleepDetection;

    @JvmOverloads
    public ProcessData(@NotNull SportDay sportDay, @NotNull UserInfo userInfo) {
        this(sportDay, userInfo, 0, 0, 12, null);
    }

    @NotNull
    public static /* synthetic */ ProcessData copy$default(ProcessData processData, SportDay sportDay, UserInfo userInfo, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            sportDay = processData.sportDay;
        }
        if ((i3 & 2) != 0) {
            userInfo = processData.userInfo;
        }
        if ((i3 & 4) != 0) {
            i = processData.processType;
        }
        if ((i3 & 8) != 0) {
            i2 = processData.wholeTimeSleepDetection;
        }
        return processData.copy(sportDay, userInfo, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SportDay getSportDay() {
        return this.sportDay;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getProcessType() {
        return this.processType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getWholeTimeSleepDetection() {
        return this.wholeTimeSleepDetection;
    }

    @NotNull
    public final ProcessData copy(@NotNull SportDay sportDay, @NotNull UserInfo userInfo, int processType, int wholeTimeSleepDetection) {
        return new ProcessData(sportDay, userInfo, processType, wholeTimeSleepDetection);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessData)) {
            return false;
        }
        ProcessData processData = (ProcessData) other;
        return Intrinsics.areEqual(this.sportDay, processData.sportDay) && Intrinsics.areEqual(this.userInfo, processData.userInfo) && this.processType == processData.processType && this.wholeTimeSleepDetection == processData.wholeTimeSleepDetection;
    }

    @Nullable
    public final byte[] getCurData() {
        return this.curData;
    }

    @Nullable
    public final byte[] getCurHrData() {
        return this.curHrData;
    }

    public final int getDaySleepDetectionStatus() {
        return this.daySleepDetectionStatus;
    }

    @Nullable
    public final ModifySleepData getModifySleepData() {
        return this.modifySleepData;
    }

    @Nullable
    public final byte[] getNextData() {
        return this.nextData;
    }

    @Nullable
    public final byte[] getPreData() {
        return this.preData;
    }

    @Nullable
    public final byte[] getPreHrData() {
        return this.preHrData;
    }

    public final int getProcessType() {
        return this.processType;
    }

    public final int getRawOffset() {
        return this.rawOffset;
    }

    @Nullable
    public final SleepFluctuationData getSleepFluctuationData() {
        return this.sleepFluctuationData;
    }

    @Nullable
    public final SleepInfo getSleepInfo() {
        return this.sleepInfo;
    }

    @NotNull
    public final SportDay getSportDay() {
        return this.sportDay;
    }

    @NotNull
    public final StepsInfo getStepInfo() {
        return this.stepInfo;
    }

    public final int getStepInterval() {
        return this.stepInterval;
    }

    @NotNull
    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    public final int getWholeTimeSleepDetection() {
        return this.wholeTimeSleepDetection;
    }

    public int hashCode() {
        SportDay sportDay = this.sportDay;
        int iHashCode = (sportDay != null ? sportDay.hashCode() : 0) * 31;
        UserInfo userInfo = this.userInfo;
        return ((((iHashCode + (userInfo != null ? userInfo.hashCode() : 0)) * 31) + this.processType) * 31) + this.wholeTimeSleepDetection;
    }

    public final void setCurData(@Nullable byte[] bArr) {
        this.curData = bArr;
    }

    public final void setCurHrData(@Nullable byte[] bArr) {
        this.curHrData = bArr;
    }

    public final void setDaySleepDetectionStatus(int i) {
        this.daySleepDetectionStatus = i;
    }

    public final void setModifySleepData(@Nullable ModifySleepData modifySleepData) {
        this.modifySleepData = modifySleepData;
    }

    public final void setNextData(@Nullable byte[] bArr) {
        this.nextData = bArr;
    }

    public final void setPreData(@Nullable byte[] bArr) {
        this.preData = bArr;
    }

    public final void setPreHrData(@Nullable byte[] bArr) {
        this.preHrData = bArr;
    }

    public final void setProcessType(int i) {
        this.processType = i;
    }

    public final void setRawOffset(int i) {
        this.rawOffset = i;
    }

    public final void setSleepFluctuationData(@Nullable SleepFluctuationData sleepFluctuationData) {
        this.sleepFluctuationData = sleepFluctuationData;
    }

    public final void setStepInterval(int i) {
        this.stepInterval = i;
    }

    public final void setWholeTimeSleepDetection(int i) {
        this.wholeTimeSleepDetection = i;
    }

    @NotNull
    public String toString() {
        return "ProcessData(sportDay=" + this.sportDay + ", userInfo=" + this.userInfo + ", processType=" + this.processType + ", wholeTimeSleepDetection=" + this.wholeTimeSleepDetection + ")";
    }

    @JvmOverloads
    public ProcessData(@NotNull SportDay sportDay, @NotNull UserInfo userInfo, int i) {
        this(sportDay, userInfo, i, 0, 8, null);
    }

    @JvmOverloads
    public ProcessData(@NotNull SportDay sportDay, @NotNull UserInfo userInfo, int i, int i2) {
        SleepInfo sleepInfo;
        this.sportDay = sportDay;
        this.userInfo = userInfo;
        this.processType = i;
        this.wholeTimeSleepDetection = i2;
        this.stepInterval = 10;
        this.daySleepDetectionStatus = 1;
        if (i == 0) {
            sleepInfo = new SleepInfo(sportDay.getTimestamp());
            if (this.wholeTimeSleepDetection == 1) {
                sleepInfo.setIs24Sleep(Boolean.TRUE);
            }
            sleepInfo.setOffset(this.rawOffset);
        } else {
            sleepInfo = null;
        }
        this.sleepInfo = sleepInfo;
        this.stepInfo = new StepsInfo(sportDay);
    }

    @JvmOverloads
    public /* synthetic */ ProcessData(SportDay sportDay, UserInfo userInfo, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(sportDay, userInfo, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
