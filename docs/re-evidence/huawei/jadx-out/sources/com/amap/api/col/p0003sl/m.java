package com.amap.api.col.p0003sl;

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
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.amap.api.maps.AMap;
import com.amap.api.maps.AMapException;
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
import com.amap.api.maps.model.BuildingOverlay;
import com.amap.api.maps.model.CameraPosition;
import com.amap.api.maps.model.Circle;
import com.amap.api.maps.model.CircleOptions;
import com.amap.api.maps.model.CrossOverlay;
import com.amap.api.maps.model.CrossOverlayOptions;
import com.amap.api.maps.model.CustomMapStyleOptions;
import com.amap.api.maps.model.GL3DModel;
import com.amap.api.maps.model.GL3DModelOptions;
import com.amap.api.maps.model.GLTFOverlay;
import com.amap.api.maps.model.GLTFOverlayOptions;
import com.amap.api.maps.model.GroundOverlay;
import com.amap.api.maps.model.GroundOverlayOptions;
import com.amap.api.maps.model.HeatMapGridLayer;
import com.amap.api.maps.model.HeatMapGridLayerOptions;
import com.amap.api.maps.model.HeatMapLayer;
import com.amap.api.maps.model.HeatMapLayerOptions;
import com.amap.api.maps.model.HeatmapTileProvider;
import com.amap.api.maps.model.IndoorBuildingInfo;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.MVTTileOverlay;
import com.amap.api.maps.model.MVTTileOverlayOptions;
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
import com.amap.api.maps.model.PoiFilter;
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
import com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlay;
import com.amap.api.maps.model.amap3dmodeltile.AMap3DModelTileOverlayOptions;
import com.amap.api.maps.model.particle.ParticleOverlay;
import com.amap.api.maps.model.particle.ParticleOverlayOptions;
import com.autonavi.amap.api.mapcore.IGLMapState;
import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.MapProjection;
import com.autonavi.amap.mapcore.VirtualEarthProjection;
import com.autonavi.base.ae.gmap.AMapAppRequestParam;
import com.autonavi.base.ae.gmap.GLMapEngine;
import com.autonavi.base.ae.gmap.GLMapRender;
import com.autonavi.base.ae.gmap.GLMapState;
import com.autonavi.base.ae.gmap.MapPoi;
import com.autonavi.base.ae.gmap.bean.NativeTextGenerate;
import com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo;
import com.autonavi.base.ae.gmap.gloverlay.BaseMapOverlay;
import com.autonavi.base.ae.gmap.gloverlay.CrossVectorOverlay;
import com.autonavi.base.ae.gmap.gloverlay.GLOverlayBundle;
import com.autonavi.base.ae.gmap.gloverlay.GLTextureProperty;
import com.autonavi.base.ae.gmap.gloverlay.RouteOverlayInner;
import com.autonavi.base.ae.gmap.listener.AMapWidgetListener;
import com.autonavi.base.ae.gmap.style.StyleItem;
import com.autonavi.base.amap.api.mapcore.BaseOverlayImp;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.api.mapcore.IGLSurfaceView;
import com.autonavi.base.amap.api.mapcore.IProjectionDelegate;
import com.autonavi.base.amap.api.mapcore.IUiSettingsDelegate;
import com.autonavi.base.amap.mapcore.AeUtil;
import com.autonavi.base.amap.mapcore.FPoint;
import com.autonavi.base.amap.mapcore.FileUtil;
import com.autonavi.base.amap.mapcore.MapConfig;
import com.autonavi.base.amap.mapcore.Rectangle;
import com.autonavi.base.amap.mapcore.interfaces.IAMapListener;
import com.autonavi.base.amap.mapcore.message.AbstractGestureMapMessage;
import com.autonavi.base.amap.mapcore.tools.GLConvertUtil;
import com.huawei.appgallery.marketinstallerservice.api.Constant;
import com.huawei.hms.network.embedded.w9;
import com.huawei.openalliance.ad.constant.Constants;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements cy.a, l.a, IAMapDelegate, IAMapListener {
    private boolean A;
    private final IGLSurfaceView B;
    private en C;
    private ae D;
    private final IGlOverlayLayer E;
    private boolean F;
    private int G;
    private AtomicBoolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private cp L;
    private LocationSource M;
    private boolean N;
    private boolean O;
    private Marker P;
    private GLTFOverlay Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private int V;
    private boolean W;
    private boolean X;
    private Rect Y;
    private int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f3091a;
    private volatile boolean aA;
    private volatile boolean aB;
    private boolean aC;
    private boolean aD;
    private Lock aE;
    private int aF;
    private int aG;
    private int aH;
    private b aI;
    private cu aJ;
    private AMap.OnMultiPointClickListener aK;
    private l aL;
    private long aM;
    private boolean aN;
    private boolean aO;
    private a aP;
    private a aQ;
    private a aR;
    private a aS;
    private a aT;
    private a aU;
    private a aV;
    private a aW;
    private a aX;
    private a aY;
    private a aZ;
    private MyTrafficStyle aa;
    private Thread ab;
    private Thread ac;
    private x ad;
    private s ae;
    private boolean af;
    private boolean ag;
    private int ah;
    private CustomRenderer ai;
    private int aj;
    private int ak;
    private boolean al;
    private List<ag> am;
    private cw an;
    private cy ao;
    private long ap;
    private float aq;
    private GLMapRender ar;
    private ab as;
    private boolean at;
    private float au;
    private float av;
    private float aw;
    private boolean ax;
    private boolean ay;
    private boolean az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected MapConfig f3092b;
    private a ba;
    private a bb;
    private Runnable bc;
    private a bd;
    private com.autonavi.extra.b be;
    private String bf;
    private String bg;
    private boolean bh;
    private boolean bi;
    private int bj;
    private EAMapPlatformGestureInfo bk;
    private long bl;
    private ay bm;
    private IPoint[] bn;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ay f3093c;
    ds d;
    protected Context e;
    protected GLMapEngine f;
    public int g;
    public int h;
    boolean i;
    protected final Handler j;
    Point k;
    protected String l;
    float[] m;
    float[] n;
    float[] o;
    float[] p;
    String q;
    String r;
    int s;
    private q t;
    private r u;
    private AMapGestureListener v;
    private az w;
    private UiSettings x;
    private IProjectionDelegate y;
    private final ak z;

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final AMapCameraInfo getCamerInfo() {
        return null;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final InfoWindowAnimationManager getInfoWindowAnimationManager() {
        return null;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean isLockMapCameraDegree(int i) {
        return false;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void reloadMap() {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMaskLayerParams(int i, int i2, int i3, int i4, int i5, long j) {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setZOrderOnTop(boolean z) throws RemoteException {
    }

    static /* synthetic */ boolean b(m mVar, CameraPosition cameraPosition) {
        return mVar.a(cameraPosition, false);
    }

    static /* synthetic */ boolean h(m mVar) {
        mVar.az = false;
        return false;
    }

    static /* synthetic */ boolean k(m mVar) {
        mVar.U = false;
        return false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setMapWidgetListener(AMapWidgetListener aMapWidgetListener) {
        try {
            r rVar = this.u;
            if (rVar != null) {
                rVar.a(AMapWidgetListener.class.hashCode(), aMapWidgetListener);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CameraPosition cameraPosition) {
        if (this.f3092b.getMapLanguage().equals("en")) {
            boolean zA = a(cameraPosition, true);
            if (zA != this.X) {
                this.X = zA;
                b(this.G, zA);
                return;
            }
            return;
        }
        if (this.X) {
            return;
        }
        this.X = true;
        b(this.G, true);
    }

    private boolean c() {
        try {
            GLMapState mapState = this.f.getMapState(this.G);
            IPoint[] iPointArr = new IPoint[4];
            if (mapState != null) {
                IPoint iPointObtain = IPoint.obtain();
                mapState.screenToP20Point(0, 0, iPointObtain);
                iPointArr[0] = iPointObtain;
                IPoint iPointObtain2 = IPoint.obtain();
                mapState.screenToP20Point(this.f3092b.getMapWidth(), 0, iPointObtain2);
                iPointArr[1] = iPointObtain2;
                IPoint iPointObtain3 = IPoint.obtain();
                mapState.screenToP20Point(this.f3092b.getMapWidth(), this.f3092b.getMapHeight(), iPointObtain3);
                iPointArr[2] = iPointObtain3;
                IPoint iPointObtain4 = IPoint.obtain();
                mapState.screenToP20Point(0, this.f3092b.getMapHeight(), iPointObtain4);
                iPointArr[3] = iPointObtain4;
                return !du.a(iPointArr);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            eb.a(th);
        }
        return false;
    }

    private boolean a(CameraPosition cameraPosition, boolean z) {
        if (z && cameraPosition.zoom < 6.0f) {
            return false;
        }
        if (cameraPosition.isAbroad) {
            return true;
        }
        if (this.f3092b != null) {
            return c();
        }
        return false;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setVisibilityEx(int i) {
        IGLSurfaceView iGLSurfaceView = this.B;
        if (iGLSurfaceView != null) {
            try {
                iGLSurfaceView.setVisibility(i);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void onActivityPause() {
        this.I = true;
        c(this.G);
        GLMapEngine gLMapEngine = this.f;
        if (gLMapEngine != null) {
            gLMapEngine.setRenderFlags(false);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void onActivityResume() {
        GLMapEngine gLMapEngine;
        this.I = false;
        d(this.G);
        if (!this.aA || (gLMapEngine = this.f) == null) {
            return;
        }
        gLMapEngine.setRenderFlags(true);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void queueEvent(Runnable runnable) {
        long id;
        try {
            try {
                id = Thread.currentThread().getId();
            } catch (Throwable th) {
                eb.a(th);
                jv.c(th, "AMapdelegateImp", "queueEvent");
                id = -1;
            }
            if (id != -1 && id == this.ap) {
                runnable.run();
            } else if (this.f != null) {
                this.B.queueEvent(runnable);
            }
        } catch (Throwable th2) {
            eb.a(th2);
            jv.c(th2, "AMapdelegateImp", "queueEvent");
        }
    }

    static abstract class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f3171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f3172c;
        int d;
        int e;
        int f;
        int g;
        int h;
        byte[] i;
        MyTrafficStyle j;

        private a() {
            this.f3171b = false;
            this.f3172c = false;
            this.g = 0;
            this.h = 0;
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3171b = false;
        }
    }

    public m(IGLSurfaceView iGLSurfaceView, Context context) {
        this(iGLSurfaceView, context, false);
    }

    public m(IGLSurfaceView iGLSurfaceView, Context context, boolean z) {
        this.t = null;
        this.u = new r();
        byte b2 = 0;
        this.f3091a = false;
        this.A = false;
        this.F = false;
        this.H = new AtomicBoolean(false);
        this.I = false;
        this.f3092b = new MapConfig(true);
        this.J = false;
        this.K = false;
        this.N = false;
        this.O = false;
        this.P = null;
        this.Q = null;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = 0;
        this.W = true;
        this.X = true;
        this.Y = new Rect();
        this.Z = 1;
        this.aa = null;
        this.af = false;
        this.ag = false;
        this.ah = 0;
        this.aj = -1;
        this.ak = -1;
        this.al = false;
        this.am = new ArrayList();
        this.d = null;
        this.ap = -1L;
        this.aq = 0.0f;
        this.at = false;
        this.au = 0.0f;
        this.av = 1.0f;
        this.aw = 1.0f;
        this.ax = true;
        this.ay = false;
        this.az = false;
        this.aA = false;
        this.aB = false;
        this.aC = false;
        this.aD = false;
        this.aE = new ReentrantLock();
        this.aF = 0;
        this.i = true;
        this.aN = false;
        this.aO = false;
        this.j = new Handler(Looper.getMainLooper()) { // from class: com.amap.api.col.3sl.m.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                eq eqVarF;
                if (message == null || m.this.H.get()) {
                    return;
                }
                try {
                    int i = message.what;
                    if (i == 2) {
                        StringBuilder sb = new StringBuilder("Key验证失败：[");
                        if (message.obj != null) {
                            sb.append(message.obj);
                        } else {
                            sb.append(im.f2769b);
                        }
                        sb.append("]");
                        Log.w("amapsdk", sb.toString());
                        return;
                    }
                    if (i == 30) {
                        if (m.this.f != null) {
                            m.this.f.triggerMainThread();
                            return;
                        }
                        return;
                    }
                    if (i == 40) {
                        if (m.this.D != null) {
                            m.this.D.redrawOverlays();
                            return;
                        }
                        return;
                    }
                    int i2 = 0;
                    switch (i) {
                        case 10:
                            CameraPosition cameraPosition = (CameraPosition) message.obj;
                            try {
                                List listA = m.this.u.a(AMap.OnCameraChangeListener.class.hashCode());
                                if (cameraPosition != null && listA != null && listA.size() > 0) {
                                    synchronized (listA) {
                                        Iterator it = listA.iterator();
                                        while (it.hasNext()) {
                                            ((AMap.OnCameraChangeListener) it.next()).onCameraChange(cameraPosition);
                                        }
                                    }
                                }
                                break;
                            } catch (Throwable th) {
                                eb.a(th);
                            }
                            m.this.f3092b.addChangedCounter();
                            return;
                        case 11:
                            try {
                                CameraPosition cameraPosition2 = m.this.getCameraPosition();
                                if (cameraPosition2 != null && m.this.C != null) {
                                    m.this.C.a(cameraPosition2);
                                }
                                m.this.b(cameraPosition2);
                                if (MapsInitializer.isLoadWorldVectorMap()) {
                                    if (m.this.ae == null) {
                                        m mVar = m.this;
                                        mVar.ae = new s(mVar.e, m.this);
                                    }
                                    if (m.this.ae.a() == 0) {
                                        if (m.b(m.this, cameraPosition2)) {
                                            m.this.f.setLocationOversea(true);
                                            m.this.ae.a(0L);
                                        } else {
                                            m.this.f.setLocationOversea(false);
                                        }
                                    }
                                }
                                if (m.this.az) {
                                    m.h(m.this);
                                    if (m.this.E != null) {
                                        m.this.E.setFlingState(false);
                                    }
                                    m.this.b();
                                }
                                if (m.this.U) {
                                    m.this.redrawInfoWindow();
                                    m.k(m.this);
                                }
                                m.this.a(cameraPosition2);
                                return;
                            } catch (Throwable th2) {
                                jv.c(th2, "AMapDelegateImp", "CameraUpdateFinish");
                                eb.a(th2);
                                return;
                            }
                        case 12:
                            if (m.this.C != null) {
                                m.this.C.a(Float.valueOf(m.this.getZoomLevel()));
                                return;
                            }
                            return;
                        case 13:
                            if (m.this.C != null) {
                                m.this.C.h();
                                return;
                            }
                            return;
                        case 14:
                            try {
                                List listA2 = m.this.u.a(AMap.OnMapTouchListener.class.hashCode());
                                if (listA2 == null || listA2.size() <= 0) {
                                    return;
                                }
                                synchronized (listA2) {
                                    try {
                                        Iterator it2 = listA2.iterator();
                                        while (it2.hasNext()) {
                                            ((AMap.OnMapTouchListener) it2.next()).onTouch((MotionEvent) message.obj);
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                    break;
                                }
                                return;
                            } catch (Throwable th4) {
                                jv.c(th4, "AMapDelegateImp", "onTouchHandler");
                                th4.printStackTrace();
                                return;
                            }
                        case 15:
                            Bitmap bitmap = (Bitmap) message.obj;
                            int i3 = message.arg1;
                            if (bitmap == null || m.this.C == null) {
                                try {
                                    List listA3 = m.this.u.a(AMap.onMapPrintScreenListener.class.hashCode());
                                    ArrayList arrayList = listA3 != null ? new ArrayList(listA3) : null;
                                    List listA4 = m.this.u.a(AMap.OnMapScreenShotListener.class.hashCode());
                                    ArrayList arrayList2 = listA4 != null ? new ArrayList(listA4) : null;
                                    m.this.u.a(Integer.valueOf(AMap.onMapPrintScreenListener.class.hashCode()));
                                    m.this.u.a(Integer.valueOf(AMap.OnMapScreenShotListener.class.hashCode()));
                                    if (arrayList != null && arrayList.size() > 0) {
                                        synchronized (arrayList) {
                                            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                                ((AMap.onMapPrintScreenListener) arrayList.get(i4)).onMapPrint(null);
                                            }
                                            break;
                                        }
                                    }
                                    if (arrayList2 == null || arrayList2.size() <= 0) {
                                        return;
                                    }
                                    synchronized (arrayList2) {
                                        while (i2 < arrayList2.size()) {
                                            ((AMap.OnMapScreenShotListener) arrayList2.get(i2)).onMapScreenShot(null);
                                            ((AMap.OnMapScreenShotListener) arrayList2.get(i2)).onMapScreenShot(null, i3);
                                            i2++;
                                        }
                                        break;
                                    }
                                    return;
                                } catch (Throwable th5) {
                                    th5.printStackTrace();
                                    return;
                                }
                            }
                            Canvas canvas = new Canvas(bitmap);
                            if (m.this.W && (eqVarF = m.this.C.f()) != null) {
                                eqVarF.onDraw(canvas);
                            }
                            m.this.D.screenShotOverlays(canvas);
                            m.this.C.a(canvas);
                            try {
                                List listA5 = m.this.u.a(AMap.onMapPrintScreenListener.class.hashCode());
                                ArrayList arrayList3 = listA5 != null ? new ArrayList(listA5) : null;
                                List listA6 = m.this.u.a(AMap.OnMapScreenShotListener.class.hashCode());
                                ArrayList arrayList4 = listA6 != null ? new ArrayList(listA6) : null;
                                m.this.u.a(Integer.valueOf(AMap.onMapPrintScreenListener.class.hashCode()));
                                m.this.u.a(Integer.valueOf(AMap.OnMapScreenShotListener.class.hashCode()));
                                if (arrayList3 != null && arrayList3.size() > 0) {
                                    synchronized (arrayList3) {
                                        for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                                            ((AMap.onMapPrintScreenListener) arrayList3.get(i5)).onMapPrint(new BitmapDrawable(m.this.e.getResources(), bitmap));
                                            break;
                                        }
                                        break;
                                    }
                                }
                                if (arrayList4 == null || arrayList4.size() <= 0) {
                                    return;
                                }
                                synchronized (arrayList4) {
                                    while (i2 < arrayList4.size()) {
                                        ((AMap.OnMapScreenShotListener) arrayList4.get(i2)).onMapScreenShot(bitmap);
                                        ((AMap.OnMapScreenShotListener) arrayList4.get(i2)).onMapScreenShot(bitmap, i3);
                                        i2++;
                                        break;
                                    }
                                    break;
                                }
                                return;
                            } catch (Throwable th6) {
                                th6.printStackTrace();
                                return;
                            }
                        case 16:
                            try {
                                List listA7 = m.this.u.a(AMap.OnMapLoadedListener.class.hashCode());
                                if (listA7 != null) {
                                    synchronized (listA7) {
                                        while (i2 < listA7.size()) {
                                            try {
                                                ((AMap.OnMapLoadedListener) listA7.get(i2)).onMapLoaded();
                                                i2++;
                                            } catch (Throwable th7) {
                                                throw th7;
                                            }
                                        }
                                    }
                                }
                                break;
                            } catch (Throwable th8) {
                                jv.c(th8, "AMapDelegateImp", "onMapLoaded");
                                th8.printStackTrace();
                                eb.a(th8);
                            }
                            if (m.this.C != null) {
                                m.this.C.i();
                            }
                            if (m.this.D != null) {
                                m.this.D.updateOverlaysPosition();
                            }
                            m.this.redrawInfoWindow();
                            return;
                        case 17:
                            if (!m.this.f.isInMapAnimation(m.this.G) || m.this.E == null) {
                                return;
                            }
                            m.this.E.setFlingState(false);
                            return;
                        case 18:
                            if (m.this.w != null) {
                                m.this.w.b();
                                return;
                            }
                            return;
                        case 19:
                            List listA8 = m.this.u.a(AMap.OnMapClickListener.class.hashCode());
                            if (listA8 != null) {
                                DPoint dPointObtain = DPoint.obtain();
                                m.this.getPixel2LatLng(message.arg1, message.arg2, dPointObtain);
                                try {
                                    synchronized (listA8) {
                                        Iterator it3 = listA8.iterator();
                                        while (it3.hasNext()) {
                                            ((AMap.OnMapClickListener) it3.next()).onMapClick(new LatLng(dPointObtain.y, dPointObtain.x));
                                        }
                                        break;
                                    }
                                    dPointObtain.recycle();
                                    return;
                                } catch (Throwable th9) {
                                    jv.c(th9, "AMapDelegateImp", "OnMapClickListener.onMapClick");
                                    th9.printStackTrace();
                                    return;
                                }
                            }
                            return;
                        case 20:
                            try {
                                List listA9 = m.this.u.a(AMap.OnPOIClickListener.class.hashCode());
                                if (listA9 == null || listA9.size() <= 0) {
                                    return;
                                }
                                synchronized (listA9) {
                                    while (i2 < listA9.size()) {
                                        try {
                                            ((AMap.OnPOIClickListener) listA9.get(i2)).onPOIClick((Poi) message.obj);
                                            i2++;
                                        } catch (Throwable th10) {
                                            throw th10;
                                        }
                                        break;
                                    }
                                    break;
                                }
                                return;
                            } catch (Throwable th11) {
                                jv.c(th11, "AMapDelegateImp", "OnPOIClickListener.onPOIClick");
                                th11.printStackTrace();
                                return;
                            }
                        default:
                            return;
                    }
                    jv.c(th, "AMapDelegateImp", "handleMessage");
                    th.printStackTrace();
                } catch (Throwable th12) {
                    jv.c(th12, "AMapDelegateImp", "handleMessage");
                    th12.printStackTrace();
                }
            }
        };
        this.aP = new a() { // from class: com.amap.api.col.3sl.m.11
            @Override // com.amap.api.col.3sl.m.a, java.lang.Runnable
            public final void run() {
                super.run();
                try {
                    m.this.setTrafficEnabled(this.f3172c);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        this.aQ = new a() { // from class: com.amap.api.col.3sl.m.21
            @Override // com.amap.api.col.3sl.m.a, java.lang.Runnable
            public final void run() {
                super.run();
                try {
                    m mVar = m.this;
                    mVar.setCenterToPixel(mVar.aG, m.this.aH);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        this.aR = new a() { // from class: com.amap.api.col.3sl.m.32
            @Override // com.amap.api.col.3sl.m.a, java.lang.Runnable
            public final void run() {
                super.run();
                m.this.a(this.f, this.d, this.e);
            }
        };
        this.aS = new a() { // from class: com.amap.api.col.3sl.m.41
            @Override // com.amap.api.col.3sl.m.a, java.lang.Runnable
            public final void run() {
                super.run();
                m.this.setMapCustomEnable(this.f3172c);
            }
        };
        this.aT = new a() { // from class: com.amap.api.col.3sl.m.42
            @Override // com.amap.api.col.3sl.m.a, java.lang.Runnable
            public final void run() {
                super.run();
                m.this.a(this.f, this.f3172c);
            }
        };
        this.aU = new a() { // from class: com.amap.api.col.3sl.m.43
            @Override // com.amap.api.col.3sl.m.a, java.lang.Runnable
            public final void run() {
                super.run();
                try {
                    m.this.setMapTextEnable(this.f3172c);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        this.aV = new a() { // from class: com.amap.api.col.3sl.m.44
            @Override // com.amap.api.col.3sl.m.a, java.lang.Runnable
            public final void run() {
                super.run();
                try {
                    m.this.setRoadArrowEnable(this.f3172c);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        this.aW = new a() { // from class: com.amap.api.col.3sl.m.45
            @Override // com.amap.api.col.3sl.m.a, java.lang.Runnable
            public final void run() {
                super.run();
                try {
                    m.this.setNaviLabelEnable(this.f3172c, this.g, this.h);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        this.aX = new a() { // from class: com.amap.api.col.3sl.m.2
            @Override // com.amap.api.col.3sl.m.a, java.lang.Runnable
            public final void run() {
                super.run();
                try {
                    m.this.setConstructingRoadEnable(this.f3172c);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        this.aY = new a() { // from class: com.amap.api.col.3sl.m.3
            @Override // com.amap.api.col.3sl.m.a, java.lang.Runnable
            public final void run() {
                super.run();
                try {
                    m.this.setTrafficStyleWithTextureData(this.i);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        this.aZ = new a() { // from class: com.amap.api.col.3sl.m.4
            @Override // com.amap.api.col.3sl.m.a, java.lang.Runnable
            public final void run() {
                super.run();
                try {
                    m.this.setTrafficStyleWithTexture(this.i, this.j);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        this.ba = new a() { // from class: com.amap.api.col.3sl.m.5
            @Override // com.amap.api.col.3sl.m.a, java.lang.Runnable
            public final void run() {
                super.run();
                m.this.b(this.f, this.f3172c);
            }
        };
        this.bb = new a() { // from class: com.amap.api.col.3sl.m.6
            @Override // com.amap.api.col.3sl.m.a, java.lang.Runnable
            public final void run() {
                super.run();
                try {
                    m.this.setIndoorEnabled(this.f3172c);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        };
        this.bc = new Runnable() { // from class: com.amap.api.col.3sl.m.7
            @Override // java.lang.Runnable
            public final void run() {
                eq eqVarF;
                if (m.this.C == null || (eqVarF = m.this.C.f()) == null) {
                    return;
                }
                eqVarF.c();
            }
        };
        this.bd = new a() { // from class: com.amap.api.col.3sl.m.8
            @Override // com.amap.api.col.3sl.m.a, java.lang.Runnable
            public final void run() {
                super.run();
                m.this.c(this.f, this.f3172c);
            }
        };
        this.bf = "";
        this.bg = "";
        this.bh = false;
        this.bi = false;
        this.bj = 0;
        this.bk = new EAMapPlatformGestureInfo();
        this.k = new Point();
        this.bl = 0L;
        this.l = null;
        this.bm = null;
        this.m = new float[16];
        this.n = new float[16];
        this.o = new float[16];
        this.bn = null;
        this.p = new float[12];
        this.q = "precision highp float;\nattribute vec3 aVertex;//顶点数组,三维坐标\nuniform mat4 aMVPMatrix;//mvp矩阵\nvoid main(){\n  gl_Position = aMVPMatrix * vec4(aVertex, 1.0);\n}";
        this.r = "//有颜色 没有纹理\nprecision highp float;\nvoid main(){\n  gl_FragColor = vec4(1.0,0,0,1.0);\n}";
        this.s = -1;
        this.e = context;
        iv ivVarA = iu.a(context, eb.a());
        if (ivVarA.f2835a == iu.c.SuccessCode) {
            ee.a(context);
            ee.a(ed.f2416c, "init map delegate");
        }
        com.autonavi.extra.b bVar = new com.autonavi.extra.b();
        this.be = bVar;
        bVar.a();
        this.be.b();
        jv.a(this.e);
        dp.a().a(this.e);
        y.f3320c = il.c(context);
        dg.a(this.e);
        this.as = new ab(this);
        GLMapRender gLMapRender = new GLMapRender(this);
        this.ar = gLMapRender;
        this.B = iGLSurfaceView;
        iGLSurfaceView.setRenderer(gLMapRender);
        ac acVar = new ac(this, this.e);
        this.E = acVar;
        this.f = new GLMapEngine(this.e, this);
        this.D = new ae(this.e, this);
        this.C = new em(this.e, this, acVar, this.D);
        this.z = new ak(this);
        this.C.a(new c(this, b2));
        this.aI = new b();
        iGLSurfaceView.setRenderMode(0);
        this.ar.setRenderFps(15.0f);
        this.f.setMapListener(this);
        this.y = new ah(this);
        this.t = new q(this);
        az azVar = new az(this.e);
        this.w = azVar;
        azVar.a(this.C);
        this.w.b(new cr(acVar, context));
        this.ab = new v(this.e, this);
        this.M = new ba(this.e);
        this.an = new cw(this.e, this);
        cy cyVar = new cy(this.e);
        this.ao = cyVar;
        cyVar.a(this);
        a(z);
        MapConfig mapConfig = this.f3092b;
        l lVar = new l(this, this.e, mapConfig != null ? mapConfig.isAbroadEnable() : false);
        this.aL = lVar;
        lVar.a(this);
        if (ivVarA.f2835a != iu.c.SuccessCode) {
            this.f3092b.setMapEnable(false);
        }
        this.G = this.f.getEngineIDWithType(1);
    }

    private void a(boolean z) {
        com.autonavi.extra.b bVar = this.be;
        if (bVar != null) {
            Object objJ = bVar.j();
            if (objJ != null && (objJ instanceof Boolean)) {
                MapConfig mapConfig = this.f3092b;
                if (mapConfig != null) {
                    mapConfig.setAbroadEnable(z && ((Boolean) objJ).booleanValue());
                }
                if (z && ((Boolean) objJ).booleanValue()) {
                    MapsInitializer.setSupportRecycleView(false);
                }
            }
            Object objJ2 = this.be.j();
            if (objJ2 != null && (objJ2 instanceof Boolean)) {
                this.C.a(((Boolean) objJ2).booleanValue());
            }
            Object objJ3 = this.be.j();
            if (objJ2 == null || !(objJ2 instanceof Integer)) {
                return;
            }
            this.ah = ((Integer) objJ3).intValue();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final com.autonavi.extra.b getAMapExtraInterfaceManager() {
        return this.be;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final IGlOverlayLayer getGlOverlayLayer() {
        return this.E;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setMapEnable(boolean z) {
        MapConfig mapConfig = this.f3092b;
        if (mapConfig != null) {
            mapConfig.setMapEnable(z);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final GLMapEngine getGLMapEngine() {
        return this.f;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setGestureStatus(int i, int i2) {
        if (this.aF == 0 || i2 != 5) {
            this.aF = i2;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getPreciseLevel(int i) {
        MapConfig mapConfig = this.f3092b;
        if (mapConfig != null) {
            return mapConfig.getSZ();
        }
        return 0.0f;
    }

    private float d() {
        if (this.f3092b != null) {
            return getMapConfig().getSZ();
        }
        return 0.0f;
    }

    private boolean a(int i, int i2) {
        AbstractCameraUpdateMessage abstractCameraUpdateMessageA;
        if (!this.aA || ((int) d()) >= this.f3092b.getMaxZoomLevel()) {
            return false;
        }
        try {
            if (!this.J && !this.z.isZoomInByScreenCenter()) {
                this.k.x = i;
                this.k.y = i2;
                abstractCameraUpdateMessageA = ap.a(1.0f, this.k);
            } else {
                abstractCameraUpdateMessageA = ap.a(1.0f, (Point) null);
            }
            animateCamera(abstractCameraUpdateMessageA);
        } catch (Throwable th) {
            jv.c(th, "AMapDelegateImp", "onDoubleTap");
            th.printStackTrace();
        }
        resetRenderTime();
        return true;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void zoomOut(int i) {
        if (this.aA && ((int) d()) > this.f3092b.getMinZoomLevel()) {
            try {
                animateCamera(ap.b());
            } catch (Throwable th) {
                jv.c(th, "AMapDelegateImp", "onDoubleTap");
                th.printStackTrace();
            }
            resetRenderTime();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean isLockMapAngle(int i) {
        return g(i);
    }

    private void e() {
        if (this.aA) {
            this.as.a();
            this.at = true;
            this.ay = true;
            try {
                stopAnimation();
            } catch (RemoteException unused) {
            }
        }
    }

    private void f() {
        this.at = true;
        this.ay = false;
        if (this.S) {
            this.S = false;
        }
        if (this.R) {
            this.R = false;
        }
        if (this.T) {
            this.T = false;
        }
        try {
            if (this.N) {
                List listA = this.u.a(AMap.OnMarkerDragListener.class.hashCode());
                if (listA != null && listA.size() > 0 && this.P != null) {
                    synchronized (listA) {
                        for (int i = 0; i < listA.size(); i++) {
                            ((AMap.OnMarkerDragListener) listA.get(i)).onMarkerDragEnd(this.P);
                        }
                    }
                }
                this.P = null;
                this.N = false;
            }
        } catch (Throwable th) {
            jv.c(th, "AMapDelegateImp", "OnMarkerDragListener.onMarkerDragEnd");
            th.printStackTrace();
        }
        if (this.O) {
            if (this.Q != null) {
                this.Q = null;
            }
            this.O = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(MotionEvent motionEvent) throws RemoteException {
        if (!this.N || this.P == null) {
            return;
        }
        int x = (int) motionEvent.getX();
        int y = (int) (motionEvent.getY() - 60.0f);
        if (this.P.getPosition() != null) {
            DPoint dPointObtain = DPoint.obtain();
            getPixel2LatLng(x, y, dPointObtain);
            LatLng latLng = new LatLng(dPointObtain.y, dPointObtain.x);
            dPointObtain.recycle();
            this.P.setPosition(latLng);
            List listA = this.u.a(AMap.OnMarkerDragListener.class.hashCode());
            if (listA == null || listA.size() <= 0) {
                return;
            }
            synchronized (listA) {
                for (int i = 0; i < listA.size(); i++) {
                    try {
                        ((AMap.OnMarkerDragListener) listA.get(i)).onMarkerDrag(this.P);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    private void b(MotionEvent motionEvent) {
        if (!this.O || this.Q == null) {
            return;
        }
        int x = (int) motionEvent.getX();
        int y = (int) (motionEvent.getY() - 60.0f);
        if (this.Q.getLatlng() != null) {
            DPoint dPointObtain = DPoint.obtain();
            getPixel2LatLng(x, y, dPointObtain);
            LatLng latLng = new LatLng(dPointObtain.y, dPointObtain.x);
            dPointObtain.recycle();
            this.Q.setLatLng(latLng);
        }
    }

    private void b(boolean z) {
        this.ax = z;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void clearTileCache() {
        this.E.clearTileCache();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final GLMapState getMapProjection() {
        GLMapEngine gLMapEngine = this.f;
        if (gLMapEngine != null) {
            return gLMapEngine.getMapState(this.G);
        }
        return null;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showMyLocationOverlay(Location location) throws RemoteException {
        if (location == null) {
            return;
        }
        try {
            if (this.F && this.M != null) {
                if (this.L == null) {
                    this.L = new cp(this, this.e);
                }
                if (location.getLongitude() != 0.0d && location.getLatitude() != 0.0d) {
                    this.L.a(location);
                }
                List listA = this.u.a(AMap.OnMyLocationChangeListener.class.hashCode());
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
            cp cpVar = this.L;
            if (cpVar != null) {
                cpVar.c();
            }
            this.L = null;
        } catch (Throwable th) {
            jv.c(th, "AMapDelegateImp", "showMyLocationOverlay");
            th.printStackTrace();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void removeGLOverlay(String str) throws RemoteException {
        resetRenderTime();
        this.E.removeOverlay(str);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean removeGLModel(String str) {
        try {
            this.E.removeOverlay(str);
            return false;
        } catch (Throwable th) {
            jv.c(th, "AMapDelegateImp", "removeGLModel");
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void changeGLOverlayIndex() {
        this.E.changeOverlayIndex();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float checkZoomLevel(float f) throws RemoteException {
        return eb.a(this.f3092b, f);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void latlon2Geo(double d2, double d3, IPoint iPoint) {
        Point pointLatLongToPixels = VirtualEarthProjection.latLongToPixels(d2, d3, 20);
        iPoint.x = pointLatLongToPixels.x;
        iPoint.y = pointLatLongToPixels.y;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void geo2Map(int i, int i2, FPoint fPoint) {
        fPoint.x = (int) (((double) i) - this.f3092b.getSX());
        fPoint.y = (int) (((double) i2) - this.f3092b.getSY());
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void geo2Latlng(int i, int i2, DPoint dPoint) {
        DPoint dPointPixelsToLatLong = VirtualEarthProjection.pixelsToLatLong(i, i2, 20);
        dPoint.x = dPointPixelsToLatLong.x;
        dPoint.y = dPointPixelsToLatLong.y;
        dPointPixelsToLatLong.recycle();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getZoomLevel() {
        return d();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final IUiSettingsDelegate getUiSettings() {
        return this.z;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final IProjectionDelegate getProjection() throws RemoteException {
        return this.y;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final l getCustomStyleManager() {
        return this.aL;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final AMap.OnCameraChangeListener getOnCameraChangeListener() throws RemoteException {
        try {
            List listA = this.u.a(AMap.OnCameraChangeListener.class.hashCode());
            if (listA == null && listA.size() != 0) {
                return (AMap.OnCameraChangeListener) listA.get(0);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showInfoWindow(BaseOverlayImp baseOverlayImp) throws RemoteException {
        az azVar;
        if (baseOverlayImp == null || (azVar = this.w) == null) {
            return;
        }
        try {
            azVar.a(baseOverlayImp);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showInfoWindow(BaseOverlay baseOverlay) throws RemoteException {
        az azVar;
        if (baseOverlay == null || (azVar = this.w) == null) {
            return;
        }
        try {
            azVar.a(baseOverlay);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void hideInfoWindow() {
        az azVar = this.w;
        if (azVar != null) {
            azVar.c();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void getLatLng2Map(double d2, double d3, FPoint fPoint) {
        IPoint iPointObtain = IPoint.obtain();
        latlon2Geo(d2, d3, iPointObtain);
        geo2Map(iPointObtain.x, iPointObtain.y, fPoint);
        iPointObtain.recycle();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void getPixel2LatLng(int i, int i2, DPoint dPoint) {
        GLMapEngine gLMapEngine;
        GLMapState mapState;
        if (this.H.get() || !this.aA || (gLMapEngine = this.f) == null || (mapState = gLMapEngine.getMapState(this.G)) == null) {
            return;
        }
        IPoint iPointObtain = IPoint.obtain();
        mapState.screenToP20Point(i, i2, iPointObtain);
        DPoint dPointPixelsToLatLong = VirtualEarthProjection.pixelsToLatLong(iPointObtain.x, iPointObtain.y, 20);
        dPoint.x = dPointPixelsToLatLong.x;
        dPoint.y = dPointPixelsToLatLong.y;
        iPointObtain.recycle();
        dPointPixelsToLatLong.recycle();
    }

    private void a(GLMapState gLMapState, int i, int i2, DPoint dPoint) {
        if (!this.aA || this.f == null) {
            return;
        }
        Point point = new Point();
        gLMapState.screenToP20Point(i, i2, point);
        DPoint dPointPixelsToLatLong = VirtualEarthProjection.pixelsToLatLong(point.x, point.y, 20);
        dPoint.x = dPointPixelsToLatLong.x;
        dPoint.y = dPointPixelsToLatLong.y;
        dPointPixelsToLatLong.recycle();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void getLatLng2Pixel(double d2, double d3, IPoint iPoint) {
        if (this.H.get() || !this.aA || this.f == null) {
            return;
        }
        try {
            Point pointLatLongToPixels = VirtualEarthProjection.latLongToPixels(d2, d3, 20);
            FPoint fPointObtain = FPoint.obtain();
            a(pointLatLongToPixels.x, pointLatLongToPixels.y, fPointObtain);
            if (fPointObtain.x == -10000.0f && fPointObtain.y == -10000.0f) {
                GLMapState gLMapState = (GLMapState) this.f.getNewMapState(this.G);
                gLMapState.setCameraDegree(0.0f);
                gLMapState.recalculate();
                gLMapState.p20ToScreenPoint(pointLatLongToPixels.x, pointLatLongToPixels.y, fPointObtain);
                gLMapState.recycle();
            }
            iPoint.x = (int) fPointObtain.x;
            iPoint.y = (int) fPointObtain.y;
            fPointObtain.recycle();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void getPixel2Geo(int i, int i2, IPoint iPoint) {
        GLMapEngine gLMapEngine;
        GLMapState mapState;
        if (this.H.get() || !this.aA || (gLMapEngine = this.f) == null || (mapState = gLMapEngine.getMapState(this.G)) == null) {
            return;
        }
        mapState.screenToP20Point(i, i2, iPoint);
    }

    private void a(int i, int i2, FPoint fPoint) {
        GLMapEngine gLMapEngine;
        GLMapState mapState;
        if (this.H.get() || !this.aA || (gLMapEngine = this.f) == null || (mapState = gLMapEngine.getMapState(this.G)) == null) {
            return;
        }
        mapState.p20ToScreenPoint(i, i2, fPoint);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void redrawInfoWindow() {
        if (!this.H.get() && this.aA) {
            this.j.sendEmptyMessage(18);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final az getInfoWindowDelegate() {
        return this.w;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showZoomControlsEnabled(boolean z) {
        en enVar;
        if (this.H.get() || (enVar = this.C) == null) {
            return;
        }
        enVar.b(Boolean.valueOf(z));
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showIndoorSwitchControlsEnabled(boolean z) {
        en enVar;
        if (this.H.get() || (enVar = this.C) == null) {
            return;
        }
        enVar.a(Boolean.valueOf(z));
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showMyLocationButtonEnabled(boolean z) {
        en enVar;
        if (this.H.get() || (enVar = this.C) == null) {
            return;
        }
        enVar.c(Boolean.valueOf(z));
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showCompassEnabled(boolean z) {
        en enVar;
        if (this.H.get() || (enVar = this.C) == null) {
            return;
        }
        enVar.d(Boolean.valueOf(z));
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showScaleEnabled(boolean z) {
        en enVar;
        if (this.H.get() || (enVar = this.C) == null) {
            return;
        }
        enVar.e(Boolean.valueOf(z));
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setZoomPosition(int i) {
        en enVar;
        if (this.H.get() || (enVar = this.C) == null) {
            return;
        }
        enVar.a(Integer.valueOf(i));
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final Rect getRect() {
        return this.Y;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final LatLngBounds getMapBounds(LatLng latLng, float f, float f2, float f3) {
        int mapWidth = getMapWidth();
        int mapHeight = getMapHeight();
        if (mapWidth <= 0 || mapHeight <= 0 || this.H.get()) {
            return null;
        }
        float fA = eb.a(this.f3092b, f);
        GLMapState gLMapState = new GLMapState(this.G, this.f.getNativeInstance());
        if (latLng != null) {
            IPoint iPointObtain = IPoint.obtain();
            latlon2Geo(latLng.latitude, latLng.longitude, iPointObtain);
            gLMapState.setCameraDegree(f3);
            gLMapState.setMapAngle(f2);
            gLMapState.setMapGeoCenter(iPointObtain.x, iPointObtain.y);
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
    public final void onResume() {
        try {
            this.ar.setRenderFps(15.0f);
            this.B.setRenderMode(0);
            IGlOverlayLayer iGlOverlayLayer = this.E;
            if (iGlOverlayLayer != null) {
                iGlOverlayLayer.setFlingState(true);
            }
            cp cpVar = this.L;
            if (cpVar != null) {
                cpVar.b();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void onPause() {
        g();
        IGlOverlayLayer iGlOverlayLayer = this.E;
        if (iGlOverlayLayer != null) {
            iGlOverlayLayer.setFlingState(false);
        }
    }

    private void g() {
        GLMapState gLMapState;
        GLMapEngine gLMapEngine = this.f;
        if (gLMapEngine == null || (gLMapState = (GLMapState) gLMapEngine.getNewMapState(this.G)) == null) {
            return;
        }
        IPoint iPointObtain = IPoint.obtain();
        gLMapState.recalculate();
        gLMapState.getMapGeoCenter(iPointObtain);
        this.f3092b.setSX(iPointObtain.x);
        this.f3092b.setSY(iPointObtain.y);
        this.f3092b.setSZ(gLMapState.getMapZoomer());
        this.f3092b.setSC(gLMapState.getCameraDegree());
        this.f3092b.setSR(gLMapState.getMapAngle());
        gLMapState.recycle();
        iPointObtain.recycle();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00b0 -> B:58:0x00b3). Please report as a decompilation issue!!! */
    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.I || !this.aA || !this.ax) {
            return false;
        }
        this.bk.mGestureState = 3;
        this.bk.mGestureType = 8;
        this.bk.mLocation = new float[]{motionEvent.getX(), motionEvent.getY()};
        getEngineIDWithGestureInfo(this.bk);
        m();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            n();
            e();
        } else if (action == 1) {
            f();
        }
        if (motionEvent.getAction() == 2 && this.N) {
            try {
                a(motionEvent);
            } catch (Throwable th) {
                jv.c(th, "AMapDelegateImp", "onDragMarker");
                th.printStackTrace();
            }
            return true;
        }
        if (motionEvent.getAction() == 2 && this.O) {
            try {
                b(motionEvent);
            } catch (Throwable th2) {
                jv.c(th2, "AMapDelegateImp", "onDragGLTF");
                th2.printStackTrace();
            }
            return true;
        }
        if (this.at) {
            try {
                List listA = this.u.a(AMap.SignleClickInterceptorListener.class.hashCode());
                if (listA == null || listA.size() <= 0 || !((AMap.SignleClickInterceptorListener) listA.get(0)).isInterceptorSignleClick(motionEvent)) {
                    this.as.a(motionEvent);
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
        }
        try {
            List listA2 = this.u.a(AMap.OnMapTouchListener.class.hashCode());
            if (listA2 != null && listA2.size() > 0) {
                this.j.removeMessages(14);
                Message messageObtainMessage = this.j.obtainMessage();
                messageObtainMessage.what = 14;
                messageObtainMessage.obj = MotionEvent.obtain(motionEvent);
                messageObtainMessage.sendToTarget();
            }
        } catch (Throwable unused) {
        }
        return true;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void pixel2Map(int i, int i2, PointF pointF) {
        if (!this.aA || this.I || this.f == null) {
            return;
        }
        IPoint iPointObtain = IPoint.obtain();
        getPixel2Geo(i, i2, iPointObtain);
        pointF.x = iPointObtain.x - ((float) this.f3092b.getSX());
        pointF.y = iPointObtain.y - ((float) this.f3092b.getSY());
        iPointObtain.recycle();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void map2Geo(float f, float f2, IPoint iPoint) {
        iPoint.x = (int) (((double) f) + this.f3092b.getSX());
        iPoint.y = (int) (((double) f2) + this.f3092b.getSY());
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float toMapLenWithWin(int i) {
        GLMapEngine gLMapEngine;
        if (!this.aA || this.I || (gLMapEngine = this.f) == null) {
            return 0.0f;
        }
        return gLMapEngine.getMapState(this.G).getGLUnitWithWin(i);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final CameraPosition getCameraPositionPrj(boolean z) {
        LatLng latLngH;
        try {
            if (this.f3092b == null) {
                return null;
            }
            if (this.aA && !this.I && this.f != null) {
                if (z) {
                    DPoint dPointObtain = DPoint.obtain();
                    getPixel2LatLng(this.f3092b.getAnchorX(), this.f3092b.getAnchorY(), dPointObtain);
                    latLngH = new LatLng(dPointObtain.y, dPointObtain.x, false);
                    dPointObtain.recycle();
                } else {
                    latLngH = h();
                }
                return CameraPosition.builder().target(latLngH).bearing(this.f3092b.getSR()).tilt(this.f3092b.getSC()).zoom(this.f3092b.getSZ()).build();
            }
            DPoint dPointObtain2 = DPoint.obtain();
            geo2Latlng((int) this.f3092b.getSX(), (int) this.f3092b.getSY(), dPointObtain2);
            LatLng latLng = new LatLng(dPointObtain2.y, dPointObtain2.x);
            dPointObtain2.recycle();
            return CameraPosition.builder().target(latLng).bearing(this.f3092b.getSR()).tilt(this.f3092b.getSC()).zoom(this.f3092b.getSZ()).build();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private LatLng h() {
        MapConfig mapConfig = this.f3092b;
        if (mapConfig == null) {
            return null;
        }
        DPoint dPointPixelsToLatLong = VirtualEarthProjection.pixelsToLatLong(mapConfig.getSX(), this.f3092b.getSY(), 20);
        LatLng latLng = new LatLng(dPointPixelsToLatLong.y, dPointPixelsToLatLong.x, false);
        dPointPixelsToLatLong.recycle();
        return latLng;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean isUseAnchor() {
        return this.J;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final Point getWaterMarkerPositon() {
        en enVar = this.C;
        if (enVar != null) {
            return enVar.a();
        }
        return new Point();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final View getGLMapView() {
        Object obj = this.B;
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean canShowIndoorSwitch() {
        ay ayVar;
        if (getZoomLevel() < 17.0f || (ayVar = this.f3093c) == null || ayVar.g == null) {
            return false;
        }
        FPoint fPointObtain = FPoint.obtain();
        a(this.f3093c.g.x, this.f3093c.g.y, fPointObtain);
        return this.Y.contains((int) fPointObtain.x, (int) fPointObtain.y);
    }

    private void i() {
        synchronized (this) {
            synchronized (this.am) {
                int size = this.am.size();
                for (int i = 0; i < size; i++) {
                    this.am.get(i).a().recycle();
                }
                this.am.clear();
            }
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final int getLogoPosition() {
        try {
            return this.z.getLogoPosition();
        } catch (RemoteException e) {
            jv.c(e, "AMapDelegateImp", "getLogoPosition");
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setLogoPosition(int i) {
        en enVar = this.C;
        if (enVar != null) {
            enVar.b(Integer.valueOf(i));
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setLogoBottomMargin(int i) {
        en enVar = this.C;
        if (enVar != null) {
            enVar.c(Integer.valueOf(i));
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setLogoLeftMargin(int i) {
        en enVar = this.C;
        if (enVar != null) {
            enVar.d(Integer.valueOf(i));
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getLogoMarginRate(int i) {
        en enVar = this.C;
        if (enVar != null) {
            return enVar.a(i);
        }
        return 0.0f;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setLogoMarginRate(int i, float f) {
        en enVar = this.C;
        if (enVar != null) {
            enVar.a(Integer.valueOf(i), Float.valueOf(f));
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final int getMaskLayerType() {
        return this.aj;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void post(Runnable runnable) {
        IGLSurfaceView iGLSurfaceView = this.B;
        if (iGLSurfaceView != null) {
            iGLSurfaceView.post(runnable);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void onLongPress(int i, MotionEvent motionEvent) {
        boolean z;
        int i2 = 0;
        try {
            this.R = false;
            b(i);
            BaseOverlay hitBaseOverlay = this.E.getHitBaseOverlay(motionEvent, 1);
            if (hitBaseOverlay instanceof Marker) {
                this.P = (Marker) hitBaseOverlay;
            }
            DPoint dPointObtain = DPoint.obtain();
            dPointObtain.x = motionEvent.getX();
            dPointObtain.y = motionEvent.getY();
            BaseOverlay hitOverlay = this.D.getHitOverlay(dPointObtain, 1);
            if (hitOverlay instanceof Marker) {
                this.P = (Marker) hitOverlay;
                z = true;
            } else {
                z = false;
            }
            dPointObtain.recycle();
            BaseOverlay hitBaseOverlay2 = this.E.getHitBaseOverlay(motionEvent, 3);
            if (hitBaseOverlay2 instanceof GLTFOverlay) {
                this.Q = (GLTFOverlay) hitBaseOverlay2;
            }
            Marker marker = this.P;
            if (marker != null && marker.isDraggable()) {
                LatLng position = this.P.getPosition();
                if (position != null) {
                    IPoint iPointObtain = IPoint.obtain();
                    getLatLng2Pixel(position.latitude, position.longitude, iPointObtain);
                    iPointObtain.y -= 60;
                    DPoint dPointObtain2 = DPoint.obtain();
                    getPixel2LatLng(iPointObtain.x, iPointObtain.y, dPointObtain2);
                    this.P.setPosition(new LatLng(dPointObtain2.y, dPointObtain2.x));
                    if (z) {
                        this.D.set2Top(this.P.getId());
                    } else {
                        this.E.set2Top(this.P.getId());
                    }
                    try {
                        List listA = this.u.a(AMap.OnMarkerDragListener.class.hashCode());
                        if (listA != null && listA.size() > 0) {
                            synchronized (listA) {
                                while (i2 < listA.size()) {
                                    ((AMap.OnMarkerDragListener) listA.get(i2)).onMarkerDragStart(this.P);
                                    i2++;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        jv.c(th, "AMapDelegateImp", "onMarkerDragStart");
                        th.printStackTrace();
                    }
                    this.N = true;
                    iPointObtain.recycle();
                    dPointObtain2.recycle();
                }
            } else {
                GLTFOverlay gLTFOverlay = this.Q;
                if (gLTFOverlay != null && gLTFOverlay.isDraggable()) {
                    LatLng latlng = this.Q.getLatlng();
                    if (latlng != null) {
                        IPoint iPointObtain2 = IPoint.obtain();
                        getLatLng2Pixel(latlng.latitude, latlng.longitude, iPointObtain2);
                        iPointObtain2.y -= 60;
                        DPoint dPointObtain3 = DPoint.obtain();
                        getPixel2LatLng(iPointObtain2.x, iPointObtain2.y, dPointObtain3);
                        this.Q.setLatLng(new LatLng(dPointObtain3.y, dPointObtain3.x));
                        this.E.set2Top(this.Q.getId());
                        this.O = true;
                        iPointObtain2.recycle();
                        dPointObtain3.recycle();
                    }
                } else {
                    List listA2 = this.u.a(AMap.OnMapLongClickListener.class.hashCode());
                    if (listA2 != null && listA2.size() > 0) {
                        DPoint dPointObtain4 = DPoint.obtain();
                        getPixel2LatLng((int) motionEvent.getX(), (int) motionEvent.getY(), dPointObtain4);
                        synchronized (listA2) {
                            while (i2 < listA2.size()) {
                                ((AMap.OnMapLongClickListener) listA2.get(i2)).onMapLongClick(new LatLng(dPointObtain4.y, dPointObtain4.x));
                                i2++;
                            }
                        }
                        this.S = true;
                        dPointObtain4.recycle();
                    }
                }
            }
            this.ar.resetTickCount(30);
        } catch (Throwable th2) {
            jv.c(th2, "AMapDelegateImp", "onLongPress");
            th2.printStackTrace();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean onDoubleTap(int i, MotionEvent motionEvent) {
        if (!this.aA) {
            return false;
        }
        a((int) motionEvent.getX(), (int) motionEvent.getY());
        return false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean onSingleTapConfirmed(int i, MotionEvent motionEvent) {
        if (!this.aA) {
            return false;
        }
        try {
            b(i);
            if (i(motionEvent) || f(motionEvent) || e(motionEvent) || h(motionEvent)) {
                return true;
            }
            d(motionEvent);
            if (g(motionEvent)) {
                return true;
            }
            c(motionEvent);
            return true;
        } catch (Throwable th) {
            jv.c(th, "AMapDelegateImp", "onSingleTapUp");
            th.printStackTrace();
            return true;
        }
    }

    private void c(final MotionEvent motionEvent) {
        queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.m.9
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    m.this.f.addGestureSingleTapMessage(motionEvent.getX(), motionEvent.getY());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    private void a(final double d2, final double d3) {
        this.j.post(new Runnable() { // from class: com.amap.api.col.3sl.m.10
            @Override // java.lang.Runnable
            public final void run() {
                Message messageObtain = Message.obtain();
                messageObtain.what = 19;
                messageObtain.arg1 = (int) d2;
                messageObtain.arg2 = (int) d3;
                m.this.j.sendMessage(messageObtain);
            }
        });
    }

    private boolean d(MotionEvent motionEvent) {
        try {
            List listA = this.u.a(AMap.OnPolylineClickListener.class.hashCode());
            if (listA != null && listA.size() > 0) {
                DPoint dPointObtain = DPoint.obtain();
                getPixel2LatLng((int) motionEvent.getX(), (int) motionEvent.getY(), dPointObtain);
                LatLng latLng = new LatLng(dPointObtain.y, dPointObtain.x);
                dPointObtain.recycle();
                Polyline hitOverlay = this.E.getHitOverlay(latLng, 2);
                if (hitOverlay != null) {
                    synchronized (listA) {
                        Iterator it = listA.iterator();
                        while (it.hasNext()) {
                            ((AMap.OnPolylineClickListener) it.next()).onPolylineClick(hitOverlay);
                        }
                    }
                    return false;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private boolean e(MotionEvent motionEvent) {
        LatLng position;
        DPoint dPointObtain = DPoint.obtain();
        dPointObtain.x = motionEvent.getX();
        dPointObtain.y = motionEvent.getY();
        boolean z = true;
        BaseOverlay hitOverlay = this.D.getHitOverlay(dPointObtain, 1);
        dPointObtain.recycle();
        if ((hitOverlay instanceof Marker) && ((Marker) hitOverlay).getId().contains("MARKER")) {
            try {
                Marker marker = (Marker) hitOverlay;
                this.D.set2Top(marker.getId());
                List listA = this.u.a(AMap.OnMarkerClickListener.class.hashCode());
                if (listA != null && listA.size() > 0) {
                    synchronized (listA) {
                        if (listA.size() == 1) {
                            boolean zOnMarkerClick = ((AMap.OnMarkerClickListener) listA.get(0)).onMarkerClick(marker);
                            if (zOnMarkerClick) {
                                return true;
                            }
                            z = zOnMarkerClick;
                        } else {
                            Iterator it = listA.iterator();
                            boolean zOnMarkerClick2 = false;
                            while (it.hasNext()) {
                                zOnMarkerClick2 |= ((AMap.OnMarkerClickListener) it.next()).onMarkerClick(marker);
                            }
                            if (zOnMarkerClick2) {
                                return true;
                            }
                            z = zOnMarkerClick2;
                        }
                    }
                }
                this.D.showInfoWindow(marker.getId());
                if (!marker.isViewMode() && (position = marker.getPosition()) != null) {
                    IPoint iPointObtain = IPoint.obtain();
                    latlon2Geo(position.latitude, position.longitude, iPointObtain);
                    moveCamera(ap.a(iPointObtain));
                }
                return z;
            } catch (Throwable th) {
                jv.c(th, "AMapDelegateImp", "onMarkerTap");
                th.printStackTrace();
            }
        }
        return false;
    }

    private boolean f(MotionEvent motionEvent) throws RemoteException {
        LatLng position;
        DPoint dPointObtain = DPoint.obtain();
        getPixel2LatLng((int) motionEvent.getX(), (int) motionEvent.getY(), dPointObtain);
        LatLng latLng = new LatLng(dPointObtain.y, dPointObtain.x);
        dPointObtain.recycle();
        boolean z = true;
        BaseOverlay hitBaseOverlay = this.E.getHitBaseOverlay(latLng, 1);
        if ((hitBaseOverlay instanceof Marker) && ((Marker) hitBaseOverlay).getId().contains("MARKER")) {
            try {
                Marker marker = (Marker) hitBaseOverlay;
                this.E.set2Top(marker.getId());
                List listA = this.u.a(AMap.OnMarkerClickListener.class.hashCode());
                if (listA != null && listA.size() > 0) {
                    synchronized (listA) {
                        if (listA.size() == 1) {
                            boolean zOnMarkerClick = ((AMap.OnMarkerClickListener) listA.get(0)).onMarkerClick(marker);
                            if (zOnMarkerClick) {
                                return true;
                            }
                            z = zOnMarkerClick;
                        } else {
                            Iterator it = listA.iterator();
                            boolean zOnMarkerClick2 = false;
                            while (it.hasNext()) {
                                zOnMarkerClick2 |= ((AMap.OnMarkerClickListener) it.next()).onMarkerClick(marker);
                            }
                            if (zOnMarkerClick2) {
                                return true;
                            }
                            z = zOnMarkerClick2;
                        }
                    }
                }
                this.E.showInfoWindow(marker.getId());
                if (!marker.isViewMode() && (position = marker.getPosition()) != null) {
                    IPoint iPointObtain = IPoint.obtain();
                    latlon2Geo(position.latitude, position.longitude, iPointObtain);
                    moveCamera(ap.a(iPointObtain));
                }
                return z;
            } catch (Throwable th) {
                jv.c(th, "AMapDelegateImp", "onMarkerTap");
                th.printStackTrace();
            }
        }
        return false;
    }

    private boolean g(MotionEvent motionEvent) {
        DPoint dPointObtain = DPoint.obtain();
        getPixel2LatLng((int) motionEvent.getX(), (int) motionEvent.getY(), dPointObtain);
        LatLng latLng = new LatLng(dPointObtain.y, dPointObtain.x);
        dPointObtain.recycle();
        BaseOverlay hitBaseOverlay = this.E.getHitBaseOverlay(latLng, 3);
        if (!(hitBaseOverlay instanceof GLTFOverlay)) {
            return false;
        }
        GLTFOverlay gLTFOverlay = (GLTFOverlay) hitBaseOverlay;
        if (!gLTFOverlay.isClickable()) {
            return false;
        }
        try {
            this.E.set2Top(gLTFOverlay.getId());
            gLTFOverlay.tapClick();
            return true;
        } catch (Throwable th) {
            jv.c(th, "AMapDelegateImp", "onGLTFTap");
            th.printStackTrace();
            return false;
        }
    }

    private boolean h(MotionEvent motionEvent) {
        if (this.E != null && this.aK != null) {
            DPoint dPointObtain = DPoint.obtain();
            if (this.f != null) {
                getPixel2LatLng((int) motionEvent.getX(), (int) motionEvent.getY(), dPointObtain);
                MultiPointItem multiPointItem = this.E.getMultiPointItem(new LatLng(dPointObtain.y, dPointObtain.x));
                if (multiPointItem == null) {
                    return false;
                }
                boolean zOnPointClick = this.aK.onPointClick(multiPointItem);
                dPointObtain.recycle();
                return zOnPointClick;
            }
        }
        return false;
    }

    private boolean i(MotionEvent motionEvent) throws RemoteException {
        try {
            List listA = this.u.a(AMap.OnInfoWindowClickListener.class.hashCode());
            BaseOverlay baseOverlayA = this.w.a(motionEvent);
            if (baseOverlayA != null && (baseOverlayA instanceof Marker)) {
                synchronized (listA) {
                    for (int i = 0; i < listA.size(); i++) {
                        ((AMap.OnInfoWindowClickListener) listA.get(i)).onInfoWindowClick((Marker) baseOverlayA);
                    }
                }
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void drawFrame(GL10 gl10) {
        if (this.H.get() || this.f == null || EGL14.eglGetCurrentContext() == EGL14.EGL_NO_CONTEXT) {
            return;
        }
        MapConfig mapConfig = this.f3092b;
        if (mapConfig != null && !mapConfig.isMapEnable()) {
            GLES20.glClear(16640);
            return;
        }
        a(this.G);
        this.f.renderAMap();
        this.f.pushRendererState();
        this.j.sendEmptyMessage(30);
        l lVar = this.aL;
        if (lVar != null) {
            lVar.a();
        }
        j();
        l();
        if (!this.aC) {
            this.aC = true;
        }
        this.f.popRendererState();
        if (ds.a()) {
            try {
                if (this.B instanceof p) {
                    if (this.d == null) {
                        this.d = new ds();
                    }
                    this.d.e();
                    if (!this.d.f() || this.d.d()) {
                        return;
                    }
                    if (this.d.a(((p) this.B).getBitmap())) {
                        if (ds.b()) {
                            removecache();
                        }
                        if (ds.c()) {
                            ds.g();
                        }
                        ee.b(ed.g, "pure screen: found pure check");
                    }
                }
            } catch (Throwable th) {
                jv.c(th, "AMapDelegateImp", "PureScreenCheckTool.checkBlackScreen");
            }
        }
    }

    private void a(int i) {
        int i2 = this.ak;
        if (i2 != -1) {
            this.ar.setRenderFps(i2);
            resetRenderTime();
        } else if (this.f.isInMapAction(i) || this.ay) {
            this.ar.setRenderFps(40.0f);
        } else if (this.f.isInMapAnimation(i) || this.E.isGLTFAnimated()) {
            this.ar.setRenderFps(30.0f);
            this.ar.resetTickCount(15);
        } else {
            this.ar.setRenderFps(15.0f);
        }
        if (this.f3092b.isWorldMapEnable() != MapsInitializer.isLoadWorldGridMap()) {
            b();
            this.f3092b.setWorldMapEnable(MapsInitializer.isLoadWorldGridMap());
        }
    }

    private void j() {
        if (this.V > 0) {
            boolean zCanStopMapRender = this.f.canStopMapRender(this.G);
            if (!zCanStopMapRender) {
                int i = this.V - 1;
                this.V = i;
                if (i > 0) {
                    this.f.renderAMap();
                    return;
                }
            }
            this.V = 0;
            Message messageObtainMessage = this.j.obtainMessage(15, this.f.getScreenShot(this.G, 0, 0, getMapWidth(), getMapHeight()));
            messageObtainMessage.arg1 = zCanStopMapRender ? 1 : 0;
            messageObtainMessage.sendToTarget();
        }
    }

    private void k() {
        GLMapState mapState;
        List listA;
        List listA2;
        List listA3;
        if (this.H.get() || (mapState = this.f.getMapState(this.G)) == null) {
            return;
        }
        mapState.getViewMatrix(this.f3092b.getViewMatrix());
        mapState.getProjectionMatrix(this.f3092b.getProjectionMatrix());
        this.f3092b.updateFinalMatrix();
        DPoint mapGeoCenter = mapState.getMapGeoCenter();
        this.f3092b.setSX(mapGeoCenter.x);
        this.f3092b.setSY(mapGeoCenter.y);
        this.f3092b.setSZ(mapState.getMapZoomer());
        this.f3092b.setSC(mapState.getCameraDegree());
        this.f3092b.setSR(mapState.getMapAngle());
        this.f3092b.setSkyHeight(mapState.getSkyHeight());
        if (this.f3092b.isMapStateChange()) {
            DPoint dPointPixelsToLatLong = VirtualEarthProjection.pixelsToLatLong(mapGeoCenter.x, mapGeoCenter.y, 20);
            CameraPosition cameraPosition = new CameraPosition(new LatLng(dPointPixelsToLatLong.y, dPointPixelsToLatLong.x, false), this.f3092b.getSZ(), this.f3092b.getSC(), this.f3092b.getSR());
            dPointPixelsToLatLong.recycle();
            Message messageObtainMessage = this.j.obtainMessage();
            messageObtainMessage.what = 10;
            messageObtainMessage.obj = cameraPosition;
            this.j.sendMessage(messageObtainMessage);
            this.az = true;
            redrawInfoWindow();
            try {
                if (this.z.isZoomControlsEnabled() && this.f3092b.isNeedUpdateZoomControllerState() && (listA3 = this.u.a(AMapWidgetListener.class.hashCode())) != null && listA3.size() > 0) {
                    synchronized (listA3) {
                        for (int i = 0; i < listA3.size(); i++) {
                            ((AMapWidgetListener) listA3.get(i)).invalidateZoomController(this.f3092b.getSZ());
                        }
                    }
                }
                if (this.f3092b.getChangeGridRatio() != 1.0d) {
                    b();
                }
                if (this.z.isCompassEnabled() && ((this.f3092b.isTiltChanged() || this.f3092b.isBearingChanged()) && (listA2 = this.u.a(AMapWidgetListener.class.hashCode())) != null && listA2.size() > 0)) {
                    synchronized (listA2) {
                        for (int i2 = 0; i2 < listA2.size(); i2++) {
                            ((AMapWidgetListener) listA2.get(i2)).invalidateCompassView();
                        }
                    }
                }
                if (!this.z.isScaleControlsEnabled() || (listA = this.u.a(AMapWidgetListener.class.hashCode())) == null || listA.size() <= 0) {
                    return;
                }
                synchronized (listA) {
                    for (int i3 = 0; i3 < listA.size(); i3++) {
                        ((AMapWidgetListener) listA.get(i3)).invalidateScaleView();
                    }
                }
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (!this.ay && this.f.getAnimateionsCount() == 0 && this.f.getStateMessageCount() == 0) {
            onChangeFinish();
        }
    }

    private void l() {
        if (!this.K) {
            this.j.sendEmptyMessage(16);
            this.K = true;
            b();
        }
        long j = this.bl;
        if (j < 2) {
            this.bl = j + 1;
            return;
        }
        final ei eiVarD = this.C.d();
        if (eiVarD == null || eiVarD.getVisibility() == 8) {
            return;
        }
        dy.a(this.e, System.currentTimeMillis() - this.aM);
        this.j.post(new Runnable() { // from class: com.amap.api.col.3sl.m.12
            @Override // java.lang.Runnable
            public final void run() {
                if (m.this.I) {
                    return;
                }
                try {
                    if (m.this.f3093c != null) {
                        m mVar = m.this;
                        mVar.setIndoorBuildingInfo(mVar.f3093c);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                eiVarD.a();
            }
        });
        this.f.setStyleChangeGradualEnable(this.G, true);
    }

    final void b() {
        this.j.obtainMessage(17, 1, 0).sendToTarget();
    }

    private void b(final int i) {
        queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.m.13
            @Override // java.lang.Runnable
            public final void run() {
                if (!m.this.aA || m.this.f == null) {
                    return;
                }
                m.this.f.setHighlightSubwayEnable(i, false);
            }
        });
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getMapAngle(int i) {
        MapConfig mapConfig = this.f3092b;
        if (mapConfig != null) {
            return mapConfig.getSR();
        }
        return 0.0f;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void getGeoCenter(int i, IPoint iPoint) {
        MapConfig mapConfig = this.f3092b;
        if (mapConfig != null) {
            iPoint.x = (int) mapConfig.getSX();
            iPoint.y = (int) this.f3092b.getSY();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getCameraDegree(int i) {
        MapConfig mapConfig = this.f3092b;
        if (mapConfig != null) {
            return mapConfig.getSC();
        }
        return 0.0f;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void addGestureMapMessage(int i, AbstractGestureMapMessage abstractGestureMapMessage) {
        if (!this.aA || this.f == null) {
            return;
        }
        try {
            abstractGestureMapMessage.isUseAnchor = this.J;
            abstractGestureMapMessage.anchorX = this.f3092b.getAnchorX();
            abstractGestureMapMessage.anchorY = this.f3092b.getAnchorY();
            this.f.addGestureMessage(i, abstractGestureMapMessage, this.z.isGestureScaleByMapCenter(), this.f3092b.getAnchorX(), this.f3092b.getAnchorY());
        } catch (RemoteException unused) {
        }
    }

    private void c(int i) {
        if (this.ay) {
            this.ay = false;
        }
        GLMapRender gLMapRender = this.ar;
        if (gLMapRender != null) {
            gLMapRender.renderPause();
        }
        f(i);
    }

    private void d(int i) {
        f(i);
        GLMapRender gLMapRender = this.ar;
        if (gLMapRender != null) {
            gLMapRender.renderResume();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void resetRenderTimeLongLong() {
        GLMapRender gLMapRender = this.ar;
        if (gLMapRender != null) {
            gLMapRender.resetTickCount(30);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void resetRenderTime() {
        GLMapRender gLMapRender = this.ar;
        if (gLMapRender != null) {
            gLMapRender.resetTickCount(2);
        }
    }

    private void m() {
        GLMapRender gLMapRender = this.ar;
        if (gLMapRender != null) {
            gLMapRender.resetTickCount(2);
        }
    }

    private void n() {
        GLMapRender gLMapRender;
        if (!this.aA || (gLMapRender = this.ar) == null || gLMapRender.isRenderPause()) {
            return;
        }
        requestRender();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void requestRender() {
        GLMapRender gLMapRender = this.ar;
        if (gLMapRender == null || gLMapRender.isRenderPause()) {
            return;
        }
        this.B.requestRender();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void changeMapLogo(int i, boolean z) {
        if (this.H.get()) {
            return;
        }
        try {
            List listA = this.u.a(AMapWidgetListener.class.hashCode());
            if (listA == null || listA.size() <= 0) {
                return;
            }
            this.C.g(Boolean.valueOf(!z));
        } catch (Throwable unused) {
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getRenderMode() {
        return this.B.getRenderMode();
    }

    private void o() {
        if (this.af) {
            return;
        }
        try {
            this.ab.setName("AuthThread");
            this.ab.start();
            this.af = true;
        } catch (Throwable th) {
            th.printStackTrace();
            eb.a(th);
        }
    }

    private void p() {
        if (this.ag) {
            return;
        }
        try {
            if (this.ac == null) {
                this.ac = new t(this.e, this);
            }
            this.ac.setName("AuthProThread");
            this.ac.start();
            this.ag = true;
        } catch (Throwable th) {
            th.printStackTrace();
            eb.a(th);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getMapZoomScale() {
        return this.av;
    }

    public final void a(int i, int i2, int i3) {
        synchronized (this) {
            a(i, i2, i3, false, null);
        }
    }

    private void a(final int i, final int i2, final int i3, final boolean z, final StyleItem[] styleItemArr) {
        synchronized (this) {
            if (this.aB && this.aA && this.f3091a) {
                e(i3);
                queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.m.14
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            m.this.f.setMapModeAndStyle(i, i2, i3, z, styleItemArr);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            } else {
                this.aR.f = i;
                this.aR.d = i2;
                this.aR.e = i3;
                this.aR.f3171b = true;
            }
        }
    }

    private void e(int i) {
        en enVar = this.C;
        if (enVar != null) {
            if (i == 0) {
                if (enVar.b()) {
                    this.C.g(Boolean.FALSE);
                    this.C.c();
                    return;
                }
                return;
            }
            if (enVar.b()) {
                return;
            }
            this.C.g(Boolean.TRUE);
            this.C.c();
        }
    }

    private void f(final int i) {
        queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.m.15
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    m.this.f.clearAllMessages(i);
                    m.this.f.clearAnimations(i, true);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    public final void a(final int i, final boolean z) {
        if (this.aA && this.aB) {
            resetRenderTime();
            queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.m.16
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        m.this.f.setBuildingEnable(i, z);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        } else {
            this.aT.f3172c = z;
            this.aT.f3171b = true;
            this.aT.f = i;
        }
    }

    public final void b(final int i, final boolean z) {
        if (this.aA && this.aB) {
            resetRenderTime();
            queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.m.17
                @Override // java.lang.Runnable
                public final void run() {
                    if (m.this.f != null) {
                        if (z) {
                            m.this.f.setAllContentEnable(i, true);
                        } else {
                            m.this.f.setAllContentEnable(i, false);
                        }
                        m.this.f.setSimple3DEnable(i, false);
                    }
                }
            });
        } else {
            this.ba.f3172c = z;
            this.ba.f3171b = true;
            this.ba.f = i;
        }
    }

    public final void c(final int i, final boolean z) {
        if (this.aA && this.aB) {
            resetRenderTime();
            queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.m.18
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (z) {
                            m.this.f.setBuildingTextureEnable(i, true);
                        } else {
                            m.this.f.setBuildingTextureEnable(i, false);
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        } else {
            this.bd.f3172c = z;
            this.bd.f3171b = true;
            this.bd.f = i;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void createSurface(int i, GL10 gl10, EGLConfig eGLConfig) {
        synchronized (this) {
            ee.a(ed.f2416c, "createSurface");
            this.aM = System.currentTimeMillis();
            int i2 = this.Z;
            if (i2 == 3 || i2 == 6) {
                this.C.d().a(ei.f2424b);
            } else {
                this.C.d().a(ei.f2423a);
            }
            this.aB = false;
            this.g = this.B.getWidth();
            this.h = this.B.getHeight();
            this.aD = false;
            try {
                boolean zLoadLibPath = AeUtil.loadLibPath(this.e);
                if (!zLoadLibPath) {
                    zLoadLibPath = AeUtil.loadLib(this.e);
                }
                if (!zLoadLibPath) {
                    eb.a(new AMapException(AMapException.ERROR_LIB_NOT_FIND));
                    return;
                }
                ee.a(ed.f2416c, "load lib complete");
                AeUtil.initCrashHandle(this.e);
                GLMapEngine.InitParam initParamInitResource = AeUtil.initResource(this.e);
                ee.a(ed.f2416c, "load res complete");
                this.f.createAMapInstance(initParamInitResource, this.aq);
                ee.a(ed.f2416c, "create engine complete");
                this.aJ = new cu();
                ee.a(ed.f2416c, "init shader complete");
                com.autonavi.extra.b bVar = this.be;
                if (bVar != null) {
                    bVar.i();
                }
                this.aA = true;
                this.l = gl10.glGetString(7937);
                if (iu.a(this.e, eb.a()).f2835a == iu.c.SuccessCode) {
                    o();
                }
                if (MapsInitializer.isTerrainEnable() && this.ad == null) {
                    x xVar = new x(this.e, this);
                    this.ad = xVar;
                    xVar.a(0L);
                }
                CustomRenderer customRenderer = this.ai;
                if (customRenderer != null) {
                    customRenderer.onSurfaceCreated(gl10, eGLConfig);
                }
                com.autonavi.extra.b bVar2 = this.be;
                if (bVar2 != null) {
                    bVar2.c();
                }
                this.E.onCreateAMapInstance();
            } catch (Throwable th) {
                eb.a(th);
                jv.c(th, "AMapDElegateImp", "createSurface");
                ee.b(ed.f2416c, "createSurface failed " + th.getMessage());
                dy.b(this.e, "init failed:" + th.getMessage());
            }
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void changeSurface(int i, GL10 gl10, int i2, int i3) {
        WindowManager windowManager;
        ee.a(ed.f2416c, "changeSurface " + i2 + " " + i3);
        this.aD = false;
        if (!this.aA) {
            createSurface(i, gl10, null);
        }
        ab abVar = this.as;
        if (abVar != null && this.e != null && ((this.g != abVar.b() || this.h != this.as.c()) && (windowManager = (WindowManager) this.e.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)) != null)) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (defaultDisplay != null) {
                defaultDisplay.getRealMetrics(displayMetrics);
                this.as.a(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            if (this.L != null && defaultDisplay != null) {
                this.L.a(defaultDisplay.getRotation());
            }
        }
        this.g = i2;
        this.h = i3;
        this.Y = new Rect(0, 0, i2, i3);
        this.G = a(i, new Rect(0, 0, this.g, this.h), this.g, this.h);
        ee.a(ed.f2416c, "create engine with frame complete");
        if (!this.aB) {
            MapConfig mapConfig = this.f3092b;
            if (mapConfig != null) {
                mapConfig.setMapZoomScale(this.av);
                this.f3092b.setMapWidth(i2);
                this.f3092b.setMapHeight(i3);
            }
            this.f.setIndoorEnable(this.G, false);
            this.f.setSimple3DEnable(this.G, false);
            this.f.setStyleChangeGradualEnable(this.G, false);
            this.f.initMapOpenLayer("{\"bounds\" : [{\"x2\" : 235405312,\"x1\" : 188874751,\"y2\" : 85065727,\"y1\" : 122421247}],\"sublyr\" : [{\"type\" : 4,\"sid\" : 9000006,\"zlevel\" : 2}],\"id\" : 9006,\"minzoom\" : 6,\"update_period\" : 90,\"maxzoom\" : 20,\"cachemode\" : 2,\"url\" : \"http://mpsapi.amap.com/ws/mps/lyrdata/ugc/\"}");
            GLMapEngine.InitParam initParam = new GLMapEngine.InitParam();
            AeUtil.initIntersectionRes(this.e, initParam);
            this.f.setVectorOverlayPath(initParam.mIntersectionResPath);
            GLMapEngine gLMapEngine = this.f;
            if (gLMapEngine != null) {
                gLMapEngine.setRenderFlags(true);
            }
        }
        synchronized (this) {
            this.aB = true;
        }
        if (!this.J) {
            this.f3092b.setAnchorX(i2 >> 1);
            this.f3092b.setAnchorY(i3 >> 1);
        } else {
            this.f3092b.setAnchorX(Math.max(1, Math.min(this.aG, i2 - 1)));
            this.f3092b.setAnchorY(Math.max(1, Math.min(this.aH, i3 - 1)));
        }
        this.f.setProjectionCenter(this.G, this.f3092b.getAnchorX(), this.f3092b.getAnchorY());
        this.f3091a = true;
        if (this.ba.f3171b) {
            this.ba.run();
        }
        if (this.aR.f3171b) {
            this.aR.run();
        }
        if (this.aS.f3171b) {
            this.aS.run();
        }
        if (this.aP.f3171b) {
            this.aP.run();
        }
        if (this.aT.f3171b) {
            this.aT.run();
        }
        if (this.bd.f3171b) {
            this.bd.run();
        }
        if (this.aU.f3171b) {
            this.aU.run();
        }
        if (this.aV.f3171b) {
            this.aV.run();
        }
        if (this.aW.f3171b) {
            this.aW.run();
        }
        if (this.bb.f3171b) {
            this.bb.run();
        }
        if (this.aQ.f3171b) {
            this.aQ.run();
        }
        if (this.aX.f3171b) {
            this.aX.run();
        }
        a aVar = this.aY;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = this.aZ;
        if (aVar2 != null) {
            aVar2.run();
        }
        CustomRenderer customRenderer = this.ai;
        if (customRenderer != null) {
            customRenderer.onSurfaceChanged(gl10, i2, i3);
        }
        com.autonavi.extra.b bVar = this.be;
        if (bVar != null) {
            bVar.d();
        }
        Handler handler = this.j;
        if (handler != null) {
            handler.post(this.bc);
        }
        redrawInfoWindow();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void destroySurface(int i) {
        this.aE.lock();
        try {
            if (this.aA) {
                EGL14.eglGetCurrentContext();
                EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
                s();
                GLMapEngine gLMapEngine = this.f;
                if (gLMapEngine != null) {
                    if (gLMapEngine.getOverlayBundle(this.G) != null) {
                        this.f.getOverlayBundle(this.G).removeAll(true);
                    }
                    this.f.destroyAMapEngine();
                    this.f = null;
                    int i2 = this.bj;
                    if (i2 > 0) {
                        dy.a(this.e, i2);
                    }
                    ee.a(ed.f2416c, "destroy engine complete");
                }
                com.autonavi.extra.b bVar = this.be;
                if (bVar != null) {
                    bVar.f();
                }
            }
            this.aA = false;
            this.aB = false;
            this.aD = false;
        } catch (Throwable th) {
            try {
                eb.a(th);
            } finally {
                this.aE.unlock();
            }
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final Context getContext() {
        return this.e;
    }

    private int a(int i, Rect rect, int i2, int i3) {
        int engineIDWithType;
        GLMapEngine gLMapEngine = this.f;
        if (gLMapEngine == null || i < 0) {
            engineIDWithType = 0;
        } else {
            engineIDWithType = gLMapEngine.getEngineIDWithType(i);
            if (!this.f.isEngineCreated(engineIDWithType)) {
                int i4 = this.e.getResources().getDisplayMetrics().densityDpi;
                float f = this.e.getResources().getDisplayMetrics().density;
                NativeTextGenerate.getInstance().setDensity(f);
                GLMapEngine.MapViewInitParam mapViewInitParam = new GLMapEngine.MapViewInitParam();
                mapViewInitParam.engineId = engineIDWithType;
                mapViewInitParam.x = rect.left;
                mapViewInitParam.y = rect.top;
                mapViewInitParam.width = rect.width();
                mapViewInitParam.height = rect.height();
                mapViewInitParam.screenWidth = i2;
                mapViewInitParam.screenHeight = i3;
                mapViewInitParam.screenScale = f;
                mapViewInitParam.textScale = this.aw * f;
                mapViewInitParam.mapZoomScale = this.av;
                mapViewInitParam.taskThreadCount = 3;
                this.f.createAMapEngineWithFrame(mapViewInitParam);
                GLMapState mapState = this.f.getMapState(engineIDWithType);
                mapState.setMapZoomer(this.f3092b.getSZ());
                mapState.setCameraDegree(this.f3092b.getSC());
                mapState.setMapAngle(this.f3092b.getSR());
                mapState.setMapGeoCenter(this.f3092b.getSX(), this.f3092b.getSY());
                this.f.setMapState(engineIDWithType, mapState);
                this.av = mapState.calMapZoomScalefactor(i2, i3, i4);
                this.f.setOvelayBundle(engineIDWithType, new GLOverlayBundle<>(engineIDWithType, this));
            } else {
                a(engineIDWithType, rect.left, rect.top, rect.width(), rect.height(), i2, i3);
            }
        }
        this.H.set(false);
        return engineIDWithType;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final int getEngineIDWithGestureInfo(EAMapPlatformGestureInfo eAMapPlatformGestureInfo) {
        GLMapEngine gLMapEngine = this.f;
        if (gLMapEngine != null) {
            return gLMapEngine.getEngineIDWithGestureInfo(eAMapPlatformGestureInfo);
        }
        return this.G;
    }

    private void a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        GLMapEngine gLMapEngine = this.f;
        if (gLMapEngine != null) {
            gLMapEngine.setServiceViewRect(i, i2, i3, i4, i5, i6, i7);
        }
    }

    private boolean g(int i) {
        GLMapEngine gLMapEngine = this.f;
        if (gLMapEngine != null) {
            return gLMapEngine.getSrvViewStateBoolValue(i, 7);
        }
        return false;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final CameraPosition getCameraPosition() throws RemoteException {
        return getCameraPositionPrj(this.J);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float getMaxZoomLevel() {
        try {
            MapConfig mapConfig = this.f3092b;
            if (mapConfig != null) {
                return mapConfig.getMaxZoomLevel();
            }
            return 20.0f;
        } catch (Throwable th) {
            eb.a(th);
            return 20.0f;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float getMinZoomLevel() {
        try {
            MapConfig mapConfig = this.f3092b;
            if (mapConfig != null) {
                return mapConfig.getMinZoomLevel();
            }
            return 3.0f;
        } catch (Throwable th) {
            eb.a(th);
            return 3.0f;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void moveCamera(CameraUpdate cameraUpdate) throws RemoteException {
        if (cameraUpdate == null) {
            return;
        }
        try {
            moveCamera(cameraUpdate.getCameraUpdateFactoryDelegate());
        } catch (Throwable th) {
            eb.a(th);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void moveCamera(AbstractCameraUpdateMessage abstractCameraUpdateMessage) throws RemoteException {
        if (this.f == null || this.H.get()) {
            return;
        }
        try {
            if (this.I && this.f.getStateMessageCount() > 0) {
                AbstractCameraUpdateMessage abstractCameraUpdateMessageC = ap.c();
                abstractCameraUpdateMessageC.nowType = AbstractCameraUpdateMessage.Type.changeGeoCenterZoomTiltBearing;
                abstractCameraUpdateMessageC.geoPoint = new DPoint(this.f3092b.getSX(), this.f3092b.getSY());
                abstractCameraUpdateMessageC.zoom = this.f3092b.getSZ();
                abstractCameraUpdateMessageC.bearing = this.f3092b.getSR();
                abstractCameraUpdateMessageC.tilt = this.f3092b.getSC();
                this.f.addMessage(abstractCameraUpdateMessage, false);
                while (this.f.getStateMessageCount() > 0) {
                    AbstractCameraUpdateMessage stateMessage = this.f.getStateMessage();
                    if (stateMessage != null) {
                        stateMessage.mergeCameraUpdateDelegate(abstractCameraUpdateMessageC);
                    }
                }
                abstractCameraUpdateMessage = abstractCameraUpdateMessageC;
            }
        } catch (Throwable th) {
            eb.a(th);
        }
        resetRenderTime();
        this.f.clearAnimations(this.G, false);
        abstractCameraUpdateMessage.isChangeFinished = true;
        a(abstractCameraUpdateMessage);
        this.f.addMessage(abstractCameraUpdateMessage, false);
    }

    private void a(AbstractCameraUpdateMessage abstractCameraUpdateMessage) {
        abstractCameraUpdateMessage.isUseAnchor = this.J;
        if (this.J) {
            abstractCameraUpdateMessage.anchorX = this.f3092b.getAnchorX();
            abstractCameraUpdateMessage.anchorY = this.f3092b.getAnchorY();
        }
        if (abstractCameraUpdateMessage.width == 0) {
            abstractCameraUpdateMessage.width = getMapWidth();
        }
        if (abstractCameraUpdateMessage.height == 0) {
            abstractCameraUpdateMessage.height = getMapHeight();
        }
        abstractCameraUpdateMessage.mapConfig = this.f3092b;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void animateCamera(CameraUpdate cameraUpdate) throws RemoteException {
        if (cameraUpdate == null) {
            return;
        }
        animateCamera(cameraUpdate.getCameraUpdateFactoryDelegate());
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void animateCamera(AbstractCameraUpdateMessage abstractCameraUpdateMessage) throws RemoteException {
        animateCameraWithDurationAndCallback(abstractCameraUpdateMessage, 250L, (AMap.CancelableCallback) null);
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

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void animateCameraWithDurationAndCallback(AbstractCameraUpdateMessage abstractCameraUpdateMessage, long j, AMap.CancelableCallback cancelableCallback) {
        if (abstractCameraUpdateMessage == null || this.H.get() || this.f == null) {
            return;
        }
        abstractCameraUpdateMessage.mCallback = cancelableCallback;
        abstractCameraUpdateMessage.mDuration = j;
        if (this.I || getMapHeight() == 0 || getMapWidth() == 0) {
            try {
                moveCamera(abstractCameraUpdateMessage);
                if (abstractCameraUpdateMessage.mCallback != null) {
                    abstractCameraUpdateMessage.mCallback.onFinish();
                    return;
                }
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                eb.a(th);
                return;
            }
        }
        try {
            this.f.interruptAnimation();
            resetRenderTime();
            a(abstractCameraUpdateMessage);
            this.f.addMessage(abstractCameraUpdateMessage, true);
        } catch (Throwable th2) {
            eb.a(th2);
            th2.printStackTrace();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void stopAnimation() throws RemoteException {
        try {
            GLMapEngine gLMapEngine = this.f;
            if (gLMapEngine != null) {
                gLMapEngine.interruptAnimation();
            }
            resetRenderTime();
        } catch (Throwable th) {
            eb.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Polyline addPolyline(PolylineOptions polylineOptions) throws RemoteException {
        if (polylineOptions == null) {
            return null;
        }
        try {
            resetRenderTime();
            String strCreateId = this.E.createId("POLYLINE");
            Polyline polyline = (Polyline) this.E.addOverlayObject(strCreateId, new Polyline(this.E, polylineOptions, strCreateId), polylineOptions);
            ee.c(ed.d, "addPolyline ".concat(String.valueOf(strCreateId)));
            return polyline;
        } catch (Throwable th) {
            eb.a(th);
            ee.a(ed.d, "addPolyline failed " + th.getMessage(), polylineOptions);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final BuildingOverlay addBuildingOverlay() {
        try {
            dy.h(this.e);
            String strCreateId = this.E.createId("BUILDINGOVERLAY");
            BuildingOverlay buildingOverlay = new BuildingOverlay(this.E, strCreateId);
            Field declaredField = buildingOverlay.getClass().getDeclaredField("buildingOverlayTotalOptions");
            if (declaredField == null) {
                return null;
            }
            resetRenderTime();
            declaredField.setAccessible(true);
            Object obj = declaredField.get(buildingOverlay);
            IGlOverlayLayer iGlOverlayLayer = this.E;
            return (iGlOverlayLayer == null || !(obj instanceof BaseOptions)) ? buildingOverlay : (BuildingOverlay) iGlOverlayLayer.addOverlayObject(strCreateId, buildingOverlay, (BaseOptions) obj);
        } catch (Exception e) {
            e.printStackTrace();
            eb.a(e);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final GL3DModel addGLModel(GL3DModelOptions gL3DModelOptions) {
        resetRenderTime();
        String strCreateId = this.E.createId("GL3DMODEL");
        GL3DModel gL3DModel = new GL3DModel(this.E, gL3DModelOptions, strCreateId);
        this.E.addOverlayObject(strCreateId, gL3DModel, gL3DModelOptions);
        return gL3DModel;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final ParticleOverlay addParticleOverlay(ParticleOverlayOptions particleOverlayOptions) {
        if (particleOverlayOptions == null) {
            return null;
        }
        try {
            resetRenderTime();
            dy.c(this.e);
            String strCreateId = this.E.createId("PARTICLEOVERLAY");
            return (ParticleOverlay) this.E.addOverlayObject(strCreateId, new ParticleOverlay(this.E, particleOverlayOptions, strCreateId), particleOverlayOptions);
        } catch (Throwable th) {
            eb.a(th);
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final NavigateArrow addNavigateArrow(NavigateArrowOptions navigateArrowOptions) throws RemoteException {
        if (navigateArrowOptions == null) {
            return null;
        }
        try {
            resetRenderTime();
            NavigateArrowOptions navigateArrowOptionsM760clone = navigateArrowOptions.m760clone();
            String strCreateId = this.E.createId("NAVIGATEARROW");
            NavigateArrow navigateArrow = new NavigateArrow(this.E, navigateArrowOptionsM760clone, strCreateId);
            IGlOverlayLayer iGlOverlayLayer = this.E;
            return iGlOverlayLayer != null ? (NavigateArrow) iGlOverlayLayer.addOverlayObject(strCreateId, navigateArrow, navigateArrowOptionsM760clone) : navigateArrow;
        } catch (Throwable th) {
            eb.a(th);
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
            PolygonOptions polygonOptionsM761clone = polygonOptions.m761clone();
            String strCreateId = this.E.createId("POLYGON");
            Polygon polygon = new Polygon(this.E, polygonOptionsM761clone, strCreateId);
            IGlOverlayLayer iGlOverlayLayer = this.E;
            return iGlOverlayLayer != null ? (Polygon) iGlOverlayLayer.addOverlayObject(strCreateId, polygon, polygonOptionsM761clone) : polygon;
        } catch (Throwable th) {
            eb.a(th);
            ee.a(ed.d, "addPolygon failed " + th.getMessage(), polygonOptions);
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
            CircleOptions circleOptionsM754clone = circleOptions.m754clone();
            String strCreateId = this.E.createId("CIRCLE");
            Circle circle = new Circle(this.E, circleOptionsM754clone, strCreateId);
            IGlOverlayLayer iGlOverlayLayer = this.E;
            return iGlOverlayLayer != null ? (Circle) iGlOverlayLayer.addOverlayObject(strCreateId, circle, circleOptionsM754clone) : circle;
        } catch (Throwable th) {
            eb.a(th);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Arc addArc(ArcOptions arcOptions) throws RemoteException {
        if (arcOptions == null) {
            return null;
        }
        try {
            resetRenderTime();
            ArcOptions arcOptionsM752clone = arcOptions.m752clone();
            String strCreateId = this.E.createId("ARC");
            Arc arc = new Arc(this.E, arcOptionsM752clone, strCreateId);
            IGlOverlayLayer iGlOverlayLayer = this.E;
            return iGlOverlayLayer != null ? (Arc) iGlOverlayLayer.addOverlayObject(strCreateId, arc, arcOptionsM752clone) : arc;
        } catch (Throwable th) {
            eb.a(th);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final GroundOverlay addGroundOverlay(GroundOverlayOptions groundOverlayOptions) throws RemoteException {
        if (groundOverlayOptions == null) {
            return null;
        }
        try {
            resetRenderTime();
            GroundOverlayOptions groundOverlayOptionsM756clone = groundOverlayOptions.m756clone();
            String strCreateId = this.E.createId("GROUNDOVERLAY");
            GroundOverlay groundOverlay = new GroundOverlay(this.E, groundOverlayOptionsM756clone, strCreateId);
            IGlOverlayLayer iGlOverlayLayer = this.E;
            return iGlOverlayLayer != null ? (GroundOverlay) iGlOverlayLayer.addOverlayObject(strCreateId, groundOverlay, groundOverlayOptionsM756clone) : groundOverlay;
        } catch (Throwable th) {
            eb.a(th);
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
            MultiPointOverlayOptions multiPointOverlayOptionsM759clone = multiPointOverlayOptions.m759clone();
            String strCreateId = this.E.createId("MULTIOVERLAY");
            MultiPointOverlay multiPointOverlay = new MultiPointOverlay(this.E, multiPointOverlayOptionsM759clone, strCreateId);
            IGlOverlayLayer iGlOverlayLayer = this.E;
            return iGlOverlayLayer != null ? (MultiPointOverlay) iGlOverlayLayer.addOverlayObject(strCreateId, multiPointOverlay, multiPointOverlayOptionsM759clone) : multiPointOverlay;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean a(BaseOverlay baseOverlay, BaseOptions baseOptions) {
        if (baseOptions instanceof MarkerOptions) {
            return ((Marker) baseOverlay).isIconView();
        }
        return false;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Marker addMarker(MarkerOptions markerOptions) throws RemoteException {
        try {
            resetRenderTime();
            MarkerOptions markerOptionsM758clone = markerOptions.m758clone();
            String strCreateId = this.E.createId("MARKER");
            Marker marker = new Marker(this.E, this.D, markerOptionsM758clone, strCreateId);
            if (a(marker, markerOptionsM758clone)) {
                this.D.addNativeOverlay(marker, markerOptionsM758clone);
                return marker;
            }
            this.E.addOverlayObject(strCreateId, marker, markerOptionsM758clone);
            return marker;
        } catch (Throwable th) {
            eb.a(th);
            ee.a(ed.d, "addMarker failed " + th.getMessage(), markerOptions);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Text addText(TextOptions textOptions) throws RemoteException {
        try {
            resetRenderTime();
            String strCreateId = this.E.createId("TEXT");
            TextOptions textOptionsM762clone = textOptions.m762clone();
            MarkerOptions markerOptionsA = cs.a(textOptionsM762clone);
            Marker marker = new Marker(this.E, null, markerOptionsA, strCreateId);
            marker.setObject(textOptionsM762clone.getObject());
            this.E.addOverlayObject(strCreateId, marker, markerOptionsA);
            return new Text(marker, textOptionsM762clone);
        } catch (Throwable th) {
            eb.a(th);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final ArrayList<Marker> addMarkers(ArrayList<MarkerOptions> arrayList, boolean z) throws RemoteException {
        try {
            resetRenderTime();
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
                getMainHandler().postDelayed(new Runnable() { // from class: com.amap.api.col.3sl.m.19
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            m.this.moveCamera(ap.a(builder.build(), 50));
                        } catch (Throwable unused) {
                        }
                    }
                }, 50L);
            }
            return arrayList2;
        } catch (Throwable th) {
            eb.a(th);
            ee.a(ed.d, "addMarkers failed " + th.getMessage(), arrayList);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final TileOverlay addTileOverlay(TileOverlayOptions tileOverlayOptions) throws RemoteException {
        try {
            TileProvider tileProvider = tileOverlayOptions.getTileProvider();
            if (tileProvider != null && (tileProvider instanceof HeatmapTileProvider)) {
                dy.a(this.e);
            }
            String strCreateId = this.E.createId("TILEOVERLAY");
            TileOverlay tileOverlay = new TileOverlay(this.E, tileOverlayOptions, strCreateId);
            this.E.addOverlayObject(strCreateId, tileOverlay, tileOverlayOptions);
            return tileOverlay;
        } catch (Throwable th) {
            eb.a(th);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final MVTTileOverlay addMVTTileOverlay(MVTTileOverlayOptions mVTTileOverlayOptions) throws RemoteException {
        try {
            this.aO = true;
            if (z.a().b() && !z.a().a("feature_mvt")) {
                eb.a(new AMapException(AMapException.FEATURE_MVT_NOT_SUPPORT));
                return null;
            }
            String strCreateId = this.E.createId("MVTTILEOVERLAY");
            MVTTileOverlay mVTTileOverlay = new MVTTileOverlay(this.E, mVTTileOverlayOptions, strCreateId);
            this.E.addOverlayObject(strCreateId, mVTTileOverlay, mVTTileOverlayOptions);
            return mVTTileOverlay;
        } catch (Throwable th) {
            eb.a(th);
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
            String strCreateId = this.E.createId("HEATMAPLAYER");
            return (HeatMapLayer) this.E.addOverlayObject(strCreateId, new HeatMapLayer(this.E, heatMapLayerOptions, strCreateId), heatMapLayerOptions);
        } catch (Throwable th) {
            eb.a(th);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final HeatMapGridLayer addHeatMapGridLayer(HeatMapGridLayerOptions heatMapGridLayerOptions) throws RemoteException {
        try {
            resetRenderTime();
            if (heatMapGridLayerOptions == null) {
                return null;
            }
            String strCreateId = this.E.createId("HEATMAPGRIDLAYER");
            return (HeatMapGridLayer) this.E.addOverlayObject(strCreateId, new HeatMapGridLayer(this.E, heatMapGridLayerOptions, strCreateId), heatMapGridLayerOptions);
        } catch (Throwable th) {
            eb.a(th);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final GLTFOverlay addGLTFOverlay(GLTFOverlayOptions gLTFOverlayOptions) throws RemoteException {
        try {
            this.aN = true;
            if (z.a().b() && !z.a().a("feature_gltf")) {
                eb.a(new AMapException(AMapException.FEATURE_GLTF_NOT_SUPPORT));
                return null;
            }
            resetRenderTime();
            GLTFOverlayOptions gLTFOverlayOptionsM755clone = gLTFOverlayOptions.m755clone();
            String strCreateId = this.E.createId("GLTFOVERLAY");
            GLTFOverlay gLTFOverlay = new GLTFOverlay(this.E, gLTFOverlayOptionsM755clone, strCreateId);
            this.E.addOverlayObject(strCreateId, gLTFOverlay, gLTFOverlayOptionsM755clone);
            return gLTFOverlay;
        } catch (Throwable th) {
            eb.a(th);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final AMap3DModelTileOverlay add3DModelTileOverlay(AMap3DModelTileOverlayOptions aMap3DModelTileOverlayOptions) throws RemoteException {
        try {
            resetRenderTime();
            String strCreateId = this.E.createId("AMAP3DMODELTILE");
            AMap3DModelTileOverlay aMap3DModelTileOverlay = new AMap3DModelTileOverlay(this.E, aMap3DModelTileOverlayOptions, strCreateId);
            this.E.addOverlayObject(strCreateId, aMap3DModelTileOverlay, aMap3DModelTileOverlayOptions);
            return aMap3DModelTileOverlay;
        } catch (Throwable th) {
            eb.a(th);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final eu addContourLineOverlay(et etVar) {
        try {
            String strCreateId = this.E.createId("CONTOURLINE");
            eu euVar = new eu(this.E, etVar, strCreateId);
            this.E.addOverlayObject(strCreateId, euVar, etVar);
            return euVar;
        } catch (Exception e) {
            eb.a(e);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void clear() throws RemoteException {
        try {
            clear(false);
        } catch (Throwable th) {
            jv.c(th, "AMapDelegateImp", CervicalMucusRecord.Appearance.CLEAR);
            eb.a(th);
            th.printStackTrace();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void clear(boolean z) throws RemoteException {
        String strE;
        String strD;
        try {
            hideInfoWindow();
            cp cpVar = this.L;
            if (cpVar == null) {
                strE = "";
                strD = null;
            } else if (z) {
                strD = cpVar.d();
                strE = this.L.e();
            } else {
                cpVar.f();
                strE = "";
                strD = null;
            }
            this.E.clear(strD, strE);
            queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.m.20
                @Override // java.lang.Runnable
                public final void run() {
                    if (m.this.f == null || m.this.H.get()) {
                        return;
                    }
                    m.this.f.removeNativeAllOverlay(m.this.G);
                }
            });
            this.D.clear();
            resetRenderTime();
        } catch (Throwable th) {
            jv.c(th, "AMapDelegateImp", CervicalMucusRecord.Appearance.CLEAR);
            eb.a(th);
            th.printStackTrace();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getMapType() throws RemoteException {
        return this.Z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapType(int i) throws RemoteException {
        MapConfig mapConfig;
        if (i != this.Z || ((mapConfig = this.f3092b) != null && mapConfig.isCustomStyleEnable())) {
            this.Z = i;
            h(i);
        }
    }

    private void h(int i) {
        int i2;
        int i3;
        this.Z = i;
        if (i == 1) {
            i2 = 0;
            i3 = 0;
        } else {
            i3 = 2;
            if (i == 2) {
                i3 = 1;
            } else {
                if (i == 3) {
                    i3 = 0;
                } else if (i != 4) {
                    if (i != 6) {
                        if (i == 5) {
                            i2 = 0;
                            i3 = 3;
                        } else {
                            try {
                                this.Z = 1;
                                i2 = 0;
                                i3 = 0;
                            } catch (Throwable th) {
                                jv.c(th, "AMapDelegateImp", "setMaptype");
                                th.printStackTrace();
                                eb.a(th);
                                return;
                            }
                        }
                    }
                }
                i2 = 1;
            }
            i2 = 0;
        }
        this.f3092b.setMapStyleMode(i3);
        this.f3092b.setMapStyleTime(i2);
        if (this.f3092b.isCustomStyleEnable()) {
            l lVar = this.aL;
            if (lVar != null && lVar.d()) {
                this.aL.e();
            } else {
                a(this.G, i3, i2);
                this.f3092b.setCustomStyleEnable(false);
            }
            this.z.setLogoEnable(true);
        } else {
            if (this.f3092b.getMapLanguage().equals("en")) {
                setMapLanguage("zh_cn");
            }
            a(this.G, i3, i2);
        }
        resetRenderTime();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean isTrafficEnabled() throws RemoteException {
        return this.f3092b.isTrafficEnabled();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setTrafficEnabled(final boolean z) throws RemoteException {
        try {
            if (this.aA && !this.H.get()) {
                queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.m.22
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (m.this.f3092b.isTrafficEnabled() != z) {
                                m.this.f3092b.setTrafficEnabled(z);
                                m.this.ar.setTrafficMode(z);
                                m.this.f.setTrafficEnable(m.this.G, z);
                                m.this.resetRenderTime();
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                            eb.a(th);
                        }
                    }
                });
                return;
            }
            this.aP.f3172c = z;
            this.aP.f3171b = true;
            this.aP.f = this.G;
        } catch (Throwable th) {
            eb.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean isIndoorEnabled() throws RemoteException {
        return this.f3092b.isIndoorEnable();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setIndoorEnabled(final boolean z) throws RemoteException {
        List listA;
        try {
            if (this.aA && !this.H.get()) {
                this.f3092b.setIndoorEnable(z);
                resetRenderTime();
                if (z) {
                    GLMapEngine gLMapEngine = this.f;
                    if (gLMapEngine != null) {
                        gLMapEngine.setIndoorEnable(this.G, true);
                    }
                } else {
                    GLMapEngine gLMapEngine2 = this.f;
                    if (gLMapEngine2 != null) {
                        gLMapEngine2.setIndoorEnable(this.G, false);
                    }
                    MapConfig mapConfig = this.f3092b;
                    mapConfig.maxZoomLevel = mapConfig.isSetLimitZoomLevel() ? this.f3092b.getMaxZoomLevel() : 20.0f;
                    try {
                        if (this.z.isZoomControlsEnabled() && (listA = this.u.a(AMapWidgetListener.class.hashCode())) != null && listA.size() > 0) {
                            synchronized (listA) {
                                for (int i = 0; i < listA.size(); i++) {
                                    try {
                                        ((AMapWidgetListener) listA.get(i)).invalidateZoomController(this.f3092b.getSZ());
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                dy.c(this.e, z);
                if (this.z.isIndoorSwitchEnabled()) {
                    this.j.post(new Runnable() { // from class: com.amap.api.col.3sl.m.23
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (!z) {
                                if (m.this.C != null) {
                                    m.this.C.i(Boolean.FALSE);
                                    return;
                                }
                                return;
                            }
                            m.this.showIndoorSwitchControlsEnabled(true);
                        }
                    });
                    return;
                }
                return;
            }
            this.bb.f3172c = z;
            this.bb.f3171b = true;
            this.bb.f = this.G;
        } catch (Throwable th2) {
            eb.a(th2);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void set3DBuildingEnabled(boolean z) throws RemoteException {
        try {
            c(this.G);
            a(this.G, z);
            d(this.G);
        } catch (Throwable th) {
            eb.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean isMyLocationEnabled() throws RemoteException {
        return this.F;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMyLocationEnabled(boolean z) throws RemoteException {
        if (this.H.get()) {
            return;
        }
        try {
            en enVar = this.C;
            if (enVar != null) {
                LocationSource locationSource = this.M;
                if (locationSource == null) {
                    enVar.h(Boolean.FALSE);
                } else if (z) {
                    locationSource.activate(this.t);
                    this.C.h(Boolean.TRUE);
                    if (this.L == null) {
                        this.L = new cp(this, this.e);
                    }
                } else {
                    cp cpVar = this.L;
                    if (cpVar != null) {
                        cpVar.c();
                        this.L = null;
                    }
                    this.M.deactivate();
                }
            }
            if (!z) {
                this.z.setMyLocationButtonEnabled(z);
            }
            this.F = z;
            resetRenderTime();
        } catch (Throwable th) {
            jv.c(th, "AMapDelegateImp", "setMyLocationEnabled");
            th.printStackTrace();
            eb.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setLoadOfflineData(final boolean z) throws RemoteException {
        queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.m.24
            @Override // java.lang.Runnable
            public final void run() {
                if (m.this.f != null) {
                    m.this.f.setOfflineDataEnable(m.this.G, z);
                }
            }
        });
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMyLocationStyle(MyLocationStyle myLocationStyle) throws RemoteException {
        if (this.H.get()) {
            return;
        }
        try {
            if (this.L == null) {
                this.L = new cp(this, this.e);
            }
            if (this.L != null) {
                if (myLocationStyle.getInterval() < 1000) {
                    myLocationStyle.interval(1000L);
                }
                LocationSource locationSource = this.M;
                if (locationSource != null && (locationSource instanceof ba)) {
                    ((ba) locationSource).a(myLocationStyle.getInterval());
                    ((ba) this.M).a(myLocationStyle.getMyLocationType());
                }
                this.L.a(myLocationStyle);
            }
        } catch (Throwable th) {
            eb.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMyLocationType(int i) throws RemoteException {
        try {
            cp cpVar = this.L;
            if (cpVar == null || cpVar.a() == null) {
                return;
            }
            this.L.a().myLocationType(i);
            setMyLocationStyle(this.L.a());
        } catch (Throwable th) {
            eb.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final List<Marker> getMapScreenMarkers() throws RemoteException {
        if (!eb.a(getMapWidth(), getMapHeight())) {
            return new ArrayList();
        }
        if (this.H.get()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        List<Marker> mapScreenMarkers = this.E.getMapScreenMarkers();
        if (mapScreenMarkers != null && !mapScreenMarkers.isEmpty()) {
            arrayList.addAll(mapScreenMarkers);
        }
        List<Marker> mapScreenMarkers2 = this.D.getMapScreenMarkers();
        if (!mapScreenMarkers2.isEmpty()) {
            arrayList.addAll(mapScreenMarkers2);
        }
        return arrayList;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapTextEnable(final boolean z) throws RemoteException {
        try {
            if (this.aA && this.aB) {
                resetRenderTime();
                queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.m.25
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            m.this.f.setLabelEnable(m.this.G, z);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            } else {
                this.aU.f3172c = z;
                this.aU.f3171b = true;
                this.aU.f = this.G;
            }
        } catch (Throwable th) {
            eb.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setRoadArrowEnable(final boolean z) throws RemoteException {
        try {
            if (this.aA && this.aB) {
                resetRenderTime();
                queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.m.26
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            m.this.f.setRoadArrowEnable(m.this.G, z);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            } else {
                this.aV.f3172c = z;
                this.aV.f3171b = true;
                this.aV.f = this.G;
            }
        } catch (Throwable th) {
            eb.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setNaviLabelEnable(final boolean z, final int i, final int i2) throws RemoteException {
        try {
            if (this.aA && this.aB) {
                resetRenderTime();
                queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.m.27
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            m.this.f.setNaviLabelEnable(m.this.G, z, i, i2);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
                return;
            }
            this.aW.f3172c = z;
            this.aW.g = i;
            this.aW.h = i2;
            this.aW.f3171b = true;
            this.aW.f = this.G;
        } catch (Throwable th) {
            eb.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setConstructingRoadEnable(final boolean z) {
        try {
            if (this.aA && this.aB) {
                resetRenderTime();
                queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.m.28
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            m.this.f.setMapOpenLayerEnable(z);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            } else {
                this.aX.f3172c = z;
                this.aX.f3171b = true;
                this.aX.f = this.G;
            }
        } catch (Throwable th) {
            eb.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setTrafficStyleWithTexture(final byte[] bArr, final MyTrafficStyle myTrafficStyle) {
        if (this.H.get()) {
            return;
        }
        try {
            if (this.aA && this.aB && bArr != null && myTrafficStyle != null) {
                resetRenderTime();
                queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.m.29
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            m.this.f.setTrafficStyleWithTexture(m.this.G, bArr, myTrafficStyle);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
                return;
            }
            this.aZ.i = bArr;
            this.aZ.j = myTrafficStyle;
            this.aZ.f3171b = true;
            this.aZ.f = this.G;
        } catch (Exception e) {
            eb.a(e);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setTrafficStyleWithTextureData(final byte[] bArr) {
        if (this.H.get()) {
            return;
        }
        try {
            if (this.aA && this.aB && bArr != null) {
                resetRenderTime();
                queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.m.30
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            m.this.f.setTrafficStyleWithTextureData(m.this.G, bArr);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                });
            } else {
                this.aY.i = bArr;
                this.aY.f3171b = true;
                this.aY.f = this.G;
            }
        } catch (Throwable th) {
            eb.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Location getMyLocation() throws RemoteException {
        if (this.M != null) {
            return this.t.f3263a;
        }
        return null;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setLocationSource(LocationSource locationSource) throws RemoteException {
        try {
            if (this.H.get()) {
                return;
            }
            LocationSource locationSource2 = this.M;
            if (locationSource2 != null && (locationSource2 instanceof ba)) {
                locationSource2.deactivate();
            }
            this.M = locationSource;
            if (locationSource != null) {
                this.C.h(Boolean.TRUE);
            } else {
                this.C.h(Boolean.FALSE);
            }
        } catch (Throwable th) {
            jv.c(th, "AMapDelegateImp", "setLocationSource");
            th.printStackTrace();
            eb.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMyLocationRotateAngle(float f) throws RemoteException {
        try {
            cp cpVar = this.L;
            if (cpVar != null) {
                cpVar.a(f);
            }
        } catch (Throwable th) {
            eb.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final UiSettings getAMapUiSettings() throws RemoteException {
        if (this.x == null) {
            this.x = new UiSettings(this.z);
        }
        return this.x;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Projection getAMapProjection() throws RemoteException {
        return new Projection(this.y);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMapClickListener(AMap.OnMapClickListener onMapClickListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(AMap.OnMapClickListener.class.hashCode(), onMapClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMapTouchListener(AMap.OnMapTouchListener onMapTouchListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(AMap.OnMapTouchListener.class.hashCode(), onMapTouchListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnPOIClickListener(AMap.OnPOIClickListener onPOIClickListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(AMap.OnPOIClickListener.class.hashCode(), onPOIClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMapLongClickListener(AMap.OnMapLongClickListener onMapLongClickListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(AMap.OnMapLongClickListener.class.hashCode(), onMapLongClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMarkerClickListener(AMap.OnMarkerClickListener onMarkerClickListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(AMap.OnMarkerClickListener.class.hashCode(), onMarkerClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnPolylineClickListener(AMap.OnPolylineClickListener onPolylineClickListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(AMap.OnPolylineClickListener.class.hashCode(), onPolylineClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMarkerDragListener(AMap.OnMarkerDragListener onMarkerDragListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(AMap.OnMarkerDragListener.class.hashCode(), onMarkerDragListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMaploadedListener(AMap.OnMapLoadedListener onMapLoadedListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(AMap.OnMapLoadedListener.class.hashCode(), onMapLoadedListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnCameraChangeListener(AMap.OnCameraChangeListener onCameraChangeListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(AMap.OnCameraChangeListener.class.hashCode(), onCameraChangeListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnInfoWindowClickListener(AMap.OnInfoWindowClickListener onInfoWindowClickListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(AMap.OnInfoWindowClickListener.class.hashCode(), onInfoWindowClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnIndoorBuildingActiveListener(AMap.OnIndoorBuildingActiveListener onIndoorBuildingActiveListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(AMap.OnIndoorBuildingActiveListener.class.hashCode(), onIndoorBuildingActiveListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMyLocationChangeListener(AMap.OnMyLocationChangeListener onMyLocationChangeListener) {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(AMap.OnMyLocationChangeListener.class.hashCode(), onMyLocationChangeListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setInfoWindowAdapter(AMap.InfoWindowAdapter infoWindowAdapter) throws RemoteException {
        az azVar;
        if (this.H.get() || (azVar = this.w) == null) {
            return;
        }
        azVar.a(infoWindowAdapter);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setInfoWindowAdapter(AMap.CommonInfoWindowAdapter commonInfoWindowAdapter) throws RemoteException {
        az azVar;
        if (this.H.get() || (azVar = this.w) == null) {
            return;
        }
        azVar.a(commonInfoWindowAdapter);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMultiPointClickListener(AMap.OnMultiPointClickListener onMultiPointClickListener) {
        this.aK = onMultiPointClickListener;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final String getMapContentApprovalNumber() {
        MapConfig mapConfig = this.f3092b;
        if (mapConfig == null || mapConfig.isCustomStyleEnable()) {
            return null;
        }
        dy.d(this.e);
        String strA = dr.a(this.e, "approval_number", "mc", "");
        return !TextUtils.isEmpty(strA) ? strA : "GS（2024）2108号 | GS（2023）2175号";
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final String getSatelliteImageApprovalNumber() {
        dy.e(this.e);
        String strA = dr.a(this.e, "approval_number", "si", "");
        return !TextUtils.isEmpty(strA) ? strA : "GS（2025）0817号";
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final String getTerrainApprovalNumber() {
        dy.f(this.e);
        String strA = dr.a(this.e, "approval_number", w9.m, "");
        return !TextUtils.isEmpty(strA) ? strA : "GS(2021)6352号";
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapLanguage(String str) {
        MapConfig mapConfig;
        if (TextUtils.isEmpty(str) || (mapConfig = this.f3092b) == null || mapConfig.isCustomStyleEnable() || this.f3092b.getMapLanguage().equals(str)) {
            return;
        }
        if (!str.equals("en")) {
            this.f3092b.setMapLanguage("zh_cn");
            this.ah = 0;
        } else {
            if (this.Z != 1) {
                try {
                    setMapType(1);
                } catch (Throwable th) {
                    eb.a(th);
                    th.printStackTrace();
                }
            }
            this.f3092b.setMapLanguage("en");
            this.ah = Constant.INSTALL_FAILED_UNKNOW;
        }
        try {
            b(getCameraPosition());
        } catch (Throwable th2) {
            eb.a(th2);
            th2.printStackTrace();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setWorldVectorMapStyle(String str) {
        if (a(false, true) || TextUtils.isEmpty(str) || this.f3092b == null || this.bg.equals(str)) {
            return;
        }
        this.bg = str;
        com.autonavi.extra.b bVar = this.be;
        if (bVar != null) {
            bVar.i();
        }
        resetRenderTime();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final String getWorldVectorMapStyle() {
        return this.bg;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final String getCurrentWorldVectorMapStyle() {
        try {
            com.autonavi.extra.b bVar = this.be;
            if (bVar != null) {
                Object objJ = bVar.j();
                if (objJ instanceof String) {
                    return (String) objJ;
                }
                return "";
            }
            return "";
        } catch (Throwable th) {
            eb.a(th);
            return "";
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void accelerateNetworkInChinese(boolean z) {
        com.autonavi.extra.b bVar = this.be;
        if (bVar != null) {
            bVar.i();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final String getWorldVectorMapLanguage() {
        return this.bf;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void getMapPrintScreen(AMap.onMapPrintScreenListener onmapprintscreenlistener) {
        try {
            this.u.a(Integer.valueOf(AMap.onMapPrintScreenListener.class.hashCode()), onmapprintscreenlistener);
            this.V = 20;
            this.W = true;
            resetRenderTime();
        } catch (Throwable th) {
            eb.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void getMapScreenShot(AMap.OnMapScreenShotListener onMapScreenShotListener, boolean z) {
        try {
            this.u.a(Integer.valueOf(AMap.OnMapScreenShotListener.class.hashCode()), onMapScreenShotListener);
            this.V = 20;
            this.W = z;
            resetRenderTime();
        } catch (Throwable th) {
            eb.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float getScalePerPixel() throws RemoteException {
        try {
            return ((float) ((((Math.cos((getCameraPosition().target.latitude * 3.141592653589793d) / 180.0d) * 2.0d) * 3.141592653589793d) * 6378137.0d) / (Math.pow(2.0d, getZoomLevel()) * 256.0d))) * getMapZoomScale();
        } catch (Throwable th) {
            jv.c(th, "AMapDelegateImp", "getScalePerPixel");
            eb.a(th);
            th.printStackTrace();
            return 0.0f;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setRunLowFrame(boolean z) {
        if (z) {
            return;
        }
        try {
            if (this.ak == -1) {
                n();
            }
        } catch (Throwable th) {
            eb.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removecache() throws RemoteException {
        removecache(null);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removecache(AMap.OnCacheRemoveListener onCacheRemoveListener) throws RemoteException {
        if (this.j == null || this.f == null) {
            return;
        }
        try {
            d dVar = new d(this.e, onCacheRemoveListener);
            this.j.removeCallbacks(dVar);
            this.j.post(dVar);
        } catch (Throwable th) {
            jv.c(th, "AMapDelegateImp", "removecache");
            th.printStackTrace();
            eb.a(th);
        }
    }

    final class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f3180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AMap.OnCacheRemoveListener f3181c;

        public d(Context context, AMap.OnCacheRemoveListener onCacheRemoveListener) {
            this.f3180b = context;
            this.f3181c = onCacheRemoveListener;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0032  */
        @Override // java.lang.Runnable
        public final void run() {
            boolean zDeleteFile;
            Throwable th;
            AMap.OnCacheRemoveListener onCacheRemoveListener;
            AMap.OnCacheRemoveListener onCacheRemoveListener2;
            boolean z = true;
            try {
                Context applicationContext = this.f3180b.getApplicationContext();
                String strC = eb.c(applicationContext);
                String strA = eb.a(applicationContext);
                File file = new File(strC);
                zDeleteFile = file.exists() ? FileUtil.deleteFile(file) : true;
                if (zDeleteFile) {
                    try {
                        if (FileUtil.deleteFile(new File(strA))) {
                            zDeleteFile = true;
                        } else {
                            zDeleteFile = false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            eb.a(th);
                            jv.c(th, "AMapDelegateImp", "RemoveCacheRunnable");
                            try {
                                if (m.this.f == null || r1 == null) {
                                    return;
                                }
                                this.f3181c.onRemoveCacheFinish(false);
                                return;
                            } catch (Throwable th3) {
                                return;
                            }
                        } finally {
                            try {
                                if (m.this.f != null && (onCacheRemoveListener = this.f3181c) != null) {
                                    onCacheRemoveListener.onRemoveCacheFinish(zDeleteFile);
                                }
                            } catch (Throwable th4) {
                                th4.printStackTrace();
                            }
                        }
                    }
                } else {
                    zDeleteFile = false;
                }
                z = zDeleteFile && eb.e(applicationContext);
                if (m.this.E != null) {
                    m.this.E.clearTileCache();
                }
                try {
                    if (m.this.f == null || (onCacheRemoveListener2 = this.f3181c) == null) {
                        return;
                    }
                    onCacheRemoveListener2.onRemoveCacheFinish(z);
                } catch (Throwable th5) {
                    th5.printStackTrace();
                }
            } catch (Throwable th6) {
                zDeleteFile = z;
                th = th6;
            }
        }

        public final boolean equals(Object obj) {
            return obj instanceof d;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCustomRenderer(CustomRenderer customRenderer) throws RemoteException {
        this.ai = customRenderer;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCenterToPixel(int i, int i2) throws RemoteException {
        this.J = true;
        this.aG = i;
        this.aH = i2;
        if (this.aB && this.aA) {
            if (this.f3092b.getAnchorX() == this.aG && this.f3092b.getAnchorY() == this.aH) {
                return;
            }
            this.f3092b.setAnchorX(this.aG);
            this.f3092b.setAnchorY(this.aH);
            queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.m.31
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        m.this.f3092b.setAnchorX(Math.max(0, Math.min(m.this.aG, m.this.g)));
                        m.this.f3092b.setAnchorY(Math.max(0, Math.min(m.this.aH, m.this.h)));
                        m.this.f.setProjectionCenter(m.this.G, m.this.f3092b.getAnchorX(), m.this.f3092b.getAnchorY());
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapTextZIndex(int i) throws RemoteException {
        this.ah = i;
        this.i = false;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getMapTextZIndex() throws RemoteException {
        return this.ah;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setRenderFps(int i) {
        try {
            if (i == -1) {
                this.ak = i;
            } else {
                this.ak = Math.max(10, Math.min(i, 120));
            }
            dy.g(this.e);
        } catch (Throwable th) {
            eb.a(th);
            th.printStackTrace();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setIndoorBuildingInfo(IndoorBuildingInfo indoorBuildingInfo) throws RemoteException {
        if (this.H.get() || indoorBuildingInfo == null || indoorBuildingInfo.activeFloorName == null || indoorBuildingInfo.poiid == null) {
            return;
        }
        this.f3093c = (ay) indoorBuildingInfo;
        resetRenderTime();
        queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.m.33
            @Override // java.lang.Runnable
            public final void run() {
                if (m.this.f != null) {
                    m.this.f.setIndoorBuildingToBeActive(m.this.G, m.this.f3093c.activeFloorName, m.this.f3093c.activeFloorIndex, m.this.f3093c.poiid);
                }
            }
        });
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setAMapGestureListener(AMapGestureListener aMapGestureListener) {
        ab abVar = this.as;
        if (abVar != null) {
            this.v = aMapGestureListener;
            abVar.a(aMapGestureListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float getZoomToSpanLevel(LatLng latLng, LatLng latLng2) {
        try {
            MapConfig mapConfig = getMapConfig();
            if (latLng != null && latLng2 != null && this.aA && !this.H.get()) {
                Pair<Float, IPoint> pairA = eb.a(mapConfig, 0, 0, 0, 0, new LatLngBounds.Builder().include(latLng).include(latLng2).build(), getMapWidth(), getMapHeight());
                if (pairA != null) {
                    return ((Float) pairA.first).floatValue();
                }
                GLMapState gLMapState = new GLMapState(this.G, this.f.getNativeInstance());
                float mapZoomer = gLMapState.getMapZoomer();
                gLMapState.recycle();
                return mapZoomer;
            }
            return mapConfig.getSZ();
        } catch (Throwable th) {
            eb.a(th);
            return 0.0f;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Pair<Float, LatLng> calculateZoomToSpanLevel(int i, int i2, int i3, int i4, LatLng latLng, LatLng latLng2) {
        if (latLng != null && latLng2 != null && i == i2 && i2 == i3 && i3 == i4 && latLng.latitude == latLng2.latitude && latLng.longitude == latLng2.longitude) {
            return new Pair<>(Float.valueOf(getMaxZoomLevel()), latLng);
        }
        MapConfig mapConfig = getMapConfig();
        if (latLng != null && latLng2 != null && this.aA && !this.H.get()) {
            LatLngBounds.Builder builder = new LatLngBounds.Builder();
            builder.include(latLng);
            builder.include(latLng2);
            GLMapState gLMapState = new GLMapState(this.G, this.f.getNativeInstance());
            Pair<Float, IPoint> pairA = eb.a(mapConfig, i, i2, i3, i4, builder.build(), getMapWidth(), getMapHeight());
            gLMapState.recycle();
            if (pairA == null) {
                return null;
            }
            DPoint dPointObtain = DPoint.obtain();
            GLMapState.geo2LonLat(((IPoint) pairA.second).x, ((IPoint) pairA.second).y, dPointObtain);
            Pair<Float, LatLng> pair = new Pair<>(pairA.first, new LatLng(dPointObtain.y, dPointObtain.x));
            dPointObtain.recycle();
            return pair;
        }
        DPoint dPointObtain2 = DPoint.obtain();
        GLMapState.geo2LonLat((int) mapConfig.getSX(), (int) mapConfig.getSY(), dPointObtain2);
        Pair<Float, LatLng> pair2 = new Pair<>(Float.valueOf(mapConfig.getSZ()), new LatLng(dPointObtain2.y, dPointObtain2.x));
        dPointObtain2.recycle();
        return pair2;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMaxZoomLevel(float f) {
        this.f3092b.setMaxZoomLevel(f);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMinZoomLevel(float f) {
        this.f3092b.setMinZoomLevel(f);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0049 */
    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void resetMinMaxZoomPreference() {
        List listA;
        this.f3092b.resetMinMaxZoomPreference();
        if (!this.z.isZoomControlsEnabled() || !this.f3092b.isNeedUpdateZoomControllerState() || (listA = this.u.a(AMapWidgetListener.class.hashCode())) == null || listA.size() <= 0) {
            return;
        }
        synchronized (listA) {
            for (int i = 0; i < listA.size(); i++) {
                try {
                    ((AMapWidgetListener) listA.get(i)).invalidateZoomController(this.f3092b.getSZ());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapStatusLimits(LatLngBounds latLngBounds) {
        try {
            this.f3092b.setLimitLatLngBounds(latLngBounds);
            q();
        } catch (Throwable th) {
            th.printStackTrace();
            eb.a(th);
        }
    }

    private static boolean a(LatLngBounds latLngBounds) {
        return (latLngBounds == null || latLngBounds.northeast == null || latLngBounds.southwest == null) ? false : true;
    }

    private void q() {
        try {
            LatLngBounds limitLatLngBounds = this.f3092b.getLimitLatLngBounds();
            if (this.f != null && a(limitLatLngBounds)) {
                GLMapState gLMapState = new GLMapState(this.G, this.f.getNativeInstance());
                IPoint iPointObtain = IPoint.obtain();
                GLMapState.lonlat2Geo(limitLatLngBounds.northeast.longitude, limitLatLngBounds.northeast.latitude, iPointObtain);
                IPoint iPointObtain2 = IPoint.obtain();
                GLMapState.lonlat2Geo(limitLatLngBounds.southwest.longitude, limitLatLngBounds.southwest.latitude, iPointObtain2);
                this.f3092b.setLimitIPoints(new IPoint[]{iPointObtain, iPointObtain2});
                gLMapState.recycle();
                return;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f3092b.setLimitIPoints(null);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Handler getMainHandler() {
        return this.j;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void onChangeFinish() {
        Message messageObtainMessage = this.j.obtainMessage();
        messageObtainMessage.what = 11;
        this.j.sendMessage(messageObtainMessage);
    }

    protected final void a(CameraPosition cameraPosition) {
        MapConfig mapConfig = this.f3092b;
        if (mapConfig == null || mapConfig.getChangedCounter() == 0) {
            return;
        }
        try {
            if (!this.ay && this.f.getAnimateionsCount() == 0 && this.f.getStateMessageCount() == 0) {
                AMapGestureListener aMapGestureListener = this.v;
                if (aMapGestureListener != null) {
                    aMapGestureListener.onMapStable();
                }
                if (this.B.isEnabled()) {
                    try {
                        List listA = this.u.a(AMap.OnCameraChangeListener.class.hashCode());
                        if (listA != null && listA.size() != 0) {
                            if (cameraPosition == null) {
                                try {
                                    cameraPosition = getCameraPosition();
                                } catch (Throwable th) {
                                    jv.c(th, "AMapDelegateImp", "cameraChangeFinish");
                                    th.printStackTrace();
                                }
                            }
                            synchronized (listA) {
                                Iterator it = listA.iterator();
                                while (it.hasNext()) {
                                    ((AMap.OnCameraChangeListener) it.next()).onCameraChangeFinish(cameraPosition);
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    this.f3092b.resetChangedCounter();
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
            eb.a(th2);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setZoomScaleParam(float f) {
        this.av = f;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void onFling() {
        IGlOverlayLayer iGlOverlayLayer = this.E;
        if (iGlOverlayLayer != null) {
            iGlOverlayLayer.setFlingState(true);
        }
        this.U = true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getMapWidth() {
        return this.g;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getMapHeight() {
        return this.h;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float getCameraAngle() {
        return getCameraDegree(this.G);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float getSkyHeight() {
        return this.f3092b.getSkyHeight();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean isMaploaded() {
        return this.K;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final MapConfig getMapConfig() {
        return this.f3092b;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final View getView() throws RemoteException {
        en enVar = this.C;
        if (enVar != null) {
            return enVar.j();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00c2  */
    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void onIndoorBuildingActivity(int i, byte[] bArr) {
        ay ayVar;
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    ayVar = new ay();
                    byte b2 = bArr[0];
                    ayVar.f2228a = new String(bArr, 1, b2, "utf-8");
                    int i2 = b2 + 2;
                    byte b3 = bArr[b2 + 1];
                    ayVar.f2229b = new String(bArr, i2, b3, "utf-8");
                    int i3 = i2 + b3;
                    int i4 = i3 + 1;
                    byte b4 = bArr[i3];
                    ayVar.activeFloorName = new String(bArr, i4, b4, "utf-8");
                    int i5 = i4 + b4;
                    ayVar.activeFloorIndex = GLConvertUtil.getInt(bArr, i5);
                    int i6 = i5 + 5;
                    byte b5 = bArr[i5 + 4];
                    ayVar.poiid = new String(bArr, i6, b5, "utf-8");
                    int i7 = i6 + b5;
                    int i8 = i7 + 1;
                    byte b6 = bArr[i7];
                    ayVar.h = new String(bArr, i8, b6, "utf-8");
                    int i9 = i8 + b6;
                    ayVar.f2230c = GLConvertUtil.getInt(bArr, i9);
                    int i10 = i9 + 4;
                    ayVar.floor_indexs = new int[ayVar.f2230c];
                    ayVar.floor_names = new String[ayVar.f2230c];
                    ayVar.d = new String[ayVar.f2230c];
                    for (int i11 = 0; i11 < ayVar.f2230c; i11++) {
                        ayVar.floor_indexs[i11] = GLConvertUtil.getInt(bArr, i10);
                        int i12 = i10 + 5;
                        byte b7 = bArr[i10 + 4];
                        if (b7 > 0) {
                            ayVar.floor_names[i11] = new String(bArr, i12, b7, "utf-8");
                            i12 += b7;
                        }
                        i10 = i12 + 1;
                        byte b8 = bArr[i12];
                        if (b8 > 0) {
                            ayVar.d[i11] = new String(bArr, i10, b8, "utf-8");
                            i10 += b8;
                        }
                    }
                    ayVar.e = GLConvertUtil.getInt(bArr, i10);
                    int i13 = i10 + 4;
                    if (ayVar.e > 0) {
                        ayVar.f = new int[ayVar.e];
                        for (int i14 = 0; i14 < ayVar.e; i14++) {
                            ayVar.f[i14] = GLConvertUtil.getInt(bArr, i13);
                            i13 += 4;
                        }
                    }
                } else {
                    ayVar = null;
                }
            } catch (Throwable th) {
                eb.a(th);
                th.printStackTrace();
                return;
            }
        } else {
            ayVar = null;
        }
        this.bm = ayVar;
        post(new Runnable() { // from class: com.amap.api.col.3sl.m.34
            @Override // java.lang.Runnable
            public final void run() {
                if (m.this.aI != null) {
                    m.this.aI.a(m.this.bm);
                }
            }
        });
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void destroy() {
        this.H.set(true);
        ee.a(ed.f2416c, "destroy map");
        try {
            LocationSource locationSource = this.M;
            if (locationSource != null) {
                locationSource.deactivate();
            }
            this.M = null;
            this.aI = null;
            GLMapRender gLMapRender = this.ar;
            if (gLMapRender != null) {
                gLMapRender.renderPause();
            }
            i();
            Thread thread = this.ab;
            if (thread != null) {
                thread.interrupt();
                this.ab = null;
            }
            Thread thread2 = this.ac;
            if (thread2 != null) {
                thread2.interrupt();
                this.ac = null;
            }
            x xVar = this.ad;
            if (xVar != null) {
                xVar.a();
                this.ad = null;
            }
            s sVar = this.ae;
            if (sVar != null) {
                sVar.b();
                this.ae = null;
            }
            cw cwVar = this.an;
            if (cwVar != null) {
                cwVar.a();
                this.an = null;
            }
            cy cyVar = this.ao;
            if (cyVar != null) {
                cyVar.a((cy.a) null);
                this.ao.a();
                this.ao = null;
            }
            dp.b();
            GLMapEngine gLMapEngine = this.f;
            if (gLMapEngine != null) {
                gLMapEngine.setMapListener(null);
                queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.m.35
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (m.this.E != null) {
                                m.this.E.destroy();
                            }
                            m mVar = m.this;
                            mVar.destroySurface(mVar.G);
                        } catch (Throwable th) {
                            th.printStackTrace();
                            eb.a(th);
                        }
                    }
                });
                for (int i = 0; this.f != null && i < 50; i++) {
                    try {
                        Thread.sleep(20L);
                    } catch (InterruptedException e) {
                        eb.a(e);
                    }
                }
            }
            IGLSurfaceView iGLSurfaceView = this.B;
            if (iGLSurfaceView != null) {
                try {
                    iGLSurfaceView.onDetachedGLThread();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    eb.a(e2);
                }
            }
            en enVar = this.C;
            if (enVar != null) {
                enVar.g();
                this.C = null;
            }
            cp cpVar = this.L;
            if (cpVar != null) {
                cpVar.c();
                this.L = null;
            }
            this.M = null;
            this.t = null;
            r();
            this.aa = null;
            ee.a();
            jv.b();
        } catch (Throwable th) {
            jv.c(th, "AMapDelegateImp", "destroy");
            eb.a(th);
            th.printStackTrace();
        }
    }

    private void r() {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a();
        }
    }

    final class c implements ek.a {
        private c() {
        }

        /* synthetic */ c(m mVar, byte b2) {
            this();
        }

        @Override // com.amap.api.col.3sl.ek.a
        public final void a(int i) {
            if (m.this.f3093c != null) {
                m.this.f3093c.activeFloorIndex = m.this.f3093c.floor_indexs[i];
                m.this.f3093c.activeFloorName = m.this.f3093c.floor_names[i];
                try {
                    m mVar = m.this;
                    mVar.setIndoorBuildingInfo(mVar.f3093c);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    final class b {
        b() {
        }

        public final void a(ay ayVar) {
            List listA;
            List listA2;
            if (m.this.f3092b == null || !m.this.f3092b.isIndoorEnable()) {
                return;
            }
            final ek ekVarE = m.this.C.e();
            if (ayVar == null) {
                try {
                    List listA3 = m.this.u.a(AMap.OnIndoorBuildingActiveListener.class.hashCode());
                    if (listA3 != null && listA3.size() > 0) {
                        synchronized (listA3) {
                            for (int i = 0; i < listA3.size(); i++) {
                                try {
                                    ((AMap.OnIndoorBuildingActiveListener) listA3.get(i)).OnIndoorBuilding(ayVar);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                if (m.this.f3093c != null) {
                    m.this.f3093c.g = null;
                }
                if (ekVarE.b()) {
                    m.this.j.post(new Runnable() { // from class: com.amap.api.col.3sl.m.b.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            ekVarE.a(false);
                        }
                    });
                }
                m.this.f3092b.maxZoomLevel = m.this.f3092b.isSetLimitZoomLevel() ? m.this.f3092b.getMaxZoomLevel() : 20.0f;
                try {
                    if (!m.this.z.isZoomControlsEnabled() || (listA = m.this.u.a(AMapWidgetListener.class.hashCode())) == null || listA.size() <= 0) {
                        return;
                    }
                    synchronized (listA) {
                        for (int i2 = 0; i2 < listA.size(); i2++) {
                            try {
                                ((AMapWidgetListener) listA.get(i2)).invalidateZoomController(m.this.f3092b.getSZ());
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
            if (ayVar != null && ayVar.floor_indexs != null && ayVar.floor_names != null && ayVar.floor_indexs.length == ayVar.floor_names.length) {
                for (int i3 = 0; i3 < ayVar.floor_indexs.length; i3++) {
                    if (ayVar.activeFloorIndex == ayVar.floor_indexs[i3]) {
                        ayVar.activeFloorName = ayVar.floor_names[i3];
                        break;
                    }
                }
            }
            if (ayVar == null || m.this.f3093c == null || m.this.f3093c.activeFloorIndex == ayVar.activeFloorIndex || !ekVarE.b()) {
                if (ayVar != null && (m.this.f3093c == null || !m.this.f3093c.poiid.equals(ayVar.poiid) || m.this.f3093c.g == null)) {
                    m.this.f3093c = ayVar;
                    if (m.this.f3092b != null) {
                        if (m.this.f3093c.g == null) {
                            m.this.f3093c.g = new Point();
                        }
                        DPoint mapGeoCenter = m.this.f3092b.getMapGeoCenter();
                        if (mapGeoCenter != null) {
                            m.this.f3093c.g.x = (int) mapGeoCenter.x;
                            m.this.f3093c.g.y = (int) mapGeoCenter.y;
                        }
                    }
                }
                try {
                    List listA4 = m.this.u.a(AMap.OnIndoorBuildingActiveListener.class.hashCode());
                    if (listA4 != null && listA4.size() > 0) {
                        synchronized (listA4) {
                            for (int i4 = 0; i4 < listA4.size(); i4++) {
                                ((AMap.OnIndoorBuildingActiveListener) listA4.get(i4)).OnIndoorBuilding(ayVar);
                            }
                        }
                    }
                    m.this.f3092b.maxZoomLevel = m.this.f3092b.isSetLimitZoomLevel() ? m.this.f3092b.getMaxZoomLevel() : 20.0f;
                    if (m.this.z.isZoomControlsEnabled() && (listA2 = m.this.u.a(AMapWidgetListener.class.hashCode())) != null && listA2.size() > 0) {
                        synchronized (listA2) {
                            for (int i5 = 0; i5 < listA2.size(); i5++) {
                                ((AMapWidgetListener) listA2.get(i5)).invalidateZoomController(m.this.f3092b.getSZ());
                            }
                        }
                    }
                    if (!m.this.z.isIndoorSwitchEnabled()) {
                        if (m.this.z.isIndoorSwitchEnabled() || !ekVarE.b()) {
                            return;
                        }
                        m.this.z.setIndoorSwitchEnabled(false);
                        return;
                    }
                    if (!ekVarE.b()) {
                        m.this.z.setIndoorSwitchEnabled(true);
                    }
                    m.this.j.post(new Runnable() { // from class: com.amap.api.col.3sl.m.b.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                ekVarE.a(m.this.f3093c.floor_names);
                                ekVarE.a(m.this.f3093c.activeFloorName);
                                if (ekVarE.b()) {
                                    return;
                                }
                                ekVarE.a(true);
                            } catch (Throwable th5) {
                                th5.printStackTrace();
                            }
                        }
                    });
                } catch (Throwable th5) {
                    th5.printStackTrace();
                }
            }
        }
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void beforeDrawLabel(int i, GLMapState gLMapState) {
        k();
        GLMapEngine gLMapEngine = this.f;
        if (gLMapEngine != null) {
            gLMapEngine.pushRendererState();
        }
        this.bj = this.E.draw(0, this.ah, this.i) ? this.bj : this.bj + 1;
        GLMapEngine gLMapEngine2 = this.f;
        if (gLMapEngine2 != null) {
            gLMapEngine2.popRendererState();
        }
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void afterDrawLabel(int i, GLMapState gLMapState) {
        k();
        com.autonavi.extra.b bVar = this.be;
        if (bVar != null) {
            bVar.e();
        }
        GLMapEngine gLMapEngine = this.f;
        if (gLMapEngine != null) {
            gLMapEngine.pushRendererState();
        }
        this.bj = this.E.draw(1, this.ah, this.i) ? this.bj : this.bj + 1;
        GLMapEngine gLMapEngine2 = this.f;
        if (gLMapEngine2 != null) {
            gLMapEngine2.popRendererState();
        }
        ae aeVar = this.D;
        if (aeVar != null) {
            aeVar.updateOverlaysPosition();
        }
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void afterRendererOver(int i, GLMapState gLMapState) {
        GLMapEngine gLMapEngine = this.f;
        if (gLMapEngine != null) {
            gLMapEngine.pushRendererState();
        }
        this.E.draw(2, this.ah, this.i);
        GLMapEngine gLMapEngine2 = this.f;
        if (gLMapEngine2 != null) {
            gLMapEngine2.popRendererState();
        }
        CustomRenderer customRenderer = this.ai;
        if (customRenderer != null) {
            customRenderer.onDrawFrame(null);
        }
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void afterDrawFrame(int i, GLMapState gLMapState) {
        float mapZoomer = gLMapState.getMapZoomer();
        GLMapEngine gLMapEngine = this.f;
        if (gLMapEngine == null || (!gLMapEngine.isInMapAction(i) && !this.f.isInMapAnimation(i))) {
            int i2 = this.ak;
            if (i2 != -1) {
                this.ar.setRenderFps(i2);
            } else {
                this.ar.setRenderFps(15.0f);
            }
            if (this.au != mapZoomer) {
                this.au = mapZoomer;
            }
        }
        if (this.aD) {
            return;
        }
        this.aD = true;
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void afterAnimation() {
        redrawInfoWindow();
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void onMapPOIClick(MapPoi mapPoi) {
        List listA;
        MapConfig mapConfig = this.f3092b;
        if (mapConfig == null || !mapConfig.isTouchPoiEnable() || (listA = this.u.a(AMap.OnPOIClickListener.class.hashCode())) == null || listA.size() <= 0 || mapPoi == null) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 20;
        messageObtain.obj = new Poi(mapPoi.getName(), new LatLng(mapPoi.getLatitude(), mapPoi.getLongitude()), mapPoi.getPoiid());
        this.j.sendMessage(messageObtain);
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void onMapBlankClick(double d2, double d3) {
        a(d2, d3);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final long createGLOverlay(int i) {
        GLMapEngine gLMapEngine = this.f;
        if (gLMapEngine != null) {
            return gLMapEngine.createOverlay(this.G, i);
        }
        return 0L;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final long getGlOverlayMgrPtr() {
        GLMapEngine gLMapEngine = this.f;
        if (gLMapEngine != null) {
            return gLMapEngine.getGlOverlayMgrPtr(this.G);
        }
        return 0L;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final CrossOverlay addCrossVector(CrossOverlayOptions crossOverlayOptions) {
        if (crossOverlayOptions == null || crossOverlayOptions.getRes() == null) {
            return null;
        }
        final CrossVectorOverlay crossVectorOverlay = new CrossVectorOverlay(this.G, getContext(), this);
        if (crossOverlayOptions != null) {
            crossVectorOverlay.setAttribute(crossOverlayOptions.getAttribute());
        }
        queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.m.36
            @Override // java.lang.Runnable
            public final void run() {
                GLOverlayBundle overlayBundle;
                if (m.this.f == null || (overlayBundle = m.this.f.getOverlayBundle(m.this.G)) == null) {
                    return;
                }
                overlayBundle.addOverlay(crossVectorOverlay);
            }
        });
        crossVectorOverlay.resumeMarker(crossOverlayOptions.getRes());
        return new CrossOverlay(crossOverlayOptions, crossVectorOverlay);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final RouteOverlay addNaviRouteOverlay() {
        final RouteOverlayInner routeOverlayInner = new RouteOverlayInner(this.G, getContext(), this);
        queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.m.37
            @Override // java.lang.Runnable
            public final void run() {
                GLOverlayBundle overlayBundle;
                if (m.this.f == null || (overlayBundle = m.this.f.getOverlayBundle(m.this.G)) == null) {
                    return;
                }
                overlayBundle.addOverlay(routeOverlayInner);
            }
        });
        return new RouteOverlay(routeOverlayInner);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void addOverlayTexture(int i, GLTextureProperty gLTextureProperty) {
        GLOverlayBundle overlayBundle;
        try {
            GLMapEngine gLMapEngine = this.f;
            if (gLMapEngine != null && (overlayBundle = gLMapEngine.getOverlayBundle(i)) != null && gLTextureProperty != null && gLTextureProperty.mBitmap != null) {
                this.f.addOverlayTexture(i, gLTextureProperty);
                overlayBundle.addOverlayTextureItem(gLTextureProperty.mId, gLTextureProperty.mAnchor, gLTextureProperty.mXRatio, gLTextureProperty.mYRatio, gLTextureProperty.mBitmap.getWidth(), gLTextureProperty.mBitmap.getHeight());
            }
        } catch (Throwable th) {
            eb.a(th);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final int createOverlayTexture(int i, Bitmap bitmap) {
        try {
            GLMapEngine gLMapEngine = this.f;
            if (gLMapEngine == null || bitmap == null) {
                return -1;
            }
            return gLMapEngine.createOverlayTexture(i, bitmap);
        } catch (Throwable th) {
            eb.a(th);
        }
        return -1;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void onAMapAppResourceRequest(AMapAppRequestParam aMapAppRequestParam) {
        r rVar = this.u;
        if (rVar == null) {
            return;
        }
        for (AMap.AMapAppResourceRequestListener aMapAppResourceRequestListener : rVar.a(AMap.AMapAppResourceRequestListener.class.hashCode())) {
            if (aMapAppResourceRequestListener != null) {
                aMapAppResourceRequestListener.onRequest(aMapAppRequestParam);
            }
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setTerrainAuth(boolean z) {
        GLMapEngine gLMapEngine;
        if (this.H.get() || (gLMapEngine = this.f) == null) {
            return;
        }
        gLMapEngine.setTerrainAuth(z);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setOverseaAuth(boolean z) {
        if (this.H.get()) {
            return;
        }
        this.f.setOverseaAuth(z);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean isOverseaAuthed() {
        s sVar = this.ae;
        return sVar != null && sVar.a() == 2;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean isUseGLTF() {
        return this.aN;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean isUseMVT() {
        return this.aO;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void redrawNativeOverlays() {
        this.j.sendEmptyMessage(40);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCustomMapStylePath(String str) {
        if (TextUtils.isEmpty(str) || str.equals(this.f3092b.getCustomStylePath())) {
            return;
        }
        this.f3092b.setCustomStylePath(str);
        this.A = true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCustomMapStyleID(String str) {
        if (TextUtils.isEmpty(str) || str.equals(this.f3092b.getCustomStyleID())) {
            return;
        }
        this.f3092b.setCustomStyleID(str);
        this.A = true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCustomTextureResourcePath(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f3092b.setCustomTextureResourcePath(str);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCustomMapStyle(CustomMapStyleOptions customMapStyleOptions) {
        if (customMapStyleOptions != null) {
            try {
                if (a(true, false)) {
                    return;
                }
                if (customMapStyleOptions.isEnable() && (customMapStyleOptions.getStyleId() != null || customMapStyleOptions.getStyleTexturePath() != null || customMapStyleOptions.getStyleTextureData() != null || customMapStyleOptions.getStyleResDataPath() != null || customMapStyleOptions.getStyleResData() != null)) {
                    p();
                }
                this.aL.c();
                this.aL.a(customMapStyleOptions);
                com.autonavi.extra.b bVar = this.be;
                if (bVar != null) {
                    bVar.i();
                }
            } catch (Throwable th) {
                eb.a(th);
                return;
            }
        }
        resetRenderTime();
    }

    @Override // com.amap.api.col.3sl.l.a
    public final void a() {
        com.autonavi.extra.b bVar = this.be;
        if (bVar != null) {
            bVar.i();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final MyLocationStyle getMyLocationStyle() throws RemoteException {
        cp cpVar = this.L;
        if (cpVar != null) {
            return cpVar.a();
        }
        return null;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void reloadMapCustomStyle() {
        l lVar = this.aL;
        if (lVar != null) {
            lVar.b();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setMapCustomEnable(boolean z, boolean z2) {
        cw cwVar;
        if (this.aA && !this.H.get()) {
            boolean z3 = z2 ? z2 : false;
            if (TextUtils.isEmpty(this.f3092b.getCustomStylePath()) && TextUtils.isEmpty(this.f3092b.getCustomStyleID())) {
                return;
            }
            if (z) {
                try {
                    if (this.f3092b.isProFunctionAuthEnable() && !TextUtils.isEmpty(this.f3092b.getCustomStyleID()) && (cwVar = this.an) != null) {
                        cwVar.a(this.f3092b.getCustomStyleID());
                        this.an.b();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    eb.a(th);
                    return;
                }
            }
            if (z2 || this.A || (this.f3092b.isCustomStyleEnable() ^ z)) {
                a(z, (byte[]) null, z3);
            }
            this.A = false;
            return;
        }
        this.aS.f3171b = true;
        this.aS.f3172c = z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapCustomEnable(boolean z) {
        if (z) {
            p();
        }
        setMapCustomEnable(z, false);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setCustomMapStyle(boolean z, byte[] bArr) {
        a(z, bArr, false);
    }

    private void a(boolean z, byte[] bArr, boolean z2) {
        de deVarA;
        try {
            this.f3092b.setCustomStyleEnable(z);
            if (this.f3092b.isHideLogoEnable()) {
                this.z.setLogoEnable(!z);
            }
            boolean z3 = false;
            if (z) {
                c(this.G, true);
                dd ddVar = new dd();
                MyTrafficStyle myTrafficStyle = this.aa;
                if (myTrafficStyle != null && myTrafficStyle.getTrafficRoadBackgroundColor() != -1) {
                    ddVar.a(this.aa.getTrafficRoadBackgroundColor());
                }
                if (this.f3092b.isProFunctionAuthEnable() && !TextUtils.isEmpty(this.f3092b.getCustomTextureResourcePath())) {
                    z3 = true;
                }
                StyleItem[] styleItemArrC = null;
                if (bArr != null) {
                    deVarA = ddVar.a(bArr, z3);
                    if (deVarA != null && (styleItemArrC = deVarA.c()) != null) {
                        this.f3092b.setUseProFunction(true);
                    }
                } else {
                    deVarA = null;
                }
                if (styleItemArrC == null && (deVarA = ddVar.a(this.f3092b.getCustomStylePath(), z3)) != null) {
                    styleItemArrC = deVarA.c();
                }
                if (ddVar.a() != 0) {
                    this.f3092b.setCustomBackgroundColor(ddVar.a());
                }
                if (deVarA != null && deVarA.d() != null) {
                    if (this.ao != null) {
                        this.ao.a((String) deVarA.d());
                        this.ao.a(deVarA);
                        this.ao.b();
                        return;
                    }
                    return;
                }
                a(styleItemArrC, z2);
                return;
            }
            c(this.G, false);
            a(this.G, this.f3092b.getMapStyleMode(), this.f3092b.getMapStyleTime());
        } catch (Throwable th) {
            eb.a(th);
        }
    }

    @Override // com.amap.api.col.3sl.cy.a
    public final void a(String str, de deVar) {
        setCustomTextureResourcePath(str);
        if (!this.f3092b.isCustomStyleEnable() || deVar == null) {
            return;
        }
        a(deVar.c(), false);
    }

    private void a(StyleItem[] styleItemArr, boolean z) {
        if (z || (styleItemArr != null && styleItemArr.length > 0)) {
            a(this.G, 0, 0, true, styleItemArr);
            dy.a(this.e, true);
        } else {
            dy.a(this.e, false);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void removeEngineGLOverlay(final BaseMapOverlay baseMapOverlay) {
        if (this.f != null) {
            queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.m.38
                @Override // java.lang.Runnable
                public final void run() {
                    m.this.f.getOverlayBundle(m.this.G).removeOverlay(baseMapOverlay);
                }
            });
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float[] getFinalMatrix() {
        MapConfig mapConfig = this.f3092b;
        if (mapConfig != null) {
            return mapConfig.getMvpMatrix();
        }
        return this.m;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final String createId(String str) {
        IGlOverlayLayer iGlOverlayLayer = this.E;
        if (iGlOverlayLayer != null) {
            return iGlOverlayLayer.createId(str);
        }
        return null;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showLogoEnabled(boolean z) {
        if (this.H.get()) {
            return;
        }
        this.C.f(Boolean.valueOf(z));
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float[] getViewMatrix() {
        MapConfig mapConfig = this.f3092b;
        if (mapConfig != null) {
            return mapConfig.getViewMatrix();
        }
        return this.n;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float[] getProjectionMatrix() {
        MapConfig mapConfig = this.f3092b;
        if (mapConfig != null) {
            return mapConfig.getProjectionMatrix();
        }
        return this.o;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void changeSurface(GL10 gl10, int i, int i2) {
        try {
            changeSurface(1, gl10, i, i2);
        } catch (Throwable th) {
            th.printStackTrace();
            eb.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void createSurface(GL10 gl10, EGLConfig eGLConfig) {
        try {
            this.ap = Thread.currentThread().getId();
        } catch (Throwable th) {
            th.printStackTrace();
            eb.a(th);
        }
        try {
            createSurface(1, gl10, eGLConfig);
        } catch (Throwable th2) {
            th2.printStackTrace();
            eb.a(th2);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void renderSurface(GL10 gl10) {
        drawFrame(gl10);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean canStopMapRender() {
        GLMapEngine gLMapEngine = this.f;
        if (gLMapEngine == null) {
            return true;
        }
        gLMapEngine.canStopMapRender(this.G);
        return true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void getLatLngRect(DPoint[] dPointArr) {
        try {
            Rectangle geoRectangle = this.f3092b.getGeoRectangle();
            if (geoRectangle != null) {
                IPoint[] clipRect = geoRectangle.getClipRect();
                for (int i = 0; i < 4; i++) {
                    GLMapState.geo2LonLat(clipRect[i].x, clipRect[i].y, dPointArr[i]);
                }
            }
        } catch (Throwable th) {
            eb.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void checkMapState(IGLMapState iGLMapState) {
        if (this.f3092b == null || this.H.get()) {
            return;
        }
        LatLngBounds limitLatLngBounds = this.f3092b.getLimitLatLngBounds();
        try {
            if (limitLatLngBounds != null) {
                IPoint[] limitIPoints = this.f3092b.getLimitIPoints();
                if (limitIPoints == null) {
                    IPoint iPointObtain = IPoint.obtain();
                    GLMapState.lonlat2Geo(limitLatLngBounds.northeast.longitude, limitLatLngBounds.northeast.latitude, iPointObtain);
                    IPoint iPointObtain2 = IPoint.obtain();
                    GLMapState.lonlat2Geo(limitLatLngBounds.southwest.longitude, limitLatLngBounds.southwest.latitude, iPointObtain2);
                    limitIPoints = new IPoint[]{iPointObtain, iPointObtain2};
                    this.f3092b.setLimitIPoints(limitIPoints);
                }
                float fA = eb.a(this.f3092b, limitIPoints[0].x, limitIPoints[0].y, limitIPoints[1].x, limitIPoints[1].y, getMapWidth(), getMapHeight());
                float mapZoomer = iGLMapState.getMapZoomer();
                if (this.f3092b.isSetLimitZoomLevel()) {
                    float maxZoomLevel = this.f3092b.getMaxZoomLevel();
                    float minZoomLevel = this.f3092b.getMinZoomLevel();
                    fA = fA > maxZoomLevel ? maxZoomLevel : Math.max(fA, Math.min(mapZoomer, maxZoomLevel));
                    if (fA < minZoomLevel) {
                        fA = minZoomLevel;
                    }
                } else if (fA <= 0.0f || mapZoomer >= fA) {
                    fA = mapZoomer;
                }
                iGLMapState.setMapZoomer(fA);
                IPoint iPointObtain3 = IPoint.obtain();
                iGLMapState.getMapGeoCenter(iPointObtain3);
                int[] iArrA = eb.a(limitIPoints[0].x, limitIPoints[0].y, limitIPoints[1].x, limitIPoints[1].y, this.f3092b, iGLMapState, iPointObtain3.x, iPointObtain3.y);
                iGLMapState.setMapGeoCenter(iArrA[0], iArrA[1]);
                iPointObtain3.recycle();
                return;
            }
            if (this.f3092b.isSetLimitZoomLevel()) {
                iGLMapState.setMapZoomer(Math.max(this.f3092b.getMinZoomLevel(), Math.min(iGLMapState.getMapZoomer(), this.f3092b.getMaxZoomLevel())));
            }
        } catch (Throwable th) {
            eb.a(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setRenderMode(int i) {
        try {
            IGLSurfaceView iGLSurfaceView = this.B;
            if (iGLSurfaceView != null) {
                iGLSurfaceView.setRenderMode(i);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void changeSize(int i, int i2) {
        MapConfig mapConfig = this.f3092b;
        if (mapConfig != null) {
            this.g = i;
            this.h = i2;
            mapConfig.setMapWidth(i);
            this.f3092b.setMapHeight(i2);
        }
    }

    public final Size a(Size size) {
        Size size2 = new Size(getMapWidth(), getMapHeight());
        a(getNativeEngineID(), 0, 0, size.getWidth(), size.getHeight(), size.getWidth(), size.getHeight());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(size.getWidth(), size.getHeight());
        getGLMapView().setLayoutParams(layoutParams);
        this.C.f().setLayoutParams(layoutParams);
        changeSize(size.getWidth(), size.getHeight());
        b(false);
        return size2;
    }

    public final void b(Size size) {
        a(getNativeEngineID(), 0, 0, size.getWidth(), size.getHeight(), size.getWidth(), size.getHeight());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        getGLMapView().setLayoutParams(layoutParams);
        this.C.f().setLayoutParams(layoutParams);
        changeSize(size.getWidth(), size.getHeight());
        b(true);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setHideLogoEnble(boolean z) {
        MapConfig mapConfig = this.f3092b;
        if (mapConfig != null) {
            mapConfig.setHideLogoEnble(z);
            if (this.f3092b.isCustomStyleEnable()) {
                this.z.setLogoEnable(!z);
            }
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void changeLogoIconStyle(String str, boolean z, int i) {
        en enVar = this.C;
        if (enVar != null) {
            enVar.a(str, Boolean.valueOf(z), Integer.valueOf(i));
        }
        ak akVar = this.z;
        if (akVar != null) {
            akVar.requestRefreshLogo();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void refreshLogo() {
        en enVar = this.C;
        if (enVar != null) {
            enVar.c();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getUnitLengthByZoom(int i) {
        GLMapState gLMapState = new GLMapState(this.G, this.f.getNativeInstance());
        gLMapState.setMapZoomer(i);
        gLMapState.recalculate();
        float gLUnitWithWin = gLMapState.getGLUnitWithWin(1);
        gLMapState.recycle();
        return gLUnitWithWin;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setTouchPoiEnable(boolean z) {
        MapConfig mapConfig = this.f3092b;
        if (mapConfig != null) {
            mapConfig.setTouchPoiEnable(z);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean isTouchPoiEnable() {
        MapConfig mapConfig = this.f3092b;
        if (mapConfig != null) {
            return mapConfig.isTouchPoiEnable();
        }
        return true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getSY() {
        MapConfig mapConfig = this.f3092b;
        if (mapConfig != null) {
            return (int) mapConfig.getSY();
        }
        return -1;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getSX() {
        MapConfig mapConfig = this.f3092b;
        if (mapConfig != null) {
            return (int) mapConfig.getSX();
        }
        return -1;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final long getNativeMapController() {
        GLMapEngine gLMapEngine = this.f;
        if (gLMapEngine != null) {
            return gLMapEngine.getNativeMapController(this.G);
        }
        return 0L;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getNativeEngineID() {
        return this.G;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnCameraChangeListener(AMap.OnCameraChangeListener onCameraChangeListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(Integer.valueOf(AMap.OnCameraChangeListener.class.hashCode()), onCameraChangeListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMapClickListener(AMap.OnMapClickListener onMapClickListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(Integer.valueOf(AMap.OnMapClickListener.class.hashCode()), onMapClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMarkerDragListener(AMap.OnMarkerDragListener onMarkerDragListener) {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(Integer.valueOf(AMap.OnMarkerDragListener.class.hashCode()), onMarkerDragListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMapLoadedListener(AMap.OnMapLoadedListener onMapLoadedListener) {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(Integer.valueOf(AMap.OnMapLoadedListener.class.hashCode()), onMapLoadedListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMapTouchListener(AMap.OnMapTouchListener onMapTouchListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(Integer.valueOf(AMap.OnMapTouchListener.class.hashCode()), onMapTouchListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMarkerClickListener(AMap.OnMarkerClickListener onMarkerClickListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(Integer.valueOf(AMap.OnMarkerClickListener.class.hashCode()), onMarkerClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnPolylineClickListener(AMap.OnPolylineClickListener onPolylineClickListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(Integer.valueOf(AMap.OnPolylineClickListener.class.hashCode()), onPolylineClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnPOIClickListener(AMap.OnPOIClickListener onPOIClickListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(Integer.valueOf(AMap.OnPOIClickListener.class.hashCode()), onPOIClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMapLongClickListener(AMap.OnMapLongClickListener onMapLongClickListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(Integer.valueOf(AMap.OnMapLongClickListener.class.hashCode()), onMapLongClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnInfoWindowClickListener(AMap.OnInfoWindowClickListener onInfoWindowClickListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(Integer.valueOf(AMap.OnInfoWindowClickListener.class.hashCode()), onInfoWindowClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnIndoorBuildingActiveListener(AMap.OnIndoorBuildingActiveListener onIndoorBuildingActiveListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(Integer.valueOf(AMap.OnIndoorBuildingActiveListener.class.hashCode()), onIndoorBuildingActiveListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMyLocationChangeListener(AMap.OnMyLocationChangeListener onMyLocationChangeListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(Integer.valueOf(AMap.OnMyLocationChangeListener.class.hashCode()), onMyLocationChangeListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnCameraChangeListener(AMap.OnCameraChangeListener onCameraChangeListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.b(Integer.valueOf(AMap.OnCameraChangeListener.class.hashCode()), onCameraChangeListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMapClickListener(AMap.OnMapClickListener onMapClickListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.b(Integer.valueOf(AMap.OnMapClickListener.class.hashCode()), onMapClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMarkerDragListener(AMap.OnMarkerDragListener onMarkerDragListener) {
        r rVar = this.u;
        if (rVar != null) {
            rVar.b(Integer.valueOf(AMap.OnMarkerDragListener.class.hashCode()), onMarkerDragListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMapLoadedListener(AMap.OnMapLoadedListener onMapLoadedListener) {
        r rVar = this.u;
        if (rVar != null) {
            rVar.b(Integer.valueOf(AMap.OnMapLoadedListener.class.hashCode()), onMapLoadedListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMapTouchListener(AMap.OnMapTouchListener onMapTouchListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.b(Integer.valueOf(AMap.OnMapTouchListener.class.hashCode()), onMapTouchListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMarkerClickListener(AMap.OnMarkerClickListener onMarkerClickListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.b(Integer.valueOf(AMap.OnMarkerClickListener.class.hashCode()), onMarkerClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnPolylineClickListener(AMap.OnPolylineClickListener onPolylineClickListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.b(Integer.valueOf(AMap.OnPolylineClickListener.class.hashCode()), onPolylineClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnPOIClickListener(AMap.OnPOIClickListener onPOIClickListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.b(Integer.valueOf(AMap.OnPOIClickListener.class.hashCode()), onPOIClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMapLongClickListener(AMap.OnMapLongClickListener onMapLongClickListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.b(Integer.valueOf(AMap.OnMapLongClickListener.class.hashCode()), onMapLongClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnInfoWindowClickListener(AMap.OnInfoWindowClickListener onInfoWindowClickListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.b(Integer.valueOf(AMap.OnInfoWindowClickListener.class.hashCode()), onInfoWindowClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnIndoorBuildingActiveListener(AMap.OnIndoorBuildingActiveListener onIndoorBuildingActiveListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.b(Integer.valueOf(AMap.OnIndoorBuildingActiveListener.class.hashCode()), onIndoorBuildingActiveListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMyLocationChangeListener(AMap.OnMyLocationChangeListener onMyLocationChangeListener) throws RemoteException {
        r rVar = this.u;
        if (rVar != null) {
            rVar.b(Integer.valueOf(AMap.OnMyLocationChangeListener.class.hashCode()), onMyLocationChangeListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addAMapAppResourceListener(AMap.AMapAppResourceRequestListener aMapAppResourceRequestListener) {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(Integer.valueOf(AMap.AMapAppResourceRequestListener.class.hashCode()), aMapAppResourceRequestListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeAMapAppResourceListener(AMap.AMapAppResourceRequestListener aMapAppResourceRequestListener) {
        r rVar = this.u;
        if (rVar != null) {
            rVar.b(Integer.valueOf(AMap.AMapAppResourceRequestListener.class.hashCode()), aMapAppResourceRequestListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int hideBuildings(final List<LatLng> list) {
        if (this.f == null) {
            return -1;
        }
        FutureTask futureTask = new FutureTask(new Callable<Integer>() { // from class: com.amap.api.col.3sl.m.39
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer call() throws Exception {
                return Integer.valueOf(m.this.f.hideBuildings(list));
            }
        });
        queueEvent(futureTask);
        try {
            return ((Integer) futureTask.get()).intValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return -1;
        } catch (ExecutionException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void showHideBuildings(final int i) {
        if (this.f == null) {
            return;
        }
        queueEvent(new Runnable() { // from class: com.amap.api.col.3sl.m.40
            @Override // java.lang.Runnable
            public final void run() {
                m.this.f.showHideBuildings(i);
            }
        });
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addSignleClickInterceptorListener(AMap.SignleClickInterceptorListener signleClickInterceptorListener) {
        r rVar = this.u;
        if (rVar != null) {
            rVar.a(Integer.valueOf(AMap.SignleClickInterceptorListener.class.hashCode()), signleClickInterceptorListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeSignleClickInterceptorListener(AMap.SignleClickInterceptorListener signleClickInterceptorListener) {
        r rVar = this.u;
        if (rVar != null) {
            rVar.b(Integer.valueOf(AMap.SignleClickInterceptorListener.class.hashCode()), signleClickInterceptorListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCurrentLocation(LatLng latLng) {
        GLMapEngine gLMapEngine = this.f;
        if (gLMapEngine == null) {
            return;
        }
        gLMapEngine.setCurrentLocation(latLng);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addPoiFilter(PoiFilter poiFilter) {
        GLMapEngine gLMapEngine = this.f;
        if (gLMapEngine == null) {
            return;
        }
        gLMapEngine.addPoiFilter(poiFilter);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removePoiFilter(String str) {
        GLMapEngine gLMapEngine = this.f;
        if (gLMapEngine == null) {
            return;
        }
        gLMapEngine.removePoiFilter(str);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void clearPoiFilter() {
        GLMapEngine gLMapEngine = this.f;
        if (gLMapEngine == null) {
            return;
        }
        gLMapEngine.clearPoiFilter();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapOptRecordState(boolean z) {
        GLMapEngine gLMapEngine = this.f;
        if (gLMapEngine == null) {
            return;
        }
        gLMapEngine.setMapOptRecordState(z);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCustomScreenDensity(float f) {
        this.aq = f;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void loadWorldVectorMap(boolean z) {
        MapConfig mapConfig = this.f3092b;
        if (mapConfig != null) {
            mapConfig.setAbroadEnable(z);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final LatLngBounds getOverlayBoundRect(String str) {
        if (this.E.isGLOverlay(str)) {
            Rect overlayBoundRect = this.E.getOverlayBoundRect(str);
            DPoint dPointObtain = DPoint.obtain();
            DPoint dPointObtain2 = DPoint.obtain();
            MapProjection.geo2LonLat(overlayBoundRect.left, overlayBoundRect.bottom, dPointObtain2);
            MapProjection.geo2LonLat(overlayBoundRect.right, overlayBoundRect.top, dPointObtain);
            LatLng latLng = new LatLng(dPointObtain.y, dPointObtain.x);
            LatLng latLng2 = new LatLng(dPointObtain2.y, dPointObtain2.x);
            new LatLng(dPointObtain2.y, dPointObtain.x);
            new LatLng(dPointObtain.y, dPointObtain2.x);
            dPointObtain2.recycle();
            dPointObtain.recycle();
            return new LatLngBounds(latLng2, latLng);
        }
        Rect overlayBoundRect2 = this.D.getOverlayBoundRect(str);
        DPoint dPointObtain3 = DPoint.obtain();
        DPoint dPointObtain4 = DPoint.obtain();
        getPixel2LatLng(overlayBoundRect2.left, overlayBoundRect2.bottom, dPointObtain4);
        getPixel2LatLng(overlayBoundRect2.right, overlayBoundRect2.top, dPointObtain3);
        LatLng latLng3 = new LatLng(dPointObtain3.y, dPointObtain3.x);
        LatLng latLng4 = new LatLng(dPointObtain4.y, dPointObtain4.x);
        new LatLng(dPointObtain4.y, dPointObtain3.x);
        new LatLng(dPointObtain3.y, dPointObtain4.x);
        dPointObtain4.recycle();
        dPointObtain3.recycle();
        return new LatLngBounds(latLng4, latLng3);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setUseForNavi(boolean z) {
        this.al = z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean isUseForNavi() {
        return this.al;
    }

    private boolean a(boolean z, boolean z2) {
        if (z) {
            if (this.bi) {
                dh.a("setCustomMapStyle 和 setWorldVectorMapStyle 不能同时使用，setCustomMapStyle将不会生效");
                return true;
            }
            this.bh = true;
        }
        if (!z2) {
            return false;
        }
        if (this.bh) {
            dh.a("setCustomMapStyle 和 setWorldVectorMapStyle 不能同时使用，setWorldVectorMapStyle将不会生效");
            return true;
        }
        this.bi = true;
        return false;
    }

    private void s() {
        cu cuVar = this.aJ;
        if (cuVar != null) {
            cuVar.a();
            this.aJ = null;
        }
    }
}
