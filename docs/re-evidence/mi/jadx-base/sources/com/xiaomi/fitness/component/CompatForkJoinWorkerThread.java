package com.xiaomi.fitness.component;

import android.os.Process;
import androidx.annotation.RequiresApi;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(21)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/component/CompatForkJoinWorkerThread;", "Ljava/util/concurrent/ForkJoinWorkerThread;", "pool", "Ljava/util/concurrent/ForkJoinPool;", "mPriority", "", "<init>", "(Ljava/util/concurrent/ForkJoinPool;I)V", LifecycleConstantKt.ON_START, "", "component-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CompatForkJoinWorkerThread extends ForkJoinWorkerThread {
    private final int mPriority;

    public CompatForkJoinWorkerThread(@Nullable ForkJoinPool forkJoinPool, int i) {
        super(forkJoinPool);
        this.mPriority = i;
    }

    @Override // java.util.concurrent.ForkJoinWorkerThread
    public void onStart() {
        super.onStart();
        Process.setThreadPriority(this.mPriority);
    }
}
