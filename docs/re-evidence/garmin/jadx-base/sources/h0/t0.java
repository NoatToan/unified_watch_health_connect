package h0;

import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.l1;
import androidx.camera.core.impl.p1;
import androidx.camera.core.impl.w0;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.utils.ImageUtil;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class t0 implements p0, androidx.camera.core.b.a, v0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f80574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y f80575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k0 f80576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f80577e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f80573a = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f80578f = false;

    public t0(x xVar) {
        j0.u.a();
        this.f80574b = xVar;
        this.f80577e = new ArrayList();
    }

    @Override // h0.p0
    public final void a() {
        j0.u.a();
        ImageCaptureException imageCaptureException = new ImageCaptureException(3, "Camera is closed.", null);
        ArrayDeque<v0> arrayDeque = this.f80573a;
        for (v0 v0Var : arrayDeque) {
            v0Var.a().execute(new r0(1, v0Var, imageCaptureException));
        }
        arrayDeque.clear();
        for (k0 k0Var : new ArrayList(this.f80577e)) {
            k0Var.getClass();
            j0.u.a();
            if (!k0Var.f80524d.f6084b.isDone()) {
                j0.u.a();
                k0Var.f80527g = true;
                l0.b bVar = k0Var.f80529i;
                Objects.requireNonNull(bVar);
                bVar.cancel(true);
                k0Var.f80525e.d(imageCaptureException);
                k0Var.f80526f.b(null);
                j0.u.a();
                v0 v0Var2 = k0Var.f80521a;
                v0Var2.a().execute(new r0(1, v0Var2, imageCaptureException));
            }
        }
    }

    @Override // h0.p0
    public final void b(j jVar) {
        j0.u.a();
        this.f80573a.offer(jVar);
        d();
    }

    @Override // h0.p0
    public final void c(y yVar) {
        j0.u.a();
        this.f80575c = yVar;
        yVar.getClass();
        j0.u.a();
        s sVar = yVar.f80588c;
        sVar.getClass();
        j0.u.a();
        k7.h.f(sVar.f80557b != null, "The ImageReader is not initialized.");
        androidx.camera.core.g gVar = sVar.f80557b;
        synchronized (gVar.f5455a) {
            gVar.f5460f = this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        v0 v0Var;
        androidx.camera.core.impl.s sVar;
        p1 p1Var;
        j0.u.a();
        if (this.f80576d == null && !this.f80578f) {
            y yVar = this.f80575c;
            yVar.getClass();
            j0.u.a();
            if (yVar.f80588c.a() == 0 || (v0Var = (v0) this.f80573a.poll()) == null) {
                return;
            }
            k0 k0Var = new k0(v0Var, this);
            int i14 = 0;
            boolean z14 = true;
            k7.h.f(!(this.f80576d != null), null);
            this.f80576d = k0Var;
            j0.u.a();
            k0Var.f80523c.addListener(new q0(this, 1), k0.b.a());
            this.f80577e.add(k0Var);
            j0.u.a();
            k0Var.f80524d.addListener(new r0(i14, this, k0Var), k0.b.a());
            y yVar2 = this.f80575c;
            j0.u.a();
            androidx.concurrent.futures.b.d dVar = k0Var.f80523c;
            yVar2.getClass();
            j0.u.a();
            androidx.camera.core.impl.u0 u0Var = (androidx.camera.core.impl.u0) yVar2.f80586a.f(l1.Q, new b0.z(Arrays.asList(new w0.a())));
            Objects.requireNonNull(u0Var);
            int i15 = y.f80584f;
            y.f80584f = i15 + 1;
            b bVar = yVar2.f80590e;
            ArrayList arrayList = new ArrayList();
            String strValueOf = String.valueOf(u0Var.hashCode());
            List<w0> listA = u0Var.a();
            Objects.requireNonNull(listA);
            for (w0 w0Var : listA) {
                androidx.camera.core.impl.v0.a aVar = new androidx.camera.core.impl.v0.a();
                int i16 = i14;
                androidx.camera.core.impl.v0 v0Var2 = yVar2.f80587b;
                aVar.f5823c = v0Var2.f5815c;
                aVar.c(v0Var2.f5814b);
                aVar.a(v0Var.k());
                p1 p1Var2 = bVar.f80567c;
                Objects.requireNonNull(p1Var2);
                aVar.d(p1Var2);
                int i17 = bVar.f80450g;
                List<Integer> list = bVar.f80451h;
                y yVar3 = yVar2;
                androidx.camera.core.impl.u0 u0Var2 = u0Var;
                if (list.size() > 1 && (p1Var = bVar.f80568d) != null) {
                    aVar.d(p1Var);
                }
                p1 p1Var3 = bVar.f80569e;
                boolean z15 = p1Var3 != null ? 1 : i16;
                if (z15 != 0) {
                    Objects.requireNonNull(p1Var3);
                    aVar.d(p1Var3);
                }
                aVar.f5824d = z15;
                if (ImageUtil.c(i17) || i17 == 32) {
                    y.f80585g.getClass();
                    if (((ImageCaptureRotationOptionQuirk) o0.a.f128480a.b(ImageCaptureRotationOptionQuirk.class)) != null) {
                        androidx.camera.core.impl.h hVar = androidx.camera.core.impl.v0.f5810i;
                    } else {
                        aVar.f5822b.X(androidx.camera.core.impl.v0.f5810i, Integer.valueOf(v0Var.h()));
                    }
                    aVar.f5822b.X(androidx.camera.core.impl.v0.f5811j, Integer.valueOf(((v0Var.f() != null ? 1 : i16) == 0 || !j0.v.c(v0Var.c(), bVar.f80449f)) ? v0Var.e() : v0Var.b() == 0 ? 100 : 95));
                }
                aVar.c(w0Var.a().f5814b);
                aVar.f5827g.f5841a.put(strValueOf, Integer.valueOf(i16));
                aVar.f5827g.f5841a.put("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i15));
                aVar.b(bVar.f80565a);
                if (list.size() > 1 && (sVar = bVar.f80566b) != null) {
                    aVar.b(sVar);
                }
                arrayList.add(aVar.e());
                z14 = true;
                i14 = i16;
                yVar2 = yVar3;
                u0Var = u0Var2;
            }
            int i18 = i14;
            boolean z16 = z14;
            k7.d dVar2 = new k7.d(new n(arrayList, k0Var), new j0(u0Var, v0Var, k0Var, dVar, i15));
            n nVar = (n) dVar2.f103262a;
            Objects.requireNonNull(nVar);
            j0 j0Var = (j0) dVar2.f103263b;
            Objects.requireNonNull(j0Var);
            y yVar4 = this.f80575c;
            yVar4.getClass();
            j0.u.a();
            yVar4.f80590e.f80455l.accept(j0Var);
            j0.u.a();
            b0.l0 l0Var = b0.l0.this;
            synchronized (l0Var.f14016s) {
                try {
                    if (l0Var.f14016s.get() == null) {
                        l0Var.f14016s.set(Integer.valueOf(l0Var.H()));
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            x xVar = this.f80574b;
            List<androidx.camera.core.impl.v0> list2 = nVar.f80537a;
            b0.l0 l0Var2 = b0.l0.this;
            l0Var2.getClass();
            j0.u.a();
            ListenableFuture listenableFutureJ = l0Var2.d().j(l0Var2.f14015r, l0Var2.f14017t, list2);
            androidx.room.a0 a0Var = new androidx.room.a0(22);
            k0.c cVarA = k0.b.a();
            l0.j.a aVar2 = l0.j.f107810a;
            l0.b bVarJ = l0.j.j(listenableFutureJ, new l0.i(a0Var), cVarA);
            l0.j.a(bVarJ, new s0(this, nVar), k0.b.d());
            j0.u.a();
            if (k0Var.f80529i != null) {
                z16 = i18;
            }
            k7.h.f(z16, "CaptureRequestFuture can only be set once.");
            k0Var.f80529i = bVarJ;
        }
    }

    @Override // androidx.camera.core.b.a
    public final void e(androidx.camera.core.b bVar) {
        k0.b.d().execute(new q0(this, 0));
    }

    @Override // h0.p0
    public final void pause() {
        j0.u.a();
        this.f80578f = true;
        k0 k0Var = this.f80576d;
        if (k0Var != null) {
            j0.u.a();
            if (k0Var.f80524d.f6084b.isDone()) {
                return;
            }
            ImageCaptureException imageCaptureException = new ImageCaptureException(3, "The request is aborted silently and retried.", null);
            j0.u.a();
            k0Var.f80527g = true;
            l0.b bVar = k0Var.f80529i;
            Objects.requireNonNull(bVar);
            bVar.cancel(true);
            k0Var.f80525e.d(imageCaptureException);
            k0Var.f80526f.b(null);
            v0.a aVar = k0Var.f80522b;
            v0 v0Var = k0Var.f80521a;
            t0 t0Var = (t0) aVar;
            t0Var.getClass();
            j0.u.a();
            t0Var.f80573a.addFirst(v0Var);
            t0Var.d();
        }
    }

    @Override // h0.p0
    public final void resume() {
        j0.u.a();
        this.f80578f = false;
        d();
    }
}
