package com.xiaomi.fitness.res.preload;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.component.AppComponent;
import com.xiaomi.fitness.component.ComponentTask;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/res/preload/ResPreloadComponent;", "", "<init>", "()V", "init", "", "Companion", "res-preload_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AppComponent(namespace = "res_preload")
public final class ResPreloadComponent {

    @NotNull
    private static final String TAG = "ResPreloadComponent";

    @ComponentTask(notLaterThan = 3, onMainThread = false)
    public final void init() {
        Logger.d(TAG, "component init");
    }
}
