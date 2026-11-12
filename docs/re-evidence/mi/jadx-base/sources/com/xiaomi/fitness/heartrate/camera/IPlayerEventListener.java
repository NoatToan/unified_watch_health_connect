package com.xiaomi.fitness.heartrate.camera;

import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\"\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH&J\u001c\u0010\u000f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/heartrate/camera/IPlayerEventListener;", "", "onInit", "", "fileName", "", "onReset", "onStopped", "onPlayed", "onPaused", "onFinished", "onProgress", BroadcastsKt.SILENT_PUSHING_PROGRESS, "", VibrateModeSetFragment.MAX, "onError", "msg", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IPlayerEventListener {
    void onError(@Nullable String fileName, @Nullable String msg);

    void onFinished(@Nullable String fileName);

    void onInit(@Nullable String fileName);

    void onPaused(@Nullable String fileName);

    void onPlayed(@Nullable String fileName);

    void onProgress(@Nullable String fileName, long progress, long max);

    void onReset(@Nullable String fileName);

    void onStopped(@Nullable String fileName);
}
