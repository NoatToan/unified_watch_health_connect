package com.huami.sky.ui.realtime.weekplan.hint;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.sky.lib.repo.weekplan.WeekPlanHint;
import com.huami.sky.lib.repo.weekplan.WeekPlanIntHint;
import com.huami.sleep.service.SleepWithTonalityInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/sky/ui/realtime/weekplan/hint/WeekPlanScoreHintHandler;", "Lcom/huami/sky/ui/realtime/weekplan/hint/WeekPlanHintHandler;", "Lcom/huami/sky/ui/realtime/weekplan/hint/WeekPlanHintRequest;", "weekPlanHintRequest", "Lcom/huami/sky/lib/repo/weekplan/WeekPlanHint;", "handleRequest", "", "a", LogUtil.I, "strId", "<init>", "(I)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class WeekPlanScoreHintHandler extends WeekPlanHintHandler {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int strId;

    public WeekPlanScoreHintHandler(int i) {
        this.strId = i;
    }

    @Override // com.huami.sky.ui.realtime.weekplan.hint.WeekPlanHintHandler
    @NotNull
    public WeekPlanHint handleRequest(@NotNull WeekPlanHintRequest weekPlanHintRequest) {
        int i = this.strId;
        Integer lastStrId = weekPlanHintRequest.getLastStrId();
        if ((lastStrId != null && i == lastStrId.intValue()) || weekPlanHintRequest.getSleepInfo() == null) {
            return getMNextHandler().handleRequest(weekPlanHintRequest);
        }
        SleepWithTonalityInfo sleepInfo = weekPlanHintRequest.getSleepInfo();
        return sleepInfo.getMainSleepScore() > 0 ? new WeekPlanIntHint(this.strId, sleepInfo.getMainSleepScore()) : getMNextHandler().handleRequest(weekPlanHintRequest);
    }
}
