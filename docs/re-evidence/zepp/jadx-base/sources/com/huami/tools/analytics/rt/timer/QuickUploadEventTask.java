package com.huami.tools.analytics.rt.timer;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.tools.analytics.Event;
import com.huami.tools.analytics.HitEvent;
import com.huami.tools.analytics.rt.queue.EventQueueManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R(\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/huami/tools/analytics/rt/timer/QuickUploadEventTask;", "Ljava/lang/Runnable;", "", "run", "Lkotlin/Function1;", "", "Lcom/huami/tools/analytics/Event;", "a", "Lkotlin/jvm/functions/Function1;", "uploadFn", "", "b", LogUtil.I, "limitSize", "c", "Ljava/util/List;", "data", "Lcom/huami/tools/analytics/rt/queue/EventQueueManager;", "queueManager", "<init>", "(Lcom/huami/tools/analytics/rt/queue/EventQueueManager;Lkotlin/jvm/functions/Function1;)V", "analytics_release"}, k = 1, mv = {1, 5, 1})
public final class QuickUploadEventTask implements Runnable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function1<List<Event>, Unit> uploadFn;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int limitSize = 100;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<Event> data;

    /* JADX WARN: Multi-variable type inference failed */
    public QuickUploadEventTask(@NotNull EventQueueManager eventQueueManager, @NotNull Function1<? super List<Event>, Unit> function1) {
        this.uploadFn = function1;
        List<HitEvent> listDeQueue = eventQueueManager.deQueue(100);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listDeQueue, 10));
        Iterator<T> it2 = listDeQueue.iterator();
        while (it2.hasNext()) {
            arrayList.add((Event) ((HitEvent) it2.next()));
        }
        this.data = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.uploadFn.invoke(this.data);
    }
}
