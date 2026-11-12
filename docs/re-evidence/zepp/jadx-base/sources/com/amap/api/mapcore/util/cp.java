package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.RemoteException;
import android.view.animation.AnimationUtils;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.GL3DModelOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.animation.Animation;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.animation.GLAnimation;
import com.autonavi.amap.mapcore.animation.GLAnimationSet;
import com.autonavi.amap.mapcore.animation.GLTransformation;
import com.autonavi.amap.mapcore.animation.GLTranslateAnimation;
import com.autonavi.amap.mapcore.interfaces.IglModel;
import com.autonavi.base.ae.gmap.GLMapState;
import com.autonavi.base.amap.api.mapcore.BaseOverlayImp;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.mapcore.FPoint;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cp extends BaseOverlayImp implements IglModel {
    private String H;
    private String I;
    public float[] a;
    public float[] b;
    private String f;
    private p h;
    private BitmapDescriptor i;
    private IAMapDelegate j;
    private int k;
    private int l;
    private LatLng m;
    private GLAnimation n;
    private Bitmap q;
    private df.b r;
    private float s;
    private Object t;
    private n y;
    private int z;
    private boolean e = true;
    private float[] g = new float[16];
    private boolean o = true;
    private boolean p = true;
    private float u = 18.0f;
    private float v = -1.0f;
    private float w = 0.0f;
    private boolean x = false;
    private boolean A = false;
    private boolean B = false;
    private FPoint C = FPoint.obtain();
    public Rect c = new Rect(0, 0, 0, 0);
    private int D = 0;
    private int E = 0;
    private float F = 0.5f;
    private float G = 0.5f;
    public float d = 1.0f;
    private float J = -1.0f;

    public cp(n nVar, GL3DModelOptions gL3DModelOptions, IAMapDelegate iAMapDelegate) {
        this.a = new float[16];
        this.b = new float[16];
        if (gL3DModelOptions == null || iAMapDelegate == null) {
            return;
        }
        this.y = nVar;
        this.j = iAMapDelegate;
        this.i = gL3DModelOptions.getBitmapDescriptor();
        List<Float> textrue = gL3DModelOptions.getTextrue();
        List<Float> vertext = gL3DModelOptions.getVertext();
        this.m = gL3DModelOptions.getLatLng();
        this.s = gL3DModelOptions.getAngle();
        setModelFixedLength(gL3DModelOptions.getModelFixedLength());
        if (this.m != null) {
            IPoint iPointObtain = IPoint.obtain();
            LatLng latLng = this.m;
            GLMapState.lonlat2Geo(latLng.longitude, latLng.latitude, iPointObtain);
            this.k = ((Point) iPointObtain).x;
            this.l = ((Point) iPointObtain).y;
        }
        if (textrue != null && textrue.size() > 0 && vertext != null) {
            if ((vertext.size() > 0) & (this.i != null)) {
                p pVar = new p(vertext, textrue);
                this.h = pVar;
                pVar.a(this.s);
            }
        }
        this.a = new float[16];
        this.b = new float[4];
    }

    public final boolean a() {
        float mapPerPixelUnitLength;
        GLAnimation gLAnimation;
        try {
            if (this.h == null) {
                return true;
            }
            if (this.r == null) {
                this.r = (df.b) this.j.getGLShader(5);
            }
            if (this.v == -1.0f) {
                this.v = this.j.getUnitLengthByZoom((int) this.u);
            }
            if (this.e) {
                Bitmap bitmap = this.i.getBitmap();
                if (bitmap != null) {
                    this.q = bitmap;
                }
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                GLES20.glBindTexture(3553, iArr[0]);
                GLES20.glTexParameterf(3553, 10241, 9728.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
                GLUtils.texImage2D(3553, 0, this.q, 0);
                int i = iArr[0];
                this.z = i;
                this.h.a(i);
                this.e = false;
            }
            if (this.o || (gLAnimation = this.n) == null || gLAnimation.hasEnded()) {
                this.o = true;
            } else {
                IAMapDelegate iAMapDelegate = this.j;
                if (iAMapDelegate != null) {
                    iAMapDelegate.setRunLowFrame(false);
                }
                GLTransformation gLTransformation = new GLTransformation();
                this.n.getTransformation(AnimationUtils.currentAnimationTimeMillis(), gLTransformation);
                if (!Double.isNaN(gLTransformation.x) && !Double.isNaN(gLTransformation.y)) {
                    double d = gLTransformation.x;
                    double d2 = gLTransformation.y;
                    this.k = (int) d;
                    this.l = (int) d2;
                }
            }
            float sx = this.k - ((int) this.j.getMapConfig().getSX());
            ((PointF) this.C).x = sx;
            float sy = this.l - ((int) this.j.getMapConfig().getSY());
            ((PointF) this.C).y = sy;
            Matrix.setIdentityM(this.g, 0);
            Matrix.multiplyMM(this.g, 0, this.j.getProjectionMatrix(), 0, this.j.getViewMatrix(), 0);
            Matrix.translateM(this.g, 0, sx, sy, 0.0f);
            if (this.x) {
                mapPerPixelUnitLength = (this.j.getMapConfig().getMapPerPixelUnitLength() * this.w) / this.h.a();
            } else {
                float mapPerPixelUnitLength2 = this.j.getMapConfig().getMapPerPixelUnitLength();
                if (this.j.getMapConfig().getSZ() >= this.u) {
                    this.J = mapPerPixelUnitLength2;
                    mapPerPixelUnitLength = mapPerPixelUnitLength2 / mapPerPixelUnitLength2;
                } else {
                    mapPerPixelUnitLength = mapPerPixelUnitLength2 / this.v;
                }
            }
            this.d = mapPerPixelUnitLength;
            Matrix.scaleM(this.g, 0, mapPerPixelUnitLength, mapPerPixelUnitLength, mapPerPixelUnitLength);
            this.h.a(this.r, this.g);
            if (!this.B) {
                return true;
            }
            this.j.redrawInfoWindow();
            this.B = false;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final boolean checkInBounds() {
        return this.j.getMapConfig().getGeoRectangle().contains(this.k, this.l);
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final void destroy() {
        Bitmap bitmap = this.q;
        if (bitmap != null) {
            er.c(bitmap);
        }
        n nVar = this.y;
        if (nVar != null) {
            nVar.a(this.z);
        }
        p pVar = this.h;
        if (pVar != null) {
            pVar.c();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final IPoint getAnchor() {
        return null;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final BitmapDescriptor getBitmapDescriptor() {
        return this.i;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final FPoint getGeoPosition() {
        return FPoint.obtain(this.k, this.l);
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final int getHeight() {
        return (int) ((this.h.a() * this.d) / this.j.getMapConfig().getMapPerPixelUnitLength());
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final String getId() {
        return this.f;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final int getInfoWindowOffsetX() {
        return 0;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final int getInfoWindowOffsetY() {
        return 0;
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final Object getObject() {
        return this.t;
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final LatLng getPosition() {
        return this.m;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final int getRealInfoWindowOffsetX() {
        return this.D;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final int getRealInfoWindowOffsetY() {
        return this.E;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final LatLng getRealPosition() {
        return null;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final Rect getRect() {
        try {
            GLMapState mapProjection = this.j.getMapProjection();
            int width = getWidth();
            int height = getHeight();
            FPoint fPointObtain = FPoint.obtain();
            mapProjection.p20ToScreenPoint(this.k, this.l, fPointObtain);
            Matrix.setIdentityM(this.a, 0);
            Matrix.rotateM(this.a, 0, -this.s, 0.0f, 0.0f, 1.0f);
            Matrix.rotateM(this.a, 0, this.j.getMapConfig().getSC(), 1.0f, 0.0f, 0.0f);
            Matrix.rotateM(this.a, 0, this.j.getMapConfig().getSR(), 0.0f, 0.0f, 1.0f);
            float[] fArr = new float[4];
            float[] fArr2 = this.b;
            float f = -width;
            fArr2[0] = this.F * f;
            float f2 = height;
            fArr2[1] = this.G * f2;
            fArr2[2] = 0.0f;
            fArr2[3] = 1.0f;
            Matrix.multiplyMV(fArr, 0, this.a, 0, fArr2, 0);
            Rect rect = this.c;
            float f3 = ((PointF) fPointObtain).x;
            int i = (int) (fArr[0] + f3);
            float f4 = ((PointF) fPointObtain).y;
            rect.set(i, (int) (f4 - fArr[1]), (int) (f3 + fArr[0]), (int) (f4 - fArr[1]));
            float[] fArr3 = this.b;
            float f5 = width;
            fArr3[0] = (1.0f - this.F) * f5;
            fArr3[1] = f2 * this.G;
            fArr3[2] = 0.0f;
            fArr3[3] = 1.0f;
            Matrix.multiplyMV(fArr, 0, this.a, 0, fArr3, 0);
            this.c.union((int) (((PointF) fPointObtain).x + fArr[0]), (int) (((PointF) fPointObtain).y - fArr[1]));
            float[] fArr4 = this.b;
            fArr4[0] = f5 * (1.0f - this.F);
            float f6 = -height;
            fArr4[1] = (1.0f - this.G) * f6;
            fArr4[2] = 0.0f;
            fArr4[3] = 1.0f;
            Matrix.multiplyMV(fArr, 0, this.a, 0, fArr4, 0);
            this.c.union((int) (((PointF) fPointObtain).x + fArr[0]), (int) (((PointF) fPointObtain).y - fArr[1]));
            float[] fArr5 = this.b;
            fArr5[0] = f * this.F;
            fArr5[1] = f6 * (1.0f - this.G);
            fArr5[2] = 0.0f;
            fArr5[3] = 1.0f;
            Matrix.multiplyMV(fArr, 0, this.a, 0, fArr5, 0);
            this.c.union((int) (((PointF) fPointObtain).x + fArr[0]), (int) (((PointF) fPointObtain).y - fArr[1]));
            this.D = this.c.centerX() - ((int) ((PointF) fPointObtain).x);
            this.E = this.c.top - ((int) ((PointF) fPointObtain).y);
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
        return 0.0f;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final IPoint getScreenPosition() {
        return IPoint.obtain(0, 0);
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final String getSnippet() {
        return this.H;
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final String getTitle() {
        return this.I;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final int getWidth() {
        return (int) ((this.h.b() * this.d) / this.j.getMapConfig().getMapPerPixelUnitLength());
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final boolean isContains() {
        return this.y.a(this);
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final boolean isDestory() {
        return false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final boolean isInfoWindowEnable() {
        return true;
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final boolean isViewMode() {
        return false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final boolean isVisible() {
        return this.p;
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final boolean remove() {
        IAMapDelegate iAMapDelegate = this.j;
        if (iAMapDelegate == null) {
            return true;
        }
        iAMapDelegate.removeGLModel(this.f);
        return true;
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final void setAnimation(Animation animation) {
        if (animation == null) {
            return;
        }
        this.n = animation.glAnimation;
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final void setGeoPoint(IPoint iPoint) {
        if (iPoint != null) {
            this.k = ((Point) iPoint).x;
            this.l = ((Point) iPoint).y;
            DPoint dPointObtain = DPoint.obtain();
            GLMapState.geo2LonLat(this.k, this.l, dPointObtain);
            this.m = new LatLng(dPointObtain.y, dPointObtain.x, false);
            dPointObtain.recycle();
        }
        this.j.setRunLowFrame(false);
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final void setInfoWindowOffset(int i, int i2) throws RemoteException {
    }

    @Override // com.autonavi.base.amap.api.mapcore.InfoWindowCalculate
    public final void setInfoWindowShown(boolean z) {
        this.A = z;
        this.B = true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IglModel
    public final void setModelFixedLength(int i) {
        if (i > 0) {
            this.w = i;
            this.x = true;
        } else {
            this.w = 0.0f;
            this.x = false;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final void setObject(Object obj) {
        this.t = obj;
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final void setPosition(LatLng latLng) {
        if (latLng != null) {
            this.m = latLng;
            IPoint iPointObtain = IPoint.obtain();
            GLMapState.lonlat2Geo(latLng.longitude, latLng.latitude, iPointObtain);
            this.k = ((Point) iPointObtain).x;
            this.l = ((Point) iPointObtain).y;
            iPointObtain.recycle();
        }
        this.B = true;
        this.j.setRunLowFrame(false);
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final void setRotateAngle(float f) {
        this.s = f;
        if (this.h != null) {
            this.h.a(this.s - this.j.getMapConfig().getSR());
        }
        this.B = true;
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final void setSnippet(String str) {
        this.H = str;
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final void setTitle(String str) {
        this.I = str;
    }

    @Override // com.autonavi.base.amap.api.mapcore.BaseOverlayImp, com.autonavi.amap.mapcore.interfaces.IglModel
    public final void setVisible(boolean z) {
        this.p = z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IglModel
    public final void setZoomLimit(float f) {
        this.u = f;
        this.v = this.j.getUnitLengthByZoom((int) f);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IglModel
    public final void showInfoWindow() {
        try {
            this.j.showInfoWindow(this);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IglModel
    public final boolean startAnimation() {
        GLAnimation gLAnimation = this.n;
        if (gLAnimation != null) {
            if (gLAnimation instanceof GLAnimationSet) {
                GLAnimationSet gLAnimationSet = (GLAnimationSet) gLAnimation;
                for (GLAnimation gLAnimation2 : gLAnimationSet.getAnimations()) {
                    a(gLAnimation2);
                    gLAnimation2.setDuration(gLAnimationSet.getDuration());
                }
            } else {
                a(gLAnimation);
            }
            this.o = false;
            this.n.start();
        }
        return false;
    }

    private void a(GLAnimation gLAnimation) {
        if (gLAnimation instanceof GLTranslateAnimation) {
            GLTranslateAnimation gLTranslateAnimation = (GLTranslateAnimation) gLAnimation;
            gLTranslateAnimation.mFromXDelta = this.k;
            gLTranslateAnimation.mFromYDelta = this.l;
            IPoint iPointObtain = IPoint.obtain();
            GLMapState.lonlat2Geo(gLTranslateAnimation.mToXDelta, gLTranslateAnimation.mToYDelta, iPointObtain);
            gLTranslateAnimation.mToXDelta = ((Point) iPointObtain).x;
            gLTranslateAnimation.mToYDelta = ((Point) iPointObtain).y;
            iPointObtain.recycle();
        }
    }

    public final void a(String str) {
        this.f = str;
    }
}
