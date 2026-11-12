package com.xiaomi.smarthome.library.common.util;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.text.TextUtils;
import coil.util.Utils;
import com.miui.tsmclient.util.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public class BitmapUtils {
    private static final int DEFAULT_JPEG_QUALITY = 90;
    private static final String TAG = "BitmapUtils";
    public static final int UNCONSTRAINED = -1;

    private BitmapUtils() {
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    public static void compressImageFile(String str, String str2) throws Throwable {
        Bitmap bitmap;
        FileOutputStream fileOutputStream = null;
        bitmapDecodeFile = null;
        Bitmap bitmapDecodeFile = null;
        fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(str2));
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                int iComputeSampleSize = computeSampleSize(options.outWidth, options.outHeight, Constants.FHD_WIDTH, 2700000);
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = false;
                options2.inSampleSize = iComputeSampleSize;
                bitmapDecodeFile = BitmapFactory.decodeFile(str, options2);
                bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 40, fileOutputStream2);
                IOUtils.closeQuietly(fileOutputStream2);
                bitmapDecodeFile.recycle();
            } catch (Exception e) {
                e = e;
                Bitmap bitmap2 = bitmapDecodeFile;
                fileOutputStream = fileOutputStream2;
                bitmap = bitmap2;
                try {
                    e.printStackTrace();
                    IOUtils.closeQuietly(fileOutputStream);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                } catch (Throwable th) {
                    th = th;
                    IOUtils.closeQuietly(fileOutputStream);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                Bitmap bitmap3 = bitmapDecodeFile;
                fileOutputStream = fileOutputStream2;
                bitmap = bitmap3;
                IOUtils.closeQuietly(fileOutputStream);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            bitmap = null;
        } catch (Throwable th3) {
            th = th3;
            bitmap = null;
        }
    }

    public static byte[] compressToBytes(Bitmap bitmap) {
        return compressToBytes(bitmap, 90);
    }

    private static int computeInitialSampleSize(int i, int i2, int i3, int i4) {
        if (i4 == -1 && i3 == -1) {
            return 1;
        }
        int iCeil = i4 != -1 ? (int) Math.ceil(Math.sqrt((i * i2) / i4)) : 1;
        return i3 == -1 ? iCeil : Math.max(Math.min(i / i3, i2 / i3), iCeil);
    }

    public static int computeSampleSize(int i, int i2, int i3, int i4) {
        int iComputeInitialSampleSize = computeInitialSampleSize(i, i2, i3, i4);
        return iComputeInitialSampleSize <= 8 ? nextPowerOf2(iComputeInitialSampleSize) : ((iComputeInitialSampleSize + 7) / 8) * 8;
    }

    public static int computeSampleSizeLarger(int i, int i2, int i3) {
        int iMax = Math.max(i / i3, i2 / i3);
        if (iMax <= 1) {
            return 1;
        }
        return iMax <= 8 ? prevPowerOf2(iMax) : (iMax / 8) * 8;
    }

    public static Bitmap createVideoThumbnail(String str) throws Throwable {
        Class<?> cls;
        Object objNewInstance;
        Bitmap bitmapDecodeByteArray;
        Object obj = null;
        try {
            try {
                cls = Class.forName("android.media.MediaMetadataRetriever");
                try {
                    objNewInstance = cls.newInstance();
                    try {
                        cls.getMethod("setDataSource", String.class).invoke(objNewInstance, str);
                        byte[] bArr = (byte[]) cls.getMethod("getEmbeddedPicture", new Class[0]).invoke(objNewInstance, new Object[0]);
                        if (bArr != null && (bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length)) != null) {
                            if (objNewInstance != null) {
                                try {
                                    cls.getMethod("release", new Class[0]).invoke(objNewInstance, new Object[0]);
                                } catch (Exception unused) {
                                }
                            }
                            return bitmapDecodeByteArray;
                        }
                        Bitmap bitmap = (Bitmap) cls.getMethod("getFrameAtTime", new Class[0]).invoke(objNewInstance, new Object[0]);
                        if (objNewInstance != null) {
                            try {
                                cls.getMethod("release", new Class[0]).invoke(objNewInstance, new Object[0]);
                            } catch (Exception unused2) {
                            }
                        }
                        return bitmap;
                    } catch (ClassNotFoundException unused3) {
                        if (objNewInstance != null) {
                            cls.getMethod("release", new Class[0]).invoke(objNewInstance, new Object[0]);
                        }
                        return null;
                    } catch (IllegalAccessException unused4) {
                        if (objNewInstance != null) {
                            cls.getMethod("release", new Class[0]).invoke(objNewInstance, new Object[0]);
                        }
                        return null;
                    } catch (IllegalArgumentException unused5) {
                        if (objNewInstance != null) {
                            cls.getMethod("release", new Class[0]).invoke(objNewInstance, new Object[0]);
                        }
                        return null;
                    } catch (InstantiationException unused6) {
                        if (objNewInstance != null) {
                            cls.getMethod("release", new Class[0]).invoke(objNewInstance, new Object[0]);
                        }
                        return null;
                    } catch (NoSuchMethodException unused7) {
                        if (objNewInstance != null) {
                            cls.getMethod("release", new Class[0]).invoke(objNewInstance, new Object[0]);
                        }
                        return null;
                    } catch (RuntimeException unused8) {
                        if (objNewInstance != null) {
                            cls.getMethod("release", new Class[0]).invoke(objNewInstance, new Object[0]);
                        }
                        return null;
                    } catch (InvocationTargetException unused9) {
                        if (objNewInstance != null) {
                            cls.getMethod("release", new Class[0]).invoke(objNewInstance, new Object[0]);
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        obj = objNewInstance;
                        if (obj != null) {
                            try {
                                cls.getMethod("release", new Class[0]).invoke(obj, new Object[0]);
                            } catch (Exception unused10) {
                            }
                        }
                        throw th;
                    }
                } catch (ClassNotFoundException unused11) {
                    objNewInstance = null;
                } catch (IllegalAccessException unused12) {
                    objNewInstance = null;
                } catch (IllegalArgumentException unused13) {
                    objNewInstance = null;
                } catch (InstantiationException unused14) {
                    objNewInstance = null;
                } catch (NoSuchMethodException unused15) {
                    objNewInstance = null;
                } catch (RuntimeException unused16) {
                    objNewInstance = null;
                } catch (InvocationTargetException unused17) {
                    objNewInstance = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception unused18) {
                return null;
            }
        } catch (ClassNotFoundException unused19) {
            cls = null;
            objNewInstance = null;
        } catch (IllegalAccessException unused20) {
            cls = null;
            objNewInstance = null;
        } catch (IllegalArgumentException unused21) {
            cls = null;
            objNewInstance = null;
        } catch (InstantiationException unused22) {
            cls = null;
            objNewInstance = null;
        } catch (NoSuchMethodException unused23) {
            cls = null;
            objNewInstance = null;
        } catch (RuntimeException unused24) {
            cls = null;
            objNewInstance = null;
        } catch (InvocationTargetException unused25) {
            cls = null;
            objNewInstance = null;
        } catch (Throwable th3) {
            th = th3;
            cls = null;
        }
    }

    private static Bitmap.Config getConfig(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        return config == null ? Bitmap.Config.ARGB_8888 : config;
    }

    public static boolean isRotationSupported(String str) {
        if (str == null) {
            return false;
        }
        return str.toLowerCase().equals(Utils.MIME_TYPE_JPEG);
    }

    public static boolean isSupportedByRegionDecoder(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return (!lowerCase.startsWith("image/") || lowerCase.equals("image/gif") || lowerCase.endsWith("bmp")) ? false : true;
    }

    public static Bitmap loadBitmap(Resources resources, int i, int i2, int i3) {
        return loadBitmap(resources, i, i2, i3, 1);
    }

    public static int nextPowerOf2(int i) {
        if (i <= 0 || i > 1073741824) {
            throw new IllegalArgumentException();
        }
        int i2 = i - 1;
        int i3 = i2 | (i2 >> 16);
        int i4 = i3 | (i3 >> 8);
        int i5 = i4 | (i4 >> 4);
        int i6 = i5 | (i5 >> 2);
        return (i6 | (i6 >> 1)) + 1;
    }

    public static int prevPowerOf2(int i) {
        if (i > 0) {
            return Integer.highestOneBit(i);
        }
        throw new IllegalArgumentException();
    }

    public static void recycleSilently(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        try {
            bitmap.recycle();
        } catch (Throwable unused) {
        }
    }

    public static Bitmap resizeAndCropCenter(Bitmap bitmap, int i, boolean z) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == i && height == i) {
            return bitmap;
        }
        float fMin = i / Math.min(width, height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, getConfig(bitmap));
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate((i - iRound) / 2.0f, (i - iRound2) / 2.0f);
        canvas.scale(fMin, fMin);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, new Paint(6));
        if (z) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap resizeBitmapByScale(Bitmap bitmap, float f, boolean z) {
        int iRound = Math.round(bitmap.getWidth() * f);
        int iRound2 = Math.round(bitmap.getHeight() * f);
        if (iRound == bitmap.getWidth() && iRound2 == bitmap.getHeight()) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRound, iRound2, getConfig(bitmap));
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.scale(f, f);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, new Paint(6));
        if (z) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap resizeDownBySideLength(Bitmap bitmap, int i, boolean z) {
        float f = i;
        float fMin = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
        return fMin >= 1.0f ? bitmap : resizeBitmapByScale(bitmap, fMin, z);
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, int i, boolean z) {
        if (i == 0) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        if (z) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    public static int saveBitmapToPath(Bitmap bitmap, String str) {
        if (bitmap != null && !TextUtils.isEmpty(str)) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(str);
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.close();
                return 0;
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    public static byte[] compressToBytes(Bitmap bitmap, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(65536);
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap loadBitmap(Resources resources, int i, int i2, int i3, int i4) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i, options);
        options.inJustDecodeBounds = false;
        if (i4 > 0) {
            options.inSampleSize = computeSampleSize(options, -1, (i2 > 0 ? (int) (i2 / i4) : options.outWidth) * (i3 > 0 ? (int) (i3 / i4) : options.outHeight));
        } else {
            options.inSampleSize = 2;
        }
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inPurgeable = true;
        options.inInputShareable = true;
        InputStream inputStreamOpenRawResource = resources.openRawResource(i);
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenRawResource, null, options);
        try {
            inputStreamOpenRawResource.close();
        } catch (IOException unused) {
        }
        return bitmapDecodeStream;
    }

    public static int computeInitialSampleSize(BitmapFactory.Options options, int i, int i2) {
        int iMin;
        double d = options.outWidth;
        double d2 = options.outHeight;
        int iCeil = i2 == -1 ? 1 : (int) Math.ceil(Math.sqrt((d * d2) / ((double) i2)));
        if (i == -1) {
            iMin = 128;
        } else {
            double d3 = i;
            iMin = (int) Math.min(Math.floor(d / d3), Math.floor(d2 / d3));
        }
        if (iMin < iCeil) {
            return iCeil;
        }
        if (i2 == -1 && i == -1) {
            return 1;
        }
        return i == -1 ? iCeil : iMin;
    }

    public static int computeSampleSize(float f) {
        int iMax = Math.max(1, (int) Math.ceil(1.0f / f));
        if (iMax <= 8) {
            return nextPowerOf2(iMax);
        }
        return ((iMax + 7) / 8) * 8;
    }

    public static int computeSampleSizeLarger(float f) {
        int iFloor = (int) Math.floor(1.0f / f);
        if (iFloor <= 1) {
            return 1;
        }
        if (iFloor <= 8) {
            return prevPowerOf2(iFloor);
        }
        return (iFloor / 8) * 8;
    }

    public static int computeSampleSize(BitmapFactory.Options options, int i, int i2) {
        int iComputeInitialSampleSize = computeInitialSampleSize(options, i, i2);
        if (iComputeInitialSampleSize > 8) {
            return 8 * ((iComputeInitialSampleSize + 7) / 8);
        }
        int i3 = 1;
        while (i3 < iComputeInitialSampleSize) {
            i3 <<= 1;
        }
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    public static boolean compressImageFile(InputStream inputStream, String str) throws Throwable {
        Bitmap bitmap;
        FileOutputStream fileOutputStream = null;
        bitmapDecodeStream = null;
        Bitmap bitmapDecodeStream = null;
        fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(str));
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = false;
                options.inSampleSize = 2;
                bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                bitmapDecodeStream.compress(Bitmap.CompressFormat.JPEG, 30, fileOutputStream2);
                IOUtils.closeQuietly(fileOutputStream2);
                bitmapDecodeStream.recycle();
                return true;
            } catch (Exception e) {
                e = e;
                Bitmap bitmap2 = bitmapDecodeStream;
                fileOutputStream = fileOutputStream2;
                bitmap = bitmap2;
                try {
                    e.printStackTrace();
                    IOUtils.closeQuietly(fileOutputStream);
                    if (bitmap == null) {
                        return false;
                    }
                    bitmap.recycle();
                    return false;
                } catch (Throwable th) {
                    th = th;
                    IOUtils.closeQuietly(fileOutputStream);
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                Bitmap bitmap3 = bitmapDecodeStream;
                fileOutputStream = fileOutputStream2;
                bitmap = bitmap3;
                IOUtils.closeQuietly(fileOutputStream);
                if (bitmap != null) {
                    bitmap.recycle();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            bitmap = null;
        } catch (Throwable th3) {
            th = th3;
            bitmap = null;
        }
    }
}
