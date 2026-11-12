package androidx.camera.core;

import androidx.camera.core.impl.o1;
import b0.i0;
import b0.k0;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import l0.j;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i0 {
    public b A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Executor f5434x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f5435y = new Object();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public e f5436z;

    public class a implements l0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f5437a;

        public a(c cVar, b bVar) {
            this.f5437a = bVar;
        }

        @Override // l0.c
        public final void onFailure(Throwable th3) throws Exception {
            this.f5437a.close();
        }

        @Override // l0.c
        public final /* bridge */ /* synthetic */ void onSuccess(Void r14) {
        }
    }

    public static class b extends androidx.camera.core.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final WeakReference<c> f5438d;

        public b(e eVar, c cVar) {
            super(eVar);
            this.f5438d = new WeakReference<>(cVar);
            a(new k0(this, 0));
        }
    }

    public c(Executor executor) {
        this.f5434x = executor;
    }

    @Override // b0.i0
    public final e b(o1 o1Var) {
        return o1Var.b();
    }

    @Override // b0.i0
    public final void d() {
        synchronized (this.f5435y) {
            try {
                e eVar = this.f5436z;
                if (eVar != null) {
                    eVar.close();
                    this.f5436z = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // b0.i0
    public final void f(e eVar) {
        synchronized (this.f5435y) {
            try {
                if (!this.f13961w) {
                    eVar.close();
                    return;
                }
                if (this.A == null) {
                    b bVar = new b(eVar, this);
                    this.A = bVar;
                    j.a(c(bVar), new a(this, bVar), k0.b.a());
                } else {
                    if (eVar.A0().getTimestamp() <= this.A.f5432b.A0().getTimestamp()) {
                        eVar.close();
                    } else {
                        e eVar2 = this.f5436z;
                        if (eVar2 != null) {
                            eVar2.close();
                        }
                        this.f5436z = eVar;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
