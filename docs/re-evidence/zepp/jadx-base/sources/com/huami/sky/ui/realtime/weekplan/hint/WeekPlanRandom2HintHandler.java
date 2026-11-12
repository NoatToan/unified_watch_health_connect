package com.huami.sky.ui.realtime.weekplan.hint;

import com.huami.sky.lib.repo.weekplan.WeekPlanHint;
import com.huami.sky.lib.repo.weekplan.WeekPlanStr;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/huami/sky/ui/realtime/weekplan/hint/WeekPlanRandom2HintHandler;", "Lcom/huami/sky/ui/realtime/weekplan/hint/WeekPlanHintHandler;", "Lcom/huami/sky/ui/realtime/weekplan/hint/WeekPlanHintRequest;", "weekPlanHintRequest", "Lcom/huami/sky/lib/repo/weekplan/WeekPlanHint;", "handleRequest", "", "", "a", "Ljava/util/List;", "hintStrIdList", "<init>", "(Ljava/util/List;)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class WeekPlanRandom2HintHandler extends WeekPlanHintHandler {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<Integer> hintStrIdList;

    public WeekPlanRandom2HintHandler(@NotNull List<Integer> list) {
        this.hintStrIdList = list;
    }

    @Override // com.huami.sky.ui.realtime.weekplan.hint.WeekPlanHintHandler
    @NotNull
    public WeekPlanHint handleRequest(@NotNull WeekPlanHintRequest weekPlanHintRequest) {
        int iIndexOf = CollectionsKt___CollectionsKt.indexOf((List<? extends Object>) ((List) this.hintStrIdList), (Object) weekPlanHintRequest.getLastStrId());
        List<Integer> list = this.hintStrIdList;
        return new WeekPlanStr(list.get((iIndexOf + 1) % list.size()).intValue());
    }
}
