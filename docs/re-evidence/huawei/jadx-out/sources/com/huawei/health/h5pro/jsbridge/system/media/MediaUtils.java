package com.huawei.health.h5pro.jsbridge.system.media;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.health.h5pro.core.a;
import com.huawei.health.h5pro.utils.CommonUtil;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class MediaUtils {
    private MediaUtils() {
    }

    private static PackageInfo a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64);
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("H5PRO_MediaUtils", "get package info NameNotFoundException");
            return null;
        }
    }

    private static String e(String str, String str2) {
        Bitmap bitmapDecodeFileToBitmap = BitmapUtils.decodeFileToBitmap(new File(str));
        if (bitmapDecodeFileToBitmap == null) {
            LogUtil.w("H5PRO_MediaUtils", a.a("[RELEASE]imageToBase64: bitmap is null -> ", str));
            return "";
        }
        long length = (new File(str).length() / 3) * 4;
        LogUtil.i("H5PRO_MediaUtils", "imageToBase64: upperLimitSize -> " + length);
        Bitmap.CompressFormat compressFormat = BitmapUtils.isPngImage(str) ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 100;
        do {
            byteArrayOutputStream.reset();
            bitmapDecodeFileToBitmap.compress(compressFormat, i, byteArrayOutputStream);
            i -= 10;
            if (byteArrayOutputStream.size() <= length) {
                break;
            }
        } while (i >= 80);
        if (!bitmapDecodeFileToBitmap.isRecycled()) {
            bitmapDecodeFileToBitmap.recycle();
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        LogUtil.i("H5PRO_MediaUtils", "imageToBase64: quality -> " + i + ", resultImageFileSize -> " + byteArray.length);
        String strEncodeToString = Base64.encodeToString(byteArray, 16);
        CommonUtil.closeStream(byteArrayOutputStream);
        Locale locale = Locale.ENGLISH;
        return "data:" + str2 + ";base64," + strEncodeToString;
    }

    public static String fileToBase64(String str) {
        return fileToBase64(str, false);
    }

    public static void startDefaultActivityForResult(Activity activity, Intent intent, String str, int i) {
        ResolveInfo resolveInfoResolveActivity;
        try {
            LogUtil.i("H5PRO_MediaUtils", "startDefaultActivityForResult");
            PackageManager packageManager = activity.getPackageManager();
            if (packageManager != null && (((resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536)) == null || "com.huawei.android.internal.app".equalsIgnoreCase(resolveInfoResolveActivity.activityInfo.packageName)) && a(activity, str) != null)) {
                intent.setPackage(str);
                activity.startActivityForResult(intent, i);
                return;
            }
        } catch (Throwable unused) {
            LogUtil.e("H5PRO_MediaUtils", "startDefaultActivityForResult error");
        }
        try {
            activity.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException unused2) {
            LogUtil.e("H5PRO_MediaUtils", "startDefaultActivityForResult error");
        }
    }

    public static String fileToBase64(String str, boolean z) {
        byte[] allBytes;
        if (TextUtils.isEmpty(str)) {
            LogUtil.w("H5PRO_MediaUtils", "[RELEASE]fileToBase64: filePath is empty");
            return "";
        }
        String mimeType = GeneralUtil.getMimeType(str);
        if (z && mimeType.toUpperCase(Locale.ROOT).startsWith("IMAGE")) {
            return e(str, mimeType);
        }
        try {
            allBytes = Files.readAllBytes(Paths.get(str, new String[0]));
        } catch (IOException e) {
            LogUtil.e("H5PRO_MediaUtils", "fileToBase64: ioException(>=O) -> " + e.getMessage());
            allBytes = null;
        }
        if (allBytes == null) {
            return "";
        }
        String strEncodeToString = Base64.encodeToString(allBytes, 16);
        if (TextUtils.isEmpty(strEncodeToString)) {
            return "";
        }
        Locale locale = Locale.ENGLISH;
        return "data:" + mimeType + ";base64," + strEncodeToString;
    }
}
