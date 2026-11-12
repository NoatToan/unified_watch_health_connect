package com.facebook.bolts;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.twitter.sdk.android.tweetcomposer.g;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b6\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\u0006H\u0002J\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u0019\u0010\u0015\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001e\u001a\u00020\u001dH\u0016R\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010#R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u001c\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0013\u00100\u001a\u00020*8F@\u0006¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u00105\u001a\u0002028F@\u0006¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/facebook/bolts/CancellationTokenSource;", "Ljava/io/Closeable;", "", "delay", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "", "a", "", "Lcom/facebook/bolts/CancellationTokenRegistration;", "registrations", "c", GoogleApiAvailabilityLight.a, "b", g.g, "cancelAfter", "close", "Ljava/lang/Runnable;", "action", "register$facebook_core_release", "(Ljava/lang/Runnable;)Lcom/facebook/bolts/CancellationTokenRegistration;", "register", "throwIfCancellationRequested$facebook_core_release", "()V", "throwIfCancellationRequested", "registration", "unregister$facebook_core_release", "(Lcom/facebook/bolts/CancellationTokenRegistration;)V", MiPushClient.COMMAND_UNREGISTER, "", "toString", "", "Ljava/lang/Object;", "lock", "", "Ljava/util/List;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;", "executor", "Ljava/util/concurrent/ScheduledFuture;", "Ljava/util/concurrent/ScheduledFuture;", "scheduledCancellation", "", "e", "Z", "cancellationRequested", "f", "closed", "isCancellationRequested", "()Z", "Lcom/facebook/bolts/CancellationToken;", "getToken", "()Lcom/facebook/bolts/CancellationToken;", "token", "<init>", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class CancellationTokenSource implements Closeable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<CancellationTokenRegistration> registrations = new ArrayList();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final ScheduledExecutorService executor = BoltsExecutors.INSTANCE.scheduled$facebook_core_release();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private ScheduledFuture<?> scheduledCancellation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean cancellationRequested;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean closed;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "run", "()V", "com/facebook/bolts/CancellationTokenSource$cancelAfter$2$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements Runnable {
        public final /* synthetic */ long b;
        public final /* synthetic */ TimeUnit c;

        public a(long j, TimeUnit timeUnit) {
            this.b = j;
            this.c = timeUnit;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                synchronized (CancellationTokenSource.this.lock) {
                    CancellationTokenSource.this.scheduledCancellation = null;
                    Unit unit = Unit.INSTANCE;
                }
                CancellationTokenSource.this.cancel();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private final void a(long delay, TimeUnit timeUnit) {
        if (!(delay >= ((long) (-1)))) {
            throw new IllegalArgumentException("Delay must be >= -1".toString());
        }
        if (delay == 0) {
            cancel();
            return;
        }
        synchronized (this.lock) {
            if (this.cancellationRequested) {
                return;
            }
            b();
            if (delay != -1) {
                this.scheduledCancellation = this.executor.schedule(new a(delay, timeUnit), delay, timeUnit);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void b() {
        ScheduledFuture<?> scheduledFuture = this.scheduledCancellation;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.scheduledCancellation = null;
        }
    }

    private final void c(List<CancellationTokenRegistration> registrations) {
        Iterator<CancellationTokenRegistration> it2 = registrations.iterator();
        while (it2.hasNext()) {
            it2.next().runAction$facebook_core_release();
        }
    }

    private final void d() {
        if (!(!this.closed)) {
            throw new IllegalStateException("Object already closed".toString());
        }
    }

    public final void cancel() {
        synchronized (this.lock) {
            d();
            if (this.cancellationRequested) {
                return;
            }
            b();
            this.cancellationRequested = true;
            ArrayList arrayList = new ArrayList(this.registrations);
            Unit unit = Unit.INSTANCE;
            c(arrayList);
        }
    }

    public final void cancelAfter(long delay) {
        a(delay, TimeUnit.MILLISECONDS);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            b();
            Iterator<CancellationTokenRegistration> it2 = this.registrations.iterator();
            while (it2.hasNext()) {
                it2.next().close();
            }
            this.registrations.clear();
            this.closed = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    public final CancellationToken getToken() {
        CancellationToken cancellationToken;
        synchronized (this.lock) {
            d();
            cancellationToken = new CancellationToken(this);
        }
        return cancellationToken;
    }

    public final boolean isCancellationRequested() {
        boolean z;
        synchronized (this.lock) {
            d();
            z = this.cancellationRequested;
        }
        return z;
    }

    @NotNull
    public final CancellationTokenRegistration register$facebook_core_release(@Nullable Runnable action) {
        CancellationTokenRegistration cancellationTokenRegistration;
        synchronized (this.lock) {
            d();
            cancellationTokenRegistration = new CancellationTokenRegistration(this, action);
            if (this.cancellationRequested) {
                cancellationTokenRegistration.runAction$facebook_core_release();
                Unit unit = Unit.INSTANCE;
            } else {
                this.registrations.add(cancellationTokenRegistration);
            }
        }
        return cancellationTokenRegistration;
    }

    public final void throwIfCancellationRequested$facebook_core_release() throws CancellationException {
        synchronized (this.lock) {
            d();
            if (this.cancellationRequested) {
                throw new CancellationException();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    public String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", Arrays.copyOf(new Object[]{CancellationTokenSource.class.getName(), Integer.toHexString(hashCode()), Boolean.toString(isCancellationRequested())}, 3));
    }

    public final void unregister$facebook_core_release(@NotNull CancellationTokenRegistration registration) {
        synchronized (this.lock) {
            d();
            this.registrations.remove(registration);
        }
    }
}
