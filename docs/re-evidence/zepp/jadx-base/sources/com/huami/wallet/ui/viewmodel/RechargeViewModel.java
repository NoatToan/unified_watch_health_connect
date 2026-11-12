package com.huami.wallet.ui.viewmodel;

import android.app.Activity;
import android.app.Application;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModel;
import com.huami.tools.log.HMLog;
import com.huami.wallet.datasource.cloud.Const;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.BusCardBalance;
import com.huami.wallet.lib.entity.CheckOrderResult;
import com.huami.wallet.lib.entity.Fee;
import com.huami.wallet.lib.entity.MiOrder;
import com.huami.wallet.lib.entity.MiPayH5Result;
import com.huami.wallet.lib.entity.OrderType;
import com.huami.wallet.lib.entity.PayMode;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.lib.entity.XiaomiNotice;
import com.huami.wallet.lib.util.CitySimpleInfoCache;
import com.huami.wallet.lib.util.ErrorCode;
import com.huami.wallet.ui.aac.SingleLiveEvent;
import com.huami.wallet.ui.entity.ResultInfo;
import com.huami.wallet.ui.entity.RichPayMode;
import com.huami.wallet.ui.function.Consumer;
import com.huami.wallet.ui.repository.BusCardRepo;
import com.huami.wallet.ui.utils.BusConstKt;
import com.huami.wallet.ui.utils.ErrorMsgUtils;
import com.huami.wallet.ui.utils.MoneyUtils;
import com.huami.wallet.ui.viewmodel.RechargeViewModel;
import defpackage.il5;
import defpackage.oe0;
import defpackage.rx;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.processors.PublishProcessor;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes16.dex */
public class RechargeViewModel extends ViewModel {
    public static final int MAX_BALANCE = 100000;
    private static final String k = "Wallet-RechargeViewModel";
    private static final int l = 10;
    private static final String m = "c0012";
    private Disposable a;
    private final Application b;
    private final BusCardRepo c;
    public final MutableLiveData<String> cardIdLiveData;
    public final MutableLiveData<Resource<CheckOrderResult>> checkOrderH5LiveData;
    public final MutableLiveData<Resource<CheckOrderResult>> checkOrderLiveData;
    private final WalletDataSource d;
    private boolean e;
    private Disposable f;
    public final MediatorLiveData<Resource<List<Fee>>> feesLiveData;
    private Disposable g;
    public final SingleLiveEvent<MiOrder> goToMiPayCommandLiveData;
    private Disposable h;
    private Disposable i;
    private Disposable j;

    @VisibleForTesting
    public String mCardName;
    public final MutableLiveData<Resource<MiOrder>> miOrderLiveData;
    public final MutableLiveData<Resource<ResultInfo>> rechargeToDeviceResultLiveData;
    public final MediatorLiveData<Fee> selectedFeeLiveData;
    public final SingleLiveEvent<Pair<String, Integer>> showPayModeDialogCommandLiveData;
    public final MutableLiveData<Resource<String>> snowballOrderLiveData;
    public final MutableLiveData<Resource<Object>> validationResultLiveData;
    public String xiaomiCardName;
    public final MutableLiveData<ResultInfo> xiaomiNotTokenRechargeLiveData;
    public final MutableLiveData<Resource<List<XiaomiNotice>>> xiaomiNoticesLiveData;

    public RechargeViewModel(Application application, BusCardRepo busCardRepo) {
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.cardIdLiveData = mutableLiveData;
        MediatorLiveData<Resource<List<Fee>>> mediatorLiveData = new MediatorLiveData<>();
        this.feesLiveData = mediatorLiveData;
        MediatorLiveData<Fee> mediatorLiveData2 = new MediatorLiveData<>();
        this.selectedFeeLiveData = mediatorLiveData2;
        this.showPayModeDialogCommandLiveData = new SingleLiveEvent<>();
        this.validationResultLiveData = new MutableLiveData<>();
        this.snowballOrderLiveData = new MutableLiveData<>();
        this.miOrderLiveData = new MutableLiveData<>();
        this.goToMiPayCommandLiveData = new SingleLiveEvent<>();
        this.checkOrderLiveData = new SingleLiveEvent();
        this.checkOrderH5LiveData = new MutableLiveData<>();
        this.rechargeToDeviceResultLiveData = new MutableLiveData<>();
        this.xiaomiNoticesLiveData = new MutableLiveData<>();
        this.xiaomiNotTokenRechargeLiveData = new MutableLiveData<>();
        this.e = false;
        this.b = application;
        this.c = busCardRepo;
        this.d = busCardRepo.getDataSource();
        mediatorLiveData.addSource(mutableLiveData, new Observer() { // from class: i86
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.W((String) obj);
            }
        });
        mediatorLiveData2.addSource(mediatorLiveData, new Observer() { // from class: x76
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.X((Resource) obj);
            }
        });
    }

    private void J(PayMode payMode, final Consumer<MiOrder> consumer) {
        Fee value = this.selectedFeeLiveData.getValue();
        if (value == null) {
            HMLog.w(k, "暂未选择费用，不执行小米的开卡方法", new Object[0]);
        } else {
            this.i = Flowable.fromPublisher(this.d.generateMiOrder(value.id, null, payMode)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new io.reactivex.functions.Consumer() { // from class: z76
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.O(consumer, (Resource) obj);
                }
            }, new io.reactivex.functions.Consumer() { // from class: a96
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.P((Throwable) obj);
                }
            });
        }
    }

    private void K(Activity activity, final String str, final String str2, Fee fee, int i, PayMode payMode) {
        PublishProcessor publishProcessorCreate = PublishProcessor.create();
        Flowable<T> flowableObserveOn = publishProcessorCreate.observeOn(AndroidSchedulers.mainThread());
        MutableLiveData<Resource<String>> mutableLiveData = this.snowballOrderLiveData;
        Objects.requireNonNull(mutableLiveData);
        this.i = flowableObserveOn.subscribe(new rx(mutableLiveData), new io.reactivex.functions.Consumer() { // from class: f86
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                RechargeViewModel.Q((Throwable) obj);
            }
        });
        this.g = Flowable.fromPublisher(this.d.payToRechargeCard(activity, str, fee.id, i, payMode, publishProcessorCreate)).subscribeOn(Schedulers.io()).doOnNext(new io.reactivex.functions.Consumer() { // from class: d86
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                RechargeViewModel.R((Resource) obj);
            }
        }).filter(new Predicate() { // from class: r86
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return RechargeViewModel.S((Resource) obj);
            }
        }).map(new Function() { // from class: p86
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return RechargeViewModel.T((Resource) obj);
            }
        }).flatMap(new Function() { // from class: m86
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.U(str, str2, (String) obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(x0(), w0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void m0(Activity activity, RichPayMode richPayMode) {
        PayMode payMode = MoneyUtils.parsePayMode(richPayMode);
        String value = this.cardIdLiveData.getValue();
        Fee value2 = this.selectedFeeLiveData.getValue();
        int actualPayMoney = getActualPayMoney();
        String str = this.mCardName;
        if (activity == null || payMode == null || value == null || value2 == null || actualPayMoney <= 0) {
            HMLog.w(k, String.format(Locale.CHINA, "参数有误，无法生成并支付雪球的订单, activity: %s, payMode: %s, busCardId: %s, fee: %s, actualPayMoney: %s", activity, payMode, value, value2, Integer.valueOf(actualPayMoney)), new Object[0]);
        } else {
            K(activity, value, str, value2, actualPayMoney, payMode);
        }
    }

    private void M(Activity activity, PayMode payMode) {
        String value = this.cardIdLiveData.getValue();
        Fee value2 = this.selectedFeeLiveData.getValue();
        String str = this.mCardName;
        if (activity == null || value == null || value2 == null) {
            HMLog.w(k, String.format(Locale.CHINA, "参数有误，无法生成并支付小米的订单, activity: %s, busCardId: %s, fee: %s", activity, value, value2), new Object[0]);
        } else {
            K(activity, value, str, value2, 0, payMode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void N(Throwable th) throws Exception {
        HMLog.w(k, th, "checkXiaoNotice时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void O(Consumer consumer, Resource resource) throws Exception {
        boolean z = resource.status == Status.SUCCESS;
        this.e = z;
        this.miOrderLiveData.setValue(resource);
        if (!z || consumer == null) {
            return;
        }
        consumer.accept((MiOrder) resource.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(Throwable th) throws Exception {
        this.miOrderLiveData.setValue(Resource.error("w10000", th.getMessage(), null));
        HMLog.w(k, th, "生成小米订单时发生了意料之外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q(Throwable th) throws Exception {
        HMLog.w(k, th, "生成订单时发生了异常", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R(Resource resource) throws Exception {
        if (resource.status != Status.ERROR || ErrorCode.PAYMENT_CANCELLED.equals(resource.code)) {
            return;
        }
        HMLog.w(k, "订单生成失败或支付失败, code:" + resource.code + ", msg:" + resource.message, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean S(Resource resource) throws Exception {
        return resource.status == Status.SUCCESS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String T(Resource resource) throws Exception {
        return (String) resource.data;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void V(Throwable th) throws Exception {
        HMLog.e("RechargeBusCard", th, "加载公交卡充值选项时出错", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(String str) {
        if (str == null) {
            return;
        }
        Flowable flowableObserveOn = Flowable.fromPublisher(this.d.loadFees(str, OrderType.RECHARGE)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        MediatorLiveData<Resource<List<Fee>>> mediatorLiveData = this.feesLiveData;
        Objects.requireNonNull(mediatorLiveData);
        this.f = flowableObserveOn.subscribe(new il5(mediatorLiveData), new io.reactivex.functions.Consumer() { // from class: h86
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                RechargeViewModel.V((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X(Resource resource) {
        T t;
        if (resource == null || (t = resource.data) == 0 || ((List) t).isEmpty()) {
            this.selectedFeeLiveData.setValue(null);
        } else {
            this.selectedFeeLiveData.setValue((Fee) ((List) resource.data).get(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Y(Resource resource) throws Exception {
        if (resource.status == Status.ERROR) {
            HMLog.w(k, "充值订单信息异常, code:" + resource.code + ", msg:" + resource.message, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(String str, String str2, String str3, Resource resource) throws Exception {
        if (TextUtils.equals(resource.code, "c0012")) {
            ResultInfo resultInfo = new ResultInfo();
            resultInfo.orderId = str;
            resultInfo.busCardId = str2;
            resultInfo.busCardName = str3;
            resultInfo.errorMsg = "";
            this.xiaomiNotTokenRechargeLiveData.setValue(resultInfo);
        }
        this.checkOrderLiveData.setValue(resource);
        this.checkOrderH5LiveData.setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean a0(Resource resource) throws Exception {
        T t;
        return resource.status == Status.SUCCESS && (t = resource.data) != 0 && ((CheckOrderResult) t).isPaidButNotHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Publisher b0(String str, String str2, String str3, Resource resource) throws Exception {
        return U(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Resource c0(int i) throws Exception {
        return i % 10 == 0 ? Resource.success(null) : Resource.error(ErrorCode.RECHARGE_AMOUNT_NOT_TEN_MULTIPLE, "充值金额非十的整数倍", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Publisher d0(String str, Resource resource) throws Exception {
        return resource.status == Status.SUCCESS ? Flowable.fromPublisher(this.d.loadBusCardValidity(str)).filter(oe0.a) : Flowable.just(resource.map(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Publisher e0(String str, Resource resource) throws Exception {
        return resource.status == Status.SUCCESS ? Flowable.fromPublisher(this.d.loadBusCardBalance(str)).filter(oe0.a) : Flowable.just(resource.map(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Resource f0(int i, Resource resource) throws Exception {
        if (resource.status != Status.SUCCESS) {
            return resource.map(null);
        }
        T t = resource.data;
        if (t == 0) {
            return Resource.error(Const.InternalErrorCode.CODE_NO_BALANCE, "无余额数据", null);
        }
        int i2 = ((BusCardBalance) t).balance + i;
        if (i2 < 0) {
            return Resource.error(ErrorCode.BALANCE_IS_NEGATIVE, "充值后卡内余额小于0", null);
        }
        return i2 > 100000 ? Resource.error(ErrorCode.BALANCE_EXCEED_MAXIMUM, "充值后卡内余额超过最大值", null) : Resource.success(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ MiPayH5Result g0(Activity activity, MiOrder miOrder) throws Exception {
        return this.d.goMiPayH5(activity, miOrder.payUrl, miOrder.returnUrl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h0(MiPayH5Result miPayH5Result) throws Exception {
        HMLog.w(k, "doOnNext goMiPayH5", new Object[0]);
        if (miPayH5Result.isSuccessful()) {
            this.checkOrderH5LiveData.setValue(Resource.loading(null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i0(MiPayH5Result miPayH5Result) throws Exception {
        HMLog.w(k, "miPayH5Result.isSuccessful = " + miPayH5Result.isSuccessful(), new Object[0]);
        if (miPayH5Result.isSuccessful()) {
            u0(true);
        } else {
            this.checkOrderH5LiveData.setValue(Resource.success(null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j0(Throwable th) throws Exception {
        HMLog.w(k, th, "生成小米订单时发生了意料之外的错误", new Object[0]);
        this.checkOrderH5LiveData.setValue(Resource.success(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0(final Activity activity, final MiOrder miOrder) {
        if (getActualPayMoney() > 0) {
            this.j = Flowable.fromCallable(new Callable() { // from class: w86
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.g0(activity, miOrder);
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doOnNext(new io.reactivex.functions.Consumer() { // from class: z86
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.h0((MiPayH5Result) obj);
                }
            }).subscribe(new io.reactivex.functions.Consumer() { // from class: y86
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.i0((MiPayH5Result) obj);
                }
            }, new io.reactivex.functions.Consumer() { // from class: d96
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.j0((Throwable) obj);
                }
            });
        } else {
            u0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0(RichPayMode richPayMode, final Activity activity) {
        PayMode payMode = MoneyUtils.parsePayMode(richPayMode);
        PayMode payMode2 = PayMode.WECHAT_PAY;
        if (payMode == payMode2) {
            M(activity, payMode2);
            return;
        }
        PayMode payMode3 = PayMode.ALIPAY;
        if (payMode == payMode3) {
            M(activity, payMode3);
        } else if (this.c.isSupportMiPay()) {
            M(activity, payMode);
        } else {
            J(payMode, new Consumer() { // from class: x86
                @Override // com.huami.wallet.ui.function.Consumer
                public final void accept(Object obj) {
                    this.a.k0(activity, (MiOrder) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(Subscription subscription) throws Exception {
        this.validationResultLiveData.setValue(Resource.loading(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0(Runnable runnable, Resource resource) throws Exception {
        this.validationResultLiveData.setValue(resource);
        Status status = resource.status;
        if (status == Status.SUCCESS) {
            if (runnable != null) {
                runnable.run();
            }
        } else if (status == Status.ERROR) {
            HMLog.w(k, "充值前校验卡片信息失败, code:" + resource.code + ", msg:" + resource.message, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0(Throwable th) throws Exception {
        HMLog.w(k, th, "校验卡片信息时发生错误", new Object[0]);
        this.validationResultLiveData.setValue(Resource.error("w10000", "校验卡片信息时发生错误", null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(String str, String str2, Resource resource) throws Exception {
        if (resource.status == Status.ERROR) {
            HMLog.w(k, "充值信息未能成功写到手环中, busCardId:" + str + ", orderId:" + str2 + ", busCardName:" + this.mCardName + ", code:" + resource.code + ", msg:" + resource.message, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ResultInfo r0(String str, String str2, String str3, Resource resource, String str4) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.orderId = str;
        resultInfo.busCardId = str2;
        resultInfo.busCardName = str3;
        resultInfo.errorMsg = ErrorMsgUtils.parseRechargeErrorMsg(this.b, resource);
        return resultInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource s0(final String str, final String str2, final String str3, final Resource resource) throws Exception {
        return resource.isCompleted() ? resource.map(new com.huami.wallet.lib.util.Function() { // from class: t86
            @Override // com.huami.wallet.lib.util.Function
            public final Object apply(Object obj) {
                return this.a.r0(str, str2, str3, resource, (String) obj);
            }
        }) : resource.map(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(Throwable th) throws Exception {
        this.rechargeToDeviceResultLiveData.setValue(Resource.error("w10000", th.getMessage(), null));
        HMLog.w(k, th, "充值公交卡过程中发生了意料之外的错误", new Object[0]);
    }

    private void u0(boolean z) {
        MiOrder miOrder;
        if (!isForMi() || this.c.isSupportMiPay()) {
            this.checkOrderH5LiveData.postValue(Resource.success(null));
            return;
        }
        if (!this.e) {
            HMLog.d(k, "还在等待生成小米的订单，暂不执行充值操作", new Object[0]);
            this.checkOrderH5LiveData.postValue(Resource.success(null));
            return;
        }
        Resource<MiOrder> value = this.miOrderLiveData.getValue();
        if (value == null || (miOrder = value.data) == null || TextUtils.isEmpty(miOrder.orderId)) {
            HMLog.w(k, "还未生成小米的订单，不执行充值操作", new Object[0]);
            this.checkOrderH5LiveData.postValue(Resource.success(null));
            return;
        }
        final String value2 = this.cardIdLiveData.getValue();
        if (value2 == null) {
            HMLog.w(k, "没有公交卡唯一标识，不执行充值操作", new Object[0]);
            this.checkOrderH5LiveData.postValue(Resource.success(null));
        } else {
            this.e = false;
            final String str = value.data.orderId;
            final String str2 = this.mCardName;
            this.g = Flowable.fromPublisher(this.d.checkOrderWithLoop(str, z)).subscribeOn(Schedulers.io()).doOnNext(new io.reactivex.functions.Consumer() { // from class: e86
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    RechargeViewModel.Y((Resource) obj);
                }
            }).observeOn(AndroidSchedulers.mainThread()).doOnNext(new io.reactivex.functions.Consumer() { // from class: c86
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.Z(str, value2, str2, (Resource) obj);
                }
            }).filter(new Predicate() { // from class: q86
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return RechargeViewModel.a0((Resource) obj);
                }
            }).flatMap(new Function() { // from class: n86
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.a.b0(value2, str2, str, (Resource) obj);
                }
            }).observeOn(AndroidSchedulers.mainThread()).subscribe(x0(), w0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public Flowable<Resource<ResultInfo>> U(final String str, final String str2, final String str3) {
        return this.c.chargeToDevice(str, str3).doOnNext(new io.reactivex.functions.Consumer() { // from class: b86
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.q0(str, str3, (Resource) obj);
            }
        }).map(new Function() { // from class: o86
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.s0(str3, str, str2, (Resource) obj);
            }
        });
    }

    private io.reactivex.functions.Consumer<Throwable> w0() {
        return new io.reactivex.functions.Consumer() { // from class: c96
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.t0((Throwable) obj);
            }
        };
    }

    private io.reactivex.functions.Consumer<Resource<ResultInfo>> x0() {
        MutableLiveData<Resource<ResultInfo>> mutableLiveData = this.rechargeToDeviceResultLiveData;
        Objects.requireNonNull(mutableLiveData);
        return new rx(mutableLiveData);
    }

    public void checkXiaoNotice() {
        Flowable flowableObserveOn = Flowable.fromPublisher(this.d.getXiaomiNotice()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        MutableLiveData<Resource<List<XiaomiNotice>>> mutableLiveData = this.xiaomiNoticesLiveData;
        Objects.requireNonNull(mutableLiveData);
        this.a = flowableObserveOn.subscribe(new rx(mutableLiveData), new io.reactivex.functions.Consumer() { // from class: g86
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                RechargeViewModel.N((Throwable) obj);
            }
        });
    }

    @VisibleForTesting
    public int getActualPayMoney() {
        Fee value = this.selectedFeeLiveData.getValue();
        if (value == null) {
            return 0;
        }
        return Math.max(0, value.rechargeAmountRaw - value.rechargeAmountDiscount);
    }

    public ArrayList<RichPayMode> getRichPayModes() {
        String value = this.cardIdLiveData.getValue();
        ArrayList<RichPayMode> arrayList = new ArrayList<>();
        if (value != null) {
            arrayList.addAll(BusConstKt.toRichPayModeList(CitySimpleInfoCache.INSTANCE.getCityInfo(value), isForMi()));
        }
        return arrayList;
    }

    public boolean isForMi() {
        return this.d.isForMi();
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
        Disposable disposable5 = this.a;
        if (disposable5 != null && !disposable5.isDisposed()) {
            this.a.dispose();
            this.a = null;
        }
        Disposable disposable6 = this.j;
        if (disposable6 == null || disposable6.isDisposed()) {
            return;
        }
        this.j.dispose();
        this.j = null;
    }

    public void setCardInfo(String str, String str2, String str3) {
        this.cardIdLiveData.setValue(str);
        this.mCardName = str2;
        this.xiaomiCardName = str3;
    }

    public void startRecharge() {
        this.showPayModeDialogCommandLiveData.setValue(new Pair<>(this.mCardName, Integer.valueOf(getActualPayMoney())));
    }

    public Flowable<Resource<Object>> validate(final String str, final int i) {
        return Flowable.fromCallable(new Callable() { // from class: v86
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return RechargeViewModel.c0(i);
            }
        }).subscribeOn(Schedulers.io()).flatMap(new Function() { // from class: k86
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.d0(str, (Resource) obj);
            }
        }).flatMap(new Function() { // from class: l86
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.e0(str, (Resource) obj);
            }
        }).map(new Function() { // from class: j86
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return RechargeViewModel.f0(i, (Resource) obj);
            }
        });
    }

    public void validateCardThenRechargeForMi(final Activity activity, final RichPayMode richPayMode) {
        validateCardWithCallback(new Runnable() { // from class: u86
            @Override // java.lang.Runnable
            public final void run() {
                this.a.l0(richPayMode, activity);
            }
        });
    }

    public void validateCardThenRechargeForSnowball(final Activity activity, final RichPayMode richPayMode) {
        validateCardWithCallback(new Runnable() { // from class: s86
            @Override // java.lang.Runnable
            public final void run() {
                this.a.m0(activity, richPayMode);
            }
        });
    }

    @VisibleForTesting
    public void validateCardWithCallback(final Runnable runnable) {
        String value = this.cardIdLiveData.getValue();
        Fee value2 = this.selectedFeeLiveData.getValue();
        if (value != null && value2 != null) {
            this.h = validate(value, value2.rechargeAmountRaw).observeOn(AndroidSchedulers.mainThread()).doOnSubscribe(new io.reactivex.functions.Consumer() { // from class: y76
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.n0((Subscription) obj);
                }
            }).subscribe(new io.reactivex.functions.Consumer() { // from class: a86
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.o0(runnable, (Resource) obj);
                }
            }, new io.reactivex.functions.Consumer() { // from class: b96
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.p0((Throwable) obj);
                }
            });
            return;
        }
        HMLog.w(k, "验证卡片信息缺少必要的参数, busCardId:" + value + ", fee:" + value2, new Object[0]);
    }
}
