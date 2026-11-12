package com.huami.privacy.plugin;

import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.OnLifecycleEvent;
import androidx.p008lifecycle.ProcessLifecycleOwner;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/privacy/plugin/IsAppForeground;", "Lcom/huami/privacy/plugin/PrivacyPlugin;", "", "a", "Z", "isRunningForeground", "getValue", "()Ljava/lang/Boolean;", "value", "<init>", "()V", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public final class IsAppForeground implements PrivacyPlugin<Boolean> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isRunningForeground;

    public IsAppForeground() {
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new LifecycleObserver() { // from class: com.huami.privacy.plugin.IsAppForeground.1
            @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
            public final void onPause() {
                IsAppForeground.this.isRunningForeground = false;
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_START)
            public final void start() {
                IsAppForeground.this.isRunningForeground = true;
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.privacy.plugin.PrivacyPlugin
    @NotNull
    public Boolean getValue() {
        return Boolean.valueOf(this.isRunningForeground);
    }
}
