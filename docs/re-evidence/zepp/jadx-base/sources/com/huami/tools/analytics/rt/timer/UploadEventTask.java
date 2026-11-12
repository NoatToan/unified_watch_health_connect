package com.huami.tools.analytics.rt.timer;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.Config;
import com.huami.tools.analytics.Event;
import com.huami.tools.analytics.HitEvent;
import com.huami.tools.analytics.Logger;
import com.huami.tools.analytics.rt.queue.EventQueueManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R6\u0010\u001a\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/tools/analytics/rt/timer/UploadEventTask;", "Ljava/util/TimerTask;", "", "run", "", "Lcom/huami/tools/analytics/Event;", "loadItems", "Lcom/huami/tools/analytics/Config;", "a", "Lcom/huami/tools/analytics/Config;", "config", "Lcom/huami/tools/analytics/rt/queue/EventQueueManager;", "b", "Lcom/huami/tools/analytics/rt/queue/EventQueueManager;", "queue", "", "c", "Ljava/lang/String;", "tag", "Lkotlin/Function1;", GoogleApiAvailabilityLight.a, "Lkotlin/jvm/functions/Function1;", "getUploadEvent", "()Lkotlin/jvm/functions/Function1;", "setUploadEvent", "(Lkotlin/jvm/functions/Function1;)V", "uploadEvent", "<init>", "(Lcom/huami/tools/analytics/Config;Lcom/huami/tools/analytics/rt/queue/EventQueueManager;)V", "analytics_release"}, k = 1, mv = {1, 5, 1})
public final class UploadEventTask extends TimerTask {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Config config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final EventQueueManager queue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Function1<? super List<Event>, Unit> uploadEvent;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/tools/analytics/Logger;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Logger, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull Logger logger) {
            logger.v(UploadEventTask.this.tag, "=====> upload begin <=========");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Logger logger) {
            a(logger);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/tools/analytics/Logger;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Logger, Unit> {
        public final /* synthetic */ List<Event> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<Event> list) {
            super(1);
            this.b = list;
        }

        public final void a(@NotNull Logger logger) {
            logger.v(UploadEventTask.this.tag, "upload item count (" + this.b.size() + ')');
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Logger logger) {
            a(logger);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/tools/analytics/Logger;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Logger, Unit> {
        public c() {
            super(1);
        }

        public final void a(@NotNull Logger logger) {
            logger.v(UploadEventTask.this.tag, "=====> upload end <==========");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Logger logger) {
            a(logger);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/tools/analytics/Logger;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<Logger, Unit> {
        public d() {
            super(1);
        }

        public final void a(@NotNull Logger logger) {
            logger.v(UploadEventTask.this.tag, "nothing for upload");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Logger logger) {
            a(logger);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/tools/analytics/Logger;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<Logger, Unit> {
        public final /* synthetic */ Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Throwable th) {
            super(1);
            this.b = th;
        }

        public final void a(@NotNull Logger logger) {
            logger.e(UploadEventTask.this.tag, this.b, "run upload task error");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Logger logger) {
            a(logger);
            return Unit.INSTANCE;
        }
    }

    public UploadEventTask(@NotNull Config config, @NotNull EventQueueManager eventQueueManager) {
        this.config = config;
        this.queue = eventQueueManager;
        this.tag = config.getTag();
    }

    @Nullable
    public final Function1<List<Event>, Unit> getUploadEvent() {
        return this.uploadEvent;
    }

    @NotNull
    public final List<Event> loadItems() {
        List<HitEvent> listDeQueue = this.queue.deQueue(this.config.getTaskLimitSize());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listDeQueue, 10));
        Iterator<T> it2 = listDeQueue.iterator();
        while (it2.hasNext()) {
            arrayList.add((Event) ((HitEvent) it2.next()));
        }
        return arrayList;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        try {
            List<Event> listLoadItems = loadItems();
            if (!(!listLoadItems.isEmpty())) {
                if (this.config.getDebug()) {
                    this.config.printlnLog(new d());
                    return;
                }
                return;
            }
            if (this.config.getDebug()) {
                this.config.printlnLog(new a());
                this.config.printlnLog(new b(listLoadItems));
            }
            Function1<? super List<Event>, Unit> function1 = this.uploadEvent;
            if (function1 != null) {
                function1.invoke(listLoadItems);
            }
            if (this.config.getDebug()) {
                this.config.printlnLog(new c());
            }
        } catch (Throwable th) {
            this.config.printlnLog(new e(th));
        }
    }

    public final void setUploadEvent(@Nullable Function1<? super List<Event>, Unit> function1) {
        this.uploadEvent = function1;
    }
}
