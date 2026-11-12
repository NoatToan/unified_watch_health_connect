package com.huami.sleep.daysleep.quotient;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.sleep.util.PercentageCalculateUtil;
import com.huami.sleep.util.SleepTimeUtil;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import com.xiaomi.hm.health.dataprocess.SportDay;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a \u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001\u001a\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0002\u001a\n\u0010\t\u001a\u00020\b*\u00020\u0002\"\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "Lkotlin/Pair;", "", "odiScoreAndCode", "Lcom/huami/sleep/daysleep/quotient/SleepQuotientDto;", "convertToQuotientDto", "sleepInfo", "a", "", "minutesToTime", LogUtil.I, "SIXTY_MINUTE", "sleep_release"}, k = 2, mv = {1, 5, 1})
public final class SleepQuotientConvertKt {
    private static final int a = 60;

    private static final int a(SleepInfo sleepInfo) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(sleepInfo.getStartDate().getTime());
        Unit unit = Unit.INSTANCE;
        return new SportDay(calendar).before(sleepInfo.getSportDay()) ? sleepInfo.getStartDateMin() + SleepQuotientProviderKt.SLEEP_FALL_ASLEEP_MIN : sleepInfo.getStartDateMin();
    }

    @NotNull
    public static final SleepQuotientDto convertToQuotientDto(@NotNull SleepInfo sleepInfo, @Nullable Pair<Integer, Integer> pair) {
        PercentageCalculateUtil percentageCalculateUtil = PercentageCalculateUtil.INSTANCE;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(sleepInfo.getNonRemCount()));
        arrayList.add(Integer.valueOf(sleepInfo.getRemCount()));
        arrayList.add(Integer.valueOf(sleepInfo.getDreamTime()));
        Unit unit = Unit.INSTANCE;
        int[] iArrCalculatePercentages = percentageCalculateUtil.calculatePercentages(arrayList, 100);
        int sleepCount = sleepInfo.getSleepCount();
        int intoSleepCount = sleepInfo.getIntoSleepCount() <= 60 ? sleepInfo.getIntoSleepCount() : 60;
        int sleepScore = sleepInfo.getSleepScore();
        int i = iArrCalculatePercentages[0];
        int i2 = iArrCalculatePercentages[1];
        int i3 = iArrCalculatePercentages[2];
        boolean zIsRemSupport = sleepInfo.isRemSupport();
        int awakeNum = sleepInfo.getAwakeNum();
        int iA = a(sleepInfo);
        int stopDateMin = sleepInfo.getStopDateMin();
        SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
        return new SleepQuotientDto(sleepCount, sleepScore, intoSleepCount, i, i2, i3, zIsRemSupport, awakeNum, iA, stopDateMin, sleepTimeUtil.getDayStartTime(sleepInfo.getSportDay().getTimestamp()), sleepTimeUtil.getDayEndTime(sleepInfo.getSportDay().getTimestamp()), false, false, pair, 12288, null);
    }

    @NotNull
    public static final String minutesToTime(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(12, i);
        return new SimpleDateFormat("HH:mm", Locale.getDefault()).format(calendar.getTime());
    }
}
