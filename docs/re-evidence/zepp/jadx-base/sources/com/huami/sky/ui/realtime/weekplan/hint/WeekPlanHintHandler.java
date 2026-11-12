package com.huami.sky.ui.realtime.weekplan.hint;

import com.huami.sky.lib.repo.weekplan.WeekPlanHint;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&R\"\u0010\b\u001a\u00020\u00008\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/huami/sky/ui/realtime/weekplan/hint/WeekPlanHintHandler;", "", "nextHandler", "setNextHandler", "Lcom/huami/sky/ui/realtime/weekplan/hint/WeekPlanHintRequest;", "weekPlanHintRequest", "Lcom/huami/sky/lib/repo/weekplan/WeekPlanHint;", "handleRequest", "mNextHandler", "Lcom/huami/sky/ui/realtime/weekplan/hint/WeekPlanHintHandler;", "getMNextHandler", "()Lcom/huami/sky/ui/realtime/weekplan/hint/WeekPlanHintHandler;", "setMNextHandler", "(Lcom/huami/sky/ui/realtime/weekplan/hint/WeekPlanHintHandler;)V", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public abstract class WeekPlanHintHandler {
    public WeekPlanHintHandler mNextHandler;

    @NotNull
    public final WeekPlanHintHandler getMNextHandler() {
        WeekPlanHintHandler weekPlanHintHandler = this.mNextHandler;
        Objects.requireNonNull(weekPlanHintHandler);
        return weekPlanHintHandler;
    }

    @NotNull
    public abstract WeekPlanHint handleRequest(@NotNull WeekPlanHintRequest weekPlanHintRequest);

    public final void setMNextHandler(@NotNull WeekPlanHintHandler weekPlanHintHandler) {
        this.mNextHandler = weekPlanHintHandler;
    }

    @NotNull
    public final WeekPlanHintHandler setNextHandler(@NotNull WeekPlanHintHandler nextHandler) {
        setMNextHandler(nextHandler);
        return this;
    }
}
