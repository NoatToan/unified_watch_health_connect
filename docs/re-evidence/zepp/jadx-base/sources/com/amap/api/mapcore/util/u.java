package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.RemoteException;
import android.util.Log;
import android.view.MotionEvent;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.Marker;
import com.amap.api.maps.model.MarkerOptions;
import com.amap.api.maps.model.Text;
import com.amap.api.maps.model.TextOptions;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.interfaces.IMarker;
import com.autonavi.base.amap.api.mapcore.BaseOverlayImp;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.api.mapcore.overlays.IMarkerDelegate;
import com.autonavi.base.amap.api.mapcore.overlays.IOverlayImageDelegate;
import com.autonavi.base.amap.mapcore.MapConfig;
import com.huami.message.ui.base.date.DateExKt;
import java.io.Serializable;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class u {
    public IAMapDelegate a;
    public df.d c;
    private IPoint k;
    private BaseOverlayImp l;
    private IMarkerDelegate m;
    private FloatBuffer p;
    private List<IOverlayImageDelegate> f = new ArrayList(500);
    private List<w> g = new ArrayList();
    private List<IOverlayImageDelegate> h = new ArrayList();
    private a i = new a();
    private boolean j = true;
    private volatile boolean q = false;
    private int[] r = new int[1];
    public float[] b = new float[DateExKt.DURATION_THREE_MIN];
    public int d = 0;
    public int e = 0;
    private Runnable s = new Runnable() { // from class: com.amap.api.mapcore.util.u.2
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (u.this.f) {
                u.b(u.this);
            }
        }
    };
    private fb n = new fb();
    private ef o = new ef();

    public static class a implements Serializable, Comparator<Object> {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            IOverlayImageDelegate iOverlayImageDelegate = (IOverlayImageDelegate) obj;
            IOverlayImageDelegate iOverlayImageDelegate2 = (IOverlayImageDelegate) obj2;
            if (iOverlayImageDelegate == null || iOverlayImageDelegate2 == null) {
                return 0;
            }
            try {
                return Float.compare(iOverlayImageDelegate.getZIndex(), iOverlayImageDelegate2.getZIndex());
            } catch (Throwable th) {
                hn.c(th, "MapOverlayImageView", "compare");
                th.printStackTrace();
                return 0;
            }
        }
    }

    public u(IAMapDelegate iAMapDelegate) {
        this.a = iAMapDelegate;
    }

    private void d(IOverlayImageDelegate iOverlayImageDelegate) {
        try {
            this.f.add(iOverlayImageDelegate);
            this.q = true;
        } catch (Throwable th) {
            hn.c(th, "MapOverlayImageView", "addMarker");
        }
    }

    private void h() {
        IAMapDelegate iAMapDelegate;
        if (this.c != null || (iAMapDelegate = this.a) == null) {
            return;
        }
        this.c = (df.d) iAMapDelegate.getGLShader(1);
    }

    private float[] i() {
        IAMapDelegate iAMapDelegate = this.a;
        return iAMapDelegate != null ? iAMapDelegate.getFinalMatrix() : new float[16];
    }

    public final void b(IOverlayImageDelegate iOverlayImageDelegate) {
        if (iOverlayImageDelegate != null) {
            try {
                if (iOverlayImageDelegate.isInfoWindowShown()) {
                    this.a.hideInfoWindow();
                    this.l = null;
                    return;
                }
            } catch (Throwable th) {
                th.printStackTrace();
                ex.c(ew.d, "infowindow hide failed " + th.getMessage());
                return;
            }
        }
        BaseOverlayImp baseOverlayImp = this.l;
        if (baseOverlayImp == null || !baseOverlayImp.getId().equals(iOverlayImageDelegate.getId())) {
            return;
        }
        this.l = null;
    }

    public final BaseOverlayImp c() {
        return this.l;
    }

    public final void e() {
        this.q = true;
    }

    public final int f() {
        int size;
        synchronized (this.f) {
            size = this.f.size();
        }
        return size;
    }

    public final void g() {
        try {
            for (IOverlayImageDelegate iOverlayImageDelegate : this.f) {
                if (iOverlayImageDelegate != null) {
                    iOverlayImageDelegate.destroy(false);
                }
            }
            a((String) null);
            this.a = null;
        } catch (Throwable th) {
            hn.c(th, "MapOverlayImageView", "destroy");
            th.printStackTrace();
            Log.d("amapApi", "MapOverlayImageView clear erro" + th.getMessage());
        }
    }

    public final Marker a(MarkerOptions markerOptions) throws RemoteException {
        Marker marker;
        if (markerOptions == null) {
            return null;
        }
        cs csVar = new cs(markerOptions, this);
        synchronized (this.f) {
            d(csVar);
            eb.a(this.f.size());
            marker = new Marker(csVar);
        }
        return marker;
    }

    public final boolean c(IOverlayImageDelegate iOverlayImageDelegate) {
        boolean zContains;
        synchronized (this.f) {
            zContains = this.f.contains(iOverlayImageDelegate);
        }
        return zContains;
    }

    public final List<Marker> d() {
        ArrayList arrayList;
        synchronized (this.f) {
            arrayList = new ArrayList();
            try {
                for (IOverlayImageDelegate iOverlayImageDelegate : this.f) {
                    if ((iOverlayImageDelegate instanceof cs) && iOverlayImageDelegate.checkInBounds()) {
                        arrayList.add(new Marker((IMarker) iOverlayImageDelegate));
                    }
                }
            } catch (Throwable th) {
                hn.c(th, "MapOverlayImageView", "getMapScreenMarkers");
                th.printStackTrace();
            }
        }
        return arrayList;
    }

    public final ArrayList<Marker> a(ArrayList<MarkerOptions> arrayList, boolean z) throws RemoteException {
        MarkerOptions markerOptions;
        if (arrayList == null || arrayList.size() == 0) {
            return null;
        }
        ArrayList<Marker> arrayList2 = new ArrayList<>();
        try {
            if (arrayList.size() == 1 && (markerOptions = arrayList.get(0)) != null) {
                arrayList2.add(a(markerOptions));
                if (z && markerOptions.getPosition() != null) {
                    this.a.moveCamera(af.a(markerOptions.getPosition(), 18.0f));
                }
            } else {
                final LatLngBounds.Builder builder = LatLngBounds.builder();
                for (int i = 0; i < arrayList.size(); i++) {
                    MarkerOptions markerOptions2 = arrayList.get(i);
                    if (arrayList.get(i) != null) {
                        arrayList2.add(a(markerOptions2));
                        if (markerOptions2.getPosition() != null) {
                            builder.include(markerOptions2.getPosition());
                        }
                    }
                }
                if (z && arrayList2.size() > 0) {
                    this.a.getMainHandler().postDelayed(new Runnable() { // from class: com.amap.api.mapcore.util.u.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                u.this.a.moveCamera(af.a(builder.build(), 50));
                            } catch (Throwable unused) {
                            }
                        }
                    }, 50L);
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            hn.c(th, "AMapDelegateImpGLSurfaceView", "addMarkers");
            th.printStackTrace();
            return arrayList2;
        }
    }

    public final IAMapDelegate b() {
        return this.a;
    }

    public final boolean b(MotionEvent motionEvent) throws RemoteException {
        boolean z;
        Rect rect;
        boolean zA;
        synchronized (this.f) {
            z = false;
            for (int size = this.f.size() - 1; size >= 0; size--) {
                IOverlayImageDelegate iOverlayImageDelegate = this.f.get(size);
                if ((iOverlayImageDelegate instanceof cs) && iOverlayImageDelegate.isVisible() && ((cs) iOverlayImageDelegate).isClickable() && (zA = er.a((rect = iOverlayImageDelegate.getRect()), (int) motionEvent.getX(), (int) motionEvent.getY()))) {
                    this.k = IPoint.obtain(rect.left + (rect.width() / 2), rect.top);
                    this.l = (cs) iOverlayImageDelegate;
                    z = zA;
                    break;
                }
            }
        }
        return z;
    }

    public static /* synthetic */ void b(u uVar) {
        try {
            Collections.sort(uVar.f, uVar.i);
        } catch (Throwable th) {
            hn.c(th, "MapOverlayImageView", "changeOverlayIndex");
        }
    }

    public final Text a(TextOptions textOptions) throws RemoteException {
        Text text;
        if (textOptions == null) {
            return null;
        }
        synchronized (this.f) {
            dc dcVar = new dc(textOptions, this);
            d(dcVar);
            text = new Text(dcVar);
        }
        return text;
    }

    public final boolean a(IOverlayImageDelegate iOverlayImageDelegate) {
        boolean zRemove;
        synchronized (this.f) {
            try {
                IMarkerDelegate iMarkerDelegate = this.m;
                if (iMarkerDelegate != null && iMarkerDelegate.getId().equals(iOverlayImageDelegate.getId())) {
                    this.m = null;
                }
                b(iOverlayImageDelegate);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            zRemove = this.f.remove(iOverlayImageDelegate);
        }
        return zRemove;
    }

    public final void a(IMarkerDelegate iMarkerDelegate) {
        try {
            if (this.m != null) {
                if (iMarkerDelegate != null && iMarkerDelegate.getId().equals(this.m.getId())) {
                    return;
                } else {
                    this.m.setOnTap(false);
                }
            }
            if (this.f.contains(iMarkerDelegate)) {
                if (iMarkerDelegate != null) {
                    iMarkerDelegate.setOnTap(true);
                }
                this.m = iMarkerDelegate;
            }
        } catch (Throwable th) {
            hn.c(th, "MapOverlayImageView", "set2Top");
        }
    }

    public final void a() {
        this.m = null;
    }

    public final void a(BaseOverlayImp baseOverlayImp) {
        if (this.k == null) {
            this.k = IPoint.obtain();
        }
        Rect rect = baseOverlayImp.getRect();
        this.k = IPoint.obtain(rect.left + (rect.width() / 2), rect.top);
        this.l = baseOverlayImp;
        try {
            this.a.showInfoWindow(baseOverlayImp);
        } catch (Throwable th) {
            hn.c(th, "MapOverlayImageView", "showInfoWindow");
            th.printStackTrace();
            ex.c(ew.d, "infowindow show failed " + th.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ad A[Catch: all -> 0x0170, TryCatch #0 {, blocks: (B:11:0x001f, B:12:0x0021, B:30:0x0078, B:32:0x0080, B:34:0x0082, B:37:0x0092, B:39:0x009c, B:56:0x00d5, B:44:0x00ad, B:46:0x00b3, B:48:0x00b9, B:50:0x00c5, B:55:0x00d2, B:42:0x00a5, B:57:0x00d8, B:59:0x00dc, B:62:0x00e4, B:64:0x00ee, B:65:0x00f6, B:67:0x0100, B:68:0x0107, B:70:0x010f, B:72:0x011c, B:73:0x0124, B:90:0x0165, B:92:0x0168, B:93:0x016b, B:97:0x016f, B:52:0x00cb, B:74:0x0125, B:76:0x012c, B:80:0x013e, B:82:0x014b, B:83:0x0152, B:85:0x0159, B:86:0x015f, B:87:0x0160, B:77:0x0131, B:79:0x0137, B:13:0x0022, B:14:0x0029, B:16:0x0031, B:18:0x003b, B:20:0x0044, B:22:0x004a, B:24:0x0064, B:26:0x0068, B:23:0x0054, B:27:0x006f, B:28:0x0072, B:29:0x0077), top: B:104:0x001f, outer: #3, inners: #1, #2, #4 }] */
    public final boolean a(boolean z) {
        try {
            if (this.a == null) {
                return false;
            }
            if (this.q) {
                this.s.run();
                this.q = false;
            }
            float mapPerPixelUnitLength = this.a.getMapConfig().getMapPerPixelUnitLength();
            synchronized (this.f) {
                synchronized (this.g) {
                    int baseOverlayTextureID = this.a.getBaseOverlayTextureID();
                    for (int i = 0; i < this.g.size(); i++) {
                        w wVar = this.g.get(i);
                        if (wVar != null) {
                            wVar.o();
                            if (wVar.p() <= 0) {
                                if (wVar.l() == baseOverlayTextureID) {
                                    this.n.a(wVar.q());
                                } else {
                                    this.r[0] = wVar.l();
                                    GLES20.glDeleteTextures(1, this.r, 0);
                                    wVar.a(0);
                                }
                                IAMapDelegate iAMapDelegate = this.a;
                                if (iAMapDelegate != null) {
                                    iAMapDelegate.removeTextureItem(wVar.q());
                                }
                            }
                        }
                    }
                    this.g.clear();
                }
                if (this.f.size() == 0) {
                    return false;
                }
                this.h.clear();
                int size = this.f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    IOverlayImageDelegate iOverlayImageDelegate = this.f.get(i2);
                    if (z) {
                        if (iOverlayImageDelegate.getZIndex() == 2.1474836E9f) {
                            if (!iOverlayImageDelegate.isVisible()) {
                            }
                        }
                    } else if (iOverlayImageDelegate.getZIndex() != 2.1474836E9f) {
                        if (!iOverlayImageDelegate.isVisible() && !iOverlayImageDelegate.isOnTap()) {
                            this.j = iOverlayImageDelegate.isAllowLow();
                            if (iOverlayImageDelegate.checkInBounds() || iOverlayImageDelegate.isInfoWindowShown()) {
                                try {
                                    this.h.add(iOverlayImageDelegate);
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }
                        }
                    }
                }
                IMarkerDelegate iMarkerDelegate = this.m;
                if (iMarkerDelegate != null && iMarkerDelegate.isVisible()) {
                    if (z) {
                        if (this.m.getZIndex() == 2.1474836E9f) {
                            this.h.add(this.m);
                        }
                    } else if (this.m.getZIndex() != 2.1474836E9f) {
                        this.h.add(this.m);
                    }
                }
                if (this.h.size() > 0) {
                    int size2 = this.h.size();
                    int i3 = 0;
                    int textureId = 0;
                    int i4 = 0;
                    int i5 = 0;
                    for (int i6 = 0; i6 < size2; i6++) {
                        IOverlayImageDelegate iOverlayImageDelegate2 = this.h.get(i6);
                        synchronized (iOverlayImageDelegate2) {
                            iOverlayImageDelegate2.loadTexture(this.a);
                            if (i6 == 0) {
                                textureId = iOverlayImageDelegate2.getTextureId();
                            } else {
                                int textureId2 = iOverlayImageDelegate2.getTextureId();
                                if (textureId2 != textureId) {
                                    a(textureId, i3, i4, i5);
                                    textureId = textureId2;
                                    i3 = 0;
                                    i4 = 0;
                                    i5 = 0;
                                }
                            }
                            iOverlayImageDelegate2.drawMarker(this.a, this.b, i5, mapPerPixelUnitLength);
                            int textureId3 = iOverlayImageDelegate2.getTextureId();
                            if (textureId3 != textureId) {
                                a(textureId, i3, i4, i5);
                                i4 = i5;
                                textureId = textureId3;
                                i3 = 0;
                                i5 = 0;
                            }
                            i5 += 36;
                            i3++;
                            if (i3 == 5000) {
                                a(textureId, i3, i4, i5);
                                i3 = 0;
                                i4 = 0;
                                i5 = 0;
                            }
                        }
                    }
                    if (i3 > 0) {
                        a(textureId, i3, i4, i5);
                    }
                }
                return true;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    private void a(int i, int i2, int i3, int i4) {
        if (i2 == 0 || i == 0) {
            return;
        }
        FloatBuffer floatBufferA = this.o.a(i2 * 36);
        this.p = floatBufferA;
        floatBufferA.put(this.b, i3, i4);
        this.p.flip();
        a(i2);
        a(i, i2, this.p, this.a.getMapConfig());
        this.o.a();
    }

    private void a(int i) {
        if (i > 5000) {
            i = 5000;
        }
        if (this.d == 0) {
            int[] iArr = new int[2];
            GLES20.glGenBuffers(2, iArr, 0);
            this.d = iArr[0];
            this.e = iArr[1];
            ShortBuffer shortBufferB = this.o.b();
            short[] sArr = new short[30000];
            for (int i2 = 0; i2 < 5000; i2++) {
                int i3 = i2 * 6;
                int i4 = i2 * 4;
                short s = (short) (i4 + 0);
                sArr[i3 + 0] = s;
                sArr[i3 + 1] = (short) (i4 + 1);
                short s2 = (short) (i4 + 2);
                sArr[i3 + 2] = s2;
                sArr[i3 + 3] = s;
                sArr[i3 + 4] = s2;
                sArr[i3 + 5] = (short) (i4 + 3);
            }
            shortBufferB.put(sArr);
            shortBufferB.flip();
            GLES20.glBindBuffer(34963, this.e);
            GLES20.glBufferData(34963, 60000, shortBufferB, 35044);
        }
        GLES20.glBindBuffer(34962, this.d);
        GLES20.glBufferData(34962, i * 36 * 4, this.p, 35044);
    }

    private void a(int i, int i2, FloatBuffer floatBuffer, MapConfig mapConfig) {
        if (i == 0 || floatBuffer == null || i2 == 0) {
            return;
        }
        df.d dVar = this.c;
        if (dVar == null || dVar.b()) {
            h();
        }
        df.d dVar2 = this.c;
        if (dVar2 == null || this.d == 0 || dVar2.c < 0 || this.e == 0) {
            return;
        }
        GLES20.glUseProgram(dVar2.d);
        GLES20.glUniform1f(this.c.h, mapConfig.getSR());
        GLES20.glEnableVertexAttribArray(this.c.b);
        GLES20.glBindBuffer(34962, this.d);
        GLES20.glVertexAttribPointer(this.c.b, 4, 5126, false, 36, 0);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(1, 771);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glEnableVertexAttribArray(this.c.c);
        GLES20.glBindBuffer(34962, this.d);
        GLES20.glVertexAttribPointer(this.c.c, 2, 5126, false, 36, 16);
        GLES20.glEnableVertexAttribArray(this.c.g);
        GLES20.glBindBuffer(34962, this.d);
        GLES20.glVertexAttribPointer(this.c.g, 3, 5126, false, 36, 24);
        GLES20.glUniformMatrix4fv(this.c.a, 1, false, i(), 0);
        GLES20.glBindBuffer(34963, this.e);
        GLES20.glDrawElements(4, i2 * 6, 5123, 0);
        GLES20.glBindBuffer(34962, 0);
        GLES20.glBindBuffer(34963, 0);
        GLES20.glBindTexture(3553, 0);
        GLES20.glDisableVertexAttribArray(this.c.b);
        GLES20.glDisableVertexAttribArray(this.c.c);
        GLES20.glDisable(3042);
        GLES20.glUseProgram(0);
    }

    public final synchronized boolean a(Bitmap bitmap, w wVar) {
        fb.c cVarA = this.n.a(bitmap.getWidth() + 1, bitmap.getHeight() + 1, wVar.q());
        if (cVarA == null) {
            return false;
        }
        wVar.f(cVarA.a / this.n.a());
        wVar.e(cVarA.b / this.n.b());
        wVar.g(((cVarA.a + cVarA.c) - 1) / this.n.a());
        wVar.h(((cVarA.b + cVarA.d) - 1) / this.n.b());
        wVar.c((cVarA.a + 0.5f) / this.n.a());
        wVar.d((cVarA.b + 0.5f) / this.n.b());
        wVar.a((((cVarA.a + cVarA.c) - 1) - 0.5f) / this.n.a());
        wVar.b((((cVarA.b + cVarA.d) - 1) - 0.5f) / this.n.b());
        wVar.b();
        return true;
    }

    public final BaseOverlayImp a(MotionEvent motionEvent) {
        synchronized (this.f) {
            for (int size = this.f.size() - 1; size >= 0; size--) {
                IOverlayImageDelegate iOverlayImageDelegate = this.f.get(size);
                if ((iOverlayImageDelegate instanceof cs) && er.a(iOverlayImageDelegate.getRect(), (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    cs csVar = (cs) iOverlayImageDelegate;
                    this.l = csVar;
                    return csVar;
                }
            }
            return null;
        }
    }

    public final void a(String str) {
        boolean z;
        if (str != null) {
            try {
                z = str.trim().length() == 0;
            } catch (Throwable th) {
                hn.c(th, "MapOverlayImageView", "clear");
                th.printStackTrace();
                return;
            }
        }
        IOverlayImageDelegate iOverlayImageDelegate = null;
        this.l = null;
        this.k = null;
        this.m = null;
        synchronized (this.f) {
            this.h.clear();
            if (z) {
                this.f.clear();
            } else {
                int size = this.f.size();
                for (int i = 0; i < size; i++) {
                    IOverlayImageDelegate iOverlayImageDelegate2 = this.f.get(i);
                    if (str.equals(iOverlayImageDelegate2.getId())) {
                        iOverlayImageDelegate = iOverlayImageDelegate2;
                        break;
                    }
                }
                this.f.clear();
                if (iOverlayImageDelegate != null) {
                    this.f.add(iOverlayImageDelegate);
                    if (iOverlayImageDelegate.isOnTap() && (iOverlayImageDelegate instanceof IMarkerDelegate)) {
                        this.m = (IMarkerDelegate) iOverlayImageDelegate;
                    }
                }
            }
        }
    }

    public final void a(w wVar) {
        synchronized (this.g) {
            if (wVar != null) {
                this.g.add(wVar);
            }
        }
    }
}
