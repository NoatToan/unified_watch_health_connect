package com.huawei.health.h5pro.jsbridge.system.media;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.health.h5pro.jsbridge.system.storage.StorageUtil;
import com.huawei.health.h5pro.utils.CommonUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.hms.kit.awareness.barrier.internal.d.c;
import com.huawei.operation.utils.Constants;
import defpackage.exk;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class CropPictureOperate extends exk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnCropPictureCallback f6815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H5ProInstance f6817c;

    public interface OnCropPictureCallback {
        void onFailure(int i, String str);

        void onSuccess(boolean z, String str);
    }

    public CropPictureOperate(Activity activity, H5ProInstance h5ProInstance) {
        super(activity);
        this.f6817c = h5ProInstance;
    }

    private void b(Intent intent, Uri uri, OnCropPictureCallback onCropPictureCallback) {
        PackageManager packageManager = this.e.getPackageManager();
        if (packageManager == null) {
            return;
        }
        this.f6815a = onCropPictureCallback;
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        LogUtil.i("H5PRO_MediaOperate", "resolveInfoList -> " + listQueryIntentActivities.size());
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            if (resolveInfo == null) {
                LogUtil.w("H5PRO_MediaOperate", "resolveInfo is null");
            } else {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo == null || TextUtils.isEmpty(activityInfo.packageName) || TextUtils.isEmpty(activityInfo.name)) {
                    LogUtil.w("H5PRO_MediaOperate", "activityInfo, activityInfo#packageName, or activityInfo#name is null");
                } else {
                    intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                    try {
                        if (intent.resolveActivity(packageManager) != null) {
                            this.e.grantUriPermission(activityInfo.packageName, uri, 3);
                            this.e.startActivityForResult(intent, 10004);
                            return;
                        }
                        LogUtil.w("H5PRO_MediaOperate", "cannot start the crop activity");
                    } catch (Exception e) {
                        LogUtil.e("H5PRO_MediaOperate", "startCropActivityForResult: exception -> ", e);
                    }
                }
            }
        }
        LogUtil.i("H5PRO_MediaOperate", "startCropActivityForResult: the image is not cropped");
        onCropPictureCallback.onSuccess(true, StorageUtil.getFilePathFromUri(this.e, intent.getData()));
        this.f6815a = null;
    }

    public void a(String str, Uri uri, OnCropPictureCallback onCropPictureCallback) {
        if (onCropPictureCallback == null) {
            LogUtil.w("H5PRO_MediaOperate", "cropPicture: onCropPictureCallback is null");
            return;
        }
        if (uri == null) {
            LogUtil.w("H5PRO_MediaOperate", "cropPicture: pictureUri is null");
            onCropPictureCallback.onFailure(-1, "pictureUri is null");
            return;
        }
        if (!"poster".equalsIgnoreCase(str) && !TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE.equalsIgnoreCase(str) && !"square".equalsIgnoreCase(str)) {
            LogUtil.w("H5PRO_MediaOperate", "cropPicture: unknown cropping type");
            onCropPictureCallback.onSuccess(true, StorageUtil.getFilePathFromUri(this.e, uri));
            return;
        }
        try {
            File fileE = e(CommonUtil.getAppId(this.f6817c), "crop");
            if (fileE != null && (fileE.exists() || StorageUtil.ensureDirExists(fileE))) {
                Locale locale = Locale.ENGLISH;
                File file = new File(fileE, System.currentTimeMillis() + ".jpg");
                this.f6816b = file.getCanonicalPath();
                d(str, uri, file, onCropPictureCallback);
                return;
            }
            onCropPictureCallback.onFailure(-1, "Failed to create the folder");
        } catch (IOException e) {
            this.f6816b = null;
            onCropPictureCallback.onFailure(-1, e.getMessage());
        }
    }

    @Override // defpackage.exk
    public void d(int i, int i2, Intent intent) {
        super.d(i, i2, intent);
        if (i != 10004) {
            return;
        }
        if (i2 == -1 && intent != null) {
            OnCropPictureCallback onCropPictureCallback = this.f6815a;
            if (onCropPictureCallback != null) {
                onCropPictureCallback.onSuccess(false, this.f6816b);
                return;
            } else {
                LogUtil.w("H5PRO_MediaOperate", "onActivityResult: callback is null");
                return;
            }
        }
        Locale locale = Locale.ENGLISH;
        LogUtil.w("H5PRO_MediaOperate", "onActivityResult: failed to crop the picture -> " + i2 + " - " + (intent == null));
        OnCropPictureCallback onCropPictureCallback2 = this.f6815a;
        if (onCropPictureCallback2 != null) {
            onCropPictureCallback2.onFailure(-1, "failed to crop the picture");
        }
    }

    private void d(String str, Uri uri, File file, OnCropPictureCallback onCropPictureCallback) {
        int i;
        Intent intent = new Intent("com.android.camera.action.CROP");
        int i2 = 1;
        intent.addFlags(1);
        intent.setDataAndType(uri, Constants.IMAGE_TYPE);
        intent.putExtra("crop", true);
        intent.putExtra("scaleUpIfNeeded", true);
        intent.putExtra("noFaceDetection", true);
        intent.putExtra("scale", true);
        int i3 = 1080;
        if ("poster".equalsIgnoreCase(str)) {
            i = 1080;
        } else {
            i = "square".equalsIgnoreCase(str) ? 400 : 1;
        }
        intent.putExtra("aspectX", i);
        if ("poster".equalsIgnoreCase(str)) {
            i2 = 607;
        } else if ("square".equalsIgnoreCase(str)) {
            i2 = c.f13983b;
        }
        intent.putExtra("aspectY", i2);
        intent.putExtra("outputX", (!"poster".equalsIgnoreCase(str) && "square".equalsIgnoreCase(str)) ? 400 : 1080);
        if ("poster".equalsIgnoreCase(str)) {
            i3 = 607;
        } else if ("square".equalsIgnoreCase(str)) {
            i3 = 400;
        }
        intent.putExtra("outputY", i3);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.PNG.toString());
        intent.putExtra("return-data", false);
        Uri uriFromFile = StorageUtil.getUriFromFile(this.e, file);
        intent.putExtra("output", uriFromFile);
        b(intent, uriFromFile, onCropPictureCallback);
    }
}
