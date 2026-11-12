package com.amap.api.maps.model;

import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.collection.LongSparseArray;
import com.amap.api.maps.AMapException;
import com.autonavi.amap.mapcore.DPoint;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import defpackage.wks;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class HeatmapTileProvider implements TileProvider {
    public static final Gradient DEFAULT_GRADIENT;
    private static final int[] DEFAULT_GRADIENT_COLORS;
    private static final float[] DEFAULT_GRADIENT_START_POINTS;
    private static final int DEFAULT_MAX_ZOOM = 11;
    private static final int DEFAULT_MIN_ZOOM = 5;
    public static final double DEFAULT_OPACITY = 0.6d;
    public static final int DEFAULT_RADIUS = 12;
    private static final int MAX_RADIUS = 200;
    private static final int MAX_ZOOM_LEVEL = 21;
    private static final int MIN_RADIUS = 10;
    private static final int SCREEN_SIZE = 1280;
    private static final int TILE_DIM = 256;
    private wks mBounds;
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
                e.getErrorMessage();
                e.printStackTrace();
                return null;
            }
        }

        public Builder data(Collection<LatLng> collection) {
            return weightedData(HeatmapTileProvider.c(collection));
        }

        public Builder gradient(Gradient gradient) {
            this.gradient = gradient;
            return this;
        }

        public Builder radius(int i) {
            this.radius = Math.max(10, Math.min(i, 200));
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
        int[] iArr = {Color.rgb(102, SportReportBaseParser.ReportType.maxFreq, 0), Color.rgb(255, 0, 0)};
        DEFAULT_GRADIENT_COLORS = iArr;
        float[] fArr = {0.2f, 1.0f};
        DEFAULT_GRADIENT_START_POINTS = fArr;
        DEFAULT_GRADIENT = new Gradient(iArr, fArr);
    }

    public /* synthetic */ HeatmapTileProvider(Builder builder, byte b2) {
        this(builder);
    }

    private static double a(Collection<WeightedLatLng> collection, wks wksVar, int i, int i2) {
        double d = wksVar.f38075a;
        double d2 = wksVar.c;
        double d3 = wksVar.f38076b;
        double d4 = d2 - d;
        double d5 = wksVar.d - d3;
        if (d4 <= d5) {
            d4 = d5;
        }
        double d6 = ((double) ((int) (((double) (i2 / (i * 2))) + 0.5d))) / d4;
        LongSparseArray longSparseArray = new LongSparseArray();
        double d7 = 0.0d;
        for (WeightedLatLng weightedLatLng : collection) {
            double d8 = weightedLatLng.getPoint().x;
            int i3 = (int) ((weightedLatLng.getPoint().y - d3) * d6);
            long j = (int) ((d8 - d) * d6);
            LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j);
            if (longSparseArray2 == null) {
                longSparseArray2 = new LongSparseArray();
                longSparseArray.put(j, longSparseArray2);
            }
            long j2 = i3;
            Double dValueOf = (Double) longSparseArray2.get(j2);
            if (dValueOf == null) {
                dValueOf = Double.valueOf(0.0d);
            }
            LongSparseArray longSparseArray3 = longSparseArray;
            double d9 = d;
            double dDoubleValue = dValueOf.doubleValue() + weightedLatLng.intensity;
            longSparseArray2.put(j2, Double.valueOf(dDoubleValue));
            if (dDoubleValue > d7) {
                d7 = dDoubleValue;
            }
            longSparseArray = longSparseArray3;
            d = d9;
        }
        return d7;
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
            wks wksVarD = d(arrayList);
            this.mBounds = wksVarD;
            this.mTree = new a(wksVarD);
            Iterator<WeightedLatLng> it = this.mData.iterator();
            while (it.hasNext()) {
                this.mTree.a(it.next());
            }
            this.mMaxIntensity = a(this.mRadius);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Collection<WeightedLatLng> c(Collection<LatLng> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new WeightedLatLng(it.next()));
        }
        return arrayList;
    }

    private static wks d(Collection<WeightedLatLng> collection) {
        Iterator<WeightedLatLng> it = collection.iterator();
        WeightedLatLng next = it.next();
        double d = next.getPoint().x;
        double d2 = next.getPoint().x;
        double d3 = d;
        double d4 = d2;
        double d5 = next.getPoint().y;
        double d6 = next.getPoint().y;
        while (it.hasNext()) {
            WeightedLatLng next2 = it.next();
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
        return new wks(d3, d4, d5, d6);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:14:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:16:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:18:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:21:0x00d7 A[LOOP:0: B:19:0x00d1->B:21:0x00d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0105 A[LOOP:1: B:23:0x00ff->B:25:0x0105, LOOP_END] */
    @Override // com.amap.api.maps.model.TileProvider
    public Tile getTile(int i, int i2, int i3) {
        double d;
        double d2;
        wks wksVar;
        wks wksVar2;
        Collection<WeightedLatLng> collection;
        Collection<WeightedLatLng> collectionA;
        double[][] dArr;
        Iterator<WeightedLatLng> it;
        Iterator<WeightedLatLng> it2;
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
                arrayList = this.mTree.a(new wks(0.0d, d6 - 1.0d, d7, d8));
            } else {
                d2 = 0.0d;
            }
            wksVar = new wks(d5, d6, d7, d8);
            wksVar2 = this.mBounds;
            collection = arrayList;
            if (!wksVar.d(new wks(wksVar2.f38075a - d3, wksVar2.c + d3, wksVar2.f38076b - d3, wksVar2.d + d3))) {
                return TileProvider.NO_TILE;
            }
            collectionA = this.mTree.a(wksVar);
            if (collectionA.isEmpty()) {
                return TileProvider.NO_TILE;
            }
            int i5 = this.mRadius;
            dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, (i5 * 2) + 256, (i5 * 2) + 256);
            for (it = collectionA.iterator(); it.hasNext(); it = it) {
                WeightedLatLng next = it.next();
                DPoint point = next.getPoint();
                int i6 = (int) ((point.x - d5) / d4);
                int i7 = (int) ((point.y - d7) / d4);
                double[] dArr2 = dArr[i6];
                dArr2[i7] = dArr2[i7] + next.intensity;
            }
            for (it2 = collection.iterator(); it2.hasNext(); it2 = it2) {
                WeightedLatLng next2 = it2.next();
                DPoint point2 = next2.getPoint();
                int i8 = (int) (((point2.x + d2) - d5) / d4);
                int i9 = (int) ((point2.y - d7) / d4);
                double[] dArr3 = dArr[i8];
                dArr3[i9] = dArr3[i9] + next2.intensity;
            }
            return a(a(a(dArr, this.mKernel), this.mColorMap, this.mMaxIntensity[i3]));
        }
        arrayList = this.mTree.a(new wks(d5 + 1.0d, 1.0d, d7, d8));
        d = -1.0d;
        d2 = d;
        wksVar = new wks(d5, d6, d7, d8);
        wksVar2 = this.mBounds;
        collection = arrayList;
        if (!wksVar.d(new wks(wksVar2.f38075a - d3, wksVar2.c + d3, wksVar2.f38076b - d3, wksVar2.d + d3))) {
            return TileProvider.NO_TILE;
        }
        collectionA = this.mTree.a(wksVar);
        if (collectionA.isEmpty()) {
            return TileProvider.NO_TILE;
        }
        int i10 = this.mRadius;
        dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, (i10 * 2) + 256, (i10 * 2) + 256);
        while (it.hasNext()) {
            WeightedLatLng next3 = it.next();
            DPoint point3 = next3.getPoint();
            int i11 = (int) ((point3.x - d5) / d4);
            int i12 = (int) ((point3.y - d7) / d4);
            double[] dArr4 = dArr[i11];
            dArr4[i12] = dArr4[i12] + next3.intensity;
        }
        while (it2.hasNext()) {
            WeightedLatLng next4 = it2.next();
            DPoint point4 = next4.getPoint();
            int i13 = (int) (((point4.x + d2) - d5) / d4);
            int i14 = (int) ((point4.y - d7) / d4);
            double[] dArr5 = dArr[i13];
            dArr5[i14] = dArr5[i14] + next4.intensity;
        }
        return a(a(a(dArr, this.mKernel), this.mColorMap, this.mMaxIntensity[i3]));
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
        a(this.mGradient);
        b(this.mData);
    }

    private void a(Gradient gradient) {
        this.mGradient = gradient;
        this.mColorMap = gradient.generateColorMap(this.mOpacity);
    }

    private double[] a(int i) {
        int i2;
        double[] dArr = new double[21];
        int i3 = 5;
        while (true) {
            if (i3 >= 11) {
                break;
            }
            dArr[i3] = a(this.mData, this.mBounds, i, (int) (Math.pow(2.0d, i3) * 1280.0d));
            if (i3 == 5) {
                for (int i4 = 0; i4 < i3; i4++) {
                    dArr[i4] = dArr[i3];
                }
            }
            i3++;
        }
        for (i2 = 11; i2 < 21; i2++) {
            dArr[i2] = dArr[10];
        }
        return dArr;
    }

    private static Tile a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return Tile.obtain(256, 256, byteArrayOutputStream.toByteArray());
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
        int i2 = iFloor + i;
        int i3 = i2 - 1;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length);
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
        double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i, i);
        for (int i10 = iFloor; i10 < i2; i10++) {
            for (int i11 = 0; i11 < length; i11++) {
                double d3 = dArr3[i10][i11];
                if (d3 != 0.0d) {
                    int i12 = i11 + iFloor;
                    if (i3 < i12) {
                        i12 = i3;
                    }
                    int i13 = i12 + 1;
                    int i14 = i11 - iFloor;
                    for (int i15 = iFloor > i14 ? iFloor : i14; i15 < i13; i15++) {
                        double[] dArr6 = dArr5[i10 - iFloor];
                        int i16 = i15 - iFloor;
                        dArr6[i16] = dArr6[i16] + (dArr2[i15 - i14] * d3);
                    }
                }
            }
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
}
