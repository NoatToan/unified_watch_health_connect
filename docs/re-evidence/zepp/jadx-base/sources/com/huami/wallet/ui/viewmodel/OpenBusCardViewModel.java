package com.huami.wallet.ui.viewmodel;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModel;
import com.huami.tools.log.HMLog;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.BusCardSimple;
import com.huami.wallet.lib.entity.BusCardSimple2;
import com.huami.wallet.lib.entity.CheckOrderResult;
import com.huami.wallet.lib.entity.Coupon;
import com.huami.wallet.lib.entity.Fee;
import com.huami.wallet.lib.entity.MiOrder;
import com.huami.wallet.lib.entity.MiPayH5Result;
import com.huami.wallet.lib.entity.Order;
import com.huami.wallet.lib.entity.OrderType;
import com.huami.wallet.lib.entity.PayMode;
import com.huami.wallet.lib.entity.Protocol;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.lib.entity.XiaomiNotice;
import com.huami.wallet.lib.util.CitySimpleInfoCache;
import com.huami.wallet.lib.util.ErrorCode;
import com.huami.wallet.ui.aac.SingleLiveEvent;
import com.huami.wallet.ui.entity.ResultInfo;
import com.huami.wallet.ui.entity.RichPayMode;
import com.huami.wallet.ui.repository.BusCardRepo;
import com.huami.wallet.ui.utils.BusConstKt;
import com.huami.wallet.ui.utils.KtUtils;
import com.huami.wallet.ui.utils.MoneyUtils;
import com.huami.wallet.ui.viewmodel.OpenBusCardViewModel;
import defpackage.il5;
import defpackage.rx;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
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

/* JADX INFO: loaded from: classes16.dex */
public class OpenBusCardViewModel extends ViewModel {
    private static final String m = "Wallet-OpenBusCardViewModel";
    private static final String n = "c0012";
    private final MutableLiveData<String> a;
    public final MutableLiveData<Boolean> agreeAgreementLiveData;
    public final MutableLiveData<Resource<String>> agreeProtocolLiveData;
    private final WalletDataSource b;
    public final MutableLiveData<BusCardSimple2> busCardLiveData;
    private Disposable c;
    public final MediatorLiveData<Boolean> canOpenUpLiveData;
    public final MutableLiveData<Resource<CheckOrderResult>> checkOrderH5LiveData;
    public final MutableLiveData<Resource<CheckOrderResult>> checkOrderLiveData;
    public final MediatorLiveData<Resource<List<Coupon>>> couponsLiveData;
    private Disposable d;
    private Disposable e;
    private Disposable f;
    public final MediatorLiveData<Resource<List<Fee>>> feesLiveData;
    private Disposable g;
    private Disposable h;
    private Disposable i;
    public final MutableLiveData<List<String>> imageUrlList;
    public final MutableLiveData<Resource<Protocol>> isNeedShowProtocol;
    private Disposable j;
    private Disposable k;
    private Disposable l;
    public final BusCardRepo mBusCardRepo;
    public final MutableLiveData<Resource<MiOrder>> miOrderLiveData;
    public final MediatorLiveData<Resource<String>> openCardInformationLiveData;
    public final MutableLiveData<Resource<ResultInfo>> openCardToDeviceResultLiveData;
    public final MediatorLiveData<Coupon> selectedCouponLiveData;
    public final MediatorLiveData<Fee> selectedFeeLiveData;
    public final MediatorLiveData<Integer> shouldPayAmountLiveData;
    public final SingleLiveEvent<Pair<List<Coupon>, Coupon>> showCouponsDialogCommandLiveData;
    public final SingleLiveEvent<Pair<List<Fee>, Fee>> showFeesDialogCommandLiveData;
    public final SingleLiveEvent<Pair<String, Integer>> showPayModeDialogCommandLiveData;
    public final MutableLiveData<Boolean> showPhoneLiveData;
    public final MutableLiveData<Resource<String>> snowballOrderLiveData;
    public final MutableLiveData<String> verifiedPhoneLiveData;
    public final MutableLiveData<ResultInfo> xiaomiNotTokenOpenCardLiveData;
    public final MutableLiveData<Resource<List<XiaomiNotice>>> xiaomiNoticesLiveData;

    public OpenBusCardViewModel(BusCardRepo busCardRepo) {
        MutableLiveData<BusCardSimple2> mutableLiveData = new MutableLiveData<>();
        this.busCardLiveData = mutableLiveData;
        this.a = new MutableLiveData<>();
        MediatorLiveData<Resource<List<Fee>>> mediatorLiveData = new MediatorLiveData<>();
        this.feesLiveData = mediatorLiveData;
        MediatorLiveData<Fee> mediatorLiveData2 = new MediatorLiveData<>();
        this.selectedFeeLiveData = mediatorLiveData2;
        this.selectedCouponLiveData = new MediatorLiveData<>();
        MediatorLiveData<Resource<List<Coupon>>> mediatorLiveData3 = new MediatorLiveData<>();
        this.couponsLiveData = mediatorLiveData3;
        this.showFeesDialogCommandLiveData = new SingleLiveEvent<>();
        this.showCouponsDialogCommandLiveData = new SingleLiveEvent<>();
        MediatorLiveData<Integer> mediatorLiveData4 = new MediatorLiveData<>();
        this.shouldPayAmountLiveData = mediatorLiveData4;
        MutableLiveData<String> mutableLiveData2 = new MutableLiveData<>();
        this.verifiedPhoneLiveData = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this.showPhoneLiveData = mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>();
        this.agreeAgreementLiveData = mutableLiveData4;
        MediatorLiveData<Boolean> mediatorLiveData5 = new MediatorLiveData<>();
        this.canOpenUpLiveData = mediatorLiveData5;
        this.showPayModeDialogCommandLiveData = new SingleLiveEvent<>();
        this.snowballOrderLiveData = new MutableLiveData<>();
        this.miOrderLiveData = new MutableLiveData<>();
        this.checkOrderLiveData = new SingleLiveEvent();
        this.openCardToDeviceResultLiveData = new MutableLiveData<>();
        this.xiaomiNoticesLiveData = new MutableLiveData<>();
        this.checkOrderH5LiveData = new MutableLiveData<>();
        this.isNeedShowProtocol = new MutableLiveData<>();
        this.agreeProtocolLiveData = new MutableLiveData<>();
        MediatorLiveData<Resource<String>> mediatorLiveData6 = new MediatorLiveData<>();
        this.openCardInformationLiveData = mediatorLiveData6;
        this.xiaomiNotTokenOpenCardLiveData = new MutableLiveData<>();
        this.imageUrlList = new MutableLiveData<>();
        this.mBusCardRepo = busCardRepo;
        WalletDataSource dataSource = busCardRepo.getDataSource();
        this.b = dataSource;
        mediatorLiveData6.addSource(mutableLiveData, new Observer() { // from class: pl5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.j0((BusCardSimple2) obj);
            }
        });
        mediatorLiveData.addSource(mutableLiveData, new Observer() { // from class: am5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.n0((BusCardSimple2) obj);
            }
        });
        mediatorLiveData4.addSource(mediatorLiveData, new Observer() { // from class: rm5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.o0((Resource) obj);
            }
        });
        mediatorLiveData4.addSource(mediatorLiveData2, new Observer() { // from class: qm5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.p0((Fee) obj);
            }
        });
        mediatorLiveData5.addSource(mutableLiveData4, new Observer() { // from class: tm5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.q0((Boolean) obj);
            }
        });
        mediatorLiveData5.addSource(mutableLiveData, new Observer() { // from class: el5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.r0((BusCardSimple2) obj);
            }
        });
        mediatorLiveData5.addSource(mediatorLiveData2, new Observer() { // from class: pm5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.s0((Fee) obj);
            }
        });
        mediatorLiveData5.addSource(mutableLiveData2, new Observer() { // from class: um5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.t0((String) obj);
            }
        });
        mutableLiveData3.setValue(Boolean.valueOf(!dataSource.isForMi()));
        mediatorLiveData2.addSource(mediatorLiveData, new Observer() { // from class: sm5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.k0((Resource) obj);
            }
        });
        mediatorLiveData3.addSource(mediatorLiveData2, new Observer() { // from class: lm5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.l0((Fee) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A0(Resource resource) throws Exception {
        if (resource.status == Status.ERROR) {
            HMLog.w(m, "开卡订单信息异常:" + resource.toString(), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0(String str, String str2, String str3, Resource resource) throws Exception {
        if (TextUtils.equals(resource.code, "c0012")) {
            ResultInfo resultInfo = new ResultInfo();
            resultInfo.orderId = str;
            resultInfo.busCardId = str2;
            resultInfo.busCardName = str3;
            resultInfo.errorMsg = "";
            this.xiaomiNotTokenOpenCardLiveData.setValue(resultInfo);
        }
        this.checkOrderLiveData.setValue(resource);
        this.checkOrderH5LiveData.postValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean C0(Resource resource) throws Exception {
        T t;
        return resource.status == Status.SUCCESS && (t = resource.data) != 0 && ((CheckOrderResult) t).isPaidButNotHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D0(Resource resource) throws Exception {
        this.openCardToDeviceResultLiveData.setValue(Resource.loading(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Publisher E0(String str, String str2, String str3, Integer num, Resource resource) throws Exception {
        int iIntValue = num.intValue();
        CheckOrderResult checkOrderResult = (CheckOrderResult) resource.data;
        Objects.requireNonNull(checkOrderResult);
        return z0(str, str2, str3, iIntValue, checkOrderResult.isNeedRecharge, this.a.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ResultInfo F0(String str, BusCardRepo.OpenCardResult openCardResult) throws Exception {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.orderId = openCardResult.orderId;
        resultInfo.busCardId = openCardResult.busCardId;
        resultInfo.busCardName = str;
        resultInfo.errorMsg = openCardResult.uiErrorMsg;
        return resultInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0(Throwable th) throws Exception {
        this.openCardToDeviceResultLiveData.setValue(Resource.error("w10000", th.getMessage(), null));
        HMLog.w(m, th, "开通公交卡过程中发生了意料之外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0(ResultInfo resultInfo) throws Exception {
        this.openCardToDeviceResultLiveData.setValue(Resource.success(resultInfo));
    }

    private void I0(Activity activity, BusCardSimple busCardSimple, Fee fee, final int i, PayMode payMode, final String str) {
        PublishProcessor publishProcessorCreate = PublishProcessor.create();
        Flowable<T> flowableObserveOn = publishProcessorCreate.observeOn(AndroidSchedulers.mainThread());
        MutableLiveData<Resource<String>> mutableLiveData = this.snowballOrderLiveData;
        Objects.requireNonNull(mutableLiveData);
        this.e = flowableObserveOn.subscribe(new rx(mutableLiveData), new Consumer() { // from class: fm5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                OpenBusCardViewModel.u0((Throwable) obj);
            }
        });
        final String str2 = busCardSimple.id;
        final String str3 = busCardSimple.name;
        final boolean z = fee.rechargeAmountRaw != 0;
        this.d = Flowable.fromPublisher(this.b.payToOpenAndRecharge(activity, str2, fee.id, this.selectedCouponLiveData.getValue() != null ? Integer.valueOf(this.selectedCouponLiveData.getValue().getCouponId()) : null, i, payMode, fee.type, publishProcessorCreate)).subscribeOn(Schedulers.io()).doOnNext(new Consumer() { // from class: vl5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                OpenBusCardViewModel.v0((Resource) obj);
            }
        }).filter(new Predicate() { // from class: nm5
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return OpenBusCardViewModel.w0((Resource) obj);
            }
        }).map(new Function() { // from class: km5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return OpenBusCardViewModel.x0((Resource) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() { // from class: nl5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.y0((String) obj);
            }
        }).observeOn(Schedulers.io()).flatMap(new Function() { // from class: hm5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.z0(str2, str3, i, z, str, (String) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(P0(), O0());
    }

    private void J0(boolean z) {
        MiOrder miOrder;
        Resource<MiOrder> value = this.miOrderLiveData.getValue();
        if (value == null || (miOrder = value.data) == null || TextUtils.isEmpty(miOrder.orderId)) {
            HMLog.w(m, "还未生成小米的订单，不执行小米的开卡操作", new Object[0]);
            this.checkOrderH5LiveData.setValue(Resource.success(null));
            return;
        }
        BusCardSimple2 value2 = this.busCardLiveData.getValue();
        if (value2 == null) {
            HMLog.w(m, "没有公交卡的基本信息，不执行小米的开卡操作", new Object[0]);
            this.checkOrderH5LiveData.setValue(Resource.success(null));
            return;
        }
        final Integer value3 = this.shouldPayAmountLiveData.getValue();
        if (value3 == null) {
            HMLog.w(m, "暂未计算出实际支付的费用，不执行小米的开卡操作", new Object[0]);
            this.checkOrderH5LiveData.setValue(Resource.success(null));
        } else {
            final String str = value2.id;
            final String str2 = value2.name;
            final String str3 = value.data.orderId;
            this.d = Flowable.fromPublisher(this.b.checkOrderWithLoop(str3, z)).subscribeOn(Schedulers.io()).doOnNext(new Consumer() { // from class: wl5
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    OpenBusCardViewModel.A0((Resource) obj);
                }
            }).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() { // from class: tl5
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.B0(str3, str, str2, (Resource) obj);
                }
            }).filter(new Predicate() { // from class: mm5
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return OpenBusCardViewModel.C0((Resource) obj);
                }
            }).doOnNext(new Consumer() { // from class: ll5
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.D0((Resource) obj);
                }
            }).flatMap(new Function() { // from class: im5
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    return this.a.E0(str, str2, str3, value3, (Resource) obj);
                }
            }).observeOn(AndroidSchedulers.mainThread()).subscribe(P0(), O0());
        }
    }

    private void K0(Activity activity, String str, PayMode payMode) {
        BusCardSimple2 value = this.busCardLiveData.getValue();
        Fee value2 = this.selectedFeeLiveData.getValue();
        if (activity == null || value == null || value2 == null) {
            HMLog.w(m, String.format(Locale.CHINA, "参数有误，无法生成并支付小米的订单, busCard: %s, fee: %s", value, value2), new Object[0]);
        } else {
            I0(activity, value, value2, 0, payMode, str);
        }
    }

    private void L0() {
        boolean z = (this.agreeAgreementLiveData.getValue() == null || !this.agreeAgreementLiveData.getValue().booleanValue() || this.busCardLiveData.getValue() == null || this.busCardLiveData.getValue() == null || this.selectedFeeLiveData.getValue() == null || this.shouldPayAmountLiveData.getValue() == null) ? false : true;
        if (!isForMi()) {
            z = (!z || this.verifiedPhoneLiveData.getValue() == null || this.verifiedPhoneLiveData.getValue() == null) ? false : true;
        }
        this.canOpenUpLiveData.setValue(Boolean.valueOf(z));
    }

    private void M0() {
        Fee value = this.selectedFeeLiveData.getValue();
        if (value == null) {
            return;
        }
        this.shouldPayAmountLiveData.setValue(Integer.valueOf(Math.max((value.serviceChargeRaw - value.serviceChargeDiscount) + (value.rechargeAmountRaw - value.rechargeAmountDiscount), 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public Flowable<ResultInfo> z0(String str, final String str2, String str3, int i, boolean z, String str4) {
        Order order = new Order();
        order.orderId = str3;
        order.amount = i;
        order.type = z ? 1 : 3;
        order.timestamp = System.currentTimeMillis();
        order.state = 1;
        return this.mBusCardRepo.openCardToDevice(str, str3, order, str4, z).subscribeOn(Schedulers.io()).map(new Function() { // from class: jm5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return OpenBusCardViewModel.F0(str2, (BusCardRepo.OpenCardResult) obj);
            }
        });
    }

    private Consumer<Throwable> O0() {
        return new Consumer() { // from class: ql5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.G0((Throwable) obj);
            }
        };
    }

    private Consumer<ResultInfo> P0() {
        return new Consumer() { // from class: ml5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.H0((ResultInfo) obj);
            }
        };
    }

    private void Q(PayMode payMode, final com.huami.wallet.ui.function.Consumer<MiOrder> consumer) {
        Fee value = this.selectedFeeLiveData.getValue();
        if (value == null) {
            HMLog.w(m, "暂未选择费用，不执行小米的开卡方法", new Object[0]);
        } else {
            this.e = Flowable.fromPublisher(this.b.generateMiOrder(value.id, T(), payMode)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: sl5
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.X(consumer, (Resource) obj);
                }
            }, new Consumer() { // from class: rl5
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.Y((Throwable) obj);
                }
            });
        }
    }

    private com.huami.wallet.ui.function.Consumer<MiOrder> R(final Activity activity) {
        return new com.huami.wallet.ui.function.Consumer() { // from class: fl5
            @Override // com.huami.wallet.ui.function.Consumer
            public final void accept(Object obj) {
                this.a.d0(activity, (MiOrder) obj);
            }
        };
    }

    private void S(Integer num) {
        Flowable flowableObserveOn = Flowable.fromPublisher(this.b.getCoupon(num)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final MediatorLiveData<Resource<List<Coupon>>> mediatorLiveData = this.couponsLiveData;
        Objects.requireNonNull(mediatorLiveData);
        this.k = flowableObserveOn.subscribe(new Consumer() { // from class: hl5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                mediatorLiveData.postValue((Resource) obj);
            }
        }, new Consumer() { // from class: cm5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                OpenBusCardViewModel.h0((Throwable) obj);
            }
        });
    }

    private Integer T() {
        if (this.selectedCouponLiveData.getValue() != null) {
            return Integer.valueOf(this.selectedCouponLiveData.getValue().getCouponId());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void U(Throwable th) throws Exception {
        HMLog.w(m, th, "agreeProtocol时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void V(Throwable th) throws Exception {
        HMLog.w(m, th, "checkProtocol时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void W(Throwable th) throws Exception {
        HMLog.w(m, th, "checkXiaoNotice时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void X(com.huami.wallet.ui.function.Consumer consumer, Resource resource) throws Exception {
        boolean z = resource.status == Status.SUCCESS;
        this.miOrderLiveData.setValue(resource);
        if (!z || consumer == null) {
            return;
        }
        consumer.accept((MiOrder) resource.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(Throwable th) throws Exception {
        this.miOrderLiveData.setValue(Resource.error("w10000", th.getMessage(), null));
        HMLog.w(m, th, "生成小米订单时发生了意料之外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ MiPayH5Result Z(Activity activity, MiOrder miOrder) throws Exception {
        return this.b.goMiPayH5(activity, miOrder.payUrl, miOrder.returnUrl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(MiPayH5Result miPayH5Result) throws Exception {
        HMLog.w(m, "doOnNext goMiPayH5", new Object[0]);
        if (miPayH5Result.isSuccessful()) {
            this.checkOrderH5LiveData.setValue(Resource.loading(null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(MiPayH5Result miPayH5Result) throws Exception {
        HMLog.w(m, "miPayH5Result.isSuccessful = " + miPayH5Result.isSuccessful(), new Object[0]);
        if (miPayH5Result.isSuccessful()) {
            J0(true);
        } else {
            HMLog.w(m, "miPayH5Result 支付失败", new Object[0]);
            this.checkOrderH5LiveData.setValue(Resource.success(null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0(Throwable th) throws Exception {
        HMLog.w(m, th, "生成小米订单时发生了意料之外的错误", new Object[0]);
        this.checkOrderH5LiveData.setValue(Resource.success(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d0(final Activity activity, final MiOrder miOrder) {
        Integer value = this.shouldPayAmountLiveData.getValue();
        if (value == null) {
            HMLog.w(m, "暂未计算出实际支付的费用，不执行小米的开卡方法", new Object[0]);
        } else if (value.intValue() > 0) {
            this.j = Flowable.fromCallable(new Callable() { // from class: om5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.Z(activity, miOrder);
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doOnNext(new Consumer() { // from class: jl5
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.a0((MiPayH5Result) obj);
                }
            }).subscribe(new Consumer() { // from class: kl5
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.b0((MiPayH5Result) obj);
                }
            }, new Consumer() { // from class: ol5
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.c0((Throwable) obj);
                }
            });
        } else {
            J0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e0(List list, Resource resource) throws Exception {
        if (resource.isSuccessful()) {
            list.add((String) resource.data);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f0(Throwable th) throws Exception {
        HMLog.w(m, th, "获取开卡轮播图时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0(List list) throws Exception {
        this.imageUrlList.postValue(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h0(Throwable th) throws Exception {
        HMLog.w(m, th, "获取优惠券时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i0(Throwable th) throws Exception {
        HMLog.w(m, th, "加载开卡须知时发生异常", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j0(BusCardSimple2 busCardSimple2) {
        if (busCardSimple2 == null || busCardSimple2.id == null) {
            return;
        }
        Disposable disposable = this.l;
        if (disposable != null && !disposable.isDisposed()) {
            this.l.dispose();
        }
        Flowable flowableObserveOn = Flowable.fromPublisher(this.b.getCardInstructions(busCardSimple2.id)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        MediatorLiveData<Resource<String>> mediatorLiveData = this.openCardInformationLiveData;
        Objects.requireNonNull(mediatorLiveData);
        this.l = flowableObserveOn.subscribe(new il5(mediatorLiveData), new Consumer() { // from class: xl5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                OpenBusCardViewModel.i0((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0(Resource resource) {
        T t;
        if (resource == null || (t = resource.data) == 0 || ((List) t).isEmpty()) {
            this.selectedFeeLiveData.setValue(null);
        } else {
            this.selectedFeeLiveData.setValue((Fee) ((List) resource.data).get(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0(Fee fee) {
        if (fee != null) {
            this.selectedCouponLiveData.postValue(null);
            S(Integer.valueOf(fee.id));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m0(Throwable th) throws Exception {
        HMLog.w(m, th, "加载开卡服务费和充值金额时发生异常", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(BusCardSimple2 busCardSimple2) {
        if (busCardSimple2 == null || busCardSimple2.id == null) {
            return;
        }
        Disposable disposable = this.c;
        if (disposable != null && !disposable.isDisposed()) {
            this.c.dispose();
        }
        Flowable flowableObserveOn = Flowable.fromPublisher(this.b.loadFees(busCardSimple2.id, OrderType.OPEN_OR_RECHARGE)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        MediatorLiveData<Resource<List<Fee>>> mediatorLiveData = this.feesLiveData;
        Objects.requireNonNull(mediatorLiveData);
        this.c = flowableObserveOn.subscribe(new il5(mediatorLiveData), new Consumer() { // from class: dm5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                OpenBusCardViewModel.m0((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0(Resource resource) {
        M0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0(Fee fee) {
        M0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(Boolean bool) {
        L0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r0(BusCardSimple2 busCardSimple2) {
        L0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s0(Fee fee) {
        L0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(String str) {
        L0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u0(Throwable th) throws Exception {
        HMLog.w(m, th, "生成订单时发生了异常", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v0(Resource resource) throws Exception {
        if (resource.status != Status.ERROR || ErrorCode.PAYMENT_CANCELLED.equals(resource.code)) {
            return;
        }
        HMLog.w(m, "订单生成失败或支付失败:" + resource.toString(), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean w0(Resource resource) throws Exception {
        return resource.status == Status.SUCCESS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String x0(Resource resource) throws Exception {
        return (String) resource.data;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y0(String str) throws Exception {
        this.openCardToDeviceResultLiveData.setValue(Resource.loading(null));
    }

    public void agreeAgreement(boolean z) {
        this.agreeAgreementLiveData.setValue(Boolean.valueOf(z));
    }

    public void agreeProtocol(String str, long j) {
        this.a.setValue("" + j);
        Flowable flowableObserveOn = Flowable.fromPublisher(this.b.agreeProtocol(str, j)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        MutableLiveData<Resource<String>> mutableLiveData = this.agreeProtocolLiveData;
        Objects.requireNonNull(mutableLiveData);
        this.h = flowableObserveOn.subscribe(new rx(mutableLiveData), new Consumer() { // from class: yl5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                OpenBusCardViewModel.U((Throwable) obj);
            }
        });
    }

    public void checkProtocol(String str, String str2) {
        if (KtUtils.isNullOrEmpty(str2)) {
            str2 = "";
        }
        if (KtUtils.isNullOrEmpty(str)) {
            str = "";
        }
        Flowable flowableObserveOn = Flowable.fromPublisher(this.b.getProtocol(str, str2, "ISSUE")).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        MutableLiveData<Resource<Protocol>> mutableLiveData = this.isNeedShowProtocol;
        Objects.requireNonNull(mutableLiveData);
        this.g = flowableObserveOn.subscribe(new rx(mutableLiveData), new Consumer() { // from class: zl5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                OpenBusCardViewModel.V((Throwable) obj);
            }
        });
    }

    public void checkXiaoNotice() {
        Flowable flowableObserveOn = Flowable.fromPublisher(this.b.getXiaomiNotice()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        MutableLiveData<Resource<List<XiaomiNotice>>> mutableLiveData = this.xiaomiNoticesLiveData;
        Objects.requireNonNull(mutableLiveData);
        this.i = flowableObserveOn.subscribe(new rx(mutableLiveData), new Consumer() { // from class: bm5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                OpenBusCardViewModel.W((Throwable) obj);
            }
        });
    }

    @SuppressLint({"CheckResult"})
    public void getBusImageUrl(String str, String str2, String str3) {
        final ArrayList arrayList = new ArrayList();
        Flowable flowableJust = Flowable.just(str, str2, str3);
        final WalletDataSource walletDataSource = this.b;
        Objects.requireNonNull(walletDataSource);
        flowableJust.concatMap(new Function() { // from class: gm5
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return walletDataSource.getBusImageUrl((String) obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: ul5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                OpenBusCardViewModel.e0(arrayList, (Resource) obj);
            }
        }, new Consumer() { // from class: em5
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                OpenBusCardViewModel.f0((Throwable) obj);
            }
        }, new Action() { // from class: gl5
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                this.a.g0(arrayList);
            }
        });
    }

    public ArrayList<RichPayMode> getRichPayModes() {
        String str = this.busCardLiveData.getValue() != null ? this.busCardLiveData.getValue().id : "";
        ArrayList<RichPayMode> arrayList = new ArrayList<>();
        if (str != null) {
            arrayList.addAll(BusConstKt.toRichPayModeList(CitySimpleInfoCache.INSTANCE.getCityInfo(str), isForMi()));
        }
        return arrayList;
    }

    public boolean isForMi() {
        return this.b.isForMi();
    }

    public boolean isSupportCardInformation() {
        return this.b.isSupportCardInformation();
    }

    public boolean isSupportCity(String str) {
        return this.b.isSupportCity(CitySimpleInfoCache.INSTANCE.getAid(str));
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Disposable disposable = this.c;
        if (disposable != null && !disposable.isDisposed()) {
            this.c.dispose();
            this.c = null;
        }
        Disposable disposable2 = this.f;
        if (disposable2 != null && !disposable2.isDisposed()) {
            this.f.dispose();
            this.f = null;
        }
        Disposable disposable3 = this.d;
        if (disposable3 != null && !disposable3.isDisposed()) {
            this.d.dispose();
            this.d = null;
        }
        Disposable disposable4 = this.e;
        if (disposable4 != null && !disposable4.isDisposed()) {
            this.e.dispose();
            this.e = null;
        }
        Disposable disposable5 = this.g;
        if (disposable5 != null && !disposable5.isDisposed()) {
            this.g.dispose();
            this.g = null;
        }
        Disposable disposable6 = this.h;
        if (disposable6 != null && !disposable6.isDisposed()) {
            this.h.dispose();
            this.h = null;
        }
        Disposable disposable7 = this.i;
        if (disposable7 != null && !disposable7.isDisposed()) {
            this.i.dispose();
            this.i = null;
        }
        Disposable disposable8 = this.j;
        if (disposable8 != null && !disposable8.isDisposed()) {
            this.j.dispose();
            this.j = null;
        }
        Disposable disposable9 = this.k;
        if (disposable9 == null || disposable9.isDisposed()) {
            return;
        }
        this.k.dispose();
        this.k = null;
    }

    public void openCardForMi(Activity activity, String str, RichPayMode richPayMode) {
        HMLog.w(m, "openCardForMi:" + richPayMode, new Object[0]);
        PayMode payMode = MoneyUtils.parsePayMode(richPayMode);
        PayMode payMode2 = PayMode.WECHAT_PAY;
        if (payMode == payMode2) {
            K0(activity, str, payMode2);
            return;
        }
        PayMode payMode3 = PayMode.ALIPAY;
        if (payMode == payMode3) {
            K0(activity, str, payMode3);
        } else if (this.mBusCardRepo.isSupportMiPay()) {
            K0(activity, str, payMode);
        } else {
            Q(payMode, R(activity));
        }
    }

    public void openCardForSnowball(Activity activity, RichPayMode richPayMode) {
        PayMode payMode = MoneyUtils.parsePayMode(richPayMode);
        BusCardSimple2 value = this.busCardLiveData.getValue();
        Fee value2 = this.selectedFeeLiveData.getValue();
        Integer value3 = this.shouldPayAmountLiveData.getValue();
        boolean z = this.verifiedPhoneLiveData.getValue() != null;
        if (activity == null || payMode == null || value == null || value2 == null || value3 == null || !z) {
            HMLog.w(m, String.format(Locale.CHINA, "参数有误，无法生成并支付雪球的订单, payMode: %s, busCard: %s, fee: %s, actualPayMoney: %s, hasPhone:%s", payMode, value, value2, value3, Boolean.valueOf(z)), new Object[0]);
        } else {
            I0(activity, value, value2, value3.intValue(), payMode, this.a.getValue());
        }
    }

    public void selectCoupon(Coupon coupon) {
        Coupon value = this.selectedCouponLiveData.getValue();
        if (value == null || value != coupon) {
            this.selectedCouponLiveData.postValue(coupon);
        }
    }

    public void selectFee(Fee fee) {
        Fee value = this.selectedFeeLiveData.getValue();
        if (value == null || value != fee) {
            this.selectedFeeLiveData.setValue(fee);
        }
    }

    public void setBoundPhone(String str) {
        if (isForMi()) {
            return;
        }
        this.verifiedPhoneLiveData.setValue(str);
    }

    public void setCardSimpleInfo(String str, String str2, String str3, String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        BusCardSimple2 busCardSimple2 = new BusCardSimple2();
        busCardSimple2.id = str;
        busCardSimple2.name = str2;
        busCardSimple2.imageUrl = str3;
        busCardSimple2.xiaomiCardName = str4;
        busCardSimple2.packageName = str5;
        busCardSimple2.appName = str6;
        busCardSimple2.redirectTo = str7;
        busCardSimple2.serviceContact = str8;
        this.busCardLiveData.setValue(busCardSimple2);
    }

    public void showSelectCouponsDialog() {
        List<Coupon> list;
        Resource<List<Coupon>> value = this.couponsLiveData.getValue();
        if (value == null || (list = value.data) == null || list.isEmpty()) {
            HMLog.w(m, "无优惠券数据，不展示选择优惠券的对话框", new Object[0]);
        } else {
            this.showCouponsDialogCommandLiveData.setValue(new Pair<>(value.data, this.selectedCouponLiveData.getValue()));
        }
    }

    public void showSelectFeesDialog() {
        List<Fee> list;
        Resource<List<Fee>> value = this.feesLiveData.getValue();
        if (value == null || (list = value.data) == null || list.isEmpty()) {
            HMLog.w(m, "无充值金额数据，不展示选择充值金额的对话框", new Object[0]);
        } else {
            this.showFeesDialogCommandLiveData.setValue(new Pair<>(value.data, this.selectedFeeLiveData.getValue()));
        }
    }

    public void startOpenCard() {
        BusCardSimple2 value = this.busCardLiveData.getValue();
        Integer value2 = this.shouldPayAmountLiveData.getValue();
        if (value == null || value2 == null) {
            return;
        }
        this.showPayModeDialogCommandLiveData.setValue(new Pair<>(value.name, value2));
    }
}
