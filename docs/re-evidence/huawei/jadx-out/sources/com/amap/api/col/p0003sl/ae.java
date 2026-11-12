package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class ae extends FrameLayout implements INativeOverlayLayer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IAMapDelegate f2197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap<String, af> f2198c;

    public ae(Context context, IAMapDelegate iAMapDelegate) {
        super(context);
        this.f2198c = new ConcurrentHashMap<>();
        this.f2196a = context;
        this.f2197b = iAMapDelegate;
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final void addNativeOverlay(Marker marker, MarkerOptions markerOptions) {
        LatLng position = marker.getPosition();
        IPoint iPointObtain = IPoint.obtain();
        if (position != null) {
            this.f2197b.getLatLng2Pixel(position.latitude, position.longitude, iPointObtain);
        }
        af afVar = new af(marker, iPointObtain.x, iPointObtain.y);
        iPointObtain.recycle();
        this.f2198c.put(marker.getId(), afVar);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = afVar.c();
        layoutParams.topMargin = afVar.d();
        View viewB = afVar.b();
        if (viewB != null) {
            addView(viewB, layoutParams);
        }
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final void removeNativeOverlay(String str) {
        af afVar = this.f2198c.get(str);
        if (afVar != null) {
            View viewB = afVar.b();
            if (viewB != null) {
                removeView(viewB);
            }
            this.f2198c.remove(str);
        }
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final void updateOverlayOption(String str, MarkerOptions markerOptions) {
        Marker marker;
        af afVar = this.f2198c.get(str);
        if (afVar == null || (marker = (Marker) afVar.a()) == null || markerOptions == null) {
            return;
        }
        afVar.f();
        MarkerOptions.MarkerUpdateFlags updateFlags = markerOptions.getUpdateFlags();
        if (updateFlags.latlngUpdate || updateFlags.anchorUpdate) {
            LatLng position = marker.getPosition();
            IPoint iPointObtain = IPoint.obtain();
            if (position != null) {
                this.f2197b.getLatLng2Pixel(position.latitude, position.longitude, iPointObtain);
            }
            afVar.a(iPointObtain.x, iPointObtain.y);
            iPointObtain.recycle();
            afVar.e();
        }
        if (marker.isInfoWindowShown()) {
            this.f2197b.redrawInfoWindow();
        }
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final void updateOverlaysPosition() {
        BaseOverlay baseOverlayA;
        Iterator<Map.Entry<String, af>> it = this.f2198c.entrySet().iterator();
        while (it.hasNext()) {
            af value = it.next().getValue();
            if (value != null && (baseOverlayA = value.a()) != null) {
                Marker marker = baseOverlayA instanceof Marker ? (Marker) baseOverlayA : null;
                if (marker != null) {
                    LatLng position = marker.getPosition();
                    IPoint iPointObtain = IPoint.obtain();
                    if (position != null) {
                        this.f2197b.getLatLng2Pixel(position.latitude, position.longitude, iPointObtain);
                    }
                    value.a(iPointObtain.x, iPointObtain.y);
                    iPointObtain.recycle();
                }
            }
        }
        this.f2197b.redrawNativeOverlays();
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final void showInfoWindow(String str) {
        Marker marker;
        af afVar = this.f2198c.get(str);
        if (afVar == null || (marker = (Marker) afVar.a()) == null) {
            return;
        }
        try {
            this.f2197b.showInfoWindow(marker);
        } catch (Exception e) {
            e.printStackTrace();
        }
        afVar.a(true);
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final void hideInfoWindow(String str) {
        af afVar = this.f2198c.get(str);
        if (afVar == null) {
            return;
        }
        afVar.a(false);
        try {
            this.f2197b.hideInfoWindow();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final boolean isInfoWindowShown(String str) {
        af afVar = this.f2198c.get(str);
        if (afVar == null || ((Marker) afVar.a()) == null) {
            return false;
        }
        return afVar.g();
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final void getOverlayScreenPos(String str, FPoint fPoint) {
        af afVar = this.f2198c.get(str);
        if (afVar == null) {
            return;
        }
        fPoint.x = afVar.c();
        fPoint.y = afVar.d();
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final void getMarkerInfoWindowOffset(String str, FPoint fPoint) {
        Marker marker;
        MarkerOptions options;
        af afVar = this.f2198c.get(str);
        if (afVar == null || (marker = (Marker) afVar.a()) == null || (options = marker.getOptions()) == null) {
            return;
        }
        fPoint.x = options.getInfoWindowOffsetX() + (afVar.b().getWidth() * marker.getOptions().getAnchorU());
        fPoint.y = options.getInfoWindowOffsetY();
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final boolean checkInBounds(String str) {
        af afVar = this.f2198c.get(str);
        if (afVar == null) {
            return false;
        }
        return a(afVar);
    }

    private boolean a(af afVar) {
        View viewB = afVar.b();
        if (viewB.getVisibility() == 8) {
            return false;
        }
        Rect rect = new Rect();
        viewB.getHitRect(rect);
        return rect.top <= this.f2197b.getMapHeight() && rect.bottom >= 0 && rect.left <= this.f2197b.getMapWidth() && rect.right >= 0;
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final BaseOverlay getHitOverlay(DPoint dPoint, int i) {
        BaseOverlay baseOverlayA;
        Iterator<Map.Entry<String, af>> it = this.f2198c.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                baseOverlayA = null;
                break;
            }
            af value = it.next().getValue();
            if (value != null && value.a(dPoint)) {
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
    public final void set2Top(String str) {
        af afVar = this.f2198c.get(str);
        if (afVar == null) {
            return;
        }
        afVar.b().setFocusable(true);
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final List<Marker> getMapScreenMarkers() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, af> entry : this.f2198c.entrySet()) {
            af value = entry.getValue();
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
    public final Rect getOverlayBoundRect(String str) {
        View viewB;
        Rect rect = new Rect();
        af afVar = this.f2198c.get(str);
        if (afVar != null && (viewB = afVar.b()) != null) {
            viewB.getHitRect(rect);
        }
        return rect;
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final void clear() {
        View viewB;
        Iterator<Map.Entry<String, af>> it = this.f2198c.entrySet().iterator();
        while (it.hasNext()) {
            af value = it.next().getValue();
            if (value != null && (viewB = value.b()) != null) {
                removeView(viewB);
            }
        }
        this.f2198c.clear();
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final void screenShotOverlays(Canvas canvas) {
        View viewB;
        Iterator<Map.Entry<String, af>> it = this.f2198c.entrySet().iterator();
        while (it.hasNext()) {
            af value = it.next().getValue();
            if (value != null && (viewB = value.b()) != null) {
                viewB.setDrawingCacheEnabled(true);
                viewB.invalidate();
                viewB.buildDrawingCache();
                Bitmap drawingCache = viewB.getDrawingCache();
                if (drawingCache != null) {
                    Rect rect = new Rect();
                    viewB.getHitRect(rect);
                    canvas.drawBitmap(drawingCache, rect.left, rect.top, new Paint());
                }
                viewB.setDrawingCacheEnabled(false);
            }
        }
    }

    @Override // com.amap.api.maps.interfaces.INativeOverlayLayer
    public final void redrawOverlays() {
        Iterator<Map.Entry<String, af>> it = this.f2198c.entrySet().iterator();
        while (it.hasNext()) {
            af value = it.next().getValue();
            if (value != null) {
                value.f();
                value.e();
            }
        }
    }
}
