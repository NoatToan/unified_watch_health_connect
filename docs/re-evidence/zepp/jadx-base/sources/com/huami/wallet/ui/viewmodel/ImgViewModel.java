package com.huami.wallet.ui.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.huami.tools.log.HMLog;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.ui.viewmodel.ImgViewModel;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR.\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\f0\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/huami/wallet/ui/viewmodel/ImgViewModel;", "Landroidx/lifecycle/ViewModel;", "", "onCleared", "", "key", "getBusImageUrl", "Lcom/huami/wallet/lib/api/WalletDataSource;", "a", "Lcom/huami/wallet/lib/api/WalletDataSource;", ParamKey.dataSource, "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/wallet/lib/entity/Resource;", "b", "Landroidx/lifecycle/MutableLiveData;", "getBusImageUrlLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setBusImageUrlLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "busImageUrlLiveData", "Lio/reactivex/disposables/Disposable;", "c", "Lio/reactivex/disposables/Disposable;", "busImageDisposable", "<init>", "(Lcom/huami/wallet/lib/api/WalletDataSource;)V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class ImgViewModel extends ViewModel {

    @NotNull
    private static final String d = "Wallet-ImgViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WalletDataSource dataSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<String>> busImageUrlLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Disposable busImageDisposable;

    public ImgViewModel(@NotNull WalletDataSource walletDataSource) {
        this.dataSource = walletDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ImgViewModel imgViewModel, Resource resource) {
        imgViewModel.getBusImageUrlLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Throwable th) {
        HMLog.w(d, th, "获取移卡预加载时发生了意外的错误", new Object[0]);
    }

    public final void getBusImageUrl(@NotNull String key) {
        this.busImageDisposable = Flowable.fromPublisher(this.dataSource.getBusImageUrl(key)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: md4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ImgViewModel.c(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: nd4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                ImgViewModel.e((Throwable) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getBusImageUrlLiveData() {
        return this.busImageUrlLiveData;
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        Disposable disposable = this.busImageDisposable;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.busImageDisposable.dispose();
        this.busImageDisposable = null;
    }

    public final void setBusImageUrlLiveData(@NotNull MutableLiveData<Resource<String>> mutableLiveData) {
        this.busImageUrlLiveData = mutableLiveData;
    }
}
