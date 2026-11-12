package com.huami.sleep.statistic.sleepanalysis.processer;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.R;
import com.huami.sleep.statistic.dto.TimeMode;
import com.huami.sleep.statistic.dto.TimeParam;
import com.huami.sleep.statistic.sleepanalysis.dto.SleepAnalysisData;
import com.huami.sleep.statistic.sleepanalysis.vo.SleepAnalysisVo;
import com.huami.sleep.util.SleepTimeUtil;
import com.huami.sleep.util.TimeShowUtilsKt;
import com.huami.tools.analytics.DbUtils;
import com.loc.z;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b \bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010.J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\f\u001a\u00020\n*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u0012\u0010\r\u001a\u00020\n*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u000e\u001a\u00020\n*\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0016\u0010\u001a\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0016\u0010\u001c\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0016\u0010\u001e\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0016\u0010 \u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011R\u0016\u0010\"\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0011R\u0016\u0010$\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0011R\u0016\u0010&\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0011R\u0016\u0010(\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u0011R\u0016\u0010*\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u0011R\u0016\u0010,\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\u0011¨\u0006/"}, d2 = {"Lcom/huami/sleep/statistic/sleepanalysis/processer/SleepAnalysisProcessor;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/sleep/statistic/dto/TimeParam;", "timeParam", "Lcom/huami/sleep/statistic/sleepanalysis/dto/SleepAnalysisData;", "data", "Lcom/huami/sleep/statistic/sleepanalysis/vo/SleepAnalysisVo;", "getSleepAnalysisVo", "", "str", "appendComma", "appendEnd", "appendNewLine", "", "a", LogUtil.I, "MAX_DUR_DIFF", "b", "INCREASE_DUR", "c", "MIN_DUR", GoogleApiAvailabilityLight.a, "MAX_SCORE", "e", "INCREASE_SCORE", "f", "DP_MIN_RATIO", "g", "DP_MAX_RATIO", "h", "LIGHT_MAX_RATIO", "i", "REM_MAX_RATIO", z.j, "WAKE_COUNT", hl.k, "INTO_LATE_TIME", "l", "MAX_CONDITION_NUM", "m", "SLEEP_DUR_RANGE_MIN", GoogleApiAvailabilityLight.b, "SLEEP_DUR_RANGE_MAX", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepAnalysisProcessor {

    @NotNull
    public static final SleepAnalysisProcessor INSTANCE = new SleepAnalysisProcessor();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int MAX_DUR_DIFF = 180;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int INCREASE_DUR = 60;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int MIN_DUR = 300;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int MAX_SCORE = 95;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final int INCREASE_SCORE = 10;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final int DP_MIN_RATIO = 10;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final int DP_MAX_RATIO = 60;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final int LIGHT_MAX_RATIO = 60;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final int REM_MAX_RATIO = 30;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final int WAKE_COUNT = 4;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final int INTO_LATE_TIME = 1560;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final int MAX_CONDITION_NUM = 3;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final int SLEEP_DUR_RANGE_MIN = 360;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private static final int SLEEP_DUR_RANGE_MAX = 540;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeMode.values().length];
            iArr[TimeMode.WEEK.ordinal()] = 1;
            iArr[TimeMode.MONTH.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SleepAnalysisProcessor() {
    }

    @NotNull
    public final String appendComma(@NotNull String str, @NotNull Context context, @NotNull String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(context.getResources().getString(R.string.slp_comma), Arrays.copyOf(new Object[]{str, str2}, 2));
    }

    @NotNull
    public final String appendEnd(@NotNull String str, @NotNull Context context) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(context.getResources().getString(R.string.slp_end), Arrays.copyOf(new Object[]{str}, 1));
    }

    @NotNull
    public final String appendNewLine(@NotNull String str, @NotNull String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str + "\n" + str2;
    }

    @NotNull
    public final SleepAnalysisVo getSleepAnalysisVo(@NotNull Context context, @NotNull TimeParam timeParam, @Nullable SleepAnalysisData data) {
        int i;
        int i2;
        int i3;
        String string;
        SleepAnalysisVo sleepAnalysisVo = new SleepAnalysisVo(null, null, null, null, 15, null);
        if (data != null) {
            if (data.getInvalidDay() == 1) {
                sleepAnalysisVo.setMainTitle(context.getResources().getString(R.string.slp_state_analysis_title));
                int i4 = WhenMappings.$EnumSwitchMapping$0[timeParam.getMode().ordinal()];
                if (i4 != 1) {
                    string = i4 != 2 ? "" : context.getResources().getString(R.string.slp_month_state_analysis_desc);
                } else {
                    string = context.getResources().getString(R.string.slp_state_analysis_desc);
                }
                sleepAnalysisVo.setSubTitle(string);
            } else if (data.getLongestNightSleepTime() - data.getShortestNightSleepTime() >= 180) {
                SleepAnalysisProcessor sleepAnalysisProcessor = INSTANCE;
                String mainTitle = sleepAnalysisVo.getMainTitle();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                sleepAnalysisVo.setMainTitle(sleepAnalysisProcessor.appendComma(mainTitle, context, String.format(context.getResources().getString(R.string.slp_time_fluctuation_mian_title), Arrays.copyOf(new Object[]{TimeShowUtilsKt.getDurationText$default(data.getLongestNightSleepTime(), context, false, 2, null), TimeShowUtilsKt.getDurationText$default(data.getShortestNightSleepTime(), context, false, 2, null)}, 2))));
                sleepAnalysisVo.setSubTitle(sleepAnalysisProcessor.appendNewLine(sleepAnalysisVo.getSubTitle(), context.getResources().getString(R.string.slp_time_fluctuation_sub_title)));
            } else {
                if (data.getAvgNightSleepTime() < 300) {
                    SleepAnalysisProcessor sleepAnalysisProcessor2 = INSTANCE;
                    sleepAnalysisVo.setMainTitle(sleepAnalysisProcessor2.appendComma(sleepAnalysisVo.getMainTitle(), context, context.getResources().getString(R.string.slp_time_short_mian_title)));
                    sleepAnalysisVo.setSubTitle(sleepAnalysisProcessor2.appendNewLine(sleepAnalysisVo.getSubTitle(), context.getResources().getString(R.string.slp_time_short_sub_title)));
                    i = 1;
                } else {
                    i = 0;
                }
                if (i < 3 && data.getLastAvgNightSleepTime() > 0) {
                    int avgNightSleepTime = data.getAvgNightSleepTime();
                    if ((360 <= avgNightSleepTime && avgNightSleepTime <= SLEEP_DUR_RANGE_MAX) && data.getAvgNightSleepTime() - data.getLastAvgNightSleepTime() > 60) {
                        i++;
                        SleepAnalysisProcessor sleepAnalysisProcessor3 = INSTANCE;
                        sleepAnalysisVo.setMainTitle(sleepAnalysisProcessor3.appendComma(sleepAnalysisVo.getMainTitle(), context, context.getResources().getString(R.string.slp_time_increate_main_title)));
                        sleepAnalysisVo.setSubTitle(sleepAnalysisProcessor3.appendNewLine(sleepAnalysisVo.getSubTitle(), context.getResources().getString(R.string.slp_time_short_sub_title)));
                    }
                }
                if (data.getAvgDpRatio() < 10) {
                    i++;
                    SleepAnalysisProcessor sleepAnalysisProcessor4 = INSTANCE;
                    sleepAnalysisVo.setMainTitle(sleepAnalysisProcessor4.appendComma(sleepAnalysisVo.getMainTitle(), context, context.getResources().getString(R.string.slp_less_deep_main_title)));
                    sleepAnalysisVo.setSubTitle(sleepAnalysisProcessor4.appendNewLine(sleepAnalysisVo.getSubTitle(), context.getResources().getString(R.string.slp_less_deep_sub_title)));
                }
                if (i < 3 && data.getAvgDpRatio() > 60) {
                    i++;
                    SleepAnalysisProcessor sleepAnalysisProcessor5 = INSTANCE;
                    sleepAnalysisVo.setMainTitle(sleepAnalysisProcessor5.appendComma(sleepAnalysisVo.getMainTitle(), context, context.getResources().getString(R.string.slp_more_deep_main_title)));
                    sleepAnalysisVo.setSubTitle(sleepAnalysisProcessor5.appendNewLine(sleepAnalysisVo.getSubTitle(), context.getResources().getString(R.string.slp_less_deep_sub_title)));
                }
                if (i < 3 && data.getAvgLightRatio() >= 60) {
                    i++;
                    SleepAnalysisProcessor sleepAnalysisProcessor6 = INSTANCE;
                    sleepAnalysisVo.setMainTitle(sleepAnalysisProcessor6.appendComma(sleepAnalysisVo.getMainTitle(), context, context.getResources().getString(R.string.slp_more_light_mian_title)));
                    sleepAnalysisVo.setSubTitle(sleepAnalysisProcessor6.appendNewLine(sleepAnalysisVo.getSubTitle(), context.getResources().getString(R.string.slp_more_light_sub_title)));
                }
                if (i < 3 && data.getAvgRemRatio() > 30) {
                    i++;
                    SleepAnalysisProcessor sleepAnalysisProcessor7 = INSTANCE;
                    sleepAnalysisVo.setMainTitle(sleepAnalysisProcessor7.appendComma(sleepAnalysisVo.getMainTitle(), context, context.getResources().getString(R.string.slp_more_rem_mian_title)));
                    sleepAnalysisVo.setSubTitle(sleepAnalysisProcessor7.appendNewLine(sleepAnalysisVo.getSubTitle(), context.getResources().getString(R.string.slp_more_rem_sub_title)));
                }
                if (i < 3 && data.getAvgAwakeCount() > 4) {
                    i++;
                    SleepAnalysisProcessor sleepAnalysisProcessor8 = INSTANCE;
                    sleepAnalysisVo.setMainTitle(sleepAnalysisProcessor8.appendComma(sleepAnalysisVo.getMainTitle(), context, context.getResources().getString(R.string.slp_more_awake_mian_title)));
                    sleepAnalysisVo.setSubTitle(sleepAnalysisProcessor8.appendNewLine(sleepAnalysisVo.getSubTitle(), context.getResources().getString(R.string.slp_more_awake_sub_title)));
                }
                if (i < 3 && data.getAvgIntoSleepTime() > INTO_LATE_TIME) {
                    i++;
                    SleepAnalysisProcessor sleepAnalysisProcessor9 = INSTANCE;
                    sleepAnalysisVo.setMainTitle(sleepAnalysisProcessor9.appendComma(sleepAnalysisVo.getMainTitle(), context, context.getResources().getString(R.string.slp_late_mian_title)));
                    sleepAnalysisVo.setSubTitle(sleepAnalysisProcessor9.appendNewLine(sleepAnalysisVo.getSubTitle(), context.getResources().getString(R.string.slp_late_sub_title)));
                }
                if (data.getAvgNightSleepScore() >= 95) {
                    i++;
                    SleepAnalysisProcessor sleepAnalysisProcessor10 = INSTANCE;
                    sleepAnalysisVo.setMainTitle(sleepAnalysisProcessor10.appendComma(sleepAnalysisVo.getMainTitle(), context, context.getResources().getString(R.string.slp_good_main_title)));
                    sleepAnalysisVo.setSubTitle(sleepAnalysisProcessor10.appendNewLine(sleepAnalysisVo.getSubTitle(), context.getResources().getString(R.string.slp_good_sub_title)));
                }
                if (data.getLastAvgNightSleepScore() > 0 && data.getAvgNightSleepScore() - data.getLastAvgNightSleepScore() >= 10) {
                    i++;
                    SleepAnalysisProcessor sleepAnalysisProcessor11 = INSTANCE;
                    String mainTitle2 = sleepAnalysisVo.getMainTitle();
                    Resources resources = context.getResources();
                    TimeMode mode = timeParam.getMode();
                    int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                    int i5 = iArr[mode.ordinal()];
                    if (i5 != 1) {
                        i2 = i5 != 2 ? R.plurals.slp_month_score_increate_main_title : R.plurals.slp_month_score_increate_main_title;
                    } else {
                        i2 = R.plurals.slp_score_increate_main_title;
                    }
                    sleepAnalysisVo.setMainTitle(sleepAnalysisProcessor11.appendComma(mainTitle2, context, resources.getQuantityString(i2, data.getAvgNightSleepScore() - data.getLastAvgNightSleepScore(), Integer.valueOf(data.getAvgNightSleepScore() - data.getLastAvgNightSleepScore()))));
                    String subTitle = sleepAnalysisVo.getSubTitle();
                    Resources resources2 = context.getResources();
                    int i6 = iArr[timeParam.getMode().ordinal()];
                    if (i6 != 1) {
                        i3 = i6 != 2 ? R.plurals.slp_month_score_increate_sub_title : R.plurals.slp_month_score_increate_sub_title;
                    } else {
                        i3 = R.plurals.slp_score_increate_sub_title;
                    }
                    sleepAnalysisVo.setSubTitle(sleepAnalysisProcessor11.appendNewLine(subTitle, resources2.getQuantityString(i3, data.getAvgNightSleepScore(), Integer.valueOf(data.getAvgNightSleepScore()))));
                }
                if (i > 1) {
                    sleepAnalysisVo.setMainTitle(INSTANCE.appendEnd(sleepAnalysisVo.getMainTitle(), context));
                }
            }
            String string2 = context.getResources().getString(R.string.slp_best_score);
            SleepTimeUtil sleepTimeUtil = SleepTimeUtil.INSTANCE;
            String dateTimeForMD = sleepTimeUtil.formatDateTimeForMD(data.getBestDayTime());
            int bestScore = data.getBestScore();
            Resources resources3 = context.getResources();
            int i7 = R.plurals.sleep_score_unit;
            sleepAnalysisVo.setBestTipStr(string2 + dateTimeForMD + " —— " + bestScore + resources3.getQuantityString(i7, data.getBestScore()));
            sleepAnalysisVo.setWorstTipStr(context.getResources().getString(R.string.slp_worst_score) + sleepTimeUtil.formatDateTimeForMD(data.getWorstDayTime()) + " —— " + data.getWorstScore() + context.getResources().getQuantityString(i7, data.getWorstScore()));
        }
        return sleepAnalysisVo;
    }
}
