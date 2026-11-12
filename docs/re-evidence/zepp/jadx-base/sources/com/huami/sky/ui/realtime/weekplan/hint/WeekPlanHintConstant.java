package com.huami.sky.ui.realtime.weekplan.hint;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.sky.ui.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R(\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/sky/ui/realtime/weekplan/hint/WeekPlanHintConstant;", "", "", "WEEK_PlAN_RANDOM1", LogUtil.I, "WEEK_PlAN_RANDOM2", "WEEK_PlAN_RANDOM3", "WEEK_PlAN_FIRST", "WEEK_PlAN_SLEEP", "WEEK_PlAN_DEEP", "WEEK_PlAN_SCORE", "WEEK_PlAN_TIME", "WEEK_PlAN_LAST_GOOD", "WEEK_PlAN_LAST_IMPROVE", "", "a", "Ljava/util/Map;", "getWeekPlanHintMap$sky_ui_release", "()Ljava/util/Map;", "weekPlanHintMap", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class WeekPlanHintConstant {
    public static final int WEEK_PlAN_DEEP = 6;
    public static final int WEEK_PlAN_FIRST = 4;
    public static final int WEEK_PlAN_LAST_GOOD = 9;
    public static final int WEEK_PlAN_LAST_IMPROVE = 10;
    public static final int WEEK_PlAN_RANDOM1 = 1;
    public static final int WEEK_PlAN_RANDOM2 = 2;
    public static final int WEEK_PlAN_RANDOM3 = 3;
    public static final int WEEK_PlAN_SCORE = 7;
    public static final int WEEK_PlAN_SLEEP = 5;
    public static final int WEEK_PlAN_TIME = 8;

    @NotNull
    public static final WeekPlanHintConstant INSTANCE = new WeekPlanHintConstant();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Map<Integer, Integer> weekPlanHintMap = r.mutableMapOf(TuplesKt.to(1, Integer.valueOf(R.string.week_plan_hint_mid_random1)), TuplesKt.to(2, Integer.valueOf(R.string.week_plan_hint_mid_random2)), TuplesKt.to(3, Integer.valueOf(R.string.week_plan_hint_mid_random3)), TuplesKt.to(4, Integer.valueOf(R.string.week_plan_hint_first)), TuplesKt.to(5, Integer.valueOf(R.string.week_plan_hint_mid_card)), TuplesKt.to(6, Integer.valueOf(R.string.week_plan_hint_mid_deep)), TuplesKt.to(7, Integer.valueOf(R.string.week_plan_hint_mid_score)), TuplesKt.to(8, Integer.valueOf(R.string.week_plan_hint_mid_time)), TuplesKt.to(9, Integer.valueOf(R.plurals.week_plan_hint_last_good)), TuplesKt.to(10, Integer.valueOf(R.plurals.week_plan_hint_last_improve)));

    private WeekPlanHintConstant() {
    }

    @NotNull
    public final Map<Integer, Integer> getWeekPlanHintMap$sky_ui_release() {
        return weekPlanHintMap;
    }
}
