package com.google.android.datatransport.runtime;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;

/* JADX INFO: loaded from: classes2.dex */
@Singleton
public class TransportRuntime implements j {
    private static volatile k e;
    private final Clock a;
    private final Clock b;
    private final Scheduler c;
    private final Uploader d;

    @Inject
    public TransportRuntime(@WallTime Clock clock, @Monotonic Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        this.a = clock;
        this.b = clock2;
        this.c = scheduler;
        this.d = uploader;
        workInitializer.ensureContextsScheduled();
    }

    private EventInternal a(SendRequest sendRequest) {
        return EventInternal.builder().setEventMillis(this.a.getTime()).setUptimeMillis(this.b.getTime()).setTransportName(sendRequest.g()).setEncodedPayload(new EncodedPayload(sendRequest.b(), sendRequest.d())).setCode(sendRequest.c().getCode()).build();
    }

    private static Set<Encoding> b(Destination destination) {
        return destination instanceof EncodedDestination ? Collections.unmodifiableSet(((EncodedDestination) destination).getSupportedEncodings()) : Collections.singleton(Encoding.of("proto"));
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    @VisibleForTesting
    public static void c(k kVar, Callable<Void> callable) throws Throwable {
        k kVar2;
        synchronized (TransportRuntime.class) {
            kVar2 = e;
            e = kVar;
        }
        try {
            callable.call();
            synchronized (TransportRuntime.class) {
                e = kVar2;
            }
        } catch (Throwable th) {
            synchronized (TransportRuntime.class) {
                e = kVar2;
                throw th;
            }
        }
    }

    public static TransportRuntime getInstance() {
        k kVar = e;
        if (kVar != null) {
            return kVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void initialize(Context context) {
        if (e == null) {
            synchronized (TransportRuntime.class) {
                if (e == null) {
                    e = d.c().a(context).build();
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Uploader getUploader() {
        return this.d;
    }

    @Deprecated
    public TransportFactory newFactory(String str) {
        return new g(b(null), TransportContext.builder().setBackendName(str).build(), this);
    }

    @Override // com.google.android.datatransport.runtime.j
    public void send(SendRequest sendRequest, TransportScheduleCallback transportScheduleCallback) {
        this.c.schedule(sendRequest.f().withPriority(sendRequest.c().getPriority()), a(sendRequest), transportScheduleCallback);
    }

    public TransportFactory newFactory(Destination destination) {
        return new g(b(destination), TransportContext.builder().setBackendName(destination.getName()).setExtras(destination.getExtras()).build(), this);
    }
}
