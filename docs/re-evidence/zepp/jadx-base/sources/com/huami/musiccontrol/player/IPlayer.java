package com.huami.musiccontrol.player;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.musiccontrol.bean.MusicInfo;
import com.huami.musiccontrol.bean.MusicPlayInfo;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J\n\u0010\n\u001a\u0004\u0018\u00010\tH&J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\u000e\u001a\u00020\rH&¨\u0006\u000f"}, d2 = {"Lcom/huami/musiccontrol/player/IPlayer;", "", "", PointCategory.INIT, "", "destroy", "Lcom/huami/musiccontrol/player/IPlayerListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setMusicListener", "Lcom/huami/musiccontrol/bean/MusicPlayInfo;", "getPlaybackState", "Lcom/huami/musiccontrol/bean/MusicInfo;", "getMetadata", "", "getPackageName", "music_control_release"}, k = 1, mv = {1, 4, 1})
public interface IPlayer {
    void destroy();

    @Nullable
    MusicInfo getMetadata();

    @NotNull
    String getPackageName();

    @Nullable
    MusicPlayInfo getPlaybackState();

    boolean init();

    void setMusicListener(@Nullable IPlayerListener listener);
}
