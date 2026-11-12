package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.RemoteException;
import android.text.TextUtils;
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
public final class n4s implements IGlOverlayLayer, AMapNativeGlOverlayLayer.NativeFunCallListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IAMapDelegate f27553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f27554b;
    public rhs g;
    public int c = 0;
    public final Object d = new Object();
    public final Map<String, BaseOverlay> f = new ConcurrentHashMap();
    public BitmapDescriptor h = null;
    public BitmapDescriptor i = null;
    public BitmapDescriptor j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public BitmapDescriptor f27555k = null;
    public BitmapDescriptor l = null;
    public BitmapDescriptor m = null;
    public BitmapDescriptor n = null;
    public BitmapDescriptor o = null;
    public boolean p = false;
    public List<String> q = new ArrayList();
    public AMapNativeGlOverlayLayer e = new AMapNativeGlOverlayLayer();

    public class a extends f7t {
        public final /* synthetic */ AMapAppRequestParam d;

        public a(AMapAppRequestParam aMapAppRequestParam) {
            this.d = aMapAppRequestParam;
        }

        @Override // defpackage.f7t
        public final void runTask() {
            try {
                byte[] bArrMakeHttpRequestWithInterrupted = new AMap3DModelTileProvider.AMap3DModelRequest(this.d.getUrl()).makeHttpRequestWithInterrupted();
                AMapAppResourceItem aMapAppResourceItem = new AMapAppResourceItem();
                aMapAppResourceItem.setData(bArrMakeHttpRequestWithInterrupted);
                aMapAppResourceItem.setSize(bArrMakeHttpRequestWithInterrupted.length);
                aMapAppResourceItem.setResourceType(this.d.getResourceType());
                this.d.getCallback().callSuccess(aMapAppResourceItem);
            } catch (Exception e) {
                e.printStackTrace();
                this.d.getCallback().callFailed(e.getMessage());
            }
        }
    }

    public n4s(IAMapDelegate iAMapDelegate, Context context) {
        this.f27553a = iAMapDelegate;
        this.f27554b = context;
        this.g = new rhs(iAMapDelegate);
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean IsCircleContainPoint(CircleOptions circleOptions, LatLng latLng) {
        if (latLng != null && circleOptions != null) {
            try {
                synchronized (circleOptions) {
                    try {
                        List<BaseHoleOptions> holeOptions = circleOptions.getHoleOptions();
                        if (holeOptions != null && holeOptions.size() > 0) {
                            Iterator<BaseHoleOptions> it = holeOptions.iterator();
                            while (it.hasNext()) {
                                if (zns.L(it.next(), latLng)) {
                                    return false;
                                }
                            }
                        }
                        return circleOptions.getRadius() >= ((double) AMapUtils.calculateLineDistance(circleOptions.getCenter(), latLng));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return false;
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
                    if (zns.L(it.next(), latLng)) {
                        return false;
                    }
                }
            }
            return zns.N(latLng, polygonOptions.getPoints());
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public final BitmapDescriptor a(View view) {
        if (view == null) {
            return null;
        }
        if ((view instanceof RelativeLayout) && this.f27554b != null) {
            LinearLayout linearLayout = new LinearLayout(this.f27554b);
            linearLayout.setOrientation(1);
            linearLayout.addView(view);
            view = linearLayout;
        }
        view.setDrawingCacheEnabled(true);
        view.setDrawingCacheQuality(0);
        return BitmapDescriptorFactory.fromBitmap(zns.n(view));
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final BaseOverlay addOverlayObject(String str, BaseOverlay baseOverlay, BaseOptions baseOptions) {
        c(str, baseOverlay, baseOptions);
        return baseOverlay;
    }

    public final void b(String str, BaseOptions baseOptions) {
        try {
            this.e.createOverlay(str, baseOptions);
        } catch (Throwable th) {
            m2t.r(th, "GlOverlayLayer", "addOverlay");
            th.printStackTrace();
            new StringBuilder("GlOverlayLayer addOverlay error:").append(th.getMessage());
        }
    }

    public final void c(String str, BaseOverlay baseOverlay, BaseOptions baseOptions) {
        b(str, baseOptions);
        synchronized (this.f) {
            this.f.put(str, baseOverlay);
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void changeOverlayIndex() {
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean checkInBounds(String str) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.e;
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
    public final synchronized void clear(String... strArr) {
        try {
            AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.e;
            if (aMapNativeGlOverlayLayer != null && strArr != null) {
                aMapNativeGlOverlayLayer.clear(strArr);
            }
            synchronized (this.f) {
                try {
                    if (strArr != null) {
                        Iterator<Map.Entry<String, BaseOverlay>> it = this.f.entrySet().iterator();
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
                        this.f.clear();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            m2t.r(th2, "GlOverlayLayer", CervicalMucusRecord.Appearance.CLEAR);
            th2.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void clearOverlayByType(String str) {
        synchronized (this.f) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator<Map.Entry<String, BaseOverlay>> it = this.f.entrySet().iterator();
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void clearTileCache() {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.e;
        if (aMapNativeGlOverlayLayer != null) {
            aMapNativeGlOverlayLayer.getNativeProperties("", "clearTileCache", null);
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final String createId(String str) {
        String str2;
        synchronized (this.d) {
            this.c++;
            str2 = str + this.c;
        }
        return str2;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final synchronized void destroy() {
        try {
            if (this.e == null) {
                return;
            }
            synchronized (this.f) {
                this.f.clear();
            }
            this.e.clear("");
            this.e.destroy();
            this.e = null;
        } catch (Throwable th) {
            m2t.r(th, "GlOverlayLayer", "destroy");
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final synchronized boolean draw(int i, int i2, boolean z) {
        boolean z2 = false;
        try {
            rhs rhsVar = this.g;
            if (rhsVar != null) {
                rhsVar.a();
            }
            if (this.f27553a.getMapConfig() == null) {
                return false;
            }
            AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.e;
            if (aMapNativeGlOverlayLayer != null) {
                aMapNativeGlOverlayLayer.render(i, i2, z);
            }
            z2 = true;
        } catch (Throwable th) {
            m2t.r(th, "GlOverlayLayer", "draw");
        }
        return z2;
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final void getAMapResource(AMapAppRequestParam aMapAppRequestParam) {
        pms.a().b(new a(aMapAppRequestParam));
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final BitmapDescriptor getBuildInImageData(int i) {
        try {
            switch (i) {
                case 0:
                    BitmapDescriptor bitmapDescriptor = this.h;
                    if (bitmapDescriptor == null || bitmapDescriptor.getBitmap().isRecycled()) {
                        this.h = BitmapDescriptorFactory.fromBitmap(zns.l(this.f27554b, "amap_sdk_lineTexture.png"));
                    }
                    return this.h;
                case 1:
                    BitmapDescriptor bitmapDescriptor2 = this.f27555k;
                    if (bitmapDescriptor2 == null || bitmapDescriptor2.getBitmap().isRecycled()) {
                        this.f27555k = BitmapDescriptorFactory.fromBitmap(zns.l(this.f27554b, "amap_sdk_lineTexture.png"));
                    }
                    return this.f27555k;
                case 2:
                    BitmapDescriptor bitmapDescriptor3 = this.j;
                    if (bitmapDescriptor3 == null || bitmapDescriptor3.getBitmap().isRecycled()) {
                        this.j = BitmapDescriptorFactory.fromBitmap(zns.l(this.f27554b, "amap_sdk_lineDashTexture_circle.png"));
                    }
                    return this.j;
                case 3:
                    BitmapDescriptor bitmapDescriptor4 = this.i;
                    if (bitmapDescriptor4 == null || bitmapDescriptor4.getBitmap().isRecycled()) {
                        this.i = BitmapDescriptorFactory.fromBitmap(zns.l(this.f27554b, "amap_sdk_lineDashTexture_square.png"));
                    }
                    return this.i;
                case 4:
                    BitmapDescriptor bitmapDescriptor5 = this.l;
                    if (bitmapDescriptor5 == null || bitmapDescriptor5.getBitmap().isRecycled()) {
                        this.l = BitmapDescriptorFactory.defaultMarker();
                    }
                    return this.l;
                case 5:
                    BitmapDescriptor bitmapDescriptor6 = this.m;
                    if (bitmapDescriptor6 == null || bitmapDescriptor6.getBitmap().isRecycled()) {
                        this.m = BitmapDescriptorFactory.fromAsset("arrow/arrow_line_inner.png");
                    }
                    return this.m;
                case 6:
                    BitmapDescriptor bitmapDescriptor7 = this.n;
                    if (bitmapDescriptor7 == null || bitmapDescriptor7.getBitmap().isRecycled()) {
                        this.n = BitmapDescriptorFactory.fromAsset("arrow/arrow_line_outer.png");
                    }
                    return this.n;
                case 7:
                    BitmapDescriptor bitmapDescriptor8 = this.o;
                    if (bitmapDescriptor8 == null || bitmapDescriptor8.getBitmap().isRecycled()) {
                        this.o = BitmapDescriptorFactory.fromAsset("arrow/arrow_line_shadow.png");
                    }
                    return this.o;
                default:
                    return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final int getCurrentParticleNum(String str) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.e;
        if (aMapNativeGlOverlayLayer != null) {
            return aMapNativeGlOverlayLayer.getCurrentParticleNum(str);
        }
        return 0;
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final BitmapDescriptor getCustomImageData(ImageOptions imageOptions) {
        if (imageOptions == null) {
            return null;
        }
        if (imageOptions.type == ImageOptions.ShapeType.CIRCLE.value()) {
            float f = imageOptions.radius;
            if (f == 0.0d) {
                return null;
            }
            float fA = zls.a(this.f27554b, (int) f);
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
            float fA2 = zls.a(this.f27554b, i2);
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
        if (imageOptions.type != ImageOptions.ShapeType.DEFAULT.value()) {
            return null;
        }
        float f2 = imageOptions.radius;
        if (f2 == 0.0d) {
            return null;
        }
        float fA3 = zls.a(this.f27554b, (int) f2);
        int i3 = (int) fA3;
        Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        Canvas canvas3 = new Canvas(bitmapCreateBitmap3);
        Path path2 = new Path();
        path2.addRect(0.0f, 0.0f, fA3, fA3, Path.Direction.CW);
        canvas3.clipPath(path2);
        double[] dArr = imageOptions.rgba;
        canvas3.drawColor(Color.argb((float) dArr[3], (float) dArr[0], (float) dArr[1], (float) dArr[2]));
        canvas3.drawBitmap(bitmapCreateBitmap3, 0.0f, 0.0f, paint3);
        return BitmapDescriptorFactory.fromBitmap(bitmapCreateBitmap3);
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final synchronized BaseOverlay getHitBaseOverlay(LatLng latLng, int i) {
        BaseOverlay baseOverlay;
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.e;
        if (aMapNativeGlOverlayLayer == null) {
            return null;
        }
        String strContain = aMapNativeGlOverlayLayer.contain(latLng, i);
        if (TextUtils.isEmpty(strContain)) {
            return null;
        }
        synchronized (this.f) {
            baseOverlay = this.f.get(strContain);
        }
        return baseOverlay;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final synchronized Polyline getHitOverlay(LatLng latLng, int i) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.e;
        Polyline polyline = null;
        if (aMapNativeGlOverlayLayer != null) {
            String strContain = aMapNativeGlOverlayLayer.contain(latLng, i);
            if (TextUtils.isEmpty(strContain)) {
                return null;
            }
            synchronized (this.f) {
                try {
                    BaseOverlay baseOverlay = this.f.get(strContain);
                    polyline = baseOverlay instanceof Polyline ? (Polyline) baseOverlay : null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return polyline;
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final BitmapDescriptor getInfoContents(String str) {
        u8s infoWindowDelegate;
        IAMapDelegate iAMapDelegate = this.f27553a;
        if (iAMapDelegate == null || (infoWindowDelegate = iAMapDelegate.getInfoWindowDelegate()) == null) {
            return null;
        }
        BaseOverlay baseOverlay = this.f.get(str);
        if (baseOverlay instanceof BasePointOverlay) {
            return a(infoWindowDelegate.p((BasePointOverlay) baseOverlay));
        }
        return null;
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final BitmapDescriptor getInfoWindow(String str) {
        u8s infoWindowDelegate;
        IAMapDelegate iAMapDelegate = this.f27553a;
        if (iAMapDelegate == null || (infoWindowDelegate = iAMapDelegate.getInfoWindowDelegate()) == null) {
            return null;
        }
        BaseOverlay baseOverlay = this.f.get(str);
        if (baseOverlay instanceof BasePointOverlay) {
            return a(infoWindowDelegate.d((BasePointOverlay) baseOverlay));
        }
        return null;
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final BitmapDescriptor getInfoWindowClick(String str) {
        return null;
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final long getInfoWindowUpdateOffsetTime(String str) {
        u8s infoWindowDelegate;
        IAMapDelegate iAMapDelegate = this.f27553a;
        if (iAMapDelegate == null || (infoWindowDelegate = iAMapDelegate.getInfoWindowDelegate()) == null) {
            return 0L;
        }
        BaseOverlay baseOverlay = this.f.get(str);
        if (baseOverlay instanceof BasePointOverlay) {
            return infoWindowDelegate.u((BasePointOverlay) baseOverlay);
        }
        return 0L;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final IAMapDelegate getMap() {
        return this.f27553a;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final List<Marker> getMapScreenMarkers() {
        if (this.e == null) {
            return null;
        }
        this.q.clear();
        this.e.getNativeProperties("", "getMapScreenOverlays", new Object[]{this.q});
        if (this.q.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.q) {
            if (str != null && str.contains("MARKER")) {
                arrayList.add((Marker) this.f.get(str));
            }
        }
        return arrayList;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void getMarkerInfoWindowOffset(String str, FPoint fPoint) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.e;
        if (aMapNativeGlOverlayLayer != null) {
            Object nativeProperties = aMapNativeGlOverlayLayer.getNativeProperties(str, "getMarkerInfoWindowOffset", null);
            if (nativeProperties instanceof Point) {
                Point point = (Point) nativeProperties;
                ((PointF) fPoint).x = point.x;
                ((PointF) fPoint).y = point.y;
            }
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final MultiPointItem getMultiPointItem(LatLng latLng) {
        List<MultiPointItem> items;
        try {
            AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.e;
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
            BaseOverlay baseOverlay = this.f.get(multiPointItemHitTest.overlayName);
            if (!(baseOverlay instanceof MultiPointOverlay) || (items = ((MultiPointOverlay) baseOverlay).getItems()) == null) {
                return null;
            }
            int size = items.size();
            int i = multiPointItemHitTest.index;
            if (size > i) {
                return items.get(i);
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final Object getNativeProperties(String str, String str2, Object[] objArr) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.e;
        if (aMapNativeGlOverlayLayer != null) {
            return aMapNativeGlOverlayLayer.getNativeProperties(str, str2, objArr);
        }
        return null;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final LatLng getNearestLatLng(PolylineOptions polylineOptions, LatLng latLng) {
        List<LatLng> points;
        if (latLng != null && polylineOptions != null && (points = polylineOptions.getPoints()) != null && points.size() != 0) {
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
                    m2t.r(th, "PolylineDelegate", "getNearestLatLng");
                    th.printStackTrace();
                }
            }
            return points.get(i);
        }
        return null;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final Rect getOverlayBoundRect(String str) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.e;
        if (aMapNativeGlOverlayLayer == null) {
            return null;
        }
        return aMapNativeGlOverlayLayer.getOverlayBoundRect(str);
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void getOverlayScreenPos(String str, FPoint fPoint) {
        if (this.f.get(str) instanceof BasePointOverlay) {
            Object nativeProperties = this.e.getNativeProperties(str, "getMarkerScreenPos", null);
            if (nativeProperties instanceof Point) {
                Point point = (Point) nativeProperties;
                ((PointF) fPoint).x = point.x;
                ((PointF) fPoint).y = point.y;
            }
        }
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
    public final void hideInfoWindow(String str) {
        if (this.e != null) {
            this.f27553a.hideInfoWindow();
            this.e.getNativeProperties(str, "setInfoWindowShown", new Object[]{Boolean.FALSE});
        }
        setRunLowFrame(false);
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean isGLOverlay(String str) {
        boolean zContainsKey;
        synchronized (this.f) {
            zContainsKey = this.f.containsKey(str);
        }
        return zContainsKey;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean isGLTFAnimated() {
        boolean z;
        synchronized (this.f) {
            try {
                for (Map.Entry<String, BaseOverlay> entry : this.f.entrySet()) {
                    String key = entry.getKey();
                    BaseOverlay value = entry.getValue();
                    if (key.contains("GLTFOVERLAY") && ((GLTFOverlay) value).isAnimated()) {
                        z = true;
                    }
                }
                z = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void onCreateAMapInstance() {
        if (this.e == null) {
            this.e = new AMapNativeGlOverlayLayer();
        }
        this.e.setEngineId(this.f27553a.getNativeEngineID());
        this.e.createNative(this.f27553a.getGLMapEngine().getNativeInstance());
        this.e.setNativeFunCallListener(this);
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final void onRedrawInfowindow() {
        IAMapDelegate iAMapDelegate = this.f27553a;
        if (iAMapDelegate != null) {
            iAMapDelegate.redrawInfoWindow();
        }
    }

    @Override // com.autonavi.base.amap.mapcore.AMapNativeGlOverlayLayer.NativeFunCallListener
    public final void onSetRunLowFrame(boolean z) {
        setRunLowFrame(z);
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final boolean removeOverlay(String str, boolean z) {
        return false;
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void set2Top(String str) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.e;
        if (aMapNativeGlOverlayLayer != null) {
            aMapNativeGlOverlayLayer.getNativeProperties(str, "set2Top", null);
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void setFlingState(boolean z) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.e;
        if (aMapNativeGlOverlayLayer != null) {
            aMapNativeGlOverlayLayer.getNativeProperties("", "setFlingState", new Object[]{Boolean.valueOf(z)});
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void setRunLowFrame(boolean z) {
        IAMapDelegate iAMapDelegate = this.f27553a;
        if (iAMapDelegate != null) {
            iAMapDelegate.setRunLowFrame(z);
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void showInfoWindow(String str) {
        Map<String, BaseOverlay> map;
        if (this.e == null || (map = this.f) == null) {
            return;
        }
        try {
            this.f27553a.showInfoWindow(map.get(str));
            setRunLowFrame(false);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void updateOption(String str, BaseOptions baseOptions) {
        try {
            if (this.e == null) {
                return;
            }
            setRunLowFrame(false);
            this.e.updateOptions(str, baseOptions);
        } catch (Throwable th) {
            m2t.r(th, "GlOverlayLayer", "updateOption");
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final void removeOverlay(String str) {
        AMapNativeGlOverlayLayer aMapNativeGlOverlayLayer = this.e;
        if (aMapNativeGlOverlayLayer != null) {
            aMapNativeGlOverlayLayer.removeOverlay(str);
        }
        synchronized (this.f) {
            this.f.remove(str);
        }
    }

    @Override // com.amap.api.maps.interfaces.IGlOverlayLayer
    public final BaseOverlay getHitBaseOverlay(MotionEvent motionEvent, int i) {
        if (this.f27553a == null) {
            return null;
        }
        DPoint dPointObtain = DPoint.obtain();
        this.f27553a.getPixel2LatLng((int) motionEvent.getX(), (int) motionEvent.getY(), dPointObtain);
        LatLng latLng = new LatLng(dPointObtain.y, dPointObtain.x);
        dPointObtain.recycle();
        return getHitBaseOverlay(latLng, i);
    }
}
