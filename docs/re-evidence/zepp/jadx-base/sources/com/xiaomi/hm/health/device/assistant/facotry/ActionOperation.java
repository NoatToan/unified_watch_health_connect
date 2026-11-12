package com.xiaomi.hm.health.device.assistant.facotry;

import com.huami.watch.dataflow.exchange.Action;
import com.huami.watch.dataflow.exchange.ActionResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/facotry/ActionOperation;", "", "Lcom/huami/watch/dataflow/exchange/Action;", "action", "Lcom/huami/watch/dataflow/exchange/ActionResult;", "exec", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface ActionOperation {
    @NotNull
    ActionResult exec(@NotNull Action action);
}
