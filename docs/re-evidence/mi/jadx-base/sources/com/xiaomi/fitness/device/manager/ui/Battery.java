package com.xiaomi.fitness.device.manager.ui;

import com.miui.circulate.device.api.Column;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001b\u001a\u00020\u0005R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ui/Battery;", "", "<init>", "()V", Column.BATTERY, "", "getBattery", "()I", "setBattery", "(I)V", "CHARGE_NONE", "getCHARGE_NONE", "CHARGE_ERROR", "getCHARGE_ERROR", "lastCharge", "Ljava/util/Calendar;", "getLastCharge", "()Ljava/util/Calendar;", "setLastCharge", "(Ljava/util/Calendar;)V", "isCharging", "", "()Z", "setCharging", "(Z)V", "isChargeFull", "setChargeFull", "getLastChargeDays", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class Battery {
    private boolean isChargeFull;
    private boolean isCharging;

    @Nullable
    private Calendar lastCharge;
    private int battery = -1;
    private final int CHARGE_NONE = -1;
    private final int CHARGE_ERROR = -2;

    public final int getBattery() {
        return this.battery;
    }

    public final int getCHARGE_ERROR() {
        return this.CHARGE_ERROR;
    }

    public final int getCHARGE_NONE() {
        return this.CHARGE_NONE;
    }

    @Nullable
    public final Calendar getLastCharge() {
        return this.lastCharge;
    }

    public final int getLastChargeDays() {
        Calendar calendar = this.lastCharge;
        if (calendar != null) {
            Intrinsics.checkNotNull(calendar);
            if (calendar.getTimeInMillis() != 0) {
                Calendar calendar2 = this.lastCharge;
                Intrinsics.checkNotNull(calendar2);
                if (calendar2.get(1) == 1970) {
                    return this.CHARGE_ERROR;
                }
                int timeInMillis = ((int) Calendar.getInstance().getTimeInMillis()) / 86400000;
                Calendar calendar3 = this.lastCharge;
                Intrinsics.checkNotNull(calendar3);
                int timeInMillis2 = timeInMillis - (((int) calendar3.getTimeInMillis()) / 86400000);
                return timeInMillis2 < 0 ? this.CHARGE_ERROR : timeInMillis2;
            }
        }
        return this.CHARGE_NONE;
    }

    /* JADX INFO: renamed from: isChargeFull, reason: from getter */
    public final boolean getIsChargeFull() {
        return this.isChargeFull;
    }

    /* JADX INFO: renamed from: isCharging, reason: from getter */
    public final boolean getIsCharging() {
        return this.isCharging;
    }

    public final void setBattery(int i) {
        this.battery = i;
    }

    public final void setChargeFull(boolean z) {
        this.isChargeFull = z;
    }

    public final void setCharging(boolean z) {
        this.isCharging = z;
    }

    public final void setLastCharge(@Nullable Calendar calendar) {
        this.lastCharge = calendar;
    }
}
