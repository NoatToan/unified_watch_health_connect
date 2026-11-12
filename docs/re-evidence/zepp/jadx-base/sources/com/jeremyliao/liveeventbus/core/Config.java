package com.jeremyliao.liveeventbus.core;

import android.content.Context;
import androidx.annotation.NonNull;
import com.jeremyliao.liveeventbus.logger.Logger;
import com.jeremyliao.liveeventbus.utils.AppUtils;

/* JADX INFO: loaded from: classes18.dex */
public class Config {
    public Config autoClear(boolean z) {
        LiveEventBusCore.get().h(z);
        return this;
    }

    public Config enableLogger(boolean z) {
        LiveEventBusCore.get().f(z);
        return this;
    }

    public Config lifecycleObserverAlwaysActive(boolean z) {
        LiveEventBusCore.get().i(z);
        return this;
    }

    public Config setContext(Context context) {
        AppUtils.init(context);
        LiveEventBusCore.get().g();
        return this;
    }

    public Config setLogger(@NonNull Logger logger) {
        LiveEventBusCore.get().j(logger);
        return this;
    }
}
