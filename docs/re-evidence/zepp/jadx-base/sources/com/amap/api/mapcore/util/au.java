package com.amap.api.mapcore.util;

import android.graphics.Point;
import android.graphics.Rect;
import android.opengl.Matrix;
import android.os.RemoteException;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.BitmapDescriptorFactory;
import com.amap.api.maps.model.MultiPointItem;
import com.amap.api.maps.model.MultiPointOverlayOptions;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.MapProjection;
import com.autonavi.base.amap.mapcore.MapConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class au implements at {
    private static int E;
    private String B;
    public BitmapDescriptor b;
    public float f;
    public float g;
    public List<MultiPointItem> h;
    public IPoint m;
    public av n;
    public BitmapDescriptor a = BitmapDescriptorFactory.defaultMarker();
    public float c = 0.0f;
    public float d = 0.0f;
    public float e = 0.0f;
    public aw i = null;
    public as j = null;
    public as k = new as(0, 1, 0, 1);
    public List<MultiPointItem> l = new ArrayList();
    private float[] C = {-0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 0.5f, -0.5f, 0.0f, 0.0f, 1.0f, 0.0f};
    private boolean D = true;
    public List<ar> o = new ArrayList();
    private ExecutorService F = null;
    private List<String> G = new ArrayList();
    private float[] H = new float[ar.a * 3];
    public float[] p = new float[16];
    public float[] q = new float[4];
    public float[] r = new float[4];
    public Rect s = new Rect();
    public as t = null;
    public as u = null;
    public int v = 0;
    public int w = 0;
    public float[] x = new float[12];
    public String y = "precision highp float;\nattribute vec3 aVertex;//顶点数组,三维坐标\nuniform mat4 aMVPMatrix;//mvp矩阵\nvoid main(){\n  gl_Position = aMVPMatrix * vec4(aVertex, 1.0);\n}";
    public String z = "//有颜色 没有纹理\nprecision highp float;\nvoid main(){\n  gl_FragColor = vec4(0,0,1,1.0);\n}";
    public int A = -1;

    public au(MultiPointOverlayOptions multiPointOverlayOptions, av avVar) {
        float[] fArr = null;
        this.b = null;
        this.f = 0.5f;
        this.g = 0.5f;
        this.n = avVar;
        if (multiPointOverlayOptions != null) {
            if (multiPointOverlayOptions.getIcon() == null || multiPointOverlayOptions.getIcon().getBitmap() == null || multiPointOverlayOptions.getIcon().getBitmap().isRecycled()) {
                this.b = this.a;
            } else {
                this.b = multiPointOverlayOptions.getIcon();
            }
            this.f = multiPointOverlayOptions.getAnchorU();
            this.g = multiPointOverlayOptions.getAnchorV();
        }
        float[] fArr2 = this.C;
        if (fArr2 != null) {
            fArr = (float[]) fArr2.clone();
            float f = this.f - 0.5f;
            float f2 = this.g - 0.5f;
            fArr[0] = fArr[0] + f;
            fArr[1] = fArr[1] - f2;
            fArr[6] = fArr[6] + f;
            fArr[7] = fArr[7] - f2;
            fArr[12] = fArr[12] + f;
            fArr[13] = fArr[13] - f2;
            fArr[18] = fArr[18] + f;
            fArr[19] = fArr[19] - f2;
        }
        ar arVar = new ar(fArr);
        arVar.a(avVar.a());
        arVar.a(this.b);
        this.o.add(arVar);
    }

    private void b() {
        av avVar = this.n;
        if (avVar != null) {
            avVar.d();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMultiPointOverlay
    public final void addItem(MultiPointItem multiPointItem) {
        b();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMultiPointOverlay
    public final void addItems(List<MultiPointItem> list) {
        aw awVar;
        as asVarA;
        if (list != null) {
            try {
                if (list.size() == 0) {
                    return;
                }
                synchronized (this) {
                    if (this.h == null) {
                        this.h = new ArrayList();
                    }
                    this.h.clear();
                    this.h.addAll(list);
                    int size = this.h.size();
                    for (int i = 0; i < size; i++) {
                        List<MultiPointItem> list2 = this.h;
                        if (list2 == null) {
                            return;
                        }
                        MultiPointItem multiPointItem = list2.get(i);
                        if (multiPointItem != null && multiPointItem.getLatLng() != null && multiPointItem.getIPoint() == null) {
                            IPoint iPoint = new IPoint();
                            MapProjection.lonlat2Geo(multiPointItem.getLatLng().longitude, multiPointItem.getLatLng().latitude, iPoint);
                            multiPointItem.setIPoint(iPoint);
                        }
                    }
                    if (this.i == null && (asVarA = a()) != null) {
                        this.i = new aw(asVarA);
                    }
                    List<MultiPointItem> list3 = this.h;
                    if (list3 != null) {
                        int size2 = list3.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            MultiPointItem multiPointItem2 = this.h.get(i2);
                            if (multiPointItem2 != null && multiPointItem2.getIPoint() != null && (awVar = this.i) != null) {
                                awVar.a(multiPointItem2);
                            }
                        }
                    }
                    b();
                }
            } catch (Throwable th) {
                hn.c(th, "MultiPointOverlayDelegate", "addItems");
            }
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMultiPointOverlay
    public final void destroy(boolean z) {
        remove(z);
        BitmapDescriptor bitmapDescriptor = this.b;
        if (bitmapDescriptor != null) {
            bitmapDescriptor.recycle();
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMultiPointOverlay
    public final String getId() throws RemoteException {
        if (this.B == null) {
            E++;
            this.B = "MultiPointOverlay" + E;
        }
        return this.B;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMultiPointOverlay
    public final MultiPointItem onClick(IPoint iPoint) {
        if (!this.D || this.i == null) {
            return null;
        }
        if (this.t == null) {
            this.t = new as(0, 1, 0, 1);
        }
        int i = (int) (this.c * 8.0f);
        as asVar = this.t;
        int i2 = ((Point) iPoint).x;
        int i3 = ((Point) iPoint).y;
        asVar.a(i2 - i, i2 + i, i3 - i, i3 + i);
        synchronized (this.l) {
            for (int size = this.l.size() - 1; size >= 0; size--) {
                MultiPointItem multiPointItem = this.l.get(size);
                IPoint iPoint2 = multiPointItem.getIPoint();
                if (iPoint2 != null) {
                    if (this.k == null) {
                        return null;
                    }
                    if (this.u == null) {
                        this.u = new as(0, 1, 0, 1);
                    }
                    as asVar2 = this.u;
                    int i4 = ((Point) iPoint2).x;
                    as asVar3 = this.k;
                    int i5 = asVar3.a + i4;
                    int i6 = i4 + asVar3.c;
                    int i7 = ((Point) iPoint2).y;
                    asVar2.a(i5, i6, asVar3.b + i7, i7 + asVar3.d);
                    if (this.u.a(this.t)) {
                        return multiPointItem;
                    }
                }
            }
            return null;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMultiPointOverlay
    public final void remove(boolean z) {
        av avVar;
        this.D = false;
        try {
            this.v = 0;
            this.w = 0;
            BitmapDescriptor bitmapDescriptor = this.a;
            if (bitmapDescriptor != null) {
                bitmapDescriptor.recycle();
            }
            synchronized (this) {
                List<MultiPointItem> list = this.h;
                if (list != null) {
                    list.clear();
                    this.h = null;
                }
            }
            aw awVar = this.i;
            if (awVar != null) {
                awVar.a();
                this.i = null;
            }
            List<MultiPointItem> list2 = this.l;
            if (list2 != null) {
                list2.clear();
            }
            ExecutorService executorService = this.F;
            if (executorService != null) {
                executorService.shutdownNow();
                this.F = null;
            }
            List<String> list3 = this.G;
            if (list3 != null) {
                list3.clear();
            }
            List<ar> list4 = this.o;
            if (list4 != null) {
                for (ar arVar : list4) {
                    if (arVar != null) {
                        arVar.c();
                    }
                }
                this.o.clear();
            }
            if (z && (avVar = this.n) != null) {
                avVar.a(this);
                this.n.d();
            }
            this.n = null;
            this.C = null;
        } catch (Throwable unused) {
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMultiPointOverlay
    public final void setAnchor(float f, float f2) {
        this.f = f;
        this.g = f2;
        b();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IMultiPointOverlay
    public final void setVisible(boolean z) {
        if (this.D != z) {
            b();
        }
        this.D = z;
    }

    private as a() {
        List<MultiPointItem> list = this.h;
        if (list == null || list.size() == 0) {
            return null;
        }
        Iterator<MultiPointItem> it2 = this.h.iterator();
        MultiPointItem next = it2.next();
        int i = ((Point) next.getIPoint()).x;
        int i2 = ((Point) next.getIPoint()).x;
        int i3 = ((Point) next.getIPoint()).y;
        int i4 = ((Point) next.getIPoint()).y;
        while (it2.hasNext()) {
            MultiPointItem next2 = it2.next();
            int i5 = ((Point) next2.getIPoint()).x;
            int i6 = ((Point) next2.getIPoint()).y;
            if (i5 < i) {
                i = i5;
            }
            if (i5 > i2) {
                i2 = i5;
            }
            if (i6 < i3) {
                i3 = i6;
            }
            if (i6 > i4) {
                i4 = i6;
            }
        }
        return new as(i, i2, i3, i4);
    }

    @Override // com.amap.api.mapcore.util.at
    public final void a(MapConfig mapConfig, float[] fArr, float[] fArr2) {
        int i;
        float[] fArr3;
        av avVar;
        try {
            if (this.D) {
                if (this.F == null) {
                    this.F = new ThreadPoolExecutor(1, 2, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ee("MultiPointOverlay"), new ThreadPoolExecutor.AbortPolicy());
                }
                for (final ar arVar : this.o) {
                    if (arVar != null && !arVar.b()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(arVar.hashCode());
                        final String string = sb.toString();
                        if (!this.G.contains(string)) {
                            this.G.add(string);
                            this.F.execute(new Runnable() { // from class: com.amap.api.mapcore.util.au.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    if (arVar.b()) {
                                        return;
                                    }
                                    try {
                                        arVar.a();
                                        au.this.G.remove(string);
                                    } catch (Throwable unused) {
                                    }
                                }
                            });
                        }
                    }
                }
                if (this.o.size() <= 0 || this.i == null || mapConfig == null) {
                    return;
                }
                float sr = mapConfig.getSR();
                float sc = mapConfig.getSC();
                if (mapConfig.getChangeRatio() != 1.0d || this.l.size() == 0) {
                    synchronized (this.l) {
                        Rect rect = mapConfig.getGeoRectangle().getRect();
                        as asVar = this.j;
                        if (asVar == null) {
                            this.j = new as(rect.left, rect.right, rect.top, rect.bottom);
                        } else {
                            asVar.a(rect.left, rect.right, rect.top, rect.bottom);
                        }
                        this.l.clear();
                        float mapPerPixelUnitLength = mapConfig.getMapPerPixelUnitLength();
                        this.c = mapPerPixelUnitLength;
                        this.d = mapPerPixelUnitLength * this.b.getWidth();
                        float height = this.c * this.b.getHeight();
                        this.e = height;
                        float f = this.d;
                        double d = f * height * 16.0f;
                        if (this.k == null) {
                            this.k = new as(0, 1, 0, 1);
                        }
                        this.s.set(0, 0, 0, 0);
                        IPoint iPoint = new IPoint();
                        float f2 = this.f;
                        float f3 = this.g;
                        Matrix.setIdentityM(this.p, 0);
                        Matrix.rotateM(this.p, 0, -sr, 0.0f, 0.0f, 1.0f);
                        float[] fArr4 = this.r;
                        fArr4[0] = 0.0f;
                        fArr4[1] = 0.0f;
                        fArr4[2] = 0.0f;
                        fArr4[3] = 0.0f;
                        float[] fArr5 = this.q;
                        float f4 = (-f) * f2;
                        fArr5[0] = f4;
                        float f5 = height * f3;
                        fArr5[1] = f5;
                        fArr5[2] = 0.0f;
                        fArr5[3] = 1.0f;
                        Matrix.multiplyMV(fArr4, 0, this.p, 0, fArr5, 0);
                        Rect rect2 = this.s;
                        int i2 = ((Point) iPoint).x;
                        float[] fArr6 = this.r;
                        int i3 = (int) (i2 + fArr6[0]);
                        int i4 = ((Point) iPoint).y;
                        rect2.set(i3, (int) (i4 - fArr6[1]), (int) (i2 + fArr6[0]), (int) (i4 - fArr6[1]));
                        float[] fArr7 = this.q;
                        float f6 = f * (1.0f - f2);
                        fArr7[0] = f6;
                        fArr7[1] = f5;
                        fArr7[2] = 0.0f;
                        fArr7[3] = 1.0f;
                        Matrix.multiplyMV(this.r, 0, this.p, 0, fArr7, 0);
                        Rect rect3 = this.s;
                        float f7 = ((Point) iPoint).x;
                        float[] fArr8 = this.r;
                        rect3.union((int) (f7 + fArr8[0]), (int) (((Point) iPoint).y - fArr8[1]));
                        float[] fArr9 = this.q;
                        fArr9[0] = f6;
                        float f8 = (-height) * (1.0f - f3);
                        fArr9[1] = f8;
                        fArr9[2] = 0.0f;
                        fArr9[3] = 1.0f;
                        Matrix.multiplyMV(this.r, 0, this.p, 0, fArr9, 0);
                        Rect rect4 = this.s;
                        float f9 = ((Point) iPoint).x;
                        float[] fArr10 = this.r;
                        rect4.union((int) (f9 + fArr10[0]), (int) (((Point) iPoint).y - fArr10[1]));
                        float[] fArr11 = this.q;
                        fArr11[0] = f4;
                        fArr11[1] = f8;
                        fArr11[2] = 0.0f;
                        fArr11[3] = 1.0f;
                        Matrix.multiplyMV(this.r, 0, this.p, 0, fArr11, 0);
                        Rect rect5 = this.s;
                        float f10 = ((Point) iPoint).x;
                        float[] fArr12 = this.r;
                        rect5.union((int) (f10 + fArr12[0]), (int) (((Point) iPoint).y - fArr12[1]));
                        as asVar2 = this.k;
                        Rect rect6 = this.s;
                        asVar2.a(rect6.left, rect6.right, rect6.top, rect6.bottom);
                        this.i.a(this.j, this.l, d);
                    }
                }
                if (this.m == null) {
                    this.m = new IPoint();
                }
                IPoint iPoint2 = this.m;
                if (iPoint2 != null) {
                    ((Point) iPoint2).x = (int) mapConfig.getSX();
                    ((Point) this.m).y = (int) mapConfig.getSY();
                }
                ar arVar2 = this.o.get(0);
                synchronized (this.l) {
                    Iterator<MultiPointItem> it2 = this.l.iterator();
                    loop1: while (true) {
                        i = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                break loop1;
                            }
                            IPoint iPoint3 = it2.next().getIPoint();
                            if (iPoint3 != null) {
                                int i5 = ((Point) iPoint3).x;
                                IPoint iPoint4 = this.m;
                                int i6 = i5 - ((Point) iPoint4).x;
                                int i7 = ((Point) iPoint3).y - ((Point) iPoint4).y;
                                if (arVar2 != null && arVar2.b()) {
                                    if (!arVar2.d() && (avVar = this.n) != null) {
                                        arVar2.a(avVar.a());
                                    }
                                    fArr3 = this.H;
                                    int i8 = i * 3;
                                    fArr3[i8 + 0] = i6;
                                    fArr3[i8 + 1] = i7;
                                    fArr3[i8 + 2] = 0.0f;
                                    i++;
                                    if (i >= ar.a) {
                                        break;
                                    }
                                }
                            }
                        }
                        arVar2.a(fArr, fArr2, fArr3, this.d, this.e, sr, sc, i);
                    }
                }
                if (i > 0) {
                    arVar2.a(fArr, fArr2, this.H, this.d, this.e, sr, sc, i);
                }
            }
        } catch (Throwable th) {
            hn.c(th, "MultiPointOverlayDelegate", "draw");
        }
    }
}
