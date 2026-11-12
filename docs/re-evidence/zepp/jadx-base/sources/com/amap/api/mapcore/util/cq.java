package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.opengl.GLES20;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.interfaces.IOverlay;
import com.autonavi.base.ae.gmap.GLMapState;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.api.mapcore.overlays.IGroundOverlayDelegate;
import com.autonavi.base.amap.mapcore.MapConfig;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class cq implements IGroundOverlayDelegate {
    public float[] a;
    public df.c b;
    private IAMapDelegate c;
    private BitmapDescriptor d;
    private LatLng e;
    private float f;
    private float g;
    private LatLngBounds h;
    private float i;
    private float j;
    private boolean k;
    private float l;
    private float m;
    private float n;
    private float o;
    private String p;
    private FloatBuffer q;
    private FloatBuffer r;
    private int s;
    private boolean t;
    private boolean u;
    private List<w> v;
    private IGlOverlayLayer w;

    public cq(IAMapDelegate iAMapDelegate, IGlOverlayLayer iGlOverlayLayer) {
        this(iAMapDelegate);
        this.w = iGlOverlayLayer;
    }

    private void a() {
        LatLng latLng = this.e;
        if (latLng == null) {
            return;
        }
        double dCos = ((double) this.f) / ((Math.cos(latLng.latitude * 0.01745329251994329d) * 6371000.79d) * 0.01745329251994329d);
        double d = ((double) this.g) / 111194.94043265979d;
        try {
            LatLng latLng2 = this.e;
            LatLng latLng3 = new LatLng(latLng2.latitude - (((double) (1.0f - this.o)) * d), latLng2.longitude - (((double) this.n) * dCos));
            LatLng latLng4 = this.e;
            this.h = new LatLngBounds(latLng3, new LatLng(latLng4.latitude + (((double) this.o) * d), latLng4.longitude + (((double) (1.0f - this.n)) * dCos)));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        c();
    }

    private synchronized void b() {
        LatLngBounds latLngBounds = this.h;
        if (latLngBounds == null) {
            return;
        }
        LatLng latLng = latLngBounds.southwest;
        LatLng latLng2 = latLngBounds.northeast;
        double d = latLng.latitude;
        double d2 = d + (((double) (1.0f - this.o)) * (latLng2.latitude - d));
        double d3 = latLng.longitude;
        LatLng latLng3 = new LatLng(d2, d3 + (((double) this.n) * (latLng2.longitude - d3)));
        this.e = latLng3;
        this.f = (float) (Math.cos(latLng3.latitude * 0.01745329251994329d) * 6371000.79d * (latLng2.longitude - latLng.longitude) * 0.01745329251994329d);
        this.g = (float) ((latLng2.latitude - latLng.latitude) * 6371000.79d * 0.01745329251994329d);
        c();
    }

    private synchronized void c() {
        if (this.h == null) {
            return;
        }
        this.a = new float[16];
        IPoint iPointObtain = IPoint.obtain();
        IPoint iPointObtain2 = IPoint.obtain();
        IPoint iPointObtain3 = IPoint.obtain();
        IPoint iPointObtain4 = IPoint.obtain();
        LatLng latLng = this.h.southwest;
        GLMapState.lonlat2Geo(latLng.longitude, latLng.latitude, iPointObtain);
        LatLngBounds latLngBounds = this.h;
        GLMapState.lonlat2Geo(latLngBounds.northeast.longitude, latLngBounds.southwest.latitude, iPointObtain2);
        LatLng latLng2 = this.h.northeast;
        GLMapState.lonlat2Geo(latLng2.longitude, latLng2.latitude, iPointObtain3);
        LatLngBounds latLngBounds2 = this.h;
        GLMapState.lonlat2Geo(latLngBounds2.southwest.longitude, latLngBounds2.northeast.latitude, iPointObtain4);
        if (this.i != 0.0f) {
            double d = ((Point) iPointObtain2).x - ((Point) iPointObtain).x;
            double d2 = ((Point) iPointObtain2).y - ((Point) iPointObtain3).y;
            DPoint dPointObtain = DPoint.obtain();
            dPointObtain.x = ((double) ((Point) iPointObtain).x) + (((double) this.n) * d);
            dPointObtain.y = ((double) ((Point) iPointObtain).y) - (((double) (1.0f - this.o)) * d2);
            a(dPointObtain, 0.0d, 0.0d, d, d2, iPointObtain);
            a(dPointObtain, d, 0.0d, d, d2, iPointObtain2);
            a(dPointObtain, d, d2, d, d2, iPointObtain3);
            a(dPointObtain, 0.0d, d2, d, d2, iPointObtain4);
            dPointObtain.recycle();
        }
        float[] fArr = this.a;
        int i = ((Point) iPointObtain).x;
        fArr[0] = i / 10000;
        int i2 = ((Point) iPointObtain).y;
        fArr[1] = i2 / 10000;
        fArr[2] = i % 10000;
        fArr[3] = i2 % 10000;
        int i3 = ((Point) iPointObtain2).x;
        fArr[4] = i3 / 10000;
        int i4 = ((Point) iPointObtain2).y;
        fArr[5] = i4 / 10000;
        fArr[6] = i3 % 10000;
        fArr[7] = i4 % 10000;
        int i5 = ((Point) iPointObtain3).x;
        fArr[8] = i5 / 10000;
        int i6 = ((Point) iPointObtain3).y;
        fArr[9] = i6 / 10000;
        fArr[10] = i5 % 10000;
        fArr[11] = i6 % 10000;
        int i7 = ((Point) iPointObtain4).x;
        fArr[12] = i7 / 10000;
        int i8 = ((Point) iPointObtain4).y;
        fArr[13] = i8 / 10000;
        fArr[14] = i7 % 10000;
        fArr[15] = i8 % 10000;
        FloatBuffer floatBuffer = this.q;
        if (floatBuffer == null) {
            this.q = er.a(fArr);
        } else {
            this.q = er.a(fArr, floatBuffer);
        }
        iPointObtain4.recycle();
        iPointObtain.recycle();
        iPointObtain2.recycle();
        iPointObtain3.recycle();
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean calMapFPoint() throws RemoteException {
        synchronized (this) {
            if (this.a != null) {
                return false;
            }
            this.u = false;
            if (this.e == null) {
                b();
                return true;
            }
            if (this.h == null) {
                a();
                return true;
            }
            c();
            return true;
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean checkInBounds() {
        return true;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void destroy() {
        Bitmap bitmap;
        try {
            remove();
            List<w> list = this.v;
            if (list != null && list.size() > 0) {
                for (int i = 0; i < this.v.size(); i++) {
                    w wVar = this.v.get(i);
                    if (wVar != null) {
                        IGlOverlayLayer iGlOverlayLayer = this.w;
                        if (iGlOverlayLayer != null) {
                            iGlOverlayLayer.addRecycleTextureIds(wVar);
                        }
                        IAMapDelegate iAMapDelegate = this.c;
                        if (iAMapDelegate != null) {
                            iAMapDelegate.removeTextureItem(wVar.q());
                        }
                    }
                }
                this.v.clear();
            }
            BitmapDescriptor bitmapDescriptor = this.d;
            if (bitmapDescriptor != null && (bitmap = bitmapDescriptor.getBitmap()) != null) {
                er.c(bitmap);
                this.d = null;
            }
            FloatBuffer floatBuffer = this.r;
            if (floatBuffer != null) {
                floatBuffer.clear();
                this.r = null;
            }
            synchronized (this) {
                FloatBuffer floatBuffer2 = this.q;
                if (floatBuffer2 != null) {
                    floatBuffer2.clear();
                    this.q = null;
                }
                this.h = null;
            }
            this.e = null;
        } catch (Throwable th) {
            hn.c(th, "GroundOverlayDelegateImp", "destroy");
            th.printStackTrace();
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final void draw(MapConfig mapConfig) throws RemoteException {
        IAMapDelegate iAMapDelegate;
        int iL;
        IGlOverlayLayer iGlOverlayLayer;
        synchronized (this) {
            if (!this.k || (this.e == null && this.h == null) || this.d == null) {
                return;
            }
            calMapFPoint();
            if (!this.t) {
                boolean z = Build.VERSION.SDK_INT >= 12;
                BitmapDescriptor bitmapDescriptor = this.d;
                List<w> list = this.v;
                if (list != null) {
                    for (w wVar : list) {
                        if (wVar != null && (iGlOverlayLayer = this.w) != null) {
                            iGlOverlayLayer.addRecycleTextureIds(wVar);
                        }
                    }
                    this.v.clear();
                }
                w wVar2 = null;
                if (!z || (wVar2 = this.w.getTextureItem(bitmapDescriptor)) == null) {
                    if (wVar2 == null) {
                        wVar2 = new w(bitmapDescriptor, 0);
                    }
                    Bitmap bitmap = bitmapDescriptor.getBitmap();
                    if (bitmap == null || bitmap.isRecycled()) {
                        iL = 0;
                    } else {
                        int[] iArr = {0};
                        GLES20.glGenTextures(1, iArr, 0);
                        int i = iArr[0];
                        wVar2.a(i);
                        if (z) {
                            this.c.addTextureItem(wVar2);
                        }
                        a(wVar2);
                        er.a(i, bitmap, true);
                        iL = i;
                    }
                } else {
                    iL = wVar2.l();
                    a(wVar2);
                }
                this.s = iL;
                this.t = true;
            }
            if (this.f == 0.0f && this.g == 0.0f) {
                return;
            }
            synchronized (this) {
                int i2 = this.s;
                FloatBuffer floatBuffer = this.q;
                FloatBuffer floatBuffer2 = this.r;
                if (floatBuffer != null && floatBuffer2 != null) {
                    df.c cVar = this.b;
                    if ((cVar == null || cVar.b()) && (iAMapDelegate = this.c) != null) {
                        this.b = (df.c) iAMapDelegate.getGLShader(2);
                    }
                    GLES20.glUseProgram(this.b.d);
                    GLES20.glEnable(3042);
                    GLES20.glBlendFunc(1, 771);
                    float f = this.m;
                    GLES20.glBlendColor(f * 1.0f, f * 1.0f, f * 1.0f, f);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, i2);
                    GLES20.glEnableVertexAttribArray(this.b.b);
                    GLES20.glVertexAttribPointer(this.b.b, 4, 5126, false, 16, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(this.b.c);
                    GLES20.glVertexAttribPointer(this.b.c, 2, 5126, false, 8, (Buffer) floatBuffer2);
                    GLES20.glUniform4f(this.b.g, ((int) this.c.getMapConfig().getSX()) / 10000, ((int) this.c.getMapConfig().getSY()) / 10000, ((int) this.c.getMapConfig().getSX()) % 10000, ((int) this.c.getMapConfig().getSY()) % 10000);
                    int i3 = this.b.h;
                    float f2 = this.m;
                    GLES20.glUniform4f(i3, f2 * 1.0f, f2 * 1.0f, f2 * 1.0f, f2);
                    GLES20.glUniformMatrix4fv(this.b.a, 1, false, this.c.getFinalMatrix(), 0);
                    GLES20.glDrawArrays(6, 0, 4);
                    GLES20.glBindTexture(3553, 0);
                    GLES20.glDisableVertexAttribArray(this.b.b);
                    GLES20.glDisableVertexAttribArray(this.b.c);
                    GLES20.glDisable(3042);
                    GLES20.glUseProgram(0);
                }
            }
            this.u = true;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean equalsRemote(IOverlay iOverlay) throws RemoteException {
        return equals(iOverlay) || iOverlay.getId().equals(getId());
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IGroundOverlay
    public final float getBearing() throws RemoteException {
        return this.i;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IGroundOverlay
    public final LatLngBounds getBounds() throws RemoteException {
        return this.h;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IGroundOverlay
    public final float getHeight() throws RemoteException {
        return this.g;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final String getId() throws RemoteException {
        if (this.p == null) {
            this.p = this.c.createId("GroundOverlay");
        }
        return this.p;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IGroundOverlay
    public final LatLng getPosition() throws RemoteException {
        return this.e;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IGroundOverlay
    public final float getTransparency() throws RemoteException {
        return this.l;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IGroundOverlay
    public final float getWidth() throws RemoteException {
        return this.f;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final float getZIndex() throws RemoteException {
        return this.j;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final int hashCodeRemote() throws RemoteException {
        return super.hashCode();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean isAboveMaskLayer() {
        return false;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean isDrawFinish() {
        return this.u;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean isVisible() throws RemoteException {
        return this.k;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IGroundOverlayDelegate
    public final void reLoadTexture() {
        this.t = false;
        this.s = 0;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void remove() throws RemoteException {
        this.c.removeGLOverlay(getId());
        this.c.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setAboveMaskLayer(boolean z) {
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IGroundOverlayDelegate
    public final void setAnchor(float f, float f2) throws RemoteException {
        this.n = f;
        this.o = f2;
        this.c.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IGroundOverlay
    public final void setBearing(float f) throws RemoteException {
        float f2 = ((f % 360.0f) + 360.0f) % 360.0f;
        if (Math.abs(this.i - f2) > 1.0E-7d) {
            this.i = f2;
            c();
        }
        this.c.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IGroundOverlay
    public final void setDimensions(float f) throws RemoteException {
        if (f <= 0.0f) {
            Log.w("GroundOverlayDelegateImp", "Width must be non-negative");
        }
        if (!this.t || this.f == f) {
            this.f = f;
            this.g = f;
        } else {
            this.f = f;
            this.g = f;
            a();
        }
        this.c.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IGroundOverlay
    public final void setImage(BitmapDescriptor bitmapDescriptor) throws RemoteException {
        if (bitmapDescriptor == null || bitmapDescriptor.getBitmap() == null || bitmapDescriptor.getBitmap().isRecycled()) {
            return;
        }
        this.d = bitmapDescriptor;
        int width = this.d.getWidth();
        int height = this.d.getHeight();
        int height2 = this.d.getBitmap().getHeight();
        float width2 = width / this.d.getBitmap().getWidth();
        float f = height / height2;
        this.r = er.a(new float[]{0.0f, f, width2, f, width2, 0.0f, 0.0f, 0.0f});
        if (this.t) {
            this.t = false;
        }
        this.c.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IGroundOverlay
    public final void setPosition(LatLng latLng) throws RemoteException {
        this.e = latLng;
        a();
        this.c.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IGroundOverlay
    public final void setPositionFromBounds(LatLngBounds latLngBounds) throws RemoteException {
        if (latLngBounds == null) {
            return;
        }
        this.h = latLngBounds;
        b();
        this.c.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IGroundOverlay
    public final void setTransparency(float f) throws RemoteException {
        this.l = (float) Math.min(1.0d, Math.max(0.0d, f));
        this.m = 1.0f - f;
        this.c.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setVisible(boolean z) throws RemoteException {
        this.k = z;
        this.c.setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setZIndex(float f) throws RemoteException {
        this.j = f;
        this.c.changeGLOverlayIndex();
        this.c.setRunLowFrame(false);
    }

    private cq(IAMapDelegate iAMapDelegate) {
        this.k = true;
        this.l = 0.0f;
        this.m = 1.0f;
        this.n = 0.5f;
        this.o = 0.5f;
        this.q = null;
        this.t = false;
        this.u = false;
        this.v = new ArrayList();
        this.a = null;
        this.c = iAMapDelegate;
        try {
            this.p = getId();
        } catch (RemoteException e) {
            hn.c(e, "GroundOverlayDelegateImp", "create");
            e.printStackTrace();
        }
    }

    private void a(DPoint dPoint, double d, double d2, double d3, double d4, IPoint iPoint) {
        double d5 = d - (d3 * ((double) this.n));
        double d6 = (d4 * ((double) (1.0f - this.o))) - d2;
        double d7 = ((double) (-this.i)) * 0.01745329251994329d;
        ((Point) iPoint).x = (int) (dPoint.x + (Math.cos(d7) * d5) + (Math.sin(d7) * d6));
        ((Point) iPoint).y = (int) (dPoint.y + ((d6 * Math.cos(d7)) - (d5 * Math.sin(d7))));
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IGroundOverlay
    public final void setDimensions(float f, float f2) throws RemoteException {
        if (f <= 0.0f || f2 <= 0.0f) {
            Log.w("GroundOverlayDelegateImp", "Width and Height must be non-negative");
        }
        if (this.t && this.f != f && this.g != f2) {
            this.f = f;
            this.g = f2;
            a();
        } else {
            this.f = f;
            this.g = f2;
        }
        this.c.setRunLowFrame(false);
    }

    private void a(w wVar) {
        if (wVar != null) {
            this.v.add(wVar);
            wVar.n();
        }
    }
}
