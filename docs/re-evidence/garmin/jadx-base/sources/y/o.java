package y;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f192954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<ListenableFuture<Void>> f192955b = Collections.synchronizedList(new ArrayList());

    public static class a extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.concurrent.futures.b.d f192956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.concurrent.futures.b.a<Void> f192957b;

        public a() {
            androidx.concurrent.futures.b.a<Void> aVar = new androidx.concurrent.futures.b.a<>();
            androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
            aVar.f6080b = dVar;
            aVar.f6079a = v.h.class;
            try {
                this.f192957b = aVar;
                aVar.f6079a = "RequestCompleteListener[" + this + "]";
            } catch (Exception e4) {
                dVar.a(e4);
            }
            this.f192956a = dVar;
        }

        public final void a() {
            androidx.concurrent.futures.b.a<Void> aVar = this.f192957b;
            if (aVar != null) {
                aVar.b(null);
                this.f192957b = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i14) {
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i14, long j8) {
            a();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j8, long j14) {
            a();
        }
    }

    public o(boolean z14) {
        this.f192954a = z14;
    }

    public final CameraCaptureSession.CaptureCallback a(CameraCaptureSession.CaptureCallback captureCallback) {
        if (!this.f192954a) {
            return captureCallback;
        }
        a aVar = new a();
        List<ListenableFuture<Void>> list = this.f192955b;
        androidx.concurrent.futures.b.d dVar = aVar.f192956a;
        list.add(dVar);
        toString();
        dVar.addListener(new uj2.b(this, 10, aVar, dVar), k0.b.a());
        return new v.x(Arrays.asList(aVar, captureCallback));
    }

    public final ListenableFuture<Void> b() {
        List<ListenableFuture<Void>> list = this.f192955b;
        if (list.isEmpty()) {
            l0.j.a aVar = l0.j.f107810a;
            return l0.m.c.f107817b;
        }
        l0.n nVarI = l0.j.i(new ArrayList(list));
        wr.g gVar = new wr.g(13);
        return l0.j.f(l0.j.j(nVarI, new l0.i(gVar), k0.b.a()));
    }

    public final void c() {
        LinkedList linkedList = new LinkedList(this.f192955b);
        while (!linkedList.isEmpty()) {
            ListenableFuture listenableFuture = (ListenableFuture) linkedList.poll();
            Objects.requireNonNull(listenableFuture);
            listenableFuture.cancel(true);
        }
    }
}
