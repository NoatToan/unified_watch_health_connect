package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k.a f5354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CameraDevice f5355c;

    public /* synthetic */ i(k.a aVar, CameraDevice cameraDevice, int i14) {
        this.f5353a = i14;
        this.f5354b = aVar;
        this.f5355c = cameraDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5353a) {
            case 0:
                this.f5354b.f5361a.onClosed(this.f5355c);
                break;
            case 1:
                this.f5354b.f5361a.onDisconnected(this.f5355c);
                break;
            default:
                this.f5354b.f5361a.onOpened(this.f5355c);
                break;
        }
    }
}
