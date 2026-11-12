package com.xiaomi.fitness.baseui.recyclerview.viewholder;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.c;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.nfe;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/baseui/recyclerview/viewholder/ViewHolderLifecycleObserver;", "Lnfe;", "Landroidx/lifecycle/Lifecycle$State;", "state", "", "setLifecycleState", "(Landroidx/lifecycle/Lifecycle$State;)V", "create", "()V", StatConstants.PARAM_START, "resume", "pause", BroadcastsKt.SILENT_PUSHING_STOP, "destroy", "Landroidx/lifecycle/Lifecycle;", "outerLifecycle", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/LifecycleRegistry;", "lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "<init>", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/LifecycleRegistry;)V", "ui_release"}, k = 1, mv = {2, 0, 0})
public final class ViewHolderLifecycleObserver implements nfe {

    @NotNull
    private final LifecycleRegistry lifecycleRegistry;

    @NotNull
    private final Lifecycle outerLifecycle;

    public ViewHolderLifecycleObserver(@NotNull Lifecycle outerLifecycle, @NotNull LifecycleRegistry lifecycleRegistry) {
        Intrinsics.checkNotNullParameter(outerLifecycle, "outerLifecycle");
        Intrinsics.checkNotNullParameter(lifecycleRegistry, "lifecycleRegistry");
        this.outerLifecycle = outerLifecycle;
        this.lifecycleRegistry = lifecycleRegistry;
    }

    private final void setLifecycleState(Lifecycle.State state) {
        try {
            this.lifecycleRegistry.setCurrentState(state);
        } catch (Exception e) {
            Logger.e("set lifecycle state exception:" + e, new Object[0]);
        }
    }

    @c(Lifecycle.Event.ON_CREATE)
    public final void create() {
        Lifecycle.State state = this.outerLifecycle.getState();
        Lifecycle.State state2 = Lifecycle.State.CREATED;
        if (state == state2) {
            setLifecycleState(state2);
        }
    }

    @c(Lifecycle.Event.ON_DESTROY)
    public final void destroy() {
        setLifecycleState(Lifecycle.State.DESTROYED);
    }

    @c(Lifecycle.Event.ON_PAUSE)
    public final void pause() {
        Lifecycle.State state = this.outerLifecycle.getState();
        Lifecycle.State state2 = Lifecycle.State.STARTED;
        if (state.isAtLeast(state2)) {
            setLifecycleState(state2);
        }
    }

    @c(Lifecycle.Event.ON_RESUME)
    public final void resume() {
        setLifecycleState(Lifecycle.State.RESUMED);
    }

    @c(Lifecycle.Event.ON_START)
    public final void start() {
        Lifecycle.State state = this.outerLifecycle.getState();
        Lifecycle.State state2 = Lifecycle.State.STARTED;
        if (state == state2) {
            setLifecycleState(state2);
        }
    }

    @c(Lifecycle.Event.ON_STOP)
    public final void stop() {
        Lifecycle.State state = this.outerLifecycle.getState();
        Lifecycle.State state2 = Lifecycle.State.CREATED;
        if (state.isAtLeast(state2)) {
            setLifecycleState(state2);
        }
    }
}
