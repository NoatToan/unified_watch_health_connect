package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ElementTypesAreNonnullByDefault;
import com.google.common.util.concurrent.FluentFuture;
import com.google.common.util.concurrent.InterruptibleTask;
import com.google.common.util.concurrent.ParametricNullness;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public class arl<V> extends FluentFuture.TrustedFuture<V> implements RunnableFuture<V> {

    @CheckForNull
    private volatile InterruptibleTask<?> e;

    public static <V> arl<V> d(Callable<V> callable) {
        return new arl<>(callable);
    }

    public static <V> arl<V> b(Runnable runnable, @ParametricNullness V v) {
        return new arl<>(Executors.callable(runnable, v));
    }

    arl(Callable<V> callable) {
        this.e = new b(callable);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        InterruptibleTask<?> interruptibleTask = this.e;
        if (interruptibleTask != null) {
            interruptibleTask.run();
        }
        this.e = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public void afterDone() {
        InterruptibleTask<?> interruptibleTask;
        super.afterDone();
        if (wasInterrupted() && (interruptibleTask = this.e) != null) {
            interruptibleTask.interruptTask();
        }
        this.e = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @CheckForNull
    public String pendingToString() {
        InterruptibleTask<?> interruptibleTask = this.e;
        if (interruptibleTask != null) {
            return "task=[" + interruptibleTask + "]";
        }
        return super.pendingToString();
    }

    final class b extends InterruptibleTask<V> {
        private final Callable<V> d;

        b(Callable<V> callable) {
            this.d = (Callable) Preconditions.checkNotNull(callable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public final boolean isDone() {
            return arl.this.isDone();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        @ParametricNullness
        public V runInterruptibly() throws Exception {
            return this.d.call();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public void afterRanInterruptiblySuccess(@ParametricNullness V v) {
            arl.this.set(v);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public void afterRanInterruptiblyFailure(Throwable th) {
            arl.this.setException(th);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        public String toPendingString() {
            return this.d.toString();
        }
    }
}
