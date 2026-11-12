package com.huami.sleepassistant.lib.ui.temperament.music;

import android.content.Context;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.paging.PagedList;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.Resource;
import com.huami.sleepassistant.apilib.repo.MusicControlRepo;
import com.huami.sleepassistant.apilib.utils.MediaFileUtils;
import com.huami.sleepassistant.apilib.utils.OnDownLoadStatusCallBack;
import com.huami.sleepassistant.apilib.vo.Listing;
import com.huami.sleepassistant.apilib.vo.MusicVo;
import com.huami.sleepassistant.lib.R;
import com.huami.sleepassistant.lib.ui.music.MediaPlayService;
import com.huami.sleepassistant.lib.widget.MyDownLoadAndPlayView;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.xiaomi.hm.health.device.watchskinstore.ui.LargeWatchSkinActivity;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b>\u0010?J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J&\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bR\u0019\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R%\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00190\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR.\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001f0\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010#R.\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001f0\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010#R(\u00101\u001a\b\u0012\u0004\u0012\u00020*0)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R(\u00104\u001a\b\u0012\u0004\u0012\u0002020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010,\u001a\u0004\b4\u0010.\"\u0004\b5\u00100R(\u00109\u001a\b\u0012\u0004\u0012\u00020\u00070)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010,\u001a\u0004\b7\u0010.\"\u0004\b8\u00100R(\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000b0)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010,\u001a\u0004\b;\u0010.\"\u0004\b<\u00100¨\u0006@"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/temperament/music/MusicControlViewModel;", "Landroidx/lifecycle/ViewModel;", "", "refresh", "retry", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/sleepassistant/apilib/vo/MusicVo;", LargeWatchSkinActivity.KEY_BEAN, "Lcom/huami/sleepassistant/lib/widget/MyDownLoadAndPlayView;", ViewHierarchyConstants.VIEW_KEY, "", "position", "downLoadMusic", "Lcom/huami/sleepassistant/apilib/repo/MusicControlRepo;", "a", "Lcom/huami/sleepassistant/apilib/repo/MusicControlRepo;", "getRepo", "()Lcom/huami/sleepassistant/apilib/repo/MusicControlRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/sleepassistant/apilib/vo/Listing;", "b", "Lcom/huami/sleepassistant/apilib/vo/Listing;", "result", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "c", "Landroidx/lifecycle/LiveData;", "getPagedList", "()Landroidx/lifecycle/LiveData;", "pagedList", "Lcom/huami/android/vo/Resource;", GoogleApiAvailabilityLight.a, "getNetworkState", "setNetworkState", "(Landroidx/lifecycle/LiveData;)V", "networkState", "e", "getRefreshState", "setRefreshState", "refreshState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/sleepassistant/lib/ui/music/MediaPlayService$MediaBinder;", "f", "Landroidx/lifecycle/MutableLiveData;", "getBinderLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setBinderLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "binderLiveData", "", "g", "isDowning", "setDowning", "h", "getCallbackLiveData", "setCallbackLiveData", "callbackLiveData", "i", "getPositionLiveData", "setPositionLiveData", "positionLiveData", "<init>", "(Lcom/huami/sleepassistant/apilib/repo/MusicControlRepo;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class MusicControlViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MusicControlRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Listing<MusicVo> result;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LiveData<PagedList<MusicVo>> pagedList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private LiveData<Resource<Unit>> networkState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private LiveData<Resource<Integer>> refreshState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<MediaPlayService.MediaBinder> binderLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Boolean> isDowning;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<MusicVo> callbackLiveData;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Integer> positionLiveData;

    public MusicControlViewModel(@NotNull MusicControlRepo musicControlRepo) {
        this.repo = musicControlRepo;
        Listing<MusicVo> listingLoadMusicList = musicControlRepo.loadMusicList();
        this.result = listingLoadMusicList;
        this.pagedList = listingLoadMusicList.getPagedList();
        this.networkState = listingLoadMusicList.getNetworkState();
        this.refreshState = listingLoadMusicList.getRefreshState();
        this.binderLiveData = new MutableLiveData<>();
        this.isDowning = new MutableLiveData<>();
        this.callbackLiveData = new MutableLiveData<>();
        this.positionLiveData = new MutableLiveData<>();
    }

    public final void downLoadMusic(@NotNull final Context context, @NotNull MusicVo bean, @NotNull MyDownLoadAndPlayView view, final int position) {
        new MediaFileUtils().loadDownMusic(context, bean, this.repo.getCom.facebook.appevents.UserDataStore.DATE_OF_BIRTH java.lang.String(), new OnDownLoadStatusCallBack() { // from class: com.huami.sleepassistant.lib.ui.temperament.music.MusicControlViewModel.downLoadMusic.1
            @Override // com.huami.sleepassistant.apilib.utils.OnDownLoadStatusCallBack
            public void callback(@Nullable MusicVo item) {
                if ((item == null ? null : item.getPlayAddress()) != null) {
                    MusicControlViewModel.this.getCallbackLiveData().setValue(item);
                    MusicControlViewModel.this.getPositionLiveData().setValue(Integer.valueOf(position));
                }
            }

            @Override // com.huami.sleepassistant.apilib.utils.OnDownLoadStatusCallBack
            public void downFail() {
                CustomToast.makeText(context, R.string.sls_down_fail, 0).show();
            }

            @Override // com.huami.sleepassistant.apilib.utils.OnDownLoadStatusCallBack
            public void endDown() {
                MusicControlViewModel.this.isDowning().setValue(Boolean.FALSE);
            }

            @Override // com.huami.sleepassistant.apilib.utils.OnDownLoadStatusCallBack
            public void startDown() {
                MusicControlViewModel.this.isDowning().setValue(Boolean.TRUE);
            }
        });
    }

    @NotNull
    public final MutableLiveData<MediaPlayService.MediaBinder> getBinderLiveData() {
        return this.binderLiveData;
    }

    @NotNull
    public final MutableLiveData<MusicVo> getCallbackLiveData() {
        return this.callbackLiveData;
    }

    @NotNull
    public final LiveData<Resource<Unit>> getNetworkState() {
        return this.networkState;
    }

    @NotNull
    public final LiveData<PagedList<MusicVo>> getPagedList() {
        return this.pagedList;
    }

    @NotNull
    public final MutableLiveData<Integer> getPositionLiveData() {
        return this.positionLiveData;
    }

    @NotNull
    public final LiveData<Resource<Integer>> getRefreshState() {
        return this.refreshState;
    }

    @NotNull
    public final MusicControlRepo getRepo() {
        return this.repo;
    }

    @NotNull
    public final MutableLiveData<Boolean> isDowning() {
        return this.isDowning;
    }

    public final void refresh() {
        this.result.getRefresh().invoke();
    }

    public final void retry() {
        this.result.getRetry().invoke();
    }

    public final void setBinderLiveData(@NotNull MutableLiveData<MediaPlayService.MediaBinder> mutableLiveData) {
        this.binderLiveData = mutableLiveData;
    }

    public final void setCallbackLiveData(@NotNull MutableLiveData<MusicVo> mutableLiveData) {
        this.callbackLiveData = mutableLiveData;
    }

    public final void setDowning(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        this.isDowning = mutableLiveData;
    }

    public final void setNetworkState(@NotNull LiveData<Resource<Unit>> liveData) {
        this.networkState = liveData;
    }

    public final void setPositionLiveData(@NotNull MutableLiveData<Integer> mutableLiveData) {
        this.positionLiveData = mutableLiveData;
    }

    public final void setRefreshState(@NotNull LiveData<Resource<Integer>> liveData) {
        this.refreshState = liveData;
    }
}
