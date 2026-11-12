package v;

import androidx.camera.core.ImageCaptureException;

/* JADX INFO: loaded from: classes.dex */
public class c0 extends androidx.camera.core.impl.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.concurrent.futures.b.a f173718a;

    public c0(a0.d dVar, androidx.concurrent.futures.b.a aVar) {
        this.f173718a = aVar;
    }

    @Override // androidx.camera.core.impl.s
    public final void a(int i14) {
        this.f173718a.d(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
    }

    @Override // androidx.camera.core.impl.s
    public final void b(int i14, androidx.camera.core.impl.c0 c0Var) {
        this.f173718a.b(null);
    }

    @Override // androidx.camera.core.impl.s
    public final void c(int i14, androidx.camera.core.impl.u uVar) {
        this.f173718a.d(new ImageCaptureException(2, "Capture request failed with reason " + uVar.f5795a, null));
    }
}
