package com.xiaomi.hm.health.device.feature.sync.job.mili;

import com.huami.proto.SportEfect;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.BleFirstbeat;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.BleFirstbeatData;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.g;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0012\u0010\t\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\n"}, d2 = {"", "year", "month", "day", "dayIdFromUnixTime", "Lcom/huami/proto/SportEfect$SportEffectMessage;", "", "startTime", "Lcom/xiaomi/hm/health/bt/profile/smartwatch/firstbeat/BleFirstbeatData;", "convertToBleFirstbeatData", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class SportsEffectJobKt {
    @NotNull
    public static final BleFirstbeatData convertToBleFirstbeatData(@NotNull SportEfect.SportEffectMessage sportEffectMessage, long j) {
        BleFirstbeat.Config config = new BleFirstbeat.Config();
        config.currentRunVO2Max = (short) (sportEffectMessage.getLastvalidVo2MaxFixValue() * 100);
        config.currentWalkingVO2Max = (short) 0;
        config.lastRunVO2Max = (short) 0;
        config.lastWalkingVO2Max = (short) 0;
        config.recoveryTime = sportEffectMessage.getRecoveryTime();
        config.sportFinishTime = sportEffectMessage.getSportEndUtcTime();
        ArrayList arrayList = new ArrayList();
        int size = sportEffectMessage.getHuamiSportsHistoryResultT().getYearList().size();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (sportEffectMessage.getHuamiSportsHistoryResultT().getYear(i) != 0 && sportEffectMessage.getHuamiSportsHistoryResultT().getMonth(i) != 0 && sportEffectMessage.getHuamiSportsHistoryResultT().getDay(i) != 0) {
                    Integer num = sportEffectMessage.getHuamiSportsHistoryResultT().getUpdateTimeHistoryList().get(i);
                    if ((num == null ? null : Long.valueOf(num.intValue())).longValue() >= j) {
                        int iDayIdFromUnixTime = dayIdFromUnixTime(sportEffectMessage.getHuamiSportsHistoryResultT().getYear(i), sportEffectMessage.getHuamiSportsHistoryResultT().getMonth(i), sportEffectMessage.getHuamiSportsHistoryResultT().getDay(i));
                        Float f = sportEffectMessage.getHuamiSportsHistoryResultT().getTrainingLoadWeeklyHistoryList().get(i);
                        Integer num2 = sportEffectMessage.getHuamiSportsHistoryResultT().getTrainingLoadWeeklyOptimalMaxHistoryList().get(i);
                        Integer num3 = sportEffectMessage.getHuamiSportsHistoryResultT().getTrainingLoadWeeklyOptimalMinHistoryList().get(i);
                        Integer num4 = sportEffectMessage.getHuamiSportsHistoryResultT().getTrainingLoadWeeklyOptimalOverreachingHistoryList().get(i);
                        Float f2 = sportEffectMessage.getHuamiSportsHistoryResultT().getTrainingLoadPeakList().get(i);
                        Float f3 = sportEffectMessage.getHuamiSportsHistoryResultT().getVO2MaxHistoryList().get(i);
                        BleFirstbeat bleFirstbeat = new BleFirstbeat();
                        bleFirstbeat.dayId = (short) iDayIdFromUnixTime;
                        bleFirstbeat.weeklyTLSum = (short) f.floatValue();
                        bleFirstbeat.weeklyTLSumOptimalMax = (short) num2.intValue();
                        bleFirstbeat.weeklyTLSumOptimalMin = (short) num3.intValue();
                        bleFirstbeat.weeklyTLSumOverreaching = (short) num4.intValue();
                        bleFirstbeat.currentDayTL = (short) f2.floatValue();
                        bleFirstbeat.sportVO2Max = (short) (100 * f3.floatValue());
                        bleFirstbeat.walkVO2Max = (short) 0;
                        bleFirstbeat.updateTime = num.intValue();
                        Unit unit = Unit.INSTANCE;
                        arrayList.add(bleFirstbeat);
                    }
                }
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        if (arrayList.size() > 1) {
            g.sortWith(arrayList, new Comparator() { // from class: com.xiaomi.hm.health.device.feature.sync.job.mili.SportsEffectJobKt$convertToBleFirstbeatData$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((BleFirstbeat) t).updateTime), Integer.valueOf(((BleFirstbeat) t2).updateTime));
                }
            });
        }
        BleFirstbeatData bleFirstbeatData = new BleFirstbeatData();
        bleFirstbeatData.firstbeatConfig = config;
        bleFirstbeatData.firstbeatList = arrayList;
        return bleFirstbeatData;
    }

    public static final int dayIdFromUnixTime(int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(0L);
        calendar.set(i, i2 - 1, i3, 0, 0, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(0L);
        calendar2.set(1970, 0, 1, 0, 0, 0);
        int timeInMillis = (int) ((calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / ((long) 86400000));
        calendar2.add(6, timeInMillis);
        while (true) {
            if (calendar.getTime().compareTo(calendar2.getTime()) > 0) {
                timeInMillis++;
                calendar2.add(6, 1);
            } else {
                if (calendar.getTime().compareTo(calendar2.getTime()) >= 0) {
                    return timeInMillis;
                }
                timeInMillis--;
                calendar2.add(6, -1);
            }
        }
    }
}
