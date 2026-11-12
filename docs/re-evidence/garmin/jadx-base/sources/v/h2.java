package v;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h2 extends c2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f173834a;

    public h2(List<c2.b> list) {
        ArrayList arrayList = new ArrayList();
        this.f173834a = arrayList;
        arrayList.addAll(list);
    }

    @Override // v.c2.b
    public final void k(c2 c2Var) {
        Iterator it = this.f173834a.iterator();
        while (it.hasNext()) {
            ((c2.b) it.next()).k(c2Var);
        }
    }

    @Override // v.c2.b
    public final void l(c2 c2Var) {
        Iterator it = this.f173834a.iterator();
        while (it.hasNext()) {
            ((c2.b) it.next()).l(c2Var);
        }
    }

    @Override // v.c2.b
    public final void m(c2 c2Var) {
        Iterator it = this.f173834a.iterator();
        while (it.hasNext()) {
            ((c2.b) it.next()).m(c2Var);
        }
    }

    @Override // v.c2.b
    public final void n(c2 c2Var) {
        Iterator it = this.f173834a.iterator();
        while (it.hasNext()) {
            ((c2.b) it.next()).n(c2Var);
        }
    }

    @Override // v.c2.b
    public final void o(c2 c2Var) {
        Iterator it = this.f173834a.iterator();
        while (it.hasNext()) {
            ((c2.b) it.next()).o(c2Var);
        }
    }

    @Override // v.c2.b
    public final void p(c2 c2Var) {
        Iterator it = this.f173834a.iterator();
        while (it.hasNext()) {
            ((c2.b) it.next()).p(c2Var);
        }
    }

    @Override // v.c2.b
    public final void q(c2 c2Var) {
        Iterator it = this.f173834a.iterator();
        while (it.hasNext()) {
            ((c2.b) it.next()).q(c2Var);
        }
    }

    @Override // v.c2.b
    public final void r(c2 c2Var, Surface surface) {
        Iterator it = this.f173834a.iterator();
        while (it.hasNext()) {
            ((c2.b) it.next()).r(c2Var, surface);
        }
    }

    public static class a extends c2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CameraCaptureSession.StateCallback f173835a;

        public a(List<CameraCaptureSession.StateCallback> list) {
            this(list.isEmpty() ? new q0() : list.size() == 1 ? list.get(0) : new p0(list));
        }

        @Override // v.c2.b
        public final void k(c2 c2Var) {
            this.f173835a.onActive(c2Var.c().f5345a.f5346a);
        }

        @Override // v.c2.b
        public final void l(c2 c2Var) {
            this.f173835a.onCaptureQueueEmpty(c2Var.c().f5345a.f5346a);
        }

        @Override // v.c2.b
        public final void m(c2 c2Var) {
            this.f173835a.onClosed(c2Var.c().f5345a.f5346a);
        }

        @Override // v.c2.b
        public final void n(c2 c2Var) {
            this.f173835a.onConfigureFailed(c2Var.c().f5345a.f5346a);
        }

        @Override // v.c2.b
        public final void o(c2 c2Var) {
            this.f173835a.onConfigured(c2Var.c().f5345a.f5346a);
        }

        @Override // v.c2.b
        public final void p(c2 c2Var) {
            this.f173835a.onReady(c2Var.c().f5345a.f5346a);
        }

        @Override // v.c2.b
        public final void q(c2 c2Var) {
        }

        @Override // v.c2.b
        public final void r(c2 c2Var, Surface surface) {
            this.f173835a.onSurfacePrepared(c2Var.c().f5345a.f5346a, surface);
        }

        public a(CameraCaptureSession.StateCallback stateCallback) {
            this.f173835a = stateCallback;
        }
    }
}
