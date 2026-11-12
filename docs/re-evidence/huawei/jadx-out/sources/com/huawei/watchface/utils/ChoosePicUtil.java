package com.huawei.watchface.utils;

import android.app.Activity;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.huawei.operation.utils.Constants;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.api.WebViewActivity;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.l2;
import com.huawei.watchface.mvp.base.BaseActivity;
import com.huawei.watchface.mvp.model.latona.LatonaWatchFaceProvider;
import com.huawei.watchface.mvp.ui.activity.ClipImageActivity;
import com.huawei.watchface.mvp.ui.activity.ScanImageActivity;
import com.huawei.watchface.r2;
import com.huawei.watchface.utils.permission.PermissionUtil;
import defpackage.orf;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes20.dex */
public class ChoosePicUtil {
    public static final String APP_PATH_SD_CARD = "/watchface/.";
    public static final String APP_PATH_SD_CARD_ROOT = "/huawei/";
    public static final int CHOOSE_PHOTO_REQUEST_CODE = 0;
    public static final int GO_CAMERA_REQUEST_CODE = 1;
    public static final int GO_VIDEO_EDIT_REQUEST_CODE = 2;
    public static Uri sImageUri;
    public static File sOutputImageFile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f30593a;
    public File mClippedFile = null;

    public ChoosePicUtil(Context context) {
        this.f30593a = context;
    }

    public static void a() {
        HwLog.i("ChoosePicUtil", "deleteImageFile enter");
        File file = sOutputImageFile;
        if (file == null) {
            HwLog.e("ChoosePicUtil", "sOutputImageFile is null");
        } else {
            FileHelper.a(file.getParentFile());
        }
    }

    public static void b(Activity activity, int i) {
        if (activity == null) {
            HwLog.i("ChoosePicUtil", "goCamera() currentActivity is null");
            return;
        }
        HwLog.i("ChoosePicUtil", "goCamera() enter. chooseToClipResourceStyle: " + i);
        try {
            sOutputImageFile = a(activity);
        } catch (IOException unused) {
            HwLog.e("ChoosePicUtil", "goCamera() IOException occured.");
        }
        if (sOutputImageFile == null) {
            HwLog.i("ChoosePicUtil", "goCamera() mOutputImageFile == null");
        }
        try {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.addFlags(3);
            Uri uriForFile = FileProvider.getUriForFile(activity, CommonUtils.getAuthority(), sOutputImageFile);
            sImageUri = uriForFile;
            intent.putExtra("output", uriForFile);
            PackageManager packageManager = activity.getPackageManager();
            if (packageManager != null) {
                ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 1048576);
                if (resolveInfoResolveActivity != null && resolveInfoResolveActivity.activityInfo != null) {
                    HwLog.i("ChoosePicUtil", "componentName packageName:" + resolveInfoResolveActivity.activityInfo.packageName);
                    intent.setPackage(resolveInfoResolveActivity.activityInfo.packageName);
                    orf.d(activity, intent, 1);
                    HwLog.i("ChoosePicUtil", "goCamera() enter. startActivityForResult ");
                }
                HwLog.w("ChoosePicUtil", "goCamera() resolveInfo or resolveInfo.activityInfo is null");
                return;
            }
            HwLog.i("ChoosePicUtil", "packageManager == null");
            b(activity);
        } catch (IllegalArgumentException e) {
            HwLog.e("ChoosePicUtil", "goCamera() IllegalArgumentException " + HwLog.printException((Exception) e));
        } catch (Exception e2) {
            HwLog.e("ChoosePicUtil", "goCamera() Exception " + HwLog.printException(e2));
        }
    }

    public boolean c(Uri uri) {
        return "com.android.externalstorage.documents".equals(CommonUtils.getAuthorityByUri(uri));
    }

    public void clipPhotoBySelf(Activity activity, String str, Uri uri, boolean z, boolean z2) {
        if (activity == null) {
            HwLog.e("ChoosePicUtil", "clipPhotoBySelf() activity is null.");
            return;
        }
        HwLog.i("ChoosePicUtil", "clipPhotoBySelf() enter.");
        initWatchFaceBgSavedFile();
        Intent intent = new Intent(activity, (Class<?>) ClipImageActivity.class);
        intent.putExtra("sourceImagePath", str);
        File file = this.mClippedFile;
        if (file != null && file.exists()) {
            intent.putExtra(ClipImageActivity.CLIP_RESULT_PATH, this.mClippedFile.getPath());
        }
        if (uri != null) {
            intent.putExtra("sourceImageUri", uri.toString());
        } else {
            if (l2.c(this.f30593a, sImageUri.toString(), sImageUri)) {
                HwLog.i("ChoosePicUtil", "clipPhotoBySelf imageUriIsEmpty true");
                return;
            }
            intent.putExtra("sourceImageUri", sImageUri.toString());
        }
        int watchFaceWidth = LatonaWatchFaceProvider.getInstance(this.f30593a).getWatchFaceWidth();
        int watchFaceHeight = LatonaWatchFaceProvider.getInstance(this.f30593a).getWatchFaceHeight();
        if (watchFaceWidth > 0 && watchFaceHeight > 0) {
            if (watchFaceWidth == watchFaceHeight || !z2) {
                intent.putExtra(ClipImageActivity.CLIP_TARGET_WIDTH, watchFaceWidth);
                intent.putExtra(ClipImageActivity.CLIP_TARGET_HEIGHT, watchFaceHeight);
            } else {
                intent.putExtra(ClipImageActivity.CLIP_TARGET_WIDTH, Math.min(watchFaceWidth, watchFaceHeight));
                intent.putExtra(ClipImageActivity.CLIP_TARGET_HEIGHT, Math.min(watchFaceWidth, watchFaceHeight));
            }
        }
        intent.putExtra(ClipImageActivity.CLIP_TARGET_SHAPE, z);
        orf.d(activity, intent, 3);
    }

    public boolean d(Uri uri) {
        return "com.android.providers.media.documents".equals(CommonUtils.getAuthorityByUri(uri));
    }

    public final String[] e(Uri uri) {
        String documentId = DocumentsContract.getDocumentId(uri);
        if (!TextUtils.isEmpty(documentId)) {
            String str = File.pathSeparator;
            if (documentId.contains(str)) {
                return documentId.split(str);
            }
        }
        HwLog.i("ChoosePicUtil", "splitDocumentId() documentId is empty.");
        return new String[0];
    }

    public String getFileSavedPath() {
        try {
            File file = sOutputImageFile;
            if (file == null) {
                return null;
            }
            return file.getCanonicalPath();
        } catch (IOException unused) {
            HwLog.e("ChoosePicUtil", "Get output Image path error");
            return null;
        }
    }

    public Uri getFileSavedUri() {
        return sImageUri;
    }

    public void initWatchFaceBgSavedFile() {
        String latonaBackgroundSavedPath = LatonaWatchFaceProvider.getInstance(this.f30593a).getLatonaBackgroundSavedPath();
        if (TextUtils.isEmpty(latonaBackgroundSavedPath)) {
            HwLog.i("ChoosePicUtil", "clippedFile is not exist");
        } else {
            this.mClippedFile = new File(latonaBackgroundSavedPath);
        }
    }

    public void scanPhotoBySelf(Activity activity, String str, Uri uri, boolean z, boolean z2) {
        if (activity == null) {
            HwLog.e("ChoosePicUtil", "clipPhotoBySelf() activity is null.");
            return;
        }
        HwLog.i("ChoosePicUtil", "clipPhotoBySelf() enter.");
        Intent intent = new Intent(activity, (Class<?>) ScanImageActivity.class);
        intent.putExtra("sourceImagePath", str);
        if (uri != null) {
            intent.putExtra("sourceImageUri", uri.toString());
        } else {
            if (l2.c(this.f30593a, sImageUri.toString(), sImageUri)) {
                HwLog.i("ChoosePicUtil", "scanPhotoBySelf imageUriIsEmpty true");
                return;
            }
            intent.putExtra("sourceImageUri", sImageUri.toString());
        }
        orf.a(activity, intent);
    }

    public String getPicPathByUri(Context context, Uri uri) {
        String strReplaceAll;
        if (context == null) {
            return "";
        }
        if (DocumentsContract.isDocumentUri(context, uri)) {
            HwLog.i("ChoosePicUtil", "getPicPathByUri() isDocumentUri.");
            if (c(uri)) {
                HwLog.i("ChoosePicUtil", "getPicPathByUri() isExternalStorageFile.");
                return a(uri);
            }
            if (b(uri)) {
                FlavorConfig.safeHwLog("ChoosePicUtil", "getPicPathByUri picUri:" + uri);
                String documentId = DocumentsContract.getDocumentId(uri);
                if (documentId != null) {
                    if (documentId.startsWith("raw:")) {
                        documentId = documentId.replaceFirst("raw:", "");
                    }
                    HwLog.i("ChoosePicUtil", "getPicPathByUri initdocumentId ==" + documentId);
                    strReplaceAll = documentId.replaceAll("[^\\d.]", "");
                } else {
                    strReplaceAll = "";
                }
                HwLog.i("ChoosePicUtil", "getPicPathByUri() documentId: " + strReplaceAll);
                if (!TextUtils.isEmpty(strReplaceAll)) {
                    long jA = r2.a(strReplaceAll, 0L);
                    HwLog.i("ChoosePicUtil", "getPicPathByUri documentIdLong =" + jA);
                    return jA == 0 ? documentId : a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), jA), (String) null, (String[]) null);
                }
            } else {
                if (!d(uri)) {
                    return "";
                }
                HwLog.i("ChoosePicUtil", "getPicPathByUri() isMediaFile.");
                return a(context, uri);
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                HwLog.i("ChoosePicUtil", "getPicPathByUri() URI_SCHEME_CONTENT.");
                return a(context, uri, (String) null, (String[]) null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                HwLog.i("ChoosePicUtil", "getPicPathByUri() URI_SCHEME_FILE.");
                return uri.getPath();
            }
        }
        return "";
    }

    public static File a(Activity activity) {
        File externalStoragePublicDirectory;
        String str = "JPEG_" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + "_";
        if (PermissionUtil.isAndroidQ()) {
            externalStoragePublicDirectory = activity.getExternalFilesDir(APP_PATH_SD_CARD + Environment.DIRECTORY_PICTURES);
        } else {
            externalStoragePublicDirectory = null;
        }
        if (externalStoragePublicDirectory == null) {
            externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory("/huawei/" + activity.getPackageName() + APP_PATH_SD_CARD + Environment.DIRECTORY_PICTURES);
        }
        if (!externalStoragePublicDirectory.exists() && !externalStoragePublicDirectory.mkdirs()) {
            HwLog.d("ChoosePicUtil", "storageDir.mkdirs failure");
        }
        return File.createTempFile(str, ".jpg", externalStoragePublicDirectory);
    }

    public static String a(Context context) {
        if (context == null) {
            return null;
        }
        File externalFilesDir = PermissionUtil.isAndroidQ() ? context.getExternalFilesDir(null) : null;
        if (externalFilesDir == null) {
            externalFilesDir = Environment.getExternalStorageDirectory();
        }
        if (!externalFilesDir.exists() && !externalFilesDir.mkdirs()) {
            HwLog.d("ChoosePicUtil", "storageDir.mkdirs failure");
        }
        try {
            return externalFilesDir.getCanonicalPath() + File.separator + "watchface/";
        } catch (IOException e) {
            HwLog.e("ChoosePicUtil", "getRootFilePath IOException" + HwLog.printException((Exception) e));
            return null;
        }
    }

    public static void a(Activity activity, int i) {
        if (activity == null) {
            HwLog.e("ChoosePicUtil", "choosePhotoOrVideo() activity is null.");
            return;
        }
        HwLog.i("ChoosePicUtil", "choosePhotoOrVideo() choosePicUtil choose pic to clip, chooseToClipResourceStyle: " + i);
        HwLog.i("ChoosePicUtil", "choosePhotoOrVideo() to image select");
        Intent intent = new Intent("android.intent.action.PICK", (Uri) null);
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Constants.IMAGE_TYPE);
        if (!BaseActivity.isFlyme() && i != 4) {
            intent = Intent.createChooser(intent, "");
        }
        CommonUtils.startActivityForResult(activity, intent, 0);
        b(activity);
    }

    public static void b(Activity activity) {
        if (activity == null || !(activity instanceof WebViewActivity)) {
            return;
        }
        ((WebViewActivity) activity).notifyH5ClickSelectPhoto();
    }

    public void b(Activity activity, String str, Uri uri, boolean z) {
        scanPhotoBySelf(activity, str, uri, z, false);
    }

    public boolean b(Uri uri) {
        return "com.android.providers.downloads.documents".equals(CommonUtils.getAuthorityByUri(uri));
    }

    public void a(Activity activity, String str, Uri uri, boolean z) {
        clipPhotoBySelf(activity, str, uri, z, false);
    }

    public String a(Context context, Uri uri) {
        String[] strArrE = e(uri);
        if (strArrE.length < 2) {
            HwLog.i("ChoosePicUtil", "getPicPathByUri() docIds is null or not enough length");
            return "";
        }
        Uri uriA = a(strArrE[0]);
        return uriA == null ? "" : a(context, uriA, "_id=?", new String[]{strArrE[1]});
    }

    public String a(Uri uri) {
        String[] strArrE = e(uri);
        if (strArrE.length < 2) {
            HwLog.e("ChoosePicUtil", "getExternalStorageFilePath() docIds is null or not enough length");
            return "";
        }
        if ("primary".equalsIgnoreCase(strArrE[0])) {
            return CommonUtils.c(this.f30593a) + File.separator + strArrE[1];
        }
        HwLog.e("ChoosePicUtil", "getExternalStorageFilePath() return empty.");
        return "";
    }

    public final Uri a(String str) {
        if ("image".equals(str)) {
            return MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        }
        if ("video".equals(str)) {
            return MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        if ("audio".equals(str)) {
            return MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005c A[PHI: r9
      0x005c: PHI (r9v4 android.database.Cursor) = (r9v1 android.database.Cursor), (r9v2 android.database.Cursor), (r9v5 android.database.Cursor) binds: [B:26:0x005a, B:19:0x003a, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    public String a(Context context, Uri uri, String str, String[] strArr) {
        String[] strArr2 = {"_data"};
        if (uri == null) {
            return "";
        }
        Cursor cursorQuery = null;
        try {
            try {
                try {
                    cursorQuery = context.getContentResolver().query(uri, strArr2, str, strArr, null);
                    if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return "";
                    }
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                    cursorQuery.close();
                    return string;
                } catch (SecurityException unused) {
                    HwLog.e("ChoosePicUtil", "getDataColumnByUri() SecurityException.");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            } catch (IllegalArgumentException unused2) {
                HwLog.e("ChoosePicUtil", "getDataColumnByUri() IllegalArgumentException.");
                if (!TextUtils.isEmpty(uri.getPath())) {
                    String strReplace = SafeString.replace(uri.getPath(), "/root", "");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return strReplace;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }
}
