package com.huami.tools.analytics.rt.queue;

import androidx.annotation.IntRange;
import com.huami.tools.analytics.HitEvent;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\b\u0003\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/huami/tools/analytics/rt/queue/QueueManager;", "", "Lcom/huami/tools/analytics/HitEvent;", "event", "", "enQueue", "", "limit", "", "deQueue", "count", "analytics_release"}, k = 1, mv = {1, 5, 1})
public interface QueueManager {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ List deQueue$default(QueueManager queueManager, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deQueue");
            }
            if ((i2 & 1) != 0) {
                i = 1;
            }
            return queueManager.deQueue(i);
        }
    }

    int count();

    @NotNull
    List<HitEvent> deQueue(@IntRange(from = 1, to = 100) int limit);

    void enQueue(@NotNull HitEvent event);
}
