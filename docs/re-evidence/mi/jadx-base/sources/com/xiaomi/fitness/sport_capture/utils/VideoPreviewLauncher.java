package com.xiaomi.fitness.sport_capture.utils;

import com.xiaomi.fitness.sport_capture.ui.SPortraitVideoActivity;
import com.xiaomi.fitness.sport_capture.ui.SPortraitVideoFixOrientationActivity;
import com.xiaomi.fitness.sport_capture.ui.SVideoActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/utils/VideoPreviewLauncher;", "", "<init>", "()V", "launch", "", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VideoPreviewLauncher {

    @NotNull
    public static final VideoPreviewLauncher INSTANCE = new VideoPreviewLauncher();

    private VideoPreviewLauncher() {
    }

    public final void launch() {
        if (DeviceUtils.isFlipFolded()) {
            SPortraitVideoActivity.INSTANCE.launch();
        } else if (DeviceUtils.isMixUnFolded()) {
            SPortraitVideoFixOrientationActivity.INSTANCE.launch();
        } else {
            SVideoActivity.INSTANCE.launch();
        }
    }
}
