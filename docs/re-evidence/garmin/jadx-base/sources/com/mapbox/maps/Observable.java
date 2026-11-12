package com.mapbox.maps;

import com.mapbox.bindgen.CleanerService;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;

/* JADX INFO: loaded from: classes2.dex */
public class Observable {
    protected long peer;

    public static class ObservablePeerCleaner implements Runnable {
        private long peer;

        public ObservablePeerCleaner(long j8) {
            this.peer = j8;
        }

        @Override // java.lang.Runnable
        public void run() {
            Observable.cleanNativePeer(this.peer);
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public Observable(long j8) {
        setPeer(j8);
    }

    public static native void cleanNativePeer(long j8);

    private void setPeer(long j8) {
        this.peer = j8;
        if (j8 == 0) {
            return;
        }
        CleanerService.register(this, new ObservablePeerCleaner(j8));
    }

    public native Cancelable subscribe(CameraChangedCallback cameraChangedCallback);

    @com.mapbox.annotation.MapboxExperimental
    public native Cancelable subscribe(CameraChangedCoalescedCallback cameraChangedCoalescedCallback);

    public native Cancelable subscribe(MapIdleCallback mapIdleCallback);

    public native Cancelable subscribe(MapLoadedCallback mapLoadedCallback);

    public native Cancelable subscribe(MapLoadingErrorCallback mapLoadingErrorCallback);

    public native Cancelable subscribe(RenderFrameFinishedCallback renderFrameFinishedCallback);

    public native Cancelable subscribe(RenderFrameStartedCallback renderFrameStartedCallback);

    public native Cancelable subscribe(ResourceRequestCallback resourceRequestCallback);

    public native Cancelable subscribe(SourceAddedCallback sourceAddedCallback);

    public native Cancelable subscribe(SourceDataLoadedCallback sourceDataLoadedCallback);

    public native Cancelable subscribe(SourceRemovedCallback sourceRemovedCallback);

    public native Cancelable subscribe(StyleDataLoadedCallback styleDataLoadedCallback);

    public native Cancelable subscribe(StyleImageMissingCallback styleImageMissingCallback);

    public native Cancelable subscribe(StyleImageRemoveUnusedCallback styleImageRemoveUnusedCallback);

    public native Cancelable subscribe(StyleLoadedCallback styleLoadedCallback);

    public native Cancelable subscribe(String str, GenericEventCallback genericEventCallback);
}
