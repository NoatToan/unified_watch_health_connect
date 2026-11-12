package com.huawei.hms.hmsscankit;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.ml.scan.HmsBuildBitmapOption;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanAnalyzerOptions;
import com.huawei.hms.ml.scan.HmsScanBase;
import com.huawei.hms.ml.scan.HmsScanFrame;
import com.huawei.hms.ml.scan.HmsScanFrameOptions;
import com.huawei.hms.ml.scan.HmsScanResult;
import com.huawei.hms.mlsdk.common.MLFrame;
import com.huawei.hms.scankit.p.c5;
import com.huawei.hms.scankit.p.o4;
import com.huawei.hms.scankit.p.w7;
import com.huawei.phoneservice.faq.base.constants.TrackConstants$Events;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class ScanUtil {
    public static final int CAMERA_INIT_ERROR = -1000;
    static final String CONTEXT_METHOD = "initializeModule";
    static final String CONTEXT_PATH = "com.huawei.hms.feature.DynamicModuleInitializer";
    static final String CREATOR_PATH = "com.huawei.hms.scankit.Creator";
    public static final int ERROR_ABNORMAL_RESTART = 3;
    public static final int ERROR_INVALID_PARAM = 4;
    public static final int ERROR_NO_CAMERA_PERMISSION = 1;
    public static final int ERROR_NO_READ_PERMISSION = 2;
    private static final int LITE_VERSION = 10320300;
    private static final int MAX_BITMAP_SIZE = 52428800;
    static final String MODULE_SCANKIT = "huawei_module_scankit";
    static final String MODULE_SCANKIT_LOCAL = "huawei_module_scankit_local";
    private static final int NEW_VERSION = 21002300;
    public static final String RESULT = "SCAN_RESULT";
    public static final String RESULT_CODE = "SCAN_RESULT_CODE";
    public static final int SCAN_NO_DETECTED = 4096;
    public static final int SUCCESS = 0;
    private static final int WR_VERSION = 201000300;

    public static Bitmap buildBitmap(String str, int i, int i2, int i3, HmsBuildBitmapOption hmsBuildBitmapOption) throws WriterException {
        return new c5().a(str, i, i2, i3, hmsBuildBitmapOption);
    }

    private static HmsScanResult checkHmsScan(HmsScan[] hmsScanArr, HmsScanFrameOptions hmsScanFrameOptions) {
        if (hmsScanArr.length == 0) {
            return new HmsScanResult(4096, null);
        }
        if (hmsScanArr[0].getOriginalValue() != "" || hmsScanArr[0].getZoomValue() <= 1.0d) {
            return hmsScanArr[0].getOriginalValue() != "" ? new HmsScanResult(0, hmsScanArr) : new HmsScanResult(4096, hmsScanArr);
        }
        return new HmsScanResult(4098, hmsScanArr);
    }

    private static boolean checkVersion(int i, int i2) {
        if (i == LITE_VERSION && (i2 < NEW_VERSION || i2 == WR_VERSION)) {
            return true;
        }
        if (i != LITE_VERSION) {
            return i < NEW_VERSION || i2 == WR_VERSION || i2 < NEW_VERSION;
        }
        return false;
    }

    public static Bitmap compressBitmap(Context context, String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        dealBitmapFactoryOption(context, options);
        return BitmapFactory.decodeFile(str, options);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0043 A[Catch: Exception -> 0x005f, NullPointerException -> 0x0069, all -> 0x0089, TRY_LEAVE, TryCatch #2 {all -> 0x0089, blocks: (B:5:0x0021, B:7:0x0027, B:8:0x0038, B:10:0x0043, B:18:0x005f, B:23:0x0069), top: B:39:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:12:0x0056 A[DONT_INVERT, PHI: r4
      0x0056: PHI (r4v8 android.net.Uri) = (r4v11 android.net.Uri), (r4v17 android.net.Uri) binds: [B:11:0x0055, B:9:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0058 A[Catch: Exception -> 0x0074, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0074, blocks: (B:13:0x0058, B:20:0x0064, B:25:0x0070), top: B:41:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0038 A[Catch: Exception -> 0x005f, NullPointerException -> 0x0069, all -> 0x0089, TryCatch #2 {all -> 0x0089, blocks: (B:5:0x0021, B:7:0x0027, B:8:0x0038, B:10:0x0043, B:18:0x005f, B:23:0x0069), top: B:39:0x0008 }] */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x008a: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:31:0x008a */
    public static Bitmap compressBitmapForAndroid29(Context context, String str) {
        Cursor cursorQuery;
        Cursor cursor;
        Uri uriWithAppendedPath;
        Uri uri = null;
        uri = null;
        uri = null;
        uri = null;
        uri = null;
        uri = null;
        Cursor cursor2 = null;
        try {
            try {
                try {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    cursorQuery = contentResolver.query(uri2, new String[]{"_id"}, "_data=?", new String[]{str}, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                uriWithAppendedPath = Uri.withAppendedPath(uri2, String.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("_id"))));
                            } else if (new File(str).exists()) {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("_data", str);
                                uriWithAppendedPath = context.getContentResolver().insert(uri2, contentValues);
                            } else if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            uri = uriWithAppendedPath;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                        } catch (NullPointerException unused) {
                            o4.b(TrackConstants$Events.EXCEPTION, "NullPointerException");
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            getBitmapFromUri(context, uri, options);
                            dealBitmapFactoryOption(context, options);
                            return getBitmapFromUri(context, uri, options);
                        } catch (Exception unused2) {
                            o4.b(TrackConstants$Events.EXCEPTION, "Exception");
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inJustDecodeBounds = true;
                            getBitmapFromUri(context, uri, options2);
                            dealBitmapFactoryOption(context, options2);
                            return getBitmapFromUri(context, uri, options2);
                        }
                    } else if (new File(str).exists()) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("_data", str);
                        uriWithAppendedPath = context.getContentResolver().insert(uri2, contentValues2);
                        uri = uriWithAppendedPath;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } else if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        try {
                            cursor2.close();
                        } catch (Exception unused3) {
                            o4.b(TrackConstants$Events.EXCEPTION, "Exception");
                        }
                    }
                    throw th;
                }
            } catch (NullPointerException unused4) {
                cursorQuery = null;
            } catch (Exception unused5) {
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Exception unused6) {
            o4.b(TrackConstants$Events.EXCEPTION, "Exception");
        }
        BitmapFactory.Options options3 = new BitmapFactory.Options();
        options3.inJustDecodeBounds = true;
        getBitmapFromUri(context, uri, options3);
        dealBitmapFactoryOption(context, options3);
        return getBitmapFromUri(context, uri, options3);
    }

    private static void dealBitmapFactoryOption(Context context, BitmapFactory.Options options) {
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

    public static HmsScanResult decode(Context context, HmsScanFrame hmsScanFrame, HmsScanFrameOptions hmsScanFrameOptions) {
        if (hmsScanFrame == null || (hmsScanFrame.getYuvImage() == null && hmsScanFrame.getBitmap() == null)) {
            return new HmsScanResult(4, new HmsScan[0]);
        }
        o4.d("Scankit", "frame height " + hmsScanFrame.getHeight() + " width " + hmsScanFrame.getWidth());
        if (hmsScanFrame.getHeight() * hmsScanFrame.getHeight() > 52428800 || hmsScanFrame.getHeight() * hmsScanFrame.getHeight() == 0) {
            o4.e("ScanUtil", "input image is invalid:" + hmsScanFrame.getWidth() + " " + hmsScanFrame.getHeight());
            return new HmsScanResult(4, new HmsScan[0]);
        }
        try {
            if (g.d == Integer.MIN_VALUE) {
                g.d = g.a(context);
            }
            if (g.e == Integer.MIN_VALUE) {
                g.e = DynamicModule.getRemoteVersion(context.getApplicationContext(), MODULE_SCANKIT);
            }
        } catch (Exception unused) {
            o4.b("Scankit", "get remote version failed");
        }
        if (hmsScanFrameOptions != null && hmsScanFrameOptions.isMultiMode()) {
            HmsScan[] hmsScanArrA = b.a(context, hmsScanFrame, new HmsScanAnalyzerOptions.Creator().setHmsScanTypes(hmsScanFrameOptions.getType(), new int[0]).setPhotoMode(hmsScanFrameOptions.isPhotoMode()).setParseResult(hmsScanFrameOptions.isParseResult()).create());
            if (hmsScanArrA.length == 0) {
                return new HmsScanResult(4096, hmsScanArrA);
            }
            if (hmsScanArrA.length == 1 && hmsScanArrA[0].getZoomValue() > 1.0d && TextUtils.isEmpty(hmsScanArrA[0].getOriginalValue())) {
                return new HmsScanResult(4098, hmsScanArrA);
            }
            return (hmsScanArrA.length < 1 || TextUtils.isEmpty(hmsScanArrA[0].getOriginalValue())) ? new HmsScanResult(4096, hmsScanArrA) : new HmsScanResult(0, hmsScanArrA);
        }
        HmsScanAnalyzerOptions hmsScanAnalyzerOptionsCreate = hmsScanFrameOptions == null ? new HmsScanAnalyzerOptions.Creator().create() : new HmsScanAnalyzerOptions.Creator().setHmsScanTypes(hmsScanFrameOptions.getType(), new int[0]).setPhotoMode(hmsScanFrameOptions.isPhotoMode()).setParseResult(hmsScanFrameOptions.isParseResult()).create();
        if (hmsScanFrame.getBitmap() != null) {
            return checkHmsScan(f.a(context, hmsScanFrame.getBitmap(), hmsScanAnalyzerOptionsCreate), hmsScanFrameOptions);
        }
        if (hmsScanFrame.getYuvImage() == null) {
            return new HmsScanResult(4, new HmsScan[0]);
        }
        Log.i("scankit", "local version " + g.d + " remote version" + g.e);
        return checkVersion(g.d, g.e) ? f.a(context, hmsScanFrame, hmsScanAnalyzerOptionsCreate) : f.a(context, hmsScanFrame.getYuvImage().getYuvData(), hmsScanFrame.getYuvImage().getWidth(), hmsScanFrame.getYuvImage().getHeight(), hmsScanAnalyzerOptionsCreate);
    }

    public static HmsScan[] decodeWithBitmap(Context context, Bitmap bitmap, HmsScanAnalyzerOptions hmsScanAnalyzerOptions) {
        if (bitmap != null && bitmap.getWidth() * bitmap.getHeight() <= 52428800) {
            return f.a(context, bitmap, hmsScanAnalyzerOptions);
        }
        if (bitmap != null) {
            o4.e("ScanUtil", "input image is too large:" + bitmap.getWidth());
        }
        return new HmsScan[0];
    }

    public static HmsScan[] detectForHmsDector(Context context, MLFrame mLFrame, HmsScanAnalyzerOptions hmsScanAnalyzerOptions) {
        return b.a(context, mLFrame, hmsScanAnalyzerOptions);
    }

    private static Bitmap getBitmapFromUri(Context context, Uri uri, BitmapFactory.Options options) {
        if (uri == null) {
            o4.a("ScanBitmap", "uri == null");
            return null;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), null, options);
            parcelFileDescriptorOpenFileDescriptor.close();
            return bitmapDecodeFileDescriptor;
        } catch (FileNotFoundException unused) {
            o4.b(TrackConstants$Events.EXCEPTION, "FileNotFoundException");
            return null;
        } catch (IOException unused2) {
            o4.b(TrackConstants$Events.EXCEPTION, "IOException");
            return null;
        } catch (Exception unused3) {
            o4.b(TrackConstants$Events.EXCEPTION, "Exception");
            return null;
        }
    }

    public static boolean isScanAvailable(Context context) {
        return true;
    }

    public static int startScan(Activity activity, int i, HmsScanAnalyzerOptions hmsScanAnalyzerOptions) {
        int i2;
        o4.d("ScanUtil", "startScan before");
        try {
            i2 = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 16384).applicationInfo.targetSdkVersion;
        } catch (PackageManager.NameNotFoundException unused) {
            o4.b(TrackConstants$Events.EXCEPTION, "NameNotFoundException");
            i2 = 28;
        } catch (RuntimeException unused2) {
            o4.b(TrackConstants$Events.EXCEPTION, "RuntimeException");
            i2 = 28;
        }
        boolean zSelfPermissionGranted = selfPermissionGranted(activity, i2, "android.permission.CAMERA");
        if (!w7.f16406c) {
            o4.d("ScanUtil", "startScan failed");
            return 3;
        }
        if (!zSelfPermissionGranted && (hmsScanAnalyzerOptions == null || !hmsScanAnalyzerOptions.showGuide)) {
            return 1;
        }
        Intent intent = new Intent(activity, (Class<?>) ScanKitActivity.class);
        if (hmsScanAnalyzerOptions != null) {
            intent.putExtra(HmsScanBase.SCAN_FORMAT_FLAG, hmsScanAnalyzerOptions.mode);
            intent.putExtra(HmsScanBase.SCAN_VIEW_FLAG, hmsScanAnalyzerOptions.viewType);
            intent.putExtra(HmsScanBase.SCAN_ERROR_CHECK_FLAG, hmsScanAnalyzerOptions.errorCheck);
            intent.putExtra(HmsScanBase.SCAN_GUIDE_FLAG, hmsScanAnalyzerOptions.showGuide);
        }
        o4.d("ScanUtil", "startScan success");
        w7.f16406c = false;
        activity.startActivityForResult(intent, i);
        return 0;
    }

    public static boolean selfPermissionGranted(Context context, int i, String str) {
        if (i >= 23) {
            if (w7.a(str) != null && context.checkSelfPermission(str) != 0) {
                return false;
            }
        } else if (w7.a(context, str) != 0) {
            return false;
        }
        return true;
    }
}
