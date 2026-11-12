package we;

import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import ue.e0;
import ve.q0;
import ve.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lwe/d;", "", "Lue/e0;", "runnableScheduler", "Lve/q0;", "launcher", "", "timeoutMs", "<init>", "(Lue/e0;Lve/q0;J)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f184723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f184724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f184725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f184726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f184727e;

    public d(e0 e0Var, q0 q0Var, long j8) {
        e0Var.getClass();
        q0Var.getClass();
        this.f184723a = e0Var;
        this.f184724b = q0Var;
        this.f184725c = j8;
        this.f184726d = new Object();
        this.f184727e = new LinkedHashMap();
    }

    public final void a(u uVar) {
        Runnable runnable;
        uVar.getClass();
        synchronized (this.f184726d) {
            runnable = (Runnable) this.f184727e.remove(uVar);
        }
        if (runnable != null) {
            this.f184723a.b(runnable);
        }
    }

    public final void b(u uVar) {
        uVar.getClass();
        vg1.d dVar = new vg1.d(9, this, uVar);
        synchronized (this.f184726d) {
        }
        this.f184723a.a(this.f184725c, dVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(e0 e0Var, q0 q0Var) {
        this(e0Var, q0Var, 0L, 4, null);
        e0Var.getClass();
        q0Var.getClass();
    }

    public /* synthetic */ d(e0 e0Var, q0 q0Var, long j8, int i14, j jVar) {
        this(e0Var, q0Var, (i14 & 4) != 0 ? 5400000L : j8);
    }
}
