package com.amap.api.maps.model;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import androidx.collection.LongSparseArray;
import com.amap.api.mapcore.util.dv;
import com.amap.api.maps.AMapException;
import com.autonavi.amap.mapcore.DPoint;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class HeatmapTileProvider implements TileProvider {
    public static final Gradient DEFAULT_GRADIENT;
    private static final int[] DEFAULT_GRADIENT_COLORS;
    private static final float[] DEFAULT_GRADIENT_START_POINTS;
    private static final int DEFAULT_MAX_ZOOM = 11;
    private static final int DEFAULT_MIN_ZOOM = 5;
    public static final double DEFAULT_OPACITY = 0.6d;
    public static final int DEFAULT_RADIUS = 12;
    private static final int MAX_RADIUS = 50;
    private static final int MAX_ZOOM_LEVEL = 21;
    private static final int MIN_RADIUS = 10;
    private static final int SCREEN_SIZE = 1280;
    private static final int TILE_DIM = 256;
    private dv mBounds;
    private int[] mColorMap;
    private Collection<WeightedLatLng> mData;
    private Gradient mGradient;
    private double[] mKernel;
    private double[] mMaxIntensity;
    private double mOpacity;
    private int mRadius;
    private a mTree;

    public static class Builder {
        private Collection<WeightedLatLng> data;
        private int radius = 12;
        private Gradient gradient = HeatmapTileProvider.DEFAULT_GRADIENT;
        private double opacity = 0.6d;

        public HeatmapTileProvider build() {
            Collection<WeightedLatLng> collection = this.data;
            if (collection != null && collection.size() != 0) {
                try {
                    return new HeatmapTileProvider(this, (byte) 0);
                } catch (Throwable th) {
                    th.printStackTrace();
                    return null;
                }
            }
            try {
                throw new AMapException("No input points.");
            } catch (AMapException e) {
                Log.e("amap", e.getErrorMessage());
                e.printStackTrace();
                return null;
            }
        }

        public Builder data(Collection<LatLng> collection) {
            return weightedData(HeatmapTileProvider.a(collection));
        }

        public Builder gradient(Gradient gradient) {
            this.gradient = gradient;
            return this;
        }

        public Builder radius(int i) {
            this.radius = Math.max(10, Math.min(i, 50));
            return this;
        }

        public Builder transparency(double d) {
            this.opacity = Math.max(0.0d, Math.min(d, 1.0d));
            return this;
        }

        public Builder weightedData(Collection<WeightedLatLng> collection) {
            this.data = collection;
            return this;
        }
    }

    static {
        int[] iArr = {Color.rgb(102, 225, 0), Color.rgb(255, 0, 0)};
        DEFAULT_GRADIENT_COLORS = iArr;
        float[] fArr = {0.2f, 1.0f};
        DEFAULT_GRADIENT_START_POINTS = fArr;
        DEFAULT_GRADIENT = new Gradient(iArr, fArr);
    }

    public /* synthetic */ HeatmapTileProvider(Builder builder, byte b) {
        this(builder);
    }

    private double[] a(int i) {
        int i2;
        int i3 = 21;
        double[] dArr = new double[21];
        int i4 = 5;
        while (true) {
            if (i4 >= 11) {
                break;
            }
            Collection<WeightedLatLng> collection = this.mData;
            dv dvVar = this.mBounds;
            int iPow = (int) (Math.pow(2.0d, i4) * 1280.0d);
            double d = dvVar.a;
            double d2 = dvVar.c;
            double d3 = dvVar.b;
            double d4 = d2 - d;
            double d5 = dvVar.d - d3;
            if (d4 <= d5) {
                d4 = d5;
            }
            double d6 = ((double) ((int) (((double) (iPow / (i * 2))) + 0.5d))) / d4;
            LongSparseArray longSparseArray = new LongSparseArray();
            Iterator<WeightedLatLng> it2 = collection.iterator();
            double dDoubleValue = 0.0d;
            while (it2.hasNext()) {
                WeightedLatLng next = it2.next();
                int i5 = i4;
                int i6 = (int) ((next.getPoint().x - d) * d6);
                int i7 = (int) ((next.getPoint().y - d3) * d6);
                long j = i6;
                LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j);
                if (longSparseArray2 == null) {
                    longSparseArray2 = new LongSparseArray();
                    longSparseArray.put(j, longSparseArray2);
                }
                long j2 = i7;
                Double dValueOf = (Double) longSparseArray2.get(j2);
                if (dValueOf == null) {
                    dValueOf = Double.valueOf(0.0d);
                }
                double d7 = d6;
                Iterator<WeightedLatLng> it3 = it2;
                Double dValueOf2 = Double.valueOf(dValueOf.doubleValue() + next.intensity);
                longSparseArray2.put(j2, dValueOf2);
                if (dValueOf2.doubleValue() > dDoubleValue) {
                    dDoubleValue = dValueOf2.doubleValue();
                }
                it2 = it3;
                i4 = i5;
                d6 = d7;
            }
            int i8 = i4;
            dArr[i8] = dDoubleValue;
            if (i8 == 5) {
                for (int i9 = 0; i9 < i8; i9++) {
                    dArr[i9] = dArr[i8];
                }
            }
            i4 = i8 + 1;
            i3 = 21;
        }
        for (i2 = 11; i2 < i3; i2++) {
            dArr[i2] = dArr[10];
        }
        return dArr;
    }

    private void b(Collection<WeightedLatLng> collection) {
        try {
            ArrayList arrayList = new ArrayList();
            for (WeightedLatLng weightedLatLng : collection) {
                double d = weightedLatLng.latLng.latitude;
                if (d < 85.0d && d > -85.0d) {
                    arrayList.add(weightedLatLng);
                }
            }
            this.mData = arrayList;
            dv dvVarC = c(arrayList);
            this.mBounds = dvVarC;
            this.mTree = new a(dvVarC);
            Iterator<WeightedLatLng> it2 = this.mData.iterator();
            while (it2.hasNext()) {
                this.mTree.a(it2.next());
            }
            this.mMaxIntensity = a(this.mRadius);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static dv c(Collection<WeightedLatLng> collection) {
        Iterator<WeightedLatLng> it2 = collection.iterator();
        WeightedLatLng next = it2.next();
        double d = next.getPoint().x;
        double d2 = next.getPoint().x;
        double d3 = d;
        double d4 = d2;
        double d5 = next.getPoint().y;
        double d6 = next.getPoint().y;
        while (it2.hasNext()) {
            WeightedLatLng next2 = it2.next();
            double d7 = next2.getPoint().x;
            double d8 = next2.getPoint().y;
            if (d7 < d3) {
                d3 = d7;
            }
            if (d7 > d4) {
                d4 = d7;
            }
            if (d8 < d5) {
                d5 = d8;
            }
            if (d8 > d6) {
                d6 = d8;
            }
        }
        return new dv(d3, d4, d5, d6);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:14:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:16:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:18:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:21:0x00e3 A[LOOP:0: B:19:0x00dd->B:21:0x00e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0111 A[LOOP:1: B:23:0x010b->B:25:0x0111, LOOP_END] */
    @Override // com.amap.api.maps.model.TileProvider
    public Tile getTile(int i, int i2, int i3) {
        double d;
        double d2;
        dv dvVar;
        dv dvVar2;
        Collection<WeightedLatLng> collection;
        Collection<WeightedLatLng> collectionA;
        double[][] dArr;
        Iterator<WeightedLatLng> it2;
        Iterator<WeightedLatLng> it3;
        double dPow = 1.0d / Math.pow(2.0d, i3);
        int i4 = this.mRadius;
        double d3 = (((double) i4) * dPow) / 256.0d;
        double d4 = ((2.0d * d3) + dPow) / ((double) ((i4 * 2) + 256));
        double d5 = (((double) i) * dPow) - d3;
        double d6 = (((double) (i + 1)) * dPow) + d3;
        double d7 = (((double) i2) * dPow) - d3;
        double d8 = (((double) (i2 + 1)) * dPow) + d3;
        Collection<WeightedLatLng> arrayList = new ArrayList<>();
        if (d5 >= 0.0d) {
            d = 1.0d;
            if (d6 > 1.0d) {
                arrayList = this.mTree.a(new dv(0.0d, d6 - 1.0d, d7, d8));
            } else {
                d2 = 0.0d;
            }
            dvVar = new dv(d5, d6, d7, d8);
            dvVar2 = this.mBounds;
            collection = arrayList;
            if (!dvVar.a(new dv(dvVar2.a - d3, dvVar2.c + d3, dvVar2.b - d3, dvVar2.d + d3))) {
                return TileProvider.NO_TILE;
            }
            collectionA = this.mTree.a(dvVar);
            if (collectionA.isEmpty()) {
                return TileProvider.NO_TILE;
            }
            int i5 = this.mRadius;
            dArr = (double[][]) Array.newInstance((Class<?>) double.class, (i5 * 2) + 256, (i5 * 2) + 256);
            for (it2 = collectionA.iterator(); it2.hasNext(); it2 = it2) {
                WeightedLatLng next = it2.next();
                DPoint point = next.getPoint();
                int i6 = (int) ((point.x - d5) / d4);
                int i7 = (int) ((point.y - d7) / d4);
                double[] dArr2 = dArr[i6];
                dArr2[i7] = dArr2[i7] + next.intensity;
            }
            for (it3 = collection.iterator(); it3.hasNext(); it3 = it3) {
                WeightedLatLng next2 = it3.next();
                DPoint point2 = next2.getPoint();
                int i8 = (int) (((point2.x + d2) - d5) / d4);
                int i9 = (int) ((point2.y - d7) / d4);
                double[] dArr3 = dArr[i8];
                dArr3[i9] = dArr3[i9] + next2.intensity;
            }
            Bitmap bitmapA = a(a(dArr, this.mKernel), this.mColorMap, this.mMaxIntensity[i3]);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapA.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return Tile.obtain(256, 256, byteArrayOutputStream.toByteArray());
        }
        d = -1.0d;
        arrayList = this.mTree.a(new dv(d5 + 1.0d, 1.0d, d7, d8));
        d2 = d;
        dvVar = new dv(d5, d6, d7, d8);
        dvVar2 = this.mBounds;
        collection = arrayList;
        if (!dvVar.a(new dv(dvVar2.a - d3, dvVar2.c + d3, dvVar2.b - d3, dvVar2.d + d3))) {
            return TileProvider.NO_TILE;
        }
        collectionA = this.mTree.a(dvVar);
        if (collectionA.isEmpty()) {
            return TileProvider.NO_TILE;
        }
        int i10 = this.mRadius;
        dArr = (double[][]) Array.newInstance((Class<?>) double.class, (i10 * 2) + 256, (i10 * 2) + 256);
        while (it2.hasNext()) {
            WeightedLatLng next3 = it2.next();
            DPoint point3 = next3.getPoint();
            int i11 = (int) ((point3.x - d5) / d4);
            int i12 = (int) ((point3.y - d7) / d4);
            double[] dArr4 = dArr[i11];
            dArr4[i12] = dArr4[i12] + next3.intensity;
        }
        while (it3.hasNext()) {
            WeightedLatLng next4 = it3.next();
            DPoint point4 = next4.getPoint();
            int i13 = (int) (((point4.x + d2) - d5) / d4);
            int i14 = (int) ((point4.y - d7) / d4);
            double[] dArr5 = dArr[i13];
            dArr5[i14] = dArr5[i14] + next4.intensity;
        }
        Bitmap bitmapA2 = a(a(dArr, this.mKernel), this.mColorMap, this.mMaxIntensity[i3]);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        bitmapA2.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream2);
        return Tile.obtain(256, 256, byteArrayOutputStream2.toByteArray());
    }

    @Override // com.amap.api.maps.model.TileProvider
    public int getTileHeight() {
        return 256;
    }

    @Override // com.amap.api.maps.model.TileProvider
    public int getTileWidth() {
        return 256;
    }

    private HeatmapTileProvider(Builder builder) {
        this.mData = builder.data;
        this.mRadius = builder.radius;
        Gradient gradient = builder.gradient;
        this.mGradient = gradient;
        if (gradient == null || !gradient.isAvailable()) {
            this.mGradient = DEFAULT_GRADIENT;
        }
        this.mOpacity = builder.opacity;
        int i = this.mRadius;
        this.mKernel = a(i, ((double) i) / 3.0d);
        Gradient gradient2 = this.mGradient;
        this.mGradient = gradient2;
        this.mColorMap = gradient2.generateColorMap(this.mOpacity);
        b(this.mData);
    }

    private static double[] a(int i, double d) {
        double[] dArr = new double[(i * 2) + 1];
        for (int i2 = -i; i2 <= i; i2++) {
            dArr[i2 + i] = Math.exp(((double) ((-i2) * i2)) / ((2.0d * d) * d));
        }
        return dArr;
    }

    private static double[][] a(double[][] dArr, double[] dArr2) {
        int iFloor = (int) Math.floor(((double) dArr2.length) / 2.0d);
        int length = dArr.length;
        int i = length - (iFloor * 2);
        int i2 = 1;
        int i3 = (iFloor + i) - 1;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) double.class, length, length);
        int i4 = 0;
        while (true) {
            double d = 0.0d;
            if (i4 >= length) {
                break;
            }
            int i5 = 0;
            while (i5 < length) {
                double d2 = dArr[i4][i5];
                if (d2 != d) {
                    int i6 = i4 + iFloor;
                    if (i3 < i6) {
                        i6 = i3;
                    }
                    int i7 = i6 + 1;
                    int i8 = i4 - iFloor;
                    for (int i9 = iFloor > i8 ? iFloor : i8; i9 < i7; i9++) {
                        double[] dArr4 = dArr3[i9];
                        dArr4[i5] = dArr4[i5] + (dArr2[i9 - i8] * d2);
                    }
                }
                i5++;
                d = 0.0d;
            }
            i4++;
        }
        double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) double.class, i, i);
        int i10 = iFloor;
        while (i10 < i3 + 1) {
            int i11 = 0;
            while (i11 < length) {
                double d3 = dArr3[i10][i11];
                if (d3 != 0.0d) {
                    int i12 = i11 + iFloor;
                    if (i3 < i12) {
                        i12 = i3;
                    }
                    int i13 = i12 + i2;
                    int i14 = i11 - iFloor;
                    for (int i15 = iFloor > i14 ? iFloor : i14; i15 < i13; i15++) {
                        double[] dArr6 = dArr5[i10 - iFloor];
                        int i16 = i15 - iFloor;
                        dArr6[i16] = dArr6[i16] + (dArr2[i15 - i14] * d3);
                    }
                }
                i11++;
                i2 = 1;
            }
            i10++;
            i2 = 1;
        }
        return dArr5;
    }

    private static Bitmap a(double[][] dArr, int[] iArr, double d) {
        int i = iArr[iArr.length - 1];
        double length = ((double) (iArr.length - 1)) / d;
        int length2 = dArr.length;
        int[] iArr2 = new int[length2 * length2];
        for (int i2 = 0; i2 < length2; i2++) {
            for (int i3 = 0; i3 < length2; i3++) {
                double d2 = dArr[i3][i2];
                int i4 = (i2 * length2) + i3;
                int i5 = (int) (d2 * length);
                if (d2 != 0.0d) {
                    if (i5 < iArr.length) {
                        iArr2[i4] = iArr[i5];
                    } else {
                        iArr2[i4] = i;
                    }
                } else {
                    iArr2[i4] = 0;
                }
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(length2, length2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr2, 0, length2, 0, 0, length2, length2);
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Collection a(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new WeightedLatLng((LatLng) it2.next()));
        }
        return arrayList;
    }
}
