package com.google.firebase.crashlytics.internal.common;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorker;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.common.OfflineSwitchObserver;
import com.mapbox.common.location.GoogleDeviceLocationProvider;
import com.mapbox.common.module.MapboxHttpClient;
import com.mapbox.maps.CameraChanged;
import com.mapbox.maps.CameraChangedCallback;
import com.mapbox.maps.CameraChangedCoalesced;
import com.mapbox.maps.CameraChangedCoalescedCallback;
import com.mapbox.maps.MapController;
import com.mapbox.maps.MapIdle;
import com.mapbox.maps.MapIdleCallback;
import com.mapbox.maps.MapLoaded;
import com.mapbox.maps.MapLoadedCallback;
import com.mapbox.maps.MapLoadingError;
import com.mapbox.maps.MapLoadingErrorDelegate;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.NativeObserver;
import com.mapbox.maps.RenderFrameFinished;
import com.mapbox.maps.RenderFrameFinishedCallback;
import com.mapbox.maps.RenderFrameStarted;
import com.mapbox.maps.RenderFrameStartedCallback;
import com.mapbox.maps.SourceAdded;
import com.mapbox.maps.SourceAddedCallback;
import com.mapbox.maps.SourceDataLoaded;
import com.mapbox.maps.SourceDataLoadedCallback;
import com.mapbox.maps.SourceRemoved;
import com.mapbox.maps.SourceRemovedCallback;
import com.mapbox.maps.StyleDataLoaded;
import com.mapbox.maps.StyleDataLoadedCallback;
import com.mapbox.maps.StyleImageMissing;
import com.mapbox.maps.StyleImageMissingCallback;
import com.mapbox.maps.StyleImageRemoveUnused;
import com.mapbox.maps.StyleImageRemoveUnusedCallback;
import com.mapbox.maps.StyleLoaded;
import com.mapbox.maps.StyleLoadedCallback;
import com.mapbox.maps.debugoptions.DebugOptionsController;
import com.mapbox.maps.extension.compose.style.atmosphere.AtmosphereStateApplier;
import com.mapbox.maps.extension.compose.style.precipitations.RainStateApplier;
import com.mapbox.maps.extension.compose.style.precipitations.SnowStateApplier;
import com.mapbox.maps.extension.compose.style.terrain.TerrainStateApplier;
import com.mapbox.maps.extension.style.types.PromoteId;
import com.mapbox.maps.plugin.MapPluginRegistry;
import com.mapbox.maps.plugin.delegates.listeners.OnCameraChangeListener;
import com.mapbox.maps.plugin.delegates.listeners.OnMapIdleListener;
import com.mapbox.maps.plugin.delegates.listeners.OnMapLoadedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnRenderFrameFinishedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnRenderFrameStartedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnSourceAddedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnSourceDataLoadedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnSourceRemovedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnStyleDataLoadedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnStyleImageMissingListener;
import com.mapbox.maps.plugin.delegates.listeners.OnStyleImageUnusedListener;
import com.mapbox.maps.plugin.delegates.listeners.OnStyleLoadedListener;
import com.mapbox.maps.plugin.scalebar.ScaleBarPluginImpl;
import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Continuation, SuccessContinuation, ObjectConstructor, OnFailureListener, OfflineSwitchObserver, CameraChangedCoalescedCallback, MapLoadingErrorDelegate, MapIdleCallback, StyleImageMissingCallback, MapLoadedCallback, StyleImageRemoveUnusedCallback, RenderFrameFinishedCallback, SourceRemovedCallback, StyleDataLoadedCallback, CameraChangedCallback, RenderFrameStartedCallback, StyleLoadedCallback, SourceAddedCallback, SourceDataLoadedCallback, Expected.Action, Expected.Transformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53710b;

    public /* synthetic */ i(Object obj, int i14) {
        this.f53709a = i14;
        this.f53710b = obj;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        switch (this.f53709a) {
            case 4:
                return ConstructorConstructor.lambda$newUnsafeAllocator$19((Class) this.f53710b);
            default:
                return ConstructorConstructor.lambda$newDefaultConstructor$9((Constructor) this.f53710b);
        }
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        return PromoteId.toValue$lambda$0((PromoteId) this.f53710b, (String) obj);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        GoogleDeviceLocationProvider.doStop$lambda$3((GoogleDeviceLocationProvider) this.f53710b, exc);
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        switch (this.f53709a) {
            case 24:
                AtmosphereStateApplier.attachTo$lambda$4((AtmosphereStateApplier) this.f53710b, (None) obj);
                break;
            case 25:
                RainStateApplier.attachTo$lambda$4((RainStateApplier) this.f53710b, (None) obj);
                break;
            case 26:
                SnowStateApplier.attachTo$lambda$4((SnowStateApplier) this.f53710b, (None) obj);
                break;
            default:
                TerrainStateApplier.attachTo$lambda$6((TerrainStateApplier) this.f53710b, (None) obj);
                break;
        }
    }

    @Override // com.mapbox.maps.MapLoadingErrorDelegate
    public void sendMapLoadingError(MapLoadingError mapLoadingError) {
        switch (this.f53709a) {
            case 9:
                MapboxMap._init_$lambda$1((NativeObserver) this.f53710b, mapLoadingError);
                break;
            default:
                MapboxMap._init_$lambda$2((MapboxMap) this.f53710b, mapLoadingError);
                break;
        }
    }

    @Override // com.mapbox.common.OfflineSwitchObserver
    public void statusChanged(boolean z14) {
        MapboxHttpClient.offlineObserver$lambda$1((MapboxHttpClient) this.f53710b, z14);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f53709a) {
            case 0:
                return Utils.lambda$awaitEvenIfOnMainThread$0((CountDownLatch) this.f53710b, task);
            case 1:
                return CrashlyticsWorker.lambda$submit$1((Runnable) this.f53710b, task);
            default:
                return CrashlyticsWorker.lambda$submitTaskOnSuccess$5((SuccessContinuation) this.f53710b, task);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return ConfigFetchHandler.lambda$fetchFromBackendAndCacheResponse$4((ConfigFetchHandler.FetchResponse) this.f53710b, (ConfigContainer) obj);
    }

    @Override // com.mapbox.maps.CameraChangedCoalescedCallback
    public void run(CameraChangedCoalesced cameraChangedCoalesced) {
        switch (this.f53709a) {
            case 8:
                MapController._init_$lambda$4((MapPluginRegistry) this.f53710b, cameraChangedCoalesced);
                break;
            case 23:
                DebugOptionsController.updateCameraSubscriptionIfNeeded$lambda$1((DebugOptionsController) this.f53710b, cameraChangedCoalesced);
                break;
            default:
                ScaleBarPluginImpl.cameraChangedCoalescedCallback$lambda$0((ScaleBarPluginImpl) this.f53710b, cameraChangedCoalesced);
                break;
        }
    }

    @Override // com.mapbox.maps.MapIdleCallback
    public void run(MapIdle mapIdle) {
        NativeObserver.addOnMapIdleListener$lambda$4((OnMapIdleListener) this.f53710b, mapIdle);
    }

    @Override // com.mapbox.maps.MapLoadedCallback
    public void run(MapLoaded mapLoaded) {
        NativeObserver.addOnMapLoadedListener$lambda$3((OnMapLoadedListener) this.f53710b, mapLoaded);
    }

    @Override // com.mapbox.maps.RenderFrameFinishedCallback
    public void run(RenderFrameFinished renderFrameFinished) {
        NativeObserver.addOnRenderFrameFinishedListener$lambda$14((OnRenderFrameFinishedListener) this.f53710b, renderFrameFinished);
    }

    @Override // com.mapbox.maps.RenderFrameStartedCallback
    public void run(RenderFrameStarted renderFrameStarted) {
        NativeObserver.addOnRenderFrameStartedListener$lambda$13((OnRenderFrameStartedListener) this.f53710b, renderFrameStarted);
    }

    @Override // com.mapbox.maps.SourceAddedCallback
    public void run(SourceAdded sourceAdded) {
        NativeObserver.addOnSourceAddedListener$lambda$9((OnSourceAddedListener) this.f53710b, sourceAdded);
    }

    @Override // com.mapbox.maps.SourceDataLoadedCallback
    public void run(SourceDataLoaded sourceDataLoaded) {
        NativeObserver.addOnSourceDataLoadedListener$lambda$8((OnSourceDataLoadedListener) this.f53710b, sourceDataLoaded);
    }

    @Override // com.mapbox.maps.SourceRemovedCallback
    public void run(SourceRemoved sourceRemoved) {
        NativeObserver.addOnSourceRemovedListener$lambda$10((OnSourceRemovedListener) this.f53710b, sourceRemoved);
    }

    @Override // com.mapbox.maps.StyleDataLoadedCallback
    public void run(StyleDataLoaded styleDataLoaded) {
        NativeObserver.addOnStyleDataLoadedListener$lambda$7((OnStyleDataLoadedListener) this.f53710b, styleDataLoaded);
    }

    @Override // com.mapbox.maps.StyleImageMissingCallback
    public void run(StyleImageMissing styleImageMissing) {
        NativeObserver.addOnStyleImageMissingListener$lambda$11((OnStyleImageMissingListener) this.f53710b, styleImageMissing);
    }

    @Override // com.mapbox.maps.StyleImageRemoveUnusedCallback
    public void run(StyleImageRemoveUnused styleImageRemoveUnused) {
        NativeObserver.addOnStyleImageUnusedListener$lambda$12((OnStyleImageUnusedListener) this.f53710b, styleImageRemoveUnused);
    }

    @Override // com.mapbox.maps.StyleLoadedCallback
    public void run(StyleLoaded styleLoaded) {
        NativeObserver.addOnStyleLoadedListener$lambda$6((OnStyleLoadedListener) this.f53710b, styleLoaded);
    }

    @Override // com.mapbox.maps.CameraChangedCallback
    public void run(CameraChanged cameraChanged) {
        NativeObserver.addOnCameraChangeListener$lambda$2((OnCameraChangeListener) this.f53710b, cameraChanged);
    }
}
