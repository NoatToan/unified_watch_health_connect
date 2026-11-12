package com.amap.api.col.p0003sl;

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

/* JADX INFO: loaded from: classes4.dex */
public final class ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    IAMapDelegate f2173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Context f2174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    GestureDetector f2175c;
    public AMapGestureListener d;
    private aw e;
    private au f;
    private at g;
    private ax h;
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

    static /* synthetic */ int g(ab abVar) {
        int i = abVar.k;
        abVar.k = i + 1;
        return i;
    }

    static /* synthetic */ int h(ab abVar) {
        int i = abVar.l;
        abVar.l = i + 1;
        return i;
    }

    static /* synthetic */ int l(ab abVar) {
        int i = abVar.j;
        abVar.j = i + 1;
        return i;
    }

    static /* synthetic */ int m(ab abVar) {
        int i = abVar.m;
        abVar.m = i + 1;
        return i;
    }

    static /* synthetic */ boolean n(ab abVar) {
        abVar.q = true;
        return true;
    }

    public final void a(AMapGestureListener aMapGestureListener) {
        this.d = aMapGestureListener;
    }

    public final void a() {
        this.j = 0;
        this.l = 0;
        this.k = 0;
        this.m = 0;
        this.n = 0;
    }

    public ab(IAMapDelegate iAMapDelegate) {
        byte b2 = 0;
        this.f2174b = iAMapDelegate.getContext();
        this.f2173a = iAMapDelegate;
        a aVar = new a(this, b2);
        GestureDetector gestureDetector = new GestureDetector(this.f2174b, aVar, this.t);
        this.f2175c = gestureDetector;
        gestureDetector.setOnDoubleTapListener(aVar);
        this.e = new aw(this.f2174b, new d(this, b2));
        this.f = new au(this.f2174b, new c(this, b2));
        this.g = new at(this.f2174b, new b(this, b2));
        this.h = new ax(this.f2174b, new e(this, b2));
    }

    public final void a(int i, int i2) {
        this.r = i;
        this.s = i2;
        aw awVar = this.e;
        if (awVar != null) {
            awVar.a(i, i2);
        }
        au auVar = this.f;
        if (auVar != null) {
            auVar.a(i, i2);
        }
        at atVar = this.g;
        if (atVar != null) {
            atVar.a(i, i2);
        }
        ax axVar = this.h;
        if (axVar != null) {
            axVar.a(i, i2);
        }
    }

    public final int b() {
        return this.r;
    }

    public final int c() {
        return this.s;
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
            IAMapDelegate iAMapDelegate = this.f2173a;
            if (iAMapDelegate != null && iAMapDelegate.getGLMapView() != null) {
                this.f2173a.getGLMapView().getLocationOnScreen(iArr);
            }
            if (this.d != null) {
                if (motionEvent.getAction() == 0) {
                    this.d.onDown(motionEvent.getX(), motionEvent.getY());
                } else if (motionEvent.getAction() == 1) {
                    this.d.onUp(motionEvent.getX(), motionEvent.getY());
                }
            }
            this.f2175c.onTouchEvent(motionEvent);
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

    final class a implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f2176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f2177b;
        private int d;
        private EAMapPlatformGestureInfo e;

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }

        private a() {
            this.d = 0;
            this.f2176a = 0.0f;
            this.e = new EAMapPlatformGestureInfo();
            this.f2177b = 0L;
        }

        /* synthetic */ a(ab abVar, byte b2) {
            this();
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            ab.this.o = false;
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (ab.this.d != null) {
                ab.this.d.onFling(f, f2);
            }
            try {
                if (ab.this.f2173a.getUiSettings().isScrollGesturesEnabled() && ab.this.m <= 0 && ab.this.k <= 0 && ab.this.l == 0 && !ab.this.q) {
                    this.e.mGestureState = 3;
                    this.e.mGestureType = 3;
                    this.e.mLocation = new float[]{motionEvent2.getX(), motionEvent2.getY()};
                    int engineIDWithGestureInfo = ab.this.f2173a.getEngineIDWithGestureInfo(this.e);
                    ab.this.f2173a.onFling();
                    ab.this.f2173a.getGLMapEngine().startMapSlidAnim(engineIDWithGestureInfo, new Point((int) motionEvent2.getX(), (int) motionEvent2.getY()), f, f2);
                }
                return true;
            } catch (Throwable th) {
                jv.c(th, "GLMapGestrureDetector", "onFling");
                th.printStackTrace();
                return true;
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            if (ab.this.n == 1) {
                this.e.mGestureState = 3;
                this.e.mGestureType = 7;
                this.e.mLocation = new float[]{motionEvent.getX(), motionEvent.getY()};
                ab.this.f2173a.onLongPress(ab.this.f2173a.getEngineIDWithGestureInfo(this.e), motionEvent);
                if (ab.this.d != null) {
                    ab.this.d.onLongPress(motionEvent.getX(), motionEvent.getY());
                }
            }
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (ab.this.d == null) {
                return false;
            }
            ab.this.d.onScroll(f, f2);
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onShowPress(MotionEvent motionEvent) {
            try {
                this.e.mGestureState = 3;
                this.e.mGestureType = 7;
                this.e.mLocation = new float[]{motionEvent.getX(), motionEvent.getY()};
                ab.this.f2173a.getGLMapEngine().clearAnimations(ab.this.f2173a.getEngineIDWithGestureInfo(this.e), false);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            ab.this.f2175c.setIsLongpressEnabled(false);
            this.d = motionEvent.getPointerCount();
            if (ab.this.d != null) {
                ab.this.d.onDoubleTap(motionEvent.getX(), motionEvent.getY());
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
                if (!ab.this.f2173a.getUiSettings().isZoomGesturesEnabled()) {
                    ab.this.f2175c.setIsLongpressEnabled(true);
                    return false;
                }
            } catch (Throwable th) {
                jv.c(th, "GLMapGestrureDetector", "onDoubleTapEvent");
                th.printStackTrace();
            }
            if (action == 0) {
                this.e.mGestureState = 1;
                this.e.mGestureType = 9;
                this.e.mLocation = new float[]{motionEvent.getX(), motionEvent.getY()};
                int engineIDWithGestureInfo = ab.this.f2173a.getEngineIDWithGestureInfo(this.e);
                this.f2176a = motionEvent.getY();
                ab.this.f2173a.addGestureMapMessage(engineIDWithGestureInfo, ScaleGestureMapMessage.obtain(100, 1.0f, 0, 0));
                this.f2177b = SystemClock.uptimeMillis();
            } else if (action == 2) {
                ab.this.o = true;
                float y = this.f2176a - motionEvent.getY();
                if (Math.abs(y) >= 20.0f) {
                    this.e.mGestureState = 2;
                    this.e.mGestureType = 9;
                    this.e.mLocation = new float[]{motionEvent.getX(), motionEvent.getY()};
                    ab.this.f2173a.addGestureMapMessage(ab.this.f2173a.getEngineIDWithGestureInfo(this.e), ScaleGestureMapMessage.obtain(101, (y * 4.0f) / ab.this.f2173a.getMapHeight(), 0, 0));
                    this.f2176a = motionEvent.getY();
                }
            } else {
                this.e.mGestureState = 3;
                this.e.mGestureType = 9;
                this.e.mLocation = new float[]{motionEvent.getX(), motionEvent.getY()};
                int engineIDWithGestureInfo2 = ab.this.f2173a.getEngineIDWithGestureInfo(this.e);
                ab.this.f2175c.setIsLongpressEnabled(true);
                ab.this.f2173a.addGestureMapMessage(engineIDWithGestureInfo2, ScaleGestureMapMessage.obtain(102, 1.0f, 0, 0));
                if (action != 1) {
                    ab.this.o = false;
                } else {
                    ab.this.f2173a.setGestureStatus(engineIDWithGestureInfo2, 3);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    long j = this.f2177b;
                    if (ab.this.o && jUptimeMillis - j >= 200) {
                        ab.this.o = false;
                    } else {
                        return ab.this.f2173a.onDoubleTap(engineIDWithGestureInfo2, motionEvent);
                    }
                }
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (ab.this.n != 1) {
                return false;
            }
            this.e.mGestureState = 3;
            this.e.mGestureType = 8;
            this.e.mLocation = new float[]{motionEvent.getX(), motionEvent.getY()};
            int engineIDWithGestureInfo = ab.this.f2173a.getEngineIDWithGestureInfo(this.e);
            if (ab.this.d != null) {
                try {
                    ab.this.d.onSingleTap(motionEvent.getX(), motionEvent.getY());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            return ab.this.f2173a.onSingleTapConfirmed(engineIDWithGestureInfo, motionEvent);
        }
    }

    final class d extends aw.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f2184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f2185c;
        private boolean d;
        private Point e;
        private float[] f;
        private float g;
        private float[] h;
        private float i;
        private EAMapPlatformGestureInfo j;

        private d() {
            this.f2184b = false;
            this.f2185c = false;
            this.d = false;
            this.e = new Point();
            this.f = new float[10];
            this.g = 0.0f;
            this.h = new float[10];
            this.i = 0.0f;
            this.j = new EAMapPlatformGestureInfo();
        }

        /* synthetic */ d(ab abVar, byte b2) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:29:0x00ce A[Catch: all -> 0x0107, TryCatch #2 {all -> 0x0107, blocks: (B:29:0x00ce, B:31:0x00f6, B:32:0x00fe, B:24:0x00bd), top: B:76:0x00bd }] */
        /* JADX WARN: Code duplicated, block: B:31:0x00f6 A[Catch: all -> 0x0107, TryCatch #2 {all -> 0x0107, blocks: (B:29:0x00ce, B:31:0x00f6, B:32:0x00fe, B:24:0x00bd), top: B:76:0x00bd }] */
        /* JADX WARN: Code duplicated, block: B:32:0x00fe A[Catch: all -> 0x0107, TRY_LEAVE, TryCatch #2 {all -> 0x0107, blocks: (B:29:0x00ce, B:31:0x00f6, B:32:0x00fe, B:24:0x00bd), top: B:76:0x00bd }] */
        @Override // com.amap.api.col.3sl.aw.a
        public final boolean a(aw awVar) {
            this.j.mGestureState = 2;
            this.j.mGestureType = 4;
            boolean z = false;
            boolean z2 = true;
            this.j.mLocation = new float[]{awVar.a().getX(), awVar.a().getY()};
            int engineIDWithGestureInfo = ab.this.f2173a.getEngineIDWithGestureInfo(this.j);
            float fH = awVar.h();
            float fI = awVar.i();
            int iB = (int) awVar.b();
            int iC = (int) awVar.c();
            float fAbs = Math.abs(iB - this.e.x);
            float fAbs2 = Math.abs(iC - this.e.y);
            this.e.x = iB;
            this.e.y = iC;
            float fLog = (float) Math.log(fH);
            if (ab.this.k <= 0 && Math.abs(fLog) > 0.2f) {
                this.d = true;
            }
            try {
                if (ab.this.f2173a.getUiSettings().isZoomGesturesEnabled()) {
                    if (!this.f2184b && 0.06f < Math.abs(fLog)) {
                        this.f2184b = true;
                    }
                    if (this.f2184b && 0.01f < Math.abs(fLog)) {
                        if (fAbs > 2.0f || fAbs2 > 2.0f) {
                            try {
                                if (Math.abs(fLog) >= 0.02f) {
                                    if (fI > 0.0f) {
                                        float f = fLog / fI;
                                        this.g = f;
                                        this.f[ab.this.k % 10] = Math.abs(f);
                                        ab.g(ab.this);
                                        ab.this.f2173a.addGestureMapMessage(engineIDWithGestureInfo, ScaleGestureMapMessage.obtain(101, fLog, iB, iC));
                                        if (fLog > 0.0f) {
                                            ab.this.f2173a.setGestureStatus(engineIDWithGestureInfo, 1);
                                        } else {
                                            ab.this.f2173a.setGestureStatus(engineIDWithGestureInfo, 2);
                                        }
                                    }
                                }
                                z = true;
                            } catch (Throwable th) {
                                th = th;
                                z = true;
                                jv.c(th, "GLMapGestrureDetector", "onScaleRotate");
                                th.printStackTrace();
                            }
                        } else {
                            if (fI > 0.0f) {
                                float f2 = fLog / fI;
                                this.g = f2;
                                this.f[ab.this.k % 10] = Math.abs(f2);
                                ab.g(ab.this);
                                ab.this.f2173a.addGestureMapMessage(engineIDWithGestureInfo, ScaleGestureMapMessage.obtain(101, fLog, iB, iC));
                                if (fLog > 0.0f) {
                                    ab.this.f2173a.setGestureStatus(engineIDWithGestureInfo, 1);
                                } else {
                                    ab.this.f2173a.setGestureStatus(engineIDWithGestureInfo, 2);
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
                if (ab.this.f2173a.getUiSettings().isRotateGesturesEnabled() && !ab.this.f2173a.isLockMapAngle(engineIDWithGestureInfo) && !this.d) {
                    float fJ = awVar.j();
                    if (!this.f2185c && Math.abs(fJ) >= 4.0f) {
                        this.f2185c = true;
                    }
                    if (this.f2185c && 1.0f < Math.abs(fJ) && ((fAbs <= 4.0f && fAbs2 <= 4.0f) || Math.abs(fJ) >= 2.0f)) {
                        float f3 = fJ / fI;
                        this.i = f3;
                        this.h[ab.this.l % 10] = Math.abs(f3);
                        ab.h(ab.this);
                        ab.this.f2173a.addGestureMapMessage(engineIDWithGestureInfo, RotateGestureMapMessage.obtain(101, fJ, iB, iC));
                        try {
                            ab.this.f2173a.setGestureStatus(engineIDWithGestureInfo, 6);
                            return true;
                        } catch (Throwable th3) {
                            th = th3;
                            jv.c(th, "GLMapGestrureDetector", "onScaleRotate");
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

        @Override // com.amap.api.col.3sl.aw.a
        public final boolean b(aw awVar) {
            this.j.mGestureState = 1;
            this.j.mGestureType = 4;
            this.j.mLocation = new float[]{awVar.a().getX(), awVar.a().getY()};
            int engineIDWithGestureInfo = ab.this.f2173a.getEngineIDWithGestureInfo(this.j);
            int iB = (int) awVar.b();
            int iC = (int) awVar.c();
            this.d = false;
            this.e.x = iB;
            this.e.y = iC;
            this.f2184b = false;
            this.f2185c = false;
            ab.this.f2173a.addGestureMapMessage(engineIDWithGestureInfo, ScaleGestureMapMessage.obtain(100, 1.0f, iB, iC));
            try {
                if (ab.this.f2173a.getUiSettings().isRotateGesturesEnabled() && !ab.this.f2173a.isLockMapAngle(engineIDWithGestureInfo)) {
                    ab.this.f2173a.addGestureMapMessage(engineIDWithGestureInfo, RotateGestureMapMessage.obtain(100, ab.this.f2173a.getMapAngle(engineIDWithGestureInfo), iB, iC));
                }
            } catch (Throwable th) {
                jv.c(th, "GLMapGestrureDetector", "onScaleRotateBegin");
                th.printStackTrace();
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:49:0x0129  */
        @Override // com.amap.api.col.3sl.aw.a
        public final void c(aw awVar) {
            float f;
            float f2;
            float preciseLevel;
            this.j.mGestureState = 3;
            this.j.mGestureType = 4;
            this.j.mLocation = new float[]{awVar.a().getX(), awVar.a().getY()};
            int engineIDWithGestureInfo = ab.this.f2173a.getEngineIDWithGestureInfo(this.j);
            this.d = false;
            ab.this.f2173a.addGestureMapMessage(engineIDWithGestureInfo, ScaleGestureMapMessage.obtain(102, 1.0f, 0, 0));
            if (ab.this.k > 0) {
                int i = ab.this.k > 10 ? 10 : ab.this.k;
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
                    preciseLevel = ab.this.f2173a.getPreciseLevel(engineIDWithGestureInfo) + f5;
                } else {
                    preciseLevel = -9999.0f;
                }
                this.g = 0.0f;
                f = preciseLevel;
            } else {
                f = -9999.0f;
            }
            if (ab.this.f2173a.isLockMapAngle(engineIDWithGestureInfo)) {
                f2 = -9999.0f;
            } else {
                try {
                    if (ab.this.f2173a.getUiSettings().isRotateGesturesEnabled()) {
                        ab.this.f2173a.addGestureMapMessage(engineIDWithGestureInfo, RotateGestureMapMessage.obtain(102, ab.this.f2173a.getMapAngle(engineIDWithGestureInfo), 0, 0));
                    }
                } catch (Throwable th) {
                    jv.c(th, "GLMapGestrureDetector", "onScaleRotateEnd");
                    th.printStackTrace();
                }
                if (ab.this.l > 0) {
                    ab.this.f2173a.setGestureStatus(engineIDWithGestureInfo, 6);
                    int i3 = ab.this.l > 10 ? 10 : ab.this.l;
                    float f6 = 0.0f;
                    for (int i4 = 0; i4 < 10; i4++) {
                        float[] fArr2 = this.h;
                        f6 += fArr2[i4];
                        fArr2[i4] = 0.0f;
                    }
                    float f7 = f6 / i3;
                    if (0.1f <= f7) {
                        float f8 = f7 * 200.0f;
                        int mapAngle = (int) ab.this.f2173a.getMapAngle(engineIDWithGestureInfo);
                        if (f8 >= 60.0f) {
                            f8 = 60.0f;
                        }
                        if (this.i < 0.0f) {
                            f8 = -f8;
                        }
                        f2 = ((int) ((mapAngle % 360) + f8)) % 360;
                    } else {
                        f2 = -9999.0f;
                    }
                } else {
                    f2 = -9999.0f;
                }
                this.g = 0.0f;
            }
            if (f == -9999.0f && f2 == -9999.0f) {
                return;
            }
            ab.this.f2173a.getGLMapEngine().startPivotZoomRotateAnim(engineIDWithGestureInfo, this.e, f, (int) f2, 500);
        }
    }

    final class c implements au.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private EAMapPlatformGestureInfo f2182b;

        private c() {
            this.f2182b = new EAMapPlatformGestureInfo();
        }

        /* synthetic */ c(ab abVar, byte b2) {
            this();
        }

        @Override // com.amap.api.col.3sl.au.a
        public final boolean a(au auVar) {
            if (ab.this.i) {
                return true;
            }
            try {
                if (ab.this.f2173a.getUiSettings().isScrollGesturesEnabled() && !ab.this.p) {
                    this.f2182b.mGestureState = 2;
                    this.f2182b.mGestureType = 3;
                    this.f2182b.mLocation = new float[]{auVar.c().getX(), auVar.c().getY()};
                    int engineIDWithGestureInfo = ab.this.f2173a.getEngineIDWithGestureInfo(this.f2182b);
                    PointF pointFD = auVar.d();
                    float f = ab.this.j == 0 ? 4.0f : 1.0f;
                    if (Math.abs(pointFD.x) <= f && Math.abs(pointFD.y) <= f) {
                        return false;
                    }
                    if (ab.this.j == 0) {
                        ab.this.f2173a.getGLMapEngine().clearAnimations(engineIDWithGestureInfo, false);
                    }
                    ab.this.f2173a.addGestureMapMessage(engineIDWithGestureInfo, MoveGestureMapMessage.obtain(101, pointFD.x, pointFD.y, auVar.c().getX(), auVar.c().getY()));
                    ab.l(ab.this);
                }
                return true;
            } catch (Throwable th) {
                jv.c(th, "GLMapGestrureDetector", "onMove");
                th.printStackTrace();
                return true;
            }
        }

        @Override // com.amap.api.col.3sl.au.a
        public final boolean b(au auVar) {
            try {
                if (!ab.this.f2173a.getUiSettings().isScrollGesturesEnabled()) {
                    return true;
                }
                this.f2182b.mGestureState = 1;
                this.f2182b.mGestureType = 3;
                this.f2182b.mLocation = new float[]{auVar.c().getX(), auVar.c().getY()};
                ab.this.f2173a.addGestureMapMessage(ab.this.f2173a.getEngineIDWithGestureInfo(this.f2182b), MoveGestureMapMessage.obtain(100, 0.0f, 0.0f, auVar.c().getX(), auVar.c().getY()));
                return true;
            } catch (Throwable th) {
                jv.c(th, "GLMapGestrureDetector", "onMoveBegin");
                th.printStackTrace();
                return true;
            }
        }

        @Override // com.amap.api.col.3sl.au.a
        public final void c(au auVar) {
            try {
                if (ab.this.f2173a.getUiSettings().isScrollGesturesEnabled()) {
                    this.f2182b.mGestureState = 3;
                    this.f2182b.mGestureType = 3;
                    this.f2182b.mLocation = new float[]{auVar.c().getX(), auVar.c().getY()};
                    int engineIDWithGestureInfo = ab.this.f2173a.getEngineIDWithGestureInfo(this.f2182b);
                    if (ab.this.j > 0) {
                        ab.this.f2173a.setGestureStatus(engineIDWithGestureInfo, 5);
                    }
                    ab.this.f2173a.addGestureMapMessage(engineIDWithGestureInfo, MoveGestureMapMessage.obtain(102, 0.0f, 0.0f, auVar.c().getX(), auVar.c().getY()));
                }
            } catch (Throwable th) {
                jv.c(th, "GLMapGestrureDetector", "onMoveEnd");
                th.printStackTrace();
            }
        }
    }

    final class b implements at.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private EAMapPlatformGestureInfo f2180b;

        private b() {
            this.f2180b = new EAMapPlatformGestureInfo();
        }

        /* synthetic */ b(ab abVar, byte b2) {
            this();
        }

        @Override // com.amap.api.col.3sl.at.a
        public final boolean a(at atVar) {
            this.f2180b.mGestureState = 2;
            this.f2180b.mGestureType = 6;
            this.f2180b.mLocation = new float[]{atVar.c().getX(), atVar.c().getY()};
            try {
                if (!ab.this.f2173a.getUiSettings().isTiltGesturesEnabled()) {
                    return true;
                }
                int engineIDWithGestureInfo = ab.this.f2173a.getEngineIDWithGestureInfo(this.f2180b);
                if (ab.this.f2173a.isLockMapCameraDegree(engineIDWithGestureInfo) || ab.this.l > 3) {
                    return false;
                }
                float f = atVar.d().x;
                float f2 = atVar.d().y;
                if (!ab.this.i) {
                    PointF pointFA = atVar.a(0);
                    PointF pointFA2 = atVar.a(1);
                    if (((pointFA.y > 10.0f && pointFA2.y > 10.0f) || (pointFA.y < -10.0f && pointFA2.y < -10.0f)) && Math.abs(f2) > 10.0f && Math.abs(f) < 10.0f) {
                        ab.this.i = true;
                    }
                }
                if (ab.this.i) {
                    ab.this.i = true;
                    float f3 = f2 / 6.0f;
                    if (Math.abs(f3) > 1.0f) {
                        ab.this.f2173a.addGestureMapMessage(engineIDWithGestureInfo, HoverGestureMapMessage.obtain(101, f3));
                        ab.m(ab.this);
                    }
                }
                return true;
            } catch (Throwable th) {
                jv.c(th, "GLMapGestrureDetector", "onHove");
                th.printStackTrace();
                return true;
            }
        }

        @Override // com.amap.api.col.3sl.at.a
        public final boolean b(at atVar) {
            this.f2180b.mGestureState = 1;
            this.f2180b.mGestureType = 6;
            this.f2180b.mLocation = new float[]{atVar.c().getX(), atVar.c().getY()};
            try {
                if (!ab.this.f2173a.getUiSettings().isTiltGesturesEnabled()) {
                    return true;
                }
                int engineIDWithGestureInfo = ab.this.f2173a.getEngineIDWithGestureInfo(this.f2180b);
                if (ab.this.f2173a.isLockMapCameraDegree(engineIDWithGestureInfo)) {
                    return false;
                }
                ab.this.f2173a.addGestureMapMessage(engineIDWithGestureInfo, HoverGestureMapMessage.obtain(100, ab.this.f2173a.getCameraDegree(engineIDWithGestureInfo)));
                return true;
            } catch (Throwable th) {
                jv.c(th, "GLMapGestrureDetector", "onHoveBegin");
                th.printStackTrace();
                return true;
            }
        }

        @Override // com.amap.api.col.3sl.at.a
        public final void c(at atVar) {
            this.f2180b.mGestureState = 3;
            this.f2180b.mGestureType = 6;
            this.f2180b.mLocation = new float[]{atVar.c().getX(), atVar.c().getY()};
            try {
                if (ab.this.f2173a.getUiSettings().isTiltGesturesEnabled()) {
                    int engineIDWithGestureInfo = ab.this.f2173a.getEngineIDWithGestureInfo(this.f2180b);
                    if (ab.this.f2173a.isLockMapCameraDegree(engineIDWithGestureInfo)) {
                        return;
                    }
                    if (ab.this.f2173a.getCameraDegree(engineIDWithGestureInfo) >= 0.0f && ab.this.m > 0) {
                        ab.this.f2173a.setGestureStatus(engineIDWithGestureInfo, 7);
                    }
                    ab.this.i = false;
                    ab.this.f2173a.addGestureMapMessage(engineIDWithGestureInfo, HoverGestureMapMessage.obtain(102, ab.this.f2173a.getCameraDegree(engineIDWithGestureInfo)));
                }
            } catch (Throwable th) {
                jv.c(th, "GLMapGestrureDetector", "onHoveEnd");
                th.printStackTrace();
            }
        }
    }

    final class e extends ax.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        EAMapPlatformGestureInfo f2186a;

        private e() {
            this.f2186a = new EAMapPlatformGestureInfo();
        }

        /* synthetic */ e(ab abVar, byte b2) {
            this();
        }

        @Override // com.amap.api.col.3sl.ax.b, com.amap.api.col.3sl.ax.a
        public final void a(ax axVar) {
            try {
                if (ab.this.f2173a.getUiSettings().isZoomGesturesEnabled() && Math.abs(axVar.d()) <= 10.0f && Math.abs(axVar.e()) <= 10.0f && axVar.b() < 200) {
                    ab.n(ab.this);
                    this.f2186a.mGestureState = 2;
                    this.f2186a.mGestureType = 2;
                    this.f2186a.mLocation = new float[]{axVar.c().getX(), axVar.c().getY()};
                    int engineIDWithGestureInfo = ab.this.f2173a.getEngineIDWithGestureInfo(this.f2186a);
                    ab.this.f2173a.setGestureStatus(engineIDWithGestureInfo, 4);
                    ab.this.f2173a.zoomOut(engineIDWithGestureInfo);
                }
            } catch (Throwable th) {
                jv.c(th, "GLMapGestrureDetector", "onZoomOut");
                th.printStackTrace();
            }
        }
    }
}
