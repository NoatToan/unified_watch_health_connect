package com.huami.sleep.sleepintrodetail.viewmodel;

import androidx.arch.core.util.Function;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import com.huami.sleep.sleepintrodetail.util.SleepIntroDetailUtil;
import com.huami.sleep.sleepintrodetail.vo.SleepIntroDetailVo;
import com.unionpay.ui.activity.WatchUnlockActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/huami/sleep/sleepintrodetail/viewmodel/SleepIntroDetailBaseViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/sleep/sleepintrodetail/vo/SleepIntroDetailVo;", "detailVo", "", "setIntroDetail", "Landroidx/lifecycle/MutableLiveData;", "a", "Landroidx/lifecycle/MutableLiveData;", "detail", "Landroidx/lifecycle/LiveData;", "", "b", "Landroidx/lifecycle/LiveData;", "getPageTitle", "()Landroidx/lifecycle/LiveData;", WatchUnlockActivity.ARGS_ACTION, "Landroidx/fragment/app/Fragment;", "c", "getDetailFragment", "detailFragment", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepIntroDetailBaseViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<SleepIntroDetailVo> detail;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> pageTitle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Fragment> detailFragment;

    public SleepIntroDetailBaseViewModel() {
        MutableLiveData<SleepIntroDetailVo> mutableLiveData = new MutableLiveData<>();
        this.detail = mutableLiveData;
        this.pageTitle = Transformations.map(mutableLiveData, new Function<SleepIntroDetailVo, String>() { // from class: com.huami.sleep.sleepintrodetail.viewmodel.SleepIntroDetailBaseViewModel$special$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final String apply(SleepIntroDetailVo sleepIntroDetailVo) {
                return sleepIntroDetailVo.getTitle();
            }
        });
        this.detailFragment = Transformations.map(this.detail, new Function<SleepIntroDetailVo, Fragment>() { // from class: com.huami.sleep.sleepintrodetail.viewmodel.SleepIntroDetailBaseViewModel$special$$inlined$map$2
            @Override // androidx.arch.core.util.Function
            public final Fragment apply(SleepIntroDetailVo sleepIntroDetailVo) {
                return SleepIntroDetailUtil.INSTANCE.getDetailFragment(sleepIntroDetailVo);
            }
        });
    }

    @NotNull
    public final LiveData<Fragment> getDetailFragment() {
        return this.detailFragment;
    }

    @NotNull
    public final LiveData<String> getPageTitle() {
        return this.pageTitle;
    }

    public final void setIntroDetail(@NotNull SleepIntroDetailVo detailVo) {
        this.detail.setValue(detailVo);
    }
}
