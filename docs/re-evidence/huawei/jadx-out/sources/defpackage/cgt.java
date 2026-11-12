package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.media.MediaBrowserProtocol;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EmuiBuild;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes23.dex */
public class cgt {
    public static void b(Context context, Bundle bundle, NotificationCompat.MessagingStyle.Message message) {
        String string = bundle.getString(MediaBrowserProtocol.DATA_PACKAGE_NAME);
        if (!TextUtils.equals(string, "com.whatsapp") && !TextUtils.equals(string, "org.telegram.messenger")) {
            ReleaseLogUtil.d("Notify_PictureHandle", "packageName is not in whatsapp and telegram.");
            return;
        }
        if (!SystemInfo.d() || !EmuiBuild.f36544b || !CommonUtil.cm()) {
            LogUtil.j("Notify_PictureHandle", "this phone is not HuaweiSeaOverlayPhone.");
            return;
        }
        boolean zB = SharedPreferenceManager.b("NOTIFY_PICTURE", "SUPPORT_NOTIFY_PICTURE_CAPABILITY", false);
        Boolean.valueOf(zB).getClass();
        if (!zB) {
            ReleaseLogUtil.d("Notify_PictureHandle", "Device not support notifyPictureCapability");
            return;
        }
        Uri dataUri = message.getDataUri();
        if (dataUri == null) {
            LogUtil.a("Notify_PictureHandle", "saveImageInfo uri is null");
            return;
        }
        if (message.getDataMimeType() == null || !message.getDataMimeType().startsWith("image/")) {
            LogUtil.a("Notify_PictureHandle", "saveImageInfo dataMimeType is not image");
            return;
        }
        try {
            LogUtil.a("Notify_PictureHandle", "saveImageInfo dataUri.toString=", dataUri.toString());
            context.grantUriPermission(string, dataUri, 1);
            d(context, MediaStore.Images.Media.getBitmap(context.getContentResolver(), dataUri), a(), bundle);
        } catch (IOException e) {
            LogUtil.e("Notify_PictureHandle", "saveImageInfo IOException: ", e.getMessage());
        } catch (SecurityException e2) {
            LogUtil.e("Notify_PictureHandle", "saveImageInfo SecurityException: ", e2.getMessage());
        }
    }

    private static String a() {
        int iC = SharedPreferenceManager.c("NOTIFY_PICTURE", "NOTIFY_PICTURE_NUMBER", 0);
        int iC2 = SharedPreferenceManager.c("NOTIFY_PICTURE", "NOTIFY_PICTURE_CURRENT_NUMBER", 0);
        int i = 30;
        if (iC != 0 && iC > 30) {
            i = iC;
        }
        int i2 = iC2 + 1;
        int i3 = i2 < i ? i2 : 0;
        LogUtil.a("Notify_PictureHandle", "setSenderIntoBundle picNum is: ", Integer.valueOf(iC), ",currNum is  ", Integer.valueOf(i3));
        SharedPreferenceManager.d("NOTIFY_PICTURE", "NOTIFY_PICTURE_CURRENT_NUMBER", i3);
        return "pic" + i3 + WatchFaceConstant.BIN_SUFFIX;
    }

    public static void d(Context context, Bitmap bitmap, String str, Bundle bundle) {
        Bitmap bitmapD = null;
        try {
            String str2 = context.getFilesDir().getCanonicalPath() + "/7/notifyPic/";
            File file = new File(str2);
            LogUtil.a("Notify_PictureHandle", "folderPath is:" + str2);
            if (!file.exists()) {
                LogUtil.a("Notify_PictureHandle", "saveBitmapToGallery mkdirs result is :" + file.mkdirs());
            }
            String str3 = str2 + str;
            LogUtil.a("Notify_PictureHandle", "saveBitmapToGallery imagePath=", str3);
            File file2 = new File(str3);
            if (file2.exists()) {
                file2.delete();
            }
            bitmapD = d(bitmap);
            LogUtil.a("Notify_PictureHandle", "scaledBitmap width is:", Integer.valueOf(bitmapD.getWidth()), "height is:", Integer.valueOf(bitmapD.getHeight()));
            cgq.e().c(bitmapD, str3);
            bundle.putString("imageName", str);
        } catch (IOException e) {
            LogUtil.e("Notify_PictureHandle", "saveBitmapToGallery IOException: ", ExceptionUtils.c(e));
        } finally {
            if (bitmap != null) {
                bitmap.recycle();
            }
            if (bitmapD != null) {
                bitmapD.recycle();
            }
            LogUtil.a("Notify_PictureHandle", "saveBitmapToGallery finish");
        }
    }

    public static Bitmap d(Bitmap bitmap) {
        int iC = SharedPreferenceManager.c("NOTIFY_PICTURE", "NOTIFY_PICTURE_WIDTH", 0);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z = width > height;
        if (iC <= 0) {
            LogUtil.e("Notify_PictureHandle", "getScaledBitmap picMaxWidthOrHeight not exists");
            return bitmap;
        }
        if (z && width > iC) {
            return Bitmap.createScaledBitmap(bitmap, iC, (int) (height * (iC / width)), true);
        }
        if (z || height <= iC) {
            return bitmap;
        }
        return Bitmap.createScaledBitmap(bitmap, (int) (width * (iC / height)), iC, true);
    }
}
