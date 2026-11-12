package kotlinx.coroutines.guava;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.l0m;
import defpackage.l9q;
import defpackage.lhe;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b/\u00100J\u0019\u0010\u0005\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0010\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0016J#\u0010\u001d\u001a\u00020\u001c2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\u000fJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R,\u0010+\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0003 **\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010)0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00061"}, d2 = {"Lkotlinx/coroutines/guava/JobListenableFuture;", "T", "Llhe;", "", "result", "getInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "complete", "(Ljava/lang/Object;)Z", "", DeviceTagInterface.CUSTOM_TAG_TYPE, "completeExceptionallyOrCancel", "(Ljava/lang/Throwable;)Z", "isCancelled", "()Z", "get", "()Ljava/lang/Object;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljava/util/concurrent/Executor;", "executor", "", "addListener", "(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V", "isDone", "mayInterruptIfRunning", BroadcastsKt.SILENT_PUSHING_CANCEL, "(Z)Z", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/Job;", "jobToCancel", "Lkotlinx/coroutines/Job;", "Ll0m;", "kotlin.jvm.PlatformType", "auxFuture", "Ll0m;", "auxFutureIsFailed", "Z", "<init>", "(Lkotlinx/coroutines/Job;)V", "kotlinx-coroutines-guava"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nListenableFuture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListenableFuture.kt\nkotlinx/coroutines/guava/JobListenableFuture\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,509:1\n1#2:510\n*E\n"})
final class JobListenableFuture<T> implements lhe<T> {
    private final l0m<Object> auxFuture = l0m.F();
    private boolean auxFutureIsFailed;

    @NotNull
    private final Job jobToCancel;

    public JobListenableFuture(@NotNull Job job) {
        this.jobToCancel = job;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final T getInternal(Object result) throws Throwable {
        if (result instanceof Cancelled) {
            throw new CancellationException().initCause(((Cancelled) result).exception);
        }
        return result;
    }

    @Override // defpackage.lhe
    public void addListener(@NotNull Runnable listener, @NotNull Executor executor) {
        this.auxFuture.addListener(listener, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        if (!this.auxFuture.cancel(mayInterruptIfRunning)) {
            return false;
        }
        Job.DefaultImpls.cancel$default(this.jobToCancel, (CancellationException) null, 1, (Object) null);
        return true;
    }

    public final boolean complete(T result) {
        return this.auxFuture.B(result);
    }

    public final boolean completeExceptionallyOrCancel(@NotNull Throwable t) {
        if (t instanceof CancellationException) {
            return this.auxFuture.B(new Cancelled((CancellationException) t));
        }
        boolean zC = this.auxFuture.C(t);
        if (!zC) {
            return zC;
        }
        this.auxFutureIsFailed = true;
        return zC;
    }

    @Override // java.util.concurrent.Future
    public T get() {
        return getInternal(this.auxFuture.get());
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        if (this.auxFuture.isCancelled()) {
            return true;
        }
        if (isDone() && !this.auxFutureIsFailed) {
            try {
                if (l9q.a(this.auxFuture) instanceof Cancelled) {
                    return true;
                }
            } catch (CancellationException unused) {
                return true;
            } catch (ExecutionException unused2) {
                this.auxFutureIsFailed = true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.auxFuture.isDone();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isDone()) {
            try {
                Object objA = l9q.a(this.auxFuture);
                if (objA instanceof Cancelled) {
                    sb.append("CANCELLED, cause=[" + ((Cancelled) objA).exception + AbstractJsonLexerKt.END_LIST);
                } else {
                    sb.append("SUCCESS, result=[" + objA + AbstractJsonLexerKt.END_LIST);
                }
            } catch (CancellationException unused) {
                sb.append("CANCELLED");
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[" + e.getCause() + AbstractJsonLexerKt.END_LIST);
            } catch (Throwable th) {
                sb.append("UNKNOWN, cause=[" + th.getClass() + " thrown from get()]");
            }
        } else {
            sb.append("PENDING, delegate=[" + this.auxFuture + AbstractJsonLexerKt.END_LIST);
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // java.util.concurrent.Future
    public T get(long timeout, @NotNull TimeUnit unit) {
        return getInternal(this.auxFuture.get(timeout, unit));
    }
}
