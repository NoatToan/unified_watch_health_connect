package com.xiaomi.hm.health.step.stage.remote;

import com.xiaomi.hm.health.step.stage.model.StageEventItem;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/step/stage/remote/IEventApi;", "", "", "Lcom/xiaomi/hm/health/step/stage/model/StageEventItem;", "items", "", "postEvents", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface IEventApi {
    boolean postEvents(@NotNull List<StageEventItem> items);
}
