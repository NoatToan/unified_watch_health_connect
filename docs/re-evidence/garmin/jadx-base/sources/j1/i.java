package j1;

import androidx.camera.core.impl.k0;
import androidx.camera.core.impl.l0;
import androidx.camera.core.impl.z1;
import androidx.lifecycle.y0;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i implements z1.a<l0.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f96240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0<k.e> f96241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k.e f96242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f96243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l0.d f96244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f96245f = false;

    public i(k0 k0Var, y0<k.e> y0Var, l lVar) {
        this.f96240a = k0Var;
        this.f96241b = y0Var;
        this.f96243d = lVar;
        synchronized (this) {
            this.f96242c = y0Var.d();
        }
    }

    @Override // androidx.camera.core.impl.z1.a
    public final void a(l0.a aVar) {
        l0.a aVar2 = aVar;
        if (aVar2 == l0.a.CLOSING || aVar2 == l0.a.CLOSED || aVar2 == l0.a.RELEASING || aVar2 == l0.a.RELEASED) {
            b(k.e.IDLE);
            if (this.f96245f) {
                this.f96245f = false;
                l0.d dVar = this.f96244e;
                if (dVar != null) {
                    dVar.cancel(false);
                    this.f96244e = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((aVar2 == l0.a.OPENING || aVar2 == l0.a.OPEN || aVar2 == l0.a.PENDING_OPEN) && !this.f96245f) {
            k0 k0Var = this.f96240a;
            b(k.e.IDLE);
            ArrayList arrayList = new ArrayList();
            androidx.concurrent.futures.b.a aVar3 = new androidx.concurrent.futures.b.a();
            androidx.concurrent.futures.b.d<T> dVar2 = new androidx.concurrent.futures.b.d<>(aVar3);
            aVar3.f6080b = dVar2;
            aVar3.f6079a = v.h.class;
            try {
                h hVar = new h(this, aVar3, k0Var);
                arrayList.add(hVar);
                k0Var.l(k0.b.a(), hVar);
                aVar3.f6079a = "waitForCaptureResult";
            } catch (Exception e4) {
                dVar2.a(e4);
            }
            l0.b bVarJ = l0.j.j(l0.d.a(dVar2), new f(this), k0.b.a());
            f fVar = new f(this);
            l0.b bVarJ2 = l0.j.j(bVarJ, new l0.i(fVar), k0.b.a());
            this.f96244e = bVarJ2;
            l0.j.a(bVarJ2, new g(this, arrayList, k0Var), k0.b.a());
            this.f96245f = true;
        }
    }

    public final void b(k.e eVar) {
        synchronized (this) {
            try {
                if (this.f96242c.equals(eVar)) {
                    return;
                }
                this.f96242c = eVar;
                Objects.toString(eVar);
                this.f96241b.j(eVar);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.camera.core.impl.z1.a
    public final void onError(Throwable th3) {
        l0.d dVar = this.f96244e;
        if (dVar != null) {
            dVar.cancel(false);
            this.f96244e = null;
        }
        b(k.e.IDLE);
    }
}
