package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import com.amap.api.maps.interfaces.INativeOverlayLayer;
import com.amap.api.maps.model.BaseOverlay;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.mapcore.FPoint;
import defpackage.c5s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class ae extends FrameLayout implements INativeOverlayLayer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f5968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IAMapDelegate f5969b;
    public final ConcurrentHashMap<String, c5s> c;

    public ae(Context context, IAMapDelegate iAMapDelegate) {
        super(context);
        this.c = new ConcurrentHashMap<>();
        this.f5968a = context;
        this.f5969b = iAMapDelegate;
    }

    public final boolean a(c5s c5sVar) {
        View viewE = c5sVar.e();
        if (viewE.getVisibility() == 8) {
            return false;
        }
        Rect rect = new Rect();
        viewE.getHitRect(rect);
        return rect.top <= this.f5969b.getMapHeight() && rect.bottom >= 0 && rect.left <= this.f5969b.getMapWidth() && rect.right >= 0;
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final void addNativeOverlay(Marker marker, MarkerOptions markerOptions) {
        LatLng position = marker.getPosition();
        IPoint iPointObtain = IPoint.obtain();
        if (position != null) {
            this.f5969b.getLatLng2Pixel(position.latitude, position.longitude, iPointObtain);
        }
        c5s c5sVar = new c5s(marker, ((Point) iPointObtain).x, ((Point) iPointObtain).y);
        iPointObtain.recycle();
        this.c.put(marker.getId(), c5sVar);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = c5sVar.f();
        layoutParams.topMargin = c5sVar.g();
        View viewE = c5sVar.e();
        if (viewE != null) {
            addView(viewE, layoutParams);
        }
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final boolean checkInBounds(String str) {
        c5s c5sVar = this.c.get(str);
        if (c5sVar == null) {
            return false;
        }
        return a(c5sVar);
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final void clear() {
        View viewE;
        Iterator<Map.Entry<String, c5s>> it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            c5s value = it.next().getValue();
            if (value != null && (viewE = value.e()) != null) {
                removeView(viewE);
            }
        }
        this.c.clear();
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final BaseOverlay getHitOverlay(DPoint dPoint, int i) {
        BaseOverlay baseOverlayA;
        Iterator<Map.Entry<String, c5s>> it = this.c.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                baseOverlayA = null;
                break;
            }
            c5s value = it.next().getValue();
            if (value != null && value.d(dPoint)) {
                baseOverlayA = value.a();
                break;
            }
        }
        if (baseOverlayA != null && (baseOverlayA instanceof Marker) && ((Marker) baseOverlayA).getId().contains("MARKER")) {
            return baseOverlayA;
        }
        return null;
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final List<Marker> getMapScreenMarkers() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, c5s> entry : this.c.entrySet()) {
            c5s value = entry.getValue();
            String key = entry.getKey();
            if (value != null && key.contains("MARKER") && a(value)) {
                BaseOverlay baseOverlayA = value.a();
                if (baseOverlayA instanceof Marker) {
                    arrayList.add((Marker) baseOverlayA);
                }
            }
        }
        return arrayList;
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final void getMarkerInfoWindowOffset(String str, FPoint fPoint) {
        Marker marker;
        MarkerOptions options;
        c5s c5sVar = this.c.get(str);
        if (c5sVar == null || (marker = (Marker) c5sVar.a()) == null || (options = marker.getOptions()) == null) {
            return;
        }
        ((PointF) fPoint).x = options.getInfoWindowOffsetX() + (c5sVar.e().getWidth() * marker.getOptions().getAnchorU());
        ((PointF) fPoint).y = options.getInfoWindowOffsetY();
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final Rect getOverlayBoundRect(String str) {
        View viewE;
        Rect rect = new Rect();
        c5s c5sVar = this.c.get(str);
        if (c5sVar != null && (viewE = c5sVar.e()) != null) {
            viewE.getHitRect(rect);
        }
        return rect;
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final void getOverlayScreenPos(String str, FPoint fPoint) {
        c5s c5sVar = this.c.get(str);
        if (c5sVar == null) {
            return;
        }
        ((PointF) fPoint).x = c5sVar.f();
        ((PointF) fPoint).y = c5sVar.g();
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final void hideInfoWindow(String str) {
        c5s c5sVar = this.c.get(str);
        if (c5sVar == null) {
            return;
        }
        c5sVar.c(false);
        try {
            this.f5969b.hideInfoWindow();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final boolean isInfoWindowShown(String str) {
        c5s c5sVar = this.c.get(str);
        if (c5sVar == null || ((Marker) c5sVar.a()) == null) {
            return false;
        }
        return c5sVar.j();
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final void redrawOverlays() {
        Iterator<Map.Entry<String, c5s>> it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            c5s value = it.next().getValue();
            if (value != null) {
                value.i();
                value.h();
            }
        }
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final void removeNativeOverlay(String str) {
        c5s c5sVar = this.c.get(str);
        if (c5sVar != null) {
            View viewE = c5sVar.e();
            if (viewE != null) {
                removeView(viewE);
            }
            this.c.remove(str);
        }
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final void screenShotOverlays(Canvas canvas) {
        View viewE;
        Iterator<Map.Entry<String, c5s>> it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            c5s value = it.next().getValue();
            if (value != null && (viewE = value.e()) != null) {
                viewE.setDrawingCacheEnabled(true);
                viewE.invalidate();
                viewE.buildDrawingCache();
                Bitmap drawingCache = viewE.getDrawingCache();
                if (drawingCache != null) {
                    Rect rect = new Rect();
                    viewE.getHitRect(rect);
                    canvas.drawBitmap(drawingCache, rect.left, rect.top, new Paint());
                }
                viewE.setDrawingCacheEnabled(false);
            }
        }
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final void set2Top(String str) {
        c5s c5sVar = this.c.get(str);
        if (c5sVar == null) {
            return;
        }
        c5sVar.e().setFocusable(true);
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final void showInfoWindow(String str) {
        Marker marker;
        c5s c5sVar = this.c.get(str);
        if (c5sVar == null || (marker = (Marker) c5sVar.a()) == null) {
            return;
        }
        try {
            this.f5969b.showInfoWindow(marker);
        } catch (Exception e) {
            e.printStackTrace();
        }
        c5sVar.c(true);
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final void updateOverlayOption(String str, MarkerOptions markerOptions) {
        Marker marker;
        c5s c5sVar = this.c.get(str);
        if (c5sVar == null || (marker = (Marker) c5sVar.a()) == null || markerOptions == null) {
            return;
        }
        c5sVar.i();
        MarkerOptions.MarkerUpdateFlags updateFlags = markerOptions.getUpdateFlags();
        if (updateFlags.latlngUpdate || updateFlags.anchorUpdate) {
            LatLng position = marker.getPosition();
            IPoint iPointObtain = IPoint.obtain();
            if (position != null) {
                this.f5969b.getLatLng2Pixel(position.latitude, position.longitude, iPointObtain);
            }
            c5sVar.b(((Point) iPointObtain).x, ((Point) iPointObtain).y);
            iPointObtain.recycle();
            c5sVar.h();
        }
        if (marker.isInfoWindowShown()) {
            this.f5969b.redrawInfoWindow();
        }
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final void updateOverlaysPosition() {
        BaseOverlay baseOverlayA;
        Iterator<Map.Entry<String, c5s>> it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            c5s value = it.next().getValue();
            if (value != null && (baseOverlayA = value.a()) != null) {
                Marker marker = baseOverlayA instanceof Marker ? (Marker) baseOverlayA : null;
                if (marker != null) {
                    LatLng position = marker.getPosition();
                    IPoint iPointObtain = IPoint.obtain();
                    if (position != null) {
                        this.f5969b.getLatLng2Pixel(position.latitude, position.longitude, iPointObtain);
                    }
                    value.b(((Point) iPointObtain).x, ((Point) iPointObtain).y);
                    iPointObtain.recycle();
                }
            }
        }
        this.f5969b.redrawNativeOverlays();
    }
}
