package io.netty.util.concurrent;

/* JADX INFO: loaded from: classes22.dex */
public interface EventExecutorChooserFactory {

    public interface EventExecutorChooser {
        EventExecutor next();
    }

    EventExecutorChooser newChooser(EventExecutor[] eventExecutorArr);
}
