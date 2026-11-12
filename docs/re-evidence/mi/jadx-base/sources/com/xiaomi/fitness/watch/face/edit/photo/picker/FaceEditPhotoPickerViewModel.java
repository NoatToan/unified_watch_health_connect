package com.xiaomi.fitness.watch.face.edit.photo.picker;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaFormat;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.edit.utils.DialFileUtils;
import com.xiaomi.fitness.watch.face.export.data.FaceEditPhotoBean;
import com.xiaomi.fitness.watch.face.export.data.WatchFaceImage;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.a1p;
import defpackage.gh8;
import defpackage.kq2;
import defpackage.nyp;
import java.io.File;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b'\u0010(J)\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/photo/picker/FaceEditPhotoPickerViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/watch/face/edit/photo/picker/FaceEditPhotoPickerModel;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/device/manager/bean/Product$Size;", MediaStoreUtil.MediaInfo.SIZE, "", "originPath", "Landroid/graphics/Bitmap;", "drawBitmap", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/fitness/device/manager/bean/Product$Size;Ljava/lang/String;)Landroid/graphics/Bitmap;", "bitmap", "path", "", "savePhotos", "(Landroid/graphics/Bitmap;Ljava/lang/String;)V", "Landroid/media/MediaFormat;", "mediaFormat", "key", "", "getInt", "(Landroid/media/MediaFormat;Ljava/lang/String;)I", "defaultValue", "(Landroid/media/MediaFormat;Ljava/lang/String;I)I", "", "getLong", "(Landroid/media/MediaFormat;Ljava/lang/String;)J", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;", "bean", "cropDefaultPhotos", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;)V", "Lnyp;", "transformationState", "cropDefaultVideos", "(Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;Lnyp;)V", "getTAG", "()Ljava/lang/String;", "TAG", "<init>", "()V", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceEditPhotoPickerViewModel extends BaseViewModel<FaceEditPhotoPickerModel> {
    private final Bitmap drawBitmap(WearableDeviceModel deviceModel, Product.Size size, String originPath) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(originPath, options);
        options.inSampleSize = DialFileUtils.INSTANCE.getFitInSampleSize(options);
        options.inMutable = true;
        options.inJustDecodeBounds = false;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(originPath, options);
        float fCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(size.getWidth() / bitmapDecodeFile.getWidth(), size.getHeight() / bitmapDecodeFile.getHeight());
        Matrix matrix = new Matrix();
        matrix.postScale(fCoerceAtLeast, fCoerceAtLeast);
        try {
            int iH = new gh8(originPath).h("Orientation", 1);
            if (iH == 3) {
                matrix.postRotate(180.0f);
            } else if (iH == 6) {
                matrix.postRotate(90.0f);
            } else if (iH == 8) {
                matrix.postRotate(270.0f);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, false);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        int productImageFormat = FaceManager.INSTANCE.getProductImageFormat(deviceModel);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(size.getWidth(), size.getHeight(), productImageFormat == 2 || productImageFormat == 3 || productImageFormat == 7 || productImageFormat == 8 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap2, "createBitmap(...)");
        int width = (bitmapCreateBitmap.getWidth() - size.getWidth()) / 2;
        int height = (bitmapCreateBitmap.getHeight() - size.getHeight()) / 2;
        Logger.d(getTAG(), "sideMargin: " + width + " marginTop: " + height);
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, (float) bitmapCreateBitmap2.getWidth(), (float) bitmapCreateBitmap2.getHeight());
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Path path = new Path();
        path.addRoundRect(rectF, size.getRadius(), size.getRadius(), Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawBitmap(bitmapCreateBitmap, new Rect(width, height, size.getWidth() + width, size.getHeight() + height), rectF, paint);
        return bitmapCreateBitmap2;
    }

    private final int getInt(MediaFormat mediaFormat, String key) {
        return getInt(mediaFormat, key, -1);
    }

    private final long getLong(MediaFormat mediaFormat, String key) {
        if (mediaFormat.containsKey(key)) {
            return mediaFormat.getLong(key);
        }
        return -1L;
    }

    private final void savePhotos(Bitmap bitmap, String path) {
    }

    public final void cropDefaultPhotos(@Nullable WearableDeviceModel deviceModel, @NotNull FaceEditPhotoBean bean) throws Throwable {
        Product.Size size;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        Intrinsics.checkNotNullParameter(bean, "bean");
        String originImagePath = bean.getBackgroundImage().getOriginImagePath();
        Logger.i(getTAG(), "origin path: " + originImagePath);
        if (deviceModel == null || (size = DeviceModelExtKt.getSize(deviceModel)) == null || originImagePath == null || originImagePath.length() == 0) {
            return;
        }
        try {
            Bitmap bitmapDrawBitmap = drawBitmap(deviceModel, size, originImagePath);
            String str = DialFileUtils.INSTANCE.getImageFolderPath(originImagePath) + "crop";
            Boolean boolC = kq2.c(bitmapDrawBitmap, str + ".png");
            int productImageFormat = FaceManager.INSTANCE.getProductImageFormat(deviceModel);
            Logger.i(getTAG(), "getProductImageFormat: " + productImageFormat);
            if (productImageFormat == 1) {
                zBooleanValue = boolC.booleanValue();
                Boolean boolF = kq2.f(bitmapDrawBitmap, str);
                Intrinsics.checkNotNullExpressionValue(boolF, "saveBytes_565_3553(...)");
                zBooleanValue2 = boolF.booleanValue();
            } else if (productImageFormat == 2) {
                zBooleanValue = boolC.booleanValue();
                Boolean boolK = kq2.k(bitmapDrawBitmap, str);
                Intrinsics.checkNotNullExpressionValue(boolK, "saveBytes_ARGB_BGRA(...)");
                zBooleanValue2 = boolK.booleanValue();
            } else if (productImageFormat == 7) {
                zBooleanValue = boolC.booleanValue();
                Boolean boolH = kq2.h(bitmapDrawBitmap, str, true);
                Intrinsics.checkNotNullExpressionValue(boolH, "saveBytes_8888_ARGB565(...)");
                zBooleanValue2 = boolH.booleanValue();
            } else if (productImageFormat != 8) {
                zBooleanValue = boolC.booleanValue();
                Boolean boolD = kq2.d(bitmapDrawBitmap, str);
                Intrinsics.checkNotNullExpressionValue(boolD, "saveBytes(...)");
                zBooleanValue2 = boolD.booleanValue();
            } else {
                zBooleanValue = boolC.booleanValue();
                Boolean boolH2 = kq2.h(bitmapDrawBitmap, str, false);
                Intrinsics.checkNotNullExpressionValue(boolH2, "saveBytes_8888_ARGB565(...)");
                zBooleanValue2 = boolH2.booleanValue();
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue & zBooleanValue2);
            bean.getBackgroundImage().setCropBinPath(str);
            bean.getBackgroundImage().setCropPath(str + ".png");
            WatchFaceImage backgroundImage = bean.getBackgroundImage();
            String fileMD5 = MD5Util.getFileMD5(new File(str));
            if (fileMD5 == null) {
                fileMD5 = "";
            }
            backgroundImage.setMd5(fileMD5);
            Logger.i(getTAG(), "save :" + str + " " + boolValueOf + " length: " + new File(str).length());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void cropDefaultVideos(@NotNull FaceEditPhotoBean bean, @NotNull final nyp transformationState) {
        int iIntValue;
        int iIntValue2;
        Intrinsics.checkNotNullParameter(bean, "bean");
        Intrinsics.checkNotNullParameter(transformationState, "transformationState");
        String originImagePath = bean.getBackgroundImage().getOriginImagePath();
        Logger.i(getTAG(), "origin path: " + originImagePath);
        if (originImagePath == null || originImagePath.length() == 0) {
            return;
        }
        a1p a1pVar = new a1p();
        DialFileUtils dialFileUtils = DialFileUtils.INSTANCE;
        File file = new File((dialFileUtils.getVideoFolderPath(originImagePath) + File.separator + "crop" + System.currentTimeMillis()) + ".mp4");
        a1pVar.f533a = file;
        transformationState.d = a1pVar;
        if (file.exists()) {
            file.delete();
        }
        com.xiaomi.fitness.watch.face.edit.video.videoprocess.b bVar = new com.xiaomi.fitness.watch.face.edit.video.videoprocess.b(originImagePath, file.getPath(), 464);
        bVar.e(new com.xiaomi.fitness.watch.face.edit.video.videoprocess.b.a() { // from class: com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerViewModel.cropDefaultVideos.1
            @Override // com.xiaomi.fitness.watch.face.edit.video.videoprocess.b.a
            public void onVideoProcessFinish() {
                AnyExtKt.main$default(null, new FaceEditPhotoPickerViewModel$cropDefaultVideos$1$onVideoProcessFinish$1(transformationState, null), 1, null);
            }

            @Override // com.xiaomi.fitness.watch.face.edit.video.videoprocess.b.a
            public void onVideoProcessProgress(int prgress) {
            }
        });
        Pair<Integer, Integer> mediaSize = dialFileUtils.getMediaSize(originImagePath);
        mediaSize.getFirst().intValue();
        mediaSize.getSecond().intValue();
        int iIntValue3 = 0;
        if (mediaSize.getFirst().intValue() > mediaSize.getSecond().intValue()) {
            iIntValue = mediaSize.getSecond().intValue();
            iIntValue3 = (mediaSize.getFirst().intValue() / 2) - (iIntValue / 2);
            iIntValue2 = 0;
        } else {
            iIntValue = mediaSize.getFirst().intValue();
            iIntValue2 = (mediaSize.getSecond().intValue() / 2) - (iIntValue / 2);
        }
        Logger.i(getTAG(), "video crop startX " + iIntValue3 + " startY " + iIntValue2);
        bVar.c(iIntValue3, iIntValue2, iIntValue);
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return "FaceEditPhotoPickerViewModel";
    }

    private final int getInt(MediaFormat mediaFormat, String key, int defaultValue) {
        return mediaFormat.containsKey(key) ? mediaFormat.getInteger(key) : defaultValue;
    }
}
