package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import android.view.animation.AnimationUtils;
import com.amap.api.maps.AMapException;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.animation.Animation;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.animation.GLAnimation;
import com.autonavi.amap.mapcore.animation.GLAnimationSet;
import com.autonavi.amap.mapcore.animation.GLTransformation;
import com.autonavi.amap.mapcore.animation.GLTranslateAnimation;
import com.autonavi.amap.mapcore.interfaces.IMarkerAction;
import com.autonavi.amap.mapcore.interfaces.IOverlayImage;
import com.autonavi.base.ae.gmap.GLMapState;
import com.autonavi.base.amap.api.mapcore.BaseOverlayImp;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.api.mapcore.overlays.IMarkerDelegate;
import com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate;
import com.autonavi.base.amap.mapcore.FPoint;
import com.autonavi.base.amap.mapcore.Rectangle;
import com.autonavi.base.amap.mapcore.interfaces.IAnimation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class cs extends BaseOverlayImp implements IMarkerAction, IMarkerDelegate, IAnimation {
    private static int i;
    private MarkerOptions D;
    private float P;
    private float Q;
    private w T;
    private String W;
    private LatLng X;
    private LatLng Y;
    private String Z;
    public float[] a;
    private String aa;
    private u af;
    private Object ag;
    private int aq;
    private int ar;
    public float[] b;
    public GLAnimation f;
    public GLAnimation g;
    private boolean j;
    private float k;
    private int v;
    private int w;
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;
    private float o = 0.0f;
    private float p = 0.0f;
    private boolean q = false;
    private int r = 0;
    private int s = 0;
    private int t = 0;
    private int u = 0;
    private FPoint x = FPoint.obtain();
    private float[] y = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private float z = 0.0f;
    private float A = 1.0f;
    private float B = 1.0f;
    private float C = 1.0f;
    private boolean E = false;
    private boolean F = true;
    private int G = 5;
    private boolean H = true;
    private boolean I = true;
    private boolean J = false;
    private boolean K = false;
    private boolean L = false;
    private boolean M = true;
    private FPoint N = FPoint.obtain();
    private Point O = new Point();
    private int R = 0;
    private int S = 0;
    private w[] U = null;
    public Rect c = new Rect(0, 0, 0, 0);
    private boolean V = false;
    private float ab = 0.5f;
    private float ac = 1.0f;
    private boolean ad = false;
    private boolean ae = true;
    private boolean ah = false;
    private List<BitmapDescriptor> ai = new CopyOnWriteArrayList();
    private boolean aj = false;
    private boolean ak = false;
    public GLTransformation d = null;
    public GLTransformation e = null;
    private boolean al = false;
    private boolean am = true;
    private int an = 0;
    private int ao = 20;
    private boolean ap = false;
    private long as = 0;
    public Object h = new Object();
    private float at = Float.MAX_VALUE;
    private float au = Float.MIN_VALUE;
    private float av = Float.MIN_VALUE;
    private float aw = Float.MAX_VALUE;

    public cs(MarkerOptions markerOptions, u uVar) {
        this.af = uVar;
        setMarkerOptions(markerOptions);
    }

    private synchronized void a() {
        List<BitmapDescriptor> list = this.ai;
        if (list != null) {
            list.clear();
        }
    }

    private void b() {
        if (this.af.b() != null) {
            this.af.b().setRunLowFrame(false);
        }
    }

    private void c() {
        GLTransformation gLTransformation;
        GLAnimation gLAnimation;
        if (!this.M && (gLAnimation = this.f) != null && !gLAnimation.hasEnded()) {
            b();
            synchronized (this.h) {
                if (this.e == null || this.al) {
                    GLTransformation gLTransformation2 = new GLTransformation();
                    this.e = gLTransformation2;
                    gLTransformation2.scaleX = this.A;
                    gLTransformation2.scaleY = this.B;
                    gLTransformation2.rotate = this.o;
                    gLTransformation2.y = this.w;
                    gLTransformation2.x = this.v;
                    gLTransformation2.alpha = this.C;
                    this.al = false;
                }
                if (this.d == null) {
                    this.d = new GLTransformation();
                }
                this.d.clear();
                this.f.getTransformation(AnimationUtils.currentAnimationTimeMillis(), this.d);
                GLTransformation gLTransformation3 = this.d;
                if (gLTransformation3 != null) {
                    if (!Double.isNaN(gLTransformation3.scaleX) && !Double.isNaN(this.d.scaleY)) {
                        GLTransformation gLTransformation4 = this.d;
                        this.A = (float) gLTransformation4.scaleX;
                        this.B = (float) gLTransformation4.scaleY;
                    }
                    if (!Double.isNaN(this.d.rotate)) {
                        setRotateAngle((float) this.d.rotate);
                    }
                    if (!Double.isNaN(this.d.x) && !Double.isNaN(this.d.y)) {
                        GLTransformation gLTransformation5 = this.d;
                        a(gLTransformation5.x, gLTransformation5.y);
                    }
                    if (!Double.isNaN(this.d.alpha)) {
                        this.C = (float) this.d.alpha;
                    }
                }
            }
            this.n = true;
            this.am = false;
            return;
        }
        if (this.f != null && ((gLTransformation = this.d) != null || this.e != null)) {
            if (gLTransformation == null || Double.isNaN(gLTransformation.scaleX) || Double.isNaN(this.d.scaleY)) {
                GLTransformation gLTransformation6 = this.e;
                if (gLTransformation6 != null && !Double.isNaN(gLTransformation6.scaleX) && !Double.isNaN(this.e.scaleY)) {
                    double d = this.A;
                    GLTransformation gLTransformation7 = this.e;
                    double d2 = gLTransformation7.scaleX;
                    if (d != d2 || this.B != gLTransformation7.scaleY) {
                        this.A = (float) d2;
                        this.B = (float) gLTransformation7.scaleY;
                    }
                }
            } else {
                GLTransformation gLTransformation8 = this.d;
                this.A = (float) gLTransformation8.scaleX;
                this.B = (float) gLTransformation8.scaleY;
            }
            GLTransformation gLTransformation9 = this.d;
            if (gLTransformation9 == null || Double.isNaN(gLTransformation9.rotate)) {
                GLTransformation gLTransformation10 = this.e;
                if (gLTransformation10 != null && !Double.isNaN(gLTransformation10.rotate)) {
                    double d3 = this.o;
                    double d4 = this.e.rotate;
                    if (d3 != d4) {
                        setRotateAngle((float) d4);
                    }
                }
            } else {
                setRotateAngle((float) this.d.rotate);
            }
            GLTransformation gLTransformation11 = this.d;
            if (gLTransformation11 == null || Double.isNaN(gLTransformation11.x) || Double.isNaN(this.d.y)) {
                GLTransformation gLTransformation12 = this.e;
                if (gLTransformation12 != null && !Double.isNaN(gLTransformation12.x) && !Double.isNaN(this.e.y)) {
                    double d5 = this.v;
                    GLTransformation gLTransformation13 = this.e;
                    double d6 = gLTransformation13.x;
                    if (d5 != d6 || this.w != gLTransformation13.y) {
                        a(d6, gLTransformation13.y);
                    }
                }
            } else {
                GLTransformation gLTransformation14 = this.d;
                a(gLTransformation14.x, gLTransformation14.y);
            }
            GLTransformation gLTransformation15 = this.d;
            if (gLTransformation15 == null || Double.isNaN(gLTransformation15.alpha)) {
                GLTransformation gLTransformation16 = this.e;
                if (gLTransformation16 != null && !Double.isNaN(gLTransformation16.alpha)) {
                    double d7 = this.C;
                    double d8 = this.e.alpha;
                    if (d7 != d8) {
                        this.C = (float) d8;
                    }
                }
            } else {
                this.C = (float) this.d.alpha;
            }
        }
        this.M = true;
        this.d = null;
        this.e = null;
        List<BitmapDescriptor> list = this.ai;
        if (list == null || list.size() != 1) {
            return;
        }
        this.am = true;
    }

    private static int d() {
        int[] iArr = {0};
        GLES20.glGenTextures(1, iArr, 0);
        return iArr[0];
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IMarkerDelegate
    public final FPoint anchorUVoff() {
        FPoint fPointObtain = FPoint.obtain();
        List<BitmapDescriptor> list = this.ai;
        if (list != null && list.size() != 0) {
            ((PointF) fPointObtain).x = getWidth() * this.ab;
            ((PointF) fPointObtain).y = getHeight() * this.ac;
        }
        return fPointObtain;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final boolean calFPoint() {
        try {
            u uVar = this.af;
            if (uVar != null && uVar.b() != null && this.af.b().getMapProjection() != null) {
                if (this.x == null) {
                    this.x = FPoint.obtain();
                }
                if (this.ap) {
                    IPoint iPointObtain = IPoint.obtain();
                    this.af.b().getPixel2Geo(this.aq, this.ar, iPointObtain);
                    this.v = ((Point) iPointObtain).x;
                    this.w = ((Point) iPointObtain).y;
                    iPointObtain.recycle();
                }
                this.af.b().geo2Map(this.v, this.w, this.x);
                return true;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final boolean checkInBounds() {
        if (this.ap) {
            return true;
        }
        try {
            if (this.x == null) {
                return false;
            }
            if (!this.M) {
                return true;
            }
            Point point = this.O;
            point.x = this.v;
            point.y = this.w;
            Rectangle geoRectangle = this.af.b().getMapConfig().getGeoRectangle();
            if (geoRectangle.contains(this.v, this.w)) {
                return true;
            }
            if (this.af.b() != null && this.af.b().getMapConfig() != null) {
                this.P = this.af.b().getMapConfig().getMapPerPixelUnitLength() * getWidth();
                this.Q = this.af.b().getMapConfig().getMapPerPixelUnitLength() * getHeight();
            }
            int i2 = (int) (this.A * this.P);
            int i3 = (int) (this.B * this.Q);
            int i4 = (int) (this.v - (i2 * this.ab));
            int i5 = (int) (this.w - (i3 * this.ac));
            return geoRectangle.contains(i4, i5) || geoRectangle.isOverlap(i4, i5, i2, i3);
        } catch (Throwable th) {
            hn.c(th, "MarkerDelegateImp", "checkInBounds");
            return false;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final void destroy(boolean z) {
        try {
            this.V = true;
            if (z) {
                remove();
            }
            int i2 = 0;
            if (this.af != null) {
                int i3 = 0;
                while (true) {
                    w[] wVarArr = this.U;
                    if (wVarArr == null || i3 >= wVarArr.length) {
                        break;
                    }
                    w wVar = wVarArr[i3];
                    if (wVar != null) {
                        this.af.a(wVar);
                        this.af.b().removeTextureItem(wVar.q());
                    }
                    i3++;
                }
            }
            while (true) {
                List<BitmapDescriptor> list = this.ai;
                if (list == null || i2 >= list.size()) {
                    break;
                }
                this.ai.get(i2).recycle();
                i2++;
            }
            this.X = null;
            this.ag = null;
            this.U = null;
        } catch (Throwable th) {
            hn.c(th, "MarkerDelegateImp", "destroy");
            th.printStackTrace();
            Log.d("destroy erro", "MarkerDelegateImp destroy");
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final void drawMarker(IAMapDelegate iAMapDelegate) {
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final void drawMarker(IAMapDelegate iAMapDelegate, float[] fArr, int i2, float f) {
        if (this.V || (this.X == null && !this.ap) || this.ai == null) {
            return;
        }
        try {
            if (!this.l) {
                this.as = System.currentTimeMillis();
                this.l = true;
            }
            if (this.ap && this.I) {
                IPoint iPointObtain = IPoint.obtain();
                iAMapDelegate.getPixel2Geo(this.aq, this.ar, iPointObtain);
                this.v = ((Point) iPointObtain).x;
                this.w = ((Point) iPointObtain).y;
                iPointObtain.recycle();
            }
            ((PointF) this.x).x = this.v - ((int) iAMapDelegate.getMapConfig().getSX());
            FPoint fPoint = this.x;
            float f2 = ((PointF) fPoint).x;
            if (f2 > 1.3421773E8f) {
                ((PointF) fPoint).x = f2 - 2.6843546E8f;
            } else if (f2 < -1.3421773E8f) {
                ((PointF) fPoint).x = f2 + 2.6843546E8f;
            }
            ((PointF) fPoint).y = this.w - ((int) iAMapDelegate.getMapConfig().getSY());
            int width = getWidth();
            int height = getHeight();
            c();
            float f3 = ((int) (this.A * width)) * f;
            float f4 = ((int) (this.B * height)) * f;
            FPoint fPoint2 = this.x;
            float f5 = ((PointF) fPoint2).x;
            float f6 = ((PointF) fPoint2).y;
            float sc = iAMapDelegate.getMapConfig().getSC();
            float sr = this.o;
            List<BitmapDescriptor> list = this.ai;
            if (list != null && list.size() > 0) {
                if (this.j) {
                    w[] wVarArr = this.U;
                    int length = wVarArr.length;
                    float f7 = this.o;
                    float f8 = this.k;
                    int i3 = (int) (f7 / f8);
                    if (i3 > length) {
                        i3 = 0;
                    } else {
                        sr = f7 % f8;
                    }
                    this.T = wVarArr[(i3 + length) % length];
                } else {
                    this.an++;
                    if (this.an >= this.ao * this.ai.size()) {
                        this.an = 0;
                    }
                    if (this.ao == 0) {
                        this.ao = 1;
                    }
                    this.T = this.U[this.an / this.ao];
                    if (!this.am) {
                        b();
                    }
                }
            }
            float f9 = 0.0f;
            if (this.q) {
                sr -= iAMapDelegate.getMapConfig().getSR();
                sc = 0.0f;
            }
            float f10 = this.C;
            if (f10 >= 0.0f) {
                f9 = f10;
            }
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            float[] fArr2 = this.y;
            float f11 = this.ab;
            fArr2[0] = f5 - (f3 * f11);
            float f12 = this.ac;
            fArr2[1] = ((1.0f - f12) * f4) + f6;
            fArr2[2] = f5;
            fArr2[3] = f6;
            fArr2[6] = sr;
            fArr2[7] = sc;
            fArr2[8] = f9;
            fArr2[9] = ((1.0f - f11) * f3) + f5;
            fArr2[10] = ((1.0f - f12) * f4) + f6;
            fArr2[11] = f5;
            fArr2[12] = f6;
            fArr2[15] = sr;
            fArr2[16] = sc;
            fArr2[17] = f9;
            fArr2[18] = ((1.0f - f11) * f3) + f5;
            fArr2[19] = f6 - (f4 * f12);
            fArr2[20] = f5;
            fArr2[21] = f6;
            fArr2[24] = sr;
            fArr2[25] = sc;
            fArr2[26] = f9;
            fArr2[27] = f5 - (f3 * f11);
            fArr2[28] = f6 - (f4 * f12);
            fArr2[29] = f5;
            fArr2[30] = f6;
            fArr2[33] = sr;
            fArr2[34] = sc;
            fArr2[35] = f9;
            if (!this.J || !this.am) {
                try {
                    if (this.T.a()) {
                        this.y[4] = this.T.e();
                        this.y[5] = this.T.d();
                        this.y[13] = this.T.c();
                        this.y[14] = this.T.d();
                        this.y[22] = this.T.c();
                        this.y[23] = this.T.f();
                        this.y[31] = this.T.e();
                        this.y[32] = this.T.f();
                    } else {
                        this.y[4] = this.T.h();
                        this.y[5] = this.T.j();
                        this.y[13] = this.T.i();
                        this.y[14] = this.T.j();
                        this.y[22] = this.T.i();
                        this.y[23] = this.T.g();
                        this.y[31] = this.T.h();
                        this.y[32] = this.T.g();
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                this.J = true;
            }
            w[] wVarArr2 = this.U;
            if (wVarArr2 != null && wVarArr2.length > 0) {
                float[] fArr3 = this.y;
                System.arraycopy(fArr3, 0, fArr, i2, fArr3.length);
            }
            if (this.n && isInfoWindowShown()) {
                this.af.b().redrawInfoWindow();
                if (System.currentTimeMillis() - this.as > 1000) {
                    this.n = false;
                }
            }
        } catch (Throwable th2) {
            hn.c(th2, "MarkerDelegateImp", "drawMarker");
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final boolean equalsRemote(IOverlayImage iOverlayImage) throws RemoteException {
        return equals(iOverlayImage) || iOverlayImage.getId().equals(getId());
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarkerAction
    public final float getAlpha() {
        return this.C;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final IPoint getAnchor() {
        IPoint iPointObtain;
        if (this.X != null || this.ap) {
            FPoint fPointObtain = FPoint.obtain();
            this.af.b().getMapProjection().p20ToScreenPoint(this.v, this.w, fPointObtain);
            iPointObtain = IPoint.obtain((int) ((PointF) fPointObtain).x, (int) ((PointF) fPointObtain).y);
        } else {
            iPointObtain = null;
        }
        if (iPointObtain == null) {
            return null;
        }
        return iPointObtain;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final float getAnchorU() {
        return this.ab;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final float getAnchorV() {
        return this.ac;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final synchronized BitmapDescriptor getBitmapDescriptor() {
        try {
            List<BitmapDescriptor> list = this.ai;
            if (list == null) {
                return null;
            }
            if (list.size() == 0) {
                a();
                this.ai.add(BitmapDescriptorFactory.defaultMarker());
            } else if (this.ai.get(0) == null) {
                this.ai.clear();
                return getBitmapDescriptor();
            }
            return this.ai.get(0);
        } catch (Throwable th) {
            hn.c(th, "MarkerDelegateImp", "getBitmapDescriptor");
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarkerAction
    public final int getDisplayLevel() {
        return this.G;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarker
    public final IPoint getGeoPoint() {
        IPoint iPointObtain = IPoint.obtain();
        if (this.ap) {
            this.af.b().getPixel2Geo(this.aq, this.ar, iPointObtain);
            return iPointObtain;
        }
        iPointObtain.set(this.v, this.w);
        return iPointObtain;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final FPoint getGeoPosition() {
        IPoint geoPoint = getGeoPoint();
        return FPoint.obtain(((Point) geoPoint).x, ((Point) geoPoint).y);
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final int getHeight() {
        try {
            return this.S;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final IAnimation getIAnimation() {
        return this;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarker, com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final IMarkerAction getIMarkerAction() {
        return this;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarker
    public final synchronized ArrayList<BitmapDescriptor> getIcons() {
        List<BitmapDescriptor> list = this.ai;
        if (list == null || list.size() <= 0) {
            return null;
        }
        ArrayList<BitmapDescriptor> arrayList = new ArrayList<>();
        Iterator<BitmapDescriptor> it2 = this.ai.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final String getId() {
        if (this.W == null) {
            i++;
            this.W = "Marker" + i;
        }
        return this.W;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final int getInfoWindowOffsetX() {
        return this.r;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final int getInfoWindowOffsetY() {
        return this.s;
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final Object getObject() {
        return this.ag;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarkerAction
    public final MarkerOptions getOptions() {
        return this.D;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarker
    public final int getPeriod() {
        return this.ao;
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final LatLng getPosition() {
        if (!this.ap || this.x == null) {
            return this.X;
        }
        DPoint dPointObtain = DPoint.obtain();
        IPoint iPointObtain = IPoint.obtain();
        calFPoint();
        if (this.af.b() == null) {
            return this.X;
        }
        IAMapDelegate iAMapDelegateB = this.af.b();
        FPoint fPoint = this.x;
        iAMapDelegateB.map2Geo(((PointF) fPoint).x, ((PointF) fPoint).y, iPointObtain);
        GLMapState.geo2LonLat(((Point) iPointObtain).x, ((Point) iPointObtain).y, dPointObtain);
        LatLng latLng = new LatLng(dPointObtain.y, dPointObtain.x);
        iPointObtain.recycle();
        dPointObtain.recycle();
        return latLng;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final int getRealInfoWindowOffsetX() {
        return this.t;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final int getRealInfoWindowOffsetY() {
        return this.u;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final LatLng getRealPosition() {
        try {
            if (!this.ap) {
                return this.aj ? this.Y : this.X;
            }
            DPoint dPointObtain = DPoint.obtain();
            this.af.b().getPixel2LatLng(this.aq, this.ar, dPointObtain);
            double d = dPointObtain.y;
            LatLng latLng = new LatLng(d, d);
            dPointObtain.recycle();
            return latLng;
        } catch (Throwable th) {
            hn.c(th, "MarkerDelegateImp", "getRealPosition");
            return null;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final Rect getRect() {
        if (this.y == null) {
            this.c.set(0, 0, 0, 0);
            return this.c;
        }
        try {
            GLMapState mapProjection = this.af.b().getMapProjection();
            if (mapProjection == null) {
                return new Rect(0, 0, 0, 0);
            }
            int width = getWidth();
            int height = getHeight();
            FPoint fPointObtain = FPoint.obtain();
            if (this.ap) {
                ((PointF) fPointObtain).x = this.aq;
                ((PointF) fPointObtain).y = this.ar;
            } else {
                mapProjection.p20ToScreenPoint(this.v, this.w, fPointObtain);
            }
            Matrix.setIdentityM(this.a, 0);
            Matrix.rotateM(this.a, 0, -this.o, 0.0f, 0.0f, 1.0f);
            if (this.q) {
                Matrix.rotateM(this.a, 0, this.af.b().getMapConfig().getSC(), 1.0f, 0.0f, 0.0f);
                Matrix.rotateM(this.a, 0, this.af.b().getMapConfig().getSR(), 0.0f, 0.0f, 1.0f);
            }
            float[] fArr = new float[4];
            float[] fArr2 = this.b;
            float f = -width;
            fArr2[0] = this.ab * f;
            float f2 = height;
            fArr2[1] = this.ac * f2;
            fArr2[2] = 0.0f;
            fArr2[3] = 1.0f;
            Matrix.multiplyMV(fArr, 0, this.a, 0, fArr2, 0);
            Rect rect = this.c;
            float f3 = ((PointF) fPointObtain).x;
            int i2 = (int) (fArr[0] + f3);
            float f4 = ((PointF) fPointObtain).y;
            rect.set(i2, (int) (f4 - fArr[1]), (int) (f3 + fArr[0]), (int) (f4 - fArr[1]));
            float[] fArr3 = this.b;
            float f5 = width;
            fArr3[0] = (1.0f - this.ab) * f5;
            fArr3[1] = f2 * this.ac;
            fArr3[2] = 0.0f;
            fArr3[3] = 1.0f;
            Matrix.multiplyMV(fArr, 0, this.a, 0, fArr3, 0);
            this.c.union((int) (((PointF) fPointObtain).x + fArr[0]), (int) (((PointF) fPointObtain).y - fArr[1]));
            float[] fArr4 = this.b;
            fArr4[0] = f5 * (1.0f - this.ab);
            float f6 = -height;
            fArr4[1] = (1.0f - this.ac) * f6;
            fArr4[2] = 0.0f;
            fArr4[3] = 1.0f;
            Matrix.multiplyMV(fArr, 0, this.a, 0, fArr4, 0);
            this.c.union((int) (((PointF) fPointObtain).x + fArr[0]), (int) (((PointF) fPointObtain).y - fArr[1]));
            float[] fArr5 = this.b;
            fArr5[0] = f * this.ab;
            fArr5[1] = f6 * (1.0f - this.ac);
            fArr5[2] = 0.0f;
            fArr5[3] = 1.0f;
            Matrix.multiplyMV(fArr, 0, this.a, 0, fArr5, 0);
            this.c.union((int) (((PointF) fPointObtain).x + fArr[0]), (int) (((PointF) fPointObtain).y - fArr[1]));
            this.t = (int) (this.c.centerX() - ((PointF) fPointObtain).x);
            this.u = (int) (this.c.top - ((PointF) fPointObtain).y);
            fPointObtain.recycle();
            return this.c;
        } catch (Throwable th) {
            hn.c(th, "MarkerDelegateImp", "getRect");
            th.printStackTrace();
            return new Rect(0, 0, 0, 0);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final float getRotateAngle() {
        b();
        return this.p;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final IPoint getScreenPosition() {
        return IPoint.obtain(this.aq, this.ar);
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final String getSnippet() {
        return this.aa;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final int getTextureId() {
        try {
            List<BitmapDescriptor> list = this.ai;
            if (list != null && list.size() > 0) {
                return this.T.l();
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final String getTitle() {
        return this.Z;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final int getWidth() {
        try {
            return this.R;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final float getZIndex() {
        return this.z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final int hashCodeRemote() {
        return super.hashCode();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarker
    public final void hideInfoWindow() {
        if (isInfoWindowShown()) {
            this.af.b(this);
            b();
            this.m = false;
        }
        this.n = false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final boolean isAllowLow() {
        return this.am;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final boolean isBelowMaskLayer() {
        return this.K;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarkerAction
    public final boolean isClickable() {
        return this.H;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final boolean isContains() {
        return this.af.c(this);
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final boolean isDestory() {
        return this.V;
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IMarker
    public final boolean isDraggable() {
        return this.ad;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarker
    public final boolean isFlat() {
        return this.q;
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IMarkerAction
    public final boolean isInfoWindowAutoOverturn() {
        return this.E;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final boolean isInfoWindowEnable() {
        return this.F;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarker, com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final boolean isInfoWindowShown() {
        return this.m;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final boolean isOnTap() {
        return this.L;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarker
    public final boolean isPerspective() {
        return this.ah;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarker
    public final boolean isRemoved() {
        try {
            return !this.af.c(this);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final boolean isViewMode() {
        return this.ap;
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final boolean isVisible() {
        return this.ae;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[Catch: all -> 0x00ef, TryCatch #1 {all -> 0x00ef, blocks: (B:5:0x0005, B:7:0x000a, B:9:0x000e, B:11:0x0012, B:12:0x0017, B:13:0x001a, B:15:0x0021, B:19:0x0033, B:20:0x003a, B:22:0x0040, B:24:0x0048, B:26:0x004e, B:30:0x0057, B:32:0x005e, B:34:0x0064, B:36:0x006a, B:38:0x0082, B:40:0x008b, B:41:0x008e, B:42:0x0092, B:44:0x009a, B:46:0x00a2, B:47:0x00a6, B:50:0x00cb, B:48:0x00bf, B:51:0x00ce, B:52:0x00d9, B:54:0x00e1, B:56:0x00e6, B:55:0x00e4), top: B:68:0x0005, outer: #0 }] */
    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final void loadTexture(IAMapDelegate iAMapDelegate) {
        w wVar;
        int iL;
        Bitmap bitmap;
        if (this.ak) {
            return;
        }
        synchronized (this) {
            try {
                w[] wVarArr = this.U;
                if (wVarArr != null) {
                    for (w wVar2 : wVarArr) {
                        if (wVar2 != null) {
                            this.af.a(wVar2);
                        }
                    }
                }
                this.U = null;
                List<BitmapDescriptor> list = this.ai;
                if (list != null) {
                    this.U = new w[list.size()];
                    boolean z = Build.VERSION.SDK_INT >= 12;
                    int i2 = 0;
                    for (BitmapDescriptor bitmapDescriptor : this.ai) {
                        if (z) {
                            wVar = iAMapDelegate.getTextureItem(bitmapDescriptor);
                            iL = wVar != null ? wVar.l() : 0;
                            if (wVar == null) {
                                wVar = new w(bitmapDescriptor, iL);
                            }
                            if (iL != 0 && (bitmap = bitmapDescriptor.getBitmap()) != null && !bitmap.isRecycled()) {
                                this.R = bitmap.getWidth();
                                this.S = bitmap.getHeight();
                                int baseOverlayTextureID = this.af.b().getBaseOverlayTextureID();
                                if (baseOverlayTextureID == 0) {
                                    int iD = d();
                                    wVar.a(iD);
                                    if (z) {
                                        iAMapDelegate.addTextureItem(wVar);
                                    }
                                    er.a(iD, bitmap, false);
                                } else {
                                    if (this.af.a(bitmap, wVar)) {
                                        Bitmap.Config config = bitmap.getConfig();
                                        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
                                        if (config != config2) {
                                            bitmap = bitmap.copy(config2, true);
                                        }
                                        er.a(baseOverlayTextureID, bitmap, (int) (wVar.h() * 512.0f), (int) (wVar.g() * 1024.0f));
                                        wVar.a(baseOverlayTextureID);
                                    } else {
                                        int iD2 = d();
                                        er.a(iD2, bitmap, false);
                                        wVar.a(iD2);
                                    }
                                    if (z) {
                                        iAMapDelegate.addTextureItem(wVar);
                                    }
                                }
                            }
                            wVar.n();
                            this.U[i2] = wVar;
                            i2++;
                        } else {
                            wVar = null;
                        }
                        if (wVar == null) {
                            wVar = new w(bitmapDescriptor, iL);
                        }
                        if (iL != 0) {
                        }
                        wVar.n();
                        this.U[i2] = wVar;
                        i2++;
                    }
                    if (this.ai.size() == 1) {
                        this.am = true;
                    } else {
                        this.am = false;
                    }
                    this.J = false;
                    this.ak = true;
                }
                calFPoint();
            } catch (Throwable th) {
                hn.c(th, "MarkerDelegateImp", "loadtexture");
            }
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final synchronized void reLoadTexture() {
        this.ak = false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final boolean remove() {
        b();
        this.ae = false;
        u uVar = this.af;
        if (uVar != null) {
            return uVar.a((IOverlayImageDelegate) this);
        }
        return false;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarker
    public final void set2Top() {
        this.af.a((IMarkerDelegate) this);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarkerAction
    public final void setAlpha(float f) {
        this.C = f;
        this.D.alpha(f);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final void setAnchor(float f, float f2) {
        if (this.ab == f && this.ac == f2) {
            return;
        }
        this.D.anchor(f, f2);
        this.ab = f;
        this.ac = f2;
        this.n = true;
        b();
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final void setAnimation(Animation animation) {
        IAnimation iAnimation = getIAnimation();
        if (iAnimation != null) {
            iAnimation.setAnimation(animation == null ? null : animation.glAnimation);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarker, com.autonavi.base.amap.mapcore.interfaces.IAnimation
    public final void setAnimationListener(Animation.AnimationListener animationListener) {
        GLAnimation gLAnimation = this.g;
        if (gLAnimation != null) {
            gLAnimation.setAnimationListener(animationListener);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarkerAction
    public final void setAutoOverturnInfoWindow(boolean z) {
        this.E = z;
        this.D.autoOverturnInfoWindow(z);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarker
    public final void setBelowMaskLayer(boolean z) {
        this.K = z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarkerAction
    public final void setClickable(boolean z) {
        this.H = z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarkerAction
    public final void setDisplayLevel(int i2) {
        this.G = i2;
        this.D.displayLevel(i2);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarker
    public final void setDraggable(boolean z) {
        this.ad = z;
        this.D.draggable(z);
        b();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarkerAction
    public final void setFixingPointEnable(boolean z) {
        this.I = z;
        if (!z) {
            boolean z2 = this.ap;
            LatLng position = getPosition();
            this.X = position;
            setPosition(position);
            if (z2) {
                this.ap = true;
                return;
            }
            return;
        }
        if (!this.ap || this.X == null) {
            return;
        }
        FPoint fPointObtain = FPoint.obtain();
        this.af.b().getMapProjection().p20ToScreenPoint(this.v, this.w, fPointObtain);
        this.aq = (int) ((PointF) fPointObtain).x;
        this.ar = (int) ((PointF) fPointObtain).y;
        fPointObtain.recycle();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarker
    public final void setFlat(boolean z) throws RemoteException {
        this.q = z;
        b();
        this.D.setFlat(z);
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final void setGeoPoint(IPoint iPoint) {
        this.ap = false;
        a(((Point) iPoint).x, ((Point) iPoint).y);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarker
    public final void setIcon(BitmapDescriptor bitmapDescriptor) {
        if (bitmapDescriptor != null) {
            try {
                if (this.ai == null) {
                    return;
                }
                synchronized (this) {
                    this.j = false;
                    this.ai.clear();
                    this.ai.add(bitmapDescriptor);
                    this.J = false;
                    this.ak = false;
                    this.l = false;
                    b();
                    this.n = true;
                    this.R = bitmapDescriptor.getWidth();
                    this.S = bitmapDescriptor.getHeight();
                }
            } catch (Throwable th) {
                hn.c(th, "MarkerDelegateImp", "setIcon");
                th.printStackTrace();
            }
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarker
    public final synchronized void setIcons(ArrayList<BitmapDescriptor> arrayList) {
        if (arrayList != null) {
            try {
                if (this.ai != null) {
                    this.j = false;
                    a(arrayList);
                    this.ak = false;
                    this.l = false;
                    this.J = false;
                    b();
                    this.n = true;
                }
            } catch (Throwable th) {
                hn.c(th, "MarkerDelegateImp", "setIcons");
                th.printStackTrace();
            }
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarkerAction
    public final void setInfoWindowEnable(boolean z) {
        this.F = z;
        if (!z) {
            hideInfoWindow();
        }
        this.D.infoWindowEnable(z);
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final void setInfoWindowOffset(int i2, int i3) throws RemoteException {
        this.r = i2;
        this.s = i3;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final void setInfoWindowShown(boolean z) {
        this.m = z;
        this.n = true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarkerAction
    public final void setMarkerOptions(MarkerOptions markerOptions) {
        if (markerOptions == null) {
            return;
        }
        this.D = markerOptions;
        this.X = markerOptions.getPosition();
        IPoint iPointObtain = IPoint.obtain();
        this.aj = this.D.isGps();
        if (this.D.getPosition() != null) {
            if (this.aj) {
                try {
                    double[] dArrA = jw.a(this.D.getPosition().longitude, this.D.getPosition().latitude);
                    this.Y = new LatLng(dArrA[1], dArrA[0]);
                    GLMapState.lonlat2Geo(dArrA[0], dArrA[1], iPointObtain);
                } catch (Throwable th) {
                    hn.c(th, "MarkerDelegateImp", "create");
                    this.Y = this.D.getPosition();
                }
            } else {
                LatLng latLng = this.X;
                GLMapState.lonlat2Geo(latLng.longitude, latLng.latitude, iPointObtain);
            }
        }
        this.v = ((Point) iPointObtain).x;
        this.w = ((Point) iPointObtain).y;
        this.ab = this.D.getAnchorU();
        this.ac = this.D.getAnchorV();
        this.r = this.D.getInfoWindowOffsetX();
        this.s = this.D.getInfoWindowOffsetY();
        this.ao = this.D.getPeriod();
        this.z = this.D.getZIndex();
        this.K = this.D.isBelowMaskLayer();
        calFPoint();
        setIcons(this.D.getIcons());
        this.j = this.D.isRotatingMode();
        this.k = this.D.getAngleOffset();
        this.ae = this.D.isVisible();
        this.aa = this.D.getSnippet();
        this.Z = this.D.getTitle();
        this.ad = this.D.isDraggable();
        this.W = getId();
        this.ah = this.D.isPerspective();
        this.q = this.D.isFlat();
        this.K = this.D.isBelowMaskLayer();
        this.C = this.D.getAlpha();
        setRotateAngle(this.D.getRotateAngle());
        this.G = this.D.getDisplayLevel();
        this.E = this.D.isInfoWindowAutoOverturn();
        this.F = this.D.isInfoWindowEnable();
        this.a = new float[16];
        this.b = new float[4];
        iPointObtain.recycle();
        eb.a().a(this.X, this.Z, this.aa);
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final void setObject(Object obj) {
        this.ag = obj;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final void setOnTap(boolean z) {
        this.L = z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarker
    public final void setPeriod(int i2) {
        if (i2 <= 1) {
            this.ao = 1;
        } else {
            this.ao = i2;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarker
    public final void setPerspective(boolean z) {
        this.ah = z;
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final void setPosition(LatLng latLng) {
        if (latLng == null) {
            hn.c(new AMapException("非法坐标值 latlng is null"), "setPosition", "Marker");
            return;
        }
        this.X = latLng;
        IPoint iPointObtain = IPoint.obtain();
        if (this.aj) {
            try {
                double[] dArrA = jw.a(latLng.longitude, latLng.latitude);
                this.Y = new LatLng(dArrA[1], dArrA[0]);
                GLMapState.lonlat2Geo(dArrA[0], dArrA[1], iPointObtain);
            } catch (Throwable unused) {
                this.Y = latLng;
            }
        } else {
            GLMapState.lonlat2Geo(latLng.longitude, latLng.latitude, iPointObtain);
        }
        this.v = ((Point) iPointObtain).x;
        this.w = ((Point) iPointObtain).y;
        this.ap = false;
        calFPoint();
        b();
        this.n = true;
        iPointObtain.recycle();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarker
    public final void setPositionByPixels(int i2, int i3) {
        this.aq = i2;
        this.ar = i3;
        this.ap = true;
        calFPoint();
        b();
        this.n = true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarkerAction
    public final void setPositionNotUpdate(LatLng latLng) {
        setPosition(latLng);
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final void setRotateAngle(float f) {
        this.D.rotateAngle(f);
        this.p = f;
        this.o = (((-f) % 360.0f) + 360.0f) % 360.0f;
        this.n = true;
        b();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarkerAction
    public final void setRotateAngleNotUpdate(float f) {
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final void setSnippet(String str) {
        this.aa = str;
        b();
        this.D.snippet(str);
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final void setTitle(String str) {
        this.Z = str;
        b();
        this.D.title(str);
        eb.a().a(this.X, this.Z, this.aa);
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final void setVisible(boolean z) {
        if (this.ae == z) {
            return;
        }
        this.D.visible(z);
        this.ae = z;
        if (!z) {
            this.L = false;
            if (isInfoWindowShown()) {
                this.af.b(this);
            }
        }
        b();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final void setZIndex(float f) {
        this.z = f;
        this.D.zIndex(f);
        if (this.L) {
            this.L = false;
            this.af.a();
        }
        this.af.e();
        b();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarker
    public final void showInfoWindow() {
        if (this.ae && isContains() && !isRemoved() && isInfoWindowEnable()) {
            this.af.a((BaseOverlayImp) this);
            b();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMarker, com.autonavi.base.amap.mapcore.interfaces.IAnimation
    public final boolean startAnimation() {
        if (this.g != null) {
            synchronized (this.h) {
                GLAnimation gLAnimation = this.g;
                if (gLAnimation instanceof GLAnimationSet) {
                    GLAnimationSet gLAnimationSet = (GLAnimationSet) gLAnimation;
                    for (GLAnimation gLAnimation2 : gLAnimationSet.getAnimations()) {
                        a(gLAnimation2);
                        gLAnimation2.setDuration(gLAnimationSet.getDuration());
                    }
                } else {
                    a(gLAnimation);
                }
                this.M = false;
                GLAnimation gLAnimation3 = this.g;
                this.f = gLAnimation3;
                this.al = true;
                gLAnimation3.start();
            }
            b();
        }
        return false;
    }

    @Override // com.autonavi.base.amap.mapcore.interfaces.IAnimation
    public final void setAnimation(GLAnimation gLAnimation) {
        if (gLAnimation == null) {
            return;
        }
        this.g = gLAnimation;
    }

    private synchronized void a(ArrayList<BitmapDescriptor> arrayList) {
        BitmapDescriptor bitmapDescriptor;
        a();
        if (arrayList != null) {
            for (BitmapDescriptor bitmapDescriptor2 : arrayList) {
                if (bitmapDescriptor2 != null) {
                    this.ai.add(bitmapDescriptor2);
                }
            }
        }
        if (this.ai.size() == 0) {
            this.ai.add(BitmapDescriptorFactory.defaultMarker());
        }
        if (this.ai.size() > 0 && (bitmapDescriptor = this.ai.get(0)) != null) {
            this.R = bitmapDescriptor.getWidth();
            this.S = bitmapDescriptor.getHeight();
        }
    }

    private void a(double d, double d2) {
        if (this.ap) {
            IPoint iPointObtain = IPoint.obtain();
            this.af.b().getPixel2Geo((int) d, (int) d2, iPointObtain);
            a(((Point) iPointObtain).x, ((Point) iPointObtain).y);
            iPointObtain.recycle();
            this.ap = true;
            return;
        }
        a((int) d, (int) d2);
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final void destroy() {
        destroy(true);
    }

    private void a(int i2, int i3) {
        this.v = i2;
        this.w = i3;
        DPoint dPointObtain = DPoint.obtain();
        GLMapState.geo2LonLat(this.v, this.w, dPointObtain);
        this.X = new LatLng(dPointObtain.y, dPointObtain.x, false);
        u uVar = this.af;
        if (uVar != null && uVar.b() != null) {
            ((PointF) this.x).x = this.v - ((int) this.af.b().getMapConfig().getSX());
            ((PointF) this.x).y = this.w - ((int) this.af.b().getMapConfig().getSY());
        }
        dPointObtain.recycle();
        b();
    }

    private void a(GLAnimation gLAnimation) {
        if (gLAnimation instanceof GLTranslateAnimation) {
            if (this.ap) {
                LatLng position = getPosition();
                this.X = position;
                setPosition(position);
                this.ap = true;
            }
            if (this.ap) {
                GLTranslateAnimation gLTranslateAnimation = (GLTranslateAnimation) gLAnimation;
                gLTranslateAnimation.mFromXDelta = this.aq;
                gLTranslateAnimation.mFromYDelta = this.ar;
                IPoint iPointObtain = IPoint.obtain();
                this.af.b().getLatLng2Pixel(gLTranslateAnimation.mToYDelta, gLTranslateAnimation.mToXDelta, iPointObtain);
                gLTranslateAnimation.mToXDelta = ((Point) iPointObtain).x;
                gLTranslateAnimation.mToYDelta = ((Point) iPointObtain).y;
                iPointObtain.recycle();
                return;
            }
            GLTranslateAnimation gLTranslateAnimation2 = (GLTranslateAnimation) gLAnimation;
            gLTranslateAnimation2.mFromXDelta = this.v;
            gLTranslateAnimation2.mFromYDelta = this.w;
            IPoint iPointObtain2 = IPoint.obtain();
            GLMapState.lonlat2Geo(gLTranslateAnimation2.mToXDelta, gLTranslateAnimation2.mToYDelta, iPointObtain2);
            gLTranslateAnimation2.mToXDelta = ((Point) iPointObtain2).x;
            gLTranslateAnimation2.mToYDelta = ((Point) iPointObtain2).y;
            iPointObtain2.recycle();
        }
    }
}
