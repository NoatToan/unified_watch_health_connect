package com.xiaomi.hm.health.device.assistant.facotry;

import com.huami.watch.dataflow.exchange.Action;
import com.huami.watch.dataflow.exchange.ActionResult;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0006\u0010\u0007\u001a\u00020\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/facotry/AbstractActionFactory;", "", "Lcom/xiaomi/hm/health/device/assistant/facotry/ActionOperation;", "evenHandler", "Lcom/xiaomi/hm/health/device/assistant/facotry/ScheduleRpcApi;", "scheduleApi", "Lcom/huami/watch/dataflow/exchange/ActionResult;", Constant.METHOD_EXECUTE, "Lcom/huami/watch/dataflow/exchange/Action;", "a", "Lcom/huami/watch/dataflow/exchange/Action;", "getAction", "()Lcom/huami/watch/dataflow/exchange/Action;", "action", "<init>", "(Lcom/huami/watch/dataflow/exchange/Action;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public abstract class AbstractActionFactory {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Action action;

    public AbstractActionFactory(@NotNull Action action) {
        this.action = action;
    }

    @NotNull
    public abstract ActionOperation evenHandler();

    @NotNull
    public final ActionResult execute() {
        return evenHandler().exec(this.action);
    }

    @NotNull
    public final Action getAction() {
        return this.action;
    }

    @Nullable
    public abstract ScheduleRpcApi scheduleApi();
}
