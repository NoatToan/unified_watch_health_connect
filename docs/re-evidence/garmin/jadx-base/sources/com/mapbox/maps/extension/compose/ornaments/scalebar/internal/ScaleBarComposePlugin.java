package com.mapbox.maps.extension.compose.ornaments.scalebar.internal;

import android.content.Context;
import android.util.AttributeSet;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.CameraChangedCoalesced;
import com.mapbox.maps.CameraChangedCoalescedCallback;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.Projection;
import com.mapbox.maps.plugin.ContextBinder;
import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.MapSizePlugin;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.delegates.MapListenerDelegate;
import com.mapbox.maps.plugin.delegates.MapTransformDelegate;
import com.mapbox.maps.plugin.scalebar.ScaleBarImpl;
import mt0.b2;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000 %2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001%B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0012H\u0016J\b\u0010\u001a\u001a\u00020\u0012H\u0016J\u0012\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/mapbox/maps/extension/compose/ornaments/scalebar/internal/ScaleBarComposePlugin;", "Lcom/mapbox/maps/plugin/MapSizePlugin;", "Lcom/mapbox/maps/plugin/MapPlugin;", "Lcom/mapbox/maps/plugin/ContextBinder;", "scaleBar", "Lcom/mapbox/maps/plugin/scalebar/ScaleBarImpl;", "(Lcom/mapbox/maps/plugin/scalebar/ScaleBarImpl;)V", "cameraChangedCoalescedListener", "Lcom/mapbox/maps/CameraChangedCoalescedCallback;", "cancelable", "Lcom/mapbox/common/Cancelable;", "mapCameraManagerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "mapListenerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapListenerDelegate;", "mapTransformDelegate", "Lcom/mapbox/maps/plugin/delegates/MapTransformDelegate;", "bind", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "pixelRatio", "", "cleanup", "initialize", "invalidateScaleBar", "cameraState", "Lcom/mapbox/maps/CameraState;", "onDelegateProvider", "delegateProvider", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "onSizeChanged", "width", "", "height", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ScaleBarComposePlugin implements MapSizePlugin, MapPlugin, ContextBinder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static int INSTANCE_COUNT = 0;
    private static final String PLUGIN_ID = "MAPBOX_SCALE_BAR_COMPOSE_PLUGIN";
    private final CameraChangedCoalescedCallback cameraChangedCoalescedListener;
    private Cancelable cancelable;
    private MapCameraManagerDelegate mapCameraManagerDelegate;
    private MapListenerDelegate mapListenerDelegate;
    private MapTransformDelegate mapTransformDelegate;
    private final ScaleBarImpl scaleBar;

    public ScaleBarComposePlugin(ScaleBarImpl scaleBarImpl) {
        scaleBarImpl.getClass();
        this.scaleBar = scaleBarImpl;
        this.cameraChangedCoalescedListener = new b2(this, 26);
        scaleBarImpl.setEnable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cameraChangedCoalescedListener$lambda$0(ScaleBarComposePlugin scaleBarComposePlugin, CameraChangedCoalesced cameraChangedCoalesced) {
        scaleBarComposePlugin.getClass();
        cameraChangedCoalesced.getClass();
        CameraState cameraState = cameraChangedCoalesced.getCameraState();
        cameraState.getClass();
        scaleBarComposePlugin.invalidateScaleBar(cameraState);
    }

    private final void invalidateScaleBar(CameraState cameraState) {
        this.scaleBar.setDistancePerPixel((float) (Projection.getMetersPerPixelAtLatitude(cameraState.getCenter().latitude(), cameraState.getZoom()) / ((double) this.scaleBar.getPixelRatio())));
    }

    public static /* synthetic */ void invalidateScaleBar$default(ScaleBarComposePlugin scaleBarComposePlugin, CameraState cameraState, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            MapCameraManagerDelegate mapCameraManagerDelegate = scaleBarComposePlugin.mapCameraManagerDelegate;
            if (mapCameraManagerDelegate == null) {
                s.m("mapCameraManagerDelegate");
                throw null;
            }
            cameraState = mapCameraManagerDelegate.getCameraState();
        }
        scaleBarComposePlugin.invalidateScaleBar(cameraState);
    }

    @Override // com.mapbox.maps.plugin.ContextBinder
    public void bind(Context context, AttributeSet attrs, float pixelRatio) {
        context.getClass();
        this.scaleBar.setPixelRatio(pixelRatio);
        invalidateScaleBar$default(this, null, 1, null);
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void cleanup() {
        Cancelable cancelable = this.cancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void initialize() {
        MapListenerDelegate mapListenerDelegate = this.mapListenerDelegate;
        if (mapListenerDelegate == null) {
            s.m("mapListenerDelegate");
            throw null;
        }
        this.cancelable = mapListenerDelegate.subscribeCameraChangedCoalesced(this.cameraChangedCoalescedListener);
        invalidateScaleBar$default(this, null, 1, null);
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void onDelegateProvider(MapDelegateProvider delegateProvider) {
        delegateProvider.getClass();
        this.mapCameraManagerDelegate = delegateProvider.getMapCameraManagerDelegate();
        this.mapListenerDelegate = delegateProvider.getMapListenerDelegate();
        this.mapTransformDelegate = delegateProvider.getMapTransformDelegate();
    }

    @Override // com.mapbox.maps.plugin.MapSizePlugin
    public void onSizeChanged(int width, int height) {
        this.scaleBar.setMapViewWidth(width);
        invalidateScaleBar$default(this, null, 1, null);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/extension/compose/ornaments/scalebar/internal/ScaleBarComposePlugin$Companion;", "", "()V", "INSTANCE_COUNT", "", "PLUGIN_ID", "", "getNextId", "getNextId$extension_compose_release", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final String getNextId$extension_compose_release() {
            StringBuilder sb3 = new StringBuilder("MAPBOX_SCALE_BAR_COMPOSE_PLUGIN-");
            int i14 = ScaleBarComposePlugin.INSTANCE_COUNT;
            ScaleBarComposePlugin.INSTANCE_COUNT = i14 + 1;
            sb3.append(i14);
            return sb3.toString();
        }

        private Companion() {
        }
    }
}
