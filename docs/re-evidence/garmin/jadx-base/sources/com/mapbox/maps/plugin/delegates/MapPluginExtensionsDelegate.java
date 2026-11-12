package com.mapbox.maps.plugin.delegates;

import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.gestures.GesturesPlugin;
import e23.l;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J'\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\b\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002H&¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/plugin/delegates/MapPluginExtensionsDelegate;", "", "Lkotlin/Function1;", "Lcom/mapbox/maps/plugin/animation/CameraAnimationsPlugin;", "function", "cameraAnimationsPlugin", "(Le23/l;)Ljava/lang/Object;", "Lcom/mapbox/maps/plugin/gestures/GesturesPlugin;", "gesturesPlugin", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface MapPluginExtensionsDelegate {
    Object cameraAnimationsPlugin(l<? super CameraAnimationsPlugin, ? extends Object> function);

    Object gesturesPlugin(l<? super GesturesPlugin, ? extends Object> function);
}
