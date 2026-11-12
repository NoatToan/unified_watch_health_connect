package kotlinx.coroutines;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u001e\u0010\u0018\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001a¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/e0;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "", "state", "", "b", "(I)Ljava/lang/Void;", GoogleApiAvailabilityLight.a, "()V", "a", "c", "(Ljava/lang/Throwable;)V", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "job", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "Ljava/lang/Thread;", "targetThread", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/DisposableHandle;", "cancelHandle", "<init>", "(Lkotlinx/coroutines/Job;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
final class e0 implements Function1<Throwable, Unit> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(e0.class, "_state");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Job job;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private DisposableHandle cancelHandle;

    @NotNull
    private volatile /* synthetic */ int _state = 0;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Thread targetThread = Thread.currentThread();

    public e0(@NotNull Job job) {
        this.job = job;
    }

    private final Void b(int state) {
        throw new IllegalStateException(Intrinsics.stringPlus("Illegal state ", Integer.valueOf(state)).toString());
    }

    public final void a() {
        while (true) {
            int i = this._state;
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        b(i);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (d.compareAndSet(this, i, 1)) {
                DisposableHandle disposableHandle = this.cancelHandle;
                if (disposableHandle == null) {
                    return;
                }
                disposableHandle.dispose();
                return;
            }
        }
    }

    public void c(@Nullable Throwable cause) {
        int i;
        do {
            i = this._state;
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                b(i);
                throw new KotlinNothingValueException();
            }
        } while (!d.compareAndSet(this, i, 2));
        this.targetThread.interrupt();
        this._state = 3;
    }

    public final void d() {
        int i;
        this.cancelHandle = this.job.invokeOnCompletion(true, true, this);
        do {
            i = this._state;
            if (i != 0) {
                if (i == 2 || i == 3) {
                    return;
                }
                b(i);
                throw new KotlinNothingValueException();
            }
        } while (!d.compareAndSet(this, i, 0));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        c(th);
        return Unit.INSTANCE;
    }
}
