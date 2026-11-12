package com.xiaomi.hm.health.healthdata.ui.detail.healthdata;

import com.huami.hmdateformat.date.HMDataFormatKt;
import com.huami.hmdateformat.date.HMPattern;
import com.xiaomi.hm.health.healthdata.dto.TimeMode;
import com.xiaomi.hm.health.healthdata.ui.vo.TimeParam;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/ui/vo/TimeParam;", "", "formatTime", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class HealthDataTimeExtKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeMode.values().length];
            iArr[TimeMode.WEEK.ordinal()] = 1;
            iArr[TimeMode.MONTH.ordinal()] = 2;
            iArr[TimeMode.YEAR.ordinal()] = 3;
            iArr[TimeMode.DAY.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String formatTime(@NotNull TimeParam timeParam) {
        StringBuilder sb = new StringBuilder();
        int i = WhenMappings.$EnumSwitchMapping$0[timeParam.getMode().ordinal()];
        if (i == 1) {
            HealthDataTimeUtils healthDataTimeUtils = HealthDataTimeUtils.INSTANCE;
            long firstDayOfWeekTime = healthDataTimeUtils.getFirstDayOfWeekTime(timeParam.getTime());
            long lastDayOfWeekTime = healthDataTimeUtils.getLastDayOfWeekTime(timeParam.getTime());
            HMPattern hMPattern = HMPattern.YEAR_ABBR_MONTH_DAY;
            sb.append(HMDataFormatKt.getFormatTime$default(firstDayOfWeekTime, HMDataFormatKt.adaptHMPattern(hMPattern, firstDayOfWeekTime), (Locale) null, 2, (Object) null));
            sb.append(" - ");
            sb.append(HMDataFormatKt.getFormatTime$default(lastDayOfWeekTime, HMDataFormatKt.adaptHMPattern(hMPattern, lastDayOfWeekTime), (Locale) null, 2, (Object) null));
        } else if (i == 2) {
            sb.append(HMDataFormatKt.getFormatTime$default(timeParam.getTime(), HMPattern.YEAR_ABBR_MONTH, (Locale) null, 2, (Object) null));
        } else if (i == 3) {
            sb.append(HMDataFormatKt.getFormatTime$default(timeParam.getTime(), HMPattern.YEAR, (Locale) null, 2, (Object) null));
        } else if (i == 4) {
            sb.append(HMDataFormatKt.getFormatTime$default(timeParam.getTime(), HMDataFormatKt.adaptHMPattern(HMPattern.YEAR_ABBR_MONTH_DAY, timeParam.getTime()), (Locale) null, 2, (Object) null));
        }
        return sb.toString();
    }
}
