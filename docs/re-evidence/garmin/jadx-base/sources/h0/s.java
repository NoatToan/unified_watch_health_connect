package h0;

import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.p1;
import com.google.auto.value.AutoValue;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.camera.core.g f80557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.camera.core.g f80558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.camera.core.g f80559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f80560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h0.b f80561f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j0 f80556a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d0 f80562g = null;

    public class a implements l0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j0 f80563a;

        public a(j0 j0Var) {
            this.f80563a = j0Var;
        }

        @Override // l0.c
        public final void onFailure(Throwable th3) {
            j0.u.a();
            s sVar = s.this;
            j0 j0Var = sVar.f80556a;
            if (this.f80563a == j0Var) {
                int i14 = j0Var.f80508a;
                d0 d0Var = sVar.f80562g;
                if (d0Var != null) {
                    d0Var.f80463b = null;
                }
                sVar.f80556a = null;
            }
        }

        @Override // l0.c
        public final /* bridge */ /* synthetic */ void onSuccess(Void r14) {
        }
    }

    @AutoValue
    public static abstract class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.camera.core.impl.s f80566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p1 f80567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public p1 f80568d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.camera.core.impl.s f80565a = new a(this);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public p1 f80569e = null;

        public class a extends androidx.camera.core.impl.s {
            public a(b bVar) {
            }
        }

        public abstract r0.f<p0.a> a();

        public abstract b0.p0 b();

        public abstract int c();

        public abstract List<Integer> d();

        public abstract e0 e();

        public abstract r0.f<j0> f();

        public abstract Size g();

        public abstract boolean h();
    }

    public final int a() {
        int iG;
        j0.u.a();
        k7.h.f(this.f80557b != null, "The ImageReader is not initialized.");
        androidx.camera.core.g gVar = this.f80557b;
        synchronized (gVar.f5455a) {
            iG = gVar.f5458d.g() - gVar.f5456b;
        }
        return iG;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004c  */
    public final void b(androidx.camera.core.e eVar) throws Exception {
        boolean z14;
        j0 j0Var;
        j0 j0Var2;
        j0.u.a();
        if (this.f80556a == null) {
            Objects.toString(eVar);
            eVar.close();
            return;
        }
        if (((Integer) eVar.A0().a().f5841a.get(this.f80556a.f80517j)) == null) {
            eVar.close();
            return;
        }
        j0.u.a();
        g gVar = this.f80560e;
        Objects.requireNonNull(gVar);
        gVar.f80468a.accept(new h(this.f80556a, eVar));
        j0 j0Var3 = this.f80556a;
        h0.b bVar = this.f80561f;
        if (bVar != null) {
            z14 = bVar.f80451h.size() > 1;
        }
        if (z14 && (j0Var2 = this.f80556a) != null) {
            j0Var2.f80509b.n(eVar.getFormat());
        }
        if (!z14 || ((j0Var = this.f80556a) != null && j0Var.f80509b.l())) {
            this.f80556a = null;
        }
        o0 o0Var = j0Var3.f80516i;
        int i14 = j0Var3.f80520m;
        if (i14 != -1 && i14 != 100) {
            j0Var3.f80520m = 100;
            k0 k0Var = (k0) o0Var;
            k0Var.getClass();
            j0.u.a();
            if (!k0Var.f80527g) {
                v0 v0Var = k0Var.f80521a;
                v0Var.a().execute(new u0(v0Var));
            }
        }
        k0 k0Var2 = (k0) o0Var;
        k0Var2.getClass();
        j0.u.a();
        if (k0Var2.f80527g) {
            return;
        }
        if (!k0Var2.f80528h) {
            k0Var2.b();
        }
        k0Var2.f80525e.b(null);
    }

    public final void c(j0 j0Var) {
        j0.u.a();
        k7.h.f(j0Var.f80518k.size() == 1, "only one capture stage is supported.");
        k7.h.f(a() > 0, "Too many acquire images. Close image to be able to process next.");
        this.f80556a = j0Var;
        l0.j.a(j0Var.f80519l, new a(j0Var), k0.b.a());
    }

    public final void d(p0.a aVar) {
        boolean z14;
        j0.u.a();
        j0 j0Var = this.f80556a;
        if (j0Var == null || j0Var.f80508a != aVar.b()) {
            return;
        }
        j0 j0Var2 = this.f80556a;
        ImageCaptureException imageCaptureExceptionA = aVar.a();
        k0 k0Var = (k0) j0Var2.f80516i;
        v0 v0Var = k0Var.f80521a;
        j0.u.a();
        if (k0Var.f80527g) {
            return;
        }
        v0Var.getClass();
        j0.u.a();
        int i14 = v0Var.f80581a;
        if (i14 > 0) {
            z14 = true;
            v0Var.f80581a = i14 - 1;
        } else {
            z14 = false;
        }
        if (!z14) {
            j0.u.a();
            v0 v0Var2 = k0Var.f80521a;
            v0Var2.a().execute(new r0(1, v0Var2, imageCaptureExceptionA));
        }
        k0Var.a();
        k0Var.f80525e.d(imageCaptureExceptionA);
        if (z14) {
            t0 t0Var = (t0) k0Var.f80522b;
            t0Var.getClass();
            j0.u.a();
            t0Var.f80573a.addFirst(v0Var);
            t0Var.d();
        }
    }
}
