package com.mapbox.maps;

import com.mapbox.maps.plugin.delegates.listeners.OnMapLoadErrorListener;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n implements MapLoadingErrorCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f54521b;

    public /* synthetic */ n(Object obj, int i14) {
        this.f54520a = i14;
        this.f54521b = obj;
    }

    @Override // com.mapbox.maps.MapLoadingErrorCallback
    public final void run(MapLoadingError mapLoadingError) {
        switch (this.f54520a) {
            case 0:
                NativeObserver.addOnMapLoadErrorListener$lambda$5((OnMapLoadErrorListener) this.f54521b, mapLoadingError);
                break;
            default:
                Snapshotter._init_$lambda$1((WeakReference) this.f54521b, mapLoadingError);
                break;
        }
    }
}
