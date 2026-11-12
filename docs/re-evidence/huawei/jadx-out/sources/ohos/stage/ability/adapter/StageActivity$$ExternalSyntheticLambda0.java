package ohos.stage.ability.adapter;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes46.dex */
public final /* synthetic */ class StageActivity$$ExternalSyntheticLambda0 implements Executor {
    public final /* synthetic */ StageActivity f$0;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f$0.runOnUiThread(runnable);
    }
}
