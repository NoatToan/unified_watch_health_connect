package v;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.c3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.camera.core.impl.p1 f174106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.camera.core.impl.l2 f174107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f174108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f174109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f174110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.camera.core.impl.l2.c f174111f;

    public class a implements l0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Surface f174112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SurfaceTexture f174113b;

        public a(w1 w1Var, Surface surface, SurfaceTexture surfaceTexture) {
            this.f174112a = surface;
            this.f174113b = surfaceTexture;
        }

        @Override // l0.c
        public final void onFailure(Throwable th3) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th3);
        }

        @Override // l0.c
        public final void onSuccess(Void r14) {
            this.f174112a.release();
            this.f174113b.release();
        }
    }

    public static class b implements b3<b0.i1> {
        public final androidx.camera.core.impl.w1 N;

        public b() {
            androidx.camera.core.impl.w1 w1VarU = androidx.camera.core.impl.w1.U();
            w1VarU.X(b3.f5510w, new m0());
            w1VarU.X(androidx.camera.core.impl.m1.f5632h, 34);
            w1VarU.X(m0.m.L, w1.class);
            w1VarU.X(m0.m.K, w1.class.getCanonicalName() + "-" + UUID.randomUUID());
            this.N = w1VarU;
        }

        @Override // androidx.camera.core.impl.j2
        public final androidx.camera.core.impl.x0 getConfig() {
            return this.N;
        }

        @Override // androidx.camera.core.impl.b3
        public final c3.b y() {
            return c3.b.METERING_REPEATING;
        }
    }

    public interface c {
    }

    public w1(androidx.camera.camera2.internal.compat.h hVar, g1 g1Var, c cVar) {
        Size size;
        y.s sVar = new y.s();
        Size size2 = null;
        this.f174111f = null;
        this.f174108c = new b();
        this.f174110e = cVar;
        Size[] sizeArrA = hVar.c().a(34);
        if (sizeArrA == null) {
            size = new Size(0, 0);
        } else {
            if (sVar.f192963a != null && "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
                ArrayList arrayList = new ArrayList();
                for (Size size3 : sizeArrA) {
                    if (y.s.f192962c.compare(size3, y.s.f192961b) >= 0) {
                        arrayList.add(size3);
                    }
                }
                sizeArrA = (Size[]) arrayList.toArray(new Size[0]);
            }
            List listAsList = Arrays.asList(sizeArrA);
            Collections.sort(listAsList, new tl2.g(1));
            Size sizeE = g1Var.e();
            long jMin = Math.min(((long) sizeE.getWidth()) * ((long) sizeE.getHeight()), 307200L);
            int length = sizeArrA.length;
            int i14 = 0;
            while (i14 < length) {
                Size size4 = sizeArrA[i14];
                long width = ((long) size4.getWidth()) * ((long) size4.getHeight());
                if (width == jMin) {
                    size = size4;
                } else if (width <= jMin) {
                    i14++;
                    size2 = size4;
                } else if (size2 != null) {
                    size = size2;
                }
            }
            size = (Size) listAsList.get(0);
        }
        this.f174109d = size;
        Objects.toString(size);
        this.f174107b = a();
    }

    public final androidx.camera.core.impl.l2 a() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = this.f174109d;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        androidx.camera.core.impl.l2.b bVarD = androidx.camera.core.impl.l2.b.d(this.f174108c, size);
        bVarD.f5612b.f5823c = 1;
        androidx.camera.core.impl.p1 p1Var = new androidx.camera.core.impl.p1(surface);
        this.f174106a = p1Var;
        l0.j.a(l0.j.f(p1Var.f5471e), new a(this, surface, surfaceTexture), k0.b.a());
        bVarD.b(this.f174106a, b0.b0.f13854d, -1);
        androidx.camera.core.impl.l2.c cVar = this.f174111f;
        if (cVar != null) {
            cVar.b();
        }
        androidx.camera.core.impl.l2.c cVar2 = new androidx.camera.core.impl.l2.c(new androidx.camera.core.impl.m2(this, 3));
        this.f174111f = cVar2;
        bVarD.f5616f = cVar2;
        return bVarD.c();
    }
}
