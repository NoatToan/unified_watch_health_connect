package com.huami.wallet.ui.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.huami.tools.log.HMLog;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.ConsumeRecord;
import com.huami.wallet.lib.entity.RechargeRecord;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.lib.entity.XiaomiNotice;
import com.huami.wallet.ui.entity.ResultInfo;
import com.huami.wallet.ui.repository.TradeRecordRepo;
import com.huami.wallet.ui.viewmodel.TradeRecordViewModel;
import defpackage.rx;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.Objects;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes16.dex */
public class TradeRecordViewModel extends ViewModel {
    private static final String k = "Wallet-TradeRecordViewModel";
    private Disposable b;
    private String c;
    private String d;
    private String e;
    private final WalletDataSource f;
    private final TradeRecordRepo g;
    private Disposable h;
    private Disposable i;
    private Disposable j;
    public String xiaomiCardName;
    public final MutableLiveData<Resource<List<ConsumeRecord>>> consumeRecordsLiveData = new MutableLiveData<>();
    public final MutableLiveData<Resource<Boolean>> consumeRecordsUploadLiveData = new MutableLiveData<>();
    public final MutableLiveData<Resource<List<RechargeRecord>>> rechargeRecordsLiveData = new MutableLiveData<>();
    private final MutableLiveData<RechargeRecord> a = new MutableLiveData<>();
    public final MutableLiveData<ResultInfo> rechargeRecordDetailLiveData = new MutableLiveData<>();
    public final MutableLiveData<Resource<List<XiaomiNotice>>> xiaomiNoticesLiveData = new MutableLiveData<>();

    public TradeRecordViewModel(WalletDataSource walletDataSource, TradeRecordRepo tradeRecordRepo) {
        this.f = walletDataSource;
        this.g = tradeRecordRepo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(Throwable th) throws Exception {
        HMLog.w(k, th, "checkXiaoNotice时发生了意外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean j(Resource resource) throws Exception {
        return resource.status != Status.LOADING;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(Subscription subscription) throws Exception {
        this.consumeRecordsLiveData.setValue(Resource.loading(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(Throwable th) throws Exception {
        this.consumeRecordsLiveData.setValue(Resource.error("w10000", th.getMessage(), null));
        HMLog.w(k, th, "加载交易记录时发生异常", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(Throwable th) throws Exception {
        this.rechargeRecordsLiveData.setValue(Resource.error("w10000", th.getMessage(), null));
        HMLog.w(k, th, "加载充值记录时发生异常", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean o(Resource resource) throws Exception {
        return resource.status != Status.LOADING;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(Throwable th) throws Exception {
        this.consumeRecordsUploadLiveData.setValue(Resource.error("w10000", th.getMessage(), null));
        HMLog.w(k, th, "上传交易记录时发生异常", new Object[0]);
    }

    public void attemptToEnterRechargeDetail(RechargeRecord rechargeRecord) {
        this.a.setValue(rechargeRecord);
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.orderId = rechargeRecord.orderId;
        resultInfo.busCardId = this.c;
        resultInfo.busCardName = this.d;
        this.rechargeRecordDetailLiveData.setValue(resultInfo);
    }

    public void checkXiaoNotice() {
        Flowable flowableObserveOn = Flowable.fromPublisher(this.f.getXiaomiNotice()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        MutableLiveData<Resource<List<XiaomiNotice>>> mutableLiveData = this.xiaomiNoticesLiveData;
        Objects.requireNonNull(mutableLiveData);
        this.b = flowableObserveOn.subscribe(new rx(mutableLiveData), new Consumer() { // from class: ts7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                TradeRecordViewModel.i((Throwable) obj);
            }
        });
    }

    public String getCardId() {
        return this.c;
    }

    public void loadBusCardConsumeRecords() {
        Resource<List<ConsumeRecord>> value = this.consumeRecordsLiveData.getValue();
        if (value == null || value.status != Status.SUCCESS) {
            Flowable flowableDoOnSubscribe = Flowable.fromPublisher(this.g.getTradeRecordsFormWeb(this.c, this.e)).filter(new Predicate() { // from class: vs7
                @Override // io.reactivex.functions.Predicate
                public final boolean test(Object obj) {
                    return TradeRecordViewModel.j((Resource) obj);
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).doOnSubscribe(new Consumer() { // from class: ss7
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.k((Subscription) obj);
                }
            });
            MutableLiveData<Resource<List<ConsumeRecord>>> mutableLiveData = this.consumeRecordsLiveData;
            Objects.requireNonNull(mutableLiveData);
            this.h = flowableDoOnSubscribe.subscribe(new rx(mutableLiveData), new Consumer() { // from class: qs7
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.m((Throwable) obj);
                }
            });
        }
    }

    public void loadBusCardRechargeRecords() {
        Resource<List<RechargeRecord>> value = this.rechargeRecordsLiveData.getValue();
        if (value == null || value.status != Status.SUCCESS) {
            Flowable flowableObserveOn = Flowable.fromPublisher(this.f.loadBusCardRechargeRecords(this.c)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            MutableLiveData<Resource<List<RechargeRecord>>> mutableLiveData = this.rechargeRecordsLiveData;
            Objects.requireNonNull(mutableLiveData);
            this.j = flowableObserveOn.subscribe(new rx(mutableLiveData), new Consumer() { // from class: ps7
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.n((Throwable) obj);
                }
            });
        }
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Disposable disposable = this.h;
        if (disposable != null && !disposable.isDisposed()) {
            this.h.dispose();
            this.h = null;
        }
        Disposable disposable2 = this.j;
        if (disposable2 != null && !disposable2.isDisposed()) {
            this.j.dispose();
            this.j = null;
        }
        Disposable disposable3 = this.b;
        if (disposable3 == null || disposable3.isDisposed()) {
            return;
        }
        this.b.dispose();
        this.b = null;
    }

    public void setCardInfo(String str, String str2, String str3, String str4) {
        this.c = str;
        this.d = str2;
        this.xiaomiCardName = str3;
        this.e = str4;
    }

    public void uploadConsumeRecords() {
        Flowable flowableObserveOn = Flowable.fromPublisher(this.f.uploadConsumeRecords(this.c)).filter(new Predicate() { // from class: us7
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return TradeRecordViewModel.o((Resource) obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        MutableLiveData<Resource<Boolean>> mutableLiveData = this.consumeRecordsUploadLiveData;
        Objects.requireNonNull(mutableLiveData);
        this.i = flowableObserveOn.subscribe(new rx(mutableLiveData), new Consumer() { // from class: rs7
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.p((Throwable) obj);
            }
        });
    }
}
