package com.mapbox.maps.debugoptions;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.firebase.crashlytics.internal.common.i;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.CameraChangedCoalesced;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxMap;
import g23.a;
import g23.c;
import g23.e;
import java.util.Set;
import k23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.b0;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p13.l0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BA\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\b¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR+\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R6\u0010)\u001a\b\u0012\u0004\u0012\u00020'0&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/mapbox/maps/debugoptions/DebugOptionsController;", "", "Landroid/widget/FrameLayout;", "mapView", "Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "<init>", "(Landroid/widget/FrameLayout;Lcom/mapbox/maps/MapboxMap;)V", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcom/mapbox/maps/debugoptions/CameraDebugView;", "cameraDebugViewProvider", "Lcom/mapbox/maps/debugoptions/PaddingDebugView;", "paddingDebugViewProvider", "(Landroid/widget/FrameLayout;Lcom/mapbox/maps/MapboxMap;Le23/l;Le23/l;)V", "", "updateCameraSubscriptionIfNeeded", "()V", "toggleMapViewDebugOptionsIfNeeded", "Landroid/widget/FrameLayout;", "Lcom/mapbox/maps/MapboxMap;", "Le23/l;", "cameraDebugView", "Lcom/mapbox/maps/debugoptions/CameraDebugView;", "paddingDebugView", "Lcom/mapbox/maps/debugoptions/PaddingDebugView;", "Lcom/mapbox/common/Cancelable;", "cameraSubscriptionCancelable", "Lcom/mapbox/common/Cancelable;", "", "<set-?>", "started$delegate", "Lg23/e;", "getStarted", "()Z", "setStarted", "(Z)V", "started", "", "Lcom/mapbox/maps/debugoptions/MapViewDebugOptions;", "newValue", "options", "Ljava/util/Set;", "getOptions", "()Ljava/util/Set;", "setOptions", "(Ljava/util/Set;)V", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DebugOptionsController {
    static final /* synthetic */ l<Object>[] $$delegatedProperties = {s0.f105811a.f(new b0(DebugOptionsController.class, "started", "getStarted()Z", 0))};
    private CameraDebugView cameraDebugView;
    private final e23.l<Context, CameraDebugView> cameraDebugViewProvider;
    private Cancelable cameraSubscriptionCancelable;
    private final FrameLayout mapView;
    private final MapboxMap mapboxMap;
    private Set<MapViewDebugOptions> options;
    private PaddingDebugView paddingDebugView;
    private final e23.l<Context, PaddingDebugView> paddingDebugViewProvider;

    /* JADX INFO: renamed from: started$delegate, reason: from kotlin metadata */
    private final e started;

    /* JADX INFO: renamed from: com.mapbox.maps.debugoptions.DebugOptionsController$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/debugoptions/CameraDebugView;", "it", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements e23.l<Context, CameraDebugView> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // e23.l
        public final CameraDebugView invoke(Context context) {
            context.getClass();
            return new CameraDebugView(context, null, 0, 6, null);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.debugoptions.DebugOptionsController$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mapbox/maps/debugoptions/PaddingDebugView;", "it", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements e23.l<Context, PaddingDebugView> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // e23.l
        public final PaddingDebugView invoke(Context context) {
            context.getClass();
            return new PaddingDebugView(context, null, 0, 6, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DebugOptionsController(FrameLayout frameLayout, MapboxMap mapboxMap, e23.l<? super Context, CameraDebugView> lVar, e23.l<? super Context, PaddingDebugView> lVar2) {
        frameLayout.getClass();
        mapboxMap.getClass();
        lVar.getClass();
        lVar2.getClass();
        a aVar = a.f75578a;
        final Boolean bool = Boolean.FALSE;
        this.started = new c<Boolean>(bool) { // from class: com.mapbox.maps.debugoptions.DebugOptionsController$special$$inlined$observable$1
            @Override // g23.c
            public void afterChange(l<?> property, Boolean oldValue, Boolean newValue) {
                property.getClass();
                if (oldValue.booleanValue() != newValue.booleanValue()) {
                    this.updateCameraSubscriptionIfNeeded();
                }
            }
        };
        this.options = l0.f134950a;
        this.mapView = frameLayout;
        this.mapboxMap = mapboxMap;
        this.cameraDebugViewProvider = lVar;
        this.paddingDebugViewProvider = lVar2;
    }

    private final void toggleMapViewDebugOptionsIfNeeded() {
        boolean zContains = this.options.contains(MapViewDebugOptions.CAMERA);
        CameraDebugView cameraDebugView = this.cameraDebugView;
        if (zContains) {
            if (cameraDebugView == null) {
                e23.l<Context, CameraDebugView> lVar = this.cameraDebugViewProvider;
                Context context = this.mapView.getContext();
                context.getClass();
                CameraDebugView cameraDebugViewInvoke = lVar.invoke(context);
                this.mapView.addView(cameraDebugViewInvoke);
                cameraDebugViewInvoke.update(this.mapboxMap.getCameraState());
                this.cameraDebugView = cameraDebugViewInvoke;
            }
        } else if (cameraDebugView != null) {
            this.mapView.removeView(cameraDebugView);
            this.cameraDebugView = null;
        }
        boolean zContains2 = this.options.contains(MapViewDebugOptions.PADDING);
        PaddingDebugView paddingDebugView = this.paddingDebugView;
        if (!zContains2) {
            if (paddingDebugView != null) {
                this.mapView.removeView(paddingDebugView);
                this.paddingDebugView = null;
                return;
            }
            return;
        }
        if (paddingDebugView == null) {
            e23.l<Context, PaddingDebugView> lVar2 = this.paddingDebugViewProvider;
            Context context2 = this.mapView.getContext();
            context2.getClass();
            PaddingDebugView paddingDebugViewInvoke = lVar2.invoke(context2);
            this.mapView.addView(paddingDebugViewInvoke);
            EdgeInsets padding = this.mapboxMap.getCameraState().getPadding();
            padding.getClass();
            paddingDebugViewInvoke.update(padding);
            this.paddingDebugView = paddingDebugViewInvoke;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCameraSubscriptionIfNeeded() {
        boolean z14 = this.options.contains(MapViewDebugOptions.CAMERA) || this.options.contains(MapViewDebugOptions.PADDING);
        if (getStarted() && z14 && this.cameraSubscriptionCancelable == null) {
            this.cameraSubscriptionCancelable = this.mapboxMap.subscribeCameraChangedCoalesced(new i(this, 23));
            return;
        }
        Cancelable cancelable = this.cameraSubscriptionCancelable;
        if (cancelable != null) {
            cancelable.cancel();
        }
        this.cameraSubscriptionCancelable = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCameraSubscriptionIfNeeded$lambda$1(DebugOptionsController debugOptionsController, CameraChangedCoalesced cameraChangedCoalesced) {
        debugOptionsController.getClass();
        cameraChangedCoalesced.getClass();
        CameraDebugView cameraDebugView = debugOptionsController.cameraDebugView;
        if (cameraDebugView != null) {
            CameraState cameraState = cameraChangedCoalesced.getCameraState();
            cameraState.getClass();
            cameraDebugView.update(cameraState);
        }
        PaddingDebugView paddingDebugView = debugOptionsController.paddingDebugView;
        if (paddingDebugView != null) {
            EdgeInsets padding = cameraChangedCoalesced.getCameraState().getPadding();
            padding.getClass();
            paddingDebugView.update(padding);
        }
    }

    public final Set<MapViewDebugOptions> getOptions() {
        return this.options;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getStarted() {
        return ((Boolean) this.started.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void setOptions(Set<MapViewDebugOptions> set) {
        set.getClass();
        this.options = set;
        this.mapboxMap.setDebugOptions$maps_sdk_release(MapViewDebugOptionsKt.getNativeDebugOptions(set));
        toggleMapViewDebugOptionsIfNeeded();
        updateCameraSubscriptionIfNeeded();
    }

    public final void setStarted(boolean z14) {
        this.started.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z14));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DebugOptionsController(FrameLayout frameLayout, MapboxMap mapboxMap) {
        this(frameLayout, mapboxMap, AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE);
        frameLayout.getClass();
        mapboxMap.getClass();
    }
}
