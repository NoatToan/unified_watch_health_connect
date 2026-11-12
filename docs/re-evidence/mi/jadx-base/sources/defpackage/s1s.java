package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.media.Image;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.m;
import androidx.camera.core.q;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public final class s1s implements p1s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue<m> f33182a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Queue<TotalCaptureResult> f33183b = new LinkedList();
    public boolean c = false;
    public boolean d;
    public boolean e;
    public q f;
    public DeferrableSurface g;
    public ImageWriter h;

    public class a extends we3 {
        public a() {
        }

        @Override // defpackage.we3
        public void b(ye3 ye3Var) {
            super.b(ye3Var);
            CaptureResult captureResultD = ye3Var.d();
            if (captureResultD == null || !(captureResultD instanceof TotalCaptureResult)) {
                return;
            }
            s1s.this.f33183b.add((TotalCaptureResult) captureResultD);
        }
    }

    public class b extends CameraCaptureSession.StateCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Surface inputSurface = cameraCaptureSession.getInputSurface();
            if (inputSurface != null) {
                s1s.this.h = f6d.c(inputSurface, 1);
            }
        }
    }

    public s1s(vf3 vf3Var) {
        this.d = false;
        this.e = false;
        this.d = t1s.a(vf3Var, 7);
        this.e = t1s.a(vf3Var, 4);
    }

    @Override // defpackage.p1s
    public void a(boolean z) {
        this.c = z;
    }

    @Override // defpackage.p1s
    public void b(Size size, SessionConfig.b bVar) {
        if (this.c) {
            return;
        }
        if (this.d || this.e) {
            f();
            int i = this.d ? 35 : 34;
            q qVar = new q(r5d.a(size.getWidth(), size.getHeight(), i, 2));
            this.f = qVar;
            qVar.d(new p5d.a() { // from class: q1s
                @Override // p5d.a
                public final void a(p5d p5dVar) {
                    this.f30999a.g(p5dVar);
                }
            }, li3.c());
            n6d n6dVar = new n6d(this.f.a(), new Size(this.f.getWidth(), this.f.getHeight()), i);
            this.g = n6dVar;
            q qVar2 = this.f;
            lhe<Void> lheVarI = n6dVar.i();
            Objects.requireNonNull(qVar2);
            lheVarI.addListener(new r1s(qVar2), li3.d());
            bVar.k(this.g);
            bVar.d(new a());
            bVar.j(new b());
            bVar.r(new InputConfiguration(this.f.getWidth(), this.f.getHeight(), this.f.b()));
        }
    }

    @Override // defpackage.p1s
    public m c() {
        try {
            return this.f33182a.remove();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    @Override // defpackage.p1s
    public boolean d(m mVar) {
        Image imageP0 = mVar.p0();
        ImageWriter imageWriter = this.h;
        if (imageWriter == null || imageP0 == null) {
            return false;
        }
        f6d.e(imageWriter, imageP0);
        return true;
    }

    public final void f() {
        Queue<m> queue = this.f33182a;
        while (!queue.isEmpty()) {
            queue.remove().close();
        }
        this.f33183b.clear();
        DeferrableSurface deferrableSurface = this.g;
        if (deferrableSurface != null) {
            q qVar = this.f;
            if (qVar != null) {
                deferrableSurface.i().addListener(new r1s(qVar), li3.d());
            }
            deferrableSurface.c();
        }
        ImageWriter imageWriter = this.h;
        if (imageWriter != null) {
            imageWriter.close();
            this.h = null;
        }
    }

    public final /* synthetic */ void g(p5d p5dVar) {
        m mVarG = p5dVar.g();
        if (mVarG != null) {
            this.f33182a.add(mVarG);
        }
    }
}
