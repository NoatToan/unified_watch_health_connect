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
import defpackage.a6s;
import defpackage.a7s;
import defpackage.aks;
import defpackage.dis;
import defpackage.dks;
import defpackage.e0t;
import defpackage.eht;
import defpackage.g5s;
import defpackage.gls;
import defpackage.gos;
import defpackage.jgt;
import defpackage.jos;
import defpackage.k4s;
import defpackage.ldt;
import defpackage.lks;
import defpackage.m2t;
import defpackage.m5s;
import defpackage.mms;
import defpackage.n4s;
import defpackage.net;
import defpackage.nhs;
import defpackage.nls;
import defpackage.oks;
import defpackage.qls;
import defpackage.t8s;
import defpackage.u8s;
import defpackage.ugt;
import defpackage.vhs;
import defpackage.wls;
import defpackage.xps;
import defpackage.yct;
import defpackage.zdt;
import defpackage.zhs;
import defpackage.zns;
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
public final class i1 implements com.amap.api.col.3sl.k.a, g1.a, IAMapDelegate, IAMapListener {
    public GLTFOverlay A;
    public g1 A0;
    public boolean B;
    public long B0;
    public boolean C;
    public boolean C0;
    public boolean D;
    public boolean D0;
    public boolean E;
    public boolean E0;
    public int F;
    public final Handler F0;
    public boolean G;
    public t0 G0;
    public boolean H;
    public t0 H0;
    public Rect I;
    public t0 I0;
    public int J;
    public t0 J0;
    public MyTrafficStyle K;
    public t0 K0;
    public Thread L;
    public t0 L0;
    public Thread M;
    public t0 M0;
    public jgt N;
    public t0 N0;
    public zdt O;
    public t0 O0;
    public boolean P;
    public t0 P0;
    public boolean Q;
    public t0 Q0;
    public int R;
    public t0 R0;
    public CustomRenderer S;
    public t0 S0;
    public int T;
    public Runnable T0;
    public int U;
    public t0 U0;
    public boolean V;
    public com.autonavi.extra.b V0;
    public List<g5s> W;
    public String W0;
    public com.amap.api.col.p0003sl.i X;
    public String X0;
    public com.amap.api.col.p0003sl.k Y;
    public boolean Y0;
    public qls Z;
    public boolean Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yct f6083a;
    public long a0;
    public int a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ldt f6084b;
    public float b0;
    public EAMapPlatformGestureInfo b1;
    public AMapGestureListener c;
    public Context c0;
    public Point c1;
    public u8s d;
    public GLMapEngine d0;
    public long d1;
    public UiSettings e;
    public GLMapRender e0;
    public String e1;
    public IProjectionDelegate f;
    public k4s f0;
    public t8s f1;
    public final a6s g;
    public boolean g0;
    public float[] g1;
    public boolean h;
    public int h0;
    public float[] h1;
    public boolean i;
    public int i0;
    public float[] i1;
    public final IGLSurfaceView j;
    public float j0;
    public IPoint[] j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.amap.api.col.p0003sl.s f6085k;
    public float k0;
    public float[] k1;
    public ae l;
    public float l0;
    public String l1;
    public final IGlOverlayLayer m;
    public boolean m0;
    public String m1;
    public boolean n;
    public boolean n0;
    public int n1;
    public int o;
    public boolean o0;
    public AtomicBoolean p;
    public volatile boolean p0;
    public boolean q;
    public volatile boolean q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public MapConfig f6086r;
    public boolean r0;
    public boolean s;
    public boolean s0;
    public boolean t;
    public Lock t0;
    public t8s u;
    public int u0;
    public nhs v;
    public int v0;
    public LocationSource w;
    public int w0;
    public boolean x;
    public u0 x0;
    public boolean y;
    public dis y0;
    public Marker z;
    public AMap.OnMultiPointClickListener z0;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ double f6087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ double f6088b;

        public a(double d, double d2) {
            this.f6087a = d;
            this.f6088b = d2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message messageObtain = Message.obtain();
            messageObtain.what = 19;
            messageObtain.arg1 = (int) this.f6087a;
            messageObtain.arg2 = (int) this.f6088b;
            i1.this.F0.sendMessage(messageObtain);
        }
    }

    public class a0 implements Runnable {
        public a0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (i1.this.x0 != null) {
                i1.this.x0.a(i1.this.f1);
            }
        }
    }

    public class b extends t0 {
        public b() {
            super((byte) 0);
        }

        @Override // com.amap.api.col.3sl.i1.t0, java.lang.Runnable
        public final void run() {
            super.run();
            try {
                i1.this.setTrafficEnabled(this.f6137b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class b0 implements Runnable {
        public b0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (i1.this.m != null) {
                    i1.this.m.destroy();
                }
                i1 i1Var = i1.this;
                i1Var.destroySurface(i1Var.o);
            } catch (Throwable th) {
                th.printStackTrace();
                zns.E(th);
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ei f6091a;

        public c(ei eiVar) {
            this.f6091a = eiVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (i1.this.q) {
                return;
            }
            try {
                i1 i1Var = i1.this;
                t8s t8sVar = i1Var.u;
                if (t8sVar != null) {
                    i1Var.setIndoorBuildingInfo(t8sVar);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            this.f6091a.a();
        }
    }

    public class c0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CrossVectorOverlay f6093a;

        public c0(CrossVectorOverlay crossVectorOverlay) {
            this.f6093a = crossVectorOverlay;
        }

        @Override // java.lang.Runnable
        public final void run() {
            GLOverlayBundle overlayBundle;
            i1 i1Var = i1.this;
            GLMapEngine gLMapEngine = i1Var.d0;
            if (gLMapEngine == null || (overlayBundle = gLMapEngine.getOverlayBundle(i1Var.o)) == null) {
                return;
            }
            overlayBundle.addOverlay(this.f6093a);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f6095a;

        public d(int i) {
            this.f6095a = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            GLMapEngine gLMapEngine;
            if (!i1.this.p0 || (gLMapEngine = i1.this.d0) == null) {
                return;
            }
            gLMapEngine.setHighlightSubwayEnable(this.f6095a, false);
        }
    }

    public class d0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RouteOverlayInner f6097a;

        public d0(RouteOverlayInner routeOverlayInner) {
            this.f6097a = routeOverlayInner;
        }

        @Override // java.lang.Runnable
        public final void run() {
            GLOverlayBundle overlayBundle;
            i1 i1Var = i1.this;
            GLMapEngine gLMapEngine = i1Var.d0;
            if (gLMapEngine == null || (overlayBundle = gLMapEngine.getOverlayBundle(i1Var.o)) == null) {
                return;
            }
            overlayBundle.addOverlay(this.f6097a);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f6099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f6100b;
        public final /* synthetic */ int c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ StyleItem[] e;

        public e(int i, int i2, int i3, boolean z, StyleItem[] styleItemArr) {
            this.f6099a = i;
            this.f6100b = i2;
            this.c = i3;
            this.d = z;
            this.e = styleItemArr;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                i1.this.d0.setMapModeAndStyle(this.f6099a, this.f6100b, this.c, this.d, this.e);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class e0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ BaseMapOverlay f6101a;

        public e0(BaseMapOverlay baseMapOverlay) {
            this.f6101a = baseMapOverlay;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i1 i1Var = i1.this;
            i1Var.d0.getOverlayBundle(i1Var.o).removeOverlay(this.f6101a);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f6103a;

        public f(int i) {
            this.f6103a = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                i1.this.d0.clearAllMessages(this.f6103a);
                i1.this.d0.clearAnimations(this.f6103a, true);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class f0 implements Callable<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f6105a;

        public f0(List list) {
            this.f6105a = list;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer call() throws Exception {
            return Integer.valueOf(i1.this.d0.hideBuildings(this.f6105a));
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f6107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f6108b;

        public g(int i, boolean z) {
            this.f6107a = i;
            this.f6108b = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                i1.this.d0.setBuildingEnable(this.f6107a, this.f6108b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class g0 extends t0 {
        public g0() {
            super((byte) 0);
        }

        @Override // com.amap.api.col.3sl.i1.t0, java.lang.Runnable
        public final void run() {
            super.run();
            try {
                i1.this.setTrafficStyleWithTextureData(this.h);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f6109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f6110b;

        public h(boolean z, int i) {
            this.f6109a = z;
            this.f6110b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            GLMapEngine gLMapEngine = i1.this.d0;
            if (gLMapEngine != null) {
                if (this.f6109a) {
                    gLMapEngine.setAllContentEnable(this.f6110b, true);
                } else {
                    gLMapEngine.setAllContentEnable(this.f6110b, false);
                }
                i1.this.d0.setSimple3DEnable(this.f6110b, false);
            }
        }
    }

    public class h0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f6111a;

        public h0(int i) {
            this.f6111a = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i1.this.d0.showHideBuildings(this.f6111a);
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f6113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f6114b;

        public i(boolean z, int i) {
            this.f6113a = z;
            this.f6114b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (this.f6113a) {
                    i1.this.d0.setBuildingTextureEnable(this.f6114b, true);
                } else {
                    i1.this.d0.setBuildingTextureEnable(this.f6114b, false);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class i0 extends t0 {
        public i0() {
            super((byte) 0);
        }

        @Override // com.amap.api.col.3sl.i1.t0, java.lang.Runnable
        public final void run() {
            super.run();
            i1.this.setMapCustomEnable(this.f6137b);
        }
    }

    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LatLngBounds.Builder f6115a;

        public j(LatLngBounds.Builder builder) {
            this.f6115a = builder;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                i1.this.moveCamera(a7s.i(this.f6115a.build(), 50));
            } catch (Throwable unused) {
            }
        }
    }

    public class j0 extends t0 {
        public j0() {
            super((byte) 0);
        }

        @Override // com.amap.api.col.3sl.i1.t0, java.lang.Runnable
        public final void run() {
            super.run();
            i1.this.l(this.e, this.f6137b);
        }
    }

    public class k extends Handler {
        public k(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            eq eqVarF;
            if (message == null || i1.this.p.get()) {
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
                        sb.append(x0.f6304b);
                    }
                    sb.append("]");
                    return;
                }
                if (i == 30) {
                    GLMapEngine gLMapEngine = i1.this.d0;
                    if (gLMapEngine != null) {
                        gLMapEngine.triggerMainThread();
                        return;
                    }
                    return;
                }
                if (i == 40) {
                    if (i1.this.l != null) {
                        i1.this.l.redrawOverlays();
                        return;
                    }
                    return;
                }
                int i2 = 0;
                switch (i) {
                    case 10:
                        CameraPosition cameraPosition = (CameraPosition) message.obj;
                        try {
                            List listA = i1.this.f6084b.a(AMap.OnCameraChangeListener.class.hashCode());
                            if (cameraPosition != null && listA != null && listA.size() > 0) {
                                synchronized (listA) {
                                    try {
                                        Iterator it = listA.iterator();
                                        while (it.hasNext()) {
                                            ((AMap.OnCameraChangeListener) it.next()).onCameraChange(cameraPosition);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                            break;
                        } catch (Throwable th2) {
                            zns.E(th2);
                        }
                        i1.this.f6086r.addChangedCounter();
                        return;
                    case 11:
                        try {
                            CameraPosition cameraPosition2 = i1.this.getCameraPosition();
                            if (cameraPosition2 != null && i1.this.f6085k != null) {
                                i1.this.f6085k.r(cameraPosition2);
                            }
                            i1.this.F(cameraPosition2);
                            if (MapsInitializer.isLoadWorldVectorMap()) {
                                if (i1.this.O == null) {
                                    i1 i1Var = i1.this;
                                    i1Var.O = new zdt(i1Var.c0, i1Var);
                                }
                                if (i1.this.O.a() == 0) {
                                    if (i1.H(i1.this, cameraPosition2)) {
                                        i1.this.d0.setLocationOversea(true);
                                        i1.this.O.d(0L);
                                    } else {
                                        i1.this.d0.setLocationOversea(false);
                                    }
                                }
                            }
                            if (i1.this.o0) {
                                i1.g0(i1.this);
                                if (i1.this.m != null) {
                                    i1.this.m.setFlingState(false);
                                }
                                i1.this.A();
                            }
                            if (i1.this.E) {
                                i1.this.redrawInfoWindow();
                                i1.n0(i1.this);
                            }
                            i1.this.o(cameraPosition2);
                            return;
                        } catch (Throwable th3) {
                            m2t.r(th3, "AMapDelegateImp", "CameraUpdateFinish");
                            zns.E(th3);
                            return;
                        }
                    case 12:
                        if (i1.this.f6085k != null) {
                            i1.this.f6085k.q(Float.valueOf(i1.this.getZoomLevel()));
                            return;
                        }
                        return;
                    case 13:
                        if (i1.this.f6085k != null) {
                            i1.this.f6085k.h();
                            return;
                        }
                        return;
                    case 14:
                        try {
                            List listA2 = i1.this.f6084b.a(AMap.OnMapTouchListener.class.hashCode());
                            if (listA2 == null || listA2.size() <= 0) {
                                return;
                            }
                            synchronized (listA2) {
                                try {
                                    Iterator it2 = listA2.iterator();
                                    while (it2.hasNext()) {
                                        ((AMap.OnMapTouchListener) it2.next()).onTouch((MotionEvent) message.obj);
                                    }
                                } catch (Throwable th4) {
                                    throw th4;
                                }
                                break;
                            }
                            return;
                        } catch (Throwable th5) {
                            m2t.r(th5, "AMapDelegateImp", "onTouchHandler");
                            th5.printStackTrace();
                            return;
                        }
                    case 15:
                        Bitmap bitmap = (Bitmap) message.obj;
                        int i3 = message.arg1;
                        if (bitmap == null || i1.this.f6085k == null) {
                            try {
                                List listA3 = i1.this.f6084b.a(AMap.onMapPrintScreenListener.class.hashCode());
                                ArrayList arrayList = listA3 != null ? new ArrayList(listA3) : null;
                                List listA4 = i1.this.f6084b.a(AMap.OnMapScreenShotListener.class.hashCode());
                                ArrayList arrayList2 = listA4 != null ? new ArrayList(listA4) : null;
                                i1.this.f6084b.d(Integer.valueOf(AMap.onMapPrintScreenListener.class.hashCode()));
                                i1.this.f6084b.d(Integer.valueOf(AMap.OnMapScreenShotListener.class.hashCode()));
                                if (arrayList != null && arrayList.size() > 0) {
                                    synchronized (arrayList) {
                                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                            try {
                                                ((AMap.onMapPrintScreenListener) arrayList.get(i4)).onMapPrint(null);
                                            } catch (Throwable th6) {
                                                throw th6;
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                }
                                if (arrayList2 == null || arrayList2.size() <= 0) {
                                    return;
                                }
                                synchronized (arrayList2) {
                                    while (i2 < arrayList2.size()) {
                                        try {
                                            ((AMap.OnMapScreenShotListener) arrayList2.get(i2)).onMapScreenShot(null);
                                            ((AMap.OnMapScreenShotListener) arrayList2.get(i2)).onMapScreenShot(null, i3);
                                            i2++;
                                        } catch (Throwable th7) {
                                            throw th7;
                                        }
                                    }
                                    break;
                                }
                                return;
                            } catch (Throwable th8) {
                                th8.printStackTrace();
                                return;
                            }
                        }
                        Canvas canvas = new Canvas(bitmap);
                        if (i1.this.G && (eqVarF = i1.this.f6085k.f()) != null) {
                            eqVarF.onDraw(canvas);
                        }
                        i1.this.l.screenShotOverlays(canvas);
                        i1.this.f6085k.k(canvas);
                        try {
                            List listA5 = i1.this.f6084b.a(AMap.onMapPrintScreenListener.class.hashCode());
                            ArrayList arrayList3 = listA5 != null ? new ArrayList(listA5) : null;
                            List listA6 = i1.this.f6084b.a(AMap.OnMapScreenShotListener.class.hashCode());
                            ArrayList arrayList4 = listA6 != null ? new ArrayList(listA6) : null;
                            i1.this.f6084b.d(Integer.valueOf(AMap.onMapPrintScreenListener.class.hashCode()));
                            i1.this.f6084b.d(Integer.valueOf(AMap.OnMapScreenShotListener.class.hashCode()));
                            if (arrayList3 != null && arrayList3.size() > 0) {
                                synchronized (arrayList3) {
                                    for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                                        try {
                                            ((AMap.onMapPrintScreenListener) arrayList3.get(i5)).onMapPrint(new BitmapDrawable(i1.this.c0.getResources(), bitmap));
                                        } catch (Throwable th9) {
                                            throw th9;
                                        }
                                    }
                                    break;
                                }
                            }
                            if (arrayList4 == null || arrayList4.size() <= 0) {
                                return;
                            }
                            synchronized (arrayList4) {
                                while (i2 < arrayList4.size()) {
                                    try {
                                        ((AMap.OnMapScreenShotListener) arrayList4.get(i2)).onMapScreenShot(bitmap);
                                        ((AMap.OnMapScreenShotListener) arrayList4.get(i2)).onMapScreenShot(bitmap, i3);
                                        i2++;
                                    } catch (Throwable th10) {
                                        throw th10;
                                    }
                                }
                                break;
                            }
                            return;
                        } catch (Throwable th11) {
                            th11.printStackTrace();
                            return;
                        }
                    case 16:
                        try {
                            List listA7 = i1.this.f6084b.a(AMap.OnMapLoadedListener.class.hashCode());
                            if (listA7 != null) {
                                synchronized (listA7) {
                                    while (i2 < listA7.size()) {
                                        try {
                                            ((AMap.OnMapLoadedListener) listA7.get(i2)).onMapLoaded();
                                            i2++;
                                        } catch (Throwable th12) {
                                            throw th12;
                                        }
                                    }
                                }
                            }
                            break;
                        } catch (Throwable th13) {
                            m2t.r(th13, "AMapDelegateImp", "onMapLoaded");
                            th13.printStackTrace();
                            zns.E(th13);
                        }
                        if (i1.this.f6085k != null) {
                            i1.this.f6085k.i();
                        }
                        if (i1.this.l != null) {
                            i1.this.l.updateOverlaysPosition();
                        }
                        i1.this.redrawInfoWindow();
                        return;
                    case 17:
                        i1 i1Var2 = i1.this;
                        if (!i1Var2.d0.isInMapAnimation(i1Var2.o) || i1.this.m == null) {
                            return;
                        }
                        i1.this.m.setFlingState(false);
                        return;
                    case 18:
                        if (i1.this.d != null) {
                            i1.this.d.r();
                            return;
                        }
                        return;
                    case 19:
                        List listA8 = i1.this.f6084b.a(AMap.OnMapClickListener.class.hashCode());
                        if (listA8 != null) {
                            DPoint dPointObtain = DPoint.obtain();
                            i1.this.getPixel2LatLng(message.arg1, message.arg2, dPointObtain);
                            try {
                                synchronized (listA8) {
                                    try {
                                        Iterator it3 = listA8.iterator();
                                        while (it3.hasNext()) {
                                            ((AMap.OnMapClickListener) it3.next()).onMapClick(new LatLng(dPointObtain.y, dPointObtain.x));
                                        }
                                    } catch (Throwable th14) {
                                        throw th14;
                                    }
                                    break;
                                }
                                dPointObtain.recycle();
                                return;
                            } catch (Throwable th15) {
                                m2t.r(th15, "AMapDelegateImp", "OnMapClickListener.onMapClick");
                                th15.printStackTrace();
                                return;
                            }
                        }
                        return;
                    case 20:
                        try {
                            List listA9 = i1.this.f6084b.a(AMap.OnPOIClickListener.class.hashCode());
                            if (listA9 == null || listA9.size() <= 0) {
                                return;
                            }
                            synchronized (listA9) {
                                while (i2 < listA9.size()) {
                                    try {
                                        ((AMap.OnPOIClickListener) listA9.get(i2)).onPOIClick((Poi) message.obj);
                                        i2++;
                                    } catch (Throwable th16) {
                                        throw th16;
                                    }
                                }
                                break;
                            }
                            return;
                        } catch (Throwable th17) {
                            m2t.r(th17, "AMapDelegateImp", "OnPOIClickListener.onPOIClick");
                            th17.printStackTrace();
                            return;
                        }
                    default:
                        return;
                }
                m2t.r(th, "AMapDelegateImp", "handleMessage");
                th.printStackTrace();
            } catch (Throwable th18) {
                m2t.r(th18, "AMapDelegateImp", "handleMessage");
                th18.printStackTrace();
            }
        }
    }

    public class k0 extends t0 {
        public k0() {
            super((byte) 0);
        }

        @Override // com.amap.api.col.3sl.i1.t0, java.lang.Runnable
        public final void run() {
            super.run();
            try {
                i1.this.setMapTextEnable(this.f6137b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i1 i1Var = i1.this;
            if (i1Var.d0 == null || i1Var.p.get()) {
                return;
            }
            i1 i1Var2 = i1.this;
            i1Var2.d0.removeNativeAllOverlay(i1Var2.o);
        }
    }

    public class l0 extends t0 {
        public l0() {
            super((byte) 0);
        }

        @Override // com.amap.api.col.3sl.i1.t0, java.lang.Runnable
        public final void run() {
            super.run();
            try {
                i1.this.setRoadArrowEnable(this.f6137b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class m extends t0 {
        public m() {
            super((byte) 0);
        }

        @Override // com.amap.api.col.3sl.i1.t0, java.lang.Runnable
        public final void run() {
            super.run();
            try {
                i1 i1Var = i1.this;
                i1Var.setCenterToPixel(i1Var.v0, i1.this.w0);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class m0 extends t0 {
        public m0() {
            super((byte) 0);
        }

        @Override // com.amap.api.col.3sl.i1.t0, java.lang.Runnable
        public final void run() {
            super.run();
            try {
                i1.this.setNaviLabelEnable(this.f6137b, this.f, this.g);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class n implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f6119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f6120b;

        public n(boolean z, boolean z2) {
            this.f6119a = z;
            this.f6120b = z2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (i1.this.f6086r.isTrafficEnabled() != this.f6119a) {
                    i1.this.f6086r.setTrafficEnabled(this.f6120b);
                    i1.this.e0.setTrafficMode(this.f6119a);
                    i1 i1Var = i1.this;
                    i1Var.d0.setTrafficEnable(i1Var.o, this.f6119a);
                    i1.this.resetRenderTime();
                }
            } catch (Throwable th) {
                th.printStackTrace();
                zns.E(th);
            }
        }
    }

    public class n0 extends t0 {
        public n0() {
            super((byte) 0);
        }

        @Override // com.amap.api.col.3sl.i1.t0, java.lang.Runnable
        public final void run() {
            super.run();
            try {
                i1.this.setTrafficStyleWithTexture(this.h, this.i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public class o implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f6121a;

        public o(boolean z) {
            this.f6121a = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f6121a) {
                i1.this.showIndoorSwitchControlsEnabled(true);
            } else if (i1.this.f6085k != null) {
                i1.this.f6085k.l(Boolean.FALSE);
            }
        }
    }

    public class o0 extends t0 {
        public o0() {
            super((byte) 0);
        }

        @Override // com.amap.api.col.3sl.i1.t0, java.lang.Runnable
        public final void run() {
            super.run();
            i1.this.C(this.e, this.f6137b);
        }
    }

    public class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f6123a;

        public p(boolean z) {
            this.f6123a = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i1 i1Var = i1.this;
            GLMapEngine gLMapEngine = i1Var.d0;
            if (gLMapEngine != null) {
                gLMapEngine.setOfflineDataEnable(i1Var.o, this.f6123a);
            }
        }
    }

    public class p0 extends t0 {
        public p0() {
            super((byte) 0);
        }

        @Override // com.amap.api.col.3sl.i1.t0, java.lang.Runnable
        public final void run() {
            super.run();
            try {
                i1.this.setIndoorEnabled(this.f6137b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class q implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f6125a;

        public q(boolean z) {
            this.f6125a = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                i1 i1Var = i1.this;
                i1Var.d0.setLabelEnable(i1Var.o, this.f6125a);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class q0 implements Runnable {
        public q0() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            eq eqVarF;
            if (i1.this.f6085k == null || (eqVarF = i1.this.f6085k.f()) == null) {
                return;
            }
            eqVarF.l();
        }
    }

    public class r implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f6128a;

        public r(boolean z) {
            this.f6128a = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                i1 i1Var = i1.this;
                i1Var.d0.setRoadArrowEnable(i1Var.o, this.f6128a);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class r0 extends t0 {
        public r0() {
            super((byte) 0);
        }

        @Override // com.amap.api.col.3sl.i1.t0, java.lang.Runnable
        public final void run() {
            super.run();
            i1.this.K(this.e, this.f6137b);
        }
    }

    public class s implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f6130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f6131b;
        public final /* synthetic */ int c;

        public s(boolean z, int i, int i2) {
            this.f6130a = z;
            this.f6131b = i;
            this.c = i2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                i1 i1Var = i1.this;
                i1Var.d0.setNaviLabelEnable(i1Var.o, this.f6130a, this.f6131b, this.c);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class s0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MotionEvent f6132a;

        public s0(MotionEvent motionEvent) {
            this.f6132a = motionEvent;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                i1.this.d0.addGestureSingleTapMessage(this.f6132a.getX(), this.f6132a.getY());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class t implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f6134a;

        public t(boolean z) {
            this.f6134a = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                i1.this.d0.setMapOpenLayerEnable(this.f6134a);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class u implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f6138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MyTrafficStyle f6139b;

        public u(byte[] bArr, MyTrafficStyle myTrafficStyle) {
            this.f6138a = bArr;
            this.f6139b = myTrafficStyle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                i1 i1Var = i1.this;
                i1Var.d0.setTrafficStyleWithTexture(i1Var.o, this.f6138a, this.f6139b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class u0 {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ek f6141a;

            public a(ek ekVar) {
                this.f6141a = ekVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f6141a.j(false);
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ek f6143a;

            public b(ek ekVar) {
                this.f6143a = ekVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.f6143a.k(i1.this.u.floor_names);
                    this.f6143a.i(i1.this.u.activeFloorName);
                    if (this.f6143a.o()) {
                        return;
                    }
                    this.f6143a.j(true);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        public u0() {
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x00ca */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(defpackage.t8s r8) {
            /*
                Method dump skipped, instruction units count: 552
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.3sl.i1.u0.a(t8s):void");
        }
    }

    public class v extends t0 {
        public v() {
            super((byte) 0);
        }

        @Override // com.amap.api.col.3sl.i1.t0, java.lang.Runnable
        public final void run() {
            super.run();
            try {
                i1.this.setConstructingRoadEnable(this.f6137b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class v0 implements ek.d {
        public v0() {
        }

        @Override // com.amap.api.col.3sl.ek.d
        public final void a(int i) {
            i1 i1Var = i1.this;
            t8s t8sVar = i1Var.u;
            if (t8sVar != null) {
                t8sVar.activeFloorIndex = t8sVar.floor_indexs[i];
                t8sVar.activeFloorName = t8sVar.floor_names[i];
                try {
                    i1Var.setIndoorBuildingInfo(t8sVar);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        }

        public /* synthetic */ v0(i1 i1Var, byte b2) {
            this();
        }
    }

    public class w implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f6146a;

        public w(byte[] bArr) {
            this.f6146a = bArr;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                i1 i1Var = i1.this;
                i1Var.d0.setTrafficStyleWithTextureData(i1Var.o, this.f6146a);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class w0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f6148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AMap.OnCacheRemoveListener f6149b;

        public w0(Context context, AMap.OnCacheRemoveListener onCacheRemoveListener) {
            this.f6148a = context;
            this.f6149b = onCacheRemoveListener;
        }

        public final boolean equals(Object obj) {
            return obj instanceof w0;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0035  */
        /* JADX WARN: Code duplicated, block: B:21:0x003f  */
        /* JADX WARN: Code duplicated, block: B:24:0x0048 A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0002, B:5:0x001b, B:22:0x0040, B:24:0x0048), top: B:58:0x0002 }] */
        @Override // java.lang.Runnable
        public final void run() {
            AMap.OnCacheRemoveListener onCacheRemoveListener;
            AMap.OnCacheRemoveListener onCacheRemoveListener2;
            boolean z = true;
            Context applicationContext = this.f6148a.getApplicationContext();
            String strH0 = zns.h0(applicationContext);
            String strV = zns.v(applicationContext);
            File file = new File(strH0);
            boolean zDeleteFile = file.exists() ? FileUtil.deleteFile(file) : true;
            if (!zDeleteFile) {
                zDeleteFile = false;
                if (zDeleteFile) {
                }
                if (i1.this.m != null) {
                    i1.this.m.clearTileCache();
                }
                if (i1.this.d0 != null) {
                    return;
                } else {
                    return;
                }
            }
            try {
                if (FileUtil.deleteFile(new File(strV))) {
                    zDeleteFile = true;
                } else {
                    zDeleteFile = false;
                }
                z = !zDeleteFile && zns.k0(applicationContext);
                if (i1.this.m != null) {
                    i1.this.m.clearTileCache();
                }
                try {
                    if (i1.this.d0 != null || (onCacheRemoveListener2 = this.f6149b) == null) {
                        return;
                    }
                    onCacheRemoveListener2.onRemoveCacheFinish(z);
                    return;
                } catch (Throwable th) {
                    th.printStackTrace();
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
                z = zDeleteFile;
            }
            try {
                zns.E(th);
                m2t.r(th, "AMapDelegateImp", "RemoveCacheRunnable");
                try {
                    if (i1.this.d0 == null || r1 == null) {
                        return;
                    }
                    this.f6149b.onRemoveCacheFinish(false);
                } catch (Throwable th3) {
                }
            } finally {
                try {
                    if (i1.this.d0 != null && (onCacheRemoveListener = this.f6149b) != null) {
                        onCacheRemoveListener.onRemoveCacheFinish(z);
                    }
                } catch (Throwable th4) {
                    th4.printStackTrace();
                }
            }
        }
    }

    public class x implements Runnable {
        public x() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                i1 i1Var = i1.this;
                i1Var.f6086r.setAnchorX(Math.max(0, Math.min(i1Var.v0, i1.this.h0)));
                i1 i1Var2 = i1.this;
                i1Var2.f6086r.setAnchorY(Math.max(0, Math.min(i1Var2.w0, i1.this.i0)));
                i1 i1Var3 = i1.this;
                i1Var3.d0.setProjectionCenter(i1Var3.o, i1.this.f6086r.getAnchorX(), i1.this.f6086r.getAnchorY());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public class y extends t0 {
        public y() {
            super((byte) 0);
        }

        @Override // com.amap.api.col.3sl.i1.t0, java.lang.Runnable
        public final void run() {
            super.run();
            i1.this.h(this.e, this.c, this.d);
        }
    }

    public class z implements Runnable {
        public z() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i1 i1Var = i1.this;
            GLMapEngine gLMapEngine = i1Var.d0;
            if (gLMapEngine != null) {
                int i = i1Var.o;
                t8s t8sVar = i1.this.u;
                gLMapEngine.setIndoorBuildingToBeActive(i, t8sVar.activeFloorName, t8sVar.activeFloorIndex, t8sVar.poiid);
            }
        }
    }

    public i1(IGLSurfaceView iGLSurfaceView, Context context) {
        this(iGLSurfaceView, context, false);
    }

    public static /* synthetic */ boolean H(i1 i1Var, CameraPosition cameraPosition) {
        return i1Var.w(cameraPosition, false);
    }

    public static /* synthetic */ boolean g0(i1 i1Var) {
        i1Var.o0 = false;
        return false;
    }

    public static /* synthetic */ boolean n0(i1 i1Var) {
        i1Var.E = false;
        return false;
    }

    public static boolean v(BaseOverlay baseOverlay, BaseOptions baseOptions) {
        if (baseOptions instanceof MarkerOptions) {
            return ((Marker) baseOverlay).isIconView();
        }
        return false;
    }

    public static boolean x(LatLngBounds latLngBounds) {
        return (latLngBounds == null || latLngBounds.northeast == null || latLngBounds.southwest == null) ? false : true;
    }

    public final void A() {
        this.F0.obtainMessage(17, 1, 0).sendToTarget();
    }

    public final void B(int i2) {
        queueEvent(new d(i2));
    }

    public final void B0() {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.b();
        }
    }

    public final void C(int i2, boolean z2) {
        if (this.p0 && this.q0) {
            resetRenderTime();
            queueEvent(new h(z2, i2));
        } else {
            t0 t0Var = this.R0;
            t0Var.f6137b = z2;
            t0Var.f6136a = true;
            t0Var.e = i2;
        }
    }

    public final void D(Size size) {
        i(getNativeEngineID(), 0, 0, size.getWidth(), size.getHeight(), size.getWidth(), size.getHeight());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        getGLMapView().setLayoutParams(layoutParams);
        this.f6085k.f().setLayoutParams(layoutParams);
        changeSize(size.getWidth(), size.getHeight());
        G(true);
    }

    public final void D0() {
        dis disVar = this.y0;
        if (disVar != null) {
            disVar.a();
            this.y0 = null;
        }
    }

    public final void E(MotionEvent motionEvent) {
        if (!this.y || this.A == null) {
            return;
        }
        int x2 = (int) motionEvent.getX();
        int y2 = (int) (motionEvent.getY() - 60.0f);
        if (this.A.getLatlng() != null) {
            DPoint dPointObtain = DPoint.obtain();
            getPixel2LatLng(x2, y2, dPointObtain);
            LatLng latLng = new LatLng(dPointObtain.y, dPointObtain.x);
            dPointObtain.recycle();
            this.A.setLatLng(latLng);
        }
    }

    public final void F(CameraPosition cameraPosition) {
        if (!this.f6086r.getMapLanguage().equals("en")) {
            if (this.H) {
                return;
            }
            this.H = true;
            C(this.o, true);
            return;
        }
        boolean zW = w(cameraPosition, true);
        if (zW != this.H) {
            this.H = zW;
            C(this.o, zW);
        }
    }

    public final void G(boolean z2) {
        this.m0 = z2;
    }

    public final void J(int i2) {
        if (this.n0) {
            this.n0 = false;
        }
        GLMapRender gLMapRender = this.e0;
        if (gLMapRender != null) {
            gLMapRender.renderPause();
        }
        X(i2);
    }

    public final void K(int i2, boolean z2) {
        if (this.p0 && this.q0) {
            resetRenderTime();
            queueEvent(new i(z2, i2));
        } else {
            t0 t0Var = this.U0;
            t0Var.f6137b = z2;
            t0Var.f6136a = true;
            t0Var.e = i2;
        }
    }

    public final void L(MotionEvent motionEvent) {
        queueEvent(new s0(motionEvent));
    }

    public final boolean M() {
        try {
            GLMapState mapState = this.d0.getMapState(this.o);
            IPoint[] iPointArr = new IPoint[4];
            if (mapState == null) {
                return false;
            }
            IPoint iPointObtain = IPoint.obtain();
            mapState.screenToP20Point(0, 0, iPointObtain);
            iPointArr[0] = iPointObtain;
            IPoint iPointObtain2 = IPoint.obtain();
            mapState.screenToP20Point(this.f6086r.getMapWidth(), 0, iPointObtain2);
            iPointArr[1] = iPointObtain2;
            IPoint iPointObtain3 = IPoint.obtain();
            mapState.screenToP20Point(this.f6086r.getMapWidth(), this.f6086r.getMapHeight(), iPointObtain3);
            iPointArr[2] = iPointObtain3;
            IPoint iPointObtain4 = IPoint.obtain();
            mapState.screenToP20Point(0, this.f6086r.getMapHeight(), iPointObtain4);
            iPointArr[3] = iPointObtain4;
            return !wls.c(iPointArr);
        } catch (Throwable th) {
            th.printStackTrace();
            zns.E(th);
            return false;
        }
    }

    public final float N() {
        if (this.f6086r != null) {
            return getMapConfig().getSZ();
        }
        return 0.0f;
    }

    public final void P(int i2) {
        X(i2);
        GLMapRender gLMapRender = this.e0;
        if (gLMapRender != null) {
            gLMapRender.renderResume();
        }
    }

    public final boolean Q(MotionEvent motionEvent) {
        try {
            List listA = this.f6084b.a(AMap.OnPolylineClickListener.class.hashCode());
            if (listA != null && listA.size() > 0) {
                DPoint dPointObtain = DPoint.obtain();
                getPixel2LatLng((int) motionEvent.getX(), (int) motionEvent.getY(), dPointObtain);
                LatLng latLng = new LatLng(dPointObtain.y, dPointObtain.x);
                dPointObtain.recycle();
                Polyline hitOverlay = this.m.getHitOverlay(latLng, 2);
                if (hitOverlay != null) {
                    synchronized (listA) {
                        try {
                            Iterator it = listA.iterator();
                            while (it.hasNext()) {
                                ((AMap.OnPolylineClickListener) it.next()).onPolylineClick(hitOverlay);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return false;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public final void R() {
        if (this.p0) {
            this.f0.b();
            this.g0 = true;
            this.n0 = true;
            try {
                stopAnimation();
            } catch (RemoteException unused) {
            }
        }
    }

    public final void S(int i2) {
        com.amap.api.col.p0003sl.s sVar = this.f6085k;
        if (sVar != null) {
            if (i2 == 0) {
                if (sVar.b()) {
                    this.f6085k.m(Boolean.FALSE);
                    this.f6085k.c();
                    return;
                }
                return;
            }
            if (sVar.b()) {
                return;
            }
            this.f6085k.m(Boolean.TRUE);
            this.f6085k.c();
        }
    }

    public final boolean T(MotionEvent motionEvent) {
        LatLng position;
        DPoint dPointObtain = DPoint.obtain();
        dPointObtain.x = motionEvent.getX();
        dPointObtain.y = motionEvent.getY();
        boolean z2 = true;
        BaseOverlay hitOverlay = this.l.getHitOverlay(dPointObtain, 1);
        dPointObtain.recycle();
        if ((hitOverlay instanceof Marker) && ((Marker) hitOverlay).getId().contains("MARKER")) {
            try {
                Marker marker = (Marker) hitOverlay;
                this.l.set2Top(marker.getId());
                List listA = this.f6084b.a(AMap.OnMarkerClickListener.class.hashCode());
                if (listA != null && listA.size() > 0) {
                    synchronized (listA) {
                        try {
                            if (listA.size() == 1) {
                                boolean zOnMarkerClick = ((AMap.OnMarkerClickListener) listA.get(0)).onMarkerClick(marker);
                                if (zOnMarkerClick) {
                                    return true;
                                }
                                z2 = zOnMarkerClick;
                            } else {
                                Iterator it = listA.iterator();
                                boolean zOnMarkerClick2 = false;
                                while (it.hasNext()) {
                                    zOnMarkerClick2 |= ((AMap.OnMarkerClickListener) it.next()).onMarkerClick(marker);
                                }
                                if (zOnMarkerClick2) {
                                    return true;
                                }
                                z2 = zOnMarkerClick2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                this.l.showInfoWindow(marker.getId());
                if (!marker.isViewMode() && (position = marker.getPosition()) != null) {
                    IPoint iPointObtain = IPoint.obtain();
                    latlon2Geo(position.latitude, position.longitude, iPointObtain);
                    moveCamera(a7s.e(iPointObtain));
                }
                return z2;
            } catch (Throwable th2) {
                m2t.r(th2, "AMapDelegateImp", "onMarkerTap");
                th2.printStackTrace();
            }
        }
        return false;
    }

    public final void W() {
        this.g0 = true;
        this.n0 = false;
        if (this.C) {
            this.C = false;
        }
        if (this.B) {
            this.B = false;
        }
        if (this.D) {
            this.D = false;
        }
        try {
            if (this.x) {
                List listA = this.f6084b.a(AMap.OnMarkerDragListener.class.hashCode());
                if (listA != null && listA.size() > 0 && this.z != null) {
                    synchronized (listA) {
                        for (int i2 = 0; i2 < listA.size(); i2++) {
                            try {
                                ((AMap.OnMarkerDragListener) listA.get(i2)).onMarkerDragEnd(this.z);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
                this.z = null;
                this.x = false;
            }
        } catch (Throwable th2) {
            m2t.r(th2, "AMapDelegateImp", "OnMarkerDragListener.onMarkerDragEnd");
            th2.printStackTrace();
        }
        if (this.y) {
            if (this.A != null) {
                this.A = null;
            }
            this.y = false;
        }
    }

    public final void X(int i2) {
        queueEvent(new f(i2));
    }

    public final boolean Y(MotionEvent motionEvent) throws RemoteException {
        LatLng position;
        DPoint dPointObtain = DPoint.obtain();
        getPixel2LatLng((int) motionEvent.getX(), (int) motionEvent.getY(), dPointObtain);
        LatLng latLng = new LatLng(dPointObtain.y, dPointObtain.x);
        dPointObtain.recycle();
        boolean z2 = true;
        BaseOverlay hitBaseOverlay = this.m.getHitBaseOverlay(latLng, 1);
        if ((hitBaseOverlay instanceof Marker) && ((Marker) hitBaseOverlay).getId().contains("MARKER")) {
            try {
                Marker marker = (Marker) hitBaseOverlay;
                this.m.set2Top(marker.getId());
                List listA = this.f6084b.a(AMap.OnMarkerClickListener.class.hashCode());
                if (listA != null && listA.size() > 0) {
                    synchronized (listA) {
                        try {
                            if (listA.size() == 1) {
                                boolean zOnMarkerClick = ((AMap.OnMarkerClickListener) listA.get(0)).onMarkerClick(marker);
                                if (zOnMarkerClick) {
                                    return true;
                                }
                                z2 = zOnMarkerClick;
                            } else {
                                Iterator it = listA.iterator();
                                boolean zOnMarkerClick2 = false;
                                while (it.hasNext()) {
                                    zOnMarkerClick2 |= ((AMap.OnMarkerClickListener) it.next()).onMarkerClick(marker);
                                }
                                if (zOnMarkerClick2) {
                                    return true;
                                }
                                z2 = zOnMarkerClick2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                this.m.showInfoWindow(marker.getId());
                if (!marker.isViewMode() && (position = marker.getPosition()) != null) {
                    IPoint iPointObtain = IPoint.obtain();
                    latlon2Geo(position.latitude, position.longitude, iPointObtain);
                    moveCamera(a7s.e(iPointObtain));
                }
                return z2;
            } catch (Throwable th2) {
                m2t.r(th2, "AMapDelegateImp", "onMarkerTap");
                th2.printStackTrace();
            }
        }
        return false;
    }

    public final void Z() {
        GLMapState gLMapState;
        GLMapEngine gLMapEngine = this.d0;
        if (gLMapEngine == null || (gLMapState = (GLMapState) gLMapEngine.getNewMapState(this.o)) == null) {
            return;
        }
        IPoint iPointObtain = IPoint.obtain();
        gLMapState.recalculate();
        gLMapState.getMapGeoCenter(iPointObtain);
        this.f6086r.setSX(((Point) iPointObtain).x);
        this.f6086r.setSY(((Point) iPointObtain).y);
        this.f6086r.setSZ(gLMapState.getMapZoomer());
        this.f6086r.setSC(gLMapState.getCameraDegree());
        this.f6086r.setSR(gLMapState.getMapAngle());
        gLMapState.recycle();
        iPointObtain.recycle();
    }

    @Override // com.amap.api.col.3sl.g1.a
    public final void a() {
        com.autonavi.extra.b bVar = this.V0;
        if (bVar != null) {
            bVar.i();
        }
    }

    public final boolean a0(int i2) {
        GLMapEngine gLMapEngine = this.d0;
        if (gLMapEngine != null) {
            return gLMapEngine.getSrvViewStateBoolValue(i2, 7);
        }
        return false;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void accelerateNetworkInChinese(boolean z2) {
        com.autonavi.extra.b bVar = this.V0;
        if (bVar != null) {
            bVar.i();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final AMap3DModelTileOverlay add3DModelTileOverlay(AMap3DModelTileOverlayOptions aMap3DModelTileOverlayOptions) throws RemoteException {
        try {
            resetRenderTime();
            String strCreateId = this.m.createId("AMAP3DMODELTILE");
            AMap3DModelTileOverlay aMap3DModelTileOverlay = new AMap3DModelTileOverlay(this.m, aMap3DModelTileOverlayOptions, strCreateId);
            this.m.addOverlayObject(strCreateId, aMap3DModelTileOverlay, aMap3DModelTileOverlayOptions);
            return aMap3DModelTileOverlay;
        } catch (Throwable th) {
            zns.E(th);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addAMapAppResourceListener(AMap.AMapAppResourceRequestListener aMapAppResourceRequestListener) {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.e(Integer.valueOf(AMap.AMapAppResourceRequestListener.class.hashCode()), aMapAppResourceRequestListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Arc addArc(ArcOptions arcOptions) throws RemoteException {
        if (arcOptions == null) {
            return null;
        }
        try {
            resetRenderTime();
            ArcOptions arcOptionsM81clone = arcOptions.m81clone();
            String strCreateId = this.m.createId("ARC");
            Arc arc = new Arc(this.m, arcOptionsM81clone, strCreateId);
            IGlOverlayLayer iGlOverlayLayer = this.m;
            return iGlOverlayLayer != null ? (Arc) iGlOverlayLayer.addOverlayObject(strCreateId, arc, arcOptionsM81clone) : arc;
        } catch (Throwable th) {
            zns.E(th);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final BuildingOverlay addBuildingOverlay() {
        try {
            mms.s(this.c0);
            String strCreateId = this.m.createId("BUILDINGOVERLAY");
            BuildingOverlay buildingOverlay = new BuildingOverlay(this.m, strCreateId);
            Field declaredField = BuildingOverlay.class.getDeclaredField("buildingOverlayTotalOptions");
            if (declaredField == null) {
                return null;
            }
            resetRenderTime();
            declaredField.setAccessible(true);
            Object obj = declaredField.get(buildingOverlay);
            IGlOverlayLayer iGlOverlayLayer = this.m;
            return (iGlOverlayLayer == null || !(obj instanceof BaseOptions)) ? buildingOverlay : (BuildingOverlay) iGlOverlayLayer.addOverlayObject(strCreateId, buildingOverlay, (BaseOptions) obj);
        } catch (Exception e2) {
            e2.printStackTrace();
            zns.E(e2);
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
            CircleOptions circleOptionsM83clone = circleOptions.m83clone();
            String strCreateId = this.m.createId("CIRCLE");
            Circle circle = new Circle(this.m, circleOptionsM83clone, strCreateId);
            IGlOverlayLayer iGlOverlayLayer = this.m;
            return iGlOverlayLayer != null ? (Circle) iGlOverlayLayer.addOverlayObject(strCreateId, circle, circleOptionsM83clone) : circle;
        } catch (Throwable th) {
            zns.E(th);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final xps addContourLineOverlay(et etVar) {
        try {
            String strCreateId = this.m.createId("CONTOURLINE");
            xps xpsVar = new xps(this.m, etVar, strCreateId);
            this.m.addOverlayObject(strCreateId, xpsVar, etVar);
            return xpsVar;
        } catch (Exception e2) {
            zns.E(e2);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final CrossOverlay addCrossVector(CrossOverlayOptions crossOverlayOptions) {
        if (crossOverlayOptions == null || crossOverlayOptions.getRes() == null) {
            return null;
        }
        CrossVectorOverlay crossVectorOverlay = new CrossVectorOverlay(this.o, getContext(), this);
        crossVectorOverlay.setAttribute(crossOverlayOptions.getAttribute());
        queueEvent(new c0(crossVectorOverlay));
        crossVectorOverlay.resumeMarker(crossOverlayOptions.getRes());
        return new CrossOverlay(crossOverlayOptions, crossVectorOverlay);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final GL3DModel addGLModel(GL3DModelOptions gL3DModelOptions) {
        resetRenderTime();
        String strCreateId = this.m.createId("GL3DMODEL");
        GL3DModel gL3DModel = new GL3DModel(this.m, gL3DModelOptions, strCreateId);
        this.m.addOverlayObject(strCreateId, gL3DModel, gL3DModelOptions);
        return gL3DModel;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final GLTFOverlay addGLTFOverlay(GLTFOverlayOptions gLTFOverlayOptions) throws RemoteException {
        try {
            this.D0 = true;
            if (eht.a().d() && !eht.a().c("feature_gltf")) {
                zns.E(new AMapException(AMapException.FEATURE_GLTF_NOT_SUPPORT));
                return null;
            }
            resetRenderTime();
            GLTFOverlayOptions gLTFOverlayOptionsM84clone = gLTFOverlayOptions.m84clone();
            String strCreateId = this.m.createId("GLTFOVERLAY");
            GLTFOverlay gLTFOverlay = new GLTFOverlay(this.m, gLTFOverlayOptionsM84clone, strCreateId);
            this.m.addOverlayObject(strCreateId, gLTFOverlay, gLTFOverlayOptionsM84clone);
            return gLTFOverlay;
        } catch (Throwable th) {
            zns.E(th);
            return null;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void addGestureMapMessage(int i2, AbstractGestureMapMessage abstractGestureMapMessage) {
        if (!this.p0 || this.d0 == null) {
            return;
        }
        try {
            abstractGestureMapMessage.isUseAnchor = this.s;
            abstractGestureMapMessage.anchorX = this.f6086r.getAnchorX();
            abstractGestureMapMessage.anchorY = this.f6086r.getAnchorY();
            this.d0.addGestureMessage(i2, abstractGestureMapMessage, this.g.isGestureScaleByMapCenter(), this.f6086r.getAnchorX(), this.f6086r.getAnchorY());
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
            GroundOverlayOptions groundOverlayOptionsM85clone = groundOverlayOptions.m85clone();
            String strCreateId = this.m.createId("GROUNDOVERLAY");
            GroundOverlay groundOverlay = new GroundOverlay(this.m, groundOverlayOptionsM85clone, strCreateId);
            IGlOverlayLayer iGlOverlayLayer = this.m;
            return iGlOverlayLayer != null ? (GroundOverlay) iGlOverlayLayer.addOverlayObject(strCreateId, groundOverlay, groundOverlayOptionsM85clone) : groundOverlay;
        } catch (Throwable th) {
            zns.E(th);
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
            String strCreateId = this.m.createId("HEATMAPGRIDLAYER");
            return (HeatMapGridLayer) this.m.addOverlayObject(strCreateId, new HeatMapGridLayer(this.m, heatMapGridLayerOptions, strCreateId), heatMapGridLayerOptions);
        } catch (Throwable th) {
            zns.E(th);
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
            String strCreateId = this.m.createId("HEATMAPLAYER");
            return (HeatMapLayer) this.m.addOverlayObject(strCreateId, new HeatMapLayer(this.m, heatMapLayerOptions, strCreateId), heatMapLayerOptions);
        } catch (Throwable th) {
            zns.E(th);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final MVTTileOverlay addMVTTileOverlay(MVTTileOverlayOptions mVTTileOverlayOptions) throws RemoteException {
        try {
            this.E0 = true;
            if (eht.a().d() && !eht.a().c("feature_mvt")) {
                zns.E(new AMapException(AMapException.FEATURE_MVT_NOT_SUPPORT));
                return null;
            }
            String strCreateId = this.m.createId("MVTTILEOVERLAY");
            MVTTileOverlay mVTTileOverlay = new MVTTileOverlay(this.m, mVTTileOverlayOptions, strCreateId);
            this.m.addOverlayObject(strCreateId, mVTTileOverlay, mVTTileOverlayOptions);
            return mVTTileOverlay;
        } catch (Throwable th) {
            zns.E(th);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Marker addMarker(MarkerOptions markerOptions) throws RemoteException {
        try {
            resetRenderTime();
            MarkerOptions markerOptionsM87clone = markerOptions.m87clone();
            String strCreateId = this.m.createId("MARKER");
            Marker marker = new Marker(this.m, this.l, markerOptionsM87clone, strCreateId);
            if (v(marker, markerOptionsM87clone)) {
                this.l.addNativeOverlay(marker, markerOptionsM87clone);
            } else {
                this.m.addOverlayObject(strCreateId, marker, markerOptionsM87clone);
            }
            return marker;
        } catch (Throwable th) {
            zns.E(th);
            jos.f(gos.d, "addMarker failed " + th.getMessage(), markerOptions);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final ArrayList<Marker> addMarkers(ArrayList<MarkerOptions> arrayList, boolean z2) throws RemoteException {
        try {
            resetRenderTime();
            ArrayList<Marker> arrayList2 = new ArrayList<>();
            LatLngBounds.Builder builder = LatLngBounds.builder();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                MarkerOptions markerOptions = arrayList.get(i2);
                if (arrayList.get(i2) != null) {
                    arrayList2.add(addMarker(markerOptions));
                    if (markerOptions.getPosition() != null) {
                        builder.include(markerOptions.getPosition());
                    }
                }
            }
            if (z2 && arrayList2.size() > 0) {
                getMainHandler().postDelayed(new j(builder), 50L);
            }
            return arrayList2;
        } catch (Throwable th) {
            zns.E(th);
            jos.i(gos.d, "addMarkers failed " + th.getMessage(), arrayList);
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
            MultiPointOverlayOptions multiPointOverlayOptionsM88clone = multiPointOverlayOptions.m88clone();
            String strCreateId = this.m.createId("MULTIOVERLAY");
            MultiPointOverlay multiPointOverlay = new MultiPointOverlay(this.m, multiPointOverlayOptionsM88clone, strCreateId);
            IGlOverlayLayer iGlOverlayLayer = this.m;
            return iGlOverlayLayer != null ? (MultiPointOverlay) iGlOverlayLayer.addOverlayObject(strCreateId, multiPointOverlay, multiPointOverlayOptionsM88clone) : multiPointOverlay;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final RouteOverlay addNaviRouteOverlay() {
        RouteOverlayInner routeOverlayInner = new RouteOverlayInner(this.o, getContext(), this);
        queueEvent(new d0(routeOverlayInner));
        return new RouteOverlay(routeOverlayInner);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final NavigateArrow addNavigateArrow(NavigateArrowOptions navigateArrowOptions) throws RemoteException {
        if (navigateArrowOptions == null) {
            return null;
        }
        try {
            resetRenderTime();
            NavigateArrowOptions navigateArrowOptionsM89clone = navigateArrowOptions.m89clone();
            String strCreateId = this.m.createId("NAVIGATEARROW");
            NavigateArrow navigateArrow = new NavigateArrow(this.m, navigateArrowOptionsM89clone, strCreateId);
            IGlOverlayLayer iGlOverlayLayer = this.m;
            return iGlOverlayLayer != null ? (NavigateArrow) iGlOverlayLayer.addOverlayObject(strCreateId, navigateArrow, navigateArrowOptionsM89clone) : navigateArrow;
        } catch (Throwable th) {
            zns.E(th);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnCameraChangeListener(AMap.OnCameraChangeListener onCameraChangeListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.e(Integer.valueOf(AMap.OnCameraChangeListener.class.hashCode()), onCameraChangeListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnIndoorBuildingActiveListener(AMap.OnIndoorBuildingActiveListener onIndoorBuildingActiveListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.e(Integer.valueOf(AMap.OnIndoorBuildingActiveListener.class.hashCode()), onIndoorBuildingActiveListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnInfoWindowClickListener(AMap.OnInfoWindowClickListener onInfoWindowClickListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.e(Integer.valueOf(AMap.OnInfoWindowClickListener.class.hashCode()), onInfoWindowClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMapClickListener(AMap.OnMapClickListener onMapClickListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.e(Integer.valueOf(AMap.OnMapClickListener.class.hashCode()), onMapClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMapLoadedListener(AMap.OnMapLoadedListener onMapLoadedListener) {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.e(Integer.valueOf(AMap.OnMapLoadedListener.class.hashCode()), onMapLoadedListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMapLongClickListener(AMap.OnMapLongClickListener onMapLongClickListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.e(Integer.valueOf(AMap.OnMapLongClickListener.class.hashCode()), onMapLongClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMapTouchListener(AMap.OnMapTouchListener onMapTouchListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.e(Integer.valueOf(AMap.OnMapTouchListener.class.hashCode()), onMapTouchListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMarkerClickListener(AMap.OnMarkerClickListener onMarkerClickListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.e(Integer.valueOf(AMap.OnMarkerClickListener.class.hashCode()), onMarkerClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMarkerDragListener(AMap.OnMarkerDragListener onMarkerDragListener) {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.e(Integer.valueOf(AMap.OnMarkerDragListener.class.hashCode()), onMarkerDragListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnMyLocationChangeListener(AMap.OnMyLocationChangeListener onMyLocationChangeListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.e(Integer.valueOf(AMap.OnMyLocationChangeListener.class.hashCode()), onMyLocationChangeListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnPOIClickListener(AMap.OnPOIClickListener onPOIClickListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.e(Integer.valueOf(AMap.OnPOIClickListener.class.hashCode()), onPOIClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addOnPolylineClickListener(AMap.OnPolylineClickListener onPolylineClickListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.e(Integer.valueOf(AMap.OnPolylineClickListener.class.hashCode()), onPolylineClickListener);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void addOverlayTexture(int i2, GLTextureProperty gLTextureProperty) {
        GLOverlayBundle overlayBundle;
        try {
            GLMapEngine gLMapEngine = this.d0;
            if (gLMapEngine != null && (overlayBundle = gLMapEngine.getOverlayBundle(i2)) != null && gLTextureProperty != null && gLTextureProperty.mBitmap != null) {
                this.d0.addOverlayTexture(i2, gLTextureProperty);
                overlayBundle.addOverlayTextureItem(gLTextureProperty.mId, gLTextureProperty.mAnchor, gLTextureProperty.mXRatio, gLTextureProperty.mYRatio, gLTextureProperty.mBitmap.getWidth(), gLTextureProperty.mBitmap.getHeight());
            }
        } catch (Throwable th) {
            zns.E(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final ParticleOverlay addParticleOverlay(ParticleOverlayOptions particleOverlayOptions) {
        if (particleOverlayOptions == null) {
            return null;
        }
        try {
            resetRenderTime();
            mms.l(this.c0);
            String strCreateId = this.m.createId("PARTICLEOVERLAY");
            return (ParticleOverlay) this.m.addOverlayObject(strCreateId, new ParticleOverlay(this.m, particleOverlayOptions, strCreateId), particleOverlayOptions);
        } catch (Throwable th) {
            zns.E(th);
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addPoiFilter(PoiFilter poiFilter) {
        GLMapEngine gLMapEngine = this.d0;
        if (gLMapEngine == null) {
            return;
        }
        gLMapEngine.addPoiFilter(poiFilter);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Polygon addPolygon(PolygonOptions polygonOptions) throws RemoteException {
        if (polygonOptions == null) {
            return null;
        }
        try {
            resetRenderTime();
            PolygonOptions polygonOptionsM90clone = polygonOptions.m90clone();
            String strCreateId = this.m.createId("POLYGON");
            Polygon polygon = new Polygon(this.m, polygonOptionsM90clone, strCreateId);
            IGlOverlayLayer iGlOverlayLayer = this.m;
            return iGlOverlayLayer != null ? (Polygon) iGlOverlayLayer.addOverlayObject(strCreateId, polygon, polygonOptionsM90clone) : polygon;
        } catch (Throwable th) {
            zns.E(th);
            jos.g(gos.d, "addPolygon failed " + th.getMessage(), polygonOptions);
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
            String strCreateId = this.m.createId("POLYLINE");
            Polyline polyline = (Polyline) this.m.addOverlayObject(strCreateId, new Polyline(this.m, polylineOptions, strCreateId), polylineOptions);
            jos.m(gos.d, "addPolyline ".concat(String.valueOf(strCreateId)));
            return polyline;
        } catch (Throwable th) {
            zns.E(th);
            jos.h(gos.d, "addPolyline failed " + th.getMessage(), polylineOptions);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void addSignleClickInterceptorListener(AMap.SignleClickInterceptorListener signleClickInterceptorListener) {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.e(Integer.valueOf(AMap.SignleClickInterceptorListener.class.hashCode()), signleClickInterceptorListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Text addText(TextOptions textOptions) throws RemoteException {
        try {
            resetRenderTime();
            String strCreateId = this.m.createId("TEXT");
            TextOptions textOptionsM91clone = textOptions.m91clone();
            MarkerOptions markerOptionsB = zhs.b(textOptionsM91clone);
            Marker marker = new Marker(this.m, null, markerOptionsB, strCreateId);
            marker.setObject(textOptionsM91clone.getObject());
            this.m.addOverlayObject(strCreateId, marker, markerOptionsB);
            return new Text(marker, textOptionsM91clone);
        } catch (Throwable th) {
            zns.E(th);
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final TileOverlay addTileOverlay(TileOverlayOptions tileOverlayOptions) throws RemoteException {
        try {
            TileProvider tileProvider = tileOverlayOptions.getTileProvider();
            if (tileProvider != null && (tileProvider instanceof HeatmapTileProvider)) {
                mms.c(this.c0);
            }
            String strCreateId = this.m.createId("TILEOVERLAY");
            TileOverlay tileOverlay = new TileOverlay(this.m, tileOverlayOptions, strCreateId);
            this.m.addOverlayObject(strCreateId, tileOverlay, tileOverlayOptions);
            return tileOverlay;
        } catch (Throwable th) {
            zns.E(th);
            return null;
        }
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void afterAnimation() {
        redrawInfoWindow();
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void afterDrawFrame(int i2, GLMapState gLMapState) {
        float mapZoomer = gLMapState.getMapZoomer();
        GLMapEngine gLMapEngine = this.d0;
        if (gLMapEngine == null || (!gLMapEngine.isInMapAction(i2) && !this.d0.isInMapAnimation(i2))) {
            int i3 = this.U;
            if (i3 != -1) {
                this.e0.setRenderFps(i3);
            } else {
                this.e0.setRenderFps(15.0f);
            }
            if (this.j0 != mapZoomer) {
                this.j0 = mapZoomer;
            }
        }
        if (this.s0) {
            return;
        }
        this.s0 = true;
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void afterDrawLabel(int i2, GLMapState gLMapState) {
        m0();
        com.autonavi.extra.b bVar = this.V0;
        if (bVar != null) {
            bVar.e();
        }
        GLMapEngine gLMapEngine = this.d0;
        if (gLMapEngine != null) {
            gLMapEngine.pushRendererState();
        }
        this.a1 = this.m.draw(1, this.R, this.C0) ? this.a1 : this.a1 + 1;
        GLMapEngine gLMapEngine2 = this.d0;
        if (gLMapEngine2 != null) {
            gLMapEngine2.popRendererState();
        }
        ae aeVar = this.l;
        if (aeVar != null) {
            aeVar.updateOverlaysPosition();
        }
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void afterRendererOver(int i2, GLMapState gLMapState) {
        GLMapEngine gLMapEngine = this.d0;
        if (gLMapEngine != null) {
            gLMapEngine.pushRendererState();
        }
        this.m.draw(2, this.R, this.C0);
        GLMapEngine gLMapEngine2 = this.d0;
        if (gLMapEngine2 != null) {
            gLMapEngine2.popRendererState();
        }
        CustomRenderer customRenderer = this.S;
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
    public final void animateCameraWithDurationAndCallback(CameraUpdate cameraUpdate, long j2, AMap.CancelableCallback cancelableCallback) {
        if (cameraUpdate == null) {
            return;
        }
        animateCameraWithDurationAndCallback(cameraUpdate.getCameraUpdateFactoryDelegate(), j2, cancelableCallback);
    }

    public final int b(int i2, Rect rect, int i3, int i4) {
        int engineIDWithType;
        GLMapEngine gLMapEngine = this.d0;
        if (gLMapEngine == null || i2 < 0) {
            engineIDWithType = 0;
        } else {
            engineIDWithType = gLMapEngine.getEngineIDWithType(i2);
            if (this.d0.isEngineCreated(engineIDWithType)) {
                i(engineIDWithType, rect.left, rect.top, rect.width(), rect.height(), i3, i4);
            } else {
                int i5 = this.c0.getResources().getDisplayMetrics().densityDpi;
                float f2 = this.c0.getResources().getDisplayMetrics().density;
                NativeTextGenerate.getInstance().setDensity(f2);
                GLMapEngine.MapViewInitParam mapViewInitParam = new GLMapEngine.MapViewInitParam();
                mapViewInitParam.engineId = engineIDWithType;
                mapViewInitParam.x = rect.left;
                mapViewInitParam.y = rect.top;
                mapViewInitParam.width = rect.width();
                mapViewInitParam.height = rect.height();
                mapViewInitParam.screenWidth = i3;
                mapViewInitParam.screenHeight = i4;
                mapViewInitParam.screenScale = f2;
                mapViewInitParam.textScale = this.l0 * f2;
                mapViewInitParam.mapZoomScale = this.k0;
                mapViewInitParam.taskThreadCount = 3;
                this.d0.createAMapEngineWithFrame(mapViewInitParam);
                GLMapState mapState = this.d0.getMapState(engineIDWithType);
                mapState.setMapZoomer(this.f6086r.getSZ());
                mapState.setCameraDegree(this.f6086r.getSC());
                mapState.setMapAngle(this.f6086r.getSR());
                mapState.setMapGeoCenter(this.f6086r.getSX(), this.f6086r.getSY());
                this.d0.setMapState(engineIDWithType, mapState);
                this.k0 = mapState.calMapZoomScalefactor(i3, i4, i5);
                this.d0.setOvelayBundle(engineIDWithType, new GLOverlayBundle<>(engineIDWithType, this));
            }
        }
        this.p.set(false);
        return engineIDWithType;
    }

    public final boolean b0(MotionEvent motionEvent) {
        DPoint dPointObtain = DPoint.obtain();
        getPixel2LatLng((int) motionEvent.getX(), (int) motionEvent.getY(), dPointObtain);
        LatLng latLng = new LatLng(dPointObtain.y, dPointObtain.x);
        dPointObtain.recycle();
        BaseOverlay hitBaseOverlay = this.m.getHitBaseOverlay(latLng, 3);
        if (!(hitBaseOverlay instanceof GLTFOverlay)) {
            return false;
        }
        GLTFOverlay gLTFOverlay = (GLTFOverlay) hitBaseOverlay;
        if (!gLTFOverlay.isClickable()) {
            return false;
        }
        try {
            this.m.set2Top(gLTFOverlay.getId());
            gLTFOverlay.tapClick();
            return true;
        } catch (Throwable th) {
            m2t.r(th, "AMapDelegateImp", "onGLTFTap");
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void beforeDrawLabel(int i2, GLMapState gLMapState) {
        m0();
        GLMapEngine gLMapEngine = this.d0;
        if (gLMapEngine != null) {
            gLMapEngine.pushRendererState();
        }
        this.a1 = this.m.draw(0, this.R, this.C0) ? this.a1 : this.a1 + 1;
        GLMapEngine gLMapEngine2 = this.d0;
        if (gLMapEngine2 != null) {
            gLMapEngine2.popRendererState();
        }
    }

    public final Size c(Size size) {
        Size size2 = new Size(getMapWidth(), getMapHeight());
        i(getNativeEngineID(), 0, 0, size.getWidth(), size.getHeight(), size.getWidth(), size.getHeight());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(size.getWidth(), size.getHeight());
        getGLMapView().setLayoutParams(layoutParams);
        this.f6085k.f().setLayoutParams(layoutParams);
        changeSize(size.getWidth(), size.getHeight());
        G(false);
        return size2;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Pair<Float, LatLng> calculateZoomToSpanLevel(int i2, int i3, int i4, int i5, LatLng latLng, LatLng latLng2) {
        if (latLng != null && latLng2 != null && i2 == i3 && i3 == i4 && i4 == i5 && latLng.latitude == latLng2.latitude && latLng.longitude == latLng2.longitude) {
            return new Pair<>(Float.valueOf(getMaxZoomLevel()), latLng);
        }
        MapConfig mapConfig = getMapConfig();
        if (latLng == null || latLng2 == null || !this.p0 || this.p.get()) {
            DPoint dPointObtain = DPoint.obtain();
            GLMapState.geo2LonLat((int) mapConfig.getSX(), (int) mapConfig.getSY(), dPointObtain);
            Pair<Float, LatLng> pair = new Pair<>(Float.valueOf(mapConfig.getSZ()), new LatLng(dPointObtain.y, dPointObtain.x));
            dPointObtain.recycle();
            return pair;
        }
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        builder.include(latLng);
        builder.include(latLng2);
        GLMapState gLMapState = new GLMapState(this.o, this.d0.getNativeInstance());
        Pair<Float, IPoint> pairR = zns.r(mapConfig, i2, i3, i4, i5, builder.build(), getMapWidth(), getMapHeight());
        gLMapState.recycle();
        if (pairR == null) {
            return null;
        }
        DPoint dPointObtain2 = DPoint.obtain();
        Object obj = pairR.second;
        GLMapState.geo2LonLat(((Point) ((IPoint) obj)).x, ((Point) ((IPoint) obj)).y, dPointObtain2);
        Pair<Float, LatLng> pair2 = new Pair<>(pairR.first, new LatLng(dPointObtain2.y, dPointObtain2.x));
        dPointObtain2.recycle();
        return pair2;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean canShowIndoorSwitch() {
        t8s t8sVar;
        if (getZoomLevel() < 17.0f || (t8sVar = this.u) == null || t8sVar.g == null) {
            return false;
        }
        FPoint fPointObtain = FPoint.obtain();
        Point point = this.u.g;
        k(point.x, point.y, fPointObtain);
        return this.I.contains((int) ((PointF) fPointObtain).x, (int) ((PointF) fPointObtain).y);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean canStopMapRender() {
        GLMapEngine gLMapEngine = this.d0;
        if (gLMapEngine == null) {
            return true;
        }
        gLMapEngine.canStopMapRender(this.o);
        return true;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void changeGLOverlayIndex() {
        this.m.changeOverlayIndex();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void changeLogoIconStyle(String str, boolean z2, int i2) {
        com.amap.api.col.p0003sl.s sVar = this.f6085k;
        if (sVar != null) {
            sVar.o(str, Boolean.valueOf(z2), Integer.valueOf(i2));
        }
        a6s a6sVar = this.g;
        if (a6sVar != null) {
            a6sVar.requestRefreshLogo();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void changeMapLogo(int i2, boolean z2) {
        if (this.p.get()) {
            return;
        }
        try {
            List listA = this.f6084b.a(AMapWidgetListener.class.hashCode());
            if (listA == null || listA.size() <= 0) {
                return;
            }
            this.f6085k.m(Boolean.valueOf(!z2));
        } catch (Throwable unused) {
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void changeSize(int i2, int i3) {
        MapConfig mapConfig = this.f6086r;
        if (mapConfig != null) {
            this.h0 = i2;
            this.i0 = i3;
            mapConfig.setMapWidth(i2);
            this.f6086r.setMapHeight(i3);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void changeSurface(int i2, GL10 gl10, int i3, int i4) {
        WindowManager windowManager;
        jos.e(gos.c, "changeSurface " + i3 + " " + i4);
        this.s0 = false;
        if (!this.p0) {
            createSurface(i2, gl10, null);
        }
        k4s k4sVar = this.f0;
        if (k4sVar != null && this.c0 != null && ((this.h0 != k4sVar.g() || this.i0 != this.f0.j()) && (windowManager = (WindowManager) this.c0.getSystemService("window")) != null)) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (defaultDisplay != null) {
                defaultDisplay.getRealMetrics(displayMetrics);
                this.f0.c(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            if (this.v != null && defaultDisplay != null) {
                this.v.c(defaultDisplay.getRotation());
            }
        }
        this.h0 = i3;
        this.i0 = i4;
        this.I = new Rect(0, 0, i3, i4);
        this.o = b(i2, new Rect(0, 0, this.h0, this.i0), this.h0, this.i0);
        jos.e(gos.c, "create engine with frame complete");
        if (!this.q0) {
            MapConfig mapConfig = this.f6086r;
            if (mapConfig != null) {
                mapConfig.setMapZoomScale(this.k0);
                this.f6086r.setMapWidth(i3);
                this.f6086r.setMapHeight(i4);
            }
            this.d0.setIndoorEnable(this.o, false);
            this.d0.setSimple3DEnable(this.o, false);
            this.d0.setStyleChangeGradualEnable(this.o, false);
            this.d0.initMapOpenLayer("{\"bounds\" : [{\"x2\" : 235405312,\"x1\" : 188874751,\"y2\" : 85065727,\"y1\" : 122421247}],\"sublyr\" : [{\"type\" : 4,\"sid\" : 9000006,\"zlevel\" : 2}],\"id\" : 9006,\"minzoom\" : 6,\"update_period\" : 90,\"maxzoom\" : 20,\"cachemode\" : 2,\"url\" : \"http://mpsapi.amap.com/ws/mps/lyrdata/ugc/\"}");
            GLMapEngine.InitParam initParam = new GLMapEngine.InitParam();
            AeUtil.initIntersectionRes(this.c0, initParam);
            this.d0.setVectorOverlayPath(initParam.mIntersectionResPath);
            GLMapEngine gLMapEngine = this.d0;
            if (gLMapEngine != null) {
                gLMapEngine.setRenderFlags(true);
            }
        }
        synchronized (this) {
            this.q0 = true;
        }
        if (this.s) {
            this.f6086r.setAnchorX(Math.max(1, Math.min(this.v0, i3 - 1)));
            this.f6086r.setAnchorY(Math.max(1, Math.min(this.w0, i4 - 1)));
        } else {
            this.f6086r.setAnchorX(i3 >> 1);
            this.f6086r.setAnchorY(i4 >> 1);
        }
        this.d0.setProjectionCenter(this.o, this.f6086r.getAnchorX(), this.f6086r.getAnchorY());
        this.h = true;
        t0 t0Var = this.R0;
        if (t0Var.f6136a) {
            t0Var.run();
        }
        t0 t0Var2 = this.I0;
        if (t0Var2.f6136a) {
            t0Var2.run();
        }
        t0 t0Var3 = this.J0;
        if (t0Var3.f6136a) {
            t0Var3.run();
        }
        t0 t0Var4 = this.G0;
        if (t0Var4.f6136a) {
            t0Var4.run();
        }
        t0 t0Var5 = this.K0;
        if (t0Var5.f6136a) {
            t0Var5.run();
        }
        t0 t0Var6 = this.U0;
        if (t0Var6.f6136a) {
            t0Var6.run();
        }
        t0 t0Var7 = this.L0;
        if (t0Var7.f6136a) {
            t0Var7.run();
        }
        t0 t0Var8 = this.M0;
        if (t0Var8.f6136a) {
            t0Var8.run();
        }
        t0 t0Var9 = this.N0;
        if (t0Var9.f6136a) {
            t0Var9.run();
        }
        t0 t0Var10 = this.S0;
        if (t0Var10.f6136a) {
            t0Var10.run();
        }
        t0 t0Var11 = this.H0;
        if (t0Var11.f6136a) {
            t0Var11.run();
        }
        t0 t0Var12 = this.O0;
        if (t0Var12.f6136a) {
            t0Var12.run();
        }
        t0 t0Var13 = this.P0;
        if (t0Var13 != null) {
            t0Var13.run();
        }
        t0 t0Var14 = this.Q0;
        if (t0Var14 != null) {
            t0Var14.run();
        }
        CustomRenderer customRenderer = this.S;
        if (customRenderer != null) {
            customRenderer.onSurfaceChanged(gl10, i3, i4);
        }
        com.autonavi.extra.b bVar = this.V0;
        if (bVar != null) {
            bVar.d();
        }
        Handler handler = this.F0;
        if (handler != null) {
            handler.post(this.T0);
        }
        redrawInfoWindow();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void checkMapState(IGLMapState iGLMapState) {
        if (this.f6086r == null || this.p.get()) {
            return;
        }
        LatLngBounds limitLatLngBounds = this.f6086r.getLimitLatLngBounds();
        try {
            if (limitLatLngBounds == null) {
                if (this.f6086r.isSetLimitZoomLevel()) {
                    iGLMapState.setMapZoomer(Math.max(this.f6086r.getMinZoomLevel(), Math.min(iGLMapState.getMapZoomer(), this.f6086r.getMaxZoomLevel())));
                    return;
                }
                return;
            }
            IPoint[] limitIPoints = this.f6086r.getLimitIPoints();
            if (limitIPoints == null) {
                IPoint iPointObtain = IPoint.obtain();
                LatLng latLng = limitLatLngBounds.northeast;
                GLMapState.lonlat2Geo(latLng.longitude, latLng.latitude, iPointObtain);
                IPoint iPointObtain2 = IPoint.obtain();
                LatLng latLng2 = limitLatLngBounds.southwest;
                GLMapState.lonlat2Geo(latLng2.longitude, latLng2.latitude, iPointObtain2);
                limitIPoints = new IPoint[]{iPointObtain, iPointObtain2};
                this.f6086r.setLimitIPoints(limitIPoints);
            }
            MapConfig mapConfig = this.f6086r;
            IPoint iPoint = limitIPoints[0];
            int i2 = ((Point) iPoint).x;
            int i3 = ((Point) iPoint).y;
            IPoint iPoint2 = limitIPoints[1];
            float fJ = zns.j(mapConfig, i2, i3, ((Point) iPoint2).x, ((Point) iPoint2).y, getMapWidth(), getMapHeight());
            float mapZoomer = iGLMapState.getMapZoomer();
            if (this.f6086r.isSetLimitZoomLevel()) {
                float maxZoomLevel = this.f6086r.getMaxZoomLevel();
                float minZoomLevel = this.f6086r.getMinZoomLevel();
                float fMax = Math.max(fJ, Math.min(mapZoomer, maxZoomLevel));
                if (fJ <= maxZoomLevel) {
                    maxZoomLevel = fMax;
                }
                fJ = maxZoomLevel < minZoomLevel ? minZoomLevel : maxZoomLevel;
            } else if (fJ <= 0.0f || mapZoomer >= fJ) {
                fJ = mapZoomer;
            }
            iGLMapState.setMapZoomer(fJ);
            IPoint iPointObtain3 = IPoint.obtain();
            iGLMapState.getMapGeoCenter(iPointObtain3);
            int i4 = ((Point) iPointObtain3).x;
            int i5 = ((Point) iPointObtain3).y;
            IPoint iPoint3 = limitIPoints[0];
            int i6 = ((Point) iPoint3).x;
            int i7 = ((Point) iPoint3).y;
            IPoint iPoint4 = limitIPoints[1];
            int[] iArrV = zns.V(i6, i7, ((Point) iPoint4).x, ((Point) iPoint4).y, this.f6086r, iGLMapState, i4, i5);
            iGLMapState.setMapGeoCenter(iArrV[0], iArrV[1]);
            iPointObtain3.recycle();
        } catch (Throwable th) {
            zns.E(th);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float checkZoomLevel(float f2) throws RemoteException {
        return zns.h(this.f6086r, f2);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void clear() throws RemoteException {
        try {
            clear(false);
        } catch (Throwable th) {
            m2t.r(th, "AMapDelegateImp", CervicalMucusRecord.Appearance.CLEAR);
            zns.E(th);
            th.printStackTrace();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void clearPoiFilter() {
        GLMapEngine gLMapEngine = this.d0;
        if (gLMapEngine == null) {
            return;
        }
        gLMapEngine.clearPoiFilter();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void clearTileCache() {
        this.m.clearTileCache();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final long createGLOverlay(int i2) {
        GLMapEngine gLMapEngine = this.d0;
        if (gLMapEngine != null) {
            return gLMapEngine.createOverlay(this.o, i2);
        }
        return 0L;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final String createId(String str) {
        IGlOverlayLayer iGlOverlayLayer = this.m;
        if (iGlOverlayLayer != null) {
            return iGlOverlayLayer.createId(str);
        }
        return null;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final int createOverlayTexture(int i2, Bitmap bitmap) {
        try {
            GLMapEngine gLMapEngine = this.d0;
            if (gLMapEngine == null || bitmap == null) {
                return -1;
            }
            return gLMapEngine.createOverlayTexture(i2, bitmap);
        } catch (Throwable th) {
            zns.E(th);
        }
        return -1;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final synchronized void createSurface(int i2, GL10 gl10, EGLConfig eGLConfig) {
        try {
            jos.e(gos.c, "createSurface");
            this.B0 = System.currentTimeMillis();
            int i3 = this.J;
            if (i3 == 3 || i3 == 6) {
                this.f6085k.d().b(ei.c);
            } else {
                this.f6085k.d().b(ei.f6015b);
            }
            this.q0 = false;
            this.h0 = this.j.getWidth();
            this.i0 = this.j.getHeight();
            this.s0 = false;
            try {
                boolean zLoadLibPath = AeUtil.loadLibPath(this.c0);
                if (!zLoadLibPath) {
                    zLoadLibPath = AeUtil.loadLib(this.c0);
                }
                if (!zLoadLibPath) {
                    zns.E(new AMapException(AMapException.ERROR_LIB_NOT_FIND));
                    return;
                }
                jos.e(gos.c, "load lib complete");
                AeUtil.initCrashHandle(this.c0);
                GLMapEngine.InitParam initParamInitResource = AeUtil.initResource(this.c0);
                jos.e(gos.c, "load res complete");
                this.d0.createAMapInstance(initParamInitResource, this.b0);
                jos.e(gos.c, "create engine complete");
                this.y0 = new dis();
                jos.e(gos.c, "init shader complete");
                com.autonavi.extra.b bVar = this.V0;
                if (bVar != null) {
                    bVar.i();
                }
                this.p0 = true;
                this.e1 = gl10.glGetString(7937);
                if (iu.a(this.c0, zns.t()).f6352a == iu.c.SuccessCode) {
                    v0();
                }
                if (MapsInitializer.isTerrainEnable() && this.N == null) {
                    jgt jgtVar = new jgt(this.c0, this);
                    this.N = jgtVar;
                    jgtVar.d(0L);
                }
                CustomRenderer customRenderer = this.S;
                if (customRenderer != null) {
                    customRenderer.onSurfaceCreated(gl10, eGLConfig);
                }
                com.autonavi.extra.b bVar2 = this.V0;
                if (bVar2 != null) {
                    bVar2.c();
                }
                this.m.onCreateAMapInstance();
            } catch (Throwable th) {
                zns.E(th);
                m2t.r(th, "AMapDElegateImp", "createSurface");
                jos.l(gos.c, "createSurface failed " + th.getMessage());
                mms.j(this.c0, "init failed:" + th.getMessage());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final LatLng d0() {
        MapConfig mapConfig = this.f6086r;
        if (mapConfig == null) {
            return null;
        }
        DPoint dPointPixelsToLatLong = VirtualEarthProjection.pixelsToLatLong(mapConfig.getSX(), this.f6086r.getSY(), 20);
        LatLng latLng = new LatLng(dPointPixelsToLatLong.y, dPointPixelsToLatLong.x, false);
        dPointPixelsToLatLong.recycle();
        return latLng;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void destroy() {
        this.p.set(true);
        jos.e(gos.c, "destroy map");
        try {
            LocationSource locationSource = this.w;
            if (locationSource != null) {
                locationSource.deactivate();
            }
            this.w = null;
            this.x0 = null;
            GLMapRender gLMapRender = this.e0;
            if (gLMapRender != null) {
                gLMapRender.renderPause();
            }
            i0();
            Thread thread = this.L;
            if (thread != null) {
                thread.interrupt();
                this.L = null;
            }
            Thread thread2 = this.M;
            if (thread2 != null) {
                thread2.interrupt();
                this.M = null;
            }
            jgt jgtVar = this.N;
            if (jgtVar != null) {
                jgtVar.c();
                this.N = null;
            }
            zdt zdtVar = this.O;
            if (zdtVar != null) {
                zdtVar.f();
                this.O = null;
            }
            com.amap.api.col.p0003sl.i iVar = this.X;
            if (iVar != null) {
                iVar.a();
                this.X = null;
            }
            com.amap.api.col.p0003sl.k kVar = this.Y;
            if (kVar != null) {
                kVar.b(null);
                this.Y.a();
                this.Y = null;
            }
            gls.f();
            GLMapEngine gLMapEngine = this.d0;
            if (gLMapEngine != null) {
                gLMapEngine.setMapListener(null);
                queueEvent(new b0());
                int i2 = 0;
                while (this.d0 != null) {
                    int i3 = i2 + 1;
                    if (i2 >= 50) {
                        break;
                    }
                    try {
                        Thread.sleep(20L);
                    } catch (InterruptedException e2) {
                        zns.E(e2);
                    }
                    i2 = i3;
                    m2t.r(th, "AMapDelegateImp", "destroy");
                    zns.E(th);
                    th.printStackTrace();
                }
            }
            IGLSurfaceView iGLSurfaceView = this.j;
            if (iGLSurfaceView != null) {
                try {
                    iGLSurfaceView.onDetachedGLThread();
                } catch (Exception e3) {
                    e3.printStackTrace();
                    zns.E(e3);
                }
            }
            com.amap.api.col.p0003sl.s sVar = this.f6085k;
            if (sVar != null) {
                sVar.g();
                this.f6085k = null;
            }
            nhs nhsVar = this.v;
            if (nhsVar != null) {
                nhsVar.o();
                this.v = null;
            }
            this.w = null;
            this.f6083a = null;
            B0();
            this.K = null;
            jos.a();
            m2t.m();
        } catch (Throwable th) {
            m2t.r(th, "AMapDelegateImp", "destroy");
            zns.E(th);
            th.printStackTrace();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void destroySurface(int i2) {
        this.t0.lock();
        try {
            if (this.p0) {
                EGL14.eglGetCurrentContext();
                EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
                D0();
                GLMapEngine gLMapEngine = this.d0;
                if (gLMapEngine != null) {
                    if (gLMapEngine.getOverlayBundle(this.o) != null) {
                        this.d0.getOverlayBundle(this.o).removeAll(true);
                    }
                    this.d0.destroyAMapEngine();
                    this.d0 = null;
                    int i3 = this.a1;
                    if (i3 > 0) {
                        mms.d(this.c0, i3);
                    }
                    jos.e(gos.c, "destroy engine complete");
                }
                com.autonavi.extra.b bVar = this.V0;
                if (bVar != null) {
                    bVar.f();
                }
            }
            this.p0 = false;
            this.q0 = false;
            this.s0 = false;
        } catch (Throwable th) {
            try {
                zns.E(th);
            } finally {
                this.t0.unlock();
            }
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void drawFrame(GL10 gl10) {
        if (this.p.get() || this.d0 == null || EGL14.eglGetCurrentContext() == EGL14.EGL_NO_CONTEXT) {
            return;
        }
        MapConfig mapConfig = this.f6086r;
        if (mapConfig != null && !mapConfig.isMapEnable()) {
            GLES20.glClear(16640);
            return;
        }
        g(this.o);
        this.d0.renderAMap();
        this.d0.pushRendererState();
        this.F0.sendEmptyMessage(30);
        g1 g1Var = this.A0;
        if (g1Var != null) {
            g1Var.a();
        }
        k0();
        p0();
        if (!this.r0) {
            this.r0 = true;
        }
        this.d0.popRendererState();
        if (qls.b()) {
            try {
                if (this.j instanceof com.amap.api.col.p0003sl.p) {
                    if (this.Z == null) {
                        this.Z = new qls();
                    }
                    this.Z.i();
                    if (!this.Z.j() || this.Z.h()) {
                        return;
                    }
                    if (this.Z.c(((com.amap.api.col.p0003sl.p) this.j).getBitmap())) {
                        if (qls.e()) {
                            removecache();
                        }
                        if (qls.g()) {
                            qls.k();
                        }
                        jos.l(gos.g, "pure screen: found pure check");
                    }
                }
            } catch (Throwable th) {
                m2t.r(th, "AMapDelegateImp", "PureScreenCheckTool.checkBlackScreen");
            }
        }
    }

    public final void e0(int i2) {
        int i3;
        int i4;
        this.J = i2;
        if (i2 == 1) {
            i4 = 0;
            i3 = 0;
        } else {
            i3 = 2;
            if (i2 == 2) {
                i3 = 1;
            } else if (i2 == 3) {
                i4 = 1;
                i3 = 0;
            } else if (i2 != 4) {
                if (i2 == 6) {
                    i4 = 1;
                } else if (i2 == 5) {
                    i4 = 0;
                    i3 = 3;
                } else {
                    try {
                        this.J = 1;
                        i4 = 0;
                        i3 = 0;
                    } catch (Throwable th) {
                        m2t.r(th, "AMapDelegateImp", "setMaptype");
                        th.printStackTrace();
                        zns.E(th);
                        return;
                    }
                }
            }
            i4 = 0;
        }
        this.f6086r.setMapStyleMode(i3);
        this.f6086r.setMapStyleTime(i4);
        if (this.f6086r.isCustomStyleEnable()) {
            g1 g1Var = this.A0;
            if (g1Var == null || !g1Var.o()) {
                h(this.o, i3, i4);
                this.f6086r.setCustomStyleEnable(false);
            } else {
                this.A0.p();
            }
            this.g.setLogoEnable(true);
        } else {
            if (this.f6086r.getMapLanguage().equals("en")) {
                setMapLanguage("zh_cn");
            }
            h(this.o, i3, i4);
        }
        resetRenderTime();
    }

    public final void f(double d2, double d3) {
        this.F0.post(new a(d2, d3));
    }

    public final boolean f0(MotionEvent motionEvent) {
        if (this.m != null && this.z0 != null) {
            DPoint dPointObtain = DPoint.obtain();
            if (this.d0 != null) {
                getPixel2LatLng((int) motionEvent.getX(), (int) motionEvent.getY(), dPointObtain);
                MultiPointItem multiPointItem = this.m.getMultiPointItem(new LatLng(dPointObtain.y, dPointObtain.x));
                if (multiPointItem == null) {
                    return false;
                }
                boolean zOnPointClick = this.z0.onPointClick(multiPointItem);
                dPointObtain.recycle();
                return zOnPointClick;
            }
        }
        return false;
    }

    public final void g(int i2) {
        int i3 = this.U;
        if (i3 != -1) {
            this.e0.setRenderFps(i3);
            resetRenderTime();
        } else if (this.d0.isInMapAction(i2) || this.n0) {
            this.e0.setRenderFps(40.0f);
        } else if (this.d0.isInMapAnimation(i2) || this.m.isGLTFAnimated()) {
            this.e0.setRenderFps(30.0f);
            this.e0.resetTickCount(15);
        } else {
            this.e0.setRenderFps(15.0f);
        }
        if (this.f6086r.isWorldMapEnable() != MapsInitializer.isLoadWorldGridMap()) {
            A();
            this.f6086r.setWorldMapEnable(MapsInitializer.isLoadWorldGridMap());
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void geo2Latlng(int i2, int i3, DPoint dPoint) {
        DPoint dPointPixelsToLatLong = VirtualEarthProjection.pixelsToLatLong(i2, i3, 20);
        dPoint.x = dPointPixelsToLatLong.x;
        dPoint.y = dPointPixelsToLatLong.y;
        dPointPixelsToLatLong.recycle();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void geo2Map(int i2, int i3, FPoint fPoint) {
        ((PointF) fPoint).x = (int) (((double) i2) - this.f6086r.getSX());
        ((PointF) fPoint).y = (int) (((double) i3) - this.f6086r.getSY());
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final com.autonavi.extra.b getAMapExtraInterfaceManager() {
        return this.V0;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Projection getAMapProjection() throws RemoteException {
        return new Projection(this.f);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final UiSettings getAMapUiSettings() throws RemoteException {
        if (this.e == null) {
            this.e = new UiSettings(this.g);
        }
        return this.e;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final AMapCameraInfo getCamerInfo() {
        return null;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float getCameraAngle() {
        return getCameraDegree(this.o);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getCameraDegree(int i2) {
        MapConfig mapConfig = this.f6086r;
        if (mapConfig != null) {
            return mapConfig.getSC();
        }
        return 0.0f;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final CameraPosition getCameraPosition() throws RemoteException {
        return getCameraPositionPrj(this.s);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final CameraPosition getCameraPositionPrj(boolean z2) {
        LatLng latLngD0;
        try {
            if (this.f6086r == null) {
                return null;
            }
            if (!this.p0 || this.q || this.d0 == null) {
                DPoint dPointObtain = DPoint.obtain();
                geo2Latlng((int) this.f6086r.getSX(), (int) this.f6086r.getSY(), dPointObtain);
                LatLng latLng = new LatLng(dPointObtain.y, dPointObtain.x);
                dPointObtain.recycle();
                return CameraPosition.builder().target(latLng).bearing(this.f6086r.getSR()).tilt(this.f6086r.getSC()).zoom(this.f6086r.getSZ()).build();
            }
            if (z2) {
                DPoint dPointObtain2 = DPoint.obtain();
                getPixel2LatLng(this.f6086r.getAnchorX(), this.f6086r.getAnchorY(), dPointObtain2);
                latLngD0 = new LatLng(dPointObtain2.y, dPointObtain2.x, false);
                dPointObtain2.recycle();
            } else {
                latLngD0 = d0();
            }
            return CameraPosition.builder().target(latLngD0).bearing(this.f6086r.getSR()).tilt(this.f6086r.getSC()).zoom(this.f6086r.getSZ()).build();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final Context getContext() {
        return this.c0;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final String getCurrentWorldVectorMapStyle() {
        try {
            com.autonavi.extra.b bVar = this.V0;
            if (bVar == null) {
                return "";
            }
            Object objJ = bVar.j();
            return objJ instanceof String ? (String) objJ : "";
        } catch (Throwable th) {
            zns.E(th);
            return "";
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final g1 getCustomStyleManager() {
        return this.A0;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final int getEngineIDWithGestureInfo(EAMapPlatformGestureInfo eAMapPlatformGestureInfo) {
        GLMapEngine gLMapEngine = this.d0;
        return gLMapEngine != null ? gLMapEngine.getEngineIDWithGestureInfo(eAMapPlatformGestureInfo) : this.o;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float[] getFinalMatrix() {
        MapConfig mapConfig = this.f6086r;
        return mapConfig != null ? mapConfig.getMvpMatrix() : this.g1;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final GLMapEngine getGLMapEngine() {
        return this.d0;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final View getGLMapView() {
        Object obj = this.j;
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void getGeoCenter(int i2, IPoint iPoint) {
        MapConfig mapConfig = this.f6086r;
        if (mapConfig != null) {
            ((Point) iPoint).x = (int) mapConfig.getSX();
            ((Point) iPoint).y = (int) this.f6086r.getSY();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final IGlOverlayLayer getGlOverlayLayer() {
        return this.m;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final long getGlOverlayMgrPtr() {
        GLMapEngine gLMapEngine = this.d0;
        if (gLMapEngine != null) {
            return gLMapEngine.getGlOverlayMgrPtr(this.o);
        }
        return 0L;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final InfoWindowAnimationManager getInfoWindowAnimationManager() {
        return null;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final u8s getInfoWindowDelegate() {
        return this.d;
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
        if (this.p.get() || !this.p0 || this.d0 == null) {
            return;
        }
        try {
            Point pointLatLongToPixels = VirtualEarthProjection.latLongToPixels(d2, d3, 20);
            FPoint fPointObtain = FPoint.obtain();
            k(pointLatLongToPixels.x, pointLatLongToPixels.y, fPointObtain);
            if (((PointF) fPointObtain).x == -10000.0f && ((PointF) fPointObtain).y == -10000.0f) {
                GLMapState gLMapState = (GLMapState) this.d0.getNewMapState(this.o);
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
            Rectangle geoRectangle = this.f6086r.getGeoRectangle();
            if (geoRectangle != null) {
                IPoint[] clipRect = geoRectangle.getClipRect();
                for (int i2 = 0; i2 < 4; i2++) {
                    IPoint iPoint = clipRect[i2];
                    GLMapState.geo2LonLat(((Point) iPoint).x, ((Point) iPoint).y, dPointArr[i2]);
                }
            }
        } catch (Throwable th) {
            zns.E(th);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getLogoMarginRate(int i2) {
        com.amap.api.col.p0003sl.s sVar = this.f6085k;
        if (sVar != null) {
            return sVar.a(i2);
        }
        return 0.0f;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final int getLogoPosition() {
        try {
            return this.g.getLogoPosition();
        } catch (RemoteException e2) {
            m2t.r(e2, "AMapDelegateImp", "getLogoPosition");
            e2.printStackTrace();
            return 0;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Handler getMainHandler() {
        return this.F0;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getMapAngle(int i2) {
        MapConfig mapConfig = this.f6086r;
        if (mapConfig != null) {
            return mapConfig.getSR();
        }
        return 0.0f;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final LatLngBounds getMapBounds(LatLng latLng, float f2, float f3, float f4) {
        int mapWidth = getMapWidth();
        int mapHeight = getMapHeight();
        if (mapWidth <= 0 || mapHeight <= 0 || this.p.get()) {
            return null;
        }
        float fH = zns.h(this.f6086r, f2);
        GLMapState gLMapState = new GLMapState(this.o, this.d0.getNativeInstance());
        if (latLng != null) {
            IPoint iPointObtain = IPoint.obtain();
            latlon2Geo(latLng.latitude, latLng.longitude, iPointObtain);
            gLMapState.setCameraDegree(f4);
            gLMapState.setMapAngle(f3);
            gLMapState.setMapGeoCenter(((Point) iPointObtain).x, ((Point) iPointObtain).y);
            gLMapState.setMapZoomer(fH);
            gLMapState.recalculate();
            iPointObtain.recycle();
        }
        DPoint dPointObtain = DPoint.obtain();
        q(gLMapState, 0, 0, dPointObtain);
        LatLng latLng2 = new LatLng(dPointObtain.y, dPointObtain.x, false);
        q(gLMapState, mapWidth, mapHeight, dPointObtain);
        LatLng latLng3 = new LatLng(dPointObtain.y, dPointObtain.x, false);
        dPointObtain.recycle();
        gLMapState.recycle();
        return LatLngBounds.builder().include(latLng3).include(latLng2).build();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final MapConfig getMapConfig() {
        return this.f6086r;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final String getMapContentApprovalNumber() {
        MapConfig mapConfig = this.f6086r;
        if (mapConfig == null || mapConfig.isCustomStyleEnable()) {
            return null;
        }
        mms.o(this.c0);
        String strB = nls.b(this.c0, "approval_number", "mc", "");
        return !TextUtils.isEmpty(strB) ? strB : "GS（2024）2108号 | GS（2023）2175号";
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getMapHeight() {
        return this.i0;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void getMapPrintScreen(AMap.onMapPrintScreenListener onmapprintscreenlistener) {
        try {
            this.f6084b.e(Integer.valueOf(AMap.onMapPrintScreenListener.class.hashCode()), onmapprintscreenlistener);
            this.F = 20;
            this.G = true;
            resetRenderTime();
        } catch (Throwable th) {
            zns.E(th);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final GLMapState getMapProjection() {
        GLMapEngine gLMapEngine = this.d0;
        if (gLMapEngine != null) {
            return gLMapEngine.getMapState(this.o);
        }
        return null;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final List<Marker> getMapScreenMarkers() throws RemoteException {
        if (zns.J(getMapWidth(), getMapHeight()) && !this.p.get()) {
            ArrayList arrayList = new ArrayList();
            List<Marker> mapScreenMarkers = this.m.getMapScreenMarkers();
            if (mapScreenMarkers != null && !mapScreenMarkers.isEmpty()) {
                arrayList.addAll(mapScreenMarkers);
            }
            List<Marker> mapScreenMarkers2 = this.l.getMapScreenMarkers();
            if (!mapScreenMarkers2.isEmpty()) {
                arrayList.addAll(mapScreenMarkers2);
            }
            return arrayList;
        }
        return new ArrayList();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void getMapScreenShot(AMap.OnMapScreenShotListener onMapScreenShotListener, boolean z2) {
        try {
            this.f6084b.e(Integer.valueOf(AMap.OnMapScreenShotListener.class.hashCode()), onMapScreenShotListener);
            this.F = 20;
            this.G = z2;
            resetRenderTime();
        } catch (Throwable th) {
            zns.E(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getMapTextZIndex() throws RemoteException {
        return this.R;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getMapType() throws RemoteException {
        return this.J;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getMapWidth() {
        return this.h0;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getMapZoomScale() {
        return this.k0;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final int getMaskLayerType() {
        return this.T;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float getMaxZoomLevel() {
        try {
            MapConfig mapConfig = this.f6086r;
            if (mapConfig != null) {
                return mapConfig.getMaxZoomLevel();
            }
            return 20.0f;
        } catch (Throwable th) {
            zns.E(th);
            return 20.0f;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float getMinZoomLevel() {
        try {
            MapConfig mapConfig = this.f6086r;
            if (mapConfig != null) {
                return mapConfig.getMinZoomLevel();
            }
            return 3.0f;
        } catch (Throwable th) {
            zns.E(th);
            return 3.0f;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final Location getMyLocation() throws RemoteException {
        if (this.w != null) {
            return this.f6083a.f40059b;
        }
        return null;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final MyLocationStyle getMyLocationStyle() throws RemoteException {
        nhs nhsVar = this.v;
        if (nhsVar != null) {
            return nhsVar.a();
        }
        return null;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getNativeEngineID() {
        return this.o;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final long getNativeMapController() {
        GLMapEngine gLMapEngine = this.d0;
        if (gLMapEngine != null) {
            return gLMapEngine.getNativeMapController(this.o);
        }
        return 0L;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final AMap.OnCameraChangeListener getOnCameraChangeListener() throws RemoteException {
        try {
            List listA = this.f6084b.a(AMap.OnCameraChangeListener.class.hashCode());
            if (listA == null && listA.size() != 0) {
                return (AMap.OnCameraChangeListener) listA.get(0);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final LatLngBounds getOverlayBoundRect(String str) {
        if (this.m.isGLOverlay(str)) {
            Rect overlayBoundRect = this.m.getOverlayBoundRect(str);
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
        Rect overlayBoundRect2 = this.l.getOverlayBoundRect(str);
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

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void getPixel2Geo(int i2, int i3, IPoint iPoint) {
        GLMapEngine gLMapEngine;
        GLMapState mapState;
        if (this.p.get() || !this.p0 || (gLMapEngine = this.d0) == null || (mapState = gLMapEngine.getMapState(this.o)) == null) {
            return;
        }
        mapState.screenToP20Point(i2, i3, iPoint);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void getPixel2LatLng(int i2, int i3, DPoint dPoint) {
        GLMapEngine gLMapEngine;
        GLMapState mapState;
        if (this.p.get() || !this.p0 || (gLMapEngine = this.d0) == null || (mapState = gLMapEngine.getMapState(this.o)) == null) {
            return;
        }
        IPoint iPointObtain = IPoint.obtain();
        mapState.screenToP20Point(i2, i3, iPointObtain);
        DPoint dPointPixelsToLatLong = VirtualEarthProjection.pixelsToLatLong(((Point) iPointObtain).x, ((Point) iPointObtain).y, 20);
        dPoint.x = dPointPixelsToLatLong.x;
        dPoint.y = dPointPixelsToLatLong.y;
        iPointObtain.recycle();
        dPointPixelsToLatLong.recycle();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getPreciseLevel(int i2) {
        MapConfig mapConfig = this.f6086r;
        if (mapConfig != null) {
            return mapConfig.getSZ();
        }
        return 0.0f;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final IProjectionDelegate getProjection() throws RemoteException {
        return this.f;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float[] getProjectionMatrix() {
        MapConfig mapConfig = this.f6086r;
        return mapConfig != null ? mapConfig.getProjectionMatrix() : this.i1;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final Rect getRect() {
        return this.I;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getRenderMode() {
        return this.j.getRenderMode();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getSX() {
        MapConfig mapConfig = this.f6086r;
        if (mapConfig != null) {
            return (int) mapConfig.getSX();
        }
        return -1;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int getSY() {
        MapConfig mapConfig = this.f6086r;
        if (mapConfig != null) {
            return (int) mapConfig.getSY();
        }
        return -1;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final String getSatelliteImageApprovalNumber() {
        mms.p(this.c0);
        String strB = nls.b(this.c0, "approval_number", "si", "");
        return !TextUtils.isEmpty(strB) ? strB : "GS（2025）0817号";
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float getScalePerPixel() throws RemoteException {
        try {
            return ((float) ((((Math.cos((getCameraPosition().target.latitude * 3.141592653589793d) / 180.0d) * 2.0d) * 3.141592653589793d) * 6378137.0d) / (Math.pow(2.0d, getZoomLevel()) * 256.0d))) * getMapZoomScale();
        } catch (Throwable th) {
            m2t.r(th, "AMapDelegateImp", "getScalePerPixel");
            zns.E(th);
            th.printStackTrace();
            return 0.0f;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float getSkyHeight() {
        return this.f6086r.getSkyHeight();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final String getTerrainApprovalNumber() {
        mms.q(this.c0);
        String strB = nls.b(this.c0, "approval_number", "te", "");
        return !TextUtils.isEmpty(strB) ? strB : "GS(2021)6352号";
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final IUiSettingsDelegate getUiSettings() {
        return this.g;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getUnitLengthByZoom(int i2) {
        GLMapState gLMapState = new GLMapState(this.o, this.d0.getNativeInstance());
        gLMapState.setMapZoomer(i2);
        gLMapState.recalculate();
        float gLUnitWithWin = gLMapState.getGLUnitWithWin(1);
        gLMapState.recycle();
        return gLUnitWithWin;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final View getView() throws RemoteException {
        com.amap.api.col.p0003sl.s sVar = this.f6085k;
        if (sVar != null) {
            return sVar.j();
        }
        return null;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float[] getViewMatrix() {
        MapConfig mapConfig = this.f6086r;
        return mapConfig != null ? mapConfig.getViewMatrix() : this.h1;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final Point getWaterMarkerPositon() {
        com.amap.api.col.p0003sl.s sVar = this.f6085k;
        return sVar != null ? sVar.a() : new Point();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final String getWorldVectorMapLanguage() {
        return this.W0;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final String getWorldVectorMapStyle() {
        return this.X0;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float getZoomLevel() {
        return N();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final float getZoomToSpanLevel(LatLng latLng, LatLng latLng2) {
        try {
            MapConfig mapConfig = getMapConfig();
            if (latLng == null || latLng2 == null || !this.p0 || this.p.get()) {
                return mapConfig.getSZ();
            }
            Pair<Float, IPoint> pairR = zns.r(mapConfig, 0, 0, 0, 0, new LatLngBounds.Builder().include(latLng).include(latLng2).build(), getMapWidth(), getMapHeight());
            if (pairR != null) {
                return ((Float) pairR.first).floatValue();
            }
            GLMapState gLMapState = new GLMapState(this.o, this.d0.getNativeInstance());
            float mapZoomer = gLMapState.getMapZoomer();
            gLMapState.recycle();
            return mapZoomer;
        } catch (Throwable th) {
            zns.E(th);
            return 0.0f;
        }
    }

    public final synchronized void h(int i2, int i3, int i4) {
        j(i2, i3, i4, false, null);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final int hideBuildings(List<LatLng> list) {
        if (this.d0 == null) {
            return -1;
        }
        FutureTask futureTask = new FutureTask(new f0(list));
        queueEvent(futureTask);
        try {
            return ((Integer) futureTask.get()).intValue();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
            return -1;
        } catch (ExecutionException e3) {
            e3.printStackTrace();
            return -1;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void hideInfoWindow() {
        u8s u8sVar = this.d;
        if (u8sVar != null) {
            u8sVar.w();
        }
    }

    public final void i(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        GLMapEngine gLMapEngine = this.d0;
        if (gLMapEngine != null) {
            gLMapEngine.setServiceViewRect(i2, i3, i4, i5, i6, i7, i8);
        }
    }

    public final synchronized void i0() {
        synchronized (this.W) {
            try {
                int size = this.W.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.W.get(i2).a().recycle();
                }
                this.W.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean isIndoorEnabled() throws RemoteException {
        return this.f6086r.isIndoorEnable();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean isLockMapAngle(int i2) {
        return a0(i2);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean isLockMapCameraDegree(int i2) {
        return false;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean isMaploaded() {
        return this.t;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean isMyLocationEnabled() throws RemoteException {
        return this.n;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean isOverseaAuthed() {
        zdt zdtVar = this.O;
        return zdtVar != null && zdtVar.a() == 2;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean isTouchPoiEnable() {
        MapConfig mapConfig = this.f6086r;
        if (mapConfig != null) {
            return mapConfig.isTouchPoiEnable();
        }
        return true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean isTrafficEnabled() throws RemoteException {
        return this.f6086r.isTrafficEnabled();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean isUseAnchor() {
        return this.s;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean isUseForNavi() {
        return this.V;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean isUseGLTF() {
        return this.D0;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean isUseMVT() {
        return this.E0;
    }

    public final synchronized void j(int i2, int i3, int i4, boolean z2, StyleItem[] styleItemArr) {
        if (this.q0 && this.p0 && this.h) {
            S(i4);
            queueEvent(new e(i2, i3, i4, z2, styleItemArr));
            return;
        }
        t0 t0Var = this.I0;
        t0Var.e = i2;
        t0Var.c = i3;
        t0Var.d = i4;
        t0Var.f6136a = true;
    }

    public final boolean j0(MotionEvent motionEvent) throws RemoteException {
        try {
            List listA = this.f6084b.a(AMap.OnInfoWindowClickListener.class.hashCode());
            BaseOverlay baseOverlayF = this.d.f(motionEvent);
            if (baseOverlayF != null && (baseOverlayF instanceof Marker)) {
                synchronized (listA) {
                    for (int i2 = 0; i2 < listA.size(); i2++) {
                        try {
                            ((AMap.OnInfoWindowClickListener) listA.get(i2)).onInfoWindowClick((Marker) baseOverlayF);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public final void k(int i2, int i3, FPoint fPoint) {
        GLMapEngine gLMapEngine;
        GLMapState mapState;
        if (this.p.get() || !this.p0 || (gLMapEngine = this.d0) == null || (mapState = gLMapEngine.getMapState(this.o)) == null) {
            return;
        }
        mapState.p20ToScreenPoint(i2, i3, fPoint);
    }

    public final void k0() {
        if (this.F > 0) {
            boolean zCanStopMapRender = this.d0.canStopMapRender(this.o);
            if (!zCanStopMapRender) {
                int i2 = this.F - 1;
                this.F = i2;
                if (i2 > 0) {
                    this.d0.renderAMap();
                    return;
                }
            }
            this.F = 0;
            Message messageObtainMessage = this.F0.obtainMessage(15, this.d0.getScreenShot(this.o, 0, 0, getMapWidth(), getMapHeight()));
            messageObtainMessage.arg1 = zCanStopMapRender ? 1 : 0;
            messageObtainMessage.sendToTarget();
        }
    }

    public final void l(int i2, boolean z2) {
        if (this.p0 && this.q0) {
            resetRenderTime();
            queueEvent(new g(i2, z2));
        } else {
            t0 t0Var = this.K0;
            t0Var.f6137b = z2;
            t0Var.f6136a = true;
            t0Var.e = i2;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void latlon2Geo(double d2, double d3, IPoint iPoint) {
        Point pointLatLongToPixels = VirtualEarthProjection.latLongToPixels(d2, d3, 20);
        ((Point) iPoint).x = pointLatLongToPixels.x;
        ((Point) iPoint).y = pointLatLongToPixels.y;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void loadWorldVectorMap(boolean z2) {
        MapConfig mapConfig = this.f6086r;
        if (mapConfig != null) {
            mapConfig.setAbroadEnable(z2);
        }
    }

    public final void m(MotionEvent motionEvent) throws RemoteException {
        if (!this.x || this.z == null) {
            return;
        }
        int x2 = (int) motionEvent.getX();
        int y2 = (int) (motionEvent.getY() - 60.0f);
        if (this.z.getPosition() != null) {
            DPoint dPointObtain = DPoint.obtain();
            getPixel2LatLng(x2, y2, dPointObtain);
            LatLng latLng = new LatLng(dPointObtain.y, dPointObtain.x);
            dPointObtain.recycle();
            this.z.setPosition(latLng);
            try {
                List listA = this.f6084b.a(AMap.OnMarkerDragListener.class.hashCode());
                if (listA == null || listA.size() <= 0) {
                    return;
                }
                synchronized (listA) {
                    for (int i2 = 0; i2 < listA.size(); i2++) {
                        try {
                            ((AMap.OnMarkerDragListener) listA.get(i2)).onMarkerDrag(this.z);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void m0() {
        GLMapState mapState;
        List listA;
        List listA2;
        List listA3;
        if (this.p.get() || (mapState = this.d0.getMapState(this.o)) == null) {
            return;
        }
        mapState.getViewMatrix(this.f6086r.getViewMatrix());
        mapState.getProjectionMatrix(this.f6086r.getProjectionMatrix());
        this.f6086r.updateFinalMatrix();
        DPoint mapGeoCenter = mapState.getMapGeoCenter();
        this.f6086r.setSX(mapGeoCenter.x);
        this.f6086r.setSY(mapGeoCenter.y);
        this.f6086r.setSZ(mapState.getMapZoomer());
        this.f6086r.setSC(mapState.getCameraDegree());
        this.f6086r.setSR(mapState.getMapAngle());
        this.f6086r.setSkyHeight(mapState.getSkyHeight());
        if (!this.f6086r.isMapStateChange()) {
            if (!this.n0 && this.d0.getAnimateionsCount() == 0 && this.d0.getStateMessageCount() == 0) {
                onChangeFinish();
                return;
            }
            return;
        }
        DPoint dPointPixelsToLatLong = VirtualEarthProjection.pixelsToLatLong(mapGeoCenter.x, mapGeoCenter.y, 20);
        CameraPosition cameraPosition = new CameraPosition(new LatLng(dPointPixelsToLatLong.y, dPointPixelsToLatLong.x, false), this.f6086r.getSZ(), this.f6086r.getSC(), this.f6086r.getSR());
        dPointPixelsToLatLong.recycle();
        Message messageObtainMessage = this.F0.obtainMessage();
        messageObtainMessage.what = 10;
        messageObtainMessage.obj = cameraPosition;
        this.F0.sendMessage(messageObtainMessage);
        this.o0 = true;
        redrawInfoWindow();
        try {
            if (this.g.isZoomControlsEnabled() && this.f6086r.isNeedUpdateZoomControllerState() && (listA3 = this.f6084b.a(AMapWidgetListener.class.hashCode())) != null && listA3.size() > 0) {
                synchronized (listA3) {
                    for (int i2 = 0; i2 < listA3.size(); i2++) {
                        try {
                            ((AMapWidgetListener) listA3.get(i2)).invalidateZoomController(this.f6086r.getSZ());
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            if (this.f6086r.getChangeGridRatio() != 1.0d) {
                A();
            }
            if (this.g.isCompassEnabled() && ((this.f6086r.isTiltChanged() || this.f6086r.isBearingChanged()) && (listA2 = this.f6084b.a(AMapWidgetListener.class.hashCode())) != null && listA2.size() > 0)) {
                synchronized (listA2) {
                    for (int i3 = 0; i3 < listA2.size(); i3++) {
                        try {
                            ((AMapWidgetListener) listA2.get(i3)).invalidateCompassView();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            if (!this.g.isScaleControlsEnabled() || (listA = this.f6084b.a(AMapWidgetListener.class.hashCode())) == null || listA.size() <= 0) {
                return;
            }
            synchronized (listA) {
                for (int i4 = 0; i4 < listA.size(); i4++) {
                    try {
                        ((AMapWidgetListener) listA.get(i4)).invalidateScaleView();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void map2Geo(float f2, float f3, IPoint iPoint) {
        ((Point) iPoint).x = (int) (((double) f2) + this.f6086r.getSX());
        ((Point) iPoint).y = (int) (((double) f3) + this.f6086r.getSY());
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void moveCamera(CameraUpdate cameraUpdate) throws RemoteException {
        if (cameraUpdate == null) {
            return;
        }
        try {
            moveCamera(cameraUpdate.getCameraUpdateFactoryDelegate());
        } catch (Throwable th) {
            zns.E(th);
        }
    }

    public final void o(CameraPosition cameraPosition) {
        MapConfig mapConfig = this.f6086r;
        if (mapConfig == null || mapConfig.getChangedCounter() == 0) {
            return;
        }
        try {
            if (!this.n0 && this.d0.getAnimateionsCount() == 0 && this.d0.getStateMessageCount() == 0) {
                AMapGestureListener aMapGestureListener = this.c;
                if (aMapGestureListener != null) {
                    aMapGestureListener.onMapStable();
                }
                if (this.j.isEnabled()) {
                    try {
                        List listA = this.f6084b.a(AMap.OnCameraChangeListener.class.hashCode());
                        if (listA != null && listA.size() != 0) {
                            if (cameraPosition == null) {
                                try {
                                    cameraPosition = getCameraPosition();
                                } catch (Throwable th) {
                                    m2t.r(th, "AMapDelegateImp", "cameraChangeFinish");
                                    th.printStackTrace();
                                }
                            }
                            synchronized (listA) {
                                try {
                                    Iterator it = listA.iterator();
                                    while (it.hasNext()) {
                                        ((AMap.OnCameraChangeListener) it.next()).onCameraChangeFinish(cameraPosition);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    this.f6086r.resetChangedCounter();
                }
            }
        } catch (Throwable th3) {
            th3.printStackTrace();
            zns.E(th3);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void onAMapAppResourceRequest(AMapAppRequestParam aMapAppRequestParam) {
        ldt ldtVar = this.f6084b;
        if (ldtVar == null) {
            return;
        }
        for (AMap.AMapAppResourceRequestListener aMapAppResourceRequestListener : ldtVar.a(AMap.AMapAppResourceRequestListener.class.hashCode())) {
            if (aMapAppResourceRequestListener != null) {
                aMapAppResourceRequestListener.onRequest(aMapAppRequestParam);
            }
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void onActivityPause() {
        this.q = true;
        J(this.o);
        GLMapEngine gLMapEngine = this.d0;
        if (gLMapEngine != null) {
            gLMapEngine.setRenderFlags(false);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void onActivityResume() {
        GLMapEngine gLMapEngine;
        this.q = false;
        P(this.o);
        if (!this.p0 || (gLMapEngine = this.d0) == null) {
            return;
        }
        gLMapEngine.setRenderFlags(true);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void onChangeFinish() {
        Message messageObtainMessage = this.F0.obtainMessage();
        messageObtainMessage.what = 11;
        this.F0.sendMessage(messageObtainMessage);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean onDoubleTap(int i2, MotionEvent motionEvent) {
        if (!this.p0) {
            return false;
        }
        u((int) motionEvent.getX(), (int) motionEvent.getY());
        return false;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void onFling() {
        IGlOverlayLayer iGlOverlayLayer = this.m;
        if (iGlOverlayLayer != null) {
            iGlOverlayLayer.setFlingState(true);
        }
        this.E = true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ba  */
    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void onIndoorBuildingActivity(int i2, byte[] bArr) {
        t8s t8sVar;
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    t8sVar = new t8s();
                    byte b2 = bArr[0];
                    t8sVar.f34461a = new String(bArr, 1, b2, "utf-8");
                    int i3 = b2 + 1;
                    int i4 = b2 + 2;
                    byte b3 = bArr[i3];
                    t8sVar.f34462b = new String(bArr, i4, b3, "utf-8");
                    int i5 = i4 + b3;
                    int i6 = i5 + 1;
                    byte b4 = bArr[i5];
                    t8sVar.activeFloorName = new String(bArr, i6, b4, "utf-8");
                    int i7 = i6 + b4;
                    t8sVar.activeFloorIndex = GLConvertUtil.getInt(bArr, i7);
                    int i8 = i7 + 4;
                    int i9 = i7 + 5;
                    byte b5 = bArr[i8];
                    t8sVar.poiid = new String(bArr, i9, b5, "utf-8");
                    int i10 = i9 + b5;
                    int i11 = i10 + 1;
                    byte b6 = bArr[i10];
                    t8sVar.h = new String(bArr, i11, b6, "utf-8");
                    int i12 = i11 + b6;
                    int i13 = GLConvertUtil.getInt(bArr, i12);
                    t8sVar.c = i13;
                    int i14 = i12 + 4;
                    t8sVar.floor_indexs = new int[i13];
                    t8sVar.floor_names = new String[i13];
                    t8sVar.d = new String[i13];
                    for (int i15 = 0; i15 < t8sVar.c; i15++) {
                        t8sVar.floor_indexs[i15] = GLConvertUtil.getInt(bArr, i14);
                        int i16 = i14 + 4;
                        int i17 = i14 + 5;
                        byte b7 = bArr[i16];
                        if (b7 > 0) {
                            t8sVar.floor_names[i15] = new String(bArr, i17, b7, "utf-8");
                            i17 += b7;
                        }
                        int i18 = i17 + 1;
                        byte b8 = bArr[i17];
                        if (b8 > 0) {
                            t8sVar.d[i15] = new String(bArr, i18, b8, "utf-8");
                            i18 += b8;
                        }
                        i14 = i18;
                    }
                    int i19 = GLConvertUtil.getInt(bArr, i14);
                    t8sVar.e = i19;
                    int i20 = i14 + 4;
                    if (i19 > 0) {
                        t8sVar.f = new int[i19];
                        for (int i21 = 0; i21 < t8sVar.e; i21++) {
                            t8sVar.f[i21] = GLConvertUtil.getInt(bArr, i20);
                            i20 += 4;
                        }
                    }
                } else {
                    t8sVar = null;
                }
            } catch (Throwable th) {
                zns.E(th);
                th.printStackTrace();
                return;
            }
        } else {
            t8sVar = null;
        }
        this.f1 = t8sVar;
        post(new a0());
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void onLongPress(int i2, MotionEvent motionEvent) {
        boolean z2;
        int i3 = 0;
        try {
            this.B = false;
            B(i2);
            BaseOverlay hitBaseOverlay = this.m.getHitBaseOverlay(motionEvent, 1);
            if (hitBaseOverlay instanceof Marker) {
                this.z = (Marker) hitBaseOverlay;
            }
            DPoint dPointObtain = DPoint.obtain();
            dPointObtain.x = motionEvent.getX();
            dPointObtain.y = motionEvent.getY();
            BaseOverlay hitOverlay = this.l.getHitOverlay(dPointObtain, 1);
            if (hitOverlay instanceof Marker) {
                this.z = (Marker) hitOverlay;
                z2 = true;
            } else {
                z2 = false;
            }
            dPointObtain.recycle();
            BaseOverlay hitBaseOverlay2 = this.m.getHitBaseOverlay(motionEvent, 3);
            if (hitBaseOverlay2 instanceof GLTFOverlay) {
                this.A = (GLTFOverlay) hitBaseOverlay2;
            }
            Marker marker = this.z;
            if (marker == null || !marker.isDraggable()) {
                GLTFOverlay gLTFOverlay = this.A;
                if (gLTFOverlay == null || !gLTFOverlay.isDraggable()) {
                    List listA = this.f6084b.a(AMap.OnMapLongClickListener.class.hashCode());
                    if (listA != null && listA.size() > 0) {
                        DPoint dPointObtain2 = DPoint.obtain();
                        getPixel2LatLng((int) motionEvent.getX(), (int) motionEvent.getY(), dPointObtain2);
                        synchronized (listA) {
                            while (i3 < listA.size()) {
                                try {
                                    ((AMap.OnMapLongClickListener) listA.get(i3)).onMapLongClick(new LatLng(dPointObtain2.y, dPointObtain2.x));
                                    i3++;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        this.C = true;
                        dPointObtain2.recycle();
                    }
                } else {
                    LatLng latlng = this.A.getLatlng();
                    if (latlng != null) {
                        IPoint iPointObtain = IPoint.obtain();
                        getLatLng2Pixel(latlng.latitude, latlng.longitude, iPointObtain);
                        ((Point) iPointObtain).y -= 60;
                        DPoint dPointObtain3 = DPoint.obtain();
                        getPixel2LatLng(((Point) iPointObtain).x, ((Point) iPointObtain).y, dPointObtain3);
                        this.A.setLatLng(new LatLng(dPointObtain3.y, dPointObtain3.x));
                        this.m.set2Top(this.A.getId());
                        this.y = true;
                        iPointObtain.recycle();
                        dPointObtain3.recycle();
                    }
                }
            } else {
                LatLng position = this.z.getPosition();
                if (position != null) {
                    IPoint iPointObtain2 = IPoint.obtain();
                    getLatLng2Pixel(position.latitude, position.longitude, iPointObtain2);
                    ((Point) iPointObtain2).y -= 60;
                    DPoint dPointObtain4 = DPoint.obtain();
                    getPixel2LatLng(((Point) iPointObtain2).x, ((Point) iPointObtain2).y, dPointObtain4);
                    this.z.setPosition(new LatLng(dPointObtain4.y, dPointObtain4.x));
                    if (z2) {
                        this.l.set2Top(this.z.getId());
                    } else {
                        this.m.set2Top(this.z.getId());
                    }
                    try {
                        List listA2 = this.f6084b.a(AMap.OnMarkerDragListener.class.hashCode());
                        if (listA2 != null && listA2.size() > 0) {
                            synchronized (listA2) {
                                while (i3 < listA2.size()) {
                                    try {
                                        ((AMap.OnMarkerDragListener) listA2.get(i3)).onMarkerDragStart(this.z);
                                        i3++;
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        m2t.r(th3, "AMapDelegateImp", "onMarkerDragStart");
                        th3.printStackTrace();
                    }
                    this.x = true;
                    iPointObtain2.recycle();
                    dPointObtain4.recycle();
                }
            }
            this.e0.resetTickCount(30);
        } catch (Throwable th4) {
            m2t.r(th4, "AMapDelegateImp", "onLongPress");
            th4.printStackTrace();
        }
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void onMapBlankClick(double d2, double d3) {
        f(d2, d3);
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAMapListener
    public final void onMapPOIClick(MapPoi mapPoi) {
        List listA;
        MapConfig mapConfig = this.f6086r;
        if (mapConfig == null || !mapConfig.isTouchPoiEnable() || (listA = this.f6084b.a(AMap.OnPOIClickListener.class.hashCode())) == null || listA.size() <= 0 || mapPoi == null) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 20;
        messageObtain.obj = new Poi(mapPoi.getName(), new LatLng(mapPoi.getLatitude(), mapPoi.getLongitude()), mapPoi.getPoiid());
        this.F0.sendMessage(messageObtain);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void onPause() {
        Z();
        IGlOverlayLayer iGlOverlayLayer = this.m;
        if (iGlOverlayLayer != null) {
            iGlOverlayLayer.setFlingState(false);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void onResume() {
        try {
            this.e0.setRenderFps(15.0f);
            this.j.setRenderMode(0);
            IGlOverlayLayer iGlOverlayLayer = this.m;
            if (iGlOverlayLayer != null) {
                iGlOverlayLayer.setFlingState(true);
            }
            nhs nhsVar = this.v;
            if (nhsVar != null) {
                nhsVar.k();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean onSingleTapConfirmed(int i2, MotionEvent motionEvent) {
        if (!this.p0) {
            return false;
        }
        try {
            B(i2);
            if (j0(motionEvent) || Y(motionEvent) || T(motionEvent) || f0(motionEvent)) {
                return true;
            }
            Q(motionEvent);
            if (b0(motionEvent)) {
                return true;
            }
            L(motionEvent);
            return true;
        } catch (Throwable th) {
            m2t.r(th, "AMapDelegateImp", "onSingleTapUp");
            th.printStackTrace();
            return true;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.q || !this.p0 || !this.m0) {
            return false;
        }
        EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.b1;
        eAMapPlatformGestureInfo.mGestureState = 3;
        eAMapPlatformGestureInfo.mGestureType = 8;
        eAMapPlatformGestureInfo.mLocation = new float[]{motionEvent.getX(), motionEvent.getY()};
        getEngineIDWithGestureInfo(this.b1);
        r0();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            t0();
            R();
        } else if (action == 1) {
            W();
        }
        if (motionEvent.getAction() == 2 && this.x) {
            try {
                m(motionEvent);
            } catch (Throwable th) {
                m2t.r(th, "AMapDelegateImp", "onDragMarker");
                th.printStackTrace();
            }
            return true;
        }
        if (motionEvent.getAction() == 2 && this.y) {
            try {
                E(motionEvent);
            } catch (Throwable th2) {
                m2t.r(th2, "AMapDelegateImp", "onDragGLTF");
                th2.printStackTrace();
            }
            return true;
        }
        if (this.g0) {
            try {
                List listA = this.f6084b.a(AMap.SignleClickInterceptorListener.class.hashCode());
                if (listA == null || listA.size() <= 0 || !((AMap.SignleClickInterceptorListener) listA.get(0)).isInterceptorSignleClick(motionEvent)) {
                    this.f0.f(motionEvent);
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
        }
        try {
            List listA2 = this.f6084b.a(AMap.OnMapTouchListener.class.hashCode());
            if (listA2 != null && listA2.size() > 0) {
                this.F0.removeMessages(14);
                Message messageObtainMessage = this.F0.obtainMessage();
                messageObtainMessage.what = 14;
                messageObtainMessage.obj = MotionEvent.obtain(motionEvent);
                messageObtainMessage.sendToTarget();
            }
        } catch (Throwable unused) {
        }
        return true;
    }

    public final void p(AbstractCameraUpdateMessage abstractCameraUpdateMessage) {
        boolean z2 = this.s;
        abstractCameraUpdateMessage.isUseAnchor = z2;
        if (z2) {
            abstractCameraUpdateMessage.anchorX = this.f6086r.getAnchorX();
            abstractCameraUpdateMessage.anchorY = this.f6086r.getAnchorY();
        }
        if (abstractCameraUpdateMessage.width == 0) {
            abstractCameraUpdateMessage.width = getMapWidth();
        }
        if (abstractCameraUpdateMessage.height == 0) {
            abstractCameraUpdateMessage.height = getMapHeight();
        }
        abstractCameraUpdateMessage.mapConfig = this.f6086r;
    }

    public final void p0() {
        if (!this.t) {
            this.F0.sendEmptyMessage(16);
            this.t = true;
            A();
        }
        long j2 = this.d1;
        if (j2 < 2) {
            this.d1 = j2 + 1;
            return;
        }
        ei eiVarD = this.f6085k.d();
        if (eiVarD == null || eiVarD.getVisibility() == 8) {
            return;
        }
        mms.e(this.c0, System.currentTimeMillis() - this.B0);
        this.F0.post(new c(eiVarD));
        this.d0.setStyleChangeGradualEnable(this.o, true);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void pixel2Map(int i2, int i3, PointF pointF) {
        if (!this.p0 || this.q || this.d0 == null) {
            return;
        }
        IPoint iPointObtain = IPoint.obtain();
        getPixel2Geo(i2, i3, iPointObtain);
        pointF.x = ((Point) iPointObtain).x - ((float) this.f6086r.getSX());
        pointF.y = ((Point) iPointObtain).y - ((float) this.f6086r.getSY());
        iPointObtain.recycle();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void post(Runnable runnable) {
        IGLSurfaceView iGLSurfaceView = this.j;
        if (iGLSurfaceView != null) {
            iGLSurfaceView.post(runnable);
        }
    }

    public final void q(GLMapState gLMapState, int i2, int i3, DPoint dPoint) {
        if (!this.p0 || this.d0 == null) {
            return;
        }
        Point point = new Point();
        gLMapState.screenToP20Point(i2, i3, point);
        DPoint dPointPixelsToLatLong = VirtualEarthProjection.pixelsToLatLong(point.x, point.y, 20);
        dPoint.x = dPointPixelsToLatLong.x;
        dPoint.y = dPointPixelsToLatLong.y;
        dPointPixelsToLatLong.recycle();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void queueEvent(Runnable runnable) {
        long id;
        try {
            try {
                id = Thread.currentThread().getId();
            } catch (Throwable th) {
                zns.E(th);
                m2t.r(th, "AMapdelegateImp", "queueEvent");
                id = -1;
            }
            if (id != -1 && id == this.a0) {
                runnable.run();
            } else if (this.d0 != null) {
                this.j.queueEvent(runnable);
            }
        } catch (Throwable th2) {
            zns.E(th2);
            m2t.r(th2, "AMapdelegateImp", "queueEvent");
        }
    }

    public final void r(boolean z2) {
        com.autonavi.extra.b bVar = this.V0;
        if (bVar != null) {
            Object objJ = bVar.j();
            if (objJ != null && (objJ instanceof Boolean)) {
                MapConfig mapConfig = this.f6086r;
                if (mapConfig != null) {
                    mapConfig.setAbroadEnable(z2 && ((Boolean) objJ).booleanValue());
                }
                if (z2 && ((Boolean) objJ).booleanValue()) {
                    MapsInitializer.setSupportRecycleView(false);
                }
            }
            Object objJ2 = this.V0.j();
            if (objJ2 != null && (objJ2 instanceof Boolean)) {
                this.f6085k.a(((Boolean) objJ2).booleanValue());
            }
            Object objJ3 = this.V0.j();
            if (objJ2 == null || !(objJ2 instanceof Integer)) {
                return;
            }
            this.R = ((Integer) objJ3).intValue();
        }
    }

    public final void r0() {
        GLMapRender gLMapRender = this.e0;
        if (gLMapRender != null) {
            gLMapRender.resetTickCount(2);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void redrawInfoWindow() {
        if (!this.p.get() && this.p0) {
            this.F0.sendEmptyMessage(18);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void redrawNativeOverlays() {
        this.F0.sendEmptyMessage(40);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void refreshLogo() {
        com.amap.api.col.p0003sl.s sVar = this.f6085k;
        if (sVar != null) {
            sVar.c();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void reloadMap() {
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void reloadMapCustomStyle() {
        g1 g1Var = this.A0;
        if (g1Var != null) {
            g1Var.i();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeAMapAppResourceListener(AMap.AMapAppResourceRequestListener aMapAppResourceRequestListener) {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.f(Integer.valueOf(AMap.AMapAppResourceRequestListener.class.hashCode()), aMapAppResourceRequestListener);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void removeEngineGLOverlay(BaseMapOverlay baseMapOverlay) {
        if (this.d0 != null) {
            queueEvent(new e0(baseMapOverlay));
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final boolean removeGLModel(String str) {
        try {
            this.m.removeOverlay(str);
            return false;
        } catch (Throwable th) {
            m2t.r(th, "AMapDelegateImp", "removeGLModel");
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void removeGLOverlay(String str) throws RemoteException {
        resetRenderTime();
        this.m.removeOverlay(str);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnCameraChangeListener(AMap.OnCameraChangeListener onCameraChangeListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.f(Integer.valueOf(AMap.OnCameraChangeListener.class.hashCode()), onCameraChangeListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnIndoorBuildingActiveListener(AMap.OnIndoorBuildingActiveListener onIndoorBuildingActiveListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.f(Integer.valueOf(AMap.OnIndoorBuildingActiveListener.class.hashCode()), onIndoorBuildingActiveListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnInfoWindowClickListener(AMap.OnInfoWindowClickListener onInfoWindowClickListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.f(Integer.valueOf(AMap.OnInfoWindowClickListener.class.hashCode()), onInfoWindowClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMapClickListener(AMap.OnMapClickListener onMapClickListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.f(Integer.valueOf(AMap.OnMapClickListener.class.hashCode()), onMapClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMapLoadedListener(AMap.OnMapLoadedListener onMapLoadedListener) {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.f(Integer.valueOf(AMap.OnMapLoadedListener.class.hashCode()), onMapLoadedListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMapLongClickListener(AMap.OnMapLongClickListener onMapLongClickListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.f(Integer.valueOf(AMap.OnMapLongClickListener.class.hashCode()), onMapLongClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMapTouchListener(AMap.OnMapTouchListener onMapTouchListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.f(Integer.valueOf(AMap.OnMapTouchListener.class.hashCode()), onMapTouchListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMarkerClickListener(AMap.OnMarkerClickListener onMarkerClickListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.f(Integer.valueOf(AMap.OnMarkerClickListener.class.hashCode()), onMarkerClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMarkerDragListener(AMap.OnMarkerDragListener onMarkerDragListener) {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.f(Integer.valueOf(AMap.OnMarkerDragListener.class.hashCode()), onMarkerDragListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnMyLocationChangeListener(AMap.OnMyLocationChangeListener onMyLocationChangeListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.f(Integer.valueOf(AMap.OnMyLocationChangeListener.class.hashCode()), onMyLocationChangeListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnPOIClickListener(AMap.OnPOIClickListener onPOIClickListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.f(Integer.valueOf(AMap.OnPOIClickListener.class.hashCode()), onPOIClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeOnPolylineClickListener(AMap.OnPolylineClickListener onPolylineClickListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.f(Integer.valueOf(AMap.OnPolylineClickListener.class.hashCode()), onPolylineClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removePoiFilter(String str) {
        GLMapEngine gLMapEngine = this.d0;
        if (gLMapEngine == null) {
            return;
        }
        gLMapEngine.removePoiFilter(str);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removeSignleClickInterceptorListener(AMap.SignleClickInterceptorListener signleClickInterceptorListener) {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.f(Integer.valueOf(AMap.SignleClickInterceptorListener.class.hashCode()), signleClickInterceptorListener);
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
        GLMapRender gLMapRender = this.e0;
        if (gLMapRender == null || gLMapRender.isRenderPause()) {
            return;
        }
        this.j.requestRender();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0049 */
    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resetMinMaxZoomPreference() {
        /*
            r4 = this;
            com.autonavi.base.amap.mapcore.MapConfig r0 = r4.f6086r
            r0.resetMinMaxZoomPreference()
            a6s r0 = r4.g     // Catch: java.lang.Throwable -> L49
            boolean r0 = r0.isZoomControlsEnabled()     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L4b
            com.autonavi.base.amap.mapcore.MapConfig r0 = r4.f6086r     // Catch: java.lang.Throwable -> L49
            boolean r0 = r0.isNeedUpdateZoomControllerState()     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L4b
            ldt r0 = r4.f6084b     // Catch: java.lang.Throwable -> L49
            java.lang.Class<com.autonavi.base.ae.gmap.listener.AMapWidgetListener> r1 = com.autonavi.base.ae.gmap.listener.AMapWidgetListener.class
            int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> L49
            java.util.List r0 = r0.a(r1)     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L4b
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L49
            if (r1 <= 0) goto L4b
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L49
            r1 = 0
        L2b:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L43
            if (r1 >= r2) goto L45
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L43
            com.autonavi.base.ae.gmap.listener.AMapWidgetListener r2 = (com.autonavi.base.ae.gmap.listener.AMapWidgetListener) r2     // Catch: java.lang.Throwable -> L43
            com.autonavi.base.amap.mapcore.MapConfig r3 = r4.f6086r     // Catch: java.lang.Throwable -> L43
            float r3 = r3.getSZ()     // Catch: java.lang.Throwable -> L43
            r2.invalidateZoomController(r3)     // Catch: java.lang.Throwable -> L43
            int r1 = r1 + 1
            goto L2b
        L43:
            r1 = move-exception
            goto L47
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            return
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            throw r1     // Catch: java.lang.Throwable -> L49
        L49:
            r0 = move-exception
            goto L4c
        L4b:
            return
        L4c:
            defpackage.zns.E(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.col.p0003sl.i1.resetMinMaxZoomPreference():void");
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void resetRenderTime() {
        GLMapRender gLMapRender = this.e0;
        if (gLMapRender != null) {
            gLMapRender.resetTickCount(2);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void resetRenderTimeLongLong() {
        GLMapRender gLMapRender = this.e0;
        if (gLMapRender != null) {
            gLMapRender.resetTickCount(30);
        }
    }

    public final void s(boolean z2, byte[] bArr, boolean z3) {
        dks dksVarE;
        try {
            this.f6086r.setCustomStyleEnable(z2);
            boolean z4 = false;
            if (this.f6086r.isHideLogoEnable()) {
                this.g.setLogoEnable(!z2);
            }
            if (!z2) {
                K(this.o, false);
                h(this.o, this.f6086r.getMapStyleMode(), this.f6086r.getMapStyleTime());
                return;
            }
            K(this.o, true);
            aks aksVar = new aks();
            MyTrafficStyle myTrafficStyle = this.K;
            if (myTrafficStyle != null && myTrafficStyle.getTrafficRoadBackgroundColor() != -1) {
                aksVar.i(this.K.getTrafficRoadBackgroundColor());
            }
            if (this.f6086r.isProFunctionAuthEnable() && !TextUtils.isEmpty(this.f6086r.getCustomTextureResourcePath())) {
                z4 = true;
            }
            StyleItem[] styleItemArrC = null;
            if (bArr != null) {
                dksVarE = aksVar.f(bArr, z4);
                if (dksVarE != null && (styleItemArrC = dksVarE.c()) != null) {
                    this.f6086r.setUseProFunction(true);
                }
            } else {
                dksVarE = null;
            }
            if (styleItemArrC == null && (dksVarE = aksVar.e(this.f6086r.getCustomStylePath(), z4)) != null) {
                styleItemArrC = dksVarE.c();
            }
            if (aksVar.a() != 0) {
                this.f6086r.setCustomBackgroundColor(aksVar.a());
            }
            if (dksVarE == null || dksVarE.d() == null) {
                t(styleItemArrC, z3);
            } else if (this.Y != null) {
                this.Y.d((String) dksVarE.d());
                this.Y.c(dksVarE);
                this.Y.b();
            }
        } catch (Throwable th) {
            zns.E(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void set3DBuildingEnabled(boolean z2) throws RemoteException {
        try {
            J(this.o);
            l(this.o, z2);
            P(this.o);
        } catch (Throwable th) {
            zns.E(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setAMapGestureListener(AMapGestureListener aMapGestureListener) {
        k4s k4sVar = this.f0;
        if (k4sVar != null) {
            this.c = aMapGestureListener;
            k4sVar.d(aMapGestureListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCenterToPixel(int i2, int i3) throws RemoteException {
        this.s = true;
        this.v0 = i2;
        this.w0 = i3;
        if (this.q0 && this.p0) {
            if (this.f6086r.getAnchorX() == this.v0 && this.f6086r.getAnchorY() == this.w0) {
                return;
            }
            this.f6086r.setAnchorX(this.v0);
            this.f6086r.setAnchorY(this.w0);
            queueEvent(new x());
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setConstructingRoadEnable(boolean z2) {
        try {
            if (this.p0 && this.q0) {
                resetRenderTime();
                queueEvent(new t(z2));
            } else {
                t0 t0Var = this.O0;
                t0Var.f6137b = z2;
                t0Var.f6136a = true;
                t0Var.e = this.o;
            }
        } catch (Throwable th) {
            zns.E(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCurrentLocation(LatLng latLng) {
        GLMapEngine gLMapEngine = this.d0;
        if (gLMapEngine == null) {
            return;
        }
        gLMapEngine.setCurrentLocation(latLng);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCustomMapStyle(CustomMapStyleOptions customMapStyleOptions) {
        if (customMapStyleOptions != null) {
            try {
                if (y(true, false)) {
                    return;
                }
                if (customMapStyleOptions.isEnable() && (customMapStyleOptions.getStyleId() != null || customMapStyleOptions.getStyleTexturePath() != null || customMapStyleOptions.getStyleTextureData() != null || customMapStyleOptions.getStyleResDataPath() != null || customMapStyleOptions.getStyleResData() != null)) {
                    w0();
                }
                this.A0.m();
                this.A0.c(customMapStyleOptions);
                com.autonavi.extra.b bVar = this.V0;
                if (bVar != null) {
                    bVar.i();
                }
            } catch (Throwable th) {
                zns.E(th);
                return;
            }
        }
        resetRenderTime();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCustomMapStyleID(String str) {
        if (TextUtils.isEmpty(str) || str.equals(this.f6086r.getCustomStyleID())) {
            return;
        }
        this.f6086r.setCustomStyleID(str);
        this.i = true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCustomMapStylePath(String str) {
        if (TextUtils.isEmpty(str) || str.equals(this.f6086r.getCustomStylePath())) {
            return;
        }
        this.f6086r.setCustomStylePath(str);
        this.i = true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCustomRenderer(CustomRenderer customRenderer) throws RemoteException {
        this.S = customRenderer;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCustomScreenDensity(float f2) {
        this.b0 = f2;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setCustomTextureResourcePath(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f6086r.setCustomTextureResourcePath(str);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setGestureStatus(int i2, int i3) {
        if (this.u0 == 0 || i3 != 5) {
            this.u0 = i3;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setHideLogoEnble(boolean z2) {
        MapConfig mapConfig = this.f6086r;
        if (mapConfig != null) {
            mapConfig.setHideLogoEnble(z2);
            if (this.f6086r.isCustomStyleEnable()) {
                this.g.setLogoEnable(!z2);
            }
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setIndoorBuildingInfo(IndoorBuildingInfo indoorBuildingInfo) throws RemoteException {
        if (this.p.get() || indoorBuildingInfo == null || indoorBuildingInfo.activeFloorName == null || indoorBuildingInfo.poiid == null) {
            return;
        }
        this.u = (t8s) indoorBuildingInfo;
        resetRenderTime();
        queueEvent(new z());
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setIndoorEnabled(boolean z2) throws RemoteException {
        List listA;
        try {
            if (!this.p0 || this.p.get()) {
                t0 t0Var = this.S0;
                t0Var.f6137b = z2;
                t0Var.f6136a = true;
                t0Var.e = this.o;
                return;
            }
            this.f6086r.setIndoorEnable(z2);
            resetRenderTime();
            if (z2) {
                GLMapEngine gLMapEngine = this.d0;
                if (gLMapEngine != null) {
                    gLMapEngine.setIndoorEnable(this.o, true);
                }
            } else {
                GLMapEngine gLMapEngine2 = this.d0;
                if (gLMapEngine2 != null) {
                    gLMapEngine2.setIndoorEnable(this.o, false);
                }
                MapConfig mapConfig = this.f6086r;
                mapConfig.maxZoomLevel = mapConfig.isSetLimitZoomLevel() ? this.f6086r.getMaxZoomLevel() : 20.0f;
                try {
                    if (this.g.isZoomControlsEnabled() && (listA = this.f6084b.a(AMapWidgetListener.class.hashCode())) != null && listA.size() > 0) {
                        synchronized (listA) {
                            for (int i2 = 0; i2 < listA.size(); i2++) {
                                try {
                                    ((AMapWidgetListener) listA.get(i2)).invalidateZoomController(this.f6086r.getSZ());
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            mms.n(this.c0, z2);
            if (this.g.isIndoorSwitchEnabled()) {
                this.F0.post(new o(z2));
            }
        } catch (Throwable th2) {
            zns.E(th2);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setInfoWindowAdapter(AMap.InfoWindowAdapter infoWindowAdapter) throws RemoteException {
        u8s u8sVar;
        if (this.p.get() || (u8sVar = this.d) == null) {
            return;
        }
        u8sVar.i(infoWindowAdapter);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setLoadOfflineData(boolean z2) throws RemoteException {
        queueEvent(new p(z2));
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setLocationSource(LocationSource locationSource) throws RemoteException {
        try {
            if (this.p.get()) {
                return;
            }
            LocationSource locationSource2 = this.w;
            if (locationSource2 != null && (locationSource2 instanceof com.amap.api.col.p0003sl.a)) {
                locationSource2.deactivate();
            }
            this.w = locationSource;
            if (locationSource != null) {
                this.f6085k.n(Boolean.TRUE);
            } else {
                this.f6085k.n(Boolean.FALSE);
            }
        } catch (Throwable th) {
            m2t.r(th, "AMapDelegateImp", "setLocationSource");
            th.printStackTrace();
            zns.E(th);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setLogoBottomMargin(int i2) {
        com.amap.api.col.p0003sl.s sVar = this.f6085k;
        if (sVar != null) {
            sVar.d(Integer.valueOf(i2));
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setLogoLeftMargin(int i2) {
        com.amap.api.col.p0003sl.s sVar = this.f6085k;
        if (sVar != null) {
            sVar.f(Integer.valueOf(i2));
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setLogoMarginRate(int i2, float f2) {
        com.amap.api.col.p0003sl.s sVar = this.f6085k;
        if (sVar != null) {
            sVar.a(Integer.valueOf(i2), Float.valueOf(f2));
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setLogoPosition(int i2) {
        com.amap.api.col.p0003sl.s sVar = this.f6085k;
        if (sVar != null) {
            sVar.i(Integer.valueOf(i2));
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setMapCustomEnable(boolean z2, boolean z3) {
        com.amap.api.col.p0003sl.i iVar;
        if (!this.p0 || this.p.get()) {
            t0 t0Var = this.J0;
            t0Var.f6136a = true;
            t0Var.f6137b = z2;
            return;
        }
        boolean z4 = z3 ? z3 : false;
        if (TextUtils.isEmpty(this.f6086r.getCustomStylePath()) && TextUtils.isEmpty(this.f6086r.getCustomStyleID())) {
            return;
        }
        if (z2) {
            try {
                if (this.f6086r.isProFunctionAuthEnable() && !TextUtils.isEmpty(this.f6086r.getCustomStyleID()) && (iVar = this.X) != null) {
                    iVar.b(this.f6086r.getCustomStyleID());
                    this.X.b();
                }
            } catch (Throwable th) {
                th.printStackTrace();
                zns.E(th);
                return;
            }
        }
        if (z3 || this.i || (this.f6086r.isCustomStyleEnable() ^ z2)) {
            s(z2, null, z4);
        }
        this.i = false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setMapEnable(boolean z2) {
        MapConfig mapConfig = this.f6086r;
        if (mapConfig != null) {
            mapConfig.setMapEnable(z2);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapLanguage(String str) {
        MapConfig mapConfig;
        if (TextUtils.isEmpty(str) || (mapConfig = this.f6086r) == null || mapConfig.isCustomStyleEnable() || this.f6086r.getMapLanguage().equals(str)) {
            return;
        }
        if (!str.equals("en")) {
            this.f6086r.setMapLanguage("zh_cn");
            this.R = 0;
        } else {
            if (this.J != 1) {
                try {
                    setMapType(1);
                } catch (Throwable th) {
                    zns.E(th);
                    th.printStackTrace();
                }
            }
            this.f6086r.setMapLanguage("en");
            this.R = -10000;
        }
        try {
            F(getCameraPosition());
        } catch (Throwable th2) {
            zns.E(th2);
            th2.printStackTrace();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapOptRecordState(boolean z2) {
        GLMapEngine gLMapEngine = this.d0;
        if (gLMapEngine == null) {
            return;
        }
        gLMapEngine.setMapOptRecordState(z2);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapStatusLimits(LatLngBounds latLngBounds) {
        try {
            this.f6086r.setLimitLatLngBounds(latLngBounds);
            y0();
        } catch (Throwable th) {
            th.printStackTrace();
            zns.E(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapTextEnable(boolean z2) throws RemoteException {
        try {
            if (this.p0 && this.q0) {
                resetRenderTime();
                queueEvent(new q(z2));
            } else {
                t0 t0Var = this.L0;
                t0Var.f6137b = z2;
                t0Var.f6136a = true;
                t0Var.e = this.o;
            }
        } catch (Throwable th) {
            zns.E(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapTextZIndex(int i2) throws RemoteException {
        this.R = i2;
        this.C0 = false;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapType(int i2) throws RemoteException {
        MapConfig mapConfig;
        if (i2 != this.J || ((mapConfig = this.f6086r) != null && mapConfig.isCustomStyleEnable())) {
            this.J = i2;
            e0(i2);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setMapWidgetListener(AMapWidgetListener aMapWidgetListener) {
        try {
            ldt ldtVar = this.f6084b;
            if (ldtVar != null) {
                ldtVar.c(AMapWidgetListener.class.hashCode(), aMapWidgetListener);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMaskLayerParams(int i2, int i3, int i4, int i5, int i6, long j2) {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMaxZoomLevel(float f2) {
        this.f6086r.setMaxZoomLevel(f2);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMinZoomLevel(float f2) {
        this.f6086r.setMinZoomLevel(f2);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMyLocationEnabled(boolean z2) throws RemoteException {
        if (this.p.get()) {
            return;
        }
        try {
            com.amap.api.col.p0003sl.s sVar = this.f6085k;
            if (sVar != null) {
                LocationSource locationSource = this.w;
                if (locationSource == null) {
                    sVar.n(Boolean.FALSE);
                } else if (z2) {
                    locationSource.activate(this.f6083a);
                    this.f6085k.n(Boolean.TRUE);
                    if (this.v == null) {
                        this.v = new nhs(this, this.c0);
                    }
                } else {
                    nhs nhsVar = this.v;
                    if (nhsVar != null) {
                        nhsVar.o();
                        this.v = null;
                    }
                    this.w.deactivate();
                }
            }
            if (!z2) {
                this.g.setMyLocationButtonEnabled(z2);
            }
            this.n = z2;
            resetRenderTime();
        } catch (Throwable th) {
            m2t.r(th, "AMapDelegateImp", "setMyLocationEnabled");
            th.printStackTrace();
            zns.E(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMyLocationRotateAngle(float f2) throws RemoteException {
        try {
            nhs nhsVar = this.v;
            if (nhsVar != null) {
                nhsVar.b(f2);
            }
        } catch (Throwable th) {
            zns.E(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMyLocationStyle(MyLocationStyle myLocationStyle) throws RemoteException {
        if (this.p.get()) {
            return;
        }
        try {
            if (this.v == null) {
                this.v = new nhs(this, this.c0);
            }
            if (this.v != null) {
                if (myLocationStyle.getInterval() < 1000) {
                    myLocationStyle.interval(1000L);
                }
                LocationSource locationSource = this.w;
                if (locationSource != null && (locationSource instanceof com.amap.api.col.p0003sl.a)) {
                    ((com.amap.api.col.p0003sl.a) locationSource).d(myLocationStyle.getInterval());
                    ((com.amap.api.col.p0003sl.a) this.w).c(myLocationStyle.getMyLocationType());
                }
                this.v.g(myLocationStyle);
            }
        } catch (Throwable th) {
            zns.E(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMyLocationType(int i2) throws RemoteException {
        try {
            nhs nhsVar = this.v;
            if (nhsVar == null || nhsVar.a() == null) {
                return;
            }
            this.v.a().myLocationType(i2);
            setMyLocationStyle(this.v.a());
        } catch (Throwable th) {
            zns.E(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setNaviLabelEnable(boolean z2, int i2, int i3) throws RemoteException {
        try {
            if (this.p0 && this.q0) {
                resetRenderTime();
                queueEvent(new s(z2, i2, i3));
                return;
            }
            t0 t0Var = this.N0;
            t0Var.f6137b = z2;
            t0Var.f = i2;
            t0Var.g = i3;
            t0Var.f6136a = true;
            t0Var.e = this.o;
        } catch (Throwable th) {
            zns.E(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnCameraChangeListener(AMap.OnCameraChangeListener onCameraChangeListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.c(AMap.OnCameraChangeListener.class.hashCode(), onCameraChangeListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnIndoorBuildingActiveListener(AMap.OnIndoorBuildingActiveListener onIndoorBuildingActiveListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.c(AMap.OnIndoorBuildingActiveListener.class.hashCode(), onIndoorBuildingActiveListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnInfoWindowClickListener(AMap.OnInfoWindowClickListener onInfoWindowClickListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.c(AMap.OnInfoWindowClickListener.class.hashCode(), onInfoWindowClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMapClickListener(AMap.OnMapClickListener onMapClickListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.c(AMap.OnMapClickListener.class.hashCode(), onMapClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMapLongClickListener(AMap.OnMapLongClickListener onMapLongClickListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.c(AMap.OnMapLongClickListener.class.hashCode(), onMapLongClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMapTouchListener(AMap.OnMapTouchListener onMapTouchListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.c(AMap.OnMapTouchListener.class.hashCode(), onMapTouchListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMaploadedListener(AMap.OnMapLoadedListener onMapLoadedListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.c(AMap.OnMapLoadedListener.class.hashCode(), onMapLoadedListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMarkerClickListener(AMap.OnMarkerClickListener onMarkerClickListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.c(AMap.OnMarkerClickListener.class.hashCode(), onMarkerClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMarkerDragListener(AMap.OnMarkerDragListener onMarkerDragListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.c(AMap.OnMarkerDragListener.class.hashCode(), onMarkerDragListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMultiPointClickListener(AMap.OnMultiPointClickListener onMultiPointClickListener) {
        this.z0 = onMultiPointClickListener;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnMyLocationChangeListener(AMap.OnMyLocationChangeListener onMyLocationChangeListener) {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.c(AMap.OnMyLocationChangeListener.class.hashCode(), onMyLocationChangeListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnPOIClickListener(AMap.OnPOIClickListener onPOIClickListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.c(AMap.OnPOIClickListener.class.hashCode(), onPOIClickListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setOnPolylineClickListener(AMap.OnPolylineClickListener onPolylineClickListener) throws RemoteException {
        ldt ldtVar = this.f6084b;
        if (ldtVar != null) {
            ldtVar.c(AMap.OnPolylineClickListener.class.hashCode(), onPolylineClickListener);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setOverseaAuth(boolean z2) {
        if (this.p.get()) {
            return;
        }
        this.d0.setOverseaAuth(z2);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setRenderFps(int i2) {
        try {
            if (i2 == -1) {
                this.U = i2;
            } else {
                this.U = Math.max(10, Math.min(i2, 120));
            }
            mms.r(this.c0);
        } catch (Throwable th) {
            zns.E(th);
            th.printStackTrace();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setRenderMode(int i2) {
        try {
            IGLSurfaceView iGLSurfaceView = this.j;
            if (iGLSurfaceView != null) {
                iGLSurfaceView.setRenderMode(i2);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setRoadArrowEnable(boolean z2) throws RemoteException {
        try {
            if (this.p0 && this.q0) {
                resetRenderTime();
                queueEvent(new r(z2));
            } else {
                t0 t0Var = this.M0;
                t0Var.f6137b = z2;
                t0Var.f6136a = true;
                t0Var.e = this.o;
            }
        } catch (Throwable th) {
            zns.E(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setRunLowFrame(boolean z2) {
        if (z2) {
            return;
        }
        try {
            if (this.U == -1) {
                t0();
            }
        } catch (Throwable th) {
            zns.E(th);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setTerrainAuth(boolean z2) {
        GLMapEngine gLMapEngine;
        if (this.p.get() || (gLMapEngine = this.d0) == null) {
            return;
        }
        gLMapEngine.setTerrainAuth(z2);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setTouchPoiEnable(boolean z2) {
        MapConfig mapConfig = this.f6086r;
        if (mapConfig != null) {
            mapConfig.setTouchPoiEnable(z2);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setTrafficEnabled(boolean z2) throws RemoteException {
        try {
            if (this.p0 && !this.p.get()) {
                queueEvent(new n(z2, z2));
                return;
            }
            t0 t0Var = this.G0;
            t0Var.f6137b = z2;
            t0Var.f6136a = true;
            t0Var.e = this.o;
        } catch (Throwable th) {
            zns.E(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setTrafficStyleWithTexture(byte[] bArr, MyTrafficStyle myTrafficStyle) {
        if (this.p.get()) {
            return;
        }
        try {
            if (this.p0 && this.q0 && bArr != null && myTrafficStyle != null) {
                resetRenderTime();
                queueEvent(new u(bArr, myTrafficStyle));
                return;
            }
            t0 t0Var = this.Q0;
            t0Var.h = bArr;
            t0Var.i = myTrafficStyle;
            t0Var.f6136a = true;
            t0Var.e = this.o;
        } catch (Exception e2) {
            zns.E(e2);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setTrafficStyleWithTextureData(byte[] bArr) {
        if (this.p.get()) {
            return;
        }
        try {
            if (this.p0 && this.q0 && bArr != null) {
                resetRenderTime();
                queueEvent(new w(bArr));
            } else {
                t0 t0Var = this.P0;
                t0Var.h = bArr;
                t0Var.f6136a = true;
                t0Var.e = this.o;
            }
        } catch (Throwable th) {
            zns.E(th);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setUseForNavi(boolean z2) {
        this.V = z2;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setVisibilityEx(int i2) {
        IGLSurfaceView iGLSurfaceView = this.j;
        if (iGLSurfaceView != null) {
            try {
                iGLSurfaceView.setVisibility(i2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setWorldVectorMapStyle(String str) {
        if (y(false, true) || TextUtils.isEmpty(str) || this.f6086r == null || this.X0.equals(str)) {
            return;
        }
        this.X0 = str;
        com.autonavi.extra.b bVar = this.V0;
        if (bVar != null) {
            bVar.i();
        }
        resetRenderTime();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setZOrderOnTop(boolean z2) throws RemoteException {
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setZoomPosition(int i2) {
        com.amap.api.col.p0003sl.s sVar;
        if (this.p.get() || (sVar = this.f6085k) == null) {
            return;
        }
        sVar.a(Integer.valueOf(i2));
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setZoomScaleParam(float f2) {
        this.k0 = f2;
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showCompassEnabled(boolean z2) {
        com.amap.api.col.p0003sl.s sVar;
        if (this.p.get() || (sVar = this.f6085k) == null) {
            return;
        }
        sVar.e(Boolean.valueOf(z2));
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void showHideBuildings(int i2) {
        if (this.d0 == null) {
            return;
        }
        queueEvent(new h0(i2));
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showIndoorSwitchControlsEnabled(boolean z2) {
        com.amap.api.col.p0003sl.s sVar;
        if (this.p.get() || (sVar = this.f6085k) == null) {
            return;
        }
        sVar.c(Boolean.valueOf(z2));
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showInfoWindow(BaseOverlayImp baseOverlayImp) throws RemoteException {
        u8s u8sVar;
        if (baseOverlayImp == null || (u8sVar = this.d) == null) {
            return;
        }
        try {
            u8sVar.k(baseOverlayImp);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showLogoEnabled(boolean z2) {
        if (this.p.get()) {
            return;
        }
        this.f6085k.h(Boolean.valueOf(z2));
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showMyLocationButtonEnabled(boolean z2) {
        com.amap.api.col.p0003sl.s sVar;
        if (this.p.get() || (sVar = this.f6085k) == null) {
            return;
        }
        sVar.g(Boolean.valueOf(z2));
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showMyLocationOverlay(Location location) throws RemoteException {
        if (location == null) {
            return;
        }
        try {
            if (this.n && this.w != null) {
                if (this.v == null) {
                    this.v = new nhs(this, this.c0);
                }
                if (location.getLongitude() != 0.0d && location.getLatitude() != 0.0d) {
                    this.v.e(location);
                }
                List listA = this.f6084b.a(AMap.OnMyLocationChangeListener.class.hashCode());
                if (listA != null && listA.size() > 0) {
                    synchronized (listA) {
                        for (int i2 = 0; i2 < listA.size(); i2++) {
                            try {
                                ((AMap.OnMyLocationChangeListener) listA.get(i2)).onMyLocationChange(location);
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
                resetRenderTime();
                return;
            }
            nhs nhsVar = this.v;
            if (nhsVar != null) {
                nhsVar.o();
            }
            this.v = null;
        } catch (Throwable th2) {
            m2t.r(th2, "AMapDelegateImp", "showMyLocationOverlay");
            th2.printStackTrace();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showScaleEnabled(boolean z2) {
        com.amap.api.col.p0003sl.s sVar;
        if (this.p.get() || (sVar = this.f6085k) == null) {
            return;
        }
        sVar.j(Boolean.valueOf(z2));
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showZoomControlsEnabled(boolean z2) {
        com.amap.api.col.p0003sl.s sVar;
        if (this.p.get() || (sVar = this.f6085k) == null) {
            return;
        }
        sVar.b(Boolean.valueOf(z2));
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void stopAnimation() throws RemoteException {
        try {
            GLMapEngine gLMapEngine = this.d0;
            if (gLMapEngine != null) {
                gLMapEngine.interruptAnimation();
            }
            resetRenderTime();
        } catch (Throwable th) {
            zns.E(th);
        }
    }

    public final void t(StyleItem[] styleItemArr, boolean z2) {
        if (!z2 && (styleItemArr == null || styleItemArr.length <= 0)) {
            mms.h(this.c0, false);
        } else {
            j(this.o, 0, 0, true, styleItemArr);
            mms.h(this.c0, true);
        }
    }

    public final void t0() {
        GLMapRender gLMapRender;
        if (!this.p0 || (gLMapRender = this.e0) == null || gLMapRender.isRenderPause()) {
            return;
        }
        requestRender();
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final float toMapLenWithWin(int i2) {
        GLMapEngine gLMapEngine;
        if (!this.p0 || this.q || (gLMapEngine = this.d0) == null) {
            return 0.0f;
        }
        return gLMapEngine.getMapState(this.o).getGLUnitWithWin(i2);
    }

    public final boolean u(int i2, int i3) {
        AbstractCameraUpdateMessage abstractCameraUpdateMessageD;
        if (!this.p0 || ((int) N()) >= this.f6086r.getMaxZoomLevel()) {
            return false;
        }
        try {
            if (this.s || this.g.isZoomInByScreenCenter()) {
                abstractCameraUpdateMessageD = a7s.d(1.0f, null);
            } else {
                Point point = this.c1;
                point.x = i2;
                point.y = i3;
                abstractCameraUpdateMessageD = a7s.d(1.0f, point);
            }
            animateCamera(abstractCameraUpdateMessageD);
        } catch (Throwable th) {
            m2t.r(th, "AMapDelegateImp", "onDoubleTap");
            th.printStackTrace();
        }
        resetRenderTime();
        return true;
    }

    public final void v0() {
        if (this.P) {
            return;
        }
        try {
            this.L.setName("AuthThread");
            this.L.start();
            this.P = true;
        } catch (Throwable th) {
            th.printStackTrace();
            zns.E(th);
        }
    }

    public final boolean w(CameraPosition cameraPosition, boolean z2) {
        if (z2 && cameraPosition.zoom < 6.0f) {
            return false;
        }
        if (cameraPosition.isAbroad) {
            return true;
        }
        if (this.f6086r != null) {
            return M();
        }
        return false;
    }

    public final void w0() {
        if (this.Q) {
            return;
        }
        try {
            if (this.M == null) {
                this.M = new net(this.c0, this);
            }
            this.M.setName("AuthProThread");
            this.M.start();
            this.Q = true;
        } catch (Throwable th) {
            th.printStackTrace();
            zns.E(th);
        }
    }

    public final boolean y(boolean z2, boolean z3) {
        if (z2) {
            if (this.Z0) {
                oks.c("setCustomMapStyle 和 setWorldVectorMapStyle 不能同时使用，setCustomMapStyle将不会生效");
                return true;
            }
            this.Y0 = true;
        }
        if (!z3) {
            return false;
        }
        if (this.Y0) {
            oks.c("setCustomMapStyle 和 setWorldVectorMapStyle 不能同时使用，setWorldVectorMapStyle将不会生效");
            return true;
        }
        this.Z0 = true;
        return false;
    }

    public final void y0() {
        try {
            LatLngBounds limitLatLngBounds = this.f6086r.getLimitLatLngBounds();
            if (this.d0 != null && x(limitLatLngBounds)) {
                GLMapState gLMapState = new GLMapState(this.o, this.d0.getNativeInstance());
                IPoint iPointObtain = IPoint.obtain();
                LatLng latLng = limitLatLngBounds.northeast;
                GLMapState.lonlat2Geo(latLng.longitude, latLng.latitude, iPointObtain);
                IPoint iPointObtain2 = IPoint.obtain();
                LatLng latLng2 = limitLatLngBounds.southwest;
                GLMapState.lonlat2Geo(latLng2.longitude, latLng2.latitude, iPointObtain2);
                this.f6086r.setLimitIPoints(new IPoint[]{iPointObtain, iPointObtain2});
                gLMapState.recycle();
                return;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f6086r.setLimitIPoints(null);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void zoomOut(int i2) {
        if (this.p0 && ((int) N()) > this.f6086r.getMinZoomLevel()) {
            try {
                animateCamera(a7s.l());
            } catch (Throwable th) {
                m2t.r(th, "AMapDelegateImp", "onDoubleTap");
                th.printStackTrace();
            }
            resetRenderTime();
        }
    }

    public i1(IGLSurfaceView iGLSurfaceView, Context context, boolean z2) {
        this.f6083a = null;
        this.f6084b = new ldt();
        byte b2 = 0;
        this.h = false;
        this.i = false;
        this.n = false;
        this.p = new AtomicBoolean(false);
        this.q = false;
        this.f6086r = new MapConfig(true);
        this.s = false;
        this.t = false;
        this.x = false;
        this.y = false;
        this.z = null;
        this.A = null;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = 0;
        this.G = true;
        this.H = true;
        this.I = new Rect();
        this.J = 1;
        this.K = null;
        this.P = false;
        this.Q = false;
        this.R = 0;
        this.T = -1;
        this.U = -1;
        this.V = false;
        this.W = new ArrayList();
        this.Z = null;
        this.a0 = -1L;
        this.b0 = 0.0f;
        this.g0 = false;
        this.j0 = 0.0f;
        this.k0 = 1.0f;
        this.l0 = 1.0f;
        this.m0 = true;
        this.n0 = false;
        this.o0 = false;
        this.p0 = false;
        this.q0 = false;
        this.r0 = false;
        this.s0 = false;
        this.t0 = new ReentrantLock();
        this.u0 = 0;
        this.C0 = true;
        this.D0 = false;
        this.E0 = false;
        this.F0 = new k(Looper.getMainLooper());
        this.G0 = new b();
        this.H0 = new m();
        this.I0 = new y();
        this.J0 = new i0();
        this.K0 = new j0();
        this.L0 = new k0();
        this.M0 = new l0();
        this.N0 = new m0();
        this.O0 = new v();
        this.P0 = new g0();
        this.Q0 = new n0();
        this.R0 = new o0();
        this.S0 = new p0();
        this.T0 = new q0();
        this.U0 = new r0();
        this.W0 = "";
        this.X0 = "";
        this.Y0 = false;
        this.Z0 = false;
        this.a1 = 0;
        this.b1 = new EAMapPlatformGestureInfo();
        this.c1 = new Point();
        this.d1 = 0L;
        this.e1 = null;
        this.f1 = null;
        this.g1 = new float[16];
        this.h1 = new float[16];
        this.i1 = new float[16];
        this.j1 = null;
        this.k1 = new float[12];
        this.l1 = "precision highp float;\nattribute vec3 aVertex;//顶点数组,三维坐标\nuniform mat4 aMVPMatrix;//mvp矩阵\nvoid main(){\n  gl_Position = aMVPMatrix * vec4(aVertex, 1.0);\n}";
        this.m1 = "//有颜色 没有纹理\nprecision highp float;\nvoid main(){\n  gl_FragColor = vec4(1.0,0,0,1.0);\n}";
        this.n1 = -1;
        this.c0 = context;
        y0 y0VarA = iu.a(context, zns.t());
        iu.c cVar = y0VarA.f6352a;
        iu.c cVar2 = iu.c.SuccessCode;
        if (cVar == cVar2) {
            jos.d(context);
            jos.e(gos.c, "init map delegate");
        }
        com.autonavi.extra.b bVar = new com.autonavi.extra.b();
        this.V0 = bVar;
        bVar.a();
        this.V0.b();
        m2t.h(this.c0);
        gls.a().b(this.c0);
        ugt.c = e0t.g(context);
        lks.a(this.c0);
        this.f0 = new k4s(this);
        GLMapRender gLMapRender = new GLMapRender(this);
        this.e0 = gLMapRender;
        this.j = iGLSurfaceView;
        iGLSurfaceView.setRenderer(gLMapRender);
        n4s n4sVar = new n4s(this, this.c0);
        this.m = n4sVar;
        this.d0 = new GLMapEngine(this.c0, this);
        this.l = new ae(this.c0, this);
        this.f6085k = new em(this.c0, this, n4sVar, this.l);
        this.g = new a6s(this);
        this.f6085k.p(new v0(this, b2));
        this.x0 = new u0();
        iGLSurfaceView.setRenderMode(0);
        this.e0.setRenderFps(15.0f);
        this.d0.setMapListener(this);
        this.f = new m5s(this);
        this.f6083a = new yct(this);
        u8s u8sVar = new u8s(this.c0);
        this.d = u8sVar;
        u8sVar.l(this.f6085k);
        this.d.s(new vhs(n4sVar, context));
        this.L = new k1(this.c0, this);
        this.w = new com.amap.api.col.p0003sl.a(this.c0);
        this.X = new com.amap.api.col.p0003sl.i(this.c0, this);
        com.amap.api.col.p0003sl.k kVar = new com.amap.api.col.p0003sl.k(this.c0);
        this.Y = kVar;
        kVar.b(this);
        r(z2);
        MapConfig mapConfig = this.f6086r;
        g1 g1Var = new g1(this, this.c0, mapConfig != null ? mapConfig.isAbroadEnable() : false);
        this.A0 = g1Var;
        g1Var.b(this);
        if (y0VarA.f6352a != cVar2) {
            this.f6086r.setMapEnable(false);
        }
        this.o = this.d0.getEngineIDWithType(1);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void animateCamera(AbstractCameraUpdateMessage abstractCameraUpdateMessage) throws RemoteException {
        animateCameraWithDurationAndCallback(abstractCameraUpdateMessage, 250L, (AMap.CancelableCallback) null);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void animateCameraWithDurationAndCallback(AbstractCameraUpdateMessage abstractCameraUpdateMessage, long j2, AMap.CancelableCallback cancelableCallback) {
        if (abstractCameraUpdateMessage == null || this.p.get() || this.d0 == null) {
            return;
        }
        abstractCameraUpdateMessage.mCallback = cancelableCallback;
        abstractCameraUpdateMessage.mDuration = j2;
        if (!this.q && getMapHeight() != 0 && getMapWidth() != 0) {
            try {
                this.d0.interruptAnimation();
                resetRenderTime();
                p(abstractCameraUpdateMessage);
                this.d0.addMessage(abstractCameraUpdateMessage, true);
                return;
            } catch (Throwable th) {
                zns.E(th);
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
            zns.E(th2);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void removecache(AMap.OnCacheRemoveListener onCacheRemoveListener) throws RemoteException {
        if (this.F0 == null || this.d0 == null) {
            return;
        }
        try {
            w0 w0Var = new w0(this.c0, onCacheRemoveListener);
            this.F0.removeCallbacks(w0Var);
            this.F0.post(w0Var);
        } catch (Throwable th) {
            m2t.r(th, "AMapDelegateImp", "removecache");
            th.printStackTrace();
            zns.E(th);
        }
    }

    @Override // com.amap.api.col.3sl.k.a
    public final void a(String str, dks dksVar) {
        setCustomTextureResourcePath(str);
        if (!this.f6086r.isCustomStyleEnable() || dksVar == null) {
            return;
        }
        t(dksVar.c(), false);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void moveCamera(AbstractCameraUpdateMessage abstractCameraUpdateMessage) throws RemoteException {
        if (this.d0 == null || this.p.get()) {
            return;
        }
        try {
            if (this.q && this.d0.getStateMessageCount() > 0) {
                AbstractCameraUpdateMessage abstractCameraUpdateMessageO = a7s.o();
                abstractCameraUpdateMessageO.nowType = AbstractCameraUpdateMessage.Type.changeGeoCenterZoomTiltBearing;
                abstractCameraUpdateMessageO.geoPoint = new DPoint(this.f6086r.getSX(), this.f6086r.getSY());
                abstractCameraUpdateMessageO.zoom = this.f6086r.getSZ();
                abstractCameraUpdateMessageO.bearing = this.f6086r.getSR();
                abstractCameraUpdateMessageO.tilt = this.f6086r.getSC();
                this.d0.addMessage(abstractCameraUpdateMessage, false);
                while (this.d0.getStateMessageCount() > 0) {
                    AbstractCameraUpdateMessage stateMessage = this.d0.getStateMessage();
                    if (stateMessage != null) {
                        stateMessage.mergeCameraUpdateDelegate(abstractCameraUpdateMessageO);
                    }
                }
                abstractCameraUpdateMessage = abstractCameraUpdateMessageO;
            }
        } catch (Throwable th) {
            zns.E(th);
        }
        resetRenderTime();
        this.d0.clearAnimations(this.o, false);
        abstractCameraUpdateMessage.isChangeFinished = true;
        p(abstractCameraUpdateMessage);
        this.d0.addMessage(abstractCameraUpdateMessage, false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setInfoWindowAdapter(AMap.CommonInfoWindowAdapter commonInfoWindowAdapter) throws RemoteException {
        u8s u8sVar;
        if (this.p.get() || (u8sVar = this.d) == null) {
            return;
        }
        u8sVar.h(commonInfoWindowAdapter);
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void showInfoWindow(BaseOverlay baseOverlay) throws RemoteException {
        u8s u8sVar;
        if (baseOverlay == null || (u8sVar = this.d) == null) {
            return;
        }
        try {
            u8sVar.j(baseOverlay);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    public static abstract class t0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f6136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f6137b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public byte[] h;
        public MyTrafficStyle i;

        public t0() {
            this.f6136a = false;
            this.f6137b = false;
            this.f = 0;
            this.g = 0;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6136a = false;
        }

        public /* synthetic */ t0(byte b2) {
            this();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void clear(boolean z2) throws RemoteException {
        String strQ;
        try {
            hideInfoWindow();
            String strR = "";
            nhs nhsVar = this.v;
            if (nhsVar == null) {
                strQ = null;
            } else if (z2) {
                strQ = nhsVar.q();
                strR = this.v.r();
            } else {
                nhsVar.s();
                strQ = null;
            }
            this.m.clear(strQ, strR);
            queueEvent(new l());
            this.l.clear();
            resetRenderTime();
        } catch (Throwable th) {
            m2t.r(th, "AMapDelegateImp", CervicalMucusRecord.Appearance.CLEAR);
            zns.E(th);
            th.printStackTrace();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.IAMapDelegate
    public final void setCustomMapStyle(boolean z2, byte[] bArr) {
        s(z2, bArr, false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void setMapCustomEnable(boolean z2) {
        if (z2) {
            w0();
        }
        setMapCustomEnable(z2, false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void createSurface(GL10 gl10, EGLConfig eGLConfig) {
        try {
            this.a0 = Thread.currentThread().getId();
        } catch (Throwable th) {
            th.printStackTrace();
            zns.E(th);
        }
        try {
            createSurface(1, gl10, eGLConfig);
        } catch (Throwable th2) {
            th2.printStackTrace();
            zns.E(th2);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IAMap
    public final void changeSurface(GL10 gl10, int i2, int i3) {
        try {
            changeSurface(1, gl10, i2, i3);
        } catch (Throwable th) {
            th.printStackTrace();
            zns.E(th);
        }
    }
}
