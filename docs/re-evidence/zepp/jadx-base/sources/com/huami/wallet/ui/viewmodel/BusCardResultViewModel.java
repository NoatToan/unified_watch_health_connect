package com.huami.wallet.ui.viewmodel;

import android.app.Application;
import androidx.annotation.AnyThread;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.huami.tools.log.HMLog;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.BusCardBalance;
import com.huami.wallet.lib.entity.BusCardSimple2;
import com.huami.wallet.lib.entity.BusCardValidity;
import com.huami.wallet.lib.entity.CitySimpleInfo;
import com.huami.wallet.lib.entity.Order;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.lib.util.CitySimpleInfoCache;
import com.huami.wallet.lib.util.Function;
import com.huami.wallet.ui.entity.FullResultInfo;
import com.huami.wallet.ui.repository.BusCardRepo;
import com.huami.wallet.ui.utils.ErrorMsgUtils;
import com.huami.wallet.ui.viewmodel.BusCardResultViewModel;
import defpackage.oe0;
import defpackage.rx;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes16.dex */
public class BusCardResultViewModel extends ViewModel {
    public static final Integer RETRY_COUNT_JUMP_TO_FEEDBACK = 1;
    private static final String p = "Wallet-BusCardResultViewModel";
    private final Application a;
    private final BusCardRepo b;
    private final WalletDataSource c;
    private String d;
    private String e;
    private String f;
    private boolean g;
    private boolean h;
    private Disposable i;
    private Disposable j;
    private Disposable k;
    private Disposable l;
    private Disposable m;
    public final MutableLiveData<Resource<FullResultInfo>> orderInfoLiveData = new MutableLiveData<>();
    public final MutableLiveData<Resource<Boolean>> showRetryLoadingLiveData = new MutableLiveData<>();
    public final MutableLiveData<Resource<Boolean>> retryGetTokenLiveData = new MutableLiveData<>();
    public final MutableLiveData<Resource<Object>> showRefundLoadingLiveData = new MutableLiveData<>();
    public final MutableLiveData<Integer> checkRetryCountLiveData = new MutableLiveData<>();
    public final MutableLiveData<Integer> checkTipsCountLiveData = new MutableLiveData<>();
    public final MutableLiveData<Resource<List<BusCardSimple2>>> installedBusCards = new MutableLiveData<>();
    private HashMap<String, Integer> n = new HashMap<>();
    private final ArrayList<String> o = new ArrayList<>();

    public BusCardResultViewModel(Application application, BusCardRepo busCardRepo) {
        this.a = application;
        this.b = busCardRepo;
        this.c = busCardRepo.getDataSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FullResultInfo A(FullResultInfo fullResultInfo, Order order) {
        return fullResultInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Resource B(final FullResultInfo fullResultInfo, Resource resource) throws Exception {
        T t = resource.data;
        fullResultInfo.order = (Order) t;
        boolean z = true;
        if (t == 0 || (((Order) t).state != 1 && ((Order) t).state != 4)) {
            z = false;
        }
        if (resource.status != Status.SUCCESS || !z) {
            return resource.map(new Function() { // from class: ze0
                @Override // com.huami.wallet.lib.util.Function
                public final Object apply(Object obj) {
                    return BusCardResultViewModel.A(fullResultInfo, (Order) obj);
                }
            });
        }
        Integer num = (Integer) Flowable.fromPublisher(this.c.loadBusCardBalance(fullResultInfo.busCardId)).filter(oe0.a).map(new io.reactivex.functions.Function() { // from class: gf0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BusCardResultViewModel.y((Resource) obj);
            }
        }).blockingFirst(-1);
        Long l = (Long) Flowable.fromPublisher(this.c.loadBusCardValidity(fullResultInfo.busCardId)).filter(oe0.a).map(new io.reactivex.functions.Function() { // from class: hf0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BusCardResultViewModel.z((Resource) obj);
            }
        }).blockingFirst(-1L);
        fullResultInfo.balance = num != null ? num.intValue() : -1;
        fullResultInfo.expireDate = l != null ? l.longValue() : -1L;
        return Resource.success(fullResultInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void C(Throwable th) throws Exception {
        HMLog.e(p, th, "公交卡操作结果页查询订单发生了意料之外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D(String str, Resource resource) throws Exception {
        Status status = resource.status;
        if (status == Status.SUCCESS) {
            HMLog.i(p, "申请退款成功, orderId:" + str, new Object[0]);
            return;
        }
        if (status == Status.ERROR) {
            HMLog.w(p, "申请退款失败, orderId:" + str + ", code:" + resource.code + ", msg:" + resource.message, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(Subscription subscription) throws Exception {
        this.showRefundLoadingLiveData.setValue(Resource.loading(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(Resource resource) throws Exception {
        this.showRefundLoadingLiveData.setValue(Resource.success(null));
        if (resource.isSuccessful()) {
            w();
        } else {
            v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(Throwable th) throws Exception {
        this.showRefundLoadingLiveData.setValue(Resource.error("w10000", th.getMessage(), null));
        HMLog.e(p, th, "申请退款时发生了意料之外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(Throwable th) throws Exception {
        this.retryGetTokenLiveData.setValue(Resource.error("w10000", th.getMessage(), null));
        HMLog.e(p, th, "获取Token是发生了意料之外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(Subscription subscription) throws Exception {
        this.showRetryLoadingLiveData.setValue(Resource.loading(Boolean.TRUE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(String str, BusCardRepo.OpenCardResult openCardResult) throws Exception {
        this.showRetryLoadingLiveData.setValue(Resource.success(Boolean.TRUE));
        Q(str, openCardResult.uiErrorMsg, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(Throwable th) throws Exception {
        this.showRetryLoadingLiveData.setValue(Resource.error("w10000", th.getMessage(), Boolean.TRUE));
        HMLog.w(p, th, "重走开卡流程过程中发生了意料之外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L(String str, String str2, Resource resource) throws Exception {
        if (resource.status == Status.ERROR) {
            HMLog.w(p, "充值信息未能成功写到手环中, busCardId:" + str + ", orderId:" + str2 + ", code:" + resource.code + ", msg:" + resource.message, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(Subscription subscription) throws Exception {
        this.showRetryLoadingLiveData.setValue(Resource.loading(Boolean.FALSE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(String str, Resource resource) throws Exception {
        this.showRetryLoadingLiveData.setValue(Resource.success(Boolean.FALSE));
        P(str, ErrorMsgUtils.parseRechargeErrorMsg(this.a, resource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(String str, String str2, Throwable th) throws Exception {
        this.showRetryLoadingLiveData.setValue(Resource.error("w10000", th.getMessage(), Boolean.FALSE));
        HMLog.w(p, th, "将充值信息写入设备时发生了意料之外的错误. cardId:" + str + ", orderId:" + str2, new Object[0]);
    }

    @AnyThread
    private void P(String str, String str2) {
        Q(str, str2, false);
    }

    @AnyThread
    private void Q(String str, String str2, boolean z) {
        Disposable disposable = this.i;
        if (disposable == null || disposable.isDisposed()) {
            final FullResultInfo fullResultInfo = new FullResultInfo();
            String str3 = this.e;
            fullResultInfo.busCardId = str3;
            fullResultInfo.busCardName = this.f;
            fullResultInfo.orderId = str;
            fullResultInfo.errorMsg = str2;
            fullResultInfo.isRetryToOpenCard = z;
            CitySimpleInfo cityInfo = CitySimpleInfoCache.INSTANCE.getCityInfo(str3);
            if (cityInfo == null) {
                return;
            }
            Flowable flowableObserveOn = Flowable.fromPublisher(this.c.loadOrderInfo(str, cityInfo.getAid(), this.c.isForMi() ? cityInfo.getMiCardName() : cityInfo.getName())).filter(oe0.a).map(new io.reactivex.functions.Function() { // from class: ff0
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.a.B(fullResultInfo, (Resource) obj);
                }
            }).startWith(Resource.loading(fullResultInfo)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            MutableLiveData<Resource<FullResultInfo>> mutableLiveData = this.orderInfoLiveData;
            Objects.requireNonNull(mutableLiveData);
            this.i = flowableObserveOn.subscribe(new rx(mutableLiveData), new Consumer() { // from class: ef0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    BusCardResultViewModel.C((Throwable) obj);
                }
            });
        }
    }

    private void R(String str, final String str2, Order order) {
        boolean z = order.type == 1;
        u(str2);
        this.j = this.b.openCardToDevice(str, str2, order, "", z).observeOn(AndroidSchedulers.mainThread()).doOnSubscribe(new Consumer() { // from class: mf0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.I((Subscription) obj);
            }
        }).subscribe(new Consumer() { // from class: qf0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.J(str2, (BusCardRepo.OpenCardResult) obj);
            }
        }, new Consumer() { // from class: lf0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.K((Throwable) obj);
            }
        });
    }

    private void S(final String str, final String str2) {
        u(str2);
        this.j = this.b.chargeToDevice(str, str2).doOnNext(new Consumer() { // from class: cf0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BusCardResultViewModel.L(str, str2, (Resource) obj);
            }
        }).filter(oe0.a).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doOnSubscribe(new Consumer() { // from class: of0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.M((Subscription) obj);
            }
        }).subscribe(new Consumer() { // from class: pf0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.N(str2, (Resource) obj);
            }
        }, new Consumer() { // from class: af0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.O(str, str2, (Throwable) obj);
            }
        });
    }

    private void u(String str) {
        if (!this.n.containsKey(str)) {
            this.n.put(str, 1);
        } else {
            Integer num = this.n.get(str);
            this.n.put(str, num == null ? 0 : Integer.valueOf(num.intValue() + 1));
        }
    }

    private void v() {
        FullResultInfo fullResultInfo;
        Resource<FullResultInfo> value = this.orderInfoLiveData.getValue();
        if (value == null || (fullResultInfo = value.data) == null) {
            return;
        }
        fullResultInfo.order.state = 8;
        fullResultInfo.order.canRefund = false;
        fullResultInfo.order.canRetry = true;
        fullResultInfo.errorMsg = null;
        this.orderInfoLiveData.setValue(value);
    }

    private void w() {
        FullResultInfo fullResultInfo;
        Resource<FullResultInfo> value = this.orderInfoLiveData.getValue();
        if (value == null || (fullResultInfo = value.data) == null) {
            return;
        }
        fullResultInfo.order.state = 7;
        fullResultInfo.order.canRefund = false;
        fullResultInfo.order.canRetry = false;
        fullResultInfo.errorMsg = null;
        this.orderInfoLiveData.setValue(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(Throwable th) throws Exception {
        HMLog.e(p, th, "查询是否有已安装卡时发送了意料之外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Integer y(Resource resource) throws Exception {
        T t = resource.data;
        return Integer.valueOf(t != 0 ? ((BusCardBalance) t).balance : -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Long z(Resource resource) throws Exception {
        T t = resource.data;
        return Long.valueOf(t != 0 ? ((BusCardValidity) t).expireDate : -1L);
    }

    public void checkTipsAndRetryCount() {
        FullResultInfo fullResultInfo;
        Resource<FullResultInfo> value = this.orderInfoLiveData.getValue();
        if (value == null || value.status != Status.SUCCESS || (fullResultInfo = value.data) == null || fullResultInfo.order == null) {
            HMLog.w(p, "checkTipsCount 订单信息还没有成功的获取", new Object[0]);
            return;
        }
        Order order = fullResultInfo.order;
        if (!order.canRetry) {
            HMLog.w(p, "checkTipsCount 订单不可重试 orderId:" + order.orderId, new Object[0]);
            return;
        }
        String str = order.orderId;
        if (this.n.containsKey(str) && RETRY_COUNT_JUMP_TO_FEEDBACK.equals(this.n.get(str))) {
            this.checkRetryCountLiveData.setValue(this.n.get(str));
        }
        if (this.o.contains(str)) {
            return;
        }
        this.o.add(str);
        this.checkTipsCountLiveData.setValue(1);
    }

    public String getBusCardId() {
        return this.e;
    }

    public String getBusCardName() {
        return this.f;
    }

    public void getInstalledBusCards() {
        Flowable flowableObserveOn = Flowable.fromPublisher(this.c.getInstalledBusCards()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        MutableLiveData<Resource<List<BusCardSimple2>>> mutableLiveData = this.installedBusCards;
        Objects.requireNonNull(mutableLiveData);
        this.m = flowableObserveOn.subscribe(new rx(mutableLiveData), new Consumer() { // from class: df0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BusCardResultViewModel.x((Throwable) obj);
            }
        });
    }

    public String getOrderId() {
        return this.d;
    }

    public boolean isCheckOrder() {
        return this.g;
    }

    public boolean isLingNanTong(String str) {
        return this.c.isLingNanTong(str);
    }

    public boolean isNoToken() {
        return this.h;
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Disposable disposable = this.i;
        if (disposable != null && !disposable.isDisposed()) {
            this.i.dispose();
            this.i = null;
        }
        Disposable disposable2 = this.j;
        if (disposable2 != null && !disposable2.isDisposed()) {
            this.j.dispose();
            this.j = null;
        }
        Disposable disposable3 = this.k;
        if (disposable3 != null && !disposable3.isDisposed()) {
            this.k.dispose();
            this.k = null;
        }
        Disposable disposable4 = this.m;
        if (disposable4 != null && !disposable4.isDisposed()) {
            this.m.dispose();
            this.m = null;
        }
        Disposable disposable5 = this.l;
        if (disposable5 == null || disposable5.isDisposed()) {
            return;
        }
        this.l.dispose();
        this.l = null;
    }

    public void refreshOrder() {
        P(this.d, null);
    }

    public void refund() {
        FullResultInfo fullResultInfo;
        Resource<FullResultInfo> value = this.orderInfoLiveData.getValue();
        if (value == null || value.status != Status.SUCCESS || (fullResultInfo = value.data) == null || fullResultInfo.order == null) {
            HMLog.w(p, "订单信息还没有成功的获取，无法退款", new Object[0]);
            return;
        }
        Order order = fullResultInfo.order;
        final String str = fullResultInfo.orderId;
        if (order.canRetry) {
            this.k = Flowable.fromPublisher(this.c.refund(order.orderId)).doOnNext(new Consumer() { // from class: bf0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    BusCardResultViewModel.D(str, (Resource) obj);
                }
            }).filter(oe0.a).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doOnSubscribe(new Consumer() { // from class: nf0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.E((Subscription) obj);
                }
            }).subscribe(new Consumer() { // from class: if0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.F((Resource) obj);
                }
            }, new Consumer() { // from class: jf0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.G((Throwable) obj);
                }
            });
            return;
        }
        HMLog.w(p, "订单不可退款，但却尝试执行退款, orderId:" + str, new Object[0]);
    }

    public void retry() {
        FullResultInfo fullResultInfo;
        Resource<FullResultInfo> value = this.orderInfoLiveData.getValue();
        if (value == null || value.status != Status.SUCCESS || (fullResultInfo = value.data) == null || fullResultInfo.order == null) {
            HMLog.w(p, "订单信息还没有成功的获取，无法重试操作", new Object[0]);
            return;
        }
        Order order = fullResultInfo.order;
        if (!order.canRetry) {
            HMLog.w(p, "订单不可重试，但却尝试执行重试操作, orderId:" + order.orderId, new Object[0]);
            return;
        }
        String str = this.e;
        String str2 = order.orderId;
        int i = order.state;
        if (i == 2 || i == 11) {
            R(str, str2, order);
            return;
        }
        if (i == 5) {
            S(str, str2);
            return;
        }
        if (i != 3) {
            if (i == 8) {
                refund();
            }
        } else if (this.b.isForSnowballShanghai(str)) {
            R(str, str2, order);
        } else {
            S(str, str2);
        }
    }

    public void retryGetToken() {
        FullResultInfo fullResultInfo;
        Resource<FullResultInfo> value = this.orderInfoLiveData.getValue();
        if (value == null || value.status != Status.SUCCESS || (fullResultInfo = value.data) == null || fullResultInfo.order == null) {
            HMLog.w(p, "订单信息还没有成功的获取，无法重试操作", new Object[0]);
            return;
        }
        Flowable flowableObserveOn = Flowable.fromPublisher(this.c.getOrderInfo(fullResultInfo.order.orderId)).filter(oe0.a).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        MutableLiveData<Resource<Boolean>> mutableLiveData = this.retryGetTokenLiveData;
        Objects.requireNonNull(mutableLiveData);
        this.l = flowableObserveOn.subscribe(new rx(mutableLiveData), new Consumer() { // from class: kf0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.H((Throwable) obj);
            }
        });
    }

    public void setBusCardId(String str) {
        this.e = str;
    }

    public void setBusCardName(String str) {
        this.f = str;
    }

    public void setCheckOrder(boolean z) {
        this.g = z;
    }

    public void setIsNoToken(boolean z) {
        this.h = z;
    }

    public void setOrderId(String str, String str2) {
        this.d = str;
        P(str, str2);
    }
}
