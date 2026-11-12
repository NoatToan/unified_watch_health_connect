package com.xiaomi.smarthome.frame.cancel;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.smarthome.library.common.util.CommonUtil;

/* JADX INFO: loaded from: classes2.dex */
public class LifeCycleCancelHandle extends CancelHandle implements DefaultLifecycleObserver {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bind$0(Lifecycle lifecycle) {
        if (Lifecycle.State.DESTROYED.isAtLeast(lifecycle.getCurrentState())) {
            cancel();
        } else {
            lifecycle.addObserver(this);
        }
    }

    public LifeCycleCancelHandle bind(final Lifecycle lifecycle) {
        CommonUtil.runMainThread(new Runnable() { // from class: jfe
            @Override // java.lang.Runnable
            public final void run() {
                this.f22736a.lambda$bind$0(lifecycle);
            }
        });
        return this;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        cancel();
    }
}
