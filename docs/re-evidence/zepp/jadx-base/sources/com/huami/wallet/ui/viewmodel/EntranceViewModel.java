package com.huami.wallet.ui.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.huami.tools.log.HMLog;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.BusCardSimple2;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.ui.helper.AnalyticsHelper;
import com.huami.wallet.ui.helper.WalletPageHelper;
import com.huami.wallet.ui.viewmodel.EntranceViewModel;
import defpackage.rx;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class EntranceViewModel extends ViewModel {
    private static final String e = "Wallet-EntranceViewModel";
    private final WalletDataSource a;
    private Disposable b;
    private Disposable c;
    private final WalletPageHelper.WalletPageListener d;
    public final MutableLiveData<Resource<List<BusCardSimple2>>> installedBusCards = new MutableLiveData<>();
    public final MutableLiveData<Resource<String>> cplcLiveData = new MutableLiveData<>();

    public class a implements WalletPageHelper.WalletPageListener {
        public a() {
        }

        @Override // com.huami.wallet.ui.helper.WalletPageHelper.WalletPageListener
        public void onEnter() {
        }

        @Override // com.huami.wallet.ui.helper.WalletPageHelper.WalletPageListener
        public void onLeave() {
            EntranceViewModel.this.a.clearData();
        }
    }

    public EntranceViewModel(WalletDataSource walletDataSource) {
        a aVar = new a();
        this.d = aVar;
        this.a = walletDataSource;
        WalletPageHelper.getInstance().registerWalletPageListener(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource h(Resource resource) throws Exception {
        if (resource != null && resource.status == Status.SUCCESS) {
            AnalyticsHelper.recordEnterBusEvent(this.a.getDeviceModel());
        }
        this.installedBusCards.setValue(resource);
        return resource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource i(Resource resource) throws Exception {
        if (resource != null && resource.status == Status.SUCCESS) {
            this.a.updateNfcCardListSync((List) resource.data);
        }
        return resource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(Resource resource) throws Exception {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(Throwable th) throws Exception {
        this.installedBusCards.setValue(Resource.error("Unknown", th.getMessage(), null));
        HMLog.e(e, th, "查询是否有已安装卡时发送了意料之外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(Throwable th) throws Exception {
        HMLog.w(e, "获取CPLC时发生了异常", new Object[0]);
    }

    public void checkThenEnterWallet() {
        this.b = Flowable.fromPublisher(this.a.getInstalledBusCards()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).map(new Function() { // from class: do1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.h((Resource) obj);
            }
        }).observeOn(Schedulers.io()).map(new Function() { // from class: eo1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.i((Resource) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: bo1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                EntranceViewModel.j((Resource) obj);
            }
        }, new Consumer() { // from class: ao1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.k((Throwable) obj);
            }
        });
    }

    public void loadCplc() {
        Flowable flowableObserveOn = Flowable.fromPublisher(this.a.loadCplc()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        MutableLiveData<Resource<String>> mutableLiveData = this.cplcLiveData;
        Objects.requireNonNull(mutableLiveData);
        this.c = flowableObserveOn.subscribe(new rx(mutableLiveData), new Consumer() { // from class: co1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                EntranceViewModel.m((Throwable) obj);
            }
        });
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        WalletPageHelper.getInstance().unregisterWalletPageListener(this.d);
        Disposable disposable = this.b;
        if (disposable != null && !disposable.isDisposed()) {
            this.b.dispose();
        }
        Disposable disposable2 = this.c;
        if (disposable2 == null || disposable2.isDisposed()) {
            return;
        }
        this.c.dispose();
    }
}
