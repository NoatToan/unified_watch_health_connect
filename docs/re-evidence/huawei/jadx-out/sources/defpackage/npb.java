package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.huawei.openalliance.ad.constant.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class npb {
    private static int b(int i) {
        if (i > 1000) {
            return 60;
        }
        if (i > 750) {
            return 40;
        }
        return i > 500 ? 20 : 10;
    }

    public static Uri e(Context context) {
        String strC = c(context);
        if (TextUtils.isEmpty(strC)) {
            return null;
        }
        return Uri.fromFile(new File(strC));
    }

    private static String c(Context context) {
        String strD = d(context);
        if (!TextUtils.isEmpty(strD)) {
            return strD + "/" + c();
        }
        return "";
    }

    public static String d(Context context) {
        if (context == null) {
            nox.a("PicUtil", "context is null.", true);
            return "";
        }
        try {
            String externalStorageState = Environment.getExternalStorageState();
            if ("mounted_ro".equals(externalStorageState)) {
                nox.b("PicUtil", "read only.", true);
                return "";
            }
            if (!"mounted".equals(externalStorageState)) {
                nox.b("PicUtil", "media mounted.", true);
                return "";
            }
            return b(context);
        } catch (RuntimeException unused) {
            nox.a("PicUtil", "getExternalStorageState failed", true);
            return "";
        }
    }

    private static String b(Context context) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir == null) {
            nox.a("PicUtil", "External cache dir not existence.", true);
            return "";
        }
        try {
            String str = externalCacheDir.getCanonicalPath() + "/tmpFiles";
            File file = new File(str);
            if (file.exists() || file.mkdir()) {
                return str;
            }
            nox.a("PicUtil", "External cache tmp dir not existence.", true);
            return "";
        } catch (IOException e) {
            nox.b("PicUtil", "IOException " + e.getClass().getSimpleName(), true);
            return "";
        }
    }

    private static String c() {
        Date date = new Date(System.currentTimeMillis());
        return "HwID_card_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(date) + ".jpg";
    }

    public static Point a(Context context) {
        nox.b("PicUtil", "getRealScreenSize start.", true);
        Display defaultDisplay = ((WindowManager) context.getApplicationContext().getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        try {
            Point point = new Point();
            Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
            i = point.y;
            i2 = point.x;
            nox.b("PicUtil", "heightPixels is " + i, false);
            nox.b("PicUtil", "widthPixels is " + i2, false);
        } catch (IllegalAccessException e) {
            nox.b("PicUtil", "IllegalAccessException " + e.getClass().getSimpleName(), true);
        } catch (IllegalArgumentException e2) {
            nox.b("PicUtil", "IllegalArgumentException " + e2.getClass().getSimpleName(), true);
        } catch (NoSuchMethodException e3) {
            nox.b("PicUtil", "getRealScreenSize NoSuchMethodException " + e3.getClass().getSimpleName(), true);
        } catch (InvocationTargetException e4) {
            nox.b("PicUtil", "InvocationTargetException " + e4.getClass().getSimpleName(), true);
        } catch (Exception e5) {
            nox.b("PicUtil", "getRealScreenSize Exception " + e5.getClass().getSimpleName(), true);
        }
        return new Point(i2, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.io.FileOutputStream] */
    public static boolean d(Context context, String str, int i, String str2) throws Throwable {
        StringBuilder sb;
        Point pointA = a(context);
        Bitmap bitmapC = c(str, pointA.x > 0 ? pointA.x : 1920, pointA.y > 0 ? pointA.y : 1080);
        if (bitmapC == null) {
            nox.b("PicUtil", "bitmap is null", true);
            return false;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 100;
        bitmapC.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        int length = byteArrayOutputStream.toByteArray().length;
        nox.b("PicUtil", "compressBitmap length = " + length, true);
        if (length > 20971520) {
            nox.b("PicUtil", "compressBitmap too large return false", true);
            return false;
        }
        while (byteArrayOutputStream.toByteArray().length > i * 1024) {
            int iB = b(byteArrayOutputStream.toByteArray().length / 1024);
            byteArrayOutputStream.reset();
            i2 -= iB;
            bitmapC.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
        }
        ?? r10 = 0;
        FileOutputStream fileOutputStream = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                FileOutputStream fileOutputStream3 = new FileOutputStream(new File(str2));
                try {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    nox.b("PicUtil", "compressBitmap final length = " + byteArray.length, true);
                    fileOutputStream3.write(byteArray);
                    fileOutputStream3.flush();
                    fileOutputStream3.close();
                    try {
                        fileOutputStream3.close();
                        r10 = byteArray;
                    } catch (IOException e) {
                        e = e;
                        sb = new StringBuilder("error = ");
                        sb.append(e.getClass().getSimpleName());
                        nox.a("PicUtil", sb.toString(), true);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream3;
                    nox.a("PicUtil", "error = " + e.getClass().getSimpleName(), true);
                    r10 = fileOutputStream;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                            r10 = fileOutputStream;
                        } catch (IOException e3) {
                            e = e3;
                            sb = new StringBuilder("error = ");
                            sb.append(e.getClass().getSimpleName());
                            nox.a("PicUtil", sb.toString(), true);
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    fileOutputStream2 = fileOutputStream3;
                    nox.a("PicUtil", "error = " + e.getClass().getSimpleName(), true);
                    r10 = fileOutputStream2;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                            r10 = fileOutputStream2;
                        } catch (IOException e5) {
                            e = e5;
                            sb = new StringBuilder("error = ");
                            sb.append(e.getClass().getSimpleName());
                            nox.a("PicUtil", sb.toString(), true);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    r10 = fileOutputStream3;
                    if (r10 != 0) {
                        try {
                            r10.close();
                        } catch (IOException e6) {
                            nox.a("PicUtil", "error = " + e6.getClass().getSimpleName(), true);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e7) {
            e = e7;
        } catch (Exception e8) {
            e = e8;
        }
        bitmapC.recycle();
        return true;
    }

    private static Bitmap c(String str, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        Bitmap bitmapDecodeFile = null;
        try {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i3 = options.outWidth / i;
            int i4 = options.outHeight / i2;
            if (i3 >= i4) {
                i3 = i4;
            }
            if (i3 < 1) {
                i3 = 1;
            }
            nox.b("PicUtil", "Picture resolution compression scale：" + i3, true);
            options.inSampleSize = i3;
            options.inJustDecodeBounds = false;
            bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
            int iD = d(str);
            nox.b("PicUtil", "Picture resolution degree：" + iD, true);
            return iD != 0 ? d(iD, bitmapDecodeFile) : bitmapDecodeFile;
        } catch (OutOfMemoryError unused) {
            nox.a("PicUtil", "compressByResolution OutOfMemoryError", true);
            return bitmapDecodeFile;
        } catch (RuntimeException unused2) {
            nox.a("PicUtil", "compressByResolution RuntimeException", true);
            return bitmapDecodeFile;
        } catch (Exception unused3) {
            nox.a("PicUtil", "compressByResolution Exception", true);
            return bitmapDecodeFile;
        }
    }

    private static int d(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (IOException e) {
            nox.a("PicUtil", "readImageDegree IOException" + e.getClass().getSimpleName(), true);
            return 0;
        }
    }

    private static Bitmap d(int i, Bitmap bitmap) {
        if (i == 0 || bitmap == null) {
            return bitmap;
        }
        nox.b("PicUtil", "rotaingImageView", true);
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0090 A[Catch: IOException -> 0x0094, TRY_LEAVE, TryCatch #3 {IOException -> 0x0094, blocks: (B:32:0x0085, B:34:0x0090), top: B:85:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0166 A[Catch: IOException -> 0x016a, TRY_LEAVE, TryCatch #7 {IOException -> 0x016a, blocks: (B:73:0x015b, B:75:0x0166), top: B:91:0x015b }] */
    public static boolean c(Context context, Uri uri, Uri uri2, boolean z) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStreamCreateOutputStream;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        InputStream inputStreamOpenInputStream = null;
        try {
            assetFileDescriptorOpenAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri2, "rw");
            if (assetFileDescriptorOpenAssetFileDescriptor == null || uri2 == null || uri == null) {
                fileOutputStreamCreateOutputStream = null;
            } else {
                try {
                    fileOutputStreamCreateOutputStream = assetFileDescriptorOpenAssetFileDescriptor.createOutputStream();
                    try {
                        inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        byte[] bArr = new byte[16384];
                        if (inputStreamOpenInputStream != null) {
                            while (true) {
                                int i = inputStreamOpenInputStream.read(bArr);
                                if (i <= 0) {
                                    break;
                                }
                                fileOutputStreamCreateOutputStream.write(bArr, 0, i);
                            }
                        }
                    } catch (IOException unused) {
                        if (inputStreamOpenInputStream != null) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e) {
                                nox.b("PicUtil", "in close err: " + e.getClass().getSimpleName(), true);
                            }
                        }
                        if (fileOutputStreamCreateOutputStream != null) {
                            try {
                                fileOutputStreamCreateOutputStream.close();
                            } catch (IOException e2) {
                                nox.b("PicUtil", "out close err: " + e2.getClass().getSimpleName(), true);
                            }
                        }
                        if (z && uri != null) {
                            try {
                                context.getContentResolver().delete(uri, "", new String[0]);
                                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                                    assetFileDescriptorOpenAssetFileDescriptor.close();
                                }
                            } catch (IOException e3) {
                                nox.b("PicUtil", "fd close err: " + e3.getClass().getSimpleName(), true);
                                return false;
                            }
                        } else if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                            assetFileDescriptorOpenAssetFileDescriptor.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        if (inputStreamOpenInputStream != null) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e4) {
                                nox.b("PicUtil", "in close err: " + e4.getClass().getSimpleName(), true);
                            }
                        }
                        if (fileOutputStreamCreateOutputStream != null) {
                            try {
                                fileOutputStreamCreateOutputStream.close();
                            } catch (IOException e5) {
                                nox.b("PicUtil", "out close err: " + e5.getClass().getSimpleName(), true);
                            }
                        }
                        if (z && uri != null) {
                            try {
                                context.getContentResolver().delete(uri, "", new String[0]);
                            } catch (IOException e6) {
                                nox.b("PicUtil", "fd close err: " + e6.getClass().getSimpleName(), true);
                                throw th;
                            }
                        }
                        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                            assetFileDescriptorOpenAssetFileDescriptor.close();
                            throw th;
                        }
                        throw th;
                    }
                } catch (IOException unused2) {
                    fileOutputStreamCreateOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStreamCreateOutputStream = null;
                }
            }
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e7) {
                    nox.b("PicUtil", "in close err: " + e7.getClass().getSimpleName(), true);
                }
            }
            if (fileOutputStreamCreateOutputStream != null) {
                try {
                    fileOutputStreamCreateOutputStream.close();
                } catch (IOException e8) {
                    nox.b("PicUtil", "out close err: " + e8.getClass().getSimpleName(), true);
                }
            }
            if (z && uri != null) {
                try {
                    context.getContentResolver().delete(uri, "", new String[0]);
                    if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                        assetFileDescriptorOpenAssetFileDescriptor.close();
                    }
                } catch (IOException e9) {
                    nox.b("PicUtil", "fd close err: " + e9.getClass().getSimpleName(), true);
                }
            } else if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                assetFileDescriptorOpenAssetFileDescriptor.close();
            }
            return true;
        } catch (IOException unused3) {
            fileOutputStreamCreateOutputStream = null;
            assetFileDescriptorOpenAssetFileDescriptor = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStreamCreateOutputStream = null;
            assetFileDescriptorOpenAssetFileDescriptor = null;
        }
    }

    public static void e(String str) {
        nox.b("PicUtil", "deleteCachedFiles", true);
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                a(file);
            }
        } catch (RuntimeException unused) {
            nox.a("PicUtil", "deleteCachedFiles RuntimeException", true);
        } catch (Exception unused2) {
            nox.a("PicUtil", "deleteCachedFiles Exception", true);
        }
    }

    private static void a(File file) {
        if (file == null) {
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            nox.b("PicUtil", "deleteDirInnerPicFile files == null", true);
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.getName().startsWith("HwID_card_") && !file2.delete()) {
                nox.b("PicUtil", "delete file fail", true);
            }
        }
    }
}
