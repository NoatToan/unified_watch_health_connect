package com.xiaomi.fitness.sport_manager.state.device;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/state/device/DeviceSportStateRecord;", "", "<init>", "()V", "deviceSportState", "", "refreshDeviceSportState", "", "sportState", "getDeviceSportState", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceSportStateRecord {

    @NotNull
    public static final DeviceSportStateRecord INSTANCE = new DeviceSportStateRecord();
    private static int deviceSportState;

    private DeviceSportStateRecord() {
    }

    public final int getDeviceSportState() {
        return deviceSportState;
    }

    public final void refreshDeviceSportState(int sportState) {
        deviceSportState = sportState;
    }
}
