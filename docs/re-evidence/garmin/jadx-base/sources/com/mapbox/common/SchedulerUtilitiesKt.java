package com.mapbox.common;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/mapbox/common/Scheduler;", "Lcom/mapbox/common/TaskOptions;", "options", "Lkotlin/Function0;", "", "task", "schedule", "(Lcom/mapbox/common/Scheduler;Lcom/mapbox/common/TaskOptions;Le23/a;)V", "common_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class SchedulerUtilitiesKt {
    public static final void schedule(Scheduler scheduler, TaskOptions taskOptions, final e23.a<Unit> aVar) {
        scheduler.getClass();
        taskOptions.getClass();
        aVar.getClass();
        scheduler.schedule(new Task() { // from class: com.mapbox.common.SchedulerUtilitiesKt.schedule.1
            @Override // com.mapbox.common.Task
            public void run() {
                aVar.invoke();
            }
        }, taskOptions);
    }

    public static /* synthetic */ void schedule$default(Scheduler scheduler, TaskOptions taskOptions, e23.a aVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            taskOptions = new TaskOptions(0L, TaskPriority.DEFAULT);
        }
        schedule(scheduler, taskOptions, aVar);
    }
}
