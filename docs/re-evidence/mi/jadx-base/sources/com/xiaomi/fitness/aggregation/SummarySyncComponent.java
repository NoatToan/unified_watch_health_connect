package com.xiaomi.fitness.aggregation;

import android.content.IntentFilter;
import android.os.Build;
import com.xiaomi.fit.data.common.constant.FitnessDataConstants;
import com.xiaomi.fitness.aggregation.summary.SummarySyncManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/aggregation/SummarySyncComponent;", "", "<init>", "()V", "initSummarySyncReceiver", "", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = SummarySyncManager.TAG_SYNC)
public final class SummarySyncComponent {

    @NotNull
    private static final String TAG = "SummarySyncComponent";

    @ComponentTask(notLaterThan = 2, processName = ":device")
    public final void initSummarySyncReceiver() {
        SummarySyncReceiver summarySyncReceiver = new SummarySyncReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("recent_data_changed_broadcast");
        intentFilter.addAction(FitnessDataConstants.BROADCAST_ACTION_HISTORY_FITNESS_DATA_CHANGED);
        if (Build.VERSION.SDK_INT >= 34) {
            ApplicationExtKt.getApplication().registerReceiver(summarySyncReceiver, intentFilter, 4);
        } else {
            ApplicationExtKt.getApplication().registerReceiver(summarySyncReceiver, intentFilter);
        }
    }
}
