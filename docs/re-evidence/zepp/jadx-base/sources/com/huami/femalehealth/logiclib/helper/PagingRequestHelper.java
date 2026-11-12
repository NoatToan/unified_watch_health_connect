package com.huami.femalehealth.logiclib.helper;

import androidx.annotation.AnyThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public class PagingRequestHelper {
    private final Executor b;
    private final Object a = new Object();

    @GuardedBy("mLock")
    private final a[] c = {new a(RequestType.INITIAL), new a(RequestType.BEFORE), new a(RequestType.AFTER)};

    @NonNull
    public final CopyOnWriteArrayList<Listener> d = new CopyOnWriteArrayList<>();

    public interface Listener {
        void onStatusChange(@NonNull StatusReport report);
    }

    @FunctionalInterface
    public interface Request {

        public static class Callback {
            private final AtomicBoolean a = new AtomicBoolean();
            private final b b;
            private final PagingRequestHelper c;

            public Callback(b wrapper, PagingRequestHelper helper) {
                this.b = wrapper;
                this.c = helper;
            }

            public final void recordFailure(@NonNull Throwable throwable) {
                if (throwable == null) {
                    throw new IllegalArgumentException("You must provide a throwable describing the error to record the failure");
                }
                if (!this.a.compareAndSet(false, true)) {
                    throw new IllegalStateException("already called recordSuccess or recordFailure");
                }
                this.c.d(this.b, throwable);
            }

            public final void recordSuccess() {
                if (!this.a.compareAndSet(false, true)) {
                    throw new IllegalStateException("already called recordSuccess or recordFailure");
                }
                this.c.d(this.b, null);
            }
        }

        void run(Callback callback);
    }

    public enum RequestType {
        INITIAL,
        BEFORE,
        AFTER
    }

    public enum Status {
        RUNNING,
        SUCCESS,
        FAILED
    }

    public static final class StatusReport {

        @NonNull
        private final Throwable[] a;

        @NonNull
        public final Status after;

        @NonNull
        public final Status before;

        @NonNull
        public final Status initial;

        public StatusReport(@NonNull Status initial, @NonNull Status before, @NonNull Status after, @NonNull Throwable[] errors) {
            this.initial = initial;
            this.before = before;
            this.after = after;
            this.a = errors;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || StatusReport.class != o.getClass()) {
                return false;
            }
            StatusReport statusReport = (StatusReport) o;
            if (this.initial == statusReport.initial && this.before == statusReport.before && this.after == statusReport.after) {
                return Arrays.equals(this.a, statusReport.a);
            }
            return false;
        }

        @Nullable
        public Throwable getErrorFor(@NonNull RequestType type) {
            return this.a[type.ordinal()];
        }

        public boolean hasError() {
            Status status = this.initial;
            Status status2 = Status.FAILED;
            return status == status2 || this.before == status2 || this.after == status2;
        }

        public boolean hasRunning() {
            Status status = this.initial;
            Status status2 = Status.RUNNING;
            return status == status2 || this.before == status2 || this.after == status2;
        }

        public int hashCode() {
            return (((((this.initial.hashCode() * 31) + this.before.hashCode()) * 31) + this.after.hashCode()) * 31) + Arrays.hashCode(this.a);
        }

        public String toString() {
            return "StatusReport{initial=" + this.initial + ", before=" + this.before + ", after=" + this.after + ", mErrors=" + Arrays.toString(this.a) + '}';
        }
    }

    public class a {

        @NonNull
        public final RequestType a;

        @Nullable
        public b b;

        @Nullable
        public Request c;

        @Nullable
        public Throwable d;

        @NonNull
        public Status e = Status.SUCCESS;

        public a(RequestType requestType) {
            this.a = requestType;
        }
    }

    public static class b implements Runnable {

        @NonNull
        public final Request a;

        @NonNull
        public final PagingRequestHelper b;

        @NonNull
        public final RequestType c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                bVar.b.runIfNotRunning(bVar.c, bVar.a);
            }
        }

        public b(@NonNull Request request, @NonNull PagingRequestHelper helper, @NonNull RequestType type) {
            this.a = request;
            this.b = helper;
            this.c = type;
        }

        public void a(Executor service) {
            service.execute(new a());
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.run(new Request.Callback(this, this.b));
        }
    }

    public PagingRequestHelper(@NonNull Executor retryService) {
        this.b = retryService;
    }

    private void a(StatusReport report) {
        Iterator<Listener> it2 = this.d.iterator();
        while (it2.hasNext()) {
            it2.next().onStatusChange(report);
        }
    }

    @GuardedBy("mLock")
    private Status b(RequestType type) {
        return this.c[type.ordinal()].e;
    }

    @GuardedBy("mLock")
    private StatusReport c() {
        a[] aVarArr = this.c;
        return new StatusReport(b(RequestType.INITIAL), b(RequestType.BEFORE), b(RequestType.AFTER), new Throwable[]{aVarArr[0].d, aVarArr[1].d, aVarArr[2].d});
    }

    @AnyThread
    public boolean addListener(@NonNull Listener listener) {
        return this.d.add(listener);
    }

    @AnyThread
    @VisibleForTesting
    public void d(@NonNull b wrapper, @Nullable Throwable throwable) {
        StatusReport statusReportC;
        boolean z = throwable == null;
        boolean zIsEmpty = true ^ this.d.isEmpty();
        synchronized (this.a) {
            a aVar = this.c[wrapper.c.ordinal()];
            aVar.c = null;
            aVar.d = throwable;
            if (z) {
                aVar.b = null;
                aVar.e = Status.SUCCESS;
            } else {
                aVar.b = wrapper;
                aVar.e = Status.FAILED;
            }
            statusReportC = zIsEmpty ? c() : null;
        }
        if (statusReportC != null) {
            a(statusReportC);
        }
    }

    public boolean removeListener(@NonNull Listener listener) {
        return this.d.remove(listener);
    }

    public boolean retryAllFailed() {
        int i;
        int length = RequestType.values().length;
        b[] bVarArr = new b[length];
        synchronized (this.a) {
            for (int i2 = 0; i2 < RequestType.values().length; i2++) {
                a[] aVarArr = this.c;
                bVarArr[i2] = aVarArr[i2].b;
                aVarArr[i2].b = null;
            }
        }
        boolean z = false;
        for (i = 0; i < length; i++) {
            b bVar = bVarArr[i];
            if (bVar != null) {
                bVar.a(this.b);
                z = true;
            }
        }
        return z;
    }

    @AnyThread
    public boolean runIfNotRunning(@NonNull RequestType type, @NonNull Request request) {
        boolean z = !this.d.isEmpty();
        synchronized (this.a) {
            a aVar = this.c[type.ordinal()];
            if (aVar.c != null) {
                return false;
            }
            aVar.c = request;
            aVar.e = Status.RUNNING;
            aVar.b = null;
            aVar.d = null;
            StatusReport statusReportC = z ? c() : null;
            if (statusReportC != null) {
                a(statusReportC);
            }
            new b(request, this, type).run();
            return true;
        }
    }
}
