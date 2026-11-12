package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.TextOptions;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.interfaces.IMarkerAction;
import com.autonavi.amap.mapcore.interfaces.IOverlayImage;
import com.autonavi.base.ae.gmap.GLMapState;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.api.mapcore.overlays.ITextDelegate;
import com.autonavi.base.amap.mapcore.FPoint;
import com.autonavi.base.amap.mapcore.Rectangle;
import com.autonavi.base.amap.mapcore.interfaces.IAnimation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dc implements ITextDelegate {
    private static int a;
    private int A;
    private int g;
    private BitmapDescriptor h;
    private int i;
    private int j;
    private String k;
    private LatLng l;
    private boolean o;
    private u p;
    private Object q;
    private String r;
    private int s;
    private int t;
    private int u;
    private Typeface v;
    private float w;
    private int z;
    private float b = 0.0f;
    private float c = 0.0f;
    private int d = 4;
    private int e = 32;
    private FPoint f = FPoint.obtain();
    private float m = 0.5f;
    private float n = 1.0f;
    private Rect x = new Rect();
    private Paint y = new Paint();
    private boolean B = false;
    private List<w> C = new ArrayList();
    private boolean D = false;
    private boolean E = false;
    private float[] F = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    public dc(TextOptions textOptions, u uVar) throws RemoteException {
        this.o = true;
        this.p = uVar;
        if (textOptions.getPosition() != null) {
            this.l = textOptions.getPosition();
        }
        setAlign(textOptions.getAlignX(), textOptions.getAlignY());
        this.o = textOptions.isVisible();
        this.r = textOptions.getText();
        this.s = textOptions.getBackgroundColor();
        this.t = textOptions.getFontColor();
        this.u = textOptions.getFontSize();
        this.q = textOptions.getObject();
        this.w = textOptions.getZIndex();
        this.v = textOptions.getTypeface();
        this.k = getId();
        setRotateAngle(textOptions.getRotate());
        a();
        calFPoint();
    }

    private void a() {
        String str = this.r;
        if (str == null || str.trim().length() <= 0) {
            return;
        }
        try {
            this.y.setTypeface(this.v);
            this.y.setSubpixelText(true);
            this.y.setAntiAlias(true);
            this.y.setStrokeWidth(5.0f);
            this.y.setStrokeCap(Paint.Cap.ROUND);
            this.y.setTextSize(this.u);
            this.y.setTextAlign(Paint.Align.CENTER);
            this.y.setColor(this.t);
            Paint.FontMetrics fontMetrics = this.y.getFontMetrics();
            int i = (int) (fontMetrics.descent - fontMetrics.ascent);
            int i2 = (int) (((i - fontMetrics.bottom) - fontMetrics.top) / 2.0f);
            Paint paint = this.y;
            String str2 = this.r;
            paint.getTextBounds(str2, 0, str2.length(), this.x);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.x.width() + 6, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawColor(this.s);
            canvas.drawText(this.r, this.x.centerX() + 3, i2, this.y);
            BitmapDescriptor bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(bitmapCreateBitmap);
            this.h = bitmapDescriptorFromBitmap;
            this.i = bitmapDescriptorFromBitmap.getWidth();
            this.j = this.h.getHeight();
        } catch (Throwable th) {
            hn.c(th, "TextDelegateImp", "initBitmap");
        }
    }

    private void b() {
        if (this.p.b() != null) {
            this.p.b().setRunLowFrame(false);
        }
    }

    private synchronized void c() {
        a();
        this.E = false;
        b();
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final boolean calFPoint() {
        if (this.l == null) {
            return false;
        }
        IPoint iPointObtain = IPoint.obtain();
        LatLng latLng = this.l;
        GLMapState.lonlat2Geo(latLng.longitude, latLng.latitude, iPointObtain);
        this.z = ((Point) iPointObtain).x;
        this.A = ((Point) iPointObtain).y;
        IAMapDelegate iAMapDelegateB = this.p.b();
        LatLng latLng2 = this.l;
        iAMapDelegateB.getLatLng2Map(latLng2.latitude, latLng2.longitude, this.f);
        iPointObtain.recycle();
        return true;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final boolean checkInBounds() {
        Rectangle geoRectangle = this.p.b().getMapConfig().getGeoRectangle();
        return geoRectangle != null && geoRectangle.contains(this.z, this.A);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final void destroy(boolean z) {
        u uVar;
        try {
            this.D = true;
            if (z) {
                remove();
            }
            List<w> list = this.C;
            if (list != null && list.size() > 0) {
                for (int i = 0; i < this.C.size(); i++) {
                    w wVar = this.C.get(i);
                    if (wVar != null && (uVar = this.p) != null) {
                        uVar.a(wVar);
                        if (this.p.b() != null) {
                            this.p.b().removeTextureItem(wVar.q());
                        }
                    }
                }
                this.C.clear();
            }
            BitmapDescriptor bitmapDescriptor = this.h;
            if (bitmapDescriptor != null) {
                bitmapDescriptor.recycle();
                this.h = null;
            }
            this.l = null;
            this.q = null;
        } catch (Throwable th) {
            hn.c(th, "TextDelegateImp", "destroy");
            th.printStackTrace();
            Log.d("destroy erro", "TextDelegateImp destroy");
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final void drawMarker(IAMapDelegate iAMapDelegate) {
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final void drawMarker(IAMapDelegate iAMapDelegate, float[] fArr, int i, float f) {
        if (!this.o || this.D || this.l == null || this.h == null) {
            return;
        }
        ((PointF) this.f).x = this.z - ((int) iAMapDelegate.getMapConfig().getSX());
        ((PointF) this.f).y = this.A - ((int) iAMapDelegate.getMapConfig().getSY());
        try {
            float f2 = this.i * f;
            float f3 = f * this.j;
            FPoint fPoint = this.f;
            float f4 = ((PointF) fPoint).x;
            float f5 = ((PointF) fPoint).y;
            float sc = iAMapDelegate.getMapConfig().getSC();
            float[] fArr2 = this.F;
            float f6 = this.m;
            fArr2[0] = f4 - (f2 * f6);
            float f7 = this.n;
            fArr2[1] = ((1.0f - f7) * f3) + f5;
            fArr2[2] = f4;
            fArr2[3] = f5;
            float f8 = this.b;
            fArr2[6] = f8;
            fArr2[7] = sc;
            fArr2[9] = ((1.0f - f6) * f2) + f4;
            fArr2[10] = ((1.0f - f7) * f3) + f5;
            fArr2[11] = f4;
            fArr2[12] = f5;
            fArr2[15] = f8;
            fArr2[16] = sc;
            fArr2[18] = ((1.0f - f6) * f2) + f4;
            fArr2[19] = f5 - (f3 * f7);
            fArr2[20] = f4;
            fArr2[21] = f5;
            fArr2[24] = f8;
            fArr2[25] = sc;
            fArr2[27] = f4 - (f2 * f6);
            fArr2[28] = f5 - (f3 * f7);
            fArr2[29] = f4;
            fArr2[30] = f5;
            fArr2[33] = f8;
            fArr2[34] = sc;
            System.arraycopy(fArr2, 0, fArr, i, fArr2.length);
        } catch (Throwable th) {
            hn.c(th, "TextDelegateImp", "drawMarker");
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final boolean equalsRemote(IOverlayImage iOverlayImage) throws RemoteException {
        return equals(iOverlayImage) || iOverlayImage.getId().equals(getId());
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IText
    public final int getAlignX() throws RemoteException {
        return this.d;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IText
    public final int getAlignY() {
        return this.e;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final float getAnchorU() {
        return this.m;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final float getAnchorV() {
        return this.n;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IText
    public final int getBackgroundColor() throws RemoteException {
        return this.s;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IText
    public final int getFontColor() throws RemoteException {
        return this.t;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IText
    public final int getFontSize() throws RemoteException {
        return this.u;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final IAnimation getIAnimation() {
        return null;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final IMarkerAction getIMarkerAction() {
        return null;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final String getId() {
        if (this.k == null) {
            a++;
            this.k = "Text" + a;
        }
        return this.k;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final Object getObject() {
        return this.q;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final LatLng getPosition() {
        return this.l;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final Rect getRect() {
        return null;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final float getRotateAngle() {
        return this.c;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IText
    public final String getText() throws RemoteException {
        return this.r;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final int getTextureId() {
        try {
            return this.g;
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IText
    public final Typeface getTypeface() throws RemoteException {
        return this.v;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final float getZIndex() {
        return this.w;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final int hashCodeRemote() {
        return super.hashCode();
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final boolean isAllowLow() {
        return true;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final boolean isBelowMaskLayer() {
        return false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final boolean isInfoWindowShown() {
        return false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final boolean isOnTap() {
        return this.B;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final boolean isVisible() {
        return this.o;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final void loadTexture(IAMapDelegate iAMapDelegate) {
        Bitmap bitmap;
        u uVar;
        if (this.E) {
            return;
        }
        try {
            int iL = 0;
            boolean z = Build.VERSION.SDK_INT >= 12;
            BitmapDescriptor bitmapDescriptor = this.h;
            List<w> list = this.C;
            if (list != null) {
                for (w wVar : list) {
                    if (wVar != null && (uVar = this.p) != null) {
                        uVar.a(wVar);
                    }
                }
                this.C.clear();
            }
            w wVar2 = null;
            if (!z || (wVar2 = this.p.b().getTextureItem(bitmapDescriptor)) == null) {
                if (wVar2 == null) {
                    wVar2 = new w(bitmapDescriptor, 0);
                }
                if (bitmapDescriptor != null && (bitmap = bitmapDescriptor.getBitmap()) != null && !bitmap.isRecycled()) {
                    int[] iArr = {0};
                    GLES20.glGenTextures(1, iArr, 0);
                    iL = iArr[0];
                    wVar2.a(iL);
                    if (z) {
                        this.p.b().addTextureItem(wVar2);
                    }
                    a(wVar2);
                    er.a(iL, bitmap, true);
                }
            } else {
                iL = wVar2.l();
                a(wVar2);
            }
            this.g = iL;
            this.E = true;
        } catch (Throwable th) {
            hn.c(th, "TextDelegateImp", "loadtexture");
            th.printStackTrace();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final void reLoadTexture() {
        this.E = false;
        this.g = 0;
        a();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final boolean remove() {
        b();
        this.o = false;
        return this.p.a(this);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IText
    public final void setAlign(int i, int i2) throws RemoteException {
        this.d = i;
        if (i == 1) {
            this.m = 0.0f;
        } else if (i == 2) {
            this.m = 1.0f;
        } else if (i != 4) {
            this.m = 0.5f;
        } else {
            this.m = 0.5f;
        }
        this.e = i2;
        if (i2 == 8) {
            this.n = 0.0f;
        } else if (i2 == 16) {
            this.n = 1.0f;
        } else if (i2 != 32) {
            this.n = 0.5f;
        } else {
            this.n = 0.5f;
        }
        b();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final void setAnchor(float f, float f2) {
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IText
    public final void setBackgroundColor(int i) throws RemoteException {
        this.s = i;
        c();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IText
    public final void setFontColor(int i) throws RemoteException {
        this.t = i;
        c();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IText
    public final void setFontSize(int i) throws RemoteException {
        this.u = i;
        c();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final void setObject(Object obj) {
        this.q = obj;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate
    public final void setOnTap(boolean z) {
        this.B = z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final void setPosition(LatLng latLng) {
        this.l = latLng;
        calFPoint();
        b();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final void setRotateAngle(float f) {
        this.c = f;
        this.b = (((-f) % 360.0f) + 360.0f) % 360.0f;
        b();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IText
    public final void setText(String str) throws RemoteException {
        this.r = str;
        c();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IText
    public final void setTypeface(Typeface typeface) throws RemoteException {
        this.v = typeface;
        c();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final void setVisible(boolean z) {
        if (this.o == z) {
            return;
        }
        this.o = z;
        b();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlayImage
    public final void setZIndex(float f) {
        this.w = f;
        this.p.e();
    }

    private void a(w wVar) {
        if (wVar != null) {
            this.C.add(wVar);
            wVar.n();
        }
    }
}
