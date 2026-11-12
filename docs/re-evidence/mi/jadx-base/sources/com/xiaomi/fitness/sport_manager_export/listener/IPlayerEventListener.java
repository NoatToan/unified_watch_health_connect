package com.xiaomi.fitness.sport_manager_export.listener;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0017\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sport_manager_export/listener/IPlayerEventListener;", "", "onUpdateSongInfo", "", "data", "Lcom/xiaomi/fitness/sport_manager_export/listener/MusicData;", "onPlayState", "isPlaying", "", "(Ljava/lang/Boolean;)V", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IPlayerEventListener {
    void onPlayState(@Nullable Boolean isPlaying);

    void onUpdateSongInfo(@Nullable MusicData data);
}
