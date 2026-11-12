package com.mapbox.maps.plugin.overlay;

import android.view.View;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.plugin.delegates.MapCameraManagerDelegate;
import com.mapbox.maps.plugin.delegates.MapDelegateProvider;
import e23.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p13.h0;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\u001bJ\u001d\u0010!\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001cH\u0016¢\u0006\u0004\b!\u0010\u001fJ/\u0010&\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000fH\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010\b\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b\b\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0006H\u0016¢\u0006\u0004\b.\u0010\u0003J\u0017\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\n038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u00106\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u0011\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u00108\u001a\u0004\b=\u0010:\"\u0004\b>\u0010<R\u0016\u0010#\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u00108R\u0016\u0010\"\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00108R\u0016\u0010%\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00108R\u0016\u0010$\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00108R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lcom/mapbox/maps/plugin/overlay/MapOverlayPluginImpl;", "Lcom/mapbox/maps/plugin/overlay/MapOverlayPlugin;", "<init>", "()V", "Lkotlin/Function1;", "Lcom/mapbox/maps/CameraOptions;", "", "result", "reframe", "(Le23/l;)V", "Landroid/view/View;", "view", "Lcom/mapbox/maps/plugin/overlay/MapOverlayPluginImpl$MapOverLayRect;", "getMapOverLayRect", "(Landroid/view/View;)Lcom/mapbox/maps/plugin/overlay/MapOverlayPluginImpl$MapOverLayRect;", "", "width", "height", "onSizeChanged", "(II)V", "Lcom/mapbox/maps/plugin/overlay/MapOverlayCoordinatesProvider;", "provider", "registerMapOverlayCoordinatesProvider", "(Lcom/mapbox/maps/plugin/overlay/MapOverlayCoordinatesProvider;)V", "unregisterMapOverlayCoordinatesProvider", "overlay", "registerOverlay", "(Landroid/view/View;)V", "", "overlays", "registerOverlays", "(Ljava/util/List;)V", "unregisterOverlay", "unregisterOverlays", "marginTop", "marginLeft", "marginBottom", "marginRight", "setDisplayingAreaMargins", "(IIII)V", "Lcom/mapbox/maps/plugin/overlay/OnReframeFinished;", "onReframeFinished", "(Lcom/mapbox/maps/plugin/overlay/OnReframeFinished;)V", "Lcom/mapbox/maps/EdgeInsets;", "getEdgeInsets", "()Lcom/mapbox/maps/EdgeInsets;", "cleanup", "Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;", "delegateProvider", "onDelegateProvider", "(Lcom/mapbox/maps/plugin/delegates/MapDelegateProvider;)V", "", "mapOverlays", "Ljava/util/List;", "mapOverlayCoordinatesProvider", "Lcom/mapbox/maps/plugin/overlay/MapOverlayCoordinatesProvider;", "I", "getWidth$plugin_overlay_release", "()I", "setWidth$plugin_overlay_release", "(I)V", "getHeight$plugin_overlay_release", "setHeight$plugin_overlay_release", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "mapCameraManagerDelegate", "Lcom/mapbox/maps/plugin/delegates/MapCameraManagerDelegate;", "MapOverLayRect", "plugin-overlay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapOverlayPluginImpl implements MapOverlayPlugin {
    private int height;
    private MapCameraManagerDelegate mapCameraManagerDelegate;
    private MapOverlayCoordinatesProvider mapOverlayCoordinatesProvider;
    private final List<View> mapOverlays = new ArrayList();
    private int marginBottom;
    private int marginLeft;
    private int marginRight;
    private int marginTop;
    private int width;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0000H\u0096\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0000J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0003J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0003J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0003R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/mapbox/maps/plugin/overlay/MapOverlayPluginImpl$MapOverLayRect;", "", TtmlNode.LEFT, "", "top", TtmlNode.RIGHT, "bottom", "(IIII)V", "getBottom", "()I", "setBottom", "(I)V", "getLeft", "setLeft", "getRight", "setRight", "getTop", "setTop", "compareTo", "other", "isOverLap", "", "reactAnother", "updateBottom", "newBottom", "updateLeft", "newLeft", "updateRight", "newRight", "updateTop", "newTop", "plugin-overlay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class MapOverLayRect implements Comparable<MapOverLayRect> {
        private int bottom;
        private int left;
        private int right;
        private int top;

        public MapOverLayRect(int i14, int i15, int i16, int i17) {
            this.left = i14;
            this.top = i15;
            this.right = i16;
            this.bottom = i17;
        }

        @Override // java.lang.Comparable
        public int compareTo(MapOverLayRect other) {
            other.getClass();
            return ((this.bottom - this.top) * (this.right - this.left)) - ((other.bottom - other.top) * (other.right - other.left));
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getRight() {
            return this.right;
        }

        public final int getTop() {
            return this.top;
        }

        public final boolean isOverLap(MapOverLayRect reactAnother) {
            reactAnother.getClass();
            return this.right > reactAnother.left && this.bottom > reactAnother.top && this.left < reactAnother.right && this.top < reactAnother.bottom;
        }

        public final void setBottom(int i14) {
            this.bottom = i14;
        }

        public final void setLeft(int i14) {
            this.left = i14;
        }

        public final void setRight(int i14) {
            this.right = i14;
        }

        public final void setTop(int i14) {
            this.top = i14;
        }

        public final MapOverLayRect updateBottom(int newBottom) {
            return new MapOverLayRect(this.left, this.top, this.right, newBottom);
        }

        public final MapOverLayRect updateLeft(int newLeft) {
            return new MapOverLayRect(newLeft, this.top, this.right, this.bottom);
        }

        public final MapOverLayRect updateRight(int newRight) {
            return new MapOverLayRect(this.left, this.top, newRight, this.bottom);
        }

        public final MapOverLayRect updateTop(int newTop) {
            return new MapOverLayRect(this.left, newTop, this.right, this.bottom);
        }
    }

    private final MapOverLayRect getMapOverLayRect(View view2) {
        return new MapOverLayRect(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
    }

    private final void reframe(l<? super CameraOptions, Unit> result) {
        Unit unit;
        MapOverlayCoordinatesProvider mapOverlayCoordinatesProvider = this.mapOverlayCoordinatesProvider;
        if (mapOverlayCoordinatesProvider != null) {
            double dMax = -90.0d;
            double dMin = 90.0d;
            double dMin2 = 180.0d;
            double dMax2 = -180.0d;
            for (Point point : mapOverlayCoordinatesProvider.getShownCoordinates()) {
                dMax = Math.max(dMax, point.latitude());
                dMin = Math.min(dMin, point.latitude());
                dMin2 = Math.min(dMin2, point.longitude());
                dMax2 = Math.max(dMax2, point.longitude());
            }
            MapCameraManagerDelegate mapCameraManagerDelegate = this.mapCameraManagerDelegate;
            if (mapCameraManagerDelegate == null) {
                s.m("mapCameraManagerDelegate");
                throw null;
            }
            List<Point> listK = x.k(Point.fromLngLat(dMin2, dMin), Point.fromLngLat(dMax2, dMax));
            CameraOptions.Builder builder = new CameraOptions.Builder();
            Unit unit2 = Unit.INSTANCE;
            CameraOptions cameraOptionsBuild = builder.build();
            cameraOptionsBuild.getClass();
            mapCameraManagerDelegate.cameraForCoordinates(listK, cameraOptionsBuild, getEdgeInsets(), null, null, result);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            result.invoke(null);
        }
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void cleanup() {
        unregisterMapOverlayCoordinatesProvider();
        this.mapOverlays.clear();
    }

    @Override // com.mapbox.maps.plugin.overlay.MapOverlayPlugin
    public EdgeInsets getEdgeInsets() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(new MapOverLayRect(0, 0, this.width, this.height));
        List<View> list = this.mapOverlays;
        ArrayList<MapOverLayRect> arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(getMapOverLayRect((View) it.next()));
        }
        for (MapOverLayRect mapOverLayRect : arrayList) {
            for (int size = linkedList.size(); size > 0; size--) {
                Object objPollFirst = linkedList.pollFirst();
                objPollFirst.getClass();
                MapOverLayRect mapOverLayRect2 = (MapOverLayRect) objPollFirst;
                if (mapOverLayRect.isOverLap(mapOverLayRect2)) {
                    if (mapOverLayRect.getTop() - mapOverLayRect2.getTop() < mapOverLayRect2.getBottom() - mapOverLayRect.getBottom()) {
                        linkedList.offerLast(mapOverLayRect2.updateTop(mapOverLayRect.getBottom()));
                    } else if (mapOverLayRect.getTop() - mapOverLayRect2.getTop() > mapOverLayRect2.getBottom() - mapOverLayRect.getBottom()) {
                        linkedList.offerLast(mapOverLayRect2.updateBottom(mapOverLayRect.getTop()));
                    } else {
                        linkedList.offerLast(mapOverLayRect2.updateTop(mapOverLayRect.getBottom()));
                        linkedList.offerLast(mapOverLayRect2.updateBottom(mapOverLayRect.getTop()));
                    }
                    if (mapOverLayRect.getLeft() - mapOverLayRect2.getLeft() < mapOverLayRect2.getRight() - mapOverLayRect.getRight()) {
                        linkedList.offerLast(mapOverLayRect2.updateLeft(mapOverLayRect.getRight()));
                    } else if (mapOverLayRect.getLeft() - mapOverLayRect2.getLeft() < mapOverLayRect2.getRight() - mapOverLayRect.getRight()) {
                        linkedList.offerLast(mapOverLayRect2.updateRight(mapOverLayRect.getLeft()));
                    } else {
                        linkedList.offerLast(mapOverLayRect2.updateLeft(mapOverLayRect.getRight()));
                        linkedList.offerLast(mapOverLayRect2.updateRight(mapOverLayRect.getLeft()));
                    }
                } else {
                    linkedList.offerLast(mapOverLayRect2);
                }
            }
        }
        MapOverLayRect mapOverLayRect3 = (MapOverLayRect) h0.o0(linkedList);
        return mapOverLayRect3 == null ? new EdgeInsets(this.marginTop, this.marginLeft, this.marginBottom, this.marginRight) : new EdgeInsets(((double) mapOverLayRect3.getTop()) + ((double) this.marginTop), ((double) mapOverLayRect3.getLeft()) + ((double) this.marginLeft), (this.height - mapOverLayRect3.getBottom()) + this.marginBottom, (this.width - mapOverLayRect3.getRight()) + this.marginRight);
    }

    /* JADX INFO: renamed from: getHeight$plugin_overlay_release, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: getWidth$plugin_overlay_release, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void initialize() {
        MapOverlayPlugin.DefaultImpls.initialize(this);
    }

    @Override // com.mapbox.maps.plugin.MapPlugin
    public void onDelegateProvider(MapDelegateProvider delegateProvider) {
        delegateProvider.getClass();
        this.mapCameraManagerDelegate = delegateProvider.getMapCameraManagerDelegate();
    }

    @Override // com.mapbox.maps.plugin.MapSizePlugin
    public void onSizeChanged(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override // com.mapbox.maps.plugin.overlay.MapOverlayPlugin
    public void registerMapOverlayCoordinatesProvider(MapOverlayCoordinatesProvider provider) {
        provider.getClass();
        this.mapOverlayCoordinatesProvider = provider;
    }

    @Override // com.mapbox.maps.plugin.overlay.MapOverlayPlugin
    public void registerOverlay(View overlay) {
        overlay.getClass();
        this.mapOverlays.add(overlay);
    }

    @Override // com.mapbox.maps.plugin.overlay.MapOverlayPlugin
    public void registerOverlays(List<? extends View> overlays) {
        overlays.getClass();
        this.mapOverlays.addAll(overlays);
    }

    @Override // com.mapbox.maps.plugin.overlay.MapOverlayPlugin
    public void setDisplayingAreaMargins(int marginTop, int marginLeft, int marginBottom, int marginRight) {
        this.marginLeft = marginLeft;
        this.marginTop = marginTop;
        this.marginRight = marginRight;
        this.marginBottom = marginBottom;
    }

    public final void setHeight$plugin_overlay_release(int i14) {
        this.height = i14;
    }

    public final void setWidth$plugin_overlay_release(int i14) {
        this.width = i14;
    }

    @Override // com.mapbox.maps.plugin.overlay.MapOverlayPlugin
    public void unregisterMapOverlayCoordinatesProvider() {
        this.mapOverlayCoordinatesProvider = null;
    }

    @Override // com.mapbox.maps.plugin.overlay.MapOverlayPlugin
    public void unregisterOverlay(View overlay) {
        overlay.getClass();
        this.mapOverlays.remove(overlay);
    }

    @Override // com.mapbox.maps.plugin.overlay.MapOverlayPlugin
    public void unregisterOverlays(List<? extends View> overlays) {
        overlays.getClass();
        Iterator<T> it = overlays.iterator();
        while (it.hasNext()) {
            this.mapOverlays.remove((View) it.next());
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.overlay.MapOverlayPluginImpl$reframe$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "camera", "Lcom/mapbox/maps/CameraOptions;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<CameraOptions, Unit> {
        final /* synthetic */ OnReframeFinished $onReframeFinished;
        final /* synthetic */ MapOverlayPluginImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OnReframeFinished onReframeFinished, MapOverlayPluginImpl mapOverlayPluginImpl) {
            super(1);
            this.$onReframeFinished = onReframeFinished;
            this.this$0 = mapOverlayPluginImpl;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CameraOptions cameraOptions) {
            OnReframeFinished onReframeFinished = this.$onReframeFinished;
            if (onReframeFinished != null) {
                onReframeFinished.onReframeFinished(cameraOptions);
                return;
            }
            if (cameraOptions != null) {
                MapCameraManagerDelegate mapCameraManagerDelegate = this.this$0.mapCameraManagerDelegate;
                if (mapCameraManagerDelegate != null) {
                    mapCameraManagerDelegate.setCamera(cameraOptions);
                } else {
                    s.m("mapCameraManagerDelegate");
                    throw null;
                }
            }
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(CameraOptions cameraOptions) {
            invoke2(cameraOptions);
            return Unit.INSTANCE;
        }
    }

    @Override // com.mapbox.maps.plugin.overlay.MapOverlayPlugin
    public void reframe(OnReframeFinished onReframeFinished) {
        reframe(new AnonymousClass1(onReframeFinished, this));
    }
}
