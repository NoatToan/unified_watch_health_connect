package defpackage;

import androidx.annotation.RestrictTo;
import androidx.work.impl.model.WorkGenerationalId;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class onr {
    public static final String e = ppe.i("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1l f29326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<WorkGenerationalId, b> f29327b = new HashMap();
    public final Map<WorkGenerationalId, a> c = new HashMap();
    public final Object d = new Object();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface a {
        void a(WorkGenerationalId workGenerationalId);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final onr f29328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WorkGenerationalId f29329b;

        public b(onr onrVar, WorkGenerationalId workGenerationalId) {
            this.f29328a = onrVar;
            this.f29329b = workGenerationalId;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f29328a.d) {
                try {
                    if (this.f29328a.f29327b.remove(this.f29329b) != null) {
                        a aVarRemove = this.f29328a.c.remove(this.f29329b);
                        if (aVarRemove != null) {
                            aVarRemove.a(this.f29329b);
                        }
                    } else {
                        ppe.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f29329b));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public onr(h1l h1lVar) {
        this.f29326a = h1lVar;
    }

    public void a(WorkGenerationalId workGenerationalId, long j, a aVar) {
        synchronized (this.d) {
            ppe.e().a(e, "Starting timer for " + workGenerationalId);
            b(workGenerationalId);
            b bVar = new b(this, workGenerationalId);
            this.f29327b.put(workGenerationalId, bVar);
            this.c.put(workGenerationalId, aVar);
            this.f29326a.b(j, bVar);
        }
    }

    public void b(WorkGenerationalId workGenerationalId) {
        synchronized (this.d) {
            try {
                if (this.f29327b.remove(workGenerationalId) != null) {
                    ppe.e().a(e, "Stopping timer for " + workGenerationalId);
                    this.c.remove(workGenerationalId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
