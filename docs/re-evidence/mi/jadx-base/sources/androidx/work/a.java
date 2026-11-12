package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.a;
import defpackage.cb3;
import defpackage.lhe;
import defpackage.m1p;
import defpackage.q0a;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    private Context mAppContext;
    private final AtomicInteger mStopReason = new AtomicInteger(WorkInfo.STOP_REASON_NOT_STOPPED);
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    /* JADX INFO: renamed from: androidx.work.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0080a {

        /* JADX INFO: renamed from: androidx.work.a$a$a, reason: collision with other inner class name */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final class C0081a extends AbstractC0080a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Data f3184a;

            public C0081a() {
                this(Data.EMPTY);
            }

            public Data e() {
                return this.f3184a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0081a.class != obj.getClass()) {
                    return false;
                }
                return this.f3184a.equals(((C0081a) obj).f3184a);
            }

            public int hashCode() {
                return (C0081a.class.getName().hashCode() * 31) + this.f3184a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f3184a + AbstractJsonLexerKt.END_OBJ;
            }

            public C0081a(Data data) {
                this.f3184a = data;
            }
        }

        /* JADX INFO: renamed from: androidx.work.a$a$b */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final class b extends AbstractC0080a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* JADX INFO: renamed from: androidx.work.a$a$c */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final class c extends AbstractC0080a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Data f3185a;

            public c() {
                this(Data.EMPTY);
            }

            public Data e() {
                return this.f3185a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f3185a.equals(((c) obj).f3185a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f3185a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f3185a + AbstractJsonLexerKt.END_OBJ;
            }

            public c(Data data) {
                this.f3185a = data;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public AbstractC0080a() {
        }

        public static AbstractC0080a a() {
            return new C0081a();
        }

        public static AbstractC0080a b() {
            return new b();
        }

        public static AbstractC0080a c() {
            return new c();
        }

        public static AbstractC0080a d(Data data) {
            return new c(data);
        }
    }

    public a(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$getForegroundInfoAsync$0(cb3.a aVar) throws Exception {
        aVar.f(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
        return "default failing getForegroundInfoAsync";
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.a();
    }

    public lhe<q0a> getForegroundInfoAsync() {
        return cb3.a(new cb3.c() { // from class: she
            @Override // cb3.c
            public final Object a(cb3.a aVar) {
                return a.lambda$getForegroundInfoAsync$0(aVar);
            }
        });
    }

    public final UUID getId() {
        return this.mWorkerParams.d();
    }

    public final Data getInputData() {
        return this.mWorkerParams.e();
    }

    @RequiresApi(28)
    public final Network getNetwork() {
        return this.mWorkerParams.f();
    }

    @IntRange(from = 0)
    public final int getRunAttemptCount() {
        return this.mWorkerParams.h();
    }

    @RequiresApi(31)
    public final int getStopReason() {
        return this.mStopReason.get();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.j();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public m1p getTaskExecutor() {
        return this.mWorkerParams.k();
    }

    @RequiresApi(24)
    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.l();
    }

    @RequiresApi(24)
    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.m();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public WorkerFactory getWorkerFactory() {
        return this.mWorkerParams.o();
    }

    public final boolean isStopped() {
        return this.mStopReason.get() != -256;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final lhe<Void> setForegroundAsync(q0a q0aVar) {
        return this.mWorkerParams.b().a(getApplicationContext(), getId(), q0aVar);
    }

    public lhe<Void> setProgressAsync(Data data) {
        return this.mWorkerParams.g().a(getApplicationContext(), getId(), data);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract lhe<AbstractC0080a> startWork();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void stop(int i) {
        if (this.mStopReason.compareAndSet(WorkInfo.STOP_REASON_NOT_STOPPED, i)) {
            onStopped();
        }
    }
}
