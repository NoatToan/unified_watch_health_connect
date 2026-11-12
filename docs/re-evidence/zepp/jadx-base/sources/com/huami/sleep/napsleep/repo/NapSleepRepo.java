package com.huami.sleep.napsleep.repo;

import android.content.Context;
import androidx.p008lifecycle.LiveData;
import com.huami.chart.data.ChartDataList;
import com.huami.sleep.datasource.ISleepDayDataSource;
import com.huami.sleep.daysleep.daydetail.vo.SleepShowData;
import com.huami.sleep.daysleep.sleepstagechart.util.TransModelToChartUtil;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepStageDurationInfo;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.model.ChartSleep;
import com.huami.sleep.napsleep.vo.NapSleepRecordItem;
import com.huami.sleep.util.SleepDataUtil;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.StageSleep;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0010\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\tJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u0006R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/huami/sleep/napsleep/repo/NapSleepRepo;", "", "", "userId", "date", "Landroidx/lifecycle/LiveData;", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "getSleepInfoLiveData", "sleepInfo", "Lcom/huami/sleep/daysleep/daydetail/vo/SleepShowData;", "sleepShowData", "data", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepStageDurationInfo;", "sleepDurationParam", "", "Lcom/huami/sleep/napsleep/vo/NapSleepRecordItem;", "sleepRecord", "Lcom/huami/chart/data/ChartDataList;", "daySleepChartDataList", "Lcom/huami/sleep/datasource/ISleepDayDataSource;", "a", "Lcom/huami/sleep/datasource/ISleepDayDataSource;", ParamKey.dataSource, "<init>", "(Lcom/huami/sleep/datasource/ISleepDayDataSource;)V", "Companion", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class NapSleepRepo {
    private static final int b = 60;
    private static final int c = 60;

    @NotNull
    private static final String d = "NapSleepRepo";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ISleepDayDataSource dataSource;

    public NapSleepRepo(@NotNull ISleepDayDataSource iSleepDayDataSource) {
        this.dataSource = iSleepDayDataSource;
    }

    @Nullable
    public final ChartDataList daySleepChartDataList(@Nullable SleepInfo sleepInfo) {
        if (sleepInfo == null) {
            return null;
        }
        return TransModelToChartUtil.getInstance().getSleepChart(KoinExtKt.getAppContext(), new ChartSleep(sleepInfo, ChartSleep.Style.DETAILVIEW, true));
    }

    @NotNull
    public final LiveData<SleepInfo> getSleepInfoLiveData(@NotNull String userId, @NotNull String date) {
        return this.dataSource.getSleepInfo(userId, date);
    }

    @NotNull
    public final SleepStageDurationInfo sleepDurationParam(@NotNull SleepShowData data) {
        return new SleepStageDurationInfo(data.getDurationMin() + (data.getDurationHour() * 60), data.getDeepDurationMin() + (data.getDeepDurationHour() * 60), data.getLightDurationMin() + (data.getLightDurationHour() * 60), data.getAwakeDuration(), data.getDreamTime(), false);
    }

    @NotNull
    public final List<NapSleepRecordItem> sleepRecord(@Nullable SleepInfo sleepInfo) {
        StageSleep stageSleep;
        StageSleep stageSleep2;
        ArrayList<StageSleep> oddStageSleep;
        Context appContext = KoinExtKt.getAppContext();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        int i = 0;
        if (sleepInfo != null && (oddStageSleep = sleepInfo.getOddStageSleep()) != null) {
            arrayList2 = new ArrayList();
            for (Object obj : oddStageSleep) {
                if (!(((StageSleep) obj).mode == 7)) {
                    arrayList2.add(obj);
                }
            }
        }
        int i2 = (arrayList2 == null || (stageSleep = (StageSleep) CollectionsKt.firstOrNull((List) arrayList2)) == null) ? 0 : stageSleep.start;
        int i3 = (arrayList2 == null || (stageSleep2 = (StageSleep) CollectionsKt.firstOrNull((List) arrayList2)) == null) ? 0 : stageSleep2.stop;
        int i4 = (i3 - i2) + 1;
        int size = arrayList2 == null ? 0 : arrayList2.size();
        if (arrayList2 != null) {
            for (Object obj2 : arrayList2) {
                int i5 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                StageSleep stageSleep3 = (StageSleep) obj2;
                if (i > 0) {
                    int i6 = stageSleep3.start;
                    if (i6 - i3 > 60) {
                        arrayList.add(new NapSleepRecordItem(TimeUtils.formatTime(appContext, i2), TimeUtils.formatTime(appContext, i3), i4));
                        i2 = stageSleep3.start;
                        i4 = (stageSleep3.stop - i2) + 1;
                    } else {
                        i4 += (stageSleep3.stop - i6) + 1;
                    }
                }
                i3 = stageSleep3.stop;
                if (i == size - 1) {
                    arrayList.add(new NapSleepRecordItem(TimeUtils.formatTime(appContext, i2), TimeUtils.formatTime(appContext, i3), i4));
                }
                i = i5;
            }
        }
        return arrayList;
    }

    @NotNull
    public final SleepShowData sleepShowData(@Nullable SleepInfo sleepInfo) {
        return SleepDataUtil.INSTANCE.parse2Nap(sleepInfo);
    }
}
