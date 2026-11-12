package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util;

import com.huawei.animationkit.computationalwallpaper.generator.OnWallpaperGenerateListener;
import com.huawei.animationkit.computationalwallpaper.generator.StaticWallpaper;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WearWatchFaceManager;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.h5pro.WearFilterPreview;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.networkclient.ResultCallback;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.secure.android.common.util.SafeString;
import defpackage.bdn;
import defpackage.bdo;
import defpackage.bez;
import defpackage.qqf;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes38.dex */
public class WearWatchFaceGenerator {
    private static final String TAG = "WearWatchFaceGenerator";
    private static final String TAG_RELEASE = "R_WearWatchFaceGenerator";

    public static void createWearWatchFace(String str, final ResultCallback<List<WearFilterPreview>> resultCallback) {
        final String watchFaceRootDir = WearWatchFaceManager.getInstance().getWatchFaceRootDir();
        try {
            createWearResourcesFile(WearWatchFaceManager.getInstance().getWatchFaceResourcePath() + WatchFaceConstant.RESOURCES_ASSETS + File.separator, WearWatchFaceManager.getInstance().getCustomResourcePath());
            bez.e().b(new OnWallpaperGenerateListener() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WearWatchFaceGenerator$$ExternalSyntheticLambda2
                @Override // com.huawei.animationkit.computationalwallpaper.generator.OnWallpaperGenerateListener
                public final void onWallpaperGenerate(List list, bdo bdoVar) {
                    WearWatchFaceGenerator.lambda$createWearWatchFace$0(resultCallback, watchFaceRootDir, list, bdoVar);
                }
            });
            bez.e().d(qqf.e(str));
        } catch (IOException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "createWearWatchFace exception:", ExceptionUtils.c(e));
            resultCallback.onFailure(new Throwable(e.getMessage()));
        }
    }

    static /* synthetic */ void lambda$createWearWatchFace$0(ResultCallback resultCallback, String str, List list, bdo bdoVar) {
        if (bdoVar != null) {
            ReleaseLogUtil.a(TAG_RELEASE, "createWearWatchFace exception:", ExceptionUtils.c(bdoVar));
            resultCallback.onFailure(new Throwable(bdoVar.getMessage()));
            return;
        }
        if (list == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "createWearWatchFace() list is null");
            resultCallback.onFailure(new Throwable("list is null"));
            return;
        }
        File file = WatchFaceUtil.getFile(str);
        if (file == null || !file.exists()) {
            ReleaseLogUtil.e(TAG_RELEASE, "createWearWatchFace() file does not exist.");
            resultCallback.onFailure(new Throwable("file does not exist"));
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < list.size(); i++) {
            try {
                try {
                    StaticWallpaper staticWallpaper = (StaticWallpaper) list.get(i);
                    WearFilterPreview wearFilterPreview = new WearFilterPreview();
                    String strSubstring = SafeString.substring(new BigInteger(SafeString.replace(UUID.randomUUID().toString(), Constants.LINK, ""), 16).toString(), 0, 10);
                    wearFilterPreview.setUniqueId(strSubstring);
                    staticWallpaper.save(file, strSubstring + "_");
                    wearFilterPreview.setPreviewName(file + File.separator + strSubstring + "_" + WatchFaceConstant.PREVIEW_RES + ".png");
                    wearFilterPreview.setOrderIndex(String.valueOf(i));
                    arrayList.add(wearFilterPreview);
                } catch (Exception e) {
                    ReleaseLogUtil.e(TAG_RELEASE, "createWearWatchFace exception:", ExceptionUtils.c(e));
                    resultCallback.onFailure(new Throwable(e.getMessage()));
                    resultCallback.onSuccess(arrayList);
                    return;
                }
            } catch (Throwable th) {
                resultCallback.onSuccess(arrayList);
                throw th;
            }
        }
        LogUtil.a(TAG, "createWearWatchPhoto() wearFilterPreviewList:", Integer.valueOf(arrayList.size()));
        resultCallback.onSuccess(arrayList);
    }

    private static void createWearResourcesFile(String str, String str2) throws IOException {
        boolean z;
        String str3;
        File file = WatchFaceUtil.getFile(str2);
        if (file == null || !file.exists()) {
            file = WatchFaceUtil.getFile(str);
            z = false;
        } else {
            z = true;
        }
        LogUtil.a(TAG, "createWearResourcesFile isCustom:", Boolean.valueOf(z));
        if (file == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "createWearResourcesFile file null");
            return;
        }
        if (z) {
            if (file.isDirectory()) {
                if (CollectionUtils.d(file.list(new FilenameFilter() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WearWatchFaceGenerator$$ExternalSyntheticLambda0
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file2, String str4) {
                        return WatchFaceConstant.TEMPLATES_CIRCLE_NAME.equals(str4);
                    }
                }))) {
                    try {
                        LogUtil.a(TAG, "need copy default");
                        WatchFaceUtil.copyResources(str, file);
                    } catch (IOException e) {
                        ReleaseLogUtil.a(TAG_RELEASE, "createWearResourcesFile copy IOException :", ExceptionUtils.c(e));
                    }
                } else {
                    LogUtil.a(TAG, "no need copy default");
                }
            }
        } else {
            ReleaseLogUtil.d(TAG_RELEASE, "createWearResourcesFile() default file exists：", Boolean.valueOf(file.exists()), ", isDirectory:", Boolean.valueOf(file.isDirectory()));
            if (file.exists() && file.isDirectory()) {
                ReleaseLogUtil.d(TAG_RELEASE, "createWearResourcesFile resourceFileName :", Boolean.valueOf(CollectionUtils.d(file.list(new FilenameFilter() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WearWatchFaceGenerator$$ExternalSyntheticLambda1
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file2, String str4) {
                        return WatchFaceConstant.TEMPLATES_CIRCLE_NAME.equals(str4);
                    }
                }))));
            }
        }
        bdn.e(file.getCanonicalPath());
        bdn.d(file.getCanonicalPath());
        boolean zIsUseCustomTemplate = WearWatchFaceManager.getInstance().isUseCustomTemplate();
        LogUtil.a(TAG, "createWearResourcesFile isUseCustomTemplate :", Boolean.valueOf(zIsUseCustomTemplate));
        if (zIsUseCustomTemplate) {
            str3 = WatchFaceConstant.TEMPLATES_CUSTOM_NAME;
        } else {
            str3 = WatchFaceConstant.TEMPLATES_CIRCLE_NAME;
        }
        bdn.c(str3);
    }
}
