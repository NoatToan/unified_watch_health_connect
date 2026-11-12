package com.mapbox.maps.renderer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapboxRenderThread f54600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f54601c;

    public /* synthetic */ a(MapboxRenderThread mapboxRenderThread, int i14, int i15) {
        this.f54599a = i15;
        this.f54600b = mapboxRenderThread;
        this.f54601c = i14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54599a) {
            case 0:
                MapboxRenderThread.setUserRefreshRate$lambda$19(this.f54600b, this.f54601c);
                break;
            default:
                MapboxRenderThread.setScreenRefreshRate$lambda$15(this.f54600b, this.f54601c);
                break;
        }
    }
}
