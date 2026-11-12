package com.xiaomi.fitness.stand.export;

import com.xiaomi.fitness.statistics.StatConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/stand/export/NotSupportStandDetect;", "Lcom/xiaomi/fitness/stand/export/StandDetectManager;", "<init>", "()V", "setStandDetectEnable", "", "enable", "", "getStandDetectEnabled", "setStandReminderEnable", "getStandReminderEnable", "setRemindTime", StatConstants.PARAM_START, "", StatConstants.PARAM_END, "getRemindTime", "", "setStandDetectNapEnable", "getStandDetectNapEnable", "setStandDetectNapTime", "getStandDetectNapTime", "supportStandDetect", "checkStandAndRecordIfDone", "startTime", "", "stand-detect-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NotSupportStandDetect implements StandDetectManager {
    @Override // com.xiaomi.fitness.stand.export.StandDetectManager
    public boolean checkStandAndRecordIfDone(long startTime) {
        return false;
    }

    @Override // com.xiaomi.fitness.stand.export.StandDetectManager
    @NotNull
    public int[] getRemindTime() {
        return new int[0];
    }

    @Override // com.xiaomi.fitness.stand.export.StandDetectManager
    public boolean getStandDetectEnabled() {
        return false;
    }

    @Override // com.xiaomi.fitness.stand.export.StandDetectManager
    public boolean getStandDetectNapEnable() {
        return false;
    }

    @Override // com.xiaomi.fitness.stand.export.StandDetectManager
    @NotNull
    public int[] getStandDetectNapTime() {
        return new int[0];
    }

    @Override // com.xiaomi.fitness.stand.export.StandDetectManager
    public boolean getStandReminderEnable() {
        return false;
    }

    @Override // com.xiaomi.fitness.stand.export.StandDetectManager
    public void setRemindTime(int start, int end) {
    }

    @Override // com.xiaomi.fitness.stand.export.StandDetectManager
    public void setStandDetectEnable(boolean enable) {
    }

    @Override // com.xiaomi.fitness.stand.export.StandDetectManager
    public void setStandDetectNapEnable(boolean enable) {
    }

    @Override // com.xiaomi.fitness.stand.export.StandDetectManager
    public void setStandDetectNapTime(int start, int end) {
    }

    @Override // com.xiaomi.fitness.stand.export.StandDetectManager
    public void setStandReminderEnable(boolean enable) {
    }

    @Override // com.xiaomi.fitness.stand.export.StandDetectManager
    public boolean supportStandDetect() {
        return false;
    }
}
