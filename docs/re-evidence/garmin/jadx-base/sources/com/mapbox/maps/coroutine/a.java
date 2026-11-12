package com.mapbox.maps.coroutine;

import com.mapbox.maps.CameraChanged;
import com.mapbox.maps.CameraChangedCallback;
import com.mapbox.maps.CameraChangedCoalesced;
import com.mapbox.maps.CameraChangedCoalescedCallback;
import com.mapbox.maps.GenericEvent;
import com.mapbox.maps.GenericEventCallback;
import com.mapbox.maps.MapIdle;
import com.mapbox.maps.MapIdleCallback;
import com.mapbox.maps.MapLoaded;
import com.mapbox.maps.MapLoadedCallback;
import com.mapbox.maps.RenderFrameFinished;
import com.mapbox.maps.RenderFrameFinishedCallback;
import com.mapbox.maps.RenderFrameStarted;
import com.mapbox.maps.RenderFrameStartedCallback;
import com.mapbox.maps.ResourceRequest;
import com.mapbox.maps.ResourceRequestCallback;
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
import q53.t;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements CameraChangedCoalescedCallback, CameraChangedCallback, GenericEventCallback, MapIdleCallback, MapLoadedCallback, RenderFrameFinishedCallback, RenderFrameStartedCallback, ResourceRequestCallback, SourceAddedCallback, SourceDataLoadedCallback, SourceRemovedCallback, StyleDataLoadedCallback, StyleImageMissingCallback, StyleImageRemoveUnusedCallback, StyleLoadedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f54411a;

    public /* synthetic */ a(t tVar) {
        this.f54411a = tVar;
    }

    @Override // com.mapbox.maps.CameraChangedCallback
    public void run(CameraChanged cameraChanged) {
        og.a.d0(this.f54411a, cameraChanged);
    }

    @Override // com.mapbox.maps.CameraChangedCoalescedCallback
    public void run(CameraChangedCoalesced cameraChangedCoalesced) {
        og.a.d0(this.f54411a, cameraChangedCoalesced);
    }

    @Override // com.mapbox.maps.GenericEventCallback
    public void run(GenericEvent genericEvent) {
        og.a.d0(this.f54411a, genericEvent);
    }

    @Override // com.mapbox.maps.MapIdleCallback
    public void run(MapIdle mapIdle) {
        og.a.d0(this.f54411a, mapIdle);
    }

    @Override // com.mapbox.maps.MapLoadedCallback
    public void run(MapLoaded mapLoaded) {
        og.a.d0(this.f54411a, mapLoaded);
    }

    @Override // com.mapbox.maps.RenderFrameFinishedCallback
    public void run(RenderFrameFinished renderFrameFinished) {
        og.a.d0(this.f54411a, renderFrameFinished);
    }

    @Override // com.mapbox.maps.RenderFrameStartedCallback
    public void run(RenderFrameStarted renderFrameStarted) {
        og.a.d0(this.f54411a, renderFrameStarted);
    }

    @Override // com.mapbox.maps.ResourceRequestCallback
    public void run(ResourceRequest resourceRequest) {
        og.a.d0(this.f54411a, resourceRequest);
    }

    @Override // com.mapbox.maps.SourceAddedCallback
    public void run(SourceAdded sourceAdded) {
        og.a.d0(this.f54411a, sourceAdded);
    }

    @Override // com.mapbox.maps.SourceDataLoadedCallback
    public void run(SourceDataLoaded sourceDataLoaded) {
        og.a.d0(this.f54411a, sourceDataLoaded);
    }

    @Override // com.mapbox.maps.SourceRemovedCallback
    public void run(SourceRemoved sourceRemoved) {
        og.a.d0(this.f54411a, sourceRemoved);
    }

    @Override // com.mapbox.maps.StyleDataLoadedCallback
    public void run(StyleDataLoaded styleDataLoaded) {
        og.a.d0(this.f54411a, styleDataLoaded);
    }

    @Override // com.mapbox.maps.StyleImageMissingCallback
    public void run(StyleImageMissing styleImageMissing) {
        og.a.d0(this.f54411a, styleImageMissing);
    }

    @Override // com.mapbox.maps.StyleImageRemoveUnusedCallback
    public void run(StyleImageRemoveUnused styleImageRemoveUnused) {
        og.a.d0(this.f54411a, styleImageRemoveUnused);
    }

    @Override // com.mapbox.maps.StyleLoadedCallback
    public void run(StyleLoaded styleLoaded) {
        og.a.d0(this.f54411a, styleLoaded);
    }
}
