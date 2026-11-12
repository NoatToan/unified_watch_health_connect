package com.huami.musiccontrol.player;

import com.huami.musiccontrol.bean.MusicInfo;
import com.huami.musiccontrol.bean.MusicPlayInfo;
import com.huami.sky.lib.constant.WebConstant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\f"}, d2 = {"Lcom/huami/musiccontrol/player/IPlayerListener;", "", "Lcom/huami/musiccontrol/player/IPlayer;", "outerPlayer", "Lcom/huami/musiccontrol/bean/MusicInfo;", WebConstant.QueryParam.TYPE_MUSIC, "", "onMusicChanged", "Lcom/huami/musiccontrol/bean/MusicPlayInfo;", "state", "onPlayStatusChanged", "onSessionDestroyed", "music_control_release"}, k = 1, mv = {1, 4, 1})
public interface IPlayerListener {
    void onMusicChanged(@NotNull IPlayer outerPlayer, @NotNull MusicInfo music);

    void onPlayStatusChanged(@NotNull IPlayer outerPlayer, @NotNull MusicPlayInfo state);

    void onSessionDestroyed(@NotNull IPlayer outerPlayer);
}
