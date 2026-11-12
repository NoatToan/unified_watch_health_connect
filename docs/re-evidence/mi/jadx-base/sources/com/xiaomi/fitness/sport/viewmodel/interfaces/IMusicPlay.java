package com.xiaomi.fitness.sport.viewmodel.interfaces;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/sport/viewmodel/interfaces/IMusicPlay;", "", "playSportPlaylist", "", "toMusicZone", "context", "Landroid/content/Context;", "preSong", "nextSong", "toggleMusic", "getAndPlaySportPlaylist", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IMusicPlay {
    void getAndPlaySportPlaylist();

    void nextSong();

    void playSportPlaylist();

    void preSong();

    void toMusicZone(@NotNull Context context);

    void toggleMusic();
}
