package com.huami.tools.analytics.rt.queue;

import com.huami.tools.analytics.HitEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016R#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/tools/analytics/rt/queue/EventQueueManager;", "Lcom/huami/tools/analytics/rt/queue/QueueManager;", "Lcom/huami/tools/analytics/HitEvent;", "event", "", "enQueue", "", "limit", "", "deQueue", "count", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "a", "Lkotlin/Lazy;", "()Ljava/util/concurrent/ConcurrentLinkedQueue;", "queue", "<init>", "()V", "analytics_release"}, k = 1, mv = {1, 5, 1})
public final class EventQueueManager implements QueueManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy queue = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lcom/huami/tools/analytics/HitEvent;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ConcurrentLinkedQueue<HitEvent>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ConcurrentLinkedQueue<HitEvent> invoke() {
            return new ConcurrentLinkedQueue<>();
        }
    }

    private final ConcurrentLinkedQueue<HitEvent> a() {
        return (ConcurrentLinkedQueue) this.queue.getValue();
    }

    @Override // com.huami.tools.analytics.rt.queue.QueueManager
    public int count() {
        return a().size();
    }

    @Override // com.huami.tools.analytics.rt.queue.QueueManager
    @NotNull
    public synchronized List<HitEvent> deQueue(int limit) {
        try {
            if (limit <= 0) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            if (a().isEmpty()) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            int i = 0;
            if (limit == 1) {
                return Arrays.asList(a().poll());
            }
            ArrayList arrayList = new ArrayList();
            if (limit > 0) {
                do {
                    i++;
                    if (!a().isEmpty()) {
                        arrayList.add(a().poll());
                    }
                } while (i < limit);
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.huami.tools.analytics.rt.queue.QueueManager
    public synchronized void enQueue(@NotNull HitEvent event) {
        a().add(event);
    }
}
