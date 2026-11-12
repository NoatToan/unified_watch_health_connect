package com.huami.wallet.ui.viewmodel;

import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.huami.tools.log.HMLog;
import com.huami.wallet.lib.api.WalletDataSource;
import com.huami.wallet.lib.entity.Resource;
import com.huami.wallet.lib.entity.Status;
import com.huami.wallet.lib.util.Function;
import com.huami.wallet.ui.pref.WalletPreference;
import com.huami.wallet.ui.viewmodel.BindPhoneNumberViewModel;
import defpackage.rx;
import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class BindPhoneNumberViewModel extends ViewModel {
    private static final String h = "Wallet-BindPhoneNumberViewModel";
    private final WalletDataSource a;
    private final WalletPreference b;
    private String c;
    private String d;
    private String e;
    private Disposable f;
    private Disposable g;
    public final MutableLiveData<Long> lastSendSmsCodeTimeLiveData;
    public final MutableLiveData<Resource<Object>> sendSmsCaptchaResultLiveData;
    public final MutableLiveData<Resource<CardAndPhone>> verifySmsCaptchaResultLiveData;

    public static class CardAndPhone {
        public String boundPhone;
        public String busCardId;
        public String busCardImageUrl;
        public String busCardName;
    }

    public BindPhoneNumberViewModel(WalletDataSource walletDataSource, WalletPreference walletPreference) {
        MutableLiveData<Long> mutableLiveData = new MutableLiveData<>();
        this.lastSendSmsCodeTimeLiveData = mutableLiveData;
        this.sendSmsCaptchaResultLiveData = new MutableLiveData<>();
        this.verifySmsCaptchaResultLiveData = new MutableLiveData<>();
        this.a = walletDataSource;
        this.b = walletPreference;
        mutableLiveData.setValue(Long.valueOf(walletPreference.getSendSmsCodeTimestamp()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Resource resource) throws Exception {
        if (resource.status == Status.SUCCESS) {
            this.b.saveSendSmsCodeTimestamp(System.currentTimeMillis());
        }
        this.sendSmsCaptchaResultLiveData.setValue(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Throwable th) throws Exception {
        this.sendSmsCaptchaResultLiveData.setValue(Resource.error("Unknown", th.getMessage(), null));
        HMLog.w(h, th, "发送短信验证码时发生了意料之外的错误", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ CardAndPhone j(String str, Object obj) {
        CardAndPhone cardAndPhone = new CardAndPhone();
        cardAndPhone.busCardId = this.c;
        cardAndPhone.busCardName = this.d;
        cardAndPhone.busCardImageUrl = this.e;
        cardAndPhone.boundPhone = str;
        return cardAndPhone;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CardAndPhone k(Object obj) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Resource m(final String str, Resource resource) throws Exception {
        return resource.status == Status.SUCCESS ? resource.map(new Function() { // from class: px
            @Override // com.huami.wallet.lib.util.Function
            public final Object apply(Object obj) {
                return this.a.j(str, obj);
            }
        }) : resource.map(new Function() { // from class: qx
            @Override // com.huami.wallet.lib.util.Function
            public final Object apply(Object obj) {
                return BindPhoneNumberViewModel.k(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(Throwable th) throws Exception {
        this.verifySmsCaptchaResultLiveData.setValue(Resource.error("Unknown", th.getMessage(), null));
        HMLog.w(h, th, "验证短信验证码时发生了意料之外的错误", new Object[0]);
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
        if (disposable2 == null || disposable2.isDisposed()) {
            return;
        }
        this.g.dispose();
        this.g = null;
    }

    public void sendSmsCaptcha(String str) {
        this.f = Flowable.fromPublisher(this.a.sendSmsCaptcha(str)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: sx
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.h((Resource) obj);
            }
        }, new Consumer() { // from class: ux
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.i((Throwable) obj);
            }
        });
    }

    public void setBusCardSimpleInfo(String str, String str2, String str3) {
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public void verifySmsCaptcha(final String str, String str2) {
        Flowable map = Flowable.fromPublisher(this.a.verifySmsCaptcha(str, str2)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).map(new io.reactivex.functions.Function() { // from class: vx
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.m(str, (Resource) obj);
            }
        });
        MutableLiveData<Resource<CardAndPhone>> mutableLiveData = this.verifySmsCaptchaResultLiveData;
        Objects.requireNonNull(mutableLiveData);
        this.g = map.subscribe(new rx(mutableLiveData), new Consumer() { // from class: tx
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.n((Throwable) obj);
            }
        });
    }
}
