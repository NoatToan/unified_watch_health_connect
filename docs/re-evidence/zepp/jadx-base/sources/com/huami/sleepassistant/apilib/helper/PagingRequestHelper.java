package com.huami.sleepassistant.apilib.helper;

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

/* JADX INFO: loaded from: classes13.dex */
public class PagingRequestHelper {
    private final Executor c;

    @NonNull
    private final CopyOnWriteArrayList<Listener> a = new CopyOnWriteArrayList<>();
    private final Object b = new Object();

    @GuardedBy("mLock")
    private final a[] d = {new a(RequestType.INITIAL), new a(RequestType.BEFORE), new a(RequestType.AFTER)};

    public interface Listener {
        void onStatusChange(@NonNull StatusReport statusReport);
    }

    @FunctionalInterface
    public interface Request {

        public static class Callback {
            private final AtomicBoolean a = new AtomicBoolean();
            private final b b;
            private final PagingRequestHelper c;

            public Callback(b bVar, PagingRequestHelper pagingRequestHelper) {
                this.b = bVar;
                this.c = pagingRequestHelper;
            }

            public final void recordFailure(@NonNull Throwable th) {
                if (th == null) {
                    throw new IllegalArgumentException("You must provide a throwable describing the error to record the failure");
                }
                if (!this.a.compareAndSet(false, true)) {
                    throw new IllegalStateException("already called recordSuccess or recordFailure");
                }
                this.c.e(this.b, th);
            }

            public final void recordSuccess() {
                if (!this.a.compareAndSet(false, true)) {
                    throw new IllegalStateException("already called recordSuccess or recordFailure");
                }
                this.c.e(this.b, null);
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

        public StatusReport(@NonNull Status status, @NonNull Status status2, @NonNull Status status3, @NonNull Throwable[] thArr) {
            this.initial = status;
            this.before = status2;
            this.after = status3;
            this.a = thArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || StatusReport.class != obj.getClass()) {
                return false;
            }
            StatusReport statusReport = (StatusReport) obj;
            if (this.initial == statusReport.initial && this.before == statusReport.before && this.after == statusReport.after) {
                return Arrays.equals(this.a, statusReport.a);
            }
            return false;
        }

        @Nullable
        public Throwable getErrorFor(@NonNull RequestType requestType) {
            return this.a[requestType.ordinal()];
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

    public static class a {

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

        public a(@NonNull RequestType requestType) {
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

        public b(@NonNull Request request, @NonNull PagingRequestHelper pagingRequestHelper, @NonNull RequestType requestType) {
            this.a = request;
            this.b = pagingRequestHelper;
            this.c = requestType;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            this.b.runIfNotRunning(this.c, this.a);
        }

        public void c(Executor executor) {
            executor.execute(new Runnable() { // from class: com.huami.sleepassistant.apilib.helper.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b();
                }
            });
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.run(new Request.Callback(this, this.b));
        }
    }

    public PagingRequestHelper(@NonNull Executor executor) {
        this.c = executor;
    }

    private void b(StatusReport statusReport) {
        Iterator<Listener> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().onStatusChange(statusReport);
        }
    }

    @GuardedBy("mLock")
    private Status c(RequestType requestType) {
        return this.d[requestType.ordinal()].e;
    }

    @GuardedBy("mLock")
    private StatusReport d() {
        a[] aVarArr = this.d;
        return new StatusReport(c(RequestType.INITIAL), c(RequestType.BEFORE), c(RequestType.AFTER), new Throwable[]{aVarArr[0].d, aVarArr[1].d, aVarArr[2].d});
    }

    /* JADX INFO: Access modifiers changed from: private */
    @AnyThread
    @VisibleForTesting
    public void e(@NonNull b bVar, @Nullable Throwable th) {
        StatusReport statusReportD;
        boolean z = th == null;
        boolean zIsEmpty = true ^ this.a.isEmpty();
        synchronized (this.b) {
            a aVar = this.d[bVar.c.ordinal()];
            aVar.c = null;
            aVar.d = th;
            if (z) {
                aVar.b = null;
                aVar.e = Status.SUCCESS;
            } else {
                aVar.b = bVar;
                aVar.e = Status.FAILED;
            }
            statusReportD = zIsEmpty ? d() : null;
        }
        if (statusReportD != null) {
            b(statusReportD);
        }
    }

    @AnyThread
    public boolean addListener(@NonNull Listener listener) {
        return this.a.add(listener);
    }

    public boolean removeListener(@NonNull Listener listener) {
        return this.a.remove(listener);
    }

    public boolean retryAllFailed() {
        int i;
        int length = RequestType.values().length;
        b[] bVarArr = new b[length];
        synchronized (this.b) {
            for (int i2 = 0; i2 < RequestType.values().length; i2++) {
                a[] aVarArr = this.d;
                bVarArr[i2] = aVarArr[i2].b;
                aVarArr[i2].b = null;
            }
        }
        boolean z = false;
        for (i = 0; i < length; i++) {
            b bVar = bVarArr[i];
            if (bVar != null) {
                bVar.c(this.c);
                z = true;
            }
        }
        return z;
    }

    @AnyThread
    public boolean runIfNotRunning(@NonNull RequestType requestType, @NonNull Request request) {
        boolean z = !this.a.isEmpty();
        synchronized (this.b) {
            a aVar = this.d[requestType.ordinal()];
            if (aVar.c != null) {
                return false;
            }
            aVar.c = request;
            aVar.e = Status.RUNNING;
            aVar.b = null;
            aVar.d = null;
            StatusReport statusReportD = z ? d() : null;
            if (statusReportD != null) {
                b(statusReportD);
            }
            new b(request, this, requestType).run();
            return true;
        }
    }
}
