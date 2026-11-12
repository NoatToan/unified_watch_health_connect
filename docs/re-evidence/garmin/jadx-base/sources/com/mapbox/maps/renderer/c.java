package com.mapbox.maps.renderer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapboxRenderThread f54605b;

    public /* synthetic */ c(MapboxRenderThread mapboxRenderThread, int i14) {
        this.f54604a = i14;
        this.f54605b = mapboxRenderThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54604a) {
            case 0:
                MapboxRenderThread.prepareRenderFrameRunnable$lambda$4(this.f54605b);
                break;
            case 1:
                MapboxRenderThread.destroy$lambda$29$lambda$28$lambda$27(this.f54605b);
                break;
            case 2:
                MapboxRenderThread.onSurfaceDestroyed$lambda$14$lambda$13$lambda$12(this.f54605b);
                break;
            default:
                MapboxRenderThread.scheduleThreadServiceTypeReset$lambda$24(this.f54605b);
                break;
        }
    }
}
