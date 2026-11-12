package com.huawei.healthcloud.plugintrack.trackanimation.trackalbum.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Environment;
import androidx.core.content.FileProvider;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import defpackage.lrp;
import health.compact.a.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class CameraUtil {
    private Context e;

    public CameraUtil(Context context) {
        this.e = context;
    }

    public File e() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.setFlags(1);
        intent.setFlags(2);
        intent.putExtra("camerasensortype", 2);
        intent.putExtra("autofocus", true);
        intent.putExtra("fullScreen", true);
        intent.putExtra("showActionIcons", false);
        intent.putExtra("return-data", false);
        PackageManager packageManager = this.e.getPackageManager();
        if (packageManager == null) {
            LogUtil.j("CameraUtils", "takePhoto packageManager is null");
            return null;
        }
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity == null) {
            LogUtil.j("CameraUtils", "takePhoto resolveInfo is null");
            return null;
        }
        ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
        if (activityInfo == null) {
            LogUtil.j("CameraUtils", "takePhoto activityInfo is null");
            return null;
        }
        intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
        File fileC = c();
        if (fileC != null) {
            Uri uriForFile = FileProvider.getUriForFile(this.e, lrp.f40730c, fileC);
            intent.putExtra("output", uriForFile);
            LogUtil.a("CameraUtils", "imageUri：", uriForFile);
        }
        try {
            Context context = this.e;
            if (context instanceof Activity) {
                ((Activity) context).startActivityForResult(intent, 4);
                return fileC;
            }
        } catch (ActivityNotFoundException | SecurityException e) {
            ReleaseLogUtil.d("CameraUtils", "takePhoto exception ", ExceptionUtils.c(e));
            OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("CameraUtils", DfxUtils.d(Thread.currentThread(), e));
        }
        return fileC;
    }

    private File c() {
        String str = "Camera_IMG_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.ENGLISH).format(new Date()) + "_";
        Context context = this.e;
        try {
            return File.createTempFile(str, ".jpg", context != null ? context.getExternalFilesDir(Environment.DIRECTORY_PICTURES) : null);
        } catch (IOException e) {
            LogUtil.e("CameraUtils", e.getMessage());
            return null;
        }
    }
}
