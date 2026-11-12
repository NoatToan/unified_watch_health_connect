package com.xiaomi.fitness.watch.face.edit.video.crop;

import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.watch.face.edit.utils.DialFileUtils;
import com.xiaomi.fitness.watch.face.edit.video.videoprocess.b;
import com.xiaomi.fitness.watch.face.view.CropData;
import defpackage.a1p;
import defpackage.nyp;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\t\b\u0007¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/video/crop/FaceEditVideoCropViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "", "originPath", "Lnyp;", "transformationState", "Lcom/xiaomi/fitness/watch/face/view/CropData;", "cropData", "", "cropDefaultVideos", "(Ljava/lang/String;Lnyp;Lcom/xiaomi/fitness/watch/face/view/CropData;)V", "<init>", "()V", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceEditVideoCropViewModel extends AbsViewModel {

    @NotNull
    private static final String TAG = "FaceEditVideoCropViewModel";

    public final void cropDefaultVideos(@NotNull String originPath, @NotNull final nyp transformationState, @NotNull CropData cropData) {
        Intrinsics.checkNotNullParameter(originPath, "originPath");
        Intrinsics.checkNotNullParameter(transformationState, "transformationState");
        Intrinsics.checkNotNullParameter(cropData, "cropData");
        Logger.i(TAG, "origin path: " + originPath);
        if (originPath.length() == 0) {
            return;
        }
        a1p a1pVar = new a1p();
        File file = new File((DialFileUtils.INSTANCE.getVideoFolderPath(originPath) + File.separator + "crop" + System.currentTimeMillis()) + ".mp4");
        a1pVar.f533a = file;
        transformationState.d = a1pVar;
        if (file.exists()) {
            file.delete();
        }
        b bVar = new b(originPath, file.getPath(), 464);
        bVar.e(new b.a() { // from class: com.xiaomi.fitness.watch.face.edit.video.crop.FaceEditVideoCropViewModel.cropDefaultVideos.1
            @Override // com.xiaomi.fitness.watch.face.edit.video.videoprocess.b.a
            public void onVideoProcessFinish() {
                AnyExtKt.main$default(null, new FaceEditVideoCropViewModel$cropDefaultVideos$1$onVideoProcessFinish$1(transformationState, null), 1, null);
            }

            @Override // com.xiaomi.fitness.watch.face.edit.video.videoprocess.b.a
            public void onVideoProcessProgress(int prgress) {
            }
        });
        Logger.i(TAG, "video crop " + cropData);
        bVar.c((int) cropData.getStartX(), (int) cropData.getStartY(), (int) cropData.getWidth());
    }
}
