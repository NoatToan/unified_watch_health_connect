package com.huami.sleep.daysleep.sleepstagechart.repo;

import android.content.Context;
import android.util.SparseArray;
import androidx.p008lifecycle.LiveData;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.data.ChartDataList;
import com.huami.sleep.R;
import com.huami.sleep.datasource.ISleepDayDataSource;
import com.huami.sleep.daysleep.daydetail.repo.IHeartRateRepo;
import com.huami.sleep.daysleep.daydetail.vo.SleepShowData;
import com.huami.sleep.daysleep.sleepstagechart.helper.WholeDayHeartRateHelper;
import com.huami.sleep.daysleep.sleepstagechart.util.TransModelToChartUtil;
import com.huami.sleep.daysleep.sleepstagechart.vo.SelectTip;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepStageDurationInfo;
import com.huami.sleep.ext.KoinExtKt;
import com.huami.sleep.model.ChartSleep;
import com.huami.sleep.service.bean.SleepDataWithMode;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.dto.TimeParam;
import com.huami.sleep.util.ChartTransmitUtil;
import com.huami.sleep.util.SleepDataUtil;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.sleep.util.TimeShowUtilsKt;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import com.xiaomi.hm.health.dataprocess.StageSleep;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u00100\u001a\u00020.\u0012\u0006\u00103\u001a\u000201¢\u0006\u0004\b6\u00107J0\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J \u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\tH\u0002J(\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tH\u0002J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002J \u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010!\u001a\u00020 2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001e\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0$2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010'\u001a\u00020&2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J \u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010$2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J$\u0010)\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J3\u0010,\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b,\u0010-R\u0016\u00100\u001a\u00020.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010/R\u0016\u00103\u001a\u0002018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00102R\u0016\u00105\u001a\u00020\t8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u00104\u0082\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/repo/DaySleepStageRepo;", "Lcom/huami/sleep/daysleep/sleepstagechart/repo/IDaySleepStageRepo;", "", "Lcom/xiaomi/hm/health/dataprocess/StageSleep;", "napStage", "", "baseTime", "Lkotlin/Triple;", "Ljava/util/Date;", "", "a", "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "sleepInfo", "index", "", "date", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SelectTip;", "g", "mode", "h", "stageInfo", "e", "f", "c", "b", "userId", "today", "beforeDay", "", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/LiveData;", "getSleepInfo", "Lcom/huami/chart/data/ChartDataList;", "getStageSleepChartData", "Lcom/huami/sleep/service/bean/SleepDataWithMode;", "getStageSleepChartDataWithMode", "Lkotlin/Pair;", "getStartEndTime", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepStageDurationInfo;", "getStageDurInfo", "getSleepStartEndIndex", "getSleepSelectTipInfo", "startMin", "endMin", "loadheartRateData", "(Ljava/lang/String;Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/sleep/datasource/ISleepDayDataSource;", "Lcom/huami/sleep/datasource/ISleepDayDataSource;", "sleepDataSource", "Lcom/huami/sleep/daysleep/daydetail/repo/IHeartRateRepo;", "Lcom/huami/sleep/daysleep/daydetail/repo/IHeartRateRepo;", "heartRateRepo", LogUtil.I, "mAllDayMin", "<init>", "(Lcom/huami/sleep/datasource/ISleepDayDataSource;Lcom/huami/sleep/daysleep/daydetail/repo/IHeartRateRepo;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class DaySleepStageRepo implements IDaySleepStageRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ISleepDayDataSource sleepDataSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IHeartRateRepo heartRateRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int mAllDayMin = 1440;

    public DaySleepStageRepo(@NotNull ISleepDayDataSource iSleepDayDataSource, @NotNull IHeartRateRepo iHeartRateRepo) {
        this.sleepDataSource = iSleepDayDataSource;
        this.heartRateRepo = iHeartRateRepo;
    }

    private final Triple<Date, Date, Integer> a(List<? extends StageSleep> napStage, long baseTime) {
        int i;
        int iMax;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = napStage.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if ((((StageSleep) next).mode == 7 ? 1 : 0) == 0) {
                arrayList.add(next);
            }
        }
        int i2 = -1;
        int i3 = -1;
        for (Object obj : arrayList) {
            int i4 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            StageSleep stageSleep = (StageSleep) obj;
            if (i2 == -1 && i3 == -1) {
                i2 = stageSleep.start;
                iMax = stageSleep.stop;
            } else {
                iMax = Math.max(i3, stageSleep.stop);
            }
            i3 = iMax;
            i = i4;
        }
        ChartTransmitUtil chartTransmitUtil = ChartTransmitUtil.INSTANCE;
        return new Triple<>(new Date(chartTransmitUtil.transmitIndexToDateTime(i2, baseTime)), new Date(chartTransmitUtil.transmitIndexToDateTime(i3, baseTime)), Integer.valueOf((i3 - i2) + 1));
    }

    private final String b(String date) {
        SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
        return sleepTimeUtil.getTimeToUi(new TimeParam(TimeMode.DAY, sleepTimeUtil.timeStrToDate(date).getTime()));
    }

    private final String c(String date) {
        SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
        return sleepTimeUtil.formatDateTimeForMD(sleepTimeUtil.timeStrToDate(date).getTime());
    }

    private final byte[] d(String userId, String today, String beforeDay) {
        byte[] bArrQueryMiliDateHr = this.heartRateRepo.queryMiliDateHr(userId, today);
        byte[] bArrQueryMiliDateHr2 = this.heartRateRepo.queryMiliDateHr(userId, beforeDay);
        byte[] bArr = new byte[2880];
        ArraysKt___ArraysJvmKt.copyInto$default(bArrQueryMiliDateHr2, bArr, 0, 0, 0, 8, (Object) null);
        ArraysKt___ArraysJvmKt.copyInto$default(bArrQueryMiliDateHr, bArr, 1440, 0, 0, 8, (Object) null);
        return bArr;
    }

    private final SelectTip e(StageSleep stageInfo, String date, SleepInfo sleepInfo, int index) {
        StringBuilder sb;
        int i;
        int i2;
        String strH = h(stageInfo.mode);
        int i3 = stageInfo.start;
        if (i3 < this.mAllDayMin) {
            Calendar calendar = Calendar.getInstance(Locale.getDefault());
            calendar.setTime(SleepTimeUtil.INSTANCE.timeStrToDate(date));
            Unit unit = Unit.INSTANCE;
            sb = new StringBuilder(c(new SportDay(calendar).getPreDay().toString()) + " ");
        } else {
            sb = new StringBuilder(c(date) + " ");
        }
        sb.append(TimeUtils.formatTime(KoinExtKt.getAppContext(), stageInfo.start));
        sb.append(" - ");
        if (sleepInfo.isUsrEditSlpEnd()) {
            if (index != sleepInfo.getStageSleep().size() - 1 || stageInfo.mode == 9) {
                i2 = stageInfo.stop;
            } else {
                i = stageInfo.stop;
                i2 = i + 1;
            }
        } else if (index != sleepInfo.getStageSleep().size() - 1) {
            i2 = stageInfo.stop;
        } else {
            i = stageInfo.stop;
            i2 = i + 1;
        }
        int i4 = sleepInfo.getStageSleep().size() == 1 ? i2 - i3 : (i2 - i3) + 1;
        int i5 = this.mAllDayMin;
        if (i3 <= i5 && i5 < i2) {
            sb.append(c(date) + " ");
        }
        sb.append(TimeUtils.formatTime(KoinExtKt.getAppContext(), i2));
        return new SelectTip(strH, TimeShowUtilsKt.getDurationStr$default(i4, KoinExtKt.getAppContext(), false, false, 6, null), sb.toString());
    }

    private final SelectTip f(StageSleep stageInfo) {
        return new SelectTip(h(stageInfo.mode), TimeShowUtilsKt.getDurationStr$default((stageInfo.stop - stageInfo.start) + 1, KoinExtKt.getAppContext(), false, false, 6, null), TimeUtils.formatTime(KoinExtKt.getAppContext(), stageInfo.start) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + TimeUtils.formatTime(KoinExtKt.getAppContext(), stageInfo.stop));
    }

    private final SelectTip g(SleepInfo sleepInfo, int index, String date) {
        StageSleep stageSleep = sleepInfo.getHasSleep() ? sleepInfo.getStageSleep().get(index) : sleepInfo.getOddStageSleep().get(index);
        return sleepInfo.getHasSleep() ? e(stageSleep, date, sleepInfo, index) : f(stageSleep);
    }

    private final String h(int mode) {
        if (mode == 3) {
            return KoinExtKt.getAppContext().getString(R.string.sleep_subview_no_wear);
        }
        if (mode == 4) {
            return KoinExtKt.getAppContext().getString(R.string.sleep_sign_light_sleep);
        }
        if (mode == 5) {
            return KoinExtKt.getAppContext().getString(R.string.sleep_sign_deep_sleep);
        }
        if (mode != 7) {
            return mode != 8 ? KoinExtKt.getAppContext().getString(R.string.sleep_tip_edit) : KoinExtKt.getAppContext().getString(R.string.sleep_subview_rem_sleep);
        }
        return KoinExtKt.getAppContext().getString(R.string.sleep_subview_awake_sleep);
    }

    @Override // com.huami.sleep.daysleep.sleepstagechart.repo.IDaySleepStageRepo
    @NotNull
    public LiveData<SleepInfo> getSleepInfo(@NotNull String userId, @NotNull String date) {
        return this.sleepDataSource.getSleepInfo(userId, date);
    }

    @Override // com.huami.sleep.daysleep.sleepstagechart.repo.IDaySleepStageRepo
    @Nullable
    public SelectTip getSleepSelectTipInfo(int index, @NotNull String date, @Nullable SleepInfo sleepInfo) {
        SleepShowData sleepShowData;
        String string;
        if (sleepInfo == null) {
            return null;
        }
        if (index != -1) {
            return g(sleepInfo, index, date);
        }
        if (sleepInfo.getHasSleep()) {
            sleepShowData = SleepDataUtil.INSTANCE.parse2Sleep(sleepInfo);
            string = KoinExtKt.getAppContext().getString(R.string.night_sleep);
        } else {
            sleepShowData = SleepDataUtil.INSTANCE.parse2Nap(sleepInfo);
            string = KoinExtKt.getAppContext().getString(R.string.sporadic_sleep);
        }
        return new SelectTip(string, TimeShowUtilsKt.getDurationStr$default(sleepShowData.getDuration(), KoinExtKt.getAppContext(), false, false, 6, null), b(date));
    }

    @Override // com.huami.sleep.daysleep.sleepstagechart.repo.IDaySleepStageRepo
    @Nullable
    public Pair<Integer, Integer> getSleepStartEndIndex(@Nullable SleepInfo sleepInfo) {
        if (sleepInfo != null && sleepInfo.getHasSleep()) {
            return new Pair<>(Integer.valueOf(sleepInfo.isUsrEditSlpStart() ? sleepInfo.getuStartIdx() : sleepInfo.getStartIdx()), Integer.valueOf(sleepInfo.isUsrEditSlpEnd() ? sleepInfo.getuStopIdx() : sleepInfo.getStopIdx()));
        }
        return null;
    }

    @Override // com.huami.sleep.daysleep.sleepstagechart.repo.IDaySleepStageRepo
    @NotNull
    public SleepStageDurationInfo getStageDurInfo(@Nullable SleepInfo sleepInfo) {
        SleepShowData sleepShowData = SleepDataUtil.INSTANCE.parse2Sleep(sleepInfo);
        return new SleepStageDurationInfo(sleepShowData.getDuration(), sleepShowData.getDeepDuration(), sleepShowData.getLightDuration(), sleepShowData.getAwakeDuration(), sleepShowData.getDreamTime(), sleepShowData.isRemSupported());
    }

    @Override // com.huami.sleep.daysleep.sleepstagechart.repo.IDaySleepStageRepo
    @NotNull
    public ChartDataList getStageSleepChartData(@Nullable SleepInfo sleepInfo) {
        ChartDataList sleepChart;
        if (sleepInfo == null) {
            sleepChart = null;
        } else if (sleepInfo.getHasSleep()) {
            sleepChart = TransModelToChartUtil.getInstance().getSleepChart(KoinExtKt.getAppContext(), new ChartSleep(sleepInfo));
        } else {
            sleepChart = TransModelToChartUtil.getInstance().getSleepChart(KoinExtKt.getAppContext(), new ChartSleep(sleepInfo, ChartSleep.Style.DETAILVIEW, true));
        }
        return sleepChart == null ? new ChartDataList(new SparseArray()) : sleepChart;
    }

    @Override // com.huami.sleep.daysleep.sleepstagechart.repo.IDaySleepStageRepo
    @Nullable
    public List<SleepDataWithMode> getStageSleepChartDataWithMode(@Nullable SleepInfo sleepInfo) {
        if (sleepInfo == null) {
            return null;
        }
        return ChartTransmitUtil.fetchMainSleepChartDataWithMode$default(ChartTransmitUtil.INSTANCE, sleepInfo.getStageSleep(), 0.0f, 0.0f, 6, null);
    }

    @Override // com.huami.sleep.daysleep.sleepstagechart.repo.IDaySleepStageRepo
    @NotNull
    public Pair<String, String> getStartEndTime(@Nullable SleepInfo sleepInfo) {
        String time;
        Date first;
        String time2;
        Date second;
        String time3 = null;
        Triple<Date, Date, Integer> tripleA = sleepInfo == null ? null : a(sleepInfo.getOddStageSleep(), sleepInfo.getSportDay().getTimestamp());
        if (sleepInfo == null) {
            time = null;
        } else if (sleepInfo.getHasSleep()) {
            time = TimeUtils.formatTime(KoinExtKt.getAppContext(), sleepInfo.getStartDate());
        } else {
            Context appContext = KoinExtKt.getAppContext();
            long time4 = 0;
            if (tripleA != null && (first = tripleA.getFirst()) != null) {
                time4 = first.getTime();
            }
            time = TimeUtils.formatTime(appContext, time4);
        }
        if (time == null) {
            time = TimeUtils.formatTime(KoinExtKt.getAppContext(), 0);
        }
        if (sleepInfo != null) {
            if (sleepInfo.getHasSleep()) {
                time2 = TimeUtils.formatTime(KoinExtKt.getAppContext(), sleepInfo.getStopDate());
            } else {
                Context appContext2 = KoinExtKt.getAppContext();
                long time5 = 1439;
                if (tripleA != null && (second = tripleA.getSecond()) != null) {
                    time5 = second.getTime();
                }
                time2 = TimeUtils.formatTime(appContext2, time5);
            }
            time3 = time2;
        }
        if (time3 == null) {
            time3 = TimeUtils.formatTime(KoinExtKt.getAppContext(), 1439);
        }
        return new Pair<>(time, time3);
    }

    @Override // com.huami.sleep.daysleep.sleepstagechart.repo.IDaySleepStageRepo
    @Nullable
    public Object loadheartRateData(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull Continuation<? super ChartDataList> continuation) {
        return WholeDayHeartRateHelper.INSTANCE.parseHeartRateData(d(str, str2, SportDay.fromString(str2).getPreDay().getKey()), i, i2);
    }
}
