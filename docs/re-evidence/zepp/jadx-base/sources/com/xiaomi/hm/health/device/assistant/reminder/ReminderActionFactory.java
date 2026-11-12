package com.xiaomi.hm.health.device.assistant.reminder;

import com.huami.watch.dataflow.exchange.Action;
import com.xiaomi.hm.health.device.assistant.facotry.AbstractActionFactory;
import com.xiaomi.hm.health.device.assistant.facotry.ActionOperation;
import com.xiaomi.hm.health.device.assistant.facotry.ScheduleRpcApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/reminder/ReminderActionFactory;", "Lcom/xiaomi/hm/health/device/assistant/facotry/AbstractActionFactory;", "Lcom/xiaomi/hm/health/device/assistant/facotry/ScheduleRpcApi;", "scheduleApi", "Lcom/xiaomi/hm/health/device/assistant/facotry/ActionOperation;", "evenHandler", "Lcom/huami/watch/dataflow/exchange/Action;", "action", "<init>", "(Lcom/huami/watch/dataflow/exchange/Action;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ReminderActionFactory extends AbstractActionFactory {
    public ReminderActionFactory(@NotNull Action action) {
        super(action);
    }

    @Override // com.xiaomi.hm.health.device.assistant.facotry.AbstractActionFactory
    @NotNull
    public ActionOperation evenHandler() {
        return new ReminderActionOperation();
    }

    @Override // com.xiaomi.hm.health.device.assistant.facotry.AbstractActionFactory
    @Nullable
    public ScheduleRpcApi scheduleApi() {
        return null;
    }
}
