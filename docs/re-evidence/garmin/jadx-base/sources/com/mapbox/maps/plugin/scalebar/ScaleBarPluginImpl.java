package com.mapbox.maps.plugin.scalebar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.firebase.crashlytics.internal.common.i;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.CameraChangedCoalesced;
import com.mapbox.maps.CameraChangedCoalescedCallback;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.Projection;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import com.mapbox.maps.plugin.delegates.MapListenerDelegate;
import com.mapbox.maps.plugin.delegates.MapTransformDelegate;
import com.mapbox.maps.plugin.scalebar.generated.ScaleBarAttributeParser;
import com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettings;
import com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsBase;
import com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsKt;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u000fJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010\u000fJ\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\"\u00105\u001a\u0002048\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b<\u0010=\u0012\u0004\b>\u0010\u000fR\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR*\u0010I\u001a\u00020B2\u0006\u0010C\u001a\u00020B8V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\bH\u0010\u000f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010N\u001a\u00020\u00192\u0006\u0010C\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010Q\u001a\u00020B2\u0006\u0010C\u001a\u00020B8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bO\u0010E\"\u0004\bP\u0010G¨\u0006R"}, d2 = {"Lcom/mapbox/maps/plugin/scalebar/ScaleBarPluginImpl;", "Lcom/mapbox/maps/plugin/scalebar/ScaleBarPlugin;", "Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettingsBase;", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcom/mapbox/maps/plugin/scalebar/ScaleBarImpl;", "viewImplProvider", "<init>", "(Le23/l;)V", "Lcom/mapbox/maps/CameraState;", "cameraState", "", "invalidateScaleBar", "(Lcom/mapbox/maps/CameraState;)V", "applySettings", "()V", "", "width", "height", "onSizeChanged", "(II)V", "Landroid/widget/FrameLayout;", "mapView", "Landroid/util/AttributeSet;", "attrs", "", "pixelRatio", "Landroid/view/View;", "bind", "(Landroid/widget/FrameLayout;Landroid/util/AttributeSet;F)Landroid/view/View;", "cleanup", "initialize", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "delegateProvider", "onDelegateProvider", "(Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;)V", "view", "onPluginView", "(Landroid/view/View;)V", "Le23/l;", "Lcom/mapbox/maps/plugin/scalebar/ScaleBar;", "scaleBar", "Lcom/mapbox/maps/plugin/scalebar/ScaleBar;", "Lcom/mapbox/maps/plugin/delegates/MapListenerDelegate;", "mapListenerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapListenerDelegate;", "Lcom/mapbox/maps/plugin/delegates/MapTransformDelegate;", "mapTransformDelegate", "Lcom/mapbox/maps/plugin/delegates/MapTransformDelegate;", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "mapCameraManagerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;", "internalSettings", "Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;", "getInternalSettings", "()Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;", "setInternalSettings", "(Lcom/mapbox/maps/plugin/scalebar/generated/ScaleBarSettings;)V", "Lcom/mapbox/maps/CameraChangedCoalescedCallback;", "cameraChangedCoalescedCallback", "Lcom/mapbox/maps/CameraChangedCoalescedCallback;", "getCameraChangedCoalescedCallback$annotations", "Lcom/mapbox/common/Cancelable;", "cancelable", "Lcom/mapbox/common/Cancelable;", "", "value", "getEnabled", "()Z", "setEnabled", "(Z)V", "getEnabled$annotations", "enabled", "getDistancePerPixel", "()F", "setDistancePerPixel", "(F)V", "distancePerPixel", "getUseContinuousRendering", "setUseContinuousRendering", "useContinuousRendering", "plugin-scalebar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ScaleBarPluginImpl extends ScaleBarSettingsBase implements ScaleBarPlugin {
    private final CameraChangedCoalescedCallback cameraChangedCoalescedCallback;
    private Cancelable cancelable;
    private ScaleBarSettings internalSettings;
    private MapCameraManagerDelegate mapCameraManagerDelegate;
    private MapListenerDelegate mapListenerDelegate;
    private MapTransformDelegate mapTransformDelegate;
    private ScaleBar scaleBar;
    private final l<Context, ScaleBarImpl> viewImplProvider;

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.scalebar.ScaleBarPluginImpl$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/plugin/scalebar/ScaleBarImpl;", "it", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<Context, ScaleBarImpl> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // e23.l
        public final ScaleBarImpl invoke(Context context) {
            context.getClass();
            return new ScaleBarImpl(context);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScaleBarPluginImpl(l<? super Context, ScaleBarImpl> lVar) {
        lVar.getClass();
        this.viewImplProvider = lVar;
        this.internalSettings = ScaleBarSettingsKt.ScaleBarSettings(ScaleBarPluginImpl$internalSettings$1.INSTANCE);
        this.cameraChangedCoalescedCallback = new i(this, 29);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cameraChangedCoalescedCallback$lambda$0(ScaleBarPluginImpl scaleBarPluginImpl, CameraChangedCoalesced cameraChangedCoalesced) {
        scaleBarPluginImpl.getClass();
        cameraChangedCoalesced.getClass();
        CameraState cameraState = cameraChangedCoalesced.getCameraState();
        cameraState.getClass();
        scaleBarPluginImpl.invalidateScaleBar(cameraState);
    }

    private static /* synthetic */ void getCameraChangedCoalescedCallback$annotations() {
    }

    public static /* synthetic */ void getEnabled$annotations() {
    }

    private final void invalidateScaleBar(CameraState cameraState) {
        double metersPerPixelAtLatitude = Projection.getMetersPerPixelAtLatitude(cameraState.getCenter().latitude(), cameraState.getZoom());
        ScaleBar scaleBar = this.scaleBar;
        if (scaleBar == null) {
            s.m("scaleBar");
            throw null;
        }
        if (scaleBar != null) {
            scaleBar.setDistancePerPixel((float) (metersPerPixelAtLatitude / ((double) scaleBar.getPixelRatio())));
        } else {
            s.m("scaleBar");
            throw null;
        }
    }

    public static /* synthetic */ void invalidateScaleBar$default(ScaleBarPluginImpl scaleBarPluginImpl, CameraState cameraState, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            MapCameraManagerDelegate mapCameraManagerDelegate = scaleBarPluginImpl.mapCameraManagerDelegate;
            if (mapCameraManagerDelegate == null) {
                s.m("mapCameraManagerDelegate");
                throw null;
            }
            cameraState = mapCameraManagerDelegate.getCameraState();
        }
        scaleBarPluginImpl.invalidateScaleBar(cameraState);
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsBase
    public void applySettings() {
        ScaleBar scaleBar = this.scaleBar;
        if (scaleBar == null) {
            s.m("scaleBar");
            throw null;
        }
        scaleBar.setSettings(getInternalSettings());
        invalidateScaleBar$default(this, null, 1, null);
    }

    @Override // com.mapbox.maps.plugin.ViewPlugin
    public View bind(FrameLayout mapView, AttributeSet attrs, float pixelRatio) {
        mapView.getClass();
        ScaleBarAttributeParser scaleBarAttributeParser = ScaleBarAttributeParser.INSTANCE;
        Context context = mapView.getContext();
        context.getClass();
        setInternalSettings(scaleBarAttributeParser.parseScaleBarSettings(context, attrs, pixelRatio));
        l<Context, ScaleBarImpl> lVar = this.viewImplProvider;
        Context context2 = mapView.getContext();
        context2.getClass();
        ScaleBarImpl scaleBarImplInvoke = lVar.invoke(context2);
        scaleBarImplInvoke.getClass();
        scaleBarImplInvoke.setPixelRatio(pixelRatio);
        return scaleBarImplInvoke;
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void cleanup() {
        Cancelable cancelable = this.cancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
    }

    @Override // com.mapbox.maps.plugin.scalebar.ScaleBarPlugin
    public float getDistancePerPixel() {
        ScaleBar scaleBar = this.scaleBar;
        if (scaleBar != null) {
            return scaleBar.getDistancePerPixel();
        }
        s.m("scaleBar");
        throw null;
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsBase, com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public boolean getEnabled() {
        return getInternalSettings().getEnabled();
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsBase
    public ScaleBarSettings getInternalSettings() {
        return this.internalSettings;
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsBase, com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public boolean getUseContinuousRendering() {
        ScaleBar scaleBar = this.scaleBar;
        if (scaleBar != null) {
            return scaleBar.getUseContinuousRendering();
        }
        s.m("scaleBar");
        throw null;
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void initialize() {
        applySettings();
        MapListenerDelegate mapListenerDelegate = this.mapListenerDelegate;
        if (mapListenerDelegate != null) {
            this.cancelable = mapListenerDelegate.subscribeCameraChangedCoalesced(this.cameraChangedCoalescedCallback);
        } else {
            s.m("mapListenerDelegate");
            throw null;
        }
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void onDelegateProvider(MapDelegateProvider delegateProvider) {
        delegateProvider.getClass();
        this.mapCameraManagerDelegate = delegateProvider.getMapCameraManagerDelegate();
        this.mapListenerDelegate = delegateProvider.getMapListenerDelegate();
        this.mapTransformDelegate = delegateProvider.getMapTransformDelegate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.mapbox.maps.plugin.ViewPlugin
    public void onPluginView(View view2) {
        view2.getClass();
        ScaleBar scaleBar = view2 instanceof ScaleBar ? (ScaleBar) view2 : null;
        if (scaleBar != null) {
            this.scaleBar = scaleBar;
        } else {
            h.s("The provided view needs to implement ScaleBarContract.ScaleBarView");
        }
    }

    @Override // com.mapbox.maps.plugin.MapSizePlugin
    public void onSizeChanged(int width, int height) {
        ScaleBar scaleBar = this.scaleBar;
        if (scaleBar == null) {
            s.m("scaleBar");
            throw null;
        }
        scaleBar.setMapViewWidth(width);
        if (getEnabled()) {
            invalidateScaleBar$default(this, null, 1, null);
        }
    }

    @Override // com.mapbox.maps.plugin.scalebar.ScaleBarPlugin
    public void setDistancePerPixel(float f14) {
        ScaleBar scaleBar = this.scaleBar;
        if (scaleBar != null) {
            scaleBar.setDistancePerPixel(f14);
        } else {
            s.m("scaleBar");
            throw null;
        }
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsBase, com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setEnabled(boolean z14) {
        if (getInternalSettings().getEnabled() == z14) {
            return;
        }
        if (z14) {
            MapListenerDelegate mapListenerDelegate = this.mapListenerDelegate;
            if (mapListenerDelegate == null) {
                s.m("mapListenerDelegate");
                throw null;
            }
            this.cancelable = mapListenerDelegate.subscribeCameraChangedCoalesced(this.cameraChangedCoalescedCallback);
            invalidateScaleBar$default(this, null, 1, null);
        } else {
            Cancelable cancelable = this.cancelable;
            if (cancelable != null) {
                cancelable.cancel();
            }
        }
        setInternalSettings(getInternalSettings().toBuilder().setEnabled(z14).build());
        ScaleBar scaleBar = this.scaleBar;
        if (scaleBar != null) {
            scaleBar.setEnable(z14);
        } else {
            s.m("scaleBar");
            throw null;
        }
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsBase
    public void setInternalSettings(ScaleBarSettings scaleBarSettings) {
        scaleBarSettings.getClass();
        this.internalSettings = scaleBarSettings;
    }

    @Override // com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsBase, com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettingsInterface
    public void setUseContinuousRendering(boolean z14) {
        ScaleBar scaleBar = this.scaleBar;
        if (scaleBar != null) {
            scaleBar.setUseContinuousRendering(z14);
        } else {
            s.m("scaleBar");
            throw null;
        }
    }

    public /* synthetic */ ScaleBarPluginImpl(l lVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? AnonymousClass1.INSTANCE : lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScaleBarPluginImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
