package com.huawei.watchface;

import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.huawei.picture.security.base.broadcast.SafeBroadcastSender;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.mvp.model.crypt.PversionSdUtils;
import com.huawei.watchface.mvp.model.datatype.ShareModel;
import com.huawei.watchface.utils.ChoosePicUtil;
import com.huawei.watchface.utils.FileHelper;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.IntegerUtils;
import com.huawei.watchface.utils.permission.PermissionUtil;
import java.io.FileNotFoundException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes45.dex */
public class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ClipboardManager f30677a;

    public void a(d4 d4Var, ShareModel shareModel, c4.c cVar) throws Throwable {
        if (shareModel == null) {
            HwLog.i("SaveShare", "save shareModel is null");
            cVar.a("", 1, "OtherShare shareModel is null");
            return;
        }
        int iA = IntegerUtils.a(shareModel.getShareContentType());
        if (iA == 0) {
            b(d4Var, shareModel, cVar);
        } else if (iA == 1) {
            c(d4Var, shareModel, cVar);
        } else {
            cVar.a(shareModel.getShareType(), 1, "shareContentType is unknow");
            HwLog.i("SaveShare", "shareContentType is unknow");
        }
    }

    public final void b(d4 d4Var, ShareModel shareModel, c4.c cVar) throws Throwable {
        Uri uriA;
        if (d4Var != d4.SAVE_LOCAL) {
            HwLog.i("SaveShare", "saveImage error shareTypeEnum is not save local");
            cVar.a(shareModel.getShareType(), 1, "saveImage error shareTypeEnum is not save local");
            return;
        }
        Uri uri = Uri.EMPTY;
        Application applicationContext = Environment.getApplicationContext();
        if (applicationContext == null) {
            HwLog.i("SaveShare", "saveImage context is null");
            cVar.a(shareModel.getShareType(), 1, "saveImage context is null");
            return;
        }
        if (PermissionUtil.isAndroidQ()) {
            uriA = a(applicationContext, shareModel);
        } else {
            String strA = FileHelper.a(applicationContext, shareModel, FileHelper.c());
            FlavorConfig.safeHwLog("SaveShare", "saveImage filePath is :" + strA);
            uriA = !TextUtils.isEmpty(strA) ? Uri.fromFile(PversionSdUtils.getFile(strA)) : uri;
        }
        if (uriA == uri) {
            HwLog.i("SaveShare", "saveImage failed");
            cVar.a(shareModel.getShareType(), 1, "saveImage failed");
        } else {
            SafeBroadcastSender.e("android.intent.action.MEDIA_SCANNER_SCAN_FILE", applicationContext).d(uriA).b().d();
            cVar.a(shareModel.getShareType(), 0, "saveImage success");
            HwLog.i("SaveShare", "saveImage success");
        }
    }

    public final void c(d4 d4Var, final ShareModel shareModel, final c4.c cVar) {
        ClipboardManager clipboardManager;
        HwLog.i("SaveShare", "saveText enter");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ClipboardManager.OnPrimaryClipChangedListener onPrimaryClipChangedListener = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: com.huawei.watchface.y3$$ExternalSyntheticLambda0
            @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
            public final void onPrimaryClipChanged() {
                y3.a(countDownLatch, cVar, shareModel);
            }
        };
        try {
            try {
                if (d4Var != d4.SAVE_CLIPBOARD) {
                    cVar.a(shareModel.getShareType(), 1, "saveText is not SAVE_CLIPBOARD");
                    ClipboardManager clipboardManager2 = this.f30677a;
                    if (clipboardManager2 != null) {
                        clipboardManager2.removePrimaryClipChangedListener(onPrimaryClipChangedListener);
                        return;
                    }
                    return;
                }
                Application applicationContext = Environment.getApplicationContext();
                if (this.f30677a == null && applicationContext != null) {
                    this.f30677a = (ClipboardManager) applicationContext.getSystemService("clipboard");
                }
                ClipboardManager clipboardManager3 = this.f30677a;
                if (clipboardManager3 == null) {
                    cVar.a(shareModel.getShareType(), 1, "saveText mClipboardManager is null");
                    HwLog.i("SaveShare", "saveText mClipboardManager is null");
                    ClipboardManager clipboardManager4 = this.f30677a;
                    if (clipboardManager4 != null) {
                        clipboardManager4.removePrimaryClipChangedListener(onPrimaryClipChangedListener);
                        return;
                    }
                    return;
                }
                clipboardManager3.addPrimaryClipChangedListener(onPrimaryClipChangedListener);
                this.f30677a.setPrimaryClip(ClipData.newPlainText("Label", shareModel.getShareTextContent() + shareModel.getShareUrlContent()));
                if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                    HwLog.w("SaveShare", "saveText time out!");
                    cVar.a(shareModel.getShareType(), 1, "saveText error");
                }
                clipboardManager = this.f30677a;
                if (clipboardManager == null) {
                    return;
                }
                clipboardManager.removePrimaryClipChangedListener(onPrimaryClipChangedListener);
            } catch (Exception e) {
                HwLog.e("SaveShare", "saveText Exception:" + HwLog.printException(e));
                cVar.a(shareModel.getShareType(), 1, "saveText error");
                clipboardManager = this.f30677a;
                if (clipboardManager == null) {
                }
            }
        } catch (Throwable th) {
            ClipboardManager clipboardManager5 = this.f30677a;
            if (clipboardManager5 != null) {
                clipboardManager5.removePrimaryClipChangedListener(onPrimaryClipChangedListener);
            }
            throw th;
        }
    }

    public static /* synthetic */ void a(CountDownLatch countDownLatch, c4.c cVar, ShareModel shareModel) {
        countDownLatch.countDown();
        cVar.a(shareModel.getShareType(), 0, "saveText success");
        HwLog.i("SaveShare", "saveText success");
    }

    public static Uri a(Context context, ShareModel shareModel) throws Throwable {
        HwLog.i("SaveShare", "insertBitmapToGallery enter");
        Uri uri = Uri.EMPTY;
        String strC = FileHelper.c();
        String strA = FileHelper.a(shareModel.getShareImageStr(), strC, ChoosePicUtil.a(context), false);
        FlavorConfig.safeHwLog("SaveShare", "insertBitmapToGallery imagePath:" + strA);
        if (TextUtils.isEmpty(strA)) {
            HwLog.i("SaveShare", "insertBitmapToGallery imagePath or context is null");
            return uri;
        }
        try {
            String strInsertImage = MediaStore.Images.Media.insertImage(context.getContentResolver(), strA, strC, (String) null);
            FlavorConfig.safeHwLog("SaveShare", "insertBitmapToGallery insertImageString:" + strInsertImage);
            if (!TextUtils.isEmpty(strInsertImage)) {
                return Uri.parse(strInsertImage);
            }
        } catch (FileNotFoundException | IllegalArgumentException e) {
            HwLog.e("SaveShare", "insertBitmapToGallery:exception" + HwLog.printException(e));
        }
        return uri;
    }
}
