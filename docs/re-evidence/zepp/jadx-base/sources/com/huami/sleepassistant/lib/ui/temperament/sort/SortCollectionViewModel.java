package com.huami.sleepassistant.lib.ui.temperament.sort;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import com.huami.android.vo.Resource;
import com.huami.sleepassistant.apilib.db.po.PostLiveMusicSortBean;
import com.huami.sleepassistant.apilib.repo.SortCollectionRepo;
import com.huami.sleepassistant.lib.ui.temperament.sort.SortCollectionViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR3\u0010\u0016\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0010 \u0011*\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/temperament/sort/SortCollectionViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/sleepassistant/apilib/db/po/PostLiveMusicSortBean;", "id", "", "setSortCollection", "Landroidx/lifecycle/MediatorLiveData;", "a", "Landroidx/lifecycle/MediatorLiveData;", "getSortCollectionData", "()Landroidx/lifecycle/MediatorLiveData;", "setSortCollectionData", "(Landroidx/lifecycle/MediatorLiveData;)V", "sortCollectionData", "Landroidx/lifecycle/LiveData;", "Lcom/huami/android/vo/Resource;", "", "kotlin.jvm.PlatformType", "b", "Landroidx/lifecycle/LiveData;", "getSortCollectionResult", "()Landroidx/lifecycle/LiveData;", "sortCollectionResult", "Lcom/huami/sleepassistant/apilib/repo/SortCollectionRepo;", CommonLanguageSettingFragment.KEY_REPO, "<init>", "(Lcom/huami/sleepassistant/apilib/repo/SortCollectionRepo;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class SortCollectionViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private MediatorLiveData<PostLiveMusicSortBean> sortCollectionData;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Resource<Integer>> sortCollectionResult;

    public SortCollectionViewModel(@NotNull final SortCollectionRepo sortCollectionRepo) {
        MediatorLiveData<PostLiveMusicSortBean> mediatorLiveData = new MediatorLiveData<>();
        this.sortCollectionData = mediatorLiveData;
        this.sortCollectionResult = Transformations.switchMap(mediatorLiveData, new Function() { // from class: p67
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return SortCollectionViewModel.b(sortCollectionRepo, (PostLiveMusicSortBean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData b(SortCollectionRepo sortCollectionRepo, PostLiveMusicSortBean postLiveMusicSortBean) {
        return sortCollectionRepo.sortCollectionParams(postLiveMusicSortBean);
    }

    @NotNull
    public final MediatorLiveData<PostLiveMusicSortBean> getSortCollectionData() {
        return this.sortCollectionData;
    }

    @NotNull
    public final LiveData<Resource<Integer>> getSortCollectionResult() {
        return this.sortCollectionResult;
    }

    public final void setSortCollection(@NotNull PostLiveMusicSortBean id) {
        this.sortCollectionData.setValue(id);
    }

    public final void setSortCollectionData(@NotNull MediatorLiveData<PostLiveMusicSortBean> mediatorLiveData) {
        this.sortCollectionData = mediatorLiveData;
    }
}
