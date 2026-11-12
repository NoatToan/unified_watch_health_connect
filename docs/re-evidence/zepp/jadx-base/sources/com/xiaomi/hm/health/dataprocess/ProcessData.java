package com.xiaomi.hm.health.dataprocess;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006¢\u0006\u0004\bU\u0010VJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\"\u0010!\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001c\"\u0004\b#\u0010\u001eR\"\u0010$\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR\u001b\u0010(\u001a\u0004\u0018\u00010'8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010-\u001a\u00020,8\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R$\u00102\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u00109\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010@\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010F\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010A\u001a\u0004\bG\u0010C\"\u0004\bH\u0010ER$\u0010I\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010A\u001a\u0004\bJ\u0010C\"\u0004\bK\u0010ER$\u0010L\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010A\u001a\u0004\bM\u0010C\"\u0004\bN\u0010ER$\u0010O\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010A\u001a\u0004\bP\u0010C\"\u0004\bQ\u0010ER\"\u0010R\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010\u001a\u001a\u0004\bS\u0010\u001c\"\u0004\bT\u0010\u001e¨\u0006W"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/ProcessData;", "", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "component1", "Lcom/xiaomi/hm/health/dataprocess/UserInfo;", "component2", "", "component3", "component4", "sportDay", "userInfo", "processType", "wholeTimeSleepDetection", "copy", "", "toString", "hashCode", "other", "", "equals", "Lcom/xiaomi/hm/health/dataprocess/SportDay;", "getSportDay", "()Lcom/xiaomi/hm/health/dataprocess/SportDay;", "Lcom/xiaomi/hm/health/dataprocess/UserInfo;", "getUserInfo", "()Lcom/xiaomi/hm/health/dataprocess/UserInfo;", LogUtil.I, "getProcessType", "()I", "setProcessType", "(I)V", "getWholeTimeSleepDetection", "setWholeTimeSleepDetection", "stepInterval", "getStepInterval", "setStepInterval", "daySleepDetectionStatus", "getDaySleepDetectionStatus", "setDaySleepDetectionStatus", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "sleepInfo", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "getSleepInfo", "()Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "Lcom/xiaomi/hm/health/dataprocess/StepsInfo;", "stepInfo", "Lcom/xiaomi/hm/health/dataprocess/StepsInfo;", "getStepInfo", "()Lcom/xiaomi/hm/health/dataprocess/StepsInfo;", "Lcom/xiaomi/hm/health/dataprocess/ModifySleepData;", "modifySleepData", "Lcom/xiaomi/hm/health/dataprocess/ModifySleepData;", "getModifySleepData", "()Lcom/xiaomi/hm/health/dataprocess/ModifySleepData;", "setModifySleepData", "(Lcom/xiaomi/hm/health/dataprocess/ModifySleepData;)V", "Lcom/xiaomi/hm/health/dataprocess/SleepFluctuationData;", "sleepFluctuationData", "Lcom/xiaomi/hm/health/dataprocess/SleepFluctuationData;", "getSleepFluctuationData", "()Lcom/xiaomi/hm/health/dataprocess/SleepFluctuationData;", "setSleepFluctuationData", "(Lcom/xiaomi/hm/health/dataprocess/SleepFluctuationData;)V", "", "curData", "[B", "getCurData", "()[B", "setCurData", "([B)V", "curHrData", "getCurHrData", "setCurHrData", "preData", "getPreData", "setPreData", "preHrData", "getPreHrData", "setPreHrData", "nextData", "getNextData", "setNextData", "rawOffset", "getRawOffset", "setRawOffset", "<init>", "(Lcom/xiaomi/hm/health/dataprocess/SportDay;Lcom/xiaomi/hm/health/dataprocess/UserInfo;II)V", "dataprocess_release"}, k = 1, mv = {1, 5, 1})
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
            if (getWholeTimeSleepDetection() == 1) {
                sleepInfo.setIs24Sleep(Boolean.TRUE);
            }
            sleepInfo.setOffset(getRawOffset());
            Unit unit = Unit.INSTANCE;
        } else {
            sleepInfo = null;
        }
        this.sleepInfo = sleepInfo;
        this.stepInfo = new StepsInfo(sportDay);
    }

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
        return (((((this.sportDay.hashCode() * 31) + this.userInfo.hashCode()) * 31) + this.processType) * 31) + this.wholeTimeSleepDetection;
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

    public /* synthetic */ ProcessData(SportDay sportDay, UserInfo userInfo, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(sportDay, userInfo, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
