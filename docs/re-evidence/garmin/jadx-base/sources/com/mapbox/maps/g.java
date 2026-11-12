package com.mapbox.maps;

import com.mapbox.common.Cancelable;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.maps.plugin.animation.CameraAnimationsUtils;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Cancelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54502a;

    public /* synthetic */ g(int i14) {
        this.f54502a = i14;
    }

    @Override // com.mapbox.common.Cancelable
    public final void cancel() {
        switch (this.f54502a) {
            case 0:
                MapboxMap.getFeatureState$lambda$31();
                break;
            case 1:
                MapboxMap.setFeatureState$lambda$25();
                break;
            case 2:
                MapboxMap.removeFeatureState$lambda$37();
                break;
            case 3:
                CameraAnimationsPluginImpl.startHighLevelAnimation$lambda$33();
                break;
            case 4:
                CameraAnimationsPluginImpl.easeTo$lambda$29();
                break;
            case 5:
                CameraAnimationsPluginImpl.flyTo$lambda$30();
                break;
            default:
                CameraAnimationsUtils.emptyCancelable$lambda$0();
                break;
        }
    }
}
