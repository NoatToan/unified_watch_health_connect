package com.xiaomi.hm.health.running.calori.source;

import com.huami.sport.service.model.HistoryRecord;
import com.xiaomi.hm.health.running.EnergyDataProvider;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/running/calori/source/ICalorieMediator;", "", "", "startTime", "endTime", "", "getSumCalori", "", "Lcom/xiaomi/hm/health/running/EnergyDataProvider$EnergyData;", "getDistinctStep", "Lcom/huami/sport/service/model/HistoryRecord;", "getDistinctAppSport", "Lcom/xiaomi/hm/health/running/calori/source/ICalorieColleague;", "a", "Lcom/xiaomi/hm/health/running/calori/source/ICalorieColleague;", "getMAppCalorieColleague", "()Lcom/xiaomi/hm/health/running/calori/source/ICalorieColleague;", "setMAppCalorieColleague", "(Lcom/xiaomi/hm/health/running/calori/source/ICalorieColleague;)V", "mAppCalorieColleague", "Lcom/xiaomi/hm/health/running/calori/source/DeviceCalorieColleague;", "b", "Lcom/xiaomi/hm/health/running/calori/source/DeviceCalorieColleague;", "getMDeviceCalorieColleague", "()Lcom/xiaomi/hm/health/running/calori/source/DeviceCalorieColleague;", "setMDeviceCalorieColleague", "(Lcom/xiaomi/hm/health/running/calori/source/DeviceCalorieColleague;)V", "mDeviceCalorieColleague", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public abstract class ICalorieMediator {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private ICalorieColleague mAppCalorieColleague;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private DeviceCalorieColleague mDeviceCalorieColleague;

    @NotNull
    public abstract List<HistoryRecord> getDistinctAppSport(long startTime, long endTime);

    @NotNull
    public abstract List<EnergyDataProvider.EnergyData> getDistinctStep(long startTime, long endTime);

    @Nullable
    public final ICalorieColleague getMAppCalorieColleague() {
        return this.mAppCalorieColleague;
    }

    @Nullable
    public final DeviceCalorieColleague getMDeviceCalorieColleague() {
        return this.mDeviceCalorieColleague;
    }

    public abstract int getSumCalori(long startTime, long endTime);

    public final void setMAppCalorieColleague(@Nullable ICalorieColleague iCalorieColleague) {
        this.mAppCalorieColleague = iCalorieColleague;
    }

    public final void setMDeviceCalorieColleague(@Nullable DeviceCalorieColleague deviceCalorieColleague) {
        this.mDeviceCalorieColleague = deviceCalorieColleague;
    }
}
