package com.xiaomi.fitness.step;

import android.content.Intent;
import com.xiaomi.fit.data.common.constant.FitnessDataConstants;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.step.IStepProviderSyncer;
import com.xiaomi.fitness.aggregation.summary.SummarySyncManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/step/StepSyncerExport;", "Lcom/xiaomi/fit/fitness/export/step/IStepProviderSyncer;", "<init>", "()V", "TAG", "", "doRequestSteps", "", "tag", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StepSyncerExport implements IStepProviderSyncer {

    @NotNull
    private final String TAG = "StepSyncerExport";

    @Override // com.xiaomi.fit.fitness.export.step.IStepProviderSyncer
    public void doRequestSteps(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (ApplicationExtKt.isRunningProcess(ApplicationExtKt.getApplication(), ":device")) {
            FitnessLogUtils.i(this.TAG, "device process alive and send request broadcast");
            Intent intent = new Intent(FitnessDataConstants.WIDGET_TRIGGER_REQUEST_STEP);
            intent.setPackage(ApplicationExtKt.getApplication().getPackageName());
            ApplicationExtKt.getApplication().sendBroadcast(intent);
            return;
        }
        FitnessLogUtils.i(this.TAG, "device process not alive and do request");
        final MiuiStepSyncer miuiStepSyncer = new MiuiStepSyncer(ApplicationExtKt.getApplication());
        miuiStepSyncer.setOnMiuiStepListener(new MiuiStepCallback() { // from class: com.xiaomi.fitness.step.StepSyncerExport.doRequestSteps.1
            @Override // com.xiaomi.fitness.step.MiuiStepCallback
            public void onStepRequestDone(boolean hasNewStep) {
                FitnessLogUtils.i(StepSyncerExport.this.TAG, "onStepRequestDone, hasNewStep=" + hasNewStep);
                if (hasNewStep) {
                    SummarySyncManager.INSTANCE.getInstance().doSummarySync("recent_data_changed_broadcast", "widget request step");
                }
                miuiStepSyncer.setOnMiuiStepListener(null);
            }
        });
        miuiStepSyncer.doRequestSteps(tag);
    }
}
