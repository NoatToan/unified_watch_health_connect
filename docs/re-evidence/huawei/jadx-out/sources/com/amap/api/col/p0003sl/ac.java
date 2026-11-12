package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.amap.api.maps.model.BaseHoleOptions;
import com.amap.api.maps.model.BaseOptions;
import com.amap.api.maps.model.BaseOverlay;
import com.amap.api.maps.model.BasePointOverlay;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.CircleOptions;
import com.amap.api.maps.model.GLTFOverlay;
import com.amap.api.maps.model.ImageOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MultiPointItem;
import com.amap.api.maps.model.MultiPointOverlay;
import com.amap.api.maps.model.PolygonOptions;
import com.amap.api.maps.model.Polyline;
import com.amap.api.maps.model.PolylineOptions;
import com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileProvider;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.base.ae.gmap.AMapAppRequestParam;
import com.autonavi.base.ae.gmap.AMapAppResourceItem;
import com.autonavi.base.ae.gmap.bean.MultiPointItemHitTest;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer;
import com.autonavi.base.amap.mapcore.FPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class ac implements IGlOverlayLayer, AMapNativeGlOverlayLayer.NativeFunCallListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    IAMapDelegate f2188a;
    private Context d;
    private cq i;
    private int e = 0;
    private final Object f = new Object();
    private final Map<String, BaseOverlay> h = new ConcurrentHashMap();
    private BitmapDescriptor j = null;
    private BitmapDescriptor k = null;
    private BitmapDescriptor l = null;
    private BitmapDescriptor m = null;
    private BitmapDescriptor n = null;
    private BitmapDescriptor o = null;
    private BitmapDescriptor p = null;
    private BitmapDescriptor q = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f2189b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    List<String> f2190c = new ArrayList();
    private AMapNativeGlOverlayLayer g = new AMapNativeGlOverlayLayer();

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void changeOverlayIndex() {
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final BitmapDescriptor getInfoWindowClick(String str) {
        return null;
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final BitmapDescriptor getOverturnInfoWindow(String str) {
        return null;
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final BitmapDescriptor getOverturnInfoWindowClick(String str) {
        return null;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean removeOverlay(String str, boolean z) {
        return false;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final String createId(String str) {
        String str2;
        synchronized (this.f) {
            this.e++;
            str2 = str + this.e;
        }
        return str2;
    }

    public ac(IAMapDelegate iAMapDelegate, Context context) {
        this.f2188a = iAMapDelegate;
        this.d = context;
        this.i = new cq(iAMapDelegate);
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void clear(String... strArr) {
        synchronized (this) {
            try {
                AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.g;
                if (aMapNativeGlOverlayLayer != null && strArr != null) {
                    aMapNativeGlOverlayLayer.clear(strArr);
                }
                synchronized (this.h) {
                    try {
                        if (strArr != null) {
                            Iterator<Map.Entry<String, BaseOverlay>> it = this.h.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry<String, BaseOverlay> next = it.next();
                                int length = strArr.length;
                                int i = 0;
                                while (true) {
                                    if (i < length) {
                                        String str = strArr[i];
                                        if (str != null && str.equals(next.getKey())) {
                                            break;
                                        } else {
                                            i++;
                                        }
                                    } else {
                                        it.remove();
                                        break;
                                    }
                                }
                            }
                        } else {
                            this.h.clear();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                jv.c(th2, "GlOverlayLayer", CervicalMucusRecord.Appearance.CLEAR);
                th2.printStackTrace();
            }
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void clearOverlayByType(String str) {
        synchronized (this.h) {
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, BaseOverlay>> it = this.h.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                if (key.contains(str)) {
                    it.remove();
                    arrayList.add(key);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                removeOverlay((String) it2.next());
            }
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void destroy() {
        synchronized (this) {
            try {
                if (this.g == null) {
                    return;
                }
                synchronized (this.h) {
                    this.h.clear();
                }
                this.g.clear("");
                this.g.destroy();
                this.g = null;
            } catch (Throwable th) {
                jv.c(th, "GlOverlayLayer", "destroy");
                th.printStackTrace();
            }
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean draw(int i, int i2, boolean z) {
        synchronized (this) {
            boolean z2 = false;
            try {
                cq cqVar = this.i;
                if (cqVar != null) {
                    cqVar.a();
                }
                if (this.f2188a.getMapConfig() == null) {
                    return false;
                }
                AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.g;
                if (aMapNativeGlOverlayLayer != null) {
                    aMapNativeGlOverlayLayer.render(i, i2, z);
                }
                z2 = true;
            } catch (Throwable th) {
                jv.c(th, "GlOverlayLayer", "draw");
            }
            return z2;
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final BaseOverlay getHitBaseOverlay(LatLng latLng, int i) {
        BaseOverlay baseOverlay;
        synchronized (this) {
            AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.g;
            if (aMapNativeGlOverlayLayer == null) {
                return null;
            }
            String strContain = aMapNativeGlOverlayLayer.contain(latLng, i);
            if (TextUtils.isEmpty(strContain)) {
                return null;
            }
            synchronized (this.h) {
                baseOverlay = this.h.get(strContain);
            }
            return baseOverlay;
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final BaseOverlay getHitBaseOverlay(MotionEvent motionEvent, int i) {
        if (this.f2188a == null) {
            return null;
        }
        DPoint dPointObtain = DPoint.obtain();
        this.f2188a.getPixel2LatLng((int) motionEvent.getX(), (int) motionEvent.getY(), dPointObtain);
        LatLng latLng = new LatLng(dPointObtain.y, dPointObtain.x);
        dPointObtain.recycle();
        return getHitBaseOverlay(latLng, i);
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final Polyline getHitOverlay(LatLng latLng, int i) {
        synchronized (this) {
            AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.g;
            Polyline polyline = null;
            if (aMapNativeGlOverlayLayer != null) {
                String strContain = aMapNativeGlOverlayLayer.contain(latLng, i);
                if (TextUtils.isEmpty(strContain)) {
                    return null;
                }
                synchronized (this.h) {
                    BaseOverlay baseOverlay = this.h.get(strContain);
                    polyline = baseOverlay instanceof Polyline ? (Polyline) baseOverlay : null;
                }
            }
            return polyline;
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final IAMapDelegate getMap() {
        return this.f2188a;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void setRunLowFrame(boolean z) {
        IAMapDelegate iAMapDelegate = this.f2188a;
        if (iAMapDelegate != null) {
            iAMapDelegate.setRunLowFrame(z);
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void onCreateAMapInstance() {
        if (this.g == null) {
            this.g = new AMapNativeGlOverlayLayer();
        }
        this.g.setEngineId(this.f2188a.getNativeEngineID());
        this.g.createNative(this.f2188a.getGLMapEngine().getNativeInstance());
        this.g.setNativeFunCallListener(this);
    }

    private void a(String str, BaseOptions baseOptions) {
        try {
            this.g.createOverlay(str, baseOptions);
        } catch (Throwable th) {
            jv.c(th, "GlOverlayLayer", "addOverlay");
            th.printStackTrace();
            Log.d("amapApi", "GlOverlayLayer addOverlay error:" + th.getMessage());
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void updateOption(String str, BaseOptions baseOptions) {
        try {
            if (this.g == null) {
                return;
            }
            setRunLowFrame(false);
            this.g.updateOptions(str, baseOptions);
        } catch (Throwable th) {
            jv.c(th, "GlOverlayLayer", "updateOption");
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void removeOverlay(String str) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.g;
        if (aMapNativeGlOverlayLayer != null) {
            aMapNativeGlOverlayLayer.removeOverlay(str);
        }
        synchronized (this.h) {
            this.h.remove(str);
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final int getCurrentParticleNum(String str) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.g;
        if (aMapNativeGlOverlayLayer != null) {
            return aMapNativeGlOverlayLayer.getCurrentParticleNum(str);
        }
        return 0;
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final void onSetRunLowFrame(boolean z) {
        setRunLowFrame(z);
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final void onRedrawInfowindow() {
        IAMapDelegate iAMapDelegate = this.f2188a;
        if (iAMapDelegate != null) {
            iAMapDelegate.redrawInfoWindow();
        }
    }

    private BitmapDescriptor a(View view) {
        if (view == null) {
            return null;
        }
        if ((view instanceof RelativeLayout) && this.d != null) {
            LinearLayout linearLayout = new LinearLayout(this.d);
            linearLayout.setOrientation(1);
            linearLayout.addView(view);
            view = linearLayout;
        }
        view.setDrawingCacheEnabled(true);
        view.setDrawingCacheQuality(0);
        return BitmapDescriptorFactory.fromBitmap(eb.a(view));
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final BitmapDescriptor getInfoWindow(String str) {
        az infoWindowDelegate;
        IAMapDelegate iAMapDelegate = this.f2188a;
        if (iAMapDelegate == null || (infoWindowDelegate = iAMapDelegate.getInfoWindowDelegate()) == null) {
            return null;
        }
        BaseOverlay baseOverlay = this.h.get(str);
        if (baseOverlay instanceof BasePointOverlay) {
            return a(infoWindowDelegate.a((BasePointOverlay) baseOverlay));
        }
        return null;
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final BitmapDescriptor getInfoContents(String str) {
        az infoWindowDelegate;
        IAMapDelegate iAMapDelegate = this.f2188a;
        if (iAMapDelegate == null || (infoWindowDelegate = iAMapDelegate.getInfoWindowDelegate()) == null) {
            return null;
        }
        BaseOverlay baseOverlay = this.h.get(str);
        if (baseOverlay instanceof BasePointOverlay) {
            return a(infoWindowDelegate.b((BasePointOverlay) baseOverlay));
        }
        return null;
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final long getInfoWindowUpdateOffsetTime(String str) {
        az infoWindowDelegate;
        IAMapDelegate iAMapDelegate = this.f2188a;
        if (iAMapDelegate == null || (infoWindowDelegate = iAMapDelegate.getInfoWindowDelegate()) == null) {
            return 0L;
        }
        BaseOverlay baseOverlay = this.h.get(str);
        if (baseOverlay instanceof BasePointOverlay) {
            return infoWindowDelegate.c((BasePointOverlay) baseOverlay);
        }
        return 0L;
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final BitmapDescriptor getBuildInImageData(int i) {
        try {
            switch (i) {
                case 0:
                    BitmapDescriptor bitmapDescriptor = this.j;
                    if (bitmapDescriptor == null || bitmapDescriptor.getBitmap().isRecycled()) {
                        this.j = BitmapDescriptorFactory.fromBitmap(eb.a(this.d, "amap_sdk_lineTexture.png"));
                    }
                    return this.j;
                case 1:
                    BitmapDescriptor bitmapDescriptor2 = this.m;
                    if (bitmapDescriptor2 == null || bitmapDescriptor2.getBitmap().isRecycled()) {
                        this.m = BitmapDescriptorFactory.fromBitmap(eb.a(this.d, "amap_sdk_lineTexture.png"));
                    }
                    return this.m;
                case 2:
                    BitmapDescriptor bitmapDescriptor3 = this.l;
                    if (bitmapDescriptor3 == null || bitmapDescriptor3.getBitmap().isRecycled()) {
                        this.l = BitmapDescriptorFactory.fromBitmap(eb.a(this.d, "amap_sdk_lineDashTexture_circle.png"));
                    }
                    return this.l;
                case 3:
                    BitmapDescriptor bitmapDescriptor4 = this.k;
                    if (bitmapDescriptor4 == null || bitmapDescriptor4.getBitmap().isRecycled()) {
                        this.k = BitmapDescriptorFactory.fromBitmap(eb.a(this.d, "amap_sdk_lineDashTexture_square.png"));
                    }
                    return this.k;
                case 4:
                    BitmapDescriptor bitmapDescriptor5 = this.n;
                    if (bitmapDescriptor5 == null || bitmapDescriptor5.getBitmap().isRecycled()) {
                        this.n = BitmapDescriptorFactory.defaultMarker();
                    }
                    return this.n;
                case 5:
                    BitmapDescriptor bitmapDescriptor6 = this.o;
                    if (bitmapDescriptor6 == null || bitmapDescriptor6.getBitmap().isRecycled()) {
                        this.o = BitmapDescriptorFactory.fromAsset("arrow/arrow_line_inner.png");
                    }
                    return this.o;
                case 6:
                    BitmapDescriptor bitmapDescriptor7 = this.p;
                    if (bitmapDescriptor7 == null || bitmapDescriptor7.getBitmap().isRecycled()) {
                        this.p = BitmapDescriptorFactory.fromAsset("arrow/arrow_line_outer.png");
                    }
                    return this.p;
                case 7:
                    BitmapDescriptor bitmapDescriptor8 = this.q;
                    if (bitmapDescriptor8 == null || bitmapDescriptor8.getBitmap().isRecycled()) {
                        this.q = BitmapDescriptorFactory.fromAsset("arrow/arrow_line_shadow.png");
                    }
                    return this.q;
                default:
                    return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final BitmapDescriptor getCustomImageData(ImageOptions imageOptions) {
        if (imageOptions == null) {
            return null;
        }
        if (imageOptions.type == ImageOptions.ShapeType.CIRCLE.value()) {
            if (imageOptions.radius == 0.0d) {
                return null;
            }
            float fA = dv.a(this.d, (int) imageOptions.radius);
            int i = ((int) fA) * 2;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Path path = new Path();
            path.addCircle(fA, fA, fA, Path.Direction.CW);
            canvas.clipPath(path);
            canvas.drawColor(imageOptions.color);
            canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint);
            return BitmapDescriptorFactory.fromBitmap(bitmapCreateBitmap);
        }
        if (imageOptions.type == ImageOptions.ShapeType.TEXT.value()) {
            String str = imageOptions.content;
            int i2 = imageOptions.fontSize;
            if (str.isEmpty()) {
                return null;
            }
            float fA2 = dv.a(this.d, i2);
            Paint paint2 = new Paint();
            paint2.setTextSize(fA2);
            paint2.setFakeBoldText(true);
            paint2.setColor(imageOptions.color);
            float fMeasureText = paint2.measureText(str);
            Rect rect = new Rect();
            paint2.getTextBounds(str, 0, str.length(), rect);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap((int) fMeasureText, rect.height(), Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            canvas2.save();
            canvas2.drawColor(0);
            canvas2.drawText(str, 0.0f, -rect.top, paint2);
            canvas2.restore();
            return BitmapDescriptorFactory.fromBitmap(bitmapCreateBitmap2);
        }
        if (imageOptions.type != ImageOptions.ShapeType.DEFAULT.value() || imageOptions.radius == 0.0d) {
            return null;
        }
        float fA3 = dv.a(this.d, (int) imageOptions.radius);
        int i3 = (int) fA3;
        Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        Canvas canvas3 = new Canvas(bitmapCreateBitmap3);
        Path path2 = new Path();
        path2.addRect(0.0f, 0.0f, fA3, fA3, Path.Direction.CW);
        canvas3.clipPath(path2);
        canvas3.drawColor(Color.argb((float) imageOptions.rgba[3], (float) imageOptions.rgba[0], (float) imageOptions.rgba[1], (float) imageOptions.rgba[2]));
        canvas3.drawBitmap(bitmapCreateBitmap3, 0.0f, 0.0f, paint3);
        return BitmapDescriptorFactory.fromBitmap(bitmapCreateBitmap3);
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final void getAMapResource(final AMapAppRequestParam aMapAppRequestParam) {
        dz.a().a(new mb() { // from class: com.amap.api.col.3sl.ac.1
            @Override // com.amap.api.col.p0003sl.mb
            public final void runTask() {
                try {
                    byte[] bArrMakeHttpRequestWithInterrupted = new AMap3DModelTileProvider.AMap3DModelRequest(aMapAppRequestParam.getUrl()).makeHttpRequestWithInterrupted();
                    AMapAppResourceItem aMapAppResourceItem = new AMapAppResourceItem();
                    aMapAppResourceItem.setData(bArrMakeHttpRequestWithInterrupted);
                    aMapAppResourceItem.setSize(bArrMakeHttpRequestWithInterrupted.length);
                    aMapAppResourceItem.setResourceType(aMapAppRequestParam.getResourceType());
                    aMapAppRequestParam.getCallback().callSuccess(aMapAppResourceItem);
                } catch (Exception e) {
                    e.printStackTrace();
                    aMapAppRequestParam.getCallback().callFailed(e.getMessage());
                }
            }
        });
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final BaseOverlay addOverlayObject(String str, BaseOverlay baseOverlay, BaseOptions baseOptions) {
        a(str, baseOverlay, baseOptions);
        return baseOverlay;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final LatLng getNearestLatLng(PolylineOptions polylineOptions, LatLng latLng) {
        List<LatLng> points;
        if (latLng == null || polylineOptions == null || (points = polylineOptions.getPoints()) == null || points.size() == 0) {
            return null;
        }
        float fCalculateLineDistance = 0.0f;
        int i = 0;
        for (int i2 = 0; i2 < points.size(); i2++) {
            try {
                if (i2 == 0) {
                    fCalculateLineDistance = AMapUtils.calculateLineDistance(latLng, points.get(i2));
                } else {
                    float fCalculateLineDistance2 = AMapUtils.calculateLineDistance(latLng, points.get(i2));
                    if (fCalculateLineDistance > fCalculateLineDistance2) {
                        i = i2;
                        fCalculateLineDistance = fCalculateLineDistance2;
                    }
                }
            } catch (Throwable th) {
                jv.c(th, "PolylineDelegate", "getNearestLatLng");
                th.printStackTrace();
                return null;
            }
        }
        return points.get(i);
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean IsPolygonContainsPoint(PolygonOptions polygonOptions, LatLng latLng) {
        if (latLng == null) {
            return false;
        }
        try {
            List<BaseHoleOptions> holeOptions = polygonOptions.getHoleOptions();
            if (holeOptions != null && holeOptions.size() > 0) {
                Iterator<BaseHoleOptions> it = holeOptions.iterator();
                while (it.hasNext()) {
                    if (eb.a(it.next(), latLng)) {
                        return false;
                    }
                }
            }
            return eb.a(latLng, polygonOptions.getPoints());
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean IsCircleContainPoint(CircleOptions circleOptions, LatLng latLng) {
        if (latLng != null && circleOptions != null) {
            try {
                synchronized (circleOptions) {
                    List<BaseHoleOptions> holeOptions = circleOptions.getHoleOptions();
                    if (holeOptions != null && holeOptions.size() > 0) {
                        Iterator<BaseHoleOptions> it = holeOptions.iterator();
                        while (it.hasNext()) {
                            if (eb.a(it.next(), latLng)) {
                                return false;
                            }
                        }
                    }
                    return circleOptions.getRadius() >= ((double) AMapUtils.calculateLineDistance(circleOptions.getCenter(), latLng));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final Object getNativeProperties(String str, String str2, Object[] objArr) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.g;
        if (aMapNativeGlOverlayLayer != null) {
            return aMapNativeGlOverlayLayer.getNativeProperties(str, str2, objArr);
        }
        return null;
    }

    private void a(String str, BaseOverlay baseOverlay, BaseOptions baseOptions) {
        a(str, baseOptions);
        synchronized (this.h) {
            this.h.put(str, baseOverlay);
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void showInfoWindow(String str) {
        Map<String, BaseOverlay> map;
        if (this.g == null || (map = this.h) == null) {
            return;
        }
        try {
            this.f2188a.showInfoWindow(map.get(str));
            setRunLowFrame(false);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void hideInfoWindow(String str) {
        if (this.g != null) {
            this.f2188a.hideInfoWindow();
            this.g.getNativeProperties(str, "setInfoWindowShown", new Object[]{Boolean.FALSE});
        }
        setRunLowFrame(false);
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean checkInBounds(String str) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.g;
        if (aMapNativeGlOverlayLayer == null) {
            return true;
        }
        Object nativeProperties = aMapNativeGlOverlayLayer.getNativeProperties(str, "checkInBounds", new Object[]{str});
        if (nativeProperties instanceof Boolean) {
            return ((Boolean) nativeProperties).booleanValue();
        }
        return true;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void getMarkerInfoWindowOffset(String str, FPoint fPoint) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.g;
        if (aMapNativeGlOverlayLayer != null) {
            Object nativeProperties = aMapNativeGlOverlayLayer.getNativeProperties(str, "getMarkerInfoWindowOffset", null);
            if (nativeProperties instanceof Point) {
                Point point = (Point) nativeProperties;
                fPoint.x = point.x;
                fPoint.y = point.y;
            }
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void getOverlayScreenPos(String str, FPoint fPoint) {
        if (this.h.get(str) instanceof BasePointOverlay) {
            Object nativeProperties = this.g.getNativeProperties(str, "getMarkerScreenPos", null);
            if (nativeProperties instanceof Point) {
                Point point = (Point) nativeProperties;
                fPoint.x = point.x;
                fPoint.y = point.y;
            }
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final MultiPointItem getMultiPointItem(LatLng latLng) {
        List<MultiPointItem> items;
        try {
            AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.g;
            if (aMapNativeGlOverlayLayer == null) {
                return null;
            }
            Object nativeProperties = aMapNativeGlOverlayLayer.getNativeProperties("", "getMultiPointItem", new LatLng[]{latLng});
            if (!(nativeProperties instanceof MultiPointItemHitTest)) {
                return null;
            }
            MultiPointItemHitTest multiPointItemHitTest = (MultiPointItemHitTest) nativeProperties;
            if (multiPointItemHitTest.index == -1) {
                return null;
            }
            BaseOverlay baseOverlay = this.h.get(multiPointItemHitTest.overlayName);
            if (!(baseOverlay instanceof MultiPointOverlay) || (items = ((MultiPointOverlay) baseOverlay).getItems()) == null || items.size() <= multiPointItemHitTest.index) {
                return null;
            }
            return items.get(multiPointItemHitTest.index);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void set2Top(String str) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.g;
        if (aMapNativeGlOverlayLayer != null) {
            aMapNativeGlOverlayLayer.getNativeProperties(str, "set2Top", null);
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final List<Marker> getMapScreenMarkers() {
        if (this.g == null) {
            return null;
        }
        this.f2190c.clear();
        this.g.getNativeProperties("", "getMapScreenOverlays", new Object[]{this.f2190c});
        if (this.f2190c.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.f2190c) {
            if (str != null && str.contains("MARKER")) {
                arrayList.add((Marker) this.h.get(str));
            }
        }
        return arrayList;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void setFlingState(boolean z) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.g;
        if (aMapNativeGlOverlayLayer != null) {
            aMapNativeGlOverlayLayer.getNativeProperties("", "setFlingState", new Object[]{Boolean.valueOf(z)});
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void clearTileCache() {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.g;
        if (aMapNativeGlOverlayLayer != null) {
            aMapNativeGlOverlayLayer.getNativeProperties("", "clearTileCache", null);
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean isGLTFAnimated() {
        boolean z;
        synchronized (this.h) {
            for (Map.Entry<String, BaseOverlay> entry : this.h.entrySet()) {
                String key = entry.getKey();
                BaseOverlay value = entry.getValue();
                if (key.contains("GLTFOVERLAY") && ((GLTFOverlay) value).isAnimated()) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final Rect getOverlayBoundRect(String str) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.g;
        if (aMapNativeGlOverlayLayer == null) {
            return null;
        }
        return aMapNativeGlOverlayLayer.getOverlayBoundRect(str);
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean isGLOverlay(String str) {
        boolean zContainsKey;
        synchronized (this.h) {
            zContainsKey = this.h.containsKey(str);
        }
        return zContainsKey;
    }
}
