package androidx.work;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.atomic.AtomicInteger;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WorkerParameters f11470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f11471c = new AtomicInteger(-256);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11472d;

    public d(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            h.s("Application Context is null");
            throw null;
        }
        if (workerParameters == null) {
            h.s("WorkerParameters is null");
            throw null;
        }
        this.f11469a = context;
        this.f11470b = workerParameters;
    }

    public androidx.concurrent.futures.b.d a() {
        androidx.concurrent.futures.b.a aVar = new androidx.concurrent.futures.b.a();
        androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
        aVar.f6080b = dVar;
        aVar.f6079a = v.h.class;
        try {
            aVar.d(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
            aVar.f6079a = "default failing getForegroundInfoAsync";
        } catch (Exception e4) {
            dVar.a(e4);
        }
        return dVar;
    }

    public abstract androidx.concurrent.futures.b.d b();

    public static abstract class a {

        public static final class b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public final int hashCode() {
                return b.class.getName().hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }

        /* JADX INFO: renamed from: androidx.work.d$a$a, reason: collision with other inner class name */
        public static final class C0165a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final androidx.work.c f11473a;

            public C0165a() {
                this(androidx.work.c.f11465c);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0165a.class != obj.getClass()) {
                    return false;
                }
                return this.f11473a.equals(((C0165a) obj).f11473a);
            }

            public final int hashCode() {
                return this.f11473a.hashCode() + (C0165a.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Failure {mOutputData=" + this.f11473a + CoreConstants.CURLY_RIGHT;
            }

            public C0165a(androidx.work.c cVar) {
                this.f11473a = cVar;
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final androidx.work.c f11474a;

            public c() {
                this(androidx.work.c.f11465c);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f11474a.equals(((c) obj).f11474a);
            }

            public final int hashCode() {
                return this.f11474a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Success {mOutputData=" + this.f11474a + CoreConstants.CURLY_RIGHT;
            }

            public c(androidx.work.c cVar) {
                this.f11474a = cVar;
            }
        }
    }
}
