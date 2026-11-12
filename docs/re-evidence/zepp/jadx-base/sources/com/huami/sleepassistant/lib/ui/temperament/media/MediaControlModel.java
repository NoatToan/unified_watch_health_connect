package com.huami.sleepassistant.lib.ui.temperament.media;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.huami.sleepassistant.apilib.db.po.Music;
import com.huami.sleepassistant.apilib.repo.MediaPlayerRepo;
import com.huami.sleepassistant.lib.ui.music.MediaPlayService;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/temperament/media/MediaControlModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/LiveData;", "", "Lcom/huami/sleepassistant/apilib/db/po/Music;", "queryAllMusic", "Lcom/huami/sleepassistant/apilib/repo/MediaPlayerRepo;", "a", "Lcom/huami/sleepassistant/apilib/repo/MediaPlayerRepo;", CommonLanguageSettingFragment.KEY_REPO, "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/sleepassistant/lib/ui/music/MediaPlayService$MediaBinder;", "b", "Landroidx/lifecycle/MutableLiveData;", "getBinderLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setBinderLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "binderLiveData", "<init>", "(Lcom/huami/sleepassistant/apilib/repo/MediaPlayerRepo;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class MediaControlModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MediaPlayerRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<MediaPlayService.MediaBinder> binderLiveData = new MutableLiveData<>();

    public MediaControlModel(@NotNull MediaPlayerRepo mediaPlayerRepo) {
        this.repo = mediaPlayerRepo;
    }

    @NotNull
    public final MutableLiveData<MediaPlayService.MediaBinder> getBinderLiveData() {
        return this.binderLiveData;
    }

    @NotNull
    public final LiveData<List<Music>> queryAllMusic() {
        return this.repo.queryAllMusic();
    }

    public final void setBinderLiveData(@NotNull MutableLiveData<MediaPlayService.MediaBinder> mutableLiveData) {
        this.binderLiveData = mutableLiveData;
    }
}
