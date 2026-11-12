package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginsocialshare.camera.MyCropActivity;
import health.compact.a.CommonUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes15.dex */
public class pkm {
    public static void c(Activity activity) {
        if (activity == null) {
            LogUtil.e("Share_CropPictureUtils", "choosePic: activity is null");
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.PICK", (Uri) null);
            intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Constants.IMAGE_TYPE);
            activity.startActivityForResult(intent, 2);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("Share_CropPictureUtils", "open system gallery fail:", e.getMessage());
        } catch (SecurityException e2) {
            LogUtil.e("Share_CropPictureUtils", "open system gallery fail securityException: ", e2.getMessage());
        }
    }

    public static void d(Activity activity) {
        if (activity == null) {
            LogUtil.e("Share_CropPictureUtils", "takePhoto: activity is null");
            return;
        }
        if (d() == null) {
            LogUtil.a("Share_CropPictureUtils", "takePhoto getSaveFile is null");
            return;
        }
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.setFlags(1);
        intent.setFlags(2);
        intent.putExtra("camerasensortype", 2);
        intent.putExtra("autofocus", true);
        intent.putExtra("fullScreen", true);
        intent.putExtra("showActionIcons", false);
        intent.putExtra("output", pnq.a(activity, d()));
        try {
            activity.startActivityForResult(intent, 4);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("Share_CropPictureUtils", "open system camera fail:", e.getMessage());
        } catch (SecurityException e2) {
            LogUtil.e("Share_CropPictureUtils", "open system camera fail securityException: ", e2.getMessage());
        }
    }

    public static void e(final Activity activity, Intent intent) {
        if (activity == null) {
            LogUtil.e("Share_CropPictureUtils", "startCrop: activity is null");
            return;
        }
        if (intent == null) {
            LogUtil.a("Share_CropPictureUtils", "data is null");
            return;
        }
        final String strA = a(activity, intent);
        if (TextUtils.isEmpty(strA)) {
            LogUtil.a("Share_CropPictureUtils", "Crop Image is empty");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: pkn
                @Override // java.lang.Runnable
                public final void run() {
                    pkm.e(activity, strA);
                }
            });
        }
    }

    static /* synthetic */ void e(Activity activity, String str) {
        Intent intent = new Intent(activity, (Class<?>) MyCropActivity.class);
        intent.putExtra(BleConstants.KEY_PATH, str);
        activity.startActivityForResult(intent, 3);
    }

    public static void e(Activity activity) {
        if (activity == null) {
            LogUtil.e("Share_CropPictureUtils", "choosePic: activity is null");
        } else {
            if (d() == null) {
                LogUtil.a("Share_CropPictureUtils", "startCrop getSaveFile is null");
                return;
            }
            Intent intent = new Intent(activity, (Class<?>) MyCropActivity.class);
            intent.putExtra(BleConstants.KEY_PATH, d().getPath());
            activity.startActivityForResult(intent, 3);
        }
    }

    public static void c(final Activity activity, Intent intent) {
        if (activity == null) {
            LogUtil.e("Share_CropPictureUtils", "startRatioCrop, activity is null");
            return;
        }
        if (intent == null) {
            LogUtil.a("Share_CropPictureUtils", "startRatioCrop, data is null");
            return;
        }
        final String strA = a(activity, intent);
        if (TextUtils.isEmpty(strA)) {
            LogUtil.a("Share_CropPictureUtils", "startRatioCrop,Crop Image is empty");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: pkk
                @Override // java.lang.Runnable
                public final void run() {
                    pkm.b(activity, strA);
                }
            });
        }
    }

    static /* synthetic */ void b(Activity activity, String str) {
        Intent intent = new Intent(activity, (Class<?>) MyCropActivity.class);
        intent.putExtra(BleConstants.KEY_PATH, str);
        d(intent);
        activity.startActivityForResult(intent, 3);
    }

    public static void b(Activity activity) {
        if (activity == null) {
            LogUtil.e("Share_CropPictureUtils", "startRatioCrop, activity is null");
            return;
        }
        if (d() == null) {
            LogUtil.a("Share_CropPictureUtils", "startRatioCrop, getSaveFile is null");
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) MyCropActivity.class);
        intent.putExtra(BleConstants.KEY_PATH, d().getPath());
        d(intent);
        activity.startActivityForResult(intent, 3);
    }

    private static void d(Intent intent) {
        intent.putExtra("height", 16);
        intent.putExtra("width", 9);
        intent.putExtra("maxScaleRation", 4.0f);
        intent.putExtra("midScaleRation", 2.0f);
        intent.putExtra("scaleRatio", 1.0f);
        if (qrs.af(BaseApplication.getContext()) && qrs.t()) {
            intent.putExtra("HorizontalPadding", 120);
        }
        intent.putExtra("HorizontalPadding", 40);
    }

    private static String a(Activity activity, Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            LogUtil.e("Share_CropPictureUtils", "getPath, data.getData() returns null");
            return "";
        }
        if (TextUtils.isEmpty(data.getAuthority())) {
            return data.getPath();
        }
        return c(activity, data);
    }

    private static File d() {
        String externalStorageState = Environment.getExternalStorageState();
        if (!"mounted".equals(externalStorageState)) {
            LogUtil.a("Share_CropPictureUtils", "getSaveFile sdState ", externalStorageState);
            return null;
        }
        File file = new File(lrp.g);
        if (!file.exists()) {
            boolean zMkdirs = file.mkdirs();
            LogUtil.a("Share_CropPictureUtils", "dirResult:", Boolean.valueOf(zMkdirs));
            if (!zMkdirs) {
                return null;
            }
        }
        return new File(lrp.g, "ShareClipTemp.png");
    }

    private static String c(Activity activity, Uri uri) throws Throwable {
        Bitmap bitmapD = d(activity, uri);
        try {
            String strC = CommonUtil.c(CommonUtil.f(activity.getApplicationContext()).getCanonicalPath() + "/Huawei/Health/ShareTmp/crop_tmp");
            if (TextUtils.isEmpty(strC) || bitmapD == null || bitmapD.isRecycled() || !qqf.b(bitmapD, strC)) {
                return null;
            }
            d(activity, uri, strC);
            return strC;
        } catch (IOException unused) {
            LogUtil.j("Share_CropPictureUtils", "dealUri getExternalFilesDirectory fail，IOException");
            return null;
        }
    }

    private static void d(Context context, Uri uri, String str) {
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    ExifInterface exifInterface = new ExifInterface(inputStreamOpenInputStream);
                    ExifInterface exifInterface2 = new ExifInterface(str);
                    exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION));
                    exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH));
                    exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_LENGTH, exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_LENGTH));
                    exifInterface2.saveAttributes();
                } catch (Throwable th) {
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream.close();
            }
        } catch (IOException unused) {
            LogUtil.j("Share_CropPictureUtils", "Cannot copy exif data");
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x007e: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:22:0x007e */
    private static Bitmap d(Activity activity, Uri uri) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream;
        BitmapFactory.Options options = new BitmapFactory.Options();
        InputStream inputStream2 = null;
        bitmapDecodeStream = null;
        bitmapDecodeStream = null;
        bitmapDecodeStream = null;
        bitmapDecodeStream = null;
        bitmapDecodeStream = null;
        bitmapDecodeStream = null;
        bitmapDecodeStream = null;
        bitmapDecodeStream = null;
        Bitmap bitmapDecodeStream = null;
        try {
            try {
                inputStreamOpenInputStream = activity.getContentResolver().openInputStream(uri);
                try {
                    options.inJustDecodeBounds = true;
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    int i = options.outHeight * options.outWidth * 2;
                    int iA = a();
                    int iCeil = (i <= iA || iA <= 0) ? 1 : (int) Math.ceil(i / iA);
                    int iCeil2 = options.outWidth > 4032 ? (int) Math.ceil(options.outWidth / 4032) : 1;
                    if (iCeil <= iCeil2) {
                        iCeil = iCeil2;
                    }
                    options.inSampleSize = iCeil;
                    LogUtil.a("Share_CropPictureUtils", "inSampleSize:", Integer.valueOf(options.inSampleSize));
                    options.inJustDecodeBounds = false;
                    inputStreamOpenInputStream = activity.getContentResolver().openInputStream(uri);
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException unused) {
                            LogUtil.j("Share_CropPictureUtils", "close stream exception");
                        }
                    }
                } catch (IOException unused2) {
                    LogUtil.j("Share_CropPictureUtils", "getBitmapFromUri ioException");
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException unused3) {
                            LogUtil.j("Share_CropPictureUtils", "close stream exception");
                        }
                    }
                } catch (IllegalArgumentException unused4) {
                    LogUtil.j("Share_CropPictureUtils", "getBitmapFromUri illegalArgumentException");
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException unused5) {
                            LogUtil.j("Share_CropPictureUtils", "close stream exception");
                        }
                    }
                } catch (IllegalStateException unused6) {
                    LogUtil.j("Share_CropPictureUtils", "getBitmapFromUri illegalStateException");
                    if (inputStreamOpenInputStream != null) {
                        try {
                            inputStreamOpenInputStream.close();
                        } catch (IOException unused7) {
                            LogUtil.j("Share_CropPictureUtils", "close stream exception");
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused8) {
                        LogUtil.j("Share_CropPictureUtils", "close stream exception");
                    }
                }
                throw th;
            }
        } catch (IOException unused9) {
            inputStreamOpenInputStream = null;
        } catch (IllegalArgumentException unused10) {
            inputStreamOpenInputStream = null;
        } catch (IllegalStateException unused11) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
        return bitmapDecodeStream;
    }

    public static int a() {
        long jE = e();
        int i = (int) (jE / 4);
        if (i >= 1048576) {
            return i;
        }
        if (jE > ((long) 1048576) * 2) {
            return 1048576;
        }
        return (int) (jE / 2);
    }

    static long e() {
        long jMaxMemory = Runtime.getRuntime().maxMemory();
        long j = Runtime.getRuntime().totalMemory();
        long jFreeMemory = Runtime.getRuntime().freeMemory();
        long j2 = (jMaxMemory - j) + jFreeMemory;
        LogUtil.a("Share_CropPictureUtils", "maxMemory:", Long.valueOf(jMaxMemory), " totalMemory:", Long.valueOf(j), " freeMemory:", Long.valueOf(jFreeMemory), " realFreeMemory:", Long.valueOf(j2));
        return j2;
    }
}
