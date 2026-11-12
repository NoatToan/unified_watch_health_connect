package com.huami.wallet.ui.viewmodel;

import androidx.annotation.VisibleForTesting;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.BusCardListItem;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.XiaomiNotice;
import com.huami.wallet.ui.viewmodel.BusCardListViewModel;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 12\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b/\u00100J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0012\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\b\u0010\f\u001a\u00020\u0005H\u0017R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR4\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00130\u00120\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R%\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00120\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R+\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00130\u00120\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u0017R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010'R\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/huami/wallet/ui/viewmodel/BusCardListViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/wallet/lib/entity/BusCardListItem;", "getBusCard", "busCard", "", "goToNextPage", "", "parentAppCode", "getBusCardListData", "checkXiaoNotice", "checkHasVerifiedPhone", "onCleared", "Lcom/huami/wallet/lib/api/WalletDataSource;", "a", "Lcom/huami/wallet/lib/api/WalletDataSource;", ParamKey.dataSource, "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/wallet/lib/entity/Resource;", "", "b", "Landroidx/lifecycle/MutableLiveData;", "getBusCardsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setBusCardsLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "busCardsLiveData", "c", "getVerifiedPhoneLiveData", "verifiedPhoneLiveData", GoogleApiAvailabilityLight.a, "getGoToNextPageLiveData", "goToNextPageLiveData", "Lcom/huami/wallet/lib/entity/XiaomiNotice;", "e", "getXiaomiNoticesLiveData", "xiaomiNoticesLiveData", "Lio/reactivex/disposables/Disposable;", "f", "Lio/reactivex/disposables/Disposable;", "mBusCardListViewModelDisposable", "g", "mCheckXiaoNoticeDisposable", "h", "mCheckPhoneDisposable", "i", "Lcom/huami/wallet/lib/entity/BusCardListItem;", "<init>", "(Lcom/huami/wallet/lib/api/WalletDataSource;)V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public class BusCardListViewModel extends ViewModel {

    @NotNull
    private static final String j = "Wallet-BusCardListViewModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WalletDataSource dataSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Resource<List<BusCardListItem>>> busCardsLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<String>> verifiedPhoneLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<BusCardListItem> goToNextPageLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Resource<List<XiaomiNotice>>> xiaomiNoticesLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Disposable mBusCardListViewModelDisposable;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private Disposable mCheckXiaoNoticeDisposable;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Disposable mCheckPhoneDisposable;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private BusCardListItem busCard;

    public BusCardListViewModel(@NotNull WalletDataSource walletDataSource) {
        this.dataSource = walletDataSource;
    }

    public static /* synthetic */ void getBusCardListData$default(BusCardListViewModel busCardListViewModel, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBusCardListData");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        busCardListViewModel.getBusCardListData(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(BusCardListViewModel busCardListViewModel, Resource resource) {
        busCardListViewModel.getVerifiedPhoneLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(Throwable th) {
        HMLog.w(j, th, "获取用户当前已验证过短信验证码的手机号时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(BusCardListViewModel busCardListViewModel, Resource resource) {
        busCardListViewModel.getXiaomiNoticesLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(Throwable th) {
        HMLog.w(j, th, "checkXiaoNotice时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Publisher n(BusCardListViewModel busCardListViewModel, String str, Boolean bool) {
        return bool.booleanValue() ? Flowable.fromPublisher(busCardListViewModel.dataSource.loadAllBusCards(str)) : Completable.complete().toFlowable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(BusCardListViewModel busCardListViewModel, Resource resource) {
        busCardListViewModel.getBusCardsLiveData().setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Throwable th) {
        HMLog.w(j, th, "getBusCardListData时发生了意外的错误", new Object[0]);
    }

    public final void checkHasVerifiedPhone() {
        this.mCheckPhoneDisposable = Flowable.fromPublisher(this.dataSource.loadVerifiedPhone()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: dd0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardListViewModel.i(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: hd0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardListViewModel.j((Throwable) obj);
            }
        });
    }

    public final void checkXiaoNotice() {
        this.mCheckXiaoNoticeDisposable = Flowable.fromPublisher(this.dataSource.getXiaomiNotice()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: fd0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardListViewModel.k(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: id0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardListViewModel.m((Throwable) obj);
            }
        });
    }

    @NotNull
    public final BusCardListItem getBusCard() {
        BusCardListItem busCardListItem = this.busCard;
        Objects.requireNonNull(busCardListItem);
        return busCardListItem;
    }

    public final void getBusCardListData(@Nullable final String parentAppCode) {
        this.mBusCardListViewModelDisposable = Flowable.fromPublisher(this.dataSource.isDeviceConnected()).flatMap(new Function() { // from class: jd0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BusCardListViewModel.n(this.a, parentAppCode, (Boolean) obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: ed0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardListViewModel.o(this.a, (Resource) obj);
            }
        }, new Consumer() { // from class: gd0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BusCardListViewModel.p((Throwable) obj);
            }
        });
    }

    @NotNull
    public final MutableLiveData<Resource<List<BusCardListItem>>> getBusCardsLiveData() {
        return this.busCardsLiveData;
    }

    @NotNull
    public final MutableLiveData<BusCardListItem> getGoToNextPageLiveData() {
        return this.goToNextPageLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<String>> getVerifiedPhoneLiveData() {
        return this.verifiedPhoneLiveData;
    }

    @NotNull
    public final MutableLiveData<Resource<List<XiaomiNotice>>> getXiaomiNoticesLiveData() {
        return this.xiaomiNoticesLiveData;
    }

    public final void goToNextPage(@NotNull BusCardListItem busCard) {
        if (this.dataSource.isForMi()) {
            this.goToNextPageLiveData.setValue(busCard);
        } else {
            this.busCard = busCard;
            checkHasVerifiedPhone();
        }
    }

    @Override // androidx.p008lifecycle.ViewModel
    @VisibleForTesting
    public void onCleared() {
        super.onCleared();
        Disposable disposable = this.mCheckPhoneDisposable;
        if (disposable != null && !disposable.isDisposed()) {
            this.mCheckPhoneDisposable.dispose();
            this.mCheckPhoneDisposable = null;
        }
        Disposable disposable2 = this.mCheckXiaoNoticeDisposable;
        if (disposable2 != null && !disposable2.isDisposed()) {
            this.mCheckXiaoNoticeDisposable.dispose();
            this.mCheckXiaoNoticeDisposable = null;
        }
        Disposable disposable3 = this.mBusCardListViewModelDisposable;
        if (disposable3 == null || disposable3.isDisposed()) {
            return;
        }
        this.mBusCardListViewModelDisposable.dispose();
        this.mBusCardListViewModelDisposable = null;
    }

    public final void setBusCardsLiveData(@NotNull MutableLiveData<Resource<List<BusCardListItem>>> mutableLiveData) {
        this.busCardsLiveData = mutableLiveData;
    }
}
