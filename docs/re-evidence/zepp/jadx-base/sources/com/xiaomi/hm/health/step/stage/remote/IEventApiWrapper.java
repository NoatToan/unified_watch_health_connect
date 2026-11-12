package com.xiaomi.hm.health.step.stage.remote;

import com.xiaomi.hm.health.step.stage.model.StageEventItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/step/stage/remote/IEventApiWrapper;", "", "", "Lcom/xiaomi/hm/health/step/stage/model/StageEventItem;", "item", "", "uploadStageEventItems", "([Lcom/xiaomi/hm/health/step/stage/model/StageEventItem;)Z", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface IEventApiWrapper {
    boolean uploadStageEventItems(@NotNull StageEventItem... item);
}
