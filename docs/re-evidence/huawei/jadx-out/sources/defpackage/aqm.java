package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.ElementTypesAreNonnullByDefault;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class aqm {
    private static final aqy d = new aqy(aqm.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @CheckForNull
    private c f692c;

    public void d(Runnable runnable, Executor executor) {
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        synchronized (this) {
            if (!this.f691b) {
                this.f692c = new c(runnable, executor, this.f692c);
            } else {
                a(runnable, executor);
            }
        }
    }

    public void e() {
        synchronized (this) {
            if (this.f691b) {
                return;
            }
            this.f691b = true;
            c cVar = this.f692c;
            c cVar2 = null;
            this.f692c = null;
            while (cVar != null) {
                c cVar3 = cVar.f694b;
                cVar.f694b = cVar2;
                cVar2 = cVar;
                cVar = cVar3;
            }
            while (cVar2 != null) {
                a(cVar2.f693a, cVar2.f695c);
                cVar2 = cVar2.f694b;
            }
        }
    }

    private static void a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            d.b().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        c f694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Executor f695c;

        c(Runnable runnable, Executor executor, @CheckForNull c cVar) {
            this.f693a = runnable;
            this.f695c = executor;
            this.f694b = cVar;
        }
    }
}
