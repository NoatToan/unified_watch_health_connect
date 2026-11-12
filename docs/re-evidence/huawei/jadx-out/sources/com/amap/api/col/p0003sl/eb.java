package com.amap.api.col.p0003sl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.amap.api.maps.AMapUtils;
import com.amap.api.maps.MapsInitializer;
import com.amap.api.maps.model.BaseHoleOptions;
import com.amap.api.maps.model.CircleHoleOptions;
import com.amap.api.maps.model.LatLng;
import com.amap.api.maps.model.LatLngBounds;
import com.amap.api.maps.model.PolygonHoleOptions;
import com.amap.api.maps.utils.SpatialRelationUtil;
import com.autonavi.amap.api.mapcore.IGLMapState;
import com.autonavi.amap.mapcore.AbstractCameraUpdateMessage;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.amap.mapcore.IPoint;
import com.autonavi.amap.mapcore.VirtualEarthProjection;
import com.autonavi.amap.mapcore.interfaces.IMapConfig;
import com.autonavi.base.amap.mapcore.AeUtil;
import com.autonavi.base.amap.mapcore.FPoint;
import com.autonavi.base.amap.mapcore.FileUtil;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.hianalytics.core.transport.Utils;
import huawei.android.hwcolorpicker.HwColorPicker;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class eb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static FPoint[] f2410a = {FPoint.obtain(), FPoint.obtain(), FPoint.obtain(), FPoint.obtain()};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static List<Float> f2411b = new ArrayList(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static List<Float> f2412c = new ArrayList(4);
    private static int d = 0;

    private static double a(double d2, double d3, double d4, double d5, double d6, double d7) {
        return ((d4 - d2) * (d7 - d3)) - ((d6 - d2) * (d5 - d3));
    }

    public static void a(Bitmap bitmap) {
    }

    private static boolean a(double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        double d9 = d4 - d2;
        double d10 = d8 - d7;
        double d11 = d5 - d3;
        double d12 = 180.0d - d6;
        double d13 = (d9 * d10) - (d11 * d12);
        if (d13 == 0.0d) {
            return false;
        }
        double d14 = d3 - d7;
        double d15 = d2 - d6;
        double d16 = ((d12 * d14) - (d10 * d15)) / d13;
        double d17 = ((d14 * d9) - (d15 * d11)) / d13;
        return d16 >= 0.0d && d16 <= 1.0d && d17 >= 0.0d && d17 <= 1.0d;
    }

    public static Bitmap a(Context context, String str) {
        try {
            InputStream inputStreamOpen = dv.a(context).open(str);
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
            inputStreamOpen.close();
            return bitmapDecodeStream;
        } catch (Throwable th) {
            jv.c(th, "Util", "fromAsset");
            a(th);
            return null;
        }
    }

    public static void a(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static String a(String str, Object obj) {
        return str + "=" + String.valueOf(obj);
    }

    public static float a(IMapConfig iMapConfig, float f, float f2) {
        boolean z;
        int i;
        boolean z2 = false;
        if (iMapConfig != null) {
            boolean zIsAbroadEnable = iMapConfig.isAbroadEnable();
            z = iMapConfig.getAbroadState() != 1;
            z2 = zIsAbroadEnable;
        } else {
            z = false;
        }
        float f3 = f >= 0.0f ? f : 0.0f;
        if (z2 && z) {
            if (f3 > 40.0f) {
                return 40.0f;
            }
        } else if (iMapConfig == null || !iMapConfig.isTerrainEnable()) {
            if (f > 40.0f) {
                if (f2 <= 15.0f) {
                    i = 40;
                } else if (f2 <= 16.0f) {
                    i = 56;
                } else if (f2 <= 17.0f) {
                    i = 66;
                } else if (f2 <= 18.0f) {
                    i = 74;
                } else {
                    i = f2 <= 18.0f ? 78 : 80;
                }
                float f4 = i;
                if (f3 > f4) {
                    return f4;
                }
            }
        } else if (f3 > 80.0f) {
            return 80.0f;
        }
        return f3;
    }

    public static float a(IMapConfig iMapConfig, float f) {
        if (iMapConfig != null) {
            if (f > iMapConfig.getMaxZoomLevel()) {
                return iMapConfig.getMaxZoomLevel();
            }
            if (f < iMapConfig.getMinZoomLevel()) {
                return iMapConfig.getMinZoomLevel();
            }
        } else {
            if (f > 20.0f) {
                return 20.0f;
            }
            if (f < 3.0f) {
                return 3.0f;
            }
        }
        return f;
    }

    public static String a(String... strArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String str : strArr) {
            sb.append(str);
            if (i != strArr.length - 1) {
                sb.append(",");
            }
            i++;
        }
        return sb.toString();
    }

    public static int a(Object[] objArr) {
        return Arrays.hashCode(objArr);
    }

    public static Bitmap a(Bitmap bitmap, float f) {
        if (bitmap == null) {
            return null;
        }
        return Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * f), (int) (bitmap.getHeight() * f), true);
    }

    public static String a(Context context) {
        File file = new File(FileUtil.getMapBaseStorage(context), AeUtil.ROOT_DATA_PATH_NAME);
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file.toString() + File.separator);
        if (!file2.exists()) {
            file2.mkdir();
        }
        return file.toString() + File.separator;
    }

    public static String b(Context context) {
        return FileUtil.getMapBaseStorage(context) + File.separator + "data" + File.separator;
    }

    public static String c(Context context) {
        String strA = a(context);
        if (strA == null) {
            return null;
        }
        File file = new File(strA, "VMAP2");
        if (!file.exists()) {
            file.mkdir();
        }
        return file.toString() + File.separator;
    }

    public static String a(int i) {
        if (i < 1000) {
            return i + FitRunPlayAudio.OPPORTUNITY_M;
        }
        return (i / 1000) + "km";
    }

    public static boolean d(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        NetworkInfo.State state;
        return (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || (state = activeNetworkInfo.getState()) == null || state == NetworkInfo.State.DISCONNECTED || state == NetworkInfo.State.DISCONNECTING) ? false : true;
    }

    public static String a(InputStream inputStream) {
        try {
            return new String(b(inputStream), "utf-8");
        } catch (Throwable th) {
            jv.c(th, "Util", "decodeAssetResData");
            th.printStackTrace();
            return null;
        }
    }

    private static byte[] b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        while (true) {
            int i = inputStream.read(bArr, 0, 2048);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00d5 A[DONT_GENERATE, DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x00d7 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.StringBuffer] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    public static String a(File file) throws Throwable {
        ?? r0;
        IOException iOException;
        FileNotFoundException fileNotFoundException;
        ?? fileInputStream;
        ?? r7;
        ?? r8;
        ?? stringBuffer = new StringBuffer();
        ?? line = 0;
        ?? r2 = 0;
        line = 0;
        line = 0;
        ?? r3 = 0;
        try {
            try {
                fileInputStream = new FileInputStream((File) file);
                try {
                    file = new BufferedReader(new InputStreamReader((InputStream) fileInputStream, "utf-8"));
                    while (true) {
                        try {
                            line = file.readLine();
                            try {
                                if (line != 0) {
                                    stringBuffer.append(line);
                                } else {
                                    try {
                                        break;
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                            } catch (Throwable th) {
                                try {
                                    file.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                                throw th;
                            }
                        } catch (FileNotFoundException e3) {
                            fileNotFoundException = e3;
                            r8 = file;
                            line = fileInputStream;
                            file = r8;
                            jv.c(fileNotFoundException, "Util", "readFile fileNotFound");
                            fileNotFoundException.printStackTrace();
                            if (line != 0) {
                                try {
                                    try {
                                        line.close();
                                        if (file != 0) {
                                        }
                                    } catch (IOException e4) {
                                        e4.printStackTrace();
                                        if (file != 0) {
                                        }
                                        file = stringBuffer.toString();
                                        return file;
                                    }
                                } catch (Throwable th2) {
                                    if (file != 0) {
                                        try {
                                            file.close();
                                        } catch (IOException e5) {
                                            e5.printStackTrace();
                                        }
                                    }
                                    throw th2;
                                }
                            } else if (file != 0) {
                            }
                            file = stringBuffer.toString();
                            return file;
                        } catch (IOException e6) {
                            iOException = e6;
                            r7 = file;
                            line = fileInputStream;
                            file = r7;
                            jv.c(iOException, "Util", "readFile io");
                            iOException.printStackTrace();
                            try {
                                if (line != 0) {
                                    try {
                                        line.close();
                                        if (file != 0) {
                                        }
                                    } catch (IOException e7) {
                                        e7.printStackTrace();
                                        if (file != 0) {
                                        }
                                        file = stringBuffer.toString();
                                        return file;
                                    }
                                } else if (file != 0) {
                                }
                                file = stringBuffer.toString();
                                return file;
                            } catch (Throwable th3) {
                                if (file != 0) {
                                    try {
                                        file.close();
                                    } catch (IOException e8) {
                                        e8.printStackTrace();
                                    }
                                }
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r2 = file;
                            th = th;
                            r0 = r2;
                            r3 = fileInputStream;
                            try {
                                if (r3 != 0) {
                                    r3.close();
                                }
                            } catch (IOException e9) {
                                e9.printStackTrace();
                                throw th;
                            } finally {
                                if (r0 != 0) {
                                    try {
                                        r0.close();
                                    } catch (IOException e10) {
                                        e10.printStackTrace();
                                    }
                                }
                            }
                            throw th;
                        }
                    }
                    fileInputStream.close();
                } catch (FileNotFoundException e11) {
                    fileNotFoundException = e11;
                    r8 = 0;
                } catch (IOException e12) {
                    iOException = e12;
                    r7 = 0;
                } catch (Throwable th5) {
                    th = th5;
                    r0 = r2;
                    r3 = fileInputStream;
                    if (r3 != 0) {
                        r3.close();
                    }
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                fileInputStream = line;
            }
        } catch (FileNotFoundException e13) {
            fileNotFoundException = e13;
            file = 0;
        } catch (IOException e14) {
            iOException = e14;
            file = 0;
        } catch (Throwable th7) {
            th = th7;
            r0 = 0;
            if (r3 != 0) {
                r3.close();
            }
            throw th;
        }
        try {
            file.close();
        } catch (IOException e15) {
            e15.printStackTrace();
        }
        file = stringBuffer.toString();
        return file;
    }

    public static boolean a(LatLng latLng, List<LatLng> list) throws Throwable {
        boolean z;
        List<LatLng> list2 = list;
        if (latLng == null || list2 == null) {
            return false;
        }
        double d2 = latLng.longitude;
        double d3 = latLng.latitude;
        double d4 = latLng.latitude;
        if (list.size() < 3) {
            return false;
        }
        if (list2.get(0).equals(list2.get(list.size() - 1))) {
            z = false;
        } else {
            list2.add(list2.get(0));
            z = true;
        }
        int i = 0;
        int i2 = 0;
        while (i < list.size() - 1) {
            try {
                double d5 = list2.get(i).longitude;
                double d6 = list2.get(i).latitude;
                int i3 = i + 1;
                double d7 = list2.get(i3).longitude;
                try {
                    double d8 = list2.get(i3).latitude;
                    double d9 = d4;
                    double d10 = d3;
                    double d11 = d2;
                    if (b(d2, d3, d5, d6, d7, d8)) {
                        if (z) {
                            list.remove(list.size() - 1);
                        }
                        return true;
                    }
                    list2 = list;
                    if (Math.abs(d8 - d6) >= 1.0E-9d) {
                        if (b(d5, d6, d11, d10, 180.0d, d9)) {
                            if (d6 > d8) {
                                i2++;
                            }
                        } else if (b(d7, d8, d11, d10, 180.0d, d9)) {
                            if (d8 > d6) {
                                i2++;
                            }
                        } else if (a(d5, d6, d7, d8, d11, d10, d9)) {
                            i2++;
                        }
                    }
                    i = i3;
                    d4 = d9;
                    d3 = d10;
                    d2 = d11;
                } catch (Throwable th) {
                    th = th;
                    list2 = list;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            if (z) {
                list2.remove(list.size() - 1);
            }
            throw th;
        }
        boolean z2 = i2 % 2 != 0;
        if (z) {
            list2.remove(list.size() - 1);
        }
        return z2;
    }

    private static boolean b(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Math.abs(a(d2, d3, d4, d5, d6, d7)) < 1.0E-9d && (d2 - d4) * (d2 - d6) <= 0.0d && (d3 - d5) * (d3 - d7) <= 0.0d;
    }

    public static boolean a(BaseHoleOptions baseHoleOptions, LatLng latLng) {
        if (baseHoleOptions instanceof CircleHoleOptions) {
            CircleHoleOptions circleHoleOptions = (CircleHoleOptions) baseHoleOptions;
            LatLng center = circleHoleOptions.getCenter();
            return center != null && ((double) AMapUtils.calculateLineDistance(center, latLng)) <= circleHoleOptions.getRadius();
        }
        List<LatLng> points = ((PolygonHoleOptions) baseHoleOptions).getPoints();
        if (points == null || points.size() == 0) {
            return false;
        }
        return a(latLng, points);
    }

    public static ix a() {
        try {
            if (y.f == null) {
                y.f = new ix.a("3dmap", "10.1.300", y.d).a(new String[]{"com.amap.api.maps", "com.amap.api.mapcore", "com.autonavi.amap.mapcore", "com.autonavi.amap", "com.autonavi.ae", "com.autonavi.base", "com.autonavi.patch", "com.amap.api.3dmap.admic", "com.amap.api.trace", "com.amap.api.trace.core"}).a("10.1.300").a();
            }
            return y.f;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void c(View view) {
        int i = 0;
        if (!(view instanceof ViewGroup)) {
            if (view instanceof TextView) {
                ((TextView) view).setHorizontallyScrolling(false);
            }
        } else {
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    return;
                }
                c(viewGroup.getChildAt(i));
                i++;
            }
        }
    }

    public static Bitmap a(View view) {
        try {
            c(view);
            view.destroyDrawingCache();
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                return drawingCache.copy(Bitmap.Config.ARGB_8888, false);
            }
            return null;
        } catch (Throwable th) {
            jv.c(th, Utils.TAG, "getBitmapFromView");
            th.printStackTrace();
            return null;
        }
    }

    public static DPoint a(LatLng latLng) {
        double d2 = latLng.longitude / 360.0d;
        double dSin = Math.sin(Math.toRadians(latLng.latitude));
        return DPoint.obtain((d2 + 0.5d) * 1.0d, (((Math.log((dSin + 1.0d) / (1.0d - dSin)) * 0.5d) / (-6.283185307179586d)) + 0.5d) * 1.0d);
    }

    public static boolean a(Rect rect, int i, int i2) {
        return rect.contains(i, i2);
    }

    public static Pair<Float, IPoint> a(AbstractCameraUpdateMessage abstractCameraUpdateMessage, IMapConfig iMapConfig) {
        return a(iMapConfig, Math.max(abstractCameraUpdateMessage.paddingLeft, 1), Math.max(abstractCameraUpdateMessage.paddingRight, 1), Math.max(abstractCameraUpdateMessage.paddingTop, 1), Math.max(abstractCameraUpdateMessage.paddingBottom, 1), abstractCameraUpdateMessage.bounds, abstractCameraUpdateMessage.width, abstractCameraUpdateMessage.height);
    }

    public static Pair<Float, IPoint> a(IMapConfig iMapConfig, int i, int i2, int i3, int i4, LatLngBounds latLngBounds, int i5, int i6) {
        int i7;
        float f;
        float f2;
        int i8;
        if (latLngBounds == null || latLngBounds.northeast == null || latLngBounds.southwest == null || iMapConfig == null) {
            return null;
        }
        Point pointLatLongToPixels = VirtualEarthProjection.latLongToPixels(latLngBounds.northeast.latitude, latLngBounds.northeast.longitude, 20);
        Point pointLatLongToPixels2 = VirtualEarthProjection.latLongToPixels(latLngBounds.southwest.latitude, latLngBounds.southwest.longitude, 20);
        int i9 = pointLatLongToPixels.x - pointLatLongToPixels2.x;
        int i10 = pointLatLongToPixels2.y - pointLatLongToPixels.y;
        int i11 = i5 - (i + i2);
        int i12 = i6 - (i3 + i4);
        if (i9 < 0 && i10 < 0) {
            return null;
        }
        int i13 = i9 <= 0 ? 1 : i9;
        int i14 = i10 <= 0 ? 1 : i10;
        Pair<Float, Boolean> pairB = b(iMapConfig, pointLatLongToPixels.x, pointLatLongToPixels.y, pointLatLongToPixels2.x, pointLatLongToPixels2.y, i11 <= 0 ? 1 : i11, i12 <= 0 ? 1 : i12);
        Float f3 = (Float) pairB.first;
        float fFloatValue = f3.floatValue();
        boolean zBooleanValue = ((Boolean) pairB.second).booleanValue();
        float fA = a(iMapConfig.getMapZoomScale(), fFloatValue, i13);
        float fA2 = a(iMapConfig.getMapZoomScale(), fFloatValue, i14);
        if (fFloatValue >= iMapConfig.getMaxZoomLevel()) {
            i7 = (int) (pointLatLongToPixels2.x + ((((i2 - i) + fA) * i13) / (fA * 2.0f)));
            i8 = pointLatLongToPixels.y;
        } else {
            if (zBooleanValue) {
                i7 = (int) (pointLatLongToPixels2.x + ((((i5 / 2) - i) / fA) * i13));
                i8 = pointLatLongToPixels.y;
            } else {
                i7 = (int) (pointLatLongToPixels2.x + ((((i2 - i) + fA) * i13) / (fA * 2.0f)));
                f = pointLatLongToPixels.y;
                f2 = (((i6 / 2) - i3) / fA2) * i14;
            }
            return new Pair<>(f3, IPoint.obtain((int) (i7 + a(iMapConfig.getMapZoomScale(), fFloatValue, iMapConfig.getAnchorX() - (iMapConfig.getMapWidth() >> 1))), (int) (((int) (f + f2)) + a(iMapConfig.getMapZoomScale(), fFloatValue, iMapConfig.getAnchorY() - (iMapConfig.getMapHeight() >> 1)))));
        }
        f = i8;
        f2 = (((i4 - i3) + fA2) * i14) / (fA2 * 2.0f);
        return new Pair<>(f3, IPoint.obtain((int) (i7 + a(iMapConfig.getMapZoomScale(), fFloatValue, iMapConfig.getAnchorX() - (iMapConfig.getMapWidth() >> 1))), (int) (((int) (f + f2)) + a(iMapConfig.getMapZoomScale(), fFloatValue, iMapConfig.getAnchorY() - (iMapConfig.getMapHeight() >> 1)))));
    }

    private static double a(float f, double d2, double d3) {
        return 20.0d - (Math.log(d3 / (d2 * ((double) f))) / Math.log(2.0d));
    }

    private static float a(float f, float f2, double d2) {
        return (float) (d2 / (Math.pow(2.0d, 20.0f - f2) * ((double) f)));
    }

    private static float a(float f, float f2, float f3) {
        return (float) (((double) f3) * Math.pow(2.0d, 20.0f - f2) * ((double) f));
    }

    private static Pair<Float, Boolean> b(IMapConfig iMapConfig, int i, int i2, int i3, int i4, int i5, int i6) {
        float fMin;
        iMapConfig.getSZ();
        boolean z = true;
        if (i == i3 && i2 == i4) {
            fMin = iMapConfig.getMaxZoomLevel();
        } else {
            float fA = (float) a(iMapConfig.getMapZoomScale(), i6, Math.abs(i4 - i2));
            float fA2 = (float) a(iMapConfig.getMapZoomScale(), i5, Math.abs(i3 - i));
            float fMin2 = Math.min(fA2, fA);
            z = fMin2 == fA2;
            fMin = Math.min(iMapConfig.getMaxZoomLevel(), Math.max(iMapConfig.getMinZoomLevel(), fMin2));
        }
        return new Pair<>(Float.valueOf(fMin), Boolean.valueOf(z));
    }

    public static float a(IMapConfig iMapConfig, int i, int i2, int i3, int i4, int i5, int i6) {
        float sz = iMapConfig.getSZ();
        if (i == i3 || i2 == i4) {
            return sz;
        }
        return Math.max((float) a(iMapConfig.getMapZoomScale(), i5, Math.abs(i3 - i)), (float) a(iMapConfig.getMapZoomScale(), i6, Math.abs(i4 - i2)));
    }

    public static boolean a(int i, int i2) {
        if (i > 0 && i2 > 0) {
            return true;
        }
        Log.w("3dmap", "the map must have a size");
        return false;
    }

    public static float a(IGLMapState iGLMapState, int i, int i2, double d2, double d3, int i3) {
        IPoint iPointObtain = IPoint.obtain();
        VirtualEarthProjection.latLongToPixels(d2, d3, 20, iPointObtain);
        float fA = a(iGLMapState, i, i2, iPointObtain.x, iPointObtain.y, i3);
        iPointObtain.recycle();
        return fA;
    }

    private static float a(IGLMapState iGLMapState, int i, int i2, int i3, int i4, int i5) {
        if (iGLMapState != null) {
            return iGLMapState.calculateMapZoomer(i, i2, i3, i4, i5);
        }
        return 3.0f;
    }

    public static int[] a(int i, int i2, int i3, int i4, IMapConfig iMapConfig, IGLMapState iGLMapState, int i5, int i6) {
        int[] iArr;
        synchronized (eb.class) {
            int mapWidth = iMapConfig.getMapWidth();
            int mapHeight = iMapConfig.getMapHeight();
            int anchorX = iMapConfig.getAnchorX();
            int anchorY = iMapConfig.getAnchorY();
            iArr = new int[]{(int) Math.max(i3 + a(iMapConfig.getMapZoomScale(), iGLMapState.getMapZoomer(), anchorX), Math.min(i5, i - a(iMapConfig.getMapZoomScale(), iGLMapState.getMapZoomer(), mapWidth - anchorX))), (int) Math.max(i2 + a(iMapConfig.getMapZoomScale(), iGLMapState.getMapZoomer(), anchorY), Math.min(i6, i4 - a(iMapConfig.getMapZoomScale(), iGLMapState.getMapZoomer(), mapHeight - anchorY)))};
        }
        return iArr;
    }

    public static byte[] a(byte[] bArr, int i) {
        return a(bArr, i, i, true);
    }

    public static byte[] a(byte[] bArr, int i, int i2, boolean z) {
        try {
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            Bitmap bitmapCopy = bitmapDecodeByteArray.copy(bitmapDecodeByteArray.getConfig(), true);
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            for (int i3 = 0; i3 < width; i3++) {
                for (int i4 = 0; i4 < height; i4++) {
                    if (i3 != 0 && i4 != 0) {
                        bitmapCopy.setPixel(i3, i4, i);
                    } else if (!z) {
                        bitmapCopy.setPixel(i3, i4, i2);
                    }
                }
            }
            byte[] bArrB = b(bitmapCopy);
            if (bArrB == null) {
                bArrB = bArr;
            }
            a(bitmapCopy);
            a(bitmapDecodeByteArray);
            return bArrB;
        } catch (Throwable th) {
            th.printStackTrace();
            return bArr;
        }
    }

    private static byte[] b(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th) {
                    th.printStackTrace();
                    return byteArray;
                }
            } catch (Throwable unused) {
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
                return null;
            }
        } catch (Throwable unused2) {
            byteArrayOutputStream = null;
        }
    }

    public static boolean a(List<BaseHoleOptions> list, PolygonHoleOptions polygonHoleOptions) {
        boolean zB = false;
        for (int i = 0; i < list.size(); i++) {
            BaseHoleOptions baseHoleOptions = list.get(i);
            if (baseHoleOptions instanceof PolygonHoleOptions) {
                zB = a(((PolygonHoleOptions) baseHoleOptions).getPoints(), polygonHoleOptions.getPoints());
                if (zB) {
                    return true;
                }
            } else if (baseHoleOptions instanceof CircleHoleOptions) {
                zB = b(polygonHoleOptions.getPoints(), (CircleHoleOptions) baseHoleOptions);
                if (zB) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return zB;
    }

    public static boolean a(List<BaseHoleOptions> list, CircleHoleOptions circleHoleOptions) {
        boolean zA = false;
        for (int i = 0; i < list.size(); i++) {
            BaseHoleOptions baseHoleOptions = list.get(i);
            if (baseHoleOptions instanceof PolygonHoleOptions) {
                zA = b(((PolygonHoleOptions) baseHoleOptions).getPoints(), circleHoleOptions);
                if (zA) {
                    return true;
                }
            } else if ((baseHoleOptions instanceof CircleHoleOptions) && (zA = a(circleHoleOptions, (CircleHoleOptions) baseHoleOptions))) {
                return true;
            }
        }
        return zA;
    }

    private static boolean a(CircleHoleOptions circleHoleOptions, CircleHoleOptions circleHoleOptions2) {
        try {
            return ((double) AMapUtils.calculateLineDistance(circleHoleOptions2.getCenter(), circleHoleOptions.getCenter())) < circleHoleOptions.getRadius() + circleHoleOptions2.getRadius();
        } catch (Throwable th) {
            jv.c(th, "Util", "isPolygon2CircleIntersect");
            th.printStackTrace();
            return false;
        }
    }

    private static boolean b(List<LatLng> list, CircleHoleOptions circleHoleOptions) {
        int i;
        try {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                arrayList.add(list.get(i2));
            }
            arrayList.add(list.get(0));
            ArrayList arrayList2 = new ArrayList();
            int i3 = 0;
            while (i3 < arrayList.size() && (i = i3 + 1) < arrayList.size()) {
                if (circleHoleOptions.getRadius() < AMapUtils.calculateLineDistance(circleHoleOptions.getCenter(), (LatLng) arrayList.get(i3)) && circleHoleOptions.getRadius() < AMapUtils.calculateLineDistance(circleHoleOptions.getCenter(), (LatLng) arrayList.get(i))) {
                    arrayList2.clear();
                    arrayList2.add(arrayList.get(i3));
                    arrayList2.add(arrayList.get(i));
                    if (circleHoleOptions.getRadius() >= AMapUtils.calculateLineDistance(circleHoleOptions.getCenter(), (LatLng) SpatialRelationUtil.calShortestDistancePoint(arrayList2, circleHoleOptions.getCenter()).second)) {
                        return true;
                    }
                    i3 = i;
                }
                return true;
            }
        } catch (Throwable th) {
            jv.c(th, "Util", "isPolygon2CircleIntersect");
            th.printStackTrace();
        }
        return false;
    }

    private static boolean a(List<LatLng> list, List<LatLng> list2) {
        for (int i = 0; i < list2.size(); i++) {
            try {
                if (a(list2.get(i), list)) {
                    return true;
                }
            } catch (Throwable th) {
                jv.c(th, "Util", "isPolygon2PolygonIntersect");
                th.printStackTrace();
                return false;
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (a(list.get(i2), list2)) {
                return true;
            }
        }
        return b(list, list2);
    }

    private static boolean b(List<LatLng> list, List<LatLng> list2) {
        int i;
        int i2;
        int i3 = 0;
        while (i3 < list.size() && (i = i3 + 1) < list.size()) {
            try {
                int i4 = 0;
                while (i4 < list2.size() && (i2 = i4 + 1) < list2.size()) {
                    boolean zA = dw.a(list.get(i3), list.get(i), list2.get(i4), list2.get(i2));
                    if (zA) {
                        return zA;
                    }
                    i4 = i2;
                }
                i3 = i;
            } catch (Throwable th) {
                jv.c(th, "Util", "isSegmentsIntersect");
                th.printStackTrace();
            }
        }
        return false;
    }

    public static boolean e(Context context) {
        File file = new File(b(context));
        if (file.exists()) {
            return FileUtil.deleteFile(file);
        }
        return true;
    }

    public static float a(DPoint dPoint, DPoint dPoint2) {
        if (dPoint == null || dPoint2 == null) {
            return 0.0f;
        }
        double d2 = dPoint.x;
        double d3 = dPoint2.x;
        return (float) ((Math.atan2(dPoint2.y - dPoint.y, d3 - d2) / 3.141592653589793d) * 180.0d);
    }

    public static boolean b(List<LatLng> list, PolygonHoleOptions polygonHoleOptions) {
        boolean zA = false;
        if (list != null && polygonHoleOptions != null) {
            try {
                List<LatLng> points = polygonHoleOptions.getPoints();
                for (int i = 0; i < points.size() && (zA = a(points.get(i), list)); i++) {
                }
                return zA;
            } catch (Throwable th) {
                jv.c(th, "PolygonDelegateImp", "isPolygonInPolygon");
                th.printStackTrace();
            }
        }
        return false;
    }

    public static boolean a(List<LatLng> list, List<BaseHoleOptions> list2, CircleHoleOptions circleHoleOptions) {
        try {
            return !b(list, circleHoleOptions) && a(list, list2, circleHoleOptions.getCenter());
        } catch (Throwable th) {
            jv.c(th, "PolygonDelegateImp", "isCircleInPolygon");
            th.printStackTrace();
            return false;
        }
    }

    private static boolean a(List<LatLng> list, List<BaseHoleOptions> list2, LatLng latLng) throws RemoteException {
        if (latLng == null) {
            return false;
        }
        if (list2 != null) {
            try {
                if (list2.size() > 0) {
                    Iterator<BaseHoleOptions> it = list2.iterator();
                    while (it.hasNext()) {
                        if (a(it.next(), latLng)) {
                            return false;
                        }
                    }
                }
            } catch (Throwable th) {
                jv.c(th, "PolygonDelegateImp", "contains");
                th.printStackTrace();
                return false;
            }
        }
        return a(latLng, list);
    }

    public static boolean a(double d2, LatLng latLng, List<BaseHoleOptions> list, PolygonHoleOptions polygonHoleOptions) {
        boolean zA = true;
        try {
            List<LatLng> points = polygonHoleOptions.getPoints();
            for (int i = 0; i < points.size() && (zA = a(d2, latLng, list, points.get(i))); i++) {
            }
            return zA;
        } catch (Throwable th) {
            jv.c(th, "CircleDelegateImp", "isPolygonInCircle");
            th.printStackTrace();
            return true;
        }
    }

    public static boolean a(double d2, LatLng latLng, CircleHoleOptions circleHoleOptions) {
        try {
            return ((double) AMapUtils.calculateLineDistance(circleHoleOptions.getCenter(), latLng)) <= d2 - circleHoleOptions.getRadius();
        } catch (Throwable th) {
            jv.c(th, "CircleDelegateImp", "isCircleInCircle");
            th.printStackTrace();
            return true;
        }
    }

    private static boolean a(double d2, LatLng latLng, List<BaseHoleOptions> list, LatLng latLng2) throws RemoteException {
        if (list != null && list.size() > 0) {
            Iterator<BaseHoleOptions> it = list.iterator();
            while (it.hasNext()) {
                if (a(it.next(), latLng2)) {
                    return false;
                }
            }
        }
        return d2 >= ((double) AMapUtils.calculateLineDistance(latLng, latLng2));
    }

    public static void a(Throwable th) {
        try {
            if (MapsInitializer.getExceptionLogger() != null) {
                MapsInitializer.getExceptionLogger().onException(th);
            }
        } catch (Throwable unused) {
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            Uri uri = Uri.parse(str);
            if (uri.getAuthority() != null && uri.getAuthority().startsWith("dualstack-")) {
                return str;
            }
            if (uri.getAuthority() != null && uri.getAuthority().startsWith("restsdk.amap.com")) {
                return uri.buildUpon().authority("dualstack-arestapi.amap.com").build().toString();
            }
            return uri.buildUpon().authority("dualstack-" + uri.getAuthority()).build().toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public static Bitmap a(int[] iArr, int i, int i2) {
        return a(iArr, i, i2, false);
    }

    public static Bitmap a(int[] iArr, int i, int i2, boolean z) {
        try {
            int[] iArr2 = new int[iArr.length];
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i4 = 0; i4 < i; i4++) {
                    int i5 = (i3 * i) + i4;
                    int i6 = iArr[i5];
                    int i7 = ((i6 >> 16) & 255) | ((-16711936) & i6) | ((i6 << 16) & HwColorPicker.MASK_RESULT_STATE);
                    if (z) {
                        iArr2[(((i2 - i3) - 1) * i) + i4] = i7;
                    } else {
                        iArr2[i5] = i7;
                    }
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setPixels(iArr2, 0, i, 0, 0, i, i2);
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            jv.c(th, "Util", "rgbaToArgb");
            th.printStackTrace();
            return null;
        }
    }

    public static String b(View view) {
        StringBuilder sb = new StringBuilder();
        if (view != null) {
            try {
                if (view instanceof TextView) {
                    sb = new StringBuilder(((TextView) view).getText().toString());
                }
                if (view instanceof ViewGroup) {
                    int childCount = ((ViewGroup) view).getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        String strB = b(((ViewGroup) view).getChildAt(i));
                        if (!TextUtils.isEmpty(strB)) {
                            sb.append("--");
                            sb.append(strB);
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return sb.toString();
    }

    public static int b() {
        int i;
        synchronized (eb.class) {
            int i2 = d + 1;
            d = i2;
            if (i2 == Integer.MAX_VALUE) {
                d = 0;
            }
            i = d;
        }
        return i;
    }

    public static Map<String, String> a(String str, String str2) {
        HashMap map = new HashMap();
        for (String str3 : str.split("&")) {
            if (!TextUtils.isEmpty(str3)) {
                String[] strArrSplit = str3.split(str2);
                if (strArrSplit.length == 2) {
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
        return map;
    }

    public static List<String> b(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split("&")) {
            if (!TextUtils.isEmpty(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }
}
