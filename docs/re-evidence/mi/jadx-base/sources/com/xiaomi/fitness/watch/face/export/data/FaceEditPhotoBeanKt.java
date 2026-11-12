package com.xiaomi.fitness.watch.face.export.data;

import com.xiaomi.fitness.common.utils.MD5Util;
import defpackage.w5r;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u0004\u001a\u00020\u0006*\u00020\u0007H\u0002¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;", "Lw5r$a;", "toWatchFaceGroup", "(Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;)Lw5r$a;", "toBean", "(Lw5r$a;)Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFaceImage;", "Lw5r;", "toWatchFaceImage", "(Lcom/xiaomi/fitness/watch/face/export/data/WatchFaceImage;)Lw5r;", "(Lw5r;)Lcom/xiaomi/fitness/watch/face/export/data/WatchFaceImage;", "watch-face-export_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
public final class FaceEditPhotoBeanKt {
    @NotNull
    public static final FaceEditPhotoBean toBean(@NotNull w5r.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        int i = aVar.d;
        w5r bgImage = aVar.e;
        Intrinsics.checkNotNullExpressionValue(bgImage, "bgImage");
        WatchFaceImage bean = toBean(bgImage);
        w5r w5rVar = aVar.f;
        return new FaceEditPhotoBean(i, bean, w5rVar != null ? toBean(w5rVar) : null);
    }

    @NotNull
    public static final w5r.a toWatchFaceGroup(@NotNull FaceEditPhotoBean faceEditPhotoBean) {
        String md5;
        Intrinsics.checkNotNullParameter(faceEditPhotoBean, "<this>");
        w5r.a aVar = new w5r.a();
        if (faceEditPhotoBean.getForegroundImage() != null) {
            String md6 = faceEditPhotoBean.getBackgroundImage().getMd5();
            WatchFaceImage foregroundImage = faceEditPhotoBean.getForegroundImage();
            Intrinsics.checkNotNull(foregroundImage);
            md5 = MD5Util.MD5(md6 + foregroundImage.getMd5());
        } else {
            md5 = faceEditPhotoBean.getBackgroundImage().getMd5();
        }
        aVar.c = md5;
        aVar.d = faceEditPhotoBean.getPositionIndex();
        aVar.e = toWatchFaceImage(faceEditPhotoBean.getBackgroundImage());
        WatchFaceImage foregroundImage2 = faceEditPhotoBean.getForegroundImage();
        aVar.f = foregroundImage2 != null ? toWatchFaceImage(foregroundImage2) : null;
        return aVar;
    }

    private static final w5r toWatchFaceImage(WatchFaceImage watchFaceImage) {
        w5r w5rVar = new w5r();
        w5rVar.c = watchFaceImage.getMd5();
        String cropBinPath = watchFaceImage.getCropBinPath();
        if (cropBinPath == null) {
            cropBinPath = "";
        }
        File file = new File(cropBinPath);
        w5rVar.d = file.exists() ? (int) file.length() : 0;
        return w5rVar;
    }

    private static final WatchFaceImage toBean(w5r w5rVar) {
        String id = w5rVar.c;
        Intrinsics.checkNotNullExpressionValue(id, "id");
        return new WatchFaceImage(id, null, null, null, null, null, null, null, 254, null);
    }
}
