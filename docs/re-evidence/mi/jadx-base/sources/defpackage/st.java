package defpackage;

import com.huami.proto.SportEfect;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.BleFirstbeat;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.BleFirstbeatData;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000\u001a\u0012\u0010\u0004\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\t"}, d2 = {"", "year", "month", "day", PluginDeviceInfo.FMODEL, "Lcom/huami/proto/SportEfect$SportEffectMessage;", "", "startTime", "Lcom/xiaomi/hm/health/bt/profile/smartwatch/firstbeat/BleFirstbeatData;", "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class st {

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", PluginDeviceInfo.FMODEL, "kotlin.jvm.PlatformType", PluginDeviceInfo.FDESC, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((BleFirstbeat) t).updateTime), Integer.valueOf(((BleFirstbeat) t2).updateTime));
        }
    }

    public static final int a(int i, int i2, int i3) {
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

    @NotNull
    public static final BleFirstbeatData a(@NotNull SportEfect.SportEffectMessage sportEffectMessage, long j) {
        Intrinsics.checkNotNullParameter(sportEffectMessage, "<this>");
        BleFirstbeat.Config config = new BleFirstbeat.Config();
        config.currentRunVO2Max = (short) (sportEffectMessage.getLastvalidVo2MaxFixValue() * 100);
        config.currentWalkingVO2Max = (short) 0;
        config.lastRunVO2Max = (short) 0;
        config.lastWalkingVO2Max = (short) 0;
        config.recoveryTime = sportEffectMessage.getRecoveryTime();
        config.sportFinishTime = sportEffectMessage.getSportEndUtcTime();
        ArrayList arrayList = new ArrayList();
        int size = sportEffectMessage.getHuamiSportsHistoryResultT().getYearList().size();
        for (int i = 0; i < size; i++) {
            if (sportEffectMessage.getHuamiSportsHistoryResultT().getYear(i) != 0 && sportEffectMessage.getHuamiSportsHistoryResultT().getMonth(i) != 0 && sportEffectMessage.getHuamiSportsHistoryResultT().getDay(i) != 0) {
                Integer updateTime = sportEffectMessage.getHuamiSportsHistoryResultT().getUpdateTimeHistoryList().get(i);
                if ((updateTime != null ? Long.valueOf(updateTime.intValue()) : null).longValue() >= j) {
                    int iA = a(sportEffectMessage.getHuamiSportsHistoryResultT().getYear(i), sportEffectMessage.getHuamiSportsHistoryResultT().getMonth(i), sportEffectMessage.getHuamiSportsHistoryResultT().getDay(i));
                    Float f = sportEffectMessage.getHuamiSportsHistoryResultT().getTrainingLoadWeeklyHistoryList().get(i);
                    Integer num = sportEffectMessage.getHuamiSportsHistoryResultT().getTrainingLoadWeeklyOptimalMaxHistoryList().get(i);
                    Integer num2 = sportEffectMessage.getHuamiSportsHistoryResultT().getTrainingLoadWeeklyOptimalMinHistoryList().get(i);
                    Integer num3 = sportEffectMessage.getHuamiSportsHistoryResultT().getTrainingLoadWeeklyOptimalOverreachingHistoryList().get(i);
                    Float f2 = sportEffectMessage.getHuamiSportsHistoryResultT().getTrainingLoadPeakList().get(i);
                    Float vo2MaxRun = sportEffectMessage.getHuamiSportsHistoryResultT().getVO2MaxHistoryList().get(i);
                    BleFirstbeat bleFirstbeat = new BleFirstbeat();
                    bleFirstbeat.dayId = (short) iA;
                    bleFirstbeat.weeklyTLSum = (short) f.floatValue();
                    bleFirstbeat.weeklyTLSumOptimalMax = (short) num.intValue();
                    bleFirstbeat.weeklyTLSumOptimalMin = (short) num2.intValue();
                    bleFirstbeat.weeklyTLSumOverreaching = (short) num3.intValue();
                    bleFirstbeat.currentDayTL = (short) f2.floatValue();
                    Intrinsics.checkNotNullExpressionValue(vo2MaxRun, "vo2MaxRun");
                    bleFirstbeat.sportVO2Max = (short) (100 * vo2MaxRun.floatValue());
                    bleFirstbeat.walkVO2Max = (short) 0;
                    Intrinsics.checkNotNullExpressionValue(updateTime, "updateTime");
                    bleFirstbeat.updateTime = updateTime.intValue();
                    arrayList.add(bleFirstbeat);
                }
            }
        }
        if (arrayList.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new a());
        }
        BleFirstbeatData bleFirstbeatData = new BleFirstbeatData();
        bleFirstbeatData.firstbeatConfig = config;
        bleFirstbeatData.firstbeatList = arrayList;
        return bleFirstbeatData;
    }
}
