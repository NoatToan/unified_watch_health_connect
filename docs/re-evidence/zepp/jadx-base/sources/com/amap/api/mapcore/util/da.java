package com.amap.api.mapcore.util;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.interfaces.IGlOverlayLayer;
import com.amap.api.maps.model.BitmapDescriptor;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.PolylineOptions;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.interfaces.IOverlay;
import com.autonavi.base.amap.api.mapcore.overlays.IPolylineDelegate;
import com.autonavi.base.amap.mapcore.AMapNativeRenderer;
import com.autonavi.base.amap.mapcore.FPoint;
import com.autonavi.base.amap.mapcore.FPoint3;
import com.autonavi.base.amap.mapcore.FPointBounds;
import com.autonavi.base.amap.mapcore.MapConfig;
import com.autonavi.base.amap.mapcore.Rectangle;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class da implements IPolylineDelegate {
    private float K;
    private float L;
    private float M;
    private float N;
    private float[] Q;
    private int[] R;
    private int[] S;
    private PolylineOptions V;
    private df Z;
    private IGlOverlayLayer e;
    private String f;
    private FloatBuffer p;
    private List<IPoint> g = new ArrayList();
    private List<FPoint> h = new ArrayList();
    private List<LatLng> i = new ArrayList();
    private List<BitmapDescriptor> j = new ArrayList();
    private List<w> k = new ArrayList();
    private List<Integer> l = new ArrayList();
    private List<Integer> m = new ArrayList();
    private List<Integer> n = new ArrayList();
    private List<Integer> o = new ArrayList();
    private BitmapDescriptor q = null;
    private Object r = new Object();
    private boolean s = true;
    private boolean t = true;
    private boolean u = false;
    private boolean v = false;
    private boolean w = false;
    private boolean x = true;
    private boolean y = false;
    private boolean z = false;
    private boolean A = true;
    private int B = 0;
    private int C = 0;
    private float D = 1.0f;
    private int E = -16777216;
    private int F = 0;
    private int G = 0;
    private float H = 10.0f;
    private float I = 0.0f;
    private float J = 0.0f;
    private float O = 1.0f;
    private float P = 0.0f;
    private boolean T = false;
    private FPointBounds U = null;
    public Rect a = null;
    private int W = 0;
    private PolylineOptions.LineJoinType X = PolylineOptions.LineJoinType.LineJoinBevel;
    private PolylineOptions.LineCapType Y = PolylineOptions.LineCapType.LineCapRound;
    private boolean aa = false;
    private float ab = -1.0f;
    private float ac = -1.0f;
    private float ad = -1.0f;
    private int ae = -1;
    private List<IPoint> af = new ArrayList();
    private boolean ag = false;
    public int b = 0;
    public ArrayList<FPoint> c = new ArrayList<>();
    public long d = 0;

    public da(IGlOverlayLayer iGlOverlayLayer, PolylineOptions polylineOptions) {
        this.e = iGlOverlayLayer;
        setOptions(polylineOptions);
        try {
            this.f = getId();
        } catch (RemoteException e) {
            hn.c(e, "PolylineDelegateImp", "create");
            e.printStackTrace();
        }
    }

    private static void a(List<IPoint> list, List<IPoint> list2, double d) {
        if (list.size() != 3) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (i2 <= 10) {
            float f = i2;
            float f2 = f / 10.0f;
            IPoint iPointObtain = IPoint.obtain();
            double d2 = 1.0d - ((double) f2);
            double d3 = d2 * d2;
            double d4 = ((double) (2.0f * f2)) * d2;
            float f3 = f2 * f2;
            double d5 = (((double) ((Point) list.get(i)).x) * d3) + (((double) ((Point) list.get(1)).x) * d4 * d) + ((double) (((Point) list.get(2)).x * f3));
            double d6 = (((double) ((Point) list.get(i)).y) * d3) + (((double) ((Point) list.get(1)).y) * d4 * d) + ((double) (((Point) list.get(2)).y * f3));
            double d7 = d3 + (d4 * d) + ((double) f3);
            ((Point) iPointObtain).x = (int) (d5 / d7);
            ((Point) iPointObtain).y = (int) (d6 / d7);
            list2.add(iPointObtain);
            i2 = (int) (1.0f + f);
            i = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006c  */
    private void b(List<FPoint> list) throws RemoteException {
        int i;
        this.c.clear();
        int size = list.size();
        if (size < 2) {
            return;
        }
        int i2 = 0;
        FPoint fPoint = list.get(0);
        this.c.add(fPoint);
        int i3 = 1;
        while (true) {
            i = size - 1;
            if (i3 >= i) {
                break;
            }
            FPoint fPoint2 = list.get(i3);
            if (i3 == 1) {
                this.c.add(fPoint2);
                fPoint = fPoint2;
            } else if (((fPoint instanceof FPoint3) && (fPoint2 instanceof FPoint3) && ((FPoint3) fPoint).colorIndex != ((FPoint3) fPoint2).colorIndex) || Math.abs(((PointF) fPoint2).x - ((PointF) fPoint).x) >= this.P || Math.abs(((PointF) fPoint2).y - ((PointF) fPoint).y) >= this.P) {
                this.c.add(fPoint2);
                fPoint = fPoint2;
            } else {
                ArrayList<FPoint> arrayList = this.c;
                arrayList.set(arrayList.size() - 1, fPoint2);
            }
            i3++;
        }
        this.c.add(list.get(i));
        int size2 = this.c.size() * 3;
        this.b = size2;
        float[] fArr = this.Q;
        if (fArr == null || fArr.length < size2) {
            this.Q = new float[size2];
        }
        int i4 = this.B;
        if (i4 != 5 && i4 != 3 && i4 != 4) {
            for (FPoint fPoint3 : this.c) {
                float[] fArr2 = this.Q;
                int i5 = i2 * 3;
                fArr2[i5] = ((PointF) fPoint3).x;
                fArr2[i5 + 1] = ((PointF) fPoint3).y;
                fArr2[i5 + 2] = 0.0f;
                i2++;
            }
            return;
        }
        int[] iArr = new int[this.c.size()];
        ArrayList arrayList2 = new ArrayList();
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < size2 / 3; i8++) {
            FPoint3 fPoint4 = (FPoint3) this.c.get(i8);
            float[] fArr3 = this.Q;
            int i9 = i8 * 3;
            fArr3[i9] = ((PointF) fPoint4).x;
            fArr3[i9 + 1] = ((PointF) fPoint4).y;
            fArr3[i9 + 2] = 0.0f;
            int i10 = fPoint4.colorIndex;
            if (i8 == 0) {
                arrayList2.add(Integer.valueOf(i10));
                i6 = i10;
            } else {
                if (i10 != i6) {
                    if (i10 != -1) {
                        i6 = i10;
                    }
                    arrayList2.add(Integer.valueOf(i6));
                }
            }
            iArr[i7] = i8;
            i7++;
        }
        int[] iArr2 = new int[arrayList2.size()];
        this.R = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        this.n = arrayList2;
        this.o = arrayList2;
    }

    private static int c() {
        int[] iArr = {0};
        GLES20.glGenTextures(1, iArr, 0);
        return iArr[0];
    }

    private List<Integer> d(List<Integer> list) {
        int[] iArr = new int[list.size()];
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue = list.get(i3).intValue();
            if (i3 == 0 || iIntValue != i) {
                arrayList.add(Integer.valueOf(iIntValue));
                iArr[i2] = i3;
                i2++;
                i = iIntValue;
            }
        }
        int[] iArr2 = new int[arrayList.size()];
        this.R = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        return arrayList;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean calMapFPoint() throws RemoteException {
        if (this.ab == -1.0f && this.ac == -1.0f && this.ad == -1.0f) {
            a(this.g);
            return true;
        }
        a(this.af);
        return true;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean checkInBounds() {
        if (this.aa) {
            return true;
        }
        Rectangle geoRectangle = this.e.getMap().getMapConfig().getGeoRectangle();
        Rect rect = this.a;
        return rect == null || geoRectangle == null || geoRectangle.isOverlap(rect);
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IPolylineDelegate
    public final boolean contains(LatLng latLng) {
        int i;
        double dSqrt;
        float[] fArr = this.Q;
        int length = fArr.length;
        System.arraycopy(fArr, 0, new float[length], 0, fArr.length);
        if (length / 3 < 2) {
            return false;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (true) {
                float[] fArr2 = this.Q;
                if (i2 >= fArr2.length) {
                    break;
                }
                float f = fArr2[i2];
                int i3 = i2 + 1;
                arrayList.add(FPoint.obtain(f, fArr2[i3]));
                i2 = i3 + 1 + 1;
            }
            if (arrayList.size() <= 0) {
                return false;
            }
            double mapLenWithWin = this.e.getMap().getMapProjection().getMapLenWithWin(((int) this.H) / 4);
            double mapLenWithWin2 = this.e.getMap().getMapProjection().getMapLenWithWin(5);
            IPoint iPointObtain = IPoint.obtain();
            this.e.getMap().latlon2Geo(latLng.latitude, latLng.longitude, iPointObtain);
            FPoint fPointObtain = FPoint.obtain();
            this.e.getMap().geo2Map(((Point) iPointObtain).x, ((Point) iPointObtain).y, fPointObtain);
            iPointObtain.recycle();
            FPoint fPoint = null;
            int i4 = 0;
            for (i = 1; i4 < arrayList.size() - i; i = 1) {
                if (i4 == 0) {
                    fPoint = (FPoint) arrayList.get(i4);
                }
                int i5 = i4 + 1;
                FPoint fPoint2 = (FPoint) arrayList.get(i5);
                double d = ((PointF) fPointObtain).x;
                double d2 = ((PointF) fPointObtain).y;
                double d3 = mapLenWithWin2;
                double d4 = ((PointF) fPoint).x;
                double d5 = ((PointF) fPoint).y;
                FPoint fPoint3 = fPointObtain;
                double d6 = ((PointF) fPoint2).x;
                double d7 = ((PointF) fPoint2).y;
                double d8 = d6 - d4;
                double d9 = d - d4;
                double d10 = d7 - d5;
                double d11 = d2 - d5;
                double d12 = (d8 * d9) + (d10 * d11);
                if (d12 <= 0.0d) {
                    dSqrt = Math.sqrt((d9 * d9) + (d11 * d11));
                } else {
                    double d13 = (d8 * d8) + (d10 * d10);
                    if (d12 >= d13) {
                        double d14 = d - d6;
                        double d15 = d2 - d7;
                        dSqrt = Math.sqrt((d14 * d14) + (d15 * d15));
                    } else {
                        double d16 = d12 / d13;
                        double d17 = d - (d4 + (d8 * d16));
                        double d18 = (d5 + (d10 * d16)) - d2;
                        dSqrt = Math.sqrt((d17 * d17) + (d18 * d18));
                    }
                }
                if ((d3 + mapLenWithWin) - dSqrt >= 0.0d) {
                    arrayList.clear();
                    return true;
                }
                fPointObtain = fPoint3;
                fPoint = fPoint2;
                mapLenWithWin2 = d3;
                i4 = i5;
            }
            arrayList.clear();
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void destroy() {
        try {
            remove();
            List<w> list = this.k;
            if (list != null && list.size() > 0) {
                for (int i = 0; i < this.k.size(); i++) {
                    w wVar = this.k.get(i);
                    if (wVar != null) {
                        this.e.addRecycleTextureIds(wVar);
                        this.e.getMap().removeTextureItem(wVar.q());
                    }
                }
                this.k.clear();
            }
            if (this.Q != null) {
                this.Q = null;
            }
            FloatBuffer floatBuffer = this.p;
            if (floatBuffer != null) {
                floatBuffer.clear();
                this.p = null;
            }
            List<BitmapDescriptor> list2 = this.j;
            if (list2 != null && list2.size() > 0) {
                Iterator<BitmapDescriptor> it2 = this.j.iterator();
                while (it2.hasNext()) {
                    it2.next().recycle();
                }
            }
            synchronized (this) {
                BitmapDescriptor bitmapDescriptor = this.q;
                if (bitmapDescriptor != null) {
                    bitmapDescriptor.recycle();
                }
            }
            synchronized (this.m) {
                List<Integer> list3 = this.m;
                if (list3 != null) {
                    list3.clear();
                }
            }
            List<Integer> list4 = this.l;
            if (list4 != null) {
                synchronized (list4) {
                    this.l.clear();
                    this.l = null;
                }
            }
            List<LatLng> list5 = this.i;
            if (list5 != null) {
                list5.clear();
                this.i = null;
            }
            this.V = null;
        } catch (Throwable th) {
            hn.c(th, "PolylineDelegateImp", "destroy");
            th.printStackTrace();
            Log.d("destroy erro", "PolylineDelegateImp destroy");
        }
    }

    /* JADX WARN: Code duplicated, block: B:142:0x0244 A[Catch: all -> 0x02c3, TryCatch #2 {all -> 0x02c3, blocks: (B:140:0x023c, B:142:0x0244, B:143:0x0246, B:149:0x0252, B:150:0x0253, B:152:0x0259, B:153:0x025e, B:161:0x0283, B:165:0x028a, B:167:0x028e, B:171:0x02c2, B:154:0x025f, B:156:0x026a, B:159:0x0279, B:160:0x0282, B:144:0x0247, B:145:0x024d), top: B:322:0x023c, inners: #0, #12 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0253 A[Catch: all -> 0x02c3, PHI: r4
      0x0253: PHI (r4v59 java.util.List<com.autonavi.base.amap.mapcore.FPoint>) = 
      (r4v58 java.util.List<com.autonavi.base.amap.mapcore.FPoint>)
      (r4v63 java.util.List<com.autonavi.base.amap.mapcore.FPoint>)
     binds: [B:141:0x0242, B:146:0x024e] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x02c3, blocks: (B:140:0x023c, B:142:0x0244, B:143:0x0246, B:149:0x0252, B:150:0x0253, B:152:0x0259, B:153:0x025e, B:161:0x0283, B:165:0x028a, B:167:0x028e, B:171:0x02c2, B:154:0x025f, B:156:0x026a, B:159:0x0279, B:160:0x0282, B:144:0x0247, B:145:0x024d), top: B:322:0x023c, inners: #0, #12 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0259 A[Catch: all -> 0x02c3, TryCatch #2 {all -> 0x02c3, blocks: (B:140:0x023c, B:142:0x0244, B:143:0x0246, B:149:0x0252, B:150:0x0253, B:152:0x0259, B:153:0x025e, B:161:0x0283, B:165:0x028a, B:167:0x028e, B:171:0x02c2, B:154:0x025f, B:156:0x026a, B:159:0x0279, B:160:0x0282, B:144:0x0247, B:145:0x024d), top: B:322:0x023c, inners: #0, #12 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x026a A[Catch: all -> 0x02c0, TryCatch #0 {, blocks: (B:154:0x025f, B:156:0x026a, B:159:0x0279, B:160:0x0282), top: B:318:0x025f, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x0278  */
    /* JADX WARN: Code duplicated, block: B:163:0x0287  */
    /* JADX WARN: Code duplicated, block: B:164:0x0289  */
    /* JADX WARN: Code duplicated, block: B:167:0x028e A[Catch: all -> 0x02c3, TRY_LEAVE, TryCatch #2 {all -> 0x02c3, blocks: (B:140:0x023c, B:142:0x0244, B:143:0x0246, B:149:0x0252, B:150:0x0253, B:152:0x0259, B:153:0x025e, B:161:0x0283, B:165:0x028a, B:167:0x028e, B:171:0x02c2, B:154:0x025f, B:156:0x026a, B:159:0x0279, B:160:0x0282, B:144:0x0247, B:145:0x024d), top: B:322:0x023c, inners: #0, #12 }] */
    /* JADX WARN: Code duplicated, block: B:240:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:241:0x03c4 A[Catch: all -> 0x059e, TryCatch #17 {all -> 0x059e, blocks: (B:238:0x03b8, B:241:0x03c4, B:243:0x03cc, B:245:0x03d0, B:247:0x03d7, B:248:0x0424, B:250:0x0435, B:251:0x0437, B:257:0x0443, B:258:0x0444, B:260:0x044a, B:287:0x04d6, B:289:0x04de, B:291:0x04e2, B:293:0x04e9, B:294:0x052a, B:296:0x053d, B:297:0x053f, B:303:0x054b, B:304:0x054c, B:306:0x0552, B:252:0x0438, B:253:0x043e, B:298:0x0540, B:299:0x0546), top: B:344:0x01ca, inners: #1, #5 }] */
    /* JADX WARN: Code duplicated, block: B:248:0x0424 A[Catch: all -> 0x059e, TryCatch #17 {all -> 0x059e, blocks: (B:238:0x03b8, B:241:0x03c4, B:243:0x03cc, B:245:0x03d0, B:247:0x03d7, B:248:0x0424, B:250:0x0435, B:251:0x0437, B:257:0x0443, B:258:0x0444, B:260:0x044a, B:287:0x04d6, B:289:0x04de, B:291:0x04e2, B:293:0x04e9, B:294:0x052a, B:296:0x053d, B:297:0x053f, B:303:0x054b, B:304:0x054c, B:306:0x0552, B:252:0x0438, B:253:0x043e, B:298:0x0540, B:299:0x0546), top: B:344:0x01ca, inners: #1, #5 }] */
    /* JADX WARN: Code duplicated, block: B:250:0x0435 A[Catch: all -> 0x059e, TryCatch #17 {all -> 0x059e, blocks: (B:238:0x03b8, B:241:0x03c4, B:243:0x03cc, B:245:0x03d0, B:247:0x03d7, B:248:0x0424, B:250:0x0435, B:251:0x0437, B:257:0x0443, B:258:0x0444, B:260:0x044a, B:287:0x04d6, B:289:0x04de, B:291:0x04e2, B:293:0x04e9, B:294:0x052a, B:296:0x053d, B:297:0x053f, B:303:0x054b, B:304:0x054c, B:306:0x0552, B:252:0x0438, B:253:0x043e, B:298:0x0540, B:299:0x0546), top: B:344:0x01ca, inners: #1, #5 }] */
    /* JADX WARN: Code duplicated, block: B:260:0x044a A[Catch: all -> 0x059e, TRY_LEAVE, TryCatch #17 {all -> 0x059e, blocks: (B:238:0x03b8, B:241:0x03c4, B:243:0x03cc, B:245:0x03d0, B:247:0x03d7, B:248:0x0424, B:250:0x0435, B:251:0x0437, B:257:0x0443, B:258:0x0444, B:260:0x044a, B:287:0x04d6, B:289:0x04de, B:291:0x04e2, B:293:0x04e9, B:294:0x052a, B:296:0x053d, B:297:0x053f, B:303:0x054b, B:304:0x054c, B:306:0x0552, B:252:0x0438, B:253:0x043e, B:298:0x0540, B:299:0x0546), top: B:344:0x01ca, inners: #1, #5 }] */
    /* JADX WARN: Code duplicated, block: B:294:0x052a A[Catch: all -> 0x059e, TryCatch #17 {all -> 0x059e, blocks: (B:238:0x03b8, B:241:0x03c4, B:243:0x03cc, B:245:0x03d0, B:247:0x03d7, B:248:0x0424, B:250:0x0435, B:251:0x0437, B:257:0x0443, B:258:0x0444, B:260:0x044a, B:287:0x04d6, B:289:0x04de, B:291:0x04e2, B:293:0x04e9, B:294:0x052a, B:296:0x053d, B:297:0x053f, B:303:0x054b, B:304:0x054c, B:306:0x0552, B:252:0x0438, B:253:0x043e, B:298:0x0540, B:299:0x0546), top: B:344:0x01ca, inners: #1, #5 }] */
    /* JADX WARN: Code duplicated, block: B:296:0x053d A[Catch: all -> 0x059e, TryCatch #17 {all -> 0x059e, blocks: (B:238:0x03b8, B:241:0x03c4, B:243:0x03cc, B:245:0x03d0, B:247:0x03d7, B:248:0x0424, B:250:0x0435, B:251:0x0437, B:257:0x0443, B:258:0x0444, B:260:0x044a, B:287:0x04d6, B:289:0x04de, B:291:0x04e2, B:293:0x04e9, B:294:0x052a, B:296:0x053d, B:297:0x053f, B:303:0x054b, B:304:0x054c, B:306:0x0552, B:252:0x0438, B:253:0x043e, B:298:0x0540, B:299:0x0546), top: B:344:0x01ca, inners: #1, #5 }] */
    /* JADX WARN: Code duplicated, block: B:306:0x0552 A[Catch: all -> 0x059e, TRY_LEAVE, TryCatch #17 {all -> 0x059e, blocks: (B:238:0x03b8, B:241:0x03c4, B:243:0x03cc, B:245:0x03d0, B:247:0x03d7, B:248:0x0424, B:250:0x0435, B:251:0x0437, B:257:0x0443, B:258:0x0444, B:260:0x044a, B:287:0x04d6, B:289:0x04de, B:291:0x04e2, B:293:0x04e9, B:294:0x052a, B:296:0x053d, B:297:0x053f, B:303:0x054b, B:304:0x054c, B:306:0x0552, B:252:0x0438, B:253:0x043e, B:298:0x0540, B:299:0x0546), top: B:344:0x01ca, inners: #1, #5 }] */
    /* JADX WARN: Code duplicated, block: B:318:0x025f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x0438 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x0540 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x0247 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x0279 A[SYNTHETIC] */
    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final void draw(MapConfig mapConfig) throws RemoteException {
        long j;
        FPoint[] clipMapRect;
        List<FPoint> list;
        float[] fArr;
        int iL;
        List<FPoint> listA;
        FPoint[] clipMapRect2;
        float[] fArr2;
        int iL2;
        List<FPoint> listB;
        FPoint[] clipMapRect3;
        List<FPoint> listB2;
        int size;
        int[] iArr;
        int i;
        int[] iArr2;
        boolean z;
        int iIntValue;
        if (this.ag) {
            return;
        }
        synchronized (this.r) {
            List<IPoint> list2 = (this.ab == -1.0f && this.ac == -1.0f && this.ad == -1.0f) ? this.g : this.af;
            if (list2 != null && list2.size() != 0 && this.H > 0.0f) {
                if (this.e.getMap() == null) {
                    return;
                }
                int sx = (int) mapConfig.getSX();
                int sy = (int) mapConfig.getSY();
                int beyond180Mode = mapConfig.getGeoRectangle().getBeyond180Mode();
                int size2 = this.h.size();
                int size3 = list2.size();
                if (size2 == size3) {
                    for (int i2 = 0; i2 < size3; i2++) {
                        IPoint iPoint = list2.get(i2);
                        FPoint fPoint = this.h.get(i2);
                        ((PointF) fPoint).x = ((Point) iPoint).x - sx;
                        ((PointF) fPoint).y = ((Point) iPoint).y - sy;
                        if (this.aa && (beyond180Mode < 0 || mapConfig.getSX() < 1.34217728E8d)) {
                            ((PointF) fPoint).x -= 2.6843546E8f;
                        }
                    }
                } else {
                    this.h.clear();
                    int i3 = 0;
                    for (int i4 = 0; i4 < size3; i4++) {
                        IPoint iPoint2 = list2.get(i4);
                        FPoint3 fPoint3 = new FPoint3();
                        List<Integer> list3 = this.l;
                        if (list3 != null) {
                            synchronized (list3) {
                                if (this.ae <= 0) {
                                    List<Integer> list4 = this.l;
                                    if (list4 != null && list4.size() > i3) {
                                        fPoint3.setColorIndex(this.l.get(i3).intValue());
                                    }
                                } else {
                                    List<Integer> list5 = this.l;
                                    if (list5 != null) {
                                        int size4 = list5.size();
                                        int i5 = this.ae;
                                        if (size4 > i3 + i5) {
                                            fPoint3.setColorIndex(this.l.get(i5 + i3).intValue());
                                        }
                                    }
                                }
                            }
                        }
                        ((PointF) fPoint3).x = ((Point) iPoint2).x - sx;
                        ((PointF) fPoint3).y = ((Point) iPoint2).y - sy;
                        if (this.aa) {
                            if (beyond180Mode >= 0) {
                                j = 4728779608739020800L;
                                if (mapConfig.getSX() < 1.34217728E8d) {
                                }
                            } else {
                                j = 4728779608739020800L;
                            }
                            ((PointF) fPoint3).x -= 2.6843546E8f;
                        } else {
                            j = 4728779608739020800L;
                        }
                        this.h.add(fPoint3);
                        i3++;
                    }
                }
                if (this.x) {
                    calMapFPoint();
                    this.x = false;
                } else if (this.y) {
                    synchronized (this.r) {
                        int size5 = this.h.size();
                        synchronized (this.l) {
                            int size6 = this.l.size();
                            for (int i6 = 0; i6 < size5; i6++) {
                                if (size6 <= i6 || this.ae > 0) {
                                    int i7 = this.ae;
                                    if (size6 > i7 + i6 && i7 > 0) {
                                        ((FPoint3) this.h.get(i6)).setColorIndex(this.l.get(this.ae + i6).intValue());
                                    }
                                } else {
                                    ((FPoint3) this.h.get(i6)).setColorIndex(this.l.get(i6).intValue());
                                }
                            }
                        }
                    }
                }
                if (this.Q != null && this.F > 0) {
                    MapConfig mapConfig2 = this.e.getMap().getMapConfig();
                    float mapLenWithWin = this.e.getMap().getMapProjection().getMapLenWithWin((int) this.H);
                    int i8 = this.B;
                    if (i8 != 0) {
                        try {
                            if (i8 != 1) {
                                if (i8 != 2) {
                                    if (i8 == 3) {
                                        a(mapLenWithWin, mapConfig2);
                                    } else if (i8 == 4) {
                                        synchronized (this.m) {
                                            int[] iArr3 = new int[this.m.size()];
                                            for (int i9 = 0; i9 < this.m.size(); i9++) {
                                                iArr3[i9] = this.m.get(i9).intValue();
                                            }
                                        }
                                        FPoint[] clipMapRect4 = mapConfig2.getGeoRectangle().getClipMapRect();
                                        try {
                                            List<FPoint> list6 = this.h;
                                            if (a(clipMapRect4)) {
                                                synchronized (this.r) {
                                                    listB = er.b(clipMapRect4, this.h);
                                                }
                                                list6 = listB;
                                            }
                                            if (list6.size() >= 2) {
                                                b(list6);
                                                int size7 = this.o.size();
                                                int[] iArr4 = new int[size7];
                                                for (int i10 = 0; i10 < size7; i10++) {
                                                    iArr4[i10] = this.o.get(i10).intValue();
                                                }
                                                int[] iArr5 = this.R;
                                                if ((iArr5 != null) & true) {
                                                    AMapNativeRenderer.nativeDrawGradientColorLine(this.Q, this.b, mapLenWithWin, iArr4, size7, iArr5, iArr5.length, this.e.getMap().getLineTextureID(), this.e.getFinalMatrix(), this.Y.getTypeValue(), this.X.getTypeValue());
                                                }
                                            }
                                        } catch (Throwable th) {
                                            th.printStackTrace();
                                        }
                                    } else if (i8 == 5) {
                                        if (!this.A) {
                                            a(mapLenWithWin, mapConfig2);
                                        } else if (!this.ag) {
                                            if (this.w) {
                                                clipMapRect3 = mapConfig2.getGeoRectangle().getClipMapRect();
                                                listB2 = this.h;
                                                if (a(clipMapRect3)) {
                                                    synchronized (this.r) {
                                                        listB2 = er.b(clipMapRect3, this.h);
                                                        if (listB2.size() >= 2) {
                                                            b(listB2);
                                                            synchronized (this.n) {
                                                                size = this.n.size();
                                                                iArr = new int[size];
                                                                for (i = 0; i < size; i++) {
                                                                    iIntValue = this.n.get(i).intValue();
                                                                    if (iIntValue < 0) {
                                                                        iIntValue = 0;
                                                                    }
                                                                    iArr[i] = this.S[iIntValue];
                                                                }
                                                                iArr2 = this.R;
                                                                if (iArr2 != null) {
                                                                    z = true;
                                                                } else {
                                                                    z = false;
                                                                }
                                                                if (z & true) {
                                                                    AMapNativeRenderer.nativeDrawLineByMultiTextureID(this.Q, this.b, mapLenWithWin, iArr, this.D, size, iArr2, iArr2.length, 1.0f - this.O, this.e.getFinalMatrix(), this.Y.getTypeValue(), this.X.getTypeValue());
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (listB2.size() >= 2) {
                                                    b(listB2);
                                                    synchronized (this.n) {
                                                        size = this.n.size();
                                                        iArr = new int[size];
                                                        while (i < size) {
                                                            iIntValue = this.n.get(i).intValue();
                                                            if (iIntValue < 0) {
                                                                iIntValue = 0;
                                                            }
                                                            iArr[i] = this.S[iIntValue];
                                                        }
                                                        iArr2 = this.R;
                                                        if (iArr2 != null) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        if (z & true) {
                                                            AMapNativeRenderer.nativeDrawLineByMultiTextureID(this.Q, this.b, mapLenWithWin, iArr, this.D, size, iArr2, iArr2.length, 1.0f - this.O, this.e.getFinalMatrix(), this.Y.getTypeValue(), this.X.getTypeValue());
                                                        }
                                                    }
                                                }
                                            } else {
                                                try {
                                                    List<BitmapDescriptor> list7 = this.j;
                                                    if (list7 != null) {
                                                        this.S = new int[list7.size()];
                                                        boolean z2 = Build.VERSION.SDK_INT >= 12;
                                                        b();
                                                        Iterator<BitmapDescriptor> it2 = this.j.iterator();
                                                        int i11 = 0;
                                                        int iL3 = 0;
                                                        while (it2.hasNext()) {
                                                            w wVarA = a(z2, it2.next(), false);
                                                            if (wVarA != null) {
                                                                iL3 = wVarA.l();
                                                                this.D = wVarA.m();
                                                            }
                                                            this.S[i11] = iL3;
                                                            i11++;
                                                        }
                                                        this.w = true;
                                                    }
                                                    clipMapRect3 = mapConfig2.getGeoRectangle().getClipMapRect();
                                                    try {
                                                        listB2 = this.h;
                                                        if (a(clipMapRect3)) {
                                                            synchronized (this.r) {
                                                            }
                                                            listB2 = er.b(clipMapRect3, this.h);
                                                            if (listB2.size() >= 2) {
                                                                b(listB2);
                                                                synchronized (this.n) {
                                                                    size = this.n.size();
                                                                    iArr = new int[size];
                                                                    while (i < size) {
                                                                        iIntValue = this.n.get(i).intValue();
                                                                        if (iIntValue < 0) {
                                                                            iIntValue = 0;
                                                                        }
                                                                        iArr[i] = this.S[iIntValue];
                                                                    }
                                                                }
                                                                iArr2 = this.R;
                                                                if (iArr2 != null) {
                                                                    z = true;
                                                                } else {
                                                                    z = false;
                                                                }
                                                                if (z & true) {
                                                                    AMapNativeRenderer.nativeDrawLineByMultiTextureID(this.Q, this.b, mapLenWithWin, iArr, this.D, size, iArr2, iArr2.length, 1.0f - this.O, this.e.getFinalMatrix(), this.Y.getTypeValue(), this.X.getTypeValue());
                                                                }
                                                            }
                                                        } else if (listB2.size() >= 2) {
                                                            b(listB2);
                                                            synchronized (this.n) {
                                                                size = this.n.size();
                                                                iArr = new int[size];
                                                                while (i < size) {
                                                                    iIntValue = this.n.get(i).intValue();
                                                                    if (iIntValue < 0) {
                                                                        iIntValue = 0;
                                                                    }
                                                                    iArr[i] = this.S[iIntValue];
                                                                }
                                                                iArr2 = this.R;
                                                                if (iArr2 != null) {
                                                                    z = true;
                                                                } else {
                                                                    z = false;
                                                                }
                                                                if (z & true) {
                                                                    AMapNativeRenderer.nativeDrawLineByMultiTextureID(this.Q, this.b, mapLenWithWin, iArr, this.D, size, iArr2, iArr2.length, 1.0f - this.O, this.e.getFinalMatrix(), this.Y.getTypeValue(), this.X.getTypeValue());
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
                                                        th2.printStackTrace();
                                                    }
                                                } catch (Throwable th3) {
                                                    hn.c(th3, "MarkerDelegateImp", "loadtexture");
                                                }
                                            }
                                        }
                                    }
                                } else if (this.G == -1) {
                                    b(mapLenWithWin, mapConfig2);
                                } else if (this.w) {
                                    listA = this.h;
                                    if (this.e.getMap() != null) {
                                        if (mapConfig2.getChangeRatio() == 1.0d) {
                                            this.W = 0;
                                            clipMapRect2 = mapConfig2.getGeoRectangle().getClipMapRect();
                                            if (a(clipMapRect2)) {
                                                synchronized (this.r) {
                                                    listA = er.a(clipMapRect2, this.h);
                                                }
                                            }
                                            if (listA.size() >= 2) {
                                                b(listA);
                                                AMapNativeRenderer.nativeDrawLineByTextureID(this.Q, this.b, mapLenWithWin, this.e.getMap().getDottedLineTextureID(this.G), this.e.getMap().getLineTextureRatio(), this.L, this.M, this.N, this.K, 0.0f, true, true, false, this.e.getFinalMatrix(), this.Y.getTypeValue(), this.X.getTypeValue());
                                            }
                                        } else {
                                            this.W = 0;
                                            clipMapRect2 = mapConfig2.getGeoRectangle().getClipMapRect();
                                            if (a(clipMapRect2)) {
                                                synchronized (this.r) {
                                                    listA = er.a(clipMapRect2, this.h);
                                                }
                                            }
                                            if (listA.size() >= 2) {
                                                b(listA);
                                                AMapNativeRenderer.nativeDrawLineByTextureID(this.Q, this.b, mapLenWithWin, this.e.getMap().getDottedLineTextureID(this.G), this.e.getMap().getLineTextureRatio(), this.L, this.M, this.N, this.K, 0.0f, true, true, false, this.e.getFinalMatrix(), this.Y.getTypeValue(), this.X.getTypeValue());
                                            }
                                        }
                                    }
                                } else {
                                    synchronized (this) {
                                        try {
                                            BitmapDescriptor bitmapDescriptor = this.q;
                                            if (bitmapDescriptor != null) {
                                                w wVarA2 = a(Build.VERSION.SDK_INT >= 12, bitmapDescriptor, true);
                                                if (wVarA2 != null) {
                                                    iL2 = wVarA2.l();
                                                    this.D = wVarA2.m();
                                                } else {
                                                    iL2 = 0;
                                                }
                                                this.C = iL2;
                                                this.w = true;
                                            }
                                        } catch (Throwable th4) {
                                            hn.c(th4, "MarkerDelegateImp", "loadtexture");
                                        }
                                    }
                                    listA = this.h;
                                    if (this.e.getMap() != null) {
                                        if (mapConfig2.getChangeRatio() == 1.0d || (fArr2 = this.Q) == null) {
                                            this.W = 0;
                                            clipMapRect2 = mapConfig2.getGeoRectangle().getClipMapRect();
                                            if (a(clipMapRect2)) {
                                                synchronized (this.r) {
                                                }
                                                listA = er.a(clipMapRect2, this.h);
                                            }
                                            if (listA.size() >= 2) {
                                                b(listA);
                                                AMapNativeRenderer.nativeDrawLineByTextureID(this.Q, this.b, mapLenWithWin, this.e.getMap().getDottedLineTextureID(this.G), this.e.getMap().getLineTextureRatio(), this.L, this.M, this.N, this.K, 0.0f, true, true, false, this.e.getFinalMatrix(), this.Y.getTypeValue(), this.X.getTypeValue());
                                            }
                                        } else {
                                            int i12 = this.W + 1;
                                            this.W = i12;
                                            if (i12 > 2) {
                                                AMapNativeRenderer.nativeDrawLineByTextureID(fArr2, this.b, mapLenWithWin, this.e.getMap().getDottedLineTextureID(this.G), this.e.getMap().getLineTextureRatio(), this.L, this.M, this.N, this.K, 0.0f, true, true, false, this.e.getFinalMatrix(), this.Y.getTypeValue(), this.X.getTypeValue());
                                            } else {
                                                this.W = 0;
                                                clipMapRect2 = mapConfig2.getGeoRectangle().getClipMapRect();
                                                if (a(clipMapRect2)) {
                                                    synchronized (this.r) {
                                                        listA = er.a(clipMapRect2, this.h);
                                                    }
                                                }
                                                if (listA.size() >= 2) {
                                                    b(listA);
                                                    AMapNativeRenderer.nativeDrawLineByTextureID(this.Q, this.b, mapLenWithWin, this.e.getMap().getDottedLineTextureID(this.G), this.e.getMap().getLineTextureRatio(), this.L, this.M, this.N, this.K, 0.0f, true, true, false, this.e.getFinalMatrix(), this.Y.getTypeValue(), this.X.getTypeValue());
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (!this.A) {
                                b(mapLenWithWin, mapConfig2);
                            } else if (!this.w) {
                                synchronized (this) {
                                    try {
                                        BitmapDescriptor bitmapDescriptor2 = this.q;
                                        if (bitmapDescriptor2 != null) {
                                            w wVarA3 = a(Build.VERSION.SDK_INT >= 12, bitmapDescriptor2, true);
                                            if (wVarA3 != null) {
                                                iL = wVarA3.l();
                                                this.D = wVarA3.m();
                                            } else {
                                                iL = 0;
                                            }
                                            this.C = iL;
                                            this.w = true;
                                        }
                                    } catch (Throwable th5) {
                                        hn.c(th5, "MarkerDelegateImp", "loadtexture");
                                    }
                                }
                                if (mapConfig2.getChangeRatio() == 1.0d || (fArr = this.Q) == null) {
                                    this.W = 0;
                                    clipMapRect = mapConfig2.getGeoRectangle().getClipMapRect();
                                    list = this.h;
                                    if (a(clipMapRect)) {
                                        synchronized (this.r) {
                                            List<FPoint> listA2 = er.a(clipMapRect, this.h);
                                        }
                                        list = listA2;
                                    }
                                    if (list.size() >= 2) {
                                        b(list);
                                        AMapNativeRenderer.nativeDrawLineByTextureID(this.Q, this.b, mapLenWithWin, this.C, this.D, this.L, this.M, this.N, this.K, 1.0f - this.O, false, false, false, this.e.getFinalMatrix(), this.Y.getTypeValue(), this.X.getTypeValue());
                                    }
                                } else {
                                    int i13 = this.W + 1;
                                    this.W = i13;
                                    if (i13 > 2) {
                                        AMapNativeRenderer.nativeDrawLineByTextureID(fArr, this.b, mapLenWithWin, this.C, this.D, this.L, this.M, this.N, this.K, 1.0f - this.O, false, false, false, this.e.getFinalMatrix(), this.Y.getTypeValue(), this.X.getTypeValue());
                                    } else {
                                        this.W = 0;
                                        clipMapRect = mapConfig2.getGeoRectangle().getClipMapRect();
                                        list = this.h;
                                        if (a(clipMapRect)) {
                                            synchronized (this.r) {
                                                List<FPoint> listA3 = er.a(clipMapRect, this.h);
                                                list = listA3;
                                            }
                                        }
                                        if (list.size() >= 2) {
                                            b(list);
                                            AMapNativeRenderer.nativeDrawLineByTextureID(this.Q, this.b, mapLenWithWin, this.C, this.D, this.L, this.M, this.N, this.K, 1.0f - this.O, false, false, false, this.e.getFinalMatrix(), this.Y.getTypeValue(), this.X.getTypeValue());
                                        }
                                    }
                                }
                            } else if (mapConfig2.getChangeRatio() == 1.0d) {
                                this.W = 0;
                                clipMapRect = mapConfig2.getGeoRectangle().getClipMapRect();
                                list = this.h;
                                if (a(clipMapRect)) {
                                    synchronized (this.r) {
                                        List<FPoint> listA4 = er.a(clipMapRect, this.h);
                                        list = listA4;
                                    }
                                }
                                if (list.size() >= 2) {
                                    b(list);
                                    AMapNativeRenderer.nativeDrawLineByTextureID(this.Q, this.b, mapLenWithWin, this.C, this.D, this.L, this.M, this.N, this.K, 1.0f - this.O, false, false, false, this.e.getFinalMatrix(), this.Y.getTypeValue(), this.X.getTypeValue());
                                }
                            } else {
                                this.W = 0;
                                clipMapRect = mapConfig2.getGeoRectangle().getClipMapRect();
                                list = this.h;
                                if (a(clipMapRect)) {
                                    synchronized (this.r) {
                                        List<FPoint> listA5 = er.a(clipMapRect, this.h);
                                        list = listA5;
                                    }
                                }
                                if (list.size() >= 2) {
                                    b(list);
                                    AMapNativeRenderer.nativeDrawLineByTextureID(this.Q, this.b, mapLenWithWin, this.C, this.D, this.L, this.M, this.N, this.K, 1.0f - this.O, false, false, false, this.e.getFinalMatrix(), this.Y.getTypeValue(), this.X.getTypeValue());
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    } else {
                        b(mapLenWithWin, mapConfig2);
                    }
                }
                this.z = true;
            }
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean equalsRemote(IOverlay iOverlay) throws RemoteException {
        return equals(iOverlay) || iOverlay.getId().equals(getId());
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolyline
    public final int getColor() throws RemoteException {
        return this.E;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final String getId() throws RemoteException {
        if (this.f == null) {
            this.f = this.e.createId("Polyline");
        }
        return this.f;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolyline
    public final LatLng getNearestLatLng(LatLng latLng) {
        List<LatLng> list;
        if (latLng != null && (list = this.i) != null && list.size() != 0) {
            float fCalculateLineDistance = 0.0f;
            int i = 0;
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                try {
                    if (i2 == 0) {
                        fCalculateLineDistance = AMapUtils.calculateLineDistance(latLng, this.i.get(i2));
                    } else {
                        float fCalculateLineDistance2 = AMapUtils.calculateLineDistance(latLng, this.i.get(i2));
                        if (fCalculateLineDistance > fCalculateLineDistance2) {
                            i = i2;
                            fCalculateLineDistance = fCalculateLineDistance2;
                        }
                    }
                } catch (Throwable th) {
                    hn.c(th, "PolylineDelegateImp", "getNearestLatLng");
                    th.printStackTrace();
                }
            }
            return this.i.get(i);
        }
        return null;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolyline
    public final PolylineOptions getOptions() {
        return this.V;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolyline
    public final List<LatLng> getPoints() throws RemoteException {
        return this.i;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolyline
    public final float getShownRatio() {
        return this.ab;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolyline
    public final float getWidth() throws RemoteException {
        return this.H;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final float getZIndex() throws RemoteException {
        return this.I;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final int hashCodeRemote() throws RemoteException {
        return super.hashCode();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean isAboveMaskLayer() {
        return this.T;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolyline
    public final boolean isDottedLine() {
        return this.v;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IOverlayDelegate
    public final boolean isDrawFinish() {
        return this.z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolyline
    public final boolean isGeodesic() {
        return this.u;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final boolean isVisible() throws RemoteException {
        return this.s;
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IPolylineDelegate
    public final void reLoadTexture() {
        this.w = false;
        this.C = 0;
        this.D = 1.0f;
        int[] iArr = this.S;
        if (iArr != null) {
            Arrays.fill(iArr, 0);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void remove() throws RemoteException {
        this.ag = true;
        this.e.removeOverlay(getId());
        setVisible(false);
        this.e.getMap().setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setAboveMaskLayer(boolean z) {
        this.T = z;
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolyline
    public final void setColor(int i) {
        int i2 = this.B;
        if (i2 == 0 || i2 == 2) {
            this.E = i;
            this.K = Color.alpha(i) / 255.0f;
            this.L = Color.red(i) / 255.0f;
            this.M = Color.green(i) / 255.0f;
            this.N = Color.blue(i) / 255.0f;
            if (this.t) {
                if (this.v) {
                    this.B = 2;
                } else {
                    this.B = 0;
                }
            }
            this.e.getMap().setRunLowFrame(false);
        }
        this.V.color(i);
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IPolylineDelegate
    public final void setColorValues(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        try {
            synchronized (this.m) {
                try {
                    this.m.clear();
                    this.m.addAll(list);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable unused) {
        }
        if (list.size() <= 1) {
            setColor(list.get(0).intValue());
            return;
        }
        this.t = false;
        this.o = d(list);
        this.B = 3;
        this.e.getMap().setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolyline
    public final void setCustomTexture(BitmapDescriptor bitmapDescriptor) {
        long jNanoTime = System.nanoTime();
        if (jNanoTime - this.d < 16) {
            return;
        }
        this.d = jNanoTime;
        if (bitmapDescriptor == null) {
            return;
        }
        synchronized (this) {
            if (bitmapDescriptor.equals(this.q)) {
                return;
            }
            this.t = false;
            this.w = false;
            this.B = 1;
            this.q = bitmapDescriptor;
            this.e.getMap().setRunLowFrame(false);
            PolylineOptions polylineOptions = this.V;
            if (polylineOptions != null) {
                polylineOptions.setCustomTexture(bitmapDescriptor);
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0024 */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        return;
     */
    @Override // com.autonavi.amap.mapcore.interfaces.IPolyline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setCustomTextureIndex(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        synchronized (this.l) {
            try {
                this.l.clear();
                this.l.addAll(list);
                this.n = d(list);
                this.y = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IPolylineDelegate, com.autonavi.amap.mapcore.interfaces.IPolyline
    public final void setCustomTextureList(List<BitmapDescriptor> list) {
        c(list);
        setCustomTextureIndex(this.V.getCustomTextureIndex());
        reLoadTexture();
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolyline
    public final void setDottedLine(boolean z) {
        int i = this.B;
        if (i == 2 || i == 0) {
            this.v = z;
            if (z && this.t) {
                this.B = 2;
            } else if (!z && this.t) {
                this.B = 0;
            }
            this.e.getMap().setRunLowFrame(false);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolyline
    public final void setGeodesic(boolean z) throws RemoteException {
        this.u = z;
        this.e.getMap().setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolyline
    public final void setOptions(PolylineOptions polylineOptions) {
        if (polylineOptions == null) {
            return;
        }
        this.V = polylineOptions;
        try {
            setColor(polylineOptions.getColor());
            setGeodesic(polylineOptions.isGeodesic());
            setDottedLine(polylineOptions.isDottedLine());
            this.G = polylineOptions.getDottedLineType();
            setAboveMaskLayer(polylineOptions.isAboveMaskLayer());
            setVisible(polylineOptions.isVisible());
            setWidth(polylineOptions.getWidth());
            setZIndex(polylineOptions.getZIndex());
            this.A = polylineOptions.isUseTexture();
            this.e.getMap().setRunLowFrame(false);
            setTransparency(polylineOptions.getTransparency());
            this.Y = polylineOptions.getLineCapType();
            this.X = polylineOptions.getLineJoinType();
            if (polylineOptions.getColorValues() != null) {
                setColorValues(polylineOptions.getColorValues());
                useGradient(polylineOptions.isUseGradient());
            }
            if (polylineOptions.getCustomTexture() != null) {
                setCustomTexture(polylineOptions.getCustomTexture());
                reLoadTexture();
            }
            if (polylineOptions.getCustomTextureList() != null) {
                c(polylineOptions.getCustomTextureList());
                setCustomTextureIndex(polylineOptions.getCustomTextureIndex());
                reLoadTexture();
            }
            setPoints(polylineOptions.getPoints());
            setShownRatio(polylineOptions.getShownRatio());
            setShowRange(polylineOptions.getShownRangeBegin(), polylineOptions.getShownRangeEnd());
        } catch (RemoteException e) {
            hn.c(e, "PolylineDelegateImp", "setOptions");
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x01c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:35:0x01db  */
    /* JADX WARN: Code duplicated, block: B:36:0x01de  */
    /* JADX WARN: Code duplicated, block: B:40:0x01e8 A[Catch: all -> 0x0296, TryCatch #3 {all -> 0x0296, blocks: (B:34:0x01d7, B:38:0x01e4, B:40:0x01e8, B:42:0x01f3, B:64:0x0292, B:47:0x0219, B:49:0x0222, B:50:0x0229, B:51:0x0234, B:53:0x023a, B:55:0x0242, B:56:0x0249, B:57:0x0253, B:58:0x0262), top: B:79:0x01d7 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x01fd A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // com.autonavi.amap.mapcore.interfaces.IPolyline
    public final void setPoints(List<LatLng> list) throws RemoteException {
        da daVar;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        LatLng latLng;
        ArrayList arrayList2;
        LatLng latLng2;
        da daVar2 = this;
        try {
            daVar2.i = list;
            try {
                synchronized (daVar2.r) {
                    try {
                        ArrayList arrayList3 = new ArrayList();
                        LatLngBounds.Builder builder = LatLngBounds.builder();
                        if (list != null) {
                            LatLng latLng3 = null;
                            Iterator<LatLng> it2 = list.iterator();
                            z = false;
                            while (it2.hasNext()) {
                                LatLng next = it2.next();
                                if (daVar2.u) {
                                    if (latLng3 != null) {
                                        if (Math.abs(next.longitude - latLng3.longitude) < 0.01d) {
                                            IPoint iPointObtain = IPoint.obtain();
                                            daVar2.e.getMap().latlon2Geo(latLng3.latitude, latLng3.longitude, iPointObtain);
                                            arrayList3.add(iPointObtain);
                                            builder.include(latLng3);
                                            IPoint iPointObtain2 = IPoint.obtain();
                                            daVar2.e.getMap().latlon2Geo(next.latitude, next.longitude, iPointObtain2);
                                            arrayList3.add(iPointObtain2);
                                            builder.include(next);
                                        } else {
                                            double dAbs = (Math.abs(latLng3.longitude - next.longitude) * 3.141592653589793d) / 180.0d;
                                            LatLng latLng4 = new LatLng((next.latitude + latLng3.latitude) / 2.0d, (next.longitude + latLng3.longitude) / 2.0d, false);
                                            builder.include(latLng3).include(latLng4).include(next);
                                            int i = latLng4.latitude > 0.0d ? -1 : 1;
                                            IPoint iPointObtain3 = IPoint.obtain();
                                            daVar2.e.getMap().latlon2Geo(latLng3.latitude, latLng3.longitude, iPointObtain3);
                                            IPoint iPointObtain4 = IPoint.obtain();
                                            daVar2.e.getMap().latlon2Geo(next.latitude, next.longitude, iPointObtain4);
                                            IPoint iPointObtain5 = IPoint.obtain();
                                            daVar2.e.getMap().latlon2Geo(latLng4.latitude, latLng4.longitude, iPointObtain5);
                                            double d = dAbs * 0.5d;
                                            double dCos = Math.cos(d);
                                            double dHypot = Math.hypot(((Point) iPointObtain3).x - ((Point) iPointObtain4).x, ((Point) iPointObtain3).y - ((Point) iPointObtain4).y) * 0.5d * Math.tan(d);
                                            IPoint iPointObtain6 = IPoint.obtain();
                                            double d2 = ((Point) iPointObtain4).x - ((Point) iPointObtain3).x;
                                            z2 = z;
                                            ArrayList arrayList4 = arrayList3;
                                            latLng = next;
                                            double d3 = ((Point) iPointObtain4).y - ((Point) iPointObtain3).y;
                                            int iSqrt = (int) (((((double) i) * dHypot) / Math.sqrt(((d3 * d3) / (d2 * d2)) + 1.0d)) + ((double) ((Point) iPointObtain5).y));
                                            ((Point) iPointObtain6).y = iSqrt;
                                            ((Point) iPointObtain6).x = (int) (((((double) (((Point) iPointObtain5).y - iSqrt)) * d3) / d2) + ((double) ((Point) iPointObtain5).x));
                                            ArrayList arrayList5 = new ArrayList();
                                            arrayList5.add(iPointObtain3);
                                            arrayList5.add(iPointObtain6);
                                            arrayList5.add(iPointObtain4);
                                            arrayList2 = arrayList4;
                                            a(arrayList5, arrayList2, dCos);
                                            iPointObtain3.recycle();
                                            iPointObtain6.recycle();
                                            iPointObtain4.recycle();
                                        }
                                    }
                                    if (latLng != null) {
                                        if (z2) {
                                            latLng2 = latLng;
                                        } else {
                                            try {
                                                latLng2 = latLng;
                                                if (latLng2.longitude < -180.0d) {
                                                    this = this;
                                                    try {
                                                        this.aa = true;
                                                        z = true;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        throw th;
                                                    }
                                                }
                                                if (this.aa && latLng2.longitude > 180.0d) {
                                                    this.aa = true;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        }
                                        z = z2;
                                        if (this.aa) {
                                        }
                                    } else {
                                        this = this;
                                        latLng2 = latLng;
                                        z = z2;
                                    }
                                    latLng3 = latLng2;
                                    builder = builder;
                                    it2 = it2;
                                    da daVar3 = this;
                                    arrayList3 = arrayList2;
                                    daVar2 = daVar3;
                                } else {
                                    IPoint iPointObtain7 = IPoint.obtain();
                                    daVar2.e.getMap().latlon2Geo(next.latitude, next.longitude, iPointObtain7);
                                    arrayList3.add(iPointObtain7);
                                    builder.include(next);
                                }
                                arrayList2 = arrayList3;
                                z2 = z;
                                latLng = next;
                                if (latLng != null) {
                                    if (z2) {
                                        latLng2 = latLng;
                                        if (latLng2.longitude < -180.0d) {
                                            this = this;
                                            this.aa = true;
                                            z = true;
                                        }
                                        if (this.aa) {
                                        }
                                    } else {
                                        latLng2 = latLng;
                                    }
                                    z = z2;
                                    if (this.aa) {
                                    }
                                } else {
                                    this = this;
                                    latLng2 = latLng;
                                    z = z2;
                                }
                                latLng3 = latLng2;
                                builder = builder;
                                it2 = it2;
                                da daVar4 = this;
                                arrayList3 = arrayList2;
                                daVar2 = daVar4;
                            }
                            ArrayList arrayList6 = arrayList3;
                            daVar = daVar2;
                            arrayList = arrayList6;
                        } else {
                            daVar = daVar2;
                            arrayList = arrayList3;
                            z = false;
                        }
                        daVar.g = arrayList;
                        daVar.F = 0;
                        if (daVar.a == null) {
                            daVar.a = new Rect();
                        }
                        er.a(daVar.a);
                        for (IPoint iPoint : daVar.g) {
                            if (z) {
                                ((Point) iPoint).x += 268435456;
                            }
                            er.b(daVar.a, ((Point) iPoint).x, ((Point) iPoint).y);
                        }
                        daVar.a.sort();
                        daVar.e.getMap().setRunLowFrame(false);
                        daVar.x = true;
                        daVar.e.getMap().setRunLowFrame(false);
                        daVar.V.setPoints(list);
                        daVar.setShownRatio(daVar.V.getShownRatio());
                        daVar.setShowRange(daVar.V.getShownRangeBegin(), daVar.V.getShownRangeEnd());
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                hn.c(th, "PolylineDelegateImp", "setPoints");
                daVar2.g.clear();
                th.printStackTrace();
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolyline
    public final void setShowRange(float f, float f2) {
        double d;
        double d2;
        float f3 = f;
        float f4 = f2;
        this.ac = f3;
        this.ad = f4;
        synchronized (this.r) {
            int size = this.g.size();
            if (size < 2) {
                this.af.clear();
                return;
            }
            if (f3 > f4) {
                this.af.clear();
                Log.d("mapcore", "setShownRange return begin < end");
                return;
            }
            if (f3 < 0.0f || Float.isNaN(f)) {
                f3 = 0.0f;
            } else if (f3 >= size) {
                f3 = size - 1;
            }
            if (f4 < 0.0f) {
                f4 = 0.0f;
            } else if (f4 >= size || Float.isNaN(f2)) {
                f4 = size - 1;
            }
            if (this.u) {
                int size2 = this.i.size();
                if (size2 < 2) {
                    Log.d("mapcore", "setShownRatio return m_polylineOptions.m_latLngPoints.size() < MIN_POLYLINE_COUNT");
                    return;
                }
                float f5 = size2 - 1;
                float f6 = size - 1;
                f3 = (f3 / f5) * f6;
                f4 = (f4 / f5) * f6;
            }
            this.af.clear();
            int iFloor = (int) Math.floor(f3);
            int iFloor2 = (int) Math.floor(f4);
            double d3 = f3 - iFloor;
            double d4 = f4 - iFloor2;
            IPoint iPoint = null;
            IPoint iPoint2 = null;
            int i = iFloor;
            while (i < size) {
                IPoint iPoint3 = this.g.get(i);
                if (iFloor >= i) {
                    d = d3;
                    d2 = d4;
                    iPoint = iPoint3;
                    iPoint2 = iPoint;
                } else if (iFloor >= i || iFloor != i - 1) {
                    d = d3;
                    d2 = d4;
                    if (iFloor < i && iFloor2 >= i) {
                        this.af.add(iPoint3);
                        iPoint2 = iPoint3;
                    } else if (iFloor2 < i) {
                        IPoint iPoint4 = new IPoint();
                        int i2 = ((Point) iPoint2).x;
                        ((Point) iPoint4).x = (int) (((double) i2) + (((double) (((Point) iPoint3).x - i2)) * d2));
                        int i3 = ((Point) iPoint2).y;
                        ((Point) iPoint4).y = (int) (((double) i3) + (((double) (((Point) iPoint3).y - i3)) * d2));
                        this.af.add(iPoint4);
                        break;
                    }
                } else {
                    IPoint iPoint5 = new IPoint();
                    int i4 = ((Point) iPoint).x;
                    d = d3;
                    d2 = d4;
                    ((Point) iPoint5).x = (int) (((double) i4) + (((double) (((Point) iPoint3).x - i4)) * d));
                    int i5 = ((Point) iPoint).y;
                    ((Point) iPoint5).y = (int) (((double) i5) + (((double) (((Point) iPoint3).y - i5)) * d));
                    this.af.add(iPoint5);
                    if (iFloor2 == iFloor) {
                        IPoint iPoint6 = new IPoint();
                        int i6 = ((Point) iPoint).x;
                        ((Point) iPoint6).x = (int) (((double) i6) + (((double) (((Point) iPoint3).x - i6)) * d2));
                        int i7 = ((Point) iPoint).y;
                        ((Point) iPoint6).y = (int) (((double) i7) + (((double) (((Point) iPoint3).y - i7)) * d2));
                        this.af.add(iPoint6);
                        break;
                    }
                    this.af.add(iPoint3);
                    iPoint2 = iPoint3;
                }
                i++;
                d3 = d;
                d4 = d2;
            }
            if (iFloor >= 0) {
                this.ae = iFloor;
            }
            this.x = true;
            this.e.getMap().setRunLowFrame(false);
            this.V.setShownRange(this.ac, this.ad);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolyline
    public final void setShownRatio(float f) {
        this.ab = f;
        synchronized (this.r) {
            int size = this.g.size();
            if (size < 2) {
                this.af.clear();
                return;
            }
            float f2 = this.ab;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            } else if (f2 >= size) {
                f2 = size - 1;
            }
            if (this.u) {
                int size2 = this.i.size();
                if (size2 < 2) {
                    return;
                } else {
                    f2 = (f2 / (size2 - 1)) * (size - 1);
                }
            }
            this.af.clear();
            int iFloor = (int) Math.floor(f2);
            IPoint iPoint = null;
            int i = 0;
            while (i < size) {
                IPoint iPoint2 = this.g.get(i);
                if (i > iFloor) {
                    float f3 = f2 - iFloor;
                    if (f != 0.0f && iPoint != null) {
                        IPoint iPoint3 = new IPoint();
                        int i2 = ((Point) iPoint).x;
                        ((Point) iPoint3).x = (int) (i2 + ((((Point) iPoint2).x - i2) * f3));
                        int i3 = ((Point) iPoint).y;
                        ((Point) iPoint3).y = (int) (i3 + ((((Point) iPoint2).y - i3) * f3));
                        this.af.add(iPoint3);
                        break;
                    }
                    break;
                    break;
                }
                this.af.add(iPoint2);
                i++;
                iPoint = iPoint2;
            }
            this.x = true;
            this.e.getMap().setRunLowFrame(false);
            this.V.setShownRatio(f);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolyline
    public final void setTransparency(float f) {
        this.O = (float) Math.min(1.0d, Math.max(0.0d, f));
        this.e.getMap().setRunLowFrame(false);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setVisible(boolean z) throws RemoteException {
        this.s = z;
        this.e.getMap().setRunLowFrame(false);
        PolylineOptions polylineOptions = this.V;
        if (polylineOptions != null) {
            polylineOptions.visible(z);
        }
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IPolyline
    public final void setWidth(float f) throws RemoteException {
        this.H = f;
        this.e.getMap().setRunLowFrame(false);
        this.V.width(f);
    }

    @Override // com.autonavi.amap.mapcore.interfaces.IOverlay
    public final void setZIndex(float f) throws RemoteException {
        this.I = f;
        this.e.changeOverlayIndex();
        this.e.getMap().setRunLowFrame(false);
        PolylineOptions polylineOptions = this.V;
        if (polylineOptions != null) {
            polylineOptions.zIndex(f);
        }
    }

    @Override // com.autonavi.base.amap.api.mapcore.overlays.IPolylineDelegate
    public final void useGradient(boolean z) {
        List<Integer> list;
        if (!z || (list = this.m) == null || list.size() <= 1) {
            return;
        }
        this.B = 4;
        this.e.getMap().setRunLowFrame(false);
    }

    private void c(List<BitmapDescriptor> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        if (list.size() > 1) {
            this.t = false;
            this.B = 5;
            this.j = list;
            this.e.getMap().setRunLowFrame(false);
            return;
        }
        setCustomTexture(list.get(0));
    }

    private boolean a(List<IPoint> list) {
        synchronized (this.r) {
            FPointBounds.Builder builder = new FPointBounds.Builder();
            this.h.clear();
            this.z = false;
            float[] fArr = new float[list.size() * 3];
            this.Q = fArr;
            this.b = fArr.length;
            Iterator<IPoint> it2 = list.iterator();
            int i = 0;
            while (true) {
                boolean z = true;
                if (!it2.hasNext()) {
                    break;
                }
                IPoint next = it2.next();
                FPoint3 fPoint3 = new FPoint3();
                this.e.getMap().geo2Map(((Point) next).x, ((Point) next).y, fPoint3);
                float[] fArr2 = this.Q;
                int i2 = i * 3;
                fArr2[i2] = ((PointF) fPoint3).x;
                fArr2[i2 + 1] = ((PointF) fPoint3).y;
                fArr2[i2 + 2] = 0.0f;
                List<Integer> list2 = this.l;
                if (list2 != null) {
                    synchronized (list2) {
                        List<Integer> list3 = this.l;
                        if (list3 == null || list3.size() <= i) {
                            z = false;
                        } else {
                            int i3 = this.ae;
                            if (i3 <= 0) {
                                fPoint3.setColorIndex(this.l.get(i).intValue());
                            } else if (i3 + i < this.l.size()) {
                                fPoint3.setColorIndex(this.l.get(this.ae + i).intValue());
                            }
                        }
                    }
                    synchronized (this.m) {
                        if (!z) {
                            List<Integer> list4 = this.m;
                            if (list4 != null && list4.size() > i) {
                                int i4 = this.ae;
                                if (i4 <= 0) {
                                    fPoint3.setColorIndex(this.m.get(i).intValue());
                                } else if (i4 + i < this.m.size()) {
                                    fPoint3.setColorIndex(this.m.get(this.ae + i).intValue());
                                }
                            }
                        }
                    }
                }
                this.h.add(fPoint3);
                builder.include(fPoint3);
                i++;
            }
            this.U = builder.build();
            if (!this.A) {
                this.p = er.a(this.Q);
            }
            this.F = list.size();
            a();
        }
        return true;
    }

    private void b() {
        IGlOverlayLayer iGlOverlayLayer;
        List<w> list = this.k;
        if (list != null) {
            for (w wVar : list) {
                if (wVar != null && (iGlOverlayLayer = this.e) != null) {
                    iGlOverlayLayer.addRecycleTextureIds(wVar);
                }
            }
            this.k.clear();
        }
    }

    private void b(float f, MapConfig mapConfig) {
        float[] fArr;
        try {
            List<FPoint> listA = this.h;
            if (this.e.getMap() == null) {
                return;
            }
            if (mapConfig.getChangeRatio() == 1.0d && (fArr = this.Q) != null) {
                int i = this.W + 1;
                this.W = i;
                if (i > 2) {
                    AMapNativeRenderer.nativeDrawLineByTextureID(fArr, this.b, f, this.e.getMap().getLineTextureID(), this.e.getMap().getLineTextureRatio(), this.L, this.M, this.N, this.K, 0.0f, false, true, false, this.e.getFinalMatrix(), this.Y.getTypeValue(), this.X.getTypeValue());
                    return;
                }
            }
            this.W = 0;
            FPoint[] clipMapRect = mapConfig.getGeoRectangle().getClipMapRect();
            if (a(clipMapRect)) {
                synchronized (this.r) {
                    listA = er.a(clipMapRect, this.h);
                }
            }
            if (listA.size() >= 2) {
                b(listA);
                AMapNativeRenderer.nativeDrawLineByTextureID(this.Q, this.b, f, this.e.getMap().getLineTextureID(), this.e.getMap().getLineTextureRatio(), this.L, this.M, this.N, this.K, 0.0f, false, true, false, this.e.getFinalMatrix(), this.Y.getTypeValue(), this.X.getTypeValue());
            }
        } catch (Throwable unused) {
        }
    }

    private void a() {
        float mapPerPixelUnitLength = this.e.getMap().getMapConfig().getMapPerPixelUnitLength();
        if (this.F > 5000) {
            float f = this.J;
            if (f <= 12.0f) {
                float f2 = (this.H / 2.0f) + (f / 2.0f);
                if (f2 > 200.0f) {
                    f2 = 200.0f;
                }
                this.P = mapPerPixelUnitLength * f2;
                return;
            }
            this.P = mapPerPixelUnitLength * 10.0f;
            return;
        }
        this.P = mapPerPixelUnitLength * 2.0f;
    }

    private void a(w wVar) {
        if (wVar != null) {
            this.k.add(wVar);
            wVar.n();
        }
    }

    private w a(boolean z, BitmapDescriptor bitmapDescriptor, boolean z2) {
        if (z2) {
            b();
        }
        w wVar = null;
        if (z && (wVar = this.e.getTextureItem(bitmapDescriptor)) != null && wVar.l() > 0) {
            a(wVar);
            return wVar;
        }
        if (wVar == null) {
            wVar = new w(bitmapDescriptor, 0);
        }
        Bitmap bitmap = bitmapDescriptor.getBitmap();
        if (bitmap != null && !bitmap.isRecycled()) {
            int iC = c();
            if (z) {
                wVar.a(iC);
                this.e.getMap().addTextureItem(wVar);
            }
            a(wVar);
            er.a(iC, bitmap, true);
        }
        return wVar;
    }

    private void a(float f, MapConfig mapConfig) {
        List<FPoint> listB;
        synchronized (this.m) {
            int[] iArr = new int[this.m.size()];
            for (int i = 0; i < this.m.size(); i++) {
                iArr[i] = this.m.get(i).intValue();
            }
        }
        FPoint[] clipMapRect = mapConfig.getGeoRectangle().getClipMapRect();
        try {
            List<FPoint> list = this.h;
            if (a(clipMapRect)) {
                synchronized (this.r) {
                    listB = er.b(clipMapRect, this.h);
                }
                list = listB;
            }
            if (list.size() >= 2) {
                b(list);
                int size = this.o.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = this.o.get(i2).intValue();
                }
                if ((this.R != null) && true) {
                    float[] fArr = this.Q;
                    int i3 = this.b;
                    int lineTextureID = this.e.getMap().getLineTextureID();
                    int[] iArr3 = this.R;
                    AMapNativeRenderer.nativeDrawLineByMultiColor(fArr, i3, f, lineTextureID, iArr2, size, iArr3, iArr3.length, this.e.getFinalMatrix(), this.Y.getTypeValue(), this.X.getTypeValue());
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private boolean a(FPoint[] fPointArr) {
        this.J = this.e.getMap().getZoomLevel();
        a();
        if (this.J <= (this.g.size() > 10000 ? 7 : 3)) {
            return false;
        }
        try {
            if (this.e.getMap() != null) {
                return (er.a(this.U.northeast, fPointArr) && er.a(this.U.southwest, fPointArr)) ? false : true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public final void a(df dfVar) {
        this.Z = dfVar;
    }
}
