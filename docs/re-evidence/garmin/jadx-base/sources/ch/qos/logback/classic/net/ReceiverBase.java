package ch.qos.logback.classic.net;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.LifeCycle;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ReceiverBase extends ContextAwareBase implements LifeCycle {
    private boolean started;

    public abstract Runnable getRunnableTask();

    @Override // ch.qos.logback.core.spi.LifeCycle
    public final boolean isStarted() {
        return this.started;
    }

    public abstract void onStop();

    public abstract boolean shouldStart();

    @Override // ch.qos.logback.core.spi.LifeCycle
    public final void start() {
        if (isStarted()) {
            return;
        }
        if (getContext() == null) {
            h.z("context not set");
        } else if (shouldStart()) {
            getContext().getScheduledExecutorService().execute(getRunnableTask());
            this.started = true;
        }
    }

    @Override // ch.qos.logback.core.spi.LifeCycle
    public final void stop() {
        if (isStarted()) {
            try {
                onStop();
            } catch (RuntimeException e4) {
                addError("on stop: " + e4, e4);
            }
            this.started = false;
        }
    }
}
