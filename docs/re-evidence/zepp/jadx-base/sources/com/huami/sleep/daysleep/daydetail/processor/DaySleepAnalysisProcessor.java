package com.huami.sleep.daysleep.daydetail.processor;

import android.content.Context;
import com.huami.sleep.R;
import com.huami.sleep.daysleep.daydetail.vo.SleepShowData;
import com.huami.sleep.statistic.sleepanalysis.processer.SleepAnalysisProcessor;
import com.huami.sleep.statistic.sleepanalysis.vo.SleepAnalysisVo;
import com.huami.sleep.util.SleepDataUtil;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.dataprocess.SleepInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\n"}, d2 = {"Lcom/huami/sleep/daysleep/daydetail/processor/DaySleepAnalysisProcessor;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/dataprocess/SleepInfo;", "sleepInfo", "Lcom/huami/sleep/statistic/sleepanalysis/vo/SleepAnalysisVo;", "getDaySleepAnalysis", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class DaySleepAnalysisProcessor {

    @NotNull
    public static final DaySleepAnalysisProcessor INSTANCE = new DaySleepAnalysisProcessor();

    private DaySleepAnalysisProcessor() {
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0133  */
    /* JADX WARN: Code duplicated, block: B:36:0x013a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0167  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x01da  */
    /* JADX WARN: Code duplicated, block: B:49:0x020a  */
    @NotNull
    public final SleepAnalysisVo getDaySleepAnalysis(@NotNull Context context, @Nullable SleepInfo sleepInfo) {
        double d;
        double d2;
        SleepAnalysisVo sleepAnalysisVo = new SleepAnalysisVo(null, null, null, null, 15, null);
        if (sleepInfo != null) {
            SleepShowData sleepShowData = SleepDataUtil.INSTANCE.parse2Sleep(sleepInfo);
            if (sleepShowData.getDuration() > 0) {
                int hours = sleepInfo.getStartDate().getHours();
                int minutes = sleepInfo.getStartDate().getMinutes();
                int i = 0;
                if (hours == 23 || hours == 0) {
                    if (hours != 23 || minutes >= 30) {
                        SleepAnalysisProcessor sleepAnalysisProcessor = SleepAnalysisProcessor.INSTANCE;
                        sleepAnalysisVo.setMainTitle(sleepAnalysisProcessor.appendComma(sleepAnalysisVo.getMainTitle(), context, context.getResources().getString(R.string.sleep_3_qa_sleep_start_late)));
                        sleepAnalysisVo.setSubTitle(sleepAnalysisProcessor.appendNewLine(sleepAnalysisVo.getSubTitle(), context.getResources().getString(R.string.sleep_3_qa_sleep_start)));
                        i = 1;
                    }
                } else if (hours < 6 && hours >= 1) {
                    SleepAnalysisProcessor sleepAnalysisProcessor2 = SleepAnalysisProcessor.INSTANCE;
                    sleepAnalysisVo.setMainTitle(sleepAnalysisProcessor2.appendComma(sleepAnalysisVo.getMainTitle(), context, context.getResources().getString(R.string.sleep_3_qa_sleep_start_too_late)));
                    sleepAnalysisVo.setSubTitle(sleepAnalysisProcessor2.appendNewLine(sleepAnalysisVo.getSubTitle(), context.getResources().getString(R.string.sleep_3_qa_sleep_start)));
                    i = 1;
                }
                if (sleepShowData.getAwakeDuration() >= 60 && sleepShowData.getAwakeNum() >= 3) {
                    SleepAnalysisProcessor sleepAnalysisProcessor3 = SleepAnalysisProcessor.INSTANCE;
                    sleepAnalysisVo.setMainTitle(sleepAnalysisProcessor3.appendComma(sleepAnalysisVo.getMainTitle(), context, context.getResources().getString(R.string.sleep_3_qa_sleep_wake_lost)));
                    sleepAnalysisVo.setSubTitle(sleepAnalysisProcessor3.appendNewLine(sleepAnalysisVo.getSubTitle(), context.getResources().getString(R.string.slp_more_awake_sub_title)));
                } else if (sleepShowData.getAwakeNum() < 2 || sleepShowData.getAwakeDuration() < 14) {
                    int deepDurationHour = (sleepShowData.getDeepDurationHour() * 60) + sleepShowData.getDeepDurationMin();
                    int durationHour = (sleepShowData.getDurationHour() * 60) + sleepShowData.getDurationMin();
                    if (sleepShowData.getDurationHour() < 7) {
                        if (sleepShowData.getDurationHour() >= 5) {
                            SleepAnalysisProcessor sleepAnalysisProcessor4 = SleepAnalysisProcessor.INSTANCE;
                            sleepAnalysisVo.setSubTitle(sleepAnalysisProcessor4.appendNewLine(sleepAnalysisVo.getSubTitle(), context.getResources().getString(R.string.sleep_3_qa_sleep_time)));
                            sleepAnalysisVo.setMainTitle(sleepAnalysisProcessor4.appendComma(sleepAnalysisVo.getMainTitle(), context, context.getResources().getString(R.string.sleep_3_qa_sleep_time_short)));
                        } else {
                            SleepAnalysisProcessor sleepAnalysisProcessor5 = SleepAnalysisProcessor.INSTANCE;
                            sleepAnalysisVo.setMainTitle(sleepAnalysisProcessor5.appendComma(sleepAnalysisVo.getMainTitle(), context, context.getResources().getString(R.string.sleep_3_qa_sleep_time_too_short)));
                            sleepAnalysisVo.setSubTitle(sleepAnalysisProcessor5.appendNewLine(sleepAnalysisVo.getSubTitle(), context.getResources().getString(R.string.sleep_3_qa_sleep_time)));
                        }
                        i++;
                    }
                    d = deepDurationHour;
                    d2 = durationHour;
                    if (d < 0.25d * d2 && deepDurationHour != 0) {
                        if (d >= d2 * 0.1d) {
                            SleepAnalysisProcessor sleepAnalysisProcessor6 = SleepAnalysisProcessor.INSTANCE;
                            sleepAnalysisVo.setMainTitle(sleepAnalysisProcessor6.appendComma(sleepAnalysisVo.getMainTitle(), context, context.getResources().getString(R.string.sleep_3_qa_sleep_deep_short)));
                            sleepAnalysisVo.setSubTitle(sleepAnalysisProcessor6.appendNewLine(sleepAnalysisVo.getSubTitle(), context.getResources().getString(R.string.sleep_3_qa_sleep_deep)));
                        } else {
                            SleepAnalysisProcessor sleepAnalysisProcessor7 = SleepAnalysisProcessor.INSTANCE;
                            sleepAnalysisVo.setMainTitle(sleepAnalysisProcessor7.appendComma(sleepAnalysisVo.getMainTitle(), context, context.getResources().getString(R.string.sleep_3_qa_sleep_deep_too_short)));
                            sleepAnalysisVo.setSubTitle(sleepAnalysisProcessor7.appendNewLine(sleepAnalysisVo.getSubTitle(), context.getResources().getString(R.string.sleep_3_qa_sleep_deep)));
                        }
                        i++;
                    }
                    if (i > 1) {
                        sleepAnalysisVo.setMainTitle(SleepAnalysisProcessor.INSTANCE.appendEnd(sleepAnalysisVo.getMainTitle(), context));
                    }
                } else {
                    SleepAnalysisProcessor sleepAnalysisProcessor8 = SleepAnalysisProcessor.INSTANCE;
                    sleepAnalysisVo.setMainTitle(sleepAnalysisProcessor8.appendComma(sleepAnalysisVo.getMainTitle(), context, context.getResources().getString(R.string.sleep_3_qa_sleep_wake)));
                    sleepAnalysisVo.setSubTitle(sleepAnalysisProcessor8.appendNewLine(sleepAnalysisVo.getSubTitle(), context.getResources().getString(R.string.slp_more_awake_sub_title)));
                }
                i++;
                int deepDurationHour2 = (sleepShowData.getDeepDurationHour() * 60) + sleepShowData.getDeepDurationMin();
                int durationHour2 = (sleepShowData.getDurationHour() * 60) + sleepShowData.getDurationMin();
                if (sleepShowData.getDurationHour() < 7) {
                    if (sleepShowData.getDurationHour() >= 5) {
                        SleepAnalysisProcessor sleepAnalysisProcessor9 = SleepAnalysisProcessor.INSTANCE;
                        sleepAnalysisVo.setSubTitle(sleepAnalysisProcessor9.appendNewLine(sleepAnalysisVo.getSubTitle(), context.getResources().getString(R.string.sleep_3_qa_sleep_time)));
                        sleepAnalysisVo.setMainTitle(sleepAnalysisProcessor9.appendComma(sleepAnalysisVo.getMainTitle(), context, context.getResources().getString(R.string.sleep_3_qa_sleep_time_short)));
                    } else {
                        SleepAnalysisProcessor sleepAnalysisProcessor10 = SleepAnalysisProcessor.INSTANCE;
                        sleepAnalysisVo.setMainTitle(sleepAnalysisProcessor10.appendComma(sleepAnalysisVo.getMainTitle(), context, context.getResources().getString(R.string.sleep_3_qa_sleep_time_too_short)));
                        sleepAnalysisVo.setSubTitle(sleepAnalysisProcessor10.appendNewLine(sleepAnalysisVo.getSubTitle(), context.getResources().getString(R.string.sleep_3_qa_sleep_time)));
                    }
                    i++;
                }
                d = deepDurationHour2;
                d2 = durationHour2;
                if (d < 0.25d * d2) {
                    if (d >= d2 * 0.1d) {
                        SleepAnalysisProcessor sleepAnalysisProcessor11 = SleepAnalysisProcessor.INSTANCE;
                        sleepAnalysisVo.setMainTitle(sleepAnalysisProcessor11.appendComma(sleepAnalysisVo.getMainTitle(), context, context.getResources().getString(R.string.sleep_3_qa_sleep_deep_short)));
                        sleepAnalysisVo.setSubTitle(sleepAnalysisProcessor11.appendNewLine(sleepAnalysisVo.getSubTitle(), context.getResources().getString(R.string.sleep_3_qa_sleep_deep)));
                    } else {
                        SleepAnalysisProcessor sleepAnalysisProcessor12 = SleepAnalysisProcessor.INSTANCE;
                        sleepAnalysisVo.setMainTitle(sleepAnalysisProcessor12.appendComma(sleepAnalysisVo.getMainTitle(), context, context.getResources().getString(R.string.sleep_3_qa_sleep_deep_too_short)));
                        sleepAnalysisVo.setSubTitle(sleepAnalysisProcessor12.appendNewLine(sleepAnalysisVo.getSubTitle(), context.getResources().getString(R.string.sleep_3_qa_sleep_deep)));
                    }
                    i++;
                }
                if (i > 1) {
                    sleepAnalysisVo.setMainTitle(SleepAnalysisProcessor.INSTANCE.appendEnd(sleepAnalysisVo.getMainTitle(), context));
                }
            }
        }
        return sleepAnalysisVo;
    }
}
