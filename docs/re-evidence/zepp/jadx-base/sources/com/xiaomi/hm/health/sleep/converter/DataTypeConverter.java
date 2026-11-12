package com.xiaomi.hm.health.sleep.converter;

import com.huami.sleep.daysleep.daydetail.vo.SleepCompareModel;
import com.huami.sleep.sleepintrodetail.dto.SleepDetail;
import com.huami.sleep.statistic.dto.SleepAllInfo;
import com.huami.sleep.util.SleepTimeUtil;
import com.xiaomi.hm.health.databases.model.CompareModel;
import com.xiaomi.hm.health.model.summery.HMSummery;
import com.xiaomi.hm.health.model.summery.Sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/sleep/converter/DataTypeConverter;", "", "", "date", "", "dateToTime", "Lcom/xiaomi/hm/health/model/summery/HMSummery;", "data", "Lcom/huami/sleep/statistic/dto/SleepAllInfo;", "convertSleepAllInfo", "Lcom/xiaomi/hm/health/databases/model/CompareModel;", "Lcom/huami/sleep/daysleep/daydetail/vo/SleepCompareModel;", "convertToSleepCompareModel", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DataTypeConverter {

    @NotNull
    public static final DataTypeConverter INSTANCE = new DataTypeConverter();

    private DataTypeConverter() {
    }

    private final long dateToTime(String date) {
        try {
            Date date2 = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).parse(date);
            if (date2 == null) {
                return 0L;
            }
            return date2.getTime();
        } catch (Exception unused) {
            return 0L;
        }
    }

    @NotNull
    public final SleepAllInfo convertSleepAllInfo(@NotNull HMSummery data) {
        SleepDetail sleepDetail;
        SleepDetail sleepDetail2;
        Sleep sleep = data.sleep;
        if (sleep == null) {
            sleepDetail = null;
        } else {
            int i = sleep.score;
            int i2 = sleep.sleepMinutes;
            int i3 = sleep.dp;
            int i4 = sleep.lt;
            int i5 = sleep.wk;
            int i6 = sleep.dt;
            long j = sleep.st;
            long j2 = sleep.ed;
            SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
            sleepDetail = new SleepDetail(i, i2, i3, i4, i6, i5, sleep.wc, ((i2 - i3) - i4) - i6, j, j2, sleepTimeUtil.getTimeMinNum(data.date, j), sleepTimeUtil.getTimeMinNum(data.date, sleep.ed), sleep.is, sleep.lb);
        }
        if (sleepDetail == null) {
            sleepDetail = new SleepDetail(0, 0, 0, 0, 0, 0, 0, 0, 0L, 0L, 0, 0, 0, 0, 16383, null);
        }
        SleepDetail sleepDetail3 = sleepDetail;
        Sleep sleep2 = data.nap;
        if (sleep2 == null) {
            sleepDetail2 = null;
        } else {
            sleepDetail2 = new SleepDetail(0, sleep2.getNapDuration(), sleep2.dp, sleep2.lt, sleep2.dt, sleep2.wk, 0, 0, 0L, 0L, 0, 0, 0, 0, 16321, null);
        }
        return new SleepAllInfo(dateToTime(data.date), data.date, sleepDetail3, sleepDetail2 == null ? new SleepDetail(0, 0, 0, 0, 0, 0, 0, 0, 0L, 0L, 0, 0, 0, 0, 16383, null) : sleepDetail2);
    }

    @NotNull
    public final SleepCompareModel convertToSleepCompareModel(@NotNull CompareModel data) {
        return new SleepCompareModel(data.count.intValue(), data.category.intValue(), data.categoryCount.intValue());
    }
}
