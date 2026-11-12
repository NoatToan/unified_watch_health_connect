package com.huami.privacy.plugin;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.c;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.nfe;
import defpackage.qj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"com/huami/privacy/plugin/IsAppForeground$1", "Lnfe;", "", StatConstants.PARAM_START, "()V", LifecycleConstantKt.ON_PAUSE, "hmutil_release"}, k = 1, mv = {1, 5, 1})
public final class IsAppForeground$1 implements nfe {
    @c(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        qj.a(null, false);
    }

    @c(Lifecycle.Event.ON_START)
    public final void start() {
        qj.a(null, true);
    }
}
