package com.mapbox.maps;

import com.mapbox.maps.renderer.RendererSetupErrorListener;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapController f54409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RendererSetupErrorListener f54410c;

    public /* synthetic */ c(MapController mapController, RendererSetupErrorListener rendererSetupErrorListener, int i14) {
        this.f54408a = i14;
        this.f54409b = mapController;
        this.f54410c = rendererSetupErrorListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54408a) {
            case 0:
                MapController.addRendererSetupErrorListener$lambda$10(this.f54409b, this.f54410c);
                break;
            default:
                MapController.removeRendererSetupErrorListener$lambda$11(this.f54409b, this.f54410c);
                break;
        }
    }
}
