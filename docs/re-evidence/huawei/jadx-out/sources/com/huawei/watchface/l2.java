package com.huawei.watchface;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.opengl.GLES10;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.manager.WatchFacePhotoAlbumManager;
import com.huawei.watchface.mvp.model.crypt.PversionSdUtils;
import com.huawei.watchface.mvp.model.datatype.ClipOptions;
import com.huawei.watchface.mvp.model.datatype.WatchFaceSupportInfo;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import com.huawei.watchface.mvp.ui.activity.ClipImageActivity;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.FileHelper;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.HwSfpPolicyManagerHelper;
import com.huawei.watchface.videoedit.utils.Utils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes20.dex */
public abstract class l2 {
    public static ArrayList d;
    public static ArrayList e;
    public static int g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f30277a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String[] f30278b = {".png", ".jpg", ".jpeg", ".bmp", Utils.SUFFIX_GIF, ".psd", WatchFaceProvider.SVG_SUFFIX, ".tif", ".tiff", ".webp", ".pcx"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String[] f30279c = {".png", ".jpg", ".jpeg"};
    public static String f = HwSfpPolicyManagerHelper.getFileDataUserPath() + File.separator + "watchfaceSearchCache";
    public static ConcurrentHashMap h = new ConcurrentHashMap();

    public class a extends TypeToken<ConcurrentHashMap<String, HashMap<String, String>>> {
    }

    public static String a(Bitmap bitmap) {
        try {
            HwLog.i("ImageClipper", "saveSearchImage enter");
            String str = f + File.separator + new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.ENGLISH).format(new Date()) + "_orig.png";
            if (a(bitmap, str, 60)) {
                return str;
            }
            return null;
        } catch (Exception e2) {
            HwLog.e("ImageClipper", "saveSearchImage Exception:" + HwLog.printException(e2));
            return null;
        }
    }

    public static int b(String str) {
        if (str == null) {
            HwLog.i("ImageClipper", "checkSearchFilePath() path is null.");
            return -1;
        }
        String strF = f(str);
        HwLog.i("ImageClipper", "checkSearchFilePath() fileSuffix : " + strF);
        if (TextUtils.isEmpty(strF)) {
            return -1;
        }
        if (f().contains(strF.toLowerCase(Locale.ENGLISH))) {
            return 0;
        }
        HwLog.i("ImageClipper", "checkSearchFilePath() SourceFile is not supported");
        return 1;
    }

    public static void c() {
        int[] iArr = new int[1];
        GLES10.glGetIntegerv(3379, iArr, 0);
        synchronized (f30277a) {
            g = iArr[0];
            HwLog.i("ImageClipper", "MaxTextureSizeBelowLollipop : " + g);
            if (g == 0) {
                g = 1080;
            }
        }
    }

    public static Bitmap d(Context context, String str, Uri uri) throws Throwable {
        File file = new File(str);
        if (!file.exists() || file.isDirectory()) {
            HwLog.i("ImageClipper", "prepareOriginalImage() PrepareFileNULL");
            return null;
        }
        HwLog.i("ImageClipper", "prepareOriginalImage() PrepareUri is NULL");
        if (uri == null) {
            HwLog.i("ImageClipper", "prepareOriginalImage() CreateUriFromFile");
            uri = a(context.getApplicationContext(), str);
            StringBuilder sb = new StringBuilder("prepareOriginalImage() CreatedUri : ");
            sb.append(uri != null);
            HwLog.i("ImageClipper", sb.toString());
        }
        b();
        Bitmap bitmapA = a(context, str, uri, a(context, str, uri));
        int iE = e(context, str, uri);
        HwLog.i("ImageClipper", "prepareOriginalImage() angle: " + iE);
        return (iE <= 0 || bitmapA == null) ? bitmapA : a(iE, bitmapA);
    }

    public static ConcurrentHashMap e() {
        return h;
    }

    public static List f() {
        synchronized (f30277a) {
            ArrayList arrayList = e;
            if (arrayList != null) {
                return arrayList;
            }
            e = new ArrayList(32);
            for (String str : f30279c) {
                e.add(str);
            }
            HwLog.i("ImageClipper", "sSupportSearchSuffixes : " + e.toString());
            return e;
        }
    }

    public static List g() {
        ArrayList arrayList;
        synchronized (f30277a) {
            if (d == null) {
                d = new ArrayList(32);
                for (String str : f30278b) {
                    d.add(str);
                }
                HwLog.i("ImageClipper", "SuffixContainers : " + d.toString());
            }
            arrayList = d;
        }
        return arrayList;
    }

    public static int e(Context context, String str, Uri uri) throws Throwable {
        int i;
        HwLog.i("ImageClipper", "readPictureAngle enter");
        ExifInterface exifInterfaceB = b(context, str, uri);
        int i2 = 0;
        if (exifInterfaceB != null) {
            int attributeInt = exifInterfaceB.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                i = 180;
            } else if (attributeInt != 6) {
                if (attributeInt != 8) {
                    HwLog.w("ImageClipper", "orientation:" + attributeInt);
                } else {
                    i = 270;
                }
                HwLog.i("ImageClipper", "readPictureAngle angle:" + i2);
            } else {
                i = 90;
            }
            i2 = i;
            HwLog.i("ImageClipper", "readPictureAngle angle:" + i2);
        }
        return i2;
    }

    public static void a() {
        HwLog.i("ImageClipper", "clearSearchImageFile enter");
        File file = new File(f);
        if (!file.exists()) {
            HwLog.i("ImageClipper", "clearSearchImageFile rootSearchFilePath is not exists");
        } else {
            CommonUtils.a(file);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static boolean c(Context context, String str, Uri uri) throws Throwable {
        Closeable closeable;
        ?? r8;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FileInputStream fileInputStream;
        ParcelFileDescriptor parcelFileDescriptor;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor2;
        ?? r3 = 0;
        fileInputStream = null;
        fileInputStream = null;
        fileInputStream = null;
        fileInputStream = null;
        fileInputStream = null;
        fileInputStream = null;
        fileInputStream = null;
        fileInputStream = null;
        fileInputStream = null;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    try {
                        if (Build.VERSION.SDK_INT <= 28) {
                            try {
                                context = 0;
                                fileInputStream2 = new FileInputStream(str);
                            } catch (FileNotFoundException unused) {
                                HwLog.e("ImageClipper", "imageUriIsEmpty FileNotFoundException");
                                if (uri == null) {
                                    HwLog.i("ImageClipper", "imageUriIsEmpty null uri");
                                    c0.a(null);
                                    c0.a(null);
                                    return true;
                                }
                                parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
                                if (parcelFileDescriptorOpenFileDescriptor != null) {
                                    context = parcelFileDescriptorOpenFileDescriptor;
                                    fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                                    parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                                    context = parcelFileDescriptor;
                                    fileInputStream2 = fileInputStream;
                                }
                            }
                        } else {
                            if (uri == null) {
                                HwLog.i("ImageClipper", "null uri");
                                c0.a(null);
                                c0.a(null);
                                return true;
                            }
                            parcelFileDescriptorOpenFileDescriptor2 = context.getContentResolver().openFileDescriptor(uri, "r");
                            if (parcelFileDescriptorOpenFileDescriptor2 != null) {
                                context = parcelFileDescriptorOpenFileDescriptor2;
                                fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor2.getFileDescriptor());
                                parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor2;
                                context = parcelFileDescriptor;
                                fileInputStream2 = fileInputStream;
                            }
                        }
                        if (fileInputStream2 != null && fileInputStream2.available() > 0) {
                            HwLog.i("ImageClipper", "imageUriIsEmpty return false");
                            c0.a(context);
                            c0.a(fileInputStream2);
                            return false;
                        }
                        c0.a(context);
                        c0.a(fileInputStream2);
                    } catch (FileNotFoundException unused2) {
                        HwLog.e("ImageClipper", "imageUriIsEmpty FileNotFoundException");
                        r8 = context;
                        c0.a(r8);
                        c0.a(fileInputStream2);
                    } catch (IOException unused3) {
                        HwLog.e("ImageClipper", "imageUriIsEmpty IOException");
                        r8 = context;
                        c0.a(r8);
                        c0.a(fileInputStream2);
                    } catch (IllegalStateException unused4) {
                        HwLog.e("ImageClipper", "imageUriIsEmpty IllegalStateException");
                        r8 = context;
                        c0.a(r8);
                        c0.a(fileInputStream2);
                    } catch (Exception unused5) {
                        HwLog.e("ImageClipper", "imageUriIsEmpty exception");
                        r8 = context;
                        c0.a(r8);
                        c0.a(fileInputStream2);
                    }
                } catch (Throwable th) {
                    r3 = context;
                    closeable = null;
                    th = th;
                    c0.a(r3);
                    c0.a(closeable);
                    throw th;
                }
            } catch (FileNotFoundException unused6) {
                context = 0;
            }
        } catch (IOException unused7) {
            context = 0;
        } catch (IllegalStateException unused8) {
            context = 0;
        } catch (Exception unused9) {
            context = 0;
        } catch (Throwable th2) {
            th = th2;
            closeable = null;
            c0.a(r3);
            c0.a(closeable);
            throw th;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v18, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.io.Closeable] */
    public static ExifInterface b(Context context, String str, Uri uri) throws Throwable {
        Throwable th;
        ?? OpenFileDescriptor;
        FileInputStream fileInputStream;
        ?? r5;
        ExifInterface exifInterface;
        ?? r6;
        HwLog.i("ImageClipper", "getExifInterface start");
        ?? r0 = 0;
        r0 = 0;
        FileInputStream fileInputStream2 = null;
        ExifInterface exifInterface2 = null;
        try {
            try {
                if (Build.VERSION.SDK_INT > 28) {
                    HwLog.i("ImageClipper", "android Q");
                    if (uri == null) {
                        HwLog.w("ImageClipper", "uri is null");
                        c0.a(null);
                        c0.a(null);
                        return null;
                    }
                    OpenFileDescriptor = context.getApplicationContext().getContentResolver().openFileDescriptor(uri, "r");
                    if (OpenFileDescriptor != 0) {
                        try {
                            fileInputStream = new FileInputStream(OpenFileDescriptor.getFileDescriptor());
                        } catch (IOException unused) {
                            fileInputStream = null;
                            HwLog.e("ImageClipper", "getExifInterface IOException");
                            r5 = OpenFileDescriptor;
                            c0.a(fileInputStream);
                            c0.a(r5);
                            HwLog.i("ImageClipper", "getExifInterface end");
                            return exifInterface2;
                        } catch (IllegalStateException unused2) {
                            fileInputStream = null;
                            HwLog.e("ImageClipper", "IllegalStateException getExifInterface");
                            r5 = OpenFileDescriptor;
                            c0.a(fileInputStream);
                            c0.a(r5);
                            HwLog.i("ImageClipper", "getExifInterface end");
                            return exifInterface2;
                        } catch (Throwable th2) {
                            th = th2;
                            c0.a(r0);
                            c0.a(OpenFileDescriptor);
                            throw th;
                        }
                    } else {
                        fileInputStream = null;
                    }
                    if (fileInputStream != null) {
                        try {
                            exifInterface = new ExifInterface(fileInputStream);
                        } catch (IOException unused3) {
                            HwLog.e("ImageClipper", "getExifInterface IOException");
                            r5 = OpenFileDescriptor;
                            c0.a(fileInputStream);
                            c0.a(r5);
                        } catch (IllegalStateException unused4) {
                            HwLog.e("ImageClipper", "IllegalStateException getExifInterface");
                            r5 = OpenFileDescriptor;
                            c0.a(fileInputStream);
                            c0.a(r5);
                        }
                    } else {
                        exifInterface = null;
                    }
                    fileInputStream2 = fileInputStream;
                    r6 = OpenFileDescriptor;
                } else {
                    HwLog.i("ImageClipper", "android less than Q");
                    exifInterface = new ExifInterface(str);
                    r6 = 0;
                }
                c0.a(fileInputStream2);
                c0.a(r6);
                exifInterface2 = exifInterface;
            } catch (Throwable th3) {
                th = th3;
                r0 = str;
                OpenFileDescriptor = context;
            }
        } catch (IOException unused5) {
            OpenFileDescriptor = 0;
            fileInputStream = null;
        } catch (IllegalStateException unused6) {
            OpenFileDescriptor = 0;
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            OpenFileDescriptor = 0;
        }
        HwLog.i("ImageClipper", "getExifInterface end");
        return exifInterface2;
    }

    public static String f(String str) {
        if (str == null) {
            HwLog.i("ImageClipper", "getSuffix() path is null.");
            return null;
        }
        return SafeString.substring(str, str.lastIndexOf("."));
    }

    public static int a(String str) {
        if (str == null) {
            HwLog.i("ImageClipper", "prepareOriginalImage() path is null.");
            return -1;
        }
        String strF = f(str);
        HwLog.i("ImageClipper", "prepareOriginalImage() fileSuffix : " + strF);
        if (TextUtils.isEmpty(strF)) {
            return -1;
        }
        if (g().contains(strF.toLowerCase(Locale.ENGLISH))) {
            return 0;
        }
        HwLog.i("ImageClipper", "prepareOriginalImage() SourceFile is not supported");
        return 1;
    }

    public static void d() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        egl10.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12351, 12430, 12329, 0, 12339, 1, 12344}, eGLConfigArr, 1, iArr);
        if (iArr[0] == 0) {
            HwLog.i("ImageClipper", "wrong numConfig 0");
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLSurface eGLSurfaceEglCreatePbufferSurface = egl10.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344});
        EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
        EGLContext eGLContextEglCreateContext = egl10.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, eGLContext, new int[]{12440, 1, 12344});
        egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
        int[] iArr2 = new int[1];
        GLES10.glGetIntegerv(3379, iArr2, 0);
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface, eGLSurface, eGLContext);
        egl10.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
        egl10.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
        egl10.eglTerminate(eGLDisplayEglGetDisplay);
        synchronized (f30277a) {
            g = iArr2[0];
            HwLog.i("ImageClipper", "MaxSizeOverLollipop: " + g);
            if (g == 0) {
                g = 1080;
            }
        }
    }

    public static Bitmap a(int i, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap;
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (OutOfMemoryError unused) {
            HwLog.e("ImageClipper", "rotateImageView OutOfMemoryError");
            bitmapCreateBitmap = null;
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = bitmap;
        }
        if (bitmap != bitmapCreateBitmap) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static HashMap e(String str) {
        HashMap map = new HashMap();
        String strC = CommonUtils.c(str);
        HwLog.d("ImageClipper", "outputPath fileName:" + strC);
        if (!TextUtils.isEmpty(strC)) {
            for (Map.Entry entry : h.entrySet()) {
                if (((String) entry.getKey()).contains(strC)) {
                    return (HashMap) entry.getValue();
                }
            }
            HwLog.d("ImageClipper", "getOrgFilePath from sp");
            String strA = e4.a("watchfacePhotoOrgKey", "album_background", "");
            if (TextUtils.isEmpty(strA)) {
                HwLog.d("ImageClipper", "orgMapStr is null");
                return map;
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) new Gson().fromJson(strA, new a().getType());
            if (concurrentHashMap == null) {
                HwLog.d("ImageClipper", "orgMap is null");
                return map;
            }
            for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                if (TextUtils.equals((CharSequence) entry2.getKey(), strC)) {
                    return (HashMap) entry2.getValue();
                }
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    public static Uri a(Context context, String str) throws Throwable {
        Cursor cursorQuery;
        HwLog.i("ImageClipper", "Call getMediaUriFromPath");
        Cursor cursor = null;
        uriWithAppendedId = null;
        uriWithAppendedId = null;
        Uri uriWithAppendedId = null;
        try {
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            StringBuilder sb = new StringBuilder("MediaStoreUri : ");
            sb.append(uri != null);
            HwLog.i("ImageClipper", sb.toString());
            if (uri == null) {
                return null;
            }
            cursorQuery = context.getContentResolver().query(uri, null, "_data = ?", new String[]{str}, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        HwLog.i("ImageClipper", "Cursor.MoveToFirst");
                        uriWithAppendedId = ContentUris.withAppendedId(uri, cursorQuery.getLong(cursorQuery.getColumnIndex("_id")));
                    }
                } catch (SQLException | SecurityException unused) {
                    HwLog.i("ImageClipper", "cursor query SQLException");
                    if (cursorQuery != null) {
                    }
                    return uriWithAppendedId;
                }
                cursorQuery.close();
                return uriWithAppendedId;
            } catch (Throwable th) {
                cursor = cursorQuery;
                th = th;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLException | SecurityException unused2) {
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        HwLog.i("ImageClipper", "cursor query SQLException");
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return uriWithAppendedId;
    }

    public static String d(String str) {
        int iLastIndexOf;
        if (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(".")) < 0) {
            return "";
        }
        return WatchFacePhotoAlbumManager.getInstance(Environment.getApplicationContext()).y() + File.separator + SafeString.substring(str, 0, iLastIndexOf) + "_orig" + SafeString.substring(str, iLastIndexOf);
    }

    public static int a(Context context, String str, Uri uri) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                BitmapFactory.decodeFile(str, options);
            } catch (Exception unused) {
                HwLog.e("ImageClipper", "decodeFile IOException");
            } catch (OutOfMemoryError unused2) {
                HwLog.e("ImageClipper", "decodeFile:OutOfMemoryError");
            }
        } else {
            if (uri == null) {
                HwLog.i("ImageClipper", "calculateInSampleSize uri null");
                return 1;
            }
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = null;
            try {
                parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), new Rect(), options);
                }
            } catch (IOException unused3) {
                HwLog.e("ImageClipper", "calculateInSampleSize IOException");
            } catch (IllegalStateException unused4) {
                HwLog.e("ImageClipper", "IllegalStateException calculateInSampleSize");
            } catch (Exception unused5) {
                HwLog.e("ImageClipper", "calculateInSampleSize exception");
            } catch (OutOfMemoryError unused6) {
                HwLog.e("ImageClipper", "calculateInSampleSize:OutOfMemoryError");
            } finally {
                c0.a(parcelFileDescriptorOpenFileDescriptor);
            }
        }
        HwLog.i("ImageClipper", "Finally decode bounds : {" + options.outWidth + ", " + options.outHeight + " }");
        int iA = a(options);
        StringBuilder sb = new StringBuilder("calculated inSampleSize : ");
        sb.append(iA);
        HwLog.i("ImageClipper", sb.toString());
        return iA;
    }

    public static void b() {
        synchronized (f30277a) {
            int i = g;
            if (i == 0 || i == 1080) {
                d();
            }
        }
    }

    public static Bitmap d(Bitmap bitmap, ClipOptions clipOptions) {
        HwLog.i("ImageClipper", "DoClip, Source width:" + bitmap.getWidth() + " height:" + bitmap.getHeight() + "DoClip toString:" + clipOptions.toString());
        if (!bitmap.isRecycled() && clipOptions.getClipRect().width() > 0 && clipOptions.getClipRect().height() > 0) {
            return Bitmap.createBitmap(bitmap, clipOptions.getClipRect().left, clipOptions.getClipRect().top, clipOptions.getClipRect().width(), clipOptions.getClipRect().height());
        }
        return null;
    }

    public static void b(Bitmap bitmap, ClipOptions clipOptions) {
        Bitmap bitmapA = a(bitmap, clipOptions);
        if (bitmapA == null) {
            return;
        }
        a(bitmap, clipOptions, a(clipOptions, bitmapA));
    }

    public static HashMap c(String str) {
        HashMap mapE = e(str);
        File file = PversionSdUtils.getFile((String) mapE.get(ClipImageActivity.ORG_IMAGE_PATH));
        if (file != null && file.exists()) {
            return mapE;
        }
        HwLog.i("ImageClipper", "getCheckOrgFilePath return null");
        return null;
    }

    public static int a(BitmapFactory.Options options) {
        int i;
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        synchronized (f30277a) {
            i = 1;
            while (true) {
                int i4 = g;
                if (i2 <= i4 && i3 <= i4 && i2 * i3 * 4 <= 67108864) {
                }
                i *= 2;
                i2 /= 2;
                i3 /= 2;
            }
        }
        return i;
    }

    public static Bitmap c(Bitmap bitmap, ClipOptions clipOptions) {
        Bitmap bitmapD = d(bitmap, clipOptions);
        if (bitmapD == null) {
            return bitmapD;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapD.getWidth(), bitmapD.getHeight(), Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setColor(-12434878);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawARGB(0, 0, 0, 0);
        Rect rect = new Rect(0, 0, bitmapD.getWidth(), bitmapD.getHeight());
        canvas.drawCircle(bitmapD.getWidth() / 2.0f, bitmapD.getHeight() / 2.0f, bitmapD.getWidth() / 2.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmapD, rect, rect, paint);
        return bitmapCreateBitmap;
    }

    public static Bitmap a(Context context, String str, Uri uri, int i) throws Throwable {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = i;
        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        options.inPurgeable = true;
        options.inDither = false;
        options.inInputShareable = true;
        Bitmap bitmapA = a(context, options, str, uri);
        if (bitmapA != null) {
            HwLog.i("ImageClipper", "decodeBitmap: {" + bitmapA.getWidth() + ", " + bitmapA.getHeight() + "}");
        }
        return bitmapA;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0067 A[PHI: r6
      0x0067: PHI (r6v23 ??) = (r6v35 ??), (r6v36 ??) binds: [B:23:0x004d, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.Closeable] */
    public static Bitmap a(Context context, BitmapFactory.Options options, String str, Uri uri) throws Throwable {
        Throwable th;
        ?? r8;
        FileInputStream fileInputStream;
        ?? r6;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor2;
        ?? r1 = 0;
        Bitmap bitmapDecodeFileDescriptor = null;
        try {
            try {
                try {
                    try {
                        if (Build.VERSION.SDK_INT <= 28) {
                            try {
                                context = 0;
                                fileInputStream = new FileInputStream(str);
                            } catch (FileNotFoundException unused) {
                                if (uri == null) {
                                    HwLog.i("ImageClipper", "null uri");
                                    c0.a(null);
                                    c0.a(null);
                                    return null;
                                }
                                parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
                                if (parcelFileDescriptorOpenFileDescriptor != null) {
                                    context = parcelFileDescriptorOpenFileDescriptor;
                                    fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                                    context = parcelFileDescriptorOpenFileDescriptor;
                                } else {
                                    context = parcelFileDescriptorOpenFileDescriptor;
                                    context = parcelFileDescriptorOpenFileDescriptor2;
                                    fileInputStream = null;
                                }
                            }
                        } else {
                            if (uri == null) {
                                HwLog.i("ImageClipper", "null uri");
                                c0.a(null);
                                c0.a(null);
                                return null;
                            }
                            parcelFileDescriptorOpenFileDescriptor2 = context.getContentResolver().openFileDescriptor(uri, "r");
                            if (parcelFileDescriptorOpenFileDescriptor2 != null) {
                                context = parcelFileDescriptorOpenFileDescriptor2;
                                fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor2.getFileDescriptor());
                                context = parcelFileDescriptorOpenFileDescriptor2;
                            } else {
                                context = parcelFileDescriptorOpenFileDescriptor;
                                context = parcelFileDescriptorOpenFileDescriptor2;
                                fileInputStream = null;
                            }
                        }
                        if (fileInputStream != null) {
                            try {
                                bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileInputStream.getFD(), null, options);
                            } catch (FileNotFoundException unused2) {
                                HwLog.e("ImageClipper", "FileNotFoundException decodeImage");
                                r6 = context;
                                c0.a(r6);
                                c0.a(fileInputStream);
                                return null;
                            } catch (IOException unused3) {
                                HwLog.e("ImageClipper", "DecodeBitmap IOException");
                                r6 = context;
                                c0.a(r6);
                                c0.a(fileInputStream);
                                return null;
                            } catch (IllegalStateException unused4) {
                                HwLog.e("ImageClipper", "IllegalStateException decodeImage");
                                r6 = context;
                                c0.a(r6);
                                c0.a(fileInputStream);
                                return null;
                            } catch (Exception unused5) {
                                HwLog.e("ImageClipper", "DecodeBitmap exception");
                                r6 = context;
                                c0.a(r6);
                                c0.a(fileInputStream);
                                return null;
                            } catch (OutOfMemoryError unused6) {
                                HwLog.e("ImageClipper", "DecodeBitmap:OutOfMemoryError");
                                r6 = context;
                                c0.a(r6);
                                c0.a(fileInputStream);
                                return null;
                            }
                        }
                        c0.a(context);
                        c0.a(fileInputStream);
                        return bitmapDecodeFileDescriptor;
                    } catch (FileNotFoundException unused7) {
                        fileInputStream = null;
                    } catch (IOException unused8) {
                        fileInputStream = null;
                    } catch (IllegalStateException unused9) {
                        fileInputStream = null;
                    } catch (Exception unused10) {
                        fileInputStream = null;
                    } catch (OutOfMemoryError unused11) {
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        str = null;
                        r1 = context;
                        r8 = str;
                        c0.a(r1);
                        c0.a(r8);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (FileNotFoundException unused12) {
                context = 0;
                fileInputStream = null;
            }
        } catch (IOException unused13) {
            context = 0;
            fileInputStream = null;
        } catch (IllegalStateException unused14) {
            context = 0;
            fileInputStream = null;
        } catch (Exception unused15) {
            context = 0;
            fileInputStream = null;
        } catch (OutOfMemoryError unused16) {
            context = 0;
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            r8 = 0;
            c0.a(r1);
            c0.a(r8);
            throw th;
        }
    }

    public static Bitmap a(Bitmap bitmap, ClipOptions clipOptions) {
        int watchFaceWidth;
        int watchFaceHeight;
        if (bitmap == null || clipOptions == null || bitmap.isRecycled()) {
            return null;
        }
        WatchFaceSupportInfo watchFaceSupportInfo = HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getWatchFaceSupportInfo();
        if (watchFaceSupportInfo != null) {
            watchFaceWidth = watchFaceSupportInfo.getWatchFaceWidth();
            watchFaceHeight = watchFaceSupportInfo.getWatchFaceHeight();
        } else {
            watchFaceWidth = 0;
            watchFaceHeight = 0;
        }
        if (watchFaceWidth != 0 && watchFaceWidth != clipOptions.getOutputWidth() && watchFaceHeight != 0 && watchFaceHeight != clipOptions.getOutputHeight()) {
            HwLog.w("ImageClipper", "clip watchFaceWidth is not equals options.getOutputWidth , watchFaceWidth:" + watchFaceWidth + ",options.getOutputWidth():" + clipOptions.getOutputWidth() + ",watchFaceHeight:" + watchFaceHeight + ",options.getOutputHeight():" + clipOptions.getOutputHeight());
            return null;
        }
        if (clipOptions.getOutputWidth() > bitmap.getWidth() || clipOptions.getOutputHeight() > bitmap.getHeight()) {
            float fA = a(clipOptions, bitmap.getWidth(), bitmap.getHeight());
            Matrix matrix = new Matrix();
            matrix.postScale(fA, fA);
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        }
        HwLog.i("ImageClipper", "bitmapToClip : {" + bitmap.getWidth() + ", " + bitmap.getHeight() + " }");
        if (clipOptions.getOutputWidth() == clipOptions.getOutputHeight() && !clipOptions.isClipRectangleAnyway()) {
            return c(bitmap, clipOptions);
        }
        return d(bitmap, clipOptions);
    }

    public static Bitmap a(ClipOptions clipOptions, Bitmap bitmap) {
        if (bitmap.getWidth() == clipOptions.getOutputWidth() && bitmap.getHeight() == clipOptions.getOutputHeight()) {
            return bitmap;
        }
        if (bitmap.getWidth() >= clipOptions.getOutputWidth() && bitmap.getHeight() >= clipOptions.getOutputHeight()) {
            HwLog.i("ImageClipper", "AreaAveragingUtil start");
            Bitmap bitmapE = new p(bitmap).e(clipOptions.getOutputWidth(), clipOptions.getOutputHeight());
            HwLog.i("ImageClipper", "AreaAveragingUtil end");
            return bitmapE;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(clipOptions.getOutputWidth() / bitmap.getWidth(), clipOptions.getOutputHeight() / bitmap.getHeight());
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static void a(Bitmap bitmap, ClipOptions clipOptions, Bitmap bitmap2) {
        String strA;
        String str;
        if (Environment.getApplicationContext() == null) {
            HwLog.e("ImageClipper", "Environment.getApplicationContext() is null");
            return;
        }
        if (clipOptions.getOutputDirectory() == null) {
            HwLog.e("ImageClipper", "options.getOutputDirectory() is null");
            return;
        }
        boolean z = WatchFacePhotoAlbumManager.getInstance(Environment.getApplicationContext()).z();
        File file = new File(clipOptions.getOutputDirectory());
        if (!file.exists() || !file.isDirectory()) {
            HwLog.i("ImageClipper", "MkDir = " + file.mkdirs());
        }
        String str2 = new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.ENGLISH).format(new Date());
        if (clipOptions.getResultPaths().size() > 0) {
            str = clipOptions.getResultPaths().get(0);
            strA = a(str, true);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(file.getPath());
            String str3 = File.separator;
            sb.append(str3);
            sb.append(str2 + ".png");
            String string = sb.toString();
            strA = WatchFacePhotoAlbumManager.getInstance(Environment.getApplicationContext()).y() + str3 + str2 + "_orig.png";
            str = string;
        }
        a(bitmap2, str, clipOptions);
        if (z) {
            a(bitmap, clipOptions, str, strA);
        }
    }

    public static void a(final Bitmap bitmap, final ClipOptions clipOptions, final String str, final String str2) {
        BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.l2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                l2.a(clipOptions, bitmap, str2, str);
            }
        });
    }

    public static /* synthetic */ void a(ClipOptions clipOptions, Bitmap bitmap, String str, String str2) throws Throwable {
        HashMap map = new HashMap();
        map.put("scaleX", String.valueOf(clipOptions.getScaleX()));
        map.put("scaleY", String.valueOf(clipOptions.getScaleY()));
        map.put(ClipImageActivity.SOURCE_IMAGE_TRANS_X, String.valueOf(clipOptions.getTransX()));
        map.put(ClipImageActivity.SOURCE_IMAGE_TRANS_Y, String.valueOf(clipOptions.getTransY()));
        int[] iArrK = CommonUtils.k();
        if (iArrK != null && iArrK.length > 1) {
            map.put(ClipImageActivity.ORG_WINDOWS_HEIGHT, String.valueOf(iArrK[0]));
            map.put(ClipImageActivity.ORG_WINDOWS_WIDTH, String.valueOf(iArrK[1]));
        }
        if (clipOptions.getClipOrgFilePath() != null) {
            if (PversionSdUtils.getFile(clipOptions.getClipOrgFilePath()).exists()) {
                map.put(ClipImageActivity.ORG_IMAGE_PATH, clipOptions.getClipOrgFilePath());
                HwLog.d("ImageClipper", "orgImage exists");
            } else {
                a(bitmap, str, 100);
                map.put(ClipImageActivity.ORG_IMAGE_PATH, str);
                HwLog.d("ImageClipper", "orgImage not exists");
            }
        } else {
            HwLog.d("ImageClipper", "getClipOrgFilePath is null");
            a(bitmap, str, 100);
            map.put(ClipImageActivity.ORG_IMAGE_PATH, str);
        }
        h.put(CommonUtils.c(str2), map);
        HwLog.d("ImageClipper", "writeOrgImageFile success");
    }

    public static String a(String str, boolean z) {
        String strC = CommonUtils.c(str);
        HwLog.d("ImageClipper", "outputPath fileName:" + strC);
        if (z) {
            for (Map.Entry entry : h.entrySet()) {
                if (((String) entry.getKey()).contains(strC)) {
                    return (String) ((HashMap) entry.getValue()).get(ClipImageActivity.ORG_IMAGE_PATH);
                }
            }
        }
        return d(strC);
    }

    public static void a(Bitmap bitmap, String str, ClipOptions clipOptions) {
        String strFilterFilePath = CommonUtils.filterFilePath(str);
        if (strFilterFilePath == null) {
            HwLog.w("ImageClipper", "writeImageFile path is null");
            return;
        }
        File file = new File(strFilterFilePath);
        HwLog.i("ImageClipper", "OutputImageFile : " + file.getName());
        FileOutputStream fileOutputStreamOpenOutputStream = null;
        try {
            try {
                try {
                    fileOutputStreamOpenOutputStream = FileHelper.openOutputStream(file, false);
                    boolean zCompress = bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStreamOpenOutputStream);
                    fileOutputStreamOpenOutputStream.flush();
                    if (clipOptions.getResultPaths().size() == 0) {
                        clipOptions.getResultPaths().add(file.getPath());
                    }
                    HwLog.i("ImageClipper", "OutputResult = " + zCompress);
                    if (!zCompress) {
                        clipOptions.getResultPaths().clear();
                    }
                    HwSfpPolicyManagerHelper.setDefaultCeLabel(file);
                    fileOutputStreamOpenOutputStream.close();
                } catch (IOException unused) {
                    HwLog.i("ImageClipper", "outputClippedFileError");
                    if (fileOutputStreamOpenOutputStream != null) {
                        fileOutputStreamOpenOutputStream.close();
                    }
                }
            } catch (Throwable th) {
                if (fileOutputStreamOpenOutputStream != null) {
                    try {
                        fileOutputStreamOpenOutputStream.close();
                    } catch (IOException unused2) {
                        HwLog.i("ImageClipper", "CloseOutputStreamError");
                    }
                }
                throw th;
            }
        } catch (IOException unused3) {
            HwLog.i("ImageClipper", "CloseOutputStreamError");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.Closeable, java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.graphics.Bitmap] */
    public static boolean a(Bitmap bitmap, String str, int i) throws Throwable {
        File file = PversionSdUtils.getFile(str);
        if (bitmap == 0) {
            HwLog.i("ImageClipper", "writeImageFile bitmap is null");
            return false;
        }
        if (file == null) {
            return false;
        }
        ?? sb = new StringBuilder("writeImageFile : ");
        ?? name = file.getName();
        sb.append(name);
        HwLog.i("ImageClipper", sb.toString());
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                name = FileHelper.openOutputStream(file, false);
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(name);
                    try {
                        boolean zCompress = bitmap.compress(Bitmap.CompressFormat.JPEG, i, bufferedOutputStream2);
                        bufferedOutputStream2.flush();
                        HwLog.i("ImageClipper", "writeImageFile isOutput:" + zCompress);
                        HwSfpPolicyManagerHelper.setDefaultCeLabel(file);
                        c0.a(bufferedOutputStream2);
                        c0.a(name);
                        return true;
                    } catch (IOException unused) {
                        bufferedOutputStream = bufferedOutputStream2;
                        HwLog.i("ImageClipper", "outputClippedFileError");
                        c0.a(bufferedOutputStream);
                        c0.a(name);
                        return false;
                    } catch (Exception unused2) {
                        bufferedOutputStream = bufferedOutputStream2;
                        HwLog.i("ImageClipper", "outputClippedFileError");
                        c0.a(bufferedOutputStream);
                        c0.a(name);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        c0.a(bufferedOutputStream);
                        c0.a(name);
                        throw th;
                    }
                } catch (IOException unused3) {
                } catch (Exception unused4) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused5) {
            name = 0;
        } catch (Exception unused6) {
            name = 0;
        } catch (Throwable th3) {
            th = th3;
            name = 0;
        }
    }

    public static float a(ClipOptions clipOptions, float f2, float f3) {
        if (f2 < clipOptions.getClipRect().width() || f3 < clipOptions.getClipRect().height()) {
            return Math.max(clipOptions.getOutputWidth() / f2, clipOptions.getOutputHeight() / f3);
        }
        return 1.0f;
    }

    public static float a(float f2) {
        return Math.round(f2 * 100.0f) / 100.0f;
    }
}
