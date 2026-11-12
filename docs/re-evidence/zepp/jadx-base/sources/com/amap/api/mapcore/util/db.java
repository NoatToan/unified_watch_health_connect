package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.amap.api.maps.model.BasePointOverlay;
import com.amap.api.maps.model.GL3DModel;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.animation.Animation;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.animation.GLAnimation;
import com.autonavi.amap.mapcore.animation.GLTransformation;
import com.autonavi.amap.mapcore.interfaces.IInfoWindowManager;
import com.autonavi.amap.mapcore.interfaces.IMarker;
import com.autonavi.amap.mapcore.interfaces.IMarkerAction;
import com.autonavi.amap.mapcore.interfaces.IOverlay;
import com.autonavi.base.ae.gmap.GLMapState;
import com.autonavi.base.amap.api.mapcore.BaseOverlayImp;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction;
import com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate;
import com.autonavi.base.amap.mapcore.FPoint;
import com.autonavi.base.amap.mapcore.MapConfig;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class db implements IInfoWindowManager, IInfoWindowAction, IOverlayDelegate {
    private GLAnimation H;
    private GLAnimation I;
    public IAMapDelegate a;
    public a c;
    public ap f;
    private Context g;
    private BaseOverlayImp h;
    private FPoint n;
    private FloatBuffer r;
    private boolean u;
    private Bitmap v;
    private Bitmap w;
    private int z;
    private boolean i = false;
    private int j = 0;
    private int k = 0;
    private int l = 0;
    private int m = 0;
    private FloatBuffer o = null;
    private boolean q = true;
    private float s = 0.5f;
    private float t = 1.0f;
    private Rect x = new Rect();
    private float y = 0.0f;
    private boolean A = true;
    private Bitmap B = null;
    private Bitmap C = null;
    private Bitmap D = null;
    private Bitmap E = null;
    private boolean F = false;
    private boolean G = false;
    public float[] b = new float[12];
    public float[] d = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public long e = 0;
    private boolean J = false;
    private boolean K = true;
    private String p = getId();

    public static class a extends de {
        public int a;
        public int b;
        public int c;

        public a(String str) {
            if (a(str)) {
                this.a = c("aMVP");
                this.b = b("aVertex");
                this.c = b("aTextureCoord");
            }
        }
    }

    public db(IAMapDelegate iAMapDelegate, Context context) {
        this.a = null;
        this.g = context;
        this.a = iAMapDelegate;
    }

    public static /* synthetic */ boolean b(db dbVar) {
        dbVar.J = true;
        return true;
    }

    private synchronized void c(Bitmap bitmap) {
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                b(this.C);
                this.C = bitmap;
            }
        }
    }

    private synchronized void d(Bitmap bitmap) {
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                b(this.D);
                this.D = bitmap;
            }
        }
    }

    private synchronized void e(Bitmap bitmap) {
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                b(this.E);
                this.E = bitmap;
            }
        }
    }

    private synchronized void f(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    Bitmap bitmap2 = this.v;
                    if (bitmap2 == null || bitmap2.hashCode() != bitmap.hashCode()) {
                        Bitmap bitmap3 = this.v;
                        if (bitmap3 != null) {
                            Bitmap bitmap4 = this.B;
                            if (bitmap4 == null && this.C == null && this.D == null && this.E == null) {
                                b(this.w);
                                this.w = this.v;
                            } else {
                                boolean z = true;
                                if ((bitmap4 == null || bitmap3.hashCode() != this.B.hashCode()) && ((this.D == null || bitmap3.hashCode() != this.D.hashCode()) && ((this.C == null || bitmap3.hashCode() != this.C.hashCode()) && (this.E == null || bitmap3.hashCode() != this.E.hashCode())))) {
                                    z = false;
                                }
                                if (!z) {
                                    b(this.w);
                                    this.w = this.v;
                                }
                            }
                        }
                        this.G = false;
                        this.v = bitmap;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean calMapFPoint() throws RemoteException {
        return false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean checkInBounds() {
        return true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void destroy() {
        if (this.i) {
            try {
                remove();
                f();
                FloatBuffer floatBuffer = this.r;
                if (floatBuffer != null) {
                    floatBuffer.clear();
                    this.r = null;
                }
                FloatBuffer floatBuffer2 = this.o;
                if (floatBuffer2 != null) {
                    floatBuffer2.clear();
                    this.o = null;
                }
                this.n = null;
                this.z = 0;
            } catch (Throwable th) {
                hn.c(th, "PopupOverlay", "realDestroy");
                th.printStackTrace();
            }
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final void draw(MapConfig mapConfig) throws RemoteException {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean equalsRemote(IOverlay iOverlay) throws RemoteException {
        return equals(iOverlay) || iOverlay.getId().equals(getId());
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final String getId() {
        if (this.p == null) {
            this.p = "PopupOverlay";
        }
        return this.p;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final float getZIndex() {
        return 0.0f;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final int hashCodeRemote() {
        return super.hashCode();
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final synchronized void hideInfoWindow() {
        setVisible(false);
        f();
        this.F = false;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean isAboveMaskLayer() {
        return false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean isDrawFinish() {
        return false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final boolean isInfoWindowShown() {
        return false;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean isVisible() {
        return this.q;
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final boolean onInfoWindowTap(MotionEvent motionEvent) {
        return this.q && this.h != null && this.F && er.a(this.x, (int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void redrawInfoWindow() {
        try {
            synchronized (this) {
                BaseOverlayImp baseOverlayImp = this.h;
                if (baseOverlayImp != null && baseOverlayImp.checkInBounds()) {
                    boolean z = true;
                    setVisible(true);
                    Rect rect = this.h.getRect();
                    int realInfoWindowOffsetX = this.h.getRealInfoWindowOffsetX() + this.h.getInfoWindowOffsetX();
                    int realInfoWindowOffsetY = this.h.getRealInfoWindowOffsetY() + this.h.getInfoWindowOffsetY() + 2;
                    BaseOverlayImp baseOverlayImp2 = this.h;
                    if (!(baseOverlayImp2 instanceof cs)) {
                        if (this.J) {
                            if (this.v != null) {
                                return;
                            }
                            if (this.B == null && this.D == null) {
                                return;
                            }
                        }
                        if (!baseOverlayImp2.isInfoWindowEnable()) {
                            setVisible(false);
                            return;
                        }
                        setVisible(true);
                        this.n = this.h.getGeoPosition();
                        b(realInfoWindowOffsetX, realInfoWindowOffsetY);
                        e();
                        return;
                    }
                    synchronized (this) {
                        if (!this.J || (this.v == null && !(this.B == null && this.D == null))) {
                            IMarkerAction iMarkerAction = ((cs) this.h).getIMarkerAction();
                            if (iMarkerAction != null && !iMarkerAction.isInfoWindowEnable()) {
                                setVisible(false);
                                return;
                            }
                            setVisible(true);
                            if (iMarkerAction == null || !iMarkerAction.isInfoWindowAutoOverturn()) {
                                this.n = this.h.getGeoPosition();
                                b(realInfoWindowOffsetX, realInfoWindowOffsetY);
                                e();
                            } else {
                                Rect rect2 = this.x;
                                int i = rect2.left;
                                int i2 = rect2.top;
                                int i3 = rect2.right;
                                Bitmap bitmap = this.B;
                                Rect rect3 = new Rect(i, i2, i3, ((bitmap == null || bitmap.isRecycled()) ? 0 : this.B.getHeight()) + i2);
                                Rect rect4 = this.x;
                                int i4 = rect4.left;
                                int i5 = rect4.top;
                                int i6 = rect4.right;
                                Bitmap bitmap2 = this.D;
                                Rect rect5 = new Rect(i4, i5, i6, ((bitmap2 == null || bitmap2.isRecycled()) ? 0 : this.D.getHeight()) + i5);
                                if (this.A) {
                                    rect5.offset(0, rect.height() + rect3.height() + 2);
                                } else {
                                    rect3.offset(0, -(rect.height() + rect3.height() + 2));
                                }
                                int iCheckMarkerInRect = this.a.checkMarkerInRect(iMarkerAction, rect3);
                                int iCheckMarkerInRect2 = this.a.checkMarkerInRect(iMarkerAction, rect5);
                                if (iCheckMarkerInRect <= 0 || (iCheckMarkerInRect2 != 0 && (iCheckMarkerInRect2 <= 0 || iCheckMarkerInRect >= iCheckMarkerInRect2))) {
                                    z = false;
                                }
                                if (z) {
                                    realInfoWindowOffsetY = this.h.getRealInfoWindowOffsetY() + this.h.getInfoWindowOffsetY() + 2 + rect.height() + rect5.height();
                                    if (!this.A || this.v == null) {
                                        f(b());
                                    } else {
                                        b(false);
                                    }
                                    this.A = false;
                                } else {
                                    e();
                                }
                                this.n = this.h.getGeoPosition();
                                b(realInfoWindowOffsetX, realInfoWindowOffsetY);
                            }
                        }
                        return;
                    }
                }
                setVisible(false);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void remove() throws RemoteException {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setAboveMaskLayer(boolean z) {
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final void setInfoWindowAdapterManager(ap apVar) {
        synchronized (this) {
            this.f = apVar;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IInfoWindowManager
    public final void setInfoWindowAnimation(Animation animation, Animation.AnimationListener animationListener) {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IInfoWindowManager
    public final void setInfoWindowAppearAnimation(Animation animation) {
        GLAnimation gLAnimation = this.I;
        if (gLAnimation == null || !gLAnimation.equals(animation.glAnimation)) {
            this.H = animation.glAnimation;
            return;
        }
        try {
            this.H = animation.glAnimation.mo3294clone();
        } catch (Throwable th) {
            hn.c(th, "PopupOverlay", "setInfoWindowDisappearAnimation");
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IInfoWindowManager
    public final void setInfoWindowBackColor(int i) {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IInfoWindowManager
    public final void setInfoWindowBackEnable(boolean z) {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IInfoWindowManager
    public final void setInfoWindowBackScale(float f, float f2) {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IInfoWindowManager
    public final void setInfoWindowDisappearAnimation(Animation animation) {
        GLAnimation gLAnimation = this.H;
        if (gLAnimation == null || !gLAnimation.equals(animation.glAnimation)) {
            this.I = animation.glAnimation;
            return;
        }
        try {
            this.I = animation.glAnimation.mo3294clone();
        } catch (Throwable th) {
            hn.c(th, "PopupOverlay", "setInfoWindowDisappearAnimation");
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IInfoWindowManager
    public final void setInfoWindowMovingAnimation(Animation animation) {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setVisible(boolean z) {
        if (!this.q && z) {
            this.u = true;
        }
        this.q = z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setZIndex(float f) {
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final synchronized void showInfoWindow(BasePointOverlay basePointOverlay) throws RemoteException {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IInfoWindowManager
    public final void startAnimation() {
    }

    private synchronized void b(Bitmap bitmap) {
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                er.c(bitmap);
            }
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.infowindow.IInfoWindowAction
    public final synchronized void showInfoWindow(BaseOverlayImp baseOverlayImp) throws RemoteException {
        View viewB;
        View viewB2;
        if (baseOverlayImp == null) {
            return;
        }
        if (baseOverlayImp.isInfoWindowEnable()) {
            BaseOverlayImp baseOverlayImp2 = this.h;
            if (baseOverlayImp2 != null && !baseOverlayImp2.getId().equals(baseOverlayImp.getId())) {
                hideInfoWindow();
            }
            if (this.f != null) {
                this.h = baseOverlayImp;
                baseOverlayImp.setInfoWindowShown(true);
                setVisible(true);
                try {
                    Object obj = this.h;
                    if (obj instanceof cs) {
                        Marker marker = new Marker((IMarker) obj);
                        ap apVar = this.f;
                        if (apVar != null) {
                            Bitmap bitmapA = a(apVar.a((BasePointOverlay) marker));
                            if (bitmapA == null && (viewB2 = this.f.b((BasePointOverlay) marker)) != null) {
                                if (viewB2.getBackground() == null) {
                                    viewB2.setBackground(this.f.d());
                                }
                                bitmapA = a(viewB2);
                            }
                            a(bitmapA);
                            c(a(this.f.a(marker)));
                            d(a(this.f.b(marker)));
                            e(a(this.f.c(marker)));
                        }
                    } else if (this.f != null) {
                        GL3DModel gL3DModel = new GL3DModel((cp) obj);
                        Bitmap bitmapA2 = a(this.f.a((BasePointOverlay) gL3DModel));
                        if (bitmapA2 == null && (viewB = this.f.b(gL3DModel)) != null) {
                            if (viewB.getBackground() == null) {
                                viewB.setBackground(this.f.d());
                            }
                            bitmapA2 = a(viewB);
                        }
                        a(bitmapA2);
                    }
                } catch (Throwable th) {
                    hn.c(th, "PopupOverlay", "getInfoWindow");
                    th.printStackTrace();
                    ex.c(ew.d, "image infowindow update failed " + th.getMessage());
                }
            }
            this.F = true;
        }
    }

    private synchronized void a(Bitmap bitmap) {
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                this.B = bitmap;
            }
        }
    }

    private synchronized Bitmap b() {
        return this.D;
    }

    private int c() {
        try {
            synchronized (this) {
                Bitmap bitmap = this.v;
                if (bitmap == null || bitmap.isRecycled()) {
                    return 0;
                }
                return this.v.getWidth();
            }
        } catch (Throwable unused) {
            return 0;
        }
    }

    private int d() {
        try {
            Bitmap bitmap = this.v;
            if (bitmap == null || bitmap.isRecycled()) {
                return 0;
            }
            return this.v.getHeight();
        } catch (Throwable unused) {
            return 0;
        }
    }

    private void e() {
        if (!this.A && this.v != null) {
            b(true);
        } else {
            f(a());
        }
        this.A = true;
    }

    private synchronized Bitmap a() {
        return this.B;
    }

    private void b(int i, int i2) throws RemoteException {
        if (this.J) {
            this.l = i;
            this.m = i2;
        } else {
            this.j = i;
            this.k = i2;
            this.l = i;
            this.m = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x022a  */
    public final boolean a(int i, int i2) {
        long j;
        boolean z;
        boolean z2;
        GLAnimation gLAnimation;
        long jC;
        if (!this.q || this.n == null || this.v == null) {
            return true;
        }
        synchronized (this) {
            j = 100;
            if (this.f != null) {
                Object obj = this.h;
                if (obj instanceof cs) {
                    jC = this.f.c((BasePointOverlay) new Marker((IMarker) obj));
                } else {
                    jC = this.f.c(new GL3DModel((cp) obj));
                }
                if (jC <= 0) {
                    j = Long.MAX_VALUE;
                } else if (jC > 100) {
                    j = jC;
                }
            } else {
                j = 0;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.e;
        if (jCurrentTimeMillis - j2 > j) {
            if (j2 != 0) {
                try {
                    showInfoWindow(this.h);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
            this.e = jCurrentTimeMillis;
        }
        this.v.isRecycled();
        boolean z3 = false;
        if (!this.G && !this.v.isRecycled()) {
            try {
                int i3 = this.z;
                if (i3 != 0) {
                    GLES20.glDeleteTextures(1, new int[]{i3}, 0);
                } else {
                    int[] iArr = {0};
                    GLES20.glGenTextures(1, iArr, 0);
                    this.z = iArr[0];
                }
                synchronized (this) {
                    Bitmap bitmap = this.v;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        er.a(this.z, this.v, false);
                        this.G = true;
                    }
                }
            } catch (Throwable th) {
                hn.c(th, "PopupOverlay", "drawMarker");
                th.printStackTrace();
                z = false;
            }
        }
        z = true;
        if (!this.K && (gLAnimation = this.I) != null && !gLAnimation.hasEnded()) {
            this.J = true;
            GLTransformation gLTransformation = new GLTransformation();
            this.I.getTransformation(AnimationUtils.currentAnimationTimeMillis(), gLTransformation);
            if (!Double.isNaN(gLTransformation.scaleX) && !Double.isNaN(gLTransformation.scaleY)) {
                this.y = (float) gLTransformation.scaleX;
            }
        } else {
            GLAnimation gLAnimation2 = this.H;
            if (gLAnimation2 != null && !gLAnimation2.hasEnded()) {
                this.K = false;
                this.J = true;
                this.j = this.l;
                this.k = this.m;
                GLTransformation gLTransformation2 = new GLTransformation();
                this.H.getTransformation(AnimationUtils.currentAnimationTimeMillis(), gLTransformation2);
                if (!Double.isNaN(gLTransformation2.scaleX) && !Double.isNaN(gLTransformation2.scaleY)) {
                    this.y = (float) gLTransformation2.scaleX;
                }
            } else {
                this.y = 1.0f;
                this.J = false;
            }
        }
        GLMapState mapProjection = this.a.getMapProjection();
        if (this.n == null || mapProjection == null) {
            z3 = false;
        } else {
            IPoint iPointObtain = IPoint.obtain();
            if (this.a.getMapConfig() != null) {
                FPoint fPointObtain = FPoint.obtain();
                FPoint fPoint = this.n;
                mapProjection.p20ToScreenPoint((int) ((PointF) fPoint).x, (int) ((PointF) fPoint).y, fPointObtain);
                ((Point) iPointObtain).x = (int) ((PointF) fPointObtain).x;
                ((Point) iPointObtain).y = (int) ((PointF) fPointObtain).y;
                fPointObtain.recycle();
            }
            int iC = c();
            int iD = d();
            int i4 = (int) ((((Point) iPointObtain).x + this.j) - (iC * this.s));
            int i5 = (int) (((Point) iPointObtain).y + this.k + (iD * (1.0f - this.t)));
            iPointObtain.recycle();
            if (i4 - iC > i || i4 < (-iC) * 2 || i5 < (-iD) * 2 || i5 - iD > i2) {
                z3 = false;
            } else {
                Bitmap bitmap2 = this.v;
                if (bitmap2 != null) {
                    int width = bitmap2.getWidth();
                    int height = this.v.getHeight();
                    if (this.r == null) {
                        this.r = er.a(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f});
                    }
                    int i6 = (int) (((double) (1.0f - this.y)) * 0.5d * ((double) width));
                    float[] fArr = this.b;
                    int i7 = i4 + i6;
                    float f = i7;
                    fArr[0] = f;
                    Rect rect = this.x;
                    rect.left = i7;
                    int i8 = i2 - i5;
                    float f2 = i8;
                    fArr[1] = f2;
                    fArr[2] = 0.0f;
                    int i9 = i4 + width;
                    float f3 = i9 - i6;
                    fArr[3] = f3;
                    fArr[4] = f2;
                    rect.top = i5 - height;
                    fArr[5] = 0.0f;
                    fArr[6] = f3;
                    rect.right = i9;
                    float f4 = i8 + height;
                    fArr[7] = f4;
                    rect.bottom = i5;
                    fArr[8] = 0.0f;
                    fArr[9] = f;
                    fArr[10] = f4;
                    fArr[11] = 0.0f;
                    FloatBuffer floatBuffer = this.o;
                    if (floatBuffer == null) {
                        this.o = er.a(fArr);
                    } else {
                        this.o = er.a(fArr, floatBuffer);
                    }
                    z3 = true;
                }
            }
        }
        if (z3) {
            Matrix.setIdentityM(this.d, 0);
            Matrix.orthoM(this.d, 0, 0.0f, i, 0.0f, i2, 1.0f, -1.0f);
            int i10 = this.z;
            FloatBuffer floatBuffer2 = this.o;
            FloatBuffer floatBuffer3 = this.r;
            if (floatBuffer2 == null || floatBuffer3 == null || i10 == 0) {
                z2 = false;
            } else {
                if (this.c == null) {
                    this.c = new a("texture.glsl");
                }
                GLES20.glUseProgram(this.c.d);
                GLES20.glEnable(3042);
                GLES20.glBlendFunc(1, 771);
                GLES20.glBlendColor(1.0f, 1.0f, 1.0f, 1.0f);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, i10);
                GLES20.glEnableVertexAttribArray(this.c.b);
                GLES20.glVertexAttribPointer(this.c.b, 3, 5126, false, 12, (Buffer) floatBuffer2);
                GLES20.glEnableVertexAttribArray(this.c.c);
                GLES20.glVertexAttribPointer(this.c.c, 2, 5126, false, 8, (Buffer) floatBuffer3);
                z2 = false;
                GLES20.glUniformMatrix4fv(this.c.a, 1, false, this.d, 0);
                GLES20.glDrawArrays(6, 0, 4);
                GLES20.glDisableVertexAttribArray(this.c.b);
                GLES20.glDisableVertexAttribArray(this.c.c);
                GLES20.glBindTexture(3553, 0);
                GLES20.glUseProgram(0);
                GLES20.glDisable(3042);
            }
            if (this.u) {
                this.u = z2;
            }
        }
        return z;
    }

    private void b(final boolean z) {
        GLAnimation gLAnimation = this.I;
        if (gLAnimation != null) {
            this.K = false;
            this.J = true;
            gLAnimation.startNow();
            this.I.setAnimationListener(new Animation.AnimationListener() { // from class: com.amap.api.mapcore.util.db.1
                @Override // com.amap.api.maps.model.animation.Animation.AnimationListener
                public final void onAnimationEnd() {
                    if (db.this.H != null) {
                        db.b(db.this);
                        db.this.H.startNow();
                        db.this.a(z);
                    }
                }

                @Override // com.amap.api.maps.model.animation.Animation.AnimationListener
                public final void onAnimationStart() {
                }
            });
            return;
        }
        GLAnimation gLAnimation2 = this.H;
        if (gLAnimation2 != null) {
            this.J = true;
            gLAnimation2.startNow();
        }
        a(z);
    }

    private synchronized void f() {
        Bitmap bitmap = this.v;
        if (bitmap != null && bitmap != null) {
            er.c(bitmap);
            this.v = null;
        }
        Bitmap bitmap2 = this.w;
        if (bitmap2 != null && !bitmap2.isRecycled()) {
            er.c(this.w);
            this.w = null;
        }
        Bitmap bitmap3 = this.B;
        if (bitmap3 != null && !bitmap3.isRecycled()) {
            er.c(this.B);
            this.B = null;
        }
        Bitmap bitmap4 = this.C;
        if (bitmap4 != null && !bitmap4.isRecycled()) {
            er.c(this.C);
            this.C = null;
        }
        Bitmap bitmap5 = this.D;
        if (bitmap5 != null && !bitmap5.isRecycled()) {
            er.c(this.D);
            this.D = null;
        }
        Bitmap bitmap6 = this.E;
        if (bitmap6 != null && !bitmap6.isRecycled()) {
            er.c(this.E);
            this.E = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (z) {
            f(a());
        } else {
            f(b());
        }
    }

    private Bitmap a(View view) {
        if (view == null) {
            return null;
        }
        if ((view instanceof RelativeLayout) && this.g != null) {
            LinearLayout linearLayout = new LinearLayout(this.g);
            linearLayout.setOrientation(1);
            linearLayout.addView(view);
            view = linearLayout;
        }
        view.setDrawingCacheEnabled(true);
        view.setDrawingCacheQuality(0);
        return er.a(view);
    }
}
