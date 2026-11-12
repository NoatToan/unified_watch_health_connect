package com.xiaomi.fitness.sport_capture.utils;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import defpackage.im9;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/utils/VideoFileUtils;", "", "<init>", "()V", "TAG", "", "VIDEO_DIR", "saveFile", "", "videoFile", "Ljava/io/File;", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VideoFileUtils {

    @NotNull
    public static final VideoFileUtils INSTANCE = new VideoFileUtils();

    @NotNull
    private static final String TAG = "VideoFileUtils";

    @NotNull
    private static final String VIDEO_DIR = "/share/SportCapture";

    private VideoFileUtils() {
    }

    @JvmStatic
    public static final void saveFile(@NotNull File videoFile) {
        Intrinsics.checkNotNullParameter(videoFile, "videoFile");
        try {
            Uri uriFromFile = Uri.fromFile(videoFile);
            if (uriFromFile != null) {
                ApplicationExtKt.getApplication().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uriFromFile));
            }
            if (Build.VERSION.SDK_INT >= 29) {
                im9.w(videoFile, VIDEO_DIR);
            }
        } catch (Exception e) {
            Logger.e(TAG, "saveFile exception", e);
        }
    }
}
