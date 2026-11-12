package com.huawei.hms.scankit.p;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.huawei.hianalytics.core.transport.Utils;
import com.huawei.hms.framework.common.SystemPropUtils;
import com.huawei.hms.hmsscankit.ScanUtil;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanBase;
import com.huawei.openalliance.ad.beans.inner.CountryCodeBean;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.OsType;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public abstract class w7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f16404a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f16405b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f16406c = true;

    private static String b(Context context, Intent intent) {
        Uri data = new Intent(intent).getData();
        if (DocumentsContract.isDocumentUri(context, data)) {
            String documentId = DocumentsContract.getDocumentId(data);
            if ("com.android.providers.media.documents".equals(data.getAuthority())) {
                return a(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=" + documentId.split(":")[1]);
            }
            if ("com.android.providers.downloads.documents".equals(data.getAuthority())) {
                try {
                    return a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(documentId)), (String) null);
                } catch (NumberFormatException unused) {
                    o4.b("ScankitUtils", "NumberFormatException in withAppendedId");
                    return null;
                } catch (Exception unused2) {
                    o4.b("ScankitUtils", "Exception in withAppendedId");
                    return null;
                }
            }
        } else if ("content".equalsIgnoreCase(data.getScheme())) {
            return a(context, data, (String) null);
        }
        return null;
    }

    public static boolean f(Context context) {
        return (context instanceof Activity) && ((Activity) context).isInMultiWindowMode();
    }

    public static boolean f() {
        String str = Build.BRAND;
        return str != null && str.toLowerCase().equals("samsung");
    }

    public static boolean g(Context context) {
        try {
            return "CN".equalsIgnoreCase(SystemPropUtils.getProperty("get", CountryCodeBean.VENDORCOUNTRY_SYSTEMPROP, "android.os.SystemProperties", "UNKNOWN"));
        } catch (RuntimeException | Exception unused) {
            return false;
        }
    }

    public static boolean k(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), a(), 0) == 0;
    }

    public static int d(Context context) {
        int identifier;
        if (context.getResources() == null || (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", OsType.ANDROID)) <= 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(identifier);
    }

    public static boolean d() {
        return "ar".equals(Locale.getDefault().getLanguage()) || Constants.URDU_LANG.equals(Locale.getDefault().getLanguage()) || "ug".equals(Locale.getDefault().getLanguage()) || "iw".equals(Locale.getDefault().getLanguage()) || "fa".equals(Locale.getDefault().getLanguage());
    }

    public static boolean e(Context context) {
        String string = context.getResources().getConfiguration().toString();
        return string.contains("hwMultiwindow-magic") || string.contains("hw-magic-windows");
    }

    public static boolean e() {
        try {
            return "-1".equalsIgnoreCase(SystemPropUtils.getProperty("get", "sys.hw_multiwin_for_camera", "android.os.SystemProperties", "UNKNOWN"));
        } catch (RuntimeException | Exception unused) {
            return false;
        }
    }

    public static boolean c(Context context) {
        if (b(context) && TextUtils.isEmpty(f16405b)) {
            f16405b = context.getSharedPreferences("scanExt", 0).getString("scanExt", "unSet");
        }
        return "forbid".equals(f16405b);
    }

    public static boolean j(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return Math.sqrt(Math.pow((double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi), 2.0d) + Math.pow((double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi), 2.0d)) >= 7.0d;
    }

    public static boolean h(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return Math.sqrt(Math.pow((double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi), 2.0d) + Math.pow((double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi), 2.0d)) >= 5.5d;
    }

    public static boolean i(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return Math.sqrt(Math.pow((double) (((float) displayMetrics.widthPixels) / displayMetrics.xdpi), 2.0d) + Math.pow((double) (((float) displayMetrics.heightPixels) / displayMetrics.ydpi), 2.0d)) >= 8.0d && ((float) displayMetrics.widthPixels) / ((float) displayMetrics.heightPixels) > 1.3f;
    }

    public static boolean a(Context context) {
        return b(context) || context.checkPermission("android.permission.CAMERA", Process.myPid(), Process.myUid()) == 0;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static Bitmap a(Context context, Uri uri) throws Throwable {
        InputStream inputStreamOpenInputStream;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        ?? r4 = 0;
        try {
            try {
                try {
                    inputStreamOpenInputStream = context.getApplicationContext().getContentResolver().openInputStream(uri);
                    if (inputStreamOpenInputStream == null) {
                        if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream.close();
                        }
                        return null;
                    }
                    try {
                        byte[] bArrA = a(inputStreamOpenInputStream);
                        BitmapFactory.decodeByteArray(bArrA, 0, bArrA.length, options);
                        a(context, options);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrA, 0, bArrA.length, options);
                        try {
                            inputStreamOpenInputStream.close();
                            return bitmapDecodeByteArray;
                        } catch (IOException unused) {
                            o4.b("ScankitUtils", "IOException in getImagePath");
                            return bitmapDecodeByteArray;
                        }
                    } catch (IOException unused2) {
                        o4.b("ScankitUtils", "compressBitmapFromUri IOException");
                        if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    r4 = uri;
                    if (r4 != 0) {
                        try {
                            r4.close();
                        } catch (IOException unused3) {
                            o4.b("ScankitUtils", "IOException in getImagePath");
                        }
                    }
                    throw th;
                }
            } catch (IOException unused4) {
                inputStreamOpenInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (r4 != 0) {
                    r4.close();
                }
                throw th;
            }
        } catch (IOException unused5) {
            o4.b("ScankitUtils", "IOException in getImagePath");
        }
    }

    public static boolean c(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        return rotation == 0 || rotation == 2;
    }

    public static boolean c() {
        String str = Build.MANUFACTURER;
        return str.equalsIgnoreCase("HUAWEI") || str.equalsIgnoreCase("honor");
    }

    public static boolean b(Activity activity) {
        return a(activity) == 102;
    }

    public static int b(int i) {
        if (i == 8191) {
            return HmsScanBase.ALL_SCAN_TYPE;
        }
        if (i == HmsScanBase.QRCODE_SCAN_TYPE) {
            return 256;
        }
        if (i == HmsScanBase.AZTEC_SCAN_TYPE) {
            return 4096;
        }
        if (i == HmsScanBase.DATAMATRIX_SCAN_TYPE) {
            return 16;
        }
        if (i == HmsScanBase.PDF417_SCAN_TYPE) {
            return 2048;
        }
        if (i == HmsScanBase.CODE39_SCAN_TYPE) {
            return 2;
        }
        if (i == HmsScanBase.CODE93_SCAN_TYPE) {
            return 4;
        }
        if (i == HmsScanBase.CODE128_SCAN_TYPE) {
            return 1;
        }
        if (i == HmsScanBase.EAN13_SCAN_TYPE) {
            return 32;
        }
        if (i == HmsScanBase.EAN8_SCAN_TYPE) {
            return 64;
        }
        if (i == HmsScanBase.ITF14_SCAN_TYPE) {
            return 128;
        }
        if (i == HmsScanBase.UPCCODE_A_SCAN_TYPE) {
            return 512;
        }
        if (i == HmsScanBase.UPCCODE_E_SCAN_TYPE) {
            return 1024;
        }
        if (i == HmsScanBase.CODABAR_SCAN_TYPE) {
            return 8;
        }
        if (i == HmsScanBase.WX_SCAN_TYPE) {
            return 16384;
        }
        if (i == HmsScanBase.MULTI_FUNCTIONAL_SCAN_TYPE) {
            return 8192;
        }
        return i;
    }

    public static boolean b() {
        try {
            return "-1".equalsIgnoreCase(SystemPropUtils.getProperty("get", "sys.multiwin_for_camera", "android.os.SystemProperties", "UNKNOWN"));
        } catch (RuntimeException | Exception unused) {
            return false;
        }
    }

    public static boolean b(Context context) {
        if (TextUtils.isEmpty(f16404a)) {
            try {
                f16404a = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("scanExt", "unSet");
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("scanerror", "checkPermission NameNotFoundException");
            } catch (Exception unused2) {
                Log.e("scanerror", "checkPermission Exception");
            }
        }
        return "readUri".equals(f16404a);
    }

    private static void a(Context context, BitmapFactory.Options options) {
        int i;
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        if (i2 == 0 || i3 == 0) {
            return;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            i = ((double) memoryInfo.totalMem) / Math.pow(1024.0d, 3.0d) < 5.5d ? 1200 : 3000;
        } catch (NullPointerException unused) {
            o4.b(TrackConstants$Events.EXCEPTION, "NullPointerException");
        } catch (Exception unused2) {
            o4.b(TrackConstants$Events.EXCEPTION, "Exception");
        }
        options.inSampleSize = i2 > i ? Math.round(i2 / i) : 1;
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inPurgeable = true;
        options.inInputShareable = true;
    }

    public static Bitmap a(Bitmap bitmap, float f, float f2) {
        if (f <= 0.0f || f2 <= 0.0f) {
            return null;
        }
        float f3 = 1.0f / f;
        float f4 = 1.0f / f2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = (int) (width * f);
        int i2 = (int) (height * f2);
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int[] iArr2 = new int[i * i2];
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                iArr2[(i3 * i) + i4] = iArr[(((int) (i3 * f4)) * width) + ((int) (i4 * f3))];
            }
        }
        Log.d(">>>", "dstPixels:" + i + " x " + i2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArr2, 0, i, 0, 0, i, i2);
        return bitmapCreateBitmap;
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return null;
        }
        return a(bitmap, i / bitmap.getWidth(), i2 / bitmap.getHeight());
    }

    public static Bitmap a(Context context, Intent intent) {
        Bitmap bitmapA;
        Bitmap bitmapCompressBitmap;
        if (!b(context)) {
            String strB = b(context, intent);
            if (TextUtils.isEmpty(strB)) {
                return null;
            }
            if (Build.VERSION.SDK_INT > 28 && context.getApplicationInfo() != null && context.getApplicationInfo().targetSdkVersion > 28) {
                o4.a("ScanBitmap", "compressBitmap above android 29");
                bitmapCompressBitmap = ScanUtil.compressBitmapForAndroid29(context, strB);
            } else {
                o4.a("ScanBitmap", "compressBitmap below android 29");
                bitmapCompressBitmap = ScanUtil.compressBitmap(context, strB);
            }
            if (bitmapCompressBitmap != null) {
                return bitmapCompressBitmap;
            }
            o4.a("ScanBitmap", "compressBitmap above android 29");
            return ScanUtil.compressBitmapForAndroid29(context, strB);
        }
        Uri data = intent.getData();
        if (data == null || (bitmapA = a(context, data)) == null) {
            return null;
        }
        return bitmapA;
    }

    private static String a(Context context, Uri uri, String str) {
        String string = null;
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, null, null);
            if (cursorQuery != null) {
                string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndex("_data")) : null;
                cursorQuery.close();
            }
            return string;
        } catch (IllegalStateException unused) {
            o4.b("ScankitUtils", "IllegalStateException in getImagePath");
            return null;
        } catch (Exception unused2) {
            o4.b("ScankitUtils", "Exception in getImagePath");
            return null;
        }
    }

    public static ResolveInfo a(Intent intent, String str, Activity activity) {
        intent.setPackage(str);
        List<ResolveInfo> listQueryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
        if (listQueryIntentActivities.isEmpty()) {
            return null;
        }
        return listQueryIntentActivities.get(0);
    }

    public static HmsScan[] a(HmsScan[] hmsScanArr) {
        if (hmsScanArr != null && hmsScanArr.length != 0) {
            for (HmsScan hmsScan : hmsScanArr) {
                if (hmsScan != null) {
                    hmsScan.scanType = b(hmsScan.scanType);
                }
            }
        }
        return hmsScanArr;
    }

    public static boolean a(byte[] bArr, int i) {
        return i >= 0 && i < bArr.length;
    }

    public static boolean a(float[] fArr, int i) {
        return i >= 0 && i < fArr.length;
    }

    public static boolean a(int[] iArr, int i) {
        return i >= 0 && i < iArr.length;
    }

    public static boolean a(String[] strArr, int i) {
        return i >= 0 && i < strArr.length;
    }

    public static boolean a(byte[][] bArr, int i) {
        return i >= 0 && i < bArr.length;
    }

    public static boolean a(int[][] iArr, int i) {
        return i >= 0 && i < iArr.length;
    }

    public static boolean a(String str, Activity activity) {
        PackageInfo packageInfo;
        try {
            packageInfo = activity.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            o4.d(Utils.TAG, "NameNotFoundException Exception");
            packageInfo = null;
        }
        if (packageInfo == null) {
            return false;
        }
        int i = packageInfo.applicationInfo.flags;
        return ((i & 1) == 1) || ((i & 128) == 1);
    }

    public static int a(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == -1 ? -1 : 0;
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            }
        }
    }

    public static Bitmap a(Bitmap bitmap, float f) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setRotate(f, width / 2, height / 2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        if (!bitmapCreateBitmap.equals(bitmap) && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        if (i == 0) {
            return a(bitmap, 90.0f);
        }
        if (i != 2) {
            return i != 3 ? bitmap : a(bitmap, 180.0f);
        }
        return a(bitmap, 270.0f);
    }

    public static int a(int i) {
        if (i <= 0) {
            return HmsScanBase.ALL_SCAN_TYPE;
        }
        if (((i - 1) & i) == 0) {
            return i;
        }
        int i2 = HmsScanBase.AZTEC_SCAN_TYPE;
        int iB = (i & i2) != 0 ? b(i2) : 0;
        int i3 = HmsScanBase.CODABAR_SCAN_TYPE;
        if ((i & i3) != 0) {
            iB |= b(i3);
        }
        int i4 = HmsScanBase.CODE39_SCAN_TYPE;
        if ((i & i4) != 0) {
            iB |= b(i4);
        }
        int i5 = HmsScanBase.CODE93_SCAN_TYPE;
        if ((i & i5) != 0) {
            iB |= b(i5);
        }
        int i6 = HmsScanBase.CODE128_SCAN_TYPE;
        if ((i & i6) != 0) {
            iB |= b(i6);
        }
        int i7 = HmsScanBase.DATAMATRIX_SCAN_TYPE;
        if ((i & i7) != 0) {
            iB |= b(i7);
        }
        int i8 = HmsScanBase.EAN8_SCAN_TYPE;
        if ((i & i8) != 0) {
            iB |= b(i8);
        }
        int i9 = HmsScanBase.EAN13_SCAN_TYPE;
        if ((i & i9) != 0) {
            iB |= b(i9);
        }
        int i10 = HmsScanBase.QRCODE_SCAN_TYPE;
        if ((i & i10) != 0) {
            iB |= b(i10);
        }
        int i11 = HmsScanBase.ITF14_SCAN_TYPE;
        if ((i & i11) != 0) {
            iB |= b(i11);
        }
        int i12 = HmsScanBase.PDF417_SCAN_TYPE;
        if ((i & i12) != 0) {
            iB |= b(i12);
        }
        int i13 = HmsScanBase.UPCCODE_A_SCAN_TYPE;
        if ((i & i13) != 0) {
            iB |= b(i13);
        }
        int i14 = HmsScanBase.UPCCODE_E_SCAN_TYPE;
        if ((i & i14) != 0) {
            iB |= b(i14);
        }
        int i15 = HmsScanBase.MULTI_FUNCTIONAL_SCAN_TYPE;
        if ((i & i15) != 0) {
            iB |= b(i15);
        }
        int i16 = HmsScanBase.WX_SCAN_TYPE;
        return (i & i16) != 0 ? b(i16) | iB : iB;
    }

    public static String a(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    private static String a() {
        String str = Build.BRAND;
        if (TextUtils.isEmpty(str) || str.equalsIgnoreCase("HUAWEI")) {
            return Constants.NAVIGATIONBAR_IS_MIN;
        }
        if (str.equalsIgnoreCase("XIAOMI")) {
            return "force_fsg_nav_bar";
        }
        return (str.equalsIgnoreCase("VIVO") || str.equalsIgnoreCase("OPPO")) ? "navigation_gesture_on" : Constants.NAVIGATIONBAR_IS_MIN;
    }

    public static int a(Activity activity) {
        try {
            Class<?> cls = Class.forName("com.huawei.android.app.ActivityManagerEx");
            Method declaredMethod = cls.getDeclaredMethod("getActivityWindowMode", Activity.class);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(cls, activity);
            if (objInvoke == null) {
                return -1;
            }
            return Integer.valueOf(String.valueOf(objInvoke)).intValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | NumberFormatException | InvocationTargetException unused) {
            return -1;
        }
    }
}
