package com.huami.sky.ui.realtime;

import androidx.p008lifecycle.ViewModel;
import com.huami.sky.lib.entity.MusicEntity;
import com.huami.sky.lib.room.MusicInfoDao;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/sky/ui/realtime/SkyMusicListViewModel;", "Landroidx/lifecycle/ViewModel;", "", "count", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/huami/sky/lib/entity/MusicEntity;", "getMusicListFlow", "Lcom/huami/sky/lib/room/MusicInfoDao;", "a", "Lcom/huami/sky/lib/room/MusicInfoDao;", "musicInfoDao", "<init>", "(Lcom/huami/sky/lib/room/MusicInfoDao;)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyMusicListViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MusicInfoDao musicInfoDao;

    public SkyMusicListViewModel(@NotNull MusicInfoDao musicInfoDao) {
        this.musicInfoDao = musicInfoDao;
    }

    public static /* synthetic */ Flow getMusicListFlow$default(SkyMusicListViewModel skyMusicListViewModel, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 100;
        }
        return skyMusicListViewModel.getMusicListFlow(i);
    }

    @NotNull
    public final Flow<List<MusicEntity>> getMusicListFlow(int count) {
        return this.musicInfoDao.getMusicInfoLimit(count);
    }
}
