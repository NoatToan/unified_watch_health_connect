package com.huami.watch.dataflow.sync.stepstage;

import com.huami.watch.dataflow.model.health.AnalysisUtils;
import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.StageSteps;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes16.dex */
public class CompanionStepStageProcessor {
    private onStepStageUpdateListener a;
    private final ExecutorService b;

    public static class b {
        public static final CompanionStepStageProcessor a = new CompanionStepStageProcessor();

        private b() {
        }
    }

    public interface onStepStageUpdateListener {
        void onUpdated(String str, @Nonnull ArrayList<StageSteps> arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void c(String str) {
        ArrayList<StageSteps> stageSteps;
        onStepStageUpdateListener onstepstageupdatelistener;
        DaySportData daySleepInfo = AnalysisUtils.getDaySleepInfo(str);
        if (daySleepInfo == null || daySleepInfo.getStepsInfo() == null || (stageSteps = daySleepInfo.getStepsInfo().getStageSteps()) == null || stageSteps.isEmpty() || (onstepstageupdatelistener = this.a) == null) {
            return;
        }
        onstepstageupdatelistener.onUpdated(str, stageSteps);
    }

    public static CompanionStepStageProcessor get() {
        return b.a;
    }

    public void process(final String str) {
        this.b.execute(new Runnable() { // from class: sx0
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c(str);
            }
        });
    }

    public void setOnStepStageUpdateListener(onStepStageUpdateListener onstepstageupdatelistener) {
        this.a = onstepstageupdatelistener;
    }

    private CompanionStepStageProcessor() {
        this.a = null;
        this.b = Executors.newSingleThreadExecutor();
    }
}
