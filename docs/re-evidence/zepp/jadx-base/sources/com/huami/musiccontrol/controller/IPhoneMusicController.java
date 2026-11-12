package com.huami.musiccontrol.controller;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.musiccontrol.player.IPlayer;
import com.huami.musiccontrol.player.IPlayerListener;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0002H&J\b\u0010\b\u001a\u00020\u0002H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH&¨\u0006\u0010"}, d2 = {"Lcom/huami/musiccontrol/controller/IPhoneMusicController;", "", "", PointCategory.INIT, "deInit", "nextMusic", "preMusic", "pause", "play", "", "Lcom/huami/musiccontrol/player/IPlayer;", "getPlayers", "Lcom/huami/musiccontrol/player/IPlayerListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setMusicListener", "music_control_release"}, k = 1, mv = {1, 4, 1})
public interface IPhoneMusicController {
    boolean deInit();

    @NotNull
    List<IPlayer> getPlayers();

    boolean init();

    boolean nextMusic();

    boolean pause();

    boolean play();

    boolean preMusic();

    void setMusicListener(@Nullable IPlayerListener listener);
}
