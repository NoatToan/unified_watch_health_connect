package defpackage;

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
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import com.huawei.watchface.videoedit.utils.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes10.dex */
public class mcn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f41427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f41428b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String[] f41429c = {".png", ".jpg", ".jpeg", ".bmp", Utils.SUFFIX_GIF, ".psd", WatchFaceProvider.SVG_SUFFIX, ".tif", ".tiff", ".webp", ".pcx"};
    private static ArrayList<String> e;

    public static List<String> a() {
        ArrayList<String> arrayList;
        synchronized (f41428b) {
            if (e == null) {
                e = new ArrayList<>(16);
                for (String str : f41429c) {
                    e.add(str);
                }
                LogUtil.a("ImageClipper", "SuffixContainers : ", e.toString());
            }
            arrayList = e;
        }
        return arrayList;
    }

    public static Bitmap e(String str, Uri uri) throws Throwable {
        if (str == null) {
            LogUtil.j("ImageClipper", "preparePathNULL");
            return null;
        }
        try {
            String strSubstring = str.substring(str.lastIndexOf("."));
            LogUtil.a("ImageClipper", "fileSuffix : ", strSubstring);
            if (!a().contains(strSubstring.toLowerCase(Locale.ENGLISH))) {
                LogUtil.a("ImageClipper", "SourceFile is not supported");
                return null;
            }
            File file = new File(str);
            if (!file.exists() || file.isDirectory()) {
                LogUtil.a("ImageClipper", "PrepareFileNULL");
                return null;
            }
            LogUtil.a("ImageClipper", "PrepareUri is NULL");
            if (uri == null) {
                LogUtil.a("ImageClipper", "CreateUriFromFile");
                uri = b(BaseApplication.getContext(), str);
                LogUtil.a("ImageClipper", "CreatedUri : ", Boolean.valueOf(uri != null));
            }
            c();
            Bitmap bitmapD = d(str, uri, a(str, uri));
            int iB = b(str, uri);
            return (iB <= 0 || bitmapD == null) ? bitmapD : b(iB, bitmapD);
        } catch (StringIndexOutOfBoundsException unused) {
            LogUtil.e("ImageClipper", "StringIndexOutOfBoundsException");
            return null;
        }
    }

    private static int b(String str, Uri uri) throws Throwable {
        int i;
        LogUtil.a("ImageClipper", "readPictureAngle enter");
        ExifInterface exifInterfaceD = d(str, uri);
        int i2 = 0;
        if (exifInterfaceD != null) {
            int attributeInt = exifInterfaceD.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                i = 180;
            } else if (attributeInt != 6) {
                if (attributeInt != 8) {
                    LogUtil.j("ImageClipper", "orientation:", Integer.valueOf(attributeInt));
                } else {
                    i = 270;
                }
                LogUtil.a("ImageClipper", "readPictureAngle angle:", Integer.valueOf(i2));
            } else {
                i = 90;
            }
            i2 = i;
            LogUtil.a("ImageClipper", "readPictureAngle angle:", Integer.valueOf(i2));
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0074 A[Catch: IOException -> 0x0078, TRY_LEAVE, TryCatch #2 {IOException -> 0x0078, blocks: (B:25:0x006f, B:27:0x0074), top: B:64:0x006f }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0097 A[Catch: IOException -> 0x009b, TRY_LEAVE, TryCatch #11 {IOException -> 0x009b, blocks: (B:36:0x0092, B:38:0x0097), top: B:67:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5 A[Catch: IOException -> 0x00b9, TRY_LEAVE, TryCatch #0 {IOException -> 0x00b9, blocks: (B:44:0x00b0, B:46:0x00b5), top: B:62:0x00b0 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d8 A[Catch: IOException -> 0x00dc, TRY_LEAVE, TryCatch #12 {IOException -> 0x00dc, blocks: (B:54:0x00d3, B:56:0x00d8), top: B:69:0x00d3 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r8v11, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v21, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r8v9, types: [android.os.ParcelFileDescriptor] */
    private static ExifInterface d(String str, Uri uri) throws Throwable {
        Throwable th;
        ?? OpenFileDescriptor;
        FileInputStream fileInputStream;
        ExifInterface exifInterface;
        ?? r8;
        LogUtil.a("ImageClipper", "getExifInterface start");
        ?? r4 = 0;
        r4 = 0;
        FileInputStream fileInputStream2 = null;
        exifInterface = null;
        exifInterface = null;
        exifInterface = null;
        exifInterface = null;
        exifInterface = null;
        ExifInterface exifInterface2 = null;
        try {
            try {
                if (Build.VERSION.SDK_INT > 28) {
                    LogUtil.a("ImageClipper", "android Q");
                    if (uri == null) {
                        LogUtil.j("ImageClipper", "uri is null");
                        return null;
                    }
                    OpenFileDescriptor = BaseApplication.getContext().getContentResolver().openFileDescriptor(uri, "r");
                    if (OpenFileDescriptor != 0) {
                        try {
                            fileInputStream = new FileInputStream(OpenFileDescriptor.getFileDescriptor());
                        } catch (IOException unused) {
                            fileInputStream = null;
                            LogUtil.e("ImageClipper", "getExifInterface IOException");
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                    if (OpenFileDescriptor != 0) {
                                        OpenFileDescriptor.close();
                                    }
                                } catch (IOException unused2) {
                                    LogUtil.e("ImageClipper", "getExifInterface close IOException");
                                }
                            } else if (OpenFileDescriptor != 0) {
                                OpenFileDescriptor.close();
                            }
                            LogUtil.a("ImageClipper", "getExifInterface end");
                            return exifInterface2;
                        } catch (IllegalStateException unused3) {
                            fileInputStream = null;
                            LogUtil.e("ImageClipper", "IllegalStateException getExifInterface");
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                    if (OpenFileDescriptor != 0) {
                                        OpenFileDescriptor.close();
                                    }
                                } catch (IOException unused4) {
                                    LogUtil.e("ImageClipper", "getExifInterface close IOException");
                                }
                            } else if (OpenFileDescriptor != 0) {
                                OpenFileDescriptor.close();
                            }
                            LogUtil.a("ImageClipper", "getExifInterface end");
                            return exifInterface2;
                        } catch (Throwable th2) {
                            th = th2;
                            if (r4 != 0) {
                                try {
                                    r4.close();
                                    if (OpenFileDescriptor != 0) {
                                        OpenFileDescriptor.close();
                                    }
                                } catch (IOException unused5) {
                                    LogUtil.e("ImageClipper", "getExifInterface close IOException");
                                    throw th;
                                }
                            } else if (OpenFileDescriptor != 0) {
                                OpenFileDescriptor.close();
                            }
                            throw th;
                        }
                    } else {
                        fileInputStream = null;
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream2 = fileInputStream;
                            exifInterface = new ExifInterface(fileInputStream);
                            r8 = OpenFileDescriptor;
                        } catch (IOException unused6) {
                            LogUtil.e("ImageClipper", "getExifInterface IOException");
                            if (fileInputStream != null) {
                                fileInputStream.close();
                                if (OpenFileDescriptor != 0) {
                                    OpenFileDescriptor.close();
                                }
                            } else if (OpenFileDescriptor != 0) {
                                OpenFileDescriptor.close();
                            }
                        } catch (IllegalStateException unused7) {
                            LogUtil.e("ImageClipper", "IllegalStateException getExifInterface");
                            if (fileInputStream != null) {
                                fileInputStream.close();
                                if (OpenFileDescriptor != 0) {
                                    OpenFileDescriptor.close();
                                }
                            } else if (OpenFileDescriptor != 0) {
                                OpenFileDescriptor.close();
                            }
                        }
                    } else {
                        fileInputStream2 = fileInputStream;
                        exifInterface = null;
                    }
                } else {
                    LogUtil.j("ImageClipper", "android less than Q");
                    exifInterface = new ExifInterface(str);
                    r8 = 0;
                }
                if (fileInputStream2 != null) {
                    try {
                        r8 = OpenFileDescriptor;
                        fileInputStream2.close();
                        if (r8 != 0) {
                            r8.close();
                        }
                    } catch (IOException unused8) {
                        LogUtil.e("ImageClipper", "getExifInterface close IOException");
                    }
                } else if (r8 != 0) {
                    r8.close();
                }
                exifInterface2 = exifInterface;
            } catch (Throwable th3) {
                th = th3;
                r4 = uri;
                OpenFileDescriptor = str;
            }
        } catch (IOException unused9) {
            OpenFileDescriptor = 0;
            fileInputStream = null;
        } catch (IllegalStateException unused10) {
            OpenFileDescriptor = 0;
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            OpenFileDescriptor = 0;
        }
        LogUtil.a("ImageClipper", "getExifInterface end");
        return exifInterface2;
    }

    private static Bitmap b(int i, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap;
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (OutOfMemoryError unused) {
            LogUtil.e("ImageClipper", "rotateImageView OutOfMemoryError");
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

    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v2 */
    private static Uri b(Context context, String str) throws Throwable {
        IllegalArgumentException e2;
        Cursor cursorQuery;
        Uri uri;
        LogUtil.a("ImageClipper", "Call getMediaUriFromPath");
        ?? r4 = 0;
        uriWithAppendedId = null;
        Uri uriWithAppendedId = null;
        Cursor cursor = null;
        try {
            try {
                Uri uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                LogUtil.a("ImageClipper", "MediaStoreUri:", Boolean.valueOf(uri2 != null));
                if (uri2 != null) {
                    cursorQuery = context.getContentResolver().query(uri2, null, "_data='" + str + "'", null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                LogUtil.a("ImageClipper", "Cursor.MoveToFirst");
                                uriWithAppendedId = ContentUris.withAppendedId(uri2, cursorQuery.getLong(cursorQuery.getColumnIndex("_id")));
                            }
                        } catch (SQLException unused) {
                            LogUtil.e("ImageClipper", "cursor query SQLException");
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return null;
                        } catch (IllegalArgumentException e3) {
                            e2 = e3;
                            LogUtil.e("ImageClipper", "cursor query IllegalArgumentException. msg: ", ExceptionUtils.c(e2));
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return null;
                        }
                    }
                    Uri uri3 = uriWithAppendedId;
                    cursor = cursorQuery;
                    uri = uri3;
                } else {
                    uri = null;
                }
                if (cursor != null) {
                    cursor.close();
                }
                return uri;
            } catch (Throwable th) {
                r4 = context;
                th = th;
                if (r4 != 0) {
                    r4.close();
                }
                throw th;
            }
        } catch (SQLException unused2) {
            cursorQuery = null;
        } catch (IllegalArgumentException e4) {
            e2 = e4;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r4 != 0) {
                r4.close();
            }
            throw th;
        }
    }

    private static void c() {
        synchronized (f41428b) {
            int i = f41427a;
            if (i == 0 || i == 1080) {
                e();
            }
        }
    }

    private static void e() {
        if (!(EGLContext.getEGL() instanceof EGL10)) {
            LogUtil.j("ImageClipper", "getGlesTextureLimitEqualAboveLollipop instanceof err.");
            return;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        egl10.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12351, 12430, 12329, 0, 12339, 1, 12344}, eGLConfigArr, 1, iArr);
        if (iArr[0] == 0) {
            LogUtil.a("ImageClipper", "wrong numConfig 0");
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLSurface eGLSurfaceEglCreatePbufferSurface = egl10.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344});
        EGLContext eGLContextEglCreateContext = egl10.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 1, 12344});
        egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext);
        int[] iArr2 = new int[1];
        GLES10.glGetIntegerv(3379, iArr2, 0);
        egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
        egl10.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
        egl10.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
        egl10.eglTerminate(eGLDisplayEglGetDisplay);
        synchronized (f41428b) {
            int i = iArr2[0];
            f41427a = i;
            LogUtil.a("ImageClipper", "MaxSizeOverLollipop: ", Integer.valueOf(i));
            if (f41427a == 0) {
                f41427a = 1080;
            }
        }
    }

    private static int a(String str, Uri uri) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i = 1;
        options.inJustDecodeBounds = true;
        if (Build.VERSION.SDK_INT <= 28) {
            BitmapFactory.decodeFile(str, options);
        } else {
            if (uri == null) {
                LogUtil.j("ImageClipper", "calculateInSampleSize uri null");
                return 1;
            }
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = null;
            try {
                try {
                    parcelFileDescriptorOpenFileDescriptor = BaseApplication.getContext().getContentResolver().openFileDescriptor(uri, "r");
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), new Rect(), options);
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (IOException unused) {
                            LogUtil.e("ImageClipper", "parcelFileDescriptor close IOException");
                        }
                    }
                } catch (IOException unused2) {
                    LogUtil.e("ImageClipper", "calculateInSampleSize IOException");
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (IOException unused3) {
                            LogUtil.e("ImageClipper", "parcelFileDescriptor close IOException");
                        }
                    }
                } catch (IllegalStateException unused4) {
                    LogUtil.e("ImageClipper", "IllegalStateException calculateInSampleSize");
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (IOException unused5) {
                            LogUtil.e("ImageClipper", "parcelFileDescriptor close IOException");
                        }
                    }
                }
            } catch (Throwable th) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (IOException unused6) {
                        LogUtil.e("ImageClipper", "parcelFileDescriptor close IOException");
                    }
                }
                throw th;
            }
        }
        LogUtil.a("ImageClipper", "Finally decode bounds : {", Integer.valueOf(options.outWidth), ", ", Integer.valueOf(options.outHeight), " }");
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        synchronized (f41428b) {
            while (true) {
                int i4 = f41427a;
                if (i2 <= i4 && i3 <= i4 && i2 * i3 * 4 <= 67108864) {
                }
                i *= 2;
                i2 /= 2;
                i3 /= 2;
            }
        }
        LogUtil.a("ImageClipper", "calculated inSampleSize:", Integer.valueOf(i));
        return i;
    }

    private static Bitmap d(String str, Uri uri, int i) throws Throwable {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = i;
        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        options.inPurgeable = true;
        options.inDither = false;
        options.inInputShareable = true;
        Bitmap bitmapA = a(options, str, uri);
        if (bitmapA != null) {
            LogUtil.a("ImageClipper", "decodeBitmap: {", Integer.valueOf(bitmapA.getWidth()), ", ", Integer.valueOf(bitmapA.getHeight()), "}");
        }
        return bitmapA;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x008e A[Catch: IOException -> 0x0092, TRY_LEAVE, TryCatch #3 {IOException -> 0x0092, blocks: (B:41:0x0089, B:43:0x008e), top: B:63:0x0089 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ac A[Catch: IOException -> 0x00b0, TRY_LEAVE, TryCatch #4 {IOException -> 0x00b0, blocks: (B:49:0x00a7, B:51:0x00ac), top: B:65:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00c0 A[Catch: IOException -> 0x00c4, TRY_LEAVE, TryCatch #10 {IOException -> 0x00c4, blocks: (B:57:0x00bb, B:59:0x00c0), top: B:69:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.io.FileInputStream] */
    private static Bitmap a(BitmapFactory.Options options, String str, Uri uri) throws Throwable {
        Bitmap bitmap;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        ParcelFileDescriptor parcelFileDescriptor = null;
        bitmapDecodeFileDescriptor = null;
        bitmapDecodeFileDescriptor = null;
        Bitmap bitmapDecodeFileDescriptor = null;
        parcelFileDescriptor = null;
        parcelFileDescriptor = null;
        parcelFileDescriptor = null;
        try {
            try {
                if (Build.VERSION.SDK_INT <= 28) {
                    FileInputStream fileInputStream4 = new FileInputStream(str);
                    parcelFileDescriptorOpenFileDescriptor = null;
                    fileInputStream3 = fileInputStream4;
                } else {
                    if (uri == 0) {
                        LogUtil.j("ImageClipper", "null uri");
                        return null;
                    }
                    parcelFileDescriptorOpenFileDescriptor = BaseApplication.getContext().getContentResolver().openFileDescriptor(uri, "r");
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            fileInputStream3 = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                        } catch (IOException unused) {
                            bitmap = null;
                            fileInputStream2 = null;
                            parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                            uri = fileInputStream2;
                            LogUtil.e("ImageClipper", "DecodeBitmap IOException");
                            if (parcelFileDescriptor != null) {
                                try {
                                    parcelFileDescriptor.close();
                                    if (uri != 0) {
                                        uri.close();
                                    }
                                } catch (IOException unused2) {
                                    LogUtil.e("ImageClipper", "Close InputStream IOException");
                                    return bitmap;
                                }
                            } else if (uri != 0) {
                                uri.close();
                            }
                            return bitmap;
                        } catch (IllegalStateException unused3) {
                            bitmap = null;
                            fileInputStream = null;
                            parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                            uri = fileInputStream;
                            LogUtil.e("ImageClipper", "IllegalStateException decodeImage");
                            if (parcelFileDescriptor != null) {
                                try {
                                    parcelFileDescriptor.close();
                                    if (uri != 0) {
                                        uri.close();
                                    }
                                } catch (IOException unused4) {
                                    LogUtil.e("ImageClipper", "Close InputStream IOException");
                                    return bitmap;
                                }
                            } else if (uri != 0) {
                                uri.close();
                            }
                            return bitmap;
                        } catch (Throwable th) {
                            th = th;
                            uri = 0;
                            parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                            if (parcelFileDescriptor != null) {
                                try {
                                    parcelFileDescriptor.close();
                                    if (uri != 0) {
                                        uri.close();
                                    }
                                } catch (IOException unused5) {
                                    LogUtil.e("ImageClipper", "Close InputStream IOException");
                                    throw th;
                                }
                            } else if (uri != 0) {
                                uri.close();
                            }
                            throw th;
                        }
                    } else {
                        fileInputStream3 = null;
                    }
                }
                if (fileInputStream3 != null) {
                    try {
                        bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileInputStream3.getFD(), null, options);
                    } catch (IOException unused6) {
                        bitmap = bitmapDecodeFileDescriptor;
                        fileInputStream2 = fileInputStream3;
                        parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                        uri = fileInputStream2;
                        LogUtil.e("ImageClipper", "DecodeBitmap IOException");
                        if (parcelFileDescriptor != null) {
                            parcelFileDescriptor.close();
                            if (uri != 0) {
                                uri.close();
                            }
                        } else if (uri != 0) {
                            uri.close();
                        }
                        return bitmap;
                    } catch (IllegalStateException unused7) {
                        bitmap = bitmapDecodeFileDescriptor;
                        fileInputStream = fileInputStream3;
                        parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                        uri = fileInputStream;
                        LogUtil.e("ImageClipper", "IllegalStateException decodeImage");
                        if (parcelFileDescriptor != null) {
                            parcelFileDescriptor.close();
                            if (uri != 0) {
                                uri.close();
                            }
                        } else if (uri != 0) {
                            uri.close();
                        }
                        return bitmap;
                    } catch (Throwable th2) {
                        th = th2;
                        uri = fileInputStream3;
                        parcelFileDescriptor = parcelFileDescriptorOpenFileDescriptor;
                        if (parcelFileDescriptor != null) {
                            parcelFileDescriptor.close();
                            if (uri != 0) {
                                uri.close();
                            }
                        } else if (uri != 0) {
                            uri.close();
                        }
                        throw th;
                    }
                }
                LogUtil.a("ImageClipper", "read originalBitmap end");
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (IOException unused8) {
                        LogUtil.e("ImageClipper", "Close InputStream IOException");
                    }
                }
                if (fileInputStream3 != null) {
                    fileInputStream3.close();
                    return bitmapDecodeFileDescriptor;
                }
                return bitmapDecodeFileDescriptor;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException unused9) {
            bitmap = null;
            uri = 0;
        } catch (IllegalStateException unused10) {
            bitmap = null;
            uri = 0;
        } catch (Throwable th4) {
            th = th4;
            uri = 0;
        }
    }

    public static Bitmap b(Bitmap bitmap, mcj mcjVar) {
        if (bitmap == null || mcjVar == null || bitmap.isRecycled()) {
            return null;
        }
        if (mcjVar.e() > bitmap.getWidth() || mcjVar.b() > bitmap.getHeight()) {
            float fA = a(mcjVar, bitmap.getWidth(), bitmap.getHeight());
            Matrix matrix = new Matrix();
            matrix.postScale(fA, fA);
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        }
        LogUtil.a("ImageClipper", "bitmapToClip : {", Integer.valueOf(bitmap.getWidth()), ", ", Integer.valueOf(bitmap.getHeight()), " }");
        if (mcjVar.e() == mcjVar.b() && !mcjVar.f()) {
            return d(bitmap, mcjVar);
        }
        return c(bitmap, mcjVar);
    }

    public static void e(Bitmap bitmap, mcj mcjVar) {
        String str;
        Bitmap bitmapB = b(bitmap, mcjVar);
        if (bitmapB == null) {
            return;
        }
        if (bitmapB.getWidth() != mcjVar.e() || bitmapB.getHeight() != mcjVar.b()) {
            if (bitmapB.getWidth() < mcjVar.e() || bitmapB.getHeight() < mcjVar.b()) {
                Matrix matrix = new Matrix();
                matrix.postScale(mcjVar.e() / bitmapB.getWidth(), mcjVar.b() / bitmapB.getHeight());
                bitmapB = Bitmap.createBitmap(bitmapB, 0, 0, bitmapB.getWidth(), bitmapB.getHeight(), matrix, true);
            } else {
                LogUtil.a("ImageClipper", "AreaAveragingUtil start");
                bitmapB = new mci(bitmapB).c(mcjVar.e(), mcjVar.b());
                LogUtil.a("ImageClipper", "AreaAveragingUtil end");
            }
        }
        File file = new File(mcjVar.d());
        if (!file.exists() || !file.isDirectory()) {
            ReleaseLogUtil.d("R_ImageClipper", "MkDir:", Boolean.valueOf(file.mkdirs()));
        }
        if (mcjVar.c().size() > 0) {
            str = mcjVar.c().get(0);
        } else {
            str = file.getPath() + File.separator + (new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.ENGLISH).format(new Date()) + ".png");
        }
        a(bitmapB, str, mcjVar);
    }

    private static void a(Bitmap bitmap, String str, mcj mcjVar) {
        File file = new File(str);
        ReleaseLogUtil.d("R_ImageClipper", "OutputImageFile:", file.getName());
        FileOutputStream fileOutputStreamOpenOutputStream = null;
        try {
            fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(file);
            if (fileOutputStreamOpenOutputStream != null && bitmap != null) {
                boolean zCompress = bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStreamOpenOutputStream);
                fileOutputStreamOpenOutputStream.flush();
                if (mcjVar.c().size() == 0) {
                    mcjVar.c().add(file.getPath());
                }
                ReleaseLogUtil.d("R_ImageClipper", "OutputResult:", Boolean.valueOf(zCompress));
                if (!zCompress) {
                    mcjVar.c().clear();
                }
            }
        } catch (IOException unused) {
            ReleaseLogUtil.a("R_ImageClipper", "outputClippedFileError");
        } finally {
            if (fileOutputStreamOpenOutputStream != null) {
                try {
                    fileOutputStreamOpenOutputStream.close();
                } catch (IOException unused2) {
                    LogUtil.e("ImageClipper", "CloseOutputStreamError");
                }
            }
        }
    }

    public static void a(mcj mcjVar, Bitmap bitmap) {
        int i;
        int i2;
        int i3;
        int i4;
        if (mcjVar == null || bitmap == null) {
            return;
        }
        if (mcjVar.a().width() <= 0 || mcjVar.a().height() <= 0) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            LogUtil.a("ImageClipper", "bitmap size : {", Integer.valueOf(width), ", ", Integer.valueOf(height), "}");
            float fE = mcjVar.e() / mcjVar.b();
            if (width > height) {
                int i5 = (int) (height * fE);
                i4 = (width - i5) / 2;
                i3 = i5;
                i = height;
                i2 = 0;
            } else {
                i = (int) (width / fE);
                i2 = (height - i) / 2;
                i3 = width;
                i4 = 0;
            }
            Rect rect = new Rect(Math.max(i4, 0), Math.max(i2, 0), i4 + i3, i2 + i);
            mcjVar.c(rect);
            LogUtil.a("ImageClipper", "FixedClipRect:", rect.toString());
        }
    }

    private static float a(mcj mcjVar, float f, float f2) {
        if (f < mcjVar.a().width() || f2 < mcjVar.a().height()) {
            return Math.max(mcjVar.e() / f, mcjVar.b() / f2);
        }
        return 1.0f;
    }

    private static Bitmap d(Bitmap bitmap, mcj mcjVar) {
        Bitmap bitmapC = c(bitmap, mcjVar);
        if (bitmapC == null) {
            return bitmapC;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapC.getWidth(), bitmapC.getHeight(), Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setColor(-12434878);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawARGB(0, 0, 0, 0);
        Rect rect = new Rect(0, 0, bitmapC.getWidth(), bitmapC.getHeight());
        canvas.drawCircle(bitmapC.getWidth() / 2.0f, bitmapC.getHeight() / 2.0f, bitmapC.getWidth() / 2.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmapC, rect, rect, paint);
        return bitmapCreateBitmap;
    }

    private static Bitmap c(Bitmap bitmap, mcj mcjVar) {
        LogUtil.a("ImageClipper", "DoClip, Source width:", Integer.valueOf(bitmap.getWidth()), " height:", Integer.valueOf(bitmap.getHeight()), "DoClip toString:", mcjVar.toString());
        if (bitmap.isRecycled()) {
            return null;
        }
        try {
            if (mcjVar.a().width() <= 0 || mcjVar.a().height() <= 0) {
                return null;
            }
            int iMin = Math.min(bitmap.getWidth(), mcjVar.a().width());
            int iMin2 = Math.min(bitmap.getHeight(), mcjVar.a().height());
            LogUtil.a("ImageClipper", "clipRectangle, optionWidth :", Integer.valueOf(iMin), " , optionHeight :", Integer.valueOf(iMin2));
            return Bitmap.createBitmap(bitmap, mcjVar.a().left, mcjVar.a().top, iMin, iMin2);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("ImageClipper", "IllegalArgumentException error");
            return null;
        }
    }
}
