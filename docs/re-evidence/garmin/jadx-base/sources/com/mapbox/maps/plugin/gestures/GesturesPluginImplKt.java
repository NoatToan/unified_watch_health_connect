package com.mapbox.maps.plugin.gestures;

import android.view.MotionEvent;
import com.mapbox.maps.ScreenCoordinate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toScreenCoordinate", "Lcom/mapbox/maps/ScreenCoordinate;", "Landroid/view/MotionEvent;", "plugin-gestures_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class GesturesPluginImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ScreenCoordinate toScreenCoordinate(MotionEvent motionEvent) {
        return new ScreenCoordinate(motionEvent.getX(), motionEvent.getY());
    }
}
