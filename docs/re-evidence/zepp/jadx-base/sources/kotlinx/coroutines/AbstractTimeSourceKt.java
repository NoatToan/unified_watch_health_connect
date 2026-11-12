package kotlinx.coroutines;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.notification.TransportUri;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\t\u0010\u0001\u001a\u00020\u0000H\u0081\b\u001a\t\u0010\u0002\u001a\u00020\u0000H\u0081\b\u001a\u0019\u0010\u0006\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0081\b\u001a\t\u0010\b\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\t\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\n\u001a\u00020\u0007H\u0081\b\u001a\t\u0010\u000b\u001a\u00020\u0007H\u0081\b\u001a\u0019\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0000H\u0081\b\u001a\u0011\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0081\b\"$\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0001\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"", "a", "b", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", TransportUri.ACTION_BLOCK, "i", "", "e", "f", GoogleApiAvailabilityLight.a, "h", "", "blocker", "nanos", "c", "Ljava/lang/Thread;", "thread", "g", "Lkotlinx/coroutines/AbstractTimeSource;", "Lkotlinx/coroutines/AbstractTimeSource;", "getTimeSource", "()Lkotlinx/coroutines/AbstractTimeSource;", "setTimeSource", "(Lkotlinx/coroutines/AbstractTimeSource;)V", "timeSource", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1})
public final class AbstractTimeSourceKt {

    @Nullable
    private static AbstractTimeSource a;

    @InlineOnly
    private static final long a() {
        AbstractTimeSource timeSource = getTimeSource();
        return timeSource == null ? System.currentTimeMillis() : timeSource.currentTimeMillis();
    }

    @InlineOnly
    private static final long b() {
        AbstractTimeSource timeSource = getTimeSource();
        return timeSource == null ? System.nanoTime() : timeSource.nanoTime();
    }

    @InlineOnly
    private static final void c(Object obj, long j) {
        AbstractTimeSource timeSource = getTimeSource();
        if (timeSource == null) {
            LockSupport.parkNanos(obj, j);
        } else {
            timeSource.parkNanos(obj, j);
        }
    }

    @InlineOnly
    private static final void d() {
        AbstractTimeSource timeSource = getTimeSource();
        if (timeSource == null) {
            return;
        }
        timeSource.registerTimeLoopThread();
    }

    @InlineOnly
    private static final void e() {
        AbstractTimeSource timeSource = getTimeSource();
        if (timeSource == null) {
            return;
        }
        timeSource.trackTask();
    }

    @InlineOnly
    private static final void f() {
        AbstractTimeSource timeSource = getTimeSource();
        if (timeSource == null) {
            return;
        }
        timeSource.unTrackTask();
    }

    @InlineOnly
    private static final void g(Thread thread) {
        AbstractTimeSource timeSource = getTimeSource();
        if (timeSource == null) {
            LockSupport.unpark(thread);
        } else {
            timeSource.unpark(thread);
        }
    }

    @Nullable
    public static final AbstractTimeSource getTimeSource() {
        return a;
    }

    @InlineOnly
    private static final void h() {
        AbstractTimeSource timeSource = getTimeSource();
        if (timeSource == null) {
            return;
        }
        timeSource.unregisterTimeLoopThread();
    }

    @InlineOnly
    private static final Runnable i(Runnable runnable) {
        AbstractTimeSource timeSource = getTimeSource();
        return timeSource == null ? runnable : timeSource.wrapTask(runnable);
    }

    public static final void setTimeSource(@Nullable AbstractTimeSource abstractTimeSource) {
        a = abstractTimeSource;
    }
}
