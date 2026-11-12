package com.xiaomi.fitness.milink.local;

import android.media.session.MediaController;
import com.xiaomi.fitness.common.log.Logger;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\u001c\u0010\u000b\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/milink/local/ActiveAudioSessionManager;", "", "<init>", "()V", "currentMediaController", "Landroid/media/session/MediaController;", "activeAudioSessionCallback", "Lcom/xiaomi/fitness/milink/local/ActiveAudioSessionManager$ActiveAudioSessionCallback;", "registerActiveAudioSessionCallback", "", "callback", "handleOnActiveSessionsChanged", "controllers", "", "init", "", "TAG", "", "ActiveAudioSessionCallback", "milink_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActiveAudioSessionManager {

    @NotNull
    public static final ActiveAudioSessionManager INSTANCE = new ActiveAudioSessionManager();

    @NotNull
    private static final String TAG = "ActiveAudioSessionManager";

    @Nullable
    private static ActiveAudioSessionCallback activeAudioSessionCallback;

    @Nullable
    private static MediaController currentMediaController;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/milink/local/ActiveAudioSessionManager$ActiveAudioSessionCallback;", "", "onTopActiveSessionChange", "", "controller", "Landroid/media/session/MediaController;", "init", "", "milink_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ActiveAudioSessionCallback {
        void onTopActiveSessionChange(@Nullable MediaController controller, boolean init);
    }

    private ActiveAudioSessionManager() {
    }

    public final void handleOnActiveSessionsChanged(@NotNull List<MediaController> controllers, boolean init) {
        Intrinsics.checkNotNullParameter(controllers, "controllers");
        if (controllers.isEmpty()) {
            Logger.i(TAG, "no active controller found");
            ActiveAudioSessionCallback activeAudioSessionCallback2 = activeAudioSessionCallback;
            if (activeAudioSessionCallback2 != null) {
                activeAudioSessionCallback2.onTopActiveSessionChange(null, init);
                return;
            }
            return;
        }
        MediaController mediaController = controllers.get(0);
        ActiveAudioSessionCallback activeAudioSessionCallback3 = activeAudioSessionCallback;
        if (activeAudioSessionCallback3 != null) {
            activeAudioSessionCallback3.onTopActiveSessionChange(mediaController, init);
        }
        currentMediaController = mediaController;
    }

    public final void registerActiveAudioSessionCallback(@NotNull ActiveAudioSessionCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        activeAudioSessionCallback = callback;
    }
}
