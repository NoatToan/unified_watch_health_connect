package com.huami.wallet.ui.viewmodel;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModel;
import com.huami.tools.log.HMLog;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.BusCardBalance;
import com.huami.wallet.lib.entity.BusCardDetail;
import com.huami.wallet.lib.entity.BusCardSimple2;
import com.huami.wallet.lib.entity.Protocol;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.lib.entity.XiaomiNotice;
import com.huami.wallet.ui.entity.BusCardDetailAndBalance;
import com.huami.wallet.ui.repository.BusCardRepo;
import com.huami.wallet.ui.utils.LiveDataReactiveStreams;
import com.huami.wallet.ui.viewmodel.BusCardStackViewModel;
import defpackage.oe0;
import defpackage.rx;
import defpackage.xf0;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes16.dex */
public class BusCardStackViewModel extends ViewModel {
    private static final String l = "Wallet-BusCardStackViewModel";
    private final MediatorLiveData<String> a;
    public final MutableLiveData<Pair<Integer, Resource<String>>> agreeProtocolLiveData;
    private Disposable b;
    public final MutableLiveData<Resource<List<BusCardSimple2>>> busCardListLiveData;
    private final BusCardRepo c;
    public final MediatorLiveData<Resource<Object>> changeDefaultCardResultLiveData;
    public final MutableLiveData<String> currentCityName;
    private final WalletDataSource d;
    public final MediatorLiveData<DefaultCardResult> defaultCardIdLiveData;
    public final MutableLiveData<Resource<String>> deletedCardLiveData;
    private final Map<String, BusCardDetail> e;
    public final LiveData<Resource<BusCardDetailAndBalance>> expandedCardDetailAndBalanceLiveData;
    public final MediatorLiveData<Integer> expandedCardPositionLiveData;
    private Disposable f;
    private Disposable g;
    private Disposable h;
    private Disposable i;
    public final MutableLiveData<Pair<Integer, Resource<Protocol>>> isNeedShowProtocol;
    private Disposable j;
    private Disposable k;
    public final MutableLiveData<Resource<List<XiaomiNotice>>> xiaomiNoticesLiveData;

    public static class DefaultCardResult {
        public int a;
        public String defaultCardId;
    }

    public BusCardStackViewModel(BusCardRepo busCardRepo) {
        MutableLiveData<Resource<List<BusCardSimple2>>> mutableLiveData = new MutableLiveData<>();
        this.busCardListLiveData = mutableLiveData;
        MediatorLiveData<DefaultCardResult> mediatorLiveData = new MediatorLiveData<>();
        this.defaultCardIdLiveData = mediatorLiveData;
        this.changeDefaultCardResultLiveData = new MediatorLiveData<>();
        MediatorLiveData<String> mediatorLiveData2 = new MediatorLiveData<>();
        this.a = mediatorLiveData2;
        MediatorLiveData<Integer> mediatorLiveData3 = new MediatorLiveData<>();
        this.expandedCardPositionLiveData = mediatorLiveData3;
        this.deletedCardLiveData = new MutableLiveData<>();
        this.xiaomiNoticesLiveData = new MutableLiveData<>();
        this.isNeedShowProtocol = new MutableLiveData<>();
        this.currentCityName = new MutableLiveData<>();
        this.agreeProtocolLiveData = new MutableLiveData<>();
        this.e = new HashMap();
        this.c = busCardRepo;
        this.d = busCardRepo.getDataSource();
        loadOpenedBusCards();
        mediatorLiveData.addSource(mutableLiveData, new Observer() { // from class: jg0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.S((Resource) obj);
            }
        });
        mediatorLiveData3.addSource(mutableLiveData, new Observer() { // from class: cg0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.T((Resource) obj);
            }
        });
        mediatorLiveData3.addSource(mediatorLiveData2, new Observer() { // from class: kg0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.U((String) obj);
            }
        });
        this.expandedCardDetailAndBalanceLiveData = Transformations.switchMap(mediatorLiveData2, new Function() { // from class: rf0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return this.a.W((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(Integer num, Resource resource) throws Exception {
        this.agreeProtocolLiveData.setValue(new Pair<>(num, resource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C(Throwable th) throws Exception {
        HMLog.w(l, th, "agreeProtocol时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(Integer num, Resource resource) throws Exception {
        this.isNeedShowProtocol.setValue(new Pair<>(num, resource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void E(Throwable th) throws Exception {
        HMLog.w(l, th, "checkProtocol时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(Throwable th) throws Exception {
        HMLog.w(l, th, "checkXiaoNotice时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(Subscription subscription) throws Exception {
        this.deletedCardLiveData.setValue(Resource.loading(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(String str, Throwable th) throws Exception {
        this.deletedCardLiveData.setValue(Resource.error(null, null, null));
        HMLog.w(l, th, "删除公交卡时发生了意外错误, busCardId:" + str, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BusCardDetailAndBalance I(String str, Resource resource, BusCardBalance busCardBalance) {
        BusCardDetailAndBalance busCardDetailAndBalance = new BusCardDetailAndBalance();
        busCardDetailAndBalance.id = str;
        busCardDetailAndBalance.detail = (BusCardDetail) resource.data;
        busCardDetailAndBalance.balance = busCardBalance;
        return busCardDetailAndBalance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Resource J(final String str, final Resource resource, Resource resource2) throws Exception {
        return resource2.map(new com.huami.wallet.lib.util.Function() { // from class: ng0
            @Override // com.huami.wallet.lib.util.Function
            public final Object apply(Object obj) {
                return BusCardStackViewModel.I(str, resource, (BusCardBalance) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Publisher K(final String str, final Resource resource) throws Exception {
        return resource.status == Status.SUCCESS ? Flowable.fromPublisher(this.d.loadBusCardBalance(str)).doOnNext(new Consumer() { // from class: uf0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BusCardStackViewModel.Q((Resource) obj);
            }
        }).filter(oe0.a).map(new io.reactivex.functions.Function() { // from class: hg0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BusCardStackViewModel.J(str, resource, (Resource) obj);
            }
        }) : Flowable.just(resource.map(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ BusCardDetailAndBalance L(String str, BusCardDetailAndBalance busCardDetailAndBalance) {
        BusCardDetailAndBalance busCardDetailAndBalance2 = new BusCardDetailAndBalance();
        busCardDetailAndBalance2.id = str;
        return busCardDetailAndBalance2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Resource M(final String str, Resource resource) throws Exception {
        return resource.data == 0 ? resource.map(new com.huami.wallet.lib.util.Function() { // from class: lg0
            @Override // com.huami.wallet.lib.util.Function
            public final Object apply(Object obj) {
                return BusCardStackViewModel.L(str, (BusCardDetailAndBalance) obj);
            }
        }) : resource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void N(Resource resource) throws Exception {
        HMLog.i(l, "已展开的卡片详情和余额的加载状态：" + resource.status, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void O(Resource resource) throws Exception {
        HMLog.i(l, "已展开的卡片详细信息的加载状态：" + resource.status, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Resource P(String str) throws Exception {
        T t;
        BusCardDetail busCardDetail = this.e.get(str);
        if (busCardDetail != null) {
            HMLog.i(l, "已展开的卡片详细信息的从缓存中读取成功", new Object[0]);
            return Resource.success(busCardDetail);
        }
        Resource resource = (Resource) Flowable.fromPublisher(this.d.loadBusCardDetailInfo(str)).doOnNext(new Consumer() { // from class: vf0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BusCardStackViewModel.O((Resource) obj);
            }
        }).filter(oe0.a).blockingFirst(null);
        if (resource == null) {
            HMLog.w(l, "没有获取到已展开的卡片详细信息, busCardId:" + str, new Object[0]);
            return Resource.error("w10000", "没有获取到已展开的卡片详细信息", null);
        }
        if (resource.status == Status.SUCCESS && (t = resource.data) != 0) {
            BusCardDetail busCardDetail2 = (BusCardDetail) t;
            this.e.put(busCardDetail2.id, busCardDetail2);
        }
        return resource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q(Resource resource) throws Exception {
        HMLog.i(l, "已展开的卡片余额的加载状态：" + resource.status, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R(Throwable th) throws Exception {
        HMLog.w(l, th, "加载已开通卡列表发生错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(Resource resource) {
        T t;
        if (resource == null || (t = resource.data) == 0 || ((List) t).isEmpty()) {
            return;
        }
        for (BusCardSimple2 busCardSimple2 : (List) resource.data) {
            if (busCardSimple2.isDefault) {
                DefaultCardResult defaultCardResult = new DefaultCardResult();
                defaultCardResult.defaultCardId = busCardSimple2.id;
                defaultCardResult.a = ((List) resource.data).size();
                this.defaultCardIdLiveData.setValue(defaultCardResult);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(Resource resource) {
        b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(String str) {
        b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Publisher V(String str, Boolean bool) throws Exception {
        return bool.booleanValue() ? a0(str) : Completable.complete().toFlowable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ LiveData W(final String str) {
        if (str != null) {
            return LiveDataReactiveStreams.fromPublisher(Flowable.fromPublisher(this.d.isDeviceConnected()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).flatMap(new io.reactivex.functions.Function() { // from class: eg0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.a.V(str, (Boolean) obj);
                }
            }));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String X(String str, Object obj) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Resource Y(final String str, Resource resource) throws Exception {
        return resource.map(new com.huami.wallet.lib.util.Function() { // from class: mg0
            @Override // com.huami.wallet.lib.util.Function
            public final Object apply(Object obj) {
                return BusCardStackViewModel.X(str, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void Z(Resource resource) throws Exception {
        if (resource.status == Status.SUCCESS) {
            DefaultCardResult defaultCardResult = new DefaultCardResult();
            defaultCardResult.defaultCardId = (String) resource.data;
            if (this.busCardListLiveData.getValue() != null && this.busCardListLiveData.getValue().data != null) {
                defaultCardResult.a = this.busCardListLiveData.getValue().data.size();
            }
            this.defaultCardIdLiveData.setValue(defaultCardResult);
        }
        this.changeDefaultCardResultLiveData.setValue(resource.map(null));
    }

    private Flowable<Resource<BusCardDetailAndBalance>> a0(final String str) {
        return Flowable.fromCallable(new Callable() { // from class: ig0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.P(str);
            }
        }).flatMap(new io.reactivex.functions.Function() { // from class: dg0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.K(str, (Resource) obj);
            }
        }).startWith(Resource.loading(null)).map(new io.reactivex.functions.Function() { // from class: gg0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BusCardStackViewModel.M(str, (Resource) obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() { // from class: wf0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BusCardStackViewModel.N((Resource) obj);
            }
        });
    }

    private void b0() {
        String value = this.a.getValue();
        Resource<List<BusCardSimple2>> value2 = this.busCardListLiveData.getValue();
        List<BusCardSimple2> list = value2 != null ? value2.data : null;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (list.size() == 1 && value == null) {
            this.expandedCardPositionLiveData.setValue(0);
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (TextUtils.equals(list.get(i).id, value)) {
                    this.expandedCardPositionLiveData.setValue(Integer.valueOf(i));
                    break;
                }
            }
        }
        if (this.expandedCardPositionLiveData.getValue() == null) {
            this.expandedCardPositionLiveData.setValue(Integer.valueOf(list.size() - 1));
        } else {
            if (this.expandedCardPositionLiveData.getValue().intValue() != list.size() - 1 || this.a.getValue() == null) {
                return;
            }
            this.expandedCardPositionLiveData.setValue(Integer.valueOf(list.size() - 1));
        }
    }

    public void agreeProtocol(@NonNull final Integer num, String str, long j) {
        this.k = Flowable.fromPublisher(this.d.agreeProtocol(str, j)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: qg0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.B(num, (Resource) obj);
            }
        }, new Consumer() { // from class: bg0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BusCardStackViewModel.C((Throwable) obj);
            }
        });
    }

    public void checkProtocol(String str, String str2, @NonNull final Integer num) {
        this.currentCityName.setValue(str2);
        this.j = Flowable.fromPublisher(this.d.getProtocol(str, str2, "RECHARGE")).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: sf0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.D(num, (Resource) obj);
            }
        }, new Consumer() { // from class: yf0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BusCardStackViewModel.E((Throwable) obj);
            }
        });
    }

    public void checkXiaoNotice() {
        Flowable flowableObserveOn = Flowable.fromPublisher(this.d.getXiaomiNotice()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        MutableLiveData<Resource<List<XiaomiNotice>>> mutableLiveData = this.xiaomiNoticesLiveData;
        Objects.requireNonNull(mutableLiveData);
        this.b = flowableObserveOn.subscribe(new rx(mutableLiveData), new Consumer() { // from class: ag0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BusCardStackViewModel.F((Throwable) obj);
            }
        });
    }

    public void deleteBusCard(final String str) {
        Flowable<Resource<String>> flowableDoOnSubscribe = this.c.deleteBusCard(str).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doOnSubscribe(new Consumer() { // from class: pg0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.G((Subscription) obj);
            }
        });
        MutableLiveData<Resource<String>> mutableLiveData = this.deletedCardLiveData;
        Objects.requireNonNull(mutableLiveData);
        this.i = flowableDoOnSubscribe.subscribe(new rx(mutableLiveData), new Consumer() { // from class: tf0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.H(str, (Throwable) obj);
            }
        });
    }

    public void loadOpenedBusCards() {
        HMLog.w(l, "loadOpenedBusCards", new Object[0]);
        Disposable disposable = this.f;
        if (disposable != null && !disposable.isDisposed()) {
            this.f.dispose();
        }
        Flowable flowableObserveOn = Flowable.fromPublisher(this.d.loadOpenedBusCards()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        MutableLiveData<Resource<List<BusCardSimple2>>> mutableLiveData = this.busCardListLiveData;
        Objects.requireNonNull(mutableLiveData);
        this.f = flowableObserveOn.subscribe(new rx(mutableLiveData), new Consumer() { // from class: zf0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BusCardStackViewModel.R((Throwable) obj);
            }
        });
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Disposable disposable = this.f;
        if (disposable != null && !disposable.isDisposed()) {
            this.f.dispose();
            this.f = null;
        }
        Disposable disposable2 = this.g;
        if (disposable2 != null && !disposable2.isDisposed()) {
            this.g.dispose();
            this.g = null;
        }
        Disposable disposable3 = this.h;
        if (disposable3 != null && !disposable3.isDisposed()) {
            this.h.dispose();
            this.h = null;
        }
        Disposable disposable4 = this.i;
        if (disposable4 != null && !disposable4.isDisposed()) {
            this.i.dispose();
            this.i = null;
        }
        Disposable disposable5 = this.j;
        if (disposable5 != null && !disposable5.isDisposed()) {
            this.j.dispose();
            this.j = null;
        }
        Disposable disposable6 = this.k;
        if (disposable6 != null && !disposable6.isDisposed()) {
            this.k.dispose();
            this.k = null;
        }
        Disposable disposable7 = this.b;
        if (disposable7 == null || disposable7.isDisposed()) {
            return;
        }
        this.b.dispose();
        this.b = null;
    }

    public void setDefaultBusCard(final String str, @Nullable String str2) {
        this.h = Flowable.fromPublisher(this.d.setDefaultBusCard(str, str2)).map(new io.reactivex.functions.Function() { // from class: fg0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BusCardStackViewModel.Y(str, (Resource) obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: og0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.Z((Resource) obj);
            }
        }, xf0.a);
    }

    public void setExpandCardId(String str) {
        if (TextUtils.equals(this.a.getValue(), str)) {
            return;
        }
        this.a.setValue(str);
    }
}
