package com.xiaomi.fitness.watch.face.edit.photo.crop;

import android.graphics.Bitmap;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.edit.utils.DialFileUtils;
import com.xiaomi.fitness.watch.face.export.data.WatchFaceImage;
import defpackage.kq2;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ \u0010\u000b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ \u0010\f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\b\u001a\u00020\u0005¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/photo/crop/FaceEditPhotoCropViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "saveBackgroundImage", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "originPath", "bitmap", "Landroid/graphics/Bitmap;", "saveCropPortraitImageFile", "saveTempSnapshot", "getForegroundImage", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFaceImage;", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceEditPhotoCropViewModel extends AbsViewModel {

    @NotNull
    private static final String TAG = "FaceEditPhotoCropViewModel";

    @Nullable
    public final WatchFaceImage getForegroundImage(@NotNull String originPath) {
        Intrinsics.checkNotNullParameter(originPath, "originPath");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) originPath, new String[]{"origin.jpg"}, false, 0, 6, (Object) null);
        WatchFaceImage watchFaceImage = null;
        if (!listSplit$default.isEmpty()) {
            String str = ((String) listSplit$default.get(0)) + "portrait";
            File file = new File(str);
            if (file.exists()) {
                String fileMD5 = MD5Util.getFileMD5(file);
                if (fileMD5 == null) {
                    fileMD5 = "";
                }
                watchFaceImage = new WatchFaceImage(fileMD5, str + ".png", str, null, null, null, null, null, 248, null);
            }
        }
        return watchFaceImage;
    }

    @NotNull
    public final String saveBackgroundImage(@Nullable WearableDeviceModel deviceModel, @NotNull String originPath, @NotNull Bitmap bitmap) throws Throwable {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        Intrinsics.checkNotNullParameter(originPath, "originPath");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        String str = DialFileUtils.INSTANCE.getImageFolderPath(originPath) + "crop";
        Boolean boolC = kq2.c(bitmap, str + ".png");
        int productImageFormat = FaceManager.INSTANCE.getProductImageFormat(deviceModel);
        Logger.i(TAG, "saveBackgroundImage getProductImageFormat: " + productImageFormat);
        if (productImageFormat == 1) {
            zBooleanValue = boolC.booleanValue();
            Boolean boolF = kq2.f(bitmap, str);
            Intrinsics.checkNotNullExpressionValue(boolF, "saveBytes_565_3553(...)");
            zBooleanValue2 = boolF.booleanValue();
        } else if (productImageFormat == 2) {
            zBooleanValue = boolC.booleanValue();
            Boolean boolK = kq2.k(bitmap, str);
            Intrinsics.checkNotNullExpressionValue(boolK, "saveBytes_ARGB_BGRA(...)");
            zBooleanValue2 = boolK.booleanValue();
        } else if (productImageFormat == 7) {
            zBooleanValue = boolC.booleanValue();
            Boolean boolH = kq2.h(bitmap, str, true);
            Intrinsics.checkNotNullExpressionValue(boolH, "saveBytes_8888_ARGB565(...)");
            zBooleanValue2 = boolH.booleanValue();
        } else if (productImageFormat != 8) {
            zBooleanValue = boolC.booleanValue();
            Boolean boolD = kq2.d(bitmap, str);
            Intrinsics.checkNotNullExpressionValue(boolD, "saveBytes(...)");
            zBooleanValue2 = boolD.booleanValue();
        } else {
            zBooleanValue = boolC.booleanValue();
            Boolean boolH2 = kq2.h(bitmap, str, false);
            Intrinsics.checkNotNullExpressionValue(boolH2, "saveBytes_8888_ARGB565(...)");
            zBooleanValue2 = boolH2.booleanValue();
        }
        boolean z = zBooleanValue & zBooleanValue2;
        Logger.i(TAG, "save: " + str + " " + Boolean.valueOf(z));
        return z ? str : "";
    }

    @NotNull
    public final String saveCropPortraitImageFile(@Nullable WearableDeviceModel deviceModel, @NotNull String originPath, @NotNull Bitmap bitmap) throws Throwable {
        Intrinsics.checkNotNullParameter(originPath, "originPath");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) originPath, new String[]{"origin.jpg"}, false, 0, 6, (Object) null);
        if (!(!listSplit$default.isEmpty())) {
            return "";
        }
        String str = ((String) listSplit$default.get(0)) + "portrait";
        kq2.c(bitmap, str + ".png");
        int productImageFormat = FaceManager.INSTANCE.getProductImageFormat(deviceModel);
        Logger.i(TAG, "saveCropPortraitImageFile getProductImageFormat: " + productImageFormat);
        if (productImageFormat == 2) {
            kq2.k(bitmap, str);
            return str;
        }
        kq2.d(bitmap, str);
        return str;
    }

    @NotNull
    public final String saveTempSnapshot(@Nullable WearableDeviceModel deviceModel, @NotNull String originPath, @NotNull Bitmap bitmap) {
        String fileMD5;
        Intrinsics.checkNotNullParameter(originPath, "originPath");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        String str = DialFileUtils.INSTANCE.getImageFolderPath(originPath) + "snapshot";
        return ((FaceManager.INSTANCE.getProductImageFormat(deviceModel) == 2 ? kq2.k(bitmap, str) : kq2.d(bitmap, str)).booleanValue() && new File(str).exists() && (fileMD5 = MD5Util.getFileMD5(new File(str))) != null) ? fileMD5 : "";
    }
}
