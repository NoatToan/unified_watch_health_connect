package com.amap.api.mapcore.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
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
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import com.autonavi.base.amap.mapcore.AeUtil;
import com.autonavi.base.amap.mapcore.FPoint;
import com.autonavi.base.amap.mapcore.FPoint3;
import com.autonavi.base.amap.mapcore.FileUtil;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.web.container.utils.UtilsKt;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes2.dex */
public final class er {
    private static FPoint[] a = {FPoint.obtain(), FPoint.obtain(), FPoint.obtain(), FPoint.obtain()};
    private static List<Float> b = new ArrayList(4);
    private static List<Float> c = new ArrayList(4);

    private static double a(double d, double d2, double d3, double d4, double d5, double d6) {
        return ((d3 - d) * (d6 - d2)) - ((d5 - d) * (d4 - d2));
    }

    public static Bitmap a(Context context, String str) {
        try {
            InputStream inputStreamOpen = el.a(context).open(str);
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
            inputStreamOpen.close();
            return bitmapDecodeStream;
        } catch (Throwable th) {
            hn.c(th, "Util", "fromAsset");
            a(th);
            return null;
        }
    }

    public static int b(Bitmap bitmap) {
        return a(bitmap, true);
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

    public static boolean d(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        NetworkInfo.State state;
        return (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || (state = activeNetworkInfo.getState()) == null || state == NetworkInfo.State.DISCONNECTED || state == NetworkInfo.State.DISCONNECTING) ? false : true;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 12;
    }

    public static gt f() {
        try {
            if (l.e == null) {
                l.e = new gt.a("3dmap", "7.9.1", l.c).a(new String[]{"com.amap.api.maps", "com.amap.api.mapcore", "com.autonavi.amap.mapcore", "com.autonavi.amap", "com.autonavi.ae", "com.autonavi.base", "com.autonavi.patch", "com.amap.api.3dmap.admic", "com.amap.api.trace", "com.amap.api.trace.core"}).a("7.9.1").a();
            }
            return l.e;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String b(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(FileUtil.getMapBaseStorage(context));
        String str = File.separator;
        sb.append(str);
        sb.append("data");
        sb.append(str);
        return sb.toString();
    }

    public static boolean e(Context context) {
        File file = new File(b(context));
        if (file.exists()) {
            return FileUtil.deleteFile(file);
        }
        return true;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 8;
    }

    public static void b(int i) {
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
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

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 11;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 9;
    }

    private static byte[] d(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                return byteArray;
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

    public static void a(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
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

    public static String a(String str, Object obj) {
        return str + SearchCriteria.EQ + String.valueOf(obj);
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
        if (z2 && z) {
            if (f > 40.0f) {
                return 40.0f;
            }
            return f;
        }
        if (f <= 40.0f) {
            return f;
        }
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
        float f3 = i;
        return f > f3 ? f3 : f;
    }

    private static boolean b(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.abs(a(d, d2, d3, d4, d5, d6)) < 1.0E-9d && (d - d3) * (d - d5) <= 0.0d && (d2 - d4) * (d2 - d6) <= 0.0d;
    }

    public static List<FPoint> b(FPoint[] fPointArr, List<FPoint> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list);
        for (byte b2 = 0; b2 < 4; b2 = (byte) (b2 + 1)) {
            arrayList.clear();
            int size = arrayList2.size();
            int i = 0;
            while (i < size - 1) {
                FPoint3 fPoint3 = (FPoint3) arrayList2.get(i % size);
                int i2 = i + 1;
                FPoint3 fPoint4 = (FPoint3) arrayList2.get(i2 % size);
                if (i == 0 && a(fPoint3, fPointArr[b2], fPointArr[(b2 + 1) % fPointArr.length])) {
                    arrayList.add(fPoint3);
                }
                int i3 = b2 + 1;
                if (a(fPoint3, fPointArr[b2], fPointArr[i3 % fPointArr.length])) {
                    if (a(fPoint4, fPointArr[b2], fPointArr[i3 % fPointArr.length])) {
                        arrayList.add(fPoint4);
                    } else {
                        arrayList.add(a(fPointArr[b2], fPointArr[i3 % fPointArr.length], fPoint3, fPoint4, fPoint4.colorIndex));
                    }
                } else if (a(fPoint4, fPointArr[b2], fPointArr[i3 % fPointArr.length])) {
                    arrayList.add(a(fPointArr[b2], fPointArr[i3 % fPointArr.length], fPoint3, fPoint4, fPoint3.colorIndex));
                    arrayList.add(fPoint4);
                }
                i = i2;
            }
            arrayList2.clear();
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                arrayList2.add(arrayList.get(i4));
            }
        }
        return arrayList2;
    }

    public static float a(IMapConfig iMapConfig, float f) {
        if (iMapConfig != null) {
            if (f > iMapConfig.getMaxZoomLevel()) {
                return iMapConfig.getMaxZoomLevel();
            }
            return f < iMapConfig.getMinZoomLevel() ? iMapConfig.getMinZoomLevel() : f;
        }
        if (f > 20.0f) {
            return 20.0f;
        }
        if (f < 3.0f) {
            return 3.0f;
        }
        return f;
    }

    public static void c(Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT > 10 || bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    public static FloatBuffer a(float[] fArr) {
        try {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
            FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
            floatBufferAsFloatBuffer.put(fArr);
            floatBufferAsFloatBuffer.position(0);
            return floatBufferAsFloatBuffer;
        } catch (Throwable th) {
            hn.c(th, "Util", "makeFloatBuffer1");
            th.printStackTrace();
            return null;
        }
    }

    public static FloatBuffer a(float[] fArr, FloatBuffer floatBuffer) {
        try {
            floatBuffer.clear();
            floatBuffer.put(fArr);
            floatBuffer.position(0);
            return floatBuffer;
        } catch (Throwable th) {
            hn.c(th, "Util", "makeFloatBuffer2");
            th.printStackTrace();
            return null;
        }
    }

    public static int a() {
        return a(Bitmap.createBitmap(512, 1024, Bitmap.Config.ARGB_8888), true);
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

    private static int a(Bitmap bitmap, boolean z) {
        int iA = a(0, bitmap, z);
        c(bitmap);
        return iA;
    }

    public static int a(int i, Bitmap bitmap, boolean z) {
        if (bitmap == null || bitmap.isRecycled()) {
            return 0;
        }
        if (i == 0) {
            int[] iArr = {0};
            GLES20.glGenTextures(1, iArr, 0);
            i = iArr[0];
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        if (z) {
            GLES20.glTexParameterf(3553, 10242, 10497.0f);
            GLES20.glTexParameterf(3553, 10243, 10497.0f);
        } else {
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
        }
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        return i;
    }

    public static void b(Rect rect, int i, int i2) {
        if (rect != null) {
            if (i < rect.left) {
                rect.left = i;
            }
            if (i > rect.right) {
                rect.right = i;
            }
            if (i2 > rect.top) {
                rect.top = i2;
            }
            if (i2 < rect.bottom) {
                rect.bottom = i2;
            }
        }
    }

    public static int a(int i, Bitmap bitmap, int i2, int i3) {
        if (bitmap == null || bitmap.isRecycled()) {
            return 0;
        }
        if (i == 0) {
            int[] iArr = {0};
            GLES20.glGenTextures(1, iArr, 0);
            i = iArr[0];
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLUtils.texSubImage2D(3553, 0, i2, i3, bitmap);
        return i;
    }

    public static boolean b(List<LatLng> list, CircleHoleOptions circleHoleOptions) {
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
                    if (circleHoleOptions.getRadius() >= ((double) AMapUtils.calculateLineDistance(circleHoleOptions.getCenter(), (LatLng) SpatialRelationUtil.calShortestDistancePoint(arrayList2, circleHoleOptions.getCenter()).second))) {
                        return true;
                    }
                    i3 = i;
                }
                return true;
            }
        } catch (Throwable th) {
            hn.c(th, "Util", "isPolygon2CircleIntersect");
            th.printStackTrace();
        }
        return false;
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
        StringBuilder sb = new StringBuilder();
        sb.append(file.toString());
        String str = File.separator;
        sb.append(str);
        File file2 = new File(sb.toString());
        if (!file2.exists()) {
            file2.mkdir();
        }
        return file.toString() + str;
    }

    private static boolean b(List<LatLng> list, List<LatLng> list2) {
        int i;
        int i2;
        int i3 = 0;
        while (i3 < list.size() && (i = i3 + 1) < list.size()) {
            try {
                int i4 = 0;
                while (i4 < list2.size() && (i2 = i4 + 1) < list2.size()) {
                    boolean zA = em.a(list.get(i3), list.get(i), list2.get(i4), list2.get(i2));
                    if (zA) {
                        return zA;
                    }
                    i4 = i2;
                }
                i3 = i;
            } catch (Throwable th) {
                hn.c(th, "Util", "isSegmentsIntersect");
                th.printStackTrace();
            }
        }
        return false;
    }

    public static String a(int i) {
        if (i < 1000) {
            return i + "m";
        }
        return (i / 1000) + SportAnalytics.ParamValue.MapButtonType.KM;
    }

    public static boolean b(List<LatLng> list, PolygonHoleOptions polygonHoleOptions) {
        boolean z = false;
        if (list == null || polygonHoleOptions == null) {
            return false;
        }
        try {
            List<LatLng> points = polygonHoleOptions.getPoints();
            boolean zA = false;
            for (int i = 0; i < points.size(); i++) {
                try {
                    zA = a(points.get(i), list);
                    if (!zA) {
                        return zA;
                    }
                } catch (Throwable th) {
                    th = th;
                    z = zA;
                    hn.c(th, "PolygonDelegateImp", "isPolygonInPolygon");
                    th.printStackTrace();
                    return z;
                }
            }
            return zA;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String a(InputStream inputStream) {
        try {
            return new String(b(inputStream), "utf-8");
        } catch (Throwable th) {
            hn.c(th, "Util", "decodeAssetResData");
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x00e5 A[Catch: IOException -> 0x00d3, TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x00d3, blocks: (B:104:0x00e5, B:93:0x00cf, B:86:0x00c3), top: B:106:0x00c1, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0088 A[Catch: IOException -> 0x002c, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x002c, blocks: (B:10:0x0027, B:18:0x0038, B:58:0x0088, B:49:0x0077, B:80:0x00b7, B:71:0x00a6, B:9:0x0024, B:64:0x009a), top: B:114:0x0008, inners: #2, #17 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00b7 A[Catch: IOException -> 0x002c, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x002c, blocks: (B:10:0x0027, B:18:0x0038, B:58:0x0088, B:49:0x0077, B:80:0x00b7, B:71:0x00a6, B:9:0x0024, B:64:0x009a), top: B:114:0x0008, inners: #2, #17 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static String a(File file) throws Throwable {
        ?? r7;
        FileInputStream fileInputStream;
        IOException e;
        BufferedReader bufferedReader;
        FileNotFoundException e2;
        StringBuffer stringBuffer = new StringBuffer();
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, "utf-8"));
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line != null) {
                                    stringBuffer.append(line);
                                } else {
                                    try {
                                        try {
                                            break;
                                        } catch (IOException e3) {
                                            e3.printStackTrace();
                                            bufferedReader.close();
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException e4) {
                                            e4.printStackTrace();
                                        }
                                        throw th;
                                    }
                                }
                            } catch (FileNotFoundException e5) {
                                e2 = e5;
                                hn.c(e2, "Util", "readFile fileNotFound");
                                e2.printStackTrace();
                                if (fileInputStream != null) {
                                    try {
                                        try {
                                            fileInputStream.close();
                                            if (bufferedReader != null) {
                                                bufferedReader.close();
                                            }
                                        } catch (IOException e6) {
                                            e6.printStackTrace();
                                            if (bufferedReader != null) {
                                                bufferedReader.close();
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        if (bufferedReader != null) {
                                            try {
                                                bufferedReader.close();
                                            } catch (IOException e7) {
                                                e7.printStackTrace();
                                            }
                                        }
                                        throw th2;
                                    }
                                } else if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                            } catch (IOException e8) {
                                e = e8;
                                hn.c(e, "Util", "readFile io");
                                e.printStackTrace();
                                if (fileInputStream != null) {
                                    try {
                                        try {
                                            fileInputStream.close();
                                            if (bufferedReader != null) {
                                                bufferedReader.close();
                                            }
                                        } catch (IOException e9) {
                                            e9.printStackTrace();
                                            if (bufferedReader != null) {
                                                bufferedReader.close();
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        if (bufferedReader != null) {
                                            try {
                                                bufferedReader.close();
                                            } catch (IOException e10) {
                                                e10.printStackTrace();
                                            }
                                        }
                                        throw th3;
                                    }
                                } else if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                            }
                        }
                        fileInputStream.close();
                        bufferedReader.close();
                    } catch (FileNotFoundException e11) {
                        e2 = e11;
                        bufferedReader = null;
                    } catch (IOException e12) {
                        e = e12;
                        bufferedReader = null;
                    } catch (Throwable th4) {
                        th = th4;
                        file = null;
                        fileInputStream2 = fileInputStream;
                        r7 = file;
                        try {
                            try {
                                if (fileInputStream2 != null) {
                                    try {
                                        fileInputStream2.close();
                                        if (r7 != 0) {
                                            r7.close();
                                        }
                                    } catch (IOException e13) {
                                        e13.printStackTrace();
                                        if (r7 != 0) {
                                            r7.close();
                                        }
                                        throw th;
                                    }
                                } else if (r7 != 0) {
                                    r7.close();
                                }
                            } catch (IOException e14) {
                                e14.printStackTrace();
                            }
                            throw th;
                        } catch (Throwable th5) {
                            if (r7 != 0) {
                                try {
                                    r7.close();
                                } catch (IOException e15) {
                                    e15.printStackTrace();
                                }
                            }
                            throw th5;
                        }
                    }
                } catch (IOException e16) {
                    e16.printStackTrace();
                }
            } catch (FileNotFoundException e17) {
                fileInputStream = null;
                e2 = e17;
                bufferedReader = null;
            } catch (IOException e18) {
                fileInputStream = null;
                e = e18;
                bufferedReader = null;
            } catch (Throwable th6) {
                th = th6;
                r7 = 0;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                    if (r7 != 0) {
                        r7.close();
                    }
                } else if (r7 != 0) {
                    r7.close();
                }
                throw th;
            }
            return stringBuffer.toString();
        } catch (Throwable th7) {
            th = th7;
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

    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    public static boolean a(LatLng latLng, List<LatLng> list) {
        boolean z;
        boolean z2;
        if (latLng == null || list == null) {
            return false;
        }
        double d = latLng.longitude;
        double d2 = latLng.latitude;
        if (list.size() < 3) {
            return false;
        }
        if (list.get(0).equals(list.get(list.size() - 1))) {
            z = false;
        } else {
            list.add(list.get(0));
            z = true;
        }
        int i = 0;
        int i2 = 0;
        while (i < list.size() - 1) {
            try {
                double d3 = list.get(i).longitude;
                double d4 = list.get(i).latitude;
                i++;
                double d5 = list.get(i).longitude;
                double d6 = list.get(i).latitude;
                double d7 = d2;
                double d8 = d;
                if (b(d, d2, d3, d4, d5, d6)) {
                    if (z) {
                        list.remove(list.size() - 1);
                    }
                    return true;
                }
                double d9 = d6 - d4;
                if (Math.abs(d9) >= 1.0E-9d) {
                    if (b(d3, d4, d8, d7, 180.0d, d7)) {
                        if (d4 > d6) {
                            i2++;
                        }
                    } else if (!b(d5, d6, d8, d7, 180.0d, d7)) {
                        double d10 = d5 - d3;
                        double d11 = d7 - d7;
                        double d12 = 180.0d - d8;
                        double d13 = (d10 * d11) - (d9 * d12);
                        if (d13 != 0.0d) {
                            double d14 = d4 - d7;
                            double d15 = d3 - d8;
                            double d16 = ((d12 * d14) - (d11 * d15)) / d13;
                            double d17 = ((d14 * d10) - (d15 * d9)) / d13;
                            if (d16 < 0.0d || d16 > 1.0d || d17 < 0.0d || d17 > 1.0d) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            i2++;
                        }
                    } else if (d6 > d4) {
                        i2++;
                    }
                }
                d2 = d7;
                d = d8;
            } catch (Throwable th) {
                if (z) {
                    list.remove(list.size() - 1);
                }
                throw th;
            }
        }
        boolean z3 = i2 % 2 != 0;
        if (z) {
            list.remove(list.size() - 1);
        }
        return z3;
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

    public static List<FPoint> a(FPoint[] fPointArr, List<FPoint> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list);
        for (byte b2 = 0; b2 < 4; b2 = (byte) (b2 + 1)) {
            arrayList.clear();
            int size = arrayList2.size();
            int i = 0;
            while (i < size - 1) {
                FPoint fPoint = (FPoint) arrayList2.get(i % size);
                int i2 = i + 1;
                FPoint fPoint2 = (FPoint) arrayList2.get(i2 % size);
                if (i == 0 && a(fPoint, fPointArr[b2], fPointArr[(b2 + 1) % fPointArr.length])) {
                    arrayList.add(fPoint);
                }
                int i3 = b2 + 1;
                if (a(fPoint, fPointArr[b2], fPointArr[i3 % fPointArr.length])) {
                    if (a(fPoint2, fPointArr[b2], fPointArr[i3 % fPointArr.length])) {
                        arrayList.add(fPoint2);
                    } else {
                        arrayList.add(a(fPointArr[b2], fPointArr[i3 % fPointArr.length], fPoint, fPoint2));
                    }
                } else if (a(fPoint2, fPointArr[b2], fPointArr[i3 % fPointArr.length])) {
                    arrayList.add(a(fPointArr[b2], fPointArr[i3 % fPointArr.length], fPoint, fPoint2));
                    arrayList.add(fPoint2);
                }
                i = i2;
            }
            arrayList2.clear();
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                arrayList2.add(arrayList.get(i4));
            }
        }
        return arrayList2;
    }

    public static FPoint[] a(IAMapDelegate iAMapDelegate) {
        float skyHeight = iAMapDelegate.getSkyHeight();
        FPoint fPointObtain = FPoint.obtain();
        int i = (int) (skyHeight - 10.0f);
        iAMapDelegate.pixel2Map(-100, i, fPointObtain);
        a[0].set(((PointF) fPointObtain).x, ((PointF) fPointObtain).y);
        FPoint fPointObtain2 = FPoint.obtain();
        iAMapDelegate.pixel2Map(iAMapDelegate.getMapWidth() + 100, i, fPointObtain2);
        a[1].set(((PointF) fPointObtain2).x, ((PointF) fPointObtain2).y);
        FPoint fPointObtain3 = FPoint.obtain();
        iAMapDelegate.pixel2Map(iAMapDelegate.getMapWidth() + 100, iAMapDelegate.getMapHeight() + 100, fPointObtain3);
        a[2].set(((PointF) fPointObtain3).x, ((PointF) fPointObtain3).y);
        FPoint fPointObtain4 = FPoint.obtain();
        iAMapDelegate.pixel2Map(-100, iAMapDelegate.getMapHeight() + 100, fPointObtain4);
        a[3].set(((PointF) fPointObtain4).x, ((PointF) fPointObtain4).y);
        fPointObtain.recycle();
        fPointObtain2.recycle();
        fPointObtain3.recycle();
        fPointObtain4.recycle();
        return a;
    }

    private static FPoint3 a(FPoint fPoint, FPoint fPoint2, FPoint3 fPoint3, FPoint3 fPoint4, int i) {
        FPoint3 fPoint5 = new FPoint3(0.0f, 0.0f, i);
        float f = ((PointF) fPoint2).y;
        float f2 = ((PointF) fPoint).y;
        float f3 = ((PointF) fPoint).x;
        float f4 = ((PointF) fPoint3).x;
        float f5 = ((PointF) fPoint2).x;
        float f6 = ((PointF) fPoint3).y;
        double d = ((f - f2) * (f3 - f4)) - ((f5 - f3) * (f2 - f6));
        float f7 = f - f2;
        float f8 = ((PointF) fPoint4).x;
        float f9 = f5 - f3;
        float f10 = ((PointF) fPoint4).y;
        double d2 = (f7 * (f8 - f4)) - (f9 * (f10 - f6));
        ((PointF) fPoint5).x = (float) (((double) f4) + ((((double) (f8 - f4)) * d) / d2));
        ((PointF) fPoint5).y = (float) (((double) f6) + ((((double) (f10 - f6)) * d) / d2));
        return fPoint5;
    }

    private static FPoint a(FPoint fPoint, FPoint fPoint2, FPoint fPoint3, FPoint fPoint4) {
        FPoint fPointObtain = FPoint.obtain(0.0f, 0.0f);
        float f = ((PointF) fPoint2).y;
        float f2 = ((PointF) fPoint).y;
        float f3 = ((PointF) fPoint).x;
        float f4 = ((PointF) fPoint3).x;
        float f5 = ((PointF) fPoint2).x;
        float f6 = ((PointF) fPoint3).y;
        double d = ((f - f2) * (f3 - f4)) - ((f5 - f3) * (f2 - f6));
        float f7 = f - f2;
        float f8 = ((PointF) fPoint4).x;
        float f9 = f5 - f3;
        float f10 = ((PointF) fPoint4).y;
        double d2 = (f7 * (f8 - f4)) - (f9 * (f10 - f6));
        ((PointF) fPointObtain).x = (float) (((double) f4) + ((((double) (f8 - f4)) * d) / d2));
        ((PointF) fPointObtain).y = (float) (((double) f6) + ((((double) (f10 - f6)) * d) / d2));
        return fPointObtain;
    }

    public static boolean a(FPoint fPoint, FPoint[] fPointArr) {
        if (fPointArr == null) {
            return false;
        }
        byte b2 = 0;
        while (b2 < fPointArr.length) {
            FPoint fPoint2 = fPointArr[b2];
            int i = b2 + 1;
            if (!a(fPoint, fPoint2, fPointArr[i % fPointArr.length])) {
                return false;
            }
            b2 = (byte) i;
        }
        return true;
    }

    private static boolean a(FPoint fPoint, FPoint fPoint2, FPoint fPoint3) {
        float f = ((PointF) fPoint3).x;
        float f2 = ((PointF) fPoint2).x;
        float f3 = ((PointF) fPoint).y;
        float f4 = ((PointF) fPoint2).y;
        return ((double) (((f - f2) * (f3 - f4)) - ((((PointF) fPoint).x - f2) * (((PointF) fPoint3).y - f4)))) >= 0.0d;
    }

    public static boolean a(List<IPoint> list, int i) {
        if (i < 3) {
            return false;
        }
        int i2 = i - 1;
        double d = 0.0d;
        for (int i3 = 0; i3 < i; i3++) {
            IPoint iPoint = list.get(i2);
            IPoint iPoint2 = list.get(i3);
            d += ((((double) ((Point) iPoint).x) / 1000000.0d) * (((double) ((Point) iPoint2).y) / 1000000.0d)) - ((((double) ((Point) iPoint2).x) / 1000000.0d) * (((double) ((Point) iPoint).y) / 1000000.0d));
            i2 = i3;
        }
        return d < 0.0d;
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
            hn.c(th, UtilsKt.TAG, "getBitmapFromView");
            th.printStackTrace();
            return null;
        }
    }

    public static DPoint a(LatLng latLng) {
        double d = (latLng.longitude / 360.0d) + 0.5d;
        double dSin = Math.sin(Math.toRadians(latLng.latitude));
        return DPoint.obtain(d * 1.0d, (((Math.log((dSin + 1.0d) / (1.0d - dSin)) * 0.5d) / (-6.283185307179586d)) + 0.5d) * 1.0d);
    }

    public static boolean a(Rect rect, int i, int i2) {
        return rect.contains(i, i2);
    }

    public static Pair<Float, IPoint> a(AbstractCameraUpdateMessage abstractCameraUpdateMessage, IMapConfig iMapConfig) {
        return a(iMapConfig, Math.max(abstractCameraUpdateMessage.paddingLeft, 1), Math.max(abstractCameraUpdateMessage.paddingRight, 1), Math.max(abstractCameraUpdateMessage.paddingTop, 1), Math.max(abstractCameraUpdateMessage.paddingBottom, 1), abstractCameraUpdateMessage.bounds, abstractCameraUpdateMessage.width, abstractCameraUpdateMessage.height);
    }

    public static Pair<Float, IPoint> a(IMapConfig iMapConfig, int i, int i2, int i3, int i4, LatLngBounds latLngBounds, int i5, int i6) {
        LatLng latLng;
        int i7;
        float f;
        float f2;
        int i8;
        if (latLngBounds == null || (latLng = latLngBounds.northeast) == null || latLngBounds.southwest == null || iMapConfig == null) {
            return null;
        }
        Point pointLatLongToPixels = VirtualEarthProjection.latLongToPixels(latLng.latitude, latLng.longitude, 20);
        LatLng latLng2 = latLngBounds.southwest;
        Point pointLatLongToPixels2 = VirtualEarthProjection.latLongToPixels(latLng2.latitude, latLng2.longitude, 20);
        int i9 = pointLatLongToPixels.x;
        int i10 = pointLatLongToPixels2.x;
        int i11 = i9 - i10;
        int i12 = pointLatLongToPixels2.y;
        int i13 = pointLatLongToPixels.y;
        int i14 = i12 - i13;
        int i15 = i5 - (i + i2);
        int i16 = i6 - (i3 + i4);
        if (i11 < 0 && i14 < 0) {
            return null;
        }
        if (i11 <= 0) {
            i11 = 1;
        }
        int i17 = i14 <= 0 ? 1 : i14;
        if (i15 <= 0) {
            i15 = 1;
        }
        if (i16 <= 0) {
            i16 = 1;
        }
        Pair<Float, Boolean> pairB = b(iMapConfig, i9, i13, i10, i12, i15, i16);
        float fFloatValue = ((Float) pairB.first).floatValue();
        boolean zBooleanValue = ((Boolean) pairB.second).booleanValue();
        float fA = a(iMapConfig.getMapZoomScale(), fFloatValue, i11);
        float fA2 = a(iMapConfig.getMapZoomScale(), fFloatValue, i17);
        if (fFloatValue >= iMapConfig.getMaxZoomLevel()) {
            i7 = (int) (pointLatLongToPixels2.x + ((((i2 - i) + fA) * i11) / (fA * 2.0f)));
            i8 = pointLatLongToPixels.y;
        } else {
            if (zBooleanValue) {
                i7 = (int) (pointLatLongToPixels2.x + ((((i5 / 2) - i) / fA) * i11));
                i8 = pointLatLongToPixels.y;
            } else {
                i7 = (int) (pointLatLongToPixels2.x + ((((i2 - i) + fA) * i11) / (fA * 2.0f)));
                f = pointLatLongToPixels.y;
                f2 = (((i6 / 2) - i3) / fA2) * i17;
            }
            return new Pair<>(Float.valueOf(fFloatValue), IPoint.obtain((int) (i7 + a(iMapConfig.getMapZoomScale(), fFloatValue, iMapConfig.getAnchorX() - (iMapConfig.getMapWidth() >> 1))), (int) (((int) (f + f2)) + a(iMapConfig.getMapZoomScale(), fFloatValue, iMapConfig.getAnchorY() - (iMapConfig.getMapHeight() >> 1)))));
        }
        f = i8;
        f2 = (((i4 - i3) + fA2) * i17) / (fA2 * 2.0f);
        return new Pair<>(Float.valueOf(fFloatValue), IPoint.obtain((int) (i7 + a(iMapConfig.getMapZoomScale(), fFloatValue, iMapConfig.getAnchorX() - (iMapConfig.getMapWidth() >> 1))), (int) (((int) (f + f2)) + a(iMapConfig.getMapZoomScale(), fFloatValue, iMapConfig.getAnchorY() - (iMapConfig.getMapHeight() >> 1)))));
    }

    private static double a(float f, double d, double d2) {
        return 20.0d - (Math.log(d2 / (d * ((double) f))) / Math.log(2.0d));
    }

    private static float a(float f, float f2, double d) {
        return (float) (d / (Math.pow(2.0d, 20.0f - f2) * ((double) f)));
    }

    private static float a(float f, float f2, float f3) {
        return (float) (((double) f3) * Math.pow(2.0d, 20.0f - f2) * ((double) f));
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

    public static float a(IGLMapState iGLMapState, int i, int i2, double d, double d2, int i3) {
        IPoint iPointObtain = IPoint.obtain();
        VirtualEarthProjection.latLongToPixels(d, d2, 20, iPointObtain);
        float fCalculateMapZoomer = iGLMapState != null ? iGLMapState.calculateMapZoomer(i, i2, ((Point) iPointObtain).x, ((Point) iPointObtain).y, i3) : 3.0f;
        iPointObtain.recycle();
        return fCalculateMapZoomer;
    }

    public static synchronized int[] a(int i, int i2, int i3, int i4, IMapConfig iMapConfig, IGLMapState iGLMapState, int i5, int i6) {
        int mapWidth;
        int mapHeight;
        int anchorX;
        int anchorY;
        mapWidth = iMapConfig.getMapWidth();
        mapHeight = iMapConfig.getMapHeight();
        anchorX = iMapConfig.getAnchorX();
        anchorY = iMapConfig.getAnchorY();
        return new int[]{(int) Math.max(i3 + a(iMapConfig.getMapZoomScale(), iGLMapState.getMapZoomer(), anchorX), Math.min(i5, i - a(iMapConfig.getMapZoomScale(), iGLMapState.getMapZoomer(), mapWidth - anchorX))), (int) Math.max(i2 + a(iMapConfig.getMapZoomScale(), iGLMapState.getMapZoomer(), anchorY), Math.min(i6, i4 - a(iMapConfig.getMapZoomScale(), iGLMapState.getMapZoomer(), mapHeight - anchorY)))};
    }

    public static void a(Rect rect) {
        if (rect != null) {
            rect.set(Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
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
            byte[] bArrD = d(bitmapCopy);
            if (bArrD == null) {
                bArrD = bArr;
            }
            c(bitmapCopy);
            c(bitmapDecodeByteArray);
            return bArrD;
        } catch (Throwable th) {
            th.printStackTrace();
            return bArr;
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
            hn.c(th, "Util", "isPolygon2CircleIntersect");
            th.printStackTrace();
            return false;
        }
    }

    private static boolean a(List<LatLng> list, List<LatLng> list2) {
        for (int i = 0; i < list2.size(); i++) {
            try {
                if (a(list2.get(i), list)) {
                    return true;
                }
            } catch (Throwable th) {
                hn.c(th, "Util", "isPolygon2PolygonIntersect");
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

    public static float a(DPoint dPoint, DPoint dPoint2) {
        if (dPoint == null || dPoint2 == null) {
            return 0.0f;
        }
        double d = dPoint.x;
        double d2 = dPoint2.x;
        return (float) ((Math.atan2(dPoint2.y - dPoint.y, d2 - d) / 3.141592653589793d) * 180.0d);
    }

    public static boolean a(List<LatLng> list, List<BaseHoleOptions> list2, CircleHoleOptions circleHoleOptions) {
        try {
            return !b(list, circleHoleOptions) && a(list, list2, circleHoleOptions.getCenter());
        } catch (Throwable th) {
            hn.c(th, "PolygonDelegateImp", "isCircleInPolygon");
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
                    Iterator<BaseHoleOptions> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (a(it2.next(), latLng)) {
                            return false;
                        }
                    }
                }
            } catch (Throwable th) {
                hn.c(th, "PolygonDelegateImp", SearchCriteria.CONTAINS);
                th.printStackTrace();
                return false;
            }
        }
        return a(latLng, list);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    public static boolean a(double d, LatLng latLng, List<BaseHoleOptions> list, PolygonHoleOptions polygonHoleOptions) {
        boolean z = true;
        try {
            List<LatLng> points = polygonHoleOptions.getPoints();
            boolean z2 = true;
            for (int i = 0; i < points.size(); i++) {
                try {
                    LatLng latLng2 = points.get(i);
                    if (list.size() > 0) {
                        Iterator<BaseHoleOptions> it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (!a(it2.next(), latLng2)) {
                                }
                            } else {
                                z2 = d >= ((double) AMapUtils.calculateLineDistance(latLng, latLng2));
                            }
                        }
                    } else if (d >= ((double) AMapUtils.calculateLineDistance(latLng, latLng2))) {
                    }
                    if (!z2) {
                        return z2;
                    }
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                    hn.c(th, "CircleDelegateImp", "isPolygonInCircle");
                    th.printStackTrace();
                    return z;
                }
            }
            return z2;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean a(double d, LatLng latLng, CircleHoleOptions circleHoleOptions) {
        try {
            return ((double) AMapUtils.calculateLineDistance(circleHoleOptions.getCenter(), latLng)) <= d - circleHoleOptions.getRadius();
        } catch (Throwable th) {
            hn.c(th, "CircleDelegateImp", "isCircleInCircle");
            th.printStackTrace();
            return true;
        }
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
                    int i7 = (i6 & (-16711936)) | ((i6 << 16) & ItemTouchHelper.ACTION_MODE_DRAG_MASK) | ((i6 >> 16) & 255);
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
            hn.c(th, "Util", "rgbaToArgb");
            th.printStackTrace();
            return null;
        }
    }

    public static int a(Bitmap bitmap) {
        return a(bitmap, false);
    }
}
