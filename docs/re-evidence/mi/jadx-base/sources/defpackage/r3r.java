package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class r3r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32157a;
    public final lhe<Void> c;
    public cb3.a<Void> d;
    public boolean e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f32158b = new Object();
    public final CameraCaptureSession.CaptureCallback f = new a();

    public class a extends CameraCaptureSession.CaptureCallback {
        public a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            cb3.a<Void> aVar = r3r.this.d;
            if (aVar != null) {
                aVar.d();
                r3r.this.d = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            cb3.a<Void> aVar = r3r.this.d;
            if (aVar != null) {
                aVar.c(null);
                r3r.this.d = null;
            }
        }
    }

    @FunctionalInterface
    public interface b {
        lhe<Void> a(CameraDevice cameraDevice, pyl pylVar, List<DeferrableSurface> list);
    }

    @FunctionalInterface
    public interface c {
        int a(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;
    }

    public r3r(lgi lgiVar) {
        this.f32157a = lgiVar.a(qk3.class);
        if (i()) {
            this.c = cb3.a(new cb3.c() { // from class: p3r
                @Override // cb3.c
                public final Object a(cb3.a aVar) {
                    return this.f29970a.d(aVar);
                }
            });
        } else {
            this.c = oua.h(null);
        }
    }

    public static /* synthetic */ lhe e(b bVar, CameraDevice cameraDevice, pyl pylVar, List list, List list2) throws Exception {
        return bVar.a(cameraDevice, pylVar, list);
    }

    public lhe<Void> c() {
        return oua.j(this.c);
    }

    public final /* synthetic */ Object d(cb3.a aVar) throws Exception {
        this.d = aVar;
        return "WaitForRepeatingRequestStart[" + this + "]";
    }

    public void f() {
        synchronized (this.f32158b) {
            try {
                if (i() && !this.e) {
                    this.c.cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public lhe<Void> g(final CameraDevice cameraDevice, final pyl pylVar, final List<DeferrableSurface> list, List<wuo> list2, final b bVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<wuo> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().h());
        }
        return kua.a(oua.n(arrayList)).e(new fl1() { // from class: q3r
            @Override // defpackage.fl1
            public final lhe apply(Object obj) {
                return r3r.e(bVar, cameraDevice, pylVar, list, (List) obj);
            }
        }, li3.a());
    }

    public int h(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, c cVar) throws CameraAccessException {
        int iA;
        synchronized (this.f32158b) {
            try {
                if (i()) {
                    captureCallback = vd3.b(this.f, captureCallback);
                    this.e = true;
                }
                iA = cVar.a(captureRequest, captureCallback);
            } catch (Throwable th) {
                throw th;
            }
        }
        return iA;
    }

    public boolean i() {
        return this.f32157a;
    }
}
