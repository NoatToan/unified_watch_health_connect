package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.amap.api.maps.model.AMapGestureListener;
import com.amap.api.maps.utils.SpatialRelationUtil;
import com.autonavi.base.ae.gmap.gesture.EAMapPlatformGestureInfo;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.mapcore.message.HoverGestureMapMessage;
import com.autonavi.base.amap.mapcore.message.MoveGestureMapMessage;
import com.autonavi.base.amap.mapcore.message.RotateGestureMapMessage;
import com.autonavi.base.amap.mapcore.message.ScaleGestureMapMessage;

/* JADX INFO: loaded from: classes4.dex */
public final class k4s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IAMapDelegate f23447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f23448b;
    public GestureDetector c;
    public i8s d;
    public a8s e;
    public w7s f;
    public m8s g;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f23450r;
    public AMapGestureListener s;
    public boolean h = false;
    public int i = 0;
    public int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f23449k = 0;
    public int l = 0;
    public int m = 0;
    public boolean n = false;
    public boolean o = false;
    public boolean p = true;
    public Handler t = new Handler(Looper.getMainLooper());

    public k4s(IAMapDelegate iAMapDelegate) {
        byte b2 = 0;
        this.f23448b = iAMapDelegate.getContext();
        this.f23447a = iAMapDelegate;
        a aVar = new a(this, b2);
        GestureDetector gestureDetector = new GestureDetector(this.f23448b, aVar, this.t);
        this.c = gestureDetector;
        gestureDetector.setOnDoubleTapListener(aVar);
        this.d = new i8s(this.f23448b, new d(this, b2));
        this.e = new a8s(this.f23448b, new c(this, b2));
        this.f = new w7s(this.f23448b, new b(this, b2));
        this.g = new m8s(this.f23448b, new e(this, b2));
    }

    public static /* synthetic */ int o(k4s k4sVar) {
        int i = k4sVar.j;
        k4sVar.j = i + 1;
        return i;
    }

    public static /* synthetic */ int p(k4s k4sVar) {
        int i = k4sVar.f23449k;
        k4sVar.f23449k = i + 1;
        return i;
    }

    public static /* synthetic */ int t(k4s k4sVar) {
        int i = k4sVar.i;
        k4sVar.i = i + 1;
        return i;
    }

    public static /* synthetic */ int u(k4s k4sVar) {
        int i = k4sVar.l;
        k4sVar.l = i + 1;
        return i;
    }

    public static /* synthetic */ boolean v(k4s k4sVar) {
        k4sVar.p = true;
        return true;
    }

    public final void b() {
        this.i = 0;
        this.f23449k = 0;
        this.j = 0;
        this.l = 0;
        this.m = 0;
    }

    public final void c(int i, int i2) {
        this.q = i;
        this.f23450r = i2;
        i8s i8sVar = this.d;
        if (i8sVar != null) {
            i8sVar.d(i, i2);
        }
        a8s a8sVar = this.e;
        if (a8sVar != null) {
            a8sVar.b(i, i2);
        }
        w7s w7sVar = this.f;
        if (w7sVar != null) {
            w7sVar.b(i, i2);
        }
        m8s m8sVar = this.g;
        if (m8sVar != null) {
            m8sVar.b(i, i2);
        }
    }

    public final void d(AMapGestureListener aMapGestureListener) {
        this.s = aMapGestureListener;
    }

    public final boolean f(MotionEvent motionEvent) {
        if (this.m < motionEvent.getPointerCount()) {
            this.m = motionEvent.getPointerCount();
        }
        if ((motionEvent.getAction() & 255) == 0) {
            this.o = false;
            this.p = false;
        }
        if (motionEvent.getAction() == 6 && motionEvent.getPointerCount() > 0) {
            this.o = true;
        }
        if (this.n && this.m >= 2) {
            this.n = false;
        }
        try {
            int[] iArr = {0, 0};
            IAMapDelegate iAMapDelegate = this.f23447a;
            if (iAMapDelegate != null && iAMapDelegate.getGLMapView() != null) {
                this.f23447a.getGLMapView().getLocationOnScreen(iArr);
            }
            if (this.s != null) {
                if (motionEvent.getAction() == 0) {
                    this.s.onDown(motionEvent.getX(), motionEvent.getY());
                } else if (motionEvent.getAction() == 1) {
                    this.s.onUp(motionEvent.getX(), motionEvent.getY());
                }
            }
            this.c.onTouchEvent(motionEvent);
            this.f.h(motionEvent, iArr[0], iArr[1]);
            if (!this.h || this.l <= 0) {
                this.g.h(motionEvent, iArr[0], iArr[1]);
                if (!this.n) {
                    this.d.e(motionEvent);
                    this.e.h(motionEvent, iArr[0], iArr[1]);
                }
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public final int g() {
        return this.q;
    }

    public final int j() {
        return this.f23450r;
    }

    public class b implements w7s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public EAMapPlatformGestureInfo f23453a;

        public b() {
            this.f23453a = new EAMapPlatformGestureInfo();
        }

        @Override // w7s.a
        public final void a(w7s w7sVar) {
            EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.f23453a;
            eAMapPlatformGestureInfo.mGestureState = 3;
            eAMapPlatformGestureInfo.mGestureType = 6;
            eAMapPlatformGestureInfo.mLocation = new float[]{w7sVar.i().getX(), w7sVar.i().getY()};
            try {
                if (k4s.this.f23447a.getUiSettings().isTiltGesturesEnabled()) {
                    int engineIDWithGestureInfo = k4s.this.f23447a.getEngineIDWithGestureInfo(this.f23453a);
                    if (k4s.this.f23447a.isLockMapCameraDegree(engineIDWithGestureInfo)) {
                        return;
                    }
                    if (k4s.this.f23447a.getCameraDegree(engineIDWithGestureInfo) >= 0.0f && k4s.this.l > 0) {
                        k4s.this.f23447a.setGestureStatus(engineIDWithGestureInfo, 7);
                    }
                    k4s.this.h = false;
                    IAMapDelegate iAMapDelegate = k4s.this.f23447a;
                    iAMapDelegate.addGestureMapMessage(engineIDWithGestureInfo, HoverGestureMapMessage.obtain(102, iAMapDelegate.getCameraDegree(engineIDWithGestureInfo)));
                }
            } catch (Throwable th) {
                m2t.r(th, "GLMapGestrureDetector", "onHoveEnd");
                th.printStackTrace();
            }
        }

        @Override // w7s.a
        public final boolean b(w7s w7sVar) {
            EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.f23453a;
            eAMapPlatformGestureInfo.mGestureState = 1;
            eAMapPlatformGestureInfo.mGestureType = 6;
            eAMapPlatformGestureInfo.mLocation = new float[]{w7sVar.i().getX(), w7sVar.i().getY()};
            try {
                if (!k4s.this.f23447a.getUiSettings().isTiltGesturesEnabled()) {
                    return true;
                }
                int engineIDWithGestureInfo = k4s.this.f23447a.getEngineIDWithGestureInfo(this.f23453a);
                if (k4s.this.f23447a.isLockMapCameraDegree(engineIDWithGestureInfo)) {
                    return false;
                }
                IAMapDelegate iAMapDelegate = k4s.this.f23447a;
                iAMapDelegate.addGestureMapMessage(engineIDWithGestureInfo, HoverGestureMapMessage.obtain(100, iAMapDelegate.getCameraDegree(engineIDWithGestureInfo)));
                return true;
            } catch (Throwable th) {
                m2t.r(th, "GLMapGestrureDetector", "onHoveBegin");
                th.printStackTrace();
                return true;
            }
        }

        @Override // w7s.a
        public final boolean c(w7s w7sVar) {
            EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.f23453a;
            eAMapPlatformGestureInfo.mGestureState = 2;
            eAMapPlatformGestureInfo.mGestureType = 6;
            eAMapPlatformGestureInfo.mLocation = new float[]{w7sVar.i().getX(), w7sVar.i().getY()};
            try {
                if (!k4s.this.f23447a.getUiSettings().isTiltGesturesEnabled()) {
                    return true;
                }
                int engineIDWithGestureInfo = k4s.this.f23447a.getEngineIDWithGestureInfo(this.f23453a);
                if (k4s.this.f23447a.isLockMapCameraDegree(engineIDWithGestureInfo) || k4s.this.f23449k > 3) {
                    return false;
                }
                float f = w7sVar.n().x;
                float f2 = w7sVar.n().y;
                if (!k4s.this.h) {
                    PointF pointFK = w7sVar.k(0);
                    PointF pointFK2 = w7sVar.k(1);
                    float f3 = pointFK.y;
                    if (((f3 > 10.0f && pointFK2.y > 10.0f) || (f3 < -10.0f && pointFK2.y < -10.0f)) && Math.abs(f2) > 10.0f && Math.abs(f) < 10.0f) {
                        k4s.this.h = true;
                    }
                }
                if (k4s.this.h) {
                    k4s.this.h = true;
                    float f4 = f2 / 6.0f;
                    if (Math.abs(f4) > 1.0f) {
                        k4s.this.f23447a.addGestureMapMessage(engineIDWithGestureInfo, HoverGestureMapMessage.obtain(101, f4));
                        k4s.u(k4s.this);
                    }
                }
                return true;
            } catch (Throwable th) {
                m2t.r(th, "GLMapGestrureDetector", "onHove");
                th.printStackTrace();
                return true;
            }
        }

        public /* synthetic */ b(k4s k4sVar, byte b2) {
            this();
        }
    }

    public class c implements a8s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public EAMapPlatformGestureInfo f23455a;

        public c() {
            this.f23455a = new EAMapPlatformGestureInfo();
        }

        @Override // a8s.a
        public final void a(a8s a8sVar) {
            try {
                if (k4s.this.f23447a.getUiSettings().isScrollGesturesEnabled()) {
                    EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.f23455a;
                    eAMapPlatformGestureInfo.mGestureState = 3;
                    eAMapPlatformGestureInfo.mGestureType = 3;
                    eAMapPlatformGestureInfo.mLocation = new float[]{a8sVar.i().getX(), a8sVar.i().getY()};
                    int engineIDWithGestureInfo = k4s.this.f23447a.getEngineIDWithGestureInfo(this.f23455a);
                    if (k4s.this.i > 0) {
                        k4s.this.f23447a.setGestureStatus(engineIDWithGestureInfo, 5);
                    }
                    k4s.this.f23447a.addGestureMapMessage(engineIDWithGestureInfo, MoveGestureMapMessage.obtain(102, 0.0f, 0.0f, a8sVar.i().getX(), a8sVar.i().getY()));
                }
            } catch (Throwable th) {
                m2t.r(th, "GLMapGestrureDetector", "onMoveEnd");
                th.printStackTrace();
            }
        }

        @Override // a8s.a
        public final boolean b(a8s a8sVar) {
            try {
                if (!k4s.this.f23447a.getUiSettings().isScrollGesturesEnabled()) {
                    return true;
                }
                EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.f23455a;
                eAMapPlatformGestureInfo.mGestureState = 1;
                eAMapPlatformGestureInfo.mGestureType = 3;
                eAMapPlatformGestureInfo.mLocation = new float[]{a8sVar.i().getX(), a8sVar.i().getY()};
                k4s.this.f23447a.addGestureMapMessage(k4s.this.f23447a.getEngineIDWithGestureInfo(this.f23455a), MoveGestureMapMessage.obtain(100, 0.0f, 0.0f, a8sVar.i().getX(), a8sVar.i().getY()));
                return true;
            } catch (Throwable th) {
                m2t.r(th, "GLMapGestrureDetector", "onMoveBegin");
                th.printStackTrace();
                return true;
            }
        }

        @Override // a8s.a
        public final boolean c(a8s a8sVar) {
            if (k4s.this.h) {
                return true;
            }
            try {
                if (!k4s.this.f23447a.getUiSettings().isScrollGesturesEnabled() || k4s.this.o) {
                    return true;
                }
                EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.f23455a;
                eAMapPlatformGestureInfo.mGestureState = 2;
                eAMapPlatformGestureInfo.mGestureType = 3;
                eAMapPlatformGestureInfo.mLocation = new float[]{a8sVar.i().getX(), a8sVar.i().getY()};
                int engineIDWithGestureInfo = k4s.this.f23447a.getEngineIDWithGestureInfo(this.f23455a);
                PointF pointFJ = a8sVar.j();
                float f = k4s.this.i == 0 ? 4.0f : 1.0f;
                if (Math.abs(pointFJ.x) <= f && Math.abs(pointFJ.y) <= f) {
                    return false;
                }
                if (k4s.this.i == 0) {
                    k4s.this.f23447a.getGLMapEngine().clearAnimations(engineIDWithGestureInfo, false);
                }
                k4s.this.f23447a.addGestureMapMessage(engineIDWithGestureInfo, MoveGestureMapMessage.obtain(101, pointFJ.x, pointFJ.y, a8sVar.i().getX(), a8sVar.i().getY()));
                k4s.t(k4s.this);
                return true;
            } catch (Throwable th) {
                m2t.r(th, "GLMapGestrureDetector", "onMove");
                th.printStackTrace();
                return true;
            }
        }

        public /* synthetic */ c(k4s k4sVar, byte b2) {
            this();
        }
    }

    public class e extends m8s.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public EAMapPlatformGestureInfo f23459a;

        public e() {
            this.f23459a = new EAMapPlatformGestureInfo();
        }

        @Override // m8s.a
        public final void a(m8s m8sVar) {
            try {
                if (k4s.this.f23447a.getUiSettings().isZoomGesturesEnabled() && Math.abs(m8sVar.n()) <= 10.0f && Math.abs(m8sVar.o()) <= 10.0f && m8sVar.f() < 200) {
                    k4s.v(k4s.this);
                    EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.f23459a;
                    eAMapPlatformGestureInfo.mGestureState = 2;
                    eAMapPlatformGestureInfo.mGestureType = 2;
                    eAMapPlatformGestureInfo.mLocation = new float[]{m8sVar.i().getX(), m8sVar.i().getY()};
                    int engineIDWithGestureInfo = k4s.this.f23447a.getEngineIDWithGestureInfo(this.f23459a);
                    k4s.this.f23447a.setGestureStatus(engineIDWithGestureInfo, 4);
                    k4s.this.f23447a.zoomOut(engineIDWithGestureInfo);
                }
            } catch (Throwable th) {
                m2t.r(th, "GLMapGestrureDetector", "onZoomOut");
                th.printStackTrace();
            }
        }

        public /* synthetic */ e(k4s k4sVar, byte b2) {
            this();
        }
    }

    public class a implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f23452b;
        public EAMapPlatformGestureInfo c;
        public long d;

        public a() {
            this.f23451a = 0;
            this.f23452b = 0.0f;
            this.c = new EAMapPlatformGestureInfo();
            this.d = 0L;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            k4s.this.c.setIsLongpressEnabled(false);
            this.f23451a = motionEvent.getPointerCount();
            AMapGestureListener aMapGestureListener = k4s.this.s;
            if (aMapGestureListener != null) {
                aMapGestureListener.onDoubleTap(motionEvent.getX(), motionEvent.getY());
            }
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            if (this.f23451a < motionEvent.getPointerCount()) {
                this.f23451a = motionEvent.getPointerCount();
            }
            int action = motionEvent.getAction() & 255;
            if (this.f23451a != 1) {
                return false;
            }
            try {
                if (!k4s.this.f23447a.getUiSettings().isZoomGesturesEnabled()) {
                    k4s.this.c.setIsLongpressEnabled(true);
                    return false;
                }
            } catch (Throwable th) {
                m2t.r(th, "GLMapGestrureDetector", "onDoubleTapEvent");
                th.printStackTrace();
            }
            if (action == 0) {
                EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.c;
                eAMapPlatformGestureInfo.mGestureState = 1;
                eAMapPlatformGestureInfo.mGestureType = 9;
                eAMapPlatformGestureInfo.mLocation = new float[]{motionEvent.getX(), motionEvent.getY()};
                int engineIDWithGestureInfo = k4s.this.f23447a.getEngineIDWithGestureInfo(this.c);
                this.f23452b = motionEvent.getY();
                k4s.this.f23447a.addGestureMapMessage(engineIDWithGestureInfo, ScaleGestureMapMessage.obtain(100, 1.0f, 0, 0));
                this.d = SystemClock.uptimeMillis();
            } else if (action == 2) {
                k4s.this.n = true;
                float y = this.f23452b - motionEvent.getY();
                if (Math.abs(y) >= 20.0f) {
                    EAMapPlatformGestureInfo eAMapPlatformGestureInfo2 = this.c;
                    eAMapPlatformGestureInfo2.mGestureState = 2;
                    eAMapPlatformGestureInfo2.mGestureType = 9;
                    eAMapPlatformGestureInfo2.mLocation = new float[]{motionEvent.getX(), motionEvent.getY()};
                    k4s.this.f23447a.addGestureMapMessage(k4s.this.f23447a.getEngineIDWithGestureInfo(this.c), ScaleGestureMapMessage.obtain(101, (y * 4.0f) / k4s.this.f23447a.getMapHeight(), 0, 0));
                    this.f23452b = motionEvent.getY();
                }
            } else {
                EAMapPlatformGestureInfo eAMapPlatformGestureInfo3 = this.c;
                eAMapPlatformGestureInfo3.mGestureState = 3;
                eAMapPlatformGestureInfo3.mGestureType = 9;
                eAMapPlatformGestureInfo3.mLocation = new float[]{motionEvent.getX(), motionEvent.getY()};
                int engineIDWithGestureInfo2 = k4s.this.f23447a.getEngineIDWithGestureInfo(this.c);
                k4s.this.c.setIsLongpressEnabled(true);
                k4s.this.f23447a.addGestureMapMessage(engineIDWithGestureInfo2, ScaleGestureMapMessage.obtain(102, 1.0f, 0, 0));
                if (action == 1) {
                    k4s.this.f23447a.setGestureStatus(engineIDWithGestureInfo2, 3);
                    long jUptimeMillis = SystemClock.uptimeMillis() - this.d;
                    if (!k4s.this.n || jUptimeMillis < 200) {
                        return k4s.this.f23447a.onDoubleTap(engineIDWithGestureInfo2, motionEvent);
                    }
                    k4s.this.n = false;
                } else {
                    k4s.this.n = false;
                }
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            k4s.this.n = false;
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            AMapGestureListener aMapGestureListener = k4s.this.s;
            if (aMapGestureListener != null) {
                aMapGestureListener.onFling(f, f2);
            }
            try {
                if (k4s.this.f23447a.getUiSettings().isScrollGesturesEnabled() && k4s.this.l <= 0 && k4s.this.j <= 0 && k4s.this.f23449k == 0 && !k4s.this.p) {
                    EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.c;
                    eAMapPlatformGestureInfo.mGestureState = 3;
                    eAMapPlatformGestureInfo.mGestureType = 3;
                    eAMapPlatformGestureInfo.mLocation = new float[]{motionEvent2.getX(), motionEvent2.getY()};
                    int engineIDWithGestureInfo = k4s.this.f23447a.getEngineIDWithGestureInfo(this.c);
                    k4s.this.f23447a.onFling();
                    k4s.this.f23447a.getGLMapEngine().startMapSlidAnim(engineIDWithGestureInfo, new Point((int) motionEvent2.getX(), (int) motionEvent2.getY()), f, f2);
                }
                return true;
            } catch (Throwable th) {
                m2t.r(th, "GLMapGestrureDetector", "onFling");
                th.printStackTrace();
                return true;
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            if (k4s.this.m == 1) {
                EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.c;
                eAMapPlatformGestureInfo.mGestureState = 3;
                eAMapPlatformGestureInfo.mGestureType = 7;
                eAMapPlatformGestureInfo.mLocation = new float[]{motionEvent.getX(), motionEvent.getY()};
                k4s.this.f23447a.onLongPress(k4s.this.f23447a.getEngineIDWithGestureInfo(this.c), motionEvent);
                AMapGestureListener aMapGestureListener = k4s.this.s;
                if (aMapGestureListener != null) {
                    aMapGestureListener.onLongPress(motionEvent.getX(), motionEvent.getY());
                }
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            AMapGestureListener aMapGestureListener = k4s.this.s;
            if (aMapGestureListener == null) {
                return false;
            }
            aMapGestureListener.onScroll(f, f2);
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onShowPress(MotionEvent motionEvent) {
            try {
                EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.c;
                eAMapPlatformGestureInfo.mGestureState = 3;
                eAMapPlatformGestureInfo.mGestureType = 7;
                eAMapPlatformGestureInfo.mLocation = new float[]{motionEvent.getX(), motionEvent.getY()};
                k4s.this.f23447a.getGLMapEngine().clearAnimations(k4s.this.f23447a.getEngineIDWithGestureInfo(this.c), false);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (k4s.this.m != 1) {
                return false;
            }
            EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.c;
            eAMapPlatformGestureInfo.mGestureState = 3;
            eAMapPlatformGestureInfo.mGestureType = 8;
            eAMapPlatformGestureInfo.mLocation = new float[]{motionEvent.getX(), motionEvent.getY()};
            int engineIDWithGestureInfo = k4s.this.f23447a.getEngineIDWithGestureInfo(this.c);
            AMapGestureListener aMapGestureListener = k4s.this.s;
            if (aMapGestureListener != null) {
                try {
                    aMapGestureListener.onSingleTap(motionEvent.getX(), motionEvent.getY());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            return k4s.this.f23447a.onSingleTapConfirmed(engineIDWithGestureInfo, motionEvent);
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }

        public /* synthetic */ a(k4s k4sVar, byte b2) {
            this();
        }
    }

    public class d extends i8s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f23457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f23458b;
        public boolean c;
        public Point d;
        public float[] e;
        public float f;
        public float[] g;
        public float h;
        public EAMapPlatformGestureInfo i;

        public d() {
            this.f23457a = false;
            this.f23458b = false;
            this.c = false;
            this.d = new Point();
            this.e = new float[10];
            this.f = 0.0f;
            this.g = new float[10];
            this.h = 0.0f;
            this.i = new EAMapPlatformGestureInfo();
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:31:0x00ca A[Catch: all -> 0x00fb, TryCatch #1 {all -> 0x00fb, blocks: (B:31:0x00ca, B:33:0x00f2, B:37:0x00fe, B:26:0x00b9), top: B:74:0x00b9 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00f2 A[Catch: all -> 0x00fb, TryCatch #1 {all -> 0x00fb, blocks: (B:31:0x00ca, B:33:0x00f2, B:37:0x00fe, B:26:0x00b9), top: B:74:0x00b9 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x00fe A[Catch: all -> 0x00fb, TRY_LEAVE, TryCatch #1 {all -> 0x00fb, blocks: (B:31:0x00ca, B:33:0x00f2, B:37:0x00fe, B:26:0x00b9), top: B:74:0x00b9 }] */
        @Override // i8s.a
        public final boolean d(i8s i8sVar) {
            EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.i;
            eAMapPlatformGestureInfo.mGestureState = 2;
            eAMapPlatformGestureInfo.mGestureType = 4;
            boolean z = false;
            boolean z2 = true;
            eAMapPlatformGestureInfo.mLocation = new float[]{i8sVar.c().getX(), i8sVar.c().getY()};
            int engineIDWithGestureInfo = k4s.this.f23447a.getEngineIDWithGestureInfo(this.i);
            float fN = i8sVar.n();
            float fO = i8sVar.o();
            int iF = (int) i8sVar.f();
            int i = (int) i8sVar.i();
            float fAbs = Math.abs(iF - this.d.x);
            float fAbs2 = Math.abs(i - this.d.y);
            Point point = this.d;
            point.x = iF;
            point.y = i;
            float fLog = (float) Math.log(fN);
            if (k4s.this.j <= 0 && Math.abs(fLog) > 0.2f) {
                this.c = true;
            }
            try {
                if (k4s.this.f23447a.getUiSettings().isZoomGesturesEnabled()) {
                    if (!this.f23457a && 0.06f < Math.abs(fLog)) {
                        this.f23457a = true;
                    }
                    if (this.f23457a && 0.01f < Math.abs(fLog)) {
                        if (fAbs > 2.0f || fAbs2 > 2.0f) {
                            try {
                                if (Math.abs(fLog) >= 0.02f) {
                                    if (fO > 0.0f) {
                                        float f = fLog / fO;
                                        this.f = f;
                                        this.e[k4s.this.j % 10] = Math.abs(f);
                                        k4s.o(k4s.this);
                                        k4s.this.f23447a.addGestureMapMessage(engineIDWithGestureInfo, ScaleGestureMapMessage.obtain(101, fLog, iF, i));
                                        if (fLog > 0.0f) {
                                            k4s.this.f23447a.setGestureStatus(engineIDWithGestureInfo, 1);
                                        } else {
                                            k4s.this.f23447a.setGestureStatus(engineIDWithGestureInfo, 2);
                                        }
                                    }
                                }
                                z = true;
                            } catch (Throwable th) {
                                th = th;
                                z = true;
                                m2t.r(th, "GLMapGestrureDetector", "onScaleRotate");
                                th.printStackTrace();
                            }
                        } else {
                            if (fO > 0.0f) {
                                float f2 = fLog / fO;
                                this.f = f2;
                                this.e[k4s.this.j % 10] = Math.abs(f2);
                                k4s.o(k4s.this);
                                k4s.this.f23447a.addGestureMapMessage(engineIDWithGestureInfo, ScaleGestureMapMessage.obtain(101, fLog, iF, i));
                                if (fLog > 0.0f) {
                                    k4s.this.f23447a.setGestureStatus(engineIDWithGestureInfo, 1);
                                } else {
                                    k4s.this.f23447a.setGestureStatus(engineIDWithGestureInfo, 2);
                                }
                            }
                            z = true;
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                if (k4s.this.f23447a.getUiSettings().isRotateGesturesEnabled() && !k4s.this.f23447a.isLockMapAngle(engineIDWithGestureInfo) && !this.c) {
                    float fS = i8sVar.s();
                    if (!this.f23458b && Math.abs(fS) >= 4.0f) {
                        this.f23458b = true;
                    }
                    if (this.f23458b && 1.0f < Math.abs(fS) && ((fAbs <= 4.0f && fAbs2 <= 4.0f) || Math.abs(fS) >= 2.0f)) {
                        float f3 = fS / fO;
                        this.h = f3;
                        this.g[k4s.this.f23449k % 10] = Math.abs(f3);
                        k4s.p(k4s.this);
                        k4s.this.f23447a.addGestureMapMessage(engineIDWithGestureInfo, RotateGestureMapMessage.obtain(101, fS, iF, i));
                        try {
                            k4s.this.f23447a.setGestureStatus(engineIDWithGestureInfo, 6);
                            return true;
                        } catch (Throwable th3) {
                            th = th3;
                            m2t.r(th, "GLMapGestrureDetector", "onScaleRotate");
                            th.printStackTrace();
                            return z2;
                        }
                    }
                }
                return z;
            } catch (Throwable th4) {
                th = th4;
                z2 = z;
            }
        }

        @Override // i8s.a
        public final boolean e(i8s i8sVar) {
            EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.i;
            eAMapPlatformGestureInfo.mGestureState = 1;
            eAMapPlatformGestureInfo.mGestureType = 4;
            eAMapPlatformGestureInfo.mLocation = new float[]{i8sVar.c().getX(), i8sVar.c().getY()};
            int engineIDWithGestureInfo = k4s.this.f23447a.getEngineIDWithGestureInfo(this.i);
            int iF = (int) i8sVar.f();
            int i = (int) i8sVar.i();
            this.c = false;
            Point point = this.d;
            point.x = iF;
            point.y = i;
            this.f23457a = false;
            this.f23458b = false;
            k4s.this.f23447a.addGestureMapMessage(engineIDWithGestureInfo, ScaleGestureMapMessage.obtain(100, 1.0f, iF, i));
            try {
                if (k4s.this.f23447a.getUiSettings().isRotateGesturesEnabled() && !k4s.this.f23447a.isLockMapAngle(engineIDWithGestureInfo)) {
                    IAMapDelegate iAMapDelegate = k4s.this.f23447a;
                    iAMapDelegate.addGestureMapMessage(engineIDWithGestureInfo, RotateGestureMapMessage.obtain(100, iAMapDelegate.getMapAngle(engineIDWithGestureInfo), iF, i));
                }
            } catch (Throwable th) {
                m2t.r(th, "GLMapGestrureDetector", "onScaleRotateBegin");
                th.printStackTrace();
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:49:0x011e  */
        @Override // i8s.a
        public final void f(i8s i8sVar) {
            float f;
            float f2;
            float preciseLevel;
            EAMapPlatformGestureInfo eAMapPlatformGestureInfo = this.i;
            eAMapPlatformGestureInfo.mGestureState = 3;
            eAMapPlatformGestureInfo.mGestureType = 4;
            eAMapPlatformGestureInfo.mLocation = new float[]{i8sVar.c().getX(), i8sVar.c().getY()};
            int engineIDWithGestureInfo = k4s.this.f23447a.getEngineIDWithGestureInfo(this.i);
            this.c = false;
            k4s.this.f23447a.addGestureMapMessage(engineIDWithGestureInfo, ScaleGestureMapMessage.obtain(102, 1.0f, 0, 0));
            if (k4s.this.j > 0) {
                int i = k4s.this.j > 10 ? 10 : k4s.this.j;
                float f3 = 0.0f;
                for (int i2 = 0; i2 < 10; i2++) {
                    float[] fArr = this.e;
                    f3 += fArr[i2];
                    fArr[i2] = 0.0f;
                }
                float f4 = f3 / i;
                if (0.004f <= f4) {
                    float f5 = f4 * 300.0f;
                    if (f5 >= 1.5f) {
                        f5 = 1.5f;
                    }
                    if (this.f < 0.0f) {
                        f5 = -f5;
                    }
                    preciseLevel = k4s.this.f23447a.getPreciseLevel(engineIDWithGestureInfo) + f5;
                } else {
                    preciseLevel = -9999.0f;
                }
                this.f = 0.0f;
                f = preciseLevel;
            } else {
                f = -9999.0f;
            }
            if (k4s.this.f23447a.isLockMapAngle(engineIDWithGestureInfo)) {
                f2 = -9999.0f;
            } else {
                try {
                    if (k4s.this.f23447a.getUiSettings().isRotateGesturesEnabled()) {
                        IAMapDelegate iAMapDelegate = k4s.this.f23447a;
                        iAMapDelegate.addGestureMapMessage(engineIDWithGestureInfo, RotateGestureMapMessage.obtain(102, iAMapDelegate.getMapAngle(engineIDWithGestureInfo), 0, 0));
                    }
                } catch (Throwable th) {
                    m2t.r(th, "GLMapGestrureDetector", "onScaleRotateEnd");
                    th.printStackTrace();
                }
                if (k4s.this.f23449k > 0) {
                    k4s.this.f23447a.setGestureStatus(engineIDWithGestureInfo, 6);
                    int i3 = k4s.this.f23449k > 10 ? 10 : k4s.this.f23449k;
                    float f6 = 0.0f;
                    for (int i4 = 0; i4 < 10; i4++) {
                        float[] fArr2 = this.g;
                        f6 += fArr2[i4];
                        fArr2[i4] = 0.0f;
                    }
                    float f7 = f6 / i3;
                    if (0.1f <= f7) {
                        float f8 = f7 * 200.0f;
                        int mapAngle = ((int) k4s.this.f23447a.getMapAngle(engineIDWithGestureInfo)) % SpatialRelationUtil.A_CIRCLE_DEGREE;
                        if (f8 >= 60.0f) {
                            f8 = 60.0f;
                        }
                        if (this.h < 0.0f) {
                            f8 = -f8;
                        }
                        f2 = ((int) (mapAngle + f8)) % SpatialRelationUtil.A_CIRCLE_DEGREE;
                    } else {
                        f2 = -9999.0f;
                    }
                } else {
                    f2 = -9999.0f;
                }
                this.f = 0.0f;
            }
            if (f == -9999.0f && f2 == -9999.0f) {
                return;
            }
            k4s.this.f23447a.getGLMapEngine().startPivotZoomRotateAnim(engineIDWithGestureInfo, this.d, f, (int) f2, 500);
        }

        public /* synthetic */ d(k4s k4sVar, byte b2) {
            this();
        }
    }
}
