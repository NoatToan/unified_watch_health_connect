package com.xiaomi.hm.health.cashier.viewmodel;

import android.app.Activity;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.google.gson.Gson;
import com.huami.nfc.base.PayResponse;
import com.xiaomi.hm.health.cashier.CashierPay;
import com.xiaomi.hm.health.cashier.model.AliPrepaidData;
import com.xiaomi.hm.health.cashier.model.CashierPayChannel;
import com.xiaomi.hm.health.cashier.model.CashierPayResponse;
import com.xiaomi.hm.health.cashier.model.Order;
import com.xiaomi.hm.health.cashier.model.PaymentInfo;
import com.xiaomi.hm.health.cashier.model.Product;
import com.xiaomi.hm.health.cashier.webapi.CashierWebApi;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public class CashierViewModel extends ViewModel {
    private Disposable a;
    private Disposable b;
    private CashierWebApi c;
    public final MutableLiveData<String> orderIdLiveData = new MutableLiveData<>();
    public final MutableLiveData<CashierPayResponse> payResultLiveData = new MutableLiveData<>();

    public CashierViewModel(CashierWebApi webApi) {
        this.c = webApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(String str, ArrayList arrayList, String str2, ObservableEmitter observableEmitter) throws Exception {
        PayResponse<Order> payResponseGenerateOrder = this.c.generateOrder(str, arrayList, str2);
        if (!payResponseGenerateOrder.isSuccessful() || payResponseGenerateOrder.getData() == null) {
            observableEmitter.onNext("");
        } else {
            observableEmitter.onNext(payResponseGenerateOrder.getData().getOrderId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(Throwable th) throws Exception {
        th.printStackTrace();
        this.orderIdLiveData.setValue("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(String str, String str2, String str3, Activity activity, ObservableEmitter observableEmitter) throws Exception {
        PayResponse<PaymentInfo> paymentInfo = this.c.getPaymentInfo(str, str2, str3);
        if (!paymentInfo.isSuccessful() || paymentInfo.getData() == null) {
            return;
        }
        observableEmitter.onNext(CashierPayChannel.PAY_WX.equals(str3) ? CashierPay.wechatPay(activity, paymentInfo.getData().getPrepaidData()) : CashierPay.aliPay(activity, ((AliPrepaidData) new Gson().fromJson(paymentInfo.getData().getPrepaidData(), AliPrepaidData.class)).getData()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Throwable th) throws Exception {
        th.printStackTrace();
        this.payResultLiveData.setValue(new CashierPayResponse(false, CashierPay.ERROR_OTHER));
    }

    public void bookOrder(final String userId, final ArrayList<Product> products, final String name) {
        Observable observableObserveOn = Observable.create(new ObservableOnSubscribe() { // from class: am0
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.f(userId, products, name, observableEmitter);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final MutableLiveData<String> mutableLiveData = this.orderIdLiveData;
        Objects.requireNonNull(mutableLiveData);
        this.a = observableObserveOn.subscribe(new Consumer() { // from class: cm0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                mutableLiveData.setValue((String) obj);
            }
        }, new Consumer() { // from class: dm0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.g((Throwable) obj);
            }
        });
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        Disposable disposable = this.a;
        if (disposable != null && !disposable.isDisposed()) {
            this.a.dispose();
        }
        Disposable disposable2 = this.b;
        if (disposable2 == null || disposable2.isDisposed()) {
            return;
        }
        this.b.dispose();
    }

    public void pay(final Activity activity, final String userId, final String orderId, final String payChannel) {
        Observable observableObserveOn = Observable.create(new ObservableOnSubscribe() { // from class: zl0
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) throws Exception {
                this.a.h(userId, orderId, payChannel, activity, observableEmitter);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        final MutableLiveData<CashierPayResponse> mutableLiveData = this.payResultLiveData;
        Objects.requireNonNull(mutableLiveData);
        this.b = observableObserveOn.subscribe(new Consumer() { // from class: bm0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                mutableLiveData.setValue((CashierPayResponse) obj);
            }
        }, new Consumer() { // from class: em0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.i((Throwable) obj);
            }
        });
    }
}
