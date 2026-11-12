package androidx.health.platform.client.impl.internal;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import defpackage.se4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/health/platform/client/impl/internal/ProviderConnectionManager;", "", "Landroid/os/Looper;", "startHandlerThread", "()Landroid/os/Looper;", "Landroid/content/Context;", "context", "Lse4;", "getInstance", "(Landroid/content/Context;)Lse4;", "instance", "Lse4;", "<init>", "()V", "connect-client_release"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class ProviderConnectionManager {

    @NotNull
    public static final ProviderConnectionManager INSTANCE = new ProviderConnectionManager();

    @Nullable
    private static se4 instance;

    private ProviderConnectionManager() {
    }

    private final Looper startHandlerThread() {
        HandlerThread handlerThread = new HandlerThread("ProviderConnectionManager", 9);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        Intrinsics.checkNotNullExpressionValue(looper, "handlerThread.getLooper()");
        return looper;
    }

    @NotNull
    public final se4 getInstance(@NotNull Context context) {
        se4 se4Var;
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (this) {
            try {
                if (instance == null) {
                    instance = new se4(context.getApplicationContext(), INSTANCE.startHandlerThread());
                }
                se4Var = instance;
                Intrinsics.checkNotNull(se4Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return se4Var;
    }
}
