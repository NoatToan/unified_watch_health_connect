package com.huami.sky.service;

import com.huami.sky.ui.play.notification.SkyPlayNotification;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&J\b\u0010\f\u001a\u00020\tH&J\b\u0010\r\u001a\u00020\u0005H&J\b\u0010\u000e\u001a\u00020\u0005H&J\b\u0010\u000f\u001a\u00020\u0005H&J\b\u0010\u0010\u001a\u00020\u0002H&J\b\u0010\u0011\u001a\u00020\u0002H&J\b\u0010\u0013\u001a\u00020\u0012H&J\b\u0010\u0014\u001a\u00020\u0005H&J\b\u0010\u0015\u001a\u00020\u0012H&¨\u0006\u0016"}, d2 = {"Lcom/huami/sky/service/SkyService;", "", "", "playOrPause", "pause", "", SkyPlayNotification.SKY_NOTIFICATION_LIKE, "changeLikeState", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/sky/service/PlayState;", "listenPlayState", "listenLikeState", "getPlayState", "getLikeState", "getServiceState", "isPlaying", "restart", "logoutSkyService", "", "getMusicId", "isFirstEnterSky", "getPlaySessionId", "sky-service_release"}, k = 1, mv = {1, 5, 1})
public interface SkyService {
    void changeLikeState(boolean like);

    boolean getLikeState();

    @NotNull
    String getMusicId();

    @NotNull
    String getPlaySessionId();

    @NotNull
    PlayState getPlayState();

    boolean getServiceState();

    boolean isFirstEnterSky();

    boolean isPlaying();

    @NotNull
    Flow<Boolean> listenLikeState();

    @NotNull
    Flow<PlayState> listenPlayState();

    void logoutSkyService();

    void pause();

    void playOrPause();

    void restart();
}
