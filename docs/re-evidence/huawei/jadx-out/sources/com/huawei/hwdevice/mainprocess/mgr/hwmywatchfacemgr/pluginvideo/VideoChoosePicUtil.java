package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Environment;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.content.FileProvider;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.VideoWatchFaceManager;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.ui.VideoSelectActivity;
import com.huawei.watchface.utils.ChoosePicUtil;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.permission.PermissionUtil;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import health.compact.a.LogUtil;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class VideoChoosePicUtil extends ChoosePicUtil {
    public static final String TAG = "VideoChoosePicUtil";

    public VideoChoosePicUtil(Context context) {
        super(context);
    }

    public static void goCamera(Activity activity, ActivityResultLauncher<Intent> activityResultLauncher) {
        if (activity == null) {
            LogUtil.b(TAG, "goCamera() currentActivity is null");
            return;
        }
        try {
            sOutputImageFile = createVideoFile(activity);
        } catch (IOException unused) {
            LogUtil.d(TAG, "goCamera() IOException occured.");
        }
        if (sOutputImageFile == null) {
            LogUtil.b(TAG, "goCamera() mOutputImageFile == null");
            return;
        }
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        intent.putExtra("android.intent.extra.videoQuality", 1);
        intent.putExtra("android.intent.extra.durationLimit", 30);
        intent.addFlags(3);
        try {
            sImageUri = FileProvider.getUriForFile(activity, CommonUtils.getAuthority(), sOutputImageFile);
            intent.putExtra("output", sImageUri);
            PackageManager packageManager = activity.getPackageManager();
            if (packageManager == null) {
                LogUtil.b(TAG, "packageManager == null");
                return;
            }
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 1048576);
            if (resolveInfoResolveActivity == null || resolveInfoResolveActivity.activityInfo == null) {
                LogUtil.e(TAG, "goCamera() resolveInfo or resolveInfo.activityInfo is null");
                return;
            }
            intent.setComponent(new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name));
            if (activityResultLauncher == null) {
                LogUtil.e(TAG, "goCamera() resolveInfo or resolveInfo.activityInfo is null");
            } else {
                activityResultLauncher.launch(intent);
            }
        } catch (IllegalArgumentException e) {
            LogUtil.d(TAG, "uri error:", ExceptionUtils.c(e));
        }
    }

    public static File createVideoFile(Activity activity) throws IOException {
        LogUtil.b(TAG, "createVideoFile");
        String str = "VIDEO_" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + "_";
        File externalFilesDir = PermissionUtil.isAndroidQ() ? activity.getExternalFilesDir(VideoWatchFaceManager.getInstance().getClipVideoSavePath()) : null;
        if (externalFilesDir == null) {
            externalFilesDir = Environment.getExternalStoragePublicDirectory(VideoWatchFaceManager.getInstance().getClipVideoSavePath());
        }
        if (!externalFilesDir.exists() && !externalFilesDir.mkdirs()) {
            LogUtil.c(TAG, "createVideoFile -- storageDir.mkdirs failure");
        }
        return File.createTempFile(str, ".mp4", externalFilesDir);
    }

    public static String getVideoEditSavePath() {
        LogUtil.b(TAG, "getVideoEditSavePath");
        return VideoWatchFaceManager.getInstance().getClipVideoSavePath() + (new SimpleDateFormat(HwDrmConstant.TIME_FORMAT, Locale.ENGLISH).format(new Date()) + ".mp4");
    }

    public static void choosePhotoOrVideo(Activity activity) {
        if (activity == null) {
            LogUtil.d(TAG, "choosePhotoOrVideo() activity is null.");
        } else {
            LogUtil.b(TAG, "choosePhotoOrVideo() to VideoSelectActivity");
            CommonUtils.startActivityForResult(activity, new Intent(activity, (Class<?>) VideoSelectActivity.class), 0);
        }
    }
}
