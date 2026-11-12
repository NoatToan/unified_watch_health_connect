package com.google.maps.android.heatmaps;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileProvider;
import com.google.maps.android.geometry.Bounds;
import com.google.maps.android.geometry.Point;
import com.google.maps.android.quadtree.PointQuadTree;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p1.z;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public class HeatmapTileProvider implements TileProvider {
    public static final Gradient DEFAULT_GRADIENT;
    private static final int[] DEFAULT_GRADIENT_COLORS;
    private static final float[] DEFAULT_GRADIENT_START_POINTS;
    private static final int DEFAULT_MAX_ZOOM = 11;
    private static final int DEFAULT_MIN_ZOOM = 5;
    public static final double DEFAULT_OPACITY = 0.7d;
    public static final int DEFAULT_RADIUS = 20;
    private static final int MAX_RADIUS = 50;
    private static final int MAX_ZOOM_LEVEL = 22;
    private static final int MIN_RADIUS = 10;
    private static final int SCREEN_SIZE = 1280;
    private static final int TILE_DIM = 512;
    static final double WORLD_WIDTH = 1.0d;
    private Bounds mBounds;
    private int[] mColorMap;
    private double mCustomMaxIntensity;
    private Collection<WeightedLatLng> mData;
    private Gradient mGradient;
    private double[] mKernel;
    private double[] mMaxIntensity;
    private double mOpacity;
    private int mRadius;
    private PointQuadTree<WeightedLatLng> mTree;

    public static class Builder {
        private Collection<WeightedLatLng> data;
        private int radius = 20;
        private Gradient gradient = HeatmapTileProvider.DEFAULT_GRADIENT;
        private double opacity = 0.7d;
        private double intensity = 0.0d;

        public HeatmapTileProvider build() {
            if (this.data != null) {
                return new HeatmapTileProvider(this, 0);
            }
            h.z("No input data: you must use either .data or .weightedData before building");
            return null;
        }

        public Builder data(Collection<LatLng> collection) {
            return weightedData(HeatmapTileProvider.wrapData(collection));
        }

        public Builder gradient(Gradient gradient) {
            this.gradient = gradient;
            return this;
        }

        public Builder maxIntensity(double d14) {
            this.intensity = d14;
            return this;
        }

        public Builder opacity(double d14) {
            this.opacity = d14;
            if (d14 >= 0.0d && d14 <= 1.0d) {
                return this;
            }
            h.s("Opacity must be in range [0, 1]");
            return null;
        }

        public Builder radius(int i14) {
            this.radius = i14;
            if (i14 >= 10 && i14 <= 50) {
                return this;
            }
            h.s("Radius not within bounds.");
            return null;
        }

        public Builder weightedData(Collection<WeightedLatLng> collection) {
            this.data = collection;
            if (!collection.isEmpty()) {
                return this;
            }
            h.s("No input points.");
            return null;
        }
    }

    static {
        int[] iArr = {Color.rgb(102, 225, 0), Color.rgb(255, 0, 0)};
        DEFAULT_GRADIENT_COLORS = iArr;
        float[] fArr = {0.2f, 1.0f};
        DEFAULT_GRADIENT_START_POINTS = fArr;
        DEFAULT_GRADIENT = new Gradient(iArr, fArr);
    }

    private HeatmapTileProvider(Builder builder) {
        this.mData = builder.data;
        this.mRadius = builder.radius;
        this.mGradient = builder.gradient;
        this.mOpacity = builder.opacity;
        this.mCustomMaxIntensity = builder.intensity;
        int i14 = this.mRadius;
        this.mKernel = generateKernel(i14, ((double) i14) / 3.0d);
        setGradient(this.mGradient);
        setWeightedData(this.mData);
    }

    public static Bitmap colorize(double[][] dArr, int[] iArr, double d14) {
        int i14 = iArr[iArr.length - 1];
        double length = ((double) (iArr.length - 1)) / d14;
        int length2 = dArr.length;
        int[] iArr2 = new int[length2 * length2];
        for (int i15 = 0; i15 < length2; i15++) {
            for (int i16 = 0; i16 < length2; i16++) {
                double d15 = dArr[i16][i15];
                int i17 = (i15 * length2) + i16;
                int i18 = (int) (d15 * length);
                if (d15 == 0.0d) {
                    iArr2[i17] = 0;
                } else if (i18 < iArr.length) {
                    iArr2[i17] = iArr[i18];
                } else {
                    iArr2[i17] = i14;
                }
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(length2, length2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr2, 0, length2, 0, 0, length2, length2);
        return bitmapCreateBitmap;
    }

    private static Tile convertBitmap(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return new Tile(512, 512, byteArrayOutputStream.toByteArray());
    }

    public static double[][] convolve(double[][] dArr, double[] dArr2) {
        int iFloor = (int) Math.floor(((double) dArr2.length) / 2.0d);
        int length = dArr.length;
        int i14 = length - (iFloor * 2);
        int i15 = iFloor + i14;
        int i16 = i15 - 1;
        boolean z14 = true;
        int i17 = 0;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, length, length);
        int i18 = 0;
        while (true) {
            double d14 = 0.0d;
            if (i18 >= length) {
                break;
            }
            int i19 = i17;
            while (i19 < length) {
                double d15 = dArr[i18][i19];
                if (d15 != d14) {
                    int i24 = i18 + iFloor;
                    if (i16 < i24) {
                        i24 = i16;
                    }
                    int i25 = i24 + 1;
                    int i26 = i18 - iFloor;
                    for (int i27 = iFloor > i26 ? iFloor : i26; i27 < i25; i27++) {
                        double[] dArr4 = dArr3[i27];
                        dArr4[i19] = (dArr2[i27 - i26] * d15) + dArr4[i19];
                    }
                }
                i19++;
                z14 = z14;
                i17 = i17;
                d14 = d14;
            }
            i18++;
        }
        int i28 = i17;
        int[] iArr = new int[2];
        iArr[z14 ? 1 : 0] = i14;
        iArr[i28] = i14;
        double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
        for (int i29 = iFloor; i29 < i15; i29++) {
            for (int i30 = i28; i30 < length; i30++) {
                double d16 = dArr3[i29][i30];
                if (d16 != 0.0d) {
                    int i34 = i30 + iFloor;
                    if (i16 < i34) {
                        i34 = i16;
                    }
                    int i35 = i34 + 1;
                    int i36 = i30 - iFloor;
                    for (int i37 = iFloor > i36 ? iFloor : i36; i37 < i35; i37++) {
                        double[] dArr6 = dArr5[i29 - iFloor];
                        int i38 = i37 - iFloor;
                        dArr6[i38] = (dArr2[i37 - i36] * d16) + dArr6[i38];
                    }
                }
            }
        }
        return dArr5;
    }

    public static double[] generateKernel(int i14, double d14) {
        double[] dArr = new double[(i14 * 2) + 1];
        for (int i15 = -i14; i15 <= i14; i15++) {
            dArr[i15 + i14] = Math.exp(((double) ((-i15) * i15)) / ((2.0d * d14) * d14));
        }
        return dArr;
    }

    public static Bounds getBounds(Collection<WeightedLatLng> collection) {
        Iterator<WeightedLatLng> it = collection.iterator();
        WeightedLatLng next = it.next();
        double d14 = next.getPoint().f54320x;
        double d15 = next.getPoint().f54320x;
        double d16 = d14;
        double d17 = d15;
        double d18 = next.getPoint().f54321y;
        double d19 = next.getPoint().f54321y;
        while (it.hasNext()) {
            WeightedLatLng next2 = it.next();
            double d24 = next2.getPoint().f54320x;
            double d25 = next2.getPoint().f54321y;
            if (d24 < d16) {
                d16 = d24;
            }
            if (d24 > d17) {
                d17 = d24;
            }
            if (d25 < d18) {
                d18 = d25;
            }
            if (d25 > d19) {
                d19 = d25;
            }
        }
        return new Bounds(d16, d17, d18, d19);
    }

    private double[] getMaxIntensities(int i14) {
        int i15;
        double[] dArr = new double[22];
        if (this.mCustomMaxIntensity != 0.0d) {
            for (int i16 = 0; i16 < 22; i16++) {
                dArr[i16] = this.mCustomMaxIntensity;
            }
        } else {
            int i17 = 5;
            while (true) {
                if (i17 >= 11) {
                    break;
                }
                dArr[i17] = getMaxValue(this.mData, this.mBounds, i14, (int) (Math.pow(2.0d, i17 - 3) * 1280.0d));
                if (i17 == 5) {
                    for (int i18 = 0; i18 < i17; i18++) {
                        dArr[i18] = dArr[i17];
                    }
                }
                i17++;
            }
            for (i15 = 11; i15 < 22; i15++) {
                dArr[i15] = dArr[10];
            }
        }
        return dArr;
    }

    public static double getMaxValue(Collection<WeightedLatLng> collection, Bounds bounds, int i14, int i15) {
        double d14 = bounds.minX;
        double d15 = bounds.maxX;
        double d16 = bounds.minY;
        double d17 = d15 - d14;
        double d18 = bounds.maxY - d16;
        if (d17 <= d18) {
            d17 = d18;
        }
        double d19 = ((double) ((int) (((double) (i15 / (i14 * 2))) + 0.5d))) / d17;
        z zVar = new z();
        double d24 = 0.0d;
        for (WeightedLatLng weightedLatLng : collection) {
            double d25 = weightedLatLng.getPoint().f54320x;
            int i16 = (int) ((weightedLatLng.getPoint().f54321y - d16) * d19);
            long j8 = (int) ((d25 - d14) * d19);
            z zVar2 = (z) zVar.b(j8);
            if (zVar2 == null) {
                zVar2 = new z();
                zVar.f(j8, zVar2);
            }
            long j14 = i16;
            Double dValueOf = (Double) zVar2.b(j14);
            if (dValueOf == null) {
                dValueOf = Double.valueOf(0.0d);
            }
            double intensity = weightedLatLng.getIntensity() + dValueOf.doubleValue();
            zVar2.f(j14, Double.valueOf(intensity));
            if (intensity > d24) {
                d24 = intensity;
            }
        }
        return d24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Collection<WeightedLatLng> wrapData(Collection<LatLng> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new WeightedLatLng(it.next()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public Tile getTile(int i14, int i15, int i16) {
        double d14 = 1.0d;
        double dPow = 1.0d / Math.pow(2.0d, i16);
        int i17 = this.mRadius;
        double d15 = (((double) i17) * dPow) / 512.0d;
        double d16 = ((2.0d * d15) + dPow) / ((double) ((i17 * 2) + 512));
        double d17 = (((double) i14) * dPow) - d15;
        double d18 = (((double) (i14 + 1)) * dPow) + d15;
        double d19 = (((double) i15) * dPow) - d15;
        double d24 = (((double) (i15 + 1)) * dPow) + d15;
        Collection<WeightedLatLng> arrayList = new ArrayList();
        if (d17 < 0.0d) {
            arrayList = this.mTree.search(new Bounds(d17 + 1.0d, 1.0d, d19, d24));
            d14 = -1.0d;
        } else if (d18 > 1.0d) {
            arrayList = this.mTree.search(new Bounds(0.0d, d18 - 1.0d, d19, d24));
        } else {
            d14 = 0.0d;
        }
        Bounds bounds = new Bounds(d17, d18, d19, d24);
        Bounds bounds2 = this.mBounds;
        if (!bounds.intersects(new Bounds(bounds2.minX - d15, bounds2.maxX + d15, bounds2.minY - d15, bounds2.maxY + d15))) {
            return TileProvider.NO_TILE;
        }
        Collection<T> collectionSearch = this.mTree.search(bounds);
        if (collectionSearch.isEmpty()) {
            return TileProvider.NO_TILE;
        }
        int i18 = this.mRadius;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, (i18 * 2) + 512, (i18 * 2) + 512);
        for (T t7 : collectionSearch) {
            Point point = t7.getPoint();
            int i19 = (int) ((point.f54320x - d17) / d16);
            int i24 = (int) ((point.f54321y - d19) / d16);
            double[] dArr2 = dArr[i19];
            dArr2[i24] = t7.getIntensity() + dArr2[i24];
        }
        for (WeightedLatLng weightedLatLng : arrayList) {
            Point point2 = weightedLatLng.getPoint();
            int i25 = (int) (((point2.f54320x + d14) - d17) / d16);
            int i26 = (int) ((point2.f54321y - d19) / d16);
            double[] dArr3 = dArr[i25];
            dArr3[i26] = weightedLatLng.getIntensity() + dArr3[i26];
        }
        return convertBitmap(colorize(convolve(dArr, this.mKernel), this.mColorMap, this.mMaxIntensity[i16]));
    }

    public void setData(Collection<LatLng> collection) {
        setWeightedData(wrapData(collection));
    }

    public void setGradient(Gradient gradient) {
        this.mGradient = gradient;
        this.mColorMap = gradient.generateColorMap(this.mOpacity);
    }

    public void setMaxIntensity(double d14) {
        this.mCustomMaxIntensity = d14;
        setWeightedData(this.mData);
    }

    public void setOpacity(double d14) {
        this.mOpacity = d14;
        setGradient(this.mGradient);
    }

    public void setRadius(int i14) {
        this.mRadius = i14;
        this.mKernel = generateKernel(i14, ((double) i14) / 3.0d);
        this.mMaxIntensity = getMaxIntensities(this.mRadius);
    }

    public void setWeightedData(Collection<WeightedLatLng> collection) {
        this.mData = collection;
        if (collection.isEmpty()) {
            h.s("No input points.");
            return;
        }
        Bounds bounds = getBounds(this.mData);
        this.mBounds = bounds;
        this.mTree = new PointQuadTree<>(bounds);
        Iterator<WeightedLatLng> it = this.mData.iterator();
        while (it.hasNext()) {
            this.mTree.add(it.next());
        }
        this.mMaxIntensity = getMaxIntensities(this.mRadius);
    }

    public /* synthetic */ HeatmapTileProvider(Builder builder, int i14) {
        this(builder);
    }
}
