package com.xiaomi.hm.health.step.stage.remote;

import com.xiaomi.hm.health.step.stage.model.StageEventItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/step/stage/remote/EventApiWrapper;", "Lcom/xiaomi/hm/health/step/stage/remote/IEventApiWrapper;", "", "Lcom/xiaomi/hm/health/step/stage/model/StageEventItem;", "item", "", "uploadStageEventItems", "([Lcom/xiaomi/hm/health/step/stage/model/StageEventItem;)Z", "Lcom/xiaomi/hm/health/step/stage/remote/IEventApi;", "a", "Lcom/xiaomi/hm/health/step/stage/remote/IEventApi;", "eventApi", "<init>", "(Lcom/xiaomi/hm/health/step/stage/remote/IEventApi;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class EventApiWrapper implements IEventApiWrapper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IEventApi eventApi;

    public EventApiWrapper(@NotNull IEventApi iEventApi) {
        this.eventApi = iEventApi;
    }

    @Override // com.xiaomi.hm.health.step.stage.remote.IEventApiWrapper
    public boolean uploadStageEventItems(@NotNull StageEventItem... item) {
        List<StageEventItem> list = ArraysKt___ArraysKt.toList(item);
        if (list == null || list.isEmpty()) {
            return true;
        }
        return this.eventApi.postEvents(list);
    }
}
