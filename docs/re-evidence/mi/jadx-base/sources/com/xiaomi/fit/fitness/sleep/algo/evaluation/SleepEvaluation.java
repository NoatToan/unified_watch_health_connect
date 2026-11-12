package com.xiaomi.fit.fitness.sleep.algo.evaluation;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class SleepEvaluation {
    private static final String TAG = "SleepEvaluation";

    public static class Comment {
        public static Comment EMPTY = new Comment();
        public int dayCommentCode;
        public int longSleepCommentCode;
        public int score;
        public int stage;

        public String toString() {
            return "Comment{stage=" + this.stage + ", longSleepCommentCode=" + this.longSleepCommentCode + ", dayCommentCode=" + this.dayCommentCode + ", score=" + this.score + AbstractJsonLexerKt.END_OBJ;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface DailySate {
        public static final int STAGE_BAD = 1;
        public static final int STAGE_BEST = 4;
        public static final int STAGE_BETTER = 3;
        public static final int STAGE_NORMAL = 2;
        public static final int STAGE_NO_NIGHT_SLEEP = 5;
        public static final int STAGE_NO_SLEEP = 0;
    }

    public static class DailySleep {
        private final List<SleepPeriod> mSleepPeriodList = new LinkedList();
        public int score;

        public void addPeriod(SleepPeriod sleepPeriod) {
            this.mSleepPeriodList.add(sleepPeriod);
        }

        public SleepPeriod[] getPeriodArr() {
            return (SleepPeriod[]) this.mSleepPeriodList.toArray(new SleepPeriod[0]);
        }

        public int getPeriodSize() {
            return this.mSleepPeriodList.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("score = ");
            sb.append(this.score);
            sb.append(", ");
            for (int i = 0; i < this.mSleepPeriodList.size(); i++) {
                sb.append(this.mSleepPeriodList.get(i));
            }
            return sb.toString();
        }
    }

    public static class SleepPeriod {
        public int duration;
        public long startTime;
        public int timeZone;

        public String toString() {
            return "SleepPeriod{duration=" + this.duration + ", startTime=" + this.startTime + ", timeZone=" + this.timeZone + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class SleepSummary {
        public int deepDuration;
        public int lastStage;
        public int lightDuration;
        public int remDuration;
        public int sleepDuration;
        public long sleepOnBed;
        public int timeZone;
        public int wakeCount;
        public int wakeDuration;

        public String toString() {
            return "SleepSummary{sleepDuration=" + this.sleepDuration + ", wakeDuration=" + this.wakeDuration + ", lightDuration=" + this.lightDuration + ", deepDuration=" + this.deepDuration + ", remDuration=" + this.remDuration + ", sleepOnBed=" + this.sleepOnBed + ", wakeCount=" + this.wakeCount + ", timeZone=" + this.timeZone + ", lastStage=" + this.lastStage + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public static class WeeklyComment {
        public static final WeeklyComment EMPTY = new WeeklyComment();
        public int code;
        public int score;
        public int stage;

        public String toString() {
            return "WeeklyComment{score=" + this.score + ", stage=" + this.stage + ", code=" + this.code + AbstractJsonLexerKt.END_OBJ;
        }
    }

    private SleepEvaluation() {
    }

    public static Comment getSleepDailyComment(Long l, List<SleepSummary> list, List<SleepSummary> list2) {
        if (list == null || list.isEmpty()) {
            return Comment.EMPTY;
        }
        String date = TimeUtils.formatDate("MM/dd HH:mm", Long.valueOf(l.longValue() * 1000));
        FitnessLogUtils.i(TAG, "getSleepDailyComment: dayTime:" + date + ">" + l + ";summaryList:" + list + ";preDaySummaryList: " + list2);
        Comment commentNGetSleepDailyComment = nGetSleepDailyComment(list, list2);
        StringBuilder sb = new StringBuilder();
        sb.append("getSleepDailyComment result: ");
        sb.append(date);
        sb.append(";comment:");
        sb.append(commentNGetSleepDailyComment);
        FitnessLogUtils.i(TAG, sb.toString());
        return commentNGetSleepDailyComment == null ? Comment.EMPTY : commentNGetSleepDailyComment;
    }

    public static WeeklyComment getSleepWeeklyComment(List<DailySleep> list) {
        if (list == null || list.isEmpty()) {
            return WeeklyComment.EMPTY;
        }
        FitnessLogUtils.i(TAG, "getSleepWeeklyComment: " + list.toString());
        WeeklyComment weeklyCommentNGetSleepWeeklyComment = nGetSleepWeeklyComment(list);
        FitnessLogUtils.i(TAG, "getSleepWeeklyComment result: " + weeklyCommentNGetSleepWeeklyComment);
        return weeklyCommentNGetSleepWeeklyComment == null ? WeeklyComment.EMPTY : weeklyCommentNGetSleepWeeklyComment;
    }

    private static native Comment nGetSleepDailyComment(List<SleepSummary> list, List<SleepSummary> list2);

    private static native WeeklyComment nGetSleepWeeklyComment(List<DailySleep> list);
}
