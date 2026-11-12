package com.mapbox.maps.extension.compose.animation.viewport;

import com.mapbox.common.Cancelable;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.MapView;
import com.mapbox.maps.plugin.animation.CameraAnimationsUtils;
import com.mapbox.maps.plugin.animation.MapAnimationOptions;
import com.mapbox.maps.plugin.viewport.CompletionListener;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;
import p13.x;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/mapbox/common/Cancelable;", "cameraOptions", "Lcom/mapbox/maps/CameraOptions;", "transitionCompletionListener", "Lcom/mapbox/maps/plugin/viewport/CompletionListener;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapViewportState$easeTo$1$1$2 extends w implements p<CameraOptions, CompletionListener, Cancelable> {
    final /* synthetic */ MapAnimationOptions $animationOptions;
    final /* synthetic */ CompletionListener $completionListener;
    final /* synthetic */ MapView $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapViewportState$easeTo$1$1$2(MapView mapView, MapAnimationOptions mapAnimationOptions, CompletionListener completionListener) {
        super(2);
        this.$this_apply = mapView;
        this.$animationOptions = mapAnimationOptions;
        this.$completionListener = completionListener;
    }

    @Override // e23.p
    public final Cancelable invoke(CameraOptions cameraOptions, CompletionListener completionListener) {
        cameraOptions.getClass();
        completionListener.getClass();
        return CameraAnimationsUtils.getCamera(this.$this_apply).easeTo(cameraOptions, this.$animationOptions, new OnAnimationCompletedListener(x.k(this.$completionListener, completionListener)));
    }
}
