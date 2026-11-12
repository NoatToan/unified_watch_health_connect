package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.amap.api.maps.model.AMapGestureListener;
import com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.mapcore.message.HoverGestureMapMessage;
import com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage;
import com.autonavi.base.amap.mapcore.message.RotateGestureMapMessage;
import com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class o {
    public IAMapDelegate a;
    public Context b;
    public GestureDetector c;
    public AMapGestureListener d;
    private am e;
    private ak f;
    private aj g;
    private an h;
    private int r;
    private int s;
    private boolean i = false;
    private int j = 0;
    private int k = 0;
    private int l = 0;
    private int m = 0;
    private int n = 0;
    private boolean o = false;
    private boolean p = false;
    private boolean q = true;
    private Handler t = new Handler(Looper.getMainLooper());

    public o(IAMapDelegate iAMapDelegate) {
        byte b2 = 0;
        this.b = iAMapDelegate.getContext();
        this.a = iAMapDelegate;
        a aVar = new a(this, b2);
        GestureDetector gestureDetector = new GestureDetector(this.b, aVar, this.t);
        this.c = gestureDetector;
        gestureDetector.setOnDoubleTapListener(aVar);
        this.e = new am(this.b, new d(this, b2));
        this.f = new ak(this.b, new c(this, b2));
        this.g = new aj(this.b, new b(this, b2));
        this.h = new an(this.b, new e(this, b2));
    }

    public static /* synthetic */ int g(o oVar) {
        int i = oVar.k;
        oVar.k = i + 1;
        return i;
    }

    public static /* synthetic */ int h(o oVar) {
        int i = oVar.l;
        oVar.l = i + 1;
        return i;
    }

    public static /* synthetic */ int l(o oVar) {
        int i = oVar.j;
        oVar.j = i + 1;
        return i;
    }

    public static /* synthetic */ int m(o oVar) {
        int i = oVar.m;
        oVar.m = i + 1;
        return i;
    }

    public static /* synthetic */ boolean n(o oVar) {
        oVar.q = true;
        return true;
    }

    public class b implements aj.a {
        private EAMapPlatformGestureInfo b;

        private b() {
            this.b = new EAMapPlatformGestureInfo();
        }

        @Override // com.amap.api.mapcore.util.aj.a
        public final boolean a(aj ajVar) {
            EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.b;
            eAMapPlatformGestureInfo.mGestureState = 2;
            eAMapPlatformGestureInfo.mGestureType = 6;
            boolean z = false;
            eAMapPlatformGestureInfo.mLocation = new float[]{ajVar.c().getX(), ajVar.c().getY()};
            try {
                if (!o.this.a.getUiSettings().isTiltGesturesEnabled()) {
                    return true;
                }
                int engineIDWithGestureInfo = o.this.a.getEngineIDWithGestureInfo(this.b);
                if (o.this.a.isLockMapCameraDegree(engineIDWithGestureInfo) || o.this.l > 3) {
                    return false;
                }
                float f = ajVar.d().x;
                float f2 = ajVar.d().y;
                if (!o.this.i) {
                    PointF pointFA = ajVar.a(0);
                    PointF pointFA2 = ajVar.a(1);
                    float f3 = pointFA.y;
                    if ((f3 > 10.0f && pointFA2.y > 10.0f) || (f3 < -10.0f && pointFA2.y < -10.0f)) {
                        z = true;
                    }
                    if (z && Math.abs(f2) > 10.0f && Math.abs(f) < 10.0f) {
                        o.this.i = true;
                    }
                }
                if (o.this.i) {
                    o.this.i = true;
                    float f4 = f2 / 6.0f;
                    if (Math.abs(f4) > 1.0f) {
                        o.this.a.addGestureMapMessage(engineIDWithGestureInfo, HoverGestureMapMessage.obtain(101, f4));
                        o.m(o.this);
                    }
                }
                return true;
            } catch (Throwable th) {
                hn.c(th, "GLMapGestrureDetector", "onHove");
                th.printStackTrace();
                return true;
            }
        }

        @Override // com.amap.api.mapcore.util.aj.a
        public final boolean b(aj ajVar) {
            EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.b;
            eAMapPlatformGestureInfo.mGestureState = 1;
            eAMapPlatformGestureInfo.mGestureType = 6;
            eAMapPlatformGestureInfo.mLocation = new float[]{ajVar.c().getX(), ajVar.c().getY()};
            try {
                if (!o.this.a.getUiSettings().isTiltGesturesEnabled()) {
                    return true;
                }
                int engineIDWithGestureInfo = o.this.a.getEngineIDWithGestureInfo(this.b);
                if (o.this.a.isLockMapCameraDegree(engineIDWithGestureInfo)) {
                    return false;
                }
                IAMapDelegate iAMapDelegate = o.this.a;
                iAMapDelegate.addGestureMapMessage(engineIDWithGestureInfo, HoverGestureMapMessage.obtain(100, iAMapDelegate.getCameraDegree(engineIDWithGestureInfo)));
                return true;
            } catch (Throwable th) {
                hn.c(th, "GLMapGestrureDetector", "onHoveBegin");
                th.printStackTrace();
                return true;
            }
        }

        @Override // com.amap.api.mapcore.util.aj.a
        public final void c(aj ajVar) {
            EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.b;
            eAMapPlatformGestureInfo.mGestureState = 3;
            eAMapPlatformGestureInfo.mGestureType = 6;
            eAMapPlatformGestureInfo.mLocation = new float[]{ajVar.c().getX(), ajVar.c().getY()};
            try {
                if (o.this.a.getUiSettings().isTiltGesturesEnabled()) {
                    int engineIDWithGestureInfo = o.this.a.getEngineIDWithGestureInfo(this.b);
                    if (o.this.a.isLockMapCameraDegree(engineIDWithGestureInfo)) {
                        return;
                    }
                    if (o.this.a.getCameraDegree(engineIDWithGestureInfo) >= 0.0f && o.this.m > 0) {
                        o.this.a.setGestureStatus(engineIDWithGestureInfo, 7);
                    }
                    o.this.i = false;
                    IAMapDelegate iAMapDelegate = o.this.a;
                    iAMapDelegate.addGestureMapMessage(engineIDWithGestureInfo, HoverGestureMapMessage.obtain(102, iAMapDelegate.getCameraDegree(engineIDWithGestureInfo)));
                }
            } catch (Throwable th) {
                hn.c(th, "GLMapGestrureDetector", "onHoveEnd");
                th.printStackTrace();
            }
        }

        public /* synthetic */ b(o oVar, byte b) {
            this();
        }
    }

    public class c implements ak.a {
        private EAMapPlatformGestureInfo b;

        private c() {
            this.b = new EAMapPlatformGestureInfo();
        }

        @Override // com.amap.api.mapcore.util.ak.a
        public final boolean a(ak akVar) {
            if (o.this.i) {
                return true;
            }
            try {
                if (o.this.a.getUiSettings().isScrollGesturesEnabled() && !o.this.p) {
                    EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.b;
                    eAMapPlatformGestureInfo.mGestureState = 2;
                    eAMapPlatformGestureInfo.mGestureType = 3;
                    eAMapPlatformGestureInfo.mLocation = new float[]{akVar.c().getX(), akVar.c().getY()};
                    int engineIDWithGestureInfo = o.this.a.getEngineIDWithGestureInfo(this.b);
                    PointF pointFD = akVar.d();
                    float f = o.this.j == 0 ? 4.0f : 1.0f;
                    if (Math.abs(pointFD.x) <= f && Math.abs(pointFD.y) <= f) {
                        return false;
                    }
                    if (o.this.j == 0) {
                        o.this.a.getGLMapEngine().clearAnimations(engineIDWithGestureInfo, false);
                    }
                    o.this.a.addGestureMapMessage(engineIDWithGestureInfo, MoveGestureMapMessage.obtain(101, pointFD.x, pointFD.y));
                    o.l(o.this);
                }
                return true;
            } catch (Throwable th) {
                hn.c(th, "GLMapGestrureDetector", "onMove");
                th.printStackTrace();
                return true;
            }
        }

        @Override // com.amap.api.mapcore.util.ak.a
        public final boolean b(ak akVar) {
            try {
                if (!o.this.a.getUiSettings().isScrollGesturesEnabled()) {
                    return true;
                }
                EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.b;
                eAMapPlatformGestureInfo.mGestureState = 1;
                eAMapPlatformGestureInfo.mGestureType = 3;
                eAMapPlatformGestureInfo.mLocation = new float[]{akVar.c().getX(), akVar.c().getY()};
                o.this.a.addGestureMapMessage(o.this.a.getEngineIDWithGestureInfo(this.b), MoveGestureMapMessage.obtain(100, 0.0f, 0.0f));
                return true;
            } catch (Throwable th) {
                hn.c(th, "GLMapGestrureDetector", "onMoveBegin");
                th.printStackTrace();
                return true;
            }
        }

        @Override // com.amap.api.mapcore.util.ak.a
        public final void c(ak akVar) {
            try {
                if (o.this.a.getUiSettings().isScrollGesturesEnabled()) {
                    EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.b;
                    eAMapPlatformGestureInfo.mGestureState = 3;
                    eAMapPlatformGestureInfo.mGestureType = 3;
                    eAMapPlatformGestureInfo.mLocation = new float[]{akVar.c().getX(), akVar.c().getY()};
                    int engineIDWithGestureInfo = o.this.a.getEngineIDWithGestureInfo(this.b);
                    if (o.this.j > 0) {
                        o.this.a.setGestureStatus(engineIDWithGestureInfo, 5);
                    }
                    o.this.a.addGestureMapMessage(engineIDWithGestureInfo, MoveGestureMapMessage.obtain(102, 0.0f, 0.0f));
                }
            } catch (Throwable th) {
                hn.c(th, "GLMapGestrureDetector", "onMoveEnd");
                th.printStackTrace();
            }
        }

        public /* synthetic */ c(o oVar, byte b) {
            this();
        }
    }

    public class e extends an.b {
        public EAMapPlatformGestureInfo a;

        private e() {
            this.a = new EAMapPlatformGestureInfo();
        }

        @Override // com.amap.api.mapcore.util.an.b, com.amap.api.mapcore.util.an.a
        public final void a(an anVar) {
            try {
                if (o.this.a.getUiSettings().isZoomGesturesEnabled() && Math.abs(anVar.d()) <= 10.0f && Math.abs(anVar.e()) <= 10.0f && anVar.b() < 200) {
                    o.n(o.this);
                    EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.a;
                    eAMapPlatformGestureInfo.mGestureState = 2;
                    eAMapPlatformGestureInfo.mGestureType = 2;
                    eAMapPlatformGestureInfo.mLocation = new float[]{anVar.c().getX(), anVar.c().getY()};
                    int engineIDWithGestureInfo = o.this.a.getEngineIDWithGestureInfo(this.a);
                    o.this.a.setGestureStatus(engineIDWithGestureInfo, 4);
                    o.this.a.zoomOut(engineIDWithGestureInfo);
                }
            } catch (Throwable th) {
                hn.c(th, "GLMapGestrureDetector", "onZoomOut");
                th.printStackTrace();
            }
        }

        public /* synthetic */ e(o oVar, byte b) {
            this();
        }
    }

    public final int c() {
        return this.s;
    }

    public final void d() {
        Handler handler = this.t;
        if (handler != null) {
            handler.removeCallbacks(null);
            this.t = null;
        }
    }

    public final void a() {
        this.j = 0;
        this.l = 0;
        this.k = 0;
        this.m = 0;
        this.n = 0;
    }

    public final int b() {
        return this.r;
    }

    public class a implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener {
        public float a;
        public long b;
        private int d;
        private EAMapPlatformGestureInfo e;

        private a() {
            this.d = 0;
            this.a = 0.0f;
            this.e = new EAMapPlatformGestureInfo();
            this.b = 0L;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            o.this.c.setIsLongpressEnabled(false);
            this.d = motionEvent.getPointerCount();
            AMapGestureListener aMapGestureListener = o.this.d;
            if (aMapGestureListener != null) {
                aMapGestureListener.onDoubleTap(motionEvent.getX(), motionEvent.getY());
            }
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            if (this.d < motionEvent.getPointerCount()) {
                this.d = motionEvent.getPointerCount();
            }
            int action = motionEvent.getAction() & 255;
            if (this.d != 1) {
                return false;
            }
            try {
                if (!o.this.a.getUiSettings().isZoomGesturesEnabled()) {
                    return false;
                }
            } catch (Throwable th) {
                hn.c(th, "GLMapGestrureDetector", "onDoubleTapEvent");
                th.printStackTrace();
            }
            if (action == 0) {
                EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.e;
                eAMapPlatformGestureInfo.mGestureState = 1;
                eAMapPlatformGestureInfo.mGestureType = 9;
                eAMapPlatformGestureInfo.mLocation = new float[]{motionEvent.getX(), motionEvent.getY()};
                int engineIDWithGestureInfo = o.this.a.getEngineIDWithGestureInfo(this.e);
                this.a = motionEvent.getY();
                o.this.a.addGestureMapMessage(engineIDWithGestureInfo, ScaleGestureMapMessage.obtain(100, 1.0f, 0, 0));
                this.b = SystemClock.uptimeMillis();
                return true;
            }
            if (action == 2) {
                o.this.o = true;
                float y = this.a - motionEvent.getY();
                if (Math.abs(y) < 20.0f) {
                    return true;
                }
                EAMapPlatformGestureInfo eAMapPlatformGestureInfo2 = this.e;
                eAMapPlatformGestureInfo2.mGestureState = 2;
                eAMapPlatformGestureInfo2.mGestureType = 9;
                eAMapPlatformGestureInfo2.mLocation = new float[]{motionEvent.getX(), motionEvent.getY()};
                o.this.a.addGestureMapMessage(o.this.a.getEngineIDWithGestureInfo(this.e), ScaleGestureMapMessage.obtain(101, (y * 4.0f) / o.this.a.getMapHeight(), 0, 0));
                this.a = motionEvent.getY();
                return true;
            }
            EAMapPlatformGestureInfo eAMapPlatformGestureInfo3 = this.e;
            eAMapPlatformGestureInfo3.mGestureState = 3;
            eAMapPlatformGestureInfo3.mGestureType = 9;
            eAMapPlatformGestureInfo3.mLocation = new float[]{motionEvent.getX(), motionEvent.getY()};
            int engineIDWithGestureInfo2 = o.this.a.getEngineIDWithGestureInfo(this.e);
            o.this.c.setIsLongpressEnabled(true);
            o.this.a.addGestureMapMessage(engineIDWithGestureInfo2, ScaleGestureMapMessage.obtain(102, 1.0f, 0, 0));
            if (action != 1) {
                o.this.o = false;
                return true;
            }
            o.this.a.setGestureStatus(engineIDWithGestureInfo2, 3);
            long jUptimeMillis = SystemClock.uptimeMillis() - this.b;
            if (!o.this.o || jUptimeMillis < 200) {
                return o.this.a.onDoubleTap(engineIDWithGestureInfo2, motionEvent);
            }
            o.this.o = false;
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            o.this.o = false;
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            AMapGestureListener aMapGestureListener = o.this.d;
            if (aMapGestureListener != null) {
                aMapGestureListener.onFling(f, f2);
            }
            try {
                if (o.this.a.getUiSettings().isScrollGesturesEnabled() && o.this.m <= 0 && o.this.k <= 0 && o.this.l == 0 && !o.this.q) {
                    EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.e;
                    eAMapPlatformGestureInfo.mGestureState = 3;
                    eAMapPlatformGestureInfo.mGestureType = 3;
                    eAMapPlatformGestureInfo.mLocation = new float[]{motionEvent2.getX(), motionEvent2.getY()};
                    int engineIDWithGestureInfo = o.this.a.getEngineIDWithGestureInfo(this.e);
                    o.this.a.onFling();
                    o.this.a.getGLMapEngine().startMapSlidAnim(engineIDWithGestureInfo, new Point((int) motionEvent2.getX(), (int) motionEvent2.getY()), f, f2);
                }
                return true;
            } catch (Throwable th) {
                hn.c(th, "GLMapGestrureDetector", "onFling");
                th.printStackTrace();
                return true;
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            if (o.this.n == 1) {
                EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.e;
                eAMapPlatformGestureInfo.mGestureState = 3;
                eAMapPlatformGestureInfo.mGestureType = 7;
                eAMapPlatformGestureInfo.mLocation = new float[]{motionEvent.getX(), motionEvent.getY()};
                o.this.a.onLongPress(o.this.a.getEngineIDWithGestureInfo(this.e), motionEvent);
                AMapGestureListener aMapGestureListener = o.this.d;
                if (aMapGestureListener != null) {
                    aMapGestureListener.onLongPress(motionEvent.getX(), motionEvent.getY());
                }
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            AMapGestureListener aMapGestureListener = o.this.d;
            if (aMapGestureListener == null) {
                return false;
            }
            aMapGestureListener.onScroll(f, f2);
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onShowPress(MotionEvent motionEvent) {
            try {
                EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.e;
                eAMapPlatformGestureInfo.mGestureState = 3;
                eAMapPlatformGestureInfo.mGestureType = 7;
                eAMapPlatformGestureInfo.mLocation = new float[]{motionEvent.getX(), motionEvent.getY()};
                o.this.a.getGLMapEngine().clearAnimations(o.this.a.getEngineIDWithGestureInfo(this.e), false);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (o.this.n != 1) {
                return false;
            }
            EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.e;
            eAMapPlatformGestureInfo.mGestureState = 3;
            eAMapPlatformGestureInfo.mGestureType = 8;
            eAMapPlatformGestureInfo.mLocation = new float[]{motionEvent.getX(), motionEvent.getY()};
            int engineIDWithGestureInfo = o.this.a.getEngineIDWithGestureInfo(this.e);
            AMapGestureListener aMapGestureListener = o.this.d;
            if (aMapGestureListener != null) {
                try {
                    aMapGestureListener.onSingleTap(motionEvent.getX(), motionEvent.getY());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            return o.this.a.onSingleTapConfirmed(engineIDWithGestureInfo, motionEvent);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }

        public /* synthetic */ a(o oVar, byte b) {
            this();
        }
    }

    public final void a(int i, int i2) {
        this.r = i;
        this.s = i2;
        am amVar = this.e;
        if (amVar != null) {
            amVar.a(i, i2);
        }
        ak akVar = this.f;
        if (akVar != null) {
            akVar.a(i, i2);
        }
        aj ajVar = this.g;
        if (ajVar != null) {
            ajVar.a(i, i2);
        }
        an anVar = this.h;
        if (anVar != null) {
            anVar.a(i, i2);
        }
    }

    public class d extends am.a {
        private boolean b;
        private boolean c;
        private boolean d;
        private Point e;
        private float[] f;
        private float g;
        private float[] h;
        private float i;
        private EAMapPlatformGestureInfo j;

        private d() {
            this.b = false;
            this.c = false;
            this.d = false;
            this.e = new Point();
            this.f = new float[10];
            this.g = 0.0f;
            this.h = new float[10];
            this.i = 0.0f;
            this.j = new EAMapPlatformGestureInfo();
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:38:0x010a  */
        @Override // com.amap.api.mapcore.util.am.a
        public final boolean a(am amVar) {
            Throwable th;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.j;
            eAMapPlatformGestureInfo.mGestureState = 2;
            eAMapPlatformGestureInfo.mGestureType = 4;
            eAMapPlatformGestureInfo.mLocation = new float[]{amVar.a().getX(), amVar.a().getY()};
            int engineIDWithGestureInfo = o.this.a.getEngineIDWithGestureInfo(this.j);
            float fH = amVar.h();
            float fI = amVar.i();
            int iB = (int) amVar.b();
            int iC = (int) amVar.c();
            float fAbs = Math.abs(iB - this.e.x);
            float fAbs2 = Math.abs(iC - this.e.y);
            Point point = this.e;
            point.x = iB;
            point.y = iC;
            float fLog = (float) Math.log(fH);
            if (o.this.k <= 0 && Math.abs(fLog) > 0.2f) {
                this.d = true;
            }
            try {
                if (o.this.a.getUiSettings().isZoomGesturesEnabled()) {
                    if (!this.b && 0.06f < Math.abs(fLog)) {
                        this.b = true;
                    }
                    if (!this.b || 0.01f >= Math.abs(fLog)) {
                        z = false;
                    } else {
                        if (fAbs > 2.0f || fAbs2 > 2.0f) {
                            try {
                                if (Math.abs(fLog) < 0.02f) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                z = true;
                                hn.c(th, "GLMapGestrureDetector", "onScaleRotate");
                                th.printStackTrace();
                            }
                        } else {
                            z4 = false;
                        }
                        if (!z4 && fI > 0.0f) {
                            float f = fLog / fI;
                            this.g = f;
                            this.f[o.this.k % 10] = Math.abs(f);
                            o.g(o.this);
                            o.this.a.addGestureMapMessage(engineIDWithGestureInfo, ScaleGestureMapMessage.obtain(101, fLog, iB, iC));
                            if (fLog > 0.0f) {
                                o.this.a.setGestureStatus(engineIDWithGestureInfo, 1);
                                z2 = true;
                            } else {
                                o.this.a.setGestureStatus(engineIDWithGestureInfo, 2);
                            }
                        }
                        z = true;
                    }
                    z2 = z;
                } else {
                    z = false;
                    z2 = z;
                }
            } catch (Throwable th3) {
                th = th3;
                z = false;
            }
            try {
                if (o.this.a.getUiSettings().isRotateGesturesEnabled() && !o.this.a.isLockMapAngle(engineIDWithGestureInfo) && !this.d) {
                    float fAtan2 = (float) (((Math.atan2(amVar.g(), amVar.f()) - Math.atan2(amVar.e(), amVar.d())) * 180.0d) / 3.141592653589793d);
                    if (!this.c && Math.abs(fAtan2) >= 4.0f) {
                        this.c = true;
                    }
                    if (this.c && 1.0f < Math.abs(fAtan2)) {
                        if (!((fAbs > 4.0f || fAbs2 > 4.0f) && Math.abs(fAtan2) < 2.0f)) {
                            float f2 = fAtan2 / fI;
                            this.i = f2;
                            this.h[o.this.l % 10] = Math.abs(f2);
                            o.h(o.this);
                            o.this.a.addGestureMapMessage(engineIDWithGestureInfo, RotateGestureMapMessage.obtain(101, fAtan2, iB, iC));
                            try {
                                o.this.a.setGestureStatus(engineIDWithGestureInfo, 6);
                                return true;
                            } catch (Throwable th4) {
                                th = th4;
                                z3 = true;
                                hn.c(th, "GLMapGestrureDetector", "onScaleRotate");
                                th.printStackTrace();
                                return z3;
                            }
                        }
                    }
                }
                return z2;
            } catch (Throwable th5) {
                th = th5;
                z3 = z2;
            }
        }

        @Override // com.amap.api.mapcore.util.am.a
        public final boolean b(am amVar) {
            EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.j;
            eAMapPlatformGestureInfo.mGestureState = 1;
            eAMapPlatformGestureInfo.mGestureType = 4;
            eAMapPlatformGestureInfo.mLocation = new float[]{amVar.a().getX(), amVar.a().getY()};
            int engineIDWithGestureInfo = o.this.a.getEngineIDWithGestureInfo(this.j);
            int iB = (int) amVar.b();
            int iC = (int) amVar.c();
            this.d = false;
            Point point = this.e;
            point.x = iB;
            point.y = iC;
            this.b = false;
            this.c = false;
            o.this.a.addGestureMapMessage(engineIDWithGestureInfo, ScaleGestureMapMessage.obtain(100, 1.0f, iB, iC));
            try {
                if (o.this.a.getUiSettings().isRotateGesturesEnabled() && !o.this.a.isLockMapAngle(engineIDWithGestureInfo)) {
                    IAMapDelegate iAMapDelegate = o.this.a;
                    iAMapDelegate.addGestureMapMessage(engineIDWithGestureInfo, RotateGestureMapMessage.obtain(100, iAMapDelegate.getMapAngle(engineIDWithGestureInfo), iB, iC));
                }
            } catch (Throwable th) {
                hn.c(th, "GLMapGestrureDetector", "onScaleRotateBegin");
                th.printStackTrace();
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:49:0x012b  */
        @Override // com.amap.api.mapcore.util.am.a
        public final void c(am amVar) {
            float f;
            float f2;
            float preciseLevel;
            EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.j;
            eAMapPlatformGestureInfo.mGestureState = 3;
            eAMapPlatformGestureInfo.mGestureType = 4;
            eAMapPlatformGestureInfo.mLocation = new float[]{amVar.a().getX(), amVar.a().getY()};
            int engineIDWithGestureInfo = o.this.a.getEngineIDWithGestureInfo(this.j);
            this.d = false;
            o.this.a.addGestureMapMessage(engineIDWithGestureInfo, ScaleGestureMapMessage.obtain(102, 1.0f, 0, 0));
            if (o.this.k > 0) {
                int i = o.this.k > 10 ? 10 : o.this.k;
                float f3 = 0.0f;
                for (int i2 = 0; i2 < 10; i2++) {
                    float[] fArr = this.f;
                    f3 += fArr[i2];
                    fArr[i2] = 0.0f;
                }
                float f4 = f3 / i;
                if (0.004f <= f4) {
                    float f5 = f4 * 300.0f;
                    if (f5 >= 1.5f) {
                        f5 = 1.5f;
                    }
                    if (this.g < 0.0f) {
                        f5 = -f5;
                    }
                    preciseLevel = o.this.a.getPreciseLevel(engineIDWithGestureInfo) + f5;
                } else {
                    preciseLevel = -9999.0f;
                }
                this.g = 0.0f;
                f = preciseLevel;
            } else {
                f = -9999.0f;
            }
            if (o.this.a.isLockMapAngle(engineIDWithGestureInfo)) {
                f2 = -9999.0f;
            } else {
                try {
                    if (o.this.a.getUiSettings().isRotateGesturesEnabled()) {
                        IAMapDelegate iAMapDelegate = o.this.a;
                        iAMapDelegate.addGestureMapMessage(engineIDWithGestureInfo, RotateGestureMapMessage.obtain(102, iAMapDelegate.getMapAngle(engineIDWithGestureInfo), 0, 0));
                    }
                } catch (Throwable th) {
                    hn.c(th, "GLMapGestrureDetector", "onScaleRotateEnd");
                    th.printStackTrace();
                }
                if (o.this.l > 0) {
                    o.this.a.setGestureStatus(engineIDWithGestureInfo, 6);
                    int i3 = o.this.l > 10 ? 10 : o.this.l;
                    float f6 = 0.0f;
                    for (int i4 = 0; i4 < 10; i4++) {
                        float[] fArr2 = this.h;
                        f6 += fArr2[i4];
                        fArr2[i4] = 0.0f;
                    }
                    float f7 = f6 / i3;
                    if (0.1f <= f7) {
                        float f8 = f7 * 200.0f;
                        int mapAngle = ((int) o.this.a.getMapAngle(engineIDWithGestureInfo)) % 360;
                        if (f8 >= 60.0f) {
                            f8 = 60.0f;
                        }
                        if (this.i < 0.0f) {
                            f8 = -f8;
                        }
                        f2 = ((int) (mapAngle + f8)) % 360;
                    } else {
                        f2 = -9999.0f;
                    }
                } else {
                    f2 = -9999.0f;
                }
                this.g = 0.0f;
            }
            if ((f == -9999.0f && f2 == -9999.0f) ? false : true) {
                o.this.a.getGLMapEngine().startPivotZoomRotateAnim(engineIDWithGestureInfo, this.e, f, (int) f2, 500);
            }
        }

        public /* synthetic */ d(o oVar, byte b) {
            this();
        }
    }

    public final boolean a(MotionEvent motionEvent) {
        if (this.n < motionEvent.getPointerCount()) {
            this.n = motionEvent.getPointerCount();
        }
        if ((motionEvent.getAction() & 255) == 0) {
            this.p = false;
            this.q = false;
        }
        if (motionEvent.getAction() == 6 && motionEvent.getPointerCount() > 0) {
            this.p = true;
        }
        if (this.o && this.n >= 2) {
            this.o = false;
        }
        try {
            int[] iArr = {0, 0};
            IAMapDelegate iAMapDelegate = this.a;
            if (iAMapDelegate != null && iAMapDelegate.getGLMapView() != null) {
                this.a.getGLMapView().getLocationOnScreen(iArr);
            }
            if (this.d != null) {
                if (motionEvent.getAction() == 0) {
                    this.d.onDown(motionEvent.getX(), motionEvent.getY());
                } else if (motionEvent.getAction() == 1) {
                    this.d.onUp(motionEvent.getX(), motionEvent.getY());
                }
            }
            this.c.onTouchEvent(motionEvent);
            this.g.b(motionEvent, iArr[0], iArr[1]);
            if (!this.i || this.m <= 0) {
                this.h.b(motionEvent, iArr[0], iArr[1]);
                if (!this.o) {
                    this.e.a(motionEvent);
                    this.f.b(motionEvent, iArr[0], iArr[1]);
                }
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
