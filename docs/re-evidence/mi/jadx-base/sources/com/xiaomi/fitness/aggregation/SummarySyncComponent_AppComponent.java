package com.xiaomi.fitness.aggregation;

import com.xiaomi.fitness.component.AppComponentDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0004J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ \u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\t¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/aggregation/SummarySyncComponent_AppComponent;", "Lcom/xiaomi/fitness/component/AppComponentDelegate;", "Lcom/xiaomi/fitness/aggregation/SummarySyncComponent;", "<init>", "()V", "createAppComponent", "performTask", "", "appContext", "", "taskId", "", "callTask", "methodName", "", "inputData", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SummarySyncComponent_AppComponent extends AppComponentDelegate<SummarySyncComponent> {
    @Override // com.xiaomi.fitness.component.AppComponentDelegate
    @NotNull
    public final Object callTask(@NotNull Object appContext, @NotNull String methodName, @Nullable Object inputData) throws Exception {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        throw new IllegalArgumentException("SummarySyncComponent:" + methodName);
    }

    @Override // com.xiaomi.fitness.component.AppComponentDelegate
    public final void performTask(@NotNull Object appContext, int taskId) throws Exception {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        if (taskId == 28) {
            getSingleton().initSummarySyncReceiver();
            return;
        }
        throw new IllegalArgumentException("SummarySyncComponent:" + taskId);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.xiaomi.fitness.component.AppComponentDelegate
    @NotNull
    public final SummarySyncComponent createAppComponent() {
        return new SummarySyncComponent();
    }
}
