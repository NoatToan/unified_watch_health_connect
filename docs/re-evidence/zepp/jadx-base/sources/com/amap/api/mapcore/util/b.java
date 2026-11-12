package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import com.amap.api.maps.AMap;
import com.amap.api.maps.CameraUpdate;
import com.amap.api.maps.CustomRenderer;
import com.amap.api.maps.InfoWindowAnimationManager;
import com.amap.api.maps.LocationSource;
import com.amap.api.maps.MapsInitializer;
import com.amap.api.maps.Projection;
import com.amap.api.maps.UiSettings;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.amap.api.maps.model.AMapCameraInfo;
import com.amap.api.maps.model.AMapGestureListener;
import com.amap.api.maps.model.Arc;
import com.amap.api.maps.model.ArcOptions;
import com.amap.api.maps.model.BaseOptions;
import com.amap.api.maps.model.BaseOverlay;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.BuildingOverlay;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.Circle;
import com.amap.api.maps.model.CircleOptions;
import com.amap.api.maps.model.CrossOverlay;
import com.amap.api.maps.model.CrossOverlayOptions;
import com.amap.api.maps.model.CustomMapStyleOptions;
import com.amap.api.maps.model.GL3DModel;
import com.amap.api.maps.model.GL3DModelOptions;
import com.amap.api.maps.model.GroundOverlay;
import com.amap.api.maps.model.GroundOverlayOptions;
import com.amap.api.maps.model.HeatMapLayer;
import com.amap.api.maps.model.HeatMapLayerOptions;
import com.amap.api.maps.model.HeatmapTileProvider;
import com.amap.api.maps.model.IndoorBuildingInfo;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.MultiPointItem;
import com.amap.api.maps.model.MultiPointOverlay;
import com.amap.api.maps.model.MultiPointOverlayOptions;
import com.amap.api.maps.model.MyLocationStyle;
import com.amap.api.maps.model.MyTrafficStyle;
import com.amap.api.maps.model.NavigateArrow;
import com.amap.api.maps.model.NavigateArrowOptions;
import com.amap.api.maps.model.Poi;
import com.amap.api.maps.model.Polygon;
import com.amap.api.maps.model.PolygonOptions;
import com.amap.api.maps.model.Polyline;
import com.amap.api.maps.model.PolylineOptions;
import com.amap.api.maps.model.RouteOverlay;
import com.amap.api.maps.model.Text;
import com.amap.api.maps.model.TextOptions;
import com.amap.api.maps.model.TileOverlay;
import com.amap.api.maps.model.TileOverlayOptions;
import com.amap.api.maps.model.TileProvider;
import com.amap.api.maps.model.animation.Animation;
import com.amap.api.maps.model.particle.ParticleOverlay;
import com.amap.api.maps.model.particle.ParticleOverlayOptions;
import com.autonavi.amap.api.mapcore.IGLMapState;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.VirtualEarthProjection;
import com.autonavi.amap.mapcore.animation.GLAlphaAnimation;
import com.autonavi.amap.mapcore.interfaces.IMarkerAction;
import com.autonavi.base.ae.gmap.GLMapEngine;
import com.autonavi.base.ae.gmap.GLMapRender;
import com.autonavi.base.ae.gmap.GLMapState;
import com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo;
import com.autonavi.base.ae.gmap.glinterface.MapLabelItem;
import com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay;
import com.autonavi.base.ae.gmap.gloverlay.CrossVectorOverlay;
import com.autonavi.base.ae.gmap.gloverlay.GLOverlayBundle;
import com.autonavi.base.ae.gmap.gloverlay.GLTextureProperty;
import com.autonavi.base.ae.gmap.listener.AMapWidgetListener;
import com.autonavi.base.ae.gmap.style.StyleItem;
import com.autonavi.base.amap.api.mapcore.BaseOverlayImp;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.api.mapcore.IGLSurfaceView;
import com.autonavi.base.amap.api.mapcore.IProjectionDelegate;
import com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate;
import com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction;
import com.autonavi.base.amap.api.mapcore.overlays.IMarkerDelegate;
import com.autonavi.base.amap.mapcore.AMapNativeRenderer;
import com.autonavi.base.amap.mapcore.AeUtil;
import com.autonavi.base.amap.mapcore.FPoint;
import com.autonavi.base.amap.mapcore.FileUtil;
import com.autonavi.base.amap.mapcore.MapConfig;
import com.autonavi.base.amap.mapcore.Rectangle;
import com.autonavi.base.amap.mapcore.interfaces.IAMapListener;
import com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage;
import com.autonavi.base.amap.mapcore.tools.GLConvertUtil;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements com.amap.api.mapcore.util.a.InterfaceC0102a, dj.a, IAMapDelegate, IAMapListener {
    private db A;
    private UiSettings B;
    private IProjectionDelegate C;
    private final aa D;
    private boolean E;
    private final IGLSurfaceView F;
    private fj G;
    private z H;
    private Object I;
    private final IGlOverlayLayer J;
    private boolean K;
    private int L;
    private boolean M;
    private n N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private ct R;
    private LocationSource S;
    private boolean T;
    private Marker U;
    private BaseOverlayImp V;
    private Marker W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    public boolean a;
    private boolean aA;
    private boolean aB;
    private boolean aC;
    private volatile boolean aD;
    private volatile boolean aE;
    private boolean aF;
    private boolean aG;
    private Lock aH;
    private int aI;
    private int aJ;
    private int aK;
    private C0103b aL;
    private df aM;
    private s aN;
    private av aO;
    private AMap.OnMultiPointClickListener aP;
    private com.amap.api.mapcore.util.a aQ;
    private long aR;
    private a aS;
    private a aT;
    private a aU;
    private a aV;
    private a aW;
    private a aX;
    private a aY;
    private a aZ;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private Rect ad;
    private int ae;
    private MyTrafficStyle af;
    private Thread ag;
    private Thread ah;
    private boolean ai;
    private boolean aj;
    private boolean ak;
    private int al;
    private CustomRenderer am;
    private final v an;
    private int ao;
    private int ap;
    private List<w> aq;
    private dh ar;
    private dj as;
    private long at;
    private GLMapRender au;
    private o av;
    private boolean aw;
    private float ax;
    private float ay;
    private float az;
    public u b;
    private a ba;
    private a bb;
    private a bc;
    private a bd;
    private Runnable be;
    private a bf;
    private jv bg;
    private String bh;
    private String bi;
    private boolean bj;
    private boolean bk;
    private int bl;
    private EAMapPlatformGestureInfo bm;
    private long bn;
    private ao bo;
    private IPoint[] bp;
    public MapConfig c;
    public ao d;
    public ei e;
    public Context f;
    public GLMapEngine g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public final Handler l;
    public Point m;
    public Rect n;
    public String o;
    public float[] p;
    public float[] q;
    public float[] r;
    public float[] s;
    public String t;
    public String u;
    public int v;
    private f w;
    private g x;
    private AMapGestureListener y;
    private ap z;

    /* JADX INFO: renamed from: com.amap.api.mapcore.util.b$b, reason: collision with other inner class name */
    public class C0103b {
        public C0103b() {
        }

        public final void a(ao aoVar) {
            List listA;
            List listA2;
            ao aoVar2;
            ao aoVar3;
            int[] iArr;
            String[] strArr;
            MapConfig mapConfig = b.this.c;
            if (mapConfig == null || !mapConfig.isIndoorEnable()) {
                return;
            }
            final fg fgVarE = b.this.G.e();
            if (aoVar == null) {
                try {
                    List listA3 = b.this.x.a(AMap.OnIndoorBuildingActiveListener.class.hashCode());
                    if (listA3 != null && listA3.size() > 0) {
                        synchronized (listA3) {
                            for (int i = 0; i < listA3.size(); i++) {
                                try {
                                    ((AMap.OnIndoorBuildingActiveListener) listA3.get(i)).OnIndoorBuilding(aoVar);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                ao aoVar4 = b.this.d;
                if (aoVar4 != null) {
                    aoVar4.g = null;
                }
                if (fgVarE.b()) {
                    b.this.l.post(new Runnable() { // from class: com.amap.api.mapcore.util.b.b.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            fgVarE.a(false);
                        }
                    });
                }
                MapConfig mapConfig2 = b.this.c;
                mapConfig2.maxZoomLevel = mapConfig2.isSetLimitZoomLevel() ? b.this.c.getMaxZoomLevel() : 20.0f;
                try {
                    if (!b.this.D.isZoomControlsEnabled() || (listA = b.this.x.a(AMapWidgetListener.class.hashCode())) == null || listA.size() <= 0) {
                        return;
                    }
                    synchronized (listA) {
                        for (int i2 = 0; i2 < listA.size(); i2++) {
                            try {
                                ((AMapWidgetListener) listA.get(i2)).invalidateZoomController(b.this.c.getSZ());
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                    return;
                } catch (Throwable th4) {
                    th4.printStackTrace();
                }
            }
            if (aoVar != null && (iArr = aoVar.floor_indexs) != null && (strArr = aoVar.floor_names) != null && iArr.length == strArr.length) {
                int i3 = 0;
                while (true) {
                    int[] iArr2 = aoVar.floor_indexs;
                    if (i3 >= iArr2.length) {
                        break;
                    }
                    if (aoVar.activeFloorIndex == iArr2[i3]) {
                        aoVar.activeFloorName = aoVar.floor_names[i3];
                        break;
                    }
                    i3++;
                }
            }
            if (aoVar == null || (aoVar3 = b.this.d) == null || aoVar3.activeFloorIndex == aoVar.activeFloorIndex || !fgVarE.b()) {
                if (aoVar != null && ((aoVar2 = b.this.d) == null || !aoVar2.poiid.equals(aoVar.poiid) || b.this.d.g == null)) {
                    b bVar = b.this;
                    bVar.d = aoVar;
                    if (bVar.c != null) {
                        if (aoVar.g == null) {
                            aoVar.g = new Point();
                        }
                        DPoint mapGeoCenter = b.this.c.getMapGeoCenter();
                        if (mapGeoCenter != null) {
                            Point point = b.this.d.g;
                            point.x = (int) mapGeoCenter.x;
                            point.y = (int) mapGeoCenter.y;
                        }
                    }
                }
                try {
                    List listA4 = b.this.x.a(AMap.OnIndoorBuildingActiveListener.class.hashCode());
                    if (listA4 != null && listA4.size() > 0) {
                        synchronized (listA4) {
                            for (int i4 = 0; i4 < listA4.size(); i4++) {
                                ((AMap.OnIndoorBuildingActiveListener) listA4.get(i4)).OnIndoorBuilding(aoVar);
                            }
                        }
                    }
                    MapConfig mapConfig3 = b.this.c;
                    mapConfig3.maxZoomLevel = mapConfig3.isSetLimitZoomLevel() ? b.this.c.getMaxZoomLevel() : 20.0f;
                    if (b.this.D.isZoomControlsEnabled() && (listA2 = b.this.x.a(AMapWidgetListener.class.hashCode())) != null && listA2.size() > 0) {
                        synchronized (listA2) {
                            for (int i5 = 0; i5 < listA2.size(); i5++) {
                                ((AMapWidgetListener) listA2.get(i5)).invalidateZoomController(b.this.c.getSZ());
                            }
                        }
                    }
                    if (b.this.D.isIndoorSwitchEnabled()) {
                        if (!fgVarE.b()) {
                            b.this.D.setIndoorSwitchEnabled(true);
                        }
                        b.this.l.post(new Runnable() { // from class: com.amap.api.mapcore.util.b.b.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    fgVarE.a(b.this.d.floor_names);
                                    fgVarE.a(b.this.d.activeFloorName);
                                    if (fgVarE.b()) {
                                        return;
                                    }
                                    fgVarE.a(true);
                                } catch (Throwable th5) {
                                    th5.printStackTrace();
                                }
                            }
                        });
                    } else {
                        if (b.this.D.isIndoorSwitchEnabled() || !fgVarE.b()) {
                            return;
                        }
                        b.this.D.setIndoorSwitchEnabled(false);
                    }
                } catch (Throwable th5) {
                    th5.printStackTrace();
                }
            }
        }
    }

    public class c implements fg.a {
        private c() {
        }

        @Override // com.amap.api.mapcore.util.fg.a
        public final void a(int i) {
            b bVar = b.this;
            ao aoVar = bVar.d;
            if (aoVar != null) {
                aoVar.activeFloorIndex = aoVar.floor_indexs[i];
                aoVar.activeFloorName = aoVar.floor_names[i];
                try {
                    bVar.setIndoorBuildingInfo(aoVar);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        public /* synthetic */ c(b bVar, byte b) {
            this();
        }
    }

    public class d implements Runnable {
        private Context b;
        private AMap.OnCacheRemoveListener c;

        public d(Context context, AMap.OnCacheRemoveListener onCacheRemoveListener) {
            this.b = context;
            this.c = onCacheRemoveListener;
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0033  */
        @Override // java.lang.Runnable
        public final void run() {
            AMap.OnCacheRemoveListener onCacheRemoveListener;
            AMap.OnCacheRemoveListener onCacheRemoveListener2;
            boolean z = true;
            Context applicationContext = this.b.getApplicationContext();
            String strC = er.c(applicationContext);
            String strA = er.a(applicationContext);
            File file = new File(strC);
            boolean zDeleteFile = file.exists() ? FileUtil.deleteFile(file) : true;
            if (zDeleteFile) {
                try {
                    if (FileUtil.deleteFile(new File(strA))) {
                        zDeleteFile = true;
                    } else {
                        zDeleteFile = false;
                    }
                } catch (Throwable th) {
                    th = th;
                    z = zDeleteFile;
                    try {
                        er.a(th);
                        hn.c(th, "AMapDelegateImp", "RemoveCacheRunnable");
                        try {
                            if (b.this.g == null || r1 == null) {
                                return;
                            }
                            this.c.onRemoveCacheFinish(false);
                            return;
                        } catch (Throwable th2) {
                            return;
                        }
                    } finally {
                        try {
                            if (b.this.g != null && (onCacheRemoveListener = this.c) != null) {
                                onCacheRemoveListener.onRemoveCacheFinish(z);
                            }
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                    }
                }
            } else {
                zDeleteFile = false;
            }
            z = zDeleteFile && er.e(applicationContext);
            b bVar = b.this;
            if (bVar.j) {
                if (bVar.H != null) {
                    b.this.H.h();
                }
            } else if (bVar.J != null) {
                b.this.J.clearTileCache();
            }
            try {
                if (b.this.g == null || (onCacheRemoveListener2 = this.c) == null) {
                    return;
                }
                onCacheRemoveListener2.onRemoveCacheFinish(z);
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
        }
    }

    public b(IGLSurfaceView iGLSurfaceView, Context context) {
        this(iGLSurfaceView, context, false);
    }

    public static /* synthetic */ boolean e(b bVar) {
        bVar.aC = false;
        return false;
    }

    public static /* synthetic */ boolean i(b bVar) {
        bVar.aa = false;
        return false;
    }

    public static /* synthetic */ boolean q(b bVar) {
        bVar.ak = true;
        return true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void accelerateNetworkInChinese(boolean z) {
        jv jvVar = this.bg;
        if (jvVar != null) {
            jvVar.i();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Arc addArc(ArcOptions arcOptions) throws RemoteException {
        if (arcOptions == null) {
            return null;
        }
        try {
            resetRenderTime();
            if (!this.j) {
                arcOptions = arcOptions.m3280clone();
            }
            String strCreateId = this.J.createId("ARC");
            Arc arc = new Arc(this.J, arcOptions, strCreateId);
            IGlOverlayLayer iGlOverlayLayer = this.J;
            return iGlOverlayLayer != null ? (Arc) iGlOverlayLayer.addOverlayObject(strCreateId, arc, arcOptions) : arc;
        } catch (Throwable th) {
            er.a(th);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final BuildingOverlay addBuildingOverlay() {
        try {
            ep.g(this.f);
            String strCreateId = this.J.createId("BUILDINGOVERLAY");
            BuildingOverlay buildingOverlay = new BuildingOverlay(this.J, strCreateId);
            Field declaredField = BuildingOverlay.class.getDeclaredField("buildingOverlayTotalOptions");
            if (declaredField == null) {
                return null;
            }
            resetRenderTime();
            declaredField.setAccessible(true);
            Object obj = declaredField.get(buildingOverlay);
            IGlOverlayLayer iGlOverlayLayer = this.J;
            return (iGlOverlayLayer == null || !(obj instanceof BaseOptions)) ? buildingOverlay : (BuildingOverlay) iGlOverlayLayer.addOverlayObject(strCreateId, buildingOverlay, (BaseOptions) obj);
        } catch (Exception e) {
            e.printStackTrace();
            er.a(e);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Circle addCircle(CircleOptions circleOptions) throws RemoteException {
        if (circleOptions == null) {
            return null;
        }
        try {
            resetRenderTime();
            if (!this.j) {
                circleOptions = circleOptions.m3282clone();
            }
            String strCreateId = this.J.createId("CIRCLE");
            Circle circle = new Circle(this.J, circleOptions, strCreateId);
            IGlOverlayLayer iGlOverlayLayer = this.J;
            return iGlOverlayLayer != null ? (Circle) iGlOverlayLayer.addOverlayObject(strCreateId, circle, circleOptions) : circle;
        } catch (Throwable th) {
            er.a(th);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final CrossOverlay addCrossVector(CrossOverlayOptions crossOverlayOptions) {
        if (crossOverlayOptions == null || crossOverlayOptions.getRes() == null) {
            return null;
        }
        final CrossVectorOverlay crossVectorOverlay = new CrossVectorOverlay(1, getContext(), this);
        crossVectorOverlay.setAttribute(crossOverlayOptions.getAttribute());
        if (this.g != null) {
            queueEvent(new Runnable() { // from class: com.amap.api.mapcore.util.b.35
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.g.getOverlayBundle(1).addOverlay(crossVectorOverlay);
                }
            });
            crossVectorOverlay.resumeMarker(crossOverlayOptions.getRes());
        }
        return new CrossOverlay(crossOverlayOptions, crossVectorOverlay);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final GL3DModel addGLModel(GL3DModelOptions gL3DModelOptions) {
        resetRenderTime();
        if (this.j) {
            return this.N.a(gL3DModelOptions);
        }
        String strCreateId = this.J.createId("GL3DMODEL");
        GL3DModel gL3DModel = new GL3DModel(this.J, gL3DModelOptions, strCreateId);
        this.J.addOverlayObject(strCreateId, gL3DModel, gL3DModelOptions);
        return gL3DModel;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void addGestureMapMessage(int i, AbstractGestureMapMessage abstractGestureMapMessage) {
        if (!this.aD || this.g == null) {
            return;
        }
        try {
            abstractGestureMapMessage.isUseAnchor = this.P;
            abstractGestureMapMessage.anchorX = this.c.getAnchorX();
            abstractGestureMapMessage.anchorY = this.c.getAnchorY();
            this.g.addGestureMessage(i, abstractGestureMapMessage, this.D.isGestureScaleByMapCenter(), this.c.getAnchorX(), this.c.getAnchorY());
        } catch (RemoteException unused) {
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final GroundOverlay addGroundOverlay(GroundOverlayOptions groundOverlayOptions) throws RemoteException {
        if (groundOverlayOptions == null) {
            return null;
        }
        try {
            resetRenderTime();
            if (!this.j) {
                groundOverlayOptions = groundOverlayOptions.m3283clone();
            }
            String strCreateId = this.J.createId("GROUNDOVERLAY");
            GroundOverlay groundOverlay = new GroundOverlay(this.J, groundOverlayOptions, strCreateId);
            IGlOverlayLayer iGlOverlayLayer = this.J;
            return iGlOverlayLayer != null ? (GroundOverlay) iGlOverlayLayer.addOverlayObject(strCreateId, groundOverlay, groundOverlayOptions) : groundOverlay;
        } catch (Throwable th) {
            er.a(th);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final HeatMapLayer addHeatMapLayer(HeatMapLayerOptions heatMapLayerOptions) throws RemoteException {
        try {
            resetRenderTime();
            if (heatMapLayerOptions == null) {
                return null;
            }
            String strCreateId = this.J.createId("HEATMAPLAYER");
            return (HeatMapLayer) this.J.addOverlayObject(strCreateId, new HeatMapLayer(this.J, heatMapLayerOptions, strCreateId), heatMapLayerOptions);
        } catch (Throwable th) {
            er.a(th);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Marker addMarker(MarkerOptions markerOptions) throws RemoteException {
        try {
            resetRenderTime();
            if (this.j) {
                return this.b.a(markerOptions);
            }
            MarkerOptions markerOptionsM3285clone = markerOptions.m3285clone();
            String strCreateId = this.J.createId("MARKER");
            Marker marker = new Marker(this.J, markerOptionsM3285clone, strCreateId);
            this.J.addOverlayObject(strCreateId, marker, markerOptionsM3285clone);
            return marker;
        } catch (Throwable th) {
            er.a(th);
            ex.a(ew.d, "addMarker failed " + th.getMessage(), markerOptions);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final ArrayList<Marker> addMarkers(ArrayList<MarkerOptions> arrayList, boolean z) throws RemoteException {
        try {
            resetRenderTime();
            if (this.j) {
                return this.b.a(arrayList, z);
            }
            ArrayList<Marker> arrayList2 = new ArrayList<>();
            final LatLngBounds.Builder builder = LatLngBounds.builder();
            for (int i = 0; i < arrayList.size(); i++) {
                MarkerOptions markerOptions = arrayList.get(i);
                if (arrayList.get(i) != null) {
                    arrayList2.add(addMarker(markerOptions));
                    if (markerOptions.getPosition() != null) {
                        builder.include(markerOptions.getPosition());
                    }
                }
            }
            if (z && arrayList2.size() > 0) {
                getMainHandler().postDelayed(new Runnable() { // from class: com.amap.api.mapcore.util.b.18
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            b.this.moveCamera(af.a(builder.build(), 50));
                        } catch (Throwable unused) {
                        }
                    }
                }, 50L);
            }
            return arrayList2;
        } catch (Throwable th) {
            er.a(th);
            ex.a(ew.d, "addMarkers failed " + th.getMessage(), arrayList);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final MultiPointOverlay addMultiPointOverlay(MultiPointOverlayOptions multiPointOverlayOptions) throws RemoteException {
        if (multiPointOverlayOptions == null) {
            return null;
        }
        try {
            resetRenderTime();
            if (this.j) {
                return new MultiPointOverlay(this.aO.a(multiPointOverlayOptions));
            }
            MultiPointOverlayOptions multiPointOverlayOptionsM3286clone = multiPointOverlayOptions.m3286clone();
            String strCreateId = this.J.createId("MULTIOVERLAY");
            MultiPointOverlay multiPointOverlay = new MultiPointOverlay(this.J, multiPointOverlayOptionsM3286clone, strCreateId);
            IGlOverlayLayer iGlOverlayLayer = this.J;
            return iGlOverlayLayer != null ? (MultiPointOverlay) iGlOverlayLayer.addOverlayObject(strCreateId, multiPointOverlay, multiPointOverlayOptionsM3286clone) : multiPointOverlay;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final RouteOverlay addNaviRouteOverlay() {
        return null;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final NavigateArrow addNavigateArrow(NavigateArrowOptions navigateArrowOptions) throws RemoteException {
        if (navigateArrowOptions == null) {
            return null;
        }
        try {
            resetRenderTime();
            if (!this.j) {
                navigateArrowOptions = navigateArrowOptions.m3287clone();
            }
            String strCreateId = this.J.createId("NAVIGATEARROW");
            NavigateArrow navigateArrow = new NavigateArrow(this.J, navigateArrowOptions, strCreateId);
            IGlOverlayLayer iGlOverlayLayer = this.J;
            return iGlOverlayLayer != null ? (NavigateArrow) iGlOverlayLayer.addOverlayObject(strCreateId, navigateArrow, navigateArrowOptions) : navigateArrow;
        } catch (Throwable th) {
            er.a(th);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnCameraChangeListener(AMap.OnCameraChangeListener onCameraChangeListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.a(Integer.valueOf(AMap.OnCameraChangeListener.class.hashCode()), onCameraChangeListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnIndoorBuildingActiveListener(AMap.OnIndoorBuildingActiveListener onIndoorBuildingActiveListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.a(Integer.valueOf(AMap.OnIndoorBuildingActiveListener.class.hashCode()), onIndoorBuildingActiveListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnInfoWindowClickListener(AMap.OnInfoWindowClickListener onInfoWindowClickListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.a(Integer.valueOf(AMap.OnInfoWindowClickListener.class.hashCode()), onInfoWindowClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMapClickListener(AMap.OnMapClickListener onMapClickListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.a(Integer.valueOf(AMap.OnMapClickListener.class.hashCode()), onMapClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMapLoadedListener(AMap.OnMapLoadedListener onMapLoadedListener) {
        g gVar = this.x;
        if (gVar != null) {
            gVar.a(Integer.valueOf(AMap.OnMapLoadedListener.class.hashCode()), onMapLoadedListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMapLongClickListener(AMap.OnMapLongClickListener onMapLongClickListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.a(Integer.valueOf(AMap.OnMapLongClickListener.class.hashCode()), onMapLongClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMapTouchListener(AMap.OnMapTouchListener onMapTouchListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.a(Integer.valueOf(AMap.OnMapTouchListener.class.hashCode()), onMapTouchListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMarkerClickListener(AMap.OnMarkerClickListener onMarkerClickListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.a(Integer.valueOf(AMap.OnMarkerClickListener.class.hashCode()), onMarkerClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMarkerDragListener(AMap.OnMarkerDragListener onMarkerDragListener) {
        g gVar = this.x;
        if (gVar != null) {
            gVar.a(Integer.valueOf(AMap.OnMarkerDragListener.class.hashCode()), onMarkerDragListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMyLocationChangeListener(AMap.OnMyLocationChangeListener onMyLocationChangeListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.a(Integer.valueOf(AMap.OnMyLocationChangeListener.class.hashCode()), onMyLocationChangeListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnPOIClickListener(AMap.OnPOIClickListener onPOIClickListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.a(Integer.valueOf(AMap.OnPOIClickListener.class.hashCode()), onPOIClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnPolylineClickListener(AMap.OnPolylineClickListener onPolylineClickListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.a(Integer.valueOf(AMap.OnPolylineClickListener.class.hashCode()), onPolylineClickListener);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void addOverlayTexture(int i, GLTextureProperty gLTextureProperty) {
        GLOverlayBundle overlayBundle;
        try {
            GLMapEngine gLMapEngine = this.g;
            if (gLMapEngine != null && (overlayBundle = gLMapEngine.getOverlayBundle(i)) != null && gLTextureProperty != null && gLTextureProperty.mBitmap != null) {
                this.g.addOverlayTexture(i, gLTextureProperty);
                overlayBundle.addOverlayTextureItem(gLTextureProperty.mId, gLTextureProperty.mAnchor, gLTextureProperty.mXRatio, gLTextureProperty.mYRatio, gLTextureProperty.mBitmap.getWidth(), gLTextureProperty.mBitmap.getHeight());
            }
        } catch (Throwable th) {
            er.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final ParticleOverlay addParticleOverlay(ParticleOverlayOptions particleOverlayOptions) {
        if (particleOverlayOptions == null) {
            return null;
        }
        try {
            resetRenderTime();
            ep.c(this.f);
            String strCreateId = this.J.createId("PARTICLEOVERLAY");
            return (ParticleOverlay) this.J.addOverlayObject(strCreateId, new ParticleOverlay(this.J, particleOverlayOptions, strCreateId), particleOverlayOptions);
        } catch (Throwable th) {
            er.a(th);
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Polygon addPolygon(PolygonOptions polygonOptions) throws RemoteException {
        if (polygonOptions == null) {
            return null;
        }
        try {
            resetRenderTime();
            PolygonOptions polygonOptionsM3288clone = !this.j ? polygonOptions.m3288clone() : polygonOptions;
            String strCreateId = this.J.createId("POLYGON");
            Polygon polygon = new Polygon(this.J, polygonOptionsM3288clone, strCreateId);
            IGlOverlayLayer iGlOverlayLayer = this.J;
            return iGlOverlayLayer != null ? (Polygon) iGlOverlayLayer.addOverlayObject(strCreateId, polygon, polygonOptionsM3288clone) : polygon;
        } catch (Throwable th) {
            er.a(th);
            ex.a(ew.d, "addPolygon failed " + th.getMessage(), polygonOptions);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Polyline addPolyline(PolylineOptions polylineOptions) throws RemoteException {
        if (polylineOptions == null) {
            return null;
        }
        try {
            resetRenderTime();
            String strCreateId = this.J.createId("POLYLINE");
            return (Polyline) this.J.addOverlayObject(strCreateId, new Polyline(this.J, polylineOptions, strCreateId), polylineOptions);
        } catch (Throwable th) {
            er.a(th);
            ex.a(ew.d, "addPolyline failed " + th.getMessage(), polylineOptions);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Text addText(TextOptions textOptions) throws RemoteException {
        try {
            resetRenderTime();
            if (this.j) {
                return this.b.a(textOptions);
            }
            String strCreateId = this.J.createId("TEXT");
            TextOptions textOptionsM3289clone = textOptions.m3289clone();
            MarkerOptions markerOptionsA = cx.a(textOptionsM3289clone);
            Marker marker = new Marker(this.J, markerOptionsA, strCreateId);
            marker.setObject(textOptionsM3289clone.getObject());
            this.J.addOverlayObject(strCreateId, marker, markerOptionsA);
            return new Text(marker, textOptionsM3289clone);
        } catch (Throwable th) {
            er.a(th);
            return null;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void addTextureItem(w wVar) {
        if (wVar == null || wVar.l() == 0) {
            return;
        }
        synchronized (this.aq) {
            this.aq.add(wVar);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final TileOverlay addTileOverlay(TileOverlayOptions tileOverlayOptions) throws RemoteException {
        try {
            TileProvider tileProvider = tileOverlayOptions.getTileProvider();
            if (tileProvider != null && (tileProvider instanceof HeatmapTileProvider)) {
                ep.a(this.f);
            }
            if (!this.j) {
                String strCreateId = this.J.createId("TILEOVERLAY");
                TileOverlay tileOverlay = new TileOverlay(this.J, tileOverlayOptions, strCreateId);
                this.J.addOverlayObject(strCreateId, tileOverlay, tileOverlayOptions);
                return tileOverlay;
            }
            synchronized (this.I) {
                if (this.H == null) {
                    this.H = new z(this.f, this);
                }
            }
            z zVar = this.H;
            if (zVar != null) {
                return zVar.a(tileOverlayOptions);
            }
            return null;
        } catch (Throwable th) {
            er.a(th);
            return null;
        }
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void afterAnimation() {
        redrawInfoWindow();
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void afterDrawFrame(int i, GLMapState gLMapState) {
        float mapZoomer = gLMapState.getMapZoomer();
        GLMapEngine gLMapEngine = this.g;
        if (!(gLMapEngine != null && (gLMapEngine.isInMapAction(i) || this.g.isInMapAnimation(i)))) {
            int i2 = this.ap;
            if (i2 != -1) {
                this.au.setRenderFps(i2);
            } else {
                this.au.setRenderFps(15.0f);
            }
            if (this.ax != mapZoomer) {
                this.ax = mapZoomer;
            }
        }
        if (this.aG) {
            return;
        }
        this.aG = true;
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void afterDrawLabel(int i, GLMapState gLMapState) {
        z zVar;
        e();
        jv jvVar = this.bg;
        if (jvVar != null) {
            jvVar.e();
        }
        GLMapEngine gLMapEngine = this.g;
        if (gLMapEngine != null) {
            gLMapEngine.pushRendererState();
        }
        if (this.j && (zVar = this.H) != null) {
            this.bl = zVar.b() ? this.bl : this.bl + 1;
        }
        this.bl = this.J.draw(1, this.al, this.k) ? this.bl : this.bl + 1;
        av avVar = this.aO;
        if (avVar != null) {
            this.bl = avVar.a(this.c, getViewMatrix(), getProjectionMatrix()) ? this.bl : this.bl + 1;
        }
        n nVar = this.N;
        if (nVar != null) {
            this.bl = nVar.a() ? this.bl : this.bl + 1;
        }
        u uVar = this.b;
        if (uVar != null) {
            this.bl = uVar.a(false) ? this.bl : this.bl + 1;
        }
        db dbVar = this.A;
        if (dbVar != null) {
            this.bl = dbVar.a(getMapWidth(), getMapHeight()) ? this.bl : this.bl + 1;
        }
        GLMapEngine gLMapEngine2 = this.g;
        if (gLMapEngine2 != null) {
            gLMapEngine2.popRendererState();
        }
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void afterRendererOver(int i, GLMapState gLMapState) {
        GLMapEngine gLMapEngine = this.g;
        if (gLMapEngine != null) {
            gLMapEngine.pushRendererState();
        }
        u uVar = this.b;
        if (uVar != null) {
            this.bl = uVar.a(true) ? this.bl : this.bl + 1;
        }
        this.J.draw(2, this.al, this.k);
        GLMapEngine gLMapEngine2 = this.g;
        if (gLMapEngine2 != null) {
            gLMapEngine2.popRendererState();
        }
        CustomRenderer customRenderer = this.am;
        if (customRenderer != null) {
            customRenderer.onDrawFrame(null);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void animateCamera(CameraUpdate cameraUpdate) throws RemoteException {
        if (cameraUpdate == null) {
            return;
        }
        animateCamera(cameraUpdate.getCameraUpdateFactoryDelegate());
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void animateCameraWithCallback(CameraUpdate cameraUpdate, AMap.CancelableCallback cancelableCallback) throws RemoteException {
        if (cameraUpdate == null) {
            return;
        }
        animateCameraWithDurationAndCallback(cameraUpdate, 250L, cancelableCallback);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void animateCameraWithDurationAndCallback(CameraUpdate cameraUpdate, long j, AMap.CancelableCallback cancelableCallback) {
        if (cameraUpdate == null) {
            return;
        }
        animateCameraWithDurationAndCallback(cameraUpdate.getCameraUpdateFactoryDelegate(), j, cancelableCallback);
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void beforeDrawLabel(int i, GLMapState gLMapState) {
        e();
        GLMapEngine gLMapEngine = this.g;
        if (gLMapEngine != null) {
            gLMapEngine.pushRendererState();
        }
        this.bl = this.J.draw(0, this.al, this.k) ? this.bl : this.bl + 1;
        GLMapEngine gLMapEngine2 = this.g;
        if (gLMapEngine2 != null) {
            gLMapEngine2.popRendererState();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Pair<Float, LatLng> calculateZoomToSpanLevel(int i, int i2, int i3, int i4, LatLng latLng, LatLng latLng2) {
        if (latLng != null && latLng2 != null && i == i2 && i2 == i3 && i3 == i4 && latLng.latitude == latLng2.latitude && latLng.longitude == latLng2.longitude) {
            return new Pair<>(Float.valueOf(getMaxZoomLevel()), latLng);
        }
        MapConfig mapConfig = getMapConfig();
        if (latLng == null || latLng2 == null || !this.aD || this.M) {
            DPoint dPointObtain = DPoint.obtain();
            GLMapState.geo2LonLat((int) mapConfig.getSX(), (int) mapConfig.getSY(), dPointObtain);
            Pair<Float, LatLng> pair = new Pair<>(Float.valueOf(mapConfig.getSZ()), new LatLng(dPointObtain.y, dPointObtain.x));
            dPointObtain.recycle();
            return pair;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        builder.include(latLng);
        builder.include(latLng2);
        GLMapState gLMapState = new GLMapState(1, this.g.getNativeInstance());
        Pair<Float, IPoint> pairA = er.a(mapConfig, i, i2, i3, i4, builder.build(), getMapWidth(), getMapHeight());
        gLMapState.recycle();
        if (pairA == null) {
            return null;
        }
        DPoint dPointObtain2 = DPoint.obtain();
        Object obj = pairA.second;
        GLMapState.geo2LonLat(((Point) ((IPoint) obj)).x, ((Point) ((IPoint) obj)).y, dPointObtain2);
        Pair<Float, LatLng> pair2 = new Pair<>(pairA.first, new LatLng(dPointObtain2.y, dPointObtain2.x));
        dPointObtain2.recycle();
        return pair2;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean canShowIndoorSwitch() {
        ao aoVar;
        if (getZoomLevel() < 17.0f || (aoVar = this.d) == null || aoVar.g == null) {
            return false;
        }
        FPoint fPointObtain = FPoint.obtain();
        Point point = this.d.g;
        a(point.x, point.y, fPointObtain);
        return this.ad.contains((int) ((PointF) fPointObtain).x, (int) ((PointF) fPointObtain).y);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean canStopMapRender() {
        GLMapEngine gLMapEngine = this.g;
        if (gLMapEngine != null) {
            gLMapEngine.canStopMapRender(1);
        }
        return true;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void changeGLOverlayIndex() {
        this.J.changeOverlayIndex();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void changeLogoIconStyle(String str, boolean z, int i) {
        fj fjVar = this.G;
        if (fjVar != null) {
            fjVar.a(str, Boolean.valueOf(z), Integer.valueOf(i));
        }
        aa aaVar = this.D;
        if (aaVar != null) {
            aaVar.requestRefreshLogo();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void changeMapLogo(int i, boolean z) {
        if (this.M) {
            return;
        }
        try {
            List listA = this.x.a(AMapWidgetListener.class.hashCode());
            if (listA == null || listA.size() <= 0) {
                return;
            }
            this.G.g(Boolean.valueOf(!z));
        } catch (Throwable unused) {
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void changeSize(int i, int i2) {
        MapConfig mapConfig = this.c;
        if (mapConfig != null) {
            this.h = i;
            this.i = i2;
            mapConfig.setMapWidth(i);
            this.c.setMapHeight(i2);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void changeSurface(int i, GL10 gl10, int i2, int i3) {
        int engineIDWithType;
        WindowManager windowManager;
        ex.a(ew.c, "changeSurface " + i2 + " " + i3);
        this.aG = false;
        if (!this.aD) {
            createSurface(i, gl10, null);
        }
        o oVar = this.av;
        if (oVar != null && this.f != null && ((this.h != oVar.b() || this.i != this.av.c()) && (windowManager = (WindowManager) this.f.getSystemService("window")) != null)) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (defaultDisplay != null) {
                defaultDisplay.getRealMetrics(displayMetrics);
                this.av.a(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        }
        this.h = i2;
        this.i = i3;
        this.ak = true;
        this.ad = new Rect(0, 0, i2, i3);
        Rect rect = new Rect(0, 0, this.h, this.i);
        int i4 = this.h;
        int i5 = this.i;
        GLMapEngine gLMapEngine = this.g;
        if (gLMapEngine == null || i < 0) {
            engineIDWithType = 0;
        } else {
            engineIDWithType = gLMapEngine.getEngineIDWithType(i);
            if (this.g.isEngineCreated(engineIDWithType)) {
                int i6 = rect.left;
                int i7 = rect.top;
                int iWidth = rect.width();
                int iHeight = rect.height();
                GLMapEngine gLMapEngine2 = this.g;
                if (gLMapEngine2 != null) {
                    gLMapEngine2.setServiceViewRect(engineIDWithType, i6, i7, iWidth, iHeight, i4, i5);
                }
            } else {
                int i8 = this.f.getResources().getDisplayMetrics().densityDpi;
                float f = this.f.getResources().getDisplayMetrics().density;
                this.ay = GLMapState.calMapZoomScalefactor(i4, i5, i8);
                GLMapEngine.MapViewInitParam mapViewInitParam = new GLMapEngine.MapViewInitParam();
                mapViewInitParam.engineId = engineIDWithType;
                mapViewInitParam.x = rect.left;
                mapViewInitParam.y = rect.top;
                mapViewInitParam.width = rect.width();
                mapViewInitParam.height = rect.height();
                mapViewInitParam.screenWidth = i4;
                mapViewInitParam.screenHeight = i5;
                mapViewInitParam.screenScale = f;
                mapViewInitParam.textScale = this.az * f;
                mapViewInitParam.mapZoomScale = this.ay;
                mapViewInitParam.taskThreadCount = 3;
                this.g.createAMapEngineWithFrame(mapViewInitParam);
                GLMapState mapState = this.g.getMapState(engineIDWithType);
                mapState.setMapZoomer(this.c.getSZ());
                mapState.setCameraDegree(this.c.getSC());
                mapState.setMapAngle(this.c.getSR());
                mapState.setMapGeoCenter(this.c.getSX(), this.c.getSY());
                this.g.setMapState(engineIDWithType, mapState);
                this.g.setOvelayBundle(engineIDWithType, new GLOverlayBundle<>(engineIDWithType, this));
            }
        }
        this.L = engineIDWithType;
        ex.a(ew.c, "create engine with frame complete");
        if (!this.aE) {
            MapConfig mapConfig = this.c;
            if (mapConfig != null) {
                mapConfig.setMapZoomScale(this.ay);
                this.c.setMapWidth(i2);
                this.c.setMapHeight(i3);
            }
            this.g.setIndoorEnable(this.L, false);
            this.g.setSimple3DEnable(this.L, false);
            this.g.setStyleChangeGradualEnable(this.L, false);
            boolean z = this.j;
            if (z) {
                int i9 = this.L;
                if (z) {
                    try {
                        BitmapDescriptor bitmapDescriptorFromAsset = BitmapDescriptorFactory.fromAsset("arrow/arrow_line_inner.png");
                        Bitmap bitmap = bitmapDescriptorFromAsset != null ? bitmapDescriptorFromAsset.getBitmap() : null;
                        BitmapDescriptor bitmapDescriptorFromAsset2 = BitmapDescriptorFactory.fromAsset("arrow/arrow_line_outer.png");
                        Bitmap bitmap2 = bitmapDescriptorFromAsset2 != null ? bitmapDescriptorFromAsset2.getBitmap() : null;
                        BitmapDescriptor bitmapDescriptorFromAsset3 = BitmapDescriptorFactory.fromAsset("arrow/arrow_line_shadow.png");
                        Bitmap bitmap3 = bitmapDescriptorFromAsset3 != null ? bitmapDescriptorFromAsset3.getBitmap() : null;
                        this.g.addOverlayTexture(i9, bitmap, 111, 4);
                        this.g.addOverlayTexture(i9, bitmap2, 222, 4);
                        this.g.addOverlayTexture(i9, bitmap3, AMapEngineUtils.ARROW_LINE_SHADOW_TEXTURE_ID, 4);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
            this.g.initMapOpenLayer("{\"bounds\" : [{\"x2\" : 235405312,\"x1\" : 188874751,\"y2\" : 85065727,\"y1\" : 122421247}],\"sublyr\" : [{\"type\" : 4,\"sid\" : 9000006,\"zlevel\" : 2}],\"id\" : 9006,\"minzoom\" : 6,\"update_period\" : 90,\"maxzoom\" : 20,\"cachemode\" : 2,\"url\" : \"http://mpsapi.amap.com/ws/mps/lyrdata/ugc/\"}");
        }
        synchronized (this) {
            this.aE = true;
        }
        if (this.P) {
            this.c.setAnchorX(Math.max(1, Math.min(this.aJ, i2 - 1)));
            this.c.setAnchorY(Math.max(1, Math.min(this.aK, i3 - 1)));
        } else {
            this.c.setAnchorX(i2 >> 1);
            this.c.setAnchorY(i3 >> 1);
        }
        this.g.setProjectionCenter(this.L, this.c.getAnchorX(), this.c.getAnchorY());
        this.a = true;
        a aVar = this.bc;
        if (aVar.b) {
            aVar.run();
        }
        a aVar2 = this.aU;
        if (aVar2.b) {
            aVar2.run();
        }
        a aVar3 = this.aV;
        if (aVar3.b) {
            aVar3.run();
        }
        a aVar4 = this.aS;
        if (aVar4.b) {
            aVar4.run();
        }
        a aVar5 = this.aW;
        if (aVar5.b) {
            aVar5.run();
        }
        a aVar6 = this.bf;
        if (aVar6.b) {
            aVar6.run();
        }
        a aVar7 = this.aX;
        if (aVar7.b) {
            aVar7.run();
        }
        a aVar8 = this.aY;
        if (aVar8.b) {
            aVar8.run();
        }
        a aVar9 = this.aZ;
        if (aVar9.b) {
            aVar9.run();
        }
        a aVar10 = this.bd;
        if (aVar10.b) {
            aVar10.run();
        }
        a aVar11 = this.aT;
        if (aVar11.b) {
            aVar11.run();
        }
        a aVar12 = this.ba;
        if (aVar12.b) {
            aVar12.run();
        }
        a aVar13 = this.bb;
        if (aVar13 != null) {
            aVar13.run();
        }
        CustomRenderer customRenderer = this.am;
        if (customRenderer != null) {
            customRenderer.onSurfaceChanged(gl10, i2, i3);
        }
        jv jvVar = this.bg;
        if (jvVar != null) {
            jvVar.d();
        }
        Handler handler = this.l;
        if (handler != null) {
            handler.post(this.be);
        }
        redrawInfoWindow();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void checkMapState(IGLMapState iGLMapState) {
        MapConfig mapConfig = this.c;
        if (mapConfig == null || this.M) {
            return;
        }
        LatLngBounds limitLatLngBounds = mapConfig.getLimitLatLngBounds();
        try {
            if (limitLatLngBounds == null) {
                if (this.c.isSetLimitZoomLevel()) {
                    iGLMapState.setMapZoomer(Math.max(this.c.getMinZoomLevel(), Math.min(iGLMapState.getMapZoomer(), this.c.getMaxZoomLevel())));
                    return;
                }
                return;
            }
            IPoint[] limitIPoints = this.c.getLimitIPoints();
            if (limitIPoints == null) {
                IPoint iPointObtain = IPoint.obtain();
                LatLng latLng = limitLatLngBounds.northeast;
                GLMapState.lonlat2Geo(latLng.longitude, latLng.latitude, iPointObtain);
                IPoint iPointObtain2 = IPoint.obtain();
                LatLng latLng2 = limitLatLngBounds.southwest;
                GLMapState.lonlat2Geo(latLng2.longitude, latLng2.latitude, iPointObtain2);
                IPoint[] iPointArr = {iPointObtain, iPointObtain2};
                this.c.setLimitIPoints(iPointArr);
                limitIPoints = iPointArr;
            }
            float fA = er.a(this.c, ((Point) limitIPoints[0]).x, ((Point) limitIPoints[0]).y, ((Point) limitIPoints[1]).x, ((Point) limitIPoints[1]).y, getMapWidth(), getMapHeight());
            float mapZoomer = iGLMapState.getMapZoomer();
            if (this.c.isSetLimitZoomLevel()) {
                float maxZoomLevel = this.c.getMaxZoomLevel();
                float minZoomLevel = this.c.getMinZoomLevel();
                float fMax = Math.max(fA, Math.min(mapZoomer, maxZoomLevel));
                if (fA <= maxZoomLevel) {
                    maxZoomLevel = fMax;
                }
                fA = maxZoomLevel < minZoomLevel ? minZoomLevel : maxZoomLevel;
            } else if (fA <= 0.0f || mapZoomer >= fA) {
                fA = mapZoomer;
            }
            iGLMapState.setMapZoomer(fA);
            IPoint iPointObtain3 = IPoint.obtain();
            iGLMapState.getMapGeoCenter(iPointObtain3);
            int[] iArrA = er.a(((Point) limitIPoints[0]).x, ((Point) limitIPoints[0]).y, ((Point) limitIPoints[1]).x, ((Point) limitIPoints[1]).y, this.c, iGLMapState, ((Point) iPointObtain3).x, ((Point) iPointObtain3).y);
            iGLMapState.setMapGeoCenter(iArrA[0], iArrA[1]);
            iPointObtain3.recycle();
        } catch (Throwable th) {
            er.a(th);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final int checkMarkerInRect(IMarkerAction iMarkerAction, Rect rect) {
        return 0;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float checkZoomLevel(float f) throws RemoteException {
        return er.a(this.c, f);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void clear() throws RemoteException {
        try {
            clear(false);
        } catch (Throwable th) {
            hn.c(th, "AMapDelegateImp", "clear");
            er.a(th);
            th.printStackTrace();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void clearTileCache() {
        if (!this.j) {
            this.J.clearTileCache();
            return;
        }
        z zVar = this.H;
        if (zVar != null) {
            zVar.h();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final long createGLOverlay(int i) {
        GLMapEngine gLMapEngine = this.g;
        if (gLMapEngine != null) {
            return gLMapEngine.createOverlay(1, i);
        }
        return 0L;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final String createId(String str) {
        IGlOverlayLayer iGlOverlayLayer = this.J;
        if (iGlOverlayLayer != null) {
            return iGlOverlayLayer.createId(str);
        }
        return null;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final synchronized void createSurface(int i, GL10 gl10, EGLConfig eGLConfig) {
        ex.a(ew.c, "createSurface");
        this.aR = System.currentTimeMillis();
        if (this.ae == 3) {
            this.G.d().a(fe.b);
        } else {
            this.G.d().a(fe.a);
        }
        this.aE = false;
        this.h = this.F.getWidth();
        this.i = this.F.getHeight();
        this.aG = false;
        try {
            AeUtil.loadLib(this.f);
            ex.a(ew.c, "load lib complete");
            AeUtil.initCrashHandle(this.f);
            GLMapEngine.InitParam initParamInitResource = AeUtil.initResource(this.f);
            ex.a(ew.c, "load res complete");
            this.g.createAMapInstance(initParamInitResource);
            ex.a(ew.c, "create engine complete");
            if (this.j) {
                synchronized (this.I) {
                    if (this.H == null) {
                        this.H = new z(this.f, this);
                    }
                }
            }
            this.aM = new df();
            ex.a(ew.c, "init shader complete");
            this.J.setGlShaderManager(this.aM);
            jv jvVar = this.bg;
            if (jvVar != null) {
                jvVar.i();
            }
            this.aD = true;
            this.o = gl10.glGetString(7937);
        } catch (Throwable th) {
            er.a(th);
            hn.c(th, "AMapDElegateImp", "createSurface");
            ex.b(ew.c, "createSurface failed " + th.getMessage());
            ep.b(this.f, "init failed:" + th.getMessage());
        }
        GLMapState mapState = this.g.getMapState(1);
        if (mapState != null && mapState.getNativeInstance() != 0) {
            mapState.setMapGeoCenter((int) this.c.getSX(), (int) this.c.getSY());
            mapState.setMapAngle(this.c.getSR());
            mapState.setMapZoomer(this.c.getSZ());
            mapState.setCameraDegree(this.c.getSC());
        }
        if (this.j) {
            this.aN.a(this.f);
        }
        if (!this.ai) {
            try {
                this.ag.setName("AuthThread");
                this.ag.start();
                this.ai = true;
            } catch (Throwable th2) {
                th2.printStackTrace();
                er.a(th2);
            }
        }
        CustomRenderer customRenderer = this.am;
        if (customRenderer != null) {
            customRenderer.onSurfaceCreated(gl10, eGLConfig);
        }
        jv jvVar2 = this.bg;
        if (jvVar2 != null) {
            jvVar2.c();
        }
        AMapNativeRenderer.nativeDrawLineInit();
        this.J.onCreateAMapInstance();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void destroy() {
        z zVar;
        this.M = true;
        ex.a(ew.c, "destroy map");
        try {
            av avVar = this.aO;
            if (avVar != null) {
                avVar.b();
            }
            LocationSource locationSource = this.S;
            if (locationSource != null) {
                locationSource.deactivate();
            }
            this.S = null;
            this.aL = null;
            GLMapRender gLMapRender = this.au;
            if (gLMapRender != null) {
                gLMapRender.renderPause();
            }
            s sVar = this.aN;
            if (sVar != null) {
                sVar.d();
            }
            o oVar = this.av;
            if (oVar != null) {
                oVar.d = null;
                oVar.d();
                this.av = null;
            }
            IGlOverlayLayer iGlOverlayLayer = this.J;
            if (iGlOverlayLayer != null) {
                iGlOverlayLayer.destroy();
            }
            u uVar = this.b;
            if (uVar != null) {
                uVar.g();
            }
            int i = 0;
            if (this.j && (zVar = this.H) != null) {
                zVar.c();
                dd ddVar = zVar.d;
                if (ddVar != null) {
                    ddVar.onPause();
                    zVar.d.destroy(false);
                }
                zVar.d = null;
            }
            d();
            Thread thread = this.ag;
            if (thread != null) {
                thread.interrupt();
                this.ag = null;
            }
            Thread thread2 = this.ah;
            if (thread2 != null) {
                thread2.interrupt();
                this.ah = null;
            }
            dh dhVar = this.ar;
            if (dhVar != null) {
                dhVar.a();
                this.ar = null;
            }
            dj djVar = this.as;
            if (djVar != null) {
                djVar.a((dj.a) null);
                this.as.a();
                this.as = null;
            }
            eb.b();
            GLMapEngine gLMapEngine = this.g;
            if (gLMapEngine != null) {
                gLMapEngine.setMapListener(null);
                this.g.releaseNetworkState();
                queueEvent(new Runnable() { // from class: com.amap.api.mapcore.util.b.34
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            b bVar = b.this;
                            bVar.destroySurface(bVar.L);
                        } catch (Throwable th) {
                            th.printStackTrace();
                            er.a(th);
                        }
                    }
                });
                while (this.g != null) {
                    int i2 = i + 1;
                    if (i >= 50) {
                        break;
                    }
                    try {
                        Thread.sleep(20L);
                    } catch (InterruptedException e) {
                        er.a(e);
                    }
                    i = i2;
                    hn.c(th, "AMapDelegateImp", "destroy");
                    er.a(th);
                    th.printStackTrace();
                }
            }
            n nVar = this.N;
            if (nVar != null) {
                nVar.c();
            }
            ap apVar = this.z;
            if (apVar != null) {
                apVar.b();
            }
            IGLSurfaceView iGLSurfaceView = this.F;
            if (iGLSurfaceView != null) {
                try {
                    iGLSurfaceView.onDetachedGLThread();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    er.a(e2);
                }
            }
            fj fjVar = this.G;
            if (fjVar != null) {
                fjVar.g();
                this.G = null;
            }
            ct ctVar = this.R;
            if (ctVar != null) {
                ctVar.c();
                this.R = null;
            }
            this.S = null;
            this.w = null;
            g gVar = this.x;
            if (gVar != null) {
                gVar.a();
            }
            this.af = null;
            ex.a();
            hn.b();
        } catch (Throwable th) {
            hn.c(th, "AMapDelegateImp", "destroy");
            er.a(th);
            th.printStackTrace();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void destroySurface(int i) {
        this.aH.lock();
        try {
            if (this.aD) {
                EGL14.eglGetCurrentContext();
                EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
                s sVar = this.aN;
                if (sVar != null) {
                    sVar.c();
                }
                df dfVar = this.aM;
                if (dfVar != null) {
                    dfVar.b();
                    this.aM = null;
                }
                GLMapEngine gLMapEngine = this.g;
                if (gLMapEngine != null) {
                    if (gLMapEngine.getOverlayBundle(this.L) != null) {
                        this.g.getOverlayBundle(this.L).removeAll(true);
                    }
                    this.g.destroyAMapEngine();
                    this.g = null;
                    int i2 = this.bl;
                    if (i2 > 0) {
                        ep.a(this.f, i2);
                    }
                    ex.a(ew.c, "destroy engine complete");
                }
                if (EGL14.eglGetCurrentContext() != EGL14.EGL_NO_CONTEXT) {
                    this.N.d();
                }
                jv jvVar = this.bg;
                if (jvVar != null) {
                    jvVar.f();
                }
            }
            this.aD = false;
            this.aE = false;
            this.aG = false;
            this.aH.unlock();
        } catch (Throwable th) {
            try {
                er.a(th);
            } finally {
                this.aH.unlock();
            }
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void drawFrame(GL10 gl10) {
        if (this.M || this.g == null || EGL14.eglGetCurrentContext() == EGL14.EGL_NO_CONTEXT) {
            return;
        }
        MapConfig mapConfig = this.c;
        if (mapConfig != null && !mapConfig.isMapEnable()) {
            GLES20.glClear(16640);
            return;
        }
        int i = this.ap;
        if (i != -1) {
            this.au.setRenderFps(i);
            resetRenderTime();
        } else if (this.g.isInMapAction(1) || this.aB) {
            this.au.setRenderFps(40.0f);
        } else if (this.g.isInMapAnimation(1)) {
            this.au.setRenderFps(30.0f);
            this.au.resetTickCount(15);
        } else {
            this.au.setRenderFps(15.0f);
        }
        if (this.c.isWorldMapEnable() != MapsInitializer.isLoadWorldGridMap()) {
            b();
            this.c.setWorldMapEnable(MapsInitializer.isLoadWorldGridMap());
        }
        this.g.renderAMap();
        this.g.pushRendererState();
        CustomRenderer customRenderer = this.am;
        if (customRenderer != null) {
            customRenderer.onDrawFrame(gl10);
        }
        com.amap.api.mapcore.util.a aVar = this.aQ;
        if (aVar != null) {
            aVar.a();
        }
        if (this.ab) {
            boolean zCanStopMapRender = this.g.canStopMapRender(1);
            Message messageObtainMessage = this.l.obtainMessage(15, this.g.getScreenShot(this.L, 0, 0, getMapWidth(), getMapHeight()));
            messageObtainMessage.arg1 = zCanStopMapRender ? 1 : 0;
            messageObtainMessage.sendToTarget();
            this.ab = false;
        }
        if (!this.Q) {
            this.l.sendEmptyMessage(16);
            this.Q = true;
            b();
        }
        long j = this.bn;
        if (j < 2) {
            this.bn = j + 1;
        } else {
            final fe feVarD = this.G.d();
            if (feVarD != null && feVarD.getVisibility() != 8) {
                ep.a(this.f, System.currentTimeMillis() - this.aR);
                this.l.post(new Runnable() { // from class: com.amap.api.mapcore.util.b.10
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (b.this.O) {
                            return;
                        }
                        try {
                            b bVar = b.this;
                            ao aoVar = bVar.d;
                            if (aoVar != null) {
                                bVar.setIndoorBuildingInfo(aoVar);
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        feVarD.setVisibility(8);
                    }
                });
                this.g.setStyleChangeGradualEnable(this.L, true);
            }
        }
        if (!this.aF) {
            this.aF = true;
        }
        this.g.popRendererState();
        if (ei.a()) {
            try {
                if (this.F instanceof e) {
                    if (this.e == null) {
                        this.e = new ei();
                    }
                    this.e.e();
                    if (!this.e.f() || this.e.d()) {
                        return;
                    }
                    if (this.e.a(((e) this.F).getBitmap())) {
                        if (ei.b()) {
                            removecache();
                        }
                        if (ei.c()) {
                            ei.g();
                        }
                        ex.b(ew.g, "pure screen: found pure check");
                    }
                }
            } catch (Throwable th) {
                hn.c(th, "AMapDelegateImp", "PureScreenCheckTool.checkBlackScreen");
            }
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void geo2Latlng(int i, int i2, DPoint dPoint) {
        DPoint dPointPixelsToLatLong = VirtualEarthProjection.pixelsToLatLong(i, i2, 20);
        dPoint.x = dPointPixelsToLatLong.x;
        dPoint.y = dPointPixelsToLatLong.y;
        dPointPixelsToLatLong.recycle();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void geo2Map(int i, int i2, FPoint fPoint) {
        ((PointF) fPoint).x = (int) (((double) i) - this.c.getSX());
        ((PointF) fPoint).y = (int) (((double) i2) - this.c.getSY());
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final jv getAMapExtraInterfaceManager() {
        return this.bg;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Projection getAMapProjection() throws RemoteException {
        return new Projection(this.C);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final UiSettings getAMapUiSettings() throws RemoteException {
        if (this.B == null) {
            this.B = new UiSettings(this.D);
        }
        return this.B;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final int getBaseOverlayTextureID() {
        s sVar = this.aN;
        if (sVar != null) {
            return sVar.b();
        }
        return 0;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final AMapCameraInfo getCamerInfo() {
        return null;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float getCameraAngle() {
        return getCameraDegree(this.L);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getCameraDegree(int i) {
        MapConfig mapConfig = this.c;
        if (mapConfig != null) {
            return mapConfig.getSC();
        }
        return 0.0f;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final CameraPosition getCameraPosition() throws RemoteException {
        return getCameraPositionPrj(this.P);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final CameraPosition getCameraPositionPrj(boolean z) {
        LatLng latLng;
        try {
            if (this.c == null) {
                return null;
            }
            if (!this.aD || this.O || this.g == null) {
                DPoint dPointObtain = DPoint.obtain();
                geo2Latlng((int) this.c.getSX(), (int) this.c.getSY(), dPointObtain);
                LatLng latLng2 = new LatLng(dPointObtain.y, dPointObtain.x);
                dPointObtain.recycle();
                return CameraPosition.builder().target(latLng2).bearing(this.c.getSR()).tilt(this.c.getSC()).zoom(this.c.getSZ()).build();
            }
            if (z) {
                DPoint dPointObtain2 = DPoint.obtain();
                getPixel2LatLng(this.c.getAnchorX(), this.c.getAnchorY(), dPointObtain2);
                latLng = new LatLng(dPointObtain2.y, dPointObtain2.x, false);
                dPointObtain2.recycle();
            } else {
                MapConfig mapConfig = this.c;
                if (mapConfig != null) {
                    DPoint dPointPixelsToLatLong = VirtualEarthProjection.pixelsToLatLong(mapConfig.getSX(), this.c.getSY(), 20);
                    LatLng latLng3 = new LatLng(dPointPixelsToLatLong.y, dPointPixelsToLatLong.x, false);
                    dPointPixelsToLatLong.recycle();
                    latLng = latLng3;
                } else {
                    latLng = null;
                }
            }
            return CameraPosition.builder().target(latLng).bearing(this.c.getSR()).tilt(this.c.getSC()).zoom(this.c.getSZ()).build();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final Context getContext() {
        return this.f;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final String getCurrentWorldVectorMapStyle() {
        try {
            jv jvVar = this.bg;
            if (jvVar == null) {
                return "";
            }
            Object objJ = jvVar.j();
            return objJ instanceof String ? (String) objJ : "";
        } catch (Throwable th) {
            er.a(th);
            return "";
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final com.amap.api.mapcore.util.a getCustomStyleManager() {
        return this.aQ;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final int getDottedLineTextureID(int i) {
        s sVar = this.aN;
        if (sVar != null) {
            return sVar.a(i);
        }
        return 0;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final int getEngineIDWithGestureInfo(EAMapPlatformGestureInfo eAMapPlatformGestureInfo) {
        GLMapEngine gLMapEngine = this.g;
        if (gLMapEngine != null) {
            return gLMapEngine.getEngineIDWithGestureInfo(eAMapPlatformGestureInfo);
        }
        return 1;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float[] getFinalMatrix() {
        MapConfig mapConfig = this.c;
        return mapConfig != null ? mapConfig.getMvpMatrix() : this.p;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final GLMapEngine getGLMapEngine() {
        return this.g;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final View getGLMapView() {
        Object obj = this.F;
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final de getGLShader(int i) {
        df dfVar = this.aM;
        if (dfVar == null) {
            return null;
        }
        return dfVar.a(i);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final df getGLShaderManager() {
        return this.aM;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void getGeoCenter(int i, IPoint iPoint) {
        MapConfig mapConfig = this.c;
        if (mapConfig != null) {
            ((Point) iPoint).x = (int) mapConfig.getSX();
            ((Point) iPoint).y = (int) this.c.getSY();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final long getGlOverlayMgrPtr() {
        GLMapEngine gLMapEngine = this.g;
        if (gLMapEngine != null) {
            return gLMapEngine.getGlOverlayMgrPtr(1);
        }
        return 0L;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final InfoWindowAnimationManager getInfoWindowAnimationManager() {
        return new InfoWindowAnimationManager(this.A);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final ap getInfoWindowDelegate() {
        return this.z;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void getLatLng2Map(double d2, double d3, FPoint fPoint) {
        IPoint iPointObtain = IPoint.obtain();
        latlon2Geo(d2, d3, iPointObtain);
        geo2Map(((Point) iPointObtain).x, ((Point) iPointObtain).y, fPoint);
        iPointObtain.recycle();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void getLatLng2Pixel(double d2, double d3, IPoint iPoint) {
        if (!this.aD || this.g == null) {
            return;
        }
        try {
            Point pointLatLongToPixels = VirtualEarthProjection.latLongToPixels(d2, d3, 20);
            FPoint fPointObtain = FPoint.obtain();
            a(pointLatLongToPixels.x, pointLatLongToPixels.y, fPointObtain);
            if (((PointF) fPointObtain).x == -10000.0f && ((PointF) fPointObtain).y == -10000.0f) {
                GLMapState gLMapState = (GLMapState) this.g.getNewMapState(1);
                gLMapState.setCameraDegree(0.0f);
                gLMapState.recalculate();
                gLMapState.p20ToScreenPoint(pointLatLongToPixels.x, pointLatLongToPixels.y, fPointObtain);
                gLMapState.recycle();
            }
            ((Point) iPoint).x = (int) ((PointF) fPointObtain).x;
            ((Point) iPoint).y = (int) ((PointF) fPointObtain).y;
            fPointObtain.recycle();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void getLatLngRect(DPoint[] dPointArr) {
        try {
            Rectangle geoRectangle = this.c.getGeoRectangle();
            if (geoRectangle != null) {
                IPoint[] clipRect = geoRectangle.getClipRect();
                for (int i = 0; i < 4; i++) {
                    GLMapState.geo2LonLat(((Point) clipRect[i]).x, ((Point) clipRect[i]).y, dPointArr[i]);
                }
            }
        } catch (Throwable th) {
            er.a(th);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final int getLineTextureID() {
        s sVar = this.aN;
        if (sVar != null) {
            return sVar.a();
        }
        return 0;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getLineTextureRatio() {
        return 1.0f;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getLogoMarginRate(int i) {
        fj fjVar = this.G;
        if (fjVar != null) {
            return fjVar.a(i);
        }
        return 0.0f;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final int getLogoPosition() {
        try {
            return this.D.getLogoPosition();
        } catch (RemoteException e) {
            hn.c(e, "AMapDelegateImp", "getLogoPosition");
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Handler getMainHandler() {
        return this.l;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getMapAngle(int i) {
        MapConfig mapConfig = this.c;
        if (mapConfig != null) {
            return mapConfig.getSR();
        }
        return 0.0f;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final LatLngBounds getMapBounds(LatLng latLng, float f, float f2, float f3) {
        int mapWidth = getMapWidth();
        int mapHeight = getMapHeight();
        if (mapWidth <= 0 || mapHeight <= 0 || this.M) {
            return null;
        }
        float fA = er.a(this.c, f);
        GLMapState gLMapState = new GLMapState(1, this.g.getNativeInstance());
        if (latLng != null) {
            IPoint iPointObtain = IPoint.obtain();
            latlon2Geo(latLng.latitude, latLng.longitude, iPointObtain);
            gLMapState.setCameraDegree(f3);
            gLMapState.setMapAngle(f2);
            gLMapState.setMapGeoCenter(((Point) iPointObtain).x, ((Point) iPointObtain).y);
            gLMapState.setMapZoomer(fA);
            gLMapState.recalculate();
            iPointObtain.recycle();
        }
        DPoint dPointObtain = DPoint.obtain();
        a(gLMapState, 0, 0, dPointObtain);
        LatLng latLng2 = new LatLng(dPointObtain.y, dPointObtain.x, false);
        a(gLMapState, mapWidth, mapHeight, dPointObtain);
        LatLng latLng3 = new LatLng(dPointObtain.y, dPointObtain.x, false);
        dPointObtain.recycle();
        gLMapState.recycle();
        return LatLngBounds.builder().include(latLng3).include(latLng2).build();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final MapConfig getMapConfig() {
        return this.c;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final String getMapContentApprovalNumber() {
        MapConfig mapConfig = this.c;
        if (mapConfig == null || mapConfig.isCustomStyleEnable()) {
            return null;
        }
        ep.d(this.f);
        String strA = eh.a(this.f, "approval_number", "mc", "");
        return !TextUtils.isEmpty(strA) ? strA : "GS(2019)6378号 | GS(2020)2189号";
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getMapHeight() {
        return this.i;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void getMapPrintScreen(AMap.onMapPrintScreenListener onmapprintscreenlistener) {
        try {
            this.x.a(Integer.valueOf(AMap.onMapPrintScreenListener.class.hashCode()), onmapprintscreenlistener);
            this.ab = true;
            resetRenderTime();
        } catch (Throwable th) {
            er.a(th);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final GLMapState getMapProjection() {
        GLMapEngine gLMapEngine = this.g;
        if (gLMapEngine != null) {
            return gLMapEngine.getMapState(1);
        }
        return null;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final FPoint[] getMapRect() {
        if (this.c.getMapRect() == null) {
            this.c.setMapRect(er.a(this));
        }
        return this.c.getMapRect();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final List<Marker> getMapScreenMarkers() throws RemoteException {
        if (er.a(getMapWidth(), getMapHeight())) {
            return this.j ? this.b.d() : this.J.getMapScreenMarkers();
        }
        return new ArrayList();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void getMapScreenShot(AMap.OnMapScreenShotListener onMapScreenShotListener) {
        try {
            this.x.a(Integer.valueOf(AMap.OnMapScreenShotListener.class.hashCode()), onMapScreenShotListener);
            this.ab = true;
            resetRenderTime();
        } catch (Throwable th) {
            er.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getMapTextZIndex() throws RemoteException {
        return this.al;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getMapType() throws RemoteException {
        return this.ae;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getMapWidth() {
        return this.h;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getMapZoomScale() {
        return this.ay;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final int getMaskLayerType() {
        return this.ao;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float getMaxZoomLevel() {
        try {
            MapConfig mapConfig = this.c;
            if (mapConfig != null) {
                return mapConfig.getMaxZoomLevel();
            }
            return 20.0f;
        } catch (Throwable th) {
            er.a(th);
            return 20.0f;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float getMinZoomLevel() {
        try {
            MapConfig mapConfig = this.c;
            if (mapConfig != null) {
                return mapConfig.getMinZoomLevel();
            }
            return 3.0f;
        } catch (Throwable th) {
            er.a(th);
            return 3.0f;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Location getMyLocation() throws RemoteException {
        if (this.S != null) {
            return this.w.a;
        }
        return null;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final MyLocationStyle getMyLocationStyle() throws RemoteException {
        ct ctVar = this.R;
        if (ctVar != null) {
            return ctVar.a();
        }
        return null;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final long getNativeMapController() {
        GLMapEngine gLMapEngine = this.g;
        if (gLMapEngine != null) {
            return gLMapEngine.getNativeMapController(1);
        }
        return 0L;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final AMap.OnCameraChangeListener getOnCameraChangeListener() throws RemoteException {
        try {
            List listA = this.x.a(AMap.OnCameraChangeListener.class.hashCode());
            if (listA == null && listA.size() != 0) {
                return (AMap.OnCameraChangeListener) listA.get(0);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void getPixel2Geo(int i, int i2, IPoint iPoint) {
        GLMapEngine gLMapEngine;
        GLMapState mapState;
        if (!this.aD || (gLMapEngine = this.g) == null || (mapState = gLMapEngine.getMapState(1)) == null) {
            return;
        }
        mapState.screenToP20Point(i, i2, iPoint);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void getPixel2LatLng(int i, int i2, DPoint dPoint) {
        GLMapEngine gLMapEngine;
        GLMapState mapState;
        if (!this.aD || (gLMapEngine = this.g) == null || (mapState = gLMapEngine.getMapState(1)) == null) {
            return;
        }
        IPoint iPointObtain = IPoint.obtain();
        mapState.screenToP20Point(i, i2, iPointObtain);
        DPoint dPointPixelsToLatLong = VirtualEarthProjection.pixelsToLatLong(((Point) iPointObtain).x, ((Point) iPointObtain).y, 20);
        dPoint.x = dPointPixelsToLatLong.x;
        dPoint.y = dPointPixelsToLatLong.y;
        iPointObtain.recycle();
        dPointPixelsToLatLong.recycle();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getPreciseLevel(int i) {
        MapConfig mapConfig = this.c;
        if (mapConfig != null) {
            return mapConfig.getSZ();
        }
        return 0.0f;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final IProjectionDelegate getProjection() throws RemoteException {
        return this.C;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float[] getProjectionMatrix() {
        MapConfig mapConfig = this.c;
        return mapConfig != null ? mapConfig.getProjectionMatrix() : this.r;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final Rect getRect() {
        return this.ad;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getRenderMode() {
        return this.F.getRenderMode();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getSX() {
        MapConfig mapConfig = this.c;
        if (mapConfig != null) {
            return (int) mapConfig.getSX();
        }
        return -1;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getSY() {
        MapConfig mapConfig = this.c;
        if (mapConfig != null) {
            return (int) mapConfig.getSY();
        }
        return -1;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final String getSatelliteImageApprovalNumber() {
        ep.e(this.f);
        String strA = eh.a(this.f, "approval_number", "si", "");
        return !TextUtils.isEmpty(strA) ? strA : "GS(2021)1328号";
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float getScalePerPixel() throws RemoteException {
        try {
            return ((float) ((((Math.cos((getCameraPosition().target.latitude * 3.141592653589793d) / 180.0d) * 2.0d) * 3.141592653589793d) * 6378137.0d) / (Math.pow(2.0d, getZoomLevel()) * 256.0d))) * getMapZoomScale();
        } catch (Throwable th) {
            hn.c(th, "AMapDelegateImp", "getScalePerPixel");
            er.a(th);
            th.printStackTrace();
            return 0.0f;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float getSkyHeight() {
        return this.c.getSkyHeight();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final w getTextureItem(BitmapDescriptor bitmapDescriptor) {
        return getTextureItem(bitmapDescriptor, false);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final IUiSettingsDelegate getUiSettings() {
        return this.D;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getUnitLengthByZoom(int i) {
        GLMapState gLMapState = new GLMapState(1, this.g.getNativeInstance());
        gLMapState.setMapZoomer(i);
        gLMapState.recalculate();
        float gLUnitWithWin = gLMapState.getGLUnitWithWin(1);
        gLMapState.recycle();
        return gLUnitWithWin;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final View getView() throws RemoteException {
        fj fjVar = this.G;
        if (fjVar != null) {
            return fjVar.j();
        }
        return null;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float[] getViewMatrix() {
        MapConfig mapConfig = this.c;
        return mapConfig != null ? mapConfig.getViewMatrix() : this.q;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final Point getWaterMarkerPositon() {
        fj fjVar = this.G;
        return fjVar != null ? fjVar.a() : new Point();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final String getWorldVectorMapLanguage() {
        return this.bh;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final String getWorldVectorMapStyle() {
        return this.bi;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getZoomLevel() {
        return c();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float getZoomToSpanLevel(LatLng latLng, LatLng latLng2) {
        try {
            MapConfig mapConfig = getMapConfig();
            if (latLng == null || latLng2 == null || !this.aD || this.M) {
                return mapConfig.getSZ();
            }
            LatLngBounds.Builder builder = new LatLngBounds.Builder();
            builder.include(latLng);
            builder.include(latLng2);
            GLMapState gLMapState = new GLMapState(1, this.g.getNativeInstance());
            Pair<Float, IPoint> pairA = er.a(mapConfig, 0, 0, 0, 0, builder.build(), getMapWidth(), getMapHeight());
            gLMapState.recycle();
            return pairA != null ? ((Float) pairA.first).floatValue() : gLMapState.getMapZoomer();
        } catch (Throwable th) {
            er.a(th);
            return 0.0f;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void hideInfoWindow() {
        IInfoWindowAction iInfoWindowActionC;
        ap apVar = this.z;
        if (apVar == null || (iInfoWindowActionC = apVar.c()) == null) {
            return;
        }
        iInfoWindowActionC.hideInfoWindow();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean isIndoorEnabled() throws RemoteException {
        return this.c.isIndoorEnable();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean isInfoWindowShown(IMarkerDelegate iMarkerDelegate) throws RemoteException {
        IInfoWindowAction iInfoWindowActionC;
        ap apVar = this.z;
        if (apVar == null || (iInfoWindowActionC = apVar.c()) == null) {
            return false;
        }
        return iInfoWindowActionC.isInfoWindowShown();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean isLockMapAngle(int i) {
        GLMapEngine gLMapEngine = this.g;
        if (gLMapEngine != null) {
            return gLMapEngine.getSrvViewStateBoolValue(i, 7);
        }
        return false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean isLockMapCameraDegree(int i) {
        return false;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean isMaploaded() {
        return this.Q;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean isMyLocationEnabled() throws RemoteException {
        return this.K;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean isTouchPoiEnable() {
        MapConfig mapConfig = this.c;
        if (mapConfig != null) {
            return mapConfig.isTouchPoiEnable();
        }
        return true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean isTrafficEnabled() throws RemoteException {
        return this.c.isTrafficEnabled();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean isUseAnchor() {
        return this.P;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void latlon2Geo(double d2, double d3, IPoint iPoint) {
        Point pointLatLongToPixels = VirtualEarthProjection.latLongToPixels(d2, d3, 20);
        ((Point) iPoint).x = pointLatLongToPixels.x;
        ((Point) iPoint).y = pointLatLongToPixels.y;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void loadWorldVectorMap(boolean z) {
        MapConfig mapConfig = this.c;
        if (mapConfig != null) {
            mapConfig.setAbroadEnable(z);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void map2Geo(float f, float f2, IPoint iPoint) {
        ((Point) iPoint).x = (int) (((double) f) + this.c.getSX());
        ((Point) iPoint).y = (int) (((double) f2) + this.c.getSY());
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void moveCamera(CameraUpdate cameraUpdate) throws RemoteException {
        if (cameraUpdate == null) {
            return;
        }
        try {
            moveCamera(cameraUpdate.getCameraUpdateFactoryDelegate());
        } catch (Throwable th) {
            er.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void onActivityPause() {
        this.O = true;
        b(this.L);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void onActivityResume() {
        this.O = false;
        int engineIDWithType = this.L;
        if (engineIDWithType == 0) {
            engineIDWithType = this.g.getEngineIDWithType(0);
        }
        c(engineIDWithType);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void onChangeFinish() {
        Message messageObtainMessage = this.l.obtainMessage();
        messageObtainMessage.what = 11;
        this.l.sendMessage(messageObtainMessage);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean onDoubleTap(int i, MotionEvent motionEvent) {
        if (!this.aD) {
            return false;
        }
        a((int) motionEvent.getX(), (int) motionEvent.getY());
        return false;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void onFling() {
        if (this.j) {
            z zVar = this.H;
            if (zVar != null) {
                zVar.b(true);
            }
        } else {
            IGlOverlayLayer iGlOverlayLayer = this.J;
            if (iGlOverlayLayer != null) {
                iGlOverlayLayer.setFlingState(true);
            }
        }
        this.aa = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00b6  */
    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void onIndoorBuildingActivity(int i, byte[] bArr) {
        ao aoVar;
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    aoVar = new ao();
                    byte b = bArr[0];
                    aoVar.a = new String(bArr, 1, b, "utf-8");
                    int i2 = b + 1;
                    int i3 = i2 + 1;
                    byte b2 = bArr[i2];
                    aoVar.b = new String(bArr, i3, b2, "utf-8");
                    int i4 = i3 + b2;
                    int i5 = i4 + 1;
                    byte b3 = bArr[i4];
                    aoVar.activeFloorName = new String(bArr, i5, b3, "utf-8");
                    int i6 = i5 + b3;
                    aoVar.activeFloorIndex = GLConvertUtil.getInt(bArr, i6);
                    int i7 = i6 + 4;
                    int i8 = i7 + 1;
                    byte b4 = bArr[i7];
                    aoVar.poiid = new String(bArr, i8, b4, "utf-8");
                    int i9 = i8 + b4;
                    int i10 = i9 + 1;
                    byte b5 = bArr[i9];
                    aoVar.h = new String(bArr, i10, b5, "utf-8");
                    int i11 = i10 + b5;
                    int i12 = GLConvertUtil.getInt(bArr, i11);
                    aoVar.c = i12;
                    int i13 = i11 + 4;
                    aoVar.floor_indexs = new int[i12];
                    aoVar.floor_names = new String[i12];
                    aoVar.d = new String[i12];
                    for (int i14 = 0; i14 < aoVar.c; i14++) {
                        aoVar.floor_indexs[i14] = GLConvertUtil.getInt(bArr, i13);
                        int i15 = i13 + 4;
                        int i16 = i15 + 1;
                        byte b6 = bArr[i15];
                        if (b6 > 0) {
                            aoVar.floor_names[i14] = new String(bArr, i16, b6, "utf-8");
                            i16 += b6;
                        }
                        i13 = i16 + 1;
                        byte b7 = bArr[i16];
                        if (b7 > 0) {
                            aoVar.d[i14] = new String(bArr, i13, b7, "utf-8");
                            i13 += b7;
                        }
                    }
                    int i17 = GLConvertUtil.getInt(bArr, i13);
                    aoVar.e = i17;
                    int i18 = i13 + 4;
                    if (i17 > 0) {
                        aoVar.f = new int[i17];
                        for (int i19 = 0; i19 < aoVar.e; i19++) {
                            aoVar.f[i19] = GLConvertUtil.getInt(bArr, i18);
                            i18 += 4;
                        }
                    }
                } else {
                    aoVar = null;
                }
            } catch (Throwable th) {
                er.a(th);
                th.printStackTrace();
                return;
            }
        } else {
            aoVar = null;
        }
        this.bo = aoVar;
        post(new Runnable() { // from class: com.amap.api.mapcore.util.b.33
            @Override // java.lang.Runnable
            public final void run() {
                if (b.this.aL != null) {
                    b.this.aL.a(b.this.bo);
                }
            }
        });
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void onLongPress(int i, MotionEvent motionEvent) {
        int i2 = 0;
        try {
            this.X = false;
            a(i);
            if (this.j) {
                BaseOverlayImp baseOverlayImpA = this.b.a(motionEvent);
                this.V = baseOverlayImpA;
                if (baseOverlayImpA == null || !baseOverlayImpA.isDraggable()) {
                    List listA = this.x.a(AMap.OnMapLongClickListener.class.hashCode());
                    if (listA != null && listA.size() > 0) {
                        DPoint dPointObtain = DPoint.obtain();
                        getPixel2LatLng((int) motionEvent.getX(), (int) motionEvent.getY(), dPointObtain);
                        synchronized (listA) {
                            while (i2 < listA.size()) {
                                ((AMap.OnMapLongClickListener) listA.get(i2)).onMapLongClick(new LatLng(dPointObtain.y, dPointObtain.x));
                                i2++;
                            }
                        }
                        this.Y = true;
                        dPointObtain.recycle();
                    }
                } else {
                    Marker marker = new Marker((cs) this.V);
                    this.U = marker;
                    LatLng position = marker.getPosition();
                    LatLng realPosition = this.V.getRealPosition();
                    if (position != null && realPosition != null) {
                        IPoint iPointObtain = IPoint.obtain();
                        getLatLng2Pixel(realPosition.latitude, realPosition.longitude, iPointObtain);
                        ((Point) iPointObtain).y -= 60;
                        DPoint dPointObtain2 = DPoint.obtain();
                        getPixel2LatLng(((Point) iPointObtain).x, ((Point) iPointObtain).y, dPointObtain2);
                        this.U.setPosition(new LatLng((position.latitude + dPointObtain2.y) - realPosition.latitude, (position.longitude + dPointObtain2.x) - realPosition.longitude));
                        this.b.a((IMarkerDelegate) this.V);
                        try {
                            List listA2 = this.x.a(AMap.OnMarkerDragListener.class.hashCode());
                            if (listA2 != null && listA2.size() > 0) {
                                synchronized (listA2) {
                                    while (i2 < listA2.size()) {
                                        ((AMap.OnMarkerDragListener) listA2.get(i2)).onMarkerDragStart(this.U);
                                        i2++;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            hn.c(th, "AMapDelegateImp", "onMarkerDragStart");
                            th.printStackTrace();
                        }
                        this.T = true;
                        iPointObtain.recycle();
                        dPointObtain2.recycle();
                    }
                }
            } else {
                BaseOverlay hitBaseOverlay = this.J.getHitBaseOverlay(motionEvent);
                if (hitBaseOverlay instanceof Marker) {
                    this.W = (Marker) hitBaseOverlay;
                }
                Marker marker2 = this.W;
                if (marker2 == null || !marker2.isDraggable()) {
                    List listA3 = this.x.a(AMap.OnMapLongClickListener.class.hashCode());
                    if (listA3 != null && listA3.size() > 0) {
                        DPoint dPointObtain3 = DPoint.obtain();
                        getPixel2LatLng((int) motionEvent.getX(), (int) motionEvent.getY(), dPointObtain3);
                        synchronized (listA3) {
                            while (i2 < listA3.size()) {
                                ((AMap.OnMapLongClickListener) listA3.get(i2)).onMapLongClick(new LatLng(dPointObtain3.y, dPointObtain3.x));
                                i2++;
                            }
                        }
                        this.Y = true;
                        dPointObtain3.recycle();
                    }
                } else {
                    LatLng position2 = this.W.getPosition();
                    if (position2 != null) {
                        IPoint iPointObtain2 = IPoint.obtain();
                        getLatLng2Pixel(position2.latitude, position2.longitude, iPointObtain2);
                        ((Point) iPointObtain2).y -= 60;
                        DPoint dPointObtain4 = DPoint.obtain();
                        getPixel2LatLng(((Point) iPointObtain2).x, ((Point) iPointObtain2).y, dPointObtain4);
                        this.W.setPosition(new LatLng(dPointObtain4.y, dPointObtain4.x));
                        this.J.set2Top(this.W.getId());
                        try {
                            List listA4 = this.x.a(AMap.OnMarkerDragListener.class.hashCode());
                            if (listA4 != null && listA4.size() > 0) {
                                synchronized (listA4) {
                                    while (i2 < listA4.size()) {
                                        ((AMap.OnMarkerDragListener) listA4.get(i2)).onMarkerDragStart(this.W);
                                        i2++;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            hn.c(th2, "AMapDelegateImp", "onMarkerDragStart");
                            th2.printStackTrace();
                        }
                        this.T = true;
                        iPointObtain2.recycle();
                        dPointObtain4.recycle();
                    }
                }
            }
            this.au.resetTickCount(30);
        } catch (Throwable th3) {
            hn.c(th3, "AMapDelegateImp", "onLongPress");
            th3.printStackTrace();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void onPause() {
        GLMapState gLMapState;
        GLMapEngine gLMapEngine = this.g;
        if (gLMapEngine != null && (gLMapState = (GLMapState) gLMapEngine.getNewMapState(1)) != null) {
            IPoint iPointObtain = IPoint.obtain();
            gLMapState.recalculate();
            gLMapState.getMapGeoCenter(iPointObtain);
            this.c.setSX(((Point) iPointObtain).x);
            this.c.setSY(((Point) iPointObtain).y);
            this.c.setSZ(gLMapState.getMapZoomer());
            this.c.setSC(gLMapState.getCameraDegree());
            this.c.setSR(gLMapState.getMapAngle());
            gLMapState.recycle();
            iPointObtain.recycle();
        }
        IGlOverlayLayer iGlOverlayLayer = this.J;
        if (iGlOverlayLayer != null) {
            iGlOverlayLayer.setFlingState(false);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void onResume() {
        try {
            this.au.setRenderFps(15.0f);
            this.F.setRenderMode(0);
            if (this.j) {
                z zVar = this.H;
                if (zVar != null) {
                    zVar.e();
                }
            } else {
                IGlOverlayLayer iGlOverlayLayer = this.J;
                if (iGlOverlayLayer != null) {
                    iGlOverlayLayer.setFlingState(true);
                }
            }
            ct ctVar = this.R;
            if (ctVar != null) {
                ctVar.b();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean onSingleTapConfirmed(int i, final MotionEvent motionEvent) {
        boolean zOnPointClick = false;
        if (!this.aD) {
            return false;
        }
        try {
            a(i);
            if (d(motionEvent) || c(motionEvent)) {
                return true;
            }
            if (this.aO != null) {
                IPoint iPointObtain = IPoint.obtain();
                if (this.g != null) {
                    getPixel2Geo((int) motionEvent.getX(), (int) motionEvent.getY(), iPointObtain);
                }
                zOnPointClick = this.aO.a(iPointObtain);
                iPointObtain.recycle();
            } else if (this.J != null && this.aP != null) {
                DPoint dPointObtain = DPoint.obtain();
                if (this.g != null) {
                    getPixel2LatLng((int) motionEvent.getX(), (int) motionEvent.getY(), dPointObtain);
                    LatLng latLng = new LatLng(dPointObtain.y, dPointObtain.x);
                    MultiPointItem multiPointItem = new MultiPointItem(latLng);
                    this.J.getMultiPointItem(latLng, multiPointItem);
                    zOnPointClick = this.aP.onPointClick(multiPointItem);
                    dPointObtain.recycle();
                }
            }
            if (zOnPointClick) {
                return true;
            }
            b(motionEvent);
            queueEvent(new Runnable() { // from class: com.amap.api.mapcore.util.b.8
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Message messageObtain = Message.obtain();
                        Poi poiB = null;
                        MapConfig mapConfig = b.this.c;
                        if (mapConfig != null && mapConfig.isTouchPoiEnable()) {
                            poiB = b.this.b((int) motionEvent.getX(), (int) motionEvent.getY());
                        }
                        List listA = b.this.x.a(AMap.OnPOIClickListener.class.hashCode());
                        if (listA == null || listA.size() <= 0 || poiB == null) {
                            b.a(b.this, motionEvent);
                            return;
                        }
                        messageObtain.what = 20;
                        messageObtain.obj = poiB;
                        b.this.l.sendMessage(messageObtain);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
            return true;
        } catch (Throwable th) {
            hn.c(th, "AMapDelegateImp", "onSingleTapUp");
            th.printStackTrace();
            return true;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.O || !this.aD || !this.aA) {
            return false;
        }
        EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.bm;
        eAMapPlatformGestureInfo.mGestureState = 3;
        eAMapPlatformGestureInfo.mGestureType = 8;
        eAMapPlatformGestureInfo.mLocation = new float[]{motionEvent.getX(), motionEvent.getY()};
        getEngineIDWithGestureInfo(this.bm);
        GLMapRender gLMapRender = this.au;
        if (gLMapRender != null) {
            gLMapRender.resetTickCount(2);
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            g();
            if (this.aD) {
                this.av.a();
                this.aw = true;
                this.aB = true;
                try {
                    stopAnimation();
                } catch (RemoteException unused) {
                }
            }
        } else if (action == 1) {
            this.aw = true;
            this.aB = false;
            if (this.Y) {
                this.Y = false;
            }
            if (this.X) {
                this.X = false;
            }
            if (this.Z) {
                this.Z = false;
            }
            try {
                if (this.T) {
                    List listA = this.x.a(AMap.OnMarkerDragListener.class.hashCode());
                    if (listA != null && listA.size() > 0 && (this.U != null || this.W != null)) {
                        synchronized (listA) {
                            for (int i = 0; i < listA.size(); i++) {
                                if (this.j) {
                                    ((AMap.OnMarkerDragListener) listA.get(i)).onMarkerDragEnd(this.U);
                                } else {
                                    ((AMap.OnMarkerDragListener) listA.get(i)).onMarkerDragEnd(this.W);
                                }
                            }
                        }
                        this.U = null;
                        this.W = null;
                    }
                    this.T = false;
                }
            } catch (Throwable th) {
                hn.c(th, "AMapDelegateImp", "OnMarkerDragListener.onMarkerDragEnd");
                th.printStackTrace();
            }
        }
        if (motionEvent.getAction() == 2 && this.T) {
            try {
                a(motionEvent);
            } catch (Throwable th2) {
                hn.c(th2, "AMapDelegateImp", "onDragMarker");
                th2.printStackTrace();
            }
            return true;
        }
        if (this.aw) {
            try {
                this.av.a(motionEvent);
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
        }
        try {
            List listA2 = this.x.a(AMap.OnMapTouchListener.class.hashCode());
            if (listA2 != null && listA2.size() > 0) {
                this.l.removeMessages(14);
                Message messageObtainMessage = this.l.obtainMessage();
                messageObtainMessage.what = 14;
                messageObtainMessage.obj = MotionEvent.obtain(motionEvent);
                messageObtainMessage.sendToTarget();
            }
        } catch (Throwable unused2) {
        }
        return true;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void pixel2Map(int i, int i2, PointF pointF) {
        if (!this.aD || this.O || this.g == null) {
            return;
        }
        IPoint iPointObtain = IPoint.obtain();
        getPixel2Geo(i, i2, iPointObtain);
        pointF.x = ((Point) iPointObtain).x - ((float) this.c.getSX());
        pointF.y = ((Point) iPointObtain).y - ((float) this.c.getSY());
        iPointObtain.recycle();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void post(Runnable runnable) {
        IGLSurfaceView iGLSurfaceView = this.F;
        if (iGLSurfaceView != null) {
            iGLSurfaceView.post(runnable);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void queueEvent(Runnable runnable) {
        long id;
        try {
            try {
                id = Thread.currentThread().getId();
            } catch (Throwable th) {
                er.a(th);
                hn.c(th, "AMapdelegateImp", "queueEvent");
                id = -1;
            }
            if (id != -1 && id == this.at) {
                runnable.run();
            } else if (this.g != null) {
                this.F.queueEvent(runnable);
            }
        } catch (Throwable th2) {
            er.a(th2);
            hn.c(th2, "AMapdelegateImp", "queueEvent");
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void redrawInfoWindow() {
        if (this.aD) {
            this.l.sendEmptyMessage(18);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void refreshLogo() {
        fj fjVar = this.G;
        if (fjVar != null) {
            fjVar.c();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void reloadMap() {
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void reloadMapCustomStyle() {
        com.amap.api.mapcore.util.a aVar = this.aQ;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void removeEngineGLOverlay(final BaseMapOverlay baseMapOverlay) {
        if (this.g != null) {
            queueEvent(new Runnable() { // from class: com.amap.api.mapcore.util.b.36
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.g.getOverlayBundle(1).removeOverlay(baseMapOverlay);
                }
            });
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean removeGLModel(String str) {
        try {
            if (this.j) {
                this.N.a(str);
            } else {
                this.J.removeOverlay(str);
            }
            return false;
        } catch (Throwable th) {
            hn.c(th, "AMapDelegateImp", "removeGLModel");
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean removeGLOverlay(String str) throws RemoteException {
        resetRenderTime();
        return this.J.removeOverlay(str);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnCameraChangeListener(AMap.OnCameraChangeListener onCameraChangeListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.b(Integer.valueOf(AMap.OnCameraChangeListener.class.hashCode()), onCameraChangeListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnIndoorBuildingActiveListener(AMap.OnIndoorBuildingActiveListener onIndoorBuildingActiveListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.b(Integer.valueOf(AMap.OnIndoorBuildingActiveListener.class.hashCode()), onIndoorBuildingActiveListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnInfoWindowClickListener(AMap.OnInfoWindowClickListener onInfoWindowClickListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.b(Integer.valueOf(AMap.OnInfoWindowClickListener.class.hashCode()), onInfoWindowClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMapClickListener(AMap.OnMapClickListener onMapClickListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.b(Integer.valueOf(AMap.OnMapClickListener.class.hashCode()), onMapClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMapLoadedListener(AMap.OnMapLoadedListener onMapLoadedListener) {
        g gVar = this.x;
        if (gVar != null) {
            gVar.b(Integer.valueOf(AMap.OnMapLoadedListener.class.hashCode()), onMapLoadedListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMapLongClickListener(AMap.OnMapLongClickListener onMapLongClickListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.b(Integer.valueOf(AMap.OnMapLongClickListener.class.hashCode()), onMapLongClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMapTouchListener(AMap.OnMapTouchListener onMapTouchListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.b(Integer.valueOf(AMap.OnMapTouchListener.class.hashCode()), onMapTouchListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMarkerClickListener(AMap.OnMarkerClickListener onMarkerClickListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.b(Integer.valueOf(AMap.OnMarkerClickListener.class.hashCode()), onMarkerClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMarkerDragListener(AMap.OnMarkerDragListener onMarkerDragListener) {
        g gVar = this.x;
        if (gVar != null) {
            gVar.b(Integer.valueOf(AMap.OnMarkerDragListener.class.hashCode()), onMarkerDragListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMyLocationChangeListener(AMap.OnMyLocationChangeListener onMyLocationChangeListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.b(Integer.valueOf(AMap.OnMyLocationChangeListener.class.hashCode()), onMyLocationChangeListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnPOIClickListener(AMap.OnPOIClickListener onPOIClickListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.b(Integer.valueOf(AMap.OnPOIClickListener.class.hashCode()), onPOIClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnPolylineClickListener(AMap.OnPolylineClickListener onPolylineClickListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.b(Integer.valueOf(AMap.OnPolylineClickListener.class.hashCode()), onPolylineClickListener);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void removeTextureItem(String str) {
        synchronized (this.aq) {
            int size = this.aq.size();
            int i = -1;
            for (int i2 = 0; i2 < size; i2++) {
                if (this.aq.get(i2).q().equals(str)) {
                    i = i2;
                    break;
                }
            }
            if (i >= 0) {
                this.aq.remove(i);
            }
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removecache() throws RemoteException {
        removecache(null);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void renderSurface(GL10 gl10) {
        drawFrame(gl10);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void requestRender() {
        GLMapRender gLMapRender = this.au;
        if (gLMapRender == null || gLMapRender.isRenderPause()) {
            return;
        }
        this.F.requestRender();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0049 */
    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void resetMinMaxZoomPreference() {
        List listA;
        this.c.resetMinMaxZoomPreference();
        if (!this.D.isZoomControlsEnabled() || !this.c.isNeedUpdateZoomControllerState() || (listA = this.x.a(AMapWidgetListener.class.hashCode())) == null || listA.size() <= 0) {
            return;
        }
        synchronized (listA) {
            for (int i = 0; i < listA.size(); i++) {
                try {
                    ((AMapWidgetListener) listA.get(i)).invalidateZoomController(this.c.getSZ());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void resetRenderTime() {
        GLMapRender gLMapRender = this.au;
        if (gLMapRender != null) {
            gLMapRender.resetTickCount(2);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void resetRenderTimeLongLong() {
        GLMapRender gLMapRender = this.au;
        if (gLMapRender != null) {
            gLMapRender.resetTickCount(30);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void set3DBuildingEnabled(boolean z) throws RemoteException {
        try {
            b(1);
            a(1, z);
            c(1);
        } catch (Throwable th) {
            er.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setAMapGestureListener(AMapGestureListener aMapGestureListener) {
        o oVar = this.av;
        if (oVar != null) {
            this.y = aMapGestureListener;
            oVar.d = aMapGestureListener;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCenterToPixel(int i, int i2) throws RemoteException {
        this.P = true;
        this.aJ = i;
        this.aK = i2;
        if (this.aE && this.aD) {
            if (this.c.getAnchorX() == this.aJ && this.c.getAnchorY() == this.aK) {
                return;
            }
            this.c.setAnchorX(this.aJ);
            this.c.setAnchorY(this.aK);
            queueEvent(new Runnable() { // from class: com.amap.api.mapcore.util.b.29
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        b bVar = b.this;
                        bVar.c.setAnchorX(Math.max(0, Math.min(bVar.aJ, b.this.h)));
                        b bVar2 = b.this;
                        bVar2.c.setAnchorY(Math.max(0, Math.min(bVar2.aK, b.this.i)));
                        b bVar3 = b.this;
                        bVar3.g.setProjectionCenter(1, bVar3.c.getAnchorX(), b.this.c.getAnchorY());
                        b.q(b.this);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setConstructingRoadEnable(final boolean z) {
        try {
            if (this.aD && this.aE) {
                resetRenderTime();
                queueEvent(new Runnable() { // from class: com.amap.api.mapcore.util.b.27
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            b.this.g.setMapOpenLayerEnable(z);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            } else {
                a aVar = this.ba;
                aVar.c = z;
                aVar.b = true;
                aVar.g = 1;
            }
        } catch (Throwable th) {
            er.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCustomMapStyle(CustomMapStyleOptions customMapStyleOptions) {
        if (customMapStyleOptions != null) {
            try {
                if (a(true, false)) {
                    return;
                }
                if (customMapStyleOptions.isEnable() && (customMapStyleOptions.getStyleId() != null || customMapStyleOptions.getStyleTexturePath() != null || customMapStyleOptions.getStyleTextureData() != null || customMapStyleOptions.getStyleResDataPath() != null || customMapStyleOptions.getStyleResData() != null)) {
                    h();
                }
                this.aQ.c();
                this.aQ.a(customMapStyleOptions);
                jv jvVar = this.bg;
                if (jvVar != null) {
                    jvVar.i();
                }
            } catch (Throwable th) {
                er.a(th);
                return;
            }
        }
        resetRenderTime();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCustomMapStyleID(String str) {
        if (TextUtils.isEmpty(str) || str.equals(this.c.getCustomStyleID())) {
            return;
        }
        this.c.setCustomStyleID(str);
        this.E = true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCustomMapStylePath(String str) {
        if (TextUtils.isEmpty(str) || str.equals(this.c.getCustomStylePath())) {
            return;
        }
        this.c.setCustomStylePath(str);
        this.E = true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCustomRenderer(CustomRenderer customRenderer) throws RemoteException {
        this.am = customRenderer;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCustomTextureResourcePath(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.c.setCustomTextureResourcePath(str);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setGestureStatus(int i, int i2) {
        if (this.aI == 0 || i2 != 5) {
            this.aI = i2;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setHideLogoEnble(boolean z) {
        MapConfig mapConfig = this.c;
        if (mapConfig != null) {
            mapConfig.setHideLogoEnble(z);
            if (this.c.isCustomStyleEnable()) {
                this.D.setLogoEnable(!z);
            }
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setIndoorBuildingInfo(IndoorBuildingInfo indoorBuildingInfo) throws RemoteException {
        if (this.M || indoorBuildingInfo == null || indoorBuildingInfo.activeFloorName == null || indoorBuildingInfo.poiid == null) {
            return;
        }
        this.d = (ao) indoorBuildingInfo;
        resetRenderTime();
        queueEvent(new Runnable() { // from class: com.amap.api.mapcore.util.b.30
            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                GLMapEngine gLMapEngine = bVar.g;
                if (gLMapEngine != null) {
                    ao aoVar = bVar.d;
                    gLMapEngine.setIndoorBuildingToBeActive(1, aoVar.activeFloorName, aoVar.activeFloorIndex, aoVar.poiid);
                }
            }
        });
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setIndoorEnabled(final boolean z) throws RemoteException {
        List listA;
        try {
            if (!this.aD || this.M) {
                a aVar = this.bd;
                aVar.c = z;
                aVar.b = true;
                aVar.g = 1;
                return;
            }
            this.c.setIndoorEnable(z);
            resetRenderTime();
            if (z) {
                GLMapEngine gLMapEngine = this.g;
                if (gLMapEngine != null) {
                    gLMapEngine.setIndoorEnable(1, true);
                }
            } else {
                GLMapEngine gLMapEngine2 = this.g;
                if (gLMapEngine2 != null) {
                    gLMapEngine2.setIndoorEnable(1, false);
                }
                MapConfig mapConfig = this.c;
                mapConfig.maxZoomLevel = mapConfig.isSetLimitZoomLevel() ? this.c.getMaxZoomLevel() : 20.0f;
                try {
                    if (this.D.isZoomControlsEnabled() && (listA = this.x.a(AMapWidgetListener.class.hashCode())) != null && listA.size() > 0) {
                        synchronized (listA) {
                            for (int i = 0; i < listA.size(); i++) {
                                ((AMapWidgetListener) listA.get(i)).invalidateZoomController(this.c.getSZ());
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            ep.c(this.f, z);
            if (this.D.isIndoorSwitchEnabled()) {
                this.l.post(new Runnable() { // from class: com.amap.api.mapcore.util.b.22
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (z) {
                            b.this.showIndoorSwitchControlsEnabled(true);
                        } else if (b.this.G != null) {
                            b.this.G.i(Boolean.FALSE);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            er.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setInfoWindowAdapter(AMap.InfoWindowAdapter infoWindowAdapter) throws RemoteException {
        ap apVar;
        if (this.M || (apVar = this.z) == null) {
            return;
        }
        apVar.a(infoWindowAdapter);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setLoadOfflineData(final boolean z) throws RemoteException {
        queueEvent(new Runnable() { // from class: com.amap.api.mapcore.util.b.23
            @Override // java.lang.Runnable
            public final void run() {
                GLMapEngine gLMapEngine = b.this.g;
                if (gLMapEngine != null) {
                    gLMapEngine.setOfflineDataEnable(1, z);
                }
            }
        });
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setLocationSource(LocationSource locationSource) throws RemoteException {
        try {
            if (this.M) {
                return;
            }
            LocationSource locationSource2 = this.S;
            if (locationSource2 != null && (locationSource2 instanceof aq)) {
                locationSource2.deactivate();
            }
            this.S = locationSource;
            if (locationSource != null) {
                this.G.h(Boolean.TRUE);
            } else {
                this.G.h(Boolean.FALSE);
            }
        } catch (Throwable th) {
            hn.c(th, "AMapDelegateImp", "setLocationSource");
            th.printStackTrace();
            er.a(th);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setLogoBottomMargin(int i) {
        fj fjVar = this.G;
        if (fjVar != null) {
            fjVar.c(Integer.valueOf(i));
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setLogoLeftMargin(int i) {
        fj fjVar = this.G;
        if (fjVar != null) {
            fjVar.d(Integer.valueOf(i));
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setLogoMarginRate(int i, float f) {
        fj fjVar = this.G;
        if (fjVar != null) {
            fjVar.a(Integer.valueOf(i), Float.valueOf(f));
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setLogoPosition(int i) {
        fj fjVar = this.G;
        if (fjVar != null) {
            fjVar.b(Integer.valueOf(i));
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setMapCustomEnable(boolean z, boolean z2) {
        dh dhVar;
        if (!this.aD || this.M) {
            a aVar = this.aV;
            aVar.b = true;
            aVar.c = z;
            return;
        }
        boolean z3 = z2 ? z2 : false;
        if (TextUtils.isEmpty(this.c.getCustomStylePath()) && TextUtils.isEmpty(this.c.getCustomStyleID())) {
            return;
        }
        if (z) {
            try {
                if (this.c.isProFunctionAuthEnable() && !TextUtils.isEmpty(this.c.getCustomStyleID()) && (dhVar = this.ar) != null) {
                    dhVar.a(this.c.getCustomStyleID());
                    eq.a().a(this.ar);
                }
            } catch (Throwable th) {
                th.printStackTrace();
                er.a(th);
                return;
            }
        }
        if (z2 || this.E || (this.c.isCustomStyleEnable() ^ z)) {
            a(z, (byte[]) null, z3);
        }
        this.E = false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setMapEnable(boolean z) {
        MapConfig mapConfig = this.c;
        if (mapConfig != null) {
            mapConfig.setMapEnable(z);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapLanguage(String str) {
        MapConfig mapConfig;
        if (TextUtils.isEmpty(str) || (mapConfig = this.c) == null || mapConfig.isCustomStyleEnable() || this.c.getMapLanguage().equals(str)) {
            return;
        }
        if (!str.equals("en")) {
            this.c.setMapLanguage("zh_cn");
            this.al = 0;
        } else {
            if (this.ae != 1) {
                try {
                    setMapType(1);
                } catch (Throwable th) {
                    er.a(th);
                    th.printStackTrace();
                }
            }
            this.c.setMapLanguage("en");
            this.al = -10000;
        }
        try {
            b(getCameraPosition());
            if (this.j) {
                synchronized (this.I) {
                    if (this.H == null) {
                        this.H = new z(this.f, this);
                    }
                }
                z zVar = this.H;
                if (zVar != null) {
                    String mapLanguage = this.c.getMapLanguage();
                    dd ddVar = zVar.d;
                    if (ddVar != null) {
                        ddVar.a(mapLanguage);
                    }
                }
            }
        } catch (Throwable th2) {
            er.a(th2);
            th2.printStackTrace();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapStatusLimits(LatLngBounds latLngBounds) {
        try {
            this.c.setLimitLatLngBounds(latLngBounds);
            try {
                LatLngBounds limitLatLngBounds = this.c.getLimitLatLngBounds();
                GLMapEngine gLMapEngine = this.g;
                if (gLMapEngine != null) {
                    if ((limitLatLngBounds == null || limitLatLngBounds.northeast == null || limitLatLngBounds.southwest == null) ? false : true) {
                        GLMapState gLMapState = new GLMapState(1, gLMapEngine.getNativeInstance());
                        IPoint iPointObtain = IPoint.obtain();
                        LatLng latLng = limitLatLngBounds.northeast;
                        GLMapState.lonlat2Geo(latLng.longitude, latLng.latitude, iPointObtain);
                        IPoint iPointObtain2 = IPoint.obtain();
                        LatLng latLng2 = limitLatLngBounds.southwest;
                        GLMapState.lonlat2Geo(latLng2.longitude, latLng2.latitude, iPointObtain2);
                        this.c.setLimitIPoints(new IPoint[]{iPointObtain, iPointObtain2});
                        gLMapState.recycle();
                        return;
                    }
                    th.printStackTrace();
                    er.a(th);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.c.setLimitIPoints(null);
        } catch (Throwable th2) {
            th2.printStackTrace();
            er.a(th2);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapTextEnable(final boolean z) throws RemoteException {
        try {
            if (this.aD && this.aE) {
                resetRenderTime();
                queueEvent(new Runnable() { // from class: com.amap.api.mapcore.util.b.24
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            b.this.g.setLabelEnable(1, z);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            } else {
                a aVar = this.aX;
                aVar.c = z;
                aVar.b = true;
                aVar.g = 1;
            }
        } catch (Throwable th) {
            er.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapTextZIndex(int i) throws RemoteException {
        this.al = i;
        this.k = false;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapType(int i) throws RemoteException {
        int i2;
        int i3;
        int i4;
        MapConfig mapConfig;
        if (i != this.ae || ((mapConfig = this.c) != null && mapConfig.isCustomStyleEnable())) {
            this.ae = i;
            this.ae = i;
            if (i != 1) {
                if (i == 2) {
                    i2 = 1;
                } else {
                    if (i != 3) {
                        if (i == 4) {
                            i2 = 0;
                            i3 = 0;
                        } else if (i == 5) {
                            i2 = 2;
                        } else {
                            try {
                                this.ae = 1;
                                i2 = 0;
                            } catch (Throwable th) {
                                hn.c(th, "AMapDelegateImp", "setMaptype");
                                th.printStackTrace();
                                er.a(th);
                                return;
                            }
                        }
                        hn.c(th, "AMapDelegateImp", "setMaptype");
                        th.printStackTrace();
                        er.a(th);
                        return;
                    }
                    i2 = 0;
                    i3 = 1;
                    i4 = 4;
                }
                i3 = 0;
                i4 = 0;
            } else {
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            this.c.setMapStyleMode(i2);
            this.c.setMapStyleTime(i3);
            this.c.setMapStyleState(i4);
            if (this.c.isCustomStyleEnable()) {
                com.amap.api.mapcore.util.a aVar = this.aQ;
                if (aVar == null || !aVar.d()) {
                    a(1, i2, i3, i4, true, false, null);
                    this.c.setCustomStyleEnable(false);
                } else {
                    this.aQ.e();
                }
                this.D.setLogoEnable(true);
            } else {
                if (this.c.getMapLanguage().equals("en")) {
                    setMapLanguage("zh_cn");
                }
                a(1, i2, i3, i4);
            }
            resetRenderTime();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setMapWidgetListener(AMapWidgetListener aMapWidgetListener) {
        try {
            g gVar = this.x;
            if (gVar != null) {
                gVar.a(AMapWidgetListener.class.hashCode(), aMapWidgetListener);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMaskLayerParams(int i, int i2, int i3, int i4, final int i5, long j) {
        GLAlphaAnimation gLAlphaAnimation;
        try {
            if (this.an != null) {
                float f = i4 / 255.0f;
                if (i5 == -1) {
                    gLAlphaAnimation = new GLAlphaAnimation(f, 0.0f);
                    gLAlphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.amap.api.mapcore.util.b.31
                        @Override // com.amap.api.maps.model.animation.Animation.AnimationListener
                        public final void onAnimationEnd() {
                            b.this.l.post(new Runnable() { // from class: com.amap.api.mapcore.util.b.31.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AnonymousClass31 anonymousClass31 = AnonymousClass31.this;
                                    b.this.ao = i5;
                                    if (b.this.G != null) {
                                        b.this.G.j(Boolean.TRUE);
                                    }
                                }
                            });
                        }

                        @Override // com.amap.api.maps.model.animation.Animation.AnimationListener
                        public final void onAnimationStart() {
                        }
                    });
                } else {
                    this.ao = i5;
                    gLAlphaAnimation = new GLAlphaAnimation(0.0f, f);
                    if (f > 0.2f) {
                        fj fjVar = this.G;
                        if (fjVar != null) {
                            fjVar.j(Boolean.FALSE);
                        }
                    } else {
                        fj fjVar2 = this.G;
                        if (fjVar2 != null) {
                            fjVar2.j(Boolean.TRUE);
                        }
                    }
                }
                gLAlphaAnimation.setInterpolator(new LinearInterpolator());
                gLAlphaAnimation.setDuration(j);
                this.an.a(i, i2, i3, i4);
                this.an.a(gLAlphaAnimation);
            }
        } catch (Throwable th) {
            er.a(th);
            th.printStackTrace();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMaxZoomLevel(float f) {
        this.c.setMaxZoomLevel(f);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMinZoomLevel(float f) {
        this.c.setMinZoomLevel(f);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMyLocationEnabled(boolean z) throws RemoteException {
        if (this.M) {
            return;
        }
        try {
            fj fjVar = this.G;
            if (fjVar != null) {
                LocationSource locationSource = this.S;
                if (locationSource == null) {
                    fjVar.h(Boolean.FALSE);
                } else if (z) {
                    locationSource.activate(this.w);
                    this.G.h(Boolean.TRUE);
                    if (this.R == null) {
                        this.R = new ct(this, this.f);
                    }
                } else {
                    ct ctVar = this.R;
                    if (ctVar != null) {
                        ctVar.c();
                        this.R = null;
                    }
                    this.S.deactivate();
                }
            }
            if (!z) {
                this.D.setMyLocationButtonEnabled(z);
            }
            this.K = z;
            resetRenderTime();
        } catch (Throwable th) {
            hn.c(th, "AMapDelegateImp", "setMyLocationEnabled");
            th.printStackTrace();
            er.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMyLocationRotateAngle(float f) throws RemoteException {
        try {
            ct ctVar = this.R;
            if (ctVar != null) {
                ctVar.a(f);
            }
        } catch (Throwable th) {
            er.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMyLocationStyle(MyLocationStyle myLocationStyle) throws RemoteException {
        if (this.M) {
            return;
        }
        try {
            if (this.R == null) {
                this.R = new ct(this, this.f);
            }
            if (this.R != null) {
                if (myLocationStyle.getInterval() < 1000) {
                    myLocationStyle.interval(1000L);
                }
                LocationSource locationSource = this.S;
                if (locationSource != null && (locationSource instanceof aq)) {
                    ((aq) locationSource).a(myLocationStyle.getInterval());
                    ((aq) this.S).a(myLocationStyle.getMyLocationType());
                }
                this.R.a(myLocationStyle);
            }
        } catch (Throwable th) {
            er.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMyLocationType(int i) throws RemoteException {
        try {
            ct ctVar = this.R;
            if (ctVar == null || ctVar.a() == null) {
                return;
            }
            this.R.a().myLocationType(i);
            setMyLocationStyle(this.R.a());
        } catch (Throwable th) {
            er.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setNaviLabelEnable(final boolean z, final int i, final int i2) throws RemoteException {
        try {
            if (this.aD && this.aE) {
                resetRenderTime();
                queueEvent(new Runnable() { // from class: com.amap.api.mapcore.util.b.26
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            b.this.g.setNaviLabelEnable(1, z, i, i2);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
                return;
            }
            a aVar = this.aZ;
            aVar.c = z;
            aVar.h = i;
            aVar.i = i2;
            aVar.b = true;
            aVar.g = 1;
        } catch (Throwable th) {
            er.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnCameraChangeListener(AMap.OnCameraChangeListener onCameraChangeListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.a(AMap.OnCameraChangeListener.class.hashCode(), onCameraChangeListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnIndoorBuildingActiveListener(AMap.OnIndoorBuildingActiveListener onIndoorBuildingActiveListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.a(AMap.OnIndoorBuildingActiveListener.class.hashCode(), onIndoorBuildingActiveListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnInfoWindowClickListener(AMap.OnInfoWindowClickListener onInfoWindowClickListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.a(AMap.OnInfoWindowClickListener.class.hashCode(), onInfoWindowClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMapClickListener(AMap.OnMapClickListener onMapClickListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.a(AMap.OnMapClickListener.class.hashCode(), onMapClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMapLongClickListener(AMap.OnMapLongClickListener onMapLongClickListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.a(AMap.OnMapLongClickListener.class.hashCode(), onMapLongClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMapTouchListener(AMap.OnMapTouchListener onMapTouchListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.a(AMap.OnMapTouchListener.class.hashCode(), onMapTouchListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMaploadedListener(AMap.OnMapLoadedListener onMapLoadedListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.a(AMap.OnMapLoadedListener.class.hashCode(), onMapLoadedListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMarkerClickListener(AMap.OnMarkerClickListener onMarkerClickListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.a(AMap.OnMarkerClickListener.class.hashCode(), onMarkerClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMarkerDragListener(AMap.OnMarkerDragListener onMarkerDragListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.a(AMap.OnMarkerDragListener.class.hashCode(), onMarkerDragListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMultiPointClickListener(AMap.OnMultiPointClickListener onMultiPointClickListener) {
        av avVar = this.aO;
        if (avVar != null) {
            avVar.a(onMultiPointClickListener);
        } else {
            this.aP = onMultiPointClickListener;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMyLocationChangeListener(AMap.OnMyLocationChangeListener onMyLocationChangeListener) {
        g gVar = this.x;
        if (gVar != null) {
            gVar.a(AMap.OnMyLocationChangeListener.class.hashCode(), onMyLocationChangeListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnPOIClickListener(AMap.OnPOIClickListener onPOIClickListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.a(AMap.OnPOIClickListener.class.hashCode(), onPOIClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnPolylineClickListener(AMap.OnPolylineClickListener onPolylineClickListener) throws RemoteException {
        g gVar = this.x;
        if (gVar != null) {
            gVar.a(AMap.OnPolylineClickListener.class.hashCode(), onPolylineClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setRenderFps(int i) {
        try {
            if (i == -1) {
                this.ap = i;
            } else {
                this.ap = Math.max(10, Math.min(i, 40));
            }
            ep.f(this.f);
        } catch (Throwable th) {
            er.a(th);
            th.printStackTrace();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setRenderMode(int i) {
        try {
            IGLSurfaceView iGLSurfaceView = this.F;
            if (iGLSurfaceView != null) {
                iGLSurfaceView.setRenderMode(i);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setRoadArrowEnable(final boolean z) throws RemoteException {
        try {
            if (this.aD && this.aE) {
                resetRenderTime();
                queueEvent(new Runnable() { // from class: com.amap.api.mapcore.util.b.25
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            b.this.g.setRoadArrowEnable(1, z);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            } else {
                a aVar = this.aY;
                aVar.c = z;
                aVar.b = true;
                aVar.g = 1;
            }
        } catch (Throwable th) {
            er.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setRunLowFrame(boolean z) {
        if (z) {
            return;
        }
        try {
            if (this.ap == -1) {
                g();
            }
        } catch (Throwable th) {
            er.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setTouchPoiEnable(boolean z) {
        MapConfig mapConfig = this.c;
        if (mapConfig != null) {
            mapConfig.setTouchPoiEnable(z);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setTrafficEnabled(final boolean z) throws RemoteException {
        try {
            if (this.aD && !this.M) {
                queueEvent(new Runnable() { // from class: com.amap.api.mapcore.util.b.20
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (b.this.c.isTrafficEnabled() != z) {
                                b.this.c.setTrafficEnabled(z);
                                b.this.au.setTrafficMode(z);
                                b.this.g.setTrafficEnable(1, z);
                                b.this.resetRenderTime();
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                            er.a(th);
                        }
                    }
                });
                return;
            }
            a aVar = this.aS;
            aVar.c = z;
            aVar.b = true;
            aVar.g = 1;
        } catch (Throwable th) {
            er.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setTrafficStyleWithTextureData(final byte[] bArr) {
        if (this.M) {
            return;
        }
        try {
            if (this.aD && this.aE && bArr != null) {
                resetRenderTime();
                queueEvent(new Runnable() { // from class: com.amap.api.mapcore.util.b.28
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            b.this.g.setTrafficStyleWithTextureData(1, bArr);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            } else {
                a aVar = this.bb;
                aVar.j = bArr;
                aVar.b = true;
                aVar.g = 1;
            }
        } catch (Throwable th) {
            er.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setVisibilityEx(int i) {
        IGLSurfaceView iGLSurfaceView = this.F;
        if (iGLSurfaceView != null) {
            try {
                iGLSurfaceView.setVisibility(i);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setWorldVectorMapStyle(String str) {
        if (a(false, true) || TextUtils.isEmpty(str) || this.c == null || this.bi.equals(str)) {
            return;
        }
        this.bi = str;
        jv jvVar = this.bg;
        if (jvVar != null) {
            jvVar.i();
        }
        resetRenderTime();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setZOrderOnTop(boolean z) throws RemoteException {
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setZoomPosition(int i) {
        fj fjVar;
        if (this.M || (fjVar = this.G) == null) {
            return;
        }
        fjVar.a(Integer.valueOf(i));
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setZoomScaleParam(float f) {
        this.ay = f;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showCompassEnabled(boolean z) {
        fj fjVar;
        if (this.M || (fjVar = this.G) == null) {
            return;
        }
        fjVar.d(Boolean.valueOf(z));
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showIndoorSwitchControlsEnabled(boolean z) {
        fj fjVar;
        if (this.M || (fjVar = this.G) == null) {
            return;
        }
        fjVar.a(Boolean.valueOf(z));
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showInfoWindow(BaseOverlayImp baseOverlayImp) throws RemoteException {
        ap apVar;
        if (baseOverlayImp == null || (apVar = this.z) == null) {
            return;
        }
        try {
            IInfoWindowAction iInfoWindowActionC = apVar.c();
            if (iInfoWindowActionC != null) {
                iInfoWindowActionC.showInfoWindow(baseOverlayImp);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showLogoEnabled(boolean z) {
        if (this.M) {
            return;
        }
        this.G.f(Boolean.valueOf(z));
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showMyLocationButtonEnabled(boolean z) {
        fj fjVar;
        if (this.M || (fjVar = this.G) == null) {
            return;
        }
        fjVar.c(Boolean.valueOf(z));
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showMyLocationOverlay(Location location) throws RemoteException {
        if (location == null) {
            return;
        }
        try {
            if (this.K && this.S != null) {
                if (this.R == null) {
                    this.R = new ct(this, this.f);
                }
                if (location.getLongitude() != 0.0d && location.getLatitude() != 0.0d) {
                    this.R.a(location);
                }
                List listA = this.x.a(AMap.OnMyLocationChangeListener.class.hashCode());
                if (listA != null && listA.size() > 0) {
                    synchronized (listA) {
                        for (int i = 0; i < listA.size(); i++) {
                            ((AMap.OnMyLocationChangeListener) listA.get(i)).onMyLocationChange(location);
                        }
                    }
                }
                resetRenderTime();
                return;
            }
            ct ctVar = this.R;
            if (ctVar != null) {
                ctVar.c();
            }
            this.R = null;
        } catch (Throwable th) {
            hn.c(th, "AMapDelegateImp", "showMyLocationOverlay");
            th.printStackTrace();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showScaleEnabled(boolean z) {
        fj fjVar;
        if (this.M || (fjVar = this.G) == null) {
            return;
        }
        fjVar.e(Boolean.valueOf(z));
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showZoomControlsEnabled(boolean z) {
        fj fjVar;
        if (this.M || (fjVar = this.G) == null) {
            return;
        }
        fjVar.b(Boolean.valueOf(z));
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void stopAnimation() throws RemoteException {
        try {
            GLMapEngine gLMapEngine = this.g;
            if (gLMapEngine != null) {
                gLMapEngine.interruptAnimation();
            }
            resetRenderTime();
        } catch (Throwable th) {
            er.a(th);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float toMapLenWithWin(int i) {
        GLMapEngine gLMapEngine;
        if (!this.aD || this.O || (gLMapEngine = this.g) == null) {
            return 0.0f;
        }
        return gLMapEngine.getMapState(1).getGLUnitWithWin(i);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void zoomOut(int i) {
        if (this.aD && ((int) c()) > this.c.getMinZoomLevel()) {
            try {
                animateCamera(af.b());
            } catch (Throwable th) {
                hn.c(th, "AMapDelegateImp", "onDoubleTap");
                th.printStackTrace();
            }
            resetRenderTime();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(IGLSurfaceView iGLSurfaceView, Context context, boolean z) {
        this.w = null;
        this.x = new g();
        this.A = null;
        Object[] objArr = 0;
        this.a = false;
        this.E = false;
        this.H = null;
        this.I = new Object();
        this.b = null;
        this.K = false;
        this.M = false;
        this.O = false;
        this.c = new MapConfig(true);
        this.P = false;
        this.Q = false;
        this.T = false;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.aa = false;
        this.ab = false;
        this.ac = true;
        this.ad = new Rect();
        this.ae = 1;
        this.af = null;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.al = 0;
        this.ao = -1;
        this.ap = -1;
        this.aq = new ArrayList();
        this.e = null;
        this.at = -1L;
        this.aw = false;
        this.ax = 0.0f;
        this.ay = 1.0f;
        this.az = 1.0f;
        this.aA = true;
        this.aB = false;
        this.aC = false;
        this.aD = false;
        this.aE = false;
        this.aF = false;
        this.aG = false;
        this.aH = new ReentrantLock();
        this.aI = 0;
        this.j = false;
        this.k = true;
        this.l = new Handler(Looper.getMainLooper()) { // from class: com.amap.api.mapcore.util.b.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                IInfoWindowAction iInfoWindowActionC;
                if (message == null || b.this.M) {
                    return;
                }
                try {
                    int i = message.what;
                    if (i == 2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Key验证失败：[");
                        Object obj = message.obj;
                        if (obj != null) {
                            sb.append(obj);
                        } else {
                            sb.append(gk.b);
                        }
                        sb.append("]");
                        Log.w("amapsdk", sb.toString());
                        return;
                    }
                    switch (i) {
                        case 10:
                            CameraPosition cameraPosition = (CameraPosition) message.obj;
                            try {
                                List listA = b.this.x.a(AMap.OnCameraChangeListener.class.hashCode());
                                if (cameraPosition != null && listA != null && listA.size() > 0) {
                                    synchronized (listA) {
                                        try {
                                            Iterator it2 = listA.iterator();
                                            while (it2.hasNext()) {
                                                ((AMap.OnCameraChangeListener) it2.next()).onCameraChange(cameraPosition);
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                                break;
                            } catch (Throwable th2) {
                                er.a(th2);
                            }
                            b.this.c.addChangedCounter();
                            return;
                        case 11:
                            try {
                                CameraPosition cameraPosition2 = b.this.getCameraPosition();
                                if (cameraPosition2 != null && b.this.G != null) {
                                    b.this.G.a(cameraPosition2);
                                }
                                b.this.b(cameraPosition2);
                                if (b.this.aC) {
                                    b.e(b.this);
                                    b bVar = b.this;
                                    if (bVar.j) {
                                        if (bVar.H != null) {
                                            b.this.H.b(false);
                                        }
                                    } else if (bVar.J != null) {
                                        b.this.J.setFlingState(false);
                                    }
                                    b.this.b();
                                }
                                if (b.this.aa) {
                                    b.this.redrawInfoWindow();
                                    b.i(b.this);
                                }
                                b.this.a(cameraPosition2);
                                return;
                            } catch (Throwable th3) {
                                hn.c(th3, "AMapDelegateImp", "CameraUpdateFinish");
                                er.a(th3);
                                return;
                            }
                        case 12:
                            if (b.this.G != null) {
                                b.this.G.a(Float.valueOf(b.this.getZoomLevel()));
                                return;
                            }
                            return;
                        case 13:
                            if (b.this.G != null) {
                                b.this.G.h();
                                return;
                            }
                            return;
                        case 14:
                            try {
                                List listA2 = b.this.x.a(AMap.OnMapTouchListener.class.hashCode());
                                if (listA2 == null || listA2.size() <= 0) {
                                    return;
                                }
                                synchronized (listA2) {
                                    try {
                                        Iterator it3 = listA2.iterator();
                                        while (it3.hasNext()) {
                                            ((AMap.OnMapTouchListener) it3.next()).onTouch((MotionEvent) message.obj);
                                        }
                                    } catch (Throwable th4) {
                                        throw th4;
                                    }
                                    break;
                                }
                                return;
                            } catch (Throwable th5) {
                                hn.c(th5, "AMapDelegateImp", "onTouchHandler");
                                th5.printStackTrace();
                                return;
                            }
                        case 15:
                            Bitmap bitmap = (Bitmap) message.obj;
                            int i2 = message.arg1;
                            if (bitmap == null || b.this.G == null) {
                                try {
                                    List listA3 = b.this.x.a(AMap.onMapPrintScreenListener.class.hashCode());
                                    ArrayList arrayList = listA3 != null ? new ArrayList(listA3) : null;
                                    List listA4 = b.this.x.a(AMap.OnMapScreenShotListener.class.hashCode());
                                    ArrayList arrayList2 = listA4 != null ? new ArrayList(listA4) : null;
                                    b.this.x.a(Integer.valueOf(AMap.onMapPrintScreenListener.class.hashCode()));
                                    b.this.x.a(Integer.valueOf(AMap.OnMapScreenShotListener.class.hashCode()));
                                    if (arrayList != null && arrayList.size() > 0) {
                                        synchronized (arrayList) {
                                            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                                ((AMap.onMapPrintScreenListener) arrayList.get(i3)).onMapPrint(null);
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    if (arrayList2 == null || arrayList2.size() <= 0) {
                                        return;
                                    }
                                    synchronized (arrayList2) {
                                        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                            ((AMap.OnMapScreenShotListener) arrayList2.get(i4)).onMapScreenShot(null);
                                            ((AMap.OnMapScreenShotListener) arrayList2.get(i4)).onMapScreenShot(null, i2);
                                        }
                                        break;
                                    }
                                    return;
                                } catch (Throwable th6) {
                                    th6.printStackTrace();
                                    return;
                                }
                            }
                            Canvas canvas = new Canvas(bitmap);
                            fn fnVarF = b.this.G.f();
                            if (fnVarF != null) {
                                fnVarF.onDraw(canvas);
                            }
                            b.this.G.a(canvas);
                            try {
                                List listA5 = b.this.x.a(AMap.onMapPrintScreenListener.class.hashCode());
                                ArrayList arrayList3 = listA5 != null ? new ArrayList(listA5) : null;
                                List listA6 = b.this.x.a(AMap.OnMapScreenShotListener.class.hashCode());
                                ArrayList arrayList4 = listA6 != null ? new ArrayList(listA6) : null;
                                b.this.x.a(Integer.valueOf(AMap.onMapPrintScreenListener.class.hashCode()));
                                b.this.x.a(Integer.valueOf(AMap.OnMapScreenShotListener.class.hashCode()));
                                if (arrayList3 != null && arrayList3.size() > 0) {
                                    synchronized (arrayList3) {
                                        for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                                            ((AMap.onMapPrintScreenListener) arrayList3.get(i5)).onMapPrint(new BitmapDrawable(b.this.f.getResources(), bitmap));
                                        }
                                        break;
                                    }
                                }
                                if (arrayList4 == null || arrayList4.size() <= 0) {
                                    return;
                                }
                                synchronized (arrayList4) {
                                    for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                                        ((AMap.OnMapScreenShotListener) arrayList4.get(i6)).onMapScreenShot(bitmap);
                                        ((AMap.OnMapScreenShotListener) arrayList4.get(i6)).onMapScreenShot(bitmap, i2);
                                    }
                                    break;
                                }
                                return;
                            } catch (Throwable th7) {
                                th7.printStackTrace();
                                return;
                            }
                        case 16:
                            try {
                                List listA7 = b.this.x.a(AMap.OnMapLoadedListener.class.hashCode());
                                if (listA7 != null) {
                                    synchronized (listA7) {
                                        for (int i7 = 0; i7 < listA7.size(); i7++) {
                                            try {
                                                ((AMap.OnMapLoadedListener) listA7.get(i7)).onMapLoaded();
                                            } catch (Throwable th8) {
                                                throw th8;
                                            }
                                        }
                                    }
                                }
                                break;
                            } catch (Throwable th9) {
                                hn.c(th9, "AMapDelegateImp", "onMapLoaded");
                                th9.printStackTrace();
                                er.a(th9);
                            }
                            if (b.this.G != null) {
                                b.this.G.i();
                                return;
                            }
                            return;
                        case 17:
                            if (b.this.g.isInMapAnimation(1)) {
                                b bVar2 = b.this;
                                if (bVar2.j) {
                                    if (bVar2.H != null) {
                                        b.this.H.b(false);
                                    }
                                } else if (bVar2.J != null) {
                                    b.this.J.setFlingState(false);
                                }
                            }
                            b bVar3 = b.this;
                            if (!bVar3.j || bVar3.H == null) {
                                return;
                            }
                            b.this.H.a(message.arg1 != 0);
                            return;
                        case 18:
                            if (b.this.z == null || (iInfoWindowActionC = b.this.z.c()) == null) {
                                return;
                            }
                            iInfoWindowActionC.redrawInfoWindow();
                            return;
                        case 19:
                            List listA8 = b.this.x.a(AMap.OnMapClickListener.class.hashCode());
                            if (listA8 != null) {
                                DPoint dPointObtain = DPoint.obtain();
                                b.this.getPixel2LatLng(message.arg1, message.arg2, dPointObtain);
                                try {
                                    synchronized (listA8) {
                                        Iterator it4 = listA8.iterator();
                                        while (it4.hasNext()) {
                                            ((AMap.OnMapClickListener) it4.next()).onMapClick(new LatLng(dPointObtain.y, dPointObtain.x));
                                        }
                                        break;
                                    }
                                    dPointObtain.recycle();
                                    return;
                                } catch (Throwable th10) {
                                    hn.c(th10, "AMapDelegateImp", "OnMapClickListener.onMapClick");
                                    th10.printStackTrace();
                                    return;
                                }
                            }
                            return;
                        case 20:
                            try {
                                List listA9 = b.this.x.a(AMap.OnPOIClickListener.class.hashCode());
                                if (listA9 == null || listA9.size() <= 0) {
                                    return;
                                }
                                synchronized (listA9) {
                                    for (int i8 = 0; i8 < listA9.size(); i8++) {
                                        try {
                                            ((AMap.OnPOIClickListener) listA9.get(i8)).onPOIClick((Poi) message.obj);
                                        } catch (Throwable th11) {
                                            throw th11;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                return;
                            } catch (Throwable th12) {
                                hn.c(th12, "AMapDelegateImp", "OnPOIClickListener.onPOIClick");
                                th12.printStackTrace();
                                return;
                            }
                        default:
                            return;
                    }
                    hn.c(th, "AMapDelegateImp", "handleMessage");
                    th.printStackTrace();
                } catch (Throwable th13) {
                    hn.c(th13, "AMapDelegateImp", "handleMessage");
                    th13.printStackTrace();
                }
            }
        };
        this.aS = new a() { // from class: com.amap.api.mapcore.util.b.11
            @Override // com.amap.api.mapcore.util.b.a, java.lang.Runnable
            public final void run() {
                super.run();
                try {
                    b.this.setTrafficEnabled(this.c);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        this.aT = new a() { // from class: com.amap.api.mapcore.util.b.21
            @Override // com.amap.api.mapcore.util.b.a, java.lang.Runnable
            public final void run() {
                super.run();
                try {
                    b bVar = b.this;
                    bVar.setCenterToPixel(bVar.aJ, b.this.aK);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        this.aU = new a() { // from class: com.amap.api.mapcore.util.b.32
            @Override // com.amap.api.mapcore.util.b.a, java.lang.Runnable
            public final void run() {
                super.run();
                b.this.a(this.g, this.d, this.e, this.f);
            }
        };
        this.aV = new a() { // from class: com.amap.api.mapcore.util.b.37
            @Override // com.amap.api.mapcore.util.b.a, java.lang.Runnable
            public final void run() {
                super.run();
                b.this.setMapCustomEnable(this.c);
            }
        };
        this.aW = new a() { // from class: com.amap.api.mapcore.util.b.38
            @Override // com.amap.api.mapcore.util.b.a, java.lang.Runnable
            public final void run() {
                super.run();
                b.this.a(this.g, this.c);
            }
        };
        this.aX = new a() { // from class: com.amap.api.mapcore.util.b.39
            @Override // com.amap.api.mapcore.util.b.a, java.lang.Runnable
            public final void run() {
                super.run();
                try {
                    b.this.setMapTextEnable(this.c);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        this.aY = new a() { // from class: com.amap.api.mapcore.util.b.40
            @Override // com.amap.api.mapcore.util.b.a, java.lang.Runnable
            public final void run() {
                super.run();
                try {
                    b.this.setRoadArrowEnable(this.c);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        this.aZ = new a() { // from class: com.amap.api.mapcore.util.b.41
            @Override // com.amap.api.mapcore.util.b.a, java.lang.Runnable
            public final void run() {
                super.run();
                try {
                    b.this.setNaviLabelEnable(this.c, this.h, this.i);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        this.ba = new a() { // from class: com.amap.api.mapcore.util.b.2
            @Override // com.amap.api.mapcore.util.b.a, java.lang.Runnable
            public final void run() {
                super.run();
                try {
                    b.this.setConstructingRoadEnable(this.c);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        this.bb = new a() { // from class: com.amap.api.mapcore.util.b.3
            @Override // com.amap.api.mapcore.util.b.a, java.lang.Runnable
            public final void run() {
                super.run();
                try {
                    b.this.setTrafficStyleWithTextureData(this.j);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        this.bc = new a() { // from class: com.amap.api.mapcore.util.b.4
            @Override // com.amap.api.mapcore.util.b.a, java.lang.Runnable
            public final void run() {
                super.run();
                b.this.b(this.g, this.c);
            }
        };
        this.bd = new a() { // from class: com.amap.api.mapcore.util.b.5
            @Override // com.amap.api.mapcore.util.b.a, java.lang.Runnable
            public final void run() {
                super.run();
                try {
                    b.this.setIndoorEnabled(this.c);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        this.be = new Runnable() { // from class: com.amap.api.mapcore.util.b.6
            @Override // java.lang.Runnable
            public final void run() {
                fn fnVarF;
                if (b.this.G == null || (fnVarF = b.this.G.f()) == null) {
                    return;
                }
                fnVarF.c();
            }
        };
        this.bf = new a() { // from class: com.amap.api.mapcore.util.b.7
            @Override // com.amap.api.mapcore.util.b.a, java.lang.Runnable
            public final void run() {
                super.run();
                b.this.c(this.g, this.c);
            }
        };
        this.bh = "";
        this.bi = "";
        this.bj = false;
        this.bk = false;
        this.bl = 0;
        this.bm = new EAMapPlatformGestureInfo();
        this.m = new Point();
        this.n = new Rect();
        this.bn = 0L;
        this.o = null;
        this.bo = null;
        this.p = new float[16];
        this.q = new float[16];
        this.r = new float[16];
        this.bp = null;
        this.s = new float[12];
        this.t = "precision highp float;\nattribute vec3 aVertex;//顶点数组,三维坐标\nuniform mat4 aMVPMatrix;//mvp矩阵\nvoid main(){\n  gl_Position = aMVPMatrix * vec4(aVertex, 1.0);\n}";
        this.u = "//有颜色 没有纹理\nprecision highp float;\nvoid main(){\n  gl_FragColor = vec4(1.0,0,0,1.0);\n}";
        this.v = -1;
        this.f = context;
        ex.a(context);
        ex.a(ew.c, "init map delegate");
        jv jvVar = new jv();
        this.bg = jvVar;
        jvVar.a();
        this.bg.b();
        hn.a(this.f);
        eb.a().a(this.f);
        l.b = gj.c(context);
        ds.a(this.f);
        this.av = new o(this);
        this.g = new GLMapEngine(this.f, this);
        GLMapRender gLMapRender = new GLMapRender(this);
        this.au = gLMapRender;
        this.F = iGLSurfaceView;
        iGLSurfaceView.setRenderer(gLMapRender);
        boolean zBooleanValue = eh.a(context, "amap_param", "overlay_use_old_type", Boolean.FALSE).booleanValue();
        this.j = zBooleanValue;
        boolean z2 = zBooleanValue | (!MapsInitializer.getPolyline2Enable());
        this.j = z2;
        if (z2) {
            this.J = new r(this);
            this.aO = new av(this);
            this.G = new fk(this.f, this);
            this.b = new u(this);
        } else {
            q qVar = new q(this, this.f);
            this.J = qVar;
            this.G = new fi(this.f, this, qVar);
        }
        this.D = new aa(this);
        this.G.a(new c(this, objArr == true ? 1 : 0));
        this.aL = new C0103b();
        this.N = new n(this.f, this);
        iGLSurfaceView.setRenderMode(0);
        this.au.setRenderFps(15.0f);
        this.g.setMapListener(this);
        this.C = new x(this);
        this.w = new f(this);
        ap apVar = new ap(this.f);
        this.z = apVar;
        apVar.a(this.G);
        if (this.j) {
            db dbVar = new db(this, context);
            this.A = dbVar;
            this.z.b(dbVar);
        } else {
            this.z.b(new cv(this.J, context));
        }
        this.an = new v();
        this.ag = new j(this.f, this);
        this.S = new aq(this.f);
        this.aN = new s();
        this.ar = new dh(this.f, this);
        dj djVar = new dj(this.f);
        this.as = djVar;
        djVar.a(this);
        jv jvVar2 = this.bg;
        if (jvVar2 != null) {
            Object objJ = jvVar2.j();
            if (objJ != null && (objJ instanceof Boolean)) {
                MapConfig mapConfig = this.c;
                if (mapConfig != null) {
                    mapConfig.setAbroadEnable(z && ((Boolean) objJ).booleanValue());
                }
                if (z && ((Boolean) objJ).booleanValue()) {
                    MapsInitializer.setSupportRecycleView(false);
                }
            }
            Object objJ2 = this.bg.j();
            if (objJ2 != null && (objJ2 instanceof Boolean)) {
                this.G.a(((Boolean) objJ2).booleanValue());
            }
            Object objJ3 = this.bg.j();
            if (objJ2 != null && (objJ2 instanceof Integer)) {
                this.al = ((Integer) objJ3).intValue();
            }
        }
        MapConfig mapConfig2 = this.c;
        com.amap.api.mapcore.util.a aVar = new com.amap.api.mapcore.util.a(this, this.f, mapConfig2 != null ? mapConfig2.isAbroadEnable() : false);
        this.aQ = aVar;
        aVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CameraPosition cameraPosition) {
        if (!this.c.getMapLanguage().equals("en")) {
            if (this.ac) {
                return;
            }
            this.ac = true;
            b(1, true);
            return;
        }
        boolean zC = c(cameraPosition);
        if (zC != this.ac) {
            this.ac = zC;
            b(1, zC);
        }
    }

    private boolean c(CameraPosition cameraPosition) {
        if (cameraPosition.zoom < 6.0f) {
            return false;
        }
        if (cameraPosition.isAbroad) {
            return true;
        }
        MapConfig mapConfig = this.c;
        if (mapConfig == null) {
            return false;
        }
        try {
            return !ek.a(mapConfig.getGeoRectangle().getClipRect());
        } catch (Throwable th) {
            th.printStackTrace();
            er.a(th);
            return false;
        }
    }

    private synchronized void d() {
        synchronized (this.aq) {
            int size = this.aq.size();
            for (int i = 0; i < size; i++) {
                this.aq.get(i).k().recycle();
            }
            this.aq.clear();
        }
    }

    private void e() {
        List listA;
        List listA2;
        List listA3;
        if (this.c.getMapRect() == null || this.ak) {
            f();
            this.ak = false;
        }
        boolean z = true;
        this.g.getCurTileIDs(1, this.c.getCurTileIds());
        GLMapState mapState = this.g.getMapState(1);
        if (mapState != null) {
            mapState.getViewMatrix(this.c.getViewMatrix());
            mapState.getProjectionMatrix(this.c.getProjectionMatrix());
            this.c.updateFinalMatrix();
            DPoint mapGeoCenter = mapState.getMapGeoCenter();
            this.c.setSX(mapGeoCenter.x);
            this.c.setSY(mapGeoCenter.y);
            this.c.setSZ(mapState.getMapZoomer());
            this.c.setSC(mapState.getCameraDegree());
            this.c.setSR(mapState.getMapAngle());
            if (!this.c.isMapStateChange()) {
                if (!this.aB && this.g.getAnimateionsCount() == 0 && this.g.getStateMessageCount() == 0) {
                    onChangeFinish();
                    return;
                }
                return;
            }
            this.c.setSkyHeight(mapState.getSkyHeight());
            DPoint dPointPixelsToLatLong = VirtualEarthProjection.pixelsToLatLong(mapGeoCenter.x, mapGeoCenter.y, 20);
            CameraPosition cameraPosition = new CameraPosition(new LatLng(dPointPixelsToLatLong.y, dPointPixelsToLatLong.x, false), this.c.getSZ(), this.c.getSC(), this.c.getSR());
            dPointPixelsToLatLong.recycle();
            Message messageObtainMessage = this.l.obtainMessage();
            messageObtainMessage.what = 10;
            messageObtainMessage.obj = cameraPosition;
            this.l.sendMessage(messageObtainMessage);
            this.aC = true;
            redrawInfoWindow();
            f();
            try {
                if (this.D.isZoomControlsEnabled() && this.c.isNeedUpdateZoomControllerState() && (listA3 = this.x.a(AMapWidgetListener.class.hashCode())) != null && listA3.size() > 0) {
                    synchronized (listA3) {
                        for (int i = 0; i < listA3.size(); i++) {
                            ((AMapWidgetListener) listA3.get(i)).invalidateZoomController(this.c.getSZ());
                        }
                    }
                }
                if (this.c.getChangeGridRatio() != 1.0d) {
                    b();
                }
                if (!this.D.isCompassEnabled() || (!this.c.isTiltChanged() && !this.c.isBearingChanged())) {
                    z = false;
                }
                if (z && (listA2 = this.x.a(AMapWidgetListener.class.hashCode())) != null && listA2.size() > 0) {
                    synchronized (listA2) {
                        for (int i2 = 0; i2 < listA2.size(); i2++) {
                            ((AMapWidgetListener) listA2.get(i2)).invalidateCompassView();
                        }
                    }
                }
                if (!this.D.isScaleControlsEnabled() || (listA = this.x.a(AMapWidgetListener.class.hashCode())) == null || listA.size() <= 0) {
                    return;
                }
                synchronized (listA) {
                    for (int i3 = 0; i3 < listA.size(); i3++) {
                        ((AMapWidgetListener) listA.get(i3)).invalidateScaleView();
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void f() {
        try {
            this.c.setMapRect(er.a(this));
            GLMapState gLMapState = (GLMapState) this.g.getNewMapState(1);
            if (gLMapState != null) {
                gLMapState.recalculate();
                gLMapState.getPixel20Bound(this.n, getMapWidth(), getMapHeight());
                this.c.getGeoRectangle().updateRect(this.n, (int) this.c.getSX(), (int) this.c.getSY());
                this.c.setMapPerPixelUnitLength(gLMapState.getGLUnitWithWin(1));
                gLMapState.recycle();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void g() {
        GLMapRender gLMapRender;
        if (!this.aD || (gLMapRender = this.au) == null || gLMapRender.isRenderPause()) {
            return;
        }
        requestRender();
    }

    private void h() {
        if (this.aj) {
            return;
        }
        try {
            if (this.ah == null) {
                this.ah = new h(this.f, this);
            }
            this.ah.setName("AuthProThread");
            this.ah.start();
            this.aj = true;
        } catch (Throwable th) {
            th.printStackTrace();
            er.a(th);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void animateCamera(AbstractCameraUpdateMessage abstractCameraUpdateMessage) throws RemoteException {
        animateCameraWithDurationAndCallback(abstractCameraUpdateMessage, 250L, (AMap.CancelableCallback) null);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void animateCameraWithDurationAndCallback(AbstractCameraUpdateMessage abstractCameraUpdateMessage, long j, AMap.CancelableCallback cancelableCallback) {
        if (abstractCameraUpdateMessage == null || this.M || this.g == null) {
            return;
        }
        abstractCameraUpdateMessage.mCallback = cancelableCallback;
        abstractCameraUpdateMessage.mDuration = j;
        if (!this.O && getMapHeight() != 0 && getMapWidth() != 0) {
            try {
                this.g.interruptAnimation();
                resetRenderTime();
                a(abstractCameraUpdateMessage);
                this.g.addMessage(abstractCameraUpdateMessage, true);
                return;
            } catch (Throwable th) {
                er.a(th);
                th.printStackTrace();
                return;
            }
        }
        try {
            moveCamera(abstractCameraUpdateMessage);
            AMap.CancelableCallback cancelableCallback2 = abstractCameraUpdateMessage.mCallback;
            if (cancelableCallback2 != null) {
                cancelableCallback2.onFinish();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
            er.a(th2);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final w getTextureItem(BitmapDescriptor bitmapDescriptor, boolean z) {
        if (bitmapDescriptor == null || bitmapDescriptor.getBitmap() == null || bitmapDescriptor.getBitmap().isRecycled()) {
            return null;
        }
        synchronized (this.aq) {
            for (int i = 0; i < this.aq.size(); i++) {
                w wVar = this.aq.get(i);
                if (!(z && wVar.l() == getBaseOverlayTextureID()) && wVar.k().equals(bitmapDescriptor)) {
                    return wVar;
                }
            }
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removecache(AMap.OnCacheRemoveListener onCacheRemoveListener) throws RemoteException {
        if (this.l == null || this.g == null) {
            return;
        }
        try {
            d dVar = new d(this.f, onCacheRemoveListener);
            this.l.removeCallbacks(dVar);
            this.l.post(dVar);
        } catch (Throwable th) {
            hn.c(th, "AMapDelegateImp", "removecache");
            th.printStackTrace();
            er.a(th);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void moveCamera(AbstractCameraUpdateMessage abstractCameraUpdateMessage) throws RemoteException {
        GLMapEngine gLMapEngine = this.g;
        if (gLMapEngine == null || this.M) {
            return;
        }
        try {
            if (this.O && gLMapEngine.getStateMessageCount() > 0) {
                ac acVar = new ac();
                acVar.nowType = AbstractCameraUpdateMessage.Type.changeGeoCenterZoomTiltBearing;
                acVar.geoPoint = new DPoint(this.c.getSX(), this.c.getSY());
                acVar.zoom = this.c.getSZ();
                acVar.bearing = this.c.getSR();
                acVar.tilt = this.c.getSC();
                this.g.addMessage(abstractCameraUpdateMessage, false);
                while (this.g.getStateMessageCount() > 0) {
                    AbstractCameraUpdateMessage stateMessage = this.g.getStateMessage();
                    if (stateMessage != null) {
                        stateMessage.mergeCameraUpdateDelegate(acVar);
                    }
                }
                abstractCameraUpdateMessage = acVar;
            }
        } catch (Throwable th) {
            er.a(th);
        }
        resetRenderTime();
        this.g.clearAnimations(1, false);
        abstractCameraUpdateMessage.isChangeFinished = true;
        a(abstractCameraUpdateMessage);
        this.g.addMessage(abstractCameraUpdateMessage, false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setInfoWindowAdapter(AMap.CommonInfoWindowAdapter commonInfoWindowAdapter) throws RemoteException {
        ap apVar;
        if (this.M || (apVar = this.z) == null) {
            return;
        }
        apVar.a(commonInfoWindowAdapter);
    }

    public static abstract class a implements Runnable {
        public boolean b;
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public byte[] j;

        private a() {
            this.b = false;
            this.c = false;
            this.h = 0;
            this.i = 0;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b = false;
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    private boolean a(int i, int i2) {
        AbstractCameraUpdateMessage abstractCameraUpdateMessageA;
        if (!this.aD || ((int) c()) >= this.c.getMaxZoomLevel()) {
            return false;
        }
        try {
            if (!this.P && !this.D.isZoomInByScreenCenter()) {
                Point point = this.m;
                point.x = i;
                point.y = i2;
                abstractCameraUpdateMessageA = af.a(1.0f, point);
            } else {
                abstractCameraUpdateMessageA = af.a(1.0f, (Point) null);
            }
            animateCamera(abstractCameraUpdateMessageA);
        } catch (Throwable th) {
            hn.c(th, "AMapDelegateImp", "onDoubleTap");
            th.printStackTrace();
        }
        resetRenderTime();
        return true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void clear(boolean z) throws RemoteException {
        z zVar;
        try {
            hideInfoWindow();
            String strD = null;
            String strE = "";
            ct ctVar = this.R;
            if (ctVar != null) {
                if (z) {
                    strD = ctVar.d();
                    strE = this.R.e();
                } else {
                    ctVar.f();
                }
            }
            this.J.clear(strD, strE);
            if (this.j && (zVar = this.H) != null) {
                zVar.c();
            }
            u uVar = this.b;
            if (uVar != null) {
                uVar.a(strD);
            }
            this.N.b();
            av avVar = this.aO;
            if (avVar != null) {
                avVar.c();
            }
            queueEvent(new Runnable() { // from class: com.amap.api.mapcore.util.b.19
                @Override // java.lang.Runnable
                public final void run() {
                    b bVar = b.this;
                    if (bVar.g == null || bVar.M) {
                        return;
                    }
                    b bVar2 = b.this;
                    bVar2.g.removeNativeAllOverlay(bVar2.L);
                }
            });
            resetRenderTime();
        } catch (Throwable th) {
            hn.c(th, "AMapDelegateImp", "clear");
            er.a(th);
            th.printStackTrace();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showInfoWindow(BaseOverlay baseOverlay) throws RemoteException {
        ap apVar;
        if (baseOverlay == null || (apVar = this.z) == null) {
            return;
        }
        try {
            apVar.a(baseOverlay);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    private boolean d(MotionEvent motionEvent) throws RemoteException {
        try {
            List listA = this.x.a(AMap.OnInfoWindowClickListener.class.hashCode());
            if (this.j) {
                ap apVar = this.z;
                if (apVar != null) {
                    IInfoWindowAction iInfoWindowActionC = apVar.c();
                    if (iInfoWindowActionC != null ? iInfoWindowActionC.onInfoWindowTap(motionEvent) : false) {
                        if (listA != null && listA.size() > 0) {
                            BaseOverlayImp baseOverlayImpC = this.b.c();
                            if (!baseOverlayImpC.isVisible() && baseOverlayImpC.isInfoWindowEnable()) {
                                return true;
                            }
                            Marker marker = new Marker((cs) baseOverlayImpC);
                            synchronized (listA) {
                                for (int i = 0; i < listA.size(); i++) {
                                    ((AMap.OnInfoWindowClickListener) listA.get(i)).onInfoWindowClick(marker);
                                }
                            }
                        }
                        return true;
                    }
                }
            } else {
                BaseOverlay baseOverlayA = this.z.a(motionEvent);
                if (baseOverlayA != null && (baseOverlayA instanceof Marker)) {
                    synchronized (listA) {
                        for (int i2 = 0; i2 < listA.size(); i2++) {
                            ((AMap.OnInfoWindowClickListener) listA.get(i2)).onInfoWindowClick((Marker) baseOverlayA);
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private float c() {
        if (this.c != null) {
            return getMapConfig().getSZ();
        }
        return 0.0f;
    }

    private boolean b(MotionEvent motionEvent) {
        try {
            List listA = this.x.a(AMap.OnPolylineClickListener.class.hashCode());
            if (listA != null && listA.size() > 0) {
                DPoint dPointObtain = DPoint.obtain();
                getPixel2LatLng((int) motionEvent.getX(), (int) motionEvent.getY(), dPointObtain);
                LatLng latLng = new LatLng(dPointObtain.y, dPointObtain.x);
                dPointObtain.recycle();
                Polyline hitOverlay = this.J.getHitOverlay(latLng);
                if (hitOverlay != null) {
                    synchronized (listA) {
                        Iterator it2 = listA.iterator();
                        while (it2.hasNext()) {
                            ((AMap.OnPolylineClickListener) it2.next()).onPolylineClick(hitOverlay);
                        }
                    }
                    return false;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private boolean c(MotionEvent motionEvent) throws RemoteException {
        LatLng position;
        LatLng realPosition;
        boolean z = true;
        if (this.j) {
            if (this.b.b(motionEvent)) {
                BaseOverlayImp baseOverlayImpC = this.b.c();
                if (baseOverlayImpC == null) {
                    return true;
                }
                try {
                    Marker marker = new Marker((cs) baseOverlayImpC);
                    this.b.a((IMarkerDelegate) baseOverlayImpC);
                    List listA = this.x.a(AMap.OnMarkerClickListener.class.hashCode());
                    if (listA != null && listA.size() > 0) {
                        synchronized (listA) {
                            if (listA.size() == 1) {
                                boolean zOnMarkerClick = ((AMap.OnMarkerClickListener) listA.get(0)).onMarkerClick(marker);
                                if (!zOnMarkerClick && this.b.f() > 0) {
                                    z = zOnMarkerClick;
                                }
                                return true;
                            }
                            Iterator it2 = listA.iterator();
                            boolean zOnMarkerClick2 = false;
                            while (it2.hasNext()) {
                                zOnMarkerClick2 |= ((AMap.OnMarkerClickListener) it2.next()).onMarkerClick(marker);
                            }
                            if (!zOnMarkerClick2 && this.b.f() > 0) {
                                z = zOnMarkerClick2;
                            }
                            return true;
                        }
                    }
                    showInfoWindow((cs) baseOverlayImpC);
                    if (!baseOverlayImpC.isViewMode() && (realPosition = baseOverlayImpC.getRealPosition()) != null) {
                        IPoint iPointObtain = IPoint.obtain();
                        latlon2Geo(realPosition.latitude, realPosition.longitude, iPointObtain);
                        moveCamera(af.a(iPointObtain));
                    }
                    return z;
                } catch (Throwable th) {
                    hn.c(th, "AMapDelegateImp", "onMarkerTap");
                    th.printStackTrace();
                }
            }
            return false;
        }
        DPoint dPointObtain = DPoint.obtain();
        getPixel2LatLng((int) motionEvent.getX(), (int) motionEvent.getY(), dPointObtain);
        LatLng latLng = new LatLng(dPointObtain.y, dPointObtain.x);
        dPointObtain.recycle();
        BaseOverlay hitBaseOverlay = this.J.getHitBaseOverlay(latLng);
        if ((hitBaseOverlay instanceof Marker) && ((Marker) hitBaseOverlay).getId().contains("MARKER")) {
            try {
                Marker marker2 = (Marker) hitBaseOverlay;
                this.J.set2Top(marker2.getId());
                List listA2 = this.x.a(AMap.OnMarkerClickListener.class.hashCode());
                if (listA2 != null && listA2.size() > 0) {
                    synchronized (listA2) {
                        if (listA2.size() == 1) {
                            boolean zOnMarkerClick3 = ((AMap.OnMarkerClickListener) listA2.get(0)).onMarkerClick(marker2);
                            if (zOnMarkerClick3) {
                                return true;
                            }
                            z = zOnMarkerClick3;
                        } else {
                            Iterator it3 = listA2.iterator();
                            boolean zOnMarkerClick4 = false;
                            while (it3.hasNext()) {
                                zOnMarkerClick4 |= ((AMap.OnMarkerClickListener) it3.next()).onMarkerClick(marker2);
                            }
                            if (zOnMarkerClick4) {
                                return true;
                            }
                            z = zOnMarkerClick4;
                        }
                    }
                }
                this.J.showInfoWindow(marker2.getId());
                if (!marker2.isViewMode() && (position = marker2.getPosition()) != null) {
                    IPoint iPointObtain2 = IPoint.obtain();
                    latlon2Geo(position.latitude, position.longitude, iPointObtain2);
                    moveCamera(af.a(iPointObtain2));
                }
                return z;
            } catch (Throwable th2) {
                hn.c(th2, "AMapDelegateImp", "onMarkerTap");
                th2.printStackTrace();
            }
        }
        return false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setCustomMapStyle(boolean z, byte[] bArr) {
        a(z, bArr, false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapCustomEnable(boolean z) {
        if (z) {
            h();
        }
        setMapCustomEnable(z, false);
    }

    private void a(MotionEvent motionEvent) throws RemoteException {
        int i = 0;
        if (this.j) {
            if (!this.T || this.U == null || this.V == null) {
                return;
            }
            int x = (int) motionEvent.getX();
            int y = (int) (motionEvent.getY() - 60.0f);
            LatLng realPosition = this.V.getRealPosition();
            if (realPosition != null) {
                LatLng position = this.V.getPosition();
                DPoint dPointObtain = DPoint.obtain();
                getPixel2LatLng(x, y, dPointObtain);
                LatLng latLng = new LatLng((position.latitude + dPointObtain.y) - realPosition.latitude, (position.longitude + dPointObtain.x) - realPosition.longitude);
                dPointObtain.recycle();
                this.U.setPosition(latLng);
                try {
                    List listA = this.x.a(AMap.OnMarkerDragListener.class.hashCode());
                    if (listA == null || listA.size() <= 0) {
                        return;
                    }
                    synchronized (listA) {
                        while (i < listA.size()) {
                            try {
                                ((AMap.OnMarkerDragListener) listA.get(i)).onMarkerDrag(this.U);
                                i++;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            return;
        }
        if (!this.T || this.W == null) {
            return;
        }
        int x2 = (int) motionEvent.getX();
        int y2 = (int) (motionEvent.getY() - 60.0f);
        if (this.W.getPosition() != null) {
            DPoint dPointObtain2 = DPoint.obtain();
            getPixel2LatLng(x2, y2, dPointObtain2);
            LatLng latLng2 = new LatLng(dPointObtain2.y, dPointObtain2.x);
            dPointObtain2.recycle();
            this.W.setPosition(latLng2);
            try {
                List listA2 = this.x.a(AMap.OnMarkerDragListener.class.hashCode());
                if (listA2 == null || listA2.size() <= 0) {
                    return;
                }
                synchronized (listA2) {
                    while (i < listA2.size()) {
                        try {
                            ((AMap.OnMarkerDragListener) listA2.get(i)).onMarkerDrag(this.W);
                            i++;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public final void b() {
        this.l.obtainMessage(17, 1, 0).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Poi b(int i, int i2) {
        ArrayList arrayList;
        if (!this.aD) {
            return null;
        }
        try {
            if (this.aD) {
                arrayList = new ArrayList();
                byte[] labelBuffer = this.g.getLabelBuffer(1, i, i2, 25);
                if (labelBuffer == null) {
                    arrayList = null;
                } else {
                    int i3 = GLConvertUtil.getInt(labelBuffer, 0) > 0 ? 1 : 0;
                    int i4 = 4;
                    int i5 = 0;
                    while (i5 < i3) {
                        MapLabelItem mapLabelItem = new MapLabelItem();
                        int i6 = GLConvertUtil.getInt(labelBuffer, i4);
                        int i7 = i4 + 4;
                        int i8 = GLConvertUtil.getInt(labelBuffer, i7);
                        int i9 = i7 + 4;
                        mapLabelItem.x = i6;
                        mapLabelItem.y = this.F.getHeight() - i8;
                        mapLabelItem.pixel20X = GLConvertUtil.getInt(labelBuffer, i9);
                        int i10 = i9 + 4;
                        mapLabelItem.pixel20Y = GLConvertUtil.getInt(labelBuffer, i10);
                        int i11 = i10 + 4;
                        mapLabelItem.pixel20Z = GLConvertUtil.getInt(labelBuffer, i11);
                        int i12 = i11 + 4;
                        mapLabelItem.type = GLConvertUtil.getInt(labelBuffer, i12);
                        int i13 = i12 + 4;
                        mapLabelItem.mSublayerId = GLConvertUtil.getInt(labelBuffer, i13);
                        int i14 = i13 + 4;
                        mapLabelItem.timeStamp = GLConvertUtil.getInt(labelBuffer, i14);
                        int i15 = i14 + 4;
                        mapLabelItem.mIsFouces = labelBuffer[i15] != 0;
                        int i16 = i15 + 1;
                        if (labelBuffer[i16] == 0) {
                            mapLabelItem.poiid = null;
                        } else {
                            String str = "";
                            for (int i17 = 0; i17 < 20; i17++) {
                                int i18 = i17 + i16;
                                if (labelBuffer[i18] == 0) {
                                    break;
                                }
                                str = str + ((char) labelBuffer[i18]);
                            }
                            mapLabelItem.poiid = str;
                        }
                        int i19 = i16 + 20;
                        int i20 = i19 + 1;
                        byte b = labelBuffer[i19];
                        StringBuffer stringBuffer = new StringBuffer();
                        for (int i21 = 0; i21 < b; i21++) {
                            stringBuffer.append((char) GLConvertUtil.getShort(labelBuffer, i20));
                            i20 += 2;
                        }
                        mapLabelItem.name = stringBuffer.toString();
                        arrayList.add(mapLabelItem);
                        i5++;
                        i4 = i20;
                    }
                }
            } else {
                arrayList = null;
            }
            MapLabelItem mapLabelItem2 = (arrayList == null || arrayList.size() <= 0) ? null : (MapLabelItem) arrayList.get(0);
            if (mapLabelItem2 != null) {
                DPoint dPointPixelsToLatLong = VirtualEarthProjection.pixelsToLatLong(mapLabelItem2.pixel20X, mapLabelItem2.pixel20Y, 20);
                Poi poi = new Poi(mapLabelItem2.name, new LatLng(dPointPixelsToLatLong.y, dPointPixelsToLatLong.x, false), mapLabelItem2.poiid);
                dPointPixelsToLatLong.recycle();
                return poi;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private void d(final int i) {
        queueEvent(new Runnable() { // from class: com.amap.api.mapcore.util.b.14
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    b.this.g.clearAllMessages(i);
                    b.this.g.clearAnimations(i, true);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    private void a(GLMapState gLMapState, int i, int i2, DPoint dPoint) {
        if (!this.aD || this.g == null) {
            return;
        }
        Point point = new Point();
        gLMapState.screenToP20Point(i, i2, point);
        DPoint dPointPixelsToLatLong = VirtualEarthProjection.pixelsToLatLong(point.x, point.y, 20);
        dPoint.x = dPointPixelsToLatLong.x;
        dPoint.y = dPointPixelsToLatLong.y;
        dPointPixelsToLatLong.recycle();
    }

    private void b(int i) {
        GLMapRender gLMapRender = this.au;
        if (gLMapRender != null) {
            gLMapRender.renderPause();
        }
        d(i);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void createSurface(GL10 gl10, EGLConfig eGLConfig) {
        try {
            this.at = Thread.currentThread().getId();
        } catch (Throwable th) {
            th.printStackTrace();
            er.a(th);
        }
        try {
            createSurface(1, gl10, eGLConfig);
        } catch (Throwable th2) {
            th2.printStackTrace();
            er.a(th2);
        }
    }

    private void a(int i, int i2, FPoint fPoint) {
        GLMapEngine gLMapEngine;
        GLMapState mapState;
        if (!this.aD || (gLMapEngine = this.g) == null || (mapState = gLMapEngine.getMapState(1)) == null) {
            return;
        }
        mapState.p20ToScreenPoint(i, i2, fPoint);
    }

    public final void b(final int i, final boolean z) {
        if (this.aD && this.aE) {
            resetRenderTime();
            queueEvent(new Runnable() { // from class: com.amap.api.mapcore.util.b.16
                @Override // java.lang.Runnable
                public final void run() {
                    GLMapEngine gLMapEngine = b.this.g;
                    if (gLMapEngine != null) {
                        if (z) {
                            gLMapEngine.setAllContentEnable(i, true);
                        } else {
                            gLMapEngine.setAllContentEnable(i, false);
                        }
                        b.this.g.setSimple3DEnable(i, false);
                    }
                }
            });
        } else {
            a aVar = this.bc;
            aVar.c = z;
            aVar.b = true;
            aVar.g = i;
        }
    }

    private void a(final int i) {
        queueEvent(new Runnable() { // from class: com.amap.api.mapcore.util.b.12
            @Override // java.lang.Runnable
            public final void run() {
                GLMapEngine gLMapEngine;
                if (!b.this.aD || (gLMapEngine = b.this.g) == null) {
                    return;
                }
                gLMapEngine.setHighlightSubwayEnable(i, false);
            }
        });
    }

    public final synchronized void a(int i, int i2, int i3, int i4) {
        a(i, i2, i3, i4, false, false, null);
    }

    private synchronized void a(final int i, final int i2, final int i3, final int i4, final boolean z, final boolean z2, final StyleItem[] styleItemArr) {
        if (this.aE && this.aD && this.a) {
            fj fjVar = this.G;
            if (fjVar != null) {
                if (i3 == 0) {
                    if (fjVar.b()) {
                        this.G.g(Boolean.FALSE);
                        this.G.c();
                    }
                } else if (!fjVar.b()) {
                    this.G.g(Boolean.TRUE);
                    this.G.c();
                }
            }
            queueEvent(new Runnable() { // from class: com.amap.api.mapcore.util.b.13
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        b.this.g.setMapModeAndStyle(i, i2, i3, i4, z, z2, styleItemArr);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
            return;
        }
        a aVar = this.aU;
        aVar.g = i;
        aVar.d = i2;
        aVar.e = i3;
        aVar.f = i4;
        aVar.b = true;
    }

    private void c(int i) {
        d(i);
        GLMapRender gLMapRender = this.au;
        if (gLMapRender != null) {
            gLMapRender.renderResume();
        }
    }

    public final void c(final int i, final boolean z) {
        if (this.aD && this.aE) {
            resetRenderTime();
            queueEvent(new Runnable() { // from class: com.amap.api.mapcore.util.b.17
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (z) {
                            b.this.g.setBuildingTextureEnable(i, true);
                        } else {
                            b.this.g.setBuildingTextureEnable(i, false);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        } else {
            a aVar = this.bf;
            aVar.c = z;
            aVar.b = true;
            aVar.g = i;
        }
    }

    public final void a(final int i, final boolean z) {
        if (this.aD && this.aE) {
            resetRenderTime();
            queueEvent(new Runnable() { // from class: com.amap.api.mapcore.util.b.15
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        b.this.g.setBuildingEnable(i, z);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        } else {
            a aVar = this.aW;
            aVar.c = z;
            aVar.b = true;
            aVar.g = i;
        }
    }

    private void a(AbstractCameraUpdateMessage abstractCameraUpdateMessage) {
        boolean z = this.P;
        abstractCameraUpdateMessage.isUseAnchor = z;
        if (z) {
            abstractCameraUpdateMessage.anchorX = this.c.getAnchorX();
            abstractCameraUpdateMessage.anchorY = this.c.getAnchorY();
        }
        if (abstractCameraUpdateMessage.width == 0) {
            abstractCameraUpdateMessage.width = getMapWidth();
        }
        if (abstractCameraUpdateMessage.height == 0) {
            abstractCameraUpdateMessage.height = getMapHeight();
        }
        abstractCameraUpdateMessage.mapConfig = this.c;
    }

    public final void a(CameraPosition cameraPosition) {
        MapConfig mapConfig = this.c;
        if (mapConfig == null || mapConfig.getChangedCounter() == 0) {
            return;
        }
        try {
            if (!this.aB && this.g.getAnimateionsCount() == 0 && this.g.getStateMessageCount() == 0) {
                AMapGestureListener aMapGestureListener = this.y;
                if (aMapGestureListener != null) {
                    aMapGestureListener.onMapStable();
                }
                if (this.F.isEnabled()) {
                    try {
                        List listA = this.x.a(AMap.OnCameraChangeListener.class.hashCode());
                        if (listA != null && listA.size() != 0) {
                            if (cameraPosition == null) {
                                try {
                                    cameraPosition = getCameraPosition();
                                } catch (Throwable th) {
                                    hn.c(th, "AMapDelegateImp", "cameraChangeFinish");
                                    th.printStackTrace();
                                }
                            }
                            synchronized (listA) {
                                Iterator it2 = listA.iterator();
                                while (it2.hasNext()) {
                                    ((AMap.OnCameraChangeListener) it2.next()).onCameraChangeFinish(cameraPosition);
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    this.c.resetChangedCounter();
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
            er.a(th2);
        }
    }

    @Override // com.amap.api.mapcore.util.a.InterfaceC0102a
    public final void a() {
        jv jvVar = this.bg;
        if (jvVar != null) {
            jvVar.i();
        }
    }

    private void a(boolean z, byte[] bArr, boolean z2) {
        dp dpVarA;
        try {
            this.c.setCustomStyleEnable(z);
            boolean z3 = false;
            if (this.c.isHideLogoEnable()) {
                this.D.setLogoEnable(!z);
            }
            if (z) {
                c(1, true);
                Cdo cdo = new Cdo();
                MyTrafficStyle myTrafficStyle = this.af;
                if (myTrafficStyle != null && myTrafficStyle.getTrafficRoadBackgroundColor() != -1) {
                    cdo.a(this.af.getTrafficRoadBackgroundColor());
                }
                if (this.c.isProFunctionAuthEnable() && !TextUtils.isEmpty(this.c.getCustomTextureResourcePath())) {
                    z3 = true;
                }
                StyleItem[] styleItemArrC = null;
                if (bArr != null) {
                    dpVarA = cdo.a(bArr, z3);
                    if (dpVarA != null && (styleItemArrC = dpVarA.c()) != null) {
                        this.c.setUseProFunction(true);
                    }
                } else {
                    dpVarA = null;
                }
                if (styleItemArrC == null && (dpVarA = cdo.a(this.c.getCustomStylePath(), z3)) != null) {
                    styleItemArrC = dpVarA.c();
                }
                if (cdo.a() != 0) {
                    this.c.setCustomBackgroundColor(cdo.a());
                }
                if (dpVarA != null && dpVarA.d() != null) {
                    if (this.as != null) {
                        this.as.a((String) dpVarA.d());
                        this.as.a(dpVarA);
                        eq.a().a(this.as);
                        return;
                    }
                    return;
                }
                a(styleItemArrC, z2);
                return;
            }
            c(1, false);
            a(1, this.c.getMapStyleMode(), this.c.getMapStyleTime(), this.c.getMapStyleState(), true, false, null);
        } catch (Throwable th) {
            er.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void changeSurface(GL10 gl10, int i, int i2) {
        try {
            changeSurface(1, gl10, i, i2);
        } catch (Throwable th) {
            th.printStackTrace();
            er.a(th);
        }
    }

    @Override // com.amap.api.mapcore.util.dj.a
    public final void a(String str, dp dpVar) {
        setCustomTextureResourcePath(str);
        if (!this.c.isCustomStyleEnable() || dpVar == null) {
            return;
        }
        a(dpVar.c(), false);
    }

    private void a(StyleItem[] styleItemArr, boolean z) {
        if (z || (styleItemArr != null && styleItemArr.length > 0)) {
            a(1, 0, 0, 0, true, true, styleItemArr);
            ep.a(this.f, true);
        } else {
            ep.a(this.f, false);
        }
    }

    private boolean a(boolean z, boolean z2) {
        if (z) {
            if (this.bk) {
                dt.a("setCustomMapStyle 和 setWorldVectorMapStyle 不能同时使用，setCustomMapStyle将不会生效");
                return true;
            }
            this.bj = true;
        }
        if (!z2) {
            return false;
        }
        if (this.bj) {
            dt.a("setCustomMapStyle 和 setWorldVectorMapStyle 不能同时使用，setWorldVectorMapStyle将不会生效");
            return true;
        }
        this.bk = true;
        return false;
    }

    public static /* synthetic */ void a(b bVar, final MotionEvent motionEvent) {
        bVar.l.post(new Runnable() { // from class: com.amap.api.mapcore.util.b.9
            @Override // java.lang.Runnable
            public final void run() {
                Message messageObtain = Message.obtain();
                messageObtain.what = 19;
                messageObtain.arg1 = (int) motionEvent.getX();
                messageObtain.arg2 = (int) motionEvent.getY();
                b.this.l.sendMessage(messageObtain);
            }
        });
    }
}
